/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.ConformanceSoftware;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Software</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSoftwareImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSoftwareImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceSoftwareImpl#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceSoftwareImpl extends BackboneElementImpl implements ConformanceSoftware {
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
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime releaseDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceSoftwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConformanceSoftware();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SOFTWARE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SOFTWARE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SOFTWARE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SOFTWARE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SOFTWARE__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SOFTWARE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SOFTWARE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SOFTWARE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseDate(DateTime newReleaseDate, NotificationChain msgs) {
		DateTime oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SOFTWARE__RELEASE_DATE, oldReleaseDate, newReleaseDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseDate(DateTime newReleaseDate) {
		if (newReleaseDate != releaseDate) {
			NotificationChain msgs = null;
			if (releaseDate != null)
				msgs = ((InternalEObject)releaseDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SOFTWARE__RELEASE_DATE, null, msgs);
			if (newReleaseDate != null)
				msgs = ((InternalEObject)newReleaseDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_SOFTWARE__RELEASE_DATE, null, msgs);
			msgs = basicSetReleaseDate(newReleaseDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_SOFTWARE__RELEASE_DATE, newReleaseDate, newReleaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONFORMANCE_SOFTWARE__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.CONFORMANCE_SOFTWARE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.CONFORMANCE_SOFTWARE__RELEASE_DATE:
				return basicSetReleaseDate(null, msgs);
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
			case FhirPackage.CONFORMANCE_SOFTWARE__NAME:
				return getName();
			case FhirPackage.CONFORMANCE_SOFTWARE__VERSION:
				return getVersion();
			case FhirPackage.CONFORMANCE_SOFTWARE__RELEASE_DATE:
				return getReleaseDate();
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
			case FhirPackage.CONFORMANCE_SOFTWARE__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE_SOFTWARE__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONFORMANCE_SOFTWARE__RELEASE_DATE:
				setReleaseDate((DateTime)newValue);
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
			case FhirPackage.CONFORMANCE_SOFTWARE__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE_SOFTWARE__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONFORMANCE_SOFTWARE__RELEASE_DATE:
				setReleaseDate((DateTime)null);
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
			case FhirPackage.CONFORMANCE_SOFTWARE__NAME:
				return name != null;
			case FhirPackage.CONFORMANCE_SOFTWARE__VERSION:
				return version != null;
			case FhirPackage.CONFORMANCE_SOFTWARE__RELEASE_DATE:
				return releaseDate != null;
		}
		return super.eIsSet(featureID);
	}

} //ConformanceSoftwareImpl
