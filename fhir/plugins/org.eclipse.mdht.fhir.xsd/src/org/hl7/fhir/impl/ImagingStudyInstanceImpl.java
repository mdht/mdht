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

import org.hl7.fhir.Attachment;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ImagingStudyInstance;
import org.hl7.fhir.Oid;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Study Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyInstanceImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyInstanceImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyInstanceImpl#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyInstanceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingStudyInstanceImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingStudyInstanceImpl extends BackboneElementImpl implements ImagingStudyInstance {
	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt number;

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
	 * The cached value of the '{@link #getSopClass() <em>Sop Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSopClass()
	 * @generated
	 * @ordered
	 */
	protected Oid sopClass;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String type;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingStudyInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingStudyInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(UnsignedInt newNumber, NotificationChain msgs) {
		UnsignedInt oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_INSTANCE__NUMBER, oldNumber, newNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(UnsignedInt newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_INSTANCE__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_INSTANCE__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_INSTANCE__NUMBER, newNumber, newNumber));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_INSTANCE__UID, oldUid, newUid);
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
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_INSTANCE__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_INSTANCE__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_INSTANCE__UID, newUid, newUid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_INSTANCE__SOP_CLASS, oldSopClass, newSopClass);
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
				msgs = ((InternalEObject)sopClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_INSTANCE__SOP_CLASS, null, msgs);
			if (newSopClass != null)
				msgs = ((InternalEObject)newSopClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_INSTANCE__SOP_CLASS, null, msgs);
			msgs = basicSetSopClass(newSopClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_INSTANCE__SOP_CLASS, newSopClass, newSopClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(org.hl7.fhir.String newType, NotificationChain msgs) {
		org.hl7.fhir.String oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_INSTANCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(org.hl7.fhir.String newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_INSTANCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_INSTANCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_INSTANCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_INSTANCE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_INSTANCE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_STUDY_INSTANCE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_STUDY_INSTANCE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<Attachment>(Attachment.class, this, FhirPackage.IMAGING_STUDY_INSTANCE__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_STUDY_INSTANCE__NUMBER:
				return basicSetNumber(null, msgs);
			case FhirPackage.IMAGING_STUDY_INSTANCE__UID:
				return basicSetUid(null, msgs);
			case FhirPackage.IMAGING_STUDY_INSTANCE__SOP_CLASS:
				return basicSetSopClass(null, msgs);
			case FhirPackage.IMAGING_STUDY_INSTANCE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.IMAGING_STUDY_INSTANCE__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.IMAGING_STUDY_INSTANCE__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_STUDY_INSTANCE__NUMBER:
				return getNumber();
			case FhirPackage.IMAGING_STUDY_INSTANCE__UID:
				return getUid();
			case FhirPackage.IMAGING_STUDY_INSTANCE__SOP_CLASS:
				return getSopClass();
			case FhirPackage.IMAGING_STUDY_INSTANCE__TYPE:
				return getType();
			case FhirPackage.IMAGING_STUDY_INSTANCE__TITLE:
				return getTitle();
			case FhirPackage.IMAGING_STUDY_INSTANCE__CONTENT:
				return getContent();
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
			case FhirPackage.IMAGING_STUDY_INSTANCE__NUMBER:
				setNumber((UnsignedInt)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_INSTANCE__UID:
				setUid((Oid)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_INSTANCE__SOP_CLASS:
				setSopClass((Oid)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_INSTANCE__TYPE:
				setType((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_INSTANCE__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMAGING_STUDY_INSTANCE__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Attachment>)newValue);
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
			case FhirPackage.IMAGING_STUDY_INSTANCE__NUMBER:
				setNumber((UnsignedInt)null);
				return;
			case FhirPackage.IMAGING_STUDY_INSTANCE__UID:
				setUid((Oid)null);
				return;
			case FhirPackage.IMAGING_STUDY_INSTANCE__SOP_CLASS:
				setSopClass((Oid)null);
				return;
			case FhirPackage.IMAGING_STUDY_INSTANCE__TYPE:
				setType((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMAGING_STUDY_INSTANCE__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMAGING_STUDY_INSTANCE__CONTENT:
				getContent().clear();
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
			case FhirPackage.IMAGING_STUDY_INSTANCE__NUMBER:
				return number != null;
			case FhirPackage.IMAGING_STUDY_INSTANCE__UID:
				return uid != null;
			case FhirPackage.IMAGING_STUDY_INSTANCE__SOP_CLASS:
				return sopClass != null;
			case FhirPackage.IMAGING_STUDY_INSTANCE__TYPE:
				return type != null;
			case FhirPackage.IMAGING_STUDY_INSTANCE__TITLE:
				return title != null;
			case FhirPackage.IMAGING_STUDY_INSTANCE__CONTENT:
				return content != null && !content.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingStudyInstanceImpl
