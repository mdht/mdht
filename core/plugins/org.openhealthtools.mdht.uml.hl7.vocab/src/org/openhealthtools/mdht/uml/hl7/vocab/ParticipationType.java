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
 * A representation of the literals of the enumeration '<em><b>Participation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getParticipationType()
 * @model
 * @generated
 */
public enum ParticipationType implements Enumerator {
	/**
	 * The '<em><b>ADM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADM_VALUE
	 * @generated
	 * @ordered
	 */
	ADM(0, "ADM", "ADM"),

	/**
	 * The '<em><b>ATND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATND_VALUE
	 * @generated
	 * @ordered
	 */
	ATND(1, "ATND", "ATND"),

	/**
	 * The '<em><b>AUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUT_VALUE
	 * @generated
	 * @ordered
	 */
	AUT(2, "AUT", "AUT"),

	/**
	 * The '<em><b>AUTHEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHEN_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHEN(3, "AUTHEN", "AUTHEN"),

	/**
	 * The '<em><b>BBY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BBY_VALUE
	 * @generated
	 * @ordered
	 */
	BBY(4, "BBY", "BBY"),

	/**
	 * The '<em><b>BEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEN_VALUE
	 * @generated
	 * @ordered
	 */
	BEN(5, "BEN", "BEN"),

	/**
	 * The '<em><b>CALLBCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALLBCK_VALUE
	 * @generated
	 * @ordered
	 */
	CALLBCK(6, "CALLBCK", "CALLBCK"),

	/**
	 * The '<em><b>CON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CON_VALUE
	 * @generated
	 * @ordered
	 */
	CON(7, "CON", "CON"),

	/**
	 * The '<em><b>COV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COV_VALUE
	 * @generated
	 * @ordered
	 */
	COV(8, "COV", "COV"),

	/**
	 * The '<em><b>CSM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSM_VALUE
	 * @generated
	 * @ordered
	 */
	CSM(9, "CSM", "CSM"),

	/**
	 * The '<em><b>CST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CST_VALUE
	 * @generated
	 * @ordered
	 */
	CST(10, "CST", "CST"),

	/**
	 * The '<em><b>DEV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEV_VALUE
	 * @generated
	 * @ordered
	 */
	DEV(11, "DEV", "DEV"),

	/**
	 * The '<em><b>DIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIR_VALUE
	 * @generated
	 * @ordered
	 */
	DIR(12, "DIR", "DIR"),

	/**
	 * The '<em><b>DIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIS_VALUE
	 * @generated
	 * @ordered
	 */
	DIS(13, "DIS", "DIS"),

	/**
	 * The '<em><b>DIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIST_VALUE
	 * @generated
	 * @ordered
	 */
	DIST(14, "DIST", "DIST"),

	/**
	 * The '<em><b>DON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DON_VALUE
	 * @generated
	 * @ordered
	 */
	DON(15, "DON", "DON"),

	/**
	 * The '<em><b>DST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DST_VALUE
	 * @generated
	 * @ordered
	 */
	DST(16, "DST", "DST"),

	/**
	 * The '<em><b>ELOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELOC_VALUE
	 * @generated
	 * @ordered
	 */
	ELOC(17, "ELOC", "ELOC"),

	/**
	 * The '<em><b>ENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENT_VALUE
	 * @generated
	 * @ordered
	 */
	ENT(18, "ENT", "ENT"),

	/**
	 * The '<em><b>ESC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESC_VALUE
	 * @generated
	 * @ordered
	 */
	ESC(19, "ESC", "ESC"),

	/**
	 * The '<em><b>HLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HLD_VALUE
	 * @generated
	 * @ordered
	 */
	HLD(20, "HLD", "HLD"),

	/**
	 * The '<em><b>IND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IND_VALUE
	 * @generated
	 * @ordered
	 */
	IND(21, "IND", "IND"),

	/**
	 * The '<em><b>INF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF_VALUE
	 * @generated
	 * @ordered
	 */
	INF(22, "INF", "INF"),

	/**
	 * The '<em><b>IRCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRCP_VALUE
	 * @generated
	 * @ordered
	 */
	IRCP(23, "IRCP", "IRCP"),

	/**
	 * The '<em><b>LA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA_VALUE
	 * @generated
	 * @ordered
	 */
	LA(24, "LA", "LA"),

	/**
	 * The '<em><b>LOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOC_VALUE
	 * @generated
	 * @ordered
	 */
	LOC(25, "LOC", "LOC"),

	/**
	 * The '<em><b>NOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT(26, "NOT", "NOT"),

	/**
	 * The '<em><b>NRD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NRD_VALUE
	 * @generated
	 * @ordered
	 */
	NRD(27, "NRD", "NRD"),

	/**
	 * The '<em><b>ORG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORG_VALUE
	 * @generated
	 * @ordered
	 */
	ORG(28, "ORG", "ORG"),

	/**
	 * The '<em><b>PPRF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPRF_VALUE
	 * @generated
	 * @ordered
	 */
	PPRF(29, "PPRF", "PPRF"),

	/**
	 * The '<em><b>PRCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRCP_VALUE
	 * @generated
	 * @ordered
	 */
	PRCP(30, "PRCP", "PRCP"),

	/**
	 * The '<em><b>PRD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRD_VALUE
	 * @generated
	 * @ordered
	 */
	PRD(31, "PRD", "PRD"),

	/**
	 * The '<em><b>PRF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRF_VALUE
	 * @generated
	 * @ordered
	 */
	PRF(32, "PRF", "PRF"),

	/**
	 * The '<em><b>RCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RCT_VALUE
	 * @generated
	 * @ordered
	 */
	RCT(33, "RCT", "RCT"),

	/**
	 * The '<em><b>RCV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RCV_VALUE
	 * @generated
	 * @ordered
	 */
	RCV(34, "RCV", "RCV"),

	/**
	 * The '<em><b>RDV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RDV_VALUE
	 * @generated
	 * @ordered
	 */
	RDV(35, "RDV", "RDV"),

	/**
	 * The '<em><b>REF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REF_VALUE
	 * @generated
	 * @ordered
	 */
	REF(36, "REF", "REF"),

	/**
	 * The '<em><b>REFB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFB_VALUE
	 * @generated
	 * @ordered
	 */
	REFB(37, "REFB", "REFB"),

	/**
	 * The '<em><b>REFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFT_VALUE
	 * @generated
	 * @ordered
	 */
	REFT(38, "REFT", "REFT"),

	/**
	 * The '<em><b>RESP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESP_VALUE
	 * @generated
	 * @ordered
	 */
	RESP(39, "RESP", "RESP"),

	/**
	 * The '<em><b>RML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RML_VALUE
	 * @generated
	 * @ordered
	 */
	RML(40, "RML", "RML"),

	/**
	 * The '<em><b>SBJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SBJ_VALUE
	 * @generated
	 * @ordered
	 */
	SBJ(41, "SBJ", "SBJ"),

	/**
	 * The '<em><b>SPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPC_VALUE
	 * @generated
	 * @ordered
	 */
	SPC(42, "SPC", "SPC"),

	/**
	 * The '<em><b>SPRF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRF_VALUE
	 * @generated
	 * @ordered
	 */
	SPRF(43, "SPRF", "SPRF"),

	/**
	 * The '<em><b>TRC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRC_VALUE
	 * @generated
	 * @ordered
	 */
	TRC(44, "TRC", "TRC"),

	/**
	 * The '<em><b>VIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIA_VALUE
	 * @generated
	 * @ordered
	 */
	VIA(45, "VIA", "VIA"),

	/**
	 * The '<em><b>VRF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VRF_VALUE
	 * @generated
	 * @ordered
	 */
	VRF(46, "VRF", "VRF"),

	/**
	 * The '<em><b>WIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIT_VALUE
	 * @generated
	 * @ordered
	 */
	WIT(47, "WIT", "WIT");

	/**
	 * The '<em><b>ADM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADM_VALUE = 0;

	/**
	 * The '<em><b>ATND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ATND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATND_VALUE = 1;

	/**
	 * The '<em><b>AUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUT_VALUE = 2;

	/**
	 * The '<em><b>AUTHEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTHEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTHEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTHEN_VALUE = 3;

	/**
	 * The '<em><b>BBY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BBY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BBY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BBY_VALUE = 4;

	/**
	 * The '<em><b>BEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEN_VALUE = 5;

	/**
	 * The '<em><b>CALLBCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CALLBCK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CALLBCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CALLBCK_VALUE = 6;

	/**
	 * The '<em><b>CON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CON_VALUE = 7;

	/**
	 * The '<em><b>COV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COV_VALUE = 8;

	/**
	 * The '<em><b>CSM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CSM_VALUE = 9;

	/**
	 * The '<em><b>CST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CST_VALUE = 10;

	/**
	 * The '<em><b>DEV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEV_VALUE = 11;

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
	public static final int DIR_VALUE = 12;

	/**
	 * The '<em><b>DIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIS_VALUE = 13;

	/**
	 * The '<em><b>DIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIST_VALUE = 14;

	/**
	 * The '<em><b>DON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DON_VALUE = 15;

	/**
	 * The '<em><b>DST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DST_VALUE = 16;

	/**
	 * The '<em><b>ELOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELOC_VALUE = 17;

	/**
	 * The '<em><b>ENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENT_VALUE = 18;

	/**
	 * The '<em><b>ESC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESC_VALUE = 19;

	/**
	 * The '<em><b>HLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HLD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HLD_VALUE = 20;

	/**
	 * The '<em><b>IND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IND_VALUE = 21;

	/**
	 * The '<em><b>INF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INF_VALUE = 22;

	/**
	 * The '<em><b>IRCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IRCP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRCP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IRCP_VALUE = 23;

	/**
	 * The '<em><b>LA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LA_VALUE = 24;

	/**
	 * The '<em><b>LOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOC_VALUE = 25;

	/**
	 * The '<em><b>NOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_VALUE = 26;

	/**
	 * The '<em><b>NRD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NRD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NRD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NRD_VALUE = 27;

	/**
	 * The '<em><b>ORG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORG_VALUE = 28;

	/**
	 * The '<em><b>PPRF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PPRF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PPRF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PPRF_VALUE = 29;

	/**
	 * The '<em><b>PRCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRCP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRCP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRCP_VALUE = 30;

	/**
	 * The '<em><b>PRD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRD_VALUE = 31;

	/**
	 * The '<em><b>PRF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRF_VALUE = 32;

	/**
	 * The '<em><b>RCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RCT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RCT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RCT_VALUE = 33;

	/**
	 * The '<em><b>RCV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RCV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RCV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RCV_VALUE = 34;

	/**
	 * The '<em><b>RDV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RDV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RDV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RDV_VALUE = 35;

	/**
	 * The '<em><b>REF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REF_VALUE = 36;

	/**
	 * The '<em><b>REFB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFB_VALUE = 37;

	/**
	 * The '<em><b>REFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFT_VALUE = 38;

	/**
	 * The '<em><b>RESP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESP_VALUE = 39;

	/**
	 * The '<em><b>RML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RML</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RML
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RML_VALUE = 40;

	/**
	 * The '<em><b>SBJ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SBJ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SBJ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SBJ_VALUE = 41;

	/**
	 * The '<em><b>SPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPC_VALUE = 42;

	/**
	 * The '<em><b>SPRF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPRF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPRF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPRF_VALUE = 43;

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
	public static final int TRC_VALUE = 44;

	/**
	 * The '<em><b>VIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIA_VALUE = 45;

	/**
	 * The '<em><b>VRF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VRF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VRF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VRF_VALUE = 46;

	/**
	 * The '<em><b>WIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIT_VALUE = 47;

	/**
	 * An array of all the '<em><b>Participation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParticipationType[] VALUES_ARRAY =
		new ParticipationType[] {
			ADM,
			ATND,
			AUT,
			AUTHEN,
			BBY,
			BEN,
			CALLBCK,
			CON,
			COV,
			CSM,
			CST,
			DEV,
			DIR,
			DIS,
			DIST,
			DON,
			DST,
			ELOC,
			ENT,
			ESC,
			HLD,
			IND,
			INF,
			IRCP,
			LA,
			LOC,
			NOT,
			NRD,
			ORG,
			PPRF,
			PRCP,
			PRD,
			PRF,
			RCT,
			RCV,
			RDV,
			REF,
			REFB,
			REFT,
			RESP,
			RML,
			SBJ,
			SPC,
			SPRF,
			TRC,
			VIA,
			VRF,
			WIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Participation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParticipationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Participation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParticipationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParticipationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParticipationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParticipationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Participation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParticipationType get(int value) {
		switch (value) {
			case ADM_VALUE: return ADM;
			case ATND_VALUE: return ATND;
			case AUT_VALUE: return AUT;
			case AUTHEN_VALUE: return AUTHEN;
			case BBY_VALUE: return BBY;
			case BEN_VALUE: return BEN;
			case CALLBCK_VALUE: return CALLBCK;
			case CON_VALUE: return CON;
			case COV_VALUE: return COV;
			case CSM_VALUE: return CSM;
			case CST_VALUE: return CST;
			case DEV_VALUE: return DEV;
			case DIR_VALUE: return DIR;
			case DIS_VALUE: return DIS;
			case DIST_VALUE: return DIST;
			case DON_VALUE: return DON;
			case DST_VALUE: return DST;
			case ELOC_VALUE: return ELOC;
			case ENT_VALUE: return ENT;
			case ESC_VALUE: return ESC;
			case HLD_VALUE: return HLD;
			case IND_VALUE: return IND;
			case INF_VALUE: return INF;
			case IRCP_VALUE: return IRCP;
			case LA_VALUE: return LA;
			case LOC_VALUE: return LOC;
			case NOT_VALUE: return NOT;
			case NRD_VALUE: return NRD;
			case ORG_VALUE: return ORG;
			case PPRF_VALUE: return PPRF;
			case PRCP_VALUE: return PRCP;
			case PRD_VALUE: return PRD;
			case PRF_VALUE: return PRF;
			case RCT_VALUE: return RCT;
			case RCV_VALUE: return RCV;
			case RDV_VALUE: return RDV;
			case REF_VALUE: return REF;
			case REFB_VALUE: return REFB;
			case REFT_VALUE: return REFT;
			case RESP_VALUE: return RESP;
			case RML_VALUE: return RML;
			case SBJ_VALUE: return SBJ;
			case SPC_VALUE: return SPC;
			case SPRF_VALUE: return SPRF;
			case TRC_VALUE: return TRC;
			case VIA_VALUE: return VIA;
			case VRF_VALUE: return VRF;
			case WIT_VALUE: return WIT;
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
	private ParticipationType(int value, String name, String literal) {
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
	
} //ParticipationType
