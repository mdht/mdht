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
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.Note;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.NoteImpl#getAssertedInCodeSystemVersion <em>Asserted In Code System Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.NoteImpl#getCorrespondingStatement <em>Corresponding Statement</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.NoteImpl#getExternalIdentifier <em>External Identifier</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class NoteImpl extends EntryDescriptionImpl implements Note {
	/**
	 * The default value of the '{@link #getAssertedInCodeSystemVersion() <em>Asserted In Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssertedInCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSERTED_IN_CODE_SYSTEM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssertedInCodeSystemVersion() <em>Asserted In Code System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssertedInCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected String assertedInCodeSystemVersion = ASSERTED_IN_CODE_SYSTEM_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorrespondingStatement() <em>Corresponding Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCorrespondingStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRESPONDING_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrespondingStatement() <em>Corresponding Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCorrespondingStatement()
	 * @generated
	 * @ordered
	 */
	protected String correspondingStatement = CORRESPONDING_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalIdentifier() <em>External Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExternalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalIdentifier() <em>External Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExternalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String externalIdentifier = EXTERNAL_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getAssertedInCodeSystemVersion() {
		return assertedInCodeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssertedInCodeSystemVersion(String newAssertedInCodeSystemVersion) {
		String oldAssertedInCodeSystemVersion = assertedInCodeSystemVersion;
		assertedInCodeSystemVersion = newAssertedInCodeSystemVersion;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.NOTE__ASSERTED_IN_CODE_SYSTEM_VERSION,
				oldAssertedInCodeSystemVersion, assertedInCodeSystemVersion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCorrespondingStatement() {
		return correspondingStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCorrespondingStatement(String newCorrespondingStatement) {
		String oldCorrespondingStatement = correspondingStatement;
		correspondingStatement = newCorrespondingStatement;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.NOTE__CORRESPONDING_STATEMENT, oldCorrespondingStatement,
				correspondingStatement));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getExternalIdentifier() {
		return externalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExternalIdentifier(String newExternalIdentifier) {
		String oldExternalIdentifier = externalIdentifier;
		externalIdentifier = newExternalIdentifier;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.NOTE__EXTERNAL_IDENTIFIER, oldExternalIdentifier,
				externalIdentifier));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.NOTE__ASSERTED_IN_CODE_SYSTEM_VERSION:
				return getAssertedInCodeSystemVersion();
			case CorePackage.NOTE__CORRESPONDING_STATEMENT:
				return getCorrespondingStatement();
			case CorePackage.NOTE__EXTERNAL_IDENTIFIER:
				return getExternalIdentifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.NOTE__ASSERTED_IN_CODE_SYSTEM_VERSION:
				setAssertedInCodeSystemVersion((String) newValue);
				return;
			case CorePackage.NOTE__CORRESPONDING_STATEMENT:
				setCorrespondingStatement((String) newValue);
				return;
			case CorePackage.NOTE__EXTERNAL_IDENTIFIER:
				setExternalIdentifier((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.NOTE__ASSERTED_IN_CODE_SYSTEM_VERSION:
				setAssertedInCodeSystemVersion(ASSERTED_IN_CODE_SYSTEM_VERSION_EDEFAULT);
				return;
			case CorePackage.NOTE__CORRESPONDING_STATEMENT:
				setCorrespondingStatement(CORRESPONDING_STATEMENT_EDEFAULT);
				return;
			case CorePackage.NOTE__EXTERNAL_IDENTIFIER:
				setExternalIdentifier(EXTERNAL_IDENTIFIER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.NOTE__ASSERTED_IN_CODE_SYSTEM_VERSION:
				return ASSERTED_IN_CODE_SYSTEM_VERSION_EDEFAULT == null
						? assertedInCodeSystemVersion != null
						: !ASSERTED_IN_CODE_SYSTEM_VERSION_EDEFAULT.equals(assertedInCodeSystemVersion);
			case CorePackage.NOTE__CORRESPONDING_STATEMENT:
				return CORRESPONDING_STATEMENT_EDEFAULT == null
						? correspondingStatement != null
						: !CORRESPONDING_STATEMENT_EDEFAULT.equals(correspondingStatement);
			case CorePackage.NOTE__EXTERNAL_IDENTIFIER:
				return EXTERNAL_IDENTIFIER_EDEFAULT == null
						? externalIdentifier != null
						: !EXTERNAL_IDENTIFIER_EDEFAULT.equals(externalIdentifier);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (assertedInCodeSystemVersion: ");
		result.append(assertedInCodeSystemVersion);
		result.append(", correspondingStatement: ");
		result.append(correspondingStatement);
		result.append(", externalIdentifier: ");
		result.append(externalIdentifier);
		result.append(')');
		return result.toString();
	}

} // NoteImpl
