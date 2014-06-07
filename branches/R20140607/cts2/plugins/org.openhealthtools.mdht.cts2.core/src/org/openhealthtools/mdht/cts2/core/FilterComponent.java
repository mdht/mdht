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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Component</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A restriction on an attribute, property or special field
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.FilterComponent#getMatchAlgorithm <em>Match Algorithm</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.FilterComponent#getMatchValue <em>Match Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getFilterComponent()
 * @model extendedMetaData="name='FilterComponent' kind='elementOnly'"
 * @generated
 */
public interface FilterComponent extends PropertyReference {
	/**
	 * Returns the value of the '<em><b>Match Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the algorithm to be used for testing the referenced component. Examples might include "starts with", "regular expression match", "exists",
	 * "inRange", etc. NOTE: The CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> specification
	 * needs to establish a core set of match algorithms that all compliant implementations must support.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Match Algorithm</em>' containment reference.
	 * @see #setMatchAlgorithm(MatchAlgorithmReference)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getFilterComponent_MatchAlgorithm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='matchAlgorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	MatchAlgorithmReference getMatchAlgorithm();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.FilterComponent#getMatchAlgorithm <em>Match Algorithm</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Match Algorithm</em>' containment reference.
	 * @see #getMatchAlgorithm()
	 * @generated
	 */
	void setMatchAlgorithm(MatchAlgorithmReference value);

	/**
	 * Returns the value of the '<em><b>Match Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the value to be used in comparison. The structure and format of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">matchValue</i> depends on
	 * the specific <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">matchAlgorithm</i>. As an example, a "startsWith" algorithm would be plain
	 * text, a
	 * "regularExpression" algorithm would have a regular expression while an "exists" algorithm would have nothing in the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">matchValue</i> attribute.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Match Value</em>' attribute.
	 * @see #setMatchValue(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getFilterComponent_MatchValue()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='element' name='matchValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMatchValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.FilterComponent#getMatchValue <em>Match Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Match Value</em>' attribute.
	 * @see #getMatchValue()
	 * @generated
	 */
	void setMatchValue(String value);

} // FilterComponent
