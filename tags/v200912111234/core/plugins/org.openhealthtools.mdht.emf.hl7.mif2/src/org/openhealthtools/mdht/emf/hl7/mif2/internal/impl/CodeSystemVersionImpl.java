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

import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion;
import org.openhealthtools.mdht.emf.hl7.mif2.Concept;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty;
import org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship;
import org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionImpl#getSupportedConceptRelationship <em>Supported Concept Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionImpl#getSupportedConceptProperty <em>Supported Concept Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionImpl#getSupportedCodeProperty <em>Supported Code Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionImpl#isCompleteCodesIndicator <em>Complete Codes Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeSystemVersionImpl extends CodeSystemVersionBaseImpl implements CodeSystemVersion {
	/**
	 * The cached value of the '{@link #getSupportedConceptRelationship() <em>Supported Concept Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedConceptRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedConceptRelationship> supportedConceptRelationship;

	/**
	 * The cached value of the '{@link #getSupportedConceptProperty() <em>Supported Concept Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedConceptProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedConceptProperty> supportedConceptProperty;

	/**
	 * The cached value of the '{@link #getSupportedCodeProperty() <em>Supported Code Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCodeProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SupportedProperty> supportedCodeProperty;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> concept;

	/**
	 * The default value of the '{@link #isCompleteCodesIndicator() <em>Complete Codes Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompleteCodesIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPLETE_CODES_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCompleteCodesIndicator() <em>Complete Codes Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompleteCodesIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean completeCodesIndicator = COMPLETE_CODES_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Complete Codes Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean completeCodesIndicatorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSystemVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CODE_SYSTEM_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportedConceptRelationship> getSupportedConceptRelationship() {
		if (supportedConceptRelationship == null) {
			supportedConceptRelationship = new EObjectContainmentEList<SupportedConceptRelationship>(SupportedConceptRelationship.class, this, Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CONCEPT_RELATIONSHIP);
		}
		return supportedConceptRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportedConceptProperty> getSupportedConceptProperty() {
		if (supportedConceptProperty == null) {
			supportedConceptProperty = new EObjectContainmentEList<SupportedConceptProperty>(SupportedConceptProperty.class, this, Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CONCEPT_PROPERTY);
		}
		return supportedConceptProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupportedProperty> getSupportedCodeProperty() {
		if (supportedCodeProperty == null) {
			supportedCodeProperty = new EObjectContainmentEList<SupportedProperty>(SupportedProperty.class, this, Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CODE_PROPERTY);
		}
		return supportedCodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<Concept>(Concept.class, this, Mif2Package.CODE_SYSTEM_VERSION__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompleteCodesIndicator() {
		return completeCodesIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteCodesIndicator(boolean newCompleteCodesIndicator) {
		boolean oldCompleteCodesIndicator = completeCodesIndicator;
		completeCodesIndicator = newCompleteCodesIndicator;
		boolean oldCompleteCodesIndicatorESet = completeCodesIndicatorESet;
		completeCodesIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SYSTEM_VERSION__COMPLETE_CODES_INDICATOR, oldCompleteCodesIndicator, completeCodesIndicator, !oldCompleteCodesIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompleteCodesIndicator() {
		boolean oldCompleteCodesIndicator = completeCodesIndicator;
		boolean oldCompleteCodesIndicatorESet = completeCodesIndicatorESet;
		completeCodesIndicator = COMPLETE_CODES_INDICATOR_EDEFAULT;
		completeCodesIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CODE_SYSTEM_VERSION__COMPLETE_CODES_INDICATOR, oldCompleteCodesIndicator, COMPLETE_CODES_INDICATOR_EDEFAULT, oldCompleteCodesIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompleteCodesIndicator() {
		return completeCodesIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CONCEPT_RELATIONSHIP:
				return ((InternalEList<?>)getSupportedConceptRelationship()).basicRemove(otherEnd, msgs);
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CONCEPT_PROPERTY:
				return ((InternalEList<?>)getSupportedConceptProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CODE_PROPERTY:
				return ((InternalEList<?>)getSupportedCodeProperty()).basicRemove(otherEnd, msgs);
			case Mif2Package.CODE_SYSTEM_VERSION__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CONCEPT_RELATIONSHIP:
				return getSupportedConceptRelationship();
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CONCEPT_PROPERTY:
				return getSupportedConceptProperty();
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CODE_PROPERTY:
				return getSupportedCodeProperty();
			case Mif2Package.CODE_SYSTEM_VERSION__CONCEPT:
				return getConcept();
			case Mif2Package.CODE_SYSTEM_VERSION__COMPLETE_CODES_INDICATOR:
				return isCompleteCodesIndicator() ? Boolean.TRUE : Boolean.FALSE;
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
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CONCEPT_RELATIONSHIP:
				getSupportedConceptRelationship().clear();
				getSupportedConceptRelationship().addAll((Collection<? extends SupportedConceptRelationship>)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CONCEPT_PROPERTY:
				getSupportedConceptProperty().clear();
				getSupportedConceptProperty().addAll((Collection<? extends SupportedConceptProperty>)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CODE_PROPERTY:
				getSupportedCodeProperty().clear();
				getSupportedCodeProperty().addAll((Collection<? extends SupportedProperty>)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends Concept>)newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION__COMPLETE_CODES_INDICATOR:
				setCompleteCodesIndicator(((Boolean)newValue).booleanValue());
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
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CONCEPT_RELATIONSHIP:
				getSupportedConceptRelationship().clear();
				return;
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CONCEPT_PROPERTY:
				getSupportedConceptProperty().clear();
				return;
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CODE_PROPERTY:
				getSupportedCodeProperty().clear();
				return;
			case Mif2Package.CODE_SYSTEM_VERSION__CONCEPT:
				getConcept().clear();
				return;
			case Mif2Package.CODE_SYSTEM_VERSION__COMPLETE_CODES_INDICATOR:
				unsetCompleteCodesIndicator();
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
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CONCEPT_RELATIONSHIP:
				return supportedConceptRelationship != null && !supportedConceptRelationship.isEmpty();
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CONCEPT_PROPERTY:
				return supportedConceptProperty != null && !supportedConceptProperty.isEmpty();
			case Mif2Package.CODE_SYSTEM_VERSION__SUPPORTED_CODE_PROPERTY:
				return supportedCodeProperty != null && !supportedCodeProperty.isEmpty();
			case Mif2Package.CODE_SYSTEM_VERSION__CONCEPT:
				return concept != null && !concept.isEmpty();
			case Mif2Package.CODE_SYSTEM_VERSION__COMPLETE_CODES_INDICATOR:
				return isSetCompleteCodesIndicator();
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
		result.append(" (completeCodesIndicator: ");
		if (completeCodesIndicatorESet) result.append(completeCodesIndicator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CodeSystemVersionImpl
