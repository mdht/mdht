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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainProperty;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptDomainImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptDomainImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptDomainImpl#getSpecializesDomain <em>Specializes Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptDomainImpl#getExampleConcept <em>Example Concept</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptDomainImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptDomainImpl#getSpecializedByDomain <em>Specialized By Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptDomainImpl#isIsBindable <em>Is Bindable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptDomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptDomainImpl#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptDomainImpl extends ModelElementImpl implements ConceptDomain {
	/**
	 * The cached value of the '{@link #getBusinessName() <em>Business Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessName()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessName> businessName;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected ConceptDomainAnnotations annotations;

	/**
	 * The cached value of the '{@link #getSpecializesDomain() <em>Specializes Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializesDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptDomainRef> specializesDomain;

	/**
	 * The cached value of the '{@link #getExampleConcept() <em>Example Concept</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<String> exampleConcept;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptDomainProperty> property;

	/**
	 * The cached value of the '{@link #getSpecializedByDomain() <em>Specialized By Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializedByDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptDomainRef> specializedByDomain;

	/**
	 * The default value of the '{@link #isIsBindable() <em>Is Bindable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBindable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BINDABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsBindable() <em>Is Bindable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBindable()
	 * @generated
	 * @ordered
	 */
	protected boolean isBindable = IS_BINDABLE_EDEFAULT;

	/**
	 * This is true if the Is Bindable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isBindableESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONCEPT_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessName> getBusinessName() {
		if (businessName == null) {
			businessName = new EObjectContainmentEList<BusinessName>(BusinessName.class, this, Mif2Package.CONCEPT_DOMAIN__BUSINESS_NAME);
		}
		return businessName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomainAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(ConceptDomainAnnotations newAnnotations, NotificationChain msgs) {
		ConceptDomainAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT_DOMAIN__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(ConceptDomainAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONCEPT_DOMAIN__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONCEPT_DOMAIN__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT_DOMAIN__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptDomainRef> getSpecializesDomain() {
		if (specializesDomain == null) {
			specializesDomain = new EObjectContainmentEList<ConceptDomainRef>(ConceptDomainRef.class, this, Mif2Package.CONCEPT_DOMAIN__SPECIALIZES_DOMAIN);
		}
		return specializesDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExampleConcept() {
		if (exampleConcept == null) {
			exampleConcept = new EDataTypeEList<String>(String.class, this, Mif2Package.CONCEPT_DOMAIN__EXAMPLE_CONCEPT);
		}
		return exampleConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptDomainProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<ConceptDomainProperty>(ConceptDomainProperty.class, this, Mif2Package.CONCEPT_DOMAIN__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptDomainRef> getSpecializedByDomain() {
		if (specializedByDomain == null) {
			specializedByDomain = new EObjectContainmentEList<ConceptDomainRef>(ConceptDomainRef.class, this, Mif2Package.CONCEPT_DOMAIN__SPECIALIZED_BY_DOMAIN);
		}
		return specializedByDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBindable() {
		return isBindable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBindable(boolean newIsBindable) {
		boolean oldIsBindable = isBindable;
		isBindable = newIsBindable;
		boolean oldIsBindableESet = isBindableESet;
		isBindableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT_DOMAIN__IS_BINDABLE, oldIsBindable, isBindable, !oldIsBindableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsBindable() {
		boolean oldIsBindable = isBindable;
		boolean oldIsBindableESet = isBindableESet;
		isBindable = IS_BINDABLE_EDEFAULT;
		isBindableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CONCEPT_DOMAIN__IS_BINDABLE, oldIsBindable, IS_BINDABLE_EDEFAULT, oldIsBindableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsBindable() {
		return isBindableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT_DOMAIN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONCEPT_DOMAIN__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CONCEPT_DOMAIN__BUSINESS_NAME:
				return ((InternalEList<?>)getBusinessName()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONCEPT_DOMAIN__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.CONCEPT_DOMAIN__SPECIALIZES_DOMAIN:
				return ((InternalEList<?>)getSpecializesDomain()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONCEPT_DOMAIN__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONCEPT_DOMAIN__SPECIALIZED_BY_DOMAIN:
				return ((InternalEList<?>)getSpecializedByDomain()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CONCEPT_DOMAIN__BUSINESS_NAME:
				return getBusinessName();
			case Mif2Package.CONCEPT_DOMAIN__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.CONCEPT_DOMAIN__SPECIALIZES_DOMAIN:
				return getSpecializesDomain();
			case Mif2Package.CONCEPT_DOMAIN__EXAMPLE_CONCEPT:
				return getExampleConcept();
			case Mif2Package.CONCEPT_DOMAIN__PROPERTY:
				return getProperty();
			case Mif2Package.CONCEPT_DOMAIN__SPECIALIZED_BY_DOMAIN:
				return getSpecializedByDomain();
			case Mif2Package.CONCEPT_DOMAIN__IS_BINDABLE:
				return isIsBindable() ? Boolean.TRUE : Boolean.FALSE;
			case Mif2Package.CONCEPT_DOMAIN__NAME:
				return getName();
			case Mif2Package.CONCEPT_DOMAIN__SORT_KEY:
				return getSortKey();
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
			case Mif2Package.CONCEPT_DOMAIN__BUSINESS_NAME:
				getBusinessName().clear();
				getBusinessName().addAll((Collection<? extends BusinessName>)newValue);
				return;
			case Mif2Package.CONCEPT_DOMAIN__ANNOTATIONS:
				setAnnotations((ConceptDomainAnnotations)newValue);
				return;
			case Mif2Package.CONCEPT_DOMAIN__SPECIALIZES_DOMAIN:
				getSpecializesDomain().clear();
				getSpecializesDomain().addAll((Collection<? extends ConceptDomainRef>)newValue);
				return;
			case Mif2Package.CONCEPT_DOMAIN__EXAMPLE_CONCEPT:
				getExampleConcept().clear();
				getExampleConcept().addAll((Collection<? extends String>)newValue);
				return;
			case Mif2Package.CONCEPT_DOMAIN__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends ConceptDomainProperty>)newValue);
				return;
			case Mif2Package.CONCEPT_DOMAIN__SPECIALIZED_BY_DOMAIN:
				getSpecializedByDomain().clear();
				getSpecializedByDomain().addAll((Collection<? extends ConceptDomainRef>)newValue);
				return;
			case Mif2Package.CONCEPT_DOMAIN__IS_BINDABLE:
				setIsBindable(((Boolean)newValue).booleanValue());
				return;
			case Mif2Package.CONCEPT_DOMAIN__NAME:
				setName((String)newValue);
				return;
			case Mif2Package.CONCEPT_DOMAIN__SORT_KEY:
				setSortKey((String)newValue);
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
			case Mif2Package.CONCEPT_DOMAIN__BUSINESS_NAME:
				getBusinessName().clear();
				return;
			case Mif2Package.CONCEPT_DOMAIN__ANNOTATIONS:
				setAnnotations((ConceptDomainAnnotations)null);
				return;
			case Mif2Package.CONCEPT_DOMAIN__SPECIALIZES_DOMAIN:
				getSpecializesDomain().clear();
				return;
			case Mif2Package.CONCEPT_DOMAIN__EXAMPLE_CONCEPT:
				getExampleConcept().clear();
				return;
			case Mif2Package.CONCEPT_DOMAIN__PROPERTY:
				getProperty().clear();
				return;
			case Mif2Package.CONCEPT_DOMAIN__SPECIALIZED_BY_DOMAIN:
				getSpecializedByDomain().clear();
				return;
			case Mif2Package.CONCEPT_DOMAIN__IS_BINDABLE:
				unsetIsBindable();
				return;
			case Mif2Package.CONCEPT_DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.CONCEPT_DOMAIN__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
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
			case Mif2Package.CONCEPT_DOMAIN__BUSINESS_NAME:
				return businessName != null && !businessName.isEmpty();
			case Mif2Package.CONCEPT_DOMAIN__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.CONCEPT_DOMAIN__SPECIALIZES_DOMAIN:
				return specializesDomain != null && !specializesDomain.isEmpty();
			case Mif2Package.CONCEPT_DOMAIN__EXAMPLE_CONCEPT:
				return exampleConcept != null && !exampleConcept.isEmpty();
			case Mif2Package.CONCEPT_DOMAIN__PROPERTY:
				return property != null && !property.isEmpty();
			case Mif2Package.CONCEPT_DOMAIN__SPECIALIZED_BY_DOMAIN:
				return specializedByDomain != null && !specializedByDomain.isEmpty();
			case Mif2Package.CONCEPT_DOMAIN__IS_BINDABLE:
				return isSetIsBindable();
			case Mif2Package.CONCEPT_DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Mif2Package.CONCEPT_DOMAIN__SORT_KEY:
				return SORT_KEY_EDEFAULT == null ? sortKey != null : !SORT_KEY_EDEFAULT.equals(sortKey);
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
		result.append(" (exampleConcept: ");
		result.append(exampleConcept);
		result.append(", isBindable: ");
		if (isBindableESet) result.append(isBindable); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(')');
		return result.toString();
	}

} //ConceptDomainImpl
