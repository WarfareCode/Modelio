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
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for Font complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Font">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}double" />
 * &lt;attribute name="isBold" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 * &lt;attribute name="isItalic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 * &lt;attribute name="isUnderline" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 * &lt;attribute name="isStrikeThrough" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("5c1e8c22-b8c0-45a4-a05a-38e0280b8ba1")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Font", namespace = "http://www.omg.org/spec/DD/20100524/DC")
public class Font {
    @objid ("94824e56-87dc-4714-9051-799da0ee34ff")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("8bbd325e-8ab3-4329-9878-732c66fffefb")
    @XmlAttribute(name = "size")
    protected Double size;

    @objid ("71ef86ea-deba-4a9a-a8c6-08b713bcff7a")
    @XmlAttribute(name = "isBold")
    protected Boolean isBold;

    @objid ("90b75a72-82a5-4bb4-a486-1ab9909f7961")
    @XmlAttribute(name = "isItalic")
    protected Boolean isItalic;

    @objid ("52a23bdd-aec2-4836-8d1e-d2f8bb2d4e6b")
    @XmlAttribute(name = "isUnderline")
    protected Boolean isUnderline;

    @objid ("a9b13fbc-22b2-493a-b5eb-de70db820ab9")
    @XmlAttribute(name = "isStrikeThrough")
    protected Boolean isStrikeThrough;

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("ee5253c7-29e4-43c0-850a-7d2da7f6093c")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("86cb9ecf-8457-4fed-a416-e98ba72c72e1")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the size property.
     * @return
     * possible object is
     * {@link Double }
     */
    @objid ("07c78b5b-6c10-4ad5-a0d1-1c63010708c4")
    public Double getSize() {
        return this.size;
    }

    /**
     * Sets the value of the size property.
     * @param value allowed object is
     * {@link Double }
     */
    @objid ("abfa9f9e-d15d-4287-ab01-94a684ec694f")
    public void setSize(Double value) {
        this.size = value;
    }

    /**
     * Gets the value of the isBold property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    @objid ("ae02a177-62f5-4e34-b396-d4599f56f8b2")
    public Boolean isIsBold() {
        return this.isBold;
    }

    /**
     * Sets the value of the isBold property.
     * @param value allowed object is
     * {@link Boolean }
     */
    @objid ("004d35ee-e659-48fe-b89c-ea7b8bf27e44")
    public void setIsBold(Boolean value) {
        this.isBold = value;
    }

    /**
     * Gets the value of the isItalic property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    @objid ("a5c0d7fe-4cf7-42f7-a69d-78d7186aba07")
    public Boolean isIsItalic() {
        return this.isItalic;
    }

    /**
     * Sets the value of the isItalic property.
     * @param value allowed object is
     * {@link Boolean }
     */
    @objid ("f3d6327b-6573-4627-9792-f921bbe247ab")
    public void setIsItalic(Boolean value) {
        this.isItalic = value;
    }

    /**
     * Gets the value of the isUnderline property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    @objid ("6fd0960a-eccd-448b-8e76-265601ec9e49")
    public Boolean isIsUnderline() {
        return this.isUnderline;
    }

    /**
     * Sets the value of the isUnderline property.
     * @param value allowed object is
     * {@link Boolean }
     */
    @objid ("c366b30d-80ef-4226-8cbd-286810da5a7b")
    public void setIsUnderline(Boolean value) {
        this.isUnderline = value;
    }

    /**
     * Gets the value of the isStrikeThrough property.
     * @return
     * possible object is
     * {@link Boolean }
     */
    @objid ("98e29673-9b0c-4ca6-b1aa-b5f854ea4520")
    public Boolean isIsStrikeThrough() {
        return this.isStrikeThrough;
    }

    /**
     * Sets the value of the isStrikeThrough property.
     * @param value allowed object is
     * {@link Boolean }
     */
    @objid ("4ac37c17-eb26-436d-baee-60c2dc06ad68")
    public void setIsStrikeThrough(Boolean value) {
        this.isStrikeThrough = value;
    }

}
