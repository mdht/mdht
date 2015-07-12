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
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceMetricCalibration;
import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.DeviceMetricColor;
import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Reference;
import org.hl7.fhir.Timing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceMetricImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceMetricImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceMetricImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceMetricImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceMetricImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceMetricImpl#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceMetricImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceMetricImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceMetricImpl#getMeasurementPeriod <em>Measurement Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceMetricImpl#getCalibration <em>Calibration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceMetricImpl extends DomainResourceImpl implements DeviceMetric {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept unit;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Reference source;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Reference parent;

	/**
	 * The cached value of the '{@link #getOperationalStatus() <em>Operational Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected DeviceMetricOperationalStatus operationalStatus;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected DeviceMetricColor color;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected DeviceMetricCategory category;

	/**
	 * The cached value of the '{@link #getMeasurementPeriod() <em>Measurement Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPeriod()
	 * @generated
	 * @ordered
	 */
	protected Timing measurementPeriod;

	/**
	 * The cached value of the '{@link #getCalibration() <em>Calibration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibration()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceMetricCalibration> calibration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceMetric();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(CodeableConcept newUnit, NotificationChain msgs) {
		CodeableConcept oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(CodeableConcept newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Reference newSource, NotificationChain msgs) {
		Reference oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Reference newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Reference newParent, NotificationChain msgs) {
		Reference oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Reference newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricOperationalStatus getOperationalStatus() {
		return operationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalStatus(DeviceMetricOperationalStatus newOperationalStatus, NotificationChain msgs) {
		DeviceMetricOperationalStatus oldOperationalStatus = operationalStatus;
		operationalStatus = newOperationalStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS, oldOperationalStatus, newOperationalStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationalStatus(DeviceMetricOperationalStatus newOperationalStatus) {
		if (newOperationalStatus != operationalStatus) {
			NotificationChain msgs = null;
			if (operationalStatus != null)
				msgs = ((InternalEObject)operationalStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS, null, msgs);
			if (newOperationalStatus != null)
				msgs = ((InternalEObject)newOperationalStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS, null, msgs);
			msgs = basicSetOperationalStatus(newOperationalStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS, newOperationalStatus, newOperationalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricColor getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(DeviceMetricColor newColor, NotificationChain msgs) {
		DeviceMetricColor oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__COLOR, oldColor, newColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(DeviceMetricColor newColor) {
		if (newColor != color) {
			NotificationChain msgs = null;
			if (color != null)
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__COLOR, newColor, newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetricCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(DeviceMetricCategory newCategory, NotificationChain msgs) {
		DeviceMetricCategory oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__CATEGORY, oldCategory, newCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(DeviceMetricCategory newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getMeasurementPeriod() {
		return measurementPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementPeriod(Timing newMeasurementPeriod, NotificationChain msgs) {
		Timing oldMeasurementPeriod = measurementPeriod;
		measurementPeriod = newMeasurementPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__MEASUREMENT_PERIOD, oldMeasurementPeriod, newMeasurementPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementPeriod(Timing newMeasurementPeriod) {
		if (newMeasurementPeriod != measurementPeriod) {
			NotificationChain msgs = null;
			if (measurementPeriod != null)
				msgs = ((InternalEObject)measurementPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__MEASUREMENT_PERIOD, null, msgs);
			if (newMeasurementPeriod != null)
				msgs = ((InternalEObject)newMeasurementPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_METRIC__MEASUREMENT_PERIOD, null, msgs);
			msgs = basicSetMeasurementPeriod(newMeasurementPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_METRIC__MEASUREMENT_PERIOD, newMeasurementPeriod, newMeasurementPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceMetricCalibration> getCalibration() {
		if (calibration == null) {
			calibration = new EObjectContainmentEList<DeviceMetricCalibration>(DeviceMetricCalibration.class, this, FhirPackage.DEVICE_METRIC__CALIBRATION);
		}
		return calibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_METRIC__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DEVICE_METRIC__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.DEVICE_METRIC__UNIT:
				return basicSetUnit(null, msgs);
			case FhirPackage.DEVICE_METRIC__SOURCE:
				return basicSetSource(null, msgs);
			case FhirPackage.DEVICE_METRIC__PARENT:
				return basicSetParent(null, msgs);
			case FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				return basicSetOperationalStatus(null, msgs);
			case FhirPackage.DEVICE_METRIC__COLOR:
				return basicSetColor(null, msgs);
			case FhirPackage.DEVICE_METRIC__CATEGORY:
				return basicSetCategory(null, msgs);
			case FhirPackage.DEVICE_METRIC__MEASUREMENT_PERIOD:
				return basicSetMeasurementPeriod(null, msgs);
			case FhirPackage.DEVICE_METRIC__CALIBRATION:
				return ((InternalEList<?>)getCalibration()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.DEVICE_METRIC__TYPE:
				return getType();
			case FhirPackage.DEVICE_METRIC__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DEVICE_METRIC__UNIT:
				return getUnit();
			case FhirPackage.DEVICE_METRIC__SOURCE:
				return getSource();
			case FhirPackage.DEVICE_METRIC__PARENT:
				return getParent();
			case FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				return getOperationalStatus();
			case FhirPackage.DEVICE_METRIC__COLOR:
				return getColor();
			case FhirPackage.DEVICE_METRIC__CATEGORY:
				return getCategory();
			case FhirPackage.DEVICE_METRIC__MEASUREMENT_PERIOD:
				return getMeasurementPeriod();
			case FhirPackage.DEVICE_METRIC__CALIBRATION:
				return getCalibration();
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
			case FhirPackage.DEVICE_METRIC__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__UNIT:
				setUnit((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__SOURCE:
				setSource((Reference)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__PARENT:
				setParent((Reference)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				setOperationalStatus((DeviceMetricOperationalStatus)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__COLOR:
				setColor((DeviceMetricColor)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__CATEGORY:
				setCategory((DeviceMetricCategory)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__MEASUREMENT_PERIOD:
				setMeasurementPeriod((Timing)newValue);
				return;
			case FhirPackage.DEVICE_METRIC__CALIBRATION:
				getCalibration().clear();
				getCalibration().addAll((Collection<? extends DeviceMetricCalibration>)newValue);
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
			case FhirPackage.DEVICE_METRIC__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_METRIC__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.DEVICE_METRIC__UNIT:
				setUnit((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_METRIC__SOURCE:
				setSource((Reference)null);
				return;
			case FhirPackage.DEVICE_METRIC__PARENT:
				setParent((Reference)null);
				return;
			case FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				setOperationalStatus((DeviceMetricOperationalStatus)null);
				return;
			case FhirPackage.DEVICE_METRIC__COLOR:
				setColor((DeviceMetricColor)null);
				return;
			case FhirPackage.DEVICE_METRIC__CATEGORY:
				setCategory((DeviceMetricCategory)null);
				return;
			case FhirPackage.DEVICE_METRIC__MEASUREMENT_PERIOD:
				setMeasurementPeriod((Timing)null);
				return;
			case FhirPackage.DEVICE_METRIC__CALIBRATION:
				getCalibration().clear();
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
			case FhirPackage.DEVICE_METRIC__TYPE:
				return type != null;
			case FhirPackage.DEVICE_METRIC__IDENTIFIER:
				return identifier != null;
			case FhirPackage.DEVICE_METRIC__UNIT:
				return unit != null;
			case FhirPackage.DEVICE_METRIC__SOURCE:
				return source != null;
			case FhirPackage.DEVICE_METRIC__PARENT:
				return parent != null;
			case FhirPackage.DEVICE_METRIC__OPERATIONAL_STATUS:
				return operationalStatus != null;
			case FhirPackage.DEVICE_METRIC__COLOR:
				return color != null;
			case FhirPackage.DEVICE_METRIC__CATEGORY:
				return category != null;
			case FhirPackage.DEVICE_METRIC__MEASUREMENT_PERIOD:
				return measurementPeriod != null;
			case FhirPackage.DEVICE_METRIC__CALIBRATION:
				return calibration != null && !calibration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceMetricImpl
