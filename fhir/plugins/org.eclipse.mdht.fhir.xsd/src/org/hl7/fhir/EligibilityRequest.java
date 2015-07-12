/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eligibility Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the insurance eligibility details from the insurer regarding a specified coverage and optionally some class of service.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getOriginalRuleset <em>Original Ruleset</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityRequest#getOrganization <em>Organization</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest()
 * @model extendedMetaData="name='EligibilityRequest' kind='elementOnly'"
 * @generated
 */
public interface EligibilityRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Response Business Identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruleset</em>' containment reference.
	 * @see #setRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_Ruleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ruleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getRuleset <em>Ruleset</em>}' containment reference.
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
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
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
	 * The date when this resource was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Insurer who is target  of the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTarget();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Reference value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The practitioner who is responsible for the services rendered to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_Provider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provider' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProvider();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization which is responsible for the services rendered to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityRequest_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityRequest#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Reference value);

} // EligibilityRequest
