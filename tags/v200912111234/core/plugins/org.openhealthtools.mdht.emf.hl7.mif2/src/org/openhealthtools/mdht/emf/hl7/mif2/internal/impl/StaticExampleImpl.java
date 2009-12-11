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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.AnnotationDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.ITSKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.RealmElement;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticExample;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Example</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticExampleImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticExampleImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticExampleImpl#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticExampleImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticExampleImpl#getDerivationSupplier <em>Derivation Supplier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticExampleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticExampleImpl#getItsName <em>Its Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticExampleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticExampleImpl#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticExampleImpl extends AnnotationBaseImpl implements StaticExample {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<FreeFormMarkupWithLanguage> data;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap context;

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
	 * The cached value of the '{@link #getDerivationSupplier() <em>Derivation Supplier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationSupplier()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationDerivation> derivationSupplier;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getItsName() <em>Its Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsName()
	 * @generated
	 * @ordered
	 */
	protected static final ITSKind ITS_NAME_EDEFAULT = ITSKind.XML;

	/**
	 * The cached value of the '{@link #getItsName() <em>Its Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsName()
	 * @generated
	 * @ordered
	 */
	protected ITSKind itsName = ITS_NAME_EDEFAULT;

	/**
	 * This is true if the Its Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean itsNameESet;

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
	protected StaticExampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STATIC_EXAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FreeFormMarkupWithLanguage> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<FreeFormMarkupWithLanguage>(FreeFormMarkupWithLanguage.class, this, Mif2Package.STATIC_EXAMPLE__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContext() {
		if (context == null) {
			context = new BasicFeatureMap(this, Mif2Package.STATIC_EXAMPLE__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealmElement> getRealmNamespace() {
		return getContext().list(Mif2Package.Literals.STATIC_EXAMPLE__REALM_NAMESPACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessName> getBusinessName() {
		if (businessName == null) {
			businessName = new EObjectContainmentEList<BusinessName>(BusinessName.class, this, Mif2Package.STATIC_EXAMPLE__BUSINESS_NAME);
		}
		return businessName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationDerivation> getDerivationSupplier() {
		if (derivationSupplier == null) {
			derivationSupplier = new EObjectContainmentEList<AnnotationDerivation>(AnnotationDerivation.class, this, Mif2Package.STATIC_EXAMPLE__DERIVATION_SUPPLIER);
		}
		return derivationSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_EXAMPLE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITSKind getItsName() {
		return itsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsName(ITSKind newItsName) {
		ITSKind oldItsName = itsName;
		itsName = newItsName == null ? ITS_NAME_EDEFAULT : newItsName;
		boolean oldItsNameESet = itsNameESet;
		itsNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_EXAMPLE__ITS_NAME, oldItsName, itsName, !oldItsNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItsName() {
		ITSKind oldItsName = itsName;
		boolean oldItsNameESet = itsNameESet;
		itsName = ITS_NAME_EDEFAULT;
		itsNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.STATIC_EXAMPLE__ITS_NAME, oldItsName, ITS_NAME_EDEFAULT, oldItsNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItsName() {
		return itsNameESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_EXAMPLE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.STATIC_EXAMPLE__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.STATIC_EXAMPLE__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_EXAMPLE__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_EXAMPLE__REALM_NAMESPACE:
				return ((InternalEList<?>)getRealmNamespace()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_EXAMPLE__BUSINESS_NAME:
				return ((InternalEList<?>)getBusinessName()).basicRemove(otherEnd, msgs);
			case Mif2Package.STATIC_EXAMPLE__DERIVATION_SUPPLIER:
				return ((InternalEList<?>)getDerivationSupplier()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.STATIC_EXAMPLE__DATA:
				return getData();
			case Mif2Package.STATIC_EXAMPLE__CONTEXT:
				if (coreType) return getContext();
				return ((FeatureMap.Internal)getContext()).getWrapper();
			case Mif2Package.STATIC_EXAMPLE__REALM_NAMESPACE:
				return getRealmNamespace();
			case Mif2Package.STATIC_EXAMPLE__BUSINESS_NAME:
				return getBusinessName();
			case Mif2Package.STATIC_EXAMPLE__DERIVATION_SUPPLIER:
				return getDerivationSupplier();
			case Mif2Package.STATIC_EXAMPLE__ID:
				return getId();
			case Mif2Package.STATIC_EXAMPLE__ITS_NAME:
				return getItsName();
			case Mif2Package.STATIC_EXAMPLE__NAME:
				return getName();
			case Mif2Package.STATIC_EXAMPLE__SORT_KEY:
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
			case Mif2Package.STATIC_EXAMPLE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends FreeFormMarkupWithLanguage>)newValue);
				return;
			case Mif2Package.STATIC_EXAMPLE__CONTEXT:
				((FeatureMap.Internal)getContext()).set(newValue);
				return;
			case Mif2Package.STATIC_EXAMPLE__REALM_NAMESPACE:
				getRealmNamespace().clear();
				getRealmNamespace().addAll((Collection<? extends RealmElement>)newValue);
				return;
			case Mif2Package.STATIC_EXAMPLE__BUSINESS_NAME:
				getBusinessName().clear();
				getBusinessName().addAll((Collection<? extends BusinessName>)newValue);
				return;
			case Mif2Package.STATIC_EXAMPLE__DERIVATION_SUPPLIER:
				getDerivationSupplier().clear();
				getDerivationSupplier().addAll((Collection<? extends AnnotationDerivation>)newValue);
				return;
			case Mif2Package.STATIC_EXAMPLE__ID:
				setId((String)newValue);
				return;
			case Mif2Package.STATIC_EXAMPLE__ITS_NAME:
				setItsName((ITSKind)newValue);
				return;
			case Mif2Package.STATIC_EXAMPLE__NAME:
				setName((String)newValue);
				return;
			case Mif2Package.STATIC_EXAMPLE__SORT_KEY:
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
			case Mif2Package.STATIC_EXAMPLE__DATA:
				getData().clear();
				return;
			case Mif2Package.STATIC_EXAMPLE__CONTEXT:
				getContext().clear();
				return;
			case Mif2Package.STATIC_EXAMPLE__REALM_NAMESPACE:
				getRealmNamespace().clear();
				return;
			case Mif2Package.STATIC_EXAMPLE__BUSINESS_NAME:
				getBusinessName().clear();
				return;
			case Mif2Package.STATIC_EXAMPLE__DERIVATION_SUPPLIER:
				getDerivationSupplier().clear();
				return;
			case Mif2Package.STATIC_EXAMPLE__ID:
				setId(ID_EDEFAULT);
				return;
			case Mif2Package.STATIC_EXAMPLE__ITS_NAME:
				unsetItsName();
				return;
			case Mif2Package.STATIC_EXAMPLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.STATIC_EXAMPLE__SORT_KEY:
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
			case Mif2Package.STATIC_EXAMPLE__DATA:
				return data != null && !data.isEmpty();
			case Mif2Package.STATIC_EXAMPLE__CONTEXT:
				return context != null && !context.isEmpty();
			case Mif2Package.STATIC_EXAMPLE__REALM_NAMESPACE:
				return !getRealmNamespace().isEmpty();
			case Mif2Package.STATIC_EXAMPLE__BUSINESS_NAME:
				return businessName != null && !businessName.isEmpty();
			case Mif2Package.STATIC_EXAMPLE__DERIVATION_SUPPLIER:
				return derivationSupplier != null && !derivationSupplier.isEmpty();
			case Mif2Package.STATIC_EXAMPLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Mif2Package.STATIC_EXAMPLE__ITS_NAME:
				return isSetItsName();
			case Mif2Package.STATIC_EXAMPLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Mif2Package.STATIC_EXAMPLE__SORT_KEY:
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
		result.append(" (context: ");
		result.append(context);
		result.append(", id: ");
		result.append(id);
		result.append(", itsName: ");
		if (itsNameESet) result.append(itsName); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(')');
		return result.toString();
	}

} //StaticExampleImpl
