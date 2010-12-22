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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.Code;
import org.openhealthtools.mdht.emf.hl7.mif2.Concept;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptUse;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PrintName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptImpl#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptImpl#getConceptRelationship <em>Concept Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptImpl#getConceptProperty <em>Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptImpl#getPrintName <em>Print Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptImpl#isIsSelectable <em>Is Selectable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptImpl#getPropertyGroup <em>Property Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptImpl extends ConceptBaseImpl implements Concept {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected ConceptAnnotations annotations;

	/**
	 * The cached value of the '{@link #getIntendedUse() <em>Intended Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedUse()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptUse> intendedUse;

	/**
	 * The cached value of the '{@link #getConceptRelationship() <em>Concept Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptRelationship> conceptRelationship;

	/**
	 * The cached value of the '{@link #getConceptProperty() <em>Concept Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptProperty> conceptProperty;

	/**
	 * The cached value of the '{@link #getPrintName() <em>Print Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintName()
	 * @generated
	 * @ordered
	 */
	protected EList<PrintName> printName;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> code;

	/**
	 * The default value of the '{@link #isIsSelectable() <em>Is Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelectable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SELECTABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsSelectable() <em>Is Selectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelectable()
	 * @generated
	 * @ordered
	 */
	protected boolean isSelectable = IS_SELECTABLE_EDEFAULT;

	/**
	 * This is true if the Is Selectable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSelectableESet;

	/**
	 * The default value of the '{@link #getPropertyGroup() <em>Property Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyGroup() <em>Property Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyGroup()
	 * @generated
	 * @ordered
	 */
	protected String propertyGroup = PROPERTY_GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(ConceptAnnotations newAnnotations, NotificationChain msgs) {
		ConceptAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(ConceptAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONCEPT__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONCEPT__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptUse> getIntendedUse() {
		if (intendedUse == null) {
			intendedUse = new EObjectContainmentEList<ConceptUse>(ConceptUse.class, this, Mif2Package.CONCEPT__INTENDED_USE);
		}
		return intendedUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptRelationship> getConceptRelationship() {
		if (conceptRelationship == null) {
			conceptRelationship = new EObjectContainmentEList<ConceptRelationship>(ConceptRelationship.class, this, Mif2Package.CONCEPT__CONCEPT_RELATIONSHIP);
		}
		return conceptRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptProperty> getConceptProperty() {
		if (conceptProperty == null) {
			conceptProperty = new EObjectContainmentEList<ConceptProperty>(ConceptProperty.class, this, Mif2Package.CONCEPT__CONCEPT_PROPERTY);
		}
		return conceptProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintName> getPrintName() {
		if (printName == null) {
			printName = new EObjectContainmentEList<PrintName>(PrintName.class, this, Mif2Package.CONCEPT__PRINT_NAME);
		}
		return printName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getCode() {
		if (code == null) {
			code = new EObjectContainmentEList<Code>(Code.class, this, Mif2Package.CONCEPT__CODE);
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSelectable() {
		return isSelectable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSelectable(boolean newIsSelectable) {
		boolean oldIsSelectable = isSelectable;
		isSelectable = newIsSelectable;
		boolean oldIsSelectableESet = isSelectableESet;
		isSelectableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT__IS_SELECTABLE, oldIsSelectable, isSelectable, !oldIsSelectableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSelectable() {
		boolean oldIsSelectable = isSelectable;
		boolean oldIsSelectableESet = isSelectableESet;
		isSelectable = IS_SELECTABLE_EDEFAULT;
		isSelectableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CONCEPT__IS_SELECTABLE, oldIsSelectable, IS_SELECTABLE_EDEFAULT, oldIsSelectableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSelectable() {
		return isSelectableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyGroup() {
		return propertyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyGroup(String newPropertyGroup) {
		String oldPropertyGroup = propertyGroup;
		propertyGroup = newPropertyGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT__PROPERTY_GROUP, oldPropertyGroup, propertyGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CONCEPT__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.CONCEPT__INTENDED_USE:
				return ((InternalEList<?>)getIntendedUse()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONCEPT__CONCEPT_RELATIONSHIP:
				return ((InternalEList<?>)getConceptRelationship()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONCEPT__CONCEPT_PROPERTY:
				return ((InternalEList<?>)getConceptProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONCEPT__PRINT_NAME:
				return ((InternalEList<?>)getPrintName()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONCEPT__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CONCEPT__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.CONCEPT__INTENDED_USE:
				return getIntendedUse();
			case Mif2Package.CONCEPT__CONCEPT_RELATIONSHIP:
				return getConceptRelationship();
			case Mif2Package.CONCEPT__CONCEPT_PROPERTY:
				return getConceptProperty();
			case Mif2Package.CONCEPT__PRINT_NAME:
				return getPrintName();
			case Mif2Package.CONCEPT__CODE:
				return getCode();
			case Mif2Package.CONCEPT__IS_SELECTABLE:
				return isIsSelectable() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.CONCEPT__PROPERTY_GROUP:
				return getPropertyGroup();
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
			case Mif2Package.CONCEPT__ANNOTATIONS:
				setAnnotations((ConceptAnnotations)newValue);
				return;
			case Mif2Package.CONCEPT__INTENDED_USE:
				getIntendedUse().clear();
				getIntendedUse().addAll((Collection<? extends ConceptUse>)newValue);
				return;
			case Mif2Package.CONCEPT__CONCEPT_RELATIONSHIP:
				getConceptRelationship().clear();
				getConceptRelationship().addAll((Collection<? extends ConceptRelationship>)newValue);
				return;
			case Mif2Package.CONCEPT__CONCEPT_PROPERTY:
				getConceptProperty().clear();
				getConceptProperty().addAll((Collection<? extends ConceptProperty>)newValue);
				return;
			case Mif2Package.CONCEPT__PRINT_NAME:
				getPrintName().clear();
				getPrintName().addAll((Collection<? extends PrintName>)newValue);
				return;
			case Mif2Package.CONCEPT__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends Code>)newValue);
				return;
			case Mif2Package.CONCEPT__IS_SELECTABLE:
				setIsSelectable(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.CONCEPT__PROPERTY_GROUP:
				setPropertyGroup((String)newValue);
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
			case Mif2Package.CONCEPT__ANNOTATIONS:
				setAnnotations((ConceptAnnotations)null);
				return;
			case Mif2Package.CONCEPT__INTENDED_USE:
				getIntendedUse().clear();
				return;
			case Mif2Package.CONCEPT__CONCEPT_RELATIONSHIP:
				getConceptRelationship().clear();
				return;
			case Mif2Package.CONCEPT__CONCEPT_PROPERTY:
				getConceptProperty().clear();
				return;
			case Mif2Package.CONCEPT__PRINT_NAME:
				getPrintName().clear();
				return;
			case Mif2Package.CONCEPT__CODE:
				getCode().clear();
				return;
			case Mif2Package.CONCEPT__IS_SELECTABLE:
				unsetIsSelectable();
				return;
			case Mif2Package.CONCEPT__PROPERTY_GROUP:
				setPropertyGroup(PROPERTY_GROUP_EDEFAULT);
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
			case Mif2Package.CONCEPT__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.CONCEPT__INTENDED_USE:
				return intendedUse != null && !intendedUse.isEmpty();
			case Mif2Package.CONCEPT__CONCEPT_RELATIONSHIP:
				return conceptRelationship != null && !conceptRelationship.isEmpty();
			case Mif2Package.CONCEPT__CONCEPT_PROPERTY:
				return conceptProperty != null && !conceptProperty.isEmpty();
			case Mif2Package.CONCEPT__PRINT_NAME:
				return printName != null && !printName.isEmpty();
			case Mif2Package.CONCEPT__CODE:
				return code != null && !code.isEmpty();
			case Mif2Package.CONCEPT__IS_SELECTABLE:
				return isSetIsSelectable();
			case Mif2Package.CONCEPT__PROPERTY_GROUP:
				return PROPERTY_GROUP_EDEFAULT == null ? propertyGroup != null : !PROPERTY_GROUP_EDEFAULT.equals(propertyGroup);
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
		result.append(" (isSelectable: ");
		if (isSelectableESet) result.append(isSelectable); else result.append("<unset>");
		result.append(", propertyGroup: ");
		result.append(propertyGroup);
		result.append(')');
		return result.toString();
	}

} //ConceptImpl
