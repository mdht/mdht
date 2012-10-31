/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Version Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * a reference to a specific version of code system and, if known, the code system which it is a version of
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference#getVersion <em>Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference#getCodeSystem <em>Code System</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getCodeSystemVersionReference()
 * @model extendedMetaData="name='CodeSystemVersionReference' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemVersionReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(NameAndMeaningReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getCodeSystemVersionReference_Version()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	NameAndMeaningReference getVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference#getVersion <em>Version</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(NameAndMeaningReference value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the code system that the version is a version of. Must be present if this information is known to the CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> service implementation.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System</em>' containment reference.
	 * @see #setCodeSystem(CodeSystemReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getCodeSystemVersionReference_CodeSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemReference getCodeSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference#getCodeSystem <em>Code System</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System</em>' containment reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(CodeSystemReference value);

} // CodeSystemVersionReference
