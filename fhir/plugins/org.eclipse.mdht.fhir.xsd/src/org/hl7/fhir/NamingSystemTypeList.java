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
 * A representation of the literals of the enumeration '<em><b>Naming System Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getNamingSystemTypeList()
 * @model extendedMetaData="name='NamingSystemType-list'"
 * @generated
 */
public enum NamingSystemTypeList implements Enumerator {
	/**
	 * The '<em><b>Codesystem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODESYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	CODESYSTEM(0, "codesystem", "codesystem"),

	/**
	 * The '<em><b>Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIER(1, "identifier", "identifier"),

	/**
	 * The '<em><b>Root</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	ROOT(2, "root", "root");

	/**
	 * The '<em><b>Codesystem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The namingsystem is used to define concepts and symbols to represent those concepts.  E.g. UCUM, LOINC, NDC code, local lab codes, etc.
	 * <!-- end-model-doc -->
	 * @see #CODESYSTEM
	 * @model name="codesystem"
	 * @generated
	 * @ordered
	 */
	public static final int CODESYSTEM_VALUE = 0;

	/**
	 * The '<em><b>Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The namingsystem is used to manage identifiers (e.g. license numbers, order numbers, etc.).
	 * <!-- end-model-doc -->
	 * @see #IDENTIFIER
	 * @model name="identifier"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIER_VALUE = 1;

	/**
	 * The '<em><b>Root</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The namingsystem is used as the root for other identifiers and namingsystems.
	 * <!-- end-model-doc -->
	 * @see #ROOT
	 * @model name="root"
	 * @generated
	 * @ordered
	 */
	public static final int ROOT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Naming System Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NamingSystemTypeList[] VALUES_ARRAY =
		new NamingSystemTypeList[] {
			CODESYSTEM,
			IDENTIFIER,
			ROOT,
		};

	/**
	 * A public read-only list of all the '<em><b>Naming System Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NamingSystemTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Naming System Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamingSystemTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NamingSystemTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Naming System Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamingSystemTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NamingSystemTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Naming System Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamingSystemTypeList get(int value) {
		switch (value) {
			case CODESYSTEM_VALUE: return CODESYSTEM;
			case IDENTIFIER_VALUE: return IDENTIFIER;
			case ROOT_VALUE: return ROOT;
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
	private NamingSystemTypeList(int value, String name, String literal) {
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
	
} //NamingSystemTypeList
