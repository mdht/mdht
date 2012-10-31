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
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.NameAndMeaningReference;
import org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference;
import org.openhealthtools.mdht.cts2.core.ValueSetReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ValueSetDefinitionReferenceImpl#getValueSetDefinition <em>Value Set Definition</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ValueSetDefinitionReferenceImpl#getValueSet <em>Value Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ValueSetDefinitionReferenceImpl extends EObjectImpl implements ValueSetDefinitionReference {
	/**
	 * The cached value of the '{@link #getValueSetDefinition() <em>Value Set Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSetDefinition()
	 * @generated
	 * @ordered
	 */
	protected NameAndMeaningReference valueSetDefinition;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionReferenceImpl() {
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
		return CorePackage.Literals.VALUE_SET_DEFINITION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NameAndMeaningReference getValueSetDefinition() {
		return valueSetDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetDefinition(NameAndMeaningReference newValueSetDefinition,
			NotificationChain msgs) {
		NameAndMeaningReference oldValueSetDefinition = valueSetDefinition;
		valueSetDefinition = newValueSetDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET_DEFINITION,
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
	public void setValueSetDefinition(NameAndMeaningReference newValueSetDefinition) {
		if (newValueSetDefinition != valueSetDefinition) {
			NotificationChain msgs = null;
			if (valueSetDefinition != null) {
				msgs = ((InternalEObject) valueSetDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET_DEFINITION, null, msgs);
			}
			if (newValueSetDefinition != null) {
				msgs = ((InternalEObject) newValueSetDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET_DEFINITION, null, msgs);
			}
			msgs = basicSetValueSetDefinition(newValueSetDefinition, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET_DEFINITION,
				newValueSetDefinition, newValueSetDefinition));
		}
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
				this, Notification.SET, CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET, oldValueSet, newValueSet);
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
						CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET, null, msgs);
			}
			if (newValueSet != null) {
				msgs = ((InternalEObject) newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET, null, msgs);
			}
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET, newValueSet, newValueSet));
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
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET_DEFINITION:
				return basicSetValueSetDefinition(null, msgs);
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET:
				return basicSetValueSet(null, msgs);
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
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET_DEFINITION:
				return getValueSetDefinition();
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET:
				return getValueSet();
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
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET_DEFINITION:
				setValueSetDefinition((NameAndMeaningReference) newValue);
				return;
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET:
				setValueSet((ValueSetReference) newValue);
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
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET_DEFINITION:
				setValueSetDefinition((NameAndMeaningReference) null);
				return;
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET:
				setValueSet((ValueSetReference) null);
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
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET_DEFINITION:
				return valueSetDefinition != null;
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE__VALUE_SET:
				return valueSet != null;
		}
		return super.eIsSet(featureID);
	}

} // ValueSetDefinitionReferenceImpl
