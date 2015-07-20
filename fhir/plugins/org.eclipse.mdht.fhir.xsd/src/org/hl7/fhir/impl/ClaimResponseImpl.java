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

import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseCoverage;
import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.ClaimResponseNote;
import org.hl7.fhir.Code;
import org.hl7.fhir.Coding;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getRequestOrganization <em>Request Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPayeeType <em>Payee Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getAddItem <em>Add Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getUnallocDeductable <em>Unalloc Deductable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getTotalBenefit <em>Total Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPaymentAdjustment <em>Payment Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPaymentAdjustmentReason <em>Payment Adjustment Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPaymentAmount <em>Payment Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getPaymentRef <em>Payment Ref</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseImpl#getCoverage <em>Coverage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseImpl extends DomainResourceImpl implements ClaimResponse {
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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Reference request;

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
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference organization;

	/**
	 * The cached value of the '{@link #getRequestProvider() <em>Request Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference requestProvider;

	/**
	 * The cached value of the '{@link #getRequestOrganization() <em>Request Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestOrganization()
	 * @generated
	 * @ordered
	 */
	protected Reference requestOrganization;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected Code outcome;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String disposition;

	/**
	 * The cached value of the '{@link #getPayeeType() <em>Payee Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayeeType()
	 * @generated
	 * @ordered
	 */
	protected Coding payeeType;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseItem> item;

	/**
	 * The cached value of the '{@link #getAddItem() <em>Add Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAddItem> addItem;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseError> error;

	/**
	 * The cached value of the '{@link #getTotalCost() <em>Total Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected Money totalCost;

	/**
	 * The cached value of the '{@link #getUnallocDeductable() <em>Unalloc Deductable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnallocDeductable()
	 * @generated
	 * @ordered
	 */
	protected Money unallocDeductable;

	/**
	 * The cached value of the '{@link #getTotalBenefit() <em>Total Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBenefit()
	 * @generated
	 * @ordered
	 */
	protected Money totalBenefit;

	/**
	 * The cached value of the '{@link #getPaymentAdjustment() <em>Payment Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAdjustment()
	 * @generated
	 * @ordered
	 */
	protected Money paymentAdjustment;

	/**
	 * The cached value of the '{@link #getPaymentAdjustmentReason() <em>Payment Adjustment Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAdjustmentReason()
	 * @generated
	 * @ordered
	 */
	protected Coding paymentAdjustmentReason;

	/**
	 * The cached value of the '{@link #getPaymentDate() <em>Payment Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected Date paymentDate;

	/**
	 * The cached value of the '{@link #getPaymentAmount() <em>Payment Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAmount()
	 * @generated
	 * @ordered
	 */
	protected Money paymentAmount;

	/**
	 * The cached value of the '{@link #getPaymentRef() <em>Payment Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentRef()
	 * @generated
	 * @ordered
	 */
	protected Identifier paymentRef;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected Coding reserved;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected Coding form;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseNote> note;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseCoverage> coverage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.CLAIM_RESPONSE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(Reference newRequest, NotificationChain msgs) {
		Reference oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(Reference newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST, newRequest, newRequest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__RULESET, oldRuleset, newRuleset);
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
				msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__RULESET, null, msgs);
			if (newRuleset != null)
				msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__RULESET, null, msgs);
			msgs = basicSetRuleset(newRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__RULESET, newRuleset, newRuleset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__ORIGINAL_RULESET, oldOriginalRuleset, newOriginalRuleset);
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
				msgs = ((InternalEObject)originalRuleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__ORIGINAL_RULESET, null, msgs);
			if (newOriginalRuleset != null)
				msgs = ((InternalEObject)newOriginalRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__ORIGINAL_RULESET, null, msgs);
			msgs = basicSetOriginalRuleset(newOriginalRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__ORIGINAL_RULESET, newOriginalRuleset, newOriginalRuleset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__CREATED, newCreated, newCreated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__ORGANIZATION, oldOrganization, newOrganization);
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
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestProvider() {
		return requestProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestProvider(Reference newRequestProvider, NotificationChain msgs) {
		Reference oldRequestProvider = requestProvider;
		requestProvider = newRequestProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER, oldRequestProvider, newRequestProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestProvider(Reference newRequestProvider) {
		if (newRequestProvider != requestProvider) {
			NotificationChain msgs = null;
			if (requestProvider != null)
				msgs = ((InternalEObject)requestProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER, null, msgs);
			if (newRequestProvider != null)
				msgs = ((InternalEObject)newRequestProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER, null, msgs);
			msgs = basicSetRequestProvider(newRequestProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER, newRequestProvider, newRequestProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRequestOrganization() {
		return requestOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestOrganization(Reference newRequestOrganization, NotificationChain msgs) {
		Reference oldRequestOrganization = requestOrganization;
		requestOrganization = newRequestOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION, oldRequestOrganization, newRequestOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestOrganization(Reference newRequestOrganization) {
		if (newRequestOrganization != requestOrganization) {
			NotificationChain msgs = null;
			if (requestOrganization != null)
				msgs = ((InternalEObject)requestOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION, null, msgs);
			if (newRequestOrganization != null)
				msgs = ((InternalEObject)newRequestOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION, null, msgs);
			msgs = basicSetRequestOrganization(newRequestOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION, newRequestOrganization, newRequestOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(Code newOutcome, NotificationChain msgs) {
		Code oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__OUTCOME, oldOutcome, newOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcome(Code newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisposition(org.hl7.fhir.String newDisposition, NotificationChain msgs) {
		org.hl7.fhir.String oldDisposition = disposition;
		disposition = newDisposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__DISPOSITION, oldDisposition, newDisposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(org.hl7.fhir.String newDisposition) {
		if (newDisposition != disposition) {
			NotificationChain msgs = null;
			if (disposition != null)
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__DISPOSITION, newDisposition, newDisposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPayeeType() {
		return payeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayeeType(Coding newPayeeType, NotificationChain msgs) {
		Coding oldPayeeType = payeeType;
		payeeType = newPayeeType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE, oldPayeeType, newPayeeType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayeeType(Coding newPayeeType) {
		if (newPayeeType != payeeType) {
			NotificationChain msgs = null;
			if (payeeType != null)
				msgs = ((InternalEObject)payeeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE, null, msgs);
			if (newPayeeType != null)
				msgs = ((InternalEObject)newPayeeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE, null, msgs);
			msgs = basicSetPayeeType(newPayeeType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE, newPayeeType, newPayeeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ClaimResponseItem>(ClaimResponseItem.class, this, FhirPackage.CLAIM_RESPONSE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseAddItem> getAddItem() {
		if (addItem == null) {
			addItem = new EObjectContainmentEList<ClaimResponseAddItem>(ClaimResponseAddItem.class, this, FhirPackage.CLAIM_RESPONSE__ADD_ITEM);
		}
		return addItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseError> getError() {
		if (error == null) {
			error = new EObjectContainmentEList<ClaimResponseError>(ClaimResponseError.class, this, FhirPackage.CLAIM_RESPONSE__ERROR);
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalCost() {
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalCost(Money newTotalCost, NotificationChain msgs) {
		Money oldTotalCost = totalCost;
		totalCost = newTotalCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__TOTAL_COST, oldTotalCost, newTotalCost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCost(Money newTotalCost) {
		if (newTotalCost != totalCost) {
			NotificationChain msgs = null;
			if (totalCost != null)
				msgs = ((InternalEObject)totalCost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__TOTAL_COST, null, msgs);
			if (newTotalCost != null)
				msgs = ((InternalEObject)newTotalCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__TOTAL_COST, null, msgs);
			msgs = basicSetTotalCost(newTotalCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__TOTAL_COST, newTotalCost, newTotalCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnallocDeductable() {
		return unallocDeductable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnallocDeductable(Money newUnallocDeductable, NotificationChain msgs) {
		Money oldUnallocDeductable = unallocDeductable;
		unallocDeductable = newUnallocDeductable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE, oldUnallocDeductable, newUnallocDeductable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnallocDeductable(Money newUnallocDeductable) {
		if (newUnallocDeductable != unallocDeductable) {
			NotificationChain msgs = null;
			if (unallocDeductable != null)
				msgs = ((InternalEObject)unallocDeductable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE, null, msgs);
			if (newUnallocDeductable != null)
				msgs = ((InternalEObject)newUnallocDeductable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE, null, msgs);
			msgs = basicSetUnallocDeductable(newUnallocDeductable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE, newUnallocDeductable, newUnallocDeductable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotalBenefit() {
		return totalBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalBenefit(Money newTotalBenefit, NotificationChain msgs) {
		Money oldTotalBenefit = totalBenefit;
		totalBenefit = newTotalBenefit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT, oldTotalBenefit, newTotalBenefit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalBenefit(Money newTotalBenefit) {
		if (newTotalBenefit != totalBenefit) {
			NotificationChain msgs = null;
			if (totalBenefit != null)
				msgs = ((InternalEObject)totalBenefit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT, null, msgs);
			if (newTotalBenefit != null)
				msgs = ((InternalEObject)newTotalBenefit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT, null, msgs);
			msgs = basicSetTotalBenefit(newTotalBenefit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT, newTotalBenefit, newTotalBenefit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getPaymentAdjustment() {
		return paymentAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentAdjustment(Money newPaymentAdjustment, NotificationChain msgs) {
		Money oldPaymentAdjustment = paymentAdjustment;
		paymentAdjustment = newPaymentAdjustment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT, oldPaymentAdjustment, newPaymentAdjustment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAdjustment(Money newPaymentAdjustment) {
		if (newPaymentAdjustment != paymentAdjustment) {
			NotificationChain msgs = null;
			if (paymentAdjustment != null)
				msgs = ((InternalEObject)paymentAdjustment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT, null, msgs);
			if (newPaymentAdjustment != null)
				msgs = ((InternalEObject)newPaymentAdjustment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT, null, msgs);
			msgs = basicSetPaymentAdjustment(newPaymentAdjustment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT, newPaymentAdjustment, newPaymentAdjustment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getPaymentAdjustmentReason() {
		return paymentAdjustmentReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentAdjustmentReason(Coding newPaymentAdjustmentReason, NotificationChain msgs) {
		Coding oldPaymentAdjustmentReason = paymentAdjustmentReason;
		paymentAdjustmentReason = newPaymentAdjustmentReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON, oldPaymentAdjustmentReason, newPaymentAdjustmentReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAdjustmentReason(Coding newPaymentAdjustmentReason) {
		if (newPaymentAdjustmentReason != paymentAdjustmentReason) {
			NotificationChain msgs = null;
			if (paymentAdjustmentReason != null)
				msgs = ((InternalEObject)paymentAdjustmentReason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON, null, msgs);
			if (newPaymentAdjustmentReason != null)
				msgs = ((InternalEObject)newPaymentAdjustmentReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON, null, msgs);
			msgs = basicSetPaymentAdjustmentReason(newPaymentAdjustmentReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON, newPaymentAdjustmentReason, newPaymentAdjustmentReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentDate(Date newPaymentDate, NotificationChain msgs) {
		Date oldPaymentDate = paymentDate;
		paymentDate = newPaymentDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT_DATE, oldPaymentDate, newPaymentDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDate(Date newPaymentDate) {
		if (newPaymentDate != paymentDate) {
			NotificationChain msgs = null;
			if (paymentDate != null)
				msgs = ((InternalEObject)paymentDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT_DATE, null, msgs);
			if (newPaymentDate != null)
				msgs = ((InternalEObject)newPaymentDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT_DATE, null, msgs);
			msgs = basicSetPaymentDate(newPaymentDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT_DATE, newPaymentDate, newPaymentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentAmount(Money newPaymentAmount, NotificationChain msgs) {
		Money oldPaymentAmount = paymentAmount;
		paymentAmount = newPaymentAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT_AMOUNT, oldPaymentAmount, newPaymentAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentAmount(Money newPaymentAmount) {
		if (newPaymentAmount != paymentAmount) {
			NotificationChain msgs = null;
			if (paymentAmount != null)
				msgs = ((InternalEObject)paymentAmount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT_AMOUNT, null, msgs);
			if (newPaymentAmount != null)
				msgs = ((InternalEObject)newPaymentAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT_AMOUNT, null, msgs);
			msgs = basicSetPaymentAmount(newPaymentAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT_AMOUNT, newPaymentAmount, newPaymentAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getPaymentRef() {
		return paymentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentRef(Identifier newPaymentRef, NotificationChain msgs) {
		Identifier oldPaymentRef = paymentRef;
		paymentRef = newPaymentRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT_REF, oldPaymentRef, newPaymentRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentRef(Identifier newPaymentRef) {
		if (newPaymentRef != paymentRef) {
			NotificationChain msgs = null;
			if (paymentRef != null)
				msgs = ((InternalEObject)paymentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT_REF, null, msgs);
			if (newPaymentRef != null)
				msgs = ((InternalEObject)newPaymentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__PAYMENT_REF, null, msgs);
			msgs = basicSetPaymentRef(newPaymentRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__PAYMENT_REF, newPaymentRef, newPaymentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserved(Coding newReserved, NotificationChain msgs) {
		Coding oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__RESERVED, oldReserved, newReserved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(Coding newReserved) {
		if (newReserved != reserved) {
			NotificationChain msgs = null;
			if (reserved != null)
				msgs = ((InternalEObject)reserved).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__RESERVED, null, msgs);
			if (newReserved != null)
				msgs = ((InternalEObject)newReserved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__RESERVED, null, msgs);
			msgs = basicSetReserved(newReserved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__RESERVED, newReserved, newReserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(Coding newForm, NotificationChain msgs) {
		Coding oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__FORM, oldForm, newForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(Coding newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseNote> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<ClaimResponseNote>(ClaimResponseNote.class, this, FhirPackage.CLAIM_RESPONSE__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseCoverage> getCoverage() {
		if (coverage == null) {
			coverage = new EObjectContainmentEList<ClaimResponseCoverage>(ClaimResponseCoverage.class, this, FhirPackage.CLAIM_RESPONSE__COVERAGE);
		}
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__RULESET:
				return basicSetRuleset(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__ORIGINAL_RULESET:
				return basicSetOriginalRuleset(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				return basicSetRequestProvider(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				return basicSetRequestOrganization(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return basicSetPayeeType(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				return ((InternalEList<?>)getAddItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__TOTAL_COST:
				return basicSetTotalCost(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				return basicSetUnallocDeductable(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				return basicSetTotalBenefit(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT:
				return basicSetPaymentAdjustment(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON:
				return basicSetPaymentAdjustmentReason(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_DATE:
				return basicSetPaymentDate(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_AMOUNT:
				return basicSetPaymentAmount(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_REF:
				return basicSetPaymentRef(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__RESERVED:
				return basicSetReserved(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__FORM:
				return basicSetForm(null, msgs);
			case FhirPackage.CLAIM_RESPONSE__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE__COVERAGE:
				return ((InternalEList<?>)getCoverage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				return getRequest();
			case FhirPackage.CLAIM_RESPONSE__RULESET:
				return getRuleset();
			case FhirPackage.CLAIM_RESPONSE__ORIGINAL_RULESET:
				return getOriginalRuleset();
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				return getCreated();
			case FhirPackage.CLAIM_RESPONSE__ORGANIZATION:
				return getOrganization();
			case FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				return getRequestProvider();
			case FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				return getRequestOrganization();
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				return getOutcome();
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				return getDisposition();
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return getPayeeType();
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				return getItem();
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				return getAddItem();
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				return getError();
			case FhirPackage.CLAIM_RESPONSE__TOTAL_COST:
				return getTotalCost();
			case FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				return getUnallocDeductable();
			case FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				return getTotalBenefit();
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT:
				return getPaymentAdjustment();
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON:
				return getPaymentAdjustmentReason();
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_DATE:
				return getPaymentDate();
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_AMOUNT:
				return getPaymentAmount();
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_REF:
				return getPaymentRef();
			case FhirPackage.CLAIM_RESPONSE__RESERVED:
				return getReserved();
			case FhirPackage.CLAIM_RESPONSE__FORM:
				return getForm();
			case FhirPackage.CLAIM_RESPONSE__NOTE:
				return getNote();
			case FhirPackage.CLAIM_RESPONSE__COVERAGE:
				return getCoverage();
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
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Reference)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				setOutcome((Code)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				setDisposition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				setPayeeType((Coding)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ClaimResponseItem>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				getAddItem().clear();
				getAddItem().addAll((Collection<? extends ClaimResponseAddItem>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends ClaimResponseError>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__TOTAL_COST:
				setTotalCost((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				setTotalBenefit((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT:
				setPaymentAdjustment((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON:
				setPaymentAdjustmentReason((Coding)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_DATE:
				setPaymentDate((Date)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_AMOUNT:
				setPaymentAmount((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_REF:
				setPaymentRef((Identifier)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__RESERVED:
				setReserved((Coding)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__FORM:
				setForm((Coding)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends ClaimResponseNote>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE__COVERAGE:
				getCoverage().clear();
				getCoverage().addAll((Collection<? extends ClaimResponseCoverage>)newValue);
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
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				setRequestProvider((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				setRequestOrganization((Reference)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				setOutcome((Code)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				setDisposition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				setPayeeType((Coding)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				getItem().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				getAddItem().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				getError().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__TOTAL_COST:
				setTotalCost((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				setUnallocDeductable((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				setTotalBenefit((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT:
				setPaymentAdjustment((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON:
				setPaymentAdjustmentReason((Coding)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_DATE:
				setPaymentDate((Date)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_AMOUNT:
				setPaymentAmount((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_REF:
				setPaymentRef((Identifier)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__RESERVED:
				setReserved((Coding)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__FORM:
				setForm((Coding)null);
				return;
			case FhirPackage.CLAIM_RESPONSE__NOTE:
				getNote().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE__COVERAGE:
				getCoverage().clear();
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
			case FhirPackage.CLAIM_RESPONSE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__REQUEST:
				return request != null;
			case FhirPackage.CLAIM_RESPONSE__RULESET:
				return ruleset != null;
			case FhirPackage.CLAIM_RESPONSE__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirPackage.CLAIM_RESPONSE__CREATED:
				return created != null;
			case FhirPackage.CLAIM_RESPONSE__ORGANIZATION:
				return organization != null;
			case FhirPackage.CLAIM_RESPONSE__REQUEST_PROVIDER:
				return requestProvider != null;
			case FhirPackage.CLAIM_RESPONSE__REQUEST_ORGANIZATION:
				return requestOrganization != null;
			case FhirPackage.CLAIM_RESPONSE__OUTCOME:
				return outcome != null;
			case FhirPackage.CLAIM_RESPONSE__DISPOSITION:
				return disposition != null;
			case FhirPackage.CLAIM_RESPONSE__PAYEE_TYPE:
				return payeeType != null;
			case FhirPackage.CLAIM_RESPONSE__ITEM:
				return item != null && !item.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__ADD_ITEM:
				return addItem != null && !addItem.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__ERROR:
				return error != null && !error.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__TOTAL_COST:
				return totalCost != null;
			case FhirPackage.CLAIM_RESPONSE__UNALLOC_DEDUCTABLE:
				return unallocDeductable != null;
			case FhirPackage.CLAIM_RESPONSE__TOTAL_BENEFIT:
				return totalBenefit != null;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT:
				return paymentAdjustment != null;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_ADJUSTMENT_REASON:
				return paymentAdjustmentReason != null;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_DATE:
				return paymentDate != null;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_AMOUNT:
				return paymentAmount != null;
			case FhirPackage.CLAIM_RESPONSE__PAYMENT_REF:
				return paymentRef != null;
			case FhirPackage.CLAIM_RESPONSE__RESERVED:
				return reserved != null;
			case FhirPackage.CLAIM_RESPONSE__FORM:
				return form != null;
			case FhirPackage.CLAIM_RESPONSE__NOTE:
				return note != null && !note.isEmpty();
			case FhirPackage.CLAIM_RESPONSE__COVERAGE:
				return coverage != null && !coverage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseImpl
