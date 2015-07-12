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

import org.hl7.fhir.Address;
import org.hl7.fhir.Attachment;
import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.Code;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.Date;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.Decimal;
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
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoBoolean <em>Who Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoInteger <em>Who Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoDecimal <em>Who Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoBase64Binary <em>Who Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoInstant <em>Who Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoString <em>Who String</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoUri <em>Who Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoDate <em>Who Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoDateTime <em>Who Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoTime <em>Who Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoCode <em>Who Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoOid <em>Who Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoUuid <em>Who Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoId <em>Who Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoUnsignedInt <em>Who Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoPositiveInt <em>Who Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoAttachment <em>Who Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoIdentifier <em>Who Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoCodeableConcept <em>Who Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoCoding <em>Who Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoQuantity <em>Who Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoRange <em>Who Range</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoPeriod <em>Who Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoRatio <em>Who Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoReference <em>Who Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoSampledData <em>Who Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoSignature <em>Who Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoHumanName <em>Who Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoAddress <em>Who Address</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoContactPoint <em>Who Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoTiming <em>Who Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getWhoMeta <em>Who Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SignatureImpl#getBlob <em>Blob</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureImpl extends ElementImpl implements Signature {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> type;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected Instant when;

	/**
	 * The cached value of the '{@link #getWhoBoolean() <em>Who Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoBoolean()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean whoBoolean;

	/**
	 * The cached value of the '{@link #getWhoInteger() <em>Who Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoInteger()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer whoInteger;

	/**
	 * The cached value of the '{@link #getWhoDecimal() <em>Who Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoDecimal()
	 * @generated
	 * @ordered
	 */
	protected Decimal whoDecimal;

	/**
	 * The cached value of the '{@link #getWhoBase64Binary() <em>Who Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoBase64Binary()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary whoBase64Binary;

	/**
	 * The cached value of the '{@link #getWhoInstant() <em>Who Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoInstant()
	 * @generated
	 * @ordered
	 */
	protected Instant whoInstant;

	/**
	 * The cached value of the '{@link #getWhoString() <em>Who String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoString()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String whoString;

	/**
	 * The cached value of the '{@link #getWhoUri() <em>Who Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoUri()
	 * @generated
	 * @ordered
	 */
	protected Uri whoUri;

	/**
	 * The cached value of the '{@link #getWhoDate() <em>Who Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoDate()
	 * @generated
	 * @ordered
	 */
	protected Date whoDate;

	/**
	 * The cached value of the '{@link #getWhoDateTime() <em>Who Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime whoDateTime;

	/**
	 * The cached value of the '{@link #getWhoTime() <em>Who Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoTime()
	 * @generated
	 * @ordered
	 */
	protected Time whoTime;

	/**
	 * The cached value of the '{@link #getWhoCode() <em>Who Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoCode()
	 * @generated
	 * @ordered
	 */
	protected Code whoCode;

	/**
	 * The cached value of the '{@link #getWhoOid() <em>Who Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoOid()
	 * @generated
	 * @ordered
	 */
	protected Oid whoOid;

	/**
	 * The cached value of the '{@link #getWhoUuid() <em>Who Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoUuid()
	 * @generated
	 * @ordered
	 */
	protected Uuid whoUuid;

	/**
	 * The cached value of the '{@link #getWhoId() <em>Who Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoId()
	 * @generated
	 * @ordered
	 */
	protected Id whoId;

	/**
	 * The cached value of the '{@link #getWhoUnsignedInt() <em>Who Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt whoUnsignedInt;

	/**
	 * The cached value of the '{@link #getWhoPositiveInt() <em>Who Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoPositiveInt()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt whoPositiveInt;

	/**
	 * The cached value of the '{@link #getWhoAttachment() <em>Who Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoAttachment()
	 * @generated
	 * @ordered
	 */
	protected Attachment whoAttachment;

	/**
	 * The cached value of the '{@link #getWhoIdentifier() <em>Who Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier whoIdentifier;

	/**
	 * The cached value of the '{@link #getWhoCodeableConcept() <em>Who Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoCodeableConcept()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept whoCodeableConcept;

	/**
	 * The cached value of the '{@link #getWhoCoding() <em>Who Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoCoding()
	 * @generated
	 * @ordered
	 */
	protected Coding whoCoding;

	/**
	 * The cached value of the '{@link #getWhoQuantity() <em>Who Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity whoQuantity;

	/**
	 * The cached value of the '{@link #getWhoRange() <em>Who Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoRange()
	 * @generated
	 * @ordered
	 */
	protected Range whoRange;

	/**
	 * The cached value of the '{@link #getWhoPeriod() <em>Who Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period whoPeriod;

	/**
	 * The cached value of the '{@link #getWhoRatio() <em>Who Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoRatio()
	 * @generated
	 * @ordered
	 */
	protected Ratio whoRatio;

	/**
	 * The cached value of the '{@link #getWhoReference() <em>Who Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoReference()
	 * @generated
	 * @ordered
	 */
	protected Reference whoReference;

	/**
	 * The cached value of the '{@link #getWhoSampledData() <em>Who Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoSampledData()
	 * @generated
	 * @ordered
	 */
	protected SampledData whoSampledData;

	/**
	 * The cached value of the '{@link #getWhoSignature() <em>Who Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature whoSignature;

	/**
	 * The cached value of the '{@link #getWhoHumanName() <em>Who Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoHumanName()
	 * @generated
	 * @ordered
	 */
	protected HumanName whoHumanName;

	/**
	 * The cached value of the '{@link #getWhoAddress() <em>Who Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoAddress()
	 * @generated
	 * @ordered
	 */
	protected Address whoAddress;

	/**
	 * The cached value of the '{@link #getWhoContactPoint() <em>Who Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoContactPoint()
	 * @generated
	 * @ordered
	 */
	protected ContactPoint whoContactPoint;

	/**
	 * The cached value of the '{@link #getWhoTiming() <em>Who Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoTiming()
	 * @generated
	 * @ordered
	 */
	protected Timing whoTiming;

	/**
	 * The cached value of the '{@link #getWhoMeta() <em>Who Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhoMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta whoMeta;

	/**
	 * The cached value of the '{@link #getBlob() <em>Blob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlob()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary blob;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSignature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.SIGNATURE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(Instant newWhen, NotificationChain msgs) {
		Instant oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(Instant newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getWhoBoolean() {
		return whoBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoBoolean(org.hl7.fhir.Boolean newWhoBoolean, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldWhoBoolean = whoBoolean;
		whoBoolean = newWhoBoolean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_BOOLEAN, oldWhoBoolean, newWhoBoolean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoBoolean(org.hl7.fhir.Boolean newWhoBoolean) {
		if (newWhoBoolean != whoBoolean) {
			NotificationChain msgs = null;
			if (whoBoolean != null)
				msgs = ((InternalEObject)whoBoolean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_BOOLEAN, null, msgs);
			if (newWhoBoolean != null)
				msgs = ((InternalEObject)newWhoBoolean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_BOOLEAN, null, msgs);
			msgs = basicSetWhoBoolean(newWhoBoolean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_BOOLEAN, newWhoBoolean, newWhoBoolean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getWhoInteger() {
		return whoInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoInteger(org.hl7.fhir.Integer newWhoInteger, NotificationChain msgs) {
		org.hl7.fhir.Integer oldWhoInteger = whoInteger;
		whoInteger = newWhoInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_INTEGER, oldWhoInteger, newWhoInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoInteger(org.hl7.fhir.Integer newWhoInteger) {
		if (newWhoInteger != whoInteger) {
			NotificationChain msgs = null;
			if (whoInteger != null)
				msgs = ((InternalEObject)whoInteger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_INTEGER, null, msgs);
			if (newWhoInteger != null)
				msgs = ((InternalEObject)newWhoInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_INTEGER, null, msgs);
			msgs = basicSetWhoInteger(newWhoInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_INTEGER, newWhoInteger, newWhoInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getWhoDecimal() {
		return whoDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoDecimal(Decimal newWhoDecimal, NotificationChain msgs) {
		Decimal oldWhoDecimal = whoDecimal;
		whoDecimal = newWhoDecimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_DECIMAL, oldWhoDecimal, newWhoDecimal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoDecimal(Decimal newWhoDecimal) {
		if (newWhoDecimal != whoDecimal) {
			NotificationChain msgs = null;
			if (whoDecimal != null)
				msgs = ((InternalEObject)whoDecimal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_DECIMAL, null, msgs);
			if (newWhoDecimal != null)
				msgs = ((InternalEObject)newWhoDecimal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_DECIMAL, null, msgs);
			msgs = basicSetWhoDecimal(newWhoDecimal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_DECIMAL, newWhoDecimal, newWhoDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getWhoBase64Binary() {
		return whoBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoBase64Binary(Base64Binary newWhoBase64Binary, NotificationChain msgs) {
		Base64Binary oldWhoBase64Binary = whoBase64Binary;
		whoBase64Binary = newWhoBase64Binary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_BASE64_BINARY, oldWhoBase64Binary, newWhoBase64Binary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoBase64Binary(Base64Binary newWhoBase64Binary) {
		if (newWhoBase64Binary != whoBase64Binary) {
			NotificationChain msgs = null;
			if (whoBase64Binary != null)
				msgs = ((InternalEObject)whoBase64Binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_BASE64_BINARY, null, msgs);
			if (newWhoBase64Binary != null)
				msgs = ((InternalEObject)newWhoBase64Binary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_BASE64_BINARY, null, msgs);
			msgs = basicSetWhoBase64Binary(newWhoBase64Binary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_BASE64_BINARY, newWhoBase64Binary, newWhoBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getWhoInstant() {
		return whoInstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoInstant(Instant newWhoInstant, NotificationChain msgs) {
		Instant oldWhoInstant = whoInstant;
		whoInstant = newWhoInstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_INSTANT, oldWhoInstant, newWhoInstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoInstant(Instant newWhoInstant) {
		if (newWhoInstant != whoInstant) {
			NotificationChain msgs = null;
			if (whoInstant != null)
				msgs = ((InternalEObject)whoInstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_INSTANT, null, msgs);
			if (newWhoInstant != null)
				msgs = ((InternalEObject)newWhoInstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_INSTANT, null, msgs);
			msgs = basicSetWhoInstant(newWhoInstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_INSTANT, newWhoInstant, newWhoInstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getWhoString() {
		return whoString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoString(org.hl7.fhir.String newWhoString, NotificationChain msgs) {
		org.hl7.fhir.String oldWhoString = whoString;
		whoString = newWhoString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_STRING, oldWhoString, newWhoString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoString(org.hl7.fhir.String newWhoString) {
		if (newWhoString != whoString) {
			NotificationChain msgs = null;
			if (whoString != null)
				msgs = ((InternalEObject)whoString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_STRING, null, msgs);
			if (newWhoString != null)
				msgs = ((InternalEObject)newWhoString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_STRING, null, msgs);
			msgs = basicSetWhoString(newWhoString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_STRING, newWhoString, newWhoString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getWhoUri() {
		return whoUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoUri(Uri newWhoUri, NotificationChain msgs) {
		Uri oldWhoUri = whoUri;
		whoUri = newWhoUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_URI, oldWhoUri, newWhoUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoUri(Uri newWhoUri) {
		if (newWhoUri != whoUri) {
			NotificationChain msgs = null;
			if (whoUri != null)
				msgs = ((InternalEObject)whoUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_URI, null, msgs);
			if (newWhoUri != null)
				msgs = ((InternalEObject)newWhoUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_URI, null, msgs);
			msgs = basicSetWhoUri(newWhoUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_URI, newWhoUri, newWhoUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getWhoDate() {
		return whoDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoDate(Date newWhoDate, NotificationChain msgs) {
		Date oldWhoDate = whoDate;
		whoDate = newWhoDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_DATE, oldWhoDate, newWhoDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoDate(Date newWhoDate) {
		if (newWhoDate != whoDate) {
			NotificationChain msgs = null;
			if (whoDate != null)
				msgs = ((InternalEObject)whoDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_DATE, null, msgs);
			if (newWhoDate != null)
				msgs = ((InternalEObject)newWhoDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_DATE, null, msgs);
			msgs = basicSetWhoDate(newWhoDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_DATE, newWhoDate, newWhoDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getWhoDateTime() {
		return whoDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoDateTime(DateTime newWhoDateTime, NotificationChain msgs) {
		DateTime oldWhoDateTime = whoDateTime;
		whoDateTime = newWhoDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_DATE_TIME, oldWhoDateTime, newWhoDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoDateTime(DateTime newWhoDateTime) {
		if (newWhoDateTime != whoDateTime) {
			NotificationChain msgs = null;
			if (whoDateTime != null)
				msgs = ((InternalEObject)whoDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_DATE_TIME, null, msgs);
			if (newWhoDateTime != null)
				msgs = ((InternalEObject)newWhoDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_DATE_TIME, null, msgs);
			msgs = basicSetWhoDateTime(newWhoDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_DATE_TIME, newWhoDateTime, newWhoDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getWhoTime() {
		return whoTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoTime(Time newWhoTime, NotificationChain msgs) {
		Time oldWhoTime = whoTime;
		whoTime = newWhoTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_TIME, oldWhoTime, newWhoTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoTime(Time newWhoTime) {
		if (newWhoTime != whoTime) {
			NotificationChain msgs = null;
			if (whoTime != null)
				msgs = ((InternalEObject)whoTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_TIME, null, msgs);
			if (newWhoTime != null)
				msgs = ((InternalEObject)newWhoTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_TIME, null, msgs);
			msgs = basicSetWhoTime(newWhoTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_TIME, newWhoTime, newWhoTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getWhoCode() {
		return whoCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoCode(Code newWhoCode, NotificationChain msgs) {
		Code oldWhoCode = whoCode;
		whoCode = newWhoCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_CODE, oldWhoCode, newWhoCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoCode(Code newWhoCode) {
		if (newWhoCode != whoCode) {
			NotificationChain msgs = null;
			if (whoCode != null)
				msgs = ((InternalEObject)whoCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_CODE, null, msgs);
			if (newWhoCode != null)
				msgs = ((InternalEObject)newWhoCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_CODE, null, msgs);
			msgs = basicSetWhoCode(newWhoCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_CODE, newWhoCode, newWhoCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getWhoOid() {
		return whoOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoOid(Oid newWhoOid, NotificationChain msgs) {
		Oid oldWhoOid = whoOid;
		whoOid = newWhoOid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_OID, oldWhoOid, newWhoOid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoOid(Oid newWhoOid) {
		if (newWhoOid != whoOid) {
			NotificationChain msgs = null;
			if (whoOid != null)
				msgs = ((InternalEObject)whoOid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_OID, null, msgs);
			if (newWhoOid != null)
				msgs = ((InternalEObject)newWhoOid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_OID, null, msgs);
			msgs = basicSetWhoOid(newWhoOid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_OID, newWhoOid, newWhoOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid getWhoUuid() {
		return whoUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoUuid(Uuid newWhoUuid, NotificationChain msgs) {
		Uuid oldWhoUuid = whoUuid;
		whoUuid = newWhoUuid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_UUID, oldWhoUuid, newWhoUuid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoUuid(Uuid newWhoUuid) {
		if (newWhoUuid != whoUuid) {
			NotificationChain msgs = null;
			if (whoUuid != null)
				msgs = ((InternalEObject)whoUuid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_UUID, null, msgs);
			if (newWhoUuid != null)
				msgs = ((InternalEObject)newWhoUuid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_UUID, null, msgs);
			msgs = basicSetWhoUuid(newWhoUuid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_UUID, newWhoUuid, newWhoUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getWhoId() {
		return whoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoId(Id newWhoId, NotificationChain msgs) {
		Id oldWhoId = whoId;
		whoId = newWhoId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_ID, oldWhoId, newWhoId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoId(Id newWhoId) {
		if (newWhoId != whoId) {
			NotificationChain msgs = null;
			if (whoId != null)
				msgs = ((InternalEObject)whoId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_ID, null, msgs);
			if (newWhoId != null)
				msgs = ((InternalEObject)newWhoId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_ID, null, msgs);
			msgs = basicSetWhoId(newWhoId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_ID, newWhoId, newWhoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getWhoUnsignedInt() {
		return whoUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoUnsignedInt(UnsignedInt newWhoUnsignedInt, NotificationChain msgs) {
		UnsignedInt oldWhoUnsignedInt = whoUnsignedInt;
		whoUnsignedInt = newWhoUnsignedInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_UNSIGNED_INT, oldWhoUnsignedInt, newWhoUnsignedInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoUnsignedInt(UnsignedInt newWhoUnsignedInt) {
		if (newWhoUnsignedInt != whoUnsignedInt) {
			NotificationChain msgs = null;
			if (whoUnsignedInt != null)
				msgs = ((InternalEObject)whoUnsignedInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_UNSIGNED_INT, null, msgs);
			if (newWhoUnsignedInt != null)
				msgs = ((InternalEObject)newWhoUnsignedInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_UNSIGNED_INT, null, msgs);
			msgs = basicSetWhoUnsignedInt(newWhoUnsignedInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_UNSIGNED_INT, newWhoUnsignedInt, newWhoUnsignedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getWhoPositiveInt() {
		return whoPositiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoPositiveInt(PositiveInt newWhoPositiveInt, NotificationChain msgs) {
		PositiveInt oldWhoPositiveInt = whoPositiveInt;
		whoPositiveInt = newWhoPositiveInt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_POSITIVE_INT, oldWhoPositiveInt, newWhoPositiveInt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoPositiveInt(PositiveInt newWhoPositiveInt) {
		if (newWhoPositiveInt != whoPositiveInt) {
			NotificationChain msgs = null;
			if (whoPositiveInt != null)
				msgs = ((InternalEObject)whoPositiveInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_POSITIVE_INT, null, msgs);
			if (newWhoPositiveInt != null)
				msgs = ((InternalEObject)newWhoPositiveInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_POSITIVE_INT, null, msgs);
			msgs = basicSetWhoPositiveInt(newWhoPositiveInt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_POSITIVE_INT, newWhoPositiveInt, newWhoPositiveInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment getWhoAttachment() {
		return whoAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoAttachment(Attachment newWhoAttachment, NotificationChain msgs) {
		Attachment oldWhoAttachment = whoAttachment;
		whoAttachment = newWhoAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_ATTACHMENT, oldWhoAttachment, newWhoAttachment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoAttachment(Attachment newWhoAttachment) {
		if (newWhoAttachment != whoAttachment) {
			NotificationChain msgs = null;
			if (whoAttachment != null)
				msgs = ((InternalEObject)whoAttachment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_ATTACHMENT, null, msgs);
			if (newWhoAttachment != null)
				msgs = ((InternalEObject)newWhoAttachment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_ATTACHMENT, null, msgs);
			msgs = basicSetWhoAttachment(newWhoAttachment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_ATTACHMENT, newWhoAttachment, newWhoAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getWhoIdentifier() {
		return whoIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoIdentifier(Identifier newWhoIdentifier, NotificationChain msgs) {
		Identifier oldWhoIdentifier = whoIdentifier;
		whoIdentifier = newWhoIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_IDENTIFIER, oldWhoIdentifier, newWhoIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoIdentifier(Identifier newWhoIdentifier) {
		if (newWhoIdentifier != whoIdentifier) {
			NotificationChain msgs = null;
			if (whoIdentifier != null)
				msgs = ((InternalEObject)whoIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_IDENTIFIER, null, msgs);
			if (newWhoIdentifier != null)
				msgs = ((InternalEObject)newWhoIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_IDENTIFIER, null, msgs);
			msgs = basicSetWhoIdentifier(newWhoIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_IDENTIFIER, newWhoIdentifier, newWhoIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getWhoCodeableConcept() {
		return whoCodeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoCodeableConcept(CodeableConcept newWhoCodeableConcept, NotificationChain msgs) {
		CodeableConcept oldWhoCodeableConcept = whoCodeableConcept;
		whoCodeableConcept = newWhoCodeableConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_CODEABLE_CONCEPT, oldWhoCodeableConcept, newWhoCodeableConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoCodeableConcept(CodeableConcept newWhoCodeableConcept) {
		if (newWhoCodeableConcept != whoCodeableConcept) {
			NotificationChain msgs = null;
			if (whoCodeableConcept != null)
				msgs = ((InternalEObject)whoCodeableConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_CODEABLE_CONCEPT, null, msgs);
			if (newWhoCodeableConcept != null)
				msgs = ((InternalEObject)newWhoCodeableConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_CODEABLE_CONCEPT, null, msgs);
			msgs = basicSetWhoCodeableConcept(newWhoCodeableConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_CODEABLE_CONCEPT, newWhoCodeableConcept, newWhoCodeableConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getWhoCoding() {
		return whoCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoCoding(Coding newWhoCoding, NotificationChain msgs) {
		Coding oldWhoCoding = whoCoding;
		whoCoding = newWhoCoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_CODING, oldWhoCoding, newWhoCoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoCoding(Coding newWhoCoding) {
		if (newWhoCoding != whoCoding) {
			NotificationChain msgs = null;
			if (whoCoding != null)
				msgs = ((InternalEObject)whoCoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_CODING, null, msgs);
			if (newWhoCoding != null)
				msgs = ((InternalEObject)newWhoCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_CODING, null, msgs);
			msgs = basicSetWhoCoding(newWhoCoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_CODING, newWhoCoding, newWhoCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getWhoQuantity() {
		return whoQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoQuantity(Quantity newWhoQuantity, NotificationChain msgs) {
		Quantity oldWhoQuantity = whoQuantity;
		whoQuantity = newWhoQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_QUANTITY, oldWhoQuantity, newWhoQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoQuantity(Quantity newWhoQuantity) {
		if (newWhoQuantity != whoQuantity) {
			NotificationChain msgs = null;
			if (whoQuantity != null)
				msgs = ((InternalEObject)whoQuantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_QUANTITY, null, msgs);
			if (newWhoQuantity != null)
				msgs = ((InternalEObject)newWhoQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_QUANTITY, null, msgs);
			msgs = basicSetWhoQuantity(newWhoQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_QUANTITY, newWhoQuantity, newWhoQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getWhoRange() {
		return whoRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoRange(Range newWhoRange, NotificationChain msgs) {
		Range oldWhoRange = whoRange;
		whoRange = newWhoRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_RANGE, oldWhoRange, newWhoRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoRange(Range newWhoRange) {
		if (newWhoRange != whoRange) {
			NotificationChain msgs = null;
			if (whoRange != null)
				msgs = ((InternalEObject)whoRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_RANGE, null, msgs);
			if (newWhoRange != null)
				msgs = ((InternalEObject)newWhoRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_RANGE, null, msgs);
			msgs = basicSetWhoRange(newWhoRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_RANGE, newWhoRange, newWhoRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getWhoPeriod() {
		return whoPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoPeriod(Period newWhoPeriod, NotificationChain msgs) {
		Period oldWhoPeriod = whoPeriod;
		whoPeriod = newWhoPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_PERIOD, oldWhoPeriod, newWhoPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoPeriod(Period newWhoPeriod) {
		if (newWhoPeriod != whoPeriod) {
			NotificationChain msgs = null;
			if (whoPeriod != null)
				msgs = ((InternalEObject)whoPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_PERIOD, null, msgs);
			if (newWhoPeriod != null)
				msgs = ((InternalEObject)newWhoPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_PERIOD, null, msgs);
			msgs = basicSetWhoPeriod(newWhoPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_PERIOD, newWhoPeriod, newWhoPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getWhoRatio() {
		return whoRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoRatio(Ratio newWhoRatio, NotificationChain msgs) {
		Ratio oldWhoRatio = whoRatio;
		whoRatio = newWhoRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_RATIO, oldWhoRatio, newWhoRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoRatio(Ratio newWhoRatio) {
		if (newWhoRatio != whoRatio) {
			NotificationChain msgs = null;
			if (whoRatio != null)
				msgs = ((InternalEObject)whoRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_RATIO, null, msgs);
			if (newWhoRatio != null)
				msgs = ((InternalEObject)newWhoRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_RATIO, null, msgs);
			msgs = basicSetWhoRatio(newWhoRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_RATIO, newWhoRatio, newWhoRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getWhoReference() {
		return whoReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoReference(Reference newWhoReference, NotificationChain msgs) {
		Reference oldWhoReference = whoReference;
		whoReference = newWhoReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_REFERENCE, oldWhoReference, newWhoReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoReference(Reference newWhoReference) {
		if (newWhoReference != whoReference) {
			NotificationChain msgs = null;
			if (whoReference != null)
				msgs = ((InternalEObject)whoReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_REFERENCE, null, msgs);
			if (newWhoReference != null)
				msgs = ((InternalEObject)newWhoReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_REFERENCE, null, msgs);
			msgs = basicSetWhoReference(newWhoReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_REFERENCE, newWhoReference, newWhoReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData getWhoSampledData() {
		return whoSampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoSampledData(SampledData newWhoSampledData, NotificationChain msgs) {
		SampledData oldWhoSampledData = whoSampledData;
		whoSampledData = newWhoSampledData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_SAMPLED_DATA, oldWhoSampledData, newWhoSampledData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoSampledData(SampledData newWhoSampledData) {
		if (newWhoSampledData != whoSampledData) {
			NotificationChain msgs = null;
			if (whoSampledData != null)
				msgs = ((InternalEObject)whoSampledData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_SAMPLED_DATA, null, msgs);
			if (newWhoSampledData != null)
				msgs = ((InternalEObject)newWhoSampledData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_SAMPLED_DATA, null, msgs);
			msgs = basicSetWhoSampledData(newWhoSampledData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_SAMPLED_DATA, newWhoSampledData, newWhoSampledData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getWhoSignature() {
		return whoSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoSignature(Signature newWhoSignature, NotificationChain msgs) {
		Signature oldWhoSignature = whoSignature;
		whoSignature = newWhoSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_SIGNATURE, oldWhoSignature, newWhoSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoSignature(Signature newWhoSignature) {
		if (newWhoSignature != whoSignature) {
			NotificationChain msgs = null;
			if (whoSignature != null)
				msgs = ((InternalEObject)whoSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_SIGNATURE, null, msgs);
			if (newWhoSignature != null)
				msgs = ((InternalEObject)newWhoSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_SIGNATURE, null, msgs);
			msgs = basicSetWhoSignature(newWhoSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_SIGNATURE, newWhoSignature, newWhoSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName getWhoHumanName() {
		return whoHumanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoHumanName(HumanName newWhoHumanName, NotificationChain msgs) {
		HumanName oldWhoHumanName = whoHumanName;
		whoHumanName = newWhoHumanName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_HUMAN_NAME, oldWhoHumanName, newWhoHumanName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoHumanName(HumanName newWhoHumanName) {
		if (newWhoHumanName != whoHumanName) {
			NotificationChain msgs = null;
			if (whoHumanName != null)
				msgs = ((InternalEObject)whoHumanName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_HUMAN_NAME, null, msgs);
			if (newWhoHumanName != null)
				msgs = ((InternalEObject)newWhoHumanName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_HUMAN_NAME, null, msgs);
			msgs = basicSetWhoHumanName(newWhoHumanName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_HUMAN_NAME, newWhoHumanName, newWhoHumanName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getWhoAddress() {
		return whoAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoAddress(Address newWhoAddress, NotificationChain msgs) {
		Address oldWhoAddress = whoAddress;
		whoAddress = newWhoAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_ADDRESS, oldWhoAddress, newWhoAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoAddress(Address newWhoAddress) {
		if (newWhoAddress != whoAddress) {
			NotificationChain msgs = null;
			if (whoAddress != null)
				msgs = ((InternalEObject)whoAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_ADDRESS, null, msgs);
			if (newWhoAddress != null)
				msgs = ((InternalEObject)newWhoAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_ADDRESS, null, msgs);
			msgs = basicSetWhoAddress(newWhoAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_ADDRESS, newWhoAddress, newWhoAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint getWhoContactPoint() {
		return whoContactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoContactPoint(ContactPoint newWhoContactPoint, NotificationChain msgs) {
		ContactPoint oldWhoContactPoint = whoContactPoint;
		whoContactPoint = newWhoContactPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_CONTACT_POINT, oldWhoContactPoint, newWhoContactPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoContactPoint(ContactPoint newWhoContactPoint) {
		if (newWhoContactPoint != whoContactPoint) {
			NotificationChain msgs = null;
			if (whoContactPoint != null)
				msgs = ((InternalEObject)whoContactPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_CONTACT_POINT, null, msgs);
			if (newWhoContactPoint != null)
				msgs = ((InternalEObject)newWhoContactPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_CONTACT_POINT, null, msgs);
			msgs = basicSetWhoContactPoint(newWhoContactPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_CONTACT_POINT, newWhoContactPoint, newWhoContactPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing getWhoTiming() {
		return whoTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoTiming(Timing newWhoTiming, NotificationChain msgs) {
		Timing oldWhoTiming = whoTiming;
		whoTiming = newWhoTiming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_TIMING, oldWhoTiming, newWhoTiming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoTiming(Timing newWhoTiming) {
		if (newWhoTiming != whoTiming) {
			NotificationChain msgs = null;
			if (whoTiming != null)
				msgs = ((InternalEObject)whoTiming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_TIMING, null, msgs);
			if (newWhoTiming != null)
				msgs = ((InternalEObject)newWhoTiming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_TIMING, null, msgs);
			msgs = basicSetWhoTiming(newWhoTiming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_TIMING, newWhoTiming, newWhoTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta getWhoMeta() {
		return whoMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhoMeta(Meta newWhoMeta, NotificationChain msgs) {
		Meta oldWhoMeta = whoMeta;
		whoMeta = newWhoMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_META, oldWhoMeta, newWhoMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhoMeta(Meta newWhoMeta) {
		if (newWhoMeta != whoMeta) {
			NotificationChain msgs = null;
			if (whoMeta != null)
				msgs = ((InternalEObject)whoMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_META, null, msgs);
			if (newWhoMeta != null)
				msgs = ((InternalEObject)newWhoMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__WHO_META, null, msgs);
			msgs = basicSetWhoMeta(newWhoMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__WHO_META, newWhoMeta, newWhoMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getBlob() {
		return blob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlob(Base64Binary newBlob, NotificationChain msgs) {
		Base64Binary oldBlob = blob;
		blob = newBlob;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__BLOB, oldBlob, newBlob);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlob(Base64Binary newBlob) {
		if (newBlob != blob) {
			NotificationChain msgs = null;
			if (blob != null)
				msgs = ((InternalEObject)blob).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__BLOB, null, msgs);
			if (newBlob != null)
				msgs = ((InternalEObject)newBlob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SIGNATURE__BLOB, null, msgs);
			msgs = basicSetBlob(newBlob, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SIGNATURE__BLOB, newBlob, newBlob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SIGNATURE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.SIGNATURE__WHEN:
				return basicSetWhen(null, msgs);
			case FhirPackage.SIGNATURE__WHO_BOOLEAN:
				return basicSetWhoBoolean(null, msgs);
			case FhirPackage.SIGNATURE__WHO_INTEGER:
				return basicSetWhoInteger(null, msgs);
			case FhirPackage.SIGNATURE__WHO_DECIMAL:
				return basicSetWhoDecimal(null, msgs);
			case FhirPackage.SIGNATURE__WHO_BASE64_BINARY:
				return basicSetWhoBase64Binary(null, msgs);
			case FhirPackage.SIGNATURE__WHO_INSTANT:
				return basicSetWhoInstant(null, msgs);
			case FhirPackage.SIGNATURE__WHO_STRING:
				return basicSetWhoString(null, msgs);
			case FhirPackage.SIGNATURE__WHO_URI:
				return basicSetWhoUri(null, msgs);
			case FhirPackage.SIGNATURE__WHO_DATE:
				return basicSetWhoDate(null, msgs);
			case FhirPackage.SIGNATURE__WHO_DATE_TIME:
				return basicSetWhoDateTime(null, msgs);
			case FhirPackage.SIGNATURE__WHO_TIME:
				return basicSetWhoTime(null, msgs);
			case FhirPackage.SIGNATURE__WHO_CODE:
				return basicSetWhoCode(null, msgs);
			case FhirPackage.SIGNATURE__WHO_OID:
				return basicSetWhoOid(null, msgs);
			case FhirPackage.SIGNATURE__WHO_UUID:
				return basicSetWhoUuid(null, msgs);
			case FhirPackage.SIGNATURE__WHO_ID:
				return basicSetWhoId(null, msgs);
			case FhirPackage.SIGNATURE__WHO_UNSIGNED_INT:
				return basicSetWhoUnsignedInt(null, msgs);
			case FhirPackage.SIGNATURE__WHO_POSITIVE_INT:
				return basicSetWhoPositiveInt(null, msgs);
			case FhirPackage.SIGNATURE__WHO_ATTACHMENT:
				return basicSetWhoAttachment(null, msgs);
			case FhirPackage.SIGNATURE__WHO_IDENTIFIER:
				return basicSetWhoIdentifier(null, msgs);
			case FhirPackage.SIGNATURE__WHO_CODEABLE_CONCEPT:
				return basicSetWhoCodeableConcept(null, msgs);
			case FhirPackage.SIGNATURE__WHO_CODING:
				return basicSetWhoCoding(null, msgs);
			case FhirPackage.SIGNATURE__WHO_QUANTITY:
				return basicSetWhoQuantity(null, msgs);
			case FhirPackage.SIGNATURE__WHO_RANGE:
				return basicSetWhoRange(null, msgs);
			case FhirPackage.SIGNATURE__WHO_PERIOD:
				return basicSetWhoPeriod(null, msgs);
			case FhirPackage.SIGNATURE__WHO_RATIO:
				return basicSetWhoRatio(null, msgs);
			case FhirPackage.SIGNATURE__WHO_REFERENCE:
				return basicSetWhoReference(null, msgs);
			case FhirPackage.SIGNATURE__WHO_SAMPLED_DATA:
				return basicSetWhoSampledData(null, msgs);
			case FhirPackage.SIGNATURE__WHO_SIGNATURE:
				return basicSetWhoSignature(null, msgs);
			case FhirPackage.SIGNATURE__WHO_HUMAN_NAME:
				return basicSetWhoHumanName(null, msgs);
			case FhirPackage.SIGNATURE__WHO_ADDRESS:
				return basicSetWhoAddress(null, msgs);
			case FhirPackage.SIGNATURE__WHO_CONTACT_POINT:
				return basicSetWhoContactPoint(null, msgs);
			case FhirPackage.SIGNATURE__WHO_TIMING:
				return basicSetWhoTiming(null, msgs);
			case FhirPackage.SIGNATURE__WHO_META:
				return basicSetWhoMeta(null, msgs);
			case FhirPackage.SIGNATURE__BLOB:
				return basicSetBlob(null, msgs);
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
			case FhirPackage.SIGNATURE__TYPE:
				return getType();
			case FhirPackage.SIGNATURE__WHEN:
				return getWhen();
			case FhirPackage.SIGNATURE__WHO_BOOLEAN:
				return getWhoBoolean();
			case FhirPackage.SIGNATURE__WHO_INTEGER:
				return getWhoInteger();
			case FhirPackage.SIGNATURE__WHO_DECIMAL:
				return getWhoDecimal();
			case FhirPackage.SIGNATURE__WHO_BASE64_BINARY:
				return getWhoBase64Binary();
			case FhirPackage.SIGNATURE__WHO_INSTANT:
				return getWhoInstant();
			case FhirPackage.SIGNATURE__WHO_STRING:
				return getWhoString();
			case FhirPackage.SIGNATURE__WHO_URI:
				return getWhoUri();
			case FhirPackage.SIGNATURE__WHO_DATE:
				return getWhoDate();
			case FhirPackage.SIGNATURE__WHO_DATE_TIME:
				return getWhoDateTime();
			case FhirPackage.SIGNATURE__WHO_TIME:
				return getWhoTime();
			case FhirPackage.SIGNATURE__WHO_CODE:
				return getWhoCode();
			case FhirPackage.SIGNATURE__WHO_OID:
				return getWhoOid();
			case FhirPackage.SIGNATURE__WHO_UUID:
				return getWhoUuid();
			case FhirPackage.SIGNATURE__WHO_ID:
				return getWhoId();
			case FhirPackage.SIGNATURE__WHO_UNSIGNED_INT:
				return getWhoUnsignedInt();
			case FhirPackage.SIGNATURE__WHO_POSITIVE_INT:
				return getWhoPositiveInt();
			case FhirPackage.SIGNATURE__WHO_ATTACHMENT:
				return getWhoAttachment();
			case FhirPackage.SIGNATURE__WHO_IDENTIFIER:
				return getWhoIdentifier();
			case FhirPackage.SIGNATURE__WHO_CODEABLE_CONCEPT:
				return getWhoCodeableConcept();
			case FhirPackage.SIGNATURE__WHO_CODING:
				return getWhoCoding();
			case FhirPackage.SIGNATURE__WHO_QUANTITY:
				return getWhoQuantity();
			case FhirPackage.SIGNATURE__WHO_RANGE:
				return getWhoRange();
			case FhirPackage.SIGNATURE__WHO_PERIOD:
				return getWhoPeriod();
			case FhirPackage.SIGNATURE__WHO_RATIO:
				return getWhoRatio();
			case FhirPackage.SIGNATURE__WHO_REFERENCE:
				return getWhoReference();
			case FhirPackage.SIGNATURE__WHO_SAMPLED_DATA:
				return getWhoSampledData();
			case FhirPackage.SIGNATURE__WHO_SIGNATURE:
				return getWhoSignature();
			case FhirPackage.SIGNATURE__WHO_HUMAN_NAME:
				return getWhoHumanName();
			case FhirPackage.SIGNATURE__WHO_ADDRESS:
				return getWhoAddress();
			case FhirPackage.SIGNATURE__WHO_CONTACT_POINT:
				return getWhoContactPoint();
			case FhirPackage.SIGNATURE__WHO_TIMING:
				return getWhoTiming();
			case FhirPackage.SIGNATURE__WHO_META:
				return getWhoMeta();
			case FhirPackage.SIGNATURE__BLOB:
				return getBlob();
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
			case FhirPackage.SIGNATURE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.SIGNATURE__WHEN:
				setWhen((Instant)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_BOOLEAN:
				setWhoBoolean((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_INTEGER:
				setWhoInteger((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_DECIMAL:
				setWhoDecimal((Decimal)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_BASE64_BINARY:
				setWhoBase64Binary((Base64Binary)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_INSTANT:
				setWhoInstant((Instant)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_STRING:
				setWhoString((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_URI:
				setWhoUri((Uri)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_DATE:
				setWhoDate((Date)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_DATE_TIME:
				setWhoDateTime((DateTime)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_TIME:
				setWhoTime((Time)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_CODE:
				setWhoCode((Code)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_OID:
				setWhoOid((Oid)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_UUID:
				setWhoUuid((Uuid)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_ID:
				setWhoId((Id)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_UNSIGNED_INT:
				setWhoUnsignedInt((UnsignedInt)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_POSITIVE_INT:
				setWhoPositiveInt((PositiveInt)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_ATTACHMENT:
				setWhoAttachment((Attachment)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_IDENTIFIER:
				setWhoIdentifier((Identifier)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_CODEABLE_CONCEPT:
				setWhoCodeableConcept((CodeableConcept)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_CODING:
				setWhoCoding((Coding)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_QUANTITY:
				setWhoQuantity((Quantity)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_RANGE:
				setWhoRange((Range)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_PERIOD:
				setWhoPeriod((Period)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_RATIO:
				setWhoRatio((Ratio)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_REFERENCE:
				setWhoReference((Reference)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_SAMPLED_DATA:
				setWhoSampledData((SampledData)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_SIGNATURE:
				setWhoSignature((Signature)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_HUMAN_NAME:
				setWhoHumanName((HumanName)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_ADDRESS:
				setWhoAddress((Address)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_CONTACT_POINT:
				setWhoContactPoint((ContactPoint)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_TIMING:
				setWhoTiming((Timing)newValue);
				return;
			case FhirPackage.SIGNATURE__WHO_META:
				setWhoMeta((Meta)newValue);
				return;
			case FhirPackage.SIGNATURE__BLOB:
				setBlob((Base64Binary)newValue);
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
			case FhirPackage.SIGNATURE__TYPE:
				getType().clear();
				return;
			case FhirPackage.SIGNATURE__WHEN:
				setWhen((Instant)null);
				return;
			case FhirPackage.SIGNATURE__WHO_BOOLEAN:
				setWhoBoolean((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SIGNATURE__WHO_INTEGER:
				setWhoInteger((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.SIGNATURE__WHO_DECIMAL:
				setWhoDecimal((Decimal)null);
				return;
			case FhirPackage.SIGNATURE__WHO_BASE64_BINARY:
				setWhoBase64Binary((Base64Binary)null);
				return;
			case FhirPackage.SIGNATURE__WHO_INSTANT:
				setWhoInstant((Instant)null);
				return;
			case FhirPackage.SIGNATURE__WHO_STRING:
				setWhoString((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SIGNATURE__WHO_URI:
				setWhoUri((Uri)null);
				return;
			case FhirPackage.SIGNATURE__WHO_DATE:
				setWhoDate((Date)null);
				return;
			case FhirPackage.SIGNATURE__WHO_DATE_TIME:
				setWhoDateTime((DateTime)null);
				return;
			case FhirPackage.SIGNATURE__WHO_TIME:
				setWhoTime((Time)null);
				return;
			case FhirPackage.SIGNATURE__WHO_CODE:
				setWhoCode((Code)null);
				return;
			case FhirPackage.SIGNATURE__WHO_OID:
				setWhoOid((Oid)null);
				return;
			case FhirPackage.SIGNATURE__WHO_UUID:
				setWhoUuid((Uuid)null);
				return;
			case FhirPackage.SIGNATURE__WHO_ID:
				setWhoId((Id)null);
				return;
			case FhirPackage.SIGNATURE__WHO_UNSIGNED_INT:
				setWhoUnsignedInt((UnsignedInt)null);
				return;
			case FhirPackage.SIGNATURE__WHO_POSITIVE_INT:
				setWhoPositiveInt((PositiveInt)null);
				return;
			case FhirPackage.SIGNATURE__WHO_ATTACHMENT:
				setWhoAttachment((Attachment)null);
				return;
			case FhirPackage.SIGNATURE__WHO_IDENTIFIER:
				setWhoIdentifier((Identifier)null);
				return;
			case FhirPackage.SIGNATURE__WHO_CODEABLE_CONCEPT:
				setWhoCodeableConcept((CodeableConcept)null);
				return;
			case FhirPackage.SIGNATURE__WHO_CODING:
				setWhoCoding((Coding)null);
				return;
			case FhirPackage.SIGNATURE__WHO_QUANTITY:
				setWhoQuantity((Quantity)null);
				return;
			case FhirPackage.SIGNATURE__WHO_RANGE:
				setWhoRange((Range)null);
				return;
			case FhirPackage.SIGNATURE__WHO_PERIOD:
				setWhoPeriod((Period)null);
				return;
			case FhirPackage.SIGNATURE__WHO_RATIO:
				setWhoRatio((Ratio)null);
				return;
			case FhirPackage.SIGNATURE__WHO_REFERENCE:
				setWhoReference((Reference)null);
				return;
			case FhirPackage.SIGNATURE__WHO_SAMPLED_DATA:
				setWhoSampledData((SampledData)null);
				return;
			case FhirPackage.SIGNATURE__WHO_SIGNATURE:
				setWhoSignature((Signature)null);
				return;
			case FhirPackage.SIGNATURE__WHO_HUMAN_NAME:
				setWhoHumanName((HumanName)null);
				return;
			case FhirPackage.SIGNATURE__WHO_ADDRESS:
				setWhoAddress((Address)null);
				return;
			case FhirPackage.SIGNATURE__WHO_CONTACT_POINT:
				setWhoContactPoint((ContactPoint)null);
				return;
			case FhirPackage.SIGNATURE__WHO_TIMING:
				setWhoTiming((Timing)null);
				return;
			case FhirPackage.SIGNATURE__WHO_META:
				setWhoMeta((Meta)null);
				return;
			case FhirPackage.SIGNATURE__BLOB:
				setBlob((Base64Binary)null);
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
			case FhirPackage.SIGNATURE__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.SIGNATURE__WHEN:
				return when != null;
			case FhirPackage.SIGNATURE__WHO_BOOLEAN:
				return whoBoolean != null;
			case FhirPackage.SIGNATURE__WHO_INTEGER:
				return whoInteger != null;
			case FhirPackage.SIGNATURE__WHO_DECIMAL:
				return whoDecimal != null;
			case FhirPackage.SIGNATURE__WHO_BASE64_BINARY:
				return whoBase64Binary != null;
			case FhirPackage.SIGNATURE__WHO_INSTANT:
				return whoInstant != null;
			case FhirPackage.SIGNATURE__WHO_STRING:
				return whoString != null;
			case FhirPackage.SIGNATURE__WHO_URI:
				return whoUri != null;
			case FhirPackage.SIGNATURE__WHO_DATE:
				return whoDate != null;
			case FhirPackage.SIGNATURE__WHO_DATE_TIME:
				return whoDateTime != null;
			case FhirPackage.SIGNATURE__WHO_TIME:
				return whoTime != null;
			case FhirPackage.SIGNATURE__WHO_CODE:
				return whoCode != null;
			case FhirPackage.SIGNATURE__WHO_OID:
				return whoOid != null;
			case FhirPackage.SIGNATURE__WHO_UUID:
				return whoUuid != null;
			case FhirPackage.SIGNATURE__WHO_ID:
				return whoId != null;
			case FhirPackage.SIGNATURE__WHO_UNSIGNED_INT:
				return whoUnsignedInt != null;
			case FhirPackage.SIGNATURE__WHO_POSITIVE_INT:
				return whoPositiveInt != null;
			case FhirPackage.SIGNATURE__WHO_ATTACHMENT:
				return whoAttachment != null;
			case FhirPackage.SIGNATURE__WHO_IDENTIFIER:
				return whoIdentifier != null;
			case FhirPackage.SIGNATURE__WHO_CODEABLE_CONCEPT:
				return whoCodeableConcept != null;
			case FhirPackage.SIGNATURE__WHO_CODING:
				return whoCoding != null;
			case FhirPackage.SIGNATURE__WHO_QUANTITY:
				return whoQuantity != null;
			case FhirPackage.SIGNATURE__WHO_RANGE:
				return whoRange != null;
			case FhirPackage.SIGNATURE__WHO_PERIOD:
				return whoPeriod != null;
			case FhirPackage.SIGNATURE__WHO_RATIO:
				return whoRatio != null;
			case FhirPackage.SIGNATURE__WHO_REFERENCE:
				return whoReference != null;
			case FhirPackage.SIGNATURE__WHO_SAMPLED_DATA:
				return whoSampledData != null;
			case FhirPackage.SIGNATURE__WHO_SIGNATURE:
				return whoSignature != null;
			case FhirPackage.SIGNATURE__WHO_HUMAN_NAME:
				return whoHumanName != null;
			case FhirPackage.SIGNATURE__WHO_ADDRESS:
				return whoAddress != null;
			case FhirPackage.SIGNATURE__WHO_CONTACT_POINT:
				return whoContactPoint != null;
			case FhirPackage.SIGNATURE__WHO_TIMING:
				return whoTiming != null;
			case FhirPackage.SIGNATURE__WHO_META:
				return whoMeta != null;
			case FhirPackage.SIGNATURE__BLOB:
				return blob != null;
		}
		return super.eIsSet(featureID);
	}

} //SignatureImpl
