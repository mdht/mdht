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
import org.hl7.fhir.Uri;
import org.hl7.fhir.ValueSetCodeSystem;
import org.hl7.fhir.ValueSetConcept;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Code System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ValueSetCodeSystemImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetCodeSystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetCodeSystemImpl#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetCodeSystemImpl#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetCodeSystemImpl extends BackboneElementImpl implements ValueSetCodeSystem {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri system;

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
	 * The cached value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean caseSensitive;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetConcept> concept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetCodeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getValueSetCodeSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(Uri newSystem, NotificationChain msgs) {
		Uri oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CODE_SYSTEM__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Uri newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CODE_SYSTEM__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CODE_SYSTEM__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CODE_SYSTEM__SYSTEM, newSystem, newSystem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CODE_SYSTEM__VERSION, oldVersion, newVersion);
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
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CODE_SYSTEM__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CODE_SYSTEM__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CODE_SYSTEM__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getCaseSensitive() {
		return caseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseSensitive(org.hl7.fhir.Boolean newCaseSensitive, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldCaseSensitive = caseSensitive;
		caseSensitive = newCaseSensitive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CODE_SYSTEM__CASE_SENSITIVE, oldCaseSensitive, newCaseSensitive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseSensitive(org.hl7.fhir.Boolean newCaseSensitive) {
		if (newCaseSensitive != caseSensitive) {
			NotificationChain msgs = null;
			if (caseSensitive != null)
				msgs = ((InternalEObject)caseSensitive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CODE_SYSTEM__CASE_SENSITIVE, null, msgs);
			if (newCaseSensitive != null)
				msgs = ((InternalEObject)newCaseSensitive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CODE_SYSTEM__CASE_SENSITIVE, null, msgs);
			msgs = basicSetCaseSensitive(newCaseSensitive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CODE_SYSTEM__CASE_SENSITIVE, newCaseSensitive, newCaseSensitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetConcept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<ValueSetConcept>(ValueSetConcept.class, this, FhirPackage.VALUE_SET_CODE_SYSTEM__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VALUE_SET_CODE_SYSTEM__SYSTEM:
				return basicSetSystem(null, msgs);
			case FhirPackage.VALUE_SET_CODE_SYSTEM__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.VALUE_SET_CODE_SYSTEM__CASE_SENSITIVE:
				return basicSetCaseSensitive(null, msgs);
			case FhirPackage.VALUE_SET_CODE_SYSTEM__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.VALUE_SET_CODE_SYSTEM__SYSTEM:
				return getSystem();
			case FhirPackage.VALUE_SET_CODE_SYSTEM__VERSION:
				return getVersion();
			case FhirPackage.VALUE_SET_CODE_SYSTEM__CASE_SENSITIVE:
				return getCaseSensitive();
			case FhirPackage.VALUE_SET_CODE_SYSTEM__CONCEPT:
				return getConcept();
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
			case FhirPackage.VALUE_SET_CODE_SYSTEM__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case FhirPackage.VALUE_SET_CODE_SYSTEM__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET_CODE_SYSTEM__CASE_SENSITIVE:
				setCaseSensitive((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.VALUE_SET_CODE_SYSTEM__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends ValueSetConcept>)newValue);
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
			case FhirPackage.VALUE_SET_CODE_SYSTEM__SYSTEM:
				setSystem((Uri)null);
				return;
			case FhirPackage.VALUE_SET_CODE_SYSTEM__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET_CODE_SYSTEM__CASE_SENSITIVE:
				setCaseSensitive((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.VALUE_SET_CODE_SYSTEM__CONCEPT:
				getConcept().clear();
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
			case FhirPackage.VALUE_SET_CODE_SYSTEM__SYSTEM:
				return system != null;
			case FhirPackage.VALUE_SET_CODE_SYSTEM__VERSION:
				return version != null;
			case FhirPackage.VALUE_SET_CODE_SYSTEM__CASE_SENSITIVE:
				return caseSensitive != null;
			case FhirPackage.VALUE_SET_CODE_SYSTEM__CONCEPT:
				return concept != null && !concept.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetCodeSystemImpl
