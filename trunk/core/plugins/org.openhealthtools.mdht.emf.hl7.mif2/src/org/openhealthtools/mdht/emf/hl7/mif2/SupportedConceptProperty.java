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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Concept Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type of concept property supported by the containing code system for concepts.
 * UML: A tag on the CodeSystem stereotype
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty#isApplyToValueSetsIndicator <em>Apply To Value Sets Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty#getDefaultHandlingCode <em>Default Handling Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptProperty()
 * @model extendedMetaData="name='SupportedConceptProperty' kind='elementOnly'"
 * @generated
 */
public interface SupportedConceptProperty extends SupportedProperty {
	/**
	 * Returns the value of the '<em><b>Apply To Value Sets Indicator</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether the property may be (or must be - for mandatory properties) specified by non-codeBasedContent value sets whose entire content is drawn from this code system
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Apply To Value Sets Indicator</em>' attribute.
	 * @see #isSetApplyToValueSetsIndicator()
	 * @see #unsetApplyToValueSetsIndicator()
	 * @see #setApplyToValueSetsIndicator(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptProperty_ApplyToValueSetsIndicator()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='applyToValueSetsIndicator'"
	 * @generated
	 */
	boolean isApplyToValueSetsIndicator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty#isApplyToValueSetsIndicator <em>Apply To Value Sets Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To Value Sets Indicator</em>' attribute.
	 * @see #isSetApplyToValueSetsIndicator()
	 * @see #unsetApplyToValueSetsIndicator()
	 * @see #isApplyToValueSetsIndicator()
	 * @generated
	 */
	void setApplyToValueSetsIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty#isApplyToValueSetsIndicator <em>Apply To Value Sets Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplyToValueSetsIndicator()
	 * @see #isApplyToValueSetsIndicator()
	 * @see #setApplyToValueSetsIndicator(boolean)
	 * @generated
	 */
	void unsetApplyToValueSetsIndicator();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty#isApplyToValueSetsIndicator <em>Apply To Value Sets Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Apply To Value Sets Indicator</em>' attribute is set.
	 * @see #unsetApplyToValueSetsIndicator()
	 * @see #isApplyToValueSetsIndicator()
	 * @see #setApplyToValueSetsIndicator(boolean)
	 * @generated
	 */
	boolean isSetApplyToValueSetsIndicator();

	/**
	 * Returns the value of the '<em><b>Default Handling Code</b></em>' attribute.
	 * The default value is <code>"Flat"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.PropertyDefaultHandlingKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether a property value should default based on properties specified further up the subsumption hierarchy, or whether they should always default to the defaultValue specified for the property definition.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Handling Code</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PropertyDefaultHandlingKind
	 * @see #isSetDefaultHandlingCode()
	 * @see #unsetDefaultHandlingCode()
	 * @see #setDefaultHandlingCode(PropertyDefaultHandlingKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptProperty_DefaultHandlingCode()
	 * @model default="Flat" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='defaultHandlingCode'"
	 * @generated
	 */
	PropertyDefaultHandlingKind getDefaultHandlingCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty#getDefaultHandlingCode <em>Default Handling Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Handling Code</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PropertyDefaultHandlingKind
	 * @see #isSetDefaultHandlingCode()
	 * @see #unsetDefaultHandlingCode()
	 * @see #getDefaultHandlingCode()
	 * @generated
	 */
	void setDefaultHandlingCode(PropertyDefaultHandlingKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty#getDefaultHandlingCode <em>Default Handling Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultHandlingCode()
	 * @see #getDefaultHandlingCode()
	 * @see #setDefaultHandlingCode(PropertyDefaultHandlingKind)
	 * @generated
	 */
	void unsetDefaultHandlingCode();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty#getDefaultHandlingCode <em>Default Handling Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Handling Code</em>' attribute is set.
	 * @see #unsetDefaultHandlingCode()
	 * @see #getDefaultHandlingCode()
	 * @see #setDefaultHandlingCode(PropertyDefaultHandlingKind)
	 * @generated
	 */
	boolean isSetDefaultHandlingCode();

} // SupportedConceptProperty
