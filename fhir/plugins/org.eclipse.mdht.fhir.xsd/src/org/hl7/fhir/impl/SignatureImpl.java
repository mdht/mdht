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

import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Code;
import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Signature;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoUri <em>Who Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoReference <em>Who Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getBlob <em>Blob</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureImpl extends ElementImpl implements Signature {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> type;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected Instant when;

	/**
	 * The cached value of the '{@link #getWhoUri() <em>Who Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoUri()
	 * @generated
	 * @ordered
	 */
	protected Uri whoUri;

	/**
	 * The cached value of the '{@link #getWhoReference() <em>Who Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoReference()
	 * @generated
	 * @ordered
	 */
	protected Reference whoReference;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Code contentType;

	/**
	 * The cached value of the '{@link #getBlob() <em>Blob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlob()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary blob;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.SIGNATURE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(Instant newWhen, NotificationChain msgs) {
		Instant oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(Instant newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getWhoUri() {
		return whoUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoUri(Uri newWhoUri, NotificationChain msgs) {
		Uri oldWhoUri = whoUri;
		whoUri = newWhoUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_URI, oldWhoUri, newWhoUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoUri(Uri newWhoUri) {
		if (newWhoUri != whoUri) {
			NotificationChain msgs = null;
			if (whoUri != null)
				msgs = ((InternalEObject)whoUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_URI, null, msgs);
			if (newWhoUri != null)
				msgs = ((InternalEObject)newWhoUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_URI, null, msgs);
			msgs = basicSetWhoUri(newWhoUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_URI, newWhoUri, newWhoUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getWhoReference() {
		return whoReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoReference(Reference newWhoReference, NotificationChain msgs) {
		Reference oldWhoReference = whoReference;
		whoReference = newWhoReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_REFERENCE, oldWhoReference, newWhoReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoReference(Reference newWhoReference) {
		if (newWhoReference != whoReference) {
			NotificationChain msgs = null;
			if (whoReference != null)
				msgs = ((InternalEObject)whoReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_REFERENCE, null, msgs);
			if (newWhoReference != null)
				msgs = ((InternalEObject)newWhoReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_REFERENCE, null, msgs);
			msgs = basicSetWhoReference(newWhoReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_REFERENCE, newWhoReference, newWhoReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentType(Code newContentType, NotificationChain msgs) {
		Code oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__CONTENT_TYPE, oldContentType, newContentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(Code newContentType) {
		if (newContentType != contentType) {
			NotificationChain msgs = null;
			if (contentType != null)
				msgs = ((InternalEObject)contentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__CONTENT_TYPE, null, msgs);
			if (newContentType != null)
				msgs = ((InternalEObject)newContentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__CONTENT_TYPE, null, msgs);
			msgs = basicSetContentType(newContentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__CONTENT_TYPE, newContentType, newContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getBlob() {
		return blob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlob(Base64Binary newBlob, NotificationChain msgs) {
		Base64Binary oldBlob = blob;
		blob = newBlob;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__BLOB, oldBlob, newBlob);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlob(Base64Binary newBlob) {
		if (newBlob != blob) {
			NotificationChain msgs = null;
			if (blob != null)
				msgs = ((InternalEObject)blob).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__BLOB, null, msgs);
			if (newBlob != null)
				msgs = ((InternalEObject)newBlob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__BLOB, null, msgs);
			msgs = basicSetBlob(newBlob, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__BLOB, newBlob, newBlob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SIGNATURE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.SIGNATURE__WHEN:
				return basicSetWhen(null, msgs);
			case FhirPackage.SIGNATURE__WHO_URI:
				return basicSetWhoUri(null, msgs);
			case FhirPackage.SIGNATURE__WHO_REFERENCE:
				return basicSetWhoReference(null, msgs);
			case FhirPackage.SIGNATURE__CONTENT_TYPE:
				return basicSetContentType(null, msgs);
			case FhirPackage.SIGNATURE__BLOB:
				return basicSetBlob(null, msgs);
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
			case FhirPackage.SIGNATURE__TYPE:
				return getType();
			case FhirPackage.SIGNATURE__WHEN:
				return getWhen();
			case FhirPackage.SIGNATURE__WHO_URI:
				return getWhoUri();
			case FhirPackage.SIGNATURE__WHO_REFERENCE:
				return getWhoReference();
			case FhirPackage.SIGNATURE__CONTENT_TYPE:
				return getContentType();
			case FhirPackage.SIGNATURE__BLOB:
				return getBlob();
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
			case FhirPackage.SIGNATURE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.SIGNATURE__WHEN:
				setWhen((Instant)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_URI:
				setWhoUri((Uri)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_REFERENCE:
				setWhoReference((Reference)newValue);
				return;
			case FhirPackage.SIGNATURE__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case FhirPackage.SIGNATURE__BLOB:
				setBlob((Base64Binary)newValue);
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
			case FhirPackage.SIGNATURE__TYPE:
				getType().clear();
				return;
			case FhirPackage.SIGNATURE__WHEN:
				setWhen((Instant)null);
				return;
			case FhirPackage.SIGNATURE__WHO_URI:
				setWhoUri((Uri)null);
				return;
			case FhirPackage.SIGNATURE__WHO_REFERENCE:
				setWhoReference((Reference)null);
				return;
			case FhirPackage.SIGNATURE__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case FhirPackage.SIGNATURE__BLOB:
				setBlob((Base64Binary)null);
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
			case FhirPackage.SIGNATURE__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.SIGNATURE__WHEN:
				return when != null;
			case FhirPackage.SIGNATURE__WHO_URI:
				return whoUri != null;
			case FhirPackage.SIGNATURE__WHO_REFERENCE:
				return whoReference != null;
			case FhirPackage.SIGNATURE__CONTENT_TYPE:
				return contentType != null;
			case FhirPackage.SIGNATURE__BLOB:
				return blob != null;
		}
		return super.eIsSet(featureID);
	}

} //SignatureImpl
