/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request for a procedure to be performed. May be a proposal or an order.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getTimingDateTime <em>Timing Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getTimingTiming <em>Timing Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getAsNeededBoolean <em>As Needed Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getOrderedOn <em>Ordered On</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getOrderer <em>Orderer</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcedureRequest#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProcedureRequest()
 * @model extendedMetaData="name='ProcedureRequest' kind='elementOnly'"
 * @generated
 */
public interface ProcedureRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers assigned to this order by the order or by the receiver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Identifier()
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
	 * The patient who will receive the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific procedure that is ordered. Use text if the exact nature of the procedure can't be coded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProcedureRequestBodySite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the sites on the subject's body where the procedure should be performed ( i.e. the target sites).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcedureRequestBodySite> getBodySite();

	/**
	 * Returns the value of the '<em><b>Indication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason why the procedure is proposed or ordered. This procedure request may be motivated by a Condition for instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Indication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getIndication();

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
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_TimingDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimingDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getTimingDateTime <em>Timing Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Date Time</em>' containment reference.
	 * @see #getTimingDateTime()
	 * @generated
	 */
	void setTimingDateTime(DateTime value);

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
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_TimingPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimingPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getTimingPeriod <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Period</em>' containment reference.
	 * @see #getTimingPeriod()
	 * @generated
	 */
	void setTimingPeriod(Period value);

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
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_TimingTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getTimingTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getTimingTiming <em>Timing Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Timing</em>' containment reference.
	 * @see #getTimingTiming()
	 * @generated
	 */
	void setTimingTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter within which the procedure proposal or request was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * E.g. surgeon, anaethetist, endoscopist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Performer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ProcedureRequestStatus)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcedureRequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ProcedureRequestStatus value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any other notes associated with this proposal or order - e.g., provider instructions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getNotes();

	/**
	 * Returns the value of the '<em><b>As Needed Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Needed Boolean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Needed Boolean</em>' containment reference.
	 * @see #setAsNeededBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_AsNeededBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getAsNeededBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getAsNeededBoolean <em>As Needed Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed Boolean</em>' containment reference.
	 * @see #getAsNeededBoolean()
	 * @generated
	 */
	void setAsNeededBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>As Needed Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Needed Codeable Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Needed Codeable Concept</em>' containment reference.
	 * @see #setAsNeededCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_AsNeededCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asNeededCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAsNeededCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getAsNeededCodeableConcept <em>As Needed Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Needed Codeable Concept</em>' containment reference.
	 * @see #getAsNeededCodeableConcept()
	 * @generated
	 */
	void setAsNeededCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Ordered On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when the request was made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered On</em>' containment reference.
	 * @see #setOrderedOn(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_OrderedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOrderedOn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getOrderedOn <em>Ordered On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered On</em>' containment reference.
	 * @see #getOrderedOn()
	 * @generated
	 */
	void setOrderedOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Orderer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The healthcare professional responsible for proposing or ordering the procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orderer</em>' containment reference.
	 * @see #setOrderer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Orderer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrderer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getOrderer <em>Orderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderer</em>' containment reference.
	 * @see #getOrderer()
	 * @generated
	 */
	void setOrderer(Reference value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinical priority associated with this order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(ProcedureRequestPriority)
	 * @see org.hl7.fhir.FhirPackage#getProcedureRequest_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcedureRequestPriority getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcedureRequest#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(ProcedureRequestPriority value);

} // ProcedureRequest
