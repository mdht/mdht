/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.association.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;
import org.openhealthtools.mdht.cts2.association.GraphNode;
import org.openhealthtools.mdht.cts2.core.AssociationDirection;
import org.openhealthtools.mdht.cts2.core.EntitySynopsis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.GraphNodeImpl#getNodeEntity <em>Node Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.GraphNodeImpl#getDirection <em>Direction</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.GraphNodeImpl#getNextNodeNumber <em>Next Node Number</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.GraphNodeImpl#getNodeNumber <em>Node Number</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GraphNodeImpl extends AssociationDirectoryEntryImpl implements GraphNode {
	/**
	 * The cached value of the '{@link #getNodeEntity() <em>Node Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNodeEntity()
	 * @generated
	 * @ordered
	 */
	protected EntitySynopsis nodeEntity;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final AssociationDirection DIRECTION_EDEFAULT = AssociationDirection.SOURCETOTARGET;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected AssociationDirection direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * The default value of the '{@link #getNextNodeNumber() <em>Next Node Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNextNodeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NEXT_NODE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextNodeNumber() <em>Next Node Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNextNodeNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger nextNodeNumber = NEXT_NODE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeNumber() <em>Node Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNodeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NODE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeNumber() <em>Node Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNodeNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger nodeNumber = NODE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GraphNodeImpl() {
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
		return AssociationPackage.Literals.GRAPH_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntitySynopsis getNodeEntity() {
		return nodeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetNodeEntity(EntitySynopsis newNodeEntity, NotificationChain msgs) {
		EntitySynopsis oldNodeEntity = nodeEntity;
		nodeEntity = newNodeEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AssociationPackage.GRAPH_NODE__NODE_ENTITY, oldNodeEntity, newNodeEntity);
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
	public void setNodeEntity(EntitySynopsis newNodeEntity) {
		if (newNodeEntity != nodeEntity) {
			NotificationChain msgs = null;
			if (nodeEntity != null) {
				msgs = ((InternalEObject) nodeEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.GRAPH_NODE__NODE_ENTITY, null, msgs);
			}
			if (newNodeEntity != null) {
				msgs = ((InternalEObject) newNodeEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.GRAPH_NODE__NODE_ENTITY, null, msgs);
			}
			msgs = basicSetNodeEntity(newNodeEntity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.GRAPH_NODE__NODE_ENTITY, newNodeEntity, newNodeEntity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDirection(AssociationDirection newDirection) {
		AssociationDirection oldDirection = direction;
		direction = newDirection == null
				? DIRECTION_EDEFAULT
				: newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.GRAPH_NODE__DIRECTION, oldDirection, direction,
				!oldDirectionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetDirection() {
		AssociationDirection oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, AssociationPackage.GRAPH_NODE__DIRECTION, oldDirection, DIRECTION_EDEFAULT,
				oldDirectionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetDirection() {
		return directionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger getNextNodeNumber() {
		return nextNodeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNextNodeNumber(BigInteger newNextNodeNumber) {
		BigInteger oldNextNodeNumber = nextNodeNumber;
		nextNodeNumber = newNextNodeNumber;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.GRAPH_NODE__NEXT_NODE_NUMBER, oldNextNodeNumber,
				nextNodeNumber));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger getNodeNumber() {
		return nodeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNodeNumber(BigInteger newNodeNumber) {
		BigInteger oldNodeNumber = nodeNumber;
		nodeNumber = newNodeNumber;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.GRAPH_NODE__NODE_NUMBER, oldNodeNumber, nodeNumber));
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
			case AssociationPackage.GRAPH_NODE__NODE_ENTITY:
				return basicSetNodeEntity(null, msgs);
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
			case AssociationPackage.GRAPH_NODE__NODE_ENTITY:
				return getNodeEntity();
			case AssociationPackage.GRAPH_NODE__DIRECTION:
				return getDirection();
			case AssociationPackage.GRAPH_NODE__NEXT_NODE_NUMBER:
				return getNextNodeNumber();
			case AssociationPackage.GRAPH_NODE__NODE_NUMBER:
				return getNodeNumber();
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
			case AssociationPackage.GRAPH_NODE__NODE_ENTITY:
				setNodeEntity((EntitySynopsis) newValue);
				return;
			case AssociationPackage.GRAPH_NODE__DIRECTION:
				setDirection((AssociationDirection) newValue);
				return;
			case AssociationPackage.GRAPH_NODE__NEXT_NODE_NUMBER:
				setNextNodeNumber((BigInteger) newValue);
				return;
			case AssociationPackage.GRAPH_NODE__NODE_NUMBER:
				setNodeNumber((BigInteger) newValue);
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
			case AssociationPackage.GRAPH_NODE__NODE_ENTITY:
				setNodeEntity((EntitySynopsis) null);
				return;
			case AssociationPackage.GRAPH_NODE__DIRECTION:
				unsetDirection();
				return;
			case AssociationPackage.GRAPH_NODE__NEXT_NODE_NUMBER:
				setNextNodeNumber(NEXT_NODE_NUMBER_EDEFAULT);
				return;
			case AssociationPackage.GRAPH_NODE__NODE_NUMBER:
				setNodeNumber(NODE_NUMBER_EDEFAULT);
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
			case AssociationPackage.GRAPH_NODE__NODE_ENTITY:
				return nodeEntity != null;
			case AssociationPackage.GRAPH_NODE__DIRECTION:
				return isSetDirection();
			case AssociationPackage.GRAPH_NODE__NEXT_NODE_NUMBER:
				return NEXT_NODE_NUMBER_EDEFAULT == null
						? nextNodeNumber != null
						: !NEXT_NODE_NUMBER_EDEFAULT.equals(nextNodeNumber);
			case AssociationPackage.GRAPH_NODE__NODE_NUMBER:
				return NODE_NUMBER_EDEFAULT == null
						? nodeNumber != null
						: !NODE_NUMBER_EDEFAULT.equals(nodeNumber);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (direction: ");
		if (directionESet) {
			result.append(direction);
		} else {
			result.append("<unset>");
		}
		result.append(", nextNodeNumber: ");
		result.append(nextNodeNumber);
		result.append(", nodeNumber: ");
		result.append(nodeNumber);
		result.append(')');
		return result.toString();
	}

} // GraphNodeImpl
