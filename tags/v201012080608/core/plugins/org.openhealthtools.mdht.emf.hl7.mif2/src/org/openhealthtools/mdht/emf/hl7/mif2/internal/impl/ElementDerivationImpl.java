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

import org.openhealthtools.mdht.emf.hl7.mif2.ElementDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageOrArtifactRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ElementDerivationImpl#getSourceArtifact <em>Source Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementDerivationImpl extends DerivationImpl implements ElementDerivation {
	/**
	 * The cached value of the '{@link #getSourceArtifact() <em>Source Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceArtifact()
	 * @generated
	 * @ordered
	 */
	protected PackageOrArtifactRef sourceArtifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ELEMENT_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageOrArtifactRef getSourceArtifact() {
		return sourceArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceArtifact(PackageOrArtifactRef newSourceArtifact, NotificationChain msgs) {
		PackageOrArtifactRef oldSourceArtifact = sourceArtifact;
		sourceArtifact = newSourceArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.ELEMENT_DERIVATION__SOURCE_ARTIFACT, oldSourceArtifact, newSourceArtifact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceArtifact(PackageOrArtifactRef newSourceArtifact) {
		if (newSourceArtifact != sourceArtifact) {
			NotificationChain msgs = null;
			if (sourceArtifact != null)
				msgs = ((InternalEObject)sourceArtifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ELEMENT_DERIVATION__SOURCE_ARTIFACT, null, msgs);
			if (newSourceArtifact != null)
				msgs = ((InternalEObject)newSourceArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.ELEMENT_DERIVATION__SOURCE_ARTIFACT, null, msgs);
			msgs = basicSetSourceArtifact(newSourceArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ELEMENT_DERIVATION__SOURCE_ARTIFACT, newSourceArtifact, newSourceArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ELEMENT_DERIVATION__SOURCE_ARTIFACT:
				return basicSetSourceArtifact(null, msgs);
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
			case Mif2Package.ELEMENT_DERIVATION__SOURCE_ARTIFACT:
				return getSourceArtifact();
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
			case Mif2Package.ELEMENT_DERIVATION__SOURCE_ARTIFACT:
				setSourceArtifact((PackageOrArtifactRef)newValue);
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
			case Mif2Package.ELEMENT_DERIVATION__SOURCE_ARTIFACT:
				setSourceArtifact((PackageOrArtifactRef)null);
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
			case Mif2Package.ELEMENT_DERIVATION__SOURCE_ARTIFACT:
				return sourceArtifact != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDerivationImpl
