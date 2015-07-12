/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An XML digital signature along with supporting context.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Signature#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhen <em>When</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoBoolean <em>Who Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoInteger <em>Who Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoDecimal <em>Who Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoBase64Binary <em>Who Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoInstant <em>Who Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoString <em>Who String</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoUri <em>Who Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoDate <em>Who Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoDateTime <em>Who Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoTime <em>Who Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoCode <em>Who Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoOid <em>Who Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoUuid <em>Who Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoId <em>Who Id</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoUnsignedInt <em>Who Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoPositiveInt <em>Who Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoAttachment <em>Who Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoIdentifier <em>Who Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoCodeableConcept <em>Who Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoCoding <em>Who Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoQuantity <em>Who Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoRange <em>Who Range</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoPeriod <em>Who Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoRatio <em>Who Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoReference <em>Who Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoSampledData <em>Who Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoSignature <em>Who Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoHumanName <em>Who Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoAddress <em>Who Address</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoContactPoint <em>Who Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoTiming <em>Who Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getWhoMeta <em>Who Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.Signature#getBlob <em>Blob</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSignature()
 * @model extendedMetaData="name='Signature' kind='elementOnly'"
 * @generated
 */
public interface Signature extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication of the reason that the entity signed this document. This may be explicitly included as part of the signature information and can be used when determining accountability for various actions concerning the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSignature_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getType();

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the digital signature was signed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(Instant)
	 * @see org.hl7.fhir.FhirPackage#getSignature_When()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getWhen();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Instant value);

	/**
	 * Returns the value of the '<em><b>Who Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Boolean</em>' containment reference.
	 * @see #setWhoBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getWhoBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoBoolean <em>Who Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Boolean</em>' containment reference.
	 * @see #getWhoBoolean()
	 * @generated
	 */
	void setWhoBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Who Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Integer</em>' containment reference.
	 * @see #setWhoInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getWhoInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoInteger <em>Who Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Integer</em>' containment reference.
	 * @see #getWhoInteger()
	 * @generated
	 */
	void setWhoInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Who Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Decimal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Decimal</em>' containment reference.
	 * @see #setWhoDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getWhoDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoDecimal <em>Who Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Decimal</em>' containment reference.
	 * @see #getWhoDecimal()
	 * @generated
	 */
	void setWhoDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Who Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Base64 Binary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Base64 Binary</em>' containment reference.
	 * @see #setWhoBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getWhoBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoBase64Binary <em>Who Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Base64 Binary</em>' containment reference.
	 * @see #getWhoBase64Binary()
	 * @generated
	 */
	void setWhoBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Who Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Instant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Instant</em>' containment reference.
	 * @see #setWhoInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getWhoInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoInstant <em>Who Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Instant</em>' containment reference.
	 * @see #getWhoInstant()
	 * @generated
	 */
	void setWhoInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Who String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who String</em>' containment reference.
	 * @see #setWhoString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getWhoString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoString <em>Who String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who String</em>' containment reference.
	 * @see #getWhoString()
	 * @generated
	 */
	void setWhoString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Who Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Uri</em>' containment reference.
	 * @see #setWhoUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getWhoUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoUri <em>Who Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Uri</em>' containment reference.
	 * @see #getWhoUri()
	 * @generated
	 */
	void setWhoUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Who Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Date</em>' containment reference.
	 * @see #setWhoDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getWhoDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoDate <em>Who Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Date</em>' containment reference.
	 * @see #getWhoDate()
	 * @generated
	 */
	void setWhoDate(Date value);

	/**
	 * Returns the value of the '<em><b>Who Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Date Time</em>' containment reference.
	 * @see #setWhoDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getWhoDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoDateTime <em>Who Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Date Time</em>' containment reference.
	 * @see #getWhoDateTime()
	 * @generated
	 */
	void setWhoDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Who Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Time</em>' containment reference.
	 * @see #setWhoTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getWhoTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoTime <em>Who Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Time</em>' containment reference.
	 * @see #getWhoTime()
	 * @generated
	 */
	void setWhoTime(Time value);

	/**
	 * Returns the value of the '<em><b>Who Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Code</em>' containment reference.
	 * @see #setWhoCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getWhoCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoCode <em>Who Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Code</em>' containment reference.
	 * @see #getWhoCode()
	 * @generated
	 */
	void setWhoCode(Code value);

	/**
	 * Returns the value of the '<em><b>Who Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Oid</em>' containment reference.
	 * @see #setWhoOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getWhoOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoOid <em>Who Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Oid</em>' containment reference.
	 * @see #getWhoOid()
	 * @generated
	 */
	void setWhoOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Who Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Uuid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Uuid</em>' containment reference.
	 * @see #setWhoUuid(Uuid)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getWhoUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoUuid <em>Who Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Uuid</em>' containment reference.
	 * @see #getWhoUuid()
	 * @generated
	 */
	void setWhoUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Who Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Id</em>' containment reference.
	 * @see #setWhoId(Id)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getWhoId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoId <em>Who Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Id</em>' containment reference.
	 * @see #getWhoId()
	 * @generated
	 */
	void setWhoId(Id value);

	/**
	 * Returns the value of the '<em><b>Who Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Unsigned Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Unsigned Int</em>' containment reference.
	 * @see #setWhoUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getWhoUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoUnsignedInt <em>Who Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Unsigned Int</em>' containment reference.
	 * @see #getWhoUnsignedInt()
	 * @generated
	 */
	void setWhoUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Who Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Positive Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Positive Int</em>' containment reference.
	 * @see #setWhoPositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getWhoPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoPositiveInt <em>Who Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Positive Int</em>' containment reference.
	 * @see #getWhoPositiveInt()
	 * @generated
	 */
	void setWhoPositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Who Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Attachment</em>' containment reference.
	 * @see #setWhoAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getWhoAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoAttachment <em>Who Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Attachment</em>' containment reference.
	 * @see #getWhoAttachment()
	 * @generated
	 */
	void setWhoAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Who Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Identifier</em>' containment reference.
	 * @see #setWhoIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getWhoIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoIdentifier <em>Who Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Identifier</em>' containment reference.
	 * @see #getWhoIdentifier()
	 * @generated
	 */
	void setWhoIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Who Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Codeable Concept</em>' containment reference.
	 * @see #setWhoCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getWhoCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoCodeableConcept <em>Who Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Codeable Concept</em>' containment reference.
	 * @see #getWhoCodeableConcept()
	 * @generated
	 */
	void setWhoCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Who Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Coding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Coding</em>' containment reference.
	 * @see #setWhoCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getWhoCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoCoding <em>Who Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Coding</em>' containment reference.
	 * @see #getWhoCoding()
	 * @generated
	 */
	void setWhoCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Who Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Quantity</em>' containment reference.
	 * @see #setWhoQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getWhoQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoQuantity <em>Who Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Quantity</em>' containment reference.
	 * @see #getWhoQuantity()
	 * @generated
	 */
	void setWhoQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Who Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Range</em>' containment reference.
	 * @see #setWhoRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getWhoRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoRange <em>Who Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Range</em>' containment reference.
	 * @see #getWhoRange()
	 * @generated
	 */
	void setWhoRange(Range value);

	/**
	 * Returns the value of the '<em><b>Who Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Period</em>' containment reference.
	 * @see #setWhoPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getWhoPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoPeriod <em>Who Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Period</em>' containment reference.
	 * @see #getWhoPeriod()
	 * @generated
	 */
	void setWhoPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Who Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Ratio</em>' containment reference.
	 * @see #setWhoRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getWhoRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoRatio <em>Who Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Ratio</em>' containment reference.
	 * @see #getWhoRatio()
	 * @generated
	 */
	void setWhoRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Who Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Reference</em>' containment reference.
	 * @see #setWhoReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getWhoReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoReference <em>Who Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Reference</em>' containment reference.
	 * @see #getWhoReference()
	 * @generated
	 */
	void setWhoReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Who Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Sampled Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Sampled Data</em>' containment reference.
	 * @see #setWhoSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getWhoSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoSampledData <em>Who Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Sampled Data</em>' containment reference.
	 * @see #getWhoSampledData()
	 * @generated
	 */
	void setWhoSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Who Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Signature</em>' containment reference.
	 * @see #setWhoSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getWhoSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoSignature <em>Who Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Signature</em>' containment reference.
	 * @see #getWhoSignature()
	 * @generated
	 */
	void setWhoSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Who Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Human Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Human Name</em>' containment reference.
	 * @see #setWhoHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getWhoHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoHumanName <em>Who Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Human Name</em>' containment reference.
	 * @see #getWhoHumanName()
	 * @generated
	 */
	void setWhoHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Who Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Address</em>' containment reference.
	 * @see #setWhoAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getWhoAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoAddress <em>Who Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Address</em>' containment reference.
	 * @see #getWhoAddress()
	 * @generated
	 */
	void setWhoAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Who Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Contact Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Contact Point</em>' containment reference.
	 * @see #setWhoContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getWhoContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoContactPoint <em>Who Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Contact Point</em>' containment reference.
	 * @see #getWhoContactPoint()
	 * @generated
	 */
	void setWhoContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Who Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Timing</em>' containment reference.
	 * @see #setWhoTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getWhoTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoTiming <em>Who Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Timing</em>' containment reference.
	 * @see #getWhoTiming()
	 * @generated
	 */
	void setWhoTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Who Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Who Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Who Meta</em>' containment reference.
	 * @see #setWhoMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getSignature_WhoMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='whoMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getWhoMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getWhoMeta <em>Who Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Who Meta</em>' containment reference.
	 * @see #getWhoMeta()
	 * @generated
	 */
	void setWhoMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Blob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base64 encoding of the XML-Signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blob</em>' containment reference.
	 * @see #setBlob(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getSignature_Blob()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='blob' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getBlob();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Signature#getBlob <em>Blob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blob</em>' containment reference.
	 * @see #getBlob()
	 * @generated
	 */
	void setBlob(Base64Binary value);

} // Signature
