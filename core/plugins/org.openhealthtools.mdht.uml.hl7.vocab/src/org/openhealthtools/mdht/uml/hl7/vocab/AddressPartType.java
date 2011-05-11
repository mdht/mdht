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
 * A representation of the literals of the enumeration '<em><b>Address Part Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getAddressPartType()
 * @model
 * @generated
 */
public enum AddressPartType implements Enumerator {
	/**
	 * The '<em><b>ADL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADL_VALUE
	 * @generated
	 * @ordered
	 */
	ADL(0, "ADL", "ADL"),

	/**
	 * The '<em><b>BNN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BNN_VALUE
	 * @generated
	 * @ordered
	 */
	BNN(1, "BNN", "BNN"),

	/**
	 * The '<em><b>BNR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BNR_VALUE
	 * @generated
	 * @ordered
	 */
	BNR(2, "BNR", "BNR"),

	/**
	 * The '<em><b>BNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BNS_VALUE
	 * @generated
	 * @ordered
	 */
	BNS(3, "BNS", "BNS"),

	/**
	 * The '<em><b>CAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_VALUE
	 * @generated
	 * @ordered
	 */
	CAR(4, "CAR", "CAR"),

	/**
	 * The '<em><b>CEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEN_VALUE
	 * @generated
	 * @ordered
	 */
	CEN(5, "CEN", "CEN"),

	/**
	 * The '<em><b>CNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CNT_VALUE
	 * @generated
	 * @ordered
	 */
	CNT(6, "CNT", "CNT"),

	/**
	 * The '<em><b>CPA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPA_VALUE
	 * @generated
	 * @ordered
	 */
	CPA(7, "CPA", "CPA"),

	/**
	 * The '<em><b>CTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTY_VALUE
	 * @generated
	 * @ordered
	 */
	CTY(8, "CTY", "CTY"),

	/**
	 * The '<em><b>DAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAL_VALUE
	 * @generated
	 * @ordered
	 */
	DAL(9, "DAL", "DAL"),

	/**
	 * The '<em><b>DEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEL_VALUE
	 * @generated
	 * @ordered
	 */
	DEL(10, "DEL", "DEL"),

	/**
	 * The '<em><b>DINST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DINST_VALUE
	 * @generated
	 * @ordered
	 */
	DINST(11, "DINST", "DINST"),

	/**
	 * The '<em><b>DINSTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DINSTA_VALUE
	 * @generated
	 * @ordered
	 */
	DINSTA(12, "DINSTA", "DINSTA"),

	/**
	 * The '<em><b>DINSTQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DINSTQ_VALUE
	 * @generated
	 * @ordered
	 */
	DINSTQ(13, "DINSTQ", "DINSTQ"),

	/**
	 * The '<em><b>DIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIR_VALUE
	 * @generated
	 * @ordered
	 */
	DIR(14, "DIR", "DIR"),

	/**
	 * The '<em><b>DMOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMOD_VALUE
	 * @generated
	 * @ordered
	 */
	DMOD(15, "DMOD", "DMOD"),

	/**
	 * The '<em><b>DMODID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMODID_VALUE
	 * @generated
	 * @ordered
	 */
	DMODID(16, "DMODID", "DMODID"),

	/**
	 * The '<em><b>POB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POB_VALUE
	 * @generated
	 * @ordered
	 */
	POB(17, "POB", "POB"),

	/**
	 * The '<em><b>PRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_VALUE
	 * @generated
	 * @ordered
	 */
	PRE(18, "PRE", "PRE"),

	/**
	 * The '<em><b>SAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAL_VALUE
	 * @generated
	 * @ordered
	 */
	SAL(19, "SAL", "SAL"),

	/**
	 * The '<em><b>STA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STA_VALUE
	 * @generated
	 * @ordered
	 */
	STA(20, "STA", "STA"),

	/**
	 * The '<em><b>STB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STB_VALUE
	 * @generated
	 * @ordered
	 */
	STB(21, "STB", "STB"),

	/**
	 * The '<em><b>STR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STR_VALUE
	 * @generated
	 * @ordered
	 */
	STR(22, "STR", "STR"),

	/**
	 * The '<em><b>STTYP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STTYP_VALUE
	 * @generated
	 * @ordered
	 */
	STTYP(23, "STTYP", "STTYP"),

	/**
	 * The '<em><b>UNID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNID_VALUE
	 * @generated
	 * @ordered
	 */
	UNID(24, "UNID", "UNID"),

	/**
	 * The '<em><b>UNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT(25, "UNIT", "UNIT"),

	/**
	 * The '<em><b>ZIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZIP_VALUE
	 * @generated
	 * @ordered
	 */
	ZIP(26, "ZIP", "ZIP");

	/**
	 * The '<em><b>ADL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADL_VALUE = 0;

	/**
	 * The '<em><b>BNN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BNN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BNN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BNN_VALUE = 1;

	/**
	 * The '<em><b>BNR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BNR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BNR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BNR_VALUE = 2;

	/**
	 * The '<em><b>BNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BNS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BNS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BNS_VALUE = 3;

	/**
	 * The '<em><b>CAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAR_VALUE = 4;

	/**
	 * The '<em><b>CEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CEN_VALUE = 5;

	/**
	 * The '<em><b>CNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CNT_VALUE = 6;

	/**
	 * The '<em><b>CPA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CPA_VALUE = 7;

	/**
	 * The '<em><b>CTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CTY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CTY_VALUE = 8;

	/**
	 * The '<em><b>DAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAL_VALUE = 9;

	/**
	 * The '<em><b>DEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEL_VALUE = 10;

	/**
	 * The '<em><b>DINST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DINST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DINST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DINST_VALUE = 11;

	/**
	 * The '<em><b>DINSTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DINSTA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DINSTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DINSTA_VALUE = 12;

	/**
	 * The '<em><b>DINSTQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DINSTQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DINSTQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DINSTQ_VALUE = 13;

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
	public static final int DIR_VALUE = 14;

	/**
	 * The '<em><b>DMOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DMOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DMOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DMOD_VALUE = 15;

	/**
	 * The '<em><b>DMODID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DMODID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DMODID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DMODID_VALUE = 16;

	/**
	 * The '<em><b>POB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POB_VALUE = 17;

	/**
	 * The '<em><b>PRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRE_VALUE = 18;

	/**
	 * The '<em><b>SAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAL_VALUE = 19;

	/**
	 * The '<em><b>STA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STA_VALUE = 20;

	/**
	 * The '<em><b>STB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STB_VALUE = 21;

	/**
	 * The '<em><b>STR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STR_VALUE = 22;

	/**
	 * The '<em><b>STTYP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STTYP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STTYP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STTYP_VALUE = 23;

	/**
	 * The '<em><b>UNID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNID_VALUE = 24;

	/**
	 * The '<em><b>UNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_VALUE = 25;

	/**
	 * The '<em><b>ZIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZIP_VALUE = 26;

	/**
	 * An array of all the '<em><b>Address Part Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AddressPartType[] VALUES_ARRAY =
		new AddressPartType[] {
			ADL,
			BNN,
			BNR,
			BNS,
			CAR,
			CEN,
			CNT,
			CPA,
			CTY,
			DAL,
			DEL,
			DINST,
			DINSTA,
			DINSTQ,
			DIR,
			DMOD,
			DMODID,
			POB,
			PRE,
			SAL,
			STA,
			STB,
			STR,
			STTYP,
			UNID,
			UNIT,
			ZIP,
		};

	/**
	 * A public read-only list of all the '<em><b>Address Part Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AddressPartType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Address Part Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AddressPartType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddressPartType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Address Part Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AddressPartType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddressPartType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Address Part Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AddressPartType get(int value) {
		switch (value) {
			case ADL_VALUE: return ADL;
			case BNN_VALUE: return BNN;
			case BNR_VALUE: return BNR;
			case BNS_VALUE: return BNS;
			case CAR_VALUE: return CAR;
			case CEN_VALUE: return CEN;
			case CNT_VALUE: return CNT;
			case CPA_VALUE: return CPA;
			case CTY_VALUE: return CTY;
			case DAL_VALUE: return DAL;
			case DEL_VALUE: return DEL;
			case DINST_VALUE: return DINST;
			case DINSTA_VALUE: return DINSTA;
			case DINSTQ_VALUE: return DINSTQ;
			case DIR_VALUE: return DIR;
			case DMOD_VALUE: return DMOD;
			case DMODID_VALUE: return DMODID;
			case POB_VALUE: return POB;
			case PRE_VALUE: return PRE;
			case SAL_VALUE: return SAL;
			case STA_VALUE: return STA;
			case STB_VALUE: return STB;
			case STR_VALUE: return STR;
			case STTYP_VALUE: return STTYP;
			case UNID_VALUE: return UNID;
			case UNIT_VALUE: return UNIT;
			case ZIP_VALUE: return ZIP;
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
	private AddressPartType(int value, String name, String literal) {
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
	
} //AddressPartType
