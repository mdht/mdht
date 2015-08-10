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

import org.hl7.fhir.ConformanceEndpoint;
import org.hl7.fhir.ConformanceEvent;
import org.hl7.fhir.ConformanceMessaging;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Messaging</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConformanceMessagingImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceMessagingImpl#getReliableCache <em>Reliable Cache</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceMessagingImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceMessagingImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceMessagingImpl extends BackboneElementImpl implements ConformanceMessaging {
	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceEndpoint> endpoint;

	/**
	 * The cached value of the '{@link #getReliableCache() <em>Reliable Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliableCache()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt reliableCache;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String documentation;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceEvent> event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceMessagingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConformanceMessaging();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceEndpoint> getEndpoint() {
		if (endpoint == null) {
			endpoint = new EObjectContainmentEList<ConformanceEndpoint>(ConformanceEndpoint.class, this, FhirPackage.CONFORMANCE_MESSAGING__ENDPOINT);
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getReliableCache() {
		return reliableCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliableCache(UnsignedInt newReliableCache, NotificationChain msgs) {
		UnsignedInt oldReliableCache = reliableCache;
		reliableCache = newReliableCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE, oldReliableCache, newReliableCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliableCache(UnsignedInt newReliableCache) {
		if (newReliableCache != reliableCache) {
			NotificationChain msgs = null;
			if (reliableCache != null)
				msgs = ((InternalEObject)reliableCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE, null, msgs);
			if (newReliableCache != null)
				msgs = ((InternalEObject)newReliableCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE, null, msgs);
			msgs = basicSetReliableCache(newReliableCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE, newReliableCache, newReliableCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(org.hl7.fhir.String newDocumentation, NotificationChain msgs) {
		org.hl7.fhir.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_MESSAGING__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(org.hl7.fhir.String newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_MESSAGING__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_MESSAGING__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_MESSAGING__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceEvent> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<ConformanceEvent>(ConformanceEvent.class, this, FhirPackage.CONFORMANCE_MESSAGING__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONFORMANCE_MESSAGING__ENDPOINT:
				return ((InternalEList<?>)getEndpoint()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE:
				return basicSetReliableCache(null, msgs);
			case FhirPackage.CONFORMANCE_MESSAGING__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case FhirPackage.CONFORMANCE_MESSAGING__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONFORMANCE_MESSAGING__ENDPOINT:
				return getEndpoint();
			case FhirPackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE:
				return getReliableCache();
			case FhirPackage.CONFORMANCE_MESSAGING__DOCUMENTATION:
				return getDocumentation();
			case FhirPackage.CONFORMANCE_MESSAGING__EVENT:
				return getEvent();
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
			case FhirPackage.CONFORMANCE_MESSAGING__ENDPOINT:
				getEndpoint().clear();
				getEndpoint().addAll((Collection<? extends ConformanceEndpoint>)newValue);
				return;
			case FhirPackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE:
				setReliableCache((UnsignedInt)newValue);
				return;
			case FhirPackage.CONFORMANCE_MESSAGING__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE_MESSAGING__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends ConformanceEvent>)newValue);
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
			case FhirPackage.CONFORMANCE_MESSAGING__ENDPOINT:
				getEndpoint().clear();
				return;
			case FhirPackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE:
				setReliableCache((UnsignedInt)null);
				return;
			case FhirPackage.CONFORMANCE_MESSAGING__DOCUMENTATION:
				setDocumentation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE_MESSAGING__EVENT:
				getEvent().clear();
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
			case FhirPackage.CONFORMANCE_MESSAGING__ENDPOINT:
				return endpoint != null && !endpoint.isEmpty();
			case FhirPackage.CONFORMANCE_MESSAGING__RELIABLE_CACHE:
				return reliableCache != null;
			case FhirPackage.CONFORMANCE_MESSAGING__DOCUMENTATION:
				return documentation != null;
			case FhirPackage.CONFORMANCE_MESSAGING__EVENT:
				return event != null && !event.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConformanceMessagingImpl
