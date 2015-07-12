/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contraindication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient.  E.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Contraindication#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Contraindication#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.Contraindication#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.Contraindication#getImplicated <em>Implicated</em>}</li>
 *   <li>{@link org.hl7.fhir.Contraindication#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.Contraindication#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Contraindication#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.Contraindication#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Contraindication#getReference <em>Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.Contraindication#getMitigation <em>Mitigation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContraindication()
 * @model extendedMetaData="name='Contraindication' kind='elementOnly'"
 * @generated
 */
public interface Contraindication extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the patient whose record the contraindication is associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContraindication_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contraindication#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the general type of issue identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContraindication_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contraindication#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the degree of importance associated with the identified issue based on the potential impact on the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(Code)
	 * @see org.hl7.fhir.FhirPackage#getContraindication_Severity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contraindication#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Code value);

	/**
	 * Returns the value of the '<em><b>Implicated</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the resource representing the current activity or proposed activity that.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implicated</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContraindication_Implicated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implicated' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getImplicated();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual explanation of the contraindication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getContraindication_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contraindication#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date or date-time when the contraindication was initially identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getContraindication_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contraindication#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the provider or software that identified the.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContraindication_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contraindication#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier associated with the contraindication record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getContraindication_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contraindication#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The literature, knowledge-base or similar reference that describes the propensity for the contraindication identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Uri)
	 * @see org.hl7.fhir.FhirPackage#getContraindication_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contraindication#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Uri value);

	/**
	 * Returns the value of the '<em><b>Mitigation</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContraindicationMitigation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of the risk identified by the contraindicaiton from manifesting.  Can also reflect an observation of known mitigating factors that may reduce/eliminate the need for any action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitigation</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContraindication_Mitigation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mitigation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContraindicationMitigation> getMitigation();

} // Contraindication
