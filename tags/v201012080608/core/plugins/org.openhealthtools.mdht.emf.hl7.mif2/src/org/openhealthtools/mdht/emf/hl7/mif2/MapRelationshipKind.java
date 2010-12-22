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
 * A representation of the literals of the enumeration '<em><b>Map Relationship Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The possible relationships between two mapped elements
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getMapRelationshipKind()
 * @model extendedMetaData="name='MapRelationshipKind'"
 * @generated
 */
public enum MapRelationshipKind implements Enumerator {
	/**
	 * The '<em><b>BT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BT_VALUE
	 * @generated
	 * @ordered
	 */
	BT(0, "BT", "BT"),

	/**
	 * The '<em><b>E</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E_VALUE
	 * @generated
	 * @ordered
	 */
	E(1, "E", "E"),

	/**
	 * The '<em><b>NT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NT_VALUE
	 * @generated
	 * @ordered
	 */
	NT(2, "NT", "NT"),

	/**
	 * The '<em><b>NC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NC_VALUE
	 * @generated
	 * @ordered
	 */
	NC(3, "NC", "NC");

	/**
	 * The '<em><b>BT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Broader Than - The first concept is at a more abstract level than the second concept.  For example, Hepatitis is broader than Hepatitis A, and endocrine disease is broader than Diabetes Mellitus.  Broader than is the opposite of the narrower than relationship.
	 * <!-- end-model-doc -->
	 * @see #BT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BT_VALUE = 0;

	/**
	 * The '<em><b>E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exact - The two concepts have identical meaning.
	 * <!-- end-model-doc -->
	 * @see #E
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E_VALUE = 1;

	/**
	 * The '<em><b>NT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Narrower Than - The first concept is at a more detailed level than the second concept.  For example, Pennicillin G is narrower than Pennicillin, and vellus hair is narrower than hair.  Narrower than is the opposite of broader than.
	 * <!-- end-model-doc -->
	 * @see #NT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NT_VALUE = 2;

	/**
	 * The '<em><b>NC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Comparable - The first concept cannot be mapped in any way to the second concept.  For example Blue cannot be mapped to Orange.
	 * <!-- end-model-doc -->
	 * @see #NC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NC_VALUE = 3;

	/**
	 * An array of all the '<em><b>Map Relationship Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MapRelationshipKind[] VALUES_ARRAY =
		new MapRelationshipKind[] {
			BT,
			E,
			NT,
			NC,
		};

	/**
	 * A public read-only list of all the '<em><b>Map Relationship Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MapRelationshipKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Map Relationship Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MapRelationshipKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MapRelationshipKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Map Relationship Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MapRelationshipKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MapRelationshipKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Map Relationship Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MapRelationshipKind get(int value) {
		switch (value) {
			case BT_VALUE: return BT;
			case E_VALUE: return E;
			case NT_VALUE: return NT;
			case NC_VALUE: return NC;
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
	private MapRelationshipKind(int value, String name, String literal) {
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
	
} //MapRelationshipKind
