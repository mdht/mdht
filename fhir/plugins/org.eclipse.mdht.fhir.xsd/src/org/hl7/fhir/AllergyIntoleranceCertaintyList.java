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
 * A representation of the literals of the enumeration '<em><b>Allergy Intolerance Certainty List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getAllergyIntoleranceCertaintyList()
 * @model extendedMetaData="name='AllergyIntoleranceCertainty-list'"
 * @generated
 */
public enum AllergyIntoleranceCertaintyList implements Enumerator {
	/**
	 * The '<em><b>Unlikely</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLIKELY_VALUE
	 * @generated
	 * @ordered
	 */
	UNLIKELY(0, "unlikely", "unlikely"),

	/**
	 * The '<em><b>Likely</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKELY_VALUE
	 * @generated
	 * @ordered
	 */
	LIKELY(1, "likely", "likely"),

	/**
	 * The '<em><b>Confirmed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIRMED_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIRMED(2, "confirmed", "confirmed");

	/**
	 * The '<em><b>Unlikely</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is a low level of clinical certainty that the reaction was caused by the identified Substance.
	 * <!-- end-model-doc -->
	 * @see #UNLIKELY
	 * @model name="unlikely"
	 * @generated
	 * @ordered
	 */
	public static final int UNLIKELY_VALUE = 0;

	/**
	 * The '<em><b>Likely</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is a high level of clinical certainty that the reaction was caused by the identified Substance.
	 * <!-- end-model-doc -->
	 * @see #LIKELY
	 * @model name="likely"
	 * @generated
	 * @ordered
	 */
	public static final int LIKELY_VALUE = 1;

	/**
	 * The '<em><b>Confirmed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * There is a very high level of clinical certainty that the reaction was due to the identified Substance, which may include clinical evidence by testing or rechallenge.
	 * <!-- end-model-doc -->
	 * @see #CONFIRMED
	 * @model name="confirmed"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIRMED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Allergy Intolerance Certainty List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllergyIntoleranceCertaintyList[] VALUES_ARRAY =
		new AllergyIntoleranceCertaintyList[] {
			UNLIKELY,
			LIKELY,
			CONFIRMED,
		};

	/**
	 * A public read-only list of all the '<em><b>Allergy Intolerance Certainty List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllergyIntoleranceCertaintyList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allergy Intolerance Certainty List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceCertaintyList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllergyIntoleranceCertaintyList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allergy Intolerance Certainty List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceCertaintyList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllergyIntoleranceCertaintyList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allergy Intolerance Certainty List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllergyIntoleranceCertaintyList get(int value) {
		switch (value) {
			case UNLIKELY_VALUE: return UNLIKELY;
			case LIKELY_VALUE: return LIKELY;
			case CONFIRMED_VALUE: return CONFIRMED;
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
	private AllergyIntoleranceCertaintyList(int value, String name, String literal) {
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
	
} //AllergyIntoleranceCertaintyList
