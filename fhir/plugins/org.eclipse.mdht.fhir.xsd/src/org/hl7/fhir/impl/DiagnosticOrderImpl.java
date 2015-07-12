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

import org.hl7.fhir.DiagnosticOrder;
import org.hl7.fhir.DiagnosticOrderEvent;
import org.hl7.fhir.DiagnosticOrderItem;
import org.hl7.fhir.DiagnosticOrderPriority;
import org.hl7.fhir.DiagnosticOrderStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderImpl#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderImpl#getClinicalNotes <em>Clinical Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderImpl#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DiagnosticOrderImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosticOrderImpl extends DomainResourceImpl implements DiagnosticOrder {
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
	 * The cached value of the '{@link #getClinicalNotes() <em>Clinical Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalNotes()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String clinicalNotes;

	/**
	 * The cached value of the '{@link #getSupportingInformation() <em>Supporting Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> supportingInformation;

	/**
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> specimen;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected DiagnosticOrderStatus status;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected DiagnosticOrderPriority priority;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticOrderEvent> event;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagnosticOrderItem> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDiagnosticOrder();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER__ORDERER, oldOrderer, newOrderer);
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
				msgs = ((InternalEObject)orderer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER__ORDERER, null, msgs);
			if (newOrderer != null)
				msgs = ((InternalEObject)newOrderer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER__ORDERER, null, msgs);
			msgs = basicSetOrderer(newOrderer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER__ORDERER, newOrderer, newOrderer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.DIAGNOSTIC_ORDER__IDENTIFIER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER__ENCOUNTER, oldEncounter, newEncounter);
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
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getClinicalNotes() {
		return clinicalNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalNotes(org.hl7.fhir.String newClinicalNotes, NotificationChain msgs) {
		org.hl7.fhir.String oldClinicalNotes = clinicalNotes;
		clinicalNotes = newClinicalNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER__CLINICAL_NOTES, oldClinicalNotes, newClinicalNotes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalNotes(org.hl7.fhir.String newClinicalNotes) {
		if (newClinicalNotes != clinicalNotes) {
			NotificationChain msgs = null;
			if (clinicalNotes != null)
				msgs = ((InternalEObject)clinicalNotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER__CLINICAL_NOTES, null, msgs);
			if (newClinicalNotes != null)
				msgs = ((InternalEObject)newClinicalNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER__CLINICAL_NOTES, null, msgs);
			msgs = basicSetClinicalNotes(newClinicalNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER__CLINICAL_NOTES, newClinicalNotes, newClinicalNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSupportingInformation() {
		if (supportingInformation == null) {
			supportingInformation = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_ORDER__SUPPORTING_INFORMATION);
		}
		return supportingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSpecimen() {
		if (specimen == null) {
			specimen = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.DIAGNOSTIC_ORDER__SPECIMEN);
		}
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(DiagnosticOrderStatus newStatus, NotificationChain msgs) {
		DiagnosticOrderStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(DiagnosticOrderStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrderPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(DiagnosticOrderPriority newPriority, NotificationChain msgs) {
		DiagnosticOrderPriority oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(DiagnosticOrderPriority newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DIAGNOSTIC_ORDER__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DIAGNOSTIC_ORDER__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticOrderEvent> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<DiagnosticOrderEvent>(DiagnosticOrderEvent.class, this, FhirPackage.DIAGNOSTIC_ORDER__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticOrderItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<DiagnosticOrderItem>(DiagnosticOrderItem.class, this, FhirPackage.DIAGNOSTIC_ORDER__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DIAGNOSTIC_ORDER__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER__ORDERER:
				return basicSetOrderer(null, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER__CLINICAL_NOTES:
				return basicSetClinicalNotes(null, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER__SUPPORTING_INFORMATION:
				return ((InternalEList<?>)getSupportingInformation()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER__SPECIMEN:
				return ((InternalEList<?>)getSpecimen()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER__PRIORITY:
				return basicSetPriority(null, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case FhirPackage.DIAGNOSTIC_ORDER__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DIAGNOSTIC_ORDER__SUBJECT:
				return getSubject();
			case FhirPackage.DIAGNOSTIC_ORDER__ORDERER:
				return getOrderer();
			case FhirPackage.DIAGNOSTIC_ORDER__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DIAGNOSTIC_ORDER__ENCOUNTER:
				return getEncounter();
			case FhirPackage.DIAGNOSTIC_ORDER__CLINICAL_NOTES:
				return getClinicalNotes();
			case FhirPackage.DIAGNOSTIC_ORDER__SUPPORTING_INFORMATION:
				return getSupportingInformation();
			case FhirPackage.DIAGNOSTIC_ORDER__SPECIMEN:
				return getSpecimen();
			case FhirPackage.DIAGNOSTIC_ORDER__STATUS:
				return getStatus();
			case FhirPackage.DIAGNOSTIC_ORDER__PRIORITY:
				return getPriority();
			case FhirPackage.DIAGNOSTIC_ORDER__EVENT:
				return getEvent();
			case FhirPackage.DIAGNOSTIC_ORDER__ITEM:
				return getItem();
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
			case FhirPackage.DIAGNOSTIC_ORDER__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__ORDERER:
				setOrderer((Reference)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__ENCOUNTER:
				setEncounter((Reference)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__CLINICAL_NOTES:
				setClinicalNotes((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				getSupportingInformation().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__SPECIMEN:
				getSpecimen().clear();
				getSpecimen().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__STATUS:
				setStatus((DiagnosticOrderStatus)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__PRIORITY:
				setPriority((DiagnosticOrderPriority)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends DiagnosticOrderEvent>)newValue);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends DiagnosticOrderItem>)newValue);
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
			case FhirPackage.DIAGNOSTIC_ORDER__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__ORDERER:
				setOrderer((Reference)null);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__ENCOUNTER:
				setEncounter((Reference)null);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__CLINICAL_NOTES:
				setClinicalNotes((org.hl7.fhir.String)null);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__SUPPORTING_INFORMATION:
				getSupportingInformation().clear();
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__SPECIMEN:
				getSpecimen().clear();
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__STATUS:
				setStatus((DiagnosticOrderStatus)null);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__PRIORITY:
				setPriority((DiagnosticOrderPriority)null);
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__EVENT:
				getEvent().clear();
				return;
			case FhirPackage.DIAGNOSTIC_ORDER__ITEM:
				getItem().clear();
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
			case FhirPackage.DIAGNOSTIC_ORDER__SUBJECT:
				return subject != null;
			case FhirPackage.DIAGNOSTIC_ORDER__ORDERER:
				return orderer != null;
			case FhirPackage.DIAGNOSTIC_ORDER__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.DIAGNOSTIC_ORDER__ENCOUNTER:
				return encounter != null;
			case FhirPackage.DIAGNOSTIC_ORDER__CLINICAL_NOTES:
				return clinicalNotes != null;
			case FhirPackage.DIAGNOSTIC_ORDER__SUPPORTING_INFORMATION:
				return supportingInformation != null && !supportingInformation.isEmpty();
			case FhirPackage.DIAGNOSTIC_ORDER__SPECIMEN:
				return specimen != null && !specimen.isEmpty();
			case FhirPackage.DIAGNOSTIC_ORDER__STATUS:
				return status != null;
			case FhirPackage.DIAGNOSTIC_ORDER__PRIORITY:
				return priority != null;
			case FhirPackage.DIAGNOSTIC_ORDER__EVENT:
				return event != null && !event.isEmpty();
			case FhirPackage.DIAGNOSTIC_ORDER__ITEM:
				return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagnosticOrderImpl
