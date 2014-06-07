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
package org.openhealthtools.mdht.cts2.association;

import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.DirectoryEntry;
import org.openhealthtools.mdht.cts2.core.PredicateReference;
import org.openhealthtools.mdht.cts2.core.StatementTarget;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A synopsis of an <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">Association</i> along with information about how to access the complete
 * resource.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getSubject <em>Subject</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getPredicate <em>Predicate</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getTarget <em>Target</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getAssertedBy <em>Asserted By</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationDirectoryEntry()
 * @model extendedMetaData="name='AssociationDirectoryEntry' kind='elementOnly'"
 * @generated
 */
public interface AssociationDirectoryEntry extends DirectoryEntry {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the subject of the association statement
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(URIAndEntityName)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationDirectoryEntry_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	URIAndEntityName getSubject();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getSubject <em>Subject</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(URIAndEntityName value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the predicate of the association statement
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(PredicateReference)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationDirectoryEntry_Predicate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='predicate' namespace='##targetNamespace'"
	 * @generated
	 */
	PredicateReference getPredicate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getPredicate <em>Predicate</em>}' containment
	 * reference.
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
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the target (object) of the association statement
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(StatementTarget)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationDirectoryEntry_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	StatementTarget getTarget();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getTarget <em>Target</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StatementTarget value);

	/**
	 * Returns the value of the '<em><b>Asserted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the code system version that is making this assertion
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Asserted By</em>' containment reference.
	 * @see #setAssertedBy(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getAssociationDirectoryEntry_AssertedBy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='assertedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getAssertedBy();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.AssociationDirectoryEntry#getAssertedBy <em>Asserted By</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Asserted By</em>' containment reference.
	 * @see #getAssertedBy()
	 * @generated
	 */
	void setAssertedBy(CodeSystemVersionReference value);

} // AssociationDirectoryEntry
