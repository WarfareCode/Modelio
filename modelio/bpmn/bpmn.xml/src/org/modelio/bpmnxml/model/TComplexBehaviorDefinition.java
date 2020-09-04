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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tComplexBehaviorDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tComplexBehaviorDefinition">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;sequence>
 * &lt;element name="condition" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFormalExpression"/>
 * &lt;element name="event" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tImplicitThrowEvent" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("460a7fba-0994-4456-b0c4-e11defe26721")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tComplexBehaviorDefinition", propOrder = {
    "condition",
    "event"
})
public class TComplexBehaviorDefinition extends TBaseElement {
    @objid ("747ff981-2569-4c6f-acc6-2e82348bd305")
    @XmlElement(required = true)
    protected TFormalExpression condition;

    @objid ("b9f0dc2d-8bf5-442b-ba88-ad516c04df92")
    protected TImplicitThrowEvent event;

    /**
     * Gets the value of the condition property.
     * @return
     * possible object is
     * {@link TFormalExpression }
     */
    @objid ("b9d4e8da-c268-4596-9e68-df5daa64b1f6")
    public TFormalExpression getCondition() {
        return this.condition;
    }

    /**
     * Sets the value of the condition property.
     * @param value allowed object is
     * {@link TFormalExpression }
     */
    @objid ("b985721f-d842-45f5-815d-17905c0f660c")
    public void setCondition(TFormalExpression value) {
        this.condition = value;
    }

    /**
     * Gets the value of the event property.
     * @return
     * possible object is
     * {@link TImplicitThrowEvent }
     */
    @objid ("c8239f11-5dd0-4b8b-be33-13e8307786a2")
    public TImplicitThrowEvent getEvent() {
        return this.event;
    }

    /**
     * Sets the value of the event property.
     * @param value allowed object is
     * {@link TImplicitThrowEvent }
     */
    @objid ("4622e195-c7eb-4f40-a953-9a29ae4ff6d4")
    public void setEvent(TImplicitThrowEvent value) {
        this.event = value;
    }

}
