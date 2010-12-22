/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.RelationshipBasedContentDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Based Content Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.RelationshipBasedContentDefinitionImpl#getTargetConcepts <em>Target Concepts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.RelationshipBasedContentDefinitionImpl#getRelationshipName <em>Relationship Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipBasedContentDefinitionImpl extends EObjectImpl implements RelationshipBasedContentDefinition {
	/**
	 * The cached value of the '{@link #getTargetConcepts() <em>Target Concepts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetConcepts()
	 * @generated
	 * @ordered
	 */
	protected ContentDefinition targetConcepts;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipBasedContentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.RELATIONSHIP_BASED_CONTENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinition getTargetConcepts() {
		return targetConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetConcepts(ContentDefinition newTargetConcepts, NotificationChain msgs) {
		ContentDefinition oldTargetConcepts = targetConcepts;
		targetConcepts = newTargetConcepts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__TARGET_CONCEPTS, oldTargetConcepts, newTargetConcepts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetConcepts(ContentDefinition newTargetConcepts) {
		if (newTargetConcepts != targetConcepts) {
			NotificationChain msgs = null;
			if (targetConcepts != null)
				msgs = ((InternalEObject)targetConcepts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__TARGET_CONCEPTS, null, msgs);
			if (newTargetConcepts != null)
				msgs = ((InternalEObject)newTargetConcepts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__TARGET_CONCEPTS, null, msgs);
			msgs = basicSetTargetConcepts(newTargetConcepts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__TARGET_CONCEPTS, newTargetConcepts, newTargetConcepts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__RELATIONSHIP_NAME, oldRelationshipName, relationshipName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__TARGET_CONCEPTS:
				return basicSetTargetConcepts(null, msgs);
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
			case Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__TARGET_CONCEPTS:
				return getTargetConcepts();
			case Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__RELATIONSHIP_NAME:
				return getRelationshipName();
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
			case Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__TARGET_CONCEPTS:
				setTargetConcepts((ContentDefinition)newValue);
				return;
			case Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__RELATIONSHIP_NAME:
				setRelationshipName((String)newValue);
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
			case Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__TARGET_CONCEPTS:
				setTargetConcepts((ContentDefinition)null);
				return;
			case Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__RELATIONSHIP_NAME:
				setRelationshipName(RELATIONSHIP_NAME_EDEFAULT);
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
			case Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__TARGET_CONCEPTS:
				return targetConcepts != null;
			case Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION__RELATIONSHIP_NAME:
				return RELATIONSHIP_NAME_EDEFAULT == null ? relationshipName != null : !RELATIONSHIP_NAME_EDEFAULT.equals(relationshipName);
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
		result.append(')');
		return result.toString();
	}

} //RelationshipBasedContentDefinitionImpl
