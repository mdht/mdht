/**
 */
package org.eclipse.mdht.uml.fhir;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binding Strength Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.fhir.FHIRPackage#getBindingStrengthKind()
 * @model
 * @generated
 */
public enum BindingStrengthKind implements Enumerator {
	/**
	 * The '<em><b>Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRED(0, "required", "required"),

	/**
	 * The '<em><b>Extensible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSIBLE(1, "extensible", "extensible"),

	/**
	 * The '<em><b>Preferred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	PREFERRED(2, "preferred", "preferred"),

	/**
	 * The '<em><b>Example</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXAMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	EXAMPLE(3, "example", "example");

	/**
	 * The '<em><b>Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Required</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIRED
	 * @model name="required"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED_VALUE = 0;

	/**
	 * The '<em><b>Extensible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extensible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENSIBLE
	 * @model name="extensible"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSIBLE_VALUE = 1;

	/**
	 * The '<em><b>Preferred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preferred</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREFERRED
	 * @model name="preferred"
	 * @generated
	 * @ordered
	 */
	public static final int PREFERRED_VALUE = 2;

	/**
	 * The '<em><b>Example</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Example</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXAMPLE
	 * @model name="example"
	 * @generated
	 * @ordered
	 */
	public static final int EXAMPLE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Binding Strength Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BindingStrengthKind[] VALUES_ARRAY =
		new BindingStrengthKind[] {
			REQUIRED,
			EXTENSIBLE,
			PREFERRED,
			EXAMPLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Binding Strength Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BindingStrengthKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binding Strength Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingStrengthKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingStrengthKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Strength Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingStrengthKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingStrengthKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Strength Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingStrengthKind get(int value) {
		switch (value) {
			case REQUIRED_VALUE: return REQUIRED;
			case EXTENSIBLE_VALUE: return EXTENSIBLE;
			case PREFERRED_VALUE: return PREFERRED;
			case EXAMPLE_VALUE: return EXAMPLE;
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
	private BindingStrengthKind(int value, String name, String literal) {
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
	
} //BindingStrengthKind
