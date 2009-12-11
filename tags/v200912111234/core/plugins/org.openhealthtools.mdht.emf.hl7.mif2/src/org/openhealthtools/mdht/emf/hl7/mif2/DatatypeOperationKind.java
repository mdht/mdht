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
 * A representation of the literals of the enumeration '<em><b>Datatype Operation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The list of allowed datatype property kinds
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDatatypeOperationKind()
 * @model extendedMetaData="name='DatatypeOperationKind'"
 * @generated
 */
public enum DatatypeOperationKind implements Enumerator {
	/**
	 * The '<em><b>Promotion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROMOTION_VALUE
	 * @generated
	 * @ordered
	 */
	PROMOTION(0, "promotion", "promotion"),

	/**
	 * The '<em><b>Demotion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMOTION_VALUE
	 * @generated
	 * @ordered
	 */
	DEMOTION(1, "demotion", "demotion"),

	/**
	 * The '<em><b>Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	LITERAL(2, "literal", "literal"),

	/**
	 * The '<em><b>Variable Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIABLE_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	VARIABLE_PROPERTY(3, "variableProperty", "variableProperty");

	/**
	 * The '<em><b>Promotion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property converts a simpler datatype into a more complex datatype
	 * <!-- end-model-doc -->
	 * @see #PROMOTION
	 * @model name="promotion"
	 * @generated
	 * @ordered
	 */
	public static final int PROMOTION_VALUE = 0;

	/**
	 * The '<em><b>Demotion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property exposes the datatype as a simpler datatype by defaulting properties of the new datatype and/or constraining the properties of the original datatype.
	 * <!-- end-model-doc -->
	 * @see #DEMOTION
	 * @model name="demotion"
	 * @generated
	 * @ordered
	 */
	public static final int DEMOTION_VALUE = 1;

	/**
	 * The '<em><b>Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property exposes the datatype as a string representation
	 * <!-- end-model-doc -->
	 * @see #LITERAL
	 * @model name="literal"
	 * @generated
	 * @ordered
	 */
	public static final int LITERAL_VALUE = 2;

	/**
	 * The '<em><b>Variable Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property whose value may vary from instance to instance.  Variable properties will need to be comunicated or persisted by an ITS unless they can be inferred from the value of other properties.
	 * <!-- end-model-doc -->
	 * @see #VARIABLE_PROPERTY
	 * @model name="variableProperty"
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_PROPERTY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Datatype Operation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DatatypeOperationKind[] VALUES_ARRAY =
		new DatatypeOperationKind[] {
			PROMOTION,
			DEMOTION,
			LITERAL,
			VARIABLE_PROPERTY,
		};

	/**
	 * A public read-only list of all the '<em><b>Datatype Operation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatatypeOperationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Datatype Operation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypeOperationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatatypeOperationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datatype Operation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypeOperationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatatypeOperationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datatype Operation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypeOperationKind get(int value) {
		switch (value) {
			case PROMOTION_VALUE: return PROMOTION;
			case DEMOTION_VALUE: return DEMOTION;
			case LITERAL_VALUE: return LITERAL;
			case VARIABLE_PROPERTY_VALUE: return VARIABLE_PROPERTY;
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
	private DatatypeOperationKind(int value, String name, String literal) {
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
	
} //DatatypeOperationKind
