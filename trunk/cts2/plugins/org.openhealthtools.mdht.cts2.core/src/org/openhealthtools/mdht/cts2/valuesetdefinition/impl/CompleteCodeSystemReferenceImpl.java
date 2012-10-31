/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteCodeSystemReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Code System Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteCodeSystemReferenceImpl#getCodeSystem <em>Code System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteCodeSystemReferenceImpl#getCodeSystemVersion <em>Code System Version</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CompleteCodeSystemReferenceImpl extends EObjectImpl implements CompleteCodeSystemReference {
	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemReference codeSystem;

	/**
	 * The cached value of the '{@link #getCodeSystemVersion() <em>Code System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionReference codeSystemVersion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompleteCodeSystemReferenceImpl() {
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
		return ValueSetDefinitionPackage.Literals.COMPLETE_CODE_SYSTEM_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemReference getCodeSystem() {
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystem(CodeSystemReference newCodeSystem, NotificationChain msgs) {
		CodeSystemReference oldCodeSystem = codeSystem;
		codeSystem = newCodeSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM,
				oldCodeSystem, newCodeSystem);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystem(CodeSystemReference newCodeSystem) {
		if (newCodeSystem != codeSystem) {
			NotificationChain msgs = null;
			if (codeSystem != null) {
				msgs = ((InternalEObject) codeSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM, null, msgs);
			}
			if (newCodeSystem != null) {
				msgs = ((InternalEObject) newCodeSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM, null, msgs);
			}
			msgs = basicSetCodeSystem(newCodeSystem, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM,
				newCodeSystem, newCodeSystem));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionReference getCodeSystemVersion() {
		return codeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemVersion(CodeSystemVersionReference newCodeSystemVersion,
			NotificationChain msgs) {
		CodeSystemVersionReference oldCodeSystemVersion = codeSystemVersion;
		codeSystemVersion = newCodeSystemVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM_VERSION,
				oldCodeSystemVersion, newCodeSystemVersion);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCodeSystemVersion(CodeSystemVersionReference newCodeSystemVersion) {
		if (newCodeSystemVersion != codeSystemVersion) {
			NotificationChain msgs = null;
			if (codeSystemVersion != null) {
				msgs = ((InternalEObject) codeSystemVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM_VERSION, null, msgs);
			}
			if (newCodeSystemVersion != null) {
				msgs = ((InternalEObject) newCodeSystemVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM_VERSION, null, msgs);
			}
			msgs = basicSetCodeSystemVersion(newCodeSystemVersion, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM_VERSION,
				newCodeSystemVersion, newCodeSystemVersion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM:
				return basicSetCodeSystem(null, msgs);
			case ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM_VERSION:
				return basicSetCodeSystemVersion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM:
				return getCodeSystem();
			case ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM_VERSION:
				return getCodeSystemVersion();
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
			case ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM:
				setCodeSystem((CodeSystemReference) newValue);
				return;
			case ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM_VERSION:
				setCodeSystemVersion((CodeSystemVersionReference) newValue);
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
			case ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM:
				setCodeSystem((CodeSystemReference) null);
				return;
			case ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM_VERSION:
				setCodeSystemVersion((CodeSystemVersionReference) null);
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
			case ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM:
				return codeSystem != null;
			case ValueSetDefinitionPackage.COMPLETE_CODE_SYSTEM_REFERENCE__CODE_SYSTEM_VERSION:
				return codeSystemVersion != null;
		}
		return super.eIsSet(featureID);
	}

} // CompleteCodeSystemReferenceImpl
