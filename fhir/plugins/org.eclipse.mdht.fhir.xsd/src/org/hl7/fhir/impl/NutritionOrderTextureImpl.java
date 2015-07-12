/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.NutritionOrderTexture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderTextureImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderTextureImpl#getFoodType <em>Food Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderTextureImpl extends BackboneElementImpl implements NutritionOrderTexture {
	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept modifier;

	/**
	 * The cached value of the '{@link #getFoodType() <em>Food Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoodType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept foodType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderTextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionOrderTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifier(CodeableConcept newModifier, NotificationChain msgs) {
		CodeableConcept oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_TEXTURE__MODIFIER, oldModifier, newModifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(CodeableConcept newModifier) {
		if (newModifier != modifier) {
			NotificationChain msgs = null;
			if (modifier != null)
				msgs = ((InternalEObject)modifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_TEXTURE__MODIFIER, null, msgs);
			if (newModifier != null)
				msgs = ((InternalEObject)newModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_TEXTURE__MODIFIER, null, msgs);
			msgs = basicSetModifier(newModifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_TEXTURE__MODIFIER, newModifier, newModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getFoodType() {
		return foodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFoodType(CodeableConcept newFoodType, NotificationChain msgs) {
		CodeableConcept oldFoodType = foodType;
		foodType = newFoodType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_TEXTURE__FOOD_TYPE, oldFoodType, newFoodType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoodType(CodeableConcept newFoodType) {
		if (newFoodType != foodType) {
			NotificationChain msgs = null;
			if (foodType != null)
				msgs = ((InternalEObject)foodType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_TEXTURE__FOOD_TYPE, null, msgs);
			if (newFoodType != null)
				msgs = ((InternalEObject)newFoodType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_TEXTURE__FOOD_TYPE, null, msgs);
			msgs = basicSetFoodType(newFoodType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_TEXTURE__FOOD_TYPE, newFoodType, newFoodType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.NUTRITION_ORDER_TEXTURE__MODIFIER:
				return basicSetModifier(null, msgs);
			case FhirPackage.NUTRITION_ORDER_TEXTURE__FOOD_TYPE:
				return basicSetFoodType(null, msgs);
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
			case FhirPackage.NUTRITION_ORDER_TEXTURE__MODIFIER:
				return getModifier();
			case FhirPackage.NUTRITION_ORDER_TEXTURE__FOOD_TYPE:
				return getFoodType();
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
			case FhirPackage.NUTRITION_ORDER_TEXTURE__MODIFIER:
				setModifier((CodeableConcept)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_TEXTURE__FOOD_TYPE:
				setFoodType((CodeableConcept)newValue);
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
			case FhirPackage.NUTRITION_ORDER_TEXTURE__MODIFIER:
				setModifier((CodeableConcept)null);
				return;
			case FhirPackage.NUTRITION_ORDER_TEXTURE__FOOD_TYPE:
				setFoodType((CodeableConcept)null);
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
			case FhirPackage.NUTRITION_ORDER_TEXTURE__MODIFIER:
				return modifier != null;
			case FhirPackage.NUTRITION_ORDER_TEXTURE__FOOD_TYPE:
				return foodType != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderTextureImpl
