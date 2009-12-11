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

import org.openhealthtools.mdht.emf.hl7.mif2.DerivedStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.ElementChange;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Static Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DerivedStaticModelImpl#getOriginalArtifact <em>Original Artifact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DerivedStaticModelImpl#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DerivedStaticModelImpl extends StaticModelBaseImpl implements DerivedStaticModel {
	/**
	 * The cached value of the '{@link #getOriginalArtifact() <em>Original Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalArtifact()
	 * @generated
	 * @ordered
	 */
	protected PackageRef originalArtifact;

	/**
	 * The cached value of the '{@link #getChange() <em>Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected ElementChange change;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedStaticModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DERIVED_STATIC_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getOriginalArtifact() {
		return originalArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalArtifact(PackageRef newOriginalArtifact, NotificationChain msgs) {
		PackageRef oldOriginalArtifact = originalArtifact;
		originalArtifact = newOriginalArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DERIVED_STATIC_MODEL__ORIGINAL_ARTIFACT, oldOriginalArtifact, newOriginalArtifact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalArtifact(PackageRef newOriginalArtifact) {
		if (newOriginalArtifact != originalArtifact) {
			NotificationChain msgs = null;
			if (originalArtifact != null)
				msgs = ((InternalEObject)originalArtifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DERIVED_STATIC_MODEL__ORIGINAL_ARTIFACT, null, msgs);
			if (newOriginalArtifact != null)
				msgs = ((InternalEObject)newOriginalArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DERIVED_STATIC_MODEL__ORIGINAL_ARTIFACT, null, msgs);
			msgs = basicSetOriginalArtifact(newOriginalArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DERIVED_STATIC_MODEL__ORIGINAL_ARTIFACT, newOriginalArtifact, newOriginalArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementChange getChange() {
		return change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChange(ElementChange newChange, NotificationChain msgs) {
		ElementChange oldChange = change;
		change = newChange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DERIVED_STATIC_MODEL__CHANGE, oldChange, newChange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChange(ElementChange newChange) {
		if (newChange != change) {
			NotificationChain msgs = null;
			if (change != null)
				msgs = ((InternalEObject)change).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DERIVED_STATIC_MODEL__CHANGE, null, msgs);
			if (newChange != null)
				msgs = ((InternalEObject)newChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DERIVED_STATIC_MODEL__CHANGE, null, msgs);
			msgs = basicSetChange(newChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DERIVED_STATIC_MODEL__CHANGE, newChange, newChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.DERIVED_STATIC_MODEL__ORIGINAL_ARTIFACT:
				return basicSetOriginalArtifact(null, msgs);
			case Mif2Package.DERIVED_STATIC_MODEL__CHANGE:
				return basicSetChange(null, msgs);
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
			case Mif2Package.DERIVED_STATIC_MODEL__ORIGINAL_ARTIFACT:
				return getOriginalArtifact();
			case Mif2Package.DERIVED_STATIC_MODEL__CHANGE:
				return getChange();
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
			case Mif2Package.DERIVED_STATIC_MODEL__ORIGINAL_ARTIFACT:
				setOriginalArtifact((PackageRef)newValue);
				return;
			case Mif2Package.DERIVED_STATIC_MODEL__CHANGE:
				setChange((ElementChange)newValue);
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
			case Mif2Package.DERIVED_STATIC_MODEL__ORIGINAL_ARTIFACT:
				setOriginalArtifact((PackageRef)null);
				return;
			case Mif2Package.DERIVED_STATIC_MODEL__CHANGE:
				setChange((ElementChange)null);
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
			case Mif2Package.DERIVED_STATIC_MODEL__ORIGINAL_ARTIFACT:
				return originalArtifact != null;
			case Mif2Package.DERIVED_STATIC_MODEL__CHANGE:
				return change != null;
		}
		return super.eIsSet(featureID);
	}

} //DerivedStaticModelImpl
