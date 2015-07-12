/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides processing status, errors and notes from the processing of a resource.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getRequestProvider <em>Request Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getRequestOrganization <em>Request Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getForm <em>Form</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.hl7.fhir.ProcessResponse#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProcessResponse()
 * @model extendedMetaData="name='ProcessResponse' kind='elementOnly'"
 * @generated
 */
public interface ProcessResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Response Business Identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Original request resource reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessResponse#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Reference value);

	/**
	 * Returns the value of the '<em><b>Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transaction status: error, complete, held.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outcome</em>' containment reference.
	 * @see #setOutcome(Coding)
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_Outcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outcome' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessResponse#getOutcome <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome</em>' containment reference.
	 * @see #getOutcome()
	 * @generated
	 */
	void setOutcome(Coding value);

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the status of the adjudication or processing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposition</em>' containment reference.
	 * @see #setDisposition(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_Disposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disposition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessResponse#getDisposition <em>Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' containment reference.
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_Ruleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessResponse#getRuleset <em>Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' containment reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Original Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The style (standard) and version of the original material which was converted into this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #setOriginalRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessResponse#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #getOriginalRuleset()
	 * @generated
	 */
	void setOriginalRuleset(Coding value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date when the enclosed suite of services were performed or completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessResponse#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization who produced this adjudicated response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessResponse#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Request Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Provider</em>' containment reference.
	 * @see #setRequestProvider(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_RequestProvider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestProvider' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestProvider();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessResponse#getRequestProvider <em>Request Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Provider</em>' containment reference.
	 * @see #getRequestProvider()
	 * @generated
	 */
	void setRequestProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Request Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is responsible for the services rendered to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request Organization</em>' containment reference.
	 * @see #setRequestOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_RequestOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequestOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessResponse#getRequestOrganization <em>Request Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Organization</em>' containment reference.
	 * @see #getRequestOrganization()
	 * @generated
	 */
	void setRequestOrganization(Reference value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The form to be used for printing the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(Coding)
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_Form()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='form' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getForm();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProcessResponse#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Coding value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProcessResponseNotes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Suite of processing note or additional requirements is the processing has been held.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProcessResponseNotes> getNotes();

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Processing errors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProcessResponse_Error()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getError();

} // ProcessResponse
