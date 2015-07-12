/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Map Element</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ConceptMapElement#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapElement#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapElement#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapElement#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getConceptMapElement()
 * @model extendedMetaData="name='ConceptMap.Element' kind='elementOnly'"
 * @generated
 */
public interface ConceptMapElement extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An absolute URI that identifies the Code System (if the source is a value value set that crosses more than one code system).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference.
	 * @see #setCodeSystem(Uri)
	 * @see org.hl7.fhir.FhirPackage#getConceptMapElement_CodeSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getCodeSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapElement#getCodeSystem <em>Code System</em>}' containment reference.
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
	 * Identity (code or path) or the element/item being mapped.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see org.hl7.fhir.FhirPackage#getConceptMapElement_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapElement#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConceptMapDependsOn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the specified element can be resolved, and it has the specified value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConceptMapElement_DependsOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependsOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptMapDependsOn> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConceptMapMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concept from the target value set that this concept maps to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getConceptMapElement_Map()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptMapMap> getMap();

} // ConceptMapElement
