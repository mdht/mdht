/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IVL PQ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_PQImpl#getLow <em>Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_PQImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_PQImpl#getHigh <em>High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.IVL_PQImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IVL_PQImpl extends SXCM_PQImpl implements IVL_PQ {
	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected IVXB_PQ low;

	/**
	 * The cached value of the '{@link #getCenter() <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected IVXB_PQ center;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected IVXB_PQ high;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected PQ width;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IVL_PQImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.IVL_PQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVXB_PQ getLow() {
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLow(IVXB_PQ newLow, NotificationChain msgs) {
		IVXB_PQ oldLow = low;
		low = newLow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.IVL_PQ__LOW, oldLow, newLow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLow(IVXB_PQ newLow) {
		if (newLow != low) {
			NotificationChain msgs = null;
			if (low != null)
				msgs = ((InternalEObject)low).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.IVL_PQ__LOW, null, msgs);
			if (newLow != null)
				msgs = ((InternalEObject)newLow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.IVL_PQ__LOW, null, msgs);
			msgs = basicSetLow(newLow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.IVL_PQ__LOW, newLow, newLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVXB_PQ getCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenter(IVXB_PQ newCenter, NotificationChain msgs) {
		IVXB_PQ oldCenter = center;
		center = newCenter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.IVL_PQ__CENTER, oldCenter, newCenter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter(IVXB_PQ newCenter) {
		if (newCenter != center) {
			NotificationChain msgs = null;
			if (center != null)
				msgs = ((InternalEObject)center).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.IVL_PQ__CENTER, null, msgs);
			if (newCenter != null)
				msgs = ((InternalEObject)newCenter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.IVL_PQ__CENTER, null, msgs);
			msgs = basicSetCenter(newCenter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.IVL_PQ__CENTER, newCenter, newCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVXB_PQ getHigh() {
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHigh(IVXB_PQ newHigh, NotificationChain msgs) {
		IVXB_PQ oldHigh = high;
		high = newHigh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.IVL_PQ__HIGH, oldHigh, newHigh);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigh(IVXB_PQ newHigh) {
		if (newHigh != high) {
			NotificationChain msgs = null;
			if (high != null)
				msgs = ((InternalEObject)high).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.IVL_PQ__HIGH, null, msgs);
			if (newHigh != null)
				msgs = ((InternalEObject)newHigh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.IVL_PQ__HIGH, null, msgs);
			msgs = basicSetHigh(newHigh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.IVL_PQ__HIGH, newHigh, newHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PQ getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidth(PQ newWidth, NotificationChain msgs) {
		PQ oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.IVL_PQ__WIDTH, oldWidth, newWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(PQ newWidth) {
		if (newWidth != width) {
			NotificationChain msgs = null;
			if (width != null)
				msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.IVL_PQ__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.IVL_PQ__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.IVL_PQ__WIDTH, newWidth, newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.IVL_PQ__LOW:
				return basicSetLow(null, msgs);
			case DatatypesPackage.IVL_PQ__CENTER:
				return basicSetCenter(null, msgs);
			case DatatypesPackage.IVL_PQ__HIGH:
				return basicSetHigh(null, msgs);
			case DatatypesPackage.IVL_PQ__WIDTH:
				return basicSetWidth(null, msgs);
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
			case DatatypesPackage.IVL_PQ__LOW:
				return getLow();
			case DatatypesPackage.IVL_PQ__CENTER:
				return getCenter();
			case DatatypesPackage.IVL_PQ__HIGH:
				return getHigh();
			case DatatypesPackage.IVL_PQ__WIDTH:
				return getWidth();
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
			case DatatypesPackage.IVL_PQ__LOW:
				setLow((IVXB_PQ)newValue);
				return;
			case DatatypesPackage.IVL_PQ__CENTER:
				setCenter((IVXB_PQ)newValue);
				return;
			case DatatypesPackage.IVL_PQ__HIGH:
				setHigh((IVXB_PQ)newValue);
				return;
			case DatatypesPackage.IVL_PQ__WIDTH:
				setWidth((PQ)newValue);
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
			case DatatypesPackage.IVL_PQ__LOW:
				setLow((IVXB_PQ)null);
				return;
			case DatatypesPackage.IVL_PQ__CENTER:
				setCenter((IVXB_PQ)null);
				return;
			case DatatypesPackage.IVL_PQ__HIGH:
				setHigh((IVXB_PQ)null);
				return;
			case DatatypesPackage.IVL_PQ__WIDTH:
				setWidth((PQ)null);
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
			case DatatypesPackage.IVL_PQ__LOW:
				return low != null;
			case DatatypesPackage.IVL_PQ__CENTER:
				return center != null;
			case DatatypesPackage.IVL_PQ__HIGH:
				return high != null;
			case DatatypesPackage.IVL_PQ__WIDTH:
				return width != null;
		}
		return super.eIsSet(featureID);
	}

} //IVL_PQImpl
