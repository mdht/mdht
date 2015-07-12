/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PatientLink#getOther <em>Other</em>}</li>
 *   <li>{@link org.hl7.fhir.PatientLink#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getPatientLink()
 * @model extendedMetaData="name='Patient.Link' kind='elementOnly'"
 * @generated
 */
public interface PatientLink extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Other</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The other patient resource that the link refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other</em>' containment reference.
	 * @see #setOther(Reference)
	 * @see org.hl7.fhir.FhirPackage#getPatientLink_Other()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='other' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOther();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PatientLink#getOther <em>Other</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' containment reference.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of link between this patient resource and another patient resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(LinkType)
	 * @see org.hl7.fhir.FhirPackage#getPatientLink_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PatientLink#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(LinkType value);

} // PatientLink
