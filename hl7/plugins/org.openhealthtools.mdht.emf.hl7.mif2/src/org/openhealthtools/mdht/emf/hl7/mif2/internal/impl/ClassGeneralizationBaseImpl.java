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

import org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase;
import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind;
import org.openhealthtools.mdht.emf.hl7.mif2.GeneralizationAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Generalization Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassGeneralizationBaseImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassGeneralizationBaseImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassGeneralizationBaseImpl#getGraphicLinkId <em>Graphic Link Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassGeneralizationBaseImpl#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassGeneralizationBaseImpl extends RelationshipImpl implements ClassGeneralizationBase {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected GeneralizationAnnotations annotations;

	/**
	 * The default value of the '{@link #getConformance() <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected static final ConformanceKind CONFORMANCE_EDEFAULT = ConformanceKind.I;

	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected ConformanceKind conformance = CONFORMANCE_EDEFAULT;

	/**
	 * This is true if the Conformance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conformanceESet;

	/**
	 * The default value of the '{@link #getGraphicLinkId() <em>Graphic Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicLinkId()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAPHIC_LINK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGraphicLinkId() <em>Graphic Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicLinkId()
	 * @generated
	 * @ordered
	 */
	protected String graphicLinkId = GRAPHIC_LINK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected String sortKey = SORT_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassGeneralizationBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CLASS_GENERALIZATION_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(GeneralizationAnnotations newAnnotations, NotificationChain msgs) {
		GeneralizationAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_GENERALIZATION_BASE__ANNOTATIONS, oldAnnotations,
				newAnnotations);
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
	public void setAnnotations(GeneralizationAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CLASS_GENERALIZATION_BASE__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CLASS_GENERALIZATION_BASE__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_GENERALIZATION_BASE__ANNOTATIONS, newAnnotations,
				newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceKind getConformance() {
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformance(ConformanceKind newConformance) {
		ConformanceKind oldConformance = conformance;
		conformance = newConformance == null
				? CONFORMANCE_EDEFAULT
				: newConformance;
		boolean oldConformanceESet = conformanceESet;
		conformanceESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_GENERALIZATION_BASE__CONFORMANCE, oldConformance,
				conformance, !oldConformanceESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConformance() {
		ConformanceKind oldConformance = conformance;
		boolean oldConformanceESet = conformanceESet;
		conformance = CONFORMANCE_EDEFAULT;
		conformanceESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.CLASS_GENERALIZATION_BASE__CONFORMANCE, oldConformance,
				CONFORMANCE_EDEFAULT, oldConformanceESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConformance() {
		return conformanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGraphicLinkId() {
		return graphicLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicLinkId(String newGraphicLinkId) {
		String oldGraphicLinkId = graphicLinkId;
		graphicLinkId = newGraphicLinkId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_GENERALIZATION_BASE__GRAPHIC_LINK_ID, oldGraphicLinkId,
				graphicLinkId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortKey() {
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(String newSortKey) {
		String oldSortKey = sortKey;
		sortKey = newSortKey;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_GENERALIZATION_BASE__SORT_KEY, oldSortKey, sortKey));
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
			case Mif2Package.CLASS_GENERALIZATION_BASE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
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
			case Mif2Package.CLASS_GENERALIZATION_BASE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.CLASS_GENERALIZATION_BASE__CONFORMANCE:
				return getConformance();
			case Mif2Package.CLASS_GENERALIZATION_BASE__GRAPHIC_LINK_ID:
				return getGraphicLinkId();
			case Mif2Package.CLASS_GENERALIZATION_BASE__SORT_KEY:
				return getSortKey();
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
			case Mif2Package.CLASS_GENERALIZATION_BASE__ANNOTATIONS:
				setAnnotations((GeneralizationAnnotations) newValue);
				return;
			case Mif2Package.CLASS_GENERALIZATION_BASE__CONFORMANCE:
				setConformance((ConformanceKind) newValue);
				return;
			case Mif2Package.CLASS_GENERALIZATION_BASE__GRAPHIC_LINK_ID:
				setGraphicLinkId((String) newValue);
				return;
			case Mif2Package.CLASS_GENERALIZATION_BASE__SORT_KEY:
				setSortKey((String) newValue);
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
			case Mif2Package.CLASS_GENERALIZATION_BASE__ANNOTATIONS:
				setAnnotations((GeneralizationAnnotations) null);
				return;
			case Mif2Package.CLASS_GENERALIZATION_BASE__CONFORMANCE:
				unsetConformance();
				return;
			case Mif2Package.CLASS_GENERALIZATION_BASE__GRAPHIC_LINK_ID:
				setGraphicLinkId(GRAPHIC_LINK_ID_EDEFAULT);
				return;
			case Mif2Package.CLASS_GENERALIZATION_BASE__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
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
			case Mif2Package.CLASS_GENERALIZATION_BASE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.CLASS_GENERALIZATION_BASE__CONFORMANCE:
				return isSetConformance();
			case Mif2Package.CLASS_GENERALIZATION_BASE__GRAPHIC_LINK_ID:
				return GRAPHIC_LINK_ID_EDEFAULT == null
						? graphicLinkId != null
						: !GRAPHIC_LINK_ID_EDEFAULT.equals(graphicLinkId);
			case Mif2Package.CLASS_GENERALIZATION_BASE__SORT_KEY:
				return SORT_KEY_EDEFAULT == null
						? sortKey != null
						: !SORT_KEY_EDEFAULT.equals(sortKey);
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
		result.append(" (conformance: ");
		if (conformanceESet) {
			result.append(conformance);
		} else {
			result.append("<unset>");
		}
		result.append(", graphicLinkId: ");
		result.append(graphicLinkId);
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(')');
		return result.toString();
	}

} // ClassGeneralizationBaseImpl
