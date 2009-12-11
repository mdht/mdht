/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Concept Relationship Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Code representing a type of relationship between concepts or vocabulary domains.
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getConceptRelationshipKind()
 * @model extendedMetaData="name='ConceptRelationshipKind'"
 * @generated
 */
public enum ConceptRelationshipKind implements Enumerator {
	/**
	 * The '<em><b>Specializes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIALIZES_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIALIZES(0, "Specializes", "Specializes"),

	/**
	 * The '<em><b>Component Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_OF_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT_OF(1, "ComponentOf", "ComponentOf"),

	/**
	 * The '<em><b>Grouped By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUPED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	GROUPED_BY(2, "GroupedBy", "GroupedBy"),

	/**
	 * The '<em><b>Less Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN(3, "LessThan", "LessThan"),

	/**
	 * The '<em><b>Definitionally Qualifies</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFINITIONALLY_QUALIFIES_VALUE
	 * @generated
	 * @ordered
	 */
	DEFINITIONALLY_QUALIFIES(4, "DefinitionallyQualifies", "DefinitionallyQualifies"),

	/**
	 * The '<em><b>Non Definitionally Qualifies</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_DEFINITIONALLY_QUALIFIES_VALUE
	 * @generated
	 * @ordered
	 */
	NON_DEFINITIONALLY_QUALIFIES(5, "NonDefinitionallyQualifies", "NonDefinitionallyQualifies"),

	/**
	 * The '<em><b>Generalizes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERALIZES_VALUE
	 * @generated
	 * @ordered
	 */
	GENERALIZES(6, "Generalizes", "Generalizes"),

	/**
	 * The '<em><b>Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT(7, "Component", "Component"),

	/**
	 * The '<em><b>In Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	IN_GROUP(8, "InGroup", "InGroup"),

	/**
	 * The '<em><b>Greater Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN(9, "GreaterThan", "GreaterThan"),

	/**
	 * The '<em><b>Definitionally Qualified By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFINITIONALLY_QUALIFIED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	DEFINITIONALLY_QUALIFIED_BY(10, "DefinitionallyQualifiedBy", "DefinitionallyQualifiedBy"),

	/**
	 * The '<em><b>Non Definitionally Qualified By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_DEFINITIONALLY_QUALIFIED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	NON_DEFINITIONALLY_QUALIFIED_BY(11, "NonDefinitionallyQualifiedBy", "NonDefinitionallyQualifiedBy"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(12, "Other", "Other");

	/**
	 * The '<em><b>Specializes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The child code is a more narrow version of concept represented by the parent code.  I.e. Every child concept is also a valid parent concept.  Used to allow determination of subsumption.  Must be transitive, irreflexive, antisymetric.
	 * <!-- end-model-doc -->
	 * @see #SPECIALIZES
	 * @model name="Specializes"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIALIZES_VALUE = 0;

	/**
	 * The '<em><b>Component Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The child code is a part of the concept represented by the parent code.  Used to determine allowed nesting, for example of address components.  Must be transitive, irreflexive, antisymetric.
	 * <!-- end-model-doc -->
	 * @see #COMPONENT_OF
	 * @model name="ComponentOf"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_OF_VALUE = 1;

	/**
	 * The '<em><b>Grouped By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The child code is a part of a grouping represented by the parent code.  Used to determine navigational hierarchy not based on a specializes or component relationship.  E.g. ICD9 hierarchy.  Is transitive, irreflexive and antisymetric
	 * <!-- end-model-doc -->
	 * @see #GROUPED_BY
	 * @model name="GroupedBy"
	 * @generated
	 * @ordered
	 */
	public static final int GROUPED_BY_VALUE = 2;

	/**
	 * The '<em><b>Less Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For coded ordeinal code systems, indicates that the specified code is considered less than the related code.  Used to determine relationships for coded ordinals.  Must be transitive, irreflexive, antisymetric.
	 * <!-- end-model-doc -->
	 * @see #LESS_THAN
	 * @model name="LessThan"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_VALUE = 3;

	/**
	 * The '<em><b>Definitionally Qualifies</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a code that can act as a qualifier for the referenced code, both as part of concept definition within the code system and as part of run-time concept definition to determine concepts allowed for use as qualifiers for a concept within a CD datatype.  Must be non-transitive, irreflexive.
	 * <!-- end-model-doc -->
	 * @see #DEFINITIONALLY_QUALIFIES
	 * @model name="DefinitionallyQualifies"
	 * @generated
	 * @ordered
	 */
	public static final int DEFINITIONALLY_QUALIFIES_VALUE = 4;

	/**
	 * The '<em><b>Non Definitionally Qualifies</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Same as definitionally qualifies, but restricted to only being used at run-time.  Must be non-transitive, irreflexive.
	 * <!-- end-model-doc -->
	 * @see #NON_DEFINITIONALLY_QUALIFIES
	 * @model name="NonDefinitionallyQualifies"
	 * @generated
	 * @ordered
	 */
	public static final int NON_DEFINITIONALLY_QUALIFIES_VALUE = 5;

	/**
	 * The '<em><b>Generalizes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inverse of Specializes.  Only included as a derived relationship
	 * <!-- end-model-doc -->
	 * @see #GENERALIZES
	 * @model name="Generalizes"
	 * @generated
	 * @ordered
	 */
	public static final int GENERALIZES_VALUE = 6;

	/**
	 * The '<em><b>Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inverse of ComponentOf.  Only included as a derived relationship
	 * <!-- end-model-doc -->
	 * @see #COMPONENT
	 * @model name="Component"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_VALUE = 7;

	/**
	 * The '<em><b>In Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inverse of GroupedBy.  Only included as a derived relationship
	 * <!-- end-model-doc -->
	 * @see #IN_GROUP
	 * @model name="InGroup"
	 * @generated
	 * @ordered
	 */
	public static final int IN_GROUP_VALUE = 8;

	/**
	 * The '<em><b>Greater Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inverse of LessThan.  Only included as a derived relationship
	 * <!-- end-model-doc -->
	 * @see #GREATER_THAN
	 * @model name="GreaterThan"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_VALUE = 9;

	/**
	 * The '<em><b>Definitionally Qualified By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inverse of DefinitionallyQualifies.  Only included as a derived relationship
	 * <!-- end-model-doc -->
	 * @see #DEFINITIONALLY_QUALIFIED_BY
	 * @model name="DefinitionallyQualifiedBy"
	 * @generated
	 * @ordered
	 */
	public static final int DEFINITIONALLY_QUALIFIED_BY_VALUE = 10;

	/**
	 * The '<em><b>Non Definitionally Qualified By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inverse of NonDefinitionallyQualifies.  Only included as a derived relationship
	 * <!-- end-model-doc -->
	 * @see #NON_DEFINITIONALLY_QUALIFIED_BY
	 * @model name="NonDefinitionallyQualifiedBy"
	 * @generated
	 * @ordered
	 */
	public static final int NON_DEFINITIONALLY_QUALIFIED_BY_VALUE = 11;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The child code has a relationship with the parent that does not follow one of the pre-defined stereotypical patterns.  Any application behavior based on the relationship must be custom-coded.  Transitivity, Reflexivity and Symmetry must be asserted
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 12;

	/**
	 * An array of all the '<em><b>Concept Relationship Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConceptRelationshipKind[] VALUES_ARRAY =
		new ConceptRelationshipKind[] {
			SPECIALIZES,
			COMPONENT_OF,
			GROUPED_BY,
			LESS_THAN,
			DEFINITIONALLY_QUALIFIES,
			NON_DEFINITIONALLY_QUALIFIES,
			GENERALIZES,
			COMPONENT,
			IN_GROUP,
			GREATER_THAN,
			DEFINITIONALLY_QUALIFIED_BY,
			NON_DEFINITIONALLY_QUALIFIED_BY,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Concept Relationship Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConceptRelationshipKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Concept Relationship Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptRelationshipKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptRelationshipKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Relationship Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptRelationshipKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptRelationshipKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Relationship Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptRelationshipKind get(int value) {
		switch (value) {
			case SPECIALIZES_VALUE: return SPECIALIZES;
			case COMPONENT_OF_VALUE: return COMPONENT_OF;
			case GROUPED_BY_VALUE: return GROUPED_BY;
			case LESS_THAN_VALUE: return LESS_THAN;
			case DEFINITIONALLY_QUALIFIES_VALUE: return DEFINITIONALLY_QUALIFIES;
			case NON_DEFINITIONALLY_QUALIFIES_VALUE: return NON_DEFINITIONALLY_QUALIFIES;
			case GENERALIZES_VALUE: return GENERALIZES;
			case COMPONENT_VALUE: return COMPONENT;
			case IN_GROUP_VALUE: return IN_GROUP;
			case GREATER_THAN_VALUE: return GREATER_THAN;
			case DEFINITIONALLY_QUALIFIED_BY_VALUE: return DEFINITIONALLY_QUALIFIED_BY;
			case NON_DEFINITIONALLY_QUALIFIED_BY_VALUE: return NON_DEFINITIONALLY_QUALIFIED_BY;
			case OTHER_VALUE: return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConceptRelationshipKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConceptRelationshipKind
