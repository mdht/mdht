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
 * A representation of the model object '<em><b>Package Base</b></em>'.
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
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageBase#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageBase#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageBase#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageBase()
 * @model abstract="true"
 *        extendedMetaData="name='PackageBase' kind='elementOnly'"
 * @generated
 */
public interface PackageBase extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Business Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BusinessName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The business names associated with the element. CURRENT- 0..1
	 * UML: Tag value inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Name</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageBase_BusinessName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='businessName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BusinessName> getBusinessName();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique name or id of the package (within the context of its parents)
	 * UML: name attribute inherited from ModelElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageBase_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getPackageBase_SortKey()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName"
	 *        extendedMetaData="kind='attribute' name='sortKey'"
	 * @generated
	 */
	String getSortKey();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageBase#getSortKey <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key</em>' attribute.
	 * @see #getSortKey()
	 * @generated
	 */
	void setSortKey(String value);

} // PackageBase
