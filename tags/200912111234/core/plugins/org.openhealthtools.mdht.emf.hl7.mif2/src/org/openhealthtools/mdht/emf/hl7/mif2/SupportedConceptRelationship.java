/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Concept Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type of concept relationship supported by the containing code system.
 * Identifies an allowed kind of dependency between enumeration literals
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getAllowedForSources <em>Allowed For Sources</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getAllowedForTargets <em>Allowed For Targets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getRequiredForSources <em>Required For Sources</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getRequiredForTargets <em>Required For Targets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getSupportedProperty <em>Supported Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getDefiningConcept <em>Defining Concept</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#isFunctionalism <em>Functionalism</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getInverseName <em>Inverse Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#isIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getReflexivity <em>Reflexivity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getRelationshipKind <em>Relationship Kind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getTransitivity <em>Transitivity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship()
 * @model extendedMetaData="name='SupportedConceptRelationship' kind='elementOnly'"
 * @generated
 */
public interface SupportedConceptRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes how the relationship is intended to be used and what it's for
	 * UML: Part of complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Inline)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Inline getDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Inline value);

	/**
	 * Returns the value of the '<em><b>Allowed For Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that only codes within the defined value set are allowed to be the source of this type of relationship
	 * UML: Tag on SupportedRelationship dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed For Sources</em>' containment reference.
	 * @see #setAllowedForSources(ContentDefinition)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_AllowedForSources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedForSources' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentDefinition getAllowedForSources();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getAllowedForSources <em>Allowed For Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed For Sources</em>' containment reference.
	 * @see #getAllowedForSources()
	 * @generated
	 */
	void setAllowedForSources(ContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Allowed For Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that only codes within the defined value set are allowed to be the target of this type of relationship
	 * UML: Tag on SupportedRelationship dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed For Targets</em>' containment reference.
	 * @see #setAllowedForTargets(ContentDefinition)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_AllowedForTargets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedForTargets' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentDefinition getAllowedForTargets();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getAllowedForTargets <em>Allowed For Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed For Targets</em>' containment reference.
	 * @see #getAllowedForTargets()
	 * @generated
	 */
	void setAllowedForTargets(ContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Required For Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that codes meeting the requirements of this value set specification must be the source of a relationship of this type to be valid
	 * UML: Tag on SupportedRelationship dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required For Sources</em>' containment reference.
	 * @see #setRequiredForSources(ContentDefinition)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_RequiredForSources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredForSources' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentDefinition getRequiredForSources();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getRequiredForSources <em>Required For Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required For Sources</em>' containment reference.
	 * @see #getRequiredForSources()
	 * @generated
	 */
	void setRequiredForSources(ContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Required For Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If present, indicates that codes meeting the requirements of this value set specification must be the target of a relationship of this type to be valid
	 * UML: Tag on SupportedRelationship dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required For Targets</em>' containment reference.
	 * @see #setRequiredForTargets(ContentDefinition)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_RequiredForTargets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredForTargets' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentDefinition getRequiredForTargets();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getRequiredForTargets <em>Required For Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required For Targets</em>' containment reference.
	 * @see #getRequiredForTargets()
	 * @generated
	 */
	void setRequiredForTargets(ContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Supported Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UML: Tag on SupportedRelationship dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_SupportedProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportedProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupportedProperty> getSupportedProperty();

	/**
	 * Returns the value of the '<em><b>Defining Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the concept within the vocabulary that is considered to define this particular relationship
	 * UML: Supplier dependency for the relationship
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defining Concept</em>' containment reference.
	 * @see #setDefiningConcept(ConceptRef)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_DefiningConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definingConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptRef getDefiningConcept();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getDefiningConcept <em>Defining Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Concept</em>' containment reference.
	 * @see #getDefiningConcept()
	 * @generated
	 */
	void setDefiningConcept(ConceptRef value);

	/**
	 * Returns the value of the '<em><b>Functionalism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether codes are limited to only one out-going relationship (functional), only one incoming relationship (reverse-functional) or both.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functionalism</em>' attribute.
	 * @see #isSetFunctionalism()
	 * @see #unsetFunctionalism()
	 * @see #setFunctionalism(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_Functionalism()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='functionalism'"
	 * @generated
	 */
	boolean isFunctionalism();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#isFunctionalism <em>Functionalism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functionalism</em>' attribute.
	 * @see #isSetFunctionalism()
	 * @see #unsetFunctionalism()
	 * @see #isFunctionalism()
	 * @generated
	 */
	void setFunctionalism(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#isFunctionalism <em>Functionalism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFunctionalism()
	 * @see #isFunctionalism()
	 * @see #setFunctionalism(boolean)
	 * @generated
	 */
	void unsetFunctionalism();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#isFunctionalism <em>Functionalism</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Functionalism</em>' attribute is set.
	 * @see #unsetFunctionalism()
	 * @see #isFunctionalism()
	 * @see #setFunctionalism(boolean)
	 * @generated
	 */
	boolean isSetFunctionalism();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier within the code system for this particular relationship type
	 * UML: Tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_Id()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Inverse Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the name of the relationship that references the inverse of the current relationship.  Allows linking a relationship and its derived inverse.
	 * UML: Dependency.name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inverse Name</em>' attribute.
	 * @see #setInverseName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_InverseName()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalProperName"
	 *        extendedMetaData="kind='attribute' name='inverseName'"
	 * @generated
	 */
	String getInverseName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getInverseName <em>Inverse Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse Name</em>' attribute.
	 * @see #getInverseName()
	 * @generated
	 */
	void setInverseName(String value);

	/**
	 * Returns the value of the '<em><b>Is Navigable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the relationship is intended to be navigated when selecting a code.
	 * UML: Tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Navigable</em>' attribute.
	 * @see #isSetIsNavigable()
	 * @see #unsetIsNavigable()
	 * @see #setIsNavigable(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_IsNavigable()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isNavigable'"
	 * @generated
	 */
	boolean isIsNavigable();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#isIsNavigable <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Navigable</em>' attribute.
	 * @see #isSetIsNavigable()
	 * @see #unsetIsNavigable()
	 * @see #isIsNavigable()
	 * @generated
	 */
	void setIsNavigable(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#isIsNavigable <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsNavigable()
	 * @see #isIsNavigable()
	 * @see #setIsNavigable(boolean)
	 * @generated
	 */
	void unsetIsNavigable();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#isIsNavigable <em>Is Navigable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Navigable</em>' attribute is set.
	 * @see #unsetIsNavigable()
	 * @see #isIsNavigable()
	 * @see #setIsNavigable(boolean)
	 * @generated
	 */
	boolean isSetIsNavigable();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The label for the specific type of concept relationship supported by the code system
	 * UML: Dependency.name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.FormalProperName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reflexivity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.Reflexivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the association always holds for a concept with itself (refexive), never holds for a concept with itself (irreflexive)
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reflexivity</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Reflexivity
	 * @see #isSetReflexivity()
	 * @see #unsetReflexivity()
	 * @see #setReflexivity(Reflexivity)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_Reflexivity()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='reflexivity'"
	 * @generated
	 */
	Reflexivity getReflexivity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getReflexivity <em>Reflexivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflexivity</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Reflexivity
	 * @see #isSetReflexivity()
	 * @see #unsetReflexivity()
	 * @see #getReflexivity()
	 * @generated
	 */
	void setReflexivity(Reflexivity value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getReflexivity <em>Reflexivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReflexivity()
	 * @see #getReflexivity()
	 * @see #setReflexivity(Reflexivity)
	 * @generated
	 */
	void unsetReflexivity();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getReflexivity <em>Reflexivity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reflexivity</em>' attribute is set.
	 * @see #unsetReflexivity()
	 * @see #getReflexivity()
	 * @see #setReflexivity(Reflexivity)
	 * @generated
	 */
	boolean isSetReflexivity();

	/**
	 * Returns the value of the '<em><b>Relationship Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationshipKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the stereotypical behavior associated with the relationship
	 * UML: tag on SupportedRelationship dependency stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationshipKind
	 * @see #isSetRelationshipKind()
	 * @see #unsetRelationshipKind()
	 * @see #setRelationshipKind(ConceptRelationshipKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_RelationshipKind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='relationshipKind'"
	 * @generated
	 */
	ConceptRelationshipKind getRelationshipKind();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getRelationshipKind <em>Relationship Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationshipKind
	 * @see #isSetRelationshipKind()
	 * @see #unsetRelationshipKind()
	 * @see #getRelationshipKind()
	 * @generated
	 */
	void setRelationshipKind(ConceptRelationshipKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getRelationshipKind <em>Relationship Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationshipKind()
	 * @see #getRelationshipKind()
	 * @see #setRelationshipKind(ConceptRelationshipKind)
	 * @generated
	 */
	void unsetRelationshipKind();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getRelationshipKind <em>Relationship Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relationship Kind</em>' attribute is set.
	 * @see #unsetRelationshipKind()
	 * @see #getRelationshipKind()
	 * @see #setRelationshipKind(ConceptRelationshipKind)
	 * @generated
	 */
	boolean isSetRelationshipKind();

	/**
	 * Returns the value of the '<em><b>Symmetry</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.Symmetry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the relationship always holds in the reverse direction as well (symetric), never holds in the reverse direction as well (antisymetric)
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symmetry</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Symmetry
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #setSymmetry(Symmetry)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_Symmetry()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='symmetry'"
	 * @generated
	 */
	Symmetry getSymmetry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetry</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Symmetry
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @generated
	 */
	void setSymmetry(Symmetry value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(Symmetry)
	 * @generated
	 */
	void unsetSymmetry();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getSymmetry <em>Symmetry</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symmetry</em>' attribute is set.
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(Symmetry)
	 * @generated
	 */
	boolean isSetSymmetry();

	/**
	 * Returns the value of the '<em><b>Transitivity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.Transitivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the relationship always (transitive) or never (antitransitive) propagates such that if the association exists from A to B and from B to C that the relationship can be inferred to exist from A to C.
	 * UML: Tag on stereotype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitivity</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Transitivity
	 * @see #isSetTransitivity()
	 * @see #unsetTransitivity()
	 * @see #setTransitivity(Transitivity)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSupportedConceptRelationship_Transitivity()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='transitivity'"
	 * @generated
	 */
	Transitivity getTransitivity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getTransitivity <em>Transitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitivity</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Transitivity
	 * @see #isSetTransitivity()
	 * @see #unsetTransitivity()
	 * @see #getTransitivity()
	 * @generated
	 */
	void setTransitivity(Transitivity value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getTransitivity <em>Transitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransitivity()
	 * @see #getTransitivity()
	 * @see #setTransitivity(Transitivity)
	 * @generated
	 */
	void unsetTransitivity();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship#getTransitivity <em>Transitivity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transitivity</em>' attribute is set.
	 * @see #unsetTransitivity()
	 * @see #getTransitivity()
	 * @see #setTransitivity(Transitivity)
	 * @generated
	 */
	boolean isSetTransitivity();

} // SupportedConceptRelationship
