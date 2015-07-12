/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.Address;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.BindingStrength;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HumanName;
import org.hl7.fhir.Id;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Meta;
import org.hl7.fhir.Oid;
import org.hl7.fhir.Period;
import org.hl7.fhir.PositiveInt;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;
import org.hl7.fhir.Ratio;
import org.hl7.fhir.Reference;
import org.hl7.fhir.SampledData;
import org.hl7.fhir.Signature;
import org.hl7.fhir.Time;
import org.hl7.fhir.Timing;
import org.hl7.fhir.UnsignedInt;
import org.hl7.fhir.Uri;
import org.hl7.fhir.Uuid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetBoolean <em>Value Set Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetInteger <em>Value Set Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetDecimal <em>Value Set Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetBase64Binary <em>Value Set Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetInstant <em>Value Set Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetString <em>Value Set String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetUri <em>Value Set Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetDate <em>Value Set Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetDateTime <em>Value Set Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetTime <em>Value Set Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetCode <em>Value Set Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetOid <em>Value Set Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetUuid <em>Value Set Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetId <em>Value Set Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetUnsignedInt <em>Value Set Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetPositiveInt <em>Value Set Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetAttachment <em>Value Set Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetIdentifier <em>Value Set Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetCodeableConcept <em>Value Set Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetCoding <em>Value Set Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetQuantity <em>Value Set Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetRange <em>Value Set Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetPeriod <em>Value Set Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetRatio <em>Value Set Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetReference <em>Value Set Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetSampledData <em>Value Set Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetSignature <em>Value Set Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetHumanName <em>Value Set Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetAddress <em>Value Set Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetContactPoint <em>Value Set Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetTiming <em>Value Set Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ElementDefinitionBindingImpl#getValueSetMeta <em>Value Set Meta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionBindingImpl extends ElementImpl implements ElementDefinitionBinding {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected BindingStrength strength;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getValueSetBoolean() <em>Value Set Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean valueSetBoolean;

	/**
	 * The cached value of the '{@link #getValueSetInteger() <em>Value Set Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer valueSetInteger;

	/**
	 * The cached value of the '{@link #getValueSetDecimal() <em>Value Set Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal valueSetDecimal;

	/**
	 * The cached value of the '{@link #getValueSetBase64Binary() <em>Value Set Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetBase64Binary()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary valueSetBase64Binary;

	/**
	 * The cached value of the '{@link #getValueSetInstant() <em>Value Set Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant valueSetInstant;

	/**
	 * The cached value of the '{@link #getValueSetString() <em>Value Set String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String valueSetString;

	/**
	 * The cached value of the '{@link #getValueSetUri() <em>Value Set Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetUri()
	 * @generated
	 * @ordered
	 */
	protected Uri valueSetUri;

	/**
	 * The cached value of the '{@link #getValueSetDate() <em>Value Set Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetDate()
	 * @generated
	 * @ordered
	 */
	protected Date valueSetDate;

	/**
	 * The cached value of the '{@link #getValueSetDateTime() <em>Value Set Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime valueSetDateTime;

	/**
	 * The cached value of the '{@link #getValueSetTime() <em>Value Set Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetTime()
	 * @generated
	 * @ordered
	 */
	protected Time valueSetTime;

	/**
	 * The cached value of the '{@link #getValueSetCode() <em>Value Set Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetCode()
	 * @generated
	 * @ordered
	 */
	protected Code valueSetCode;

	/**
	 * The cached value of the '{@link #getValueSetOid() <em>Value Set Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetOid()
	 * @generated
	 * @ordered
	 */
	protected Oid valueSetOid;

	/**
	 * The cached value of the '{@link #getValueSetUuid() <em>Value Set Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetUuid()
	 * @generated
	 * @ordered
	 */
	protected Uuid valueSetUuid;

	/**
	 * The cached value of the '{@link #getValueSetId() <em>Value Set Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetId()
	 * @generated
	 * @ordered
	 */
	protected Id valueSetId;

	/**
	 * The cached value of the '{@link #getValueSetUnsignedInt() <em>Value Set Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt valueSetUnsignedInt;

	/**
	 * The cached value of the '{@link #getValueSetPositiveInt() <em>Value Set Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt valueSetPositiveInt;

	/**
	 * The cached value of the '{@link #getValueSetAttachment() <em>Value Set Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment valueSetAttachment;

	/**
	 * The cached value of the '{@link #getValueSetIdentifier() <em>Value Set Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier valueSetIdentifier;

	/**
	 * The cached value of the '{@link #getValueSetCodeableConcept() <em>Value Set Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept valueSetCodeableConcept;

	/**
	 * The cached value of the '{@link #getValueSetCoding() <em>Value Set Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding valueSetCoding;

	/**
	 * The cached value of the '{@link #getValueSetQuantity() <em>Value Set Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity valueSetQuantity;

	/**
	 * The cached value of the '{@link #getValueSetRange() <em>Value Set Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetRange()
	 * @generated
	 * @ordered
	 */
	protected Range valueSetRange;

	/**
	 * The cached value of the '{@link #getValueSetPeriod() <em>Value Set Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period valueSetPeriod;

	/**
	 * The cached value of the '{@link #getValueSetRatio() <em>Value Set Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio valueSetRatio;

	/**
	 * The cached value of the '{@link #getValueSetReference() <em>Value Set Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetReference()
	 * @generated
	 * @ordered
	 */
	protected Reference valueSetReference;

	/**
	 * The cached value of the '{@link #getValueSetSampledData() <em>Value Set Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData valueSetSampledData;

	/**
	 * The cached value of the '{@link #getValueSetSignature() <em>Value Set Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature valueSetSignature;

	/**
	 * The cached value of the '{@link #getValueSetHumanName() <em>Value Set Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetHumanName()
	 * @generated
	 * @ordered
	 */
	protected HumanName valueSetHumanName;

	/**
	 * The cached value of the '{@link #getValueSetAddress() <em>Value Set Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetAddress()
	 * @generated
	 * @ordered
	 */
	protected Address valueSetAddress;

	/**
	 * The cached value of the '{@link #getValueSetContactPoint() <em>Value Set Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint valueSetContactPoint;

	/**
	 * The cached value of the '{@link #getValueSetTiming() <em>Value Set Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing valueSetTiming;

	/**
	 * The cached value of the '{@link #getValueSetMeta() <em>Value Set Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSetMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta valueSetMeta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getElementDefinitionBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingStrength getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrength(BindingStrength newStrength, NotificationChain msgs) {
		BindingStrength oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH, oldStrength, newStrength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(BindingStrength newStrength) {
		if (newStrength != strength) {
			NotificationChain msgs = null;
			if (strength != null)
				msgs = ((InternalEObject)strength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH, null, msgs);
			if (newStrength != null)
				msgs = ((InternalEObject)newStrength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH, null, msgs);
			msgs = basicSetStrength(newStrength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH, newStrength, newStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getValueSetBoolean() {
		return valueSetBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetBoolean(org.hl7.fhir.Boolean newValueSetBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldValueSetBoolean = valueSetBoolean;
		valueSetBoolean = newValueSetBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BOOLEAN, oldValueSetBoolean, newValueSetBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetBoolean(org.hl7.fhir.Boolean newValueSetBoolean) {
		if (newValueSetBoolean != valueSetBoolean) {
			NotificationChain msgs = null;
			if (valueSetBoolean != null)
				msgs = ((InternalEObject)valueSetBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BOOLEAN, null, msgs);
			if (newValueSetBoolean != null)
				msgs = ((InternalEObject)newValueSetBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BOOLEAN, null, msgs);
			msgs = basicSetValueSetBoolean(newValueSetBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BOOLEAN, newValueSetBoolean, newValueSetBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getValueSetInteger() {
		return valueSetInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetInteger(org.hl7.fhir.Integer newValueSetInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldValueSetInteger = valueSetInteger;
		valueSetInteger = newValueSetInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INTEGER, oldValueSetInteger, newValueSetInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetInteger(org.hl7.fhir.Integer newValueSetInteger) {
		if (newValueSetInteger != valueSetInteger) {
			NotificationChain msgs = null;
			if (valueSetInteger != null)
				msgs = ((InternalEObject)valueSetInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INTEGER, null, msgs);
			if (newValueSetInteger != null)
				msgs = ((InternalEObject)newValueSetInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INTEGER, null, msgs);
			msgs = basicSetValueSetInteger(newValueSetInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INTEGER, newValueSetInteger, newValueSetInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getValueSetDecimal() {
		return valueSetDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetDecimal(Decimal newValueSetDecimal, NotificationChain msgs) {
		Decimal oldValueSetDecimal = valueSetDecimal;
		valueSetDecimal = newValueSetDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DECIMAL, oldValueSetDecimal, newValueSetDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetDecimal(Decimal newValueSetDecimal) {
		if (newValueSetDecimal != valueSetDecimal) {
			NotificationChain msgs = null;
			if (valueSetDecimal != null)
				msgs = ((InternalEObject)valueSetDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DECIMAL, null, msgs);
			if (newValueSetDecimal != null)
				msgs = ((InternalEObject)newValueSetDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DECIMAL, null, msgs);
			msgs = basicSetValueSetDecimal(newValueSetDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DECIMAL, newValueSetDecimal, newValueSetDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getValueSetBase64Binary() {
		return valueSetBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetBase64Binary(Base64Binary newValueSetBase64Binary, NotificationChain msgs) {
		Base64Binary oldValueSetBase64Binary = valueSetBase64Binary;
		valueSetBase64Binary = newValueSetBase64Binary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BASE64_BINARY, oldValueSetBase64Binary, newValueSetBase64Binary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetBase64Binary(Base64Binary newValueSetBase64Binary) {
		if (newValueSetBase64Binary != valueSetBase64Binary) {
			NotificationChain msgs = null;
			if (valueSetBase64Binary != null)
				msgs = ((InternalEObject)valueSetBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BASE64_BINARY, null, msgs);
			if (newValueSetBase64Binary != null)
				msgs = ((InternalEObject)newValueSetBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BASE64_BINARY, null, msgs);
			msgs = basicSetValueSetBase64Binary(newValueSetBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BASE64_BINARY, newValueSetBase64Binary, newValueSetBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getValueSetInstant() {
		return valueSetInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetInstant(Instant newValueSetInstant, NotificationChain msgs) {
		Instant oldValueSetInstant = valueSetInstant;
		valueSetInstant = newValueSetInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INSTANT, oldValueSetInstant, newValueSetInstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetInstant(Instant newValueSetInstant) {
		if (newValueSetInstant != valueSetInstant) {
			NotificationChain msgs = null;
			if (valueSetInstant != null)
				msgs = ((InternalEObject)valueSetInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INSTANT, null, msgs);
			if (newValueSetInstant != null)
				msgs = ((InternalEObject)newValueSetInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INSTANT, null, msgs);
			msgs = basicSetValueSetInstant(newValueSetInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INSTANT, newValueSetInstant, newValueSetInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getValueSetString() {
		return valueSetString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetString(org.hl7.fhir.String newValueSetString, NotificationChain msgs) {
		org.hl7.fhir.String oldValueSetString = valueSetString;
		valueSetString = newValueSetString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_STRING, oldValueSetString, newValueSetString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetString(org.hl7.fhir.String newValueSetString) {
		if (newValueSetString != valueSetString) {
			NotificationChain msgs = null;
			if (valueSetString != null)
				msgs = ((InternalEObject)valueSetString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_STRING, null, msgs);
			if (newValueSetString != null)
				msgs = ((InternalEObject)newValueSetString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_STRING, null, msgs);
			msgs = basicSetValueSetString(newValueSetString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_STRING, newValueSetString, newValueSetString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getValueSetUri() {
		return valueSetUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetUri(Uri newValueSetUri, NotificationChain msgs) {
		Uri oldValueSetUri = valueSetUri;
		valueSetUri = newValueSetUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI, oldValueSetUri, newValueSetUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetUri(Uri newValueSetUri) {
		if (newValueSetUri != valueSetUri) {
			NotificationChain msgs = null;
			if (valueSetUri != null)
				msgs = ((InternalEObject)valueSetUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI, null, msgs);
			if (newValueSetUri != null)
				msgs = ((InternalEObject)newValueSetUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI, null, msgs);
			msgs = basicSetValueSetUri(newValueSetUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI, newValueSetUri, newValueSetUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValueSetDate() {
		return valueSetDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetDate(Date newValueSetDate, NotificationChain msgs) {
		Date oldValueSetDate = valueSetDate;
		valueSetDate = newValueSetDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE, oldValueSetDate, newValueSetDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetDate(Date newValueSetDate) {
		if (newValueSetDate != valueSetDate) {
			NotificationChain msgs = null;
			if (valueSetDate != null)
				msgs = ((InternalEObject)valueSetDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE, null, msgs);
			if (newValueSetDate != null)
				msgs = ((InternalEObject)newValueSetDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE, null, msgs);
			msgs = basicSetValueSetDate(newValueSetDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE, newValueSetDate, newValueSetDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getValueSetDateTime() {
		return valueSetDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetDateTime(DateTime newValueSetDateTime, NotificationChain msgs) {
		DateTime oldValueSetDateTime = valueSetDateTime;
		valueSetDateTime = newValueSetDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE_TIME, oldValueSetDateTime, newValueSetDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetDateTime(DateTime newValueSetDateTime) {
		if (newValueSetDateTime != valueSetDateTime) {
			NotificationChain msgs = null;
			if (valueSetDateTime != null)
				msgs = ((InternalEObject)valueSetDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE_TIME, null, msgs);
			if (newValueSetDateTime != null)
				msgs = ((InternalEObject)newValueSetDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE_TIME, null, msgs);
			msgs = basicSetValueSetDateTime(newValueSetDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE_TIME, newValueSetDateTime, newValueSetDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getValueSetTime() {
		return valueSetTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetTime(Time newValueSetTime, NotificationChain msgs) {
		Time oldValueSetTime = valueSetTime;
		valueSetTime = newValueSetTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIME, oldValueSetTime, newValueSetTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetTime(Time newValueSetTime) {
		if (newValueSetTime != valueSetTime) {
			NotificationChain msgs = null;
			if (valueSetTime != null)
				msgs = ((InternalEObject)valueSetTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIME, null, msgs);
			if (newValueSetTime != null)
				msgs = ((InternalEObject)newValueSetTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIME, null, msgs);
			msgs = basicSetValueSetTime(newValueSetTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIME, newValueSetTime, newValueSetTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getValueSetCode() {
		return valueSetCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetCode(Code newValueSetCode, NotificationChain msgs) {
		Code oldValueSetCode = valueSetCode;
		valueSetCode = newValueSetCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODE, oldValueSetCode, newValueSetCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetCode(Code newValueSetCode) {
		if (newValueSetCode != valueSetCode) {
			NotificationChain msgs = null;
			if (valueSetCode != null)
				msgs = ((InternalEObject)valueSetCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODE, null, msgs);
			if (newValueSetCode != null)
				msgs = ((InternalEObject)newValueSetCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODE, null, msgs);
			msgs = basicSetValueSetCode(newValueSetCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODE, newValueSetCode, newValueSetCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getValueSetOid() {
		return valueSetOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetOid(Oid newValueSetOid, NotificationChain msgs) {
		Oid oldValueSetOid = valueSetOid;
		valueSetOid = newValueSetOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_OID, oldValueSetOid, newValueSetOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetOid(Oid newValueSetOid) {
		if (newValueSetOid != valueSetOid) {
			NotificationChain msgs = null;
			if (valueSetOid != null)
				msgs = ((InternalEObject)valueSetOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_OID, null, msgs);
			if (newValueSetOid != null)
				msgs = ((InternalEObject)newValueSetOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_OID, null, msgs);
			msgs = basicSetValueSetOid(newValueSetOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_OID, newValueSetOid, newValueSetOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid getValueSetUuid() {
		return valueSetUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetUuid(Uuid newValueSetUuid, NotificationChain msgs) {
		Uuid oldValueSetUuid = valueSetUuid;
		valueSetUuid = newValueSetUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UUID, oldValueSetUuid, newValueSetUuid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetUuid(Uuid newValueSetUuid) {
		if (newValueSetUuid != valueSetUuid) {
			NotificationChain msgs = null;
			if (valueSetUuid != null)
				msgs = ((InternalEObject)valueSetUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UUID, null, msgs);
			if (newValueSetUuid != null)
				msgs = ((InternalEObject)newValueSetUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UUID, null, msgs);
			msgs = basicSetValueSetUuid(newValueSetUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UUID, newValueSetUuid, newValueSetUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getValueSetId() {
		return valueSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetId(Id newValueSetId, NotificationChain msgs) {
		Id oldValueSetId = valueSetId;
		valueSetId = newValueSetId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ID, oldValueSetId, newValueSetId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetId(Id newValueSetId) {
		if (newValueSetId != valueSetId) {
			NotificationChain msgs = null;
			if (valueSetId != null)
				msgs = ((InternalEObject)valueSetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ID, null, msgs);
			if (newValueSetId != null)
				msgs = ((InternalEObject)newValueSetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ID, null, msgs);
			msgs = basicSetValueSetId(newValueSetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ID, newValueSetId, newValueSetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getValueSetUnsignedInt() {
		return valueSetUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetUnsignedInt(UnsignedInt newValueSetUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldValueSetUnsignedInt = valueSetUnsignedInt;
		valueSetUnsignedInt = newValueSetUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UNSIGNED_INT, oldValueSetUnsignedInt, newValueSetUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetUnsignedInt(UnsignedInt newValueSetUnsignedInt) {
		if (newValueSetUnsignedInt != valueSetUnsignedInt) {
			NotificationChain msgs = null;
			if (valueSetUnsignedInt != null)
				msgs = ((InternalEObject)valueSetUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UNSIGNED_INT, null, msgs);
			if (newValueSetUnsignedInt != null)
				msgs = ((InternalEObject)newValueSetUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UNSIGNED_INT, null, msgs);
			msgs = basicSetValueSetUnsignedInt(newValueSetUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UNSIGNED_INT, newValueSetUnsignedInt, newValueSetUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getValueSetPositiveInt() {
		return valueSetPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetPositiveInt(PositiveInt newValueSetPositiveInt, NotificationChain msgs) {
		PositiveInt oldValueSetPositiveInt = valueSetPositiveInt;
		valueSetPositiveInt = newValueSetPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_POSITIVE_INT, oldValueSetPositiveInt, newValueSetPositiveInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetPositiveInt(PositiveInt newValueSetPositiveInt) {
		if (newValueSetPositiveInt != valueSetPositiveInt) {
			NotificationChain msgs = null;
			if (valueSetPositiveInt != null)
				msgs = ((InternalEObject)valueSetPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_POSITIVE_INT, null, msgs);
			if (newValueSetPositiveInt != null)
				msgs = ((InternalEObject)newValueSetPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_POSITIVE_INT, null, msgs);
			msgs = basicSetValueSetPositiveInt(newValueSetPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_POSITIVE_INT, newValueSetPositiveInt, newValueSetPositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getValueSetAttachment() {
		return valueSetAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetAttachment(Attachment newValueSetAttachment, NotificationChain msgs) {
		Attachment oldValueSetAttachment = valueSetAttachment;
		valueSetAttachment = newValueSetAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ATTACHMENT, oldValueSetAttachment, newValueSetAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetAttachment(Attachment newValueSetAttachment) {
		if (newValueSetAttachment != valueSetAttachment) {
			NotificationChain msgs = null;
			if (valueSetAttachment != null)
				msgs = ((InternalEObject)valueSetAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ATTACHMENT, null, msgs);
			if (newValueSetAttachment != null)
				msgs = ((InternalEObject)newValueSetAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ATTACHMENT, null, msgs);
			msgs = basicSetValueSetAttachment(newValueSetAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ATTACHMENT, newValueSetAttachment, newValueSetAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getValueSetIdentifier() {
		return valueSetIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetIdentifier(Identifier newValueSetIdentifier, NotificationChain msgs) {
		Identifier oldValueSetIdentifier = valueSetIdentifier;
		valueSetIdentifier = newValueSetIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_IDENTIFIER, oldValueSetIdentifier, newValueSetIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetIdentifier(Identifier newValueSetIdentifier) {
		if (newValueSetIdentifier != valueSetIdentifier) {
			NotificationChain msgs = null;
			if (valueSetIdentifier != null)
				msgs = ((InternalEObject)valueSetIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_IDENTIFIER, null, msgs);
			if (newValueSetIdentifier != null)
				msgs = ((InternalEObject)newValueSetIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_IDENTIFIER, null, msgs);
			msgs = basicSetValueSetIdentifier(newValueSetIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_IDENTIFIER, newValueSetIdentifier, newValueSetIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getValueSetCodeableConcept() {
		return valueSetCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetCodeableConcept(CodeableConcept newValueSetCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldValueSetCodeableConcept = valueSetCodeableConcept;
		valueSetCodeableConcept = newValueSetCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODEABLE_CONCEPT, oldValueSetCodeableConcept, newValueSetCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetCodeableConcept(CodeableConcept newValueSetCodeableConcept) {
		if (newValueSetCodeableConcept != valueSetCodeableConcept) {
			NotificationChain msgs = null;
			if (valueSetCodeableConcept != null)
				msgs = ((InternalEObject)valueSetCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODEABLE_CONCEPT, null, msgs);
			if (newValueSetCodeableConcept != null)
				msgs = ((InternalEObject)newValueSetCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetValueSetCodeableConcept(newValueSetCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODEABLE_CONCEPT, newValueSetCodeableConcept, newValueSetCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getValueSetCoding() {
		return valueSetCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetCoding(Coding newValueSetCoding, NotificationChain msgs) {
		Coding oldValueSetCoding = valueSetCoding;
		valueSetCoding = newValueSetCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODING, oldValueSetCoding, newValueSetCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetCoding(Coding newValueSetCoding) {
		if (newValueSetCoding != valueSetCoding) {
			NotificationChain msgs = null;
			if (valueSetCoding != null)
				msgs = ((InternalEObject)valueSetCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODING, null, msgs);
			if (newValueSetCoding != null)
				msgs = ((InternalEObject)newValueSetCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODING, null, msgs);
			msgs = basicSetValueSetCoding(newValueSetCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODING, newValueSetCoding, newValueSetCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getValueSetQuantity() {
		return valueSetQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetQuantity(Quantity newValueSetQuantity, NotificationChain msgs) {
		Quantity oldValueSetQuantity = valueSetQuantity;
		valueSetQuantity = newValueSetQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_QUANTITY, oldValueSetQuantity, newValueSetQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetQuantity(Quantity newValueSetQuantity) {
		if (newValueSetQuantity != valueSetQuantity) {
			NotificationChain msgs = null;
			if (valueSetQuantity != null)
				msgs = ((InternalEObject)valueSetQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_QUANTITY, null, msgs);
			if (newValueSetQuantity != null)
				msgs = ((InternalEObject)newValueSetQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_QUANTITY, null, msgs);
			msgs = basicSetValueSetQuantity(newValueSetQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_QUANTITY, newValueSetQuantity, newValueSetQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getValueSetRange() {
		return valueSetRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetRange(Range newValueSetRange, NotificationChain msgs) {
		Range oldValueSetRange = valueSetRange;
		valueSetRange = newValueSetRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RANGE, oldValueSetRange, newValueSetRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetRange(Range newValueSetRange) {
		if (newValueSetRange != valueSetRange) {
			NotificationChain msgs = null;
			if (valueSetRange != null)
				msgs = ((InternalEObject)valueSetRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RANGE, null, msgs);
			if (newValueSetRange != null)
				msgs = ((InternalEObject)newValueSetRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RANGE, null, msgs);
			msgs = basicSetValueSetRange(newValueSetRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RANGE, newValueSetRange, newValueSetRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getValueSetPeriod() {
		return valueSetPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetPeriod(Period newValueSetPeriod, NotificationChain msgs) {
		Period oldValueSetPeriod = valueSetPeriod;
		valueSetPeriod = newValueSetPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_PERIOD, oldValueSetPeriod, newValueSetPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetPeriod(Period newValueSetPeriod) {
		if (newValueSetPeriod != valueSetPeriod) {
			NotificationChain msgs = null;
			if (valueSetPeriod != null)
				msgs = ((InternalEObject)valueSetPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_PERIOD, null, msgs);
			if (newValueSetPeriod != null)
				msgs = ((InternalEObject)newValueSetPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_PERIOD, null, msgs);
			msgs = basicSetValueSetPeriod(newValueSetPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_PERIOD, newValueSetPeriod, newValueSetPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getValueSetRatio() {
		return valueSetRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetRatio(Ratio newValueSetRatio, NotificationChain msgs) {
		Ratio oldValueSetRatio = valueSetRatio;
		valueSetRatio = newValueSetRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RATIO, oldValueSetRatio, newValueSetRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetRatio(Ratio newValueSetRatio) {
		if (newValueSetRatio != valueSetRatio) {
			NotificationChain msgs = null;
			if (valueSetRatio != null)
				msgs = ((InternalEObject)valueSetRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RATIO, null, msgs);
			if (newValueSetRatio != null)
				msgs = ((InternalEObject)newValueSetRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RATIO, null, msgs);
			msgs = basicSetValueSetRatio(newValueSetRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RATIO, newValueSetRatio, newValueSetRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getValueSetReference() {
		return valueSetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetReference(Reference newValueSetReference, NotificationChain msgs) {
		Reference oldValueSetReference = valueSetReference;
		valueSetReference = newValueSetReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE, oldValueSetReference, newValueSetReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetReference(Reference newValueSetReference) {
		if (newValueSetReference != valueSetReference) {
			NotificationChain msgs = null;
			if (valueSetReference != null)
				msgs = ((InternalEObject)valueSetReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE, null, msgs);
			if (newValueSetReference != null)
				msgs = ((InternalEObject)newValueSetReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE, null, msgs);
			msgs = basicSetValueSetReference(newValueSetReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE, newValueSetReference, newValueSetReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData getValueSetSampledData() {
		return valueSetSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetSampledData(SampledData newValueSetSampledData, NotificationChain msgs) {
		SampledData oldValueSetSampledData = valueSetSampledData;
		valueSetSampledData = newValueSetSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SAMPLED_DATA, oldValueSetSampledData, newValueSetSampledData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetSampledData(SampledData newValueSetSampledData) {
		if (newValueSetSampledData != valueSetSampledData) {
			NotificationChain msgs = null;
			if (valueSetSampledData != null)
				msgs = ((InternalEObject)valueSetSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SAMPLED_DATA, null, msgs);
			if (newValueSetSampledData != null)
				msgs = ((InternalEObject)newValueSetSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SAMPLED_DATA, null, msgs);
			msgs = basicSetValueSetSampledData(newValueSetSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SAMPLED_DATA, newValueSetSampledData, newValueSetSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getValueSetSignature() {
		return valueSetSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetSignature(Signature newValueSetSignature, NotificationChain msgs) {
		Signature oldValueSetSignature = valueSetSignature;
		valueSetSignature = newValueSetSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SIGNATURE, oldValueSetSignature, newValueSetSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetSignature(Signature newValueSetSignature) {
		if (newValueSetSignature != valueSetSignature) {
			NotificationChain msgs = null;
			if (valueSetSignature != null)
				msgs = ((InternalEObject)valueSetSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SIGNATURE, null, msgs);
			if (newValueSetSignature != null)
				msgs = ((InternalEObject)newValueSetSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SIGNATURE, null, msgs);
			msgs = basicSetValueSetSignature(newValueSetSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SIGNATURE, newValueSetSignature, newValueSetSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName getValueSetHumanName() {
		return valueSetHumanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetHumanName(HumanName newValueSetHumanName, NotificationChain msgs) {
		HumanName oldValueSetHumanName = valueSetHumanName;
		valueSetHumanName = newValueSetHumanName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_HUMAN_NAME, oldValueSetHumanName, newValueSetHumanName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetHumanName(HumanName newValueSetHumanName) {
		if (newValueSetHumanName != valueSetHumanName) {
			NotificationChain msgs = null;
			if (valueSetHumanName != null)
				msgs = ((InternalEObject)valueSetHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_HUMAN_NAME, null, msgs);
			if (newValueSetHumanName != null)
				msgs = ((InternalEObject)newValueSetHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_HUMAN_NAME, null, msgs);
			msgs = basicSetValueSetHumanName(newValueSetHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_HUMAN_NAME, newValueSetHumanName, newValueSetHumanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getValueSetAddress() {
		return valueSetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetAddress(Address newValueSetAddress, NotificationChain msgs) {
		Address oldValueSetAddress = valueSetAddress;
		valueSetAddress = newValueSetAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ADDRESS, oldValueSetAddress, newValueSetAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetAddress(Address newValueSetAddress) {
		if (newValueSetAddress != valueSetAddress) {
			NotificationChain msgs = null;
			if (valueSetAddress != null)
				msgs = ((InternalEObject)valueSetAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ADDRESS, null, msgs);
			if (newValueSetAddress != null)
				msgs = ((InternalEObject)newValueSetAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ADDRESS, null, msgs);
			msgs = basicSetValueSetAddress(newValueSetAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ADDRESS, newValueSetAddress, newValueSetAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint getValueSetContactPoint() {
		return valueSetContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetContactPoint(ContactPoint newValueSetContactPoint, NotificationChain msgs) {
		ContactPoint oldValueSetContactPoint = valueSetContactPoint;
		valueSetContactPoint = newValueSetContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CONTACT_POINT, oldValueSetContactPoint, newValueSetContactPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetContactPoint(ContactPoint newValueSetContactPoint) {
		if (newValueSetContactPoint != valueSetContactPoint) {
			NotificationChain msgs = null;
			if (valueSetContactPoint != null)
				msgs = ((InternalEObject)valueSetContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CONTACT_POINT, null, msgs);
			if (newValueSetContactPoint != null)
				msgs = ((InternalEObject)newValueSetContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CONTACT_POINT, null, msgs);
			msgs = basicSetValueSetContactPoint(newValueSetContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CONTACT_POINT, newValueSetContactPoint, newValueSetContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getValueSetTiming() {
		return valueSetTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetTiming(Timing newValueSetTiming, NotificationChain msgs) {
		Timing oldValueSetTiming = valueSetTiming;
		valueSetTiming = newValueSetTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIMING, oldValueSetTiming, newValueSetTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetTiming(Timing newValueSetTiming) {
		if (newValueSetTiming != valueSetTiming) {
			NotificationChain msgs = null;
			if (valueSetTiming != null)
				msgs = ((InternalEObject)valueSetTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIMING, null, msgs);
			if (newValueSetTiming != null)
				msgs = ((InternalEObject)newValueSetTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIMING, null, msgs);
			msgs = basicSetValueSetTiming(newValueSetTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIMING, newValueSetTiming, newValueSetTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta getValueSetMeta() {
		return valueSetMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSetMeta(Meta newValueSetMeta, NotificationChain msgs) {
		Meta oldValueSetMeta = valueSetMeta;
		valueSetMeta = newValueSetMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_META, oldValueSetMeta, newValueSetMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSetMeta(Meta newValueSetMeta) {
		if (newValueSetMeta != valueSetMeta) {
			NotificationChain msgs = null;
			if (valueSetMeta != null)
				msgs = ((InternalEObject)valueSetMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_META, null, msgs);
			if (newValueSetMeta != null)
				msgs = ((InternalEObject)newValueSetMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_META, null, msgs);
			msgs = basicSetValueSetMeta(newValueSetMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_META, newValueSetMeta, newValueSetMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELEMENT_DEFINITION_BINDING__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				return basicSetStrength(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BOOLEAN:
				return basicSetValueSetBoolean(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INTEGER:
				return basicSetValueSetInteger(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DECIMAL:
				return basicSetValueSetDecimal(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BASE64_BINARY:
				return basicSetValueSetBase64Binary(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INSTANT:
				return basicSetValueSetInstant(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_STRING:
				return basicSetValueSetString(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI:
				return basicSetValueSetUri(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE:
				return basicSetValueSetDate(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE_TIME:
				return basicSetValueSetDateTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIME:
				return basicSetValueSetTime(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODE:
				return basicSetValueSetCode(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_OID:
				return basicSetValueSetOid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UUID:
				return basicSetValueSetUuid(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ID:
				return basicSetValueSetId(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UNSIGNED_INT:
				return basicSetValueSetUnsignedInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_POSITIVE_INT:
				return basicSetValueSetPositiveInt(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ATTACHMENT:
				return basicSetValueSetAttachment(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_IDENTIFIER:
				return basicSetValueSetIdentifier(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODEABLE_CONCEPT:
				return basicSetValueSetCodeableConcept(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODING:
				return basicSetValueSetCoding(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_QUANTITY:
				return basicSetValueSetQuantity(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RANGE:
				return basicSetValueSetRange(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_PERIOD:
				return basicSetValueSetPeriod(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RATIO:
				return basicSetValueSetRatio(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE:
				return basicSetValueSetReference(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SAMPLED_DATA:
				return basicSetValueSetSampledData(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SIGNATURE:
				return basicSetValueSetSignature(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_HUMAN_NAME:
				return basicSetValueSetHumanName(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ADDRESS:
				return basicSetValueSetAddress(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CONTACT_POINT:
				return basicSetValueSetContactPoint(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIMING:
				return basicSetValueSetTiming(null, msgs);
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_META:
				return basicSetValueSetMeta(null, msgs);
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
			case FhirPackage.ELEMENT_DEFINITION_BINDING__NAME:
				return getName();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				return getStrength();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				return getDescription();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BOOLEAN:
				return getValueSetBoolean();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INTEGER:
				return getValueSetInteger();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DECIMAL:
				return getValueSetDecimal();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BASE64_BINARY:
				return getValueSetBase64Binary();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INSTANT:
				return getValueSetInstant();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_STRING:
				return getValueSetString();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI:
				return getValueSetUri();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE:
				return getValueSetDate();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE_TIME:
				return getValueSetDateTime();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIME:
				return getValueSetTime();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODE:
				return getValueSetCode();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_OID:
				return getValueSetOid();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UUID:
				return getValueSetUuid();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ID:
				return getValueSetId();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UNSIGNED_INT:
				return getValueSetUnsignedInt();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_POSITIVE_INT:
				return getValueSetPositiveInt();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ATTACHMENT:
				return getValueSetAttachment();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_IDENTIFIER:
				return getValueSetIdentifier();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODEABLE_CONCEPT:
				return getValueSetCodeableConcept();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODING:
				return getValueSetCoding();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_QUANTITY:
				return getValueSetQuantity();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RANGE:
				return getValueSetRange();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_PERIOD:
				return getValueSetPeriod();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RATIO:
				return getValueSetRatio();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE:
				return getValueSetReference();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SAMPLED_DATA:
				return getValueSetSampledData();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SIGNATURE:
				return getValueSetSignature();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_HUMAN_NAME:
				return getValueSetHumanName();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ADDRESS:
				return getValueSetAddress();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CONTACT_POINT:
				return getValueSetContactPoint();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIMING:
				return getValueSetTiming();
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_META:
				return getValueSetMeta();
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
			case FhirPackage.ELEMENT_DEFINITION_BINDING__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				setStrength((BindingStrength)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BOOLEAN:
				setValueSetBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INTEGER:
				setValueSetInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DECIMAL:
				setValueSetDecimal((Decimal)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BASE64_BINARY:
				setValueSetBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INSTANT:
				setValueSetInstant((Instant)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_STRING:
				setValueSetString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI:
				setValueSetUri((Uri)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE:
				setValueSetDate((Date)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE_TIME:
				setValueSetDateTime((DateTime)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIME:
				setValueSetTime((Time)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODE:
				setValueSetCode((Code)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_OID:
				setValueSetOid((Oid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UUID:
				setValueSetUuid((Uuid)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ID:
				setValueSetId((Id)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UNSIGNED_INT:
				setValueSetUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_POSITIVE_INT:
				setValueSetPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ATTACHMENT:
				setValueSetAttachment((Attachment)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_IDENTIFIER:
				setValueSetIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODEABLE_CONCEPT:
				setValueSetCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODING:
				setValueSetCoding((Coding)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_QUANTITY:
				setValueSetQuantity((Quantity)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RANGE:
				setValueSetRange((Range)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_PERIOD:
				setValueSetPeriod((Period)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RATIO:
				setValueSetRatio((Ratio)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE:
				setValueSetReference((Reference)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SAMPLED_DATA:
				setValueSetSampledData((SampledData)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SIGNATURE:
				setValueSetSignature((Signature)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_HUMAN_NAME:
				setValueSetHumanName((HumanName)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ADDRESS:
				setValueSetAddress((Address)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CONTACT_POINT:
				setValueSetContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIMING:
				setValueSetTiming((Timing)newValue);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_META:
				setValueSetMeta((Meta)newValue);
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
			case FhirPackage.ELEMENT_DEFINITION_BINDING__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				setStrength((BindingStrength)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BOOLEAN:
				setValueSetBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INTEGER:
				setValueSetInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DECIMAL:
				setValueSetDecimal((Decimal)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BASE64_BINARY:
				setValueSetBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INSTANT:
				setValueSetInstant((Instant)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_STRING:
				setValueSetString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI:
				setValueSetUri((Uri)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE:
				setValueSetDate((Date)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE_TIME:
				setValueSetDateTime((DateTime)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIME:
				setValueSetTime((Time)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODE:
				setValueSetCode((Code)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_OID:
				setValueSetOid((Oid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UUID:
				setValueSetUuid((Uuid)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ID:
				setValueSetId((Id)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UNSIGNED_INT:
				setValueSetUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_POSITIVE_INT:
				setValueSetPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ATTACHMENT:
				setValueSetAttachment((Attachment)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_IDENTIFIER:
				setValueSetIdentifier((Identifier)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODEABLE_CONCEPT:
				setValueSetCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODING:
				setValueSetCoding((Coding)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_QUANTITY:
				setValueSetQuantity((Quantity)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RANGE:
				setValueSetRange((Range)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_PERIOD:
				setValueSetPeriod((Period)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RATIO:
				setValueSetRatio((Ratio)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE:
				setValueSetReference((Reference)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SAMPLED_DATA:
				setValueSetSampledData((SampledData)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SIGNATURE:
				setValueSetSignature((Signature)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_HUMAN_NAME:
				setValueSetHumanName((HumanName)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ADDRESS:
				setValueSetAddress((Address)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CONTACT_POINT:
				setValueSetContactPoint((ContactPoint)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIMING:
				setValueSetTiming((Timing)null);
				return;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_META:
				setValueSetMeta((Meta)null);
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
			case FhirPackage.ELEMENT_DEFINITION_BINDING__NAME:
				return name != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__STRENGTH:
				return strength != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__DESCRIPTION:
				return description != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BOOLEAN:
				return valueSetBoolean != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INTEGER:
				return valueSetInteger != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DECIMAL:
				return valueSetDecimal != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_BASE64_BINARY:
				return valueSetBase64Binary != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_INSTANT:
				return valueSetInstant != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_STRING:
				return valueSetString != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_URI:
				return valueSetUri != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE:
				return valueSetDate != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_DATE_TIME:
				return valueSetDateTime != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIME:
				return valueSetTime != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODE:
				return valueSetCode != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_OID:
				return valueSetOid != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UUID:
				return valueSetUuid != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ID:
				return valueSetId != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_UNSIGNED_INT:
				return valueSetUnsignedInt != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_POSITIVE_INT:
				return valueSetPositiveInt != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ATTACHMENT:
				return valueSetAttachment != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_IDENTIFIER:
				return valueSetIdentifier != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODEABLE_CONCEPT:
				return valueSetCodeableConcept != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CODING:
				return valueSetCoding != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_QUANTITY:
				return valueSetQuantity != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RANGE:
				return valueSetRange != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_PERIOD:
				return valueSetPeriod != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_RATIO:
				return valueSetRatio != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_REFERENCE:
				return valueSetReference != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SAMPLED_DATA:
				return valueSetSampledData != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_SIGNATURE:
				return valueSetSignature != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_HUMAN_NAME:
				return valueSetHumanName != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_ADDRESS:
				return valueSetAddress != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_CONTACT_POINT:
				return valueSetContactPoint != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_TIMING:
				return valueSetTiming != null;
			case FhirPackage.ELEMENT_DEFINITION_BINDING__VALUE_SET_META:
				return valueSetMeta != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionBindingImpl
