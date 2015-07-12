/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This special resource type is used to represent [operation](operations.html] request and response. It has no other use, and there is no RESTful end=point associated with it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Parameters#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getParameters()
 * @model extendedMetaData="name='Parameters' kind='elementOnly'"
 * @generated
 */
public interface Parameters extends Resource {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ParametersParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter passed to or received from the operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getParameters_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParametersParameter> getParameter();

} // Parameters
