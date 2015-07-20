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
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getActor <em>Actor</em>}</li>
 *   <li>{@link org.hl7.fhir.ProvenanceAgent#getUserId <em>User Id</em>}</li>
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
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual, device or organization that participated in the event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference.
	 * @see #setActor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_Actor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getActor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getActor <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' containment reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Reference value);

	/**
	 * Returns the value of the '<em><b>User Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identify of the agent as known by the authorization system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Id</em>' containment reference.
	 * @see #setUserId(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getProvenanceAgent_UserId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='userId' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getUserId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProvenanceAgent#getUserId <em>User Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' containment reference.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(Identifier value);

} // ProvenanceAgent
