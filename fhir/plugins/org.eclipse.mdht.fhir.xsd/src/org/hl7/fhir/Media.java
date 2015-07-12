/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Media#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getView <em>View</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getHeight <em>Height</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getWidth <em>Width</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getFrames <em>Frames</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.Media#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedia()
 * @model extendedMetaData="name='Media' kind='elementOnly'"
 * @generated
 */
public interface Media extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the media is a photo (still image), an audio recording, or a video recording.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(DigitalMediaType)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	DigitalMediaType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DigitalMediaType value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtype</em>' containment reference.
	 * @see #setSubtype(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Subtype()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subtype' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubtype();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getSubtype <em>Subtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' containment reference.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedia_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who/What this Media is a record of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person who administered the collection of the image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Reference)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Operator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operator' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getOperator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Reference value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the imaging view e.g Lateral or Antero-posterior (AP).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View</em>' containment reference.
	 * @see #setView(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedia_View()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='view' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getView();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getView <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' containment reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the device / manufacturer of the device  that was used to make the recording.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Name</em>' containment reference.
	 * @see #setDeviceName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedia_DeviceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deviceName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDeviceName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getDeviceName <em>Device Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' containment reference.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Height of the image in pixels(photo/video).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Height()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getHeight();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Width of the image in pixels (photo/video).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Width()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getWidth();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of frames in a photo. This is used with a multi-page fax, or an imaging acquisition context that takes multiple slices in a single image, or an animated gif. If there is more than one frame, this SHALL have a value in order to alert interface software that a multi-frame capable rendering widget is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference.
	 * @see #setFrames(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Frames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frames' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getFrames();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getFrames <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames</em>' containment reference.
	 * @see #getFrames()
	 * @generated
	 */
	void setFrames(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The duration of the recording in seconds - for audio and video.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(UnsignedInt)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual content of the media - inline or by direct reference to the media source file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getMedia_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getContent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Media#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Attachment value);

} // Media
