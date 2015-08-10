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
 * A representation of the literals of the enumeration '<em><b>Unknown Content Code List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getUnknownContentCodeList()
 * @model extendedMetaData="name='UnknownContentCode-list'"
 * @generated
 */
public enum UnknownContentCodeList implements Enumerator {
	/**
	 * The '<em><b>No</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALUE
	 * @generated
	 * @ordered
	 */
	NO(0, "no", "no"),

	/**
	 * The '<em><b>Extensions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSIONS_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSIONS(1, "extensions", "extensions"),

	/**
	 * The '<em><b>Elements</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENTS(2, "elements", "elements"),

	/**
	 * The '<em><b>Both</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH(3, "both", "both");

	/**
	 * The '<em><b>No</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The application does not accept either unknown elements or extensions
	 * <!-- end-model-doc -->
	 * @see #NO
	 * @model name="no"
	 * @generated
	 * @ordered
	 */
	public static final int NO_VALUE = 0;

	/**
	 * The '<em><b>Extensions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The application accepts unknown extensions, but not unknown elements
	 * <!-- end-model-doc -->
	 * @see #EXTENSIONS
	 * @model name="extensions"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSIONS_VALUE = 1;

	/**
	 * The '<em><b>Elements</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The application accepts unknown elements, but not unknown extensions
	 * <!-- end-model-doc -->
	 * @see #ELEMENTS
	 * @model name="elements"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENTS_VALUE = 2;

	/**
	 * The '<em><b>Both</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The application accepts unknown elements and extensions
	 * <!-- end-model-doc -->
	 * @see #BOTH
	 * @model name="both"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_VALUE = 3;

	/**
	 * An array of all the '<em><b>Unknown Content Code List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnknownContentCodeList[] VALUES_ARRAY =
		new UnknownContentCodeList[] {
			NO,
			EXTENSIONS,
			ELEMENTS,
			BOTH,
		};

	/**
	 * A public read-only list of all the '<em><b>Unknown Content Code List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnknownContentCodeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unknown Content Code List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnknownContentCodeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnknownContentCodeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unknown Content Code List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnknownContentCodeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnknownContentCodeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unknown Content Code List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnknownContentCodeList get(int value) {
		switch (value) {
			case NO_VALUE: return NO;
			case EXTENSIONS_VALUE: return EXTENSIONS;
			case ELEMENTS_VALUE: return ELEMENTS;
			case BOTH_VALUE: return BOTH;
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
	private UnknownContentCodeList(int value, String name, String literal) {
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
	
} //UnknownContentCodeList
