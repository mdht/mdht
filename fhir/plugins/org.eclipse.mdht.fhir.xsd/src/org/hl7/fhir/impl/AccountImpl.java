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

import org.hl7.fhir.Account;
import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Money;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AccountImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountImpl#getActivePeriod <em>Active Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountImpl#getCoveragePeriod <em>Coverage Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AccountImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends DomainResourceImpl implements Account {
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected AccountStatus status;

	/**
	 * The cached value of the '{@link #getActivePeriod() <em>Active Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period activePeriod;

	/**
	 * The cached value of the '{@link #getCurrency() <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected Coding currency;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected Money balance;

	/**
	 * The cached value of the '{@link #getCoveragePeriod() <em>Coverage Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveragePeriod()
	 * @generated
	 * @ordered
	 */
	protected Period coveragePeriod;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Reference owner;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAccount();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ACCOUNT__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(AccountStatus newStatus, NotificationChain msgs) {
		AccountStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(AccountStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getActivePeriod() {
		return activePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivePeriod(Period newActivePeriod, NotificationChain msgs) {
		Period oldActivePeriod = activePeriod;
		activePeriod = newActivePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__ACTIVE_PERIOD, oldActivePeriod, newActivePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePeriod(Period newActivePeriod) {
		if (newActivePeriod != activePeriod) {
			NotificationChain msgs = null;
			if (activePeriod != null)
				msgs = ((InternalEObject)activePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__ACTIVE_PERIOD, null, msgs);
			if (newActivePeriod != null)
				msgs = ((InternalEObject)newActivePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__ACTIVE_PERIOD, null, msgs);
			msgs = basicSetActivePeriod(newActivePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__ACTIVE_PERIOD, newActivePeriod, newActivePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getCurrency() {
		return currency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrency(Coding newCurrency, NotificationChain msgs) {
		Coding oldCurrency = currency;
		currency = newCurrency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__CURRENCY, oldCurrency, newCurrency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrency(Coding newCurrency) {
		if (newCurrency != currency) {
			NotificationChain msgs = null;
			if (currency != null)
				msgs = ((InternalEObject)currency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__CURRENCY, null, msgs);
			if (newCurrency != null)
				msgs = ((InternalEObject)newCurrency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__CURRENCY, null, msgs);
			msgs = basicSetCurrency(newCurrency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__CURRENCY, newCurrency, newCurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBalance(Money newBalance, NotificationChain msgs) {
		Money oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__BALANCE, oldBalance, newBalance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(Money newBalance) {
		if (newBalance != balance) {
			NotificationChain msgs = null;
			if (balance != null)
				msgs = ((InternalEObject)balance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__BALANCE, null, msgs);
			if (newBalance != null)
				msgs = ((InternalEObject)newBalance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__BALANCE, null, msgs);
			msgs = basicSetBalance(newBalance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__BALANCE, newBalance, newBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getCoveragePeriod() {
		return coveragePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoveragePeriod(Period newCoveragePeriod, NotificationChain msgs) {
		Period oldCoveragePeriod = coveragePeriod;
		coveragePeriod = newCoveragePeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__COVERAGE_PERIOD, oldCoveragePeriod, newCoveragePeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoveragePeriod(Period newCoveragePeriod) {
		if (newCoveragePeriod != coveragePeriod) {
			NotificationChain msgs = null;
			if (coveragePeriod != null)
				msgs = ((InternalEObject)coveragePeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__COVERAGE_PERIOD, null, msgs);
			if (newCoveragePeriod != null)
				msgs = ((InternalEObject)newCoveragePeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__COVERAGE_PERIOD, null, msgs);
			msgs = basicSetCoveragePeriod(newCoveragePeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__COVERAGE_PERIOD, newCoveragePeriod, newCoveragePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Reference newOwner, NotificationChain msgs) {
		Reference oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Reference newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ACCOUNT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ACCOUNT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ACCOUNT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ACCOUNT__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.ACCOUNT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.ACCOUNT__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ACCOUNT__ACTIVE_PERIOD:
				return basicSetActivePeriod(null, msgs);
			case FhirPackage.ACCOUNT__CURRENCY:
				return basicSetCurrency(null, msgs);
			case FhirPackage.ACCOUNT__BALANCE:
				return basicSetBalance(null, msgs);
			case FhirPackage.ACCOUNT__COVERAGE_PERIOD:
				return basicSetCoveragePeriod(null, msgs);
			case FhirPackage.ACCOUNT__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.ACCOUNT__OWNER:
				return basicSetOwner(null, msgs);
			case FhirPackage.ACCOUNT__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case FhirPackage.ACCOUNT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ACCOUNT__NAME:
				return getName();
			case FhirPackage.ACCOUNT__TYPE:
				return getType();
			case FhirPackage.ACCOUNT__STATUS:
				return getStatus();
			case FhirPackage.ACCOUNT__ACTIVE_PERIOD:
				return getActivePeriod();
			case FhirPackage.ACCOUNT__CURRENCY:
				return getCurrency();
			case FhirPackage.ACCOUNT__BALANCE:
				return getBalance();
			case FhirPackage.ACCOUNT__COVERAGE_PERIOD:
				return getCoveragePeriod();
			case FhirPackage.ACCOUNT__SUBJECT:
				return getSubject();
			case FhirPackage.ACCOUNT__OWNER:
				return getOwner();
			case FhirPackage.ACCOUNT__DESCRIPTION:
				return getDescription();
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
			case FhirPackage.ACCOUNT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ACCOUNT__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ACCOUNT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.ACCOUNT__STATUS:
				setStatus((AccountStatus)newValue);
				return;
			case FhirPackage.ACCOUNT__ACTIVE_PERIOD:
				setActivePeriod((Period)newValue);
				return;
			case FhirPackage.ACCOUNT__CURRENCY:
				setCurrency((Coding)newValue);
				return;
			case FhirPackage.ACCOUNT__BALANCE:
				setBalance((Money)newValue);
				return;
			case FhirPackage.ACCOUNT__COVERAGE_PERIOD:
				setCoveragePeriod((Period)newValue);
				return;
			case FhirPackage.ACCOUNT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.ACCOUNT__OWNER:
				setOwner((Reference)newValue);
				return;
			case FhirPackage.ACCOUNT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
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
			case FhirPackage.ACCOUNT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.ACCOUNT__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ACCOUNT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.ACCOUNT__STATUS:
				setStatus((AccountStatus)null);
				return;
			case FhirPackage.ACCOUNT__ACTIVE_PERIOD:
				setActivePeriod((Period)null);
				return;
			case FhirPackage.ACCOUNT__CURRENCY:
				setCurrency((Coding)null);
				return;
			case FhirPackage.ACCOUNT__BALANCE:
				setBalance((Money)null);
				return;
			case FhirPackage.ACCOUNT__COVERAGE_PERIOD:
				setCoveragePeriod((Period)null);
				return;
			case FhirPackage.ACCOUNT__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.ACCOUNT__OWNER:
				setOwner((Reference)null);
				return;
			case FhirPackage.ACCOUNT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
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
			case FhirPackage.ACCOUNT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.ACCOUNT__NAME:
				return name != null;
			case FhirPackage.ACCOUNT__TYPE:
				return type != null;
			case FhirPackage.ACCOUNT__STATUS:
				return status != null;
			case FhirPackage.ACCOUNT__ACTIVE_PERIOD:
				return activePeriod != null;
			case FhirPackage.ACCOUNT__CURRENCY:
				return currency != null;
			case FhirPackage.ACCOUNT__BALANCE:
				return balance != null;
			case FhirPackage.ACCOUNT__COVERAGE_PERIOD:
				return coveragePeriod != null;
			case FhirPackage.ACCOUNT__SUBJECT:
				return subject != null;
			case FhirPackage.ACCOUNT__OWNER:
				return owner != null;
			case FhirPackage.ACCOUNT__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

} //AccountImpl
