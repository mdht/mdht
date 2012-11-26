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

import org.openhealthtools.mdht.emf.hl7.mif2.DiagramGraphicInformation;
import org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction;
import org.openhealthtools.mdht.emf.hl7.mif2.ExampleSystem;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.StoryboardArtifactReferences;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storyboard Artifact References</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardArtifactReferencesImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardArtifactReferencesImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardArtifactReferencesImpl#getGraphicRepresentation <em>Graphic Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardArtifactReferencesImpl#getFigure <em>Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryboardArtifactReferencesImpl extends EObjectImpl implements StoryboardArtifactReferences {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleSystem> system;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<ExampleInteraction> interaction;

	/**
	 * The cached value of the '{@link #getGraphicRepresentation() <em>Graphic Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicRepresentation()
	 * @generated
	 * @ordered
	 */
	protected DiagramGraphicInformation graphicRepresentation;

	/**
	 * The cached value of the '{@link #getFigure() <em>Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigure()
	 * @generated
	 * @ordered
	 */
	protected Img figure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryboardArtifactReferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STORYBOARD_ARTIFACT_REFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExampleSystem> getSystem() {
		if (system == null) {
			system = new EObjectContainmentEList<ExampleSystem>(
				ExampleSystem.class, this, Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__SYSTEM);
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExampleInteraction> getInteraction() {
		if (interaction == null) {
			interaction = new EObjectContainmentEList<ExampleInteraction>(
				ExampleInteraction.class, this, Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__INTERACTION);
		}
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramGraphicInformation getGraphicRepresentation() {
		return graphicRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphicRepresentation(DiagramGraphicInformation newGraphicRepresentation,
			NotificationChain msgs) {
		DiagramGraphicInformation oldGraphicRepresentation = graphicRepresentation;
		graphicRepresentation = newGraphicRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__GRAPHIC_REPRESENTATION,
				oldGraphicRepresentation, newGraphicRepresentation);
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
	public void setGraphicRepresentation(DiagramGraphicInformation newGraphicRepresentation) {
		if (newGraphicRepresentation != graphicRepresentation) {
			NotificationChain msgs = null;
			if (graphicRepresentation != null) {
				msgs = ((InternalEObject) graphicRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__GRAPHIC_REPRESENTATION, null, msgs);
			}
			if (newGraphicRepresentation != null) {
				msgs = ((InternalEObject) newGraphicRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__GRAPHIC_REPRESENTATION, null, msgs);
			}
			msgs = basicSetGraphicRepresentation(newGraphicRepresentation, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__GRAPHIC_REPRESENTATION,
				newGraphicRepresentation, newGraphicRepresentation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Img getFigure() {
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigure(Img newFigure, NotificationChain msgs) {
		Img oldFigure = figure;
		figure = newFigure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__FIGURE, oldFigure, newFigure);
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
	public void setFigure(Img newFigure) {
		if (newFigure != figure) {
			NotificationChain msgs = null;
			if (figure != null) {
				msgs = ((InternalEObject) figure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__FIGURE, null, msgs);
			}
			if (newFigure != null) {
				msgs = ((InternalEObject) newFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__FIGURE, null, msgs);
			}
			msgs = basicSetFigure(newFigure, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__FIGURE, newFigure, newFigure));
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
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__SYSTEM:
				return ((InternalEList<?>) getSystem()).basicRemove(otherEnd, msgs);
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__INTERACTION:
				return ((InternalEList<?>) getInteraction()).basicRemove(otherEnd, msgs);
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__GRAPHIC_REPRESENTATION:
				return basicSetGraphicRepresentation(null, msgs);
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__FIGURE:
				return basicSetFigure(null, msgs);
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
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__SYSTEM:
				return getSystem();
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__INTERACTION:
				return getInteraction();
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__GRAPHIC_REPRESENTATION:
				return getGraphicRepresentation();
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__FIGURE:
				return getFigure();
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
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__SYSTEM:
				getSystem().clear();
				getSystem().addAll((Collection<? extends ExampleSystem>) newValue);
				return;
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__INTERACTION:
				getInteraction().clear();
				getInteraction().addAll((Collection<? extends ExampleInteraction>) newValue);
				return;
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__GRAPHIC_REPRESENTATION:
				setGraphicRepresentation((DiagramGraphicInformation) newValue);
				return;
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__FIGURE:
				setFigure((Img) newValue);
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
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__SYSTEM:
				getSystem().clear();
				return;
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__INTERACTION:
				getInteraction().clear();
				return;
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__GRAPHIC_REPRESENTATION:
				setGraphicRepresentation((DiagramGraphicInformation) null);
				return;
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__FIGURE:
				setFigure((Img) null);
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
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__SYSTEM:
				return system != null && !system.isEmpty();
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__INTERACTION:
				return interaction != null && !interaction.isEmpty();
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__GRAPHIC_REPRESENTATION:
				return graphicRepresentation != null;
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES__FIGURE:
				return figure != null;
		}
		return super.eIsSet(featureID);
	}

} // StoryboardArtifactReferencesImpl
