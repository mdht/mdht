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
import org.hl7.fhir.DeviceComponent;
import org.hl7.fhir.DeviceComponentProductionSpecification;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.MeasmntPrinciple;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentImpl#getLastSystemChange <em>Last System Change</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentImpl#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentImpl#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentImpl#getMeasurementPrinciple <em>Measurement Principle</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentImpl#getProductionSpecification <em>Production Specification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DeviceComponentImpl#getLanguageCode <em>Language Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceComponentImpl extends DomainResourceImpl implements DeviceComponent {
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
	 * The cached value of the '{@link #getLastSystemChange() <em>Last System Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSystemChange()
	 * @generated
	 * @ordered
	 */
	protected Instant lastSystemChange;

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
	 * The cached value of the '{@link #getOperationalStatus() <em>Operational Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> operationalStatus;

	/**
	 * The cached value of the '{@link #getParameterGroup() <em>Parameter Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterGroup()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept parameterGroup;

	/**
	 * The cached value of the '{@link #getMeasurementPrinciple() <em>Measurement Principle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementPrinciple()
	 * @generated
	 * @ordered
	 */
	protected MeasmntPrinciple measurementPrinciple;

	/**
	 * The cached value of the '{@link #getProductionSpecification() <em>Production Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceComponentProductionSpecification> productionSpecification;

	/**
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept languageCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDeviceComponent();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getLastSystemChange() {
		return lastSystemChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastSystemChange(Instant newLastSystemChange, NotificationChain msgs) {
		Instant oldLastSystemChange = lastSystemChange;
		lastSystemChange = newLastSystemChange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE, oldLastSystemChange, newLastSystemChange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSystemChange(Instant newLastSystemChange) {
		if (newLastSystemChange != lastSystemChange) {
			NotificationChain msgs = null;
			if (lastSystemChange != null)
				msgs = ((InternalEObject)lastSystemChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE, null, msgs);
			if (newLastSystemChange != null)
				msgs = ((InternalEObject)newLastSystemChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE, null, msgs);
			msgs = basicSetLastSystemChange(newLastSystemChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE, newLastSystemChange, newLastSystemChange));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__SOURCE, oldSource, newSource);
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
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__SOURCE, newSource, newSource));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__PARENT, oldParent, newParent);
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
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getOperationalStatus() {
		if (operationalStatus == null) {
			operationalStatus = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.DEVICE_COMPONENT__OPERATIONAL_STATUS);
		}
		return operationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getParameterGroup() {
		return parameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterGroup(CodeableConcept newParameterGroup, NotificationChain msgs) {
		CodeableConcept oldParameterGroup = parameterGroup;
		parameterGroup = newParameterGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__PARAMETER_GROUP, oldParameterGroup, newParameterGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterGroup(CodeableConcept newParameterGroup) {
		if (newParameterGroup != parameterGroup) {
			NotificationChain msgs = null;
			if (parameterGroup != null)
				msgs = ((InternalEObject)parameterGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__PARAMETER_GROUP, null, msgs);
			if (newParameterGroup != null)
				msgs = ((InternalEObject)newParameterGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__PARAMETER_GROUP, null, msgs);
			msgs = basicSetParameterGroup(newParameterGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__PARAMETER_GROUP, newParameterGroup, newParameterGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasmntPrinciple getMeasurementPrinciple() {
		return measurementPrinciple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurementPrinciple(MeasmntPrinciple newMeasurementPrinciple, NotificationChain msgs) {
		MeasmntPrinciple oldMeasurementPrinciple = measurementPrinciple;
		measurementPrinciple = newMeasurementPrinciple;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE, oldMeasurementPrinciple, newMeasurementPrinciple);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementPrinciple(MeasmntPrinciple newMeasurementPrinciple) {
		if (newMeasurementPrinciple != measurementPrinciple) {
			NotificationChain msgs = null;
			if (measurementPrinciple != null)
				msgs = ((InternalEObject)measurementPrinciple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE, null, msgs);
			if (newMeasurementPrinciple != null)
				msgs = ((InternalEObject)newMeasurementPrinciple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE, null, msgs);
			msgs = basicSetMeasurementPrinciple(newMeasurementPrinciple, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE, newMeasurementPrinciple, newMeasurementPrinciple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceComponentProductionSpecification> getProductionSpecification() {
		if (productionSpecification == null) {
			productionSpecification = new EObjectContainmentEList<DeviceComponentProductionSpecification>(DeviceComponentProductionSpecification.class, this, FhirPackage.DEVICE_COMPONENT__PRODUCTION_SPECIFICATION);
		}
		return productionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getLanguageCode() {
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguageCode(CodeableConcept newLanguageCode, NotificationChain msgs) {
		CodeableConcept oldLanguageCode = languageCode;
		languageCode = newLanguageCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__LANGUAGE_CODE, oldLanguageCode, newLanguageCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageCode(CodeableConcept newLanguageCode) {
		if (newLanguageCode != languageCode) {
			NotificationChain msgs = null;
			if (languageCode != null)
				msgs = ((InternalEObject)languageCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__LANGUAGE_CODE, null, msgs);
			if (newLanguageCode != null)
				msgs = ((InternalEObject)newLanguageCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.DEVICE_COMPONENT__LANGUAGE_CODE, null, msgs);
			msgs = basicSetLanguageCode(newLanguageCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.DEVICE_COMPONENT__LANGUAGE_CODE, newLanguageCode, newLanguageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DEVICE_COMPONENT__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.DEVICE_COMPONENT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE:
				return basicSetLastSystemChange(null, msgs);
			case FhirPackage.DEVICE_COMPONENT__SOURCE:
				return basicSetSource(null, msgs);
			case FhirPackage.DEVICE_COMPONENT__PARENT:
				return basicSetParent(null, msgs);
			case FhirPackage.DEVICE_COMPONENT__OPERATIONAL_STATUS:
				return ((InternalEList<?>)getOperationalStatus()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_COMPONENT__PARAMETER_GROUP:
				return basicSetParameterGroup(null, msgs);
			case FhirPackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE:
				return basicSetMeasurementPrinciple(null, msgs);
			case FhirPackage.DEVICE_COMPONENT__PRODUCTION_SPECIFICATION:
				return ((InternalEList<?>)getProductionSpecification()).basicRemove(otherEnd, msgs);
			case FhirPackage.DEVICE_COMPONENT__LANGUAGE_CODE:
				return basicSetLanguageCode(null, msgs);
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
			case FhirPackage.DEVICE_COMPONENT__TYPE:
				return getType();
			case FhirPackage.DEVICE_COMPONENT__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE:
				return getLastSystemChange();
			case FhirPackage.DEVICE_COMPONENT__SOURCE:
				return getSource();
			case FhirPackage.DEVICE_COMPONENT__PARENT:
				return getParent();
			case FhirPackage.DEVICE_COMPONENT__OPERATIONAL_STATUS:
				return getOperationalStatus();
			case FhirPackage.DEVICE_COMPONENT__PARAMETER_GROUP:
				return getParameterGroup();
			case FhirPackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE:
				return getMeasurementPrinciple();
			case FhirPackage.DEVICE_COMPONENT__PRODUCTION_SPECIFICATION:
				return getProductionSpecification();
			case FhirPackage.DEVICE_COMPONENT__LANGUAGE_CODE:
				return getLanguageCode();
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
			case FhirPackage.DEVICE_COMPONENT__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_COMPONENT__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE:
				setLastSystemChange((Instant)newValue);
				return;
			case FhirPackage.DEVICE_COMPONENT__SOURCE:
				setSource((Reference)newValue);
				return;
			case FhirPackage.DEVICE_COMPONENT__PARENT:
				setParent((Reference)newValue);
				return;
			case FhirPackage.DEVICE_COMPONENT__OPERATIONAL_STATUS:
				getOperationalStatus().clear();
				getOperationalStatus().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.DEVICE_COMPONENT__PARAMETER_GROUP:
				setParameterGroup((CodeableConcept)newValue);
				return;
			case FhirPackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE:
				setMeasurementPrinciple((MeasmntPrinciple)newValue);
				return;
			case FhirPackage.DEVICE_COMPONENT__PRODUCTION_SPECIFICATION:
				getProductionSpecification().clear();
				getProductionSpecification().addAll((Collection<? extends DeviceComponentProductionSpecification>)newValue);
				return;
			case FhirPackage.DEVICE_COMPONENT__LANGUAGE_CODE:
				setLanguageCode((CodeableConcept)newValue);
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
			case FhirPackage.DEVICE_COMPONENT__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_COMPONENT__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE:
				setLastSystemChange((Instant)null);
				return;
			case FhirPackage.DEVICE_COMPONENT__SOURCE:
				setSource((Reference)null);
				return;
			case FhirPackage.DEVICE_COMPONENT__PARENT:
				setParent((Reference)null);
				return;
			case FhirPackage.DEVICE_COMPONENT__OPERATIONAL_STATUS:
				getOperationalStatus().clear();
				return;
			case FhirPackage.DEVICE_COMPONENT__PARAMETER_GROUP:
				setParameterGroup((CodeableConcept)null);
				return;
			case FhirPackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE:
				setMeasurementPrinciple((MeasmntPrinciple)null);
				return;
			case FhirPackage.DEVICE_COMPONENT__PRODUCTION_SPECIFICATION:
				getProductionSpecification().clear();
				return;
			case FhirPackage.DEVICE_COMPONENT__LANGUAGE_CODE:
				setLanguageCode((CodeableConcept)null);
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
			case FhirPackage.DEVICE_COMPONENT__TYPE:
				return type != null;
			case FhirPackage.DEVICE_COMPONENT__IDENTIFIER:
				return identifier != null;
			case FhirPackage.DEVICE_COMPONENT__LAST_SYSTEM_CHANGE:
				return lastSystemChange != null;
			case FhirPackage.DEVICE_COMPONENT__SOURCE:
				return source != null;
			case FhirPackage.DEVICE_COMPONENT__PARENT:
				return parent != null;
			case FhirPackage.DEVICE_COMPONENT__OPERATIONAL_STATUS:
				return operationalStatus != null && !operationalStatus.isEmpty();
			case FhirPackage.DEVICE_COMPONENT__PARAMETER_GROUP:
				return parameterGroup != null;
			case FhirPackage.DEVICE_COMPONENT__MEASUREMENT_PRINCIPLE:
				return measurementPrinciple != null;
			case FhirPackage.DEVICE_COMPONENT__PRODUCTION_SPECIFICATION:
				return productionSpecification != null && !productionSpecification.isEmpty();
			case FhirPackage.DEVICE_COMPONENT__LANGUAGE_CODE:
				return languageCode != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceComponentImpl
