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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Contract;
import org.hl7.fhir.ContractActor;
import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.ContractRule;
import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getActionReason <em>Action Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getValuedItem <em>Valued Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getSigner <em>Signer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getBindingAttachment <em>Binding Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getBindingReference <em>Binding Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getFriendly <em>Friendly</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getLegal <em>Legal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends DomainResourceImpl implements Contract {
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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subject;

	/**
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> authority;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> domain;

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
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subType;

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
	protected EList<ContractActor> actor;

	/**
	 * The cached value of the '{@link #getValuedItem() <em>Valued Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuedItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractValuedItem> valuedItem;

	/**
	 * The cached value of the '{@link #getSigner() <em>Signer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigner()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractSigner> signer;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractTerm> term;

	/**
	 * The cached value of the '{@link #getBindingAttachment() <em>Binding Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment bindingAttachment;

	/**
	 * The cached value of the '{@link #getBindingReference() <em>Binding Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingReference()
	 * @generated
	 * @ordered
	 */
	protected Reference bindingReference;

	/**
	 * The cached value of the '{@link #getFriendly() <em>Friendly</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendly()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractFriendly> friendly;

	/**
	 * The cached value of the '{@link #getLegal() <em>Legal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegal()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractLegal> legal;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractRule> rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getContract();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__ISSUED, oldIssued, newIssued);
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
				msgs = ((InternalEObject)issued).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__ISSUED, null, msgs);
			if (newIssued != null)
				msgs = ((InternalEObject)newIssued).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__ISSUED, null, msgs);
			msgs = basicSetIssued(newIssued, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__ISSUED, newIssued, newIssued));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__APPLIES, oldApplies, newApplies);
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
				msgs = ((InternalEObject)applies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__APPLIES, null, msgs);
			if (newApplies != null)
				msgs = ((InternalEObject)newApplies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__APPLIES, null, msgs);
			msgs = basicSetApplies(newApplies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__APPLIES, newApplies, newApplies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSubject() {
		if (subject == null) {
			subject = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAuthority() {
		if (authority == null) {
			authority = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT__AUTHORITY);
		}
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getDomain() {
		if (domain == null) {
			domain = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.CONTRACT__DOMAIN);
		}
		return domain;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSubType() {
		if (subType == null) {
			subType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT__SUB_TYPE);
		}
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT__ACTION);
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
			actionReason = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CONTRACT__ACTION_REASON);
		}
		return actionReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractActor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<ContractActor>(ContractActor.class, this, FhirPackage.CONTRACT__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractValuedItem> getValuedItem() {
		if (valuedItem == null) {
			valuedItem = new EObjectContainmentEList<ContractValuedItem>(ContractValuedItem.class, this, FhirPackage.CONTRACT__VALUED_ITEM);
		}
		return valuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractSigner> getSigner() {
		if (signer == null) {
			signer = new EObjectContainmentEList<ContractSigner>(ContractSigner.class, this, FhirPackage.CONTRACT__SIGNER);
		}
		return signer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractTerm> getTerm() {
		if (term == null) {
			term = new EObjectContainmentEList<ContractTerm>(ContractTerm.class, this, FhirPackage.CONTRACT__TERM);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getBindingAttachment() {
		return bindingAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingAttachment(Attachment newBindingAttachment, NotificationChain msgs) {
		Attachment oldBindingAttachment = bindingAttachment;
		bindingAttachment = newBindingAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__BINDING_ATTACHMENT, oldBindingAttachment, newBindingAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingAttachment(Attachment newBindingAttachment) {
		if (newBindingAttachment != bindingAttachment) {
			NotificationChain msgs = null;
			if (bindingAttachment != null)
				msgs = ((InternalEObject)bindingAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__BINDING_ATTACHMENT, null, msgs);
			if (newBindingAttachment != null)
				msgs = ((InternalEObject)newBindingAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__BINDING_ATTACHMENT, null, msgs);
			msgs = basicSetBindingAttachment(newBindingAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__BINDING_ATTACHMENT, newBindingAttachment, newBindingAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getBindingReference() {
		return bindingReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingReference(Reference newBindingReference, NotificationChain msgs) {
		Reference oldBindingReference = bindingReference;
		bindingReference = newBindingReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__BINDING_REFERENCE, oldBindingReference, newBindingReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingReference(Reference newBindingReference) {
		if (newBindingReference != bindingReference) {
			NotificationChain msgs = null;
			if (bindingReference != null)
				msgs = ((InternalEObject)bindingReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__BINDING_REFERENCE, null, msgs);
			if (newBindingReference != null)
				msgs = ((InternalEObject)newBindingReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT__BINDING_REFERENCE, null, msgs);
			msgs = basicSetBindingReference(newBindingReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT__BINDING_REFERENCE, newBindingReference, newBindingReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractFriendly> getFriendly() {
		if (friendly == null) {
			friendly = new EObjectContainmentEList<ContractFriendly>(ContractFriendly.class, this, FhirPackage.CONTRACT__FRIENDLY);
		}
		return friendly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractLegal> getLegal() {
		if (legal == null) {
			legal = new EObjectContainmentEList<ContractLegal>(ContractLegal.class, this, FhirPackage.CONTRACT__LEGAL);
		}
		return legal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractRule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<ContractRule>(ContractRule.class, this, FhirPackage.CONTRACT__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONTRACT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.CONTRACT__ISSUED:
				return basicSetIssued(null, msgs);
			case FhirPackage.CONTRACT__APPLIES:
				return basicSetApplies(null, msgs);
			case FhirPackage.CONTRACT__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__AUTHORITY:
				return ((InternalEList<?>)getAuthority()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__DOMAIN:
				return ((InternalEList<?>)getDomain()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CONTRACT__SUB_TYPE:
				return ((InternalEList<?>)getSubType()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__ACTION_REASON:
				return ((InternalEList<?>)getActionReason()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__VALUED_ITEM:
				return ((InternalEList<?>)getValuedItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__SIGNER:
				return ((InternalEList<?>)getSigner()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__BINDING_ATTACHMENT:
				return basicSetBindingAttachment(null, msgs);
			case FhirPackage.CONTRACT__BINDING_REFERENCE:
				return basicSetBindingReference(null, msgs);
			case FhirPackage.CONTRACT__FRIENDLY:
				return ((InternalEList<?>)getFriendly()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__LEGAL:
				return ((InternalEList<?>)getLegal()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONTRACT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.CONTRACT__ISSUED:
				return getIssued();
			case FhirPackage.CONTRACT__APPLIES:
				return getApplies();
			case FhirPackage.CONTRACT__SUBJECT:
				return getSubject();
			case FhirPackage.CONTRACT__AUTHORITY:
				return getAuthority();
			case FhirPackage.CONTRACT__DOMAIN:
				return getDomain();
			case FhirPackage.CONTRACT__TYPE:
				return getType();
			case FhirPackage.CONTRACT__SUB_TYPE:
				return getSubType();
			case FhirPackage.CONTRACT__ACTION:
				return getAction();
			case FhirPackage.CONTRACT__ACTION_REASON:
				return getActionReason();
			case FhirPackage.CONTRACT__ACTOR:
				return getActor();
			case FhirPackage.CONTRACT__VALUED_ITEM:
				return getValuedItem();
			case FhirPackage.CONTRACT__SIGNER:
				return getSigner();
			case FhirPackage.CONTRACT__TERM:
				return getTerm();
			case FhirPackage.CONTRACT__BINDING_ATTACHMENT:
				return getBindingAttachment();
			case FhirPackage.CONTRACT__BINDING_REFERENCE:
				return getBindingReference();
			case FhirPackage.CONTRACT__FRIENDLY:
				return getFriendly();
			case FhirPackage.CONTRACT__LEGAL:
				return getLegal();
			case FhirPackage.CONTRACT__RULE:
				return getRule();
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
			case FhirPackage.CONTRACT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.CONTRACT__ISSUED:
				setIssued((DateTime)newValue);
				return;
			case FhirPackage.CONTRACT__APPLIES:
				setApplies((Period)newValue);
				return;
			case FhirPackage.CONTRACT__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT__AUTHORITY:
				getAuthority().clear();
				getAuthority().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.CONTRACT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.CONTRACT__SUB_TYPE:
				getSubType().clear();
				getSubType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT__ACTION_REASON:
				getActionReason().clear();
				getActionReason().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CONTRACT__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends ContractActor>)newValue);
				return;
			case FhirPackage.CONTRACT__VALUED_ITEM:
				getValuedItem().clear();
				getValuedItem().addAll((Collection<? extends ContractValuedItem>)newValue);
				return;
			case FhirPackage.CONTRACT__SIGNER:
				getSigner().clear();
				getSigner().addAll((Collection<? extends ContractSigner>)newValue);
				return;
			case FhirPackage.CONTRACT__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends ContractTerm>)newValue);
				return;
			case FhirPackage.CONTRACT__BINDING_ATTACHMENT:
				setBindingAttachment((Attachment)newValue);
				return;
			case FhirPackage.CONTRACT__BINDING_REFERENCE:
				setBindingReference((Reference)newValue);
				return;
			case FhirPackage.CONTRACT__FRIENDLY:
				getFriendly().clear();
				getFriendly().addAll((Collection<? extends ContractFriendly>)newValue);
				return;
			case FhirPackage.CONTRACT__LEGAL:
				getLegal().clear();
				getLegal().addAll((Collection<? extends ContractLegal>)newValue);
				return;
			case FhirPackage.CONTRACT__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends ContractRule>)newValue);
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
			case FhirPackage.CONTRACT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.CONTRACT__ISSUED:
				setIssued((DateTime)null);
				return;
			case FhirPackage.CONTRACT__APPLIES:
				setApplies((Period)null);
				return;
			case FhirPackage.CONTRACT__SUBJECT:
				getSubject().clear();
				return;
			case FhirPackage.CONTRACT__AUTHORITY:
				getAuthority().clear();
				return;
			case FhirPackage.CONTRACT__DOMAIN:
				getDomain().clear();
				return;
			case FhirPackage.CONTRACT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.CONTRACT__SUB_TYPE:
				getSubType().clear();
				return;
			case FhirPackage.CONTRACT__ACTION:
				getAction().clear();
				return;
			case FhirPackage.CONTRACT__ACTION_REASON:
				getActionReason().clear();
				return;
			case FhirPackage.CONTRACT__ACTOR:
				getActor().clear();
				return;
			case FhirPackage.CONTRACT__VALUED_ITEM:
				getValuedItem().clear();
				return;
			case FhirPackage.CONTRACT__SIGNER:
				getSigner().clear();
				return;
			case FhirPackage.CONTRACT__TERM:
				getTerm().clear();
				return;
			case FhirPackage.CONTRACT__BINDING_ATTACHMENT:
				setBindingAttachment((Attachment)null);
				return;
			case FhirPackage.CONTRACT__BINDING_REFERENCE:
				setBindingReference((Reference)null);
				return;
			case FhirPackage.CONTRACT__FRIENDLY:
				getFriendly().clear();
				return;
			case FhirPackage.CONTRACT__LEGAL:
				getLegal().clear();
				return;
			case FhirPackage.CONTRACT__RULE:
				getRule().clear();
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
			case FhirPackage.CONTRACT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.CONTRACT__ISSUED:
				return issued != null;
			case FhirPackage.CONTRACT__APPLIES:
				return applies != null;
			case FhirPackage.CONTRACT__SUBJECT:
				return subject != null && !subject.isEmpty();
			case FhirPackage.CONTRACT__AUTHORITY:
				return authority != null && !authority.isEmpty();
			case FhirPackage.CONTRACT__DOMAIN:
				return domain != null && !domain.isEmpty();
			case FhirPackage.CONTRACT__TYPE:
				return type != null;
			case FhirPackage.CONTRACT__SUB_TYPE:
				return subType != null && !subType.isEmpty();
			case FhirPackage.CONTRACT__ACTION:
				return action != null && !action.isEmpty();
			case FhirPackage.CONTRACT__ACTION_REASON:
				return actionReason != null && !actionReason.isEmpty();
			case FhirPackage.CONTRACT__ACTOR:
				return actor != null && !actor.isEmpty();
			case FhirPackage.CONTRACT__VALUED_ITEM:
				return valuedItem != null && !valuedItem.isEmpty();
			case FhirPackage.CONTRACT__SIGNER:
				return signer != null && !signer.isEmpty();
			case FhirPackage.CONTRACT__TERM:
				return term != null && !term.isEmpty();
			case FhirPackage.CONTRACT__BINDING_ATTACHMENT:
				return bindingAttachment != null;
			case FhirPackage.CONTRACT__BINDING_REFERENCE:
				return bindingReference != null;
			case FhirPackage.CONTRACT__FRIENDLY:
				return friendly != null && !friendly.isEmpty();
			case FhirPackage.CONTRACT__LEGAL:
				return legal != null && !legal.isEmpty();
			case FhirPackage.CONTRACT__RULE:
				return rule != null && !rule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractImpl
