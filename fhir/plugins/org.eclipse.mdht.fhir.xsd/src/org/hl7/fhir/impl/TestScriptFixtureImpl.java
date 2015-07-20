/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.TestScriptFixture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Fixture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestScriptFixtureImpl#getAutocreate <em>Autocreate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptFixtureImpl#getAutodelete <em>Autodelete</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptFixtureImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptFixtureImpl extends BackboneElementImpl implements TestScriptFixture {
	/**
	 * The cached value of the '{@link #getAutocreate() <em>Autocreate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutocreate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean autocreate;

	/**
	 * The cached value of the '{@link #getAutodelete() <em>Autodelete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutodelete()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean autodelete;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Reference resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptFixtureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestScriptFixture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getAutocreate() {
		return autocreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutocreate(org.hl7.fhir.Boolean newAutocreate, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAutocreate = autocreate;
		autocreate = newAutocreate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_FIXTURE__AUTOCREATE, oldAutocreate, newAutocreate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutocreate(org.hl7.fhir.Boolean newAutocreate) {
		if (newAutocreate != autocreate) {
			NotificationChain msgs = null;
			if (autocreate != null)
				msgs = ((InternalEObject)autocreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_FIXTURE__AUTOCREATE, null, msgs);
			if (newAutocreate != null)
				msgs = ((InternalEObject)newAutocreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_FIXTURE__AUTOCREATE, null, msgs);
			msgs = basicSetAutocreate(newAutocreate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_FIXTURE__AUTOCREATE, newAutocreate, newAutocreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getAutodelete() {
		return autodelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutodelete(org.hl7.fhir.Boolean newAutodelete, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAutodelete = autodelete;
		autodelete = newAutodelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_FIXTURE__AUTODELETE, oldAutodelete, newAutodelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutodelete(org.hl7.fhir.Boolean newAutodelete) {
		if (newAutodelete != autodelete) {
			NotificationChain msgs = null;
			if (autodelete != null)
				msgs = ((InternalEObject)autodelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_FIXTURE__AUTODELETE, null, msgs);
			if (newAutodelete != null)
				msgs = ((InternalEObject)newAutodelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_FIXTURE__AUTODELETE, null, msgs);
			msgs = basicSetAutodelete(newAutodelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_FIXTURE__AUTODELETE, newAutodelete, newAutodelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Reference newResource, NotificationChain msgs) {
		Reference oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_FIXTURE__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Reference newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_FIXTURE__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_FIXTURE__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_FIXTURE__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_FIXTURE__AUTOCREATE:
				return basicSetAutocreate(null, msgs);
			case FhirPackage.TEST_SCRIPT_FIXTURE__AUTODELETE:
				return basicSetAutodelete(null, msgs);
			case FhirPackage.TEST_SCRIPT_FIXTURE__RESOURCE:
				return basicSetResource(null, msgs);
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
			case FhirPackage.TEST_SCRIPT_FIXTURE__AUTOCREATE:
				return getAutocreate();
			case FhirPackage.TEST_SCRIPT_FIXTURE__AUTODELETE:
				return getAutodelete();
			case FhirPackage.TEST_SCRIPT_FIXTURE__RESOURCE:
				return getResource();
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
			case FhirPackage.TEST_SCRIPT_FIXTURE__AUTOCREATE:
				setAutocreate((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_FIXTURE__AUTODELETE:
				setAutodelete((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_FIXTURE__RESOURCE:
				setResource((Reference)newValue);
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
			case FhirPackage.TEST_SCRIPT_FIXTURE__AUTOCREATE:
				setAutocreate((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TEST_SCRIPT_FIXTURE__AUTODELETE:
				setAutodelete((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TEST_SCRIPT_FIXTURE__RESOURCE:
				setResource((Reference)null);
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
			case FhirPackage.TEST_SCRIPT_FIXTURE__AUTOCREATE:
				return autocreate != null;
			case FhirPackage.TEST_SCRIPT_FIXTURE__AUTODELETE:
				return autodelete != null;
			case FhirPackage.TEST_SCRIPT_FIXTURE__RESOURCE:
				return resource != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptFixtureImpl
