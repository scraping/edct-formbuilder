/*******************************************************************************
 * Copyright (c) 2012 HealthCare It, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the BSD 3-Clause license
 * which accompanies this distribution, and is available at
 * http://directory.fsf.org/wiki/License:BSD_3Clause
 * 
 * Contributors:
 *     HealthCare It, Inc - initial API and implementation
 ******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 12:38:39 PM EDT 
//


package com.healthcit.cacure.export.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for questionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="questionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="answer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="answerValue" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="uuid" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                           &lt;attribute name="order" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="cadsrPublicId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="displayStyle" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Medium"/>
 *                         &lt;enumeration value="Long"/>
 *                         &lt;enumeration value="Short"/>
 *                         &lt;enumeration value="Horizontal"/>
 *                         &lt;enumeration value="Vertical"/>
 *                         &lt;enumeration value=""/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="valueConstraint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="POSITIVE_FLOAT"/>
 *                       &lt;enumeration value="POSITIVE_INTEGER"/>
 *                       &lt;enumeration value="INTEGER"/>
 *                       &lt;enumeration value="RADIO"/>
 *                       &lt;enumeration value="NUMBER"/>
 *                       &lt;enumeration value="TEXT"/>
 *                       &lt;enumeration value="DROPDOWN"/>
 *                       &lt;enumeration value="CHECKBOX"/>
 *                       &lt;enumeration value="YEAR"/>
 *                       &lt;enumeration value="MONTHYEAR"/>
 *                       &lt;enumeration value="DATE"/>
 *                       &lt;enumeration value="TEXTAREA"/>
 *                       &lt;enumeration value="CHECKMARK"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="uuid" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="order" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="questionType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="tableQuestion"/>
 *             &lt;enumeration value="question"/>
 *             &lt;enumeration value=""/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="answerType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="SINGLE_ANSWER"/>
 *             &lt;enumeration value="MULTI_ANSWER"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "questionType", propOrder = {
    "shortName",
    "answer"
})
@XmlSeeAlso({
    com.healthcit.cacure.export.model.TableElementType.Question.class
})
public class QuestionType {

    @XmlElement(required = true)
    protected String shortName;
    @XmlElement(required = true)
    protected QuestionType.Answer answer;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String uuid;
    @XmlAttribute(required = true)
    protected int order;
    @XmlAttribute
    protected String questionType;
    @XmlAttribute(required = true)
    protected String answerType;

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionType.Answer }
     *     
     */
    public QuestionType.Answer getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionType.Answer }
     *     
     */
    public void setAnswer(QuestionType.Answer value) {
        this.answer = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Gets the value of the questionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     * Sets the value of the questionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionType(String value) {
        this.questionType = value;
    }

    /**
     * Gets the value of the answerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerType() {
        return answerType;
    }

    /**
     * Sets the value of the answerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerType(String value) {
        this.answerType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="answerValue" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="uuid" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                 &lt;attribute name="order" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="cadsrPublicId" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="displayStyle" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Medium"/>
     *               &lt;enumeration value="Long"/>
     *               &lt;enumeration value="Short"/>
     *               &lt;enumeration value="Horizontal"/>
     *               &lt;enumeration value="Vertical"/>
     *               &lt;enumeration value=""/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="valueConstraint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="POSITIVE_FLOAT"/>
     *             &lt;enumeration value="POSITIVE_INTEGER"/>
     *             &lt;enumeration value="INTEGER"/>
     *             &lt;enumeration value="RADIO"/>
     *             &lt;enumeration value="NUMBER"/>
     *             &lt;enumeration value="TEXT"/>
     *             &lt;enumeration value="DROPDOWN"/>
     *             &lt;enumeration value="CHECKBOX"/>
     *             &lt;enumeration value="YEAR"/>
     *             &lt;enumeration value="MONTHYEAR"/>
     *             &lt;enumeration value="DATE"/>
     *             &lt;enumeration value="TEXTAREA"/>
     *             &lt;enumeration value="CHECKMARK"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="uuid" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description",
        "answerValue",
        "displayStyle",
        "valueConstraint"
    })
    public static class Answer {

        @XmlElement(required = true)
        protected String description;
        protected List<QuestionType.Answer.AnswerValue> answerValue;
        protected String displayStyle;
        protected String valueConstraint;
        @XmlAttribute(required = true)
        protected String type;
        @XmlAttribute(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String uuid;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the answerValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the answerValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnswerValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QuestionType.Answer.AnswerValue }
         * 
         * 
         */
        public List<QuestionType.Answer.AnswerValue> getAnswerValue() {
            if (answerValue == null) {
                answerValue = new ArrayList<QuestionType.Answer.AnswerValue>();
            }
            return this.answerValue;
        }

        /**
         * Gets the value of the displayStyle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplayStyle() {
            return displayStyle;
        }

        /**
         * Sets the value of the displayStyle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplayStyle(String value) {
            this.displayStyle = value;
        }

        /**
         * Gets the value of the valueConstraint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueConstraint() {
            return valueConstraint;
        }

        /**
         * Sets the value of the valueConstraint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueConstraint(String value) {
            this.valueConstraint = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the uuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUuid() {
            return uuid;
        }

        /**
         * Sets the value of the uuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUuid(String value) {
            this.uuid = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="uuid" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *       &lt;attribute name="order" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="cadsrPublicId" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description",
            "value",
            "name"
        })
        public static class AnswerValue {

            @XmlElement(required = true)
            protected String description;
            @XmlElement(required = true)
            protected String value;
            @XmlElement(required = true)
            protected String name;
            @XmlAttribute(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String uuid;
            @XmlAttribute(required = true)
            protected int order;
            @XmlAttribute
            protected Boolean isDefault;
            @XmlAttribute
            protected Integer cadsrPublicId;

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the uuid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUuid() {
                return uuid;
            }

            /**
             * Sets the value of the uuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUuid(String value) {
                this.uuid = value;
            }

            /**
             * Gets the value of the order property.
             * 
             */
            public int getOrder() {
                return order;
            }

            /**
             * Sets the value of the order property.
             * 
             */
            public void setOrder(int value) {
                this.order = value;
            }

            /**
             * Gets the value of the isDefault property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsDefault() {
                return isDefault;
            }

            /**
             * Sets the value of the isDefault property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsDefault(Boolean value) {
                this.isDefault = value;
            }

            /**
             * Gets the value of the cadsrPublicId property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCadsrPublicId() {
                return cadsrPublicId;
            }

            /**
             * Sets the value of the cadsrPublicId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCadsrPublicId(Integer value) {
                this.cadsrPublicId = value;
            }

        }

    }

}
