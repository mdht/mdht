/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conformance Search Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConformanceSearchParam#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceSearchParam#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceSearchParam#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceSearchParam#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceSearchParam#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.ConformanceSearchParam#getChain <em>Chain</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConformanceSearchParam()
 * @model extendedMetaData="name='Conformance.SearchParam' kind='elementOnly'"
 * @generated
 */
public interface ConformanceSearchParam extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the search parameter used in the interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformanceSearchParam_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceSearchParam#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]]).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Uri)
	 * @see org.hl7.fhir.FhirPackage#getConformanceSearchParam_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceSearchParam#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Uri value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of value a search parameter refers to, and how the content is interpreted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(SearchParamType)
	 * @see org.hl7.fhir.FhirPackage#getConformanceSearchParam_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	SearchParamType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceSearchParam#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SearchParamType value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConformanceSearchParam_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConformanceSearchParam#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Types of resource (if a resource is referenced).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceSearchParam_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getTarget();

	/**
	 * Returns the value of the '<em><b>Chain</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Chained names supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chain</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConformanceSearchParam_Chain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getChain();

} // ConformanceSearchParam
