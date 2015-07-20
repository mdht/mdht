/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g., Document Completion - has the artifact been legally authenticated), all of which may impact Security, Privacy, and Trust policies.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Provenance#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.Provenance#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Provenance#getRecorded <em>Recorded</em>}</li>
 *   <li>{@link org.hl7.fhir.Provenance#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Provenance#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.Provenance#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Provenance#getPolicy <em>Policy</em>}</li>
 *   <li>{@link org.hl7.fhir.Provenance#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.hl7.fhir.Provenance#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.hl7.fhir.Provenance#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProvenance()
 * @model extendedMetaData="name='Provenance' kind='elementOnly'"
 * @generated
 */
public interface Provenance extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProvenance_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getTarget();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period during which the activity occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getProvenance_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Provenance#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Recorded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instant of time at which the activity was recorded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorded</em>' containment reference.
	 * @see #setRecorded(Instant)
	 * @see org.hl7.fhir.FhirPackage#getProvenance_Recorded()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='recorded' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getRecorded();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Provenance#getRecorded <em>Recorded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded</em>' containment reference.
	 * @see #getRecorded()
	 * @generated
	 */
	void setRecorded(Instant value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason that the activity was taking place.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProvenance_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReason();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getProvenance_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getActivity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Provenance#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the activity occurred, if relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getProvenance_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Provenance#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProvenance_Policy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getPolicy();

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProvenanceAgent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProvenance_Agent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='agent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProvenanceAgent> getAgent();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProvenanceEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity used in this activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProvenance_Entity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProvenanceEntity> getEntity();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProvenance_Signature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='signature' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Signature> getSignature();

} // Provenance
