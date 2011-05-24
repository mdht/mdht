/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Derivation Relationship Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The allowed derivation relationships between two artifacts
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDerivationRelationshipKind()
 * @model extendedMetaData="name='DerivationRelationshipKind'"
 * @generated
 */
public enum DerivationRelationshipKind implements Enumerator {
	/**
	 * The '<em><b>Restriction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTRICTION_VALUE
	 * @generated
	 * @ordered
	 */
	RESTRICTION(0, "restriction", "restriction"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(1, "extension", "extension"),

	/**
	 * The '<em><b>Conflicting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFLICTING_VALUE
	 * @generated
	 * @ordered
	 */
	CONFLICTING(2, "conflicting", "conflicting"),

	/**
	 * The '<em><b>Annotated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTATED_VALUE
	 * @generated
	 * @ordered
	 */
	ANNOTATED(3, "annotated", "annotated"),

	/**
	 * The '<em><b>Unchanged</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCHANGED_VALUE
	 * @generated
	 * @ordered
	 */
	UNCHANGED(4, "unchanged", "unchanged");

	/**
	 * The '<em><b>Restriction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current element is a proper subset of the element it was derived from, but is not identical.
	 * <!-- end-model-doc -->
	 * @see #RESTRICTION
	 * @model name="restriction"
	 * @generated
	 * @ordered
	 */
	public static final int RESTRICTION_VALUE = 0;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element derived from is a proper subset of this element, but is not identical.
	 * <!-- end-model-doc -->
	 * @see #EXTENSION
	 * @model name="extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 1;

	/**
	 * The '<em><b>Conflicting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Neither the element nor the element derived from are proper subsets of the other.
	 * <!-- end-model-doc -->
	 * @see #CONFLICTING
	 * @model name="conflicting"
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICTING_VALUE = 2;

	/**
	 * The '<em><b>Annotated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element is unchanged from the element it is derived from with the exception of descriptive annotations.  For datatype derivations, this effectively creates an Alias for an existing type.
	 * <!-- end-model-doc -->
	 * @see #ANNOTATED
	 * @model name="annotated"
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATED_VALUE = 3;

	/**
	 * The '<em><b>Unchanged</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element is unchanged from the element it is derived from.
	 * <!-- end-model-doc -->
	 * @see #UNCHANGED
	 * @model name="unchanged"
	 * @generated
	 * @ordered
	 */
	public static final int UNCHANGED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Derivation Relationship Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DerivationRelationshipKind[] VALUES_ARRAY = new DerivationRelationshipKind[] {
			RESTRICTION, EXTENSION, CONFLICTING, ANNOTATED, UNCHANGED, };

	/**
	 * A public read-only list of all the '<em><b>Derivation Relationship Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DerivationRelationshipKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Derivation Relationship Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DerivationRelationshipKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DerivationRelationshipKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Derivation Relationship Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DerivationRelationshipKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DerivationRelationshipKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Derivation Relationship Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DerivationRelationshipKind get(int value) {
		switch (value) {
			case RESTRICTION_VALUE:
				return RESTRICTION;
			case EXTENSION_VALUE:
				return EXTENSION;
			case CONFLICTING_VALUE:
				return CONFLICTING;
			case ANNOTATED_VALUE:
				return ANNOTATED;
			case UNCHANGED_VALUE:
				return UNCHANGED;
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
	private DerivationRelationshipKind(int value, String name, String literal) {
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

} // DerivationRelationshipKind
