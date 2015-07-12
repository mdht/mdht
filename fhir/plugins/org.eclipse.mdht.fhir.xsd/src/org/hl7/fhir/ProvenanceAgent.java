/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g., Document Completion - has the artifact been legally authenticated), all of which may impact Security, Privacy, and Trust policies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getRole <em>Role</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getReferenceUri <em>Reference Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getReferenceReference <em>Reference Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getDisplay <em>Display</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent()
 * @model extendedMetaData="name='Provenance.Agent' kind='elementOnly'"
 * @generated
 */
public interface ProvenanceAgent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function of the agent with respect to the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(Coding)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_Role()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='role' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRole();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Coding value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of participation of the agent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Reference Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Uri</em>' containment reference.
	 * @see #setReferenceUri(Uri)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_ReferenceUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getReferenceUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getReferenceUri <em>Reference Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Uri</em>' containment reference.
	 * @see #getReferenceUri()
	 * @generated
	 */
	void setReferenceUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Reference Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Reference</em>' containment reference.
	 * @see #setReferenceReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_ReferenceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferenceReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getReferenceReference <em>Reference Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Reference</em>' containment reference.
	 * @see #getReferenceReference()
	 * @generated
	 */
	void setReferenceReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable description of the participant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_Display()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(org.hl7.fhir.String value);

} // ProvenanceAgent
