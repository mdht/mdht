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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Statement</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A statement lacking a named subject.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.AnonymousStatement#getPredicate <em>Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.AnonymousStatement#getTarget <em>Target</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.AnonymousStatement#getStatmentQualifier <em>Statment Qualifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getAnonymousStatement()
 * @model extendedMetaData="name='AnonymousStatement' kind='elementOnly'"
 * @generated
 */
public interface AnonymousStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the predicate of the anonymous statement
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(PredicateReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getAnonymousStatement_Predicate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='predicate' namespace='##targetNamespace'"
	 * @generated
	 */
	PredicateReference getPredicate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.AnonymousStatement#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(PredicateReference value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.StatementTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the target of the anonymous statement
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getAnonymousStatement_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatementTarget> getTarget();

	/**
	 * Returns the value of the '<em><b>Statment Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * assertions whose subject is the anonymous statement
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Statment Qualifier</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getAnonymousStatement_StatmentQualifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statmentQualifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Property> getStatmentQualifier();

} // AnonymousStatement
