/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.association.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.association.AssociationGraph;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;
import org.openhealthtools.mdht.cts2.association.GraphDirection;
import org.openhealthtools.mdht.cts2.association.GraphFocus;
import org.openhealthtools.mdht.cts2.association.GraphNode;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;
import org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationGraphImpl#getFocusEntity <em>Focus Entity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationGraphImpl#getEntry <em>Entry</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationGraphImpl#getExpansionDepth <em>Expansion Depth</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationGraphImpl#getExpansionDirection <em>Expansion Direction</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationGraphImpl#getGraphFocus <em>Graph Focus</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AssociationGraphImpl extends DirectoryImpl implements AssociationGraph {
	/**
	 * The cached value of the '{@link #getFocusEntity() <em>Focus Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFocusEntity()
	 * @generated
	 * @ordered
	 */
	protected URIAndEntityName focusEntity;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphNode> entry;

	/**
	 * The default value of the '{@link #getExpansionDepth() <em>Expansion Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExpansionDepth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EXPANSION_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpansionDepth() <em>Expansion Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExpansionDepth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger expansionDepth = EXPANSION_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpansionDirection() <em>Expansion Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExpansionDirection()
	 * @generated
	 * @ordered
	 */
	protected static final GraphDirection EXPANSION_DIRECTION_EDEFAULT = GraphDirection.FORWARD;

	/**
	 * The cached value of the '{@link #getExpansionDirection() <em>Expansion Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getExpansionDirection()
	 * @generated
	 * @ordered
	 */
	protected GraphDirection expansionDirection = EXPANSION_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Expansion Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean expansionDirectionESet;

	/**
	 * The default value of the '{@link #getGraphFocus() <em>Graph Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getGraphFocus()
	 * @generated
	 * @ordered
	 */
	protected static final GraphFocus GRAPH_FOCUS_EDEFAULT = GraphFocus.SPECIFICENTITY;

	/**
	 * The cached value of the '{@link #getGraphFocus() <em>Graph Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getGraphFocus()
	 * @generated
	 * @ordered
	 */
	protected GraphFocus graphFocus = GRAPH_FOCUS_EDEFAULT;

	/**
	 * This is true if the Graph Focus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean graphFocusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssociationGraphImpl() {
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
		return AssociationPackage.Literals.ASSOCIATION_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URIAndEntityName getFocusEntity() {
		return focusEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetFocusEntity(URIAndEntityName newFocusEntity, NotificationChain msgs) {
		URIAndEntityName oldFocusEntity = focusEntity;
		focusEntity = newFocusEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_GRAPH__FOCUS_ENTITY, oldFocusEntity,
				newFocusEntity);
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
	public void setFocusEntity(URIAndEntityName newFocusEntity) {
		if (newFocusEntity != focusEntity) {
			NotificationChain msgs = null;
			if (focusEntity != null) {
				msgs = ((InternalEObject) focusEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_GRAPH__FOCUS_ENTITY, null, msgs);
			}
			if (newFocusEntity != null) {
				msgs = ((InternalEObject) newFocusEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						AssociationPackage.ASSOCIATION_GRAPH__FOCUS_ENTITY, null, msgs);
			}
			msgs = basicSetFocusEntity(newFocusEntity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_GRAPH__FOCUS_ENTITY, newFocusEntity,
				newFocusEntity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<GraphNode> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<GraphNode>(
				GraphNode.class, this, AssociationPackage.ASSOCIATION_GRAPH__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger getExpansionDepth() {
		return expansionDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExpansionDepth(BigInteger newExpansionDepth) {
		BigInteger oldExpansionDepth = expansionDepth;
		expansionDepth = newExpansionDepth;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_GRAPH__EXPANSION_DEPTH, oldExpansionDepth,
				expansionDepth));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphDirection getExpansionDirection() {
		return expansionDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExpansionDirection(GraphDirection newExpansionDirection) {
		GraphDirection oldExpansionDirection = expansionDirection;
		expansionDirection = newExpansionDirection == null
				? EXPANSION_DIRECTION_EDEFAULT
				: newExpansionDirection;
		boolean oldExpansionDirectionESet = expansionDirectionESet;
		expansionDirectionESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_GRAPH__EXPANSION_DIRECTION,
				oldExpansionDirection, expansionDirection, !oldExpansionDirectionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetExpansionDirection() {
		GraphDirection oldExpansionDirection = expansionDirection;
		boolean oldExpansionDirectionESet = expansionDirectionESet;
		expansionDirection = EXPANSION_DIRECTION_EDEFAULT;
		expansionDirectionESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, AssociationPackage.ASSOCIATION_GRAPH__EXPANSION_DIRECTION,
				oldExpansionDirection, EXPANSION_DIRECTION_EDEFAULT, oldExpansionDirectionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetExpansionDirection() {
		return expansionDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphFocus getGraphFocus() {
		return graphFocus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGraphFocus(GraphFocus newGraphFocus) {
		GraphFocus oldGraphFocus = graphFocus;
		graphFocus = newGraphFocus == null
				? GRAPH_FOCUS_EDEFAULT
				: newGraphFocus;
		boolean oldGraphFocusESet = graphFocusESet;
		graphFocusESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_GRAPH__GRAPH_FOCUS, oldGraphFocus, graphFocus,
				!oldGraphFocusESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetGraphFocus() {
		GraphFocus oldGraphFocus = graphFocus;
		boolean oldGraphFocusESet = graphFocusESet;
		graphFocus = GRAPH_FOCUS_EDEFAULT;
		graphFocusESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, AssociationPackage.ASSOCIATION_GRAPH__GRAPH_FOCUS, oldGraphFocus,
				GRAPH_FOCUS_EDEFAULT, oldGraphFocusESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetGraphFocus() {
		return graphFocusESet;
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
			case AssociationPackage.ASSOCIATION_GRAPH__FOCUS_ENTITY:
				return basicSetFocusEntity(null, msgs);
			case AssociationPackage.ASSOCIATION_GRAPH__ENTRY:
				return ((InternalEList<?>) getEntry()).basicRemove(otherEnd, msgs);
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
			case AssociationPackage.ASSOCIATION_GRAPH__FOCUS_ENTITY:
				return getFocusEntity();
			case AssociationPackage.ASSOCIATION_GRAPH__ENTRY:
				return getEntry();
			case AssociationPackage.ASSOCIATION_GRAPH__EXPANSION_DEPTH:
				return getExpansionDepth();
			case AssociationPackage.ASSOCIATION_GRAPH__EXPANSION_DIRECTION:
				return getExpansionDirection();
			case AssociationPackage.ASSOCIATION_GRAPH__GRAPH_FOCUS:
				return getGraphFocus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssociationPackage.ASSOCIATION_GRAPH__FOCUS_ENTITY:
				setFocusEntity((URIAndEntityName) newValue);
				return;
			case AssociationPackage.ASSOCIATION_GRAPH__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends GraphNode>) newValue);
				return;
			case AssociationPackage.ASSOCIATION_GRAPH__EXPANSION_DEPTH:
				setExpansionDepth((BigInteger) newValue);
				return;
			case AssociationPackage.ASSOCIATION_GRAPH__EXPANSION_DIRECTION:
				setExpansionDirection((GraphDirection) newValue);
				return;
			case AssociationPackage.ASSOCIATION_GRAPH__GRAPH_FOCUS:
				setGraphFocus((GraphFocus) newValue);
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
			case AssociationPackage.ASSOCIATION_GRAPH__FOCUS_ENTITY:
				setFocusEntity((URIAndEntityName) null);
				return;
			case AssociationPackage.ASSOCIATION_GRAPH__ENTRY:
				getEntry().clear();
				return;
			case AssociationPackage.ASSOCIATION_GRAPH__EXPANSION_DEPTH:
				setExpansionDepth(EXPANSION_DEPTH_EDEFAULT);
				return;
			case AssociationPackage.ASSOCIATION_GRAPH__EXPANSION_DIRECTION:
				unsetExpansionDirection();
				return;
			case AssociationPackage.ASSOCIATION_GRAPH__GRAPH_FOCUS:
				unsetGraphFocus();
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
			case AssociationPackage.ASSOCIATION_GRAPH__FOCUS_ENTITY:
				return focusEntity != null;
			case AssociationPackage.ASSOCIATION_GRAPH__ENTRY:
				return entry != null && !entry.isEmpty();
			case AssociationPackage.ASSOCIATION_GRAPH__EXPANSION_DEPTH:
				return EXPANSION_DEPTH_EDEFAULT == null
						? expansionDepth != null
						: !EXPANSION_DEPTH_EDEFAULT.equals(expansionDepth);
			case AssociationPackage.ASSOCIATION_GRAPH__EXPANSION_DIRECTION:
				return isSetExpansionDirection();
			case AssociationPackage.ASSOCIATION_GRAPH__GRAPH_FOCUS:
				return isSetGraphFocus();
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
		result.append(" (expansionDepth: ");
		result.append(expansionDepth);
		result.append(", expansionDirection: ");
		if (expansionDirectionESet) {
			result.append(expansionDirection);
		} else {
			result.append("<unset>");
		}
		result.append(", graphFocus: ");
		if (graphFocusESet) {
			result.append(graphFocus);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // AssociationGraphImpl
