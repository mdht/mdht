/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imaging Object Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of DICOM SOP Instances of a patient, selected for some application purpose, e.g., quality assurance, teaching, conference, consulting, etc.  Objects selected can be from different studies, but must be of the same patient.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ImagingObjectSelection#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingObjectSelection#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingObjectSelection#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingObjectSelection#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingObjectSelection#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingObjectSelection#getAuthoringTime <em>Authoring Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ImagingObjectSelection#getStudy <em>Study</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelection()
 * @model extendedMetaData="name='ImagingObjectSelection' kind='elementOnly'"
 * @generated
 */
public interface ImagingObjectSelection extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instance UID of the DICOM KOS SOP Instances represenetd in this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(Oid)
	 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelection_Uid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	Oid getUid();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingObjectSelection#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(Oid value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patient resource reference which is the patient subject of all DICOM SOP Instances in this key object selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelection_Patient()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingObjectSelection#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason for, or significance of, the selection of objects referenced in the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelection_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingObjectSelection#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text description of the DICOM SOP instances selected in the key object selection. This should be aligned with the content of the title element, and can provide further explanation of the SOP instances in the selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelection_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingObjectSelection#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Author of key object selection. It can be a human authtor or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attached in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelection_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingObjectSelection#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Authoring Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date and time when the key object selection was authored. Note that this is the date and time the DICOM SOP instances in the selection were selected (selection decision making). It is different from the creation date and time of the selection resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authoring Time</em>' containment reference.
	 * @see #setAuthoringTime(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelection_AuthoringTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authoringTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAuthoringTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ImagingObjectSelection#getAuthoringTime <em>Authoring Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authoring Time</em>' containment reference.
	 * @see #getAuthoringTime()
	 * @generated
	 */
	void setAuthoringTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Study</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ImagingObjectSelectionStudy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Study identity and locating information of the DICOM SOP instances in the selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getImagingObjectSelection_Study()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='study' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImagingObjectSelectionStudy> getStudy();

} // ImagingObjectSelection
