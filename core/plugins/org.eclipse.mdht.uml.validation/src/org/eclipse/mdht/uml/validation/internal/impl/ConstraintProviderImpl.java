/**
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 */
package org.eclipse.mdht.uml.validation.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.mdht.uml.validation.ConstraintProvider;
import org.eclipse.mdht.uml.validation.Diagnostic;
import org.eclipse.mdht.uml.validation.ValidationPackage;
import org.eclipse.mdht.uml.validation.internal.operations.ConstraintProviderOperations;
import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.validation.internal.impl.ConstraintProviderImpl#getBase_Namespace <em>Base Namespace</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.internal.impl.ConstraintProviderImpl#getDiagnosticSource <em>Diagnostic Source</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.internal.impl.ConstraintProviderImpl#getCategoryID <em>Category ID</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.internal.impl.ConstraintProviderImpl#getCategoryName <em>Category Name</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.internal.impl.ConstraintProviderImpl#getParentCategoryID <em>Parent Category ID</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.internal.impl.ConstraintProviderImpl#getBundleName <em>Bundle Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintProviderImpl extends EObjectImpl implements ConstraintProvider {
	/**
	 * The cached value of the '{@link #getBase_Namespace() <em>Base Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBase_Namespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace base_Namespace;

	/**
	 * The default value of the '{@link #getDiagnosticSource() <em>Diagnostic Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDiagnosticSource()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGNOSTIC_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagnosticSource() <em>Diagnostic Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getDiagnosticSource()
	 * @generated
	 * @ordered
	 */
	protected String diagnosticSource = DIAGNOSTIC_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoryID() <em>Category ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCategoryID()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryID() <em>Category ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCategoryID()
	 * @generated
	 * @ordered
	 */
	protected String categoryID = CATEGORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected String categoryName = CATEGORY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentCategoryID() <em>Parent Category ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getParentCategoryID()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentCategoryID() <em>Parent Category ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getParentCategoryID()
	 * @generated
	 * @ordered
	 */
	protected String parentCategoryID = PARENT_CATEGORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBundleName() <em>Bundle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBundleName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundleName() <em>Bundle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getBundleName()
	 * @generated
	 * @ordered
	 */
	protected String bundleName = BUNDLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ConstraintProviderImpl() {
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
		return ValidationPackage.Literals.CONSTRAINT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Namespace getBase_Namespace() {
		if (base_Namespace != null && base_Namespace.eIsProxy()) {
			InternalEObject oldBase_Namespace = (InternalEObject) base_Namespace;
			base_Namespace = (Namespace) eResolveProxy(oldBase_Namespace);
			if (base_Namespace != oldBase_Namespace) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
						ValidationPackage.CONSTRAINT_PROVIDER__BASE_NAMESPACE, oldBase_Namespace, base_Namespace));
				}
			}
		}
		return base_Namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Namespace basicGetBase_Namespace() {
		return base_Namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setBase_Namespace(Namespace newBase_Namespace) {
		Namespace oldBase_Namespace = base_Namespace;
		base_Namespace = newBase_Namespace;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.CONSTRAINT_PROVIDER__BASE_NAMESPACE,
				oldBase_Namespace, base_Namespace));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String getDiagnosticSource() {
		return diagnosticSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setDiagnosticSource(String newDiagnosticSource) {
		String oldDiagnosticSource = diagnosticSource;
		diagnosticSource = newDiagnosticSource;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
				ValidationPackage.CONSTRAINT_PROVIDER__DIAGNOSTIC_SOURCE, oldDiagnosticSource, diagnosticSource));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String getCategoryID() {
		return categoryID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setCategoryID(String newCategoryID) {
		String oldCategoryID = categoryID;
		categoryID = newCategoryID;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.CONSTRAINT_PROVIDER__CATEGORY_ID,
				oldCategoryID, categoryID));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setCategoryName(String newCategoryName) {
		String oldCategoryName = categoryName;
		categoryName = newCategoryName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.CONSTRAINT_PROVIDER__CATEGORY_NAME,
				oldCategoryName, categoryName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String getParentCategoryID() {
		return parentCategoryID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setParentCategoryID(String newParentCategoryID) {
		String oldParentCategoryID = parentCategoryID;
		parentCategoryID = newParentCategoryID;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
				ValidationPackage.CONSTRAINT_PROVIDER__PARENT_CATEGORY_ID, oldParentCategoryID, parentCategoryID));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String getBundleName() {
		return bundleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setBundleName(String newBundleName) {
		String oldBundleName = bundleName;
		bundleName = newBundleName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.CONSTRAINT_PROVIDER__BUNDLE_NAME,
				oldBundleName, bundleName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EList<Diagnostic> getDiagnostics() {
		return ConstraintProviderOperations.getDiagnostics(this);
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
			case ValidationPackage.CONSTRAINT_PROVIDER__BASE_NAMESPACE:
				if (resolve) {
					return getBase_Namespace();
				}
				return basicGetBase_Namespace();
			case ValidationPackage.CONSTRAINT_PROVIDER__DIAGNOSTIC_SOURCE:
				return getDiagnosticSource();
			case ValidationPackage.CONSTRAINT_PROVIDER__CATEGORY_ID:
				return getCategoryID();
			case ValidationPackage.CONSTRAINT_PROVIDER__CATEGORY_NAME:
				return getCategoryName();
			case ValidationPackage.CONSTRAINT_PROVIDER__PARENT_CATEGORY_ID:
				return getParentCategoryID();
			case ValidationPackage.CONSTRAINT_PROVIDER__BUNDLE_NAME:
				return getBundleName();
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
			case ValidationPackage.CONSTRAINT_PROVIDER__BASE_NAMESPACE:
				setBase_Namespace((Namespace) newValue);
				return;
			case ValidationPackage.CONSTRAINT_PROVIDER__DIAGNOSTIC_SOURCE:
				setDiagnosticSource((String) newValue);
				return;
			case ValidationPackage.CONSTRAINT_PROVIDER__CATEGORY_ID:
				setCategoryID((String) newValue);
				return;
			case ValidationPackage.CONSTRAINT_PROVIDER__CATEGORY_NAME:
				setCategoryName((String) newValue);
				return;
			case ValidationPackage.CONSTRAINT_PROVIDER__PARENT_CATEGORY_ID:
				setParentCategoryID((String) newValue);
				return;
			case ValidationPackage.CONSTRAINT_PROVIDER__BUNDLE_NAME:
				setBundleName((String) newValue);
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
			case ValidationPackage.CONSTRAINT_PROVIDER__BASE_NAMESPACE:
				setBase_Namespace((Namespace) null);
				return;
			case ValidationPackage.CONSTRAINT_PROVIDER__DIAGNOSTIC_SOURCE:
				setDiagnosticSource(DIAGNOSTIC_SOURCE_EDEFAULT);
				return;
			case ValidationPackage.CONSTRAINT_PROVIDER__CATEGORY_ID:
				setCategoryID(CATEGORY_ID_EDEFAULT);
				return;
			case ValidationPackage.CONSTRAINT_PROVIDER__CATEGORY_NAME:
				setCategoryName(CATEGORY_NAME_EDEFAULT);
				return;
			case ValidationPackage.CONSTRAINT_PROVIDER__PARENT_CATEGORY_ID:
				setParentCategoryID(PARENT_CATEGORY_ID_EDEFAULT);
				return;
			case ValidationPackage.CONSTRAINT_PROVIDER__BUNDLE_NAME:
				setBundleName(BUNDLE_NAME_EDEFAULT);
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
			case ValidationPackage.CONSTRAINT_PROVIDER__BASE_NAMESPACE:
				return base_Namespace != null;
			case ValidationPackage.CONSTRAINT_PROVIDER__DIAGNOSTIC_SOURCE:
				return DIAGNOSTIC_SOURCE_EDEFAULT == null
						? diagnosticSource != null
						: !DIAGNOSTIC_SOURCE_EDEFAULT.equals(diagnosticSource);
			case ValidationPackage.CONSTRAINT_PROVIDER__CATEGORY_ID:
				return CATEGORY_ID_EDEFAULT == null
						? categoryID != null
						: !CATEGORY_ID_EDEFAULT.equals(categoryID);
			case ValidationPackage.CONSTRAINT_PROVIDER__CATEGORY_NAME:
				return CATEGORY_NAME_EDEFAULT == null
						? categoryName != null
						: !CATEGORY_NAME_EDEFAULT.equals(categoryName);
			case ValidationPackage.CONSTRAINT_PROVIDER__PARENT_CATEGORY_ID:
				return PARENT_CATEGORY_ID_EDEFAULT == null
						? parentCategoryID != null
						: !PARENT_CATEGORY_ID_EDEFAULT.equals(parentCategoryID);
			case ValidationPackage.CONSTRAINT_PROVIDER__BUNDLE_NAME:
				return BUNDLE_NAME_EDEFAULT == null
						? bundleName != null
						: !BUNDLE_NAME_EDEFAULT.equals(bundleName);
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
		result.append(" (diagnosticSource: "); //$NON-NLS-1$
		result.append(diagnosticSource);
		result.append(", categoryID: "); //$NON-NLS-1$
		result.append(categoryID);
		result.append(", categoryName: "); //$NON-NLS-1$
		result.append(categoryName);
		result.append(", parentCategoryID: "); //$NON-NLS-1$
		result.append(parentCategoryID);
		result.append(", bundleName: "); //$NON-NLS-1$
		result.append(bundleName);
		result.append(')');
		return result.toString();
	}

} // ConstraintProviderImpl
