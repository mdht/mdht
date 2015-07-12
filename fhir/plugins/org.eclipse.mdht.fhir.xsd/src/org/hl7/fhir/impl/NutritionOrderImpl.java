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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.NutritionOrder;
import org.hl7.fhir.NutritionOrderEnteralFormula;
import org.hl7.fhir.NutritionOrderOralDiet;
import org.hl7.fhir.NutritionOrderStatus;
import org.hl7.fhir.NutritionOrderSupplement;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getFoodPreferenceModifier <em>Food Preference Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getExcludeFoodModifier <em>Exclude Food Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getOralDiet <em>Oral Diet</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getSupplement <em>Supplement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderImpl#getEnteralFormula <em>Enteral Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderImpl extends DomainResourceImpl implements NutritionOrder {
	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * The cached value of the '{@link #getOrderer() <em>Orderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderer()
	 * @generated
	 * @ordered
	 */
	protected Reference orderer;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Reference encounter;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime dateTime;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrderStatus status;

	/**
	 * The cached value of the '{@link #getAllergyIntolerance() <em>Allergy Intolerance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyIntolerance()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> allergyIntolerance;

	/**
	 * The cached value of the '{@link #getFoodPreferenceModifier() <em>Food Preference Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodPreferenceModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> foodPreferenceModifier;

	/**
	 * The cached value of the '{@link #getExcludeFoodModifier() <em>Exclude Food Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeFoodModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> excludeFoodModifier;

	/**
	 * The cached value of the '{@link #getOralDiet() <em>Oral Diet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOralDiet()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrderOralDiet oralDiet;

	/**
	 * The cached value of the '{@link #getSupplement() <em>Supplement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplement()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderSupplement> supplement;

	/**
	 * The cached value of the '{@link #getEnteralFormula() <em>Enteral Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnteralFormula()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrderEnteralFormula enteralFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionOrder();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrderer() {
		return orderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderer(Reference newOrderer, NotificationChain msgs) {
		Reference oldOrderer = orderer;
		orderer = newOrderer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ORDERER, oldOrderer, newOrderer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderer(Reference newOrderer) {
		if (newOrderer != orderer) {
			NotificationChain msgs = null;
			if (orderer != null)
				msgs = ((InternalEObject)orderer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ORDERER, null, msgs);
			if (newOrderer != null)
				msgs = ((InternalEObject)newOrderer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ORDERER, null, msgs);
			msgs = basicSetOrderer(newOrderer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ORDERER, newOrderer, newOrderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.NUTRITION_ORDER__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Reference newEncounter, NotificationChain msgs) {
		Reference oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Reference newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(DateTime newDateTime, NotificationChain msgs) {
		DateTime oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__DATE_TIME, oldDateTime, newDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(DateTime newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__DATE_TIME, newDateTime, newDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(NutritionOrderStatus newStatus, NotificationChain msgs) {
		NutritionOrderStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(NutritionOrderStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAllergyIntolerance() {
		if (allergyIntolerance == null) {
			allergyIntolerance = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE);
		}
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getFoodPreferenceModifier() {
		if (foodPreferenceModifier == null) {
			foodPreferenceModifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER);
		}
		return foodPreferenceModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getExcludeFoodModifier() {
		if (excludeFoodModifier == null) {
			excludeFoodModifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER);
		}
		return excludeFoodModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderOralDiet getOralDiet() {
		return oralDiet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOralDiet(NutritionOrderOralDiet newOralDiet, NotificationChain msgs) {
		NutritionOrderOralDiet oldOralDiet = oralDiet;
		oralDiet = newOralDiet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ORAL_DIET, oldOralDiet, newOralDiet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOralDiet(NutritionOrderOralDiet newOralDiet) {
		if (newOralDiet != oralDiet) {
			NotificationChain msgs = null;
			if (oralDiet != null)
				msgs = ((InternalEObject)oralDiet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ORAL_DIET, null, msgs);
			if (newOralDiet != null)
				msgs = ((InternalEObject)newOralDiet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ORAL_DIET, null, msgs);
			msgs = basicSetOralDiet(newOralDiet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ORAL_DIET, newOralDiet, newOralDiet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NutritionOrderSupplement> getSupplement() {
		if (supplement == null) {
			supplement = new EObjectContainmentEList<NutritionOrderSupplement>(NutritionOrderSupplement.class, this, FhirPackage.NUTRITION_ORDER__SUPPLEMENT);
		}
		return supplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrderEnteralFormula getEnteralFormula() {
		return enteralFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnteralFormula(NutritionOrderEnteralFormula newEnteralFormula, NotificationChain msgs) {
		NutritionOrderEnteralFormula oldEnteralFormula = enteralFormula;
		enteralFormula = newEnteralFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA, oldEnteralFormula, newEnteralFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnteralFormula(NutritionOrderEnteralFormula newEnteralFormula) {
		if (newEnteralFormula != enteralFormula) {
			NotificationChain msgs = null;
			if (enteralFormula != null)
				msgs = ((InternalEObject)enteralFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA, null, msgs);
			if (newEnteralFormula != null)
				msgs = ((InternalEObject)newEnteralFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA, null, msgs);
			msgs = basicSetEnteralFormula(newEnteralFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA, newEnteralFormula, newEnteralFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.NUTRITION_ORDER__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.NUTRITION_ORDER__ORDERER:
				return basicSetOrderer(null, msgs);
			case FhirPackage.NUTRITION_ORDER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.NUTRITION_ORDER__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case FhirPackage.NUTRITION_ORDER__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				return ((InternalEList<?>)getAllergyIntolerance()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				return ((InternalEList<?>)getFoodPreferenceModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				return ((InternalEList<?>)getExcludeFoodModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__ORAL_DIET:
				return basicSetOralDiet(null, msgs);
			case FhirPackage.NUTRITION_ORDER__SUPPLEMENT:
				return ((InternalEList<?>)getSupplement()).basicRemove(otherEnd, msgs);
			case FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				return basicSetEnteralFormula(null, msgs);
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
			case FhirPackage.NUTRITION_ORDER__PATIENT:
				return getPatient();
			case FhirPackage.NUTRITION_ORDER__ORDERER:
				return getOrderer();
			case FhirPackage.NUTRITION_ORDER__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.NUTRITION_ORDER__ENCOUNTER:
				return getEncounter();
			case FhirPackage.NUTRITION_ORDER__DATE_TIME:
				return getDateTime();
			case FhirPackage.NUTRITION_ORDER__STATUS:
				return getStatus();
			case FhirPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				return getAllergyIntolerance();
			case FhirPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				return getFoodPreferenceModifier();
			case FhirPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				return getExcludeFoodModifier();
			case FhirPackage.NUTRITION_ORDER__ORAL_DIET:
				return getOralDiet();
			case FhirPackage.NUTRITION_ORDER__SUPPLEMENT:
				return getSupplement();
			case FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				return getEnteralFormula();
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
			case FhirPackage.NUTRITION_ORDER__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__ORDERER:
				setOrderer((Reference)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__DATE_TIME:
				setDateTime((DateTime)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__STATUS:
				setStatus((NutritionOrderStatus)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				getAllergyIntolerance().clear();
				getAllergyIntolerance().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				getFoodPreferenceModifier().clear();
				getFoodPreferenceModifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				getExcludeFoodModifier().clear();
				getExcludeFoodModifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__ORAL_DIET:
				setOralDiet((NutritionOrderOralDiet)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__SUPPLEMENT:
				getSupplement().clear();
				getSupplement().addAll((Collection<? extends NutritionOrderSupplement>)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				setEnteralFormula((NutritionOrderEnteralFormula)newValue);
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
			case FhirPackage.NUTRITION_ORDER__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.NUTRITION_ORDER__ORDERER:
				setOrderer((Reference)null);
				return;
			case FhirPackage.NUTRITION_ORDER__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.NUTRITION_ORDER__DATE_TIME:
				setDateTime((DateTime)null);
				return;
			case FhirPackage.NUTRITION_ORDER__STATUS:
				setStatus((NutritionOrderStatus)null);
				return;
			case FhirPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				getAllergyIntolerance().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				getFoodPreferenceModifier().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				getExcludeFoodModifier().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__ORAL_DIET:
				setOralDiet((NutritionOrderOralDiet)null);
				return;
			case FhirPackage.NUTRITION_ORDER__SUPPLEMENT:
				getSupplement().clear();
				return;
			case FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				setEnteralFormula((NutritionOrderEnteralFormula)null);
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
			case FhirPackage.NUTRITION_ORDER__PATIENT:
				return patient != null;
			case FhirPackage.NUTRITION_ORDER__ORDERER:
				return orderer != null;
			case FhirPackage.NUTRITION_ORDER__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.NUTRITION_ORDER__ENCOUNTER:
				return encounter != null;
			case FhirPackage.NUTRITION_ORDER__DATE_TIME:
				return dateTime != null;
			case FhirPackage.NUTRITION_ORDER__STATUS:
				return status != null;
			case FhirPackage.NUTRITION_ORDER__ALLERGY_INTOLERANCE:
				return allergyIntolerance != null && !allergyIntolerance.isEmpty();
			case FhirPackage.NUTRITION_ORDER__FOOD_PREFERENCE_MODIFIER:
				return foodPreferenceModifier != null && !foodPreferenceModifier.isEmpty();
			case FhirPackage.NUTRITION_ORDER__EXCLUDE_FOOD_MODIFIER:
				return excludeFoodModifier != null && !excludeFoodModifier.isEmpty();
			case FhirPackage.NUTRITION_ORDER__ORAL_DIET:
				return oralDiet != null;
			case FhirPackage.NUTRITION_ORDER__SUPPLEMENT:
				return supplement != null && !supplement.isEmpty();
			case FhirPackage.NUTRITION_ORDER__ENTERAL_FORMULA:
				return enteralFormula != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderImpl
