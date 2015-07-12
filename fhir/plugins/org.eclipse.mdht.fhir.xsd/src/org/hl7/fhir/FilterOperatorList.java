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
 * A representation of the literals of the enumeration '<em><b>Filter Operator List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getFilterOperatorList()
 * @model extendedMetaData="name='FilterOperator-list'"
 * @generated
 */
public enum FilterOperatorList implements Enumerator {
	/**
	 * The '<em><b></b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #__VALUE
	 * @generated
	 * @ordered
	 */
	_(0, "_", "="),

	/**
	 * The '<em><b>Is A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_A_VALUE
	 * @generated
	 * @ordered
	 */
	IS_A(1, "isA", "is-a"),

	/**
	 * The '<em><b>Is Not A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_NOT_A_VALUE
	 * @generated
	 * @ordered
	 */
	IS_NOT_A(2, "isNotA", "is-not-a"),

	/**
	 * The '<em><b>Regex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEX_VALUE
	 * @generated
	 * @ordered
	 */
	REGEX(3, "regex", "regex"),

	/**
	 * The '<em><b>In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(4, "in", "in"),

	/**
	 * The '<em><b>Not In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_IN_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_IN(5, "notIn", "not-in");

	/**
	 * The '<em><b></b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified property of the code equals the provided value.
	 * <!-- end-model-doc -->
	 * @see #_
	 * @model literal="="
	 * @generated
	 * @ordered
	 */
	public static final int __VALUE = 0;

	/**
	 * The '<em><b>Is A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself.
	 * <!-- end-model-doc -->
	 * @see #IS_A
	 * @model name="isA" literal="is-a"
	 * @generated
	 * @ordered
	 */
	public static final int IS_A_VALUE = 1;

	/**
	 * The '<em><b>Is Not A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified property of the code does not have an is-a relationship with the provided value.
	 * <!-- end-model-doc -->
	 * @see #IS_NOT_A
	 * @model name="isNotA" literal="is-not-a"
	 * @generated
	 * @ordered
	 */
	public static final int IS_NOT_A_VALUE = 2;

	/**
	 * The '<em><b>Regex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified property of the code  matches the regex specified in the provided value.
	 * <!-- end-model-doc -->
	 * @see #REGEX
	 * @model name="regex"
	 * @generated
	 * @ordered
	 */
	public static final int REGEX_VALUE = 3;

	/**
	 * The '<em><b>In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified property of the code is in the set of codes or concepts specified in the provided value (comma separated list).
	 * <!-- end-model-doc -->
	 * @see #IN
	 * @model name="in"
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 4;

	/**
	 * The '<em><b>Not In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified property of the code is not in the set of codes or concepts specified in the provided value (comma separated list).
	 * <!-- end-model-doc -->
	 * @see #NOT_IN
	 * @model name="notIn" literal="not-in"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_IN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Filter Operator List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FilterOperatorList[] VALUES_ARRAY =
		new FilterOperatorList[] {
			_,
			IS_A,
			IS_NOT_A,
			REGEX,
			IN,
			NOT_IN,
		};

	/**
	 * A public read-only list of all the '<em><b>Filter Operator List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FilterOperatorList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Filter Operator List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterOperatorList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilterOperatorList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filter Operator List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterOperatorList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilterOperatorList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filter Operator List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterOperatorList get(int value) {
		switch (value) {
			case __VALUE: return _;
			case IS_A_VALUE: return IS_A;
			case IS_NOT_A_VALUE: return IS_NOT_A;
			case REGEX_VALUE: return REGEX;
			case IN_VALUE: return IN;
			case NOT_IN_VALUE: return NOT_IN;
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
	private FilterOperatorList(int value, String name, String literal) {
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
	
} //FilterOperatorList
