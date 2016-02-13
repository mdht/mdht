/**
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 */
package org.eclipse.mdht.uml.validation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.mdht.uml.validation.ValidationPackage
 * @generated
 */
public interface ValidationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	ValidationFactory eINSTANCE = org.eclipse.mdht.uml.validation.internal.impl.ValidationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diagnostic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Diagnostic</em>'.
	 * @generated
	 */
	Diagnostic createDiagnostic();

	/**
	 * Returns a new object of class '<em>Constraint Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Constraint Provider</em>'.
	 * @generated
	 */
	ConstraintProvider createConstraintProvider();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	ValidationPackage getValidationPackage();

} // ValidationFactory
