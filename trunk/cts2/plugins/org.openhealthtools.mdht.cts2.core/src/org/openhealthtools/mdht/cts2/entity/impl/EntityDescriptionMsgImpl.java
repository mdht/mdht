/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.impl.MessageImpl;
import org.openhealthtools.mdht.cts2.entity.EntityDescription;
import org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.EntityDescriptionMsgImpl#getEntityDescription <em>Entity Description</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EntityDescriptionMsgImpl extends MessageImpl implements EntityDescriptionMsg {
	/**
	 * The cached value of the '{@link #getEntityDescription() <em>Entity Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntityDescription()
	 * @generated
	 * @ordered
	 */
	protected EntityDescription entityDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EntityDescriptionMsgImpl() {
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
		return EntityPackage.Literals.ENTITY_DESCRIPTION_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDescription getEntityDescription() {
		return entityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEntityDescription(EntityDescription newEntityDescription, NotificationChain msgs) {
		EntityDescription oldEntityDescription = entityDescription;
		entityDescription = newEntityDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_MSG__ENTITY_DESCRIPTION, oldEntityDescription,
				newEntityDescription);
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
	public void setEntityDescription(EntityDescription newEntityDescription) {
		if (newEntityDescription != entityDescription) {
			NotificationChain msgs = null;
			if (entityDescription != null) {
				msgs = ((InternalEObject) entityDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION_MSG__ENTITY_DESCRIPTION, null, msgs);
			}
			if (newEntityDescription != null) {
				msgs = ((InternalEObject) newEntityDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						EntityPackage.ENTITY_DESCRIPTION_MSG__ENTITY_DESCRIPTION, null, msgs);
			}
			msgs = basicSetEntityDescription(newEntityDescription, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.ENTITY_DESCRIPTION_MSG__ENTITY_DESCRIPTION, newEntityDescription,
				newEntityDescription));
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
			case EntityPackage.ENTITY_DESCRIPTION_MSG__ENTITY_DESCRIPTION:
				return basicSetEntityDescription(null, msgs);
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
			case EntityPackage.ENTITY_DESCRIPTION_MSG__ENTITY_DESCRIPTION:
				return getEntityDescription();
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
			case EntityPackage.ENTITY_DESCRIPTION_MSG__ENTITY_DESCRIPTION:
				setEntityDescription((EntityDescription) newValue);
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
			case EntityPackage.ENTITY_DESCRIPTION_MSG__ENTITY_DESCRIPTION:
				setEntityDescription((EntityDescription) null);
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
			case EntityPackage.ENTITY_DESCRIPTION_MSG__ENTITY_DESCRIPTION:
				return entityDescription != null;
		}
		return super.eIsSet(featureID);
	}

} // EntityDescriptionMsgImpl
