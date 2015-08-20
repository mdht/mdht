/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretation, and formatted representation of diagnostic reports.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getEffectivePeriod <em>Effective Period</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getResult <em>Result</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getImage <em>Image</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getCodedDiagnosis <em>Coded Diagnosis</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReport#getPresentedForm <em>Presented Form</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport()
 * @model extendedMetaData="name='DiagnosticReport' kind='elementOnly'"
 * @generated
 */
public interface DiagnosticReport extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The local ID assigned to the report by the order filler, usually by the Information System of the diagnostic service provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the diagnostic report as a whole.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(DiagnosticReportStatus)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticReportStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DiagnosticReportStatus value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code that classifies the dlinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code or name that describes this diagnostic report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The link to the health care event (encounter) when the order was made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Effective Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #setEffectiveDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_EffectiveDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectiveDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getEffectiveDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getEffectiveDateTime <em>Effective Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date Time</em>' containment reference.
	 * @see #getEffectiveDateTime()
	 * @generated
	 */
	void setEffectiveDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Effective Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Period</em>' containment reference.
	 * @see #setEffectivePeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_EffectivePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='effectivePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getEffectivePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getEffectivePeriod <em>Effective Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Period</em>' containment reference.
	 * @see #getEffectivePeriod()
	 * @generated
	 */
	void setEffectivePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time that this version of the report was released from the source diagnostic service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(Instant)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Issued()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getIssued();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(Instant value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The diagnostic service that is responsible for issuing the report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Performer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='performer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details concerning a test or procedure requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Request()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='request' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRequest();

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about the specimens on which this diagnostic report is based.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Specimen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSpecimen();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Observations that are part of this diagnostic report. Observations can be simple name/value pairs (e.g. "atomic" results), or they can be grouping observations that include references to other members of the group (e.g. "panels").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Result()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getResult();

	/**
	 * Returns the value of the '<em><b>Imaging Study</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imaging Study</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_ImagingStudy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='imagingStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getImagingStudy();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DiagnosticReportImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Image()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DiagnosticReportImage> getImage();

	/**
	 * Returns the value of the '<em><b>Conclusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concise and clinically contextualized narrative interpretation of the diagnostic report.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conclusion</em>' containment reference.
	 * @see #setConclusion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_Conclusion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conclusion' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getConclusion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReport#getConclusion <em>Conclusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conclusion</em>' containment reference.
	 * @see #getConclusion()
	 * @generated
	 */
	void setConclusion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Coded Diagnosis</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes for the conclusion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coded Diagnosis</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_CodedDiagnosis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codedDiagnosis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getCodedDiagnosis();

	/**
	 * Returns the value of the '<em><b>Presented Form</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presented Form</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReport_PresentedForm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='presentedForm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getPresentedForm();

} // DiagnosticReport
