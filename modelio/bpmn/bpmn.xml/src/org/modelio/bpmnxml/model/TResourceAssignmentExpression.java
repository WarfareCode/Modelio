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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tResourceAssignmentExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tResourceAssignmentExpression">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}expression"/>
 * &lt;/sequence>
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("ed0f01b0-a403-4ed5-81f1-a9ea464db0da")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tResourceAssignmentExpression", propOrder = {
    "expression"
})
public class TResourceAssignmentExpression extends TBaseElement {
    @objid ("60878de0-421d-49aa-be1a-78cc23f0bef8")
    @XmlElementRef(name = "expression", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class)
    protected JAXBElement<? extends TExpression> expression;

    /**
     * Gets the value of the expression property.
     * @return
     * possible object is
     * {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @objid ("fcf9bd81-8fec-4578-96d0-e857cc896b15")
    public JAXBElement<? extends TExpression> getExpression() {
        return this.expression;
    }

    /**
     * Sets the value of the expression property.
     * @param value allowed object is
     * {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TExpression }{@code >}
     */
    @objid ("6da5f6bb-b592-4170-9b06-3022e988996f")
    public void setExpression(JAXBElement<? extends TExpression> value) {
        this.expression = value;
    }

}
