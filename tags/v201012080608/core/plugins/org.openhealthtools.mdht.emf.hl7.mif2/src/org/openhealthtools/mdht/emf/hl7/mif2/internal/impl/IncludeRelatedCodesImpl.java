/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.IncludeRelatedCodes;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.RelationshipTraversalKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include Related Codes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.IncludeRelatedCodesImpl#getRelationshipName <em>Relationship Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.IncludeRelatedCodesImpl#getRelationshipTraversal <em>Relationship Traversal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeRelatedCodesImpl extends EObjectImpl implements IncludeRelatedCodes {
	/**
	 * The default value of the '{@link #getRelationshipName() <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationshipName() <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected String relationshipName = RELATIONSHIP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationshipTraversal() <em>Relationship Traversal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipTraversal()
	 * @generated
	 * @ordered
	 */
	protected static final RelationshipTraversalKind RELATIONSHIP_TRAVERSAL_EDEFAULT = RelationshipTraversalKind.DIRECT_RELATIONS_ONLY;

	/**
	 * The cached value of the '{@link #getRelationshipTraversal() <em>Relationship Traversal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipTraversal()
	 * @generated
	 * @ordered
	 */
	protected RelationshipTraversalKind relationshipTraversal = RELATIONSHIP_TRAVERSAL_EDEFAULT;

	/**
	 * This is true if the Relationship Traversal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relationshipTraversalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeRelatedCodesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.INCLUDE_RELATED_CODES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationshipName() {
		return relationshipName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipName(String newRelationshipName) {
		String oldRelationshipName = relationshipName;
		relationshipName = newRelationshipName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INCLUDE_RELATED_CODES__RELATIONSHIP_NAME, oldRelationshipName, relationshipName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTraversalKind getRelationshipTraversal() {
		return relationshipTraversal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipTraversal(RelationshipTraversalKind newRelationshipTraversal) {
		RelationshipTraversalKind oldRelationshipTraversal = relationshipTraversal;
		relationshipTraversal = newRelationshipTraversal == null ? RELATIONSHIP_TRAVERSAL_EDEFAULT : newRelationshipTraversal;
		boolean oldRelationshipTraversalESet = relationshipTraversalESet;
		relationshipTraversalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.INCLUDE_RELATED_CODES__RELATIONSHIP_TRAVERSAL, oldRelationshipTraversal, relationshipTraversal, !oldRelationshipTraversalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelationshipTraversal() {
		RelationshipTraversalKind oldRelationshipTraversal = relationshipTraversal;
		boolean oldRelationshipTraversalESet = relationshipTraversalESet;
		relationshipTraversal = RELATIONSHIP_TRAVERSAL_EDEFAULT;
		relationshipTraversalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.INCLUDE_RELATED_CODES__RELATIONSHIP_TRAVERSAL, oldRelationshipTraversal, RELATIONSHIP_TRAVERSAL_EDEFAULT, oldRelationshipTraversalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationshipTraversal() {
		return relationshipTraversalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.INCLUDE_RELATED_CODES__RELATIONSHIP_NAME:
				return getRelationshipName();
			case Mif2Package.INCLUDE_RELATED_CODES__RELATIONSHIP_TRAVERSAL:
				return getRelationshipTraversal();
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
			case Mif2Package.INCLUDE_RELATED_CODES__RELATIONSHIP_NAME:
				setRelationshipName((String)newValue);
				return;
			case Mif2Package.INCLUDE_RELATED_CODES__RELATIONSHIP_TRAVERSAL:
				setRelationshipTraversal((RelationshipTraversalKind)newValue);
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
			case Mif2Package.INCLUDE_RELATED_CODES__RELATIONSHIP_NAME:
				setRelationshipName(RELATIONSHIP_NAME_EDEFAULT);
				return;
			case Mif2Package.INCLUDE_RELATED_CODES__RELATIONSHIP_TRAVERSAL:
				unsetRelationshipTraversal();
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
			case Mif2Package.INCLUDE_RELATED_CODES__RELATIONSHIP_NAME:
				return RELATIONSHIP_NAME_EDEFAULT == null ? relationshipName != null : !RELATIONSHIP_NAME_EDEFAULT.equals(relationshipName);
			case Mif2Package.INCLUDE_RELATED_CODES__RELATIONSHIP_TRAVERSAL:
				return isSetRelationshipTraversal();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (relationshipName: ");
		result.append(relationshipName);
		result.append(", relationshipTraversal: ");
		if (relationshipTraversalESet) result.append(relationshipTraversal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IncludeRelatedCodesImpl
