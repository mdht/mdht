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
 * A representation of the literals of the enumeration '<em><b>Negative Vote Resolution Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * List of allowed resolutions to a formal ballot (based on HL7 bylaws)
 * UML: Type for a complex tag value
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getNegativeVoteResolutionKind()
 * @model extendedMetaData="name='NegativeVoteResolutionKind'"
 * @generated
 */
public enum NegativeVoteResolutionKind implements Enumerator {
	/**
	 * The '<em><b>Unresolved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNRESOLVED_VALUE
	 * @generated
	 * @ordered
	 */
	UNRESOLVED(0, "Unresolved", "Unresolved"),

	/**
	 * The '<em><b>Non Substantive Proposed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_SUBSTANTIVE_PROPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	NON_SUBSTANTIVE_PROPOSED(1, "NonSubstantiveProposed", "Non-Substantive Proposed"),

	/**
	 * The '<em><b>Non Substantive Voted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_SUBSTANTIVE_VOTED_VALUE
	 * @generated
	 * @ordered
	 */
	NON_SUBSTANTIVE_VOTED(2, "NonSubstantiveVoted", "Non-Substantive Voted"),

	/**
	 * The '<em><b>Not Related Proposed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_RELATED_PROPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_RELATED_PROPOSED(3, "NotRelatedProposed", "Not Related Proposed"),

	/**
	 * The '<em><b>Not Related Voted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_RELATED_VOTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_RELATED_VOTED(4, "NotRelatedVoted", "Not Related Voted"),

	/**
	 * The '<em><b>Previously Considered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVIOUSLY_CONSIDERED_VALUE
	 * @generated
	 * @ordered
	 */
	PREVIOUSLY_CONSIDERED(5, "PreviouslyConsidered", "Previously Considered"),

	/**
	 * The '<em><b>Retracted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRACTED_VALUE
	 * @generated
	 * @ordered
	 */
	RETRACTED(6, "Retracted", "Retracted"),

	/**
	 * The '<em><b>Withdrawn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHDRAWN_VALUE
	 * @generated
	 * @ordered
	 */
	WITHDRAWN(7, "Withdrawn", "Withdrawn");

	/**
	 * The '<em><b>Unresolved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vote has not yet gone through resolution.
	 * <!-- end-model-doc -->
	 * @see #UNRESOLVED
	 * @model name="Unresolved"
	 * @generated
	 * @ordered
	 */
	public static final int UNRESOLVED_VALUE = 0;

	/**
	 * The '<em><b>Non Substantive Proposed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Responsible group has recommended that the negative vote be considered non-substantive.  (Issue raised does not provide sufficiently convincing reason to make changes to the item under ballot, or otherwise impede its adoption.)
	 * <!-- end-model-doc -->
	 * @see #NON_SUBSTANTIVE_PROPOSED
	 * @model name="NonSubstantiveProposed" literal="Non-Substantive Proposed"
	 * @generated
	 * @ordered
	 */
	public static final int NON_SUBSTANTIVE_PROPOSED_VALUE = 1;

	/**
	 * The '<em><b>Non Substantive Voted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ballot group has voted and declared the negative vote non-substantive.
	 * <!-- end-model-doc -->
	 * @see #NON_SUBSTANTIVE_VOTED
	 * @model name="NonSubstantiveVoted" literal="Non-Substantive Voted"
	 * @generated
	 * @ordered
	 */
	public static final int NON_SUBSTANTIVE_VOTED_VALUE = 2;

	/**
	 * The '<em><b>Not Related Proposed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Responsible group has recommended that the negative vote be considered not-related.  (Issue raised is not related to the current scope of the item under ballot, or does not prevent the item under ballot for being used for its defined intent.  Recommended changes may be considered as part of future versions.)  (Perhaps after further reading or explanation).
	 * <!-- end-model-doc -->
	 * @see #NOT_RELATED_PROPOSED
	 * @model name="NotRelatedProposed" literal="Not Related Proposed"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_RELATED_PROPOSED_VALUE = 3;

	/**
	 * The '<em><b>Not Related Voted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ballot group has voted and declared the negative vote non-related.
	 * <!-- end-model-doc -->
	 * @see #NOT_RELATED_VOTED
	 * @model name="NotRelatedVoted" literal="Not Related Voted"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_RELATED_VOTED_VALUE = 4;

	/**
	 * The '<em><b>Previously Considered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Committee identifies that the same issue has been raised as part of a previous ballot on the same element version and was found by the ballot group to be non-substantive or not related.)
	 * <!-- end-model-doc -->
	 * @see #PREVIOUSLY_CONSIDERED
	 * @model name="PreviouslyConsidered" literal="Previously Considered"
	 * @generated
	 * @ordered
	 */
	public static final int PREVIOUSLY_CONSIDERED_VALUE = 5;

	/**
	 * The '<em><b>Retracted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Voter has formally withdrawn their vote or comment as having been in error.  (Perhaps after further reading or explanation).
	 * <!-- end-model-doc -->
	 * @see #RETRACTED
	 * @model name="Retracted"
	 * @generated
	 * @ordered
	 */
	public static final int RETRACTED_VALUE = 6;

	/**
	 * The '<em><b>Withdrawn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Voter has formally withdrawn their vote or comment on the basis of agreed changes or proposed future changes.
	 * <!-- end-model-doc -->
	 * @see #WITHDRAWN
	 * @model name="Withdrawn"
	 * @generated
	 * @ordered
	 */
	public static final int WITHDRAWN_VALUE = 7;

	/**
	 * An array of all the '<em><b>Negative Vote Resolution Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NegativeVoteResolutionKind[] VALUES_ARRAY =
		new NegativeVoteResolutionKind[] {
			UNRESOLVED,
			NON_SUBSTANTIVE_PROPOSED,
			NON_SUBSTANTIVE_VOTED,
			NOT_RELATED_PROPOSED,
			NOT_RELATED_VOTED,
			PREVIOUSLY_CONSIDERED,
			RETRACTED,
			WITHDRAWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Negative Vote Resolution Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NegativeVoteResolutionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Negative Vote Resolution Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NegativeVoteResolutionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NegativeVoteResolutionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Negative Vote Resolution Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NegativeVoteResolutionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NegativeVoteResolutionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Negative Vote Resolution Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NegativeVoteResolutionKind get(int value) {
		switch (value) {
			case UNRESOLVED_VALUE: return UNRESOLVED;
			case NON_SUBSTANTIVE_PROPOSED_VALUE: return NON_SUBSTANTIVE_PROPOSED;
			case NON_SUBSTANTIVE_VOTED_VALUE: return NON_SUBSTANTIVE_VOTED;
			case NOT_RELATED_PROPOSED_VALUE: return NOT_RELATED_PROPOSED;
			case NOT_RELATED_VOTED_VALUE: return NOT_RELATED_VOTED;
			case PREVIOUSLY_CONSIDERED_VALUE: return PREVIOUSLY_CONSIDERED;
			case RETRACTED_VALUE: return RETRACTED;
			case WITHDRAWN_VALUE: return WITHDRAWN;
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
	private NegativeVoteResolutionKind(int value, String name, String literal) {
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
	
} //NegativeVoteResolutionKind
