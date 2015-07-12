/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Use Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getBodySiteCodeableConcept <em>Body Site Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getBodySiteReference <em>Body Site Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getPrnReason <em>Prn Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getOrderedOn <em>Ordered On</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getRecordedOn <em>Recorded On</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.DeviceUseRequest#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest()
 * @model extendedMetaData="name='DeviceUseRequest' kind='elementOnly'"
 * @generated
 */
public interface DeviceUseRequest extends DomainResource {
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
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_BodySiteCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySiteCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getBodySiteCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUseRequest#getBodySiteCodeableConcept <em>Body Site Codeable Concept</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_BodySiteReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySiteReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getBodySiteReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUseRequest#getBodySiteReference <em>Body Site Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site Reference</em>' containment reference.
	 * @see #getBodySiteReference()
	 * @generated
	 */
	void setBodySiteReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(DeviceUseRequestStatus)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceUseRequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUseRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DeviceUseRequestStatus value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The details of the device  to be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_Device()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='device' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUseRequest#getDevice <em>Device</em>}' containment reference.
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
	 * An encounter that provides additional context in which this request is made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUseRequest#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers assigned to this order by the orderer or by the receiver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Indication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason or justification for the use of this device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_Indication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getIndication();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getNotes();

	/**
	 * Returns the value of the '<em><b>Prn Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The proposed act must be performed if the indicated conditions occur, e.g.., shortness of breath, SpO2 less than x%.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prn Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_PrnReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prnReason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getPrnReason();

	/**
	 * Returns the value of the '<em><b>Ordered On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when the request was made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered On</em>' containment reference.
	 * @see #setOrderedOn(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_OrderedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOrderedOn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUseRequest#getOrderedOn <em>Ordered On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered On</em>' containment reference.
	 * @see #getOrderedOn()
	 * @generated
	 */
	void setOrderedOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Recorded On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time at which the request was made/recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded On</em>' containment reference.
	 * @see #setRecordedOn(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_RecordedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recordedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getRecordedOn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUseRequest#getRecordedOn <em>Recorded On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded On</em>' containment reference.
	 * @see #getRecordedOn()
	 * @generated
	 */
	void setRecordedOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who will use the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUseRequest#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Timing Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Timing</em>' containment reference.
	 * @see #setTimingTiming(Timing)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_TimingTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getTimingTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUseRequest#getTimingTiming <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Timing</em>' containment reference.
	 * @see #getTimingTiming()
	 * @generated
	 */
	void setTimingTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Timing Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Period</em>' containment reference.
	 * @see #setTimingPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_TimingPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimingPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUseRequest#getTimingPeriod <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Period</em>' containment reference.
	 * @see #getTimingPeriod()
	 * @generated
	 */
	void setTimingPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Timing Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #setTimingDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_TimingDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimingDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUseRequest#getTimingDateTime <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #getTimingDateTime()
	 * @generated
	 */
	void setTimingDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characterizes how quickly the  use of device must be initiated. Includes concepts such as stat, urgent, routine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(DeviceUseRequestPriority)
	 * @see org.hl7.fhir.FhirPackage#getDeviceUseRequest_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceUseRequestPriority getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DeviceUseRequest#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(DeviceUseRequestPriority value);

} // DeviceUseRequest
