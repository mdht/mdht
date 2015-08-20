/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Object Selection Frames</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A manifest of a set of DICOM Service-Object Pair Instances (SOP Instances).  The referenced SOP Instances (images or other content) are for a single patient, and may be from one or more studies. The referenced SOP Instances have been selected for a purpose, such as quality assurance, conference, or consult. Reflecting that range of purposes, typical ImagingObjectSelection resources may include all SOP Instances in a study (perhaps for sharing through a Health Information Exchange); key images from multiple studies (for reference by a referring or treating physician); a multi-frame ultrasound instance ("cine" video clip) and a set of measurements taken from that instance (for inclusion in a teaching file); and so on.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImagingObjectSelectionFrames#getFrameNumbers <em>Frame Numbers</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingObjectSelectionFrames#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelectionFrames()
 * @model extendedMetaData="name='ImagingObjectSelection.Frames' kind='elementOnly'"
 * @generated
 */
public interface ImagingObjectSelectionFrames extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Frame Numbers</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frame numbers in the frame set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame Numbers</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelectionFrames_FrameNumbers()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='frameNumbers' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnsignedInt> getFrameNumbers();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WADO-RS URL to retrieve the DICOM frames.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelectionFrames_Url()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingObjectSelectionFrames#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

} // ImagingObjectSelectionFrames
