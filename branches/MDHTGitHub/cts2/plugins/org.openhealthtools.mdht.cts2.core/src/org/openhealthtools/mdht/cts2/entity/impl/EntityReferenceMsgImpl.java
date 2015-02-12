/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.entity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.EntityReference;
import org.openhealthtools.mdht.cts2.core.impl.MessageImpl;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.EntityReferenceMsg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityReferenceMsgImpl#getEntityReference <em>Entity Reference</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EntityReferenceMsgImpl extends MessageImpl implements EntityReferenceMsg {
	/**
	 * The cached value of the '{@link #getEntityReference() <em>Entity Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntityReference()
	 * @generated
	 * @ordered
	 */
	protected EntityReference entityReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EntityReferenceMsgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY_REFERENCE_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityReference getEntityReference() {
		return entityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEntityReference(EntityReference newEntityReference, NotificationChain msgs) {
		EntityReference oldEntityReference = entityReference;
		entityReference = newEntityReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_REFERENCE_MSG__ENTITY_REFERENCE, oldEntityReference,
				newEntityReference);
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
	 * 
	 * @generated
	 */
	public void setEntityReference(EntityReference newEntityReference) {
		if (newEntityReference != entityReference) {
			NotificationChain msgs = null;
			if (entityReference != null) {
				msgs = ((InternalEObject) entityReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_REFERENCE_MSG__ENTITY_REFERENCE, null, msgs);
			}
			if (newEntityReference != null) {
				msgs = ((InternalEObject) newEntityReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_REFERENCE_MSG__ENTITY_REFERENCE, null, msgs);
			}
			msgs = basicSetEntityReference(newEntityReference, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_REFERENCE_MSG__ENTITY_REFERENCE, newEntityReference,
				newEntityReference));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityPackage.ENTITY_REFERENCE_MSG__ENTITY_REFERENCE:
				return basicSetEntityReference(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityPackage.ENTITY_REFERENCE_MSG__ENTITY_REFERENCE:
				return getEntityReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityPackage.ENTITY_REFERENCE_MSG__ENTITY_REFERENCE:
				setEntityReference((EntityReference) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntityPackage.ENTITY_REFERENCE_MSG__ENTITY_REFERENCE:
				setEntityReference((EntityReference) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntityPackage.ENTITY_REFERENCE_MSG__ENTITY_REFERENCE:
				return entityReference != null;
		}
		return super.eIsSet(featureID);
	}

} // EntityReferenceMsgImpl
