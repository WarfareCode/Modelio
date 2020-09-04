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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tCorrelationPropertyRetrievalExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCorrelationPropertyRetrievalExpression">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;sequence>
 * &lt;element name="messagePath" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFormalExpression"/>
 * &lt;/sequence>
 * &lt;attribute name="messageRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("afa556e3-a6c8-42b8-8810-b3a9d53e763c")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCorrelationPropertyRetrievalExpression", propOrder = {
    "messagePath"
})
public class TCorrelationPropertyRetrievalExpression extends TBaseElement {
    @objid ("26676a83-884d-4329-81e4-d88414fcc7a0")
    @XmlElement(required = true)
    protected TFormalExpression messagePath;

    @objid ("c8f8bc26-ac9f-4e44-ac0b-a5ccb90b9ad7")
    @XmlAttribute(name = "messageRef", required = true)
    protected QName messageRef;

    /**
     * Gets the value of the messagePath property.
     * @return
     * possible object is
     * {@link TFormalExpression }
     */
    @objid ("9206da03-39f9-4179-957d-39a3b1ddbcbe")
    public TFormalExpression getMessagePath() {
        return this.messagePath;
    }

    /**
     * Sets the value of the messagePath property.
     * @param value allowed object is
     * {@link TFormalExpression }
     */
    @objid ("e0f28daa-7e66-4688-9dfb-19c4a7607c4c")
    public void setMessagePath(TFormalExpression value) {
        this.messagePath = value;
    }

    /**
     * Gets the value of the messageRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("f6e4e86b-a947-435b-9e81-d631d67389f2")
    public QName getMessageRef() {
        return this.messageRef;
    }

    /**
     * Sets the value of the messageRef property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("57f3200a-3358-439d-b257-359c0288b785")
    public void setMessageRef(QName value) {
        this.messageRef = value;
    }

}
