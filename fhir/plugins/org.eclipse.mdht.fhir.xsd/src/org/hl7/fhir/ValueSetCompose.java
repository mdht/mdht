/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Compose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value set specifies a set of codes drawn from one or more code systems.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ValueSetCompose#getImport <em>Import</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetCompose#getInclude <em>Include</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetCompose#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getValueSetCompose()
 * @model extendedMetaData="name='ValueSet.Compose' kind='elementOnly'"
 * @generated
 */
public interface ValueSetCompose extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetCompose_Import()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getImport();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetInclude}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Include one or more codes from a code system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetCompose_Include()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetInclude> getInclude();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetInclude}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exclude one or more codes from the value set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getValueSetCompose_Exclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetInclude> getExclude();

} // ValueSetCompose
