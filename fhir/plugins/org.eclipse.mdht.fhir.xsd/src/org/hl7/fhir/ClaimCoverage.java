/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimCoverage#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimCoverage#getFocal <em>Focal</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimCoverage#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimCoverage#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimCoverage#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimCoverage#getPreAuthRef <em>Pre Auth Ref</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimCoverage#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimCoverage#getOriginalRuleset <em>Original Ruleset</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getClaimCoverage()
 * @model extendedMetaData="name='Claim.Coverage' kind='elementOnly'"
 * @generated
 */
public interface ClaimCoverage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service line item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getClaimCoverage_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimCoverage#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Focal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focal</em>' containment reference.
	 * @see #setFocal(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getClaimCoverage_Focal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='focal' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getFocal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimCoverage#getFocal <em>Focal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal</em>' containment reference.
	 * @see #getFocal()
	 * @generated
	 */
	void setFocal(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the program or plan identification, underwriter or payor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimCoverage_Coverage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimCoverage#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Reference value);

	/**
	 * Returns the value of the '<em><b>Business Arrangement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contract number of a business agreement which describes the terms and conditions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Arrangement</em>' containment reference.
	 * @see #setBusinessArrangement(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getClaimCoverage_BusinessArrangement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='businessArrangement' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getBusinessArrangement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimCoverage#getBusinessArrangement <em>Business Arrangement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Arrangement</em>' containment reference.
	 * @see #getBusinessArrangement()
	 * @generated
	 */
	void setBusinessArrangement(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relationship of the patient to the subscriber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimCoverage_Relationship()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimCoverage#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Coding value);

	/**
	 * Returns the value of the '<em><b>Pre Auth Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of references from the Insurer to which these services pertain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Auth Ref</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getClaimCoverage_PreAuthRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preAuthRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getPreAuthRef();

	/**
	 * Returns the value of the '<em><b>Claim Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Coverages adjudication details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Response</em>' containment reference.
	 * @see #setClaimResponse(Reference)
	 * @see org.hl7.fhir.FhirPackage#getClaimCoverage_ClaimResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claimResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getClaimResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimCoverage#getClaimResponse <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' containment reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(Reference value);

	/**
	 * Returns the value of the '<em><b>Original Ruleset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The style (standard) and version of the original material which was converted into this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #setOriginalRuleset(Coding)
	 * @see org.hl7.fhir.FhirPackage#getClaimCoverage_OriginalRuleset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='originalRuleset' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimCoverage#getOriginalRuleset <em>Original Ruleset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Ruleset</em>' containment reference.
	 * @see #getOriginalRuleset()
	 * @generated
	 */
	void setOriginalRuleset(Coding value);

} // ClaimCoverage
