/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.vocab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Act Relationship Has Component</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getActRelationshipHasComponent()
 * @model
 * @generated
 */
public enum ActRelationshipHasComponent implements Enumerator {
	/**
	 * The '<em><b>ARR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARR_VALUE
	 * @generated
	 * @ordered
	 */
	ARR(0, "ARR", "ARR"),

	/**
	 * The '<em><b>COMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMP_VALUE
	 * @generated
	 * @ordered
	 */
	COMP(1, "COMP", "COMP"),

	/**
	 * The '<em><b>CTRLV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTRLV_VALUE
	 * @generated
	 * @ordered
	 */
	CTRLV(2, "CTRLV", "CTRLV"),

	/**
	 * The '<em><b>DEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEP_VALUE
	 * @generated
	 * @ordered
	 */
	DEP(3, "DEP", "DEP");

	/**
	 * The '<em><b>ARR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARR_VALUE = 0;

	/**
	 * The '<em><b>COMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMP_VALUE = 1;

	/**
	 * The '<em><b>CTRLV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CTRLV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CTRLV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CTRLV_VALUE = 2;

	/**
	 * The '<em><b>DEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEP_VALUE = 3;

	/**
	 * An array of all the '<em><b>Act Relationship Has Component</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActRelationshipHasComponent[] VALUES_ARRAY =
		new ActRelationshipHasComponent[] {
			ARR,
			COMP,
			CTRLV,
			DEP,
		};

	/**
	 * A public read-only list of all the '<em><b>Act Relationship Has Component</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActRelationshipHasComponent> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Act Relationship Has Component</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActRelationshipHasComponent get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActRelationshipHasComponent result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Act Relationship Has Component</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActRelationshipHasComponent getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActRelationshipHasComponent result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Act Relationship Has Component</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActRelationshipHasComponent get(int value) {
		switch (value) {
			case ARR_VALUE: return ARR;
			case COMP_VALUE: return COMP;
			case CTRLV_VALUE: return CTRLV;
			case DEP_VALUE: return DEP;
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
	private ActRelationshipHasComponent(int value, String name, String literal) {
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
	
} //ActRelationshipHasComponent
