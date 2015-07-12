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
 * A representation of the literals of the enumeration '<em><b>Observation Reliability List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getObservationReliabilityList()
 * @model extendedMetaData="name='ObservationReliability-list'"
 * @generated
 */
public enum ObservationReliabilityList implements Enumerator {
	/**
	 * The '<em><b>Ok</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(0, "ok", "ok"),

	/**
	 * The '<em><b>Ongoing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONGOING_VALUE
	 * @generated
	 * @ordered
	 */
	ONGOING(1, "ongoing", "ongoing"),

	/**
	 * The '<em><b>Early</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARLY_VALUE
	 * @generated
	 * @ordered
	 */
	EARLY(2, "early", "early"),

	/**
	 * The '<em><b>Questionable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTIONABLE_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTIONABLE(3, "questionable", "questionable"),

	/**
	 * The '<em><b>Calibrating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALIBRATING_VALUE
	 * @generated
	 * @ordered
	 */
	CALIBRATING(4, "calibrating", "calibrating"),

	/**
	 * The '<em><b>Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(5, "error", "error"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(6, "unknown", "unknown");

	/**
	 * The '<em><b>Ok</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result has no reliability concerns.
	 * <!-- end-model-doc -->
	 * @see #OK
	 * @model name="ok"
	 * @generated
	 * @ordered
	 */
	public static final int OK_VALUE = 0;

	/**
	 * The '<em><b>Ongoing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An early estimate of value; measurement is still occurring.
	 * <!-- end-model-doc -->
	 * @see #ONGOING
	 * @model name="ongoing"
	 * @generated
	 * @ordered
	 */
	public static final int ONGOING_VALUE = 1;

	/**
	 * The '<em><b>Early</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An early estimate of value; processing is still occurring.
	 * <!-- end-model-doc -->
	 * @see #EARLY
	 * @model name="early"
	 * @generated
	 * @ordered
	 */
	public static final int EARLY_VALUE = 2;

	/**
	 * The '<em><b>Questionable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The observation value should be treated with care.
	 * <!-- end-model-doc -->
	 * @see #QUESTIONABLE
	 * @model name="questionable"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTIONABLE_VALUE = 3;

	/**
	 * The '<em><b>Calibrating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The result has been generated while calibration is occurring.
	 * <!-- end-model-doc -->
	 * @see #CALIBRATING
	 * @model name="calibrating"
	 * @generated
	 * @ordered
	 */
	public static final int CALIBRATING_VALUE = 4;

	/**
	 * The '<em><b>Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The observation could not be completed because of an error.
	 * <!-- end-model-doc -->
	 * @see #ERROR
	 * @model name="error"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 5;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No observation  reliability value was available.
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Observation Reliability List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObservationReliabilityList[] VALUES_ARRAY =
		new ObservationReliabilityList[] {
			OK,
			ONGOING,
			EARLY,
			QUESTIONABLE,
			CALIBRATING,
			ERROR,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Observation Reliability List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObservationReliabilityList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Observation Reliability List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationReliabilityList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationReliabilityList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Reliability List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationReliabilityList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObservationReliabilityList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Observation Reliability List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObservationReliabilityList get(int value) {
		switch (value) {
			case OK_VALUE: return OK;
			case ONGOING_VALUE: return ONGOING;
			case EARLY_VALUE: return EARLY;
			case QUESTIONABLE_VALUE: return QUESTIONABLE;
			case CALIBRATING_VALUE: return CALIBRATING;
			case ERROR_VALUE: return ERROR;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private ObservationReliabilityList(int value, String name, String literal) {
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
	
} //ObservationReliabilityList
