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
package org.openhealthtools.mdht.cts2.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Property Directionality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * indicates whether the semantics of an object property are unidirectional (i.e. $\lnot r(a,b) \implies r(b,a)$ or bidirectional ($r(a,b) \implies
 * r(b,a)$).
 * <!-- end-model-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getObjectPropertyDirectionality()
 * @model extendedMetaData="name='ObjectPropertyDirectionality'"
 * @generated
 */
public enum ObjectPropertyDirectionality implements Enumerator {
	/**
	 * The '<em><b>UNIDIRECTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #UNIDIRECTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	UNIDIRECTIONAL(0, "UNIDIRECTIONAL", "UNIDIRECTIONAL"),

	/**
	 * The '<em><b>BIDIRECTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #BIDIRECTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	BIDIRECTIONAL(1, "BIDIRECTIONAL", "BIDIRECTIONAL");

	/**
	 * The '<em><b>UNIDIRECTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * $\lnot r(a,b) \implies r(b,a)$
	 * <!-- end-model-doc -->
	 * 
	 * @see #UNIDIRECTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNIDIRECTIONAL_VALUE = 0;

	/**
	 * The '<em><b>BIDIRECTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * $r(a,b) \implies r(b,a)$
	 * <!-- end-model-doc -->
	 * 
	 * @see #BIDIRECTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIDIRECTIONAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Object Property Directionality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ObjectPropertyDirectionality[] VALUES_ARRAY = new ObjectPropertyDirectionality[] {
			UNIDIRECTIONAL, BIDIRECTIONAL, };

	/**
	 * A public read-only list of all the '<em><b>Object Property Directionality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ObjectPropertyDirectionality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Property Directionality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ObjectPropertyDirectionality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectPropertyDirectionality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Property Directionality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ObjectPropertyDirectionality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectPropertyDirectionality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Property Directionality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static ObjectPropertyDirectionality get(int value) {
		switch (value) {
			case UNIDIRECTIONAL_VALUE:
				return UNIDIRECTIONAL;
			case BIDIRECTIONAL_VALUE:
				return BIDIRECTIONAL;
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
	private ObjectPropertyDirectionality(int value, String name, String literal) {
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

} // ObjectPropertyDirectionality
