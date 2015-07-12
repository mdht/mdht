/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Request Payload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestPayloadImpl#getContentString <em>Content String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestPayloadImpl#getContentAttachment <em>Content Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.CommunicationRequestPayloadImpl#getContentReference <em>Content Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationRequestPayloadImpl extends BackboneElementImpl implements CommunicationRequestPayload {
	/**
	 * The cached value of the '{@link #getContentString() <em>Content String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String contentString;

	/**
	 * The cached value of the '{@link #getContentAttachment() <em>Content Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment contentAttachment;

	/**
	 * The cached value of the '{@link #getContentReference() <em>Content Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentReference()
	 * @generated
	 * @ordered
	 */
	protected Reference contentReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationRequestPayloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getCommunicationRequestPayload();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getContentString() {
		return contentString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentString(org.hl7.fhir.String newContentString, NotificationChain msgs) {
		org.hl7.fhir.String oldContentString = contentString;
		contentString = newContentString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_STRING, oldContentString, newContentString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentString(org.hl7.fhir.String newContentString) {
		if (newContentString != contentString) {
			NotificationChain msgs = null;
			if (contentString != null)
				msgs = ((InternalEObject)contentString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_STRING, null, msgs);
			if (newContentString != null)
				msgs = ((InternalEObject)newContentString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_STRING, null, msgs);
			msgs = basicSetContentString(newContentString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_STRING, newContentString, newContentString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getContentAttachment() {
		return contentAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentAttachment(Attachment newContentAttachment, NotificationChain msgs) {
		Attachment oldContentAttachment = contentAttachment;
		contentAttachment = newContentAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT, oldContentAttachment, newContentAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentAttachment(Attachment newContentAttachment) {
		if (newContentAttachment != contentAttachment) {
			NotificationChain msgs = null;
			if (contentAttachment != null)
				msgs = ((InternalEObject)contentAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT, null, msgs);
			if (newContentAttachment != null)
				msgs = ((InternalEObject)newContentAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT, null, msgs);
			msgs = basicSetContentAttachment(newContentAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT, newContentAttachment, newContentAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getContentReference() {
		return contentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentReference(Reference newContentReference, NotificationChain msgs) {
		Reference oldContentReference = contentReference;
		contentReference = newContentReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE, oldContentReference, newContentReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentReference(Reference newContentReference) {
		if (newContentReference != contentReference) {
			NotificationChain msgs = null;
			if (contentReference != null)
				msgs = ((InternalEObject)contentReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE, null, msgs);
			if (newContentReference != null)
				msgs = ((InternalEObject)newContentReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE, null, msgs);
			msgs = basicSetContentReference(newContentReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE, newContentReference, newContentReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_STRING:
				return basicSetContentString(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT:
				return basicSetContentAttachment(null, msgs);
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE:
				return basicSetContentReference(null, msgs);
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
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_STRING:
				return getContentString();
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT:
				return getContentAttachment();
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE:
				return getContentReference();
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
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_STRING:
				setContentString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT:
				setContentAttachment((Attachment)newValue);
				return;
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE:
				setContentReference((Reference)newValue);
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
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_STRING:
				setContentString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT:
				setContentAttachment((Attachment)null);
				return;
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE:
				setContentReference((Reference)null);
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
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_STRING:
				return contentString != null;
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_ATTACHMENT:
				return contentAttachment != null;
			case FhirPackage.COMMUNICATION_REQUEST_PAYLOAD__CONTENT_REFERENCE:
				return contentReference != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationRequestPayloadImpl
