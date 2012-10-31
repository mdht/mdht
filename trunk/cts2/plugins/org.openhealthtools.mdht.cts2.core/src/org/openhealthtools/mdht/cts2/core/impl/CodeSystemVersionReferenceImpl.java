/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.NameAndMeaningReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Version Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.CodeSystemVersionReferenceImpl#getVersion <em>Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.CodeSystemVersionReferenceImpl#getCodeSystem <em>Code System</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CodeSystemVersionReferenceImpl extends EObjectImpl implements CodeSystemVersionReference {
	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected NameAndMeaningReference version;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemVersionReferenceImpl() {
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
		return CorePackage.Literals.CODE_SYSTEM_VERSION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NameAndMeaningReference getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetVersion(NameAndMeaningReference newVersion, NotificationChain msgs) {
		NameAndMeaningReference oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.CODE_SYSTEM_VERSION_REFERENCE__VERSION, oldVersion, newVersion);
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
	public void setVersion(NameAndMeaningReference newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null) {
				msgs = ((InternalEObject) version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CODE_SYSTEM_VERSION_REFERENCE__VERSION, null, msgs);
			}
			if (newVersion != null) {
				msgs = ((InternalEObject) newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CODE_SYSTEM_VERSION_REFERENCE__VERSION, null, msgs);
			}
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CODE_SYSTEM_VERSION_REFERENCE__VERSION, newVersion, newVersion));
		}
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
				this, Notification.SET, CorePackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM, oldCodeSystem,
				newCodeSystem);
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
						CorePackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM, null, msgs);
			}
			if (newCodeSystem != null) {
				msgs = ((InternalEObject) newCodeSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM, null, msgs);
			}
			msgs = basicSetCodeSystem(newCodeSystem, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM, newCodeSystem,
				newCodeSystem));
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
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE__VERSION:
				return basicSetVersion(null, msgs);
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM:
				return basicSetCodeSystem(null, msgs);
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
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE__VERSION:
				return getVersion();
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM:
				return getCodeSystem();
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
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE__VERSION:
				setVersion((NameAndMeaningReference) newValue);
				return;
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM:
				setCodeSystem((CodeSystemReference) newValue);
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
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE__VERSION:
				setVersion((NameAndMeaningReference) null);
				return;
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM:
				setCodeSystem((CodeSystemReference) null);
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
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE__VERSION:
				return version != null;
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM:
				return codeSystem != null;
		}
		return super.eIsSet(featureID);
	}

} // CodeSystemVersionReferenceImpl
