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
 * A representation of the literals of the enumeration '<em><b>Guide Resource Purpose List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getGuideResourcePurposeList()
 * @model extendedMetaData="name='GuideResourcePurpose-list'"
 * @generated
 */
public enum GuideResourcePurposeList implements Enumerator {
	/**
	 * The '<em><b>Example</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXAMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	EXAMPLE(0, "example", "example"),

	/**
	 * The '<em><b>Terminology</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINOLOGY_VALUE
	 * @generated
	 * @ordered
	 */
	TERMINOLOGY(1, "terminology", "terminology"),

	/**
	 * The '<em><b>Profile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFILE_VALUE
	 * @generated
	 * @ordered
	 */
	PROFILE(2, "profile", "profile"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(3, "extension", "extension"),

	/**
	 * The '<em><b>Dictionary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DICTIONARY_VALUE
	 * @generated
	 * @ordered
	 */
	DICTIONARY(4, "dictionary", "dictionary"),

	/**
	 * The '<em><b>Logical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGICAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOGICAL(5, "logical", "logical");

	/**
	 * The '<em><b>Example</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource is intended as an example
	 * <!-- end-model-doc -->
	 * @see #EXAMPLE
	 * @model name="example"
	 * @generated
	 * @ordered
	 */
	public static final int EXAMPLE_VALUE = 0;

	/**
	 * The '<em><b>Terminology</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource defines a value set or concept map used in the Implementation Guide
	 * <!-- end-model-doc -->
	 * @see #TERMINOLOGY
	 * @model name="terminology"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINOLOGY_VALUE = 1;

	/**
	 * The '<em><b>Profile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource defines a profile (StructureDefinition) that is used in the implementation guide
	 * <!-- end-model-doc -->
	 * @see #PROFILE
	 * @model name="profile"
	 * @generated
	 * @ordered
	 */
	public static final int PROFILE_VALUE = 2;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource defines an extension (StructureDefinition) that is used in the implementation guide
	 * <!-- end-model-doc -->
	 * @see #EXTENSION
	 * @model name="extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 3;

	/**
	 * The '<em><b>Dictionary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource contains a dictionary that is part of the implementation guide
	 * <!-- end-model-doc -->
	 * @see #DICTIONARY
	 * @model name="dictionary"
	 * @generated
	 * @ordered
	 */
	public static final int DICTIONARY_VALUE = 4;

	/**
	 * The '<em><b>Logical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource defines a logical model (in a StructureDefinition) that is used in the implementation guide
	 * <!-- end-model-doc -->
	 * @see #LOGICAL
	 * @model name="logical"
	 * @generated
	 * @ordered
	 */
	public static final int LOGICAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Guide Resource Purpose List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GuideResourcePurposeList[] VALUES_ARRAY =
		new GuideResourcePurposeList[] {
			EXAMPLE,
			TERMINOLOGY,
			PROFILE,
			EXTENSION,
			DICTIONARY,
			LOGICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Guide Resource Purpose List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GuideResourcePurposeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Guide Resource Purpose List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuideResourcePurposeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuideResourcePurposeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guide Resource Purpose List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuideResourcePurposeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GuideResourcePurposeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guide Resource Purpose List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GuideResourcePurposeList get(int value) {
		switch (value) {
			case EXAMPLE_VALUE: return EXAMPLE;
			case TERMINOLOGY_VALUE: return TERMINOLOGY;
			case PROFILE_VALUE: return PROFILE;
			case EXTENSION_VALUE: return EXTENSION;
			case DICTIONARY_VALUE: return DICTIONARY;
			case LOGICAL_VALUE: return LOGICAL;
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
	private GuideResourcePurposeList(int value, String name, String literal) {
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
	
} //GuideResourcePurposeList
