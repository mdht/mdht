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
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.ValueSetReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.CompleteValueSetReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Value Set Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteValueSetReferenceImpl#getValueSet <em>Value Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteValueSetReferenceImpl#getValueSetDefinition <em>Value Set Definition</em>}
 * </li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.CompleteValueSetReferenceImpl#getReferenceCodeSystemVersion <em>Reference Code
 * System Version</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CompleteValueSetReferenceImpl extends EObjectImpl implements CompleteValueSetReference {
	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected ValueSetReference valueSet;

	/**
	 * The cached value of the '{@link #getValueSetDefinition() <em>Value Set Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSetDefinition()
	 * @generated
	 * @ordered
	 */
	protected ValueSetReference valueSetDefinition;

	/**
	 * The cached value of the '{@link #getReferenceCodeSystemVersion() <em>Reference Code System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReferenceCodeSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionReference referenceCodeSystemVersion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CompleteValueSetReferenceImpl() {
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
		return ValueSetDefinitionPackage.Literals.COMPLETE_VALUE_SET_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetReference getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSet(ValueSetReference newValueSet, NotificationChain msgs) {
		ValueSetReference oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET, oldValueSet,
				newValueSet);
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
	public void setValueSet(ValueSetReference newValueSet) {
		if (newValueSet != valueSet) {
			NotificationChain msgs = null;
			if (valueSet != null) {
				msgs = ((InternalEObject) valueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET, null, msgs);
			}
			if (newValueSet != null) {
				msgs = ((InternalEObject) newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET, null, msgs);
			}
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET, newValueSet,
				newValueSet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetReference getValueSetDefinition() {
		return valueSetDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetDefinition(ValueSetReference newValueSetDefinition, NotificationChain msgs) {
		ValueSetReference oldValueSetDefinition = valueSetDefinition;
		valueSetDefinition = newValueSetDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET_DEFINITION,
				oldValueSetDefinition, newValueSetDefinition);
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
	public void setValueSetDefinition(ValueSetReference newValueSetDefinition) {
		if (newValueSetDefinition != valueSetDefinition) {
			NotificationChain msgs = null;
			if (valueSetDefinition != null) {
				msgs = ((InternalEObject) valueSetDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET_DEFINITION, null, msgs);
			}
			if (newValueSetDefinition != null) {
				msgs = ((InternalEObject) newValueSetDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET_DEFINITION, null, msgs);
			}
			msgs = basicSetValueSetDefinition(newValueSetDefinition, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET_DEFINITION,
				newValueSetDefinition, newValueSetDefinition));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionReference getReferenceCodeSystemVersion() {
		return referenceCodeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetReferenceCodeSystemVersion(
			CodeSystemVersionReference newReferenceCodeSystemVersion, NotificationChain msgs) {
		CodeSystemVersionReference oldReferenceCodeSystemVersion = referenceCodeSystemVersion;
		referenceCodeSystemVersion = newReferenceCodeSystemVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET,
				ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__REFERENCE_CODE_SYSTEM_VERSION,
				oldReferenceCodeSystemVersion, newReferenceCodeSystemVersion);
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
	public void setReferenceCodeSystemVersion(CodeSystemVersionReference newReferenceCodeSystemVersion) {
		if (newReferenceCodeSystemVersion != referenceCodeSystemVersion) {
			NotificationChain msgs = null;
			if (referenceCodeSystemVersion != null) {
				msgs = ((InternalEObject) referenceCodeSystemVersion).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE -
							ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__REFERENCE_CODE_SYSTEM_VERSION,
					null, msgs);
			}
			if (newReferenceCodeSystemVersion != null) {
				msgs = ((InternalEObject) newReferenceCodeSystemVersion).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE -
							ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__REFERENCE_CODE_SYSTEM_VERSION,
					null, msgs);
			}
			msgs = basicSetReferenceCodeSystemVersion(newReferenceCodeSystemVersion, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET,
				ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__REFERENCE_CODE_SYSTEM_VERSION,
				newReferenceCodeSystemVersion, newReferenceCodeSystemVersion));
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
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET_DEFINITION:
				return basicSetValueSetDefinition(null, msgs);
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__REFERENCE_CODE_SYSTEM_VERSION:
				return basicSetReferenceCodeSystemVersion(null, msgs);
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
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET:
				return getValueSet();
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET_DEFINITION:
				return getValueSetDefinition();
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__REFERENCE_CODE_SYSTEM_VERSION:
				return getReferenceCodeSystemVersion();
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
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET:
				setValueSet((ValueSetReference) newValue);
				return;
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET_DEFINITION:
				setValueSetDefinition((ValueSetReference) newValue);
				return;
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__REFERENCE_CODE_SYSTEM_VERSION:
				setReferenceCodeSystemVersion((CodeSystemVersionReference) newValue);
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
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET:
				setValueSet((ValueSetReference) null);
				return;
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET_DEFINITION:
				setValueSetDefinition((ValueSetReference) null);
				return;
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__REFERENCE_CODE_SYSTEM_VERSION:
				setReferenceCodeSystemVersion((CodeSystemVersionReference) null);
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
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET:
				return valueSet != null;
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__VALUE_SET_DEFINITION:
				return valueSetDefinition != null;
			case ValueSetDefinitionPackage.COMPLETE_VALUE_SET_REFERENCE__REFERENCE_CODE_SYSTEM_VERSION:
				return referenceCodeSystemVersion != null;
		}
		return super.eIsSet(featureID);
	}

} // CompleteValueSetReferenceImpl
