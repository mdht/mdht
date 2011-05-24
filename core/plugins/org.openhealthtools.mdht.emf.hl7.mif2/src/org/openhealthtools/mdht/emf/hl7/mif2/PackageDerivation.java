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
 * A representation of the model object '<em><b>Package Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UML: a Derivation that points to another package.  (To make XML handle the graph-like nature of UML)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageDerivation#getTargetPackage <em>Target Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageDerivation()
 * @model extendedMetaData="name='PackageDerivation' kind='elementOnly'"
 * @generated
 */
public interface PackageDerivation extends Derivation {
	/**
	 * Returns the value of the '<em><b>Target Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package from which the current package is derived.
	 * UML: The full path of Package names of the Package (inherited from ModelElement) that is being derived from
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Package</em>' containment reference.
	 * @see #setTargetPackage(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageDerivation_TargetPackage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetPackage' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getTargetPackage();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageDerivation#getTargetPackage <em>Target Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Package</em>' containment reference.
	 * @see #getTargetPackage()
	 * @generated
	 */
	void setTargetPackage(PackageRef value);

} // PackageDerivation
