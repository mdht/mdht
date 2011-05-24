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
 * A representation of the model object '<em><b>Package Def Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to define the identification information for a package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageDefId#getSecondaryId <em>Secondary Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageDefId()
 * @model extendedMetaData="name='PackageDefId' kind='empty'"
 * @generated
 */
public interface PackageDefId extends PackageRef {
	/**
	 * Returns the value of the '<em><b>Secondary Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An object identifier issued to the package or model as a supplementary id used for locating the object in registries, etc.
	 * UML: Tag on HL7Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secondary Id</em>' attribute.
	 * @see #setSecondaryId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageDefId_SecondaryId()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid"
	 *        extendedMetaData="kind='attribute' name='secondaryId'"
	 * @generated
	 */
	String getSecondaryId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageDefId#getSecondaryId <em>Secondary Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Id</em>' attribute.
	 * @see #getSecondaryId()
	 * @generated
	 */
	void setSecondaryId(String value);

} // PackageDefId
