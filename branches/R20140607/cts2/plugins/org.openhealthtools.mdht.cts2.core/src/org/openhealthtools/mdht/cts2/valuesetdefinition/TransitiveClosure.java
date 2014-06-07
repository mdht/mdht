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
 * A representation of the literals of the enumeration '<em><b>Transitive Closure</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates whether only directly associated nodes or the transitive closure over the supplied predicate is to be used in the resolution of an entity
 * reference and predicate.
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage#getTransitiveClosure()
 * @model extendedMetaData="name='TransitiveClosure'"
 * @generated
 */
public enum TransitiveClosure implements Enumerator {
	/**
	 * The '<em><b>DIRECTLYASSOCIATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #DIRECTLYASSOCIATED_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECTLYASSOCIATED(0, "DIRECTLYASSOCIATED", "DIRECTLY_ASSOCIATED"),

	/**
	 * The '<em><b>TRANSITIVECLOSURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #TRANSITIVECLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSITIVECLOSURE(1, "TRANSITIVECLOSURE", "TRANSITIVE_CLOSURE");

	/**
	 * The '<em><b>DIRECTLYASSOCIATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * oOnly entity references that are explicitly assert to be directly associated with the source entity are included. Associations whose <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">derivation</i> is <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">INFERRED</i> are not considered when this
	 * setting is used.
	 * <!-- end-model-doc -->
	 * 
	 * @see #DIRECTLYASSOCIATED
	 * @model literal="DIRECTLY_ASSOCIATED"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECTLYASSOCIATED_VALUE = 0;

	/**
	 * The '<em><b>TRANSITIVECLOSURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * both entity references that are explicitly asserted to be directly associated with the source entity are included and entities that can be
	 * inferred to participate in the association named by
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">predicate</i> are included as candidates for the set, although the final
	 * resolution may depend on other factors such as a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/ValueSetDefinition">LeafOrAll</i> setting.
	 * <!-- end-model-doc -->
	 * 
	 * @see #TRANSITIVECLOSURE
	 * @model literal="TRANSITIVE_CLOSURE"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITIVECLOSURE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Transitive Closure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final TransitiveClosure[] VALUES_ARRAY = new TransitiveClosure[] {
			DIRECTLYASSOCIATED, TRANSITIVECLOSURE, };

	/**
	 * A public read-only list of all the '<em><b>Transitive Closure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<TransitiveClosure> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transitive Closure</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static TransitiveClosure get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransitiveClosure result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transitive Closure</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static TransitiveClosure getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransitiveClosure result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transitive Closure</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static TransitiveClosure get(int value) {
		switch (value) {
			case DIRECTLYASSOCIATED_VALUE:
				return DIRECTLYASSOCIATED;
			case TRANSITIVECLOSURE_VALUE:
				return TRANSITIVECLOSURE;
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
	private TransitiveClosure(int value, String name, String literal) {
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

} // TransitiveClosure
