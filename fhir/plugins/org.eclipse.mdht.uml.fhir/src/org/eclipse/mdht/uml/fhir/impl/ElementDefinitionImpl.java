/**
 */
package org.eclipse.mdht.uml.fhir.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.ElementDefinition;
import org.eclipse.mdht.uml.fhir.FHIRPackage;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl#isMustSupport <em>Must Support</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionImpl extends ElementImpl implements ElementDefinition {
	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * The default value of the '{@link #isMustSupport() <em>Must Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustSupport() <em>Must Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustSupport()
	 * @generated
	 * @ordered
	 */
	protected boolean mustSupport = MUST_SUPPORT_EDEFAULT;

	/**
	 * This is true if the Must Support attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mustSupportESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.Literals.ELEMENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FHIRPackage.ELEMENT_DEFINITION__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustSupport() {
		return mustSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustSupport(boolean newMustSupport) {
		boolean oldMustSupport = mustSupport;
		mustSupport = newMustSupport;
		boolean oldMustSupportESet = mustSupportESet;
		mustSupportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_DEFINITION__MUST_SUPPORT, oldMustSupport, mustSupport, !oldMustSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMustSupport() {
		boolean oldMustSupport = mustSupport;
		boolean oldMustSupportESet = mustSupportESet;
		mustSupport = MUST_SUPPORT_EDEFAULT;
		mustSupportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FHIRPackage.ELEMENT_DEFINITION__MUST_SUPPORT, oldMustSupport, MUST_SUPPORT_EDEFAULT, oldMustSupportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMustSupport() {
		return mustSupportESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FHIRPackage.ELEMENT_DEFINITION__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case FHIRPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return isMustSupport();
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
			case FHIRPackage.ELEMENT_DEFINITION__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				setMustSupport((Boolean)newValue);
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
			case FHIRPackage.ELEMENT_DEFINITION__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case FHIRPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				unsetMustSupport();
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
			case FHIRPackage.ELEMENT_DEFINITION__BASE_PROPERTY:
				return base_Property != null;
			case FHIRPackage.ELEMENT_DEFINITION__MUST_SUPPORT:
				return isSetMustSupport();
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
		result.append(" (mustSupport: ");
		if (mustSupportESet) result.append(mustSupport); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ElementDefinitionImpl
