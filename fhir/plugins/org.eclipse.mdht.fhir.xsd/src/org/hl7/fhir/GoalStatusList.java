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
 * A representation of the literals of the enumeration '<em><b>Goal Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getGoalStatusList()
 * @model extendedMetaData="name='GoalStatus-list'"
 * @generated
 */
public enum GoalStatusList implements Enumerator {
	/**
	 * The '<em><b>Proposed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	PROPOSED(0, "proposed", "proposed"),

	/**
	 * The '<em><b>Planned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNED_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNED(1, "planned", "planned"),

	/**
	 * The '<em><b>In Progress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROGRESS(2, "inProgress", "in-progress"),

	/**
	 * The '<em><b>Achieved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACHIEVED_VALUE
	 * @generated
	 * @ordered
	 */
	ACHIEVED(3, "achieved", "achieved"),

	/**
	 * The '<em><b>Sustaining</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSTAINING_VALUE
	 * @generated
	 * @ordered
	 */
	SUSTAINING(4, "sustaining", "sustaining"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(5, "cancelled", "cancelled"),

	/**
	 * The '<em><b>Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(6, "accepted", "accepted"),

	/**
	 * The '<em><b>Rejected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(7, "rejected", "rejected");

	/**
	 * The '<em><b>Proposed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A goal is proposed for this patient.
	 * <!-- end-model-doc -->
	 * @see #PROPOSED
	 * @model name="proposed"
	 * @generated
	 * @ordered
	 */
	public static final int PROPOSED_VALUE = 0;

	/**
	 * The '<em><b>Planned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A goal is planned for this patient.
	 * <!-- end-model-doc -->
	 * @see #PLANNED
	 * @model name="planned"
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_VALUE = 1;

	/**
	 * The '<em><b>In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The goal is being sought but has not yet been reached.  (Also applies if goal was reached in the past but there has been regression and goal is being sought again).
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS
	 * @model name="inProgress" literal="in-progress"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 2;

	/**
	 * The '<em><b>Achieved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The goal has been met and no further action is needed.
	 * <!-- end-model-doc -->
	 * @see #ACHIEVED
	 * @model name="achieved"
	 * @generated
	 * @ordered
	 */
	public static final int ACHIEVED_VALUE = 3;

	/**
	 * The '<em><b>Sustaining</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The goal has been met, but ongoing activity is needed to sustain the goal objective.
	 * <!-- end-model-doc -->
	 * @see #SUSTAINING
	 * @model name="sustaining"
	 * @generated
	 * @ordered
	 */
	public static final int SUSTAINING_VALUE = 4;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The goal is no longer being sought.
	 * <!-- end-model-doc -->
	 * @see #CANCELLED
	 * @model name="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 5;

	/**
	 * The '<em><b>Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A proposed goal was accepted.
	 * <!-- end-model-doc -->
	 * @see #ACCEPTED
	 * @model name="accepted"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 6;

	/**
	 * The '<em><b>Rejected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A proposed goal was rejected.
	 * <!-- end-model-doc -->
	 * @see #REJECTED
	 * @model name="rejected"
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 7;

	/**
	 * An array of all the '<em><b>Goal Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GoalStatusList[] VALUES_ARRAY =
		new GoalStatusList[] {
			PROPOSED,
			PLANNED,
			IN_PROGRESS,
			ACHIEVED,
			SUSTAINING,
			CANCELLED,
			ACCEPTED,
			REJECTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Goal Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GoalStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Goal Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GoalStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Goal Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GoalStatusList get(int value) {
		switch (value) {
			case PROPOSED_VALUE: return PROPOSED;
			case PLANNED_VALUE: return PLANNED;
			case IN_PROGRESS_VALUE: return IN_PROGRESS;
			case ACHIEVED_VALUE: return ACHIEVED;
			case SUSTAINING_VALUE: return SUSTAINING;
			case CANCELLED_VALUE: return CANCELLED;
			case ACCEPTED_VALUE: return ACCEPTED;
			case REJECTED_VALUE: return REJECTED;
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
	private GoalStatusList(int value, String name, String literal) {
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
	
} //GoalStatusList
