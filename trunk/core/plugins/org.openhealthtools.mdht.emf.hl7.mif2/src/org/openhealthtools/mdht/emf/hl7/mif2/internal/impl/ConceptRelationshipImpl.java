/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptRef;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptRelationshipImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptRelationshipImpl#getTargetConcept <em>Target Concept</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptRelationshipImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptRelationshipImpl#getRelationshipName <em>Relationship Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptRelationshipImpl extends EObjectImpl implements ConceptRelationship {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptProperty> property;

	/**
	 * The cached value of the '{@link #getTargetConcept() <em>Target Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetConcept()
	 * @generated
	 * @ordered
	 */
	protected ConceptRef targetConcept;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * This is true if the Is Derived attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDerivedESet;

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
	protected ConceptRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONCEPT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<ConceptProperty>(ConceptProperty.class, this, Mif2Package.CONCEPT_RELATIONSHIP__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptRef getTargetConcept() {
		return targetConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetConcept(ConceptRef newTargetConcept, NotificationChain msgs) {
		ConceptRef oldTargetConcept = targetConcept;
		targetConcept = newTargetConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT_RELATIONSHIP__TARGET_CONCEPT, oldTargetConcept, newTargetConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetConcept(ConceptRef newTargetConcept) {
		if (newTargetConcept != targetConcept) {
			NotificationChain msgs = null;
			if (targetConcept != null)
				msgs = ((InternalEObject)targetConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONCEPT_RELATIONSHIP__TARGET_CONCEPT, null, msgs);
			if (newTargetConcept != null)
				msgs = ((InternalEObject)newTargetConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONCEPT_RELATIONSHIP__TARGET_CONCEPT, null, msgs);
			msgs = basicSetTargetConcept(newTargetConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT_RELATIONSHIP__TARGET_CONCEPT, newTargetConcept, newTargetConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		boolean oldIsDerivedESet = isDerivedESet;
		isDerivedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT_RELATIONSHIP__IS_DERIVED, oldIsDerived, isDerived, !oldIsDerivedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDerived() {
		boolean oldIsDerived = isDerived;
		boolean oldIsDerivedESet = isDerivedESet;
		isDerived = IS_DERIVED_EDEFAULT;
		isDerivedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CONCEPT_RELATIONSHIP__IS_DERIVED, oldIsDerived, IS_DERIVED_EDEFAULT, oldIsDerivedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDerived() {
		return isDerivedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT_RELATIONSHIP__RELATIONSHIP_NAME, oldRelationshipName, relationshipName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CONCEPT_RELATIONSHIP__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONCEPT_RELATIONSHIP__TARGET_CONCEPT:
				return basicSetTargetConcept(null, msgs);
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
			case Mif2Package.CONCEPT_RELATIONSHIP__PROPERTY:
				return getProperty();
			case Mif2Package.CONCEPT_RELATIONSHIP__TARGET_CONCEPT:
				return getTargetConcept();
			case Mif2Package.CONCEPT_RELATIONSHIP__IS_DERIVED:
				return isIsDerived() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.CONCEPT_RELATIONSHIP__RELATIONSHIP_NAME:
				return getRelationshipName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.CONCEPT_RELATIONSHIP__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ConceptProperty>)newValue);
				return;
			case Mif2Package.CONCEPT_RELATIONSHIP__TARGET_CONCEPT:
				setTargetConcept((ConceptRef)newValue);
				return;
			case Mif2Package.CONCEPT_RELATIONSHIP__IS_DERIVED:
				setIsDerived(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.CONCEPT_RELATIONSHIP__RELATIONSHIP_NAME:
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
			case Mif2Package.CONCEPT_RELATIONSHIP__PROPERTY:
				getProperty().clear();
				return;
			case Mif2Package.CONCEPT_RELATIONSHIP__TARGET_CONCEPT:
				setTargetConcept((ConceptRef)null);
				return;
			case Mif2Package.CONCEPT_RELATIONSHIP__IS_DERIVED:
				unsetIsDerived();
				return;
			case Mif2Package.CONCEPT_RELATIONSHIP__RELATIONSHIP_NAME:
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
			case Mif2Package.CONCEPT_RELATIONSHIP__PROPERTY:
				return property != null && !property.isEmpty();
			case Mif2Package.CONCEPT_RELATIONSHIP__TARGET_CONCEPT:
				return targetConcept != null;
			case Mif2Package.CONCEPT_RELATIONSHIP__IS_DERIVED:
				return isSetIsDerived();
			case Mif2Package.CONCEPT_RELATIONSHIP__RELATIONSHIP_NAME:
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
		result.append(" (isDerived: ");
		if (isDerivedESet) result.append(isDerived); else result.append("<unset>");
		result.append(", relationshipName: ");
		result.append(relationshipName);
		result.append(')');
		return result.toString();
	}

} //ConceptRelationshipImpl
