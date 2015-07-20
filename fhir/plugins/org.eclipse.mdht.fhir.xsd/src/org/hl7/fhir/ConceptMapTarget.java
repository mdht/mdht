/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConceptMapTarget#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapTarget#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapTarget#getEquivalence <em>Equivalence</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapTarget#getComments <em>Comments</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapTarget#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapTarget#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConceptMapTarget()
 * @model extendedMetaData="name='ConceptMap.Target' kind='elementOnly'"
 * @generated
 */
public interface ConceptMapTarget extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that identifies the code system of the target code (if the target is a value set that cross code systems).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference.
	 * @see #setCodeSystem(Uri)
	 * @see org.hl7.fhir.FhirPackage#getConceptMapTarget_CodeSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getCodeSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapTarget#getCodeSystem <em>Code System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code System</em>' containment reference.
	 * @see #getCodeSystem()
	 * @generated
	 */
	void setCodeSystem(Uri value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identity (code or path) or the element/item that the map refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getConceptMapTarget_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapTarget#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Equivalence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The equivalence between the source and target concepts (counting for the dependencies and products). The equivalence is read from target to source (e.g. the target is 'wider' than the source).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Equivalence</em>' containment reference.
	 * @see #setEquivalence(Code)
	 * @see org.hl7.fhir.FhirPackage#getConceptMapTarget_Equivalence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='equivalence' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getEquivalence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapTarget#getEquivalence <em>Equivalence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equivalence</em>' containment reference.
	 * @see #getEquivalence()
	 * @generated
	 */
	void setEquivalence(Code value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of status/issues in mapping that conveys additional information not represented in  the structured data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference.
	 * @see #setComments(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getConceptMapTarget_Comments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comments' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComments();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapTarget#getComments <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' containment reference.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConceptMapDependsOn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConceptMapTarget_DependsOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependsOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptMapDependsOn> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConceptMapDependsOn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of additional outcomes from this mapping to other elements. To properly execute this mapping, the specified element must be mapped to some data element or source that is in context. The mapping may still be useful without a place for the additional data elements, but the equivalence cannot be relied on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConceptMapTarget_Product()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='product' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptMapDependsOn> getProduct();

} // ConceptMapTarget
