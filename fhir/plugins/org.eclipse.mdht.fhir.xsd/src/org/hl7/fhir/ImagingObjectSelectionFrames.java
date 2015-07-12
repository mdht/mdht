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
 * A set of DICOM SOP Instances of a patient, selected for some application purpose, e.g., quality assurance, teaching, conference, consulting, etc.  Objects selected can be from different studies, but must be of the same patient.
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
