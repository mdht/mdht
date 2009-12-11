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
 * A representation of the literals of the enumeration '<em><b>Relationship Traversal Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the filter to apply when selecting codes by traversing a relationship
 * UML: Type used in a complex tag value
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getRelationshipTraversalKind()
 * @model extendedMetaData="name='RelationshipTraversalKind'"
 * @generated
 */
public enum RelationshipTraversalKind implements Enumerator {
	/**
	 * The '<em><b>Direct Relations Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_RELATIONS_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT_RELATIONS_ONLY(0, "DirectRelationsOnly", "DirectRelationsOnly"),

	/**
	 * The '<em><b>Transitive Closure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSITIVE_CLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSITIVE_CLOSURE(1, "TransitiveClosure", "TransitiveClosure"),

	/**
	 * The '<em><b>Transitive Closure Leaves</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSITIVE_CLOSURE_LEAVES_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSITIVE_CLOSURE_LEAVES(2, "TransitiveClosureLeaves", "TransitiveClosureLeaves");

	/**
	 * The '<em><b>Direct Relations Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only those codes with a direct relationship to the selected code are included.  E.g. Direct children of this code
	 * <!-- end-model-doc -->
	 * @see #DIRECT_RELATIONS_ONLY
	 * @model name="DirectRelationsOnly"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_RELATIONS_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Transitive Closure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All codes walking the transitive closure of the specified relationship are included.  E.g. Descendants of this code.
	 * <!-- end-model-doc -->
	 * @see #TRANSITIVE_CLOSURE
	 * @model name="TransitiveClosure"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITIVE_CLOSURE_VALUE = 1;

	/**
	 * The '<em><b>Transitive Closure Leaves</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All codes walking the transitive closure of the specified relationship where the code has no outbound relationship of the specified type.  E.g. descendants, leaf nodes only
	 * <!-- end-model-doc -->
	 * @see #TRANSITIVE_CLOSURE_LEAVES
	 * @model name="TransitiveClosureLeaves"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITIVE_CLOSURE_LEAVES_VALUE = 2;

	/**
	 * An array of all the '<em><b>Relationship Traversal Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationshipTraversalKind[] VALUES_ARRAY =
		new RelationshipTraversalKind[] {
			DIRECT_RELATIONS_ONLY,
			TRANSITIVE_CLOSURE,
			TRANSITIVE_CLOSURE_LEAVES,
		};

	/**
	 * A public read-only list of all the '<em><b>Relationship Traversal Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationshipTraversalKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relationship Traversal Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipTraversalKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipTraversalKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Traversal Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipTraversalKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipTraversalKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Traversal Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipTraversalKind get(int value) {
		switch (value) {
			case DIRECT_RELATIONS_ONLY_VALUE: return DIRECT_RELATIONS_ONLY;
			case TRANSITIVE_CLOSURE_VALUE: return TRANSITIVE_CLOSURE;
			case TRANSITIVE_CLOSURE_LEAVES_VALUE: return TRANSITIVE_CLOSURE_LEAVES;
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
	private RelationshipTraversalKind(int value, String name, String literal) {
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
	
} //RelationshipTraversalKind
