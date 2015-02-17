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
 * A representation of the model object '<em><b>Concept Supplement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An extension to a single concept represented in the referenced code system.
 * UML: A grouping of tags to an existing enumeration items within a broader enumeration
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement#getSupplementalConceptRelationship <em>Supplemental Concept Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement#getSupplementalConceptProperty <em>Supplemental Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement#getPrintName <em>Print Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement#getCodeSupplement <em>Code Supplement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptSupplement()
 * @model extendedMetaData="name='ConceptSupplement' kind='elementOnly'"
 * @generated
 */
public interface ConceptSupplement extends ConceptBase {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the coded concept.
	 * UML: A collector for the comments and constraints associated with a coded concept.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(ConceptSupplementAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptSupplement_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptSupplementAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(ConceptSupplementAnnotations value);

	/**
	 * Returns the value of the '<em><b>Supplemental Concept Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An additional relationship between this concept and another coded concept in the same code system.
	 * UML: Dependency between two Concept Code stereotypes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplemental Concept Relationship</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptSupplement_SupplementalConceptRelationship()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplementalConceptRelationship' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptRelationship> getSupplementalConceptRelationship();

	/**
	 * Returns the value of the '<em><b>Supplemental Concept Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An additional property of the concept expressed as a coded name with an associated value.
	 * UML: tag on Concept Code stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplemental Concept Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptSupplement_SupplementalConceptProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplementalConceptProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptProperty> getSupplementalConceptProperty();

	/**
	 * Returns the value of the '<em><b>Print Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Preferred and alternative print names for this concept that are independent of code in a specified language.
	 * UML: tag on Concept Code stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Print Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptSupplement_PrintName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='printName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PrintName> getPrintName();

	/**
	 * Returns the value of the '<em><b>Code Supplement</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSupplement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies supplements to the codes that may be used to represent the concept
	 * UML: enumeration items within the code system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Supplement</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptSupplement_CodeSupplement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSupplement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSupplement> getCodeSupplement();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies one of the codes for the concept in the code system, allowing the concept to be referenced.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptSupplement_Code()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // ConceptSupplement
