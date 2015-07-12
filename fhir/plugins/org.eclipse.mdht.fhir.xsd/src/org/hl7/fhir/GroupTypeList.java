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
 * A representation of the literals of the enumeration '<em><b>Group Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getGroupTypeList()
 * @model extendedMetaData="name='GroupType-list'"
 * @generated
 */
public enum GroupTypeList implements Enumerator {
	/**
	 * The '<em><b>Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON(0, "person", "person"),

	/**
	 * The '<em><b>Animal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	ANIMAL(1, "animal", "animal"),

	/**
	 * The '<em><b>Practitioner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRACTITIONER_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTITIONER(2, "practitioner", "practitioner"),

	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(3, "device", "device"),

	/**
	 * The '<em><b>Medication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION(4, "medication", "medication"),

	/**
	 * The '<em><b>Substance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE(5, "substance", "substance");

	/**
	 * The '<em><b>Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group contains "person" Patient resources.
	 * <!-- end-model-doc -->
	 * @see #PERSON
	 * @model name="person"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_VALUE = 0;

	/**
	 * The '<em><b>Animal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group contains "animal" Patient resources.
	 * <!-- end-model-doc -->
	 * @see #ANIMAL
	 * @model name="animal"
	 * @generated
	 * @ordered
	 */
	public static final int ANIMAL_VALUE = 1;

	/**
	 * The '<em><b>Practitioner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group contains healthcare practitioner resources.
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER
	 * @model name="practitioner"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONER_VALUE = 2;

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group contains Device resources.
	 * <!-- end-model-doc -->
	 * @see #DEVICE
	 * @model name="device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 3;

	/**
	 * The '<em><b>Medication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group contains Medication resources.
	 * <!-- end-model-doc -->
	 * @see #MEDICATION
	 * @model name="medication"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_VALUE = 4;

	/**
	 * The '<em><b>Substance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group contains Substance resources.
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE
	 * @model name="substance"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Group Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GroupTypeList[] VALUES_ARRAY =
		new GroupTypeList[] {
			PERSON,
			ANIMAL,
			PRACTITIONER,
			DEVICE,
			MEDICATION,
			SUBSTANCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Group Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GroupTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Group Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroupTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Group Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GroupTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Group Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GroupTypeList get(int value) {
		switch (value) {
			case PERSON_VALUE: return PERSON;
			case ANIMAL_VALUE: return ANIMAL;
			case PRACTITIONER_VALUE: return PRACTITIONER;
			case DEVICE_VALUE: return DEVICE;
			case MEDICATION_VALUE: return MEDICATION;
			case SUBSTANCE_VALUE: return SUBSTANCE;
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
	private GroupTypeList(int value, String name, String literal) {
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
	
} //GroupTypeList
