/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConformanceSoftware#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceSoftware#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceSoftware#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConformanceSoftware()
 * @model extendedMetaData="name='Conformance.Software' kind='elementOnly'"
 * @generated
 */
public interface ConformanceSoftware extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name software is known by.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformanceSoftware_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceSoftware#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version identifier for the software covered by this statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformanceSoftware_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceSoftware#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date this version of the software released.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Date</em>' containment reference.
	 * @see #setReleaseDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getConformanceSoftware_ReleaseDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='releaseDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getReleaseDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceSoftware#getReleaseDate <em>Release Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' containment reference.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(DateTime value);

} // ConformanceSoftware
