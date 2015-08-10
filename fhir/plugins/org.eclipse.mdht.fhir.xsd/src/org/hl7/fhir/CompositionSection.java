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
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CompositionSection#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.CompositionSection#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.CompositionSection#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.CompositionSection#getMode <em>Mode</em>}</li>
 *   <li>{@link org.hl7.fhir.CompositionSection#getOrderedBy <em>Ordered By</em>}</li>
 *   <li>{@link org.hl7.fhir.CompositionSection#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.hl7.fhir.CompositionSection#getEmptyReason <em>Empty Reason</em>}</li>
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
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Narrative)
	 * @see org.hl7.fhir.FhirPackage#getCompositionSection_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	Narrative getText();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompositionSection#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Narrative value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(Code)
	 * @see org.hl7.fhir.FhirPackage#getCompositionSection_Mode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getMode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompositionSection#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Code value);

	/**
	 * Returns the value of the '<em><b>Ordered By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What order applies to the items in the section entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered By</em>' containment reference.
	 * @see #setOrderedBy(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCompositionSection_OrderedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getOrderedBy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompositionSection#getOrderedBy <em>Ordered By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered By</em>' containment reference.
	 * @see #getOrderedBy()
	 * @generated
	 */
	void setOrderedBy(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the actual resource from which the narrative in the section is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getCompositionSection_Entry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEntry();

	/**
	 * Returns the value of the '<em><b>Empty Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Empty Reason</em>' containment reference.
	 * @see #setEmptyReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getCompositionSection_EmptyReason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='emptyReason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getEmptyReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CompositionSection#getEmptyReason <em>Empty Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Reason</em>' containment reference.
	 * @see #getEmptyReason()
	 * @generated
	 */
	void setEmptyReason(CodeableConcept value);

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
