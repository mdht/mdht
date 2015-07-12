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

import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimCoverage;
import org.hl7.fhir.ClaimDiagnosis;
import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.ClaimMissingTeeth;
import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.ClaimType;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Use;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getFundsReserve <em>Funds Reserve</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getEnterer <em>Enterer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getOriginalPrescription <em>Original Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPayee <em>Payee</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getReferral <em>Referral</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getDiagnosis <em>Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getException <em>Exception</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getSchool <em>School</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getAccident <em>Accident</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getAccidentType <em>Accident Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getInterventionException <em>Intervention Exception</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getAdditionalMaterials <em>Additional Materials</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimImpl#getMissingTeeth <em>Missing Teeth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimImpl extends DomainResourceImpl implements Claim {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ClaimType type;

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
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding ruleset;

	/**
	 * The cached value of the '{@link #getOriginalRuleset() <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding originalRuleset;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

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
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference provider;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference organization;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Use use;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Coding priority;

	/**
	 * The cached value of the '{@link #getFundsReserve() <em>Funds Reserve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFundsReserve()
	 * @generated
	 * @ordered
	 */
	protected Coding fundsReserve;

	/**
	 * The cached value of the '{@link #getEnterer() <em>Enterer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterer()
	 * @generated
	 * @ordered
	 */
	protected Reference enterer;

	/**
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected Reference facility;

	/**
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference prescription;

	/**
	 * The cached value of the '{@link #getOriginalPrescription() <em>Original Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPrescription()
	 * @generated
	 * @ordered
	 */
	protected Reference originalPrescription;

	/**
	 * The cached value of the '{@link #getPayee() <em>Payee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayee()
	 * @generated
	 * @ordered
	 */
	protected ClaimPayee payee;

	/**
	 * The cached value of the '{@link #getReferral() <em>Referral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferral()
	 * @generated
	 * @ordered
	 */
	protected Reference referral;

	/**
	 * The cached value of the '{@link #getDiagnosis() <em>Diagnosis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimDiagnosis> diagnosis;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> condition;

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
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimCoverage> coverage;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> exception;

	/**
	 * The cached value of the '{@link #getSchool() <em>School</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchool()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String school;

	/**
	 * The cached value of the '{@link #getAccident() <em>Accident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccident()
	 * @generated
	 * @ordered
	 */
	protected Date accident;

	/**
	 * The cached value of the '{@link #getAccidentType() <em>Accident Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentType()
	 * @generated
	 * @ordered
	 */
	protected Coding accidentType;

	/**
	 * The cached value of the '{@link #getInterventionException() <em>Intervention Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterventionException()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> interventionException;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimItem> item;

	/**
	 * The cached value of the '{@link #getAdditionalMaterials() <em>Additional Materials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> additionalMaterials;

	/**
	 * The cached value of the '{@link #getMissingTeeth() <em>Missing Teeth</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingTeeth()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimMissingTeeth> missingTeeth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaim();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ClaimType newType, NotificationChain msgs) {
		ClaimType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ClaimType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CLAIM__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRuleset() {
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleset(Coding newRuleset, NotificationChain msgs) {
		Coding oldRuleset = ruleset;
		ruleset = newRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__RULESET, oldRuleset, newRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleset(Coding newRuleset) {
		if (newRuleset != ruleset) {
			NotificationChain msgs = null;
			if (ruleset != null)
				msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__RULESET, null, msgs);
			if (newRuleset != null)
				msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__RULESET, null, msgs);
			msgs = basicSetRuleset(newRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__RULESET, newRuleset, newRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getOriginalRuleset() {
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalRuleset(Coding newOriginalRuleset, NotificationChain msgs) {
		Coding oldOriginalRuleset = originalRuleset;
		originalRuleset = newOriginalRuleset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORIGINAL_RULESET, oldOriginalRuleset, newOriginalRuleset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalRuleset(Coding newOriginalRuleset) {
		if (newOriginalRuleset != originalRuleset) {
			NotificationChain msgs = null;
			if (originalRuleset != null)
				msgs = ((InternalEObject)originalRuleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORIGINAL_RULESET, null, msgs);
			if (newOriginalRuleset != null)
				msgs = ((InternalEObject)newOriginalRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORIGINAL_RULESET, null, msgs);
			msgs = basicSetOriginalRuleset(newOriginalRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORIGINAL_RULESET, newOriginalRuleset, newOriginalRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__CREATED, newCreated, newCreated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__TARGET, oldTarget, newTarget);
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
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Reference newProvider, NotificationChain msgs) {
		Reference oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PROVIDER, oldProvider, newProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Reference newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Reference newOrganization, NotificationChain msgs) {
		Reference oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORGANIZATION, oldOrganization, newOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Reference newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Use getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(Use newUse, NotificationChain msgs) {
		Use oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__USE, oldUse, newUse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Use newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__USE, newUse, newUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(Coding newPriority, NotificationChain msgs) {
		Coding oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Coding newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getFundsReserve() {
		return fundsReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFundsReserve(Coding newFundsReserve, NotificationChain msgs) {
		Coding oldFundsReserve = fundsReserve;
		fundsReserve = newFundsReserve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__FUNDS_RESERVE, oldFundsReserve, newFundsReserve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFundsReserve(Coding newFundsReserve) {
		if (newFundsReserve != fundsReserve) {
			NotificationChain msgs = null;
			if (fundsReserve != null)
				msgs = ((InternalEObject)fundsReserve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__FUNDS_RESERVE, null, msgs);
			if (newFundsReserve != null)
				msgs = ((InternalEObject)newFundsReserve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__FUNDS_RESERVE, null, msgs);
			msgs = basicSetFundsReserve(newFundsReserve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__FUNDS_RESERVE, newFundsReserve, newFundsReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getEnterer() {
		return enterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnterer(Reference newEnterer, NotificationChain msgs) {
		Reference oldEnterer = enterer;
		enterer = newEnterer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ENTERER, oldEnterer, newEnterer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnterer(Reference newEnterer) {
		if (newEnterer != enterer) {
			NotificationChain msgs = null;
			if (enterer != null)
				msgs = ((InternalEObject)enterer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ENTERER, null, msgs);
			if (newEnterer != null)
				msgs = ((InternalEObject)newEnterer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ENTERER, null, msgs);
			msgs = basicSetEnterer(newEnterer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ENTERER, newEnterer, newEnterer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getFacility() {
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacility(Reference newFacility, NotificationChain msgs) {
		Reference oldFacility = facility;
		facility = newFacility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__FACILITY, oldFacility, newFacility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacility(Reference newFacility) {
		if (newFacility != facility) {
			NotificationChain msgs = null;
			if (facility != null)
				msgs = ((InternalEObject)facility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__FACILITY, null, msgs);
			if (newFacility != null)
				msgs = ((InternalEObject)newFacility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__FACILITY, null, msgs);
			msgs = basicSetFacility(newFacility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__FACILITY, newFacility, newFacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescription(Reference newPrescription, NotificationChain msgs) {
		Reference oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PRESCRIPTION, oldPrescription, newPrescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescription(Reference newPrescription) {
		if (newPrescription != prescription) {
			NotificationChain msgs = null;
			if (prescription != null)
				msgs = ((InternalEObject)prescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PRESCRIPTION, null, msgs);
			if (newPrescription != null)
				msgs = ((InternalEObject)newPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PRESCRIPTION, null, msgs);
			msgs = basicSetPrescription(newPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PRESCRIPTION, newPrescription, newPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOriginalPrescription() {
		return originalPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalPrescription(Reference newOriginalPrescription, NotificationChain msgs) {
		Reference oldOriginalPrescription = originalPrescription;
		originalPrescription = newOriginalPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION, oldOriginalPrescription, newOriginalPrescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalPrescription(Reference newOriginalPrescription) {
		if (newOriginalPrescription != originalPrescription) {
			NotificationChain msgs = null;
			if (originalPrescription != null)
				msgs = ((InternalEObject)originalPrescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION, null, msgs);
			if (newOriginalPrescription != null)
				msgs = ((InternalEObject)newOriginalPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION, null, msgs);
			msgs = basicSetOriginalPrescription(newOriginalPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION, newOriginalPrescription, newOriginalPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimPayee getPayee() {
		return payee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayee(ClaimPayee newPayee, NotificationChain msgs) {
		ClaimPayee oldPayee = payee;
		payee = newPayee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PAYEE, oldPayee, newPayee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayee(ClaimPayee newPayee) {
		if (newPayee != payee) {
			NotificationChain msgs = null;
			if (payee != null)
				msgs = ((InternalEObject)payee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PAYEE, null, msgs);
			if (newPayee != null)
				msgs = ((InternalEObject)newPayee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PAYEE, null, msgs);
			msgs = basicSetPayee(newPayee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PAYEE, newPayee, newPayee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferral() {
		return referral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferral(Reference newReferral, NotificationChain msgs) {
		Reference oldReferral = referral;
		referral = newReferral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__REFERRAL, oldReferral, newReferral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferral(Reference newReferral) {
		if (newReferral != referral) {
			NotificationChain msgs = null;
			if (referral != null)
				msgs = ((InternalEObject)referral).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__REFERRAL, null, msgs);
			if (newReferral != null)
				msgs = ((InternalEObject)newReferral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__REFERRAL, null, msgs);
			msgs = basicSetReferral(newReferral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__REFERRAL, newReferral, newReferral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimDiagnosis> getDiagnosis() {
		if (diagnosis == null) {
			diagnosis = new EObjectContainmentEList<ClaimDiagnosis>(ClaimDiagnosis.class, this, FhirPackage.CLAIM__DIAGNOSIS);
		}
		return diagnosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CLAIM__CONDITION);
		}
		return condition;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PATIENT, oldPatient, newPatient);
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
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimCoverage> getCoverage() {
		if (coverage == null) {
			coverage = new EObjectContainmentEList<ClaimCoverage>(ClaimCoverage.class, this, FhirPackage.CLAIM__COVERAGE);
		}
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getException() {
		if (exception == null) {
			exception = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CLAIM__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSchool() {
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchool(org.hl7.fhir.String newSchool, NotificationChain msgs) {
		org.hl7.fhir.String oldSchool = school;
		school = newSchool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__SCHOOL, oldSchool, newSchool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchool(org.hl7.fhir.String newSchool) {
		if (newSchool != school) {
			NotificationChain msgs = null;
			if (school != null)
				msgs = ((InternalEObject)school).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__SCHOOL, null, msgs);
			if (newSchool != null)
				msgs = ((InternalEObject)newSchool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__SCHOOL, null, msgs);
			msgs = basicSetSchool(newSchool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__SCHOOL, newSchool, newSchool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAccident() {
		return accident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccident(Date newAccident, NotificationChain msgs) {
		Date oldAccident = accident;
		accident = newAccident;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ACCIDENT, oldAccident, newAccident);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccident(Date newAccident) {
		if (newAccident != accident) {
			NotificationChain msgs = null;
			if (accident != null)
				msgs = ((InternalEObject)accident).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ACCIDENT, null, msgs);
			if (newAccident != null)
				msgs = ((InternalEObject)newAccident).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ACCIDENT, null, msgs);
			msgs = basicSetAccident(newAccident, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ACCIDENT, newAccident, newAccident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getAccidentType() {
		return accidentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccidentType(Coding newAccidentType, NotificationChain msgs) {
		Coding oldAccidentType = accidentType;
		accidentType = newAccidentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ACCIDENT_TYPE, oldAccidentType, newAccidentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccidentType(Coding newAccidentType) {
		if (newAccidentType != accidentType) {
			NotificationChain msgs = null;
			if (accidentType != null)
				msgs = ((InternalEObject)accidentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ACCIDENT_TYPE, null, msgs);
			if (newAccidentType != null)
				msgs = ((InternalEObject)newAccidentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM__ACCIDENT_TYPE, null, msgs);
			msgs = basicSetAccidentType(newAccidentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM__ACCIDENT_TYPE, newAccidentType, newAccidentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getInterventionException() {
		if (interventionException == null) {
			interventionException = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CLAIM__INTERVENTION_EXCEPTION);
		}
		return interventionException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ClaimItem>(ClaimItem.class, this, FhirPackage.CLAIM__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getAdditionalMaterials() {
		if (additionalMaterials == null) {
			additionalMaterials = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CLAIM__ADDITIONAL_MATERIALS);
		}
		return additionalMaterials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimMissingTeeth> getMissingTeeth() {
		if (missingTeeth == null) {
			missingTeeth = new EObjectContainmentEList<ClaimMissingTeeth>(ClaimMissingTeeth.class, this, FhirPackage.CLAIM__MISSING_TEETH);
		}
		return missingTeeth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CLAIM__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__RULESET:
				return basicSetRuleset(null, msgs);
			case FhirPackage.CLAIM__ORIGINAL_RULESET:
				return basicSetOriginalRuleset(null, msgs);
			case FhirPackage.CLAIM__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.CLAIM__TARGET:
				return basicSetTarget(null, msgs);
			case FhirPackage.CLAIM__PROVIDER:
				return basicSetProvider(null, msgs);
			case FhirPackage.CLAIM__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.CLAIM__USE:
				return basicSetUse(null, msgs);
			case FhirPackage.CLAIM__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.CLAIM__FUNDS_RESERVE:
				return basicSetFundsReserve(null, msgs);
			case FhirPackage.CLAIM__ENTERER:
				return basicSetEnterer(null, msgs);
			case FhirPackage.CLAIM__FACILITY:
				return basicSetFacility(null, msgs);
			case FhirPackage.CLAIM__PRESCRIPTION:
				return basicSetPrescription(null, msgs);
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				return basicSetOriginalPrescription(null, msgs);
			case FhirPackage.CLAIM__PAYEE:
				return basicSetPayee(null, msgs);
			case FhirPackage.CLAIM__REFERRAL:
				return basicSetReferral(null, msgs);
			case FhirPackage.CLAIM__DIAGNOSIS:
				return ((InternalEList<?>)getDiagnosis()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.CLAIM__COVERAGE:
				return ((InternalEList<?>)getCoverage()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__EXCEPTION:
				return ((InternalEList<?>)getException()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__SCHOOL:
				return basicSetSchool(null, msgs);
			case FhirPackage.CLAIM__ACCIDENT:
				return basicSetAccident(null, msgs);
			case FhirPackage.CLAIM__ACCIDENT_TYPE:
				return basicSetAccidentType(null, msgs);
			case FhirPackage.CLAIM__INTERVENTION_EXCEPTION:
				return ((InternalEList<?>)getInterventionException()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__ADDITIONAL_MATERIALS:
				return ((InternalEList<?>)getAdditionalMaterials()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM__MISSING_TEETH:
				return ((InternalEList<?>)getMissingTeeth()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM__TYPE:
				return getType();
			case FhirPackage.CLAIM__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CLAIM__RULESET:
				return getRuleset();
			case FhirPackage.CLAIM__ORIGINAL_RULESET:
				return getOriginalRuleset();
			case FhirPackage.CLAIM__CREATED:
				return getCreated();
			case FhirPackage.CLAIM__TARGET:
				return getTarget();
			case FhirPackage.CLAIM__PROVIDER:
				return getProvider();
			case FhirPackage.CLAIM__ORGANIZATION:
				return getOrganization();
			case FhirPackage.CLAIM__USE:
				return getUse();
			case FhirPackage.CLAIM__PRIORITY:
				return getPriority();
			case FhirPackage.CLAIM__FUNDS_RESERVE:
				return getFundsReserve();
			case FhirPackage.CLAIM__ENTERER:
				return getEnterer();
			case FhirPackage.CLAIM__FACILITY:
				return getFacility();
			case FhirPackage.CLAIM__PRESCRIPTION:
				return getPrescription();
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				return getOriginalPrescription();
			case FhirPackage.CLAIM__PAYEE:
				return getPayee();
			case FhirPackage.CLAIM__REFERRAL:
				return getReferral();
			case FhirPackage.CLAIM__DIAGNOSIS:
				return getDiagnosis();
			case FhirPackage.CLAIM__CONDITION:
				return getCondition();
			case FhirPackage.CLAIM__PATIENT:
				return getPatient();
			case FhirPackage.CLAIM__COVERAGE:
				return getCoverage();
			case FhirPackage.CLAIM__EXCEPTION:
				return getException();
			case FhirPackage.CLAIM__SCHOOL:
				return getSchool();
			case FhirPackage.CLAIM__ACCIDENT:
				return getAccident();
			case FhirPackage.CLAIM__ACCIDENT_TYPE:
				return getAccidentType();
			case FhirPackage.CLAIM__INTERVENTION_EXCEPTION:
				return getInterventionException();
			case FhirPackage.CLAIM__ITEM:
				return getItem();
			case FhirPackage.CLAIM__ADDITIONAL_MATERIALS:
				return getAdditionalMaterials();
			case FhirPackage.CLAIM__MISSING_TEETH:
				return getMissingTeeth();
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
			case FhirPackage.CLAIM__TYPE:
				setType((ClaimType)newValue);
				return;
			case FhirPackage.CLAIM__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CLAIM__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirPackage.CLAIM__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirPackage.CLAIM__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.CLAIM__TARGET:
				setTarget((Reference)newValue);
				return;
			case FhirPackage.CLAIM__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case FhirPackage.CLAIM__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.CLAIM__USE:
				setUse((Use)newValue);
				return;
			case FhirPackage.CLAIM__PRIORITY:
				setPriority((Coding)newValue);
				return;
			case FhirPackage.CLAIM__FUNDS_RESERVE:
				setFundsReserve((Coding)newValue);
				return;
			case FhirPackage.CLAIM__ENTERER:
				setEnterer((Reference)newValue);
				return;
			case FhirPackage.CLAIM__FACILITY:
				setFacility((Reference)newValue);
				return;
			case FhirPackage.CLAIM__PRESCRIPTION:
				setPrescription((Reference)newValue);
				return;
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((Reference)newValue);
				return;
			case FhirPackage.CLAIM__PAYEE:
				setPayee((ClaimPayee)newValue);
				return;
			case FhirPackage.CLAIM__REFERRAL:
				setReferral((Reference)newValue);
				return;
			case FhirPackage.CLAIM__DIAGNOSIS:
				getDiagnosis().clear();
				getDiagnosis().addAll((Collection<? extends ClaimDiagnosis>)newValue);
				return;
			case FhirPackage.CLAIM__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CLAIM__PATIENT:
				setPatient((Reference)newValue);
				return;
			case FhirPackage.CLAIM__COVERAGE:
				getCoverage().clear();
				getCoverage().addAll((Collection<? extends ClaimCoverage>)newValue);
				return;
			case FhirPackage.CLAIM__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CLAIM__SCHOOL:
				setSchool((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CLAIM__ACCIDENT:
				setAccident((Date)newValue);
				return;
			case FhirPackage.CLAIM__ACCIDENT_TYPE:
				setAccidentType((Coding)newValue);
				return;
			case FhirPackage.CLAIM__INTERVENTION_EXCEPTION:
				getInterventionException().clear();
				getInterventionException().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CLAIM__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ClaimItem>)newValue);
				return;
			case FhirPackage.CLAIM__ADDITIONAL_MATERIALS:
				getAdditionalMaterials().clear();
				getAdditionalMaterials().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.CLAIM__MISSING_TEETH:
				getMissingTeeth().clear();
				getMissingTeeth().addAll((Collection<? extends ClaimMissingTeeth>)newValue);
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
			case FhirPackage.CLAIM__TYPE:
				setType((ClaimType)null);
				return;
			case FhirPackage.CLAIM__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CLAIM__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirPackage.CLAIM__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirPackage.CLAIM__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.CLAIM__TARGET:
				setTarget((Reference)null);
				return;
			case FhirPackage.CLAIM__PROVIDER:
				setProvider((Reference)null);
				return;
			case FhirPackage.CLAIM__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.CLAIM__USE:
				setUse((Use)null);
				return;
			case FhirPackage.CLAIM__PRIORITY:
				setPriority((Coding)null);
				return;
			case FhirPackage.CLAIM__FUNDS_RESERVE:
				setFundsReserve((Coding)null);
				return;
			case FhirPackage.CLAIM__ENTERER:
				setEnterer((Reference)null);
				return;
			case FhirPackage.CLAIM__FACILITY:
				setFacility((Reference)null);
				return;
			case FhirPackage.CLAIM__PRESCRIPTION:
				setPrescription((Reference)null);
				return;
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				setOriginalPrescription((Reference)null);
				return;
			case FhirPackage.CLAIM__PAYEE:
				setPayee((ClaimPayee)null);
				return;
			case FhirPackage.CLAIM__REFERRAL:
				setReferral((Reference)null);
				return;
			case FhirPackage.CLAIM__DIAGNOSIS:
				getDiagnosis().clear();
				return;
			case FhirPackage.CLAIM__CONDITION:
				getCondition().clear();
				return;
			case FhirPackage.CLAIM__PATIENT:
				setPatient((Reference)null);
				return;
			case FhirPackage.CLAIM__COVERAGE:
				getCoverage().clear();
				return;
			case FhirPackage.CLAIM__EXCEPTION:
				getException().clear();
				return;
			case FhirPackage.CLAIM__SCHOOL:
				setSchool((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CLAIM__ACCIDENT:
				setAccident((Date)null);
				return;
			case FhirPackage.CLAIM__ACCIDENT_TYPE:
				setAccidentType((Coding)null);
				return;
			case FhirPackage.CLAIM__INTERVENTION_EXCEPTION:
				getInterventionException().clear();
				return;
			case FhirPackage.CLAIM__ITEM:
				getItem().clear();
				return;
			case FhirPackage.CLAIM__ADDITIONAL_MATERIALS:
				getAdditionalMaterials().clear();
				return;
			case FhirPackage.CLAIM__MISSING_TEETH:
				getMissingTeeth().clear();
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
			case FhirPackage.CLAIM__TYPE:
				return type != null;
			case FhirPackage.CLAIM__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CLAIM__RULESET:
				return ruleset != null;
			case FhirPackage.CLAIM__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirPackage.CLAIM__CREATED:
				return created != null;
			case FhirPackage.CLAIM__TARGET:
				return target != null;
			case FhirPackage.CLAIM__PROVIDER:
				return provider != null;
			case FhirPackage.CLAIM__ORGANIZATION:
				return organization != null;
			case FhirPackage.CLAIM__USE:
				return use != null;
			case FhirPackage.CLAIM__PRIORITY:
				return priority != null;
			case FhirPackage.CLAIM__FUNDS_RESERVE:
				return fundsReserve != null;
			case FhirPackage.CLAIM__ENTERER:
				return enterer != null;
			case FhirPackage.CLAIM__FACILITY:
				return facility != null;
			case FhirPackage.CLAIM__PRESCRIPTION:
				return prescription != null;
			case FhirPackage.CLAIM__ORIGINAL_PRESCRIPTION:
				return originalPrescription != null;
			case FhirPackage.CLAIM__PAYEE:
				return payee != null;
			case FhirPackage.CLAIM__REFERRAL:
				return referral != null;
			case FhirPackage.CLAIM__DIAGNOSIS:
				return diagnosis != null && !diagnosis.isEmpty();
			case FhirPackage.CLAIM__CONDITION:
				return condition != null && !condition.isEmpty();
			case FhirPackage.CLAIM__PATIENT:
				return patient != null;
			case FhirPackage.CLAIM__COVERAGE:
				return coverage != null && !coverage.isEmpty();
			case FhirPackage.CLAIM__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case FhirPackage.CLAIM__SCHOOL:
				return school != null;
			case FhirPackage.CLAIM__ACCIDENT:
				return accident != null;
			case FhirPackage.CLAIM__ACCIDENT_TYPE:
				return accidentType != null;
			case FhirPackage.CLAIM__INTERVENTION_EXCEPTION:
				return interventionException != null && !interventionException.isEmpty();
			case FhirPackage.CLAIM__ITEM:
				return item != null && !item.isEmpty();
			case FhirPackage.CLAIM__ADDITIONAL_MATERIALS:
				return additionalMaterials != null && !additionalMaterials.isEmpty();
			case FhirPackage.CLAIM__MISSING_TEETH:
				return missingTeeth != null && !missingTeeth.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimImpl
