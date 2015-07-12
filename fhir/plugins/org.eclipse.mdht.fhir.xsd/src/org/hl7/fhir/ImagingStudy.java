/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of Series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A Series is of only one modality (e.g., X-ray, CT, MR, ultrasound), but a Study may have multiple Series of different modalities.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getStarted <em>Started</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getAccession <em>Accession</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getOrder <em>Order</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getModalityList <em>Modality List</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getReferrer <em>Referrer</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getNumberOfSeries <em>Number Of Series</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getClinicalInformation <em>Clinical Information</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudy#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingStudy()
 * @model extendedMetaData="name='ImagingStudy' kind='elementOnly'"
 * @generated
 */
public interface ImagingStudy extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Started</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date and Time the study started. Timezone Offset From UTC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Started</em>' containment reference.
	 * @see #setStarted(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Started()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='started' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getStarted();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getStarted <em>Started</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' containment reference.
	 * @see #getStarted()
	 * @generated
	 */
	void setStarted(DateTime value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient imaged in the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formal identifier for the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Accession</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accession Number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accession</em>' containment reference.
	 * @see #setAccession(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Accession()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accession' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getAccession();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getAccession <em>Accession</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accession</em>' containment reference.
	 * @see #getAccession()
	 * @generated
	 */
	void setAccession(Identifier value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other identifiers for the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of the diagnostic orders that resulted in this imaging study being performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Order()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getOrder();

	/**
	 * Returns the value of the '<em><b>Modality List</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingModality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modality List</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_ModalityList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modalityList' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingModality> getModalityList();

	/**
	 * Returns the value of the '<em><b>Referrer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requesting/referring physician.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referrer</em>' containment reference.
	 * @see #setReferrer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Referrer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referrer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferrer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getReferrer <em>Referrer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referrer</em>' containment reference.
	 * @see #getReferrer()
	 * @generated
	 */
	void setReferrer(Reference value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Availability of study (online, offline or nearline).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability</em>' containment reference.
	 * @see #setAvailability(InstanceAvailability)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Availability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availability' namespace='##targetNamespace'"
	 * @generated
	 */
	InstanceAvailability getAvailability();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getAvailability <em>Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' containment reference.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(InstanceAvailability value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WADO-RS resource where Study is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Number Of Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of Series in Study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Series</em>' containment reference.
	 * @see #setNumberOfSeries(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_NumberOfSeries()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numberOfSeries' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberOfSeries();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getNumberOfSeries <em>Number Of Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Series</em>' containment reference.
	 * @see #getNumberOfSeries()
	 * @generated
	 */
	void setNumberOfSeries(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Number Of Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of SOP Instances in Study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Instances</em>' containment reference.
	 * @see #setNumberOfInstances(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_NumberOfInstances()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numberOfInstances' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberOfInstances();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getNumberOfInstances <em>Number Of Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Instances</em>' containment reference.
	 * @see #getNumberOfInstances()
	 * @generated
	 */
	void setNumberOfInstances(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Clinical Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diagnoses etc provided with request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Information</em>' containment reference.
	 * @see #setClinicalInformation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_ClinicalInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='clinicalInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getClinicalInformation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getClinicalInformation <em>Clinical Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Information</em>' containment reference.
	 * @see #getClinicalInformation()
	 * @generated
	 */
	void setClinicalInformation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of procedure performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Procedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getProcedure();

	/**
	 * Returns the value of the '<em><b>Interpreter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who read study and interpreted the images.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpreter</em>' containment reference.
	 * @see #setInterpreter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Interpreter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interpreter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getInterpreter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getInterpreter <em>Interpreter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpreter</em>' containment reference.
	 * @see #getInterpreter()
	 * @generated
	 */
	void setInterpreter(Reference value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Institution-generated description or classification of the Study performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudy#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingStudySeries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each study has one or more series of image instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudy_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingStudySeries> getSeries();

} // ImagingStudy
