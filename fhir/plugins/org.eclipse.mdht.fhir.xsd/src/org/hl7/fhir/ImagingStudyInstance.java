/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Study Instance</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImagingStudyInstance#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudyInstance#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudyInstance#getSopclass <em>Sopclass</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudyInstance#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudyInstance#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingStudyInstance#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingStudyInstance()
 * @model extendedMetaData="name='ImagingStudy.Instance' kind='elementOnly'"
 * @generated
 */
public interface ImagingStudyInstance extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of this image in the series.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudyInstance_Number()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudyInstance#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Formal identifier for this image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudyInstance_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudyInstance#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Sopclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DICOM Image type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sopclass</em>' containment reference.
	 * @see #setSopclass(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudyInstance_Sopclass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sopclass' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getSopclass();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudyInstance#getSopclass <em>Sopclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sopclass</em>' containment reference.
	 * @see #getSopclass()
	 * @generated
	 */
	void setSopclass(Oid value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-friendly SOP Class name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudyInstance_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudyInstance#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImagingStudyInstance_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingStudyInstance#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content of the instance or a rendering thereof (e.g., a JPEG of an image, or an XML of a structured report). May be represented by inline encoding, or by a URL reference to a WADO-RS service that makes the instance available. Multiple content attachments may be used for alternate representations of the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingStudyInstance_Content()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getContent();

} // ImagingStudyInstance
