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
 * A representation of the literals of the enumeration '<em><b>Slot Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSlotStatusList()
 * @model extendedMetaData="name='SlotStatus-list'"
 * @generated
 */
public enum SlotStatusList implements Enumerator {
	/**
	 * The '<em><b>Busy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSY_VALUE
	 * @generated
	 * @ordered
	 */
	BUSY(0, "busy", "busy"),

	/**
	 * The '<em><b>Free</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_VALUE
	 * @generated
	 * @ordered
	 */
	FREE(1, "free", "free"),

	/**
	 * The '<em><b>Busy Unavailable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSY_UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	BUSY_UNAVAILABLE(2, "busyUnavailable", "busy-unavailable"),

	/**
	 * The '<em><b>Busy Tentative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSY_TENTATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	BUSY_TENTATIVE(3, "busyTentative", "busy-tentative");

	/**
	 * The '<em><b>Busy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the time interval is busy because one  or more events have been scheduled for that interval.
	 * <!-- end-model-doc -->
	 * @see #BUSY
	 * @model name="busy"
	 * @generated
	 * @ordered
	 */
	public static final int BUSY_VALUE = 0;

	/**
	 * The '<em><b>Free</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the time interval is free for scheduling.
	 * <!-- end-model-doc -->
	 * @see #FREE
	 * @model name="free"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_VALUE = 1;

	/**
	 * The '<em><b>Busy Unavailable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the time interval is busy and that the interval can not be scheduled.
	 * <!-- end-model-doc -->
	 * @see #BUSY_UNAVAILABLE
	 * @model name="busyUnavailable" literal="busy-unavailable"
	 * @generated
	 * @ordered
	 */
	public static final int BUSY_UNAVAILABLE_VALUE = 2;

	/**
	 * The '<em><b>Busy Tentative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the time interval is busy because one or more events have been tentatively scheduled for that interval
	 * <!-- end-model-doc -->
	 * @see #BUSY_TENTATIVE
	 * @model name="busyTentative" literal="busy-tentative"
	 * @generated
	 * @ordered
	 */
	public static final int BUSY_TENTATIVE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Slot Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SlotStatusList[] VALUES_ARRAY =
		new SlotStatusList[] {
			BUSY,
			FREE,
			BUSY_UNAVAILABLE,
			BUSY_TENTATIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Slot Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SlotStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Slot Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SlotStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SlotStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Slot Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SlotStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SlotStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Slot Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SlotStatusList get(int value) {
		switch (value) {
			case BUSY_VALUE: return BUSY;
			case FREE_VALUE: return FREE;
			case BUSY_UNAVAILABLE_VALUE: return BUSY_UNAVAILABLE;
			case BUSY_TENTATIVE_VALUE: return BUSY_TENTATIVE;
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
	private SlotStatusList(int value, String name, String literal) {
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
	
} //SlotStatusList
