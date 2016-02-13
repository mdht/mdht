/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.core.profile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage
 * @generated
 */
public interface CDAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	CDAFactory eINSTANCE = org.eclipse.mdht.uml.cda.core.profile.impl.CDAFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Act Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Act Relationship</em>'.
	 * @generated
	 */
	ActRelationship createActRelationship();

	/**
	 * Returns a new object of class '<em>Association Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Association Validation</em>'.
	 * @generated
	 */
	AssociationValidation createAssociationValidation();

	/**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
	CDATemplate createCDATemplate();

	/**
	 * Returns a new object of class '<em>Class Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Class Validation</em>'.
	 * @generated
	 */
	ClassValidation createClassValidation();

	/**
	 * Returns a new object of class '<em>Codegen Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Codegen Support</em>'.
	 * @generated
	 */
	CodegenSupport createCodegenSupport();

	/**
	 * Returns a new object of class '<em>Code System Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Code System Constraint</em>'.
	 * @generated
	 */
	CodeSystemConstraint createCodeSystemConstraint();

	/**
	 * Returns a new object of class '<em>Concept Domain Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Concept Domain Constraint</em>'.
	 * @generated
	 */
	ConceptDomainConstraint createConceptDomainConstraint();

	/**
	 * Returns a new object of class '<em>Conforms To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Conforms To</em>'.
	 * @generated
	 */
	ConformsTo createConformsTo();

	/**
	 * Returns a new object of class '<em>Constraint Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Constraint Validation</em>'.
	 * @generated
	 */
	ConstraintValidation createConstraintValidation();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns a new object of class '<em>Entry Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Entry Relationship</em>'.
	 * @generated
	 */
	EntryRelationship createEntryRelationship();

	/**
	 * Returns a new object of class '<em>Null Flavor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Null Flavor</em>'.
	 * @generated
	 */
	NullFlavor createNullFlavor();

	/**
	 * Returns a new object of class '<em>Participation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Participation</em>'.
	 * @generated
	 */
	Participation createParticipation();

	/**
	 * Returns a new object of class '<em>Logical Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Logical Constraint</em>'.
	 * @generated
	 */
	LogicalConstraint createLogicalConstraint();

	/**
	 * Returns a new object of class '<em>Inline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Inline</em>'.
	 * @generated
	 */
	Inline createInline();

	/**
	 * Returns a new object of class '<em>Unimplementable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Unimplementable</em>'.
	 * @generated
	 */
	Unimplementable createUnimplementable();

	/**
	 * Returns a new object of class '<em>Property Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Property Validation</em>'.
	 * @generated
	 */
	PropertyValidation createPropertyValidation();

	/**
	 * Returns a new object of class '<em>Text Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Text Value</em>'.
	 * @generated
	 */
	TextValue createTextValue();

	/**
	 * Returns a new object of class '<em>Value Set Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Value Set Constraint</em>'.
	 * @generated
	 */
	ValueSetConstraint createValueSetConstraint();

	/**
	 * Returns a new object of class '<em>Vocab Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Vocab Specification</em>'.
	 * @generated
	 */
	VocabSpecification createVocabSpecification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	CDAPackage getCDAPackage();

} // CDAFactory
