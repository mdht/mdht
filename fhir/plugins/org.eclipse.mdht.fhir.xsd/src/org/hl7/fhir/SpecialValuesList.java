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
 * A representation of the literals of the enumeration '<em><b>Special Values List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSpecialValuesList()
 * @model extendedMetaData="name='SpecialValues-list'"
 * @generated
 */
public enum SpecialValuesList implements Enumerator {
	/**
	 * The '<em><b>True</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUE_VALUE
	 * @generated
	 * @ordered
	 */
	TRUE(0, "true", "true"),

	/**
	 * The '<em><b>False</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FALSE_VALUE
	 * @generated
	 * @ordered
	 */
	FALSE(1, "false", "false"),

	/**
	 * The '<em><b>Trace</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRACE_VALUE
	 * @generated
	 * @ordered
	 */
	TRACE(2, "trace", "trace"),

	/**
	 * The '<em><b>Sufficient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUFFICIENT_VALUE
	 * @generated
	 * @ordered
	 */
	SUFFICIENT(3, "sufficient", "sufficient"),

	/**
	 * The '<em><b>Withdrawn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHDRAWN_VALUE
	 * @generated
	 * @ordered
	 */
	WITHDRAWN(4, "withdrawn", "withdrawn"),

	/**
	 * The '<em><b>Nil Known</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIL_KNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	NIL_KNOWN(5, "nilKnown", "nil-known");

	/**
	 * The '<em><b>True</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean true
	 * <!-- end-model-doc -->
	 * @see #TRUE
	 * @model name="true"
	 * @generated
	 * @ordered
	 */
	public static final int TRUE_VALUE = 0;

	/**
	 * The '<em><b>False</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean false
	 * <!-- end-model-doc -->
	 * @see #FALSE
	 * @model name="false"
	 * @generated
	 * @ordered
	 */
	public static final int FALSE_VALUE = 1;

	/**
	 * The '<em><b>Trace</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content is greater than zero, but too small to be quantified
	 * <!-- end-model-doc -->
	 * @see #TRACE
	 * @model name="trace"
	 * @generated
	 * @ordered
	 */
	public static final int TRACE_VALUE = 2;

	/**
	 * The '<em><b>Sufficient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific quantity is not known, but is known to be non-zero and is not specified because it makes up the bulk of the material
	 * <!-- end-model-doc -->
	 * @see #SUFFICIENT
	 * @model name="sufficient"
	 * @generated
	 * @ordered
	 */
	public static final int SUFFICIENT_VALUE = 3;

	/**
	 * The '<em><b>Withdrawn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is no longer available
	 * <!-- end-model-doc -->
	 * @see #WITHDRAWN
	 * @model name="withdrawn"
	 * @generated
	 * @ordered
	 */
	public static final int WITHDRAWN_VALUE = 4;

	/**
	 * The '<em><b>Nil Known</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The are no known applicable values in this context
	 * <!-- end-model-doc -->
	 * @see #NIL_KNOWN
	 * @model name="nilKnown" literal="nil-known"
	 * @generated
	 * @ordered
	 */
	public static final int NIL_KNOWN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Special Values List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpecialValuesList[] VALUES_ARRAY =
		new SpecialValuesList[] {
			TRUE,
			FALSE,
			TRACE,
			SUFFICIENT,
			WITHDRAWN,
			NIL_KNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Special Values List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpecialValuesList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Special Values List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecialValuesList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecialValuesList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Special Values List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecialValuesList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpecialValuesList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Special Values List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpecialValuesList get(int value) {
		switch (value) {
			case TRUE_VALUE: return TRUE;
			case FALSE_VALUE: return FALSE;
			case TRACE_VALUE: return TRACE;
			case SUFFICIENT_VALUE: return SUFFICIENT;
			case WITHDRAWN_VALUE: return WITHDRAWN;
			case NIL_KNOWN_VALUE: return NIL_KNOWN;
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
	private SpecialValuesList(int value, String name, String literal) {
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
	
} //SpecialValuesList
