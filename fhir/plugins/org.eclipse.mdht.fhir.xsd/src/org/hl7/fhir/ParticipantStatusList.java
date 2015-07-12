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
 * A representation of the literals of the enumeration '<em><b>Participant Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getParticipantStatusList()
 * @model extendedMetaData="name='ParticipantStatus-list'"
 * @generated
 */
public enum ParticipantStatusList implements Enumerator {
	/**
	 * The '<em><b>Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(0, "accepted", "accepted"),

	/**
	 * The '<em><b>Declined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLINED_VALUE
	 * @generated
	 * @ordered
	 */
	DECLINED(1, "declined", "declined"),

	/**
	 * The '<em><b>Tentative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENTATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	TENTATIVE(2, "tentative", "tentative"),

	/**
	 * The '<em><b>In Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROCESS(3, "inProcess", "in-process"),

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(4, "completed", "completed"),

	/**
	 * The '<em><b>Needs Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEEDS_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	NEEDS_ACTION(5, "needsAction", "needs-action");

	/**
	 * The '<em><b>Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The appointment participant has accepted that they can attend the appointment at the time specified in the AppointmentResponse.
	 * <!-- end-model-doc -->
	 * @see #ACCEPTED
	 * @model name="accepted"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 0;

	/**
	 * The '<em><b>Declined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The appointment participant has declined the appointment.
	 * <!-- end-model-doc -->
	 * @see #DECLINED
	 * @model name="declined"
	 * @generated
	 * @ordered
	 */
	public static final int DECLINED_VALUE = 1;

	/**
	 * The '<em><b>Tentative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The appointment participant has tentatively accepted the appointment.
	 * <!-- end-model-doc -->
	 * @see #TENTATIVE
	 * @model name="tentative"
	 * @generated
	 * @ordered
	 */
	public static final int TENTATIVE_VALUE = 2;

	/**
	 * The '<em><b>In Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The participant has in-process the appointment.
	 * <!-- end-model-doc -->
	 * @see #IN_PROCESS
	 * @model name="inProcess" literal="in-process"
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROCESS_VALUE = 3;

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The participant has completed the appointment.
	 * <!-- end-model-doc -->
	 * @see #COMPLETED
	 * @model name="completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 4;

	/**
	 * The '<em><b>Needs Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the intitial status of an appointment participant until a participant has replied. It implies that there is no commitment for the appointment.
	 * <!-- end-model-doc -->
	 * @see #NEEDS_ACTION
	 * @model name="needsAction" literal="needs-action"
	 * @generated
	 * @ordered
	 */
	public static final int NEEDS_ACTION_VALUE = 5;

	/**
	 * An array of all the '<em><b>Participant Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParticipantStatusList[] VALUES_ARRAY =
		new ParticipantStatusList[] {
			ACCEPTED,
			DECLINED,
			TENTATIVE,
			IN_PROCESS,
			COMPLETED,
			NEEDS_ACTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Participant Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParticipantStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Participant Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParticipantStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParticipantStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participant Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParticipantStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParticipantStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participant Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ParticipantStatusList get(int value) {
		switch (value) {
			case ACCEPTED_VALUE: return ACCEPTED;
			case DECLINED_VALUE: return DECLINED;
			case TENTATIVE_VALUE: return TENTATIVE;
			case IN_PROCESS_VALUE: return IN_PROCESS;
			case COMPLETED_VALUE: return COMPLETED;
			case NEEDS_ACTION_VALUE: return NEEDS_ACTION;
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
	private ParticipantStatusList(int value, String name, String literal) {
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
	
} //ParticipantStatusList
