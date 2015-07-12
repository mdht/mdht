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
import org.hl7.fhir.EncounterHospitalization;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Hospitalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EncounterHospitalizationImpl#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHospitalizationImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHospitalizationImpl#getAdmitSource <em>Admit Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHospitalizationImpl#getDietPreference <em>Diet Preference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHospitalizationImpl#getSpecialCourtesy <em>Special Courtesy</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHospitalizationImpl#getSpecialArrangement <em>Special Arrangement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHospitalizationImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHospitalizationImpl#getDischargeDisposition <em>Discharge Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHospitalizationImpl#getDischargeDiagnosis <em>Discharge Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EncounterHospitalizationImpl#getReAdmission <em>Re Admission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncounterHospitalizationImpl extends BackboneElementImpl implements EncounterHospitalization {
	/**
	 * The cached value of the '{@link #getPreAdmissionIdentifier() <em>Pre Admission Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAdmissionIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier preAdmissionIdentifier;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Reference origin;

	/**
	 * The cached value of the '{@link #getAdmitSource() <em>Admit Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmitSource()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept admitSource;

	/**
	 * The cached value of the '{@link #getDietPreference() <em>Diet Preference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDietPreference()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept dietPreference;

	/**
	 * The cached value of the '{@link #getSpecialCourtesy() <em>Special Courtesy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialCourtesy()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialCourtesy;

	/**
	 * The cached value of the '{@link #getSpecialArrangement() <em>Special Arrangement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialArrangement()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> specialArrangement;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Reference destination;

	/**
	 * The cached value of the '{@link #getDischargeDisposition() <em>Discharge Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDisposition()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept dischargeDisposition;

	/**
	 * The cached value of the '{@link #getDischargeDiagnosis() <em>Discharge Diagnosis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected Reference dischargeDiagnosis;

	/**
	 * The cached value of the '{@link #getReAdmission() <em>Re Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReAdmission()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean reAdmission;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterHospitalizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEncounterHospitalization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPreAdmissionIdentifier() {
		return preAdmissionIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreAdmissionIdentifier(Identifier newPreAdmissionIdentifier, NotificationChain msgs) {
		Identifier oldPreAdmissionIdentifier = preAdmissionIdentifier;
		preAdmissionIdentifier = newPreAdmissionIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER, oldPreAdmissionIdentifier, newPreAdmissionIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreAdmissionIdentifier(Identifier newPreAdmissionIdentifier) {
		if (newPreAdmissionIdentifier != preAdmissionIdentifier) {
			NotificationChain msgs = null;
			if (preAdmissionIdentifier != null)
				msgs = ((InternalEObject)preAdmissionIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER, null, msgs);
			if (newPreAdmissionIdentifier != null)
				msgs = ((InternalEObject)newPreAdmissionIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER, null, msgs);
			msgs = basicSetPreAdmissionIdentifier(newPreAdmissionIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER, newPreAdmissionIdentifier, newPreAdmissionIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigin(Reference newOrigin, NotificationChain msgs) {
		Reference oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__ORIGIN, oldOrigin, newOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Reference newOrigin) {
		if (newOrigin != origin) {
			NotificationChain msgs = null;
			if (origin != null)
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__ORIGIN, newOrigin, newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAdmitSource() {
		return admitSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmitSource(CodeableConcept newAdmitSource, NotificationChain msgs) {
		CodeableConcept oldAdmitSource = admitSource;
		admitSource = newAdmitSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE, oldAdmitSource, newAdmitSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmitSource(CodeableConcept newAdmitSource) {
		if (newAdmitSource != admitSource) {
			NotificationChain msgs = null;
			if (admitSource != null)
				msgs = ((InternalEObject)admitSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE, null, msgs);
			if (newAdmitSource != null)
				msgs = ((InternalEObject)newAdmitSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE, null, msgs);
			msgs = basicSetAdmitSource(newAdmitSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE, newAdmitSource, newAdmitSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDietPreference() {
		return dietPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDietPreference(CodeableConcept newDietPreference, NotificationChain msgs) {
		CodeableConcept oldDietPreference = dietPreference;
		dietPreference = newDietPreference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE, oldDietPreference, newDietPreference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDietPreference(CodeableConcept newDietPreference) {
		if (newDietPreference != dietPreference) {
			NotificationChain msgs = null;
			if (dietPreference != null)
				msgs = ((InternalEObject)dietPreference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE, null, msgs);
			if (newDietPreference != null)
				msgs = ((InternalEObject)newDietPreference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE, null, msgs);
			msgs = basicSetDietPreference(newDietPreference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE, newDietPreference, newDietPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialCourtesy() {
		if (specialCourtesy == null) {
			specialCourtesy = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_COURTESY);
		}
		return specialCourtesy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSpecialArrangement() {
		if (specialArrangement == null) {
			specialArrangement = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_ARRANGEMENT);
		}
		return specialArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Reference newDestination, NotificationChain msgs) {
		Reference oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Reference newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDischargeDisposition() {
		return dischargeDisposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDischargeDisposition(CodeableConcept newDischargeDisposition, NotificationChain msgs) {
		CodeableConcept oldDischargeDisposition = dischargeDisposition;
		dischargeDisposition = newDischargeDisposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION, oldDischargeDisposition, newDischargeDisposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDischargeDisposition(CodeableConcept newDischargeDisposition) {
		if (newDischargeDisposition != dischargeDisposition) {
			NotificationChain msgs = null;
			if (dischargeDisposition != null)
				msgs = ((InternalEObject)dischargeDisposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION, null, msgs);
			if (newDischargeDisposition != null)
				msgs = ((InternalEObject)newDischargeDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION, null, msgs);
			msgs = basicSetDischargeDisposition(newDischargeDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION, newDischargeDisposition, newDischargeDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDischargeDiagnosis() {
		return dischargeDiagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDischargeDiagnosis(Reference newDischargeDiagnosis, NotificationChain msgs) {
		Reference oldDischargeDiagnosis = dischargeDiagnosis;
		dischargeDiagnosis = newDischargeDiagnosis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS, oldDischargeDiagnosis, newDischargeDiagnosis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDischargeDiagnosis(Reference newDischargeDiagnosis) {
		if (newDischargeDiagnosis != dischargeDiagnosis) {
			NotificationChain msgs = null;
			if (dischargeDiagnosis != null)
				msgs = ((InternalEObject)dischargeDiagnosis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS, null, msgs);
			if (newDischargeDiagnosis != null)
				msgs = ((InternalEObject)newDischargeDiagnosis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS, null, msgs);
			msgs = basicSetDischargeDiagnosis(newDischargeDiagnosis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS, newDischargeDiagnosis, newDischargeDiagnosis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getReAdmission() {
		return reAdmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReAdmission(org.hl7.fhir.Boolean newReAdmission, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldReAdmission = reAdmission;
		reAdmission = newReAdmission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION, oldReAdmission, newReAdmission);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReAdmission(org.hl7.fhir.Boolean newReAdmission) {
		if (newReAdmission != reAdmission) {
			NotificationChain msgs = null;
			if (reAdmission != null)
				msgs = ((InternalEObject)reAdmission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION, null, msgs);
			if (newReAdmission != null)
				msgs = ((InternalEObject)newReAdmission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION, null, msgs);
			msgs = basicSetReAdmission(newReAdmission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION, newReAdmission, newReAdmission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER:
				return basicSetPreAdmissionIdentifier(null, msgs);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__ORIGIN:
				return basicSetOrigin(null, msgs);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE:
				return basicSetAdmitSource(null, msgs);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE:
				return basicSetDietPreference(null, msgs);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_COURTESY:
				return ((InternalEList<?>)getSpecialCourtesy()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_ARRANGEMENT:
				return ((InternalEList<?>)getSpecialArrangement()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DESTINATION:
				return basicSetDestination(null, msgs);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION:
				return basicSetDischargeDisposition(null, msgs);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS:
				return basicSetDischargeDiagnosis(null, msgs);
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION:
				return basicSetReAdmission(null, msgs);
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
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER:
				return getPreAdmissionIdentifier();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__ORIGIN:
				return getOrigin();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE:
				return getAdmitSource();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE:
				return getDietPreference();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_COURTESY:
				return getSpecialCourtesy();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_ARRANGEMENT:
				return getSpecialArrangement();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DESTINATION:
				return getDestination();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION:
				return getDischargeDisposition();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS:
				return getDischargeDiagnosis();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION:
				return getReAdmission();
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
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER:
				setPreAdmissionIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__ORIGIN:
				setOrigin((Reference)newValue);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE:
				setAdmitSource((CodeableConcept)newValue);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE:
				setDietPreference((CodeableConcept)newValue);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_COURTESY:
				getSpecialCourtesy().clear();
				getSpecialCourtesy().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_ARRANGEMENT:
				getSpecialArrangement().clear();
				getSpecialArrangement().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DESTINATION:
				setDestination((Reference)newValue);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION:
				setDischargeDisposition((CodeableConcept)newValue);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS:
				setDischargeDiagnosis((Reference)newValue);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION:
				setReAdmission((org.hl7.fhir.Boolean)newValue);
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
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER:
				setPreAdmissionIdentifier((Identifier)null);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__ORIGIN:
				setOrigin((Reference)null);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE:
				setAdmitSource((CodeableConcept)null);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE:
				setDietPreference((CodeableConcept)null);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_COURTESY:
				getSpecialCourtesy().clear();
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_ARRANGEMENT:
				getSpecialArrangement().clear();
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DESTINATION:
				setDestination((Reference)null);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION:
				setDischargeDisposition((CodeableConcept)null);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS:
				setDischargeDiagnosis((Reference)null);
				return;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION:
				setReAdmission((org.hl7.fhir.Boolean)null);
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
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__PRE_ADMISSION_IDENTIFIER:
				return preAdmissionIdentifier != null;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__ORIGIN:
				return origin != null;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__ADMIT_SOURCE:
				return admitSource != null;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DIET_PREFERENCE:
				return dietPreference != null;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_COURTESY:
				return specialCourtesy != null && !specialCourtesy.isEmpty();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__SPECIAL_ARRANGEMENT:
				return specialArrangement != null && !specialArrangement.isEmpty();
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DESTINATION:
				return destination != null;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DISPOSITION:
				return dischargeDisposition != null;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__DISCHARGE_DIAGNOSIS:
				return dischargeDiagnosis != null;
			case FhirPackage.ENCOUNTER_HOSPITALIZATION__RE_ADMISSION:
				return reAdmission != null;
		}
		return super.eIsSet(featureID);
	}

} //EncounterHospitalizationImpl
