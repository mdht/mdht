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

import org.hl7.fhir.ActionList;
import org.hl7.fhir.Coding;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.ProcessRequest;
import org.hl7.fhir.ProcessRequestItem;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getNullify <em>Nullify</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProcessRequestImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessRequestImpl extends DomainResourceImpl implements ProcessRequest {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ActionList action;

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
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected Reference request;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected Reference response;

	/**
	 * The cached value of the '{@link #getNullify() <em>Nullify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullify()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean nullify;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String reference;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessRequestItem> item;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> include;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> exclude;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProcessRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionList getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(ActionList newAction, NotificationChain msgs) {
		ActionList oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionList newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.PROCESS_REQUEST__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__RULESET, oldRuleset, newRuleset);
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
				msgs = ((InternalEObject)ruleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__RULESET, null, msgs);
			if (newRuleset != null)
				msgs = ((InternalEObject)newRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__RULESET, null, msgs);
			msgs = basicSetRuleset(newRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__RULESET, newRuleset, newRuleset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET, oldOriginalRuleset, newOriginalRuleset);
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
				msgs = ((InternalEObject)originalRuleset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET, null, msgs);
			if (newOriginalRuleset != null)
				msgs = ((InternalEObject)newOriginalRuleset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET, null, msgs);
			msgs = basicSetOriginalRuleset(newOriginalRuleset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET, newOriginalRuleset, newOriginalRuleset));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__CREATED, oldCreated, newCreated);
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
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__CREATED, newCreated, newCreated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__TARGET, oldTarget, newTarget);
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
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__TARGET, newTarget, newTarget));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__PROVIDER, oldProvider, newProvider);
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
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__PROVIDER, newProvider, newProvider));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ORGANIZATION, oldOrganization, newOrganization);
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
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__ORGANIZATION, newOrganization, newOrganization));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__REQUEST, oldRequest, newRequest);
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
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(Reference newResponse, NotificationChain msgs) {
		Reference oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__RESPONSE, oldResponse, newResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(Reference newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getNullify() {
		return nullify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullify(org.hl7.fhir.Boolean newNullify, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldNullify = nullify;
		nullify = newNullify;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__NULLIFY, oldNullify, newNullify);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullify(org.hl7.fhir.Boolean newNullify) {
		if (newNullify != nullify) {
			NotificationChain msgs = null;
			if (nullify != null)
				msgs = ((InternalEObject)nullify).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__NULLIFY, null, msgs);
			if (newNullify != null)
				msgs = ((InternalEObject)newNullify).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__NULLIFY, null, msgs);
			msgs = basicSetNullify(newNullify, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__NULLIFY, newNullify, newNullify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(org.hl7.fhir.String newReference, NotificationChain msgs) {
		org.hl7.fhir.String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(org.hl7.fhir.String newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessRequestItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ProcessRequestItem>(ProcessRequestItem.class, this, FhirPackage.PROCESS_REQUEST__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getInclude() {
		if (include == null) {
			include = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.PROCESS_REQUEST__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getExclude() {
		if (exclude == null) {
			exclude = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.PROCESS_REQUEST__EXCLUDE);
		}
		return exclude;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROCESS_REQUEST__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROCESS_REQUEST__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROCESS_REQUEST__ACTION:
				return basicSetAction(null, msgs);
			case FhirPackage.PROCESS_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCESS_REQUEST__RULESET:
				return basicSetRuleset(null, msgs);
			case FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				return basicSetOriginalRuleset(null, msgs);
			case FhirPackage.PROCESS_REQUEST__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.PROCESS_REQUEST__TARGET:
				return basicSetTarget(null, msgs);
			case FhirPackage.PROCESS_REQUEST__PROVIDER:
				return basicSetProvider(null, msgs);
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.PROCESS_REQUEST__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.PROCESS_REQUEST__RESPONSE:
				return basicSetResponse(null, msgs);
			case FhirPackage.PROCESS_REQUEST__NULLIFY:
				return basicSetNullify(null, msgs);
			case FhirPackage.PROCESS_REQUEST__REFERENCE:
				return basicSetReference(null, msgs);
			case FhirPackage.PROCESS_REQUEST__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCESS_REQUEST__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCESS_REQUEST__EXCLUDE:
				return ((InternalEList<?>)getExclude()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROCESS_REQUEST__PERIOD:
				return basicSetPeriod(null, msgs);
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
			case FhirPackage.PROCESS_REQUEST__ACTION:
				return getAction();
			case FhirPackage.PROCESS_REQUEST__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.PROCESS_REQUEST__RULESET:
				return getRuleset();
			case FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				return getOriginalRuleset();
			case FhirPackage.PROCESS_REQUEST__CREATED:
				return getCreated();
			case FhirPackage.PROCESS_REQUEST__TARGET:
				return getTarget();
			case FhirPackage.PROCESS_REQUEST__PROVIDER:
				return getProvider();
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION:
				return getOrganization();
			case FhirPackage.PROCESS_REQUEST__REQUEST:
				return getRequest();
			case FhirPackage.PROCESS_REQUEST__RESPONSE:
				return getResponse();
			case FhirPackage.PROCESS_REQUEST__NULLIFY:
				return getNullify();
			case FhirPackage.PROCESS_REQUEST__REFERENCE:
				return getReference();
			case FhirPackage.PROCESS_REQUEST__ITEM:
				return getItem();
			case FhirPackage.PROCESS_REQUEST__INCLUDE:
				return getInclude();
			case FhirPackage.PROCESS_REQUEST__EXCLUDE:
				return getExclude();
			case FhirPackage.PROCESS_REQUEST__PERIOD:
				return getPeriod();
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
			case FhirPackage.PROCESS_REQUEST__ACTION:
				setAction((ActionList)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__RULESET:
				setRuleset((Coding)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__CREATED:
				setCreated((DateTime)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__TARGET:
				setTarget((Reference)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION:
				setOrganization((Reference)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__REQUEST:
				setRequest((Reference)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__RESPONSE:
				setResponse((Reference)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__NULLIFY:
				setNullify((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__REFERENCE:
				setReference((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ProcessRequestItem>)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__EXCLUDE:
				getExclude().clear();
				getExclude().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.PROCESS_REQUEST__PERIOD:
				setPeriod((Period)newValue);
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
			case FhirPackage.PROCESS_REQUEST__ACTION:
				setAction((ActionList)null);
				return;
			case FhirPackage.PROCESS_REQUEST__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.PROCESS_REQUEST__RULESET:
				setRuleset((Coding)null);
				return;
			case FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
			case FhirPackage.PROCESS_REQUEST__CREATED:
				setCreated((DateTime)null);
				return;
			case FhirPackage.PROCESS_REQUEST__TARGET:
				setTarget((Reference)null);
				return;
			case FhirPackage.PROCESS_REQUEST__PROVIDER:
				setProvider((Reference)null);
				return;
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION:
				setOrganization((Reference)null);
				return;
			case FhirPackage.PROCESS_REQUEST__REQUEST:
				setRequest((Reference)null);
				return;
			case FhirPackage.PROCESS_REQUEST__RESPONSE:
				setResponse((Reference)null);
				return;
			case FhirPackage.PROCESS_REQUEST__NULLIFY:
				setNullify((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.PROCESS_REQUEST__REFERENCE:
				setReference((org.hl7.fhir.String)null);
				return;
			case FhirPackage.PROCESS_REQUEST__ITEM:
				getItem().clear();
				return;
			case FhirPackage.PROCESS_REQUEST__INCLUDE:
				getInclude().clear();
				return;
			case FhirPackage.PROCESS_REQUEST__EXCLUDE:
				getExclude().clear();
				return;
			case FhirPackage.PROCESS_REQUEST__PERIOD:
				setPeriod((Period)null);
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
			case FhirPackage.PROCESS_REQUEST__ACTION:
				return action != null;
			case FhirPackage.PROCESS_REQUEST__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.PROCESS_REQUEST__RULESET:
				return ruleset != null;
			case FhirPackage.PROCESS_REQUEST__ORIGINAL_RULESET:
				return originalRuleset != null;
			case FhirPackage.PROCESS_REQUEST__CREATED:
				return created != null;
			case FhirPackage.PROCESS_REQUEST__TARGET:
				return target != null;
			case FhirPackage.PROCESS_REQUEST__PROVIDER:
				return provider != null;
			case FhirPackage.PROCESS_REQUEST__ORGANIZATION:
				return organization != null;
			case FhirPackage.PROCESS_REQUEST__REQUEST:
				return request != null;
			case FhirPackage.PROCESS_REQUEST__RESPONSE:
				return response != null;
			case FhirPackage.PROCESS_REQUEST__NULLIFY:
				return nullify != null;
			case FhirPackage.PROCESS_REQUEST__REFERENCE:
				return reference != null;
			case FhirPackage.PROCESS_REQUEST__ITEM:
				return item != null && !item.isEmpty();
			case FhirPackage.PROCESS_REQUEST__INCLUDE:
				return include != null && !include.isEmpty();
			case FhirPackage.PROCESS_REQUEST__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
			case FhirPackage.PROCESS_REQUEST__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessRequestImpl
