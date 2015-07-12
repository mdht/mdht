/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Object Selection Study</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ImagingObjectSelectionStudy#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingObjectSelectionStudy#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingObjectSelectionStudy#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelectionStudy()
 * @model extendedMetaData="name='ImagingObjectSelection.Study' kind='elementOnly'"
 * @generated
 */
public interface ImagingObjectSelectionStudy extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Study instance uid of the SOP instances in the selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelectionStudy_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingObjectSelectionStudy#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WADO-RS URL to retrieve the study. Note that this URL retrieves all SOP instances of the study, not only those in the selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelectionStudy_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingObjectSelectionStudy#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingObjectSelectionSeries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Series indetity and locating information of the DICOM SOP instances in the selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelectionStudy_Series()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingObjectSelectionSeries> getSeries();

} // ImagingObjectSelectionStudy
