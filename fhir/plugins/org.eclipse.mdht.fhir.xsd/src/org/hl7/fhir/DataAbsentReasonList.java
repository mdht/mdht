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
 * A representation of the literals of the enumeration '<em><b>Data Absent Reason List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getDataAbsentReasonList()
 * @model extendedMetaData="name='DataAbsentReason-list'"
 * @generated
 */
public enum DataAbsentReasonList implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "unknown", "unknown"),

	/**
	 * The '<em><b>Asked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASKED_VALUE
	 * @generated
	 * @ordered
	 */
	ASKED(1, "asked", "asked"),

	/**
	 * The '<em><b>Temp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMP_VALUE
	 * @generated
	 * @ordered
	 */
	TEMP(2, "temp", "temp"),

	/**
	 * The '<em><b>Notasked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTASKED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTASKED(3, "notasked", "notasked"),

	/**
	 * The '<em><b>Masked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASKED_VALUE
	 * @generated
	 * @ordered
	 */
	MASKED(4, "masked", "masked"),

	/**
	 * The '<em><b>Unsupported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUPPORTED(5, "unsupported", "unsupported"),

	/**
	 * The '<em><b>Astext</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	ASTEXT(6, "astext", "astext"),

	/**
	 * The '<em><b>Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(7, "error", "error");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is not known
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Asked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source human does not know the value
	 * <!-- end-model-doc -->
	 * @see #ASKED
	 * @model name="asked"
	 * @generated
	 * @ordered
	 */
	public static final int ASKED_VALUE = 1;

	/**
	 * The '<em><b>Temp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is reason to expect (from the workflow) that the value may become known
	 * <!-- end-model-doc -->
	 * @see #TEMP
	 * @model name="temp"
	 * @generated
	 * @ordered
	 */
	public static final int TEMP_VALUE = 2;

	/**
	 * The '<em><b>Notasked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The workflow didn't lead to this value being known
	 * <!-- end-model-doc -->
	 * @see #NOTASKED
	 * @model name="notasked"
	 * @generated
	 * @ordered
	 */
	public static final int NOTASKED_VALUE = 3;

	/**
	 * The '<em><b>Masked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The information is not available due to security, privacy or related reasons
	 * <!-- end-model-doc -->
	 * @see #MASKED
	 * @model name="masked"
	 * @generated
	 * @ordered
	 */
	public static final int MASKED_VALUE = 4;

	/**
	 * The '<em><b>Unsupported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source system wasn't capable of supporting this element
	 * <!-- end-model-doc -->
	 * @see #UNSUPPORTED
	 * @model name="unsupported"
	 * @generated
	 * @ordered
	 */
	public static final int UNSUPPORTED_VALUE = 5;

	/**
	 * The '<em><b>Astext</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content of the data is represented in the resource narrative
	 * <!-- end-model-doc -->
	 * @see #ASTEXT
	 * @model name="astext"
	 * @generated
	 * @ordered
	 */
	public static final int ASTEXT_VALUE = 6;

	/**
	 * The '<em><b>Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some system or workflow process error means that the information is not available
	 * <!-- end-model-doc -->
	 * @see #ERROR
	 * @model name="error"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 7;

	/**
	 * An array of all the '<em><b>Data Absent Reason List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataAbsentReasonList[] VALUES_ARRAY =
		new DataAbsentReasonList[] {
			UNKNOWN,
			ASKED,
			TEMP,
			NOTASKED,
			MASKED,
			UNSUPPORTED,
			ASTEXT,
			ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Absent Reason List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataAbsentReasonList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Absent Reason List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataAbsentReasonList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataAbsentReasonList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Absent Reason List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataAbsentReasonList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataAbsentReasonList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Absent Reason List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataAbsentReasonList get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case ASKED_VALUE: return ASKED;
			case TEMP_VALUE: return TEMP;
			case NOTASKED_VALUE: return NOTASKED;
			case MASKED_VALUE: return MASKED;
			case UNSUPPORTED_VALUE: return UNSUPPORTED;
			case ASTEXT_VALUE: return ASTEXT;
			case ERROR_VALUE: return ERROR;
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
	private DataAbsentReasonList(int value, String name, String literal) {
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
	
} //DataAbsentReasonList
