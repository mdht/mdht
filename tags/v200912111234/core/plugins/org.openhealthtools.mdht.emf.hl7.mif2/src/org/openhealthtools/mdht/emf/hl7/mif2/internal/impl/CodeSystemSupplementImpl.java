/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Supplement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemSupplementImpl#getCodeSystemVersionSupplement <em>Code System Version Supplement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemSupplementImpl#getSupplementId <em>Supplement Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeSystemSupplementImpl extends CodeSystemBaseImpl implements CodeSystemSupplement {
	/**
	 * The cached value of the '{@link #getCodeSystemVersionSupplement() <em>Code System Version Supplement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemVersionSupplement()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemVersionSupplement> codeSystemVersionSupplement;

	/**
	 * The default value of the '{@link #getSupplementId() <em>Supplement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplementId() <em>Supplement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementId()
	 * @generated
	 * @ordered
	 */
	protected String supplementId = SUPPLEMENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSystemSupplementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CODE_SYSTEM_SUPPLEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemVersionSupplement> getCodeSystemVersionSupplement() {
		if (codeSystemVersionSupplement == null) {
			codeSystemVersionSupplement = new EObjectContainmentEList<CodeSystemVersionSupplement>(CodeSystemVersionSupplement.class, this, Mif2Package.CODE_SYSTEM_SUPPLEMENT__CODE_SYSTEM_VERSION_SUPPLEMENT);
		}
		return codeSystemVersionSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupplementId() {
		return supplementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplementId(String newSupplementId) {
		String oldSupplementId = supplementId;
		supplementId = newSupplementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_SUPPLEMENT__SUPPLEMENT_ID, oldSupplementId, supplementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CODE_SYSTEM_SUPPLEMENT__CODE_SYSTEM_VERSION_SUPPLEMENT:
				return ((InternalEList<?>)getCodeSystemVersionSupplement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.CODE_SYSTEM_SUPPLEMENT__CODE_SYSTEM_VERSION_SUPPLEMENT:
				return getCodeSystemVersionSupplement();
			case Mif2Package.CODE_SYSTEM_SUPPLEMENT__SUPPLEMENT_ID:
				return getSupplementId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.CODE_SYSTEM_SUPPLEMENT__CODE_SYSTEM_VERSION_SUPPLEMENT:
				getCodeSystemVersionSupplement().clear();
				getCodeSystemVersionSupplement().addAll((Collection<? extends CodeSystemVersionSupplement>)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_SUPPLEMENT__SUPPLEMENT_ID:
				setSupplementId((String)newValue);
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
			case Mif2Package.CODE_SYSTEM_SUPPLEMENT__CODE_SYSTEM_VERSION_SUPPLEMENT:
				getCodeSystemVersionSupplement().clear();
				return;
			case Mif2Package.CODE_SYSTEM_SUPPLEMENT__SUPPLEMENT_ID:
				setSupplementId(SUPPLEMENT_ID_EDEFAULT);
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
			case Mif2Package.CODE_SYSTEM_SUPPLEMENT__CODE_SYSTEM_VERSION_SUPPLEMENT:
				return codeSystemVersionSupplement != null && !codeSystemVersionSupplement.isEmpty();
			case Mif2Package.CODE_SYSTEM_SUPPLEMENT__SUPPLEMENT_ID:
				return SUPPLEMENT_ID_EDEFAULT == null ? supplementId != null : !SUPPLEMENT_ID_EDEFAULT.equals(supplementId);
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
		result.append(" (supplementId: ");
		result.append(supplementId);
		result.append(')');
		return result.toString();
	}

} //CodeSystemSupplementImpl
