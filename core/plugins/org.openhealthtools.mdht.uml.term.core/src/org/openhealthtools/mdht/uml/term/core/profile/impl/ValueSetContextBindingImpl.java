/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.term.core.profile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.uml.term.core.profile.TermPackage;
import org.openhealthtools.mdht.uml.term.core.profile.ConceptDomain;
import org.openhealthtools.mdht.uml.term.core.profile.UsageContext;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetContextBinding;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Context Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetContextBindingImpl#getEffectiveDate <em>Effective Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetContextBindingImpl#getConceptDomain <em>Concept Domain</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetContextBindingImpl#getValueSet <em>Value Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetContextBindingImpl#getUsageContext <em>Usage Context</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.term.core.profile.impl.ValueSetContextBindingImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ValueSetContextBindingImpl extends EObjectImpl implements ValueSetContextBinding {
	/**
	 * The default value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected String effectiveDate = EFFECTIVE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConceptDomain() <em>Concept Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getConceptDomain()
	 * @generated
	 * @ordered
	 */
	protected ConceptDomain conceptDomain;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected ValueSetVersion valueSet;

	/**
	 * The cached value of the '{@link #getUsageContext() <em>Usage Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getUsageContext()
	 * @generated
	 * @ordered
	 */
	protected UsageContext usageContext;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetContextBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermPackage.Literals.VALUE_SET_CONTEXT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEffectiveDate(String newEffectiveDate) {
		String oldEffectiveDate = effectiveDate;
		effectiveDate = newEffectiveDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.VALUE_SET_CONTEXT_BINDING__EFFECTIVE_DATE, oldEffectiveDate,
				effectiveDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConceptDomain getConceptDomain() {
		if (conceptDomain != null && conceptDomain.eIsProxy()) {
			InternalEObject oldConceptDomain = (InternalEObject) conceptDomain;
			conceptDomain = (ConceptDomain) eResolveProxy(oldConceptDomain);
			if (conceptDomain != oldConceptDomain) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, TermPackage.VALUE_SET_CONTEXT_BINDING__CONCEPT_DOMAIN,
						oldConceptDomain, conceptDomain));
				}
			}
		}
		return conceptDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConceptDomain basicGetConceptDomain() {
		return conceptDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConceptDomain(ConceptDomain newConceptDomain) {
		ConceptDomain oldConceptDomain = conceptDomain;
		conceptDomain = newConceptDomain;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.VALUE_SET_CONTEXT_BINDING__CONCEPT_DOMAIN, oldConceptDomain,
				conceptDomain));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetVersion getValueSet() {
		if (valueSet != null && valueSet.eIsProxy()) {
			InternalEObject oldValueSet = (InternalEObject) valueSet;
			valueSet = (ValueSetVersion) eResolveProxy(oldValueSet);
			if (valueSet != oldValueSet) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, TermPackage.VALUE_SET_CONTEXT_BINDING__VALUE_SET, oldValueSet,
						valueSet));
				}
			}
		}
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetVersion basicGetValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueSet(ValueSetVersion newValueSet) {
		ValueSetVersion oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.VALUE_SET_CONTEXT_BINDING__VALUE_SET, oldValueSet, valueSet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UsageContext getUsageContext() {
		if (usageContext != null && usageContext.eIsProxy()) {
			InternalEObject oldUsageContext = (InternalEObject) usageContext;
			usageContext = (UsageContext) eResolveProxy(oldUsageContext);
			if (usageContext != oldUsageContext) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, TermPackage.VALUE_SET_CONTEXT_BINDING__USAGE_CONTEXT,
						oldUsageContext, usageContext));
				}
			}
		}
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UsageContext basicGetUsageContext() {
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUsageContext(UsageContext newUsageContext) {
		UsageContext oldUsageContext = usageContext;
		usageContext = newUsageContext;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.VALUE_SET_CONTEXT_BINDING__USAGE_CONTEXT, oldUsageContext,
				usageContext));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject) base_Class;
			base_Class = (org.eclipse.uml2.uml.Class) eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, TermPackage.VALUE_SET_CONTEXT_BINDING__BASE_CLASS, oldBase_Class,
						base_Class));
				}
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, TermPackage.VALUE_SET_CONTEXT_BINDING__BASE_CLASS, oldBase_Class, base_Class));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TermPackage.VALUE_SET_CONTEXT_BINDING__EFFECTIVE_DATE:
				return getEffectiveDate();
			case TermPackage.VALUE_SET_CONTEXT_BINDING__CONCEPT_DOMAIN:
				if (resolve) {
					return getConceptDomain();
				}
				return basicGetConceptDomain();
			case TermPackage.VALUE_SET_CONTEXT_BINDING__VALUE_SET:
				if (resolve) {
					return getValueSet();
				}
				return basicGetValueSet();
			case TermPackage.VALUE_SET_CONTEXT_BINDING__USAGE_CONTEXT:
				if (resolve) {
					return getUsageContext();
				}
				return basicGetUsageContext();
			case TermPackage.VALUE_SET_CONTEXT_BINDING__BASE_CLASS:
				if (resolve) {
					return getBase_Class();
				}
				return basicGetBase_Class();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TermPackage.VALUE_SET_CONTEXT_BINDING__EFFECTIVE_DATE:
				setEffectiveDate((String) newValue);
				return;
			case TermPackage.VALUE_SET_CONTEXT_BINDING__CONCEPT_DOMAIN:
				setConceptDomain((ConceptDomain) newValue);
				return;
			case TermPackage.VALUE_SET_CONTEXT_BINDING__VALUE_SET:
				setValueSet((ValueSetVersion) newValue);
				return;
			case TermPackage.VALUE_SET_CONTEXT_BINDING__USAGE_CONTEXT:
				setUsageContext((UsageContext) newValue);
				return;
			case TermPackage.VALUE_SET_CONTEXT_BINDING__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TermPackage.VALUE_SET_CONTEXT_BINDING__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
				return;
			case TermPackage.VALUE_SET_CONTEXT_BINDING__CONCEPT_DOMAIN:
				setConceptDomain((ConceptDomain) null);
				return;
			case TermPackage.VALUE_SET_CONTEXT_BINDING__VALUE_SET:
				setValueSet((ValueSetVersion) null);
				return;
			case TermPackage.VALUE_SET_CONTEXT_BINDING__USAGE_CONTEXT:
				setUsageContext((UsageContext) null);
				return;
			case TermPackage.VALUE_SET_CONTEXT_BINDING__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TermPackage.VALUE_SET_CONTEXT_BINDING__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null
						? effectiveDate != null
						: !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
			case TermPackage.VALUE_SET_CONTEXT_BINDING__CONCEPT_DOMAIN:
				return conceptDomain != null;
			case TermPackage.VALUE_SET_CONTEXT_BINDING__VALUE_SET:
				return valueSet != null;
			case TermPackage.VALUE_SET_CONTEXT_BINDING__USAGE_CONTEXT:
				return usageContext != null;
			case TermPackage.VALUE_SET_CONTEXT_BINDING__BASE_CLASS:
				return base_Class != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (effectiveDate: ");
		result.append(effectiveDate);
		result.append(')');
		return result.toString();
	}

} // ValueSetContextBindingImpl
