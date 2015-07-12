/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Measurements and simple assertions made about a patient, device or other subject.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Observation#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getValueCodeableConcept <em>Value Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getValueRatio <em>Value Ratio</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getValueSampledData <em>Value Sampled Data</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getValueAttachment <em>Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getValueTime <em>Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getValuePeriod <em>Value Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getComments <em>Comments</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getAppliesDateTime <em>Applies Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getAppliesPeriod <em>Applies Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getReliability <em>Reliability</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getBodySiteCodeableConcept <em>Body Site Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getBodySiteReference <em>Body Site Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getReferenceRange <em>Reference Range</em>}</li>
 *   <li>{@link org.hl7.fhir.Observation#getRelated <em>Related</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getObservation()
 * @model extendedMetaData="name='Observation' kind='elementOnly'"
 * @generated
 */
public interface Observation extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes what was observed. Sometimes this is called the observation "code".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservation_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

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
	 * @see org.hl7.fhir.FhirPackage#getObservation_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(Quantity value);

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
	 * @see org.hl7.fhir.FhirPackage#getObservation_ValueCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getValueCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getValueCodeableConcept <em>Value Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Codeable Concept</em>' containment reference.
	 * @see #getValueCodeableConcept()
	 * @generated
	 */
	void setValueCodeableConcept(CodeableConcept value);

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
	 * @see org.hl7.fhir.FhirPackage#getObservation_ValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValueString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getValueString <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' containment reference.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(org.hl7.fhir.String value);

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
	 * @see org.hl7.fhir.FhirPackage#getObservation_ValueRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	Range getValueRange();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getValueRange <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Range</em>' containment reference.
	 * @see #getValueRange()
	 * @generated
	 */
	void setValueRange(Range value);

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
	 * @see org.hl7.fhir.FhirPackage#getObservation_ValueRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getValueRatio();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getValueRatio <em>Value Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Ratio</em>' containment reference.
	 * @see #getValueRatio()
	 * @generated
	 */
	void setValueRatio(Ratio value);

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
	 * @see org.hl7.fhir.FhirPackage#getObservation_ValueSampledData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSampledData' namespace='##targetNamespace'"
	 * @generated
	 */
	SampledData getValueSampledData();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getValueSampledData <em>Value Sampled Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Sampled Data</em>' containment reference.
	 * @see #getValueSampledData()
	 * @generated
	 */
	void setValueSampledData(SampledData value);

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
	 * @see org.hl7.fhir.FhirPackage#getObservation_ValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getValueAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getValueAttachment <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attachment</em>' containment reference.
	 * @see #getValueAttachment()
	 * @generated
	 */
	void setValueAttachment(Attachment value);

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
	 * @see org.hl7.fhir.FhirPackage#getObservation_ValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getValueTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getValueTime <em>Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Time</em>' containment reference.
	 * @see #getValueTime()
	 * @generated
	 */
	void setValueTime(Time value);

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
	 * @see org.hl7.fhir.FhirPackage#getObservation_ValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getValueDateTime <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date Time</em>' containment reference.
	 * @see #getValueDateTime()
	 * @generated
	 */
	void setValueDateTime(DateTime value);

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
	 * @see org.hl7.fhir.FhirPackage#getObservation_ValuePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valuePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValuePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getValuePeriod <em>Value Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Period</em>' containment reference.
	 * @see #getValuePeriod()
	 * @generated
	 */
	void setValuePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a reason why the expected value in the element Observation.value[x] is missing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Absent Reason</em>' containment reference.
	 * @see #setDataAbsentReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservation_DataAbsentReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataAbsentReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDataAbsentReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getDataAbsentReason <em>Data Absent Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Absent Reason</em>' containment reference.
	 * @see #getDataAbsentReason()
	 * @generated
	 */
	void setDataAbsentReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assessment made based on the result of the observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpretation</em>' containment reference.
	 * @see #setInterpretation(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservation_Interpretation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interpretation' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getInterpretation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getInterpretation <em>Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' containment reference.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference.
	 * @see #setComments(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getObservation_Comments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comments' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComments();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getComments <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' containment reference.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Applies Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies Date Time</em>' containment reference.
	 * @see #setAppliesDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getObservation_AppliesDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appliesDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAppliesDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getAppliesDateTime <em>Applies Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies Date Time</em>' containment reference.
	 * @see #getAppliesDateTime()
	 * @generated
	 */
	void setAppliesDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Applies Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies Period</em>' containment reference.
	 * @see #setAppliesPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getObservation_AppliesPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appliesPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getAppliesPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getAppliesPeriod <em>Applies Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies Period</em>' containment reference.
	 * @see #getAppliesPeriod()
	 * @generated
	 */
	void setAppliesPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time this observation was made available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(Instant)
	 * @see org.hl7.fhir.FhirPackage#getObservation_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getIssued();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(Instant value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the result value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ObservationStatus)
	 * @see org.hl7.fhir.FhirPackage#getObservation_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ObservationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ObservationStatus value);

	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An estimate of the degree to which quality issues have impacted on the value reported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reliability</em>' containment reference.
	 * @see #setReliability(ObservationReliability)
	 * @see org.hl7.fhir.FhirPackage#getObservation_Reliability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reliability' namespace='##targetNamespace'"
	 * @generated
	 */
	ObservationReliability getReliability();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getReliability <em>Reliability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability</em>' containment reference.
	 * @see #getReliability()
	 * @generated
	 */
	void setReliability(ObservationReliability value);

	/**
	 * Returns the value of the '<em><b>Body Site Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Site Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Site Codeable Concept</em>' containment reference.
	 * @see #setBodySiteCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservation_BodySiteCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySiteCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBodySiteCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getBodySiteCodeableConcept <em>Body Site Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site Codeable Concept</em>' containment reference.
	 * @see #getBodySiteCodeableConcept()
	 * @generated
	 */
	void setBodySiteCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Body Site Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Site Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Site Reference</em>' containment reference.
	 * @see #setBodySiteReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getObservation_BodySiteReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySiteReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getBodySiteReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getBodySiteReference <em>Body Site Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site Reference</em>' containment reference.
	 * @see #getBodySiteReference()
	 * @generated
	 */
	void setBodySiteReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the mechanism used to perform the observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getObservation_Method()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for the simple observation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getObservation_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus,
	 * other observer (for example a relative or EMT), or any observation made about the subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getObservation_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specimen that was used when this observation was made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference.
	 * @see #setSpecimen(Reference)
	 * @see org.hl7.fhir.FhirPackage#getObservation_Specimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSpecimen();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getSpecimen <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen</em>' containment reference.
	 * @see #getSpecimen()
	 * @generated
	 */
	void setSpecimen(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who was responsible for asserting the observed value as "true".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getObservation_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPerformer();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device used to generate the observation data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see org.hl7.fhir.FhirPackage#getObservation_Device()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The healthcare event  ( e.g. a patient and healthcare provider interaction ) during which this observation is made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getObservation_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Observation#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Reference Range</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ObservationReferenceRange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Guidance on how to interpret the value by comparison to a normal or recommended range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Range</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getObservation_ReferenceRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceRange' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObservationReferenceRange> getReferenceRange();

	/**
	 * Returns the value of the '<em><b>Related</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ObservationRelated}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Related observations - either components, or previous observations, or statements of derivation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getObservation_Related()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObservationRelated> getRelated();

} // Observation
