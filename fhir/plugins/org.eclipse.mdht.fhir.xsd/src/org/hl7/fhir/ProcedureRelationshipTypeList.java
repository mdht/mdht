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
 * A representation of the literals of the enumeration '<em><b>Procedure Relationship Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getProcedureRelationshipTypeList()
 * @model extendedMetaData="name='ProcedureRelationshipType-list'"
 * @generated
 */
public enum ProcedureRelationshipTypeList implements Enumerator {
	/**
	 * The '<em><b>Caused By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAUSED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	CAUSED_BY(0, "causedBy", "caused-by"),

	/**
	 * The '<em><b>Because Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BECAUSE_OF_VALUE
	 * @generated
	 * @ordered
	 */
	BECAUSE_OF(1, "becauseOf", "because-of");

	/**
	 * The '<em><b>Caused By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This procedure had to be performed because of the related one.
	 * <!-- end-model-doc -->
	 * @see #CAUSED_BY
	 * @model name="causedBy" literal="caused-by"
	 * @generated
	 * @ordered
	 */
	public static final int CAUSED_BY_VALUE = 0;

	/**
	 * The '<em><b>Because Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This procedure caused the related one to be performed.
	 * <!-- end-model-doc -->
	 * @see #BECAUSE_OF
	 * @model name="becauseOf" literal="because-of"
	 * @generated
	 * @ordered
	 */
	public static final int BECAUSE_OF_VALUE = 1;

	/**
	 * An array of all the '<em><b>Procedure Relationship Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcedureRelationshipTypeList[] VALUES_ARRAY =
		new ProcedureRelationshipTypeList[] {
			CAUSED_BY,
			BECAUSE_OF,
		};

	/**
	 * A public read-only list of all the '<em><b>Procedure Relationship Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcedureRelationshipTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Procedure Relationship Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcedureRelationshipTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcedureRelationshipTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Procedure Relationship Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcedureRelationshipTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcedureRelationshipTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Procedure Relationship Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcedureRelationshipTypeList get(int value) {
		switch (value) {
			case CAUSED_BY_VALUE: return CAUSED_BY;
			case BECAUSE_OF_VALUE: return BECAUSE_OF;
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
	private ProcedureRelationshipTypeList(int value, String name, String literal) {
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
	
} //ProcedureRelationshipTypeList
