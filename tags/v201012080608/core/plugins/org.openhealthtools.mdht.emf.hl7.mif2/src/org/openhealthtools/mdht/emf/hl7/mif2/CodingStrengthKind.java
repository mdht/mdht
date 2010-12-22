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
 * A representation of the literals of the enumeration '<em><b>Coding Strength Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines whether the specified element is restricted to only using the identified coding system for the element.
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodingStrengthKind()
 * @model extendedMetaData="name='CodingStrengthKind'"
 * @generated
 */
public enum CodingStrengthKind implements Enumerator {
	/**
	 * The '<em><b>CNE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CNE_VALUE
	 * @generated
	 * @ordered
	 */
	CNE(0, "CNE", "CNE"),

	/**
	 * The '<em><b>CWE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CWE_VALUE
	 * @generated
	 * @ordered
	 */
	CWE(1, "CWE", "CWE");

	/**
	 * The '<em><b>CNE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not null, the element must be coded and must be drawn from the value set specified in the binding.
	 * <!-- end-model-doc -->
	 * @see #CNE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CNE_VALUE = 0;

	/**
	 * The '<em><b>CWE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not null, the element must be coded if there is an appropriate value in the value set specified in the binding.  If no appropriate code is available, a local code may be used, or the value may be populated with only original text.
	 * <!-- end-model-doc -->
	 * @see #CWE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CWE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Coding Strength Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CodingStrengthKind[] VALUES_ARRAY =
		new CodingStrengthKind[] {
			CNE,
			CWE,
		};

	/**
	 * A public read-only list of all the '<em><b>Coding Strength Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CodingStrengthKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coding Strength Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodingStrengthKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodingStrengthKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coding Strength Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodingStrengthKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CodingStrengthKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coding Strength Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodingStrengthKind get(int value) {
		switch (value) {
			case CNE_VALUE: return CNE;
			case CWE_VALUE: return CWE;
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
	private CodingStrengthKind(int value, String name, String literal) {
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
	
} //CodingStrengthKind
