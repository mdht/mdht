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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a specific published version of a code system
 * UML: A stereotype on Enumeration
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion#getSupportedConceptRelationship <em>Supported Concept Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion#getSupportedConceptProperty <em>Supported Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion#getSupportedCodeProperty <em>Supported Code Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion#isCompleteCodesIndicator <em>Complete Codes Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersion()
 * @model extendedMetaData="name='CodeSystemVersion' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemVersion extends CodeSystemVersionBase {
	/**
	 * Returns the value of the '<em><b>Supported Concept Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a type of relationship between codes that is supported by this code system versionontaining coded concept and another concep.
	 * UML: Identifies dependencies allowed for components of this package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Concept Relationship</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersion_SupportedConceptRelationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedConceptRelationship' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupportedConceptRelationship> getSupportedConceptRelationship();

	/**
	 * Returns the value of the '<em><b>Supported Concept Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a type of supplemental property that may/must be associated with a code system concept.
	 * UML: Tag on CodeSystem stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Concept Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersion_SupportedConceptProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedConceptProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupportedConceptProperty> getSupportedConceptProperty();

	/**
	 * Returns the value of the '<em><b>Supported Code Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a type of supplemental property that may/must be associated with a code system code.
	 * UML: Tag on CodeSystem stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Code Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersion_SupportedCodeProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedCodeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupportedProperty> getSupportedCodeProperty();

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single encoded concept that is represented in the code system
	 * UML: Complex grouper.  (Not sure how to put something between enumeration and its enumeration items
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersion_Concept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Concept> getConcept();

	/**
	 * Returns the value of the '<em><b>Complete Codes Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the complete set of codes are documented here or whether the listed codes represent only a partial set (those relevant to HL7 or presented as a representative subset)
	 * UML: Tag on Code System Version stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complete Codes Indicator</em>' attribute.
	 * @see #isSetCompleteCodesIndicator()
	 * @see #unsetCompleteCodesIndicator()
	 * @see #setCompleteCodesIndicator(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersion_CompleteCodesIndicator()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='completeCodesIndicator'"
	 * @generated
	 */
	boolean isCompleteCodesIndicator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion#isCompleteCodesIndicator <em>Complete Codes Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete Codes Indicator</em>' attribute.
	 * @see #isSetCompleteCodesIndicator()
	 * @see #unsetCompleteCodesIndicator()
	 * @see #isCompleteCodesIndicator()
	 * @generated
	 */
	void setCompleteCodesIndicator(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion#isCompleteCodesIndicator <em>Complete Codes Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompleteCodesIndicator()
	 * @see #isCompleteCodesIndicator()
	 * @see #setCompleteCodesIndicator(boolean)
	 * @generated
	 */
	void unsetCompleteCodesIndicator();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion#isCompleteCodesIndicator <em>Complete Codes Indicator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Complete Codes Indicator</em>' attribute is set.
	 * @see #unsetCompleteCodesIndicator()
	 * @see #isCompleteCodesIndicator()
	 * @see #setCompleteCodesIndicator(boolean)
	 * @generated
	 */
	boolean isSetCompleteCodesIndicator();

} // CodeSystemVersion
