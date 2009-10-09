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
 * A representation of the literals of the enumeration '<em><b>Act Mood</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getActMood()
 * @model
 * @generated
 */
public enum ActMood implements Enumerator {
	/**
	 * The '<em><b>APT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APT_VALUE
	 * @generated
	 * @ordered
	 */
	APT(0, "APT", "APT"),

	/**
	 * The '<em><b>ARQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARQ_VALUE
	 * @generated
	 * @ordered
	 */
	ARQ(1, "ARQ", "ARQ"),

	/**
	 * The '<em><b>CRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRT_VALUE
	 * @generated
	 * @ordered
	 */
	CRT(2, "CRT", "CRT"),

	/**
	 * The '<em><b>DEF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEF_VALUE
	 * @generated
	 * @ordered
	 */
	DEF(3, "DEF", "DEF"),

	/**
	 * The '<em><b>EVN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVN_VALUE
	 * @generated
	 * @ordered
	 */
	EVN(4, "EVN", "EVN"),

	/**
	 * The '<em><b>EVNCRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVNCRT_VALUE
	 * @generated
	 * @ordered
	 */
	EVNCRT(5, "EVNCRT", "EVN.CRT"),

	/**
	 * The '<em><b>EXPEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPEC_VALUE
	 * @generated
	 * @ordered
	 */
	EXPEC(6, "EXPEC", "EXPEC"),

	/**
	 * The '<em><b>GOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOL_VALUE
	 * @generated
	 * @ordered
	 */
	GOL(7, "GOL", "GOL"),

	/**
	 * The '<em><b>INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(8, "INT", "INT"),

	/**
	 * The '<em><b>OPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPT_VALUE
	 * @generated
	 * @ordered
	 */
	OPT(9, "OPT", "OPT"),

	/**
	 * The '<em><b>PERM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERM_VALUE
	 * @generated
	 * @ordered
	 */
	PERM(10, "PERM", "PERM"),

	/**
	 * The '<em><b>PERMRQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERMRQ_VALUE
	 * @generated
	 * @ordered
	 */
	PERMRQ(11, "PERMRQ", "PERMRQ"),

	/**
	 * The '<em><b>PRMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRMS_VALUE
	 * @generated
	 * @ordered
	 */
	PRMS(12, "PRMS", "PRMS"),

	/**
	 * The '<em><b>PRP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRP_VALUE
	 * @generated
	 * @ordered
	 */
	PRP(13, "PRP", "PRP"),

	/**
	 * The '<em><b>RMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RMD_VALUE
	 * @generated
	 * @ordered
	 */
	RMD(14, "RMD", "RMD"),

	/**
	 * The '<em><b>RQO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RQO_VALUE
	 * @generated
	 * @ordered
	 */
	RQO(15, "RQO", "RQO"),

	/**
	 * The '<em><b>RSK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSK_VALUE
	 * @generated
	 * @ordered
	 */
	RSK(16, "RSK", "RSK"),

	/**
	 * The '<em><b>SLOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLOT_VALUE
	 * @generated
	 * @ordered
	 */
	SLOT(17, "SLOT", "SLOT");

	/**
	 * The '<em><b>APT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APT_VALUE = 0;

	/**
	 * The '<em><b>ARQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARQ_VALUE = 1;

	/**
	 * The '<em><b>CRT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CRT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRT_VALUE = 2;

	/**
	 * The '<em><b>DEF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEF_VALUE = 3;

	/**
	 * The '<em><b>EVN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVN_VALUE = 4;

	/**
	 * The '<em><b>EVNCRT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVNCRT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVNCRT
	 * @model literal="EVN.CRT"
	 * @generated
	 * @ordered
	 */
	public static final int EVNCRT_VALUE = 5;

	/**
	 * The '<em><b>EXPEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPEC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPEC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPEC_VALUE = 6;

	/**
	 * The '<em><b>GOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GOL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOL_VALUE = 7;

	/**
	 * The '<em><b>INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 8;

	/**
	 * The '<em><b>OPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPT_VALUE = 9;

	/**
	 * The '<em><b>PERM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERM_VALUE = 10;

	/**
	 * The '<em><b>PERMRQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERMRQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERMRQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERMRQ_VALUE = 11;

	/**
	 * The '<em><b>PRMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRMS_VALUE = 12;

	/**
	 * The '<em><b>PRP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRP_VALUE = 13;

	/**
	 * The '<em><b>RMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RMD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RMD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RMD_VALUE = 14;

	/**
	 * The '<em><b>RQO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RQO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RQO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RQO_VALUE = 15;

	/**
	 * The '<em><b>RSK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RSK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RSK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RSK_VALUE = 16;

	/**
	 * The '<em><b>SLOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SLOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SLOT_VALUE = 17;

	/**
	 * An array of all the '<em><b>Act Mood</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActMood[] VALUES_ARRAY =
		new ActMood[] {
			APT,
			ARQ,
			CRT,
			DEF,
			EVN,
			EVNCRT,
			EXPEC,
			GOL,
			INT,
			OPT,
			PERM,
			PERMRQ,
			PRMS,
			PRP,
			RMD,
			RQO,
			RSK,
			SLOT,
		};

	/**
	 * A public read-only list of all the '<em><b>Act Mood</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActMood> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Act Mood</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActMood get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActMood result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Act Mood</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActMood getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActMood result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Act Mood</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActMood get(int value) {
		switch (value) {
			case APT_VALUE: return APT;
			case ARQ_VALUE: return ARQ;
			case CRT_VALUE: return CRT;
			case DEF_VALUE: return DEF;
			case EVN_VALUE: return EVN;
			case EVNCRT_VALUE: return EVNCRT;
			case EXPEC_VALUE: return EXPEC;
			case GOL_VALUE: return GOL;
			case INT_VALUE: return INT;
			case OPT_VALUE: return OPT;
			case PERM_VALUE: return PERM;
			case PERMRQ_VALUE: return PERMRQ;
			case PRMS_VALUE: return PRMS;
			case PRP_VALUE: return PRP;
			case RMD_VALUE: return RMD;
			case RQO_VALUE: return RQO;
			case RSK_VALUE: return RSK;
			case SLOT_VALUE: return SLOT;
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
	private ActMood(int value, String name, String literal) {
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
	
} //ActMood
