/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.CodingStrengthKind;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContextBindingImpl#getBindingPriority <em>Binding Priority</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContextBindingImpl#getBindingRealmName <em>Binding Realm Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContextBindingImpl#getCodingStrength <em>Coding Strength</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContextBindingImpl#getConceptDomain <em>Concept Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContextBindingImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContextBindingImpl#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContextBindingImpl#getIgnoredValueSet <em>Ignored Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContextBindingImpl#getMinimumValueSet <em>Minimum Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContextBindingImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContextBindingImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContextBindingImpl#getVersionDate <em>Version Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContextBindingImpl#getVersionTime <em>Version Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextBindingImpl extends ModelElementImpl implements ContextBinding {
	/**
	 * The default value of the '{@link #getBindingPriority() <em>Binding Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BINDING_PRIORITY_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getBindingPriority() <em>Binding Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bindingPriority = BINDING_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Binding Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bindingPriorityESet;

	/**
	 * The default value of the '{@link #getBindingRealmName() <em>Binding Realm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingRealmName()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_REALM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindingRealmName() <em>Binding Realm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingRealmName()
	 * @generated
	 * @ordered
	 */
	protected String bindingRealmName = BINDING_REALM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodingStrength() <em>Coding Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodingStrength()
	 * @generated
	 * @ordered
	 */
	protected static final CodingStrengthKind CODING_STRENGTH_EDEFAULT = CodingStrengthKind.CNE;

	/**
	 * The cached value of the '{@link #getCodingStrength() <em>Coding Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodingStrength()
	 * @generated
	 * @ordered
	 */
	protected CodingStrengthKind codingStrength = CODING_STRENGTH_EDEFAULT;

	/**
	 * This is true if the Coding Strength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codingStrengthESet;

	/**
	 * The default value of the '{@link #getConceptDomain() <em>Concept Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCEPT_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConceptDomain() <em>Concept Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptDomain()
	 * @generated
	 * @ordered
	 */
	protected String conceptDomain = CONCEPT_DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar effectiveDate = EFFECTIVE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar expiryDate = EXPIRY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoredValueSet() <em>Ignored Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoredValueSet()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORED_VALUE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoredValueSet() <em>Ignored Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoredValueSet()
	 * @generated
	 * @ordered
	 */
	protected String ignoredValueSet = IGNORED_VALUE_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumValueSet() <em>Minimum Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValueSet()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_VALUE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumValueSet() <em>Minimum Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValueSet()
	 * @generated
	 * @ordered
	 */
	protected String minimumValueSet = MINIMUM_VALUE_SET_EDEFAULT;

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
	 * The default value of the '{@link #getValueSet() <em>Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected String valueSet = VALUE_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionDate() <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VERSION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionDate() <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar versionDate = VERSION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionTime() <em>Version Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VERSION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionTime() <em>Version Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar versionTime = VERSION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONTEXT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBindingPriority() {
		return bindingPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingPriority(BigInteger newBindingPriority) {
		BigInteger oldBindingPriority = bindingPriority;
		bindingPriority = newBindingPriority;
		boolean oldBindingPriorityESet = bindingPriorityESet;
		bindingPriorityESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONTEXT_BINDING__BINDING_PRIORITY, oldBindingPriority,
				bindingPriority, !oldBindingPriorityESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBindingPriority() {
		BigInteger oldBindingPriority = bindingPriority;
		boolean oldBindingPriorityESet = bindingPriorityESet;
		bindingPriority = BINDING_PRIORITY_EDEFAULT;
		bindingPriorityESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.CONTEXT_BINDING__BINDING_PRIORITY, oldBindingPriority,
				BINDING_PRIORITY_EDEFAULT, oldBindingPriorityESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBindingPriority() {
		return bindingPriorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBindingRealmName() {
		return bindingRealmName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingRealmName(String newBindingRealmName) {
		String oldBindingRealmName = bindingRealmName;
		bindingRealmName = newBindingRealmName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONTEXT_BINDING__BINDING_REALM_NAME, oldBindingRealmName,
				bindingRealmName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingStrengthKind getCodingStrength() {
		return codingStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodingStrength(CodingStrengthKind newCodingStrength) {
		CodingStrengthKind oldCodingStrength = codingStrength;
		codingStrength = newCodingStrength == null
				? CODING_STRENGTH_EDEFAULT
				: newCodingStrength;
		boolean oldCodingStrengthESet = codingStrengthESet;
		codingStrengthESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONTEXT_BINDING__CODING_STRENGTH, oldCodingStrength,
				codingStrength, !oldCodingStrengthESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCodingStrength() {
		CodingStrengthKind oldCodingStrength = codingStrength;
		boolean oldCodingStrengthESet = codingStrengthESet;
		codingStrength = CODING_STRENGTH_EDEFAULT;
		codingStrengthESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.CONTEXT_BINDING__CODING_STRENGTH, oldCodingStrength,
				CODING_STRENGTH_EDEFAULT, oldCodingStrengthESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCodingStrength() {
		return codingStrengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConceptDomain() {
		return conceptDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptDomain(String newConceptDomain) {
		String oldConceptDomain = conceptDomain;
		conceptDomain = newConceptDomain;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONTEXT_BINDING__CONCEPT_DOMAIN, oldConceptDomain, conceptDomain));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDate(XMLGregorianCalendar newEffectiveDate) {
		XMLGregorianCalendar oldEffectiveDate = effectiveDate;
		effectiveDate = newEffectiveDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONTEXT_BINDING__EFFECTIVE_DATE, oldEffectiveDate, effectiveDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getExpiryDate() {
		return expiryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryDate(XMLGregorianCalendar newExpiryDate) {
		XMLGregorianCalendar oldExpiryDate = expiryDate;
		expiryDate = newExpiryDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONTEXT_BINDING__EXPIRY_DATE, oldExpiryDate, expiryDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIgnoredValueSet() {
		return ignoredValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoredValueSet(String newIgnoredValueSet) {
		String oldIgnoredValueSet = ignoredValueSet;
		ignoredValueSet = newIgnoredValueSet;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONTEXT_BINDING__IGNORED_VALUE_SET, oldIgnoredValueSet,
				ignoredValueSet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimumValueSet() {
		return minimumValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumValueSet(String newMinimumValueSet) {
		String oldMinimumValueSet = minimumValueSet;
		minimumValueSet = newMinimumValueSet;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONTEXT_BINDING__MINIMUM_VALUE_SET, oldMinimumValueSet,
				minimumValueSet));
		}
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONTEXT_BINDING__SORT_KEY, oldSortKey, sortKey));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSet(String newValueSet) {
		String oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONTEXT_BINDING__VALUE_SET, oldValueSet, valueSet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getVersionDate() {
		return versionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionDate(XMLGregorianCalendar newVersionDate) {
		XMLGregorianCalendar oldVersionDate = versionDate;
		versionDate = newVersionDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONTEXT_BINDING__VERSION_DATE, oldVersionDate, versionDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getVersionTime() {
		return versionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionTime(XMLGregorianCalendar newVersionTime) {
		XMLGregorianCalendar oldVersionTime = versionTime;
		versionTime = newVersionTime;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONTEXT_BINDING__VERSION_TIME, oldVersionTime, versionTime));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.CONTEXT_BINDING__BINDING_PRIORITY:
				return getBindingPriority();
			case Mif2Package.CONTEXT_BINDING__BINDING_REALM_NAME:
				return getBindingRealmName();
			case Mif2Package.CONTEXT_BINDING__CODING_STRENGTH:
				return getCodingStrength();
			case Mif2Package.CONTEXT_BINDING__CONCEPT_DOMAIN:
				return getConceptDomain();
			case Mif2Package.CONTEXT_BINDING__EFFECTIVE_DATE:
				return getEffectiveDate();
			case Mif2Package.CONTEXT_BINDING__EXPIRY_DATE:
				return getExpiryDate();
			case Mif2Package.CONTEXT_BINDING__IGNORED_VALUE_SET:
				return getIgnoredValueSet();
			case Mif2Package.CONTEXT_BINDING__MINIMUM_VALUE_SET:
				return getMinimumValueSet();
			case Mif2Package.CONTEXT_BINDING__SORT_KEY:
				return getSortKey();
			case Mif2Package.CONTEXT_BINDING__VALUE_SET:
				return getValueSet();
			case Mif2Package.CONTEXT_BINDING__VERSION_DATE:
				return getVersionDate();
			case Mif2Package.CONTEXT_BINDING__VERSION_TIME:
				return getVersionTime();
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
			case Mif2Package.CONTEXT_BINDING__BINDING_PRIORITY:
				setBindingPriority((BigInteger) newValue);
				return;
			case Mif2Package.CONTEXT_BINDING__BINDING_REALM_NAME:
				setBindingRealmName((String) newValue);
				return;
			case Mif2Package.CONTEXT_BINDING__CODING_STRENGTH:
				setCodingStrength((CodingStrengthKind) newValue);
				return;
			case Mif2Package.CONTEXT_BINDING__CONCEPT_DOMAIN:
				setConceptDomain((String) newValue);
				return;
			case Mif2Package.CONTEXT_BINDING__EFFECTIVE_DATE:
				setEffectiveDate((XMLGregorianCalendar) newValue);
				return;
			case Mif2Package.CONTEXT_BINDING__EXPIRY_DATE:
				setExpiryDate((XMLGregorianCalendar) newValue);
				return;
			case Mif2Package.CONTEXT_BINDING__IGNORED_VALUE_SET:
				setIgnoredValueSet((String) newValue);
				return;
			case Mif2Package.CONTEXT_BINDING__MINIMUM_VALUE_SET:
				setMinimumValueSet((String) newValue);
				return;
			case Mif2Package.CONTEXT_BINDING__SORT_KEY:
				setSortKey((String) newValue);
				return;
			case Mif2Package.CONTEXT_BINDING__VALUE_SET:
				setValueSet((String) newValue);
				return;
			case Mif2Package.CONTEXT_BINDING__VERSION_DATE:
				setVersionDate((XMLGregorianCalendar) newValue);
				return;
			case Mif2Package.CONTEXT_BINDING__VERSION_TIME:
				setVersionTime((XMLGregorianCalendar) newValue);
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
			case Mif2Package.CONTEXT_BINDING__BINDING_PRIORITY:
				unsetBindingPriority();
				return;
			case Mif2Package.CONTEXT_BINDING__BINDING_REALM_NAME:
				setBindingRealmName(BINDING_REALM_NAME_EDEFAULT);
				return;
			case Mif2Package.CONTEXT_BINDING__CODING_STRENGTH:
				unsetCodingStrength();
				return;
			case Mif2Package.CONTEXT_BINDING__CONCEPT_DOMAIN:
				setConceptDomain(CONCEPT_DOMAIN_EDEFAULT);
				return;
			case Mif2Package.CONTEXT_BINDING__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
				return;
			case Mif2Package.CONTEXT_BINDING__EXPIRY_DATE:
				setExpiryDate(EXPIRY_DATE_EDEFAULT);
				return;
			case Mif2Package.CONTEXT_BINDING__IGNORED_VALUE_SET:
				setIgnoredValueSet(IGNORED_VALUE_SET_EDEFAULT);
				return;
			case Mif2Package.CONTEXT_BINDING__MINIMUM_VALUE_SET:
				setMinimumValueSet(MINIMUM_VALUE_SET_EDEFAULT);
				return;
			case Mif2Package.CONTEXT_BINDING__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case Mif2Package.CONTEXT_BINDING__VALUE_SET:
				setValueSet(VALUE_SET_EDEFAULT);
				return;
			case Mif2Package.CONTEXT_BINDING__VERSION_DATE:
				setVersionDate(VERSION_DATE_EDEFAULT);
				return;
			case Mif2Package.CONTEXT_BINDING__VERSION_TIME:
				setVersionTime(VERSION_TIME_EDEFAULT);
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
			case Mif2Package.CONTEXT_BINDING__BINDING_PRIORITY:
				return isSetBindingPriority();
			case Mif2Package.CONTEXT_BINDING__BINDING_REALM_NAME:
				return BINDING_REALM_NAME_EDEFAULT == null
						? bindingRealmName != null
						: !BINDING_REALM_NAME_EDEFAULT.equals(bindingRealmName);
			case Mif2Package.CONTEXT_BINDING__CODING_STRENGTH:
				return isSetCodingStrength();
			case Mif2Package.CONTEXT_BINDING__CONCEPT_DOMAIN:
				return CONCEPT_DOMAIN_EDEFAULT == null
						? conceptDomain != null
						: !CONCEPT_DOMAIN_EDEFAULT.equals(conceptDomain);
			case Mif2Package.CONTEXT_BINDING__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null
						? effectiveDate != null
						: !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
			case Mif2Package.CONTEXT_BINDING__EXPIRY_DATE:
				return EXPIRY_DATE_EDEFAULT == null
						? expiryDate != null
						: !EXPIRY_DATE_EDEFAULT.equals(expiryDate);
			case Mif2Package.CONTEXT_BINDING__IGNORED_VALUE_SET:
				return IGNORED_VALUE_SET_EDEFAULT == null
						? ignoredValueSet != null
						: !IGNORED_VALUE_SET_EDEFAULT.equals(ignoredValueSet);
			case Mif2Package.CONTEXT_BINDING__MINIMUM_VALUE_SET:
				return MINIMUM_VALUE_SET_EDEFAULT == null
						? minimumValueSet != null
						: !MINIMUM_VALUE_SET_EDEFAULT.equals(minimumValueSet);
			case Mif2Package.CONTEXT_BINDING__SORT_KEY:
				return SORT_KEY_EDEFAULT == null
						? sortKey != null
						: !SORT_KEY_EDEFAULT.equals(sortKey);
			case Mif2Package.CONTEXT_BINDING__VALUE_SET:
				return VALUE_SET_EDEFAULT == null
						? valueSet != null
						: !VALUE_SET_EDEFAULT.equals(valueSet);
			case Mif2Package.CONTEXT_BINDING__VERSION_DATE:
				return VERSION_DATE_EDEFAULT == null
						? versionDate != null
						: !VERSION_DATE_EDEFAULT.equals(versionDate);
			case Mif2Package.CONTEXT_BINDING__VERSION_TIME:
				return VERSION_TIME_EDEFAULT == null
						? versionTime != null
						: !VERSION_TIME_EDEFAULT.equals(versionTime);
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bindingPriority: ");
		if (bindingPriorityESet) {
			result.append(bindingPriority);
		} else {
			result.append("<unset>");
		}
		result.append(", bindingRealmName: ");
		result.append(bindingRealmName);
		result.append(", codingStrength: ");
		if (codingStrengthESet) {
			result.append(codingStrength);
		} else {
			result.append("<unset>");
		}
		result.append(", conceptDomain: ");
		result.append(conceptDomain);
		result.append(", effectiveDate: ");
		result.append(effectiveDate);
		result.append(", expiryDate: ");
		result.append(expiryDate);
		result.append(", ignoredValueSet: ");
		result.append(ignoredValueSet);
		result.append(", minimumValueSet: ");
		result.append(minimumValueSet);
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(", valueSet: ");
		result.append(valueSet);
		result.append(", versionDate: ");
		result.append(versionDate);
		result.append(", versionTime: ");
		result.append(versionTime);
		result.append(')');
		return result.toString();
	}

} // ContextBindingImpl
