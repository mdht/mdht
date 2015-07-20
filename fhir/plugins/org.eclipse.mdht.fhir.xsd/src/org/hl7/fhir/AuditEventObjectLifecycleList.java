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
 * A representation of the literals of the enumeration '<em><b>Audit Event Object Lifecycle List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getAuditEventObjectLifecycleList()
 * @model extendedMetaData="name='AuditEventObjectLifecycle-list'"
 * @generated
 */
public enum AuditEventObjectLifecycleList implements Enumerator {
	/**
	 * The '<em><b>1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1_VALUE
	 * @generated
	 * @ordered
	 */
	_1(0, "_1", "1"),

	/**
	 * The '<em><b>2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2_VALUE
	 * @generated
	 * @ordered
	 */
	_2(1, "_2", "2"),

	/**
	 * The '<em><b>3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3_VALUE
	 * @generated
	 * @ordered
	 */
	_3(2, "_3", "3"),

	/**
	 * The '<em><b>4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4_VALUE
	 * @generated
	 * @ordered
	 */
	_4(3, "_4", "4"),

	/**
	 * The '<em><b>5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_5_VALUE
	 * @generated
	 * @ordered
	 */
	_5(4, "_5", "5"),

	/**
	 * The '<em><b>6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_6_VALUE
	 * @generated
	 * @ordered
	 */
	_6(5, "_6", "6"),

	/**
	 * The '<em><b>7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_7_VALUE
	 * @generated
	 * @ordered
	 */
	_7(6, "_7", "7"),

	/**
	 * The '<em><b>8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_8_VALUE
	 * @generated
	 * @ordered
	 */
	_8(7, "_8", "8"),

	/**
	 * The '<em><b>9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_9_VALUE
	 * @generated
	 * @ordered
	 */
	_9(8, "_9", "9"),

	/**
	 * The '<em><b>10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_10_VALUE
	 * @generated
	 * @ordered
	 */
	_10(9, "_10", "10"),

	/**
	 * The '<em><b>11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_11_VALUE
	 * @generated
	 * @ordered
	 */
	_11(10, "_11", "11"),

	/**
	 * The '<em><b>12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_12_VALUE
	 * @generated
	 * @ordered
	 */
	_12(11, "_12", "12"),

	/**
	 * The '<em><b>13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_13_VALUE
	 * @generated
	 * @ordered
	 */
	_13(12, "_13", "13"),

	/**
	 * The '<em><b>14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_14_VALUE
	 * @generated
	 * @ordered
	 */
	_14(13, "_14", "14"),

	/**
	 * The '<em><b>15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_15_VALUE
	 * @generated
	 * @ordered
	 */
	_15(14, "_15", "15");

	/**
	 * The '<em><b>1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Origination / Creation
	 * <!-- end-model-doc -->
	 * @see #_1
	 * @model literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int _1_VALUE = 0;

	/**
	 * The '<em><b>2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Import / Copy from original
	 * <!-- end-model-doc -->
	 * @see #_2
	 * @model literal="2"
	 * @generated
	 * @ordered
	 */
	public static final int _2_VALUE = 1;

	/**
	 * The '<em><b>3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amendment
	 * <!-- end-model-doc -->
	 * @see #_3
	 * @model literal="3"
	 * @generated
	 * @ordered
	 */
	public static final int _3_VALUE = 2;

	/**
	 * The '<em><b>4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verification
	 * <!-- end-model-doc -->
	 * @see #_4
	 * @model literal="4"
	 * @generated
	 * @ordered
	 */
	public static final int _4_VALUE = 3;

	/**
	 * The '<em><b>5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Translation
	 * <!-- end-model-doc -->
	 * @see #_5
	 * @model literal="5"
	 * @generated
	 * @ordered
	 */
	public static final int _5_VALUE = 4;

	/**
	 * The '<em><b>6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Access / Use
	 * <!-- end-model-doc -->
	 * @see #_6
	 * @model literal="6"
	 * @generated
	 * @ordered
	 */
	public static final int _6_VALUE = 5;

	/**
	 * The '<em><b>7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * De-identification
	 * <!-- end-model-doc -->
	 * @see #_7
	 * @model literal="7"
	 * @generated
	 * @ordered
	 */
	public static final int _7_VALUE = 6;

	/**
	 * The '<em><b>8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aggregation, summarization, derivation
	 * <!-- end-model-doc -->
	 * @see #_8
	 * @model literal="8"
	 * @generated
	 * @ordered
	 */
	public static final int _8_VALUE = 7;

	/**
	 * The '<em><b>9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Report
	 * <!-- end-model-doc -->
	 * @see #_9
	 * @model literal="9"
	 * @generated
	 * @ordered
	 */
	public static final int _9_VALUE = 8;

	/**
	 * The '<em><b>10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Export / Copy to target
	 * <!-- end-model-doc -->
	 * @see #_10
	 * @model literal="10"
	 * @generated
	 * @ordered
	 */
	public static final int _10_VALUE = 9;

	/**
	 * The '<em><b>11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disclosure
	 * <!-- end-model-doc -->
	 * @see #_11
	 * @model literal="11"
	 * @generated
	 * @ordered
	 */
	public static final int _11_VALUE = 10;

	/**
	 * The '<em><b>12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Receipt of disclosure
	 * <!-- end-model-doc -->
	 * @see #_12
	 * @model literal="12"
	 * @generated
	 * @ordered
	 */
	public static final int _12_VALUE = 11;

	/**
	 * The '<em><b>13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Archiving
	 * <!-- end-model-doc -->
	 * @see #_13
	 * @model literal="13"
	 * @generated
	 * @ordered
	 */
	public static final int _13_VALUE = 12;

	/**
	 * The '<em><b>14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical deletion
	 * <!-- end-model-doc -->
	 * @see #_14
	 * @model literal="14"
	 * @generated
	 * @ordered
	 */
	public static final int _14_VALUE = 13;

	/**
	 * The '<em><b>15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permanent erasure / Physical destruction
	 * <!-- end-model-doc -->
	 * @see #_15
	 * @model literal="15"
	 * @generated
	 * @ordered
	 */
	public static final int _15_VALUE = 14;

	/**
	 * An array of all the '<em><b>Audit Event Object Lifecycle List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AuditEventObjectLifecycleList[] VALUES_ARRAY =
		new AuditEventObjectLifecycleList[] {
			_1,
			_2,
			_3,
			_4,
			_5,
			_6,
			_7,
			_8,
			_9,
			_10,
			_11,
			_12,
			_13,
			_14,
			_15,
		};

	/**
	 * A public read-only list of all the '<em><b>Audit Event Object Lifecycle List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AuditEventObjectLifecycleList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Audit Event Object Lifecycle List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuditEventObjectLifecycleList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuditEventObjectLifecycleList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Audit Event Object Lifecycle List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuditEventObjectLifecycleList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuditEventObjectLifecycleList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Audit Event Object Lifecycle List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuditEventObjectLifecycleList get(int value) {
		switch (value) {
			case _1_VALUE: return _1;
			case _2_VALUE: return _2;
			case _3_VALUE: return _3;
			case _4_VALUE: return _4;
			case _5_VALUE: return _5;
			case _6_VALUE: return _6;
			case _7_VALUE: return _7;
			case _8_VALUE: return _8;
			case _9_VALUE: return _9;
			case _10_VALUE: return _10;
			case _11_VALUE: return _11;
			case _12_VALUE: return _12;
			case _13_VALUE: return _13;
			case _14_VALUE: return _14;
			case _15_VALUE: return _15;
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
	private AuditEventObjectLifecycleList(int value, String name, String literal) {
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
	
} //AuditEventObjectLifecycleList
