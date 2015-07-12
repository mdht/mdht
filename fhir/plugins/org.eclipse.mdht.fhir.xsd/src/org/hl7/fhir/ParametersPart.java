/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This special resource type is used to represent [operation](operations.html] request and response. It has no other use, and there is no RESTful end=point associated with it.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ParametersPart#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueDecimal <em>Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueBase64Binary <em>Value Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueInstant <em>Value Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueUri <em>Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueTime <em>Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueCode <em>Value Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueOid <em>Value Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueUuid <em>Value Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueId <em>Value Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueUnsignedInt <em>Value Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValuePositiveInt <em>Value Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueAttachment <em>Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueIdentifier <em>Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueCoding <em>Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValuePeriod <em>Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueRatio <em>Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueSampledData <em>Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueSignature <em>Value Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueHumanName <em>Value Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueAddress <em>Value Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueContactPoint <em>Value Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueTiming <em>Value Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getValueMeta <em>Value Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.ParametersPart#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getParametersPart()
 * @model extendedMetaData="name='Parameters.Part' kind='elementOnly'"
 * @generated
 */
public interface ParametersPart extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the parameter (reference to the operation definition).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Boolean</em>' containment reference.
	 * @see #setValueBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueBoolean <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean</em>' containment reference.
	 * @see #getValueBoolean()
	 * @generated
	 */
	void setValueBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Integer</em>' containment reference.
	 * @see #setValueInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getValueInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueInteger <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Integer</em>' containment reference.
	 * @see #getValueInteger()
	 * @generated
	 */
	void setValueInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Decimal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Decimal</em>' containment reference.
	 * @see #setValueDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValueDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueDecimal <em>Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Decimal</em>' containment reference.
	 * @see #getValueDecimal()
	 * @generated
	 */
	void setValueDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Value Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Base64 Binary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Base64 Binary</em>' containment reference.
	 * @see #setValueBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getValueBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueBase64Binary <em>Value Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Base64 Binary</em>' containment reference.
	 * @see #getValueBase64Binary()
	 * @generated
	 */
	void setValueBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Value Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Instant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Instant</em>' containment reference.
	 * @see #setValueInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getValueInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueInstant <em>Value Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Instant</em>' containment reference.
	 * @see #getValueInstant()
	 * @generated
	 */
	void setValueInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value String</em>' containment reference.
	 * @see #setValueString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValueString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueString <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' containment reference.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Uri</em>' containment reference.
	 * @see #setValueUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getValueUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueUri <em>Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Uri</em>' containment reference.
	 * @see #getValueUri()
	 * @generated
	 */
	void setValueUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date</em>' containment reference.
	 * @see #setValueDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getValueDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueDate <em>Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date</em>' containment reference.
	 * @see #getValueDate()
	 * @generated
	 */
	void setValueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date Time</em>' containment reference.
	 * @see #setValueDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueDateTime <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date Time</em>' containment reference.
	 * @see #getValueDateTime()
	 * @generated
	 */
	void setValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Time</em>' containment reference.
	 * @see #setValueTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getValueTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueTime <em>Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Time</em>' containment reference.
	 * @see #getValueTime()
	 * @generated
	 */
	void setValueTime(Time value);

	/**
	 * Returns the value of the '<em><b>Value Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Code</em>' containment reference.
	 * @see #setValueCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getValueCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueCode <em>Value Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Code</em>' containment reference.
	 * @see #getValueCode()
	 * @generated
	 */
	void setValueCode(Code value);

	/**
	 * Returns the value of the '<em><b>Value Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Oid</em>' containment reference.
	 * @see #setValueOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getValueOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueOid <em>Value Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Oid</em>' containment reference.
	 * @see #getValueOid()
	 * @generated
	 */
	void setValueOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Value Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Uuid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Uuid</em>' containment reference.
	 * @see #setValueUuid(Uuid)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getValueUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueUuid <em>Value Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Uuid</em>' containment reference.
	 * @see #getValueUuid()
	 * @generated
	 */
	void setValueUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Value Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Id</em>' containment reference.
	 * @see #setValueId(Id)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getValueId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueId <em>Value Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Id</em>' containment reference.
	 * @see #getValueId()
	 * @generated
	 */
	void setValueId(Id value);

	/**
	 * Returns the value of the '<em><b>Value Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Unsigned Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Unsigned Int</em>' containment reference.
	 * @see #setValueUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getValueUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueUnsignedInt <em>Value Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Unsigned Int</em>' containment reference.
	 * @see #getValueUnsignedInt()
	 * @generated
	 */
	void setValueUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Value Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Positive Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Positive Int</em>' containment reference.
	 * @see #setValuePositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValuePositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valuePositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getValuePositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValuePositiveInt <em>Value Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Positive Int</em>' containment reference.
	 * @see #getValuePositiveInt()
	 * @generated
	 */
	void setValuePositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attachment</em>' containment reference.
	 * @see #setValueAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getValueAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueAttachment <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attachment</em>' containment reference.
	 * @see #getValueAttachment()
	 * @generated
	 */
	void setValueAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Value Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Identifier</em>' containment reference.
	 * @see #setValueIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getValueIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueIdentifier <em>Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Identifier</em>' containment reference.
	 * @see #getValueIdentifier()
	 * @generated
	 */
	void setValueIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Value Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #setValueCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueCodeableConcept <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #getValueCodeableConcept()
	 * @generated
	 */
	void setValueCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Coding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Coding</em>' containment reference.
	 * @see #setValueCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getValueCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueCoding <em>Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Coding</em>' containment reference.
	 * @see #getValueCoding()
	 * @generated
	 */
	void setValueCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Range</em>' containment reference.
	 * @see #setValueRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getValueRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueRange <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Range</em>' containment reference.
	 * @see #getValueRange()
	 * @generated
	 */
	void setValueRange(Range value);

	/**
	 * Returns the value of the '<em><b>Value Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Period</em>' containment reference.
	 * @see #setValuePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValuePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valuePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValuePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValuePeriod <em>Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Period</em>' containment reference.
	 * @see #getValuePeriod()
	 * @generated
	 */
	void setValuePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Value Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Ratio</em>' containment reference.
	 * @see #setValueRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getValueRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueRatio <em>Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Ratio</em>' containment reference.
	 * @see #getValueRatio()
	 * @generated
	 */
	void setValueRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Reference</em>' containment reference.
	 * @see #setValueReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getValueReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueReference <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Reference</em>' containment reference.
	 * @see #getValueReference()
	 * @generated
	 */
	void setValueReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Value Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Sampled Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Sampled Data</em>' containment reference.
	 * @see #setValueSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getValueSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueSampledData <em>Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Sampled Data</em>' containment reference.
	 * @see #getValueSampledData()
	 * @generated
	 */
	void setValueSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Value Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Signature</em>' containment reference.
	 * @see #setValueSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getValueSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueSignature <em>Value Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Signature</em>' containment reference.
	 * @see #getValueSignature()
	 * @generated
	 */
	void setValueSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Value Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Human Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Human Name</em>' containment reference.
	 * @see #setValueHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getValueHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueHumanName <em>Value Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Human Name</em>' containment reference.
	 * @see #getValueHumanName()
	 * @generated
	 */
	void setValueHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Value Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Address</em>' containment reference.
	 * @see #setValueAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getValueAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueAddress <em>Value Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Address</em>' containment reference.
	 * @see #getValueAddress()
	 * @generated
	 */
	void setValueAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Value Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Contact Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Contact Point</em>' containment reference.
	 * @see #setValueContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getValueContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueContactPoint <em>Value Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Contact Point</em>' containment reference.
	 * @see #getValueContactPoint()
	 * @generated
	 */
	void setValueContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Value Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Timing</em>' containment reference.
	 * @see #setValueTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getValueTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueTiming <em>Value Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Timing</em>' containment reference.
	 * @see #getValueTiming()
	 * @generated
	 */
	void setValueTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Value Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Meta</em>' containment reference.
	 * @see #setValueMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_ValueMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getValueMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getValueMeta <em>Value Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Meta</em>' containment reference.
	 * @see #getValueMeta()
	 * @generated
	 */
	void setValueMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the parameter is a whole resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(ResourceContainer)
	 * @see org.hl7.fhir.FhirPackage#getParametersPart_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceContainer getResource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ParametersPart#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(ResourceContainer value);

} // ParametersPart
