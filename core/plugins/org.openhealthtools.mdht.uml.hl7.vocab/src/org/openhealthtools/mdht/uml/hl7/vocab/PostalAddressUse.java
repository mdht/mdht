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
 * A representation of the literals of the enumeration '<em><b>Postal Address Use</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getPostalAddressUse()
 * @model
 * @generated
 */
public enum PostalAddressUse implements Enumerator {
	/**
	 * The '<em><b>ABC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABC_VALUE
	 * @generated
	 * @ordered
	 */
	ABC(0, "ABC", "ABC"),

	/**
	 * The '<em><b>BAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAD_VALUE
	 * @generated
	 * @ordered
	 */
	BAD(1, "BAD", "BAD"),

	/**
	 * The '<em><b>DIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIR_VALUE
	 * @generated
	 * @ordered
	 */
	DIR(2, "DIR", "DIR"),

	/**
	 * The '<em><b>H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H_VALUE
	 * @generated
	 * @ordered
	 */
	H(3, "H", "H"),

	/**
	 * The '<em><b>HP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HP_VALUE
	 * @generated
	 * @ordered
	 */
	HP(4, "HP", "HP"),

	/**
	 * The '<em><b>HV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HV_VALUE
	 * @generated
	 * @ordered
	 */
	HV(5, "HV", "HV"),

	/**
	 * The '<em><b>IDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDE_VALUE
	 * @generated
	 * @ordered
	 */
	IDE(6, "IDE", "IDE"),

	/**
	 * The '<em><b>PHYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYS_VALUE
	 * @generated
	 * @ordered
	 */
	PHYS(7, "PHYS", "PHYS"),

	/**
	 * The '<em><b>PST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PST_VALUE
	 * @generated
	 * @ordered
	 */
	PST(8, "PST", "PST"),

	/**
	 * The '<em><b>PUB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUB_VALUE
	 * @generated
	 * @ordered
	 */
	PUB(9, "PUB", "PUB"),

	/**
	 * The '<em><b>SYL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYL_VALUE
	 * @generated
	 * @ordered
	 */
	SYL(10, "SYL", "SYL"),

	/**
	 * The '<em><b>TMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TMP_VALUE
	 * @generated
	 * @ordered
	 */
	TMP(11, "TMP", "TMP"),

	/**
	 * The '<em><b>WP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WP_VALUE
	 * @generated
	 * @ordered
	 */
	WP(12, "WP", "WP");

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
	public static final int ABC_VALUE = 0;

	/**
	 * The '<em><b>BAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAD_VALUE = 1;

	/**
	 * The '<em><b>DIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIR_VALUE = 2;

	/**
	 * The '<em><b>H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>H</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #H
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H_VALUE = 3;

	/**
	 * The '<em><b>HP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HP_VALUE = 4;

	/**
	 * The '<em><b>HV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HV_VALUE = 5;

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
	public static final int IDE_VALUE = 6;

	/**
	 * The '<em><b>PHYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHYS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHYS_VALUE = 7;

	/**
	 * The '<em><b>PST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PST_VALUE = 8;

	/**
	 * The '<em><b>PUB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PUB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUB_VALUE = 9;

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
	public static final int SYL_VALUE = 10;

	/**
	 * The '<em><b>TMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TMP_VALUE = 11;

	/**
	 * The '<em><b>WP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WP_VALUE = 12;

	/**
	 * An array of all the '<em><b>Postal Address Use</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PostalAddressUse[] VALUES_ARRAY =
		new PostalAddressUse[] {
			ABC,
			BAD,
			DIR,
			H,
			HP,
			HV,
			IDE,
			PHYS,
			PST,
			PUB,
			SYL,
			TMP,
			WP,
		};

	/**
	 * A public read-only list of all the '<em><b>Postal Address Use</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PostalAddressUse> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Postal Address Use</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PostalAddressUse get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostalAddressUse result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Postal Address Use</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PostalAddressUse getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PostalAddressUse result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Postal Address Use</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PostalAddressUse get(int value) {
		switch (value) {
			case ABC_VALUE: return ABC;
			case BAD_VALUE: return BAD;
			case DIR_VALUE: return DIR;
			case H_VALUE: return H;
			case HP_VALUE: return HP;
			case HV_VALUE: return HV;
			case IDE_VALUE: return IDE;
			case PHYS_VALUE: return PHYS;
			case PST_VALUE: return PST;
			case PUB_VALUE: return PUB;
			case SYL_VALUE: return SYL;
			case TMP_VALUE: return TMP;
			case WP_VALUE: return WP;
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
	private PostalAddressUse(int value, String name, String literal) {
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
	
} //PostalAddressUse
