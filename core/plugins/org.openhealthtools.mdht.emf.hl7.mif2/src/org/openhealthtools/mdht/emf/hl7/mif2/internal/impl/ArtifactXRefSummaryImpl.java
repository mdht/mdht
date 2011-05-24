/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactCrossReference;
import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactXRefSummary;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact XRef Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ArtifactXRefSummaryImpl#getRenderingInformation <em>Rendering Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ArtifactXRefSummaryImpl#getArtifact <em>Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactXRefSummaryImpl extends EObjectImpl implements ArtifactXRefSummary {
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
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected ArtifactCrossReference artifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactXRefSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ARTIFACT_XREF_SUMMARY;
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
	public NotificationChain basicSetRenderingInformation(RenderingInformation newRenderingInformation,
			NotificationChain msgs) {
		RenderingInformation oldRenderingInformation = renderingInformation;
		renderingInformation = newRenderingInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.ARTIFACT_XREF_SUMMARY__RENDERING_INFORMATION,
				oldRenderingInformation, newRenderingInformation);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
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
			if (renderingInformation != null) {
				msgs = ((InternalEObject) renderingInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ARTIFACT_XREF_SUMMARY__RENDERING_INFORMATION, null, msgs);
			}
			if (newRenderingInformation != null) {
				msgs = ((InternalEObject) newRenderingInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ARTIFACT_XREF_SUMMARY__RENDERING_INFORMATION, null, msgs);
			}
			msgs = basicSetRenderingInformation(newRenderingInformation, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ARTIFACT_XREF_SUMMARY__RENDERING_INFORMATION,
				newRenderingInformation, newRenderingInformation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactCrossReference getArtifact() {
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifact(ArtifactCrossReference newArtifact, NotificationChain msgs) {
		ArtifactCrossReference oldArtifact = artifact;
		artifact = newArtifact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.ARTIFACT_XREF_SUMMARY__ARTIFACT, oldArtifact, newArtifact);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifact(ArtifactCrossReference newArtifact) {
		if (newArtifact != artifact) {
			NotificationChain msgs = null;
			if (artifact != null) {
				msgs = ((InternalEObject) artifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ARTIFACT_XREF_SUMMARY__ARTIFACT, null, msgs);
			}
			if (newArtifact != null) {
				msgs = ((InternalEObject) newArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ARTIFACT_XREF_SUMMARY__ARTIFACT, null, msgs);
			}
			msgs = basicSetArtifact(newArtifact, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ARTIFACT_XREF_SUMMARY__ARTIFACT, newArtifact, newArtifact));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.ARTIFACT_XREF_SUMMARY__RENDERING_INFORMATION:
				return basicSetRenderingInformation(null, msgs);
			case Mif2Package.ARTIFACT_XREF_SUMMARY__ARTIFACT:
				return basicSetArtifact(null, msgs);
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
			case Mif2Package.ARTIFACT_XREF_SUMMARY__RENDERING_INFORMATION:
				return getRenderingInformation();
			case Mif2Package.ARTIFACT_XREF_SUMMARY__ARTIFACT:
				return getArtifact();
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
			case Mif2Package.ARTIFACT_XREF_SUMMARY__RENDERING_INFORMATION:
				setRenderingInformation((RenderingInformation) newValue);
				return;
			case Mif2Package.ARTIFACT_XREF_SUMMARY__ARTIFACT:
				setArtifact((ArtifactCrossReference) newValue);
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
			case Mif2Package.ARTIFACT_XREF_SUMMARY__RENDERING_INFORMATION:
				setRenderingInformation((RenderingInformation) null);
				return;
			case Mif2Package.ARTIFACT_XREF_SUMMARY__ARTIFACT:
				setArtifact((ArtifactCrossReference) null);
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
			case Mif2Package.ARTIFACT_XREF_SUMMARY__RENDERING_INFORMATION:
				return renderingInformation != null;
			case Mif2Package.ARTIFACT_XREF_SUMMARY__ARTIFACT:
				return artifact != null;
		}
		return super.eIsSet(featureID);
	}

} // ArtifactXRefSummaryImpl
