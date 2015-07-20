/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Observation Relationship Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getObservationRelationshipTypeList()
 * @model extendedMetaData="name='ObservationRelationshipType-list'"
 * @generated
 */
public enum ObservationRelationshipTypeList implements Enumerator {
	/**
	 * The '<em><b>Has Member</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_MEMBER_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_MEMBER(0, "hasMember", "has-member"),

	/**
	 * The '<em><b>Derived From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVED_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVED_FROM(1, "derivedFrom", "derived-from"),

	/**
	 * The '<em><b>Sequel To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUEL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUEL_TO(2, "sequelTo", "sequel-to"),

	/**
	 * The '<em><b>Replaces</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACES_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACES(3, "replaces", "replaces"),

	/**
	 * The '<em><b>Qualified By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUALIFIED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	QUALIFIED_BY(4, "qualifiedBy", "qualified-by"),

	/**
	 * The '<em><b>Interfered By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFERED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFERED_BY(5, "interferedBy", "interfered-by");

	/**
	 * The '<em><b>Has Member</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group
	 * <!-- end-model-doc -->
	 * @see #HAS_MEMBER
	 * @model name="hasMember" literal="has-member"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_MEMBER_VALUE = 0;

	/**
	 * The '<em><b>Derived From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target resource (Observation or QuestionnaireAnswer) is part of the information from which this observation value is derived. (e.g. calculated anion gap, Apgar score)  NOTE:  "derived-from" is only logical choice when referencing QuestionnaireAnswer
	 * <!-- end-model-doc -->
	 * @see #DERIVED_FROM
	 * @model name="derivedFrom" literal="derived-from"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVED_FROM_VALUE = 1;

	/**
	 * The '<em><b>Sequel To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This observation follows the target observation (e.g. timed tests such as Glucose Tolerance Test)
	 * <!-- end-model-doc -->
	 * @see #SEQUEL_TO
	 * @model name="sequelTo" literal="sequel-to"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUEL_TO_VALUE = 2;

	/**
	 * The '<em><b>Replaces</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This observation replaces a previous observation (i.e. a revised value). The target observation is now obsolete
	 * <!-- end-model-doc -->
	 * @see #REPLACES
	 * @model name="replaces"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACES_VALUE = 3;

	/**
	 * The '<em><b>Qualified By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the target observation qualifies (refines) the semantics of the source observation (e.g. a lipaemia measure target from a plasma measure)
	 * <!-- end-model-doc -->
	 * @see #QUALIFIED_BY
	 * @model name="qualifiedBy" literal="qualified-by"
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFIED_BY_VALUE = 4;

	/**
	 * The '<em><b>Interfered By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the target observation interferes (degardes quality, or prevents valid observation) with the semantics of the source observation (e.g. a hemolysis measure target from a plasma potassium measure which has no value)
	 * <!-- end-model-doc -->
	 * @see #INTERFERED_BY
	 * @model name="interferedBy" literal="interfered-by"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFERED_BY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Observation Relationship Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObservationRelationshipTypeList[] VALUES_ARRAY =
		new ObservationRelationshipTypeList[] {
			HAS_MEMBER,
			DERIVED_FROM,
			SEQUEL_TO,
			REPLACES,
			QUALIFIED_BY,
			INTERFERED_BY,
		};

	/**
	 * A public read-only list of all the '<em><b>Observation Relationship Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObservationRelationshipTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Observation Relationship Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationRelationshipTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationRelationshipTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Relationship Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationRelationshipTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationRelationshipTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Relationship Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationRelationshipTypeList get(int value) {
		switch (value) {
			case HAS_MEMBER_VALUE: return HAS_MEMBER;
			case DERIVED_FROM_VALUE: return DERIVED_FROM;
			case SEQUEL_TO_VALUE: return SEQUEL_TO;
			case REPLACES_VALUE: return REPLACES;
			case QUALIFIED_BY_VALUE: return QUALIFIED_BY;
			case INTERFERED_BY_VALUE: return INTERFERED_BY;
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
	private ObservationRelationshipTypeList(int value, String name, String literal) {
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
	
} //ObservationRelationshipTypeList
