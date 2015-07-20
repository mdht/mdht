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
 * A representation of the literals of the enumeration '<em><b>Concept Map Equivalence List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getConceptMapEquivalenceList()
 * @model extendedMetaData="name='ConceptMapEquivalence-list'"
 * @generated
 */
public enum ConceptMapEquivalenceList implements Enumerator {
	/**
	 * The '<em><b>Equivalent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIVALENT_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIVALENT(0, "equivalent", "equivalent"),

	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(1, "equal", "equal"),

	/**
	 * The '<em><b>Wider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDER_VALUE
	 * @generated
	 * @ordered
	 */
	WIDER(2, "wider", "wider"),

	/**
	 * The '<em><b>Subsumes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSUMES_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSUMES(3, "subsumes", "subsumes"),

	/**
	 * The '<em><b>Narrower</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARROWER_VALUE
	 * @generated
	 * @ordered
	 */
	NARROWER(4, "narrower", "narrower"),

	/**
	 * The '<em><b>Specializes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIALIZES_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIALIZES(5, "specializes", "specializes"),

	/**
	 * The '<em><b>Inexact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INEXACT_VALUE
	 * @generated
	 * @ordered
	 */
	INEXACT(6, "inexact", "inexact"),

	/**
	 * The '<em><b>Unmatched</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNMATCHED_VALUE
	 * @generated
	 * @ordered
	 */
	UNMATCHED(7, "unmatched", "unmatched"),

	/**
	 * The '<em><b>Disjoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISJOINT_VALUE
	 * @generated
	 * @ordered
	 */
	DISJOINT(8, "disjoint", "disjoint");

	/**
	 * The '<em><b>Equivalent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definitions of the concepts mean the same thing (including when structural implications of meaning are considered) (i.e. extensionally identical)
	 * <!-- end-model-doc -->
	 * @see #EQUIVALENT
	 * @model name="equivalent"
	 * @generated
	 * @ordered
	 */
	public static final int EQUIVALENT_VALUE = 0;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The definitions of the concepts are exactly the same (i.e. only grammatical differences) and structural implications of meaning are identifical or irrelevant (i.e. intensionally identical)
	 * <!-- end-model-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 1;

	/**
	 * The '<em><b>Wider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target mapping is wider in meaning than the source concept
	 * <!-- end-model-doc -->
	 * @see #WIDER
	 * @model name="wider"
	 * @generated
	 * @ordered
	 */
	public static final int WIDER_VALUE = 2;

	/**
	 * The '<em><b>Subsumes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target mapping subsumes the meaning of the source concept (e.g. the source is-a target)
	 * <!-- end-model-doc -->
	 * @see #SUBSUMES
	 * @model name="subsumes"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSUMES_VALUE = 3;

	/**
	 * The '<em><b>Narrower</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target mapping is narrower in meaning that the source concept. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when atempting to use these mappings operationally
	 * <!-- end-model-doc -->
	 * @see #NARROWER
	 * @model name="narrower"
	 * @generated
	 * @ordered
	 */
	public static final int NARROWER_VALUE = 4;

	/**
	 * The '<em><b>Specializes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target mapping specializes the meaning of the source concept (e.g. the target is-a source)
	 * <!-- end-model-doc -->
	 * @see #SPECIALIZES
	 * @model name="specializes"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIALIZES_VALUE = 5;

	/**
	 * The '<em><b>Inexact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target mapping overlaps with the source concept, but both source and target cover additional meaning, or the definitions are imprecise and it is uncertain whether they have the same boundaries to their meaning. The sense in which the mapping is narrower SHALL be described in the comments in this case, and applications should be careful when atempting to use these mappings operationally
	 * <!-- end-model-doc -->
	 * @see #INEXACT
	 * @model name="inexact"
	 * @generated
	 * @ordered
	 */
	public static final int INEXACT_VALUE = 6;

	/**
	 * The '<em><b>Unmatched</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is no match for this concept in the destination concept system
	 * <!-- end-model-doc -->
	 * @see #UNMATCHED
	 * @model name="unmatched"
	 * @generated
	 * @ordered
	 */
	public static final int UNMATCHED_VALUE = 7;

	/**
	 * The '<em><b>Disjoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an explicit assertion that there is no mapping between the source and target concept
	 * <!-- end-model-doc -->
	 * @see #DISJOINT
	 * @model name="disjoint"
	 * @generated
	 * @ordered
	 */
	public static final int DISJOINT_VALUE = 8;

	/**
	 * An array of all the '<em><b>Concept Map Equivalence List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConceptMapEquivalenceList[] VALUES_ARRAY =
		new ConceptMapEquivalenceList[] {
			EQUIVALENT,
			EQUAL,
			WIDER,
			SUBSUMES,
			NARROWER,
			SPECIALIZES,
			INEXACT,
			UNMATCHED,
			DISJOINT,
		};

	/**
	 * A public read-only list of all the '<em><b>Concept Map Equivalence List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConceptMapEquivalenceList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Concept Map Equivalence List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapEquivalenceList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptMapEquivalenceList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Map Equivalence List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapEquivalenceList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptMapEquivalenceList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concept Map Equivalence List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConceptMapEquivalenceList get(int value) {
		switch (value) {
			case EQUIVALENT_VALUE: return EQUIVALENT;
			case EQUAL_VALUE: return EQUAL;
			case WIDER_VALUE: return WIDER;
			case SUBSUMES_VALUE: return SUBSUMES;
			case NARROWER_VALUE: return NARROWER;
			case SPECIALIZES_VALUE: return SPECIALIZES;
			case INEXACT_VALUE: return INEXACT;
			case UNMATCHED_VALUE: return UNMATCHED;
			case DISJOINT_VALUE: return DISJOINT;
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
	private ConceptMapEquivalenceList(int value, String name, String literal) {
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
	
} //ConceptMapEquivalenceList
