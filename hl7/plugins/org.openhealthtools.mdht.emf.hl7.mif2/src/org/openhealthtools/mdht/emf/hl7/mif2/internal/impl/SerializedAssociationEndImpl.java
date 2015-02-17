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

import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndWithClass;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnd;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnds;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serialized Association End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedAssociationEndImpl#getTargetConnection <em>Target Connection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedAssociationEndImpl#getSourceConnection <em>Source Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerializedAssociationEndImpl extends AssociationBaseImpl implements SerializedAssociationEnd {
	/**
	 * The cached value of the '{@link #getTargetConnection() <em>Target Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetConnection()
	 * @generated
	 * @ordered
	 */
	protected AssociationEndWithClass targetConnection;

	/**
	 * The cached value of the '{@link #getSourceConnection() <em>Source Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConnection()
	 * @generated
	 * @ordered
	 */
	protected SerializedAssociationEnds sourceConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializedAssociationEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SERIALIZED_ASSOCIATION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEndWithClass getTargetConnection() {
		return targetConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetConnection(AssociationEndWithClass newTargetConnection,
			NotificationChain msgs) {
		AssociationEndWithClass oldTargetConnection = targetConnection;
		targetConnection = newTargetConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_ASSOCIATION_END__TARGET_CONNECTION, oldTargetConnection,
				newTargetConnection);
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
	public void setTargetConnection(AssociationEndWithClass newTargetConnection) {
		if (newTargetConnection != targetConnection) {
			NotificationChain msgs = null;
			if (targetConnection != null) {
				msgs = ((InternalEObject) targetConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_ASSOCIATION_END__TARGET_CONNECTION, null, msgs);
			}
			if (newTargetConnection != null) {
				msgs = ((InternalEObject) newTargetConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_ASSOCIATION_END__TARGET_CONNECTION, null, msgs);
			}
			msgs = basicSetTargetConnection(newTargetConnection, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_ASSOCIATION_END__TARGET_CONNECTION, newTargetConnection,
				newTargetConnection));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedAssociationEnds getSourceConnection() {
		return sourceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceConnection(SerializedAssociationEnds newSourceConnection,
			NotificationChain msgs) {
		SerializedAssociationEnds oldSourceConnection = sourceConnection;
		sourceConnection = newSourceConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_ASSOCIATION_END__SOURCE_CONNECTION, oldSourceConnection,
				newSourceConnection);
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
	public void setSourceConnection(SerializedAssociationEnds newSourceConnection) {
		if (newSourceConnection != sourceConnection) {
			NotificationChain msgs = null;
			if (sourceConnection != null) {
				msgs = ((InternalEObject) sourceConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_ASSOCIATION_END__SOURCE_CONNECTION, null, msgs);
			}
			if (newSourceConnection != null) {
				msgs = ((InternalEObject) newSourceConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_ASSOCIATION_END__SOURCE_CONNECTION, null, msgs);
			}
			msgs = basicSetSourceConnection(newSourceConnection, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_ASSOCIATION_END__SOURCE_CONNECTION, newSourceConnection,
				newSourceConnection));
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
			case Mif2Package.SERIALIZED_ASSOCIATION_END__TARGET_CONNECTION:
				return basicSetTargetConnection(null, msgs);
			case Mif2Package.SERIALIZED_ASSOCIATION_END__SOURCE_CONNECTION:
				return basicSetSourceConnection(null, msgs);
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
			case Mif2Package.SERIALIZED_ASSOCIATION_END__TARGET_CONNECTION:
				return getTargetConnection();
			case Mif2Package.SERIALIZED_ASSOCIATION_END__SOURCE_CONNECTION:
				return getSourceConnection();
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
			case Mif2Package.SERIALIZED_ASSOCIATION_END__TARGET_CONNECTION:
				setTargetConnection((AssociationEndWithClass) newValue);
				return;
			case Mif2Package.SERIALIZED_ASSOCIATION_END__SOURCE_CONNECTION:
				setSourceConnection((SerializedAssociationEnds) newValue);
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
			case Mif2Package.SERIALIZED_ASSOCIATION_END__TARGET_CONNECTION:
				setTargetConnection((AssociationEndWithClass) null);
				return;
			case Mif2Package.SERIALIZED_ASSOCIATION_END__SOURCE_CONNECTION:
				setSourceConnection((SerializedAssociationEnds) null);
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
			case Mif2Package.SERIALIZED_ASSOCIATION_END__TARGET_CONNECTION:
				return targetConnection != null;
			case Mif2Package.SERIALIZED_ASSOCIATION_END__SOURCE_CONNECTION:
				return sourceConnection != null;
		}
		return super.eIsSet(featureID);
	}

} // SerializedAssociationEndImpl
