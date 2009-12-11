/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Functionalism</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getFunctionalism()
 * @model extendedMetaData="name='Functionalism'"
 * @generated
 */
public enum Functionalism implements Enumerator {
	/**
	 * The '<em><b>Functional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONAL(0, "functional", "functional"),

	/**
	 * The '<em><b>Reverse Functional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVERSE_FUNCTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	REVERSE_FUNCTIONAL(1, "reverseFunctional", "reverse-functional"),

	/**
	 * The '<em><b>Functional Reverse Functional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_REVERSE_FUNCTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONAL_REVERSE_FUNCTIONAL(2, "functionalReverseFunctional", "functional-reverse-functional");

	/**
	 * The '<em><b>Functional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Functional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL
	 * @model name="functional"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONAL_VALUE = 0;

	/**
	 * The '<em><b>Reverse Functional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reverse Functional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVERSE_FUNCTIONAL
	 * @model name="reverseFunctional" literal="reverse-functional"
	 * @generated
	 * @ordered
	 */
	public static final int REVERSE_FUNCTIONAL_VALUE = 1;

	/**
	 * The '<em><b>Functional Reverse Functional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Functional Reverse Functional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_REVERSE_FUNCTIONAL
	 * @model name="functionalReverseFunctional" literal="functional-reverse-functional"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONAL_REVERSE_FUNCTIONAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Functionalism</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Functionalism[] VALUES_ARRAY =
		new Functionalism[] {
			FUNCTIONAL,
			REVERSE_FUNCTIONAL,
			FUNCTIONAL_REVERSE_FUNCTIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Functionalism</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Functionalism> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Functionalism</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Functionalism get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Functionalism result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Functionalism</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Functionalism getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Functionalism result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Functionalism</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Functionalism get(int value) {
		switch (value) {
			case FUNCTIONAL_VALUE: return FUNCTIONAL;
			case REVERSE_FUNCTIONAL_VALUE: return REVERSE_FUNCTIONAL;
			case FUNCTIONAL_REVERSE_FUNCTIONAL_VALUE: return FUNCTIONAL_REVERSE_FUNCTIONAL;
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
	private Functionalism(int value, String name, String literal) {
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
	
} //Functionalism
