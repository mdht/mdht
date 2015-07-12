/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CompositionSection#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.CompositionSection#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.CompositionSection#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.CompositionSection#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getCompositionSection()
 * @model extendedMetaData="name='Composition.Section' kind='elementOnly'"
 * @generated
 */
public interface CompositionSection extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getCompositionSection_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompositionSection#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code identifying the kind of content contained within the section. This must be consistent with the section title.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCompositionSection_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompositionSection#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content (narrative and data entries) associated with the section.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Reference)
	 * @see org.hl7.fhir.FhirPackage#getCompositionSection_Content()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompositionSection#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Reference value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CompositionSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A nested sub-section within this section.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCompositionSection_Section()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CompositionSection> getSection();

} // CompositionSection
