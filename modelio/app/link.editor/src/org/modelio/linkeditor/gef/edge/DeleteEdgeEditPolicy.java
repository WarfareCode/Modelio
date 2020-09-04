/* 
 * Copyright 2013-2019 Modeliosoft
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

package org.modelio.linkeditor.gef.edge;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

/**
 * Edit policy that handles edge deletion.
 */
@objid ("1b9ac70c-5e33-11e2-b81d-002564c97630")
public class DeleteEdgeEditPolicy extends ConnectionEditPolicy {
    @objid ("1b9d284e-5e33-11e2-b81d-002564c97630")
    @Override
    protected Command getDeleteCommand(final GroupRequest request) {
        return new DeleteEdgeCommand((Edge) getHost().getModel());
    }

}