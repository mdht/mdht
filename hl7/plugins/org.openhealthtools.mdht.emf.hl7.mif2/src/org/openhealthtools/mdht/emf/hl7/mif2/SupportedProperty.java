/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type of concept property supported both by the containing code system either for concepts or for codes.
 * UML: A tag on the CodeSystem stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#getEnumerationValue <em>Enumeration Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#isIsMandatoryIndicator <em>Is Mandatory Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedProperty()
 * @model extendedMetaData="name='SupportedProperty' kind='elementOnly'"
 * @generated
 */
public interface SupportedProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes how the property is intended to be used and what it's for
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Inline)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedProperty_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Inline getDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Inline value);

	/**
	 * Returns the value of the '<em><b>Enumeration Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the allowed values for a property with a type of 'Enumeration'
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration Value</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedProperty_EnumerationValue()
	 * @model unique="false" dataType="org.openhealthtools.mdht.emf.hl7.mif2.EnumerationToken"
	 *        extendedMetaData="kind='element' name='enumerationValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getEnumerationValue();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the default value for the property if it is not specified.  (The interpretation of whether a default applies depends on the value of defaultHandlingCode for concepts.  For codes, the default simply applies to all codes independent of hierarchy.)
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedProperty_DefaultValue()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.LongDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='defaultValue'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Is Mandatory Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether the property must be specified for all concepts within the code system
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Mandatory Indicator</em>' attribute.
	 * @see #isSetIsMandatoryIndicator()
	 * @see #unsetIsMandatoryIndicator()
	 * @see #setIsMandatoryIndicator(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedProperty_IsMandatoryIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='isMandatoryIndicator'"
	 * @generated
	 */
	boolean isIsMandatoryIndicator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#isIsMandatoryIndicator <em>Is Mandatory Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory Indicator</em>' attribute.
	 * @see #isSetIsMandatoryIndicator()
	 * @see #unsetIsMandatoryIndicator()
	 * @see #isIsMandatoryIndicator()
	 * @generated
	 */
	void setIsMandatoryIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#isIsMandatoryIndicator <em>Is Mandatory Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsMandatoryIndicator()
	 * @see #isIsMandatoryIndicator()
	 * @see #setIsMandatoryIndicator(boolean)
	 * @generated
	 */
	void unsetIsMandatoryIndicator();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#isIsMandatoryIndicator <em>Is Mandatory Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Mandatory Indicator</em>' attribute is set.
	 * @see #unsetIsMandatoryIndicator()
	 * @see #isIsMandatoryIndicator()
	 * @see #setIsMandatoryIndicator(boolean)
	 * @generated
	 */
	boolean isSetIsMandatoryIndicator();

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies what sort of relationship is supported
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedProperty_PropertyName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='propertyName'"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyTypeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the allowed content type for the property
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyTypeKind
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(ConceptPropertyTypeKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedProperty_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	ConceptPropertyTypeKind getType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyTypeKind
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(ConceptPropertyTypeKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(ConceptPropertyTypeKind)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(ConceptPropertyTypeKind)
	 * @generated
	 */
	boolean isSetType();

} // SupportedProperty
