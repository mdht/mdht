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
 * A representation of the literals of the enumeration '<em><b>xAct Relationship Entry Relationship</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getx_ActRelationshipEntryRelationship()
 * @model
 * @generated
 */
public enum x_ActRelationshipEntryRelationship implements Enumerator {
	/**
	 * The '<em><b>CAUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAUS_VALUE
	 * @generated
	 * @ordered
	 */
	CAUS(0, "CAUS", "CAUS"),

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
	 * The '<em><b>GEVL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEVL_VALUE
	 * @generated
	 * @ordered
	 */
	GEVL(2, "GEVL", "GEVL"),

	/**
	 * The '<em><b>MFST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MFST_VALUE
	 * @generated
	 * @ordered
	 */
	MFST(3, "MFST", "MFST"),

	/**
	 * The '<em><b>REFR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFR_VALUE
	 * @generated
	 * @ordered
	 */
	REFR(4, "REFR", "REFR"),

	/**
	 * The '<em><b>RSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSON_VALUE
	 * @generated
	 * @ordered
	 */
	RSON(5, "RSON", "RSON"),

	/**
	 * The '<em><b>SAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAS_VALUE
	 * @generated
	 * @ordered
	 */
	SAS(6, "SAS", "SAS"),

	/**
	 * The '<em><b>SPRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRT_VALUE
	 * @generated
	 * @ordered
	 */
	SPRT(7, "SPRT", "SPRT"),

	/**
	 * The '<em><b>SUBJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJ_VALUE
	 * @generated
	 * @ordered
	 */
	SUBJ(8, "SUBJ", "SUBJ"),

	/**
	 * The '<em><b>XCRPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XCRPT_VALUE
	 * @generated
	 * @ordered
	 */
	XCRPT(9, "XCRPT", "XCRPT");

	/**
	 * The '<em><b>CAUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAUS_VALUE = 0;

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
	 * The '<em><b>GEVL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GEVL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GEVL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GEVL_VALUE = 2;

	/**
	 * The '<em><b>MFST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MFST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MFST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MFST_VALUE = 3;

	/**
	 * The '<em><b>REFR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFR_VALUE = 4;

	/**
	 * The '<em><b>RSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RSON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RSON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RSON_VALUE = 5;

	/**
	 * The '<em><b>SAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAS_VALUE = 6;

	/**
	 * The '<em><b>SPRT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPRT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPRT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPRT_VALUE = 7;

	/**
	 * The '<em><b>SUBJ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBJ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBJ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBJ_VALUE = 8;

	/**
	 * The '<em><b>XCRPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XCRPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XCRPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XCRPT_VALUE = 9;

	/**
	 * An array of all the '<em><b>xAct Relationship Entry Relationship</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final x_ActRelationshipEntryRelationship[] VALUES_ARRAY = new x_ActRelationshipEntryRelationship[] {
			CAUS, COMP, GEVL, MFST, REFR, RSON, SAS, SPRT, SUBJ, XCRPT, };

	/**
	 * A public read-only list of all the '<em><b>xAct Relationship Entry Relationship</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<x_ActRelationshipEntryRelationship> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>xAct Relationship Entry Relationship</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_ActRelationshipEntryRelationship get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			x_ActRelationshipEntryRelationship result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>xAct Relationship Entry Relationship</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_ActRelationshipEntryRelationship getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			x_ActRelationshipEntryRelationship result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>xAct Relationship Entry Relationship</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_ActRelationshipEntryRelationship get(int value) {
		switch (value) {
			case CAUS_VALUE:
				return CAUS;
			case COMP_VALUE:
				return COMP;
			case GEVL_VALUE:
				return GEVL;
			case MFST_VALUE:
				return MFST;
			case REFR_VALUE:
				return REFR;
			case RSON_VALUE:
				return RSON;
			case SAS_VALUE:
				return SAS;
			case SPRT_VALUE:
				return SPRT;
			case SUBJ_VALUE:
				return SUBJ;
			case XCRPT_VALUE:
				return XCRPT;
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
	private x_ActRelationshipEntryRelationship(int value, String name, String literal) {
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

} // x_ActRelationshipEntryRelationship
