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
 * A representation of the literals of the enumeration '<em><b>Data Element Stringency List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getDataElementStringencyList()
 * @model extendedMetaData="name='DataElementStringency-list'"
 * @generated
 */
public enum DataElementStringencyList implements Enumerator {
	/**
	 * The '<em><b>Comparable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPARABLE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPARABLE(0, "comparable", "comparable"),

	/**
	 * The '<em><b>Fully Specified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULLY_SPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	FULLY_SPECIFIED(1, "fullySpecified", "fully-specified"),

	/**
	 * The '<em><b>Equivalent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIVALENT_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIVALENT(2, "equivalent", "equivalent"),

	/**
	 * The '<em><b>Convertable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	CONVERTABLE(3, "convertable", "convertable"),

	/**
	 * The '<em><b>Scaleable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCALEABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SCALEABLE(4, "scaleable", "scaleable"),

	/**
	 * The '<em><b>Flexible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLEXIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	FLEXIBLE(5, "flexible", "flexible");

	/**
	 * The '<em><b>Comparable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data element is sufficiently well-constrained that multiple pieces of data captured according to the constraints of the data element will be comparable (though in some cases, a degree of automated conversion/normalization may be required).
	 * <!-- end-model-doc -->
	 * @see #COMPARABLE
	 * @model name="comparable"
	 * @generated
	 * @ordered
	 */
	public static final int COMPARABLE_VALUE = 0;

	/**
	 * The '<em><b>Fully Specified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data element is fully specified down to a single value set, single unit of measure, single data type, etc.  Multiple pieces of data associated with this data element are fully compareable
	 * <!-- end-model-doc -->
	 * @see #FULLY_SPECIFIED
	 * @model name="fullySpecified" literal="fully-specified"
	 * @generated
	 * @ordered
	 */
	public static final int FULLY_SPECIFIED_VALUE = 1;

	/**
	 * The '<em><b>Equivalent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data element allows multiple units of measure having equivalent meaning.  E.g. "cc" (cubic centimeter) and "mL".
	 * <!-- end-model-doc -->
	 * @see #EQUIVALENT
	 * @model name="equivalent"
	 * @generated
	 * @ordered
	 */
	public static final int EQUIVALENT_VALUE = 2;

	/**
	 * The '<em><b>Convertable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data element allows multiple units of measure that are convertable between each other (e.g. Inches and centimeters) and/or allows data to be captured in multiple value sets for which a known mapping exists allowing conversion of meaning
	 * <!-- end-model-doc -->
	 * @see #CONVERTABLE
	 * @model name="convertable"
	 * @generated
	 * @ordered
	 */
	public static final int CONVERTABLE_VALUE = 3;

	/**
	 * The '<em><b>Scaleable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A convertable data element where unit conversions are different only by a power of 10.  E.g. g, mg, kg
	 * <!-- end-model-doc -->
	 * @see #SCALEABLE
	 * @model name="scaleable"
	 * @generated
	 * @ordered
	 */
	public static final int SCALEABLE_VALUE = 4;

	/**
	 * The '<em><b>Flexible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data element is unconstrained in units, choice of data types and/or choice of vocabulary such that automated comparison of data captured using the data element is not possible.
	 * <!-- end-model-doc -->
	 * @see #FLEXIBLE
	 * @model name="flexible"
	 * @generated
	 * @ordered
	 */
	public static final int FLEXIBLE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Data Element Stringency List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataElementStringencyList[] VALUES_ARRAY =
		new DataElementStringencyList[] {
			COMPARABLE,
			FULLY_SPECIFIED,
			EQUIVALENT,
			CONVERTABLE,
			SCALEABLE,
			FLEXIBLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Element Stringency List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataElementStringencyList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Element Stringency List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataElementStringencyList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataElementStringencyList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Element Stringency List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataElementStringencyList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataElementStringencyList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Element Stringency List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataElementStringencyList get(int value) {
		switch (value) {
			case COMPARABLE_VALUE: return COMPARABLE;
			case FULLY_SPECIFIED_VALUE: return FULLY_SPECIFIED;
			case EQUIVALENT_VALUE: return EQUIVALENT;
			case CONVERTABLE_VALUE: return CONVERTABLE;
			case SCALEABLE_VALUE: return SCALEABLE;
			case FLEXIBLE_VALUE: return FLEXIBLE;
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
	private DataElementStringencyList(int value, String name, String literal) {
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
	
} //DataElementStringencyList
