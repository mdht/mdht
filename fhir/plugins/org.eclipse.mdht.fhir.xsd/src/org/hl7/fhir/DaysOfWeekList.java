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
 * A representation of the literals of the enumeration '<em><b>Days Of Week List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getDaysOfWeekList()
 * @model extendedMetaData="name='DaysOfWeek-list'"
 * @generated
 */
public enum DaysOfWeekList implements Enumerator {
	/**
	 * The '<em><b>Mon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MON_VALUE
	 * @generated
	 * @ordered
	 */
	MON(0, "mon", "mon"),

	/**
	 * The '<em><b>Tue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUE_VALUE
	 * @generated
	 * @ordered
	 */
	TUE(1, "tue", "tue"),

	/**
	 * The '<em><b>Wed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WED_VALUE
	 * @generated
	 * @ordered
	 */
	WED(2, "wed", "wed"),

	/**
	 * The '<em><b>Thu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THU_VALUE
	 * @generated
	 * @ordered
	 */
	THU(3, "thu", "thu"),

	/**
	 * The '<em><b>Fri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRI_VALUE
	 * @generated
	 * @ordered
	 */
	FRI(4, "fri", "fri"),

	/**
	 * The '<em><b>Sat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAT_VALUE
	 * @generated
	 * @ordered
	 */
	SAT(5, "sat", "sat"),

	/**
	 * The '<em><b>Sun</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUN_VALUE
	 * @generated
	 * @ordered
	 */
	SUN(6, "sun", "sun");

	/**
	 * The '<em><b>Mon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monday.
	 * <!-- end-model-doc -->
	 * @see #MON
	 * @model name="mon"
	 * @generated
	 * @ordered
	 */
	public static final int MON_VALUE = 0;

	/**
	 * The '<em><b>Tue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tuesday.
	 * <!-- end-model-doc -->
	 * @see #TUE
	 * @model name="tue"
	 * @generated
	 * @ordered
	 */
	public static final int TUE_VALUE = 1;

	/**
	 * The '<em><b>Wed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wednesday.
	 * <!-- end-model-doc -->
	 * @see #WED
	 * @model name="wed"
	 * @generated
	 * @ordered
	 */
	public static final int WED_VALUE = 2;

	/**
	 * The '<em><b>Thu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Thursday.
	 * <!-- end-model-doc -->
	 * @see #THU
	 * @model name="thu"
	 * @generated
	 * @ordered
	 */
	public static final int THU_VALUE = 3;

	/**
	 * The '<em><b>Fri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Friday.
	 * <!-- end-model-doc -->
	 * @see #FRI
	 * @model name="fri"
	 * @generated
	 * @ordered
	 */
	public static final int FRI_VALUE = 4;

	/**
	 * The '<em><b>Sat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Saturday.
	 * <!-- end-model-doc -->
	 * @see #SAT
	 * @model name="sat"
	 * @generated
	 * @ordered
	 */
	public static final int SAT_VALUE = 5;

	/**
	 * The '<em><b>Sun</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sunday.
	 * <!-- end-model-doc -->
	 * @see #SUN
	 * @model name="sun"
	 * @generated
	 * @ordered
	 */
	public static final int SUN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Days Of Week List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DaysOfWeekList[] VALUES_ARRAY =
		new DaysOfWeekList[] {
			MON,
			TUE,
			WED,
			THU,
			FRI,
			SAT,
			SUN,
		};

	/**
	 * A public read-only list of all the '<em><b>Days Of Week List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DaysOfWeekList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Days Of Week List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DaysOfWeekList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DaysOfWeekList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Days Of Week List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DaysOfWeekList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DaysOfWeekList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Days Of Week List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DaysOfWeekList get(int value) {
		switch (value) {
			case MON_VALUE: return MON;
			case TUE_VALUE: return TUE;
			case WED_VALUE: return WED;
			case THU_VALUE: return THU;
			case FRI_VALUE: return FRI;
			case SAT_VALUE: return SAT;
			case SUN_VALUE: return SUN;
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
	private DaysOfWeekList(int value, String name, String literal) {
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
	
} //DaysOfWeekList
