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
 * A representation of the literals of the enumeration '<em><b>Composition Attestation Mode List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getCompositionAttestationModeList()
 * @model extendedMetaData="name='CompositionAttestationMode-list'"
 * @generated
 */
public enum CompositionAttestationModeList implements Enumerator {
	/**
	 * The '<em><b>Personal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_VALUE
	 * @generated
	 * @ordered
	 */
	PERSONAL(0, "personal", "personal"),

	/**
	 * The '<em><b>Professional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFESSIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	PROFESSIONAL(1, "professional", "professional"),

	/**
	 * The '<em><b>Legal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGAL_VALUE
	 * @generated
	 * @ordered
	 */
	LEGAL(2, "legal", "legal"),

	/**
	 * The '<em><b>Official</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFICIAL_VALUE
	 * @generated
	 * @ordered
	 */
	OFFICIAL(3, "official", "official");

	/**
	 * The '<em><b>Personal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person authenticated the content in their personal capacity.
	 * <!-- end-model-doc -->
	 * @see #PERSONAL
	 * @model name="personal"
	 * @generated
	 * @ordered
	 */
	public static final int PERSONAL_VALUE = 0;

	/**
	 * The '<em><b>Professional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person authenticated the content in their professional capacity.
	 * <!-- end-model-doc -->
	 * @see #PROFESSIONAL
	 * @model name="professional"
	 * @generated
	 * @ordered
	 */
	public static final int PROFESSIONAL_VALUE = 1;

	/**
	 * The '<em><b>Legal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person authenticated the content and accepted legal responsibility for its content.
	 * <!-- end-model-doc -->
	 * @see #LEGAL
	 * @model name="legal"
	 * @generated
	 * @ordered
	 */
	public static final int LEGAL_VALUE = 2;

	/**
	 * The '<em><b>Official</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization authenticated the content as consistent with their policies and procedures.
	 * <!-- end-model-doc -->
	 * @see #OFFICIAL
	 * @model name="official"
	 * @generated
	 * @ordered
	 */
	public static final int OFFICIAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Composition Attestation Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompositionAttestationModeList[] VALUES_ARRAY =
		new CompositionAttestationModeList[] {
			PERSONAL,
			PROFESSIONAL,
			LEGAL,
			OFFICIAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Composition Attestation Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompositionAttestationModeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Composition Attestation Mode List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositionAttestationModeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompositionAttestationModeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Composition Attestation Mode List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositionAttestationModeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompositionAttestationModeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Composition Attestation Mode List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositionAttestationModeList get(int value) {
		switch (value) {
			case PERSONAL_VALUE: return PERSONAL;
			case PROFESSIONAL_VALUE: return PROFESSIONAL;
			case LEGAL_VALUE: return LEGAL;
			case OFFICIAL_VALUE: return OFFICIAL;
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
	private CompositionAttestationModeList(int value, String name, String literal) {
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
	
} //CompositionAttestationModeList
