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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolved Value Set Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetHeaderImpl#getResolutionOf <em>Resolution Of</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetHeaderImpl#getResolvedUsingCodeSystem <em>Resolved Using Code
 * System</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetHeaderImpl#getIncludesResolvedValueSet <em>Includes Resolved Value
 * Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ResolvedValueSetHeaderImpl extends EObjectImpl implements ResolvedValueSetHeader {
	/**
	 * The cached value of the '{@link #getResolutionOf() <em>Resolution Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResolutionOf()
	 * @generated
	 * @ordered
	 */
	protected ValueSetDefinitionReference resolutionOf;

	/**
	 * The cached value of the '{@link #getResolvedUsingCodeSystem() <em>Resolved Using Code System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResolvedUsingCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemVersionReference> resolvedUsingCodeSystem;

	/**
	 * The cached value of the '{@link #getIncludesResolvedValueSet() <em>Includes Resolved Value Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getIncludesResolvedValueSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ResolvedValueSetHeader> includesResolvedValueSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResolvedValueSetHeaderImpl() {
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
		return ValueSetDefinitionPackage.Literals.RESOLVED_VALUE_SET_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionReference getResolutionOf() {
		return resolutionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResolutionOf(ValueSetDefinitionReference newResolutionOf, NotificationChain msgs) {
		ValueSetDefinitionReference oldResolutionOf = resolutionOf;
		resolutionOf = newResolutionOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLUTION_OF,
				oldResolutionOf, newResolutionOf);
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
	public void setResolutionOf(ValueSetDefinitionReference newResolutionOf) {
		if (newResolutionOf != resolutionOf) {
			NotificationChain msgs = null;
			if (resolutionOf != null) {
				msgs = ((InternalEObject) resolutionOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLUTION_OF, null, msgs);
			}
			if (newResolutionOf != null) {
				msgs = ((InternalEObject) newResolutionOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLUTION_OF, null, msgs);
			}
			msgs = basicSetResolutionOf(newResolutionOf, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLUTION_OF,
				newResolutionOf, newResolutionOf));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CodeSystemVersionReference> getResolvedUsingCodeSystem() {
		if (resolvedUsingCodeSystem == null) {
			resolvedUsingCodeSystem = new EObjectContainmentEList<CodeSystemVersionReference>(
				CodeSystemVersionReference.class, this,
				ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLVED_USING_CODE_SYSTEM);
		}
		return resolvedUsingCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ResolvedValueSetHeader> getIncludesResolvedValueSet() {
		if (includesResolvedValueSet == null) {
			includesResolvedValueSet = new EObjectContainmentEList<ResolvedValueSetHeader>(
				ResolvedValueSetHeader.class, this,
				ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__INCLUDES_RESOLVED_VALUE_SET);
		}
		return includesResolvedValueSet;
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLUTION_OF:
				return basicSetResolutionOf(null, msgs);
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLVED_USING_CODE_SYSTEM:
				return ((InternalEList<?>) getResolvedUsingCodeSystem()).basicRemove(otherEnd, msgs);
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__INCLUDES_RESOLVED_VALUE_SET:
				return ((InternalEList<?>) getIncludesResolvedValueSet()).basicRemove(otherEnd, msgs);
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLUTION_OF:
				return getResolutionOf();
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLVED_USING_CODE_SYSTEM:
				return getResolvedUsingCodeSystem();
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__INCLUDES_RESOLVED_VALUE_SET:
				return getIncludesResolvedValueSet();
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLUTION_OF:
				setResolutionOf((ValueSetDefinitionReference) newValue);
				return;
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLVED_USING_CODE_SYSTEM:
				getResolvedUsingCodeSystem().clear();
				getResolvedUsingCodeSystem().addAll((Collection<? extends CodeSystemVersionReference>) newValue);
				return;
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__INCLUDES_RESOLVED_VALUE_SET:
				getIncludesResolvedValueSet().clear();
				getIncludesResolvedValueSet().addAll((Collection<? extends ResolvedValueSetHeader>) newValue);
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLUTION_OF:
				setResolutionOf((ValueSetDefinitionReference) null);
				return;
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLVED_USING_CODE_SYSTEM:
				getResolvedUsingCodeSystem().clear();
				return;
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__INCLUDES_RESOLVED_VALUE_SET:
				getIncludesResolvedValueSet().clear();
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLUTION_OF:
				return resolutionOf != null;
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__RESOLVED_USING_CODE_SYSTEM:
				return resolvedUsingCodeSystem != null && !resolvedUsingCodeSystem.isEmpty();
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_HEADER__INCLUDES_RESOLVED_VALUE_SET:
				return includesResolvedValueSet != null && !includesResolvedValueSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ResolvedValueSetHeaderImpl
