/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.CascadableAnnotation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cascadable Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CascadableAnnotationImpl#getCascadeInfo <em>Cascade Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CascadableAnnotationImpl extends BasicAnnotationImpl implements CascadableAnnotation {
	/**
	 * The cached value of the '{@link #getCascadeInfo() <em>Cascade Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascadeInfo()
	 * @generated
	 * @ordered
	 */
	protected AnnotationCascadeInfo cascadeInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CascadableAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CASCADABLE_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationCascadeInfo getCascadeInfo() {
		return cascadeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCascadeInfo(AnnotationCascadeInfo newCascadeInfo, NotificationChain msgs) {
		AnnotationCascadeInfo oldCascadeInfo = cascadeInfo;
		cascadeInfo = newCascadeInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CASCADABLE_ANNOTATION__CASCADE_INFO, oldCascadeInfo, newCascadeInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCascadeInfo(AnnotationCascadeInfo newCascadeInfo) {
		if (newCascadeInfo != cascadeInfo) {
			NotificationChain msgs = null;
			if (cascadeInfo != null)
				msgs = ((InternalEObject)cascadeInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CASCADABLE_ANNOTATION__CASCADE_INFO, null, msgs);
			if (newCascadeInfo != null)
				msgs = ((InternalEObject)newCascadeInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CASCADABLE_ANNOTATION__CASCADE_INFO, null, msgs);
			msgs = basicSetCascadeInfo(newCascadeInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CASCADABLE_ANNOTATION__CASCADE_INFO, newCascadeInfo, newCascadeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CASCADABLE_ANNOTATION__CASCADE_INFO:
				return basicSetCascadeInfo(null, msgs);
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
			case Mif2Package.CASCADABLE_ANNOTATION__CASCADE_INFO:
				return getCascadeInfo();
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
			case Mif2Package.CASCADABLE_ANNOTATION__CASCADE_INFO:
				setCascadeInfo((AnnotationCascadeInfo)newValue);
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
			case Mif2Package.CASCADABLE_ANNOTATION__CASCADE_INFO:
				setCascadeInfo((AnnotationCascadeInfo)null);
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
			case Mif2Package.CASCADABLE_ANNOTATION__CASCADE_INFO:
				return cascadeInfo != null;
		}
		return super.eIsSet(featureID);
	}

} //CascadableAnnotationImpl
