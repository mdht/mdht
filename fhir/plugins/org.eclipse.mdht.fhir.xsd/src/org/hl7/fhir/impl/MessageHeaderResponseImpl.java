/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.MessageHeaderResponse;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ResponseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Header Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderResponseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MessageHeaderResponseImpl#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageHeaderResponseImpl extends BackboneElementImpl implements MessageHeaderResponse {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Id identifier;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected ResponseType code;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected Reference details;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageHeaderResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMessageHeaderResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Id newIdentifier, NotificationChain msgs) {
		Id oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_RESPONSE__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Id newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_RESPONSE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_RESPONSE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_RESPONSE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseType getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(ResponseType newCode, NotificationChain msgs) {
		ResponseType oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_RESPONSE__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(ResponseType newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_RESPONSE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_RESPONSE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_RESPONSE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetails(Reference newDetails, NotificationChain msgs) {
		Reference oldDetails = details;
		details = newDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_RESPONSE__DETAILS, oldDetails, newDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetails(Reference newDetails) {
		if (newDetails != details) {
			NotificationChain msgs = null;
			if (details != null)
				msgs = ((InternalEObject)details).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_RESPONSE__DETAILS, null, msgs);
			if (newDetails != null)
				msgs = ((InternalEObject)newDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MESSAGE_HEADER_RESPONSE__DETAILS, null, msgs);
			msgs = basicSetDetails(newDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MESSAGE_HEADER_RESPONSE__DETAILS, newDetails, newDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MESSAGE_HEADER_RESPONSE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.MESSAGE_HEADER_RESPONSE__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.MESSAGE_HEADER_RESPONSE__DETAILS:
				return basicSetDetails(null, msgs);
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
			case FhirPackage.MESSAGE_HEADER_RESPONSE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MESSAGE_HEADER_RESPONSE__CODE:
				return getCode();
			case FhirPackage.MESSAGE_HEADER_RESPONSE__DETAILS:
				return getDetails();
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
			case FhirPackage.MESSAGE_HEADER_RESPONSE__IDENTIFIER:
				setIdentifier((Id)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_RESPONSE__CODE:
				setCode((ResponseType)newValue);
				return;
			case FhirPackage.MESSAGE_HEADER_RESPONSE__DETAILS:
				setDetails((Reference)newValue);
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
			case FhirPackage.MESSAGE_HEADER_RESPONSE__IDENTIFIER:
				setIdentifier((Id)null);
				return;
			case FhirPackage.MESSAGE_HEADER_RESPONSE__CODE:
				setCode((ResponseType)null);
				return;
			case FhirPackage.MESSAGE_HEADER_RESPONSE__DETAILS:
				setDetails((Reference)null);
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
			case FhirPackage.MESSAGE_HEADER_RESPONSE__IDENTIFIER:
				return identifier != null;
			case FhirPackage.MESSAGE_HEADER_RESPONSE__CODE:
				return code != null;
			case FhirPackage.MESSAGE_HEADER_RESPONSE__DETAILS:
				return details != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageHeaderResponseImpl
