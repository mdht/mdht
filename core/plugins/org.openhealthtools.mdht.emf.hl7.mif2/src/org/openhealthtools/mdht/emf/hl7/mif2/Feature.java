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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common ancestor for attributes and datatype properties
 * UML: Corresponds to Feature stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getEnumerationValue <em>Enumeration Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getAllowedRange <em>Allowed Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getDefaultFrom <em>Default From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getFixedValue <em>Fixed Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getMaximumLength <em>Maximum Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getMinimumLength <em>Minimum Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFeature()
 * @model extendedMetaData="name='Feature' kind='elementOnly'"
 * @generated
 */
public interface Feature extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Enumeration Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates one of the allowed values for the element.  If enumerationValues are specified, the value of the attribute must match one of the specified enumerationValues.  If there is only one enumerationValue, then the property has a fixed value.
	 * UML: EnumerationLiteral (sort of - we have a datatype in addition to the enumerationValues)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration Value</em>' attribute list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFeature_EnumerationValue()
	 * @model unique="false" dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='element' name='enumerationValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getEnumerationValue();

	/**
	 * Returns the value of the '<em><b>Allowed Range</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates a range of values the attribute or property can be drawn from.  If any allowed ranges, and the attribute or property is not null, it must be contained by at least one of the identified allowed ranges
	 * UML: allowedRange tag on Feature stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed Range</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFeature_AllowedRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedRange' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RangeDefinition> getAllowedRange();

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether the element must be supported by implementors or not.  If not present, indicates that support is optional.
	 * UML: Tag value on Feature stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind
	 * @see #isSetConformance()
	 * @see #unsetConformance()
	 * @see #setConformance(ConformanceKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFeature_Conformance()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='conformance'"
	 * @generated
	 */
	ConformanceKind getConformance();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getConformance <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind
	 * @see #isSetConformance()
	 * @see #unsetConformance()
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(ConformanceKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getConformance <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConformance()
	 * @see #getConformance()
	 * @see #setConformance(ConformanceKind)
	 * @generated
	 */
	void unsetConformance();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getConformance <em>Conformance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conformance</em>' attribute is set.
	 * @see #unsetConformance()
	 * @see #getConformance()
	 * @see #setConformance(ConformanceKind)
	 * @generated
	 */
	boolean isSetConformance();

	/**
	 * Returns the value of the '<em><b>Default From</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.DefaultDeterminerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the default should be inferred FUTURE_USE
	 * UML: defaultFrom tag on Feature stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default From</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DefaultDeterminerKind
	 * @see #isSetDefaultFrom()
	 * @see #unsetDefaultFrom()
	 * @see #setDefaultFrom(DefaultDeterminerKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFeature_DefaultFrom()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='defaultFrom'"
	 * @generated
	 */
	DefaultDeterminerKind getDefaultFrom();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getDefaultFrom <em>Default From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default From</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DefaultDeterminerKind
	 * @see #isSetDefaultFrom()
	 * @see #unsetDefaultFrom()
	 * @see #getDefaultFrom()
	 * @generated
	 */
	void setDefaultFrom(DefaultDeterminerKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getDefaultFrom <em>Default From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultFrom()
	 * @see #getDefaultFrom()
	 * @see #setDefaultFrom(DefaultDeterminerKind)
	 * @generated
	 */
	void unsetDefaultFrom();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getDefaultFrom <em>Default From</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default From</em>' attribute is set.
	 * @see #unsetDefaultFrom()
	 * @see #getDefaultFrom()
	 * @see #setDefaultFrom(DefaultDeterminerKind)
	 * @generated
	 */
	boolean isSetDefaultFrom();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the default value for the element if it is not present in an instance of the model.
	 * UML: defaultValue tag on Feature stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFeature_DefaultValue()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='defaultValue'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the fixed value for the element if it is not present in an instance of the model.
	 * UML: fixedValue tag on Feature stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Value</em>' attribute.
	 * @see #setFixedValue(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFeature_FixedValue()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='fixedValue'"
	 * @generated
	 */
	String getFixedValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getFixedValue <em>Fixed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Value</em>' attribute.
	 * @see #getFixedValue()
	 * @generated
	 */
	void setFixedValue(String value);

	/**
	 * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, null values may not be sent for this element.
	 * UML: Tag value on Feature stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isSetIsMandatory()
	 * @see #unsetIsMandatory()
	 * @see #setIsMandatory(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFeature_IsMandatory()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isMandatory'"
	 * @generated
	 */
	boolean isIsMandatory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isSetIsMandatory()
	 * @see #unsetIsMandatory()
	 * @see #isIsMandatory()
	 * @generated
	 */
	void setIsMandatory(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsMandatory()
	 * @see #isIsMandatory()
	 * @see #setIsMandatory(boolean)
	 * @generated
	 */
	void unsetIsMandatory();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#isIsMandatory <em>Is Mandatory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Mandatory</em>' attribute is set.
	 * @see #unsetIsMandatory()
	 * @see #isIsMandatory()
	 * @see #setIsMandatory(boolean)
	 * @generated
	 */
	boolean isSetIsMandatory();

	/**
	 * Returns the value of the '<em><b>Maximum Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the maximum number of characters that are permitted to be present.
	 * UML: maximumSupportedLength tag on Feature stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Length</em>' attribute.
	 * @see #setMaximumLength(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFeature_MaximumLength()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallPositiveInteger"
	 *        extendedMetaData="kind='attribute' name='maximumLength'"
	 * @generated
	 */
	BigInteger getMaximumLength();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getMaximumLength <em>Maximum Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Length</em>' attribute.
	 * @see #getMaximumLength()
	 * @generated
	 */
	void setMaximumLength(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Minimum Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the minimum number of characters that must be present. FUTURE_USE
	 * UML: minimumLength tag on Feature stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Length</em>' attribute.
	 * @see #setMinimumLength(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFeature_MinimumLength()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallPositiveInteger"
	 *        extendedMetaData="kind='attribute' name='minimumLength'"
	 * @generated
	 */
	BigInteger getMinimumLength();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature#getMinimumLength <em>Minimum Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Length</em>' attribute.
	 * @see #getMinimumLength()
	 * @generated
	 */
	void setMinimumLength(BigInteger value);

} // Feature
