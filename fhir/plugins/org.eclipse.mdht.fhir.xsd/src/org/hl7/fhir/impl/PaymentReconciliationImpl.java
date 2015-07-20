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

import org.hl7.fhir.Code;
import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.PaymentReconciliationDetail;
import org.hl7.fhir.PaymentReconciliationNote;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Reconciliation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getRequestOrganization <em>Request Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.PaymentReconciliationImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentReconciliationImpl extends DomainResourceImpl implements PaymentReconciliation {
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
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

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
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<PaymentReconciliationDetail> detail;

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
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected Money total;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<PaymentReconciliationNote> note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentReconciliationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getPaymentReconciliation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUEST, oldRequest, newRequest);
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
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUEST, newRequest, newRequest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__OUTCOME, oldOutcome, newOutcome);
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
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__OUTCOME, newOutcome, newOutcome));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION, oldDisposition, newDisposition);
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
				msgs = ((InternalEObject)disposition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION, null, msgs);
			if (newDisposition != null)
				msgs = ((InternalEObject)newDisposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION, null, msgs);
			msgs = basicSetDisposition(newDisposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION, newDisposition, newDisposition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__RULESET, oldRuleset, newRuleset);
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
				msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__RULESET, null, msgs);
			if (newRuleset != null)
				msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__RULESET, null, msgs);
			msgs = basicSetRuleset(newRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__RULESET, newRuleset, newRuleset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__ORIGINAL_RULESET, oldOriginalRuleset, newOriginalRuleset);
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
				msgs = ((InternalEObject)originalRuleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__ORIGINAL_RULESET, null, msgs);
			if (newOriginalRuleset != null)
				msgs = ((InternalEObject)newOriginalRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__ORIGINAL_RULESET, null, msgs);
			msgs = basicSetOriginalRuleset(newOriginalRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__ORIGINAL_RULESET, newOriginalRuleset, newOriginalRuleset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__PERIOD, newPeriod, newPeriod));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__ORGANIZATION, oldOrganization, newOrganization);
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
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__ORGANIZATION, newOrganization, newOrganization));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUEST_PROVIDER, oldRequestProvider, newRequestProvider);
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
				msgs = ((InternalEObject)requestProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUEST_PROVIDER, null, msgs);
			if (newRequestProvider != null)
				msgs = ((InternalEObject)newRequestProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUEST_PROVIDER, null, msgs);
			msgs = basicSetRequestProvider(newRequestProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUEST_PROVIDER, newRequestProvider, newRequestProvider));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUEST_ORGANIZATION, oldRequestOrganization, newRequestOrganization);
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
				msgs = ((InternalEObject)requestOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUEST_ORGANIZATION, null, msgs);
			if (newRequestOrganization != null)
				msgs = ((InternalEObject)newRequestOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__REQUEST_ORGANIZATION, null, msgs);
			msgs = basicSetRequestOrganization(newRequestOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__REQUEST_ORGANIZATION, newRequestOrganization, newRequestOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PaymentReconciliationDetail> getDetail() {
		if (detail == null) {
			detail = new EObjectContainmentEList<PaymentReconciliationDetail>(PaymentReconciliationDetail.class, this, FhirPackage.PAYMENT_RECONCILIATION__DETAIL);
		}
		return detail;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__FORM, oldForm, newForm);
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
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotal(Money newTotal, NotificationChain msgs) {
		Money oldTotal = total;
		total = newTotal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__TOTAL, oldTotal, newTotal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(Money newTotal) {
		if (newTotal != total) {
			NotificationChain msgs = null;
			if (total != null)
				msgs = ((InternalEObject)total).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__TOTAL, null, msgs);
			if (newTotal != null)
				msgs = ((InternalEObject)newTotal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PAYMENT_RECONCILIATION__TOTAL, null, msgs);
			msgs = basicSetTotal(newTotal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PAYMENT_RECONCILIATION__TOTAL, newTotal, newTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PaymentReconciliationNote> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<PaymentReconciliationNote>(PaymentReconciliationNote.class, this, FhirPackage.PAYMENT_RECONCILIATION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				return basicSetOutcome(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				return basicSetDisposition(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__RULESET:
				return basicSetRuleset(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__ORIGINAL_RULESET:
				return basicSetOriginalRuleset(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST_PROVIDER:
				return basicSetRequestProvider(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST_ORGANIZATION:
				return basicSetRequestOrganization(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__DETAIL:
				return ((InternalEList<?>)getDetail()).basicRemove(otherEnd, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__FORM:
				return basicSetForm(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__TOTAL:
				return basicSetTotal(null, msgs);
			case FhirPackage.PAYMENT_RECONCILIATION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				return getRequest();
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				return getOutcome();
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				return getDisposition();
			case FhirPackage.PAYMENT_RECONCILIATION__RULESET:
				return getRuleset();
			case FhirPackage.PAYMENT_RECONCILIATION__ORIGINAL_RULESET:
				return getOriginalRuleset();
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				return getCreated();
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				return getPeriod();
			case FhirPackage.PAYMENT_RECONCILIATION__ORGANIZATION:
				return getOrganization();
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST_PROVIDER:
				return getRequestProvider();
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST_ORGANIZATION:
				return getRequestOrganization();
			case FhirPackage.PAYMENT_RECONCILIATION__DETAIL:
				return getDetail();
			case FhirPackage.PAYMENT_RECONCILIATION__FORM:
				return getForm();
			case FhirPackage.PAYMENT_RECONCILIATION__TOTAL:
				return getTotal();
			case FhirPackage.PAYMENT_RECONCILIATION__NOTE:
				return getNote();
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
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				setOutcome((Code)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				setDisposition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST_PROVIDER:
				setRequestProvider((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST_ORGANIZATION:
				setRequestOrganization((Reference)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__DETAIL:
				getDetail().clear();
				getDetail().addAll((Collection<? extends PaymentReconciliationDetail>)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__FORM:
				setForm((Coding)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__TOTAL:
				setTotal((Money)newValue);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends PaymentReconciliationNote>)newValue);
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
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				setOutcome((Code)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				setDisposition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST_PROVIDER:
				setRequestProvider((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST_ORGANIZATION:
				setRequestOrganization((Reference)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__DETAIL:
				getDetail().clear();
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__FORM:
				setForm((Coding)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__TOTAL:
				setTotal((Money)null);
				return;
			case FhirPackage.PAYMENT_RECONCILIATION__NOTE:
				getNote().clear();
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
			case FhirPackage.PAYMENT_RECONCILIATION__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST:
				return request != null;
			case FhirPackage.PAYMENT_RECONCILIATION__OUTCOME:
				return outcome != null;
			case FhirPackage.PAYMENT_RECONCILIATION__DISPOSITION:
				return disposition != null;
			case FhirPackage.PAYMENT_RECONCILIATION__RULESET:
				return ruleset != null;
			case FhirPackage.PAYMENT_RECONCILIATION__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirPackage.PAYMENT_RECONCILIATION__CREATED:
				return created != null;
			case FhirPackage.PAYMENT_RECONCILIATION__PERIOD:
				return period != null;
			case FhirPackage.PAYMENT_RECONCILIATION__ORGANIZATION:
				return organization != null;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST_PROVIDER:
				return requestProvider != null;
			case FhirPackage.PAYMENT_RECONCILIATION__REQUEST_ORGANIZATION:
				return requestOrganization != null;
			case FhirPackage.PAYMENT_RECONCILIATION__DETAIL:
				return detail != null && !detail.isEmpty();
			case FhirPackage.PAYMENT_RECONCILIATION__FORM:
				return form != null;
			case FhirPackage.PAYMENT_RECONCILIATION__TOTAL:
				return total != null;
			case FhirPackage.PAYMENT_RECONCILIATION__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PaymentReconciliationImpl
