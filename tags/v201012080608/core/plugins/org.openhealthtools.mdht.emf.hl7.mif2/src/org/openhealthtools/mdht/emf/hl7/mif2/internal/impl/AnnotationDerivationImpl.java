/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.AnnotationDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AnnotationDerivationImpl#getTargetAnnotationName <em>Target Annotation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationDerivationImpl extends DerivationImpl implements AnnotationDerivation {
	/**
	 * The default value of the '{@link #getTargetAnnotationName() <em>Target Annotation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAnnotationName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ANNOTATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetAnnotationName() <em>Target Annotation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAnnotationName()
	 * @generated
	 * @ordered
	 */
	protected String targetAnnotationName = TARGET_ANNOTATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ANNOTATION_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetAnnotationName() {
		return targetAnnotationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAnnotationName(String newTargetAnnotationName) {
		String oldTargetAnnotationName = targetAnnotationName;
		targetAnnotationName = newTargetAnnotationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ANNOTATION_DERIVATION__TARGET_ANNOTATION_NAME, oldTargetAnnotationName, targetAnnotationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.ANNOTATION_DERIVATION__TARGET_ANNOTATION_NAME:
				return getTargetAnnotationName();
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
			case Mif2Package.ANNOTATION_DERIVATION__TARGET_ANNOTATION_NAME:
				setTargetAnnotationName((String)newValue);
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
			case Mif2Package.ANNOTATION_DERIVATION__TARGET_ANNOTATION_NAME:
				setTargetAnnotationName(TARGET_ANNOTATION_NAME_EDEFAULT);
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
			case Mif2Package.ANNOTATION_DERIVATION__TARGET_ANNOTATION_NAME:
				return TARGET_ANNOTATION_NAME_EDEFAULT == null ? targetAnnotationName != null : !TARGET_ANNOTATION_NAME_EDEFAULT.equals(targetAnnotationName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (targetAnnotationName: ");
		result.append(targetAnnotationName);
		result.append(')');
		return result.toString();
	}

} //AnnotationDerivationImpl
