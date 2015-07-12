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
 * A representation of the literals of the enumeration '<em><b>Encounter State List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getEncounterStateList()
 * @model extendedMetaData="name='EncounterState-list'"
 * @generated
 */
public enum EncounterStateList implements Enumerator {
	/**
	 * The '<em><b>Planned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNED_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNED(0, "planned", "planned"),

	/**
	 * The '<em><b>Arrived</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRIVED_VALUE
	 * @generated
	 * @ordered
	 */
	ARRIVED(1, "arrived", "arrived"),

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
	 * The '<em><b>Onleave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONLEAVE_VALUE
	 * @generated
	 * @ordered
	 */
	ONLEAVE(3, "onleave", "onleave"),

	/**
	 * The '<em><b>Finished</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINISHED_VALUE
	 * @generated
	 * @ordered
	 */
	FINISHED(4, "finished", "finished"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(5, "cancelled", "cancelled");

	/**
	 * The '<em><b>Planned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encounter has not yet started.
	 * <!-- end-model-doc -->
	 * @see #PLANNED
	 * @model name="planned"
	 * @generated
	 * @ordered
	 */
	public static final int PLANNED_VALUE = 0;

	/**
	 * The '<em><b>Arrived</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Patient is present for the encounter, however is not currently meeting with a practitioner.
	 * <!-- end-model-doc -->
	 * @see #ARRIVED
	 * @model name="arrived"
	 * @generated
	 * @ordered
	 */
	public static final int ARRIVED_VALUE = 1;

	/**
	 * The '<em><b>In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encounter has begun and the patient is present / the practitioner and the patient are meeting.
	 * <!-- end-model-doc -->
	 * @see #IN_PROGRESS
	 * @model name="inProgress" literal="in-progress"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROGRESS_VALUE = 2;

	/**
	 * The '<em><b>Onleave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encounter has begun, but the patient is temporarily on leave.
	 * <!-- end-model-doc -->
	 * @see #ONLEAVE
	 * @model name="onleave"
	 * @generated
	 * @ordered
	 */
	public static final int ONLEAVE_VALUE = 3;

	/**
	 * The '<em><b>Finished</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encounter has ended.
	 * <!-- end-model-doc -->
	 * @see #FINISHED
	 * @model name="finished"
	 * @generated
	 * @ordered
	 */
	public static final int FINISHED_VALUE = 4;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encounter has ended before it has begun.
	 * <!-- end-model-doc -->
	 * @see #CANCELLED
	 * @model name="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Encounter State List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EncounterStateList[] VALUES_ARRAY =
		new EncounterStateList[] {
			PLANNED,
			ARRIVED,
			IN_PROGRESS,
			ONLEAVE,
			FINISHED,
			CANCELLED,
		};

	/**
	 * A public read-only list of all the '<em><b>Encounter State List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EncounterStateList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encounter State List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncounterStateList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncounterStateList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encounter State List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncounterStateList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncounterStateList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encounter State List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EncounterStateList get(int value) {
		switch (value) {
			case PLANNED_VALUE: return PLANNED;
			case ARRIVED_VALUE: return ARRIVED;
			case IN_PROGRESS_VALUE: return IN_PROGRESS;
			case ONLEAVE_VALUE: return ONLEAVE;
			case FINISHED_VALUE: return FINISHED;
			case CANCELLED_VALUE: return CANCELLED;
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
	private EncounterStateList(int value, String name, String literal) {
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
	
} //EncounterStateList
