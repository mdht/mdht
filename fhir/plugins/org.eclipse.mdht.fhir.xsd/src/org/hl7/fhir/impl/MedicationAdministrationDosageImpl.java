/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationAdministrationDosage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Ratio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Administration Dosage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationAdministrationDosageImpl#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationAdministrationDosageImpl extends BackboneElementImpl implements MedicationAdministrationDosage {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String text;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept site;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept route;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected Ratio rate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationAdministrationDosageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationAdministrationDosage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir.String newText, NotificationChain msgs) {
		org.hl7.fhir.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.hl7.fhir.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSite(CodeableConcept newSite, NotificationChain msgs) {
		CodeableConcept oldSite = site;
		site = newSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE, oldSite, newSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(CodeableConcept newSite) {
		if (newSite != site) {
			NotificationChain msgs = null;
			if (site != null)
				msgs = ((InternalEObject)site).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE, null, msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE, null, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE, newSite, newSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoute(CodeableConcept newRoute, NotificationChain msgs) {
		CodeableConcept oldRoute = route;
		route = newRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE, oldRoute, newRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(CodeableConcept newRoute) {
		if (newRoute != route) {
			NotificationChain msgs = null;
			if (route != null)
				msgs = ((InternalEObject)route).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE, null, msgs);
			if (newRoute != null)
				msgs = ((InternalEObject)newRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE, null, msgs);
			msgs = basicSetRoute(newRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE, newRoute, newRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRate(Ratio newRate, NotificationChain msgs) {
		Ratio oldRate = rate;
		rate = newRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE, oldRate, newRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(Ratio newRate) {
		if (newRate != rate) {
			NotificationChain msgs = null;
			if (rate != null)
				msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE, null, msgs);
			if (newRate != null)
				msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE, null, msgs);
			msgs = basicSetRate(newRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE, newRate, newRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE:
				return basicSetSite(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				return basicSetRoute(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE:
				return basicSetRate(null, msgs);
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
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				return getText();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE:
				return getSite();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				return getRoute();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				return getMethod();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				return getQuantity();
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE:
				return getRate();
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
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE:
				setSite((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				setRoute((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE:
				setRate((Ratio)newValue);
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
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE:
				setSite((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				setRoute((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE:
				setRate((Ratio)null);
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
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__TEXT:
				return text != null;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__SITE:
				return site != null;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__ROUTE:
				return route != null;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__METHOD:
				return method != null;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__QUANTITY:
				return quantity != null;
			case FhirPackage.MEDICATION_ADMINISTRATION_DOSAGE__RATE:
				return rate != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationAdministrationDosageImpl
