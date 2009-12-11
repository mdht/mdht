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

import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularySpecificationImpl#getConceptDomain <em>Concept Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularySpecificationImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularySpecificationImpl#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocabularySpecificationImpl extends DependencyImpl implements VocabularySpecification {
	/**
	 * The cached value of the '{@link #getConceptDomain() <em>Concept Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptDomain()
	 * @generated
	 * @ordered
	 */
	protected ConceptDomainRef conceptDomain;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected VocabularyValueSetBinding valueSet;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected VocabularyCodeRef code;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularySpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.VOCABULARY_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomainRef getConceptDomain() {
		return conceptDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConceptDomain(ConceptDomainRef newConceptDomain, NotificationChain msgs) {
		ConceptDomainRef oldConceptDomain = conceptDomain;
		conceptDomain = newConceptDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.VOCABULARY_SPECIFICATION__CONCEPT_DOMAIN, oldConceptDomain, newConceptDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptDomain(ConceptDomainRef newConceptDomain) {
		if (newConceptDomain != conceptDomain) {
			NotificationChain msgs = null;
			if (conceptDomain != null)
				msgs = ((InternalEObject)conceptDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.VOCABULARY_SPECIFICATION__CONCEPT_DOMAIN, null, msgs);
			if (newConceptDomain != null)
				msgs = ((InternalEObject)newConceptDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.VOCABULARY_SPECIFICATION__CONCEPT_DOMAIN, null, msgs);
			msgs = basicSetConceptDomain(newConceptDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.VOCABULARY_SPECIFICATION__CONCEPT_DOMAIN, newConceptDomain, newConceptDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyValueSetBinding getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(VocabularyValueSetBinding newValueSet, NotificationChain msgs) {
		VocabularyValueSetBinding oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.VOCABULARY_SPECIFICATION__VALUE_SET, oldValueSet, newValueSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSet(VocabularyValueSetBinding newValueSet) {
		if (newValueSet != valueSet) {
			NotificationChain msgs = null;
			if (valueSet != null)
				msgs = ((InternalEObject)valueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.VOCABULARY_SPECIFICATION__VALUE_SET, null, msgs);
			if (newValueSet != null)
				msgs = ((InternalEObject)newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.VOCABULARY_SPECIFICATION__VALUE_SET, null, msgs);
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.VOCABULARY_SPECIFICATION__VALUE_SET, newValueSet, newValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyCodeRef getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(VocabularyCodeRef newCode, NotificationChain msgs) {
		VocabularyCodeRef oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.VOCABULARY_SPECIFICATION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(VocabularyCodeRef newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.VOCABULARY_SPECIFICATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.VOCABULARY_SPECIFICATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.VOCABULARY_SPECIFICATION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.VOCABULARY_SPECIFICATION__CONCEPT_DOMAIN:
				return basicSetConceptDomain(null, msgs);
			case Mif2Package.VOCABULARY_SPECIFICATION__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case Mif2Package.VOCABULARY_SPECIFICATION__CODE:
				return basicSetCode(null, msgs);
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
			case Mif2Package.VOCABULARY_SPECIFICATION__CONCEPT_DOMAIN:
				return getConceptDomain();
			case Mif2Package.VOCABULARY_SPECIFICATION__VALUE_SET:
				return getValueSet();
			case Mif2Package.VOCABULARY_SPECIFICATION__CODE:
				return getCode();
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
			case Mif2Package.VOCABULARY_SPECIFICATION__CONCEPT_DOMAIN:
				setConceptDomain((ConceptDomainRef)newValue);
				return;
			case Mif2Package.VOCABULARY_SPECIFICATION__VALUE_SET:
				setValueSet((VocabularyValueSetBinding)newValue);
				return;
			case Mif2Package.VOCABULARY_SPECIFICATION__CODE:
				setCode((VocabularyCodeRef)newValue);
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
			case Mif2Package.VOCABULARY_SPECIFICATION__CONCEPT_DOMAIN:
				setConceptDomain((ConceptDomainRef)null);
				return;
			case Mif2Package.VOCABULARY_SPECIFICATION__VALUE_SET:
				setValueSet((VocabularyValueSetBinding)null);
				return;
			case Mif2Package.VOCABULARY_SPECIFICATION__CODE:
				setCode((VocabularyCodeRef)null);
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
			case Mif2Package.VOCABULARY_SPECIFICATION__CONCEPT_DOMAIN:
				return conceptDomain != null;
			case Mif2Package.VOCABULARY_SPECIFICATION__VALUE_SET:
				return valueSet != null;
			case Mif2Package.VOCABULARY_SPECIFICATION__CODE:
				return code != null;
		}
		return super.eIsSet(featureID);
	}

} //VocabularySpecificationImpl
