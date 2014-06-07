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
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complete Code System Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * An entry that, when resolved, returns all of the active entity references in a given code system. This includes all entity references that appear
 * as the source of one or more statements in the code system,
 * whether the assertions are made directly by a version of the code system or indirectly by a version of a different code system that is imported.
 * Note that targets are not included to prevent codes from rdf, rdfs, owl, etc
 * being included in this resolution set.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference#getCodeSystem <em>Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference#getCodeSystemVersion <em>Code System Version</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getCompleteCodeSystemReference()
 * @model extendedMetaData="name='CompleteCodeSystemReference' kind='elementOnly'"
 * @generated
 */
public interface CompleteCodeSystemReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the code system whose codes are to be included.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System</em>' containment reference.
	 * @see #setCodeSystem(CodeSystemReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getCompleteCodeSystemReference_CodeSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemReference getCodeSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference#getCodeSystem <em>Code System</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System</em>' containment reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(CodeSystemReference value);

	/**
	 * Returns the value of the '<em><b>Code System Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the specific version of the code system to include. If not supplied, the specific version of the code system is determined in
	 * the resolution call itself.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System Version</em>' containment reference.
	 * @see #setCodeSystemVersion(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getCompleteCodeSystemReference_CodeSystemVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystemVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getCodeSystemVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference#getCodeSystemVersion
	 * <em>Code System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Version</em>' containment reference.
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	void setCodeSystemVersion(CodeSystemVersionReference value);

} // CompleteCodeSystemReference
