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

import org.openhealthtools.mdht.emf.hl7.mif2.ElementChange;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.MifChanges;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageOrArtifactRef;
import org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mif Changes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.MifChangesImpl#getRenderingInformation <em>Rendering Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.MifChangesImpl#getOriginalArtifact <em>Original Artifact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.MifChangesImpl#getRevisedArtifact <em>Revised Artifact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.MifChangesImpl#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MifChangesImpl extends PackageBaseImpl implements MifChanges {
	/**
	 * The cached value of the '{@link #getRenderingInformation() <em>Rendering Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderingInformation()
	 * @generated
	 * @ordered
	 */
	protected RenderingInformation renderingInformation;

	/**
	 * The cached value of the '{@link #getOriginalArtifact() <em>Original Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalArtifact()
	 * @generated
	 * @ordered
	 */
	protected PackageOrArtifactRef originalArtifact;

	/**
	 * The cached value of the '{@link #getRevisedArtifact() <em>Revised Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedArtifact()
	 * @generated
	 * @ordered
	 */
	protected PackageOrArtifactRef revisedArtifact;

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
	protected MifChangesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.MIF_CHANGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingInformation getRenderingInformation() {
		return renderingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenderingInformation(RenderingInformation newRenderingInformation, NotificationChain msgs) {
		RenderingInformation oldRenderingInformation = renderingInformation;
		renderingInformation = newRenderingInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.MIF_CHANGES__RENDERING_INFORMATION, oldRenderingInformation, newRenderingInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderingInformation(RenderingInformation newRenderingInformation) {
		if (newRenderingInformation != renderingInformation) {
			NotificationChain msgs = null;
			if (renderingInformation != null)
				msgs = ((InternalEObject)renderingInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.MIF_CHANGES__RENDERING_INFORMATION, null, msgs);
			if (newRenderingInformation != null)
				msgs = ((InternalEObject)newRenderingInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.MIF_CHANGES__RENDERING_INFORMATION, null, msgs);
			msgs = basicSetRenderingInformation(newRenderingInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.MIF_CHANGES__RENDERING_INFORMATION, newRenderingInformation, newRenderingInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageOrArtifactRef getOriginalArtifact() {
		return originalArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalArtifact(PackageOrArtifactRef newOriginalArtifact, NotificationChain msgs) {
		PackageOrArtifactRef oldOriginalArtifact = originalArtifact;
		originalArtifact = newOriginalArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.MIF_CHANGES__ORIGINAL_ARTIFACT, oldOriginalArtifact, newOriginalArtifact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalArtifact(PackageOrArtifactRef newOriginalArtifact) {
		if (newOriginalArtifact != originalArtifact) {
			NotificationChain msgs = null;
			if (originalArtifact != null)
				msgs = ((InternalEObject)originalArtifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.MIF_CHANGES__ORIGINAL_ARTIFACT, null, msgs);
			if (newOriginalArtifact != null)
				msgs = ((InternalEObject)newOriginalArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.MIF_CHANGES__ORIGINAL_ARTIFACT, null, msgs);
			msgs = basicSetOriginalArtifact(newOriginalArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.MIF_CHANGES__ORIGINAL_ARTIFACT, newOriginalArtifact, newOriginalArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageOrArtifactRef getRevisedArtifact() {
		return revisedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevisedArtifact(PackageOrArtifactRef newRevisedArtifact, NotificationChain msgs) {
		PackageOrArtifactRef oldRevisedArtifact = revisedArtifact;
		revisedArtifact = newRevisedArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.MIF_CHANGES__REVISED_ARTIFACT, oldRevisedArtifact, newRevisedArtifact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedArtifact(PackageOrArtifactRef newRevisedArtifact) {
		if (newRevisedArtifact != revisedArtifact) {
			NotificationChain msgs = null;
			if (revisedArtifact != null)
				msgs = ((InternalEObject)revisedArtifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.MIF_CHANGES__REVISED_ARTIFACT, null, msgs);
			if (newRevisedArtifact != null)
				msgs = ((InternalEObject)newRevisedArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.MIF_CHANGES__REVISED_ARTIFACT, null, msgs);
			msgs = basicSetRevisedArtifact(newRevisedArtifact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.MIF_CHANGES__REVISED_ARTIFACT, newRevisedArtifact, newRevisedArtifact));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.MIF_CHANGES__CHANGE, oldChange, newChange);
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
				msgs = ((InternalEObject)change).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.MIF_CHANGES__CHANGE, null, msgs);
			if (newChange != null)
				msgs = ((InternalEObject)newChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.MIF_CHANGES__CHANGE, null, msgs);
			msgs = basicSetChange(newChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.MIF_CHANGES__CHANGE, newChange, newChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.MIF_CHANGES__RENDERING_INFORMATION:
				return basicSetRenderingInformation(null, msgs);
			case Mif2Package.MIF_CHANGES__ORIGINAL_ARTIFACT:
				return basicSetOriginalArtifact(null, msgs);
			case Mif2Package.MIF_CHANGES__REVISED_ARTIFACT:
				return basicSetRevisedArtifact(null, msgs);
			case Mif2Package.MIF_CHANGES__CHANGE:
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
			case Mif2Package.MIF_CHANGES__RENDERING_INFORMATION:
				return getRenderingInformation();
			case Mif2Package.MIF_CHANGES__ORIGINAL_ARTIFACT:
				return getOriginalArtifact();
			case Mif2Package.MIF_CHANGES__REVISED_ARTIFACT:
				return getRevisedArtifact();
			case Mif2Package.MIF_CHANGES__CHANGE:
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
			case Mif2Package.MIF_CHANGES__RENDERING_INFORMATION:
				setRenderingInformation((RenderingInformation)newValue);
				return;
			case Mif2Package.MIF_CHANGES__ORIGINAL_ARTIFACT:
				setOriginalArtifact((PackageOrArtifactRef)newValue);
				return;
			case Mif2Package.MIF_CHANGES__REVISED_ARTIFACT:
				setRevisedArtifact((PackageOrArtifactRef)newValue);
				return;
			case Mif2Package.MIF_CHANGES__CHANGE:
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
			case Mif2Package.MIF_CHANGES__RENDERING_INFORMATION:
				setRenderingInformation((RenderingInformation)null);
				return;
			case Mif2Package.MIF_CHANGES__ORIGINAL_ARTIFACT:
				setOriginalArtifact((PackageOrArtifactRef)null);
				return;
			case Mif2Package.MIF_CHANGES__REVISED_ARTIFACT:
				setRevisedArtifact((PackageOrArtifactRef)null);
				return;
			case Mif2Package.MIF_CHANGES__CHANGE:
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
			case Mif2Package.MIF_CHANGES__RENDERING_INFORMATION:
				return renderingInformation != null;
			case Mif2Package.MIF_CHANGES__ORIGINAL_ARTIFACT:
				return originalArtifact != null;
			case Mif2Package.MIF_CHANGES__REVISED_ARTIFACT:
				return revisedArtifact != null;
			case Mif2Package.MIF_CHANGES__CHANGE:
				return change != null;
		}
		return super.eIsSet(featureID);
	}

} //MifChangesImpl
