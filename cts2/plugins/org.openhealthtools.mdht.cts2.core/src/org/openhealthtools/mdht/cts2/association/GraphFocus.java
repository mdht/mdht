/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.association;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Graph Focus</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the root of an association graph
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getGraphFocus()
 * @model extendedMetaData="name='GraphFocus'"
 * @generated
 */
public enum GraphFocus implements Enumerator {
	/**
	 * The '<em><b>SPECIFICENTITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #SPECIFICENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIFICENTITY(0, "SPECIFICENTITY", "SPECIFIC_ENTITY"),

	/**
	 * The '<em><b>TOPNODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #TOPNODE_VALUE
	 * @generated
	 * @ordered
	 */
	TOPNODE(1, "TOPNODE", "TOP_NODE"),

	/**
	 * The '<em><b>BOTTOMNODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #BOTTOMNODE_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOMNODE(2, "BOTTOMNODE", "BOTTOM_NODE");

	/**
	 * The '<em><b>SPECIFICENTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The focus on the graph is contained in <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">focusEntity</i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @see #SPECIFICENTITY
	 * @model literal="SPECIFIC_ENTITY"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIFICENTITY_VALUE = 0;

	/**
	 * The '<em><b>TOPNODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The focus of the graph is on the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">TOP</i> or "universe" node
	 * <!-- end-model-doc -->
	 * 
	 * @see #TOPNODE
	 * @model literal="TOP_NODE"
	 * @generated
	 * @ordered
	 */
	public static final int TOPNODE_VALUE = 1;

	/**
	 * The '<em><b>BOTTOMNODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The focus of the graph is on the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">BOTTOM</i> or empty node
	 * <!-- end-model-doc -->
	 * 
	 * @see #BOTTOMNODE
	 * @model literal="BOTTOM_NODE"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOMNODE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Graph Focus</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final GraphFocus[] VALUES_ARRAY = new GraphFocus[] { SPECIFICENTITY, TOPNODE, BOTTOMNODE, };

	/**
	 * A public read-only list of all the '<em><b>Graph Focus</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<GraphFocus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Graph Focus</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static GraphFocus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GraphFocus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Graph Focus</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static GraphFocus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GraphFocus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Graph Focus</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static GraphFocus get(int value) {
		switch (value) {
			case SPECIFICENTITY_VALUE:
				return SPECIFICENTITY;
			case TOPNODE_VALUE:
				return TOPNODE;
			case BOTTOMNODE_VALUE:
				return BOTTOMNODE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private GraphFocus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // GraphFocus
