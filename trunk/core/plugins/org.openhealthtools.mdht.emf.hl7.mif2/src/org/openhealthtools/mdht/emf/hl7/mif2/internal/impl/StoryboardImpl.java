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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Storyboard;
import org.openhealthtools.mdht.emf.hl7.mif2.StoryboardAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.StoryboardArtifactReferences;
import org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative;
import org.openhealthtools.mdht.emf.hl7.mif2.XMIContent;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storyboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardImpl#getCorrespondingArtifacts <em>Corresponding Artifacts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardImpl#getActivityDiagramFigure <em>Activity Diagram Figure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardImpl#getParentStoryboard <em>Parent Storyboard</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardImpl#getNarrative <em>Narrative</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StoryboardImpl#getActivityDiagram <em>Activity Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryboardImpl extends PackageArtifactImpl implements Storyboard {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected StoryboardAnnotations annotations;

	/**
	 * The cached value of the '{@link #getCorrespondingArtifacts() <em>Corresponding Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingArtifacts()
	 * @generated
	 * @ordered
	 */
	protected StoryboardArtifactReferences correspondingArtifacts;

	/**
	 * The cached value of the '{@link #getActivityDiagramFigure() <em>Activity Diagram Figure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityDiagramFigure()
	 * @generated
	 * @ordered
	 */
	protected Img activityDiagramFigure;

	/**
	 * The cached value of the '{@link #getParentStoryboard() <em>Parent Storyboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStoryboard()
	 * @generated
	 * @ordered
	 */
	protected PackageRef parentStoryboard;

	/**
	 * The cached value of the '{@link #getNarrative() <em>Narrative</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarrative()
	 * @generated
	 * @ordered
	 */
	protected EList<StoryboardNarrative> narrative;

	/**
	 * The cached value of the '{@link #getActivityDiagram() <em>Activity Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityDiagram()
	 * @generated
	 * @ordered
	 */
	protected XMIContent activityDiagram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoryboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STORYBOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryboardAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(StoryboardAnnotations newAnnotations, NotificationChain msgs) {
		StoryboardAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD__ANNOTATIONS, oldAnnotations, newAnnotations);
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
	public void setAnnotations(StoryboardAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD__ANNOTATIONS, newAnnotations, newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryboardArtifactReferences getCorrespondingArtifacts() {
		return correspondingArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrespondingArtifacts(StoryboardArtifactReferences newCorrespondingArtifacts,
			NotificationChain msgs) {
		StoryboardArtifactReferences oldCorrespondingArtifacts = correspondingArtifacts;
		correspondingArtifacts = newCorrespondingArtifacts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD__CORRESPONDING_ARTIFACTS, oldCorrespondingArtifacts,
				newCorrespondingArtifacts);
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
	public void setCorrespondingArtifacts(StoryboardArtifactReferences newCorrespondingArtifacts) {
		if (newCorrespondingArtifacts != correspondingArtifacts) {
			NotificationChain msgs = null;
			if (correspondingArtifacts != null) {
				msgs = ((InternalEObject) correspondingArtifacts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD__CORRESPONDING_ARTIFACTS, null, msgs);
			}
			if (newCorrespondingArtifacts != null) {
				msgs = ((InternalEObject) newCorrespondingArtifacts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD__CORRESPONDING_ARTIFACTS, null, msgs);
			}
			msgs = basicSetCorrespondingArtifacts(newCorrespondingArtifacts, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD__CORRESPONDING_ARTIFACTS, newCorrespondingArtifacts,
				newCorrespondingArtifacts));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Img getActivityDiagramFigure() {
		return activityDiagramFigure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityDiagramFigure(Img newActivityDiagramFigure, NotificationChain msgs) {
		Img oldActivityDiagramFigure = activityDiagramFigure;
		activityDiagramFigure = newActivityDiagramFigure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM_FIGURE, oldActivityDiagramFigure,
				newActivityDiagramFigure);
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
	public void setActivityDiagramFigure(Img newActivityDiagramFigure) {
		if (newActivityDiagramFigure != activityDiagramFigure) {
			NotificationChain msgs = null;
			if (activityDiagramFigure != null) {
				msgs = ((InternalEObject) activityDiagramFigure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM_FIGURE, null, msgs);
			}
			if (newActivityDiagramFigure != null) {
				msgs = ((InternalEObject) newActivityDiagramFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM_FIGURE, null, msgs);
			}
			msgs = basicSetActivityDiagramFigure(newActivityDiagramFigure, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM_FIGURE, newActivityDiagramFigure,
				newActivityDiagramFigure));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getParentStoryboard() {
		return parentStoryboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStoryboard(PackageRef newParentStoryboard, NotificationChain msgs) {
		PackageRef oldParentStoryboard = parentStoryboard;
		parentStoryboard = newParentStoryboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD__PARENT_STORYBOARD, oldParentStoryboard,
				newParentStoryboard);
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
	public void setParentStoryboard(PackageRef newParentStoryboard) {
		if (newParentStoryboard != parentStoryboard) {
			NotificationChain msgs = null;
			if (parentStoryboard != null) {
				msgs = ((InternalEObject) parentStoryboard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD__PARENT_STORYBOARD, null, msgs);
			}
			if (newParentStoryboard != null) {
				msgs = ((InternalEObject) newParentStoryboard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD__PARENT_STORYBOARD, null, msgs);
			}
			msgs = basicSetParentStoryboard(newParentStoryboard, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD__PARENT_STORYBOARD, newParentStoryboard,
				newParentStoryboard));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StoryboardNarrative> getNarrative() {
		if (narrative == null) {
			narrative = new EObjectContainmentEList<StoryboardNarrative>(
				StoryboardNarrative.class, this, Mif2Package.STORYBOARD__NARRATIVE);
		}
		return narrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMIContent getActivityDiagram() {
		return activityDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityDiagram(XMIContent newActivityDiagram, NotificationChain msgs) {
		XMIContent oldActivityDiagram = activityDiagram;
		activityDiagram = newActivityDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM, oldActivityDiagram,
				newActivityDiagram);
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
	public void setActivityDiagram(XMIContent newActivityDiagram) {
		if (newActivityDiagram != activityDiagram) {
			NotificationChain msgs = null;
			if (activityDiagram != null) {
				msgs = ((InternalEObject) activityDiagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM, null, msgs);
			}
			if (newActivityDiagram != null) {
				msgs = ((InternalEObject) newActivityDiagram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM, null, msgs);
			}
			msgs = basicSetActivityDiagram(newActivityDiagram, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM, newActivityDiagram,
				newActivityDiagram));
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
			case Mif2Package.STORYBOARD__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.STORYBOARD__CORRESPONDING_ARTIFACTS:
				return basicSetCorrespondingArtifacts(null, msgs);
			case Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM_FIGURE:
				return basicSetActivityDiagramFigure(null, msgs);
			case Mif2Package.STORYBOARD__PARENT_STORYBOARD:
				return basicSetParentStoryboard(null, msgs);
			case Mif2Package.STORYBOARD__NARRATIVE:
				return ((InternalEList<?>) getNarrative()).basicRemove(otherEnd, msgs);
			case Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM:
				return basicSetActivityDiagram(null, msgs);
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
			case Mif2Package.STORYBOARD__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.STORYBOARD__CORRESPONDING_ARTIFACTS:
				return getCorrespondingArtifacts();
			case Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM_FIGURE:
				return getActivityDiagramFigure();
			case Mif2Package.STORYBOARD__PARENT_STORYBOARD:
				return getParentStoryboard();
			case Mif2Package.STORYBOARD__NARRATIVE:
				return getNarrative();
			case Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM:
				return getActivityDiagram();
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
			case Mif2Package.STORYBOARD__ANNOTATIONS:
				setAnnotations((StoryboardAnnotations) newValue);
				return;
			case Mif2Package.STORYBOARD__CORRESPONDING_ARTIFACTS:
				setCorrespondingArtifacts((StoryboardArtifactReferences) newValue);
				return;
			case Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM_FIGURE:
				setActivityDiagramFigure((Img) newValue);
				return;
			case Mif2Package.STORYBOARD__PARENT_STORYBOARD:
				setParentStoryboard((PackageRef) newValue);
				return;
			case Mif2Package.STORYBOARD__NARRATIVE:
				getNarrative().clear();
				getNarrative().addAll((Collection<? extends StoryboardNarrative>) newValue);
				return;
			case Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM:
				setActivityDiagram((XMIContent) newValue);
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
			case Mif2Package.STORYBOARD__ANNOTATIONS:
				setAnnotations((StoryboardAnnotations) null);
				return;
			case Mif2Package.STORYBOARD__CORRESPONDING_ARTIFACTS:
				setCorrespondingArtifacts((StoryboardArtifactReferences) null);
				return;
			case Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM_FIGURE:
				setActivityDiagramFigure((Img) null);
				return;
			case Mif2Package.STORYBOARD__PARENT_STORYBOARD:
				setParentStoryboard((PackageRef) null);
				return;
			case Mif2Package.STORYBOARD__NARRATIVE:
				getNarrative().clear();
				return;
			case Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM:
				setActivityDiagram((XMIContent) null);
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
			case Mif2Package.STORYBOARD__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.STORYBOARD__CORRESPONDING_ARTIFACTS:
				return correspondingArtifacts != null;
			case Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM_FIGURE:
				return activityDiagramFigure != null;
			case Mif2Package.STORYBOARD__PARENT_STORYBOARD:
				return parentStoryboard != null;
			case Mif2Package.STORYBOARD__NARRATIVE:
				return narrative != null && !narrative.isEmpty();
			case Mif2Package.STORYBOARD__ACTIVITY_DIAGRAM:
				return activityDiagram != null;
		}
		return super.eIsSet(featureID);
	}

} // StoryboardImpl
