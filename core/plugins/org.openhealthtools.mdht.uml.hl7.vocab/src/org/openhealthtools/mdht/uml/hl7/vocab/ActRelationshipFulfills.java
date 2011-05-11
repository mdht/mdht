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
 * A representation of the literals of the enumeration '<em><b>Act Relationship Fulfills</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getActRelationshipFulfills()
 * @model
 * @generated
 */
public enum ActRelationshipFulfills implements Enumerator {
	/**
	 * The '<em><b>FLFS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLFS_VALUE
	 * @generated
	 * @ordered
	 */
	FLFS(0, "FLFS", "FLFS"),

	/**
	 * The '<em><b>OCCR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCR_VALUE
	 * @generated
	 * @ordered
	 */
	OCCR(1, "OCCR", "OCCR"),

	/**
	 * The '<em><b>OREF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OREF_VALUE
	 * @generated
	 * @ordered
	 */
	OREF(2, "OREF", "OREF"),

	/**
	 * The '<em><b>SCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCH_VALUE
	 * @generated
	 * @ordered
	 */
	SCH(3, "SCH", "SCH");

	/**
	 * The '<em><b>FLFS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLFS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLFS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLFS_VALUE = 0;

	/**
	 * The '<em><b>OCCR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCCR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCCR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCCR_VALUE = 1;

	/**
	 * The '<em><b>OREF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OREF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OREF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OREF_VALUE = 2;

	/**
	 * The '<em><b>SCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCH_VALUE = 3;

	/**
	 * An array of all the '<em><b>Act Relationship Fulfills</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActRelationshipFulfills[] VALUES_ARRAY =
		new ActRelationshipFulfills[] {
			FLFS,
			OCCR,
			OREF,
			SCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Act Relationship Fulfills</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActRelationshipFulfills> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Act Relationship Fulfills</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActRelationshipFulfills get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActRelationshipFulfills result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Act Relationship Fulfills</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActRelationshipFulfills getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActRelationshipFulfills result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Act Relationship Fulfills</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActRelationshipFulfills get(int value) {
		switch (value) {
			case FLFS_VALUE: return FLFS;
			case OCCR_VALUE: return OCCR;
			case OREF_VALUE: return OREF;
			case SCH_VALUE: return SCH;
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
	private ActRelationshipFulfills(int value, String name, String literal) {
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
	
} //ActRelationshipFulfills
