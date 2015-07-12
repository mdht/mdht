/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Uri;
import org.hl7.fhir.ValueSetCompose;
import org.hl7.fhir.ValueSetInclude;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Compose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ValueSetComposeImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetComposeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ValueSetComposeImpl#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetComposeImpl extends BackboneElementImpl implements ValueSetCompose {
	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> import_;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetInclude> include;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetInclude> exclude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetComposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getValueSetCompose();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.VALUE_SET_COMPOSE__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetInclude> getInclude() {
		if (include == null) {
			include = new EObjectContainmentEList<ValueSetInclude>(ValueSetInclude.class, this, FhirPackage.VALUE_SET_COMPOSE__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetInclude> getExclude() {
		if (exclude == null) {
			exclude = new EObjectContainmentEList<ValueSetInclude>(ValueSetInclude.class, this, FhirPackage.VALUE_SET_COMPOSE__EXCLUDE);
		}
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VALUE_SET_COMPOSE__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case FhirPackage.VALUE_SET_COMPOSE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case FhirPackage.VALUE_SET_COMPOSE__EXCLUDE:
				return ((InternalEList<?>)getExclude()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.VALUE_SET_COMPOSE__IMPORT:
				return getImport();
			case FhirPackage.VALUE_SET_COMPOSE__INCLUDE:
				return getInclude();
			case FhirPackage.VALUE_SET_COMPOSE__EXCLUDE:
				return getExclude();
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
			case FhirPackage.VALUE_SET_COMPOSE__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.VALUE_SET_COMPOSE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends ValueSetInclude>)newValue);
				return;
			case FhirPackage.VALUE_SET_COMPOSE__EXCLUDE:
				getExclude().clear();
				getExclude().addAll((Collection<? extends ValueSetInclude>)newValue);
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
			case FhirPackage.VALUE_SET_COMPOSE__IMPORT:
				getImport().clear();
				return;
			case FhirPackage.VALUE_SET_COMPOSE__INCLUDE:
				getInclude().clear();
				return;
			case FhirPackage.VALUE_SET_COMPOSE__EXCLUDE:
				getExclude().clear();
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
			case FhirPackage.VALUE_SET_COMPOSE__IMPORT:
				return import_ != null && !import_.isEmpty();
			case FhirPackage.VALUE_SET_COMPOSE__INCLUDE:
				return include != null && !include.isEmpty();
			case FhirPackage.VALUE_SET_COMPOSE__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetComposeImpl
