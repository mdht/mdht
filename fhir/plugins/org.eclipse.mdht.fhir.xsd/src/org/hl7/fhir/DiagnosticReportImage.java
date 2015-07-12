/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Report Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretation, and formatted representation of diagnostic reports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DiagnosticReportImage#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.DiagnosticReportImage#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDiagnosticReportImage()
 * @model extendedMetaData="name='DiagnosticReport.Image' kind='elementOnly'"
 * @generated
 */
public interface DiagnosticReportImage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comment about the image. Typically, this is used to provide an explanation for why the image is included, or to draw the viewer's attention to important features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReportImage_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReportImage#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the image source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDiagnosticReportImage_Link()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLink();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DiagnosticReportImage#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Reference value);

} // DiagnosticReportImage
