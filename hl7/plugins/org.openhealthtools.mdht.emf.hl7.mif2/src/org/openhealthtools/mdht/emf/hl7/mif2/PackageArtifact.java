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
 * A representation of the model object '<em><b>Package Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract parent of artifacts that have general characteristics of 'packages', but aren't actually packages.
 * UML: Stereotype on ModelElement
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageArtifact#getPackageLocation <em>Package Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageArtifact#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageArtifact()
 * @model abstract="true"
 *        extendedMetaData="name='PackageArtifact' kind='elementOnly'"
 * @generated
 */
public interface PackageArtifact extends PackageBase {
	/**
	 * Returns the value of the '<em><b>Package Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies where (within the 'repository' package hierarchy) this package resides
	 * UML: Identifies the namespace the package is part of
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Location</em>' containment reference.
	 * @see #setPackageLocation(PackageRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageArtifact_PackageLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packageLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageRef getPackageLocation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageArtifact#getPackageLocation <em>Package Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Location</em>' containment reference.
	 * @see #getPackageLocation()
	 * @generated
	 */
	void setPackageLocation(PackageRef value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive name for the package in circumstances where the 'name' is more of an identifier.
	 * UML: title tag on Package stereotype
	 * DublinCore: Equivalent to 'title'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageArtifact_Title()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageArtifact#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // PackageArtifact
