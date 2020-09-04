/* 
 * Copyright 2013-2018 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package org.modelio.diagram.editor.activity.elements.acceptsignal;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.modelio.diagram.editor.activity.elements.figures.AcceptArrowFigure;
import org.modelio.diagram.editor.activity.elements.policies.CreateFlowEditPolicy;
import org.modelio.diagram.elements.common.linkednode.LinkedNodeRequestConstants;
import org.modelio.diagram.elements.common.linkednode.LinkedNodeStartCreationEditPolicy;
import org.modelio.diagram.elements.core.figures.MinimumSizeLayout;
import org.modelio.diagram.elements.core.model.GmAbstractObject;
import org.modelio.diagram.elements.core.node.AbstractNodeEditPart;
import org.modelio.diagram.elements.core.tools.multipoint.CreateMultiPointRequest;
import org.modelio.diagram.elements.umlcommon.constraint.ConstraintLinkEditPolicy;
import org.modelio.diagram.styles.core.IStyle;

/**
 * EditPart for an Acceptsignal Node.
 * 
 * @author fpoyer
 */
@objid ("2970549b-55b6-11e2-877f-002564c97630")
public class AcceptSignalEditPart extends AbstractNodeEditPart {
    @objid ("2970549f-55b6-11e2-877f-002564c97630")
    @Override
    protected IFigure createFigure() {
        // create the figure
        final AcceptArrowFigure fig = new AcceptArrowFigure();
        fig.setLayoutManager(new BorderLayout());
        
        // set style independent properties
        MinimumSizeLayout.apply(fig, 100, 60);
        
        // set style dependent properties
        refreshFromStyle(fig, getModelStyle());
        
        // return the figure
        return fig;
    }

    @objid ("297054a4-55b6-11e2-877f-002564c97630")
    @Override
    protected void createEditPolicies() {
        super.createEditPolicies();
        
        installEditPolicy(EditPolicy.NODE_ROLE, new CreateFlowEditPolicy());
        installEditPolicy(LinkedNodeRequestConstants.REQ_LINKEDNODE_START,
                new LinkedNodeStartCreationEditPolicy());
        installEditPolicy(CreateMultiPointRequest.REQ_MULTIPOINT_FIRST, new ConstraintLinkEditPolicy(false));
    }

    /**
     * Refresh this EditPart's visuals.
     * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
     */
    @objid ("297054a7-55b6-11e2-877f-002564c97630")
    @Override
    protected void refreshVisuals() {
        final GmAcceptSignalPrimaryNode acceptsignalModel = (GmAcceptSignalPrimaryNode) getModel();
        getFigure().getParent().setConstraint(getFigure(), acceptsignalModel.getLayoutData());
    }

    @objid ("297054ab-55b6-11e2-877f-002564c97630")
    @Override
    protected void addChildVisual(EditPart childEditPart, int index) {
        // Only two possible children: the header and the behavior label!
        // See Gm constructor for detail
        final IFigure child = ((GraphicalEditPart) childEditPart).getFigure();
        final GmAbstractObject gmAbstractObject = (GmAbstractObject) childEditPart.getModel();
        if (index == 0 && gmAbstractObject.getLayoutData() == null) {
            gmAbstractObject.setLayoutData(BorderLayout.TOP);
        } else if (index == 1 && gmAbstractObject.getLayoutData() == null) {
            gmAbstractObject.setLayoutData(BorderLayout.CENTER);
        } else if (index >= 2) {
            throw new IllegalArgumentException("AcceptSignalEditPart#addChildVisual: unknown index " + index);
        }
        getFigure().add(child, gmAbstractObject.getLayoutData(), index);
    }

    @objid ("2971db39-55b6-11e2-877f-002564c97630")
    @Override
    public boolean isSelectable() {
        return false;
    }

    @objid ("2971db3e-55b6-11e2-877f-002564c97630")
    @Override
    protected void refreshFromStyle(final IFigure aFigure, final IStyle style) {
        if (!switchRepresentationMode()) {
            super.refreshFromStyle(aFigure, style);
        }
    }

}
