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

import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndWithClassRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.NonTraversableAssociationEnd;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnds;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serialized Association Ends</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedAssociationEndsImpl#getTraversableConnection <em>Traversable Connection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedAssociationEndsImpl#getNonTraversableConnection <em>Non Traversable Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerializedAssociationEndsImpl extends EObjectImpl implements SerializedAssociationEnds {
	/**
	 * The cached value of the '{@link #getTraversableConnection() <em>Traversable Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraversableConnection()
	 * @generated
	 * @ordered
	 */
	protected AssociationEndWithClassRef traversableConnection;

	/**
	 * The cached value of the '{@link #getNonTraversableConnection() <em>Non Traversable Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonTraversableConnection()
	 * @generated
	 * @ordered
	 */
	protected NonTraversableAssociationEnd nonTraversableConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializedAssociationEndsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SERIALIZED_ASSOCIATION_ENDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEndWithClassRef getTraversableConnection() {
		return traversableConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraversableConnection(AssociationEndWithClassRef newTraversableConnection,
			NotificationChain msgs) {
		AssociationEndWithClassRef oldTraversableConnection = traversableConnection;
		traversableConnection = newTraversableConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_ASSOCIATION_ENDS__TRAVERSABLE_CONNECTION,
				oldTraversableConnection, newTraversableConnection);
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
	public void setTraversableConnection(AssociationEndWithClassRef newTraversableConnection) {
		if (newTraversableConnection != traversableConnection) {
			NotificationChain msgs = null;
			if (traversableConnection != null) {
				msgs = ((InternalEObject) traversableConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_ASSOCIATION_ENDS__TRAVERSABLE_CONNECTION, null, msgs);
			}
			if (newTraversableConnection != null) {
				msgs = ((InternalEObject) newTraversableConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_ASSOCIATION_ENDS__TRAVERSABLE_CONNECTION, null, msgs);
			}
			msgs = basicSetTraversableConnection(newTraversableConnection, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_ASSOCIATION_ENDS__TRAVERSABLE_CONNECTION,
				newTraversableConnection, newTraversableConnection));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTraversableAssociationEnd getNonTraversableConnection() {
		return nonTraversableConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonTraversableConnection(NonTraversableAssociationEnd newNonTraversableConnection,
			NotificationChain msgs) {
		NonTraversableAssociationEnd oldNonTraversableConnection = nonTraversableConnection;
		nonTraversableConnection = newNonTraversableConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_ASSOCIATION_ENDS__NON_TRAVERSABLE_CONNECTION,
				oldNonTraversableConnection, newNonTraversableConnection);
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
	public void setNonTraversableConnection(NonTraversableAssociationEnd newNonTraversableConnection) {
		if (newNonTraversableConnection != nonTraversableConnection) {
			NotificationChain msgs = null;
			if (nonTraversableConnection != null) {
				msgs = ((InternalEObject) nonTraversableConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_ASSOCIATION_ENDS__NON_TRAVERSABLE_CONNECTION, null, msgs);
			}
			if (newNonTraversableConnection != null) {
				msgs = ((InternalEObject) newNonTraversableConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_ASSOCIATION_ENDS__NON_TRAVERSABLE_CONNECTION, null, msgs);
			}
			msgs = basicSetNonTraversableConnection(newNonTraversableConnection, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_ASSOCIATION_ENDS__NON_TRAVERSABLE_CONNECTION,
				newNonTraversableConnection, newNonTraversableConnection));
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
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS__TRAVERSABLE_CONNECTION:
				return basicSetTraversableConnection(null, msgs);
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS__NON_TRAVERSABLE_CONNECTION:
				return basicSetNonTraversableConnection(null, msgs);
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
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS__TRAVERSABLE_CONNECTION:
				return getTraversableConnection();
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS__NON_TRAVERSABLE_CONNECTION:
				return getNonTraversableConnection();
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
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS__TRAVERSABLE_CONNECTION:
				setTraversableConnection((AssociationEndWithClassRef) newValue);
				return;
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS__NON_TRAVERSABLE_CONNECTION:
				setNonTraversableConnection((NonTraversableAssociationEnd) newValue);
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
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS__TRAVERSABLE_CONNECTION:
				setTraversableConnection((AssociationEndWithClassRef) null);
				return;
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS__NON_TRAVERSABLE_CONNECTION:
				setNonTraversableConnection((NonTraversableAssociationEnd) null);
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
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS__TRAVERSABLE_CONNECTION:
				return traversableConnection != null;
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS__NON_TRAVERSABLE_CONNECTION:
				return nonTraversableConnection != null;
		}
		return super.eIsSet(featureID);
	}

} // SerializedAssociationEndsImpl
