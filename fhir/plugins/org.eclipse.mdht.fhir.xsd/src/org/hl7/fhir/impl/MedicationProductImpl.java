/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.MedicationBatch;
import org.hl7.fhir.MedicationIngredient;
import org.hl7.fhir.MedicationProduct;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicationProductImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationProductImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicationProductImpl#getBatch <em>Batch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationProductImpl extends BackboneElementImpl implements MedicationProduct {
	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept form;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationIngredient> ingredient;

	/**
	 * The cached value of the '{@link #getBatch() <em>Batch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatch()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationBatch> batch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicationProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(CodeableConcept newForm, NotificationChain msgs) {
		CodeableConcept oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRODUCT__FORM, oldForm, newForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(CodeableConcept newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRODUCT__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICATION_PRODUCT__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICATION_PRODUCT__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationIngredient> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<MedicationIngredient>(MedicationIngredient.class, this, FhirPackage.MEDICATION_PRODUCT__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationBatch> getBatch() {
		if (batch == null) {
			batch = new EObjectContainmentEList<MedicationBatch>(MedicationBatch.class, this, FhirPackage.MEDICATION_PRODUCT__BATCH);
		}
		return batch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICATION_PRODUCT__FORM:
				return basicSetForm(null, msgs);
			case FhirPackage.MEDICATION_PRODUCT__INGREDIENT:
				return ((InternalEList<?>)getIngredient()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICATION_PRODUCT__BATCH:
				return ((InternalEList<?>)getBatch()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICATION_PRODUCT__FORM:
				return getForm();
			case FhirPackage.MEDICATION_PRODUCT__INGREDIENT:
				return getIngredient();
			case FhirPackage.MEDICATION_PRODUCT__BATCH:
				return getBatch();
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
			case FhirPackage.MEDICATION_PRODUCT__FORM:
				setForm((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICATION_PRODUCT__INGREDIENT:
				getIngredient().clear();
				getIngredient().addAll((Collection<? extends MedicationIngredient>)newValue);
				return;
			case FhirPackage.MEDICATION_PRODUCT__BATCH:
				getBatch().clear();
				getBatch().addAll((Collection<? extends MedicationBatch>)newValue);
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
			case FhirPackage.MEDICATION_PRODUCT__FORM:
				setForm((CodeableConcept)null);
				return;
			case FhirPackage.MEDICATION_PRODUCT__INGREDIENT:
				getIngredient().clear();
				return;
			case FhirPackage.MEDICATION_PRODUCT__BATCH:
				getBatch().clear();
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
			case FhirPackage.MEDICATION_PRODUCT__FORM:
				return form != null;
			case FhirPackage.MEDICATION_PRODUCT__INGREDIENT:
				return ingredient != null && !ingredient.isEmpty();
			case FhirPackage.MEDICATION_PRODUCT__BATCH:
				return batch != null && !batch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicationProductImpl
