/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.valuesetdefinition;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Leaf Or All</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates whether intermediate nodes in a transitive closure are to be included in the result or only the "leaf" nodes.
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getLeafOrAll()
 * @model extendedMetaData="name='LeafOrAll'"
 * @generated
 */
public enum LeafOrAll implements Enumerator {
	/**
	 * The '<em><b>LEAFONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #LEAFONLY_VALUE
	 * @generated
	 * @ordered
	 */
	LEAFONLY(0, "LEAFONLY", "LEAF_ONLY"),

	/**
	 * The '<em><b>ALLINTERMEDIATENODES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ALLINTERMEDIATENODES_VALUE
	 * @generated
	 * @ordered
	 */
	ALLINTERMEDIATENODES(1, "ALLINTERMEDIATENODES", "ALL_INTERMEDIATE_NODES");

	/**
	 * The '<em><b>LEAFONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * only nodes who can be inferred to participate as a source but not a target of an association if <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">direction </i>is <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">SOURCE_TO_TARGET</i>, or a target but not a source if <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">direction</i> is
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">TARGET_TO_SOURCE</i>, are included in the set of entity references.
	 * <!-- end-model-doc -->
	 * 
	 * @see #LEAFONLY
	 * @model literal="LEAF_ONLY"
	 * @generated
	 * @ordered
	 */
	public static final int LEAFONLY_VALUE = 0;

	/**
	 * The '<em><b>ALLINTERMEDIATENODES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * all (active) nodes are to be included in the transitive closure.
	 * <!-- end-model-doc -->
	 * 
	 * @see #ALLINTERMEDIATENODES
	 * @model literal="ALL_INTERMEDIATE_NODES"
	 * @generated
	 * @ordered
	 */
	public static final int ALLINTERMEDIATENODES_VALUE = 1;

	/**
	 * An array of all the '<em><b>Leaf Or All</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final LeafOrAll[] VALUES_ARRAY = new LeafOrAll[] { LEAFONLY, ALLINTERMEDIATENODES, };

	/**
	 * A public read-only list of all the '<em><b>Leaf Or All</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<LeafOrAll> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Leaf Or All</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static LeafOrAll get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LeafOrAll result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Leaf Or All</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static LeafOrAll getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LeafOrAll result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Leaf Or All</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static LeafOrAll get(int value) {
		switch (value) {
			case LEAFONLY_VALUE:
				return LEAFONLY;
			case ALLINTERMEDIATENODES_VALUE:
				return ALLINTERMEDIATENODES;
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
	private LeafOrAll(int value, String name, String literal) {
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

} // LeafOrAll
