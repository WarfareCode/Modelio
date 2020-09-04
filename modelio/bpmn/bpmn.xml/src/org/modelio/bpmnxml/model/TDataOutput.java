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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tDataOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDataOutput">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataState" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="itemSubjectRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;attribute name="isCollection" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("7803d83c-6995-4dc4-b2a4-98f2e64797ef")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDataOutput", propOrder = {
    "dataState"
})
public class TDataOutput extends TBaseElement {
    @objid ("3ca04645-7669-44eb-893c-916e9e43a0ec")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("dfa41fdc-5fea-4d62-a1c2-b518521d80d4")
    @XmlAttribute(name = "isCollection")
    protected Boolean isCollection;

    @objid ("ad5f10a0-ee90-41ae-b8a0-0d496834bbab")
    protected TDataState dataState;

    @objid ("9f26fccf-4a54-42d9-9f94-c4fdf5c8644c")
    @XmlAttribute(name = "itemSubjectRef")
    protected QName itemSubjectRef;

    /**
     * Gets the value of the dataState property.
     * @return
     * possible object is
     * {@link TDataState }
     */
    @objid ("c9fe12f6-4cf5-45ff-8c11-9c3cb9e9fb16")
    public TDataState getDataState() {
        return this.dataState;
    }

    /**
     * Sets the value of the dataState property.
     * @param value allowed object is
     * {@link TDataState }
     */
    @objid ("9f528ed3-1f5b-45bc-a40b-06be6f0d5342")
    public void setDataState(TDataState value) {
        this.dataState = value;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("3e3e2419-b0a5-4da6-b72d-79e27b38e811")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("e03530ef-7346-4bbf-8a83-ad2110c6ab7b")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the itemSubjectRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("056d5e78-e176-4692-8cf7-1529c2f6b9d0")
    public QName getItemSubjectRef() {
        return this.itemSubjectRef;
    }

    /**
     * Sets the value of the itemSubjectRef property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("9d2a38cc-e68b-4d88-b71b-8e7efa356e0f")
    public void setItemSubjectRef(QName value) {
        this.itemSubjectRef = value;
    }

    /**
     * Gets the value of the isCollection property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    @objid ("97770929-1790-4baf-aae6-f59702f7cc77")
    public boolean isIsCollection() {
        if (this.isCollection == null) {
            return false;
        } else {
            return this.isCollection;
        }
    }

    /**
     * Sets the value of the isCollection property.
     * @param value allowed object is
     * {@link Boolean }
     */
    @objid ("e110fd59-a11e-45c0-89bf-b1d1b3764190")
    public void setIsCollection(Boolean value) {
        this.isCollection = value;
    }

}
