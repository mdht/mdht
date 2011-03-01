/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getOriginalText <em>Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getQualifiers <em>Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getTranslations <em>Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCodeSystemName <em>Code System Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCodeSystemVersion <em>Code System Version</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getCD()
 * @model
 * @generated
 */
public interface CD extends ANY {
	/**
	 * Returns the value of the '<em><b>Original Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Text</em>' containment reference.
	 * @see #setOriginalText(ED)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getCD_OriginalText()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	ED getOriginalText();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getOriginalText <em>Original Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Text</em>' containment reference.
	 * @see #getOriginalText()
	 * @generated
	 */
	void setOriginalText(ED value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.CR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getCD_Qualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	EList<CR> getQualifiers();

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.CD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getCD_Translation()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	EList<CD> getTranslations();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getCD_Code()
	 * @model ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code System</em>' attribute.
	 * @see #setCodeSystem(String)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getCD_CodeSystem()
	 * @model dataType="org.openhealthtools.mdht.uml.hl7.datatypes.uid" ordered="false"
	 * @generated
	 */
	String getCodeSystem();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCodeSystem <em>Code System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' attribute.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(String value);

	/**
	 * Returns the value of the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code System Name</em>' attribute.
	 * @see #setCodeSystemName(String)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getCD_CodeSystemName()
	 * @model dataType="org.openhealthtools.mdht.uml.hl7.datatypes.stType" ordered="false"
	 * @generated
	 */
	String getCodeSystemName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCodeSystemName <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System Name</em>' attribute.
	 * @see #getCodeSystemName()
	 * @generated
	 */
	void setCodeSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Code System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code System Version</em>' attribute.
	 * @see #setCodeSystemVersion(String)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getCD_CodeSystemVersion()
	 * @model dataType="org.openhealthtools.mdht.uml.hl7.datatypes.stType" ordered="false"
	 * @generated
	 */
	String getCodeSystemVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getCodeSystemVersion <em>Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System Version</em>' attribute.
	 * @see #getCodeSystemVersion()
	 * @generated
	 */
	void setCodeSystemVersion(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getCD_DisplayName()
	 * @model dataType="org.openhealthtools.mdht.uml.hl7.datatypes.stType" ordered="false"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.CD#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

} // CD
