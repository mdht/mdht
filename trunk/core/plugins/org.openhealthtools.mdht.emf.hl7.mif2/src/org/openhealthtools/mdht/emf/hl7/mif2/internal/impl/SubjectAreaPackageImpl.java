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

import org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.LocalClassRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation;
import org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Area Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SubjectAreaPackageImpl#getApprovalInfo <em>Approval Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SubjectAreaPackageImpl#getGraphicRepresentation <em>Graphic Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SubjectAreaPackageImpl#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SubjectAreaPackageImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SubjectAreaPackageImpl#getSubjectAreaPackage <em>Subject Area Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SubjectAreaPackageImpl#getContainedClass <em>Contained Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectAreaPackageImpl extends PackageBaseImpl implements SubjectAreaPackage {
	/**
	 * The cached value of the '{@link #getApprovalInfo() <em>Approval Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalInfo()
	 * @generated
	 * @ordered
	 */
	protected ApprovalInfo approvalInfo;

	/**
	 * The cached value of the '{@link #getGraphicRepresentation() <em>Graphic Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticPackageDiagramGraphicInformation> graphicRepresentation;

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
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected SubjectAreaAnnotations annotations;

	/**
	 * The cached value of the '{@link #getSubjectAreaPackage() <em>Subject Area Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectAreaPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<SubjectAreaPackage> subjectAreaPackage;

	/**
	 * The cached value of the '{@link #getContainedClass() <em>Contained Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedClass()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalClassRef> containedClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectAreaPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SUBJECT_AREA_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalInfo getApprovalInfo() {
		return approvalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovalInfo(ApprovalInfo newApprovalInfo, NotificationChain msgs) {
		ApprovalInfo oldApprovalInfo = approvalInfo;
		approvalInfo = newApprovalInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.SUBJECT_AREA_PACKAGE__APPROVAL_INFO, oldApprovalInfo,
				newApprovalInfo);
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
	public void setApprovalInfo(ApprovalInfo newApprovalInfo) {
		if (newApprovalInfo != approvalInfo) {
			NotificationChain msgs = null;
			if (approvalInfo != null) {
				msgs = ((InternalEObject) approvalInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SUBJECT_AREA_PACKAGE__APPROVAL_INFO, null, msgs);
			}
			if (newApprovalInfo != null) {
				msgs = ((InternalEObject) newApprovalInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SUBJECT_AREA_PACKAGE__APPROVAL_INFO, null, msgs);
			}
			msgs = basicSetApprovalInfo(newApprovalInfo, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SUBJECT_AREA_PACKAGE__APPROVAL_INFO, newApprovalInfo,
				newApprovalInfo));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaticPackageDiagramGraphicInformation> getGraphicRepresentation() {
		if (graphicRepresentation == null) {
			graphicRepresentation = new EObjectContainmentEList<StaticPackageDiagramGraphicInformation>(
				StaticPackageDiagramGraphicInformation.class, this,
				Mif2Package.SUBJECT_AREA_PACKAGE__GRAPHIC_REPRESENTATION);
		}
		return graphicRepresentation;
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
				this, Notification.SET, Mif2Package.SUBJECT_AREA_PACKAGE__FIGURE, oldFigure, newFigure);
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
						Mif2Package.SUBJECT_AREA_PACKAGE__FIGURE, null, msgs);
			}
			if (newFigure != null) {
				msgs = ((InternalEObject) newFigure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SUBJECT_AREA_PACKAGE__FIGURE, null, msgs);
			}
			msgs = basicSetFigure(newFigure, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SUBJECT_AREA_PACKAGE__FIGURE, newFigure, newFigure));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectAreaAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(SubjectAreaAnnotations newAnnotations, NotificationChain msgs) {
		SubjectAreaAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.SUBJECT_AREA_PACKAGE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
	public void setAnnotations(SubjectAreaAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SUBJECT_AREA_PACKAGE__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SUBJECT_AREA_PACKAGE__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SUBJECT_AREA_PACKAGE__ANNOTATIONS, newAnnotations, newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubjectAreaPackage> getSubjectAreaPackage() {
		if (subjectAreaPackage == null) {
			subjectAreaPackage = new EObjectContainmentEList<SubjectAreaPackage>(
				SubjectAreaPackage.class, this, Mif2Package.SUBJECT_AREA_PACKAGE__SUBJECT_AREA_PACKAGE);
		}
		return subjectAreaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalClassRef> getContainedClass() {
		if (containedClass == null) {
			containedClass = new EObjectContainmentEList<LocalClassRef>(
				LocalClassRef.class, this, Mif2Package.SUBJECT_AREA_PACKAGE__CONTAINED_CLASS);
		}
		return containedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.SUBJECT_AREA_PACKAGE__APPROVAL_INFO:
				return basicSetApprovalInfo(null, msgs);
			case Mif2Package.SUBJECT_AREA_PACKAGE__GRAPHIC_REPRESENTATION:
				return ((InternalEList<?>) getGraphicRepresentation()).basicRemove(otherEnd, msgs);
			case Mif2Package.SUBJECT_AREA_PACKAGE__FIGURE:
				return basicSetFigure(null, msgs);
			case Mif2Package.SUBJECT_AREA_PACKAGE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.SUBJECT_AREA_PACKAGE__SUBJECT_AREA_PACKAGE:
				return ((InternalEList<?>) getSubjectAreaPackage()).basicRemove(otherEnd, msgs);
			case Mif2Package.SUBJECT_AREA_PACKAGE__CONTAINED_CLASS:
				return ((InternalEList<?>) getContainedClass()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.SUBJECT_AREA_PACKAGE__APPROVAL_INFO:
				return getApprovalInfo();
			case Mif2Package.SUBJECT_AREA_PACKAGE__GRAPHIC_REPRESENTATION:
				return getGraphicRepresentation();
			case Mif2Package.SUBJECT_AREA_PACKAGE__FIGURE:
				return getFigure();
			case Mif2Package.SUBJECT_AREA_PACKAGE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.SUBJECT_AREA_PACKAGE__SUBJECT_AREA_PACKAGE:
				return getSubjectAreaPackage();
			case Mif2Package.SUBJECT_AREA_PACKAGE__CONTAINED_CLASS:
				return getContainedClass();
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
			case Mif2Package.SUBJECT_AREA_PACKAGE__APPROVAL_INFO:
				setApprovalInfo((ApprovalInfo) newValue);
				return;
			case Mif2Package.SUBJECT_AREA_PACKAGE__GRAPHIC_REPRESENTATION:
				getGraphicRepresentation().clear();
				getGraphicRepresentation().addAll(
					(Collection<? extends StaticPackageDiagramGraphicInformation>) newValue);
				return;
			case Mif2Package.SUBJECT_AREA_PACKAGE__FIGURE:
				setFigure((Img) newValue);
				return;
			case Mif2Package.SUBJECT_AREA_PACKAGE__ANNOTATIONS:
				setAnnotations((SubjectAreaAnnotations) newValue);
				return;
			case Mif2Package.SUBJECT_AREA_PACKAGE__SUBJECT_AREA_PACKAGE:
				getSubjectAreaPackage().clear();
				getSubjectAreaPackage().addAll((Collection<? extends SubjectAreaPackage>) newValue);
				return;
			case Mif2Package.SUBJECT_AREA_PACKAGE__CONTAINED_CLASS:
				getContainedClass().clear();
				getContainedClass().addAll((Collection<? extends LocalClassRef>) newValue);
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
			case Mif2Package.SUBJECT_AREA_PACKAGE__APPROVAL_INFO:
				setApprovalInfo((ApprovalInfo) null);
				return;
			case Mif2Package.SUBJECT_AREA_PACKAGE__GRAPHIC_REPRESENTATION:
				getGraphicRepresentation().clear();
				return;
			case Mif2Package.SUBJECT_AREA_PACKAGE__FIGURE:
				setFigure((Img) null);
				return;
			case Mif2Package.SUBJECT_AREA_PACKAGE__ANNOTATIONS:
				setAnnotations((SubjectAreaAnnotations) null);
				return;
			case Mif2Package.SUBJECT_AREA_PACKAGE__SUBJECT_AREA_PACKAGE:
				getSubjectAreaPackage().clear();
				return;
			case Mif2Package.SUBJECT_AREA_PACKAGE__CONTAINED_CLASS:
				getContainedClass().clear();
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
			case Mif2Package.SUBJECT_AREA_PACKAGE__APPROVAL_INFO:
				return approvalInfo != null;
			case Mif2Package.SUBJECT_AREA_PACKAGE__GRAPHIC_REPRESENTATION:
				return graphicRepresentation != null && !graphicRepresentation.isEmpty();
			case Mif2Package.SUBJECT_AREA_PACKAGE__FIGURE:
				return figure != null;
			case Mif2Package.SUBJECT_AREA_PACKAGE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.SUBJECT_AREA_PACKAGE__SUBJECT_AREA_PACKAGE:
				return subjectAreaPackage != null && !subjectAreaPackage.isEmpty();
			case Mif2Package.SUBJECT_AREA_PACKAGE__CONTAINED_CLASS:
				return containedClass != null && !containedClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // SubjectAreaPackageImpl
