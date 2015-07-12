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
 * A representation of the literals of the enumeration '<em><b>Note Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getNoteTypeList()
 * @model extendedMetaData="name='NoteType-list'"
 * @generated
 */
public enum NoteTypeList implements Enumerator {
	/**
	 * The '<em><b>Display</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	DISPLAY(0, "display", "display"),

	/**
	 * The '<em><b>Print</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINT_VALUE
	 * @generated
	 * @ordered
	 */
	PRINT(1, "print", "print"),

	/**
	 * The '<em><b>Printoper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINTOPER_VALUE
	 * @generated
	 * @ordered
	 */
	PRINTOPER(2, "printoper", "printoper");

	/**
	 * The '<em><b>Display</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display the note.
	 * <!-- end-model-doc -->
	 * @see #DISPLAY
	 * @model name="display"
	 * @generated
	 * @ordered
	 */
	public static final int DISPLAY_VALUE = 0;

	/**
	 * The '<em><b>Print</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Print the note on the form.
	 * <!-- end-model-doc -->
	 * @see #PRINT
	 * @model name="print"
	 * @generated
	 * @ordered
	 */
	public static final int PRINT_VALUE = 1;

	/**
	 * The '<em><b>Printoper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Print the note for the operator.
	 * <!-- end-model-doc -->
	 * @see #PRINTOPER
	 * @model name="printoper"
	 * @generated
	 * @ordered
	 */
	public static final int PRINTOPER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Note Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NoteTypeList[] VALUES_ARRAY =
		new NoteTypeList[] {
			DISPLAY,
			PRINT,
			PRINTOPER,
		};

	/**
	 * A public read-only list of all the '<em><b>Note Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NoteTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Note Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoteTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoteTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoteTypeList get(int value) {
		switch (value) {
			case DISPLAY_VALUE: return DISPLAY;
			case PRINT_VALUE: return PRINT;
			case PRINTOPER_VALUE: return PRINTOPER;
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
	private NoteTypeList(int value, String name, String literal) {
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
	
} //NoteTypeList
