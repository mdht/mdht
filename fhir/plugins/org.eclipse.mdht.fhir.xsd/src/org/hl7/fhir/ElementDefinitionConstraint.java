/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Definition Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Captures constraints on each element within the resource, profile, or extension.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ElementDefinitionConstraint#getKey <em>Key</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionConstraint#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionConstraint#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionConstraint#getHuman <em>Human</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionConstraint#getXpath <em>Xpath</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint()
 * @model extendedMetaData="name='ElementDefinition.Constraint' kind='elementOnly'"
 * @generated
 */
public interface ElementDefinitionConstraint extends Element {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows identification of which elements have their cardinalities impacted by the constraint.  Will not be referenced for constraints that do not affect cardinality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(Id)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint_Key()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getKey();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionConstraint#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Id value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to label the constraint in OCL or in short displays incapable of displaying the full human description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionConstraint#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the impact constraint violation has on the conformance of the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(ConstraintSeverity)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint_Severity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintSeverity getSeverity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionConstraint#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(ConstraintSeverity value);

	/**
	 * Returns the value of the '<em><b>Human</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text that can be used to describe the constraint in messages identifying that the constraint has been violated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Human</em>' containment reference.
	 * @see #setHuman(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint_Human()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='human' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getHuman();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionConstraint#getHuman <em>Human</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human</em>' containment reference.
	 * @see #getHuman()
	 * @generated
	 */
	void setHuman(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An XPath expression of constraint that can be executed to see if this constraint is met.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xpath</em>' containment reference.
	 * @see #setXpath(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getElementDefinitionConstraint_Xpath()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xpath' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getXpath();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionConstraint#getXpath <em>Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' containment reference.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(org.hl7.fhir.String value);

} // ElementDefinitionConstraint
