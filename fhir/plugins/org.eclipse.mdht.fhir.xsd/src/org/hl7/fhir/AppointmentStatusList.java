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
 * A representation of the literals of the enumeration '<em><b>Appointment Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getAppointmentStatusList()
 * @model extendedMetaData="name='AppointmentStatus-list'"
 * @generated
 */
public enum AppointmentStatusList implements Enumerator {
	/**
	 * The '<em><b>Pending</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENDING_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING(0, "pending", "pending"),

	/**
	 * The '<em><b>Booked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOKED_VALUE
	 * @generated
	 * @ordered
	 */
	BOOKED(1, "booked", "booked"),

	/**
	 * The '<em><b>Arrived</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRIVED_VALUE
	 * @generated
	 * @ordered
	 */
	ARRIVED(2, "arrived", "arrived"),

	/**
	 * The '<em><b>Fulfilled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILLED_VALUE
	 * @generated
	 * @ordered
	 */
	FULFILLED(3, "fulfilled", "fulfilled"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(4, "cancelled", "cancelled"),

	/**
	 * The '<em><b>Noshow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOSHOW_VALUE
	 * @generated
	 * @ordered
	 */
	NOSHOW(5, "noshow", "noshow");

	/**
	 * The '<em><b>Pending</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some or all of the participant(s) have not finalized their acceptance of the appointment request
	 * <!-- end-model-doc -->
	 * @see #PENDING
	 * @model name="pending"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_VALUE = 0;

	/**
	 * The '<em><b>Booked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All participant(s) have been considered and the appointment is confirmed to go ahead at the date/times specified
	 * <!-- end-model-doc -->
	 * @see #BOOKED
	 * @model name="booked"
	 * @generated
	 * @ordered
	 */
	public static final int BOOKED_VALUE = 1;

	/**
	 * The '<em><b>Arrived</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some of the patients have arrived
	 * <!-- end-model-doc -->
	 * @see #ARRIVED
	 * @model name="arrived"
	 * @generated
	 * @ordered
	 */
	public static final int ARRIVED_VALUE = 2;

	/**
	 * The '<em><b>Fulfilled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This appointment has completed and may have resulted in an encounter
	 * <!-- end-model-doc -->
	 * @see #FULFILLED
	 * @model name="fulfilled"
	 * @generated
	 * @ordered
	 */
	public static final int FULFILLED_VALUE = 3;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The appointment has been cancelled
	 * <!-- end-model-doc -->
	 * @see #CANCELLED
	 * @model name="cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 4;

	/**
	 * The '<em><b>Noshow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some or all of the participant(s) have not/did not appear for the appointment (usually the patient)
	 * <!-- end-model-doc -->
	 * @see #NOSHOW
	 * @model name="noshow"
	 * @generated
	 * @ordered
	 */
	public static final int NOSHOW_VALUE = 5;

	/**
	 * An array of all the '<em><b>Appointment Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AppointmentStatusList[] VALUES_ARRAY =
		new AppointmentStatusList[] {
			PENDING,
			BOOKED,
			ARRIVED,
			FULFILLED,
			CANCELLED,
			NOSHOW,
		};

	/**
	 * A public read-only list of all the '<em><b>Appointment Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AppointmentStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Appointment Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AppointmentStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AppointmentStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appointment Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AppointmentStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AppointmentStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appointment Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AppointmentStatusList get(int value) {
		switch (value) {
			case PENDING_VALUE: return PENDING;
			case BOOKED_VALUE: return BOOKED;
			case ARRIVED_VALUE: return ARRIVED;
			case FULFILLED_VALUE: return FULFILLED;
			case CANCELLED_VALUE: return CANCELLED;
			case NOSHOW_VALUE: return NOSHOW;
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
	private AppointmentStatusList(int value, String name, String literal) {
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
	
} //AppointmentStatusList
