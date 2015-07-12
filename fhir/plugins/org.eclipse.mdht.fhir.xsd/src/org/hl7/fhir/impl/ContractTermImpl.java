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
import org.hl7.fhir.ContractActor1;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem1;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getActionReason <em>Action Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getValuedItem <em>Valued Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractTermImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractTermImpl extends BackboneElementImpl implements ContractTerm {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected DateTime issued;

	/**
	 * The cached value of the '{@link #getApplies() <em>Applies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplies()
	 * @generated
	 * @ordered
	 */
	protected Period applies;

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
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept subType;

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
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> action;

	/**
	 * The cached value of the '{@link #getActionReason() <em>Action Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionReason()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> actionReason;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractActor1> actor;

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
	 * The cached value of the '{@link #getValuedItem() <em>Valued Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuedItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractValuedItem1> valuedItem;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTerm> group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getContractTerm();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssued(DateTime newIssued, NotificationChain msgs) {
		DateTime oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__ISSUED, oldIssued, newIssued);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(DateTime newIssued) {
		if (newIssued != issued) {
			NotificationChain msgs = null;
			if (issued != null)
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__ISSUED, newIssued, newIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getApplies() {
		return applies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplies(Period newApplies, NotificationChain msgs) {
		Period oldApplies = applies;
		applies = newApplies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__APPLIES, oldApplies, newApplies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplies(Period newApplies) {
		if (newApplies != applies) {
			NotificationChain msgs = null;
			if (applies != null)
				msgs = ((InternalEObject)applies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__APPLIES, null, msgs);
			if (newApplies != null)
				msgs = ((InternalEObject)newApplies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__APPLIES, null, msgs);
			msgs = basicSetApplies(newApplies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__APPLIES, newApplies, newApplies));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSubType() {
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubType(CodeableConcept newSubType, NotificationChain msgs) {
		CodeableConcept oldSubType = subType;
		subType = newSubType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__SUB_TYPE, oldSubType, newSubType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubType(CodeableConcept newSubType) {
		if (newSubType != subType) {
			NotificationChain msgs = null;
			if (subType != null)
				msgs = ((InternalEObject)subType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__SUB_TYPE, null, msgs);
			if (newSubType != null)
				msgs = ((InternalEObject)newSubType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__SUB_TYPE, null, msgs);
			msgs = basicSetSubType(newSubType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__SUB_TYPE, newSubType, newSubType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT_TERM__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getActionReason() {
		if (actionReason == null) {
			actionReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT_TERM__ACTION_REASON);
		}
		return actionReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractActor1> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<ContractActor1>(ContractActor1.class, this, FhirPackage.CONTRACT_TERM__ACTOR);
		}
		return actor;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_TERM__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_TERM__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractValuedItem1> getValuedItem() {
		if (valuedItem == null) {
			valuedItem = new EObjectContainmentEList<ContractValuedItem1>(ContractValuedItem1.class, this, FhirPackage.CONTRACT_TERM__VALUED_ITEM);
		}
		return valuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTerm> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<ContractTerm>(ContractTerm.class, this, FhirPackage.CONTRACT_TERM__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONTRACT_TERM__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.CONTRACT_TERM__ISSUED:
				return basicSetIssued(null, msgs);
			case FhirPackage.CONTRACT_TERM__APPLIES:
				return basicSetApplies(null, msgs);
			case FhirPackage.CONTRACT_TERM__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CONTRACT_TERM__SUB_TYPE:
				return basicSetSubType(null, msgs);
			case FhirPackage.CONTRACT_TERM__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.CONTRACT_TERM__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_TERM__ACTION_REASON:
				return ((InternalEList<?>)getActionReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_TERM__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_TERM__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.CONTRACT_TERM__VALUED_ITEM:
				return ((InternalEList<?>)getValuedItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_TERM__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONTRACT_TERM__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONTRACT_TERM__ISSUED:
				return getIssued();
			case FhirPackage.CONTRACT_TERM__APPLIES:
				return getApplies();
			case FhirPackage.CONTRACT_TERM__TYPE:
				return getType();
			case FhirPackage.CONTRACT_TERM__SUB_TYPE:
				return getSubType();
			case FhirPackage.CONTRACT_TERM__SUBJECT:
				return getSubject();
			case FhirPackage.CONTRACT_TERM__ACTION:
				return getAction();
			case FhirPackage.CONTRACT_TERM__ACTION_REASON:
				return getActionReason();
			case FhirPackage.CONTRACT_TERM__ACTOR:
				return getActor();
			case FhirPackage.CONTRACT_TERM__TEXT:
				return getText();
			case FhirPackage.CONTRACT_TERM__VALUED_ITEM:
				return getValuedItem();
			case FhirPackage.CONTRACT_TERM__GROUP:
				return getGroup();
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
			case FhirPackage.CONTRACT_TERM__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__ISSUED:
				setIssued((DateTime)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__APPLIES:
				setApplies((Period)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__SUB_TYPE:
				setSubType((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__ACTION_REASON:
				getActionReason().clear();
				getActionReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends ContractActor1>)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__VALUED_ITEM:
				getValuedItem().clear();
				getValuedItem().addAll((Collection<? extends ContractValuedItem1>)newValue);
				return;
			case FhirPackage.CONTRACT_TERM__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends ContractTerm>)newValue);
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
			case FhirPackage.CONTRACT_TERM__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.CONTRACT_TERM__ISSUED:
				setIssued((DateTime)null);
				return;
			case FhirPackage.CONTRACT_TERM__APPLIES:
				setApplies((Period)null);
				return;
			case FhirPackage.CONTRACT_TERM__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_TERM__SUB_TYPE:
				setSubType((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT_TERM__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.CONTRACT_TERM__ACTION:
				getAction().clear();
				return;
			case FhirPackage.CONTRACT_TERM__ACTION_REASON:
				getActionReason().clear();
				return;
			case FhirPackage.CONTRACT_TERM__ACTOR:
				getActor().clear();
				return;
			case FhirPackage.CONTRACT_TERM__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONTRACT_TERM__VALUED_ITEM:
				getValuedItem().clear();
				return;
			case FhirPackage.CONTRACT_TERM__GROUP:
				getGroup().clear();
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
			case FhirPackage.CONTRACT_TERM__IDENTIFIER:
				return identifier != null;
			case FhirPackage.CONTRACT_TERM__ISSUED:
				return issued != null;
			case FhirPackage.CONTRACT_TERM__APPLIES:
				return applies != null;
			case FhirPackage.CONTRACT_TERM__TYPE:
				return type != null;
			case FhirPackage.CONTRACT_TERM__SUB_TYPE:
				return subType != null;
			case FhirPackage.CONTRACT_TERM__SUBJECT:
				return subject != null;
			case FhirPackage.CONTRACT_TERM__ACTION:
				return action != null && !action.isEmpty();
			case FhirPackage.CONTRACT_TERM__ACTION_REASON:
				return actionReason != null && !actionReason.isEmpty();
			case FhirPackage.CONTRACT_TERM__ACTOR:
				return actor != null && !actor.isEmpty();
			case FhirPackage.CONTRACT_TERM__TEXT:
				return text != null;
			case FhirPackage.CONTRACT_TERM__VALUED_ITEM:
				return valuedItem != null && !valuedItem.isEmpty();
			case FhirPackage.CONTRACT_TERM__GROUP:
				return group != null && !group.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractTermImpl
