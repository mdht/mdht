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

import org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptRef;
import org.openhealthtools.mdht.emf.hl7.mif2.MapRelationshipKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.TranslatableDirectionKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Translation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeTranslationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeTranslationImpl#getSourceConcept <em>Source Concept</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeTranslationImpl#getTargetConcept <em>Target Concept</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeTranslationImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeTranslationImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeTranslationImpl#getTranslatableDirection <em>Translatable Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeTranslationImpl extends ModelElementImpl implements CodeTranslation {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected CodeTranslationAnnotations annotations;

	/**
	 * The cached value of the '{@link #getSourceConcept() <em>Source Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConcept()
	 * @generated
	 * @ordered
	 */
	protected ConceptRef sourceConcept;

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
	 * The default value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected static final MapRelationshipKind QUALITY_EDEFAULT = MapRelationshipKind.BT;

	/**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected MapRelationshipKind quality = QUALITY_EDEFAULT;

	/**
	 * This is true if the Quality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualityESet;

	/**
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected String sortKey = SORT_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTranslatableDirection() <em>Translatable Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslatableDirection()
	 * @generated
	 * @ordered
	 */
	protected static final TranslatableDirectionKind TRANSLATABLE_DIRECTION_EDEFAULT = TranslatableDirectionKind.SOURCE_TO_TARGET;

	/**
	 * The cached value of the '{@link #getTranslatableDirection() <em>Translatable Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslatableDirection()
	 * @generated
	 * @ordered
	 */
	protected TranslatableDirectionKind translatableDirection = TRANSLATABLE_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Translatable Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean translatableDirectionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeTranslationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CODE_TRANSLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeTranslationAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(CodeTranslationAnnotations newAnnotations, NotificationChain msgs) {
		CodeTranslationAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_TRANSLATION__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(CodeTranslationAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CODE_TRANSLATION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CODE_TRANSLATION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_TRANSLATION__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptRef getSourceConcept() {
		return sourceConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceConcept(ConceptRef newSourceConcept, NotificationChain msgs) {
		ConceptRef oldSourceConcept = sourceConcept;
		sourceConcept = newSourceConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_TRANSLATION__SOURCE_CONCEPT, oldSourceConcept, newSourceConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceConcept(ConceptRef newSourceConcept) {
		if (newSourceConcept != sourceConcept) {
			NotificationChain msgs = null;
			if (sourceConcept != null)
				msgs = ((InternalEObject)sourceConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CODE_TRANSLATION__SOURCE_CONCEPT, null, msgs);
			if (newSourceConcept != null)
				msgs = ((InternalEObject)newSourceConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CODE_TRANSLATION__SOURCE_CONCEPT, null, msgs);
			msgs = basicSetSourceConcept(newSourceConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_TRANSLATION__SOURCE_CONCEPT, newSourceConcept, newSourceConcept));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_TRANSLATION__TARGET_CONCEPT, oldTargetConcept, newTargetConcept);
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
				msgs = ((InternalEObject)targetConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CODE_TRANSLATION__TARGET_CONCEPT, null, msgs);
			if (newTargetConcept != null)
				msgs = ((InternalEObject)newTargetConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CODE_TRANSLATION__TARGET_CONCEPT, null, msgs);
			msgs = basicSetTargetConcept(newTargetConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_TRANSLATION__TARGET_CONCEPT, newTargetConcept, newTargetConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapRelationshipKind getQuality() {
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuality(MapRelationshipKind newQuality) {
		MapRelationshipKind oldQuality = quality;
		quality = newQuality == null ? QUALITY_EDEFAULT : newQuality;
		boolean oldQualityESet = qualityESet;
		qualityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_TRANSLATION__QUALITY, oldQuality, quality, !oldQualityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuality() {
		MapRelationshipKind oldQuality = quality;
		boolean oldQualityESet = qualityESet;
		quality = QUALITY_EDEFAULT;
		qualityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CODE_TRANSLATION__QUALITY, oldQuality, QUALITY_EDEFAULT, oldQualityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuality() {
		return qualityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortKey() {
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(String newSortKey) {
		String oldSortKey = sortKey;
		sortKey = newSortKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_TRANSLATION__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslatableDirectionKind getTranslatableDirection() {
		return translatableDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslatableDirection(TranslatableDirectionKind newTranslatableDirection) {
		TranslatableDirectionKind oldTranslatableDirection = translatableDirection;
		translatableDirection = newTranslatableDirection == null ? TRANSLATABLE_DIRECTION_EDEFAULT : newTranslatableDirection;
		boolean oldTranslatableDirectionESet = translatableDirectionESet;
		translatableDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_TRANSLATION__TRANSLATABLE_DIRECTION, oldTranslatableDirection, translatableDirection, !oldTranslatableDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTranslatableDirection() {
		TranslatableDirectionKind oldTranslatableDirection = translatableDirection;
		boolean oldTranslatableDirectionESet = translatableDirectionESet;
		translatableDirection = TRANSLATABLE_DIRECTION_EDEFAULT;
		translatableDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CODE_TRANSLATION__TRANSLATABLE_DIRECTION, oldTranslatableDirection, TRANSLATABLE_DIRECTION_EDEFAULT, oldTranslatableDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTranslatableDirection() {
		return translatableDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CODE_TRANSLATION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.CODE_TRANSLATION__SOURCE_CONCEPT:
				return basicSetSourceConcept(null, msgs);
			case Mif2Package.CODE_TRANSLATION__TARGET_CONCEPT:
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
			case Mif2Package.CODE_TRANSLATION__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.CODE_TRANSLATION__SOURCE_CONCEPT:
				return getSourceConcept();
			case Mif2Package.CODE_TRANSLATION__TARGET_CONCEPT:
				return getTargetConcept();
			case Mif2Package.CODE_TRANSLATION__QUALITY:
				return getQuality();
			case Mif2Package.CODE_TRANSLATION__SORT_KEY:
				return getSortKey();
			case Mif2Package.CODE_TRANSLATION__TRANSLATABLE_DIRECTION:
				return getTranslatableDirection();
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
			case Mif2Package.CODE_TRANSLATION__ANNOTATIONS:
				setAnnotations((CodeTranslationAnnotations)newValue);
				return;
			case Mif2Package.CODE_TRANSLATION__SOURCE_CONCEPT:
				setSourceConcept((ConceptRef)newValue);
				return;
			case Mif2Package.CODE_TRANSLATION__TARGET_CONCEPT:
				setTargetConcept((ConceptRef)newValue);
				return;
			case Mif2Package.CODE_TRANSLATION__QUALITY:
				setQuality((MapRelationshipKind)newValue);
				return;
			case Mif2Package.CODE_TRANSLATION__SORT_KEY:
				setSortKey((String)newValue);
				return;
			case Mif2Package.CODE_TRANSLATION__TRANSLATABLE_DIRECTION:
				setTranslatableDirection((TranslatableDirectionKind)newValue);
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
			case Mif2Package.CODE_TRANSLATION__ANNOTATIONS:
				setAnnotations((CodeTranslationAnnotations)null);
				return;
			case Mif2Package.CODE_TRANSLATION__SOURCE_CONCEPT:
				setSourceConcept((ConceptRef)null);
				return;
			case Mif2Package.CODE_TRANSLATION__TARGET_CONCEPT:
				setTargetConcept((ConceptRef)null);
				return;
			case Mif2Package.CODE_TRANSLATION__QUALITY:
				unsetQuality();
				return;
			case Mif2Package.CODE_TRANSLATION__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case Mif2Package.CODE_TRANSLATION__TRANSLATABLE_DIRECTION:
				unsetTranslatableDirection();
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
			case Mif2Package.CODE_TRANSLATION__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.CODE_TRANSLATION__SOURCE_CONCEPT:
				return sourceConcept != null;
			case Mif2Package.CODE_TRANSLATION__TARGET_CONCEPT:
				return targetConcept != null;
			case Mif2Package.CODE_TRANSLATION__QUALITY:
				return isSetQuality();
			case Mif2Package.CODE_TRANSLATION__SORT_KEY:
				return SORT_KEY_EDEFAULT == null ? sortKey != null : !SORT_KEY_EDEFAULT.equals(sortKey);
			case Mif2Package.CODE_TRANSLATION__TRANSLATABLE_DIRECTION:
				return isSetTranslatableDirection();
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
		result.append(" (quality: ");
		if (qualityESet) result.append(quality); else result.append("<unset>");
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(", translatableDirection: ");
		if (translatableDirectionESet) result.append(translatableDirection); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CodeTranslationImpl
