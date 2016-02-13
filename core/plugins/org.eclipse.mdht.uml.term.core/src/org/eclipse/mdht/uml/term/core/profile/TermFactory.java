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
package org.eclipse.mdht.uml.term.core.profile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage
 * @generated
 */
public interface TermFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	TermFactory eINSTANCE = org.eclipse.mdht.uml.term.core.profile.impl.TermFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>CD</em>'.
	 * @generated
	 */
	CD createCD();

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
	 * Returns a new object of class '<em>Code System Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Code System Version</em>'.
	 * @generated
	 */
	CodeSystemVersion createCodeSystemVersion();

	/**
	 * Returns a new object of class '<em>Concept Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Concept Domain</em>'.
	 * @generated
	 */
	ConceptDomain createConceptDomain();

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
	 * Returns a new object of class '<em>CR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>CR</em>'.
	 * @generated
	 */
	CR createCR();

	/**
	 * Returns a new object of class '<em>Usage Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Usage Context</em>'.
	 * @generated
	 */
	UsageContext createUsageContext();

	/**
	 * Returns a new object of class '<em>Value Set Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Value Set Code</em>'.
	 * @generated
	 */
	ValueSetCode createValueSetCode();

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
	 * Returns a new object of class '<em>Value Set Context Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Value Set Context Binding</em>'.
	 * @generated
	 */
	ValueSetContextBinding createValueSetContextBinding();

	/**
	 * Returns a new object of class '<em>Value Set Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Value Set Version</em>'.
	 * @generated
	 */
	ValueSetVersion createValueSetVersion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	TermPackage getTermPackage();

} // TermFactory
