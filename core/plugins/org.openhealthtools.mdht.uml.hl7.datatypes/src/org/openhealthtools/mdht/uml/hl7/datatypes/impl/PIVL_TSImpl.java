/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.vocab.CalendarCycle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PIVL TS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PIVL_TSImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PIVL_TSImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PIVL_TSImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.PIVL_TSImpl#getInstitutionSpecified <em>Institution Specified</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PIVL_TSImpl extends SXCM_TSImpl implements PIVL_TS {
	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected IVL_TS phase;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected PQ period;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final CalendarCycle ALIGNMENT_EDEFAULT = CalendarCycle.CD;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected CalendarCycle alignment = ALIGNMENT_EDEFAULT;

	/**
	 * This is true if the Alignment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignmentESet;

	/**
	 * The default value of the '{@link #getInstitutionSpecified() <em>Institution Specified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionSpecified()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INSTITUTION_SPECIFIED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getInstitutionSpecified() <em>Institution Specified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionSpecified()
	 * @generated
	 * @ordered
	 */
	protected Boolean institutionSpecified = INSTITUTION_SPECIFIED_EDEFAULT;

	/**
	 * This is true if the Institution Specified attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean institutionSpecifiedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIVL_TSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.PIVL_TS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_TS getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(IVL_TS newPhase, NotificationChain msgs) {
		IVL_TS oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.PIVL_TS__PHASE, oldPhase, newPhase);
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
	public void setPhase(IVL_TS newPhase) {
		if (newPhase != phase) {
			NotificationChain msgs = null;
			if (phase != null) {
				msgs = ((InternalEObject) phase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						DatatypesPackage.PIVL_TS__PHASE, null, msgs);
			}
			if (newPhase != null) {
				msgs = ((InternalEObject) newPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						DatatypesPackage.PIVL_TS__PHASE, null, msgs);
			}
			msgs = basicSetPhase(newPhase, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.PIVL_TS__PHASE, newPhase, newPhase));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PQ getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(PQ newPeriod, NotificationChain msgs) {
		PQ oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.PIVL_TS__PERIOD, oldPeriod, newPeriod);
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
	public void setPeriod(PQ newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null) {
				msgs = ((InternalEObject) period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						DatatypesPackage.PIVL_TS__PERIOD, null, msgs);
			}
			if (newPeriod != null) {
				msgs = ((InternalEObject) newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						DatatypesPackage.PIVL_TS__PERIOD, null, msgs);
			}
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.PIVL_TS__PERIOD, newPeriod, newPeriod));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarCycle getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(CalendarCycle newAlignment) {
		CalendarCycle oldAlignment = alignment;
		alignment = newAlignment == null
				? ALIGNMENT_EDEFAULT
				: newAlignment;
		boolean oldAlignmentESet = alignmentESet;
		alignmentESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.PIVL_TS__ALIGNMENT, oldAlignment, alignment, !oldAlignmentESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlignment() {
		CalendarCycle oldAlignment = alignment;
		boolean oldAlignmentESet = alignmentESet;
		alignment = ALIGNMENT_EDEFAULT;
		alignmentESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, DatatypesPackage.PIVL_TS__ALIGNMENT, oldAlignment, ALIGNMENT_EDEFAULT,
				oldAlignmentESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlignment() {
		return alignmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInstitutionSpecified() {
		return institutionSpecified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitutionSpecified(Boolean newInstitutionSpecified) {
		Boolean oldInstitutionSpecified = institutionSpecified;
		institutionSpecified = newInstitutionSpecified;
		boolean oldInstitutionSpecifiedESet = institutionSpecifiedESet;
		institutionSpecifiedESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.PIVL_TS__INSTITUTION_SPECIFIED, oldInstitutionSpecified,
				institutionSpecified, !oldInstitutionSpecifiedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstitutionSpecified() {
		Boolean oldInstitutionSpecified = institutionSpecified;
		boolean oldInstitutionSpecifiedESet = institutionSpecifiedESet;
		institutionSpecified = INSTITUTION_SPECIFIED_EDEFAULT;
		institutionSpecifiedESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, DatatypesPackage.PIVL_TS__INSTITUTION_SPECIFIED, oldInstitutionSpecified,
				INSTITUTION_SPECIFIED_EDEFAULT, oldInstitutionSpecifiedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstitutionSpecified() {
		return institutionSpecifiedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.PIVL_TS__PHASE:
				return basicSetPhase(null, msgs);
			case DatatypesPackage.PIVL_TS__PERIOD:
				return basicSetPeriod(null, msgs);
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
			case DatatypesPackage.PIVL_TS__PHASE:
				return getPhase();
			case DatatypesPackage.PIVL_TS__PERIOD:
				return getPeriod();
			case DatatypesPackage.PIVL_TS__ALIGNMENT:
				return getAlignment();
			case DatatypesPackage.PIVL_TS__INSTITUTION_SPECIFIED:
				return getInstitutionSpecified();
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
			case DatatypesPackage.PIVL_TS__PHASE:
				setPhase((IVL_TS) newValue);
				return;
			case DatatypesPackage.PIVL_TS__PERIOD:
				setPeriod((PQ) newValue);
				return;
			case DatatypesPackage.PIVL_TS__ALIGNMENT:
				setAlignment((CalendarCycle) newValue);
				return;
			case DatatypesPackage.PIVL_TS__INSTITUTION_SPECIFIED:
				setInstitutionSpecified((Boolean) newValue);
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
			case DatatypesPackage.PIVL_TS__PHASE:
				setPhase((IVL_TS) null);
				return;
			case DatatypesPackage.PIVL_TS__PERIOD:
				setPeriod((PQ) null);
				return;
			case DatatypesPackage.PIVL_TS__ALIGNMENT:
				unsetAlignment();
				return;
			case DatatypesPackage.PIVL_TS__INSTITUTION_SPECIFIED:
				unsetInstitutionSpecified();
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
			case DatatypesPackage.PIVL_TS__PHASE:
				return phase != null;
			case DatatypesPackage.PIVL_TS__PERIOD:
				return period != null;
			case DatatypesPackage.PIVL_TS__ALIGNMENT:
				return isSetAlignment();
			case DatatypesPackage.PIVL_TS__INSTITUTION_SPECIFIED:
				return isSetInstitutionSpecified();
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
		result.append(" (alignment: ");
		if (alignmentESet) {
			result.append(alignment);
		} else {
			result.append("<unset>");
		}
		result.append(", institutionSpecified: ");
		if (institutionSpecifiedESet) {
			result.append(institutionSpecified);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // PIVL_TSImpl
