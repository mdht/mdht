/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CompositionAttestationMode;
import org.hl7.fhir.CompositionAttester;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Attester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CompositionAttesterImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionAttesterImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CompositionAttesterImpl#getParty <em>Party</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionAttesterImpl extends BackboneElementImpl implements CompositionAttester {
	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionAttestationMode> mode;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime time;

	/**
	 * The cached value of the '{@link #getParty() <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected Reference party;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionAttesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCompositionAttester();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionAttestationMode> getMode() {
		if (mode == null) {
			mode = new EObjectContainmentEList<CompositionAttestationMode>(CompositionAttestationMode.class, this, FhirPackage.COMPOSITION_ATTESTER__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(DateTime newTime, NotificationChain msgs) {
		DateTime oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION_ATTESTER__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(DateTime newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION_ATTESTER__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION_ATTESTER__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION_ATTESTER__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getParty() {
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParty(Reference newParty, NotificationChain msgs) {
		Reference oldParty = party;
		party = newParty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION_ATTESTER__PARTY, oldParty, newParty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParty(Reference newParty) {
		if (newParty != party) {
			NotificationChain msgs = null;
			if (party != null)
				msgs = ((InternalEObject)party).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION_ATTESTER__PARTY, null, msgs);
			if (newParty != null)
				msgs = ((InternalEObject)newParty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMPOSITION_ATTESTER__PARTY, null, msgs);
			msgs = basicSetParty(newParty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMPOSITION_ATTESTER__PARTY, newParty, newParty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COMPOSITION_ATTESTER__MODE:
				return ((InternalEList<?>)getMode()).basicRemove(otherEnd, msgs);
			case FhirPackage.COMPOSITION_ATTESTER__TIME:
				return basicSetTime(null, msgs);
			case FhirPackage.COMPOSITION_ATTESTER__PARTY:
				return basicSetParty(null, msgs);
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
			case FhirPackage.COMPOSITION_ATTESTER__MODE:
				return getMode();
			case FhirPackage.COMPOSITION_ATTESTER__TIME:
				return getTime();
			case FhirPackage.COMPOSITION_ATTESTER__PARTY:
				return getParty();
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
			case FhirPackage.COMPOSITION_ATTESTER__MODE:
				getMode().clear();
				getMode().addAll((Collection<? extends CompositionAttestationMode>)newValue);
				return;
			case FhirPackage.COMPOSITION_ATTESTER__TIME:
				setTime((DateTime)newValue);
				return;
			case FhirPackage.COMPOSITION_ATTESTER__PARTY:
				setParty((Reference)newValue);
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
			case FhirPackage.COMPOSITION_ATTESTER__MODE:
				getMode().clear();
				return;
			case FhirPackage.COMPOSITION_ATTESTER__TIME:
				setTime((DateTime)null);
				return;
			case FhirPackage.COMPOSITION_ATTESTER__PARTY:
				setParty((Reference)null);
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
			case FhirPackage.COMPOSITION_ATTESTER__MODE:
				return mode != null && !mode.isEmpty();
			case FhirPackage.COMPOSITION_ATTESTER__TIME:
				return time != null;
			case FhirPackage.COMPOSITION_ATTESTER__PARTY:
				return party != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositionAttesterImpl
