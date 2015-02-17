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

import org.openhealthtools.mdht.emf.hl7.mif2.ClassGraphicInformation;
import org.openhealthtools.mdht.emf.hl7.mif2.GraphEdgeGraphicInformation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.NodeWithConnectionGraphicInformation;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDiagramPresentationKind;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Package Diagram Graphic Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticPackageDiagramGraphicInformationImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticPackageDiagramGraphicInformationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticPackageDiagramGraphicInformationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticPackageDiagramGraphicInformationImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticPackageDiagramGraphicInformationImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticPackageDiagramGraphicInformationImpl#getPresentation <em>Presentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticPackageDiagramGraphicInformationImpl extends DiagramGraphicInformationImpl implements
		StaticPackageDiagramGraphicInformation {
	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeWithConnectionGraphicInformation> entryPoint;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassGraphicInformation> class_;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphEdgeGraphicInformation> association;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphEdgeGraphicInformation> generalization;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeWithConnectionGraphicInformation> annotation;

	/**
	 * The default value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected static final StaticModelDiagramPresentationKind PRESENTATION_EDEFAULT = StaticModelDiagramPresentationKind.UML;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected StaticModelDiagramPresentationKind presentation = PRESENTATION_EDEFAULT;

	/**
	 * This is true if the Presentation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean presentationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticPackageDiagramGraphicInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeWithConnectionGraphicInformation> getEntryPoint() {
		if (entryPoint == null) {
			entryPoint = new EObjectContainmentEList<NodeWithConnectionGraphicInformation>(
				NodeWithConnectionGraphicInformation.class, this,
				Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ENTRY_POINT);
		}
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassGraphicInformation> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<ClassGraphicInformation>(
				ClassGraphicInformation.class, this, Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphEdgeGraphicInformation> getAssociation() {
		if (association == null) {
			association = new EObjectContainmentEList<GraphEdgeGraphicInformation>(
				GraphEdgeGraphicInformation.class, this,
				Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ASSOCIATION);
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphEdgeGraphicInformation> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectContainmentEList<GraphEdgeGraphicInformation>(
				GraphEdgeGraphicInformation.class, this,
				Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__GENERALIZATION);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeWithConnectionGraphicInformation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<NodeWithConnectionGraphicInformation>(
				NodeWithConnectionGraphicInformation.class, this,
				Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelDiagramPresentationKind getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentation(StaticModelDiagramPresentationKind newPresentation) {
		StaticModelDiagramPresentationKind oldPresentation = presentation;
		presentation = newPresentation == null
				? PRESENTATION_EDEFAULT
				: newPresentation;
		boolean oldPresentationESet = presentationESet;
		presentationESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__PRESENTATION,
				oldPresentation, presentation, !oldPresentationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPresentation() {
		StaticModelDiagramPresentationKind oldPresentation = presentation;
		boolean oldPresentationESet = presentationESet;
		presentation = PRESENTATION_EDEFAULT;
		presentationESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__PRESENTATION,
				oldPresentation, PRESENTATION_EDEFAULT, oldPresentationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPresentation() {
		return presentationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ENTRY_POINT:
				return ((InternalEList<?>) getEntryPoint()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__CLASS:
				return ((InternalEList<?>) getClass_()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ASSOCIATION:
				return ((InternalEList<?>) getAssociation()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__GENERALIZATION:
				return ((InternalEList<?>) getGeneralization()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ANNOTATION:
				return ((InternalEList<?>) getAnnotation()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ENTRY_POINT:
				return getEntryPoint();
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__CLASS:
				return getClass_();
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ASSOCIATION:
				return getAssociation();
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__GENERALIZATION:
				return getGeneralization();
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ANNOTATION:
				return getAnnotation();
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__PRESENTATION:
				return getPresentation();
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
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ENTRY_POINT:
				getEntryPoint().clear();
				getEntryPoint().addAll((Collection<? extends NodeWithConnectionGraphicInformation>) newValue);
				return;
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends ClassGraphicInformation>) newValue);
				return;
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends GraphEdgeGraphicInformation>) newValue);
				return;
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends GraphEdgeGraphicInformation>) newValue);
				return;
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends NodeWithConnectionGraphicInformation>) newValue);
				return;
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__PRESENTATION:
				setPresentation((StaticModelDiagramPresentationKind) newValue);
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
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ENTRY_POINT:
				getEntryPoint().clear();
				return;
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__CLASS:
				getClass_().clear();
				return;
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ASSOCIATION:
				getAssociation().clear();
				return;
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__GENERALIZATION:
				getGeneralization().clear();
				return;
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ANNOTATION:
				getAnnotation().clear();
				return;
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__PRESENTATION:
				unsetPresentation();
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
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ENTRY_POINT:
				return entryPoint != null && !entryPoint.isEmpty();
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__CLASS:
				return class_ != null && !class_.isEmpty();
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ASSOCIATION:
				return association != null && !association.isEmpty();
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION__PRESENTATION:
				return isSetPresentation();
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (presentation: ");
		if (presentationESet) {
			result.append(presentation);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // StaticPackageDiagramGraphicInformationImpl
