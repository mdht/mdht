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
 * A representation of the literals of the enumeration '<em><b>Composition Status List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getCompositionStatusList()
 * @model extendedMetaData="name='CompositionStatus-list'"
 * @generated
 */
public enum CompositionStatusList implements Enumerator {
	/**
	 * The '<em><b>Preliminary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRELIMINARY_VALUE
	 * @generated
	 * @ordered
	 */
	PRELIMINARY(0, "preliminary", "preliminary"),

	/**
	 * The '<em><b>Final</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	FINAL(1, "final", "final"),

	/**
	 * The '<em><b>Amended</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDED_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDED(2, "amended", "amended"),

	/**
	 * The '<em><b>Entered In Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERED_IN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERED_IN_ERROR(3, "enteredInError", "entered-in-error");

	/**
	 * The '<em><b>Preliminary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a preliminary composition or document (also known as initial or interim). The content may be incomplete or unverified
	 * <!-- end-model-doc -->
	 * @see #PRELIMINARY
	 * @model name="preliminary"
	 * @generated
	 * @ordered
	 */
	public static final int PRELIMINARY_VALUE = 0;

	/**
	 * The '<em><b>Final</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This version of the composition is complete and verified by an appropriate person and no further work is planned. Any subsequent updates would be on a new version of the composition.
	 * <!-- end-model-doc -->
	 * @see #FINAL
	 * @model name="final"
	 * @generated
	 * @ordered
	 */
	public static final int FINAL_VALUE = 1;

	/**
	 * The '<em><b>Amended</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The composition content or the referenced resources have been modified (edited or added to) subsequent to being released as "final" and the composition is complete and verified by an authorized person
	 * <!-- end-model-doc -->
	 * @see #AMENDED
	 * @model name="amended"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDED_VALUE = 2;

	/**
	 * The '<em><b>Entered In Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The composition or document was originally created/issued in error, and this is an amendment that marks that the entire series should not be considered as valid
	 * <!-- end-model-doc -->
	 * @see #ENTERED_IN_ERROR
	 * @model name="enteredInError" literal="entered-in-error"
	 * @generated
	 * @ordered
	 */
	public static final int ENTERED_IN_ERROR_VALUE = 3;

	/**
	 * An array of all the '<em><b>Composition Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompositionStatusList[] VALUES_ARRAY =
		new CompositionStatusList[] {
			PRELIMINARY,
			FINAL,
			AMENDED,
			ENTERED_IN_ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Composition Status List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompositionStatusList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Composition Status List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositionStatusList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompositionStatusList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Composition Status List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositionStatusList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompositionStatusList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Composition Status List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositionStatusList get(int value) {
		switch (value) {
			case PRELIMINARY_VALUE: return PRELIMINARY;
			case FINAL_VALUE: return FINAL;
			case AMENDED_VALUE: return AMENDED;
			case ENTERED_IN_ERROR_VALUE: return ENTERED_IN_ERROR;
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
	private CompositionStatusList(int value, String name, String literal) {
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
	
} //CompositionStatusList
