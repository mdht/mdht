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

import org.hl7.fhir.Coding;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getBin <em>Bin</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSubscriberId <em>Subscriber Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSubPlan <em>Sub Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getDependent <em>Dependent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CoverageImpl#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageImpl extends DomainResourceImpl implements Coverage {
	/**
	 * The cached value of the '{@link #getIssuer() <em>Issuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected Reference issuer;

	/**
	 * The cached value of the '{@link #getBin() <em>Bin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBin()
	 * @generated
	 * @ordered
	 */
	protected Identifier bin;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getSubscriberId() <em>Subscriber Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberId()
	 * @generated
	 * @ordered
	 */
	protected Identifier subscriberId;

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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String group;

	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String plan;

	/**
	 * The cached value of the '{@link #getSubPlan() <em>Sub Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPlan()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String subPlan;

	/**
	 * The cached value of the '{@link #getDependent() <em>Dependent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt dependent;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getSubscriber() <em>Subscriber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber()
	 * @generated
	 * @ordered
	 */
	protected Reference subscriber;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Identifier network;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> contract;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCoverage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getIssuer() {
		return issuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssuer(Reference newIssuer, NotificationChain msgs) {
		Reference oldIssuer = issuer;
		issuer = newIssuer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__ISSUER, oldIssuer, newIssuer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssuer(Reference newIssuer) {
		if (newIssuer != issuer) {
			NotificationChain msgs = null;
			if (issuer != null)
				msgs = ((InternalEObject)issuer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__ISSUER, null, msgs);
			if (newIssuer != null)
				msgs = ((InternalEObject)newIssuer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__ISSUER, null, msgs);
			msgs = basicSetIssuer(newIssuer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__ISSUER, newIssuer, newIssuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getBin() {
		return bin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBin(Identifier newBin, NotificationChain msgs) {
		Identifier oldBin = bin;
		bin = newBin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__BIN, oldBin, newBin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBin(Identifier newBin) {
		if (newBin != bin) {
			NotificationChain msgs = null;
			if (bin != null)
				msgs = ((InternalEObject)bin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__BIN, null, msgs);
			if (newBin != null)
				msgs = ((InternalEObject)newBin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__BIN, null, msgs);
			msgs = basicSetBin(newBin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__BIN, newBin, newBin));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PERIOD, oldPeriod, newPeriod);
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
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getSubscriberId() {
		return subscriberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriberId(Identifier newSubscriberId, NotificationChain msgs) {
		Identifier oldSubscriberId = subscriberId;
		subscriberId = newSubscriberId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUBSCRIBER_ID, oldSubscriberId, newSubscriberId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberId(Identifier newSubscriberId) {
		if (newSubscriberId != subscriberId) {
			NotificationChain msgs = null;
			if (subscriberId != null)
				msgs = ((InternalEObject)subscriberId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUBSCRIBER_ID, null, msgs);
			if (newSubscriberId != null)
				msgs = ((InternalEObject)newSubscriberId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUBSCRIBER_ID, null, msgs);
			msgs = basicSetSubscriberId(newSubscriberId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUBSCRIBER_ID, newSubscriberId, newSubscriberId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.COVERAGE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(org.hl7.fhir.String newGroup, NotificationChain msgs) {
		org.hl7.fhir.String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(org.hl7.fhir.String newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPlan() {
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlan(org.hl7.fhir.String newPlan, NotificationChain msgs) {
		org.hl7.fhir.String oldPlan = plan;
		plan = newPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PLAN, oldPlan, newPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(org.hl7.fhir.String newPlan) {
		if (newPlan != plan) {
			NotificationChain msgs = null;
			if (plan != null)
				msgs = ((InternalEObject)plan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PLAN, null, msgs);
			if (newPlan != null)
				msgs = ((InternalEObject)newPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__PLAN, null, msgs);
			msgs = basicSetPlan(newPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__PLAN, newPlan, newPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSubPlan() {
		return subPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubPlan(org.hl7.fhir.String newSubPlan, NotificationChain msgs) {
		org.hl7.fhir.String oldSubPlan = subPlan;
		subPlan = newSubPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUB_PLAN, oldSubPlan, newSubPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPlan(org.hl7.fhir.String newSubPlan) {
		if (newSubPlan != subPlan) {
			NotificationChain msgs = null;
			if (subPlan != null)
				msgs = ((InternalEObject)subPlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUB_PLAN, null, msgs);
			if (newSubPlan != null)
				msgs = ((InternalEObject)newSubPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUB_PLAN, null, msgs);
			msgs = basicSetSubPlan(newSubPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUB_PLAN, newSubPlan, newSubPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getDependent() {
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependent(PositiveInt newDependent, NotificationChain msgs) {
		PositiveInt oldDependent = dependent;
		dependent = newDependent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__DEPENDENT, oldDependent, newDependent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependent(PositiveInt newDependent) {
		if (newDependent != dependent) {
			NotificationChain msgs = null;
			if (dependent != null)
				msgs = ((InternalEObject)dependent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__DEPENDENT, null, msgs);
			if (newDependent != null)
				msgs = ((InternalEObject)newDependent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__DEPENDENT, null, msgs);
			msgs = basicSetDependent(newDependent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__DEPENDENT, newDependent, newDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubscriber() {
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriber(Reference newSubscriber, NotificationChain msgs) {
		Reference oldSubscriber = subscriber;
		subscriber = newSubscriber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUBSCRIBER, oldSubscriber, newSubscriber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriber(Reference newSubscriber) {
		if (newSubscriber != subscriber) {
			NotificationChain msgs = null;
			if (subscriber != null)
				msgs = ((InternalEObject)subscriber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUBSCRIBER, null, msgs);
			if (newSubscriber != null)
				msgs = ((InternalEObject)newSubscriber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__SUBSCRIBER, null, msgs);
			msgs = basicSetSubscriber(newSubscriber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__SUBSCRIBER, newSubscriber, newSubscriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(Identifier newNetwork, NotificationChain msgs) {
		Identifier oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__NETWORK, oldNetwork, newNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(Identifier newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COVERAGE__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COVERAGE__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getContract() {
		if (contract == null) {
			contract = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.COVERAGE__CONTRACT);
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COVERAGE__ISSUER:
				return basicSetIssuer(null, msgs);
			case FhirPackage.COVERAGE__BIN:
				return basicSetBin(null, msgs);
			case FhirPackage.COVERAGE__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.COVERAGE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.COVERAGE__SUBSCRIBER_ID:
				return basicSetSubscriberId(null, msgs);
			case FhirPackage.COVERAGE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.COVERAGE__GROUP:
				return basicSetGroup(null, msgs);
			case FhirPackage.COVERAGE__PLAN:
				return basicSetPlan(null, msgs);
			case FhirPackage.COVERAGE__SUB_PLAN:
				return basicSetSubPlan(null, msgs);
			case FhirPackage.COVERAGE__DEPENDENT:
				return basicSetDependent(null, msgs);
			case FhirPackage.COVERAGE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case FhirPackage.COVERAGE__SUBSCRIBER:
				return basicSetSubscriber(null, msgs);
			case FhirPackage.COVERAGE__NETWORK:
				return basicSetNetwork(null, msgs);
			case FhirPackage.COVERAGE__CONTRACT:
				return ((InternalEList<?>)getContract()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.COVERAGE__ISSUER:
				return getIssuer();
			case FhirPackage.COVERAGE__BIN:
				return getBin();
			case FhirPackage.COVERAGE__PERIOD:
				return getPeriod();
			case FhirPackage.COVERAGE__TYPE:
				return getType();
			case FhirPackage.COVERAGE__SUBSCRIBER_ID:
				return getSubscriberId();
			case FhirPackage.COVERAGE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.COVERAGE__GROUP:
				return getGroup();
			case FhirPackage.COVERAGE__PLAN:
				return getPlan();
			case FhirPackage.COVERAGE__SUB_PLAN:
				return getSubPlan();
			case FhirPackage.COVERAGE__DEPENDENT:
				return getDependent();
			case FhirPackage.COVERAGE__SEQUENCE:
				return getSequence();
			case FhirPackage.COVERAGE__SUBSCRIBER:
				return getSubscriber();
			case FhirPackage.COVERAGE__NETWORK:
				return getNetwork();
			case FhirPackage.COVERAGE__CONTRACT:
				return getContract();
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
			case FhirPackage.COVERAGE__ISSUER:
				setIssuer((Reference)newValue);
				return;
			case FhirPackage.COVERAGE__BIN:
				setBin((Identifier)newValue);
				return;
			case FhirPackage.COVERAGE__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.COVERAGE__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.COVERAGE__SUBSCRIBER_ID:
				setSubscriberId((Identifier)newValue);
				return;
			case FhirPackage.COVERAGE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.COVERAGE__GROUP:
				setGroup((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__PLAN:
				setPlan((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__SUB_PLAN:
				setSubPlan((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COVERAGE__DEPENDENT:
				setDependent((PositiveInt)newValue);
				return;
			case FhirPackage.COVERAGE__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirPackage.COVERAGE__SUBSCRIBER:
				setSubscriber((Reference)newValue);
				return;
			case FhirPackage.COVERAGE__NETWORK:
				setNetwork((Identifier)newValue);
				return;
			case FhirPackage.COVERAGE__CONTRACT:
				getContract().clear();
				getContract().addAll((Collection<? extends Reference>)newValue);
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
			case FhirPackage.COVERAGE__ISSUER:
				setIssuer((Reference)null);
				return;
			case FhirPackage.COVERAGE__BIN:
				setBin((Identifier)null);
				return;
			case FhirPackage.COVERAGE__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.COVERAGE__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.COVERAGE__SUBSCRIBER_ID:
				setSubscriberId((Identifier)null);
				return;
			case FhirPackage.COVERAGE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.COVERAGE__GROUP:
				setGroup((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__PLAN:
				setPlan((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__SUB_PLAN:
				setSubPlan((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COVERAGE__DEPENDENT:
				setDependent((PositiveInt)null);
				return;
			case FhirPackage.COVERAGE__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirPackage.COVERAGE__SUBSCRIBER:
				setSubscriber((Reference)null);
				return;
			case FhirPackage.COVERAGE__NETWORK:
				setNetwork((Identifier)null);
				return;
			case FhirPackage.COVERAGE__CONTRACT:
				getContract().clear();
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
			case FhirPackage.COVERAGE__ISSUER:
				return issuer != null;
			case FhirPackage.COVERAGE__BIN:
				return bin != null;
			case FhirPackage.COVERAGE__PERIOD:
				return period != null;
			case FhirPackage.COVERAGE__TYPE:
				return type != null;
			case FhirPackage.COVERAGE__SUBSCRIBER_ID:
				return subscriberId != null;
			case FhirPackage.COVERAGE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.COVERAGE__GROUP:
				return group != null;
			case FhirPackage.COVERAGE__PLAN:
				return plan != null;
			case FhirPackage.COVERAGE__SUB_PLAN:
				return subPlan != null;
			case FhirPackage.COVERAGE__DEPENDENT:
				return dependent != null;
			case FhirPackage.COVERAGE__SEQUENCE:
				return sequence != null;
			case FhirPackage.COVERAGE__SUBSCRIBER:
				return subscriber != null;
			case FhirPackage.COVERAGE__NETWORK:
				return network != null;
			case FhirPackage.COVERAGE__CONTRACT:
				return contract != null && !contract.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoverageImpl
