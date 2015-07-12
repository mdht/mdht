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

import org.hl7.fhir.Code;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ValueSetConcept;
import org.hl7.fhir.ValueSetDesignation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ValueSetConceptImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetConceptImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetConceptImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetConceptImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetConceptImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetConceptImpl#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetConceptImpl extends BackboneElementImpl implements ValueSetConcept {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean abstract_;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String display;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String definition;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetDesignation> designation;

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
	protected ValueSetConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getValueSetConcept();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CONCEPT__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CONCEPT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CONCEPT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CONCEPT__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(org.hl7.fhir.Boolean newAbstract, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CONCEPT__ABSTRACT, oldAbstract, newAbstract);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(org.hl7.fhir.Boolean newAbstract) {
		if (newAbstract != abstract_) {
			NotificationChain msgs = null;
			if (abstract_ != null)
				msgs = ((InternalEObject)abstract_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CONCEPT__ABSTRACT, null, msgs);
			if (newAbstract != null)
				msgs = ((InternalEObject)newAbstract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CONCEPT__ABSTRACT, null, msgs);
			msgs = basicSetAbstract(newAbstract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CONCEPT__ABSTRACT, newAbstract, newAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(org.hl7.fhir.String newDisplay, NotificationChain msgs) {
		org.hl7.fhir.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CONCEPT__DISPLAY, oldDisplay, newDisplay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.hl7.fhir.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CONCEPT__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CONCEPT__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CONCEPT__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(org.hl7.fhir.String newDefinition, NotificationChain msgs) {
		org.hl7.fhir.String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CONCEPT__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(org.hl7.fhir.String newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CONCEPT__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VALUE_SET_CONCEPT__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VALUE_SET_CONCEPT__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetDesignation> getDesignation() {
		if (designation == null) {
			designation = new EObjectContainmentEList<ValueSetDesignation>(ValueSetDesignation.class, this, FhirPackage.VALUE_SET_CONCEPT__DESIGNATION);
		}
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetConcept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<ValueSetConcept>(ValueSetConcept.class, this, FhirPackage.VALUE_SET_CONCEPT__CONCEPT);
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
			case FhirPackage.VALUE_SET_CONCEPT__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.VALUE_SET_CONCEPT__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case FhirPackage.VALUE_SET_CONCEPT__DISPLAY:
				return basicSetDisplay(null, msgs);
			case FhirPackage.VALUE_SET_CONCEPT__DEFINITION:
				return basicSetDefinition(null, msgs);
			case FhirPackage.VALUE_SET_CONCEPT__DESIGNATION:
				return ((InternalEList<?>)getDesignation()).basicRemove(otherEnd, msgs);
			case FhirPackage.VALUE_SET_CONCEPT__CONCEPT:
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
			case FhirPackage.VALUE_SET_CONCEPT__CODE:
				return getCode();
			case FhirPackage.VALUE_SET_CONCEPT__ABSTRACT:
				return getAbstract();
			case FhirPackage.VALUE_SET_CONCEPT__DISPLAY:
				return getDisplay();
			case FhirPackage.VALUE_SET_CONCEPT__DEFINITION:
				return getDefinition();
			case FhirPackage.VALUE_SET_CONCEPT__DESIGNATION:
				return getDesignation();
			case FhirPackage.VALUE_SET_CONCEPT__CONCEPT:
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
			case FhirPackage.VALUE_SET_CONCEPT__CODE:
				setCode((Code)newValue);
				return;
			case FhirPackage.VALUE_SET_CONCEPT__ABSTRACT:
				setAbstract((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.VALUE_SET_CONCEPT__DISPLAY:
				setDisplay((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET_CONCEPT__DEFINITION:
				setDefinition((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VALUE_SET_CONCEPT__DESIGNATION:
				getDesignation().clear();
				getDesignation().addAll((Collection<? extends ValueSetDesignation>)newValue);
				return;
			case FhirPackage.VALUE_SET_CONCEPT__CONCEPT:
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
			case FhirPackage.VALUE_SET_CONCEPT__CODE:
				setCode((Code)null);
				return;
			case FhirPackage.VALUE_SET_CONCEPT__ABSTRACT:
				setAbstract((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.VALUE_SET_CONCEPT__DISPLAY:
				setDisplay((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET_CONCEPT__DEFINITION:
				setDefinition((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VALUE_SET_CONCEPT__DESIGNATION:
				getDesignation().clear();
				return;
			case FhirPackage.VALUE_SET_CONCEPT__CONCEPT:
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
			case FhirPackage.VALUE_SET_CONCEPT__CODE:
				return code != null;
			case FhirPackage.VALUE_SET_CONCEPT__ABSTRACT:
				return abstract_ != null;
			case FhirPackage.VALUE_SET_CONCEPT__DISPLAY:
				return display != null;
			case FhirPackage.VALUE_SET_CONCEPT__DEFINITION:
				return definition != null;
			case FhirPackage.VALUE_SET_CONCEPT__DESIGNATION:
				return designation != null && !designation.isEmpty();
			case FhirPackage.VALUE_SET_CONCEPT__CONCEPT:
				return concept != null && !concept.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetConceptImpl
