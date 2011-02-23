/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.vocab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Entity Name Use</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getEntityNameUse()
 * @model
 * @generated
 */
public enum EntityNameUse implements Enumerator {
	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(0, "A", "A"),

	/**
	 * The '<em><b>ABC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABC_VALUE
	 * @generated
	 * @ordered
	 */
	ABC(1, "ABC", "ABC"),

	/**
	 * The '<em><b>ASGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASGN_VALUE
	 * @generated
	 * @ordered
	 */
	ASGN(2, "ASGN", "ASGN"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(3, "C", "C"),

	/**
	 * The '<em><b>I</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I_VALUE
	 * @generated
	 * @ordered
	 */
	I(4, "I", "I"),

	/**
	 * The '<em><b>IDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDE_VALUE
	 * @generated
	 * @ordered
	 */
	IDE(5, "IDE", "IDE"),

	/**
	 * The '<em><b>L</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L_VALUE
	 * @generated
	 * @ordered
	 */
	L(6, "L", "L"),

	/**
	 * The '<em><b>P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P_VALUE
	 * @generated
	 * @ordered
	 */
	P(7, "P", "P"),

	/**
	 * The '<em><b>PHON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHON_VALUE
	 * @generated
	 * @ordered
	 */
	PHON(8, "PHON", "PHON"),

	/**
	 * The '<em><b>R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R_VALUE
	 * @generated
	 * @ordered
	 */
	R(9, "R", "R"),

	/**
	 * The '<em><b>SNDX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNDX_VALUE
	 * @generated
	 * @ordered
	 */
	SNDX(10, "SNDX", "SNDX"),

	/**
	 * The '<em><b>SRCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRCH_VALUE
	 * @generated
	 * @ordered
	 */
	SRCH(11, "SRCH", "SRCH"),

	/**
	 * The '<em><b>SYL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYL_VALUE
	 * @generated
	 * @ordered
	 */
	SYL(12, "SYL", "SYL");

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 0;

	/**
	 * The '<em><b>ABC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABC_VALUE = 1;

	/**
	 * The '<em><b>ASGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASGN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASGN_VALUE = 2;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 3;

	/**
	 * The '<em><b>I</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>I</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #I
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I_VALUE = 4;

	/**
	 * The '<em><b>IDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDE_VALUE = 5;

	/**
	 * The '<em><b>L</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>L</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #L
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int L_VALUE = 6;

	/**
	 * The '<em><b>P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #P
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int P_VALUE = 7;

	/**
	 * The '<em><b>PHON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHON_VALUE = 8;

	/**
	 * The '<em><b>R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #R
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R_VALUE = 9;

	/**
	 * The '<em><b>SNDX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SNDX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SNDX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SNDX_VALUE = 10;

	/**
	 * The '<em><b>SRCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SRCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SRCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SRCH_VALUE = 11;

	/**
	 * The '<em><b>SYL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYL_VALUE = 12;

	/**
	 * An array of all the '<em><b>Entity Name Use</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EntityNameUse[] VALUES_ARRAY =
		new EntityNameUse[] {
			A,
			ABC,
			ASGN,
			C,
			I,
			IDE,
			L,
			P,
			PHON,
			R,
			SNDX,
			SRCH,
			SYL,
		};

	/**
	 * A public read-only list of all the '<em><b>Entity Name Use</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EntityNameUse> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entity Name Use</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityNameUse get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityNameUse result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Name Use</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityNameUse getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityNameUse result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Name Use</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityNameUse get(int value) {
		switch (value) {
			case A_VALUE: return A;
			case ABC_VALUE: return ABC;
			case ASGN_VALUE: return ASGN;
			case C_VALUE: return C;
			case I_VALUE: return I;
			case IDE_VALUE: return IDE;
			case L_VALUE: return L;
			case P_VALUE: return P;
			case PHON_VALUE: return PHON;
			case R_VALUE: return R;
			case SNDX_VALUE: return SNDX;
			case SRCH_VALUE: return SRCH;
			case SYL_VALUE: return SYL;
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
	private EntityNameUse(int value, String name, String literal) {
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
	
} //EntityNameUse
