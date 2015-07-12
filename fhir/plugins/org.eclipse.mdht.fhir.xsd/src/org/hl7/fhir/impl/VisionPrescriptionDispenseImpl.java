/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Coding;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.VisionBase;
import org.hl7.fhir.VisionEyes;
import org.hl7.fhir.VisionPrescriptionDispense;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vision Prescription Dispense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getEye <em>Eye</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getPrism <em>Prism</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getBackCurve <em>Back Curve</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.VisionPrescriptionDispenseImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisionPrescriptionDispenseImpl extends BackboneElementImpl implements VisionPrescriptionDispense {
	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Coding product;

	/**
	 * The cached value of the '{@link #getEye() <em>Eye</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEye()
	 * @generated
	 * @ordered
	 */
	protected VisionEyes eye;

	/**
	 * The cached value of the '{@link #getSphere() <em>Sphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSphere()
	 * @generated
	 * @ordered
	 */
	protected Decimal sphere;

	/**
	 * The cached value of the '{@link #getCylinder() <em>Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCylinder()
	 * @generated
	 * @ordered
	 */
	protected Decimal cylinder;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer axis;

	/**
	 * The cached value of the '{@link #getPrism() <em>Prism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrism()
	 * @generated
	 * @ordered
	 */
	protected Decimal prism;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected VisionBase base;

	/**
	 * The cached value of the '{@link #getAdd() <em>Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdd()
	 * @generated
	 * @ordered
	 */
	protected Decimal add;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected Decimal power;

	/**
	 * The cached value of the '{@link #getBackCurve() <em>Back Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackCurve()
	 * @generated
	 * @ordered
	 */
	protected Decimal backCurve;

	/**
	 * The cached value of the '{@link #getDiameter() <em>Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected Decimal diameter;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Quantity duration;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String color;

	/**
	 * The cached value of the '{@link #getBrand() <em>Brand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String brand;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String notes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisionPrescriptionDispenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getVisionPrescriptionDispense();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(Coding newProduct, NotificationChain msgs) {
		Coding oldProduct = product;
		product = newProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT, oldProduct, newProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Coding newProduct) {
		if (newProduct != product) {
			NotificationChain msgs = null;
			if (product != null)
				msgs = ((InternalEObject)product).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT, null, msgs);
			if (newProduct != null)
				msgs = ((InternalEObject)newProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT, null, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT, newProduct, newProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionEyes getEye() {
		return eye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEye(VisionEyes newEye, NotificationChain msgs) {
		VisionEyes oldEye = eye;
		eye = newEye;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__EYE, oldEye, newEye);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEye(VisionEyes newEye) {
		if (newEye != eye) {
			NotificationChain msgs = null;
			if (eye != null)
				msgs = ((InternalEObject)eye).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__EYE, null, msgs);
			if (newEye != null)
				msgs = ((InternalEObject)newEye).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__EYE, null, msgs);
			msgs = basicSetEye(newEye, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__EYE, newEye, newEye));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getSphere() {
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSphere(Decimal newSphere, NotificationChain msgs) {
		Decimal oldSphere = sphere;
		sphere = newSphere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE, oldSphere, newSphere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSphere(Decimal newSphere) {
		if (newSphere != sphere) {
			NotificationChain msgs = null;
			if (sphere != null)
				msgs = ((InternalEObject)sphere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE, null, msgs);
			if (newSphere != null)
				msgs = ((InternalEObject)newSphere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE, null, msgs);
			msgs = basicSetSphere(newSphere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE, newSphere, newSphere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getCylinder() {
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCylinder(Decimal newCylinder, NotificationChain msgs) {
		Decimal oldCylinder = cylinder;
		cylinder = newCylinder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER, oldCylinder, newCylinder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCylinder(Decimal newCylinder) {
		if (newCylinder != cylinder) {
			NotificationChain msgs = null;
			if (cylinder != null)
				msgs = ((InternalEObject)cylinder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER, null, msgs);
			if (newCylinder != null)
				msgs = ((InternalEObject)newCylinder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER, null, msgs);
			msgs = basicSetCylinder(newCylinder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER, newCylinder, newCylinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxis(org.hl7.fhir.Integer newAxis, NotificationChain msgs) {
		org.hl7.fhir.Integer oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__AXIS, oldAxis, newAxis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(org.hl7.fhir.Integer newAxis) {
		if (newAxis != axis) {
			NotificationChain msgs = null;
			if (axis != null)
				msgs = ((InternalEObject)axis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__AXIS, null, msgs);
			if (newAxis != null)
				msgs = ((InternalEObject)newAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__AXIS, null, msgs);
			msgs = basicSetAxis(newAxis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__AXIS, newAxis, newAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPrism() {
		return prism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrism(Decimal newPrism, NotificationChain msgs) {
		Decimal oldPrism = prism;
		prism = newPrism;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRISM, oldPrism, newPrism);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrism(Decimal newPrism) {
		if (newPrism != prism) {
			NotificationChain msgs = null;
			if (prism != null)
				msgs = ((InternalEObject)prism).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRISM, null, msgs);
			if (newPrism != null)
				msgs = ((InternalEObject)newPrism).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRISM, null, msgs);
			msgs = basicSetPrism(newPrism, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRISM, newPrism, newPrism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionBase getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(VisionBase newBase, NotificationChain msgs) {
		VisionBase oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(VisionBase newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getAdd() {
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdd(Decimal newAdd, NotificationChain msgs) {
		Decimal oldAdd = add;
		add = newAdd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__ADD, oldAdd, newAdd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdd(Decimal newAdd) {
		if (newAdd != add) {
			NotificationChain msgs = null;
			if (add != null)
				msgs = ((InternalEObject)add).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__ADD, null, msgs);
			if (newAdd != null)
				msgs = ((InternalEObject)newAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__ADD, null, msgs);
			msgs = basicSetAdd(newAdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__ADD, newAdd, newAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPower(Decimal newPower, NotificationChain msgs) {
		Decimal oldPower = power;
		power = newPower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__POWER, oldPower, newPower);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(Decimal newPower) {
		if (newPower != power) {
			NotificationChain msgs = null;
			if (power != null)
				msgs = ((InternalEObject)power).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__POWER, null, msgs);
			if (newPower != null)
				msgs = ((InternalEObject)newPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__POWER, null, msgs);
			msgs = basicSetPower(newPower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__POWER, newPower, newPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getBackCurve() {
		return backCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackCurve(Decimal newBackCurve, NotificationChain msgs) {
		Decimal oldBackCurve = backCurve;
		backCurve = newBackCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE, oldBackCurve, newBackCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackCurve(Decimal newBackCurve) {
		if (newBackCurve != backCurve) {
			NotificationChain msgs = null;
			if (backCurve != null)
				msgs = ((InternalEObject)backCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE, null, msgs);
			if (newBackCurve != null)
				msgs = ((InternalEObject)newBackCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE, null, msgs);
			msgs = basicSetBackCurve(newBackCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE, newBackCurve, newBackCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getDiameter() {
		return diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiameter(Decimal newDiameter, NotificationChain msgs) {
		Decimal oldDiameter = diameter;
		diameter = newDiameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER, oldDiameter, newDiameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiameter(Decimal newDiameter) {
		if (newDiameter != diameter) {
			NotificationChain msgs = null;
			if (diameter != null)
				msgs = ((InternalEObject)diameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER, null, msgs);
			if (newDiameter != null)
				msgs = ((InternalEObject)newDiameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER, null, msgs);
			msgs = basicSetDiameter(newDiameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER, newDiameter, newDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Quantity newDuration, NotificationChain msgs) {
		Quantity oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Quantity newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(org.hl7.fhir.String newColor, NotificationChain msgs) {
		org.hl7.fhir.String oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__COLOR, oldColor, newColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(org.hl7.fhir.String newColor) {
		if (newColor != color) {
			NotificationChain msgs = null;
			if (color != null)
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__COLOR, newColor, newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getBrand() {
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrand(org.hl7.fhir.String newBrand, NotificationChain msgs) {
		org.hl7.fhir.String oldBrand = brand;
		brand = newBrand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__BRAND, oldBrand, newBrand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrand(org.hl7.fhir.String newBrand) {
		if (newBrand != brand) {
			NotificationChain msgs = null;
			if (brand != null)
				msgs = ((InternalEObject)brand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__BRAND, null, msgs);
			if (newBrand != null)
				msgs = ((InternalEObject)newBrand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__BRAND, null, msgs);
			msgs = basicSetBrand(newBrand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__BRAND, newBrand, newBrand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotes(org.hl7.fhir.String newNotes, NotificationChain msgs) {
		org.hl7.fhir.String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__NOTES, oldNotes, newNotes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(org.hl7.fhir.String newNotes) {
		if (newNotes != notes) {
			NotificationChain msgs = null;
			if (notes != null)
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.VISION_PRESCRIPTION_DISPENSE__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.VISION_PRESCRIPTION_DISPENSE__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				return basicSetProduct(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				return basicSetEye(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				return basicSetSphere(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				return basicSetCylinder(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				return basicSetAxis(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				return basicSetPrism(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				return basicSetBase(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				return basicSetAdd(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				return basicSetPower(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				return basicSetBackCurve(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				return basicSetDiameter(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				return basicSetDuration(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				return basicSetColor(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				return basicSetBrand(null, msgs);
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__NOTES:
				return basicSetNotes(null, msgs);
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
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				return getProduct();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				return getEye();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				return getSphere();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				return getCylinder();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				return getAxis();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				return getPrism();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				return getBase();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				return getAdd();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				return getPower();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				return getBackCurve();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				return getDiameter();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				return getDuration();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				return getColor();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				return getBrand();
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__NOTES:
				return getNotes();
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
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				setProduct((Coding)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				setEye((VisionEyes)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				setSphere((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				setCylinder((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				setAxis((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				setPrism((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				setBase((VisionBase)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				setAdd((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				setPower((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				setBackCurve((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				setDiameter((Decimal)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				setDuration((Quantity)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				setColor((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				setBrand((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__NOTES:
				setNotes((org.hl7.fhir.String)newValue);
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
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				setProduct((Coding)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				setEye((VisionEyes)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				setSphere((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				setCylinder((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				setAxis((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				setPrism((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				setBase((VisionBase)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				setAdd((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				setPower((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				setBackCurve((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				setDiameter((Decimal)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				setDuration((Quantity)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				setColor((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				setBrand((org.hl7.fhir.String)null);
				return;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__NOTES:
				setNotes((org.hl7.fhir.String)null);
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
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRODUCT:
				return product != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__EYE:
				return eye != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__SPHERE:
				return sphere != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__CYLINDER:
				return cylinder != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__AXIS:
				return axis != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__PRISM:
				return prism != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BASE:
				return base != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__ADD:
				return add != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__POWER:
				return power != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BACK_CURVE:
				return backCurve != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__DIAMETER:
				return diameter != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__DURATION:
				return duration != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__COLOR:
				return color != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__BRAND:
				return brand != null;
			case FhirPackage.VISION_PRESCRIPTION_DISPENSE__NOTES:
				return notes != null;
		}
		return super.eIsSet(featureID);
	}

} //VisionPrescriptionDispenseImpl
