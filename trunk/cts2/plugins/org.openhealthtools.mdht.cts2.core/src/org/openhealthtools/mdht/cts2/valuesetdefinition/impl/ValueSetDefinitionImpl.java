/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.ValueSetReference;
import org.openhealthtools.mdht.cts2.core.VersionTagReference;
import org.openhealthtools.mdht.cts2.core.impl.ResourceVersionDescriptionImpl;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinition;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionEntry;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionImpl#getDefinedValueSet <em>Defined Value Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionImpl#getVersionTag <em>Version Tag</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionImpl#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ValueSetDefinitionImpl extends ResourceVersionDescriptionImpl implements ValueSetDefinition {
	/**
	 * The cached value of the '{@link #getDefinedValueSet() <em>Defined Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDefinedValueSet()
	 * @generated
	 * @ordered
	 */
	protected ValueSetReference definedValueSet;

	/**
	 * The cached value of the '{@link #getVersionTag() <em>Version Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getVersionTag()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionTagReference> versionTag;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetDefinitionEntry> entry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetDefinitionImpl() {
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
		return ValueSetDefinitionPackage.Literals.VALUE_SET_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetReference getDefinedValueSet() {
		return definedValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDefinedValueSet(ValueSetReference newDefinedValueSet, NotificationChain msgs) {
		ValueSetReference oldDefinedValueSet = definedValueSet;
		definedValueSet = newDefinedValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION__DEFINED_VALUE_SET,
				oldDefinedValueSet, newDefinedValueSet);
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
	public void setDefinedValueSet(ValueSetReference newDefinedValueSet) {
		if (newDefinedValueSet != definedValueSet) {
			NotificationChain msgs = null;
			if (definedValueSet != null) {
				msgs = ((InternalEObject) definedValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION__DEFINED_VALUE_SET, null, msgs);
			}
			if (newDefinedValueSet != null) {
				msgs = ((InternalEObject) newDefinedValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.VALUE_SET_DEFINITION__DEFINED_VALUE_SET, null, msgs);
			}
			msgs = basicSetDefinedValueSet(newDefinedValueSet, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.VALUE_SET_DEFINITION__DEFINED_VALUE_SET,
				newDefinedValueSet, newDefinedValueSet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<VersionTagReference> getVersionTag() {
		if (versionTag == null) {
			versionTag = new EObjectContainmentEList<VersionTagReference>(
				VersionTagReference.class, this, ValueSetDefinitionPackage.VALUE_SET_DEFINITION__VERSION_TAG);
		}
		return versionTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ValueSetDefinitionEntry> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<ValueSetDefinitionEntry>(
				ValueSetDefinitionEntry.class, this, ValueSetDefinitionPackage.VALUE_SET_DEFINITION__ENTRY);
		}
		return entry;
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__DEFINED_VALUE_SET:
				return basicSetDefinedValueSet(null, msgs);
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__VERSION_TAG:
				return ((InternalEList<?>) getVersionTag()).basicRemove(otherEnd, msgs);
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__ENTRY:
				return ((InternalEList<?>) getEntry()).basicRemove(otherEnd, msgs);
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__DEFINED_VALUE_SET:
				return getDefinedValueSet();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__VERSION_TAG:
				return getVersionTag();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__ENTRY:
				return getEntry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__DEFINED_VALUE_SET:
				setDefinedValueSet((ValueSetReference) newValue);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__VERSION_TAG:
				getVersionTag().clear();
				getVersionTag().addAll((Collection<? extends VersionTagReference>) newValue);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends ValueSetDefinitionEntry>) newValue);
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__DEFINED_VALUE_SET:
				setDefinedValueSet((ValueSetReference) null);
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__VERSION_TAG:
				getVersionTag().clear();
				return;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__ENTRY:
				getEntry().clear();
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
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__DEFINED_VALUE_SET:
				return definedValueSet != null;
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__VERSION_TAG:
				return versionTag != null && !versionTag.isEmpty();
			case ValueSetDefinitionPackage.VALUE_SET_DEFINITION__ENTRY:
				return entry != null && !entry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ValueSetDefinitionImpl
