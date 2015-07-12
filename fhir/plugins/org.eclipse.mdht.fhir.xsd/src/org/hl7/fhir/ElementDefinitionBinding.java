/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Captures constraints on each element within the resource, profile, or extension.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetBoolean <em>Value Set Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetInteger <em>Value Set Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetDecimal <em>Value Set Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetBase64Binary <em>Value Set Base64 Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetInstant <em>Value Set Instant</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetString <em>Value Set String</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetUri <em>Value Set Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetDate <em>Value Set Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetDateTime <em>Value Set Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetTime <em>Value Set Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetCode <em>Value Set Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetOid <em>Value Set Oid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetUuid <em>Value Set Uuid</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetId <em>Value Set Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetUnsignedInt <em>Value Set Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetPositiveInt <em>Value Set Positive Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetAttachment <em>Value Set Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetIdentifier <em>Value Set Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetCodeableConcept <em>Value Set Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetCoding <em>Value Set Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetQuantity <em>Value Set Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetRange <em>Value Set Range</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetPeriod <em>Value Set Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetRatio <em>Value Set Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetReference <em>Value Set Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetSampledData <em>Value Set Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetSignature <em>Value Set Signature</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetHumanName <em>Value Set Human Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetAddress <em>Value Set Address</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetContactPoint <em>Value Set Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetTiming <em>Value Set Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetMeta <em>Value Set Meta</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding()
 * @model extendedMetaData="name='ElementDefinition.Binding' kind='elementOnly'"
 * @generated
 */
public interface ElementDefinitionBinding extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A descriptive name for this - can be useful for generating implementation artifacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference.
	 * @see #setStrength(BindingStrength)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_Strength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strength' namespace='##targetNamespace'"
	 * @generated
	 */
	BindingStrength getStrength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getStrength <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' containment reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(BindingStrength value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the intended use of this particular set of codes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Set Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Boolean</em>' containment reference.
	 * @see #setValueSetBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getValueSetBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetBoolean <em>Value Set Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Boolean</em>' containment reference.
	 * @see #getValueSetBoolean()
	 * @generated
	 */
	void setValueSetBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Set Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Integer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Integer</em>' containment reference.
	 * @see #setValueSetInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getValueSetInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetInteger <em>Value Set Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Integer</em>' containment reference.
	 * @see #getValueSetInteger()
	 * @generated
	 */
	void setValueSetInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Value Set Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Decimal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Decimal</em>' containment reference.
	 * @see #setValueSetDecimal(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValueSetDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetDecimal <em>Value Set Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Decimal</em>' containment reference.
	 * @see #getValueSetDecimal()
	 * @generated
	 */
	void setValueSetDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Value Set Base64 Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Base64 Binary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Base64 Binary</em>' containment reference.
	 * @see #setValueSetBase64Binary(Base64Binary)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetBase64Binary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetBase64Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64Binary getValueSetBase64Binary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetBase64Binary <em>Value Set Base64 Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Base64 Binary</em>' containment reference.
	 * @see #getValueSetBase64Binary()
	 * @generated
	 */
	void setValueSetBase64Binary(Base64Binary value);

	/**
	 * Returns the value of the '<em><b>Value Set Instant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Instant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Instant</em>' containment reference.
	 * @see #setValueSetInstant(Instant)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetInstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetInstant' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getValueSetInstant();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetInstant <em>Value Set Instant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Instant</em>' containment reference.
	 * @see #getValueSetInstant()
	 * @generated
	 */
	void setValueSetInstant(Instant value);

	/**
	 * Returns the value of the '<em><b>Value Set String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set String</em>' containment reference.
	 * @see #setValueSetString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValueSetString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetString <em>Value Set String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set String</em>' containment reference.
	 * @see #getValueSetString()
	 * @generated
	 */
	void setValueSetString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Set Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Uri</em>' containment reference.
	 * @see #setValueSetUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getValueSetUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetUri <em>Value Set Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Uri</em>' containment reference.
	 * @see #getValueSetUri()
	 * @generated
	 */
	void setValueSetUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Value Set Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Date</em>' containment reference.
	 * @see #setValueSetDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getValueSetDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetDate <em>Value Set Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Date</em>' containment reference.
	 * @see #getValueSetDate()
	 * @generated
	 */
	void setValueSetDate(Date value);

	/**
	 * Returns the value of the '<em><b>Value Set Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Date Time</em>' containment reference.
	 * @see #setValueSetDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValueSetDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetDateTime <em>Value Set Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Date Time</em>' containment reference.
	 * @see #getValueSetDateTime()
	 * @generated
	 */
	void setValueSetDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Value Set Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Time</em>' containment reference.
	 * @see #setValueSetTime(Time)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getValueSetTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetTime <em>Value Set Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Time</em>' containment reference.
	 * @see #getValueSetTime()
	 * @generated
	 */
	void setValueSetTime(Time value);

	/**
	 * Returns the value of the '<em><b>Value Set Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Code</em>' containment reference.
	 * @see #setValueSetCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetCode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getValueSetCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetCode <em>Value Set Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Code</em>' containment reference.
	 * @see #getValueSetCode()
	 * @generated
	 */
	void setValueSetCode(Code value);

	/**
	 * Returns the value of the '<em><b>Value Set Oid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Oid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Oid</em>' containment reference.
	 * @see #setValueSetOid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetOid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetOid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getValueSetOid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetOid <em>Value Set Oid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Oid</em>' containment reference.
	 * @see #getValueSetOid()
	 * @generated
	 */
	void setValueSetOid(Oid value);

	/**
	 * Returns the value of the '<em><b>Value Set Uuid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Uuid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Uuid</em>' containment reference.
	 * @see #setValueSetUuid(Uuid)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetUuid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetUuid' namespace='##targetNamespace'"
	 * @generated
	 */
	Uuid getValueSetUuid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetUuid <em>Value Set Uuid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Uuid</em>' containment reference.
	 * @see #getValueSetUuid()
	 * @generated
	 */
	void setValueSetUuid(Uuid value);

	/**
	 * Returns the value of the '<em><b>Value Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Id</em>' containment reference.
	 * @see #setValueSetId(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetId' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getValueSetId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetId <em>Value Set Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Id</em>' containment reference.
	 * @see #getValueSetId()
	 * @generated
	 */
	void setValueSetId(Id value);

	/**
	 * Returns the value of the '<em><b>Value Set Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Unsigned Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Unsigned Int</em>' containment reference.
	 * @see #setValueSetUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getValueSetUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetUnsignedInt <em>Value Set Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Unsigned Int</em>' containment reference.
	 * @see #getValueSetUnsignedInt()
	 * @generated
	 */
	void setValueSetUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Value Set Positive Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Positive Int</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Positive Int</em>' containment reference.
	 * @see #setValueSetPositiveInt(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetPositiveInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetPositiveInt' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getValueSetPositiveInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetPositiveInt <em>Value Set Positive Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Positive Int</em>' containment reference.
	 * @see #getValueSetPositiveInt()
	 * @generated
	 */
	void setValueSetPositiveInt(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Value Set Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Attachment</em>' containment reference.
	 * @see #setValueSetAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getValueSetAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetAttachment <em>Value Set Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Attachment</em>' containment reference.
	 * @see #getValueSetAttachment()
	 * @generated
	 */
	void setValueSetAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Value Set Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Identifier</em>' containment reference.
	 * @see #setValueSetIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getValueSetIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetIdentifier <em>Value Set Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Identifier</em>' containment reference.
	 * @see #getValueSetIdentifier()
	 * @generated
	 */
	void setValueSetIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Value Set Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Codeable Concept</em>' containment reference.
	 * @see #setValueSetCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getValueSetCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetCodeableConcept <em>Value Set Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Codeable Concept</em>' containment reference.
	 * @see #getValueSetCodeableConcept()
	 * @generated
	 */
	void setValueSetCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Value Set Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Coding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Coding</em>' containment reference.
	 * @see #setValueSetCoding(Coding)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getValueSetCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetCoding <em>Value Set Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Coding</em>' containment reference.
	 * @see #getValueSetCoding()
	 * @generated
	 */
	void setValueSetCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Value Set Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Quantity</em>' containment reference.
	 * @see #setValueSetQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValueSetQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetQuantity <em>Value Set Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Quantity</em>' containment reference.
	 * @see #getValueSetQuantity()
	 * @generated
	 */
	void setValueSetQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Value Set Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Range</em>' containment reference.
	 * @see #setValueSetRange(Range)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getValueSetRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetRange <em>Value Set Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Range</em>' containment reference.
	 * @see #getValueSetRange()
	 * @generated
	 */
	void setValueSetRange(Range value);

	/**
	 * Returns the value of the '<em><b>Value Set Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Period</em>' containment reference.
	 * @see #setValueSetPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValueSetPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetPeriod <em>Value Set Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Period</em>' containment reference.
	 * @see #getValueSetPeriod()
	 * @generated
	 */
	void setValueSetPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Value Set Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Ratio</em>' containment reference.
	 * @see #setValueSetRatio(Ratio)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getValueSetRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetRatio <em>Value Set Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Ratio</em>' containment reference.
	 * @see #getValueSetRatio()
	 * @generated
	 */
	void setValueSetRatio(Ratio value);

	/**
	 * Returns the value of the '<em><b>Value Set Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Reference</em>' containment reference.
	 * @see #setValueSetReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getValueSetReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetReference <em>Value Set Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Reference</em>' containment reference.
	 * @see #getValueSetReference()
	 * @generated
	 */
	void setValueSetReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Value Set Sampled Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Sampled Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Sampled Data</em>' containment reference.
	 * @see #setValueSetSampledData(SampledData)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getValueSetSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetSampledData <em>Value Set Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Sampled Data</em>' containment reference.
	 * @see #getValueSetSampledData()
	 * @generated
	 */
	void setValueSetSampledData(SampledData value);

	/**
	 * Returns the value of the '<em><b>Value Set Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Signature</em>' containment reference.
	 * @see #setValueSetSignature(Signature)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetSignature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	Signature getValueSetSignature();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetSignature <em>Value Set Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Signature</em>' containment reference.
	 * @see #getValueSetSignature()
	 * @generated
	 */
	void setValueSetSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Value Set Human Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Human Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Human Name</em>' containment reference.
	 * @see #setValueSetHumanName(HumanName)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetHumanName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetHumanName' namespace='##targetNamespace'"
	 * @generated
	 */
	HumanName getValueSetHumanName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetHumanName <em>Value Set Human Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Human Name</em>' containment reference.
	 * @see #getValueSetHumanName()
	 * @generated
	 */
	void setValueSetHumanName(HumanName value);

	/**
	 * Returns the value of the '<em><b>Value Set Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Address</em>' containment reference.
	 * @see #setValueSetAddress(Address)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getValueSetAddress();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetAddress <em>Value Set Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Address</em>' containment reference.
	 * @see #getValueSetAddress()
	 * @generated
	 */
	void setValueSetAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Value Set Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Contact Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Contact Point</em>' containment reference.
	 * @see #setValueSetContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getValueSetContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetContactPoint <em>Value Set Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Contact Point</em>' containment reference.
	 * @see #getValueSetContactPoint()
	 * @generated
	 */
	void setValueSetContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Value Set Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Timing</em>' containment reference.
	 * @see #setValueSetTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getValueSetTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetTiming <em>Value Set Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Timing</em>' containment reference.
	 * @see #getValueSetTiming()
	 * @generated
	 */
	void setValueSetTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Value Set Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Meta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set Meta</em>' containment reference.
	 * @see #setValueSetMeta(Meta)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionBinding_ValueSetMeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSetMeta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getValueSetMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSetMeta <em>Value Set Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set Meta</em>' containment reference.
	 * @see #getValueSetMeta()
	 * @generated
	 */
	void setValueSetMeta(Meta value);

} // ElementDefinitionBinding
