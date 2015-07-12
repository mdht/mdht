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

import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.AuditEventEvent;
import org.hl7.fhir.AuditEventObject;
import org.hl7.fhir.AuditEventParticipant;
import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audit Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.AuditEventImpl#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventImpl extends DomainResourceImpl implements AuditEvent {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected AuditEventEvent event;

	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventParticipant> participant;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected AuditEventSource source;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<AuditEventObject> object;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getAuditEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventEvent getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(AuditEventEvent newEvent, NotificationChain msgs) {
		AuditEventEvent oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(AuditEventEvent newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditEventParticipant> getParticipant() {
		if (participant == null) {
			participant = new EObjectContainmentEList<AuditEventParticipant>(AuditEventParticipant.class, this, FhirPackage.AUDIT_EVENT__PARTICIPANT);
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEventSource getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AuditEventSource newSource, NotificationChain msgs) {
		AuditEventSource oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AuditEventSource newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.AUDIT_EVENT__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.AUDIT_EVENT__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuditEventObject> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<AuditEventObject>(AuditEventObject.class, this, FhirPackage.AUDIT_EVENT__OBJECT);
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.AUDIT_EVENT__EVENT:
				return basicSetEvent(null, msgs);
			case FhirPackage.AUDIT_EVENT__PARTICIPANT:
				return ((InternalEList<?>)getParticipant()).basicRemove(otherEnd, msgs);
			case FhirPackage.AUDIT_EVENT__SOURCE:
				return basicSetSource(null, msgs);
			case FhirPackage.AUDIT_EVENT__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.AUDIT_EVENT__EVENT:
				return getEvent();
			case FhirPackage.AUDIT_EVENT__PARTICIPANT:
				return getParticipant();
			case FhirPackage.AUDIT_EVENT__SOURCE:
				return getSource();
			case FhirPackage.AUDIT_EVENT__OBJECT:
				return getObject();
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
			case FhirPackage.AUDIT_EVENT__EVENT:
				setEvent((AuditEventEvent)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__PARTICIPANT:
				getParticipant().clear();
				getParticipant().addAll((Collection<? extends AuditEventParticipant>)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__SOURCE:
				setSource((AuditEventSource)newValue);
				return;
			case FhirPackage.AUDIT_EVENT__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends AuditEventObject>)newValue);
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
			case FhirPackage.AUDIT_EVENT__EVENT:
				setEvent((AuditEventEvent)null);
				return;
			case FhirPackage.AUDIT_EVENT__PARTICIPANT:
				getParticipant().clear();
				return;
			case FhirPackage.AUDIT_EVENT__SOURCE:
				setSource((AuditEventSource)null);
				return;
			case FhirPackage.AUDIT_EVENT__OBJECT:
				getObject().clear();
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
			case FhirPackage.AUDIT_EVENT__EVENT:
				return event != null;
			case FhirPackage.AUDIT_EVENT__PARTICIPANT:
				return participant != null && !participant.isEmpty();
			case FhirPackage.AUDIT_EVENT__SOURCE:
				return source != null;
			case FhirPackage.AUDIT_EVENT__OBJECT:
				return object != null && !object.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventImpl
