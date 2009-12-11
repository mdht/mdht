/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A relationship between the containing coded concept and another concept in the same or another code system.
 * UML: Stereotype on dependency between two codes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship#getProperty <em>Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship#getTargetConcept <em>Target Concept</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship#getRelationshipName <em>Relationship Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptRelationship()
 * @model extendedMetaData="name='ConceptRelationship' kind='elementOnly'"
 * @generated
 */
public interface ConceptRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property associated with this particular relationship.  (E.g. multiplier for UCUM)
	 * UML: Complex tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptRelationship_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Target Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the concept to which the relationship is being asserted
	 * UML: Identifies the client of the dependency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Concept</em>' containment reference.
	 * @see #setTargetConcept(ConceptRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptRelationship_TargetConcept()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptRef getTargetConcept();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship#getTargetConcept <em>Target Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Concept</em>' containment reference.
	 * @see #getTargetConcept()
	 * @generated
	 */
	void setTargetConcept(ConceptRef value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that the relationship is derivable by a corresponding reverse relationship from the relationship target.  Derived relations may be included for publishing or processing efficiency purposes but should not be present in definitional packages
	 * UML: Complex tag on dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #isSetIsDerived()
	 * @see #unsetIsDerived()
	 * @see #setIsDerived(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptRelationship_IsDerived()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isDerived'"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isSetIsDerived()
	 * @see #unsetIsDerived()
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDerived()
	 * @see #isIsDerived()
	 * @see #setIsDerived(boolean)
	 * @generated
	 */
	void unsetIsDerived();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship#isIsDerived <em>Is Derived</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Derived</em>' attribute is set.
	 * @see #unsetIsDerived()
	 * @see #isIsDerived()
	 * @see #setIsDerived(boolean)
	 * @generated
	 */
	boolean isSetIsDerived();

	/**
	 * Returns the value of the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies what kind of relationship is being asserte
	 * UML: Specialization of the dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Name</em>' attribute.
	 * @see #setRelationshipName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptRelationship_RelationshipName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.BasicFormalName" required="true"
	 *        extendedMetaData="kind='attribute' name='relationshipName'"
	 * @generated
	 */
	String getRelationshipName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship#getRelationshipName <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Name</em>' attribute.
	 * @see #getRelationshipName()
	 * @generated
	 */
	void setRelationshipName(String value);

} // ConceptRelationship
