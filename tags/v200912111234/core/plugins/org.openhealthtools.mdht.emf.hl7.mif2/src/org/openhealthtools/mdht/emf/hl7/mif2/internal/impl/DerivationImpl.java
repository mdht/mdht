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

import org.openhealthtools.mdht.emf.hl7.mif2.Derivation;
import org.openhealthtools.mdht.emf.hl7.mif2.DerivationRelationshipKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DerivationImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DerivationImpl#getAnnotationsReviewedBy <em>Annotations Reviewed By</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DerivationImpl#isAreAnnotationsReviewed <em>Are Annotations Reviewed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DerivationImpl#getRelationship <em>Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DerivationImpl extends DependencyImpl implements Derivation {
	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected Flow reason;

	/**
	 * The default value of the '{@link #getAnnotationsReviewedBy() <em>Annotations Reviewed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationsReviewedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATIONS_REVIEWED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotationsReviewedBy() <em>Annotations Reviewed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationsReviewedBy()
	 * @generated
	 * @ordered
	 */
	protected String annotationsReviewedBy = ANNOTATIONS_REVIEWED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #isAreAnnotationsReviewed() <em>Are Annotations Reviewed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAreAnnotationsReviewed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARE_ANNOTATIONS_REVIEWED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAreAnnotationsReviewed() <em>Are Annotations Reviewed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAreAnnotationsReviewed()
	 * @generated
	 * @ordered
	 */
	protected boolean areAnnotationsReviewed = ARE_ANNOTATIONS_REVIEWED_EDEFAULT;

	/**
	 * This is true if the Are Annotations Reviewed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean areAnnotationsReviewedESet;

	/**
	 * The default value of the '{@link #getRelationship() <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final DerivationRelationshipKind RELATIONSHIP_EDEFAULT = DerivationRelationshipKind.RESTRICTION;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected DerivationRelationshipKind relationship = RELATIONSHIP_EDEFAULT;

	/**
	 * This is true if the Relationship attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relationshipESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReason(Flow newReason, NotificationChain msgs) {
		Flow oldReason = reason;
		reason = newReason;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.DERIVATION__REASON, oldReason, newReason);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(Flow newReason) {
		if (newReason != reason) {
			NotificationChain msgs = null;
			if (reason != null)
				msgs = ((InternalEObject)reason).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DERIVATION__REASON, null, msgs);
			if (newReason != null)
				msgs = ((InternalEObject)newReason).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.DERIVATION__REASON, null, msgs);
			msgs = basicSetReason(newReason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DERIVATION__REASON, newReason, newReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotationsReviewedBy() {
		return annotationsReviewedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationsReviewedBy(String newAnnotationsReviewedBy) {
		String oldAnnotationsReviewedBy = annotationsReviewedBy;
		annotationsReviewedBy = newAnnotationsReviewedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DERIVATION__ANNOTATIONS_REVIEWED_BY, oldAnnotationsReviewedBy, annotationsReviewedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAreAnnotationsReviewed() {
		return areAnnotationsReviewed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreAnnotationsReviewed(boolean newAreAnnotationsReviewed) {
		boolean oldAreAnnotationsReviewed = areAnnotationsReviewed;
		areAnnotationsReviewed = newAreAnnotationsReviewed;
		boolean oldAreAnnotationsReviewedESet = areAnnotationsReviewedESet;
		areAnnotationsReviewedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DERIVATION__ARE_ANNOTATIONS_REVIEWED, oldAreAnnotationsReviewed, areAnnotationsReviewed, !oldAreAnnotationsReviewedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAreAnnotationsReviewed() {
		boolean oldAreAnnotationsReviewed = areAnnotationsReviewed;
		boolean oldAreAnnotationsReviewedESet = areAnnotationsReviewedESet;
		areAnnotationsReviewed = ARE_ANNOTATIONS_REVIEWED_EDEFAULT;
		areAnnotationsReviewedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.DERIVATION__ARE_ANNOTATIONS_REVIEWED, oldAreAnnotationsReviewed, ARE_ANNOTATIONS_REVIEWED_EDEFAULT, oldAreAnnotationsReviewedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAreAnnotationsReviewed() {
		return areAnnotationsReviewedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationRelationshipKind getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(DerivationRelationshipKind newRelationship) {
		DerivationRelationshipKind oldRelationship = relationship;
		relationship = newRelationship == null ? RELATIONSHIP_EDEFAULT : newRelationship;
		boolean oldRelationshipESet = relationshipESet;
		relationshipESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DERIVATION__RELATIONSHIP, oldRelationship, relationship, !oldRelationshipESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelationship() {
		DerivationRelationshipKind oldRelationship = relationship;
		boolean oldRelationshipESet = relationshipESet;
		relationship = RELATIONSHIP_EDEFAULT;
		relationshipESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.DERIVATION__RELATIONSHIP, oldRelationship, RELATIONSHIP_EDEFAULT, oldRelationshipESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationship() {
		return relationshipESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.DERIVATION__REASON:
				return basicSetReason(null, msgs);
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
			case Mif2Package.DERIVATION__REASON:
				return getReason();
			case Mif2Package.DERIVATION__ANNOTATIONS_REVIEWED_BY:
				return getAnnotationsReviewedBy();
			case Mif2Package.DERIVATION__ARE_ANNOTATIONS_REVIEWED:
				return isAreAnnotationsReviewed() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.DERIVATION__RELATIONSHIP:
				return getRelationship();
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
			case Mif2Package.DERIVATION__REASON:
				setReason((Flow)newValue);
				return;
			case Mif2Package.DERIVATION__ANNOTATIONS_REVIEWED_BY:
				setAnnotationsReviewedBy((String)newValue);
				return;
			case Mif2Package.DERIVATION__ARE_ANNOTATIONS_REVIEWED:
				setAreAnnotationsReviewed(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.DERIVATION__RELATIONSHIP:
				setRelationship((DerivationRelationshipKind)newValue);
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
			case Mif2Package.DERIVATION__REASON:
				setReason((Flow)null);
				return;
			case Mif2Package.DERIVATION__ANNOTATIONS_REVIEWED_BY:
				setAnnotationsReviewedBy(ANNOTATIONS_REVIEWED_BY_EDEFAULT);
				return;
			case Mif2Package.DERIVATION__ARE_ANNOTATIONS_REVIEWED:
				unsetAreAnnotationsReviewed();
				return;
			case Mif2Package.DERIVATION__RELATIONSHIP:
				unsetRelationship();
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
			case Mif2Package.DERIVATION__REASON:
				return reason != null;
			case Mif2Package.DERIVATION__ANNOTATIONS_REVIEWED_BY:
				return ANNOTATIONS_REVIEWED_BY_EDEFAULT == null ? annotationsReviewedBy != null : !ANNOTATIONS_REVIEWED_BY_EDEFAULT.equals(annotationsReviewedBy);
			case Mif2Package.DERIVATION__ARE_ANNOTATIONS_REVIEWED:
				return isSetAreAnnotationsReviewed();
			case Mif2Package.DERIVATION__RELATIONSHIP:
				return isSetRelationship();
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
		result.append(" (annotationsReviewedBy: ");
		result.append(annotationsReviewedBy);
		result.append(", areAnnotationsReviewed: ");
		if (areAnnotationsReviewedESet) result.append(areAnnotationsReviewed); else result.append("<unset>");
		result.append(", relationship: ");
		if (relationshipESet) result.append(relationship); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DerivationImpl
