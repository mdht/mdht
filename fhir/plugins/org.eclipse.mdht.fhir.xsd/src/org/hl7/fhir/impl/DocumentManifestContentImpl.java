/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Attachment;
import org.hl7.fhir.DocumentManifestContent;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Manifest Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestContentImpl#getPAttachment <em>PAttachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentManifestContentImpl#getPReference <em>PReference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentManifestContentImpl extends BackboneElementImpl implements DocumentManifestContent {
	/**
	 * The cached value of the '{@link #getPAttachment() <em>PAttachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment pAttachment;

	/**
	 * The cached value of the '{@link #getPReference() <em>PReference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPReference()
	 * @generated
	 * @ordered
	 */
	protected Reference pReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentManifestContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDocumentManifestContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getPAttachment() {
		return pAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPAttachment(Attachment newPAttachment, NotificationChain msgs) {
		Attachment oldPAttachment = pAttachment;
		pAttachment = newPAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST_CONTENT__PATTACHMENT, oldPAttachment, newPAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPAttachment(Attachment newPAttachment) {
		if (newPAttachment != pAttachment) {
			NotificationChain msgs = null;
			if (pAttachment != null)
				msgs = ((InternalEObject)pAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST_CONTENT__PATTACHMENT, null, msgs);
			if (newPAttachment != null)
				msgs = ((InternalEObject)newPAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST_CONTENT__PATTACHMENT, null, msgs);
			msgs = basicSetPAttachment(newPAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST_CONTENT__PATTACHMENT, newPAttachment, newPAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPReference() {
		return pReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPReference(Reference newPReference, NotificationChain msgs) {
		Reference oldPReference = pReference;
		pReference = newPReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST_CONTENT__PREFERENCE, oldPReference, newPReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPReference(Reference newPReference) {
		if (newPReference != pReference) {
			NotificationChain msgs = null;
			if (pReference != null)
				msgs = ((InternalEObject)pReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST_CONTENT__PREFERENCE, null, msgs);
			if (newPReference != null)
				msgs = ((InternalEObject)newPReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DOCUMENT_MANIFEST_CONTENT__PREFERENCE, null, msgs);
			msgs = basicSetPReference(newPReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DOCUMENT_MANIFEST_CONTENT__PREFERENCE, newPReference, newPReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT__PATTACHMENT:
				return basicSetPAttachment(null, msgs);
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT__PREFERENCE:
				return basicSetPReference(null, msgs);
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
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT__PATTACHMENT:
				return getPAttachment();
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT__PREFERENCE:
				return getPReference();
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
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT__PATTACHMENT:
				setPAttachment((Attachment)newValue);
				return;
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT__PREFERENCE:
				setPReference((Reference)newValue);
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
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT__PATTACHMENT:
				setPAttachment((Attachment)null);
				return;
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT__PREFERENCE:
				setPReference((Reference)null);
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
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT__PATTACHMENT:
				return pAttachment != null;
			case FhirPackage.DOCUMENT_MANIFEST_CONTENT__PREFERENCE:
				return pReference != null;
		}
		return super.eIsSet(featureID);
	}

} //DocumentManifestContentImpl
