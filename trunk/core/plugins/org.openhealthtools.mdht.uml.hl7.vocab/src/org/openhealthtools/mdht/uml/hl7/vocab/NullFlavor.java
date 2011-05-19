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
 * A representation of the literals of the enumeration '<em><b>Null Flavor</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getNullFlavor()
 * @model
 * @generated
 */
public enum NullFlavor implements Enumerator {
	/**
	 * The '<em><b>ASKU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASKU_VALUE
	 * @generated
	 * @ordered
	 */
	ASKU(0, "ASKU", "ASKU"),

	/**
	 * The '<em><b>MSK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSK_VALUE
	 * @generated
	 * @ordered
	 */
	MSK(1, "MSK", "MSK"),

	/**
	 * The '<em><b>NA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA_VALUE
	 * @generated
	 * @ordered
	 */
	NA(2, "NA", "NA"),

	/**
	 * The '<em><b>NASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NASK_VALUE
	 * @generated
	 * @ordered
	 */
	NASK(3, "NASK", "NASK"),

	/**
	 * The '<em><b>NAV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAV_VALUE
	 * @generated
	 * @ordered
	 */
	NAV(4, "NAV", "NAV"),

	/**
	 * The '<em><b>NI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NI_VALUE
	 * @generated
	 * @ordered
	 */
	NI(5, "NI", "NI"),

	/**
	 * The '<em><b>NINF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NINF_VALUE
	 * @generated
	 * @ordered
	 */
	NINF(6, "NINF", "NINF"),

	/**
	 * The '<em><b>OTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTH_VALUE
	 * @generated
	 * @ordered
	 */
	OTH(7, "OTH", "OTH"),

	/**
	 * The '<em><b>PINF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINF_VALUE
	 * @generated
	 * @ordered
	 */
	PINF(8, "PINF", "PINF"),

	/**
	 * The '<em><b>TRC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRC_VALUE
	 * @generated
	 * @ordered
	 */
	TRC(9, "TRC", "TRC"),

	/**
	 * The '<em><b>UNK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNK_VALUE
	 * @generated
	 * @ordered
	 */
	UNK(10, "UNK", "UNK"), /**
							* The '<em><b>NP</b></em>' literal object.
							* <!-- begin-user-doc -->
							* <!-- end-user-doc -->
							* @see #NP_VALUE
							* @generated
							* @ordered
							*/
	NP(11, "NP", "NP");

	/**
	 * The '<em><b>ASKU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASKU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASKU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASKU_VALUE = 0;

	/**
	 * The '<em><b>MSK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MSK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MSK_VALUE = 1;

	/**
	 * The '<em><b>NA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NA_VALUE = 2;

	/**
	 * The '<em><b>NASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NASK_VALUE = 3;

	/**
	 * The '<em><b>NAV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAV_VALUE = 4;

	/**
	 * The '<em><b>NI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NI_VALUE = 5;

	/**
	 * The '<em><b>NINF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NINF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NINF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NINF_VALUE = 6;

	/**
	 * The '<em><b>OTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTH_VALUE = 7;

	/**
	 * The '<em><b>PINF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PINF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PINF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PINF_VALUE = 8;

	/**
	 * The '<em><b>TRC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRC_VALUE = 9;

	/**
	 * The '<em><b>UNK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNK_VALUE = 10;

	/**
	 * The '<em><b>NP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NP_VALUE = 11;

	/**
	 * An array of all the '<em><b>Null Flavor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NullFlavor[] VALUES_ARRAY = new NullFlavor[] {
			ASKU, MSK, NA, NASK, NAV, NI, NINF, OTH, PINF, TRC, UNK, NP, };

	/**
	 * A public read-only list of all the '<em><b>Null Flavor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NullFlavor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Null Flavor</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NullFlavor get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NullFlavor result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Null Flavor</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NullFlavor getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NullFlavor result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Null Flavor</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NullFlavor get(int value) {
		switch (value) {
			case ASKU_VALUE:
				return ASKU;
			case MSK_VALUE:
				return MSK;
			case NA_VALUE:
				return NA;
			case NASK_VALUE:
				return NASK;
			case NAV_VALUE:
				return NAV;
			case NI_VALUE:
				return NI;
			case NINF_VALUE:
				return NINF;
			case OTH_VALUE:
				return OTH;
			case PINF_VALUE:
				return PINF;
			case TRC_VALUE:
				return TRC;
			case UNK_VALUE:
				return UNK;
			case NP_VALUE:
				return NP;
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
	private NullFlavor(int value, String name, String literal) {
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

} // NullFlavor
