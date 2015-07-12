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
 * A representation of the literals of the enumeration '<em><b>Aggregation Mode List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getAggregationModeList()
 * @model extendedMetaData="name='AggregationMode-list'"
 * @generated
 */
public enum AggregationModeList implements Enumerator {
	/**
	 * The '<em><b>Contained</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINED_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINED(0, "contained", "contained"),

	/**
	 * The '<em><b>Referenced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCED_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCED(1, "referenced", "referenced"),

	/**
	 * The '<em><b>Bundled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUNDLED_VALUE
	 * @generated
	 * @ordered
	 */
	BUNDLED(2, "bundled", "bundled");

	/**
	 * The '<em><b>Contained</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference is a local reference to a contained resource.
	 * <!-- end-model-doc -->
	 * @see #CONTAINED
	 * @model name="contained"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINED_VALUE = 0;

	/**
	 * The '<em><b>Referenced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference to a resource that has to be resolved externally to the resource that includes the reference.
	 * <!-- end-model-doc -->
	 * @see #REFERENCED
	 * @model name="referenced"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCED_VALUE = 1;

	/**
	 * The '<em><b>Bundled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource the reference points to will be found in the same bundle as the resource that includes the reference.
	 * <!-- end-model-doc -->
	 * @see #BUNDLED
	 * @model name="bundled"
	 * @generated
	 * @ordered
	 */
	public static final int BUNDLED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Aggregation Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AggregationModeList[] VALUES_ARRAY =
		new AggregationModeList[] {
			CONTAINED,
			REFERENCED,
			BUNDLED,
		};

	/**
	 * A public read-only list of all the '<em><b>Aggregation Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AggregationModeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aggregation Mode List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AggregationModeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregationModeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregation Mode List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AggregationModeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregationModeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregation Mode List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AggregationModeList get(int value) {
		switch (value) {
			case CONTAINED_VALUE: return CONTAINED;
			case REFERENCED_VALUE: return REFERENCED;
			case BUNDLED_VALUE: return BUNDLED;
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
	private AggregationModeList(int value, String name, String literal) {
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
	
} //AggregationModeList
