/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplementAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Supplement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ArtifactSupplementImpl#getSupplementedObject <em>Supplemented Object</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ArtifactSupplementImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ArtifactSupplementImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactSupplementImpl extends EObjectImpl implements ArtifactSupplement {
	/**
	 * The cached value of the '{@link #getSupplementedObject() <em>Supplemented Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementedObject()
	 * @generated
	 * @ordered
	 */
	protected org.openhealthtools.mdht.emf.w3c.xhtml.Object supplementedObject;

	/**
	 * The cached value of the '{@link #getBusinessName() <em>Business Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessName()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessName> businessName;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected ArtifactSupplementAnnotations annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactSupplementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ARTIFACT_SUPPLEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.openhealthtools.mdht.emf.w3c.xhtml.Object getSupplementedObject() {
		return supplementedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplementedObject(org.openhealthtools.mdht.emf.w3c.xhtml.Object newSupplementedObject, NotificationChain msgs) {
		org.openhealthtools.mdht.emf.w3c.xhtml.Object oldSupplementedObject = supplementedObject;
		supplementedObject = newSupplementedObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.ARTIFACT_SUPPLEMENT__SUPPLEMENTED_OBJECT, oldSupplementedObject, newSupplementedObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplementedObject(org.openhealthtools.mdht.emf.w3c.xhtml.Object newSupplementedObject) {
		if (newSupplementedObject != supplementedObject) {
			NotificationChain msgs = null;
			if (supplementedObject != null)
				msgs = ((InternalEObject)supplementedObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ARTIFACT_SUPPLEMENT__SUPPLEMENTED_OBJECT, null, msgs);
			if (newSupplementedObject != null)
				msgs = ((InternalEObject)newSupplementedObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ARTIFACT_SUPPLEMENT__SUPPLEMENTED_OBJECT, null, msgs);
			msgs = basicSetSupplementedObject(newSupplementedObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ARTIFACT_SUPPLEMENT__SUPPLEMENTED_OBJECT, newSupplementedObject, newSupplementedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessName> getBusinessName() {
		if (businessName == null) {
			businessName = new EObjectContainmentEList<BusinessName>(BusinessName.class, this, Mif2Package.ARTIFACT_SUPPLEMENT__BUSINESS_NAME);
		}
		return businessName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactSupplementAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(ArtifactSupplementAnnotations newAnnotations, NotificationChain msgs) {
		ArtifactSupplementAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.ARTIFACT_SUPPLEMENT__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(ArtifactSupplementAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ARTIFACT_SUPPLEMENT__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ARTIFACT_SUPPLEMENT__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ARTIFACT_SUPPLEMENT__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ARTIFACT_SUPPLEMENT__SUPPLEMENTED_OBJECT:
				return basicSetSupplementedObject(null, msgs);
			case Mif2Package.ARTIFACT_SUPPLEMENT__BUSINESS_NAME:
				return ((InternalEList<?>)getBusinessName()).basicRemove(otherEnd, msgs);
			case Mif2Package.ARTIFACT_SUPPLEMENT__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
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
			case Mif2Package.ARTIFACT_SUPPLEMENT__SUPPLEMENTED_OBJECT:
				return getSupplementedObject();
			case Mif2Package.ARTIFACT_SUPPLEMENT__BUSINESS_NAME:
				return getBusinessName();
			case Mif2Package.ARTIFACT_SUPPLEMENT__ANNOTATIONS:
				return getAnnotations();
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
			case Mif2Package.ARTIFACT_SUPPLEMENT__SUPPLEMENTED_OBJECT:
				setSupplementedObject((org.openhealthtools.mdht.emf.w3c.xhtml.Object)newValue);
				return;
			case Mif2Package.ARTIFACT_SUPPLEMENT__BUSINESS_NAME:
				getBusinessName().clear();
				getBusinessName().addAll((Collection<? extends BusinessName>)newValue);
				return;
			case Mif2Package.ARTIFACT_SUPPLEMENT__ANNOTATIONS:
				setAnnotations((ArtifactSupplementAnnotations)newValue);
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
			case Mif2Package.ARTIFACT_SUPPLEMENT__SUPPLEMENTED_OBJECT:
				setSupplementedObject((org.openhealthtools.mdht.emf.w3c.xhtml.Object)null);
				return;
			case Mif2Package.ARTIFACT_SUPPLEMENT__BUSINESS_NAME:
				getBusinessName().clear();
				return;
			case Mif2Package.ARTIFACT_SUPPLEMENT__ANNOTATIONS:
				setAnnotations((ArtifactSupplementAnnotations)null);
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
			case Mif2Package.ARTIFACT_SUPPLEMENT__SUPPLEMENTED_OBJECT:
				return supplementedObject != null;
			case Mif2Package.ARTIFACT_SUPPLEMENT__BUSINESS_NAME:
				return businessName != null && !businessName.isEmpty();
			case Mif2Package.ARTIFACT_SUPPLEMENT__ANNOTATIONS:
				return annotations != null;
		}
		return super.eIsSet(featureID);
	}

} //ArtifactSupplementImpl
