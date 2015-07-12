/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.IdentityAssuranceLevel;
import org.hl7.fhir.PersonLink;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PersonLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PersonLinkImpl#getAssurance <em>Assurance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonLinkImpl extends BackboneElementImpl implements PersonLink {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Reference target;

	/**
	 * The cached value of the '{@link #getAssurance() <em>Assurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssurance()
	 * @generated
	 * @ordered
	 */
	protected IdentityAssuranceLevel assurance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPersonLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Reference newTarget, NotificationChain msgs) {
		Reference oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PERSON_LINK__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Reference newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERSON_LINK__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERSON_LINK__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PERSON_LINK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityAssuranceLevel getAssurance() {
		return assurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssurance(IdentityAssuranceLevel newAssurance, NotificationChain msgs) {
		IdentityAssuranceLevel oldAssurance = assurance;
		assurance = newAssurance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PERSON_LINK__ASSURANCE, oldAssurance, newAssurance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssurance(IdentityAssuranceLevel newAssurance) {
		if (newAssurance != assurance) {
			NotificationChain msgs = null;
			if (assurance != null)
				msgs = ((InternalEObject)assurance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERSON_LINK__ASSURANCE, null, msgs);
			if (newAssurance != null)
				msgs = ((InternalEObject)newAssurance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PERSON_LINK__ASSURANCE, null, msgs);
			msgs = basicSetAssurance(newAssurance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PERSON_LINK__ASSURANCE, newAssurance, newAssurance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PERSON_LINK__TARGET:
				return basicSetTarget(null, msgs);
			case FhirPackage.PERSON_LINK__ASSURANCE:
				return basicSetAssurance(null, msgs);
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
			case FhirPackage.PERSON_LINK__TARGET:
				return getTarget();
			case FhirPackage.PERSON_LINK__ASSURANCE:
				return getAssurance();
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
			case FhirPackage.PERSON_LINK__TARGET:
				setTarget((Reference)newValue);
				return;
			case FhirPackage.PERSON_LINK__ASSURANCE:
				setAssurance((IdentityAssuranceLevel)newValue);
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
			case FhirPackage.PERSON_LINK__TARGET:
				setTarget((Reference)null);
				return;
			case FhirPackage.PERSON_LINK__ASSURANCE:
				setAssurance((IdentityAssuranceLevel)null);
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
			case FhirPackage.PERSON_LINK__TARGET:
				return target != null;
			case FhirPackage.PERSON_LINK__ASSURANCE:
				return assurance != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonLinkImpl
