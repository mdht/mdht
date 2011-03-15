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
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.IIOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>II</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IIImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IIImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IIImpl#getAssigningAuthorityName <em>Assigning Authority Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IIImpl#getDisplayable <em>Displayable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IIImpl extends ANYImpl implements II {
	/**
	 * The default value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected String root = ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssigningAuthorityName() <em>Assigning Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigningAuthorityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNING_AUTHORITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssigningAuthorityName() <em>Assigning Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigningAuthorityName()
	 * @generated
	 * @ordered
	 */
	protected String assigningAuthorityName = ASSIGNING_AUTHORITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayable() <em>Displayable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DISPLAYABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayable() <em>Displayable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayable()
	 * @generated
	 * @ordered
	 */
	protected Boolean displayable = DISPLAYABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.II;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(String newRoot) {
		String oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.II__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.II__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssigningAuthorityName() {
		return assigningAuthorityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssigningAuthorityName(String newAssigningAuthorityName) {
		String oldAssigningAuthorityName = assigningAuthorityName;
		assigningAuthorityName = newAssigningAuthorityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.II__ASSIGNING_AUTHORITY_NAME, oldAssigningAuthorityName, assigningAuthorityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDisplayable() {
		return displayable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayable(Boolean newDisplayable) {
		Boolean oldDisplayable = displayable;
		displayable = newDisplayable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.II__DISPLAYABLE, oldDisplayable, displayable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateII(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return IIOperations.validateII(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.II__ROOT:
				return getRoot();
			case DatatypesPackage.II__EXTENSION:
				return getExtension();
			case DatatypesPackage.II__ASSIGNING_AUTHORITY_NAME:
				return getAssigningAuthorityName();
			case DatatypesPackage.II__DISPLAYABLE:
				return getDisplayable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatatypesPackage.II__ROOT:
				setRoot((String)newValue);
				return;
			case DatatypesPackage.II__EXTENSION:
				setExtension((String)newValue);
				return;
			case DatatypesPackage.II__ASSIGNING_AUTHORITY_NAME:
				setAssigningAuthorityName((String)newValue);
				return;
			case DatatypesPackage.II__DISPLAYABLE:
				setDisplayable((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatatypesPackage.II__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
			case DatatypesPackage.II__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case DatatypesPackage.II__ASSIGNING_AUTHORITY_NAME:
				setAssigningAuthorityName(ASSIGNING_AUTHORITY_NAME_EDEFAULT);
				return;
			case DatatypesPackage.II__DISPLAYABLE:
				setDisplayable(DISPLAYABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatatypesPackage.II__ROOT:
				return ROOT_EDEFAULT == null ? root != null : !ROOT_EDEFAULT.equals(root);
			case DatatypesPackage.II__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case DatatypesPackage.II__ASSIGNING_AUTHORITY_NAME:
				return ASSIGNING_AUTHORITY_NAME_EDEFAULT == null ? assigningAuthorityName != null : !ASSIGNING_AUTHORITY_NAME_EDEFAULT.equals(assigningAuthorityName);
			case DatatypesPackage.II__DISPLAYABLE:
				return DISPLAYABLE_EDEFAULT == null ? displayable != null : !DISPLAYABLE_EDEFAULT.equals(displayable);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (root: ");
		result.append(root);
		result.append(", extension: ");
		result.append(extension);
		result.append(", assigningAuthorityName: ");
		result.append(assigningAuthorityName);
		result.append(", displayable: ");
		result.append(displayable);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean equals(Object arg) {
		if (!(arg instanceof II)) {
			return false;
		}
		II id2 = (II)arg;
		
		String id1Root = this.getRoot();
		String id1Ext = this.getExtension();
		String id2Root = id2.getRoot();
		String id2Ext = id2.getExtension();
		
		return id1Root != null && id1Root.equals(id2Root)
			&& (id1Ext == null && id2Ext == null)
				|| (id1Ext != null && id1Ext.equals(id2Ext));
	}

} //IIImpl
