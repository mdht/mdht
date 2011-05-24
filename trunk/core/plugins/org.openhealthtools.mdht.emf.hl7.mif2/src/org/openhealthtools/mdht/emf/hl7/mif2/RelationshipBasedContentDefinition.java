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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Based Content Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allows referencing a relationship to a code or group of codes
 * UML: Mechanism for defining imported contents
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.RelationshipBasedContentDefinition#getTargetConcepts <em>Target Concepts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.RelationshipBasedContentDefinition#getRelationshipName <em>Relationship Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRelationshipBasedContentDefinition()
 * @model extendedMetaData="name='RelationshipBasedContentDefinition' kind='elementOnly'"
 * @generated
 */
public interface RelationshipBasedContentDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Concepts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the list of codes where at least one of the codes must exist for the relationship to be true.  If not specified, then the valueset is considered unbounded.  I.e. The relationship may exist for any code.
	 * UML: Defines a set of code enumerations at the end of the dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Concepts</em>' containment reference.
	 * @see #setTargetConcepts(ContentDefinition)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRelationshipBasedContentDefinition_TargetConcepts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetConcepts' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentDefinition getTargetConcepts();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RelationshipBasedContentDefinition#getTargetConcepts <em>Target Concepts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Concepts</em>' containment reference.
	 * @see #getTargetConcepts()
	 * @generated
	 */
	void setTargetConcepts(ContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies what kind of relationship is being referenced
	 * UML: Specialization of the dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Name</em>' attribute.
	 * @see #setRelationshipName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRelationshipBasedContentDefinition_RelationshipName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName" required="true"
	 *        extendedMetaData="kind='attribute' name='relationshipName'"
	 * @generated
	 */
	String getRelationshipName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.RelationshipBasedContentDefinition#getRelationshipName <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Name</em>' attribute.
	 * @see #getRelationshipName()
	 * @generated
	 */
	void setRelationshipName(String value);

} // RelationshipBasedContentDefinition
