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
 * A representation of the literals of the enumeration '<em><b>Identifier Use List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getIdentifierUseList()
 * @model extendedMetaData="name='IdentifierUse-list'"
 * @generated
 */
public enum IdentifierUseList implements Enumerator {
	/**
	 * The '<em><b>Usual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USUAL_VALUE
	 * @generated
	 * @ordered
	 */
	USUAL(0, "usual", "usual"),

	/**
	 * The '<em><b>Official</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFICIAL_VALUE
	 * @generated
	 * @ordered
	 */
	OFFICIAL(1, "official", "official"),

	/**
	 * The '<em><b>Temp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMP_VALUE
	 * @generated
	 * @ordered
	 */
	TEMP(2, "temp", "temp"),

	/**
	 * The '<em><b>Secondary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDARY_VALUE
	 * @generated
	 * @ordered
	 */
	SECONDARY(3, "secondary", "secondary");

	/**
	 * The '<em><b>Usual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the identifier recommended for display and use in real-world interactions
	 * <!-- end-model-doc -->
	 * @see #USUAL
	 * @model name="usual"
	 * @generated
	 * @ordered
	 */
	public static final int USUAL_VALUE = 0;

	/**
	 * The '<em><b>Official</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the identifier considered to be most trusted for the identification of this item
	 * <!-- end-model-doc -->
	 * @see #OFFICIAL
	 * @model name="official"
	 * @generated
	 * @ordered
	 */
	public static final int OFFICIAL_VALUE = 1;

	/**
	 * The '<em><b>Temp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A temporary identifier
	 * <!-- end-model-doc -->
	 * @see #TEMP
	 * @model name="temp"
	 * @generated
	 * @ordered
	 */
	public static final int TEMP_VALUE = 2;

	/**
	 * The '<em><b>Secondary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context
	 * <!-- end-model-doc -->
	 * @see #SECONDARY
	 * @model name="secondary"
	 * @generated
	 * @ordered
	 */
	public static final int SECONDARY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Identifier Use List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IdentifierUseList[] VALUES_ARRAY =
		new IdentifierUseList[] {
			USUAL,
			OFFICIAL,
			TEMP,
			SECONDARY,
		};

	/**
	 * A public read-only list of all the '<em><b>Identifier Use List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IdentifierUseList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Identifier Use List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierUseList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentifierUseList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identifier Use List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierUseList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IdentifierUseList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Identifier Use List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IdentifierUseList get(int value) {
		switch (value) {
			case USUAL_VALUE: return USUAL;
			case OFFICIAL_VALUE: return OFFICIAL;
			case TEMP_VALUE: return TEMP;
			case SECONDARY_VALUE: return SECONDARY;
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
	private IdentifierUseList(int value, String name, String literal) {
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
	
} //IdentifierUseList
