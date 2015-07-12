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
import org.hl7.fhir.ImagingObjectSelectionFrames;
import org.hl7.fhir.ImagingObjectSelectionInstance;
import org.hl7.fhir.Oid;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Object Selection Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingObjectSelectionInstanceImpl#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingObjectSelectionInstanceImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingObjectSelectionInstanceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingObjectSelectionInstanceImpl#getFrames <em>Frames</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingObjectSelectionInstanceImpl extends BackboneElementImpl implements ImagingObjectSelectionInstance {
	/**
	 * The cached value of the '{@link #getSopClass() <em>Sop Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSopClass()
	 * @generated
	 * @ordered
	 */
	protected Oid sopClass;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Oid uid;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingObjectSelectionFrames> frames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingObjectSelectionInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingObjectSelectionInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getSopClass() {
		return sopClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSopClass(Oid newSopClass, NotificationChain msgs) {
		Oid oldSopClass = sopClass;
		sopClass = newSopClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__SOP_CLASS, oldSopClass, newSopClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSopClass(Oid newSopClass) {
		if (newSopClass != sopClass) {
			NotificationChain msgs = null;
			if (sopClass != null)
				msgs = ((InternalEObject)sopClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__SOP_CLASS, null, msgs);
			if (newSopClass != null)
				msgs = ((InternalEObject)newSopClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__SOP_CLASS, null, msgs);
			msgs = basicSetSopClass(newSopClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__SOP_CLASS, newSopClass, newSopClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUid(Oid newUid, NotificationChain msgs) {
		Oid oldUid = uid;
		uid = newUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__UID, oldUid, newUid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(Oid newUid) {
		if (newUid != uid) {
			NotificationChain msgs = null;
			if (uid != null)
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__UID, newUid, newUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingObjectSelectionFrames> getFrames() {
		if (frames == null) {
			frames = new EObjectContainmentEList<ImagingObjectSelectionFrames>(ImagingObjectSelectionFrames.class, this, FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__FRAMES);
		}
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__SOP_CLASS:
				return basicSetSopClass(null, msgs);
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__UID:
				return basicSetUid(null, msgs);
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__FRAMES:
				return ((InternalEList<?>)getFrames()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__SOP_CLASS:
				return getSopClass();
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__UID:
				return getUid();
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__URL:
				return getUrl();
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__FRAMES:
				return getFrames();
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
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__SOP_CLASS:
				setSopClass((Oid)newValue);
				return;
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__UID:
				setUid((Oid)newValue);
				return;
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__FRAMES:
				getFrames().clear();
				getFrames().addAll((Collection<? extends ImagingObjectSelectionFrames>)newValue);
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
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__SOP_CLASS:
				setSopClass((Oid)null);
				return;
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__UID:
				setUid((Oid)null);
				return;
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__FRAMES:
				getFrames().clear();
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
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__SOP_CLASS:
				return sopClass != null;
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__UID:
				return uid != null;
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__URL:
				return url != null;
			case FhirPackage.IMAGING_OBJECT_SELECTION_INSTANCE__FRAMES:
				return frames != null && !frames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingObjectSelectionInstanceImpl
