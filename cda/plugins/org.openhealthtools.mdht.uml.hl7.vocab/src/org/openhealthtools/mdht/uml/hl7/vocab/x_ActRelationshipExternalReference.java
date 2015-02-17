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
 * A representation of the literals of the enumeration '<em><b>xAct Relationship External Reference</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getx_ActRelationshipExternalReference()
 * @model
 * @generated
 */
public enum x_ActRelationshipExternalReference implements Enumerator {
	/**
	 * The '<em><b>ELNK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELNK_VALUE
	 * @generated
	 * @ordered
	 */
	ELNK(0, "ELNK", "ELNK"),

	/**
	 * The '<em><b>REFR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFR_VALUE
	 * @generated
	 * @ordered
	 */
	REFR(1, "REFR", "REFR"),

	/**
	 * The '<em><b>RPLC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPLC_VALUE
	 * @generated
	 * @ordered
	 */
	RPLC(2, "RPLC", "RPLC"),

	/**
	 * The '<em><b>SPRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRT_VALUE
	 * @generated
	 * @ordered
	 */
	SPRT(3, "SPRT", "SPRT"),

	/**
	 * The '<em><b>SUBJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJ_VALUE
	 * @generated
	 * @ordered
	 */
	SUBJ(4, "SUBJ", "SUBJ"),

	/**
	 * The '<em><b>XCRPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XCRPT_VALUE
	 * @generated
	 * @ordered
	 */
	XCRPT(5, "XCRPT", "XCRPT");

	/**
	 * The '<em><b>ELNK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELNK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELNK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELNK_VALUE = 0;

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
	public static final int REFR_VALUE = 1;

	/**
	 * The '<em><b>RPLC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RPLC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RPLC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RPLC_VALUE = 2;

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
	public static final int SPRT_VALUE = 3;

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
	public static final int SUBJ_VALUE = 4;

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
	public static final int XCRPT_VALUE = 5;

	/**
	 * An array of all the '<em><b>xAct Relationship External Reference</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final x_ActRelationshipExternalReference[] VALUES_ARRAY = new x_ActRelationshipExternalReference[] {
			ELNK, REFR, RPLC, SPRT, SUBJ, XCRPT, };

	/**
	 * A public read-only list of all the '<em><b>xAct Relationship External Reference</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<x_ActRelationshipExternalReference> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>xAct Relationship External Reference</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_ActRelationshipExternalReference get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			x_ActRelationshipExternalReference result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>xAct Relationship External Reference</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_ActRelationshipExternalReference getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			x_ActRelationshipExternalReference result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>xAct Relationship External Reference</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static x_ActRelationshipExternalReference get(int value) {
		switch (value) {
			case ELNK_VALUE:
				return ELNK;
			case REFR_VALUE:
				return REFR;
			case RPLC_VALUE:
				return RPLC;
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
	private x_ActRelationshipExternalReference(int value, String name, String literal) {
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

} // x_ActRelationshipExternalReference
