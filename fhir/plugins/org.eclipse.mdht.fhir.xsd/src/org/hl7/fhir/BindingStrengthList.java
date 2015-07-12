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
 * A representation of the literals of the enumeration '<em><b>Binding Strength List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getBindingStrengthList()
 * @model extendedMetaData="name='BindingStrength-list'"
 * @generated
 */
public enum BindingStrengthList implements Enumerator {
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be conformant, instances of this element SHALL include a code from the specified value set.
	 * <!-- end-model-doc -->
	 * @see #REQUIRED
	 * @model name="required"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED_VALUE = 0;

	/**
	 * The '<em><b>Extensible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To be conformant, instances of this element SHALL include a code from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the valueset does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead.
	 * <!-- end-model-doc -->
	 * @see #EXTENSIBLE
	 * @model name="extensible"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSIBLE_VALUE = 1;

	/**
	 * The '<em><b>Preferred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant.
	 * <!-- end-model-doc -->
	 * @see #PREFERRED
	 * @model name="preferred"
	 * @generated
	 * @ordered
	 */
	public static final int PREFERRED_VALUE = 2;

	/**
	 * The '<em><b>Example</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included.
	 * <!-- end-model-doc -->
	 * @see #EXAMPLE
	 * @model name="example"
	 * @generated
	 * @ordered
	 */
	public static final int EXAMPLE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Binding Strength List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BindingStrengthList[] VALUES_ARRAY =
		new BindingStrengthList[] {
			REQUIRED,
			EXTENSIBLE,
			PREFERRED,
			EXAMPLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Binding Strength List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BindingStrengthList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binding Strength List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingStrengthList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingStrengthList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Strength List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingStrengthList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BindingStrengthList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding Strength List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BindingStrengthList get(int value) {
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
	private BindingStrengthList(int value, String name, String literal) {
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
	
} //BindingStrengthList
