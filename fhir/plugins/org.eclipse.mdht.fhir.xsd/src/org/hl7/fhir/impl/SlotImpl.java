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
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Slot;
import org.hl7.fhir.SlotStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getFreeBusyType <em>Free Busy Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getOverbooked <em>Overbooked</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SlotImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotImpl extends DomainResourceImpl implements Slot {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Reference schedule;

	/**
	 * The cached value of the '{@link #getFreeBusyType() <em>Free Busy Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeBusyType()
	 * @generated
	 * @ordered
	 */
	protected SlotStatus freeBusyType;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Instant start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Instant end;

	/**
	 * The cached value of the '{@link #getOverbooked() <em>Overbooked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverbooked()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean overbooked;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSlot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.SLOT__IDENTIFIER);
		}
		return identifier;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Reference newSchedule, NotificationChain msgs) {
		Reference oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__SCHEDULE, oldSchedule, newSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Reference newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__SCHEDULE, null, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__SCHEDULE, null, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotStatus getFreeBusyType() {
		return freeBusyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFreeBusyType(SlotStatus newFreeBusyType, NotificationChain msgs) {
		SlotStatus oldFreeBusyType = freeBusyType;
		freeBusyType = newFreeBusyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__FREE_BUSY_TYPE, oldFreeBusyType, newFreeBusyType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeBusyType(SlotStatus newFreeBusyType) {
		if (newFreeBusyType != freeBusyType) {
			NotificationChain msgs = null;
			if (freeBusyType != null)
				msgs = ((InternalEObject)freeBusyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__FREE_BUSY_TYPE, null, msgs);
			if (newFreeBusyType != null)
				msgs = ((InternalEObject)newFreeBusyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__FREE_BUSY_TYPE, null, msgs);
			msgs = basicSetFreeBusyType(newFreeBusyType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__FREE_BUSY_TYPE, newFreeBusyType, newFreeBusyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Instant newStart, NotificationChain msgs) {
		Instant oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Instant newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Instant newEnd, NotificationChain msgs) {
		Instant oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Instant newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getOverbooked() {
		return overbooked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverbooked(org.hl7.fhir.Boolean newOverbooked, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldOverbooked = overbooked;
		overbooked = newOverbooked;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__OVERBOOKED, oldOverbooked, newOverbooked);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverbooked(org.hl7.fhir.Boolean newOverbooked) {
		if (newOverbooked != overbooked) {
			NotificationChain msgs = null;
			if (overbooked != null)
				msgs = ((InternalEObject)overbooked).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__OVERBOOKED, null, msgs);
			if (newOverbooked != null)
				msgs = ((InternalEObject)newOverbooked).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__OVERBOOKED, null, msgs);
			msgs = basicSetOverbooked(newOverbooked, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__OVERBOOKED, newOverbooked, newOverbooked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.hl7.fhir.String newComment, NotificationChain msgs) {
		org.hl7.fhir.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(org.hl7.fhir.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SLOT__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SLOT__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SLOT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.SLOT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SLOT__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case FhirPackage.SLOT__FREE_BUSY_TYPE:
				return basicSetFreeBusyType(null, msgs);
			case FhirPackage.SLOT__START:
				return basicSetStart(null, msgs);
			case FhirPackage.SLOT__END:
				return basicSetEnd(null, msgs);
			case FhirPackage.SLOT__OVERBOOKED:
				return basicSetOverbooked(null, msgs);
			case FhirPackage.SLOT__COMMENT:
				return basicSetComment(null, msgs);
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
			case FhirPackage.SLOT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.SLOT__TYPE:
				return getType();
			case FhirPackage.SLOT__SCHEDULE:
				return getSchedule();
			case FhirPackage.SLOT__FREE_BUSY_TYPE:
				return getFreeBusyType();
			case FhirPackage.SLOT__START:
				return getStart();
			case FhirPackage.SLOT__END:
				return getEnd();
			case FhirPackage.SLOT__OVERBOOKED:
				return getOverbooked();
			case FhirPackage.SLOT__COMMENT:
				return getComment();
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
			case FhirPackage.SLOT__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.SLOT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SLOT__SCHEDULE:
				setSchedule((Reference)newValue);
				return;
			case FhirPackage.SLOT__FREE_BUSY_TYPE:
				setFreeBusyType((SlotStatus)newValue);
				return;
			case FhirPackage.SLOT__START:
				setStart((Instant)newValue);
				return;
			case FhirPackage.SLOT__END:
				setEnd((Instant)newValue);
				return;
			case FhirPackage.SLOT__OVERBOOKED:
				setOverbooked((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SLOT__COMMENT:
				setComment((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SLOT__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.SLOT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SLOT__SCHEDULE:
				setSchedule((Reference)null);
				return;
			case FhirPackage.SLOT__FREE_BUSY_TYPE:
				setFreeBusyType((SlotStatus)null);
				return;
			case FhirPackage.SLOT__START:
				setStart((Instant)null);
				return;
			case FhirPackage.SLOT__END:
				setEnd((Instant)null);
				return;
			case FhirPackage.SLOT__OVERBOOKED:
				setOverbooked((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SLOT__COMMENT:
				setComment((org.hl7.fhir.String)null);
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
			case FhirPackage.SLOT__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.SLOT__TYPE:
				return type != null;
			case FhirPackage.SLOT__SCHEDULE:
				return schedule != null;
			case FhirPackage.SLOT__FREE_BUSY_TYPE:
				return freeBusyType != null;
			case FhirPackage.SLOT__START:
				return start != null;
			case FhirPackage.SLOT__END:
				return end != null;
			case FhirPackage.SLOT__OVERBOOKED:
				return overbooked != null;
			case FhirPackage.SLOT__COMMENT:
				return comment != null;
		}
		return super.eIsSet(featureID);
	}

} //SlotImpl
