/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Study Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of Series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A Series is of only one modality (e.g., X-ray, CT, MR, ultrasound), but a Study may have multiple Series of different modalities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getModality <em>Modality</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getLaterality <em>Laterality</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudySeries#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries()
 * @model extendedMetaData="name='ImagingStudy.Series' kind='elementOnly'"
 * @generated
 */
public interface ImagingStudySeries extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Numeric identifier of this series in the study.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Number()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The modality of this series sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modality</em>' containment reference.
	 * @see #setModality(Coding)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Modality()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modality' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getModality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getModality <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' containment reference.
	 * @see #getModality()
	 * @generated
	 */
	void setModality(Coding value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formal identifier for this series.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the series.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Number Of Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of SOP Instances in Series.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Instances</em>' containment reference.
	 * @see #setNumberOfInstances(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_NumberOfInstances()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numberOfInstances' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumberOfInstances();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getNumberOfInstances <em>Number Of Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Instances</em>' containment reference.
	 * @see #getNumberOfInstances()
	 * @generated
	 */
	void setNumberOfInstances(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Availability of series (online, offline or nearline).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability</em>' containment reference.
	 * @see #setAvailability(InstanceAvailability)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Availability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availability' namespace='##targetNamespace'"
	 * @generated
	 */
	InstanceAvailability getAvailability();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getAvailability <em>Availability</em>}' containment reference.
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
	 * URI/URL specifying the location of the referenced series using WADO-RS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Body part examined. See  DICOM Part 16 Annex L for the mapping from DICOM to Snomed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(Coding)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(Coding value);

	/**
	 * Returns the value of the '<em><b>Laterality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Laterality if bodySite is paired anatomic structure and laterality is not pre-coordinated in bodySite code, map from (0020, 0060).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laterality</em>' containment reference.
	 * @see #setLaterality(Coding)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Laterality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='laterality' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getLaterality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getLaterality <em>Laterality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laterality</em>' containment reference.
	 * @see #getLaterality()
	 * @generated
	 */
	void setLaterality(Coding value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time when the series was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_DateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudySeries#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingStudyInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single SOP Instance within the series, e.g., an image, or presentation state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudySeries_Instance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingStudyInstance> getInstance();

} // ImagingStudySeries
