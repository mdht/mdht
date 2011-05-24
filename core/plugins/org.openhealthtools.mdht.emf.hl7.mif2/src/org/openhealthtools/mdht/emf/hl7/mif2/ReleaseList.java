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
 * A representation of the model object '<em><b>Release List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a set of supported releases
 * UML: Part of a complex tag
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ReleaseList#getRelease <em>Release</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getReleaseList()
 * @model extendedMetaData="name='ReleaseList' kind='elementOnly'"
 * @generated
 */
public interface ReleaseList extends EObject {
	/**
	 * Returns the value of the '<em><b>Release</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a single supported release
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release</em>' containment reference.
	 * @see #setRelease(Release)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getReleaseList_Release()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='release' namespace='##targetNamespace'"
	 * @generated
	 */
	Release getRelease();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ReleaseList#getRelease <em>Release</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' containment reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(Release value);

} // ReleaseList
