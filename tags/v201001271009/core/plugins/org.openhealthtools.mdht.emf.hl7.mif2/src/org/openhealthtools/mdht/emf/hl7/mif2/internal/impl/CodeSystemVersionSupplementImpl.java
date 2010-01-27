/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship;
import org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Version Supplement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionSupplementImpl#getSupplementalSupportedConceptRelationship <em>Supplemental Supported Concept Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionSupplementImpl#getSupplementalSupportedConceptProperty <em>Supplemental Supported Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionSupplementImpl#getSupplementalSupportedCodeProperty <em>Supplemental Supported Code Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionSupplementImpl#getConceptSupplement <em>Concept Supplement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionSupplementImpl#getAppliesToReleaseDate <em>Applies To Release Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionSupplementImpl#getSortKey <em>Sort Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeSystemVersionSupplementImpl extends CodeSystemVersionBaseImpl implements CodeSystemVersionSupplement {
	/**
	 * The cached value of the '{@link #getSupplementalSupportedConceptRelationship() <em>Supplemental Supported Concept Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalSupportedConceptRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedConceptRelationship> supplementalSupportedConceptRelationship;

	/**
	 * The cached value of the '{@link #getSupplementalSupportedConceptProperty() <em>Supplemental Supported Concept Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalSupportedConceptProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedProperty> supplementalSupportedConceptProperty;

	/**
	 * The cached value of the '{@link #getSupplementalSupportedCodeProperty() <em>Supplemental Supported Code Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalSupportedCodeProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedProperty> supplementalSupportedCodeProperty;

	/**
	 * The cached value of the '{@link #getConceptSupplement() <em>Concept Supplement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptSupplement()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptSupplement> conceptSupplement;

	/**
	 * The default value of the '{@link #getAppliesToReleaseDate() <em>Applies To Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar APPLIES_TO_RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppliesToReleaseDate() <em>Applies To Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar appliesToReleaseDate = APPLIES_TO_RELEASE_DATE_EDEFAULT;

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
	protected CodeSystemVersionSupplementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CODE_SYSTEM_VERSION_SUPPLEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportedConceptRelationship> getSupplementalSupportedConceptRelationship() {
		if (supplementalSupportedConceptRelationship == null) {
			supplementalSupportedConceptRelationship = new EObjectContainmentEList<SupportedConceptRelationship>(SupportedConceptRelationship.class, this, Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CONCEPT_RELATIONSHIP);
		}
		return supplementalSupportedConceptRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportedProperty> getSupplementalSupportedConceptProperty() {
		if (supplementalSupportedConceptProperty == null) {
			supplementalSupportedConceptProperty = new EObjectContainmentEList<SupportedProperty>(SupportedProperty.class, this, Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CONCEPT_PROPERTY);
		}
		return supplementalSupportedConceptProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportedProperty> getSupplementalSupportedCodeProperty() {
		if (supplementalSupportedCodeProperty == null) {
			supplementalSupportedCodeProperty = new EObjectContainmentEList<SupportedProperty>(SupportedProperty.class, this, Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CODE_PROPERTY);
		}
		return supplementalSupportedCodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptSupplement> getConceptSupplement() {
		if (conceptSupplement == null) {
			conceptSupplement = new EObjectContainmentEList<ConceptSupplement>(ConceptSupplement.class, this, Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__CONCEPT_SUPPLEMENT);
		}
		return conceptSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getAppliesToReleaseDate() {
		return appliesToReleaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesToReleaseDate(XMLGregorianCalendar newAppliesToReleaseDate) {
		XMLGregorianCalendar oldAppliesToReleaseDate = appliesToReleaseDate;
		appliesToReleaseDate = newAppliesToReleaseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__APPLIES_TO_RELEASE_DATE, oldAppliesToReleaseDate, appliesToReleaseDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SORT_KEY, oldSortKey, sortKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CONCEPT_RELATIONSHIP:
				return ((InternalEList<?>)getSupplementalSupportedConceptRelationship()).basicRemove(otherEnd, msgs);
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CONCEPT_PROPERTY:
				return ((InternalEList<?>)getSupplementalSupportedConceptProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CODE_PROPERTY:
				return ((InternalEList<?>)getSupplementalSupportedCodeProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__CONCEPT_SUPPLEMENT:
				return ((InternalEList<?>)getConceptSupplement()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CONCEPT_RELATIONSHIP:
				return getSupplementalSupportedConceptRelationship();
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CONCEPT_PROPERTY:
				return getSupplementalSupportedConceptProperty();
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CODE_PROPERTY:
				return getSupplementalSupportedCodeProperty();
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__CONCEPT_SUPPLEMENT:
				return getConceptSupplement();
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__APPLIES_TO_RELEASE_DATE:
				return getAppliesToReleaseDate();
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SORT_KEY:
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
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CONCEPT_RELATIONSHIP:
				getSupplementalSupportedConceptRelationship().clear();
				getSupplementalSupportedConceptRelationship().addAll((Collection<? extends SupportedConceptRelationship>)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CONCEPT_PROPERTY:
				getSupplementalSupportedConceptProperty().clear();
				getSupplementalSupportedConceptProperty().addAll((Collection<? extends SupportedProperty>)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CODE_PROPERTY:
				getSupplementalSupportedCodeProperty().clear();
				getSupplementalSupportedCodeProperty().addAll((Collection<? extends SupportedProperty>)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__CONCEPT_SUPPLEMENT:
				getConceptSupplement().clear();
				getConceptSupplement().addAll((Collection<? extends ConceptSupplement>)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__APPLIES_TO_RELEASE_DATE:
				setAppliesToReleaseDate((XMLGregorianCalendar)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SORT_KEY:
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
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CONCEPT_RELATIONSHIP:
				getSupplementalSupportedConceptRelationship().clear();
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CONCEPT_PROPERTY:
				getSupplementalSupportedConceptProperty().clear();
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CODE_PROPERTY:
				getSupplementalSupportedCodeProperty().clear();
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__CONCEPT_SUPPLEMENT:
				getConceptSupplement().clear();
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__APPLIES_TO_RELEASE_DATE:
				setAppliesToReleaseDate(APPLIES_TO_RELEASE_DATE_EDEFAULT);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SORT_KEY:
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
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CONCEPT_RELATIONSHIP:
				return supplementalSupportedConceptRelationship != null && !supplementalSupportedConceptRelationship.isEmpty();
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CONCEPT_PROPERTY:
				return supplementalSupportedConceptProperty != null && !supplementalSupportedConceptProperty.isEmpty();
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SUPPLEMENTAL_SUPPORTED_CODE_PROPERTY:
				return supplementalSupportedCodeProperty != null && !supplementalSupportedCodeProperty.isEmpty();
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__CONCEPT_SUPPLEMENT:
				return conceptSupplement != null && !conceptSupplement.isEmpty();
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__APPLIES_TO_RELEASE_DATE:
				return APPLIES_TO_RELEASE_DATE_EDEFAULT == null ? appliesToReleaseDate != null : !APPLIES_TO_RELEASE_DATE_EDEFAULT.equals(appliesToReleaseDate);
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT__SORT_KEY:
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
		result.append(" (appliesToReleaseDate: ");
		result.append(appliesToReleaseDate);
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(')');
		return result.toString();
	}

} //CodeSystemVersionSupplementImpl
