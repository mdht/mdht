/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents;
import org.openhealthtools.mdht.emf.hl7.mif2.EnvironmentalOccurrence;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.TransitionRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Trigger Events</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceTriggerEventsImpl#getInternalMapping <em>Internal Mapping</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceTriggerEventsImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceTriggerEventsImpl#getStateTransition <em>State Transition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceTriggerEventsImpl#getEnvironmentalOccurrence <em>Environmental Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConformanceTriggerEventsImpl extends PackageRefImpl implements ConformanceTriggerEvents {
	/**
	 * The cached value of the '{@link #getInternalMapping() <em>Internal Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalMapping()
	 * @generated
	 * @ordered
	 */
	protected ComplexMarkupWithLanguage internalMapping;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected PackageRef interaction;

	/**
	 * The cached value of the '{@link #getStateTransition() <em>State Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTransition()
	 * @generated
	 * @ordered
	 */
	protected TransitionRef stateTransition;

	/**
	 * The cached value of the '{@link #getEnvironmentalOccurrence() <em>Environmental Occurrence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentalOccurrence()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentalOccurrence environmentalOccurrence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceTriggerEventsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONFORMANCE_TRIGGER_EVENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMarkupWithLanguage getInternalMapping() {
		return internalMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalMapping(ComplexMarkupWithLanguage newInternalMapping, NotificationChain msgs) {
		ComplexMarkupWithLanguage oldInternalMapping = internalMapping;
		internalMapping = newInternalMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERNAL_MAPPING, oldInternalMapping, newInternalMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalMapping(ComplexMarkupWithLanguage newInternalMapping) {
		if (newInternalMapping != internalMapping) {
			NotificationChain msgs = null;
			if (internalMapping != null)
				msgs = ((InternalEObject)internalMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERNAL_MAPPING, null, msgs);
			if (newInternalMapping != null)
				msgs = ((InternalEObject)newInternalMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERNAL_MAPPING, null, msgs);
			msgs = basicSetInternalMapping(newInternalMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERNAL_MAPPING, newInternalMapping, newInternalMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getInteraction() {
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(PackageRef newInteraction, NotificationChain msgs) {
		PackageRef oldInteraction = interaction;
		interaction = newInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERACTION, oldInteraction, newInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(PackageRef newInteraction) {
		if (newInteraction != interaction) {
			NotificationChain msgs = null;
			if (interaction != null)
				msgs = ((InternalEObject)interaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERACTION, null, msgs);
			if (newInteraction != null)
				msgs = ((InternalEObject)newInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERACTION, null, msgs);
			msgs = basicSetInteraction(newInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERACTION, newInteraction, newInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionRef getStateTransition() {
		return stateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateTransition(TransitionRef newStateTransition, NotificationChain msgs) {
		TransitionRef oldStateTransition = stateTransition;
		stateTransition = newStateTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONFORMANCE_TRIGGER_EVENTS__STATE_TRANSITION, oldStateTransition, newStateTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateTransition(TransitionRef newStateTransition) {
		if (newStateTransition != stateTransition) {
			NotificationChain msgs = null;
			if (stateTransition != null)
				msgs = ((InternalEObject)stateTransition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONFORMANCE_TRIGGER_EVENTS__STATE_TRANSITION, null, msgs);
			if (newStateTransition != null)
				msgs = ((InternalEObject)newStateTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONFORMANCE_TRIGGER_EVENTS__STATE_TRANSITION, null, msgs);
			msgs = basicSetStateTransition(newStateTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONFORMANCE_TRIGGER_EVENTS__STATE_TRANSITION, newStateTransition, newStateTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentalOccurrence getEnvironmentalOccurrence() {
		return environmentalOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentalOccurrence(EnvironmentalOccurrence newEnvironmentalOccurrence, NotificationChain msgs) {
		EnvironmentalOccurrence oldEnvironmentalOccurrence = environmentalOccurrence;
		environmentalOccurrence = newEnvironmentalOccurrence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONFORMANCE_TRIGGER_EVENTS__ENVIRONMENTAL_OCCURRENCE, oldEnvironmentalOccurrence, newEnvironmentalOccurrence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironmentalOccurrence(EnvironmentalOccurrence newEnvironmentalOccurrence) {
		if (newEnvironmentalOccurrence != environmentalOccurrence) {
			NotificationChain msgs = null;
			if (environmentalOccurrence != null)
				msgs = ((InternalEObject)environmentalOccurrence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONFORMANCE_TRIGGER_EVENTS__ENVIRONMENTAL_OCCURRENCE, null, msgs);
			if (newEnvironmentalOccurrence != null)
				msgs = ((InternalEObject)newEnvironmentalOccurrence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONFORMANCE_TRIGGER_EVENTS__ENVIRONMENTAL_OCCURRENCE, null, msgs);
			msgs = basicSetEnvironmentalOccurrence(newEnvironmentalOccurrence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONFORMANCE_TRIGGER_EVENTS__ENVIRONMENTAL_OCCURRENCE, newEnvironmentalOccurrence, newEnvironmentalOccurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERNAL_MAPPING:
				return basicSetInternalMapping(null, msgs);
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERACTION:
				return basicSetInteraction(null, msgs);
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__STATE_TRANSITION:
				return basicSetStateTransition(null, msgs);
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__ENVIRONMENTAL_OCCURRENCE:
				return basicSetEnvironmentalOccurrence(null, msgs);
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
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERNAL_MAPPING:
				return getInternalMapping();
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERACTION:
				return getInteraction();
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__STATE_TRANSITION:
				return getStateTransition();
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__ENVIRONMENTAL_OCCURRENCE:
				return getEnvironmentalOccurrence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERNAL_MAPPING:
				setInternalMapping((ComplexMarkupWithLanguage)newValue);
				return;
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERACTION:
				setInteraction((PackageRef)newValue);
				return;
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__STATE_TRANSITION:
				setStateTransition((TransitionRef)newValue);
				return;
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__ENVIRONMENTAL_OCCURRENCE:
				setEnvironmentalOccurrence((EnvironmentalOccurrence)newValue);
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
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERNAL_MAPPING:
				setInternalMapping((ComplexMarkupWithLanguage)null);
				return;
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERACTION:
				setInteraction((PackageRef)null);
				return;
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__STATE_TRANSITION:
				setStateTransition((TransitionRef)null);
				return;
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__ENVIRONMENTAL_OCCURRENCE:
				setEnvironmentalOccurrence((EnvironmentalOccurrence)null);
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
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERNAL_MAPPING:
				return internalMapping != null;
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__INTERACTION:
				return interaction != null;
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__STATE_TRANSITION:
				return stateTransition != null;
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS__ENVIRONMENTAL_OCCURRENCE:
				return environmentalOccurrence != null;
		}
		return super.eIsSet(featureID);
	}

} //ConformanceTriggerEventsImpl
