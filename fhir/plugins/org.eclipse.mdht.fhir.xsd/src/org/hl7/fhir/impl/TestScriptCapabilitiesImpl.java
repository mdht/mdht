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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.TestScriptCapabilities;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilitiesImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilitiesImpl#getValidated <em>Validated</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilitiesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilitiesImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilitiesImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptCapabilitiesImpl#getConformance <em>Conformance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptCapabilitiesImpl extends BackboneElementImpl implements TestScriptCapabilities {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean required;

	/**
	 * The cached value of the '{@link #getValidated() <em>Validated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidated()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean validated;

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
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer destination;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> link;

	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected Reference conformance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestScriptCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(org.hl7.fhir.Boolean newRequired, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_CAPABILITIES__REQUIRED, oldRequired, newRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(org.hl7.fhir.Boolean newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_CAPABILITIES__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_CAPABILITIES__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_CAPABILITIES__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getValidated() {
		return validated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidated(org.hl7.fhir.Boolean newValidated, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldValidated = validated;
		validated = newValidated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_CAPABILITIES__VALIDATED, oldValidated, newValidated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidated(org.hl7.fhir.Boolean newValidated) {
		if (newValidated != validated) {
			NotificationChain msgs = null;
			if (validated != null)
				msgs = ((InternalEObject)validated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_CAPABILITIES__VALIDATED, null, msgs);
			if (newValidated != null)
				msgs = ((InternalEObject)newValidated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_CAPABILITIES__VALIDATED, null, msgs);
			msgs = basicSetValidated(newValidated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_CAPABILITIES__VALIDATED, newValidated, newValidated));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_CAPABILITIES__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_CAPABILITIES__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_CAPABILITIES__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_CAPABILITIES__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(org.hl7.fhir.Integer newDestination, NotificationChain msgs) {
		org.hl7.fhir.Integer oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_CAPABILITIES__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(org.hl7.fhir.Integer newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_CAPABILITIES__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_CAPABILITIES__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_CAPABILITIES__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.TEST_SCRIPT_CAPABILITIES__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getConformance() {
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformance(Reference newConformance, NotificationChain msgs) {
		Reference oldConformance = conformance;
		conformance = newConformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_CAPABILITIES__CONFORMANCE, oldConformance, newConformance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformance(Reference newConformance) {
		if (newConformance != conformance) {
			NotificationChain msgs = null;
			if (conformance != null)
				msgs = ((InternalEObject)conformance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_CAPABILITIES__CONFORMANCE, null, msgs);
			if (newConformance != null)
				msgs = ((InternalEObject)newConformance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_CAPABILITIES__CONFORMANCE, null, msgs);
			msgs = basicSetConformance(newConformance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_CAPABILITIES__CONFORMANCE, newConformance, newConformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__REQUIRED:
				return basicSetRequired(null, msgs);
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__VALIDATED:
				return basicSetValidated(null, msgs);
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__DESTINATION:
				return basicSetDestination(null, msgs);
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__CONFORMANCE:
				return basicSetConformance(null, msgs);
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
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__REQUIRED:
				return getRequired();
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__VALIDATED:
				return getValidated();
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__DESCRIPTION:
				return getDescription();
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__DESTINATION:
				return getDestination();
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__LINK:
				return getLink();
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__CONFORMANCE:
				return getConformance();
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
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__VALIDATED:
				setValidated((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__DESTINATION:
				setDestination((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__CONFORMANCE:
				setConformance((Reference)newValue);
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
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__VALIDATED:
				setValidated((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__DESTINATION:
				setDestination((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__LINK:
				getLink().clear();
				return;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__CONFORMANCE:
				setConformance((Reference)null);
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
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__REQUIRED:
				return required != null;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__VALIDATED:
				return validated != null;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__DESCRIPTION:
				return description != null;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__DESTINATION:
				return destination != null;
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__LINK:
				return link != null && !link.isEmpty();
			case FhirPackage.TEST_SCRIPT_CAPABILITIES__CONFORMANCE:
				return conformance != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptCapabilitiesImpl
