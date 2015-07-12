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
import org.hl7.fhir.NutritionOrderEnteralFormula;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Enteral Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderEnteralFormulaImpl#getAdministrationInstructions <em>Administration Instructions</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderEnteralFormulaImpl#getBaseFormulaType <em>Base Formula Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderEnteralFormulaImpl#getBaseFormulaProductName <em>Base Formula Product Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderEnteralFormulaImpl#getScheduled <em>Scheduled</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderEnteralFormulaImpl#getAdditiveType <em>Additive Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderEnteralFormulaImpl#getAdditiveProductName <em>Additive Product Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderEnteralFormulaImpl#getCaloricDensity <em>Caloric Density</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderEnteralFormulaImpl#getRouteofAdministration <em>Routeof Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderEnteralFormulaImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderEnteralFormulaImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderEnteralFormulaImpl#getRateAdjustment <em>Rate Adjustment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderEnteralFormulaImpl#getMaxVolumeToDeliver <em>Max Volume To Deliver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderEnteralFormulaImpl extends BackboneElementImpl implements NutritionOrderEnteralFormula {
	/**
	 * The cached value of the '{@link #getAdministrationInstructions() <em>Administration Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrationInstructions()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String administrationInstructions;

	/**
	 * The cached value of the '{@link #getBaseFormulaType() <em>Base Formula Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseFormulaType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept baseFormulaType;

	/**
	 * The cached value of the '{@link #getBaseFormulaProductName() <em>Base Formula Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseFormulaProductName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String baseFormulaProductName;

	/**
	 * The cached value of the '{@link #getScheduled() <em>Scheduled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduled()
	 * @generated
	 * @ordered
	 */
	protected Timing scheduled;

	/**
	 * The cached value of the '{@link #getAdditiveType() <em>Additive Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept additiveType;

	/**
	 * The cached value of the '{@link #getAdditiveProductName() <em>Additive Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveProductName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String additiveProductName;

	/**
	 * The cached value of the '{@link #getCaloricDensity() <em>Caloric Density</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaloricDensity()
	 * @generated
	 * @ordered
	 */
	protected Quantity caloricDensity;

	/**
	 * The cached value of the '{@link #getRouteofAdministration() <em>Routeof Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteofAdministration()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept routeofAdministration;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected Ratio rate;

	/**
	 * The cached value of the '{@link #getRateAdjustment() <em>Rate Adjustment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateAdjustment()
	 * @generated
	 * @ordered
	 */
	protected Quantity rateAdjustment;

	/**
	 * The cached value of the '{@link #getMaxVolumeToDeliver() <em>Max Volume To Deliver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVolumeToDeliver()
	 * @generated
	 * @ordered
	 */
	protected Quantity maxVolumeToDeliver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderEnteralFormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getNutritionOrderEnteralFormula();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAdministrationInstructions() {
		return administrationInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrationInstructions(org.hl7.fhir.String newAdministrationInstructions, NotificationChain msgs) {
		org.hl7.fhir.String oldAdministrationInstructions = administrationInstructions;
		administrationInstructions = newAdministrationInstructions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTIONS, oldAdministrationInstructions, newAdministrationInstructions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministrationInstructions(org.hl7.fhir.String newAdministrationInstructions) {
		if (newAdministrationInstructions != administrationInstructions) {
			NotificationChain msgs = null;
			if (administrationInstructions != null)
				msgs = ((InternalEObject)administrationInstructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTIONS, null, msgs);
			if (newAdministrationInstructions != null)
				msgs = ((InternalEObject)newAdministrationInstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTIONS, null, msgs);
			msgs = basicSetAdministrationInstructions(newAdministrationInstructions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTIONS, newAdministrationInstructions, newAdministrationInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBaseFormulaType() {
		return baseFormulaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseFormulaType(CodeableConcept newBaseFormulaType, NotificationChain msgs) {
		CodeableConcept oldBaseFormulaType = baseFormulaType;
		baseFormulaType = newBaseFormulaType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE, oldBaseFormulaType, newBaseFormulaType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseFormulaType(CodeableConcept newBaseFormulaType) {
		if (newBaseFormulaType != baseFormulaType) {
			NotificationChain msgs = null;
			if (baseFormulaType != null)
				msgs = ((InternalEObject)baseFormulaType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE, null, msgs);
			if (newBaseFormulaType != null)
				msgs = ((InternalEObject)newBaseFormulaType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE, null, msgs);
			msgs = basicSetBaseFormulaType(newBaseFormulaType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE, newBaseFormulaType, newBaseFormulaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getBaseFormulaProductName() {
		return baseFormulaProductName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseFormulaProductName(org.hl7.fhir.String newBaseFormulaProductName, NotificationChain msgs) {
		org.hl7.fhir.String oldBaseFormulaProductName = baseFormulaProductName;
		baseFormulaProductName = newBaseFormulaProductName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME, oldBaseFormulaProductName, newBaseFormulaProductName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseFormulaProductName(org.hl7.fhir.String newBaseFormulaProductName) {
		if (newBaseFormulaProductName != baseFormulaProductName) {
			NotificationChain msgs = null;
			if (baseFormulaProductName != null)
				msgs = ((InternalEObject)baseFormulaProductName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME, null, msgs);
			if (newBaseFormulaProductName != null)
				msgs = ((InternalEObject)newBaseFormulaProductName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME, null, msgs);
			msgs = basicSetBaseFormulaProductName(newBaseFormulaProductName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME, newBaseFormulaProductName, newBaseFormulaProductName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getScheduled() {
		return scheduled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduled(Timing newScheduled, NotificationChain msgs) {
		Timing oldScheduled = scheduled;
		scheduled = newScheduled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__SCHEDULED, oldScheduled, newScheduled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduled(Timing newScheduled) {
		if (newScheduled != scheduled) {
			NotificationChain msgs = null;
			if (scheduled != null)
				msgs = ((InternalEObject)scheduled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__SCHEDULED, null, msgs);
			if (newScheduled != null)
				msgs = ((InternalEObject)newScheduled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__SCHEDULED, null, msgs);
			msgs = basicSetScheduled(newScheduled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__SCHEDULED, newScheduled, newScheduled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAdditiveType() {
		return additiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditiveType(CodeableConcept newAdditiveType, NotificationChain msgs) {
		CodeableConcept oldAdditiveType = additiveType;
		additiveType = newAdditiveType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE, oldAdditiveType, newAdditiveType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditiveType(CodeableConcept newAdditiveType) {
		if (newAdditiveType != additiveType) {
			NotificationChain msgs = null;
			if (additiveType != null)
				msgs = ((InternalEObject)additiveType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE, null, msgs);
			if (newAdditiveType != null)
				msgs = ((InternalEObject)newAdditiveType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE, null, msgs);
			msgs = basicSetAdditiveType(newAdditiveType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE, newAdditiveType, newAdditiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAdditiveProductName() {
		return additiveProductName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditiveProductName(org.hl7.fhir.String newAdditiveProductName, NotificationChain msgs) {
		org.hl7.fhir.String oldAdditiveProductName = additiveProductName;
		additiveProductName = newAdditiveProductName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME, oldAdditiveProductName, newAdditiveProductName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditiveProductName(org.hl7.fhir.String newAdditiveProductName) {
		if (newAdditiveProductName != additiveProductName) {
			NotificationChain msgs = null;
			if (additiveProductName != null)
				msgs = ((InternalEObject)additiveProductName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME, null, msgs);
			if (newAdditiveProductName != null)
				msgs = ((InternalEObject)newAdditiveProductName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME, null, msgs);
			msgs = basicSetAdditiveProductName(newAdditiveProductName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME, newAdditiveProductName, newAdditiveProductName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getCaloricDensity() {
		return caloricDensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaloricDensity(Quantity newCaloricDensity, NotificationChain msgs) {
		Quantity oldCaloricDensity = caloricDensity;
		caloricDensity = newCaloricDensity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY, oldCaloricDensity, newCaloricDensity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaloricDensity(Quantity newCaloricDensity) {
		if (newCaloricDensity != caloricDensity) {
			NotificationChain msgs = null;
			if (caloricDensity != null)
				msgs = ((InternalEObject)caloricDensity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY, null, msgs);
			if (newCaloricDensity != null)
				msgs = ((InternalEObject)newCaloricDensity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY, null, msgs);
			msgs = basicSetCaloricDensity(newCaloricDensity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY, newCaloricDensity, newCaloricDensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRouteofAdministration() {
		return routeofAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRouteofAdministration(CodeableConcept newRouteofAdministration, NotificationChain msgs) {
		CodeableConcept oldRouteofAdministration = routeofAdministration;
		routeofAdministration = newRouteofAdministration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION, oldRouteofAdministration, newRouteofAdministration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteofAdministration(CodeableConcept newRouteofAdministration) {
		if (newRouteofAdministration != routeofAdministration) {
			NotificationChain msgs = null;
			if (routeofAdministration != null)
				msgs = ((InternalEObject)routeofAdministration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION, null, msgs);
			if (newRouteofAdministration != null)
				msgs = ((InternalEObject)newRouteofAdministration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION, null, msgs);
			msgs = basicSetRouteofAdministration(newRouteofAdministration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION, newRouteofAdministration, newRouteofAdministration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRate(Ratio newRate, NotificationChain msgs) {
		Ratio oldRate = rate;
		rate = newRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE, oldRate, newRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(Ratio newRate) {
		if (newRate != rate) {
			NotificationChain msgs = null;
			if (rate != null)
				msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE, null, msgs);
			if (newRate != null)
				msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE, null, msgs);
			msgs = basicSetRate(newRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE, newRate, newRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getRateAdjustment() {
		return rateAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateAdjustment(Quantity newRateAdjustment, NotificationChain msgs) {
		Quantity oldRateAdjustment = rateAdjustment;
		rateAdjustment = newRateAdjustment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE_ADJUSTMENT, oldRateAdjustment, newRateAdjustment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateAdjustment(Quantity newRateAdjustment) {
		if (newRateAdjustment != rateAdjustment) {
			NotificationChain msgs = null;
			if (rateAdjustment != null)
				msgs = ((InternalEObject)rateAdjustment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE_ADJUSTMENT, null, msgs);
			if (newRateAdjustment != null)
				msgs = ((InternalEObject)newRateAdjustment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE_ADJUSTMENT, null, msgs);
			msgs = basicSetRateAdjustment(newRateAdjustment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE_ADJUSTMENT, newRateAdjustment, newRateAdjustment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getMaxVolumeToDeliver() {
		return maxVolumeToDeliver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxVolumeToDeliver(Quantity newMaxVolumeToDeliver, NotificationChain msgs) {
		Quantity oldMaxVolumeToDeliver = maxVolumeToDeliver;
		maxVolumeToDeliver = newMaxVolumeToDeliver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER, oldMaxVolumeToDeliver, newMaxVolumeToDeliver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVolumeToDeliver(Quantity newMaxVolumeToDeliver) {
		if (newMaxVolumeToDeliver != maxVolumeToDeliver) {
			NotificationChain msgs = null;
			if (maxVolumeToDeliver != null)
				msgs = ((InternalEObject)maxVolumeToDeliver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER, null, msgs);
			if (newMaxVolumeToDeliver != null)
				msgs = ((InternalEObject)newMaxVolumeToDeliver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER, null, msgs);
			msgs = basicSetMaxVolumeToDeliver(newMaxVolumeToDeliver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER, newMaxVolumeToDeliver, newMaxVolumeToDeliver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTIONS:
				return basicSetAdministrationInstructions(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				return basicSetBaseFormulaType(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				return basicSetBaseFormulaProductName(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__SCHEDULED:
				return basicSetScheduled(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE:
				return basicSetAdditiveType(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME:
				return basicSetAdditiveProductName(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				return basicSetCaloricDensity(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION:
				return basicSetRouteofAdministration(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__QUANTITY:
				return basicSetQuantity(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE:
				return basicSetRate(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE_ADJUSTMENT:
				return basicSetRateAdjustment(null, msgs);
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				return basicSetMaxVolumeToDeliver(null, msgs);
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
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTIONS:
				return getAdministrationInstructions();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				return getBaseFormulaType();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				return getBaseFormulaProductName();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__SCHEDULED:
				return getScheduled();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE:
				return getAdditiveType();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME:
				return getAdditiveProductName();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				return getCaloricDensity();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION:
				return getRouteofAdministration();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__QUANTITY:
				return getQuantity();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE:
				return getRate();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE_ADJUSTMENT:
				return getRateAdjustment();
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				return getMaxVolumeToDeliver();
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
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTIONS:
				setAdministrationInstructions((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				setBaseFormulaType((CodeableConcept)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				setBaseFormulaProductName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__SCHEDULED:
				setScheduled((Timing)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE:
				setAdditiveType((CodeableConcept)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME:
				setAdditiveProductName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				setCaloricDensity((Quantity)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION:
				setRouteofAdministration((CodeableConcept)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE:
				setRate((Ratio)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE_ADJUSTMENT:
				setRateAdjustment((Quantity)newValue);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				setMaxVolumeToDeliver((Quantity)newValue);
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
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTIONS:
				setAdministrationInstructions((org.hl7.fhir.String)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				setBaseFormulaType((CodeableConcept)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				setBaseFormulaProductName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__SCHEDULED:
				setScheduled((Timing)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE:
				setAdditiveType((CodeableConcept)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME:
				setAdditiveProductName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				setCaloricDensity((Quantity)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION:
				setRouteofAdministration((CodeableConcept)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE:
				setRate((Ratio)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE_ADJUSTMENT:
				setRateAdjustment((Quantity)null);
				return;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				setMaxVolumeToDeliver((Quantity)null);
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
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADMINISTRATION_INSTRUCTIONS:
				return administrationInstructions != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_TYPE:
				return baseFormulaType != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__BASE_FORMULA_PRODUCT_NAME:
				return baseFormulaProductName != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__SCHEDULED:
				return scheduled != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_TYPE:
				return additiveType != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ADDITIVE_PRODUCT_NAME:
				return additiveProductName != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__CALORIC_DENSITY:
				return caloricDensity != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__ROUTEOF_ADMINISTRATION:
				return routeofAdministration != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__QUANTITY:
				return quantity != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE:
				return rate != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__RATE_ADJUSTMENT:
				return rateAdjustment != null;
			case FhirPackage.NUTRITION_ORDER_ENTERAL_FORMULA__MAX_VOLUME_TO_DELIVER:
				return maxVolumeToDeliver != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderEnteralFormulaImpl
