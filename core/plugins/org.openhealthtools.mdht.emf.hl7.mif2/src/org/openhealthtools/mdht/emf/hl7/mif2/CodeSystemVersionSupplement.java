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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Version Supplement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a specific published version of a code system supplement
 * UML: A stereotype on Package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement#getSupplementalSupportedConceptRelationship <em>Supplemental Supported Concept Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement#getSupplementalSupportedConceptProperty <em>Supplemental Supported Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement#getSupplementalSupportedCodeProperty <em>Supplemental Supported Code Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement#getConceptSupplement <em>Concept Supplement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement#getAppliesToReleaseDate <em>Applies To Release Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionSupplement()
 * @model extendedMetaData="name='CodeSystemVersionSupplement' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemVersionSupplement extends CodeSystemVersionBase {
	/**
	 * Returns the value of the '<em><b>Supplemental Supported Concept Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a type of supplemental relationship between codes that is supported by this code system version.
	 * UML: Identifies dependencies allowed for components of this package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplemental Supported Concept Relationship</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionSupplement_SupplementalSupportedConceptRelationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplementalSupportedConceptRelationship' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupportedConceptRelationship> getSupplementalSupportedConceptRelationship();

	/**
	 * Returns the value of the '<em><b>Supplemental Supported Concept Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a type of supplemental property that may/must be associated with a code system concept.
	 * UML: Tag on CodeSystem stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplemental Supported Concept Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionSupplement_SupplementalSupportedConceptProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplementalSupportedConceptProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupportedProperty> getSupplementalSupportedConceptProperty();

	/**
	 * Returns the value of the '<em><b>Supplemental Supported Code Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a type of supplemental property that may/must be associated with a code system code.
	 * UML: Tag on CodeSystem stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplemental Supported Code Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionSupplement_SupplementalSupportedCodeProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplementalSupportedCodeProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupportedProperty> getSupplementalSupportedCodeProperty();

	/**
	 * Returns the value of the '<em><b>Concept Supplement</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A supplement to single encoded concept that is represented in the code system
	 * UML: Complex grouper.  (Not sure how to put something between enumeration and its enumeration items)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept Supplement</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionSupplement_ConceptSupplement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conceptSupplement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptSupplement> getConceptSupplement();

	/**
	 * Returns the value of the '<em><b>Applies To Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date on which the particular version of the code system being supplemented was published, as recognized by HL7.
	 * UML: Corresponds to the 'name' of this ModelElement.  (It's what uniquely defines the code system version within the code system package.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies To Release Date</em>' attribute.
	 * @see #setAppliesToReleaseDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionSupplement_AppliesToReleaseDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='attribute' name='appliesToReleaseDate'"
	 * @generated
	 */
	XMLGregorianCalendar getAppliesToReleaseDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement#getAppliesToReleaseDate <em>Applies To Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To Release Date</em>' attribute.
	 * @see #getAppliesToReleaseDate()
	 * @generated
	 */
	void setAppliesToReleaseDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name used in determining the sort order of the model element within its siblings.
	 * Impl: This will usually be a sequential number, but could be something else.
	 * UML: tag value within ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort Key</em>' attribute.
	 * @see #setSortKey(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemVersionSupplement_SortKey()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='sortKey'"
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(String value);

} // CodeSystemVersionSupplement
