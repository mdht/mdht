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
 * A representation of the literals of the enumeration '<em><b>Act Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.vocab.VocabPackage#getActRelationshipType()
 * @model
 * @generated
 */
public enum ActRelationshipType implements Enumerator {
	/**
	 * The '<em><b>APND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APND_VALUE
	 * @generated
	 * @ordered
	 */
	APND(0, "APND", "APND"),

	/**
	 * The '<em><b>ARR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARR_VALUE
	 * @generated
	 * @ordered
	 */
	ARR(1, "ARR", "ARR"),

	/**
	 * The '<em><b>AUTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH(2, "AUTH", "AUTH"),

	/**
	 * The '<em><b>BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCK(3, "BLOCK", "BLOCK"),

	/**
	 * The '<em><b>CAUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAUS_VALUE
	 * @generated
	 * @ordered
	 */
	CAUS(4, "CAUS", "CAUS"),

	/**
	 * The '<em><b>CHRG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHRG_VALUE
	 * @generated
	 * @ordered
	 */
	CHRG(5, "CHRG", "CHRG"),

	/**
	 * The '<em><b>CIND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIND_VALUE
	 * @generated
	 * @ordered
	 */
	CIND(6, "CIND", "CIND"),

	/**
	 * The '<em><b>COMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMP_VALUE
	 * @generated
	 * @ordered
	 */
	COMP(7, "COMP", "COMP"),

	/**
	 * The '<em><b>COST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COST_VALUE
	 * @generated
	 * @ordered
	 */
	COST(8, "COST", "COST"),

	/**
	 * The '<em><b>COVBY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVBY_VALUE
	 * @generated
	 * @ordered
	 */
	COVBY(9, "COVBY", "COVBY"),

	/**
	 * The '<em><b>CREDIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDIT_VALUE
	 * @generated
	 * @ordered
	 */
	CREDIT(10, "CREDIT", "CREDIT"),

	/**
	 * The '<em><b>CTRLV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTRLV_VALUE
	 * @generated
	 * @ordered
	 */
	CTRLV(11, "CTRLV", "CTRLV"),

	/**
	 * The '<em><b>CURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURE_VALUE
	 * @generated
	 * @ordered
	 */
	CURE(12, "CURE", "CURE"),

	/**
	 * The '<em><b>CUREADJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUREADJ_VALUE
	 * @generated
	 * @ordered
	 */
	CUREADJ(13, "CUREADJ", "CUREADJ"),

	/**
	 * The '<em><b>DEBIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIT_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIT(14, "DEBIT", "DEBIT"),

	/**
	 * The '<em><b>DEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEP_VALUE
	 * @generated
	 * @ordered
	 */
	DEP(15, "DEP", "DEP"),

	/**
	 * The '<em><b>DIAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAG_VALUE
	 * @generated
	 * @ordered
	 */
	DIAG(16, "DIAG", "DIAG"),

	/**
	 * The '<em><b>DOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOC_VALUE
	 * @generated
	 * @ordered
	 */
	DOC(17, "DOC", "DOC"),

	/**
	 * The '<em><b>DRIV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRIV_VALUE
	 * @generated
	 * @ordered
	 */
	DRIV(18, "DRIV", "DRIV"),

	/**
	 * The '<em><b>ELNK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELNK_VALUE
	 * @generated
	 * @ordered
	 */
	ELNK(19, "ELNK", "ELNK"),

	/**
	 * The '<em><b>EVID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVID_VALUE
	 * @generated
	 * @ordered
	 */
	EVID(20, "EVID", "EVID"),

	/**
	 * The '<em><b>EXPL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPL_VALUE
	 * @generated
	 * @ordered
	 */
	EXPL(21, "EXPL", "EXPL"),

	/**
	 * The '<em><b>FLFS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLFS_VALUE
	 * @generated
	 * @ordered
	 */
	FLFS(22, "FLFS", "FLFS"),

	/**
	 * The '<em><b>GEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEN_VALUE
	 * @generated
	 * @ordered
	 */
	GEN(23, "GEN", "GEN"),

	/**
	 * The '<em><b>GEVL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEVL_VALUE
	 * @generated
	 * @ordered
	 */
	GEVL(24, "GEVL", "GEVL"),

	/**
	 * The '<em><b>GOAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL(25, "GOAL", "GOAL"),

	/**
	 * The '<em><b>INST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INST_VALUE
	 * @generated
	 * @ordered
	 */
	INST(26, "INST", "INST"),

	/**
	 * The '<em><b>ITEMSLOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEMSLOC_VALUE
	 * @generated
	 * @ordered
	 */
	ITEMSLOC(27, "ITEMSLOC", "ITEMSLOC"),

	/**
	 * The '<em><b>LIMIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMIT_VALUE
	 * @generated
	 * @ordered
	 */
	LIMIT(28, "LIMIT", "LIMIT"),

	/**
	 * The '<em><b>MFST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MFST_VALUE
	 * @generated
	 * @ordered
	 */
	MFST(29, "MFST", "MFST"),

	/**
	 * The '<em><b>MITGT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITGT_VALUE
	 * @generated
	 * @ordered
	 */
	MITGT(30, "MITGT", "MITGT"),

	/**
	 * The '<em><b>MOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD_VALUE
	 * @generated
	 * @ordered
	 */
	MOD(31, "MOD", "MOD"),

	/**
	 * The '<em><b>MTCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTCH_VALUE
	 * @generated
	 * @ordered
	 */
	MTCH(32, "MTCH", "MTCH"),

	/**
	 * The '<em><b>MTGTADJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTGTADJ_VALUE
	 * @generated
	 * @ordered
	 */
	MTGTADJ(33, "MTGTADJ", "MTGTADJ"),

	/**
	 * The '<em><b>NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(34, "NAME", "NAME"),

	/**
	 * The '<em><b>OBJC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJC_VALUE
	 * @generated
	 * @ordered
	 */
	OBJC(35, "OBJC", "OBJC"),

	/**
	 * The '<em><b>OBJF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJF_VALUE
	 * @generated
	 * @ordered
	 */
	OBJF(36, "OBJF", "OBJF"),

	/**
	 * The '<em><b>OCCR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCR_VALUE
	 * @generated
	 * @ordered
	 */
	OCCR(37, "OCCR", "OCCR"),

	/**
	 * The '<em><b>OPTN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTN_VALUE
	 * @generated
	 * @ordered
	 */
	OPTN(38, "OPTN", "OPTN"),

	/**
	 * The '<em><b>OREF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OREF_VALUE
	 * @generated
	 * @ordered
	 */
	OREF(39, "OREF", "OREF"),

	/**
	 * The '<em><b>OUTC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTC_VALUE
	 * @generated
	 * @ordered
	 */
	OUTC(40, "OUTC", "OUTC"),

	/**
	 * The '<em><b>PERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERT_VALUE
	 * @generated
	 * @ordered
	 */
	PERT(41, "PERT", "PERT"),

	/**
	 * The '<em><b>PRCN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRCN_VALUE
	 * @generated
	 * @ordered
	 */
	PRCN(42, "PRCN", "PRCN"),

	/**
	 * The '<em><b>PREV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREV_VALUE
	 * @generated
	 * @ordered
	 */
	PREV(43, "PREV", "PREV"),

	/**
	 * The '<em><b>RCHAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RCHAL_VALUE
	 * @generated
	 * @ordered
	 */
	RCHAL(44, "RCHAL", "RCHAL"),

	/**
	 * The '<em><b>RCVY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RCVY_VALUE
	 * @generated
	 * @ordered
	 */
	RCVY(45, "RCVY", "RCVY"),

	/**
	 * The '<em><b>REFR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFR_VALUE
	 * @generated
	 * @ordered
	 */
	REFR(46, "REFR", "REFR"),

	/**
	 * The '<em><b>REFV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFV_VALUE
	 * @generated
	 * @ordered
	 */
	REFV(47, "REFV", "REFV"),

	/**
	 * The '<em><b>REV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REV_VALUE
	 * @generated
	 * @ordered
	 */
	REV(48, "REV", "REV"),

	/**
	 * The '<em><b>RISK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISK_VALUE
	 * @generated
	 * @ordered
	 */
	RISK(49, "RISK", "RISK"),

	/**
	 * The '<em><b>RPLC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RPLC_VALUE
	 * @generated
	 * @ordered
	 */
	RPLC(50, "RPLC", "RPLC"),

	/**
	 * The '<em><b>RSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RSON_VALUE
	 * @generated
	 * @ordered
	 */
	RSON(51, "RSON", "RSON"),

	/**
	 * The '<em><b>SAE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAE_VALUE
	 * @generated
	 * @ordered
	 */
	SAE(52, "SAE", "SAE"),

	/**
	 * The '<em><b>SAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAS_VALUE
	 * @generated
	 * @ordered
	 */
	SAS(53, "SAS", "SAS"),

	/**
	 * The '<em><b>SCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCH_VALUE
	 * @generated
	 * @ordered
	 */
	SCH(54, "SCH", "SCH"),

	/**
	 * The '<em><b>SEQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQL_VALUE
	 * @generated
	 * @ordered
	 */
	SEQL(55, "SEQL", "SEQL"),

	/**
	 * The '<em><b>SPRT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRT_VALUE
	 * @generated
	 * @ordered
	 */
	SPRT(56, "SPRT", "SPRT"),

	/**
	 * The '<em><b>SPRTBND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPRTBND_VALUE
	 * @generated
	 * @ordered
	 */
	SPRTBND(57, "SPRTBND", "SPRTBND"),

	/**
	 * The '<em><b>SUBJ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBJ_VALUE
	 * @generated
	 * @ordered
	 */
	SUBJ(58, "SUBJ", "SUBJ"),

	/**
	 * The '<em><b>SUCC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCC_VALUE
	 * @generated
	 * @ordered
	 */
	SUCC(59, "SUCC", "SUCC"),

	/**
	 * The '<em><b>SUMM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUMM_VALUE
	 * @generated
	 * @ordered
	 */
	SUMM(60, "SUMM", "SUMM"),

	/**
	 * The '<em><b>SYMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMP_VALUE
	 * @generated
	 * @ordered
	 */
	SYMP(61, "SYMP", "SYMP"),

	/**
	 * The '<em><b>TRIG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIG_VALUE
	 * @generated
	 * @ordered
	 */
	TRIG(62, "TRIG", "TRIG"),

	/**
	 * The '<em><b>UPDT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDT_VALUE
	 * @generated
	 * @ordered
	 */
	UPDT(63, "UPDT", "UPDT"),

	/**
	 * The '<em><b>VRXCRPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VRXCRPT_VALUE
	 * @generated
	 * @ordered
	 */
	VRXCRPT(64, "VRXCRPT", "VRXCRPT"),

	/**
	 * The '<em><b>XCRPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XCRPT_VALUE
	 * @generated
	 * @ordered
	 */
	XCRPT(65, "XCRPT", "XCRPT"),

	/**
	 * The '<em><b>XFRM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XFRM_VALUE
	 * @generated
	 * @ordered
	 */
	XFRM(66, "XFRM", "XFRM");

	/**
	 * The '<em><b>APND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APND_VALUE = 0;

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
	public static final int ARR_VALUE = 1;

	/**
	 * The '<em><b>AUTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_VALUE = 2;

	/**
	 * The '<em><b>BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLOCK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLOCK_VALUE = 3;

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
	public static final int CAUS_VALUE = 4;

	/**
	 * The '<em><b>CHRG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHRG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHRG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHRG_VALUE = 5;

	/**
	 * The '<em><b>CIND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CIND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CIND_VALUE = 6;

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
	public static final int COMP_VALUE = 7;

	/**
	 * The '<em><b>COST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COST_VALUE = 8;

	/**
	 * The '<em><b>COVBY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COVBY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COVBY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COVBY_VALUE = 9;

	/**
	 * The '<em><b>CREDIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREDIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREDIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREDIT_VALUE = 10;

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
	public static final int CTRLV_VALUE = 11;

	/**
	 * The '<em><b>CURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURE_VALUE = 12;

	/**
	 * The '<em><b>CUREADJ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUREADJ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUREADJ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CUREADJ_VALUE = 13;

	/**
	 * The '<em><b>DEBIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEBIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEBIT_VALUE = 14;

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
	public static final int DEP_VALUE = 15;

	/**
	 * The '<em><b>DIAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIAG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIAG_VALUE = 16;

	/**
	 * The '<em><b>DOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOC_VALUE = 17;

	/**
	 * The '<em><b>DRIV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DRIV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRIV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRIV_VALUE = 18;

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
	public static final int ELNK_VALUE = 19;

	/**
	 * The '<em><b>EVID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVID_VALUE = 20;

	/**
	 * The '<em><b>EXPL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPL_VALUE = 21;

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
	public static final int FLFS_VALUE = 22;

	/**
	 * The '<em><b>GEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GEN_VALUE = 23;

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
	public static final int GEVL_VALUE = 24;

	/**
	 * The '<em><b>GOAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GOAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_VALUE = 25;

	/**
	 * The '<em><b>INST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INST_VALUE = 26;

	/**
	 * The '<em><b>ITEMSLOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITEMSLOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITEMSLOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITEMSLOC_VALUE = 27;

	/**
	 * The '<em><b>LIMIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIMIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIMIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIMIT_VALUE = 28;

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
	public static final int MFST_VALUE = 29;

	/**
	 * The '<em><b>MITGT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MITGT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MITGT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MITGT_VALUE = 30;

	/**
	 * The '<em><b>MOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOD_VALUE = 31;

	/**
	 * The '<em><b>MTCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MTCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MTCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MTCH_VALUE = 32;

	/**
	 * The '<em><b>MTGTADJ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MTGTADJ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MTGTADJ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MTGTADJ_VALUE = 33;

	/**
	 * The '<em><b>NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 34;

	/**
	 * The '<em><b>OBJC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OBJC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OBJC_VALUE = 35;

	/**
	 * The '<em><b>OBJF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OBJF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OBJF_VALUE = 36;

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
	public static final int OCCR_VALUE = 37;

	/**
	 * The '<em><b>OPTN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPTN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPTN_VALUE = 38;

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
	public static final int OREF_VALUE = 39;

	/**
	 * The '<em><b>OUTC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OUTC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OUTC_VALUE = 40;

	/**
	 * The '<em><b>PERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERT_VALUE = 41;

	/**
	 * The '<em><b>PRCN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRCN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRCN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRCN_VALUE = 42;

	/**
	 * The '<em><b>PREV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREV_VALUE = 43;

	/**
	 * The '<em><b>RCHAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RCHAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RCHAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RCHAL_VALUE = 44;

	/**
	 * The '<em><b>RCVY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RCVY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RCVY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RCVY_VALUE = 45;

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
	public static final int REFR_VALUE = 46;

	/**
	 * The '<em><b>REFV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFV_VALUE = 47;

	/**
	 * The '<em><b>REV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REV_VALUE = 48;

	/**
	 * The '<em><b>RISK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RISK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RISK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RISK_VALUE = 49;

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
	public static final int RPLC_VALUE = 50;

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
	public static final int RSON_VALUE = 51;

	/**
	 * The '<em><b>SAE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAE_VALUE = 52;

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
	public static final int SAS_VALUE = 53;

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
	public static final int SCH_VALUE = 54;

	/**
	 * The '<em><b>SEQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEQL_VALUE = 55;

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
	public static final int SPRT_VALUE = 56;

	/**
	 * The '<em><b>SPRTBND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPRTBND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPRTBND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPRTBND_VALUE = 57;

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
	public static final int SUBJ_VALUE = 58;

	/**
	 * The '<em><b>SUCC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUCC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUCC_VALUE = 59;

	/**
	 * The '<em><b>SUMM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUMM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUMM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUMM_VALUE = 60;

	/**
	 * The '<em><b>SYMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYMP_VALUE = 61;

	/**
	 * The '<em><b>TRIG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIG_VALUE = 62;

	/**
	 * The '<em><b>UPDT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPDT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPDT_VALUE = 63;

	/**
	 * The '<em><b>VRXCRPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VRXCRPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VRXCRPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VRXCRPT_VALUE = 64;

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
	public static final int XCRPT_VALUE = 65;

	/**
	 * The '<em><b>XFRM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XFRM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XFRM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XFRM_VALUE = 66;

	/**
	 * An array of all the '<em><b>Act Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActRelationshipType[] VALUES_ARRAY =
		new ActRelationshipType[] {
			APND,
			ARR,
			AUTH,
			BLOCK,
			CAUS,
			CHRG,
			CIND,
			COMP,
			COST,
			COVBY,
			CREDIT,
			CTRLV,
			CURE,
			CUREADJ,
			DEBIT,
			DEP,
			DIAG,
			DOC,
			DRIV,
			ELNK,
			EVID,
			EXPL,
			FLFS,
			GEN,
			GEVL,
			GOAL,
			INST,
			ITEMSLOC,
			LIMIT,
			MFST,
			MITGT,
			MOD,
			MTCH,
			MTGTADJ,
			NAME,
			OBJC,
			OBJF,
			OCCR,
			OPTN,
			OREF,
			OUTC,
			PERT,
			PRCN,
			PREV,
			RCHAL,
			RCVY,
			REFR,
			REFV,
			REV,
			RISK,
			RPLC,
			RSON,
			SAE,
			SAS,
			SCH,
			SEQL,
			SPRT,
			SPRTBND,
			SUBJ,
			SUCC,
			SUMM,
			SYMP,
			TRIG,
			UPDT,
			VRXCRPT,
			XCRPT,
			XFRM,
		};

	/**
	 * A public read-only list of all the '<em><b>Act Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActRelationshipType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Act Relationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActRelationshipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActRelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Act Relationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActRelationshipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActRelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Act Relationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActRelationshipType get(int value) {
		switch (value) {
			case APND_VALUE: return APND;
			case ARR_VALUE: return ARR;
			case AUTH_VALUE: return AUTH;
			case BLOCK_VALUE: return BLOCK;
			case CAUS_VALUE: return CAUS;
			case CHRG_VALUE: return CHRG;
			case CIND_VALUE: return CIND;
			case COMP_VALUE: return COMP;
			case COST_VALUE: return COST;
			case COVBY_VALUE: return COVBY;
			case CREDIT_VALUE: return CREDIT;
			case CTRLV_VALUE: return CTRLV;
			case CURE_VALUE: return CURE;
			case CUREADJ_VALUE: return CUREADJ;
			case DEBIT_VALUE: return DEBIT;
			case DEP_VALUE: return DEP;
			case DIAG_VALUE: return DIAG;
			case DOC_VALUE: return DOC;
			case DRIV_VALUE: return DRIV;
			case ELNK_VALUE: return ELNK;
			case EVID_VALUE: return EVID;
			case EXPL_VALUE: return EXPL;
			case FLFS_VALUE: return FLFS;
			case GEN_VALUE: return GEN;
			case GEVL_VALUE: return GEVL;
			case GOAL_VALUE: return GOAL;
			case INST_VALUE: return INST;
			case ITEMSLOC_VALUE: return ITEMSLOC;
			case LIMIT_VALUE: return LIMIT;
			case MFST_VALUE: return MFST;
			case MITGT_VALUE: return MITGT;
			case MOD_VALUE: return MOD;
			case MTCH_VALUE: return MTCH;
			case MTGTADJ_VALUE: return MTGTADJ;
			case NAME_VALUE: return NAME;
			case OBJC_VALUE: return OBJC;
			case OBJF_VALUE: return OBJF;
			case OCCR_VALUE: return OCCR;
			case OPTN_VALUE: return OPTN;
			case OREF_VALUE: return OREF;
			case OUTC_VALUE: return OUTC;
			case PERT_VALUE: return PERT;
			case PRCN_VALUE: return PRCN;
			case PREV_VALUE: return PREV;
			case RCHAL_VALUE: return RCHAL;
			case RCVY_VALUE: return RCVY;
			case REFR_VALUE: return REFR;
			case REFV_VALUE: return REFV;
			case REV_VALUE: return REV;
			case RISK_VALUE: return RISK;
			case RPLC_VALUE: return RPLC;
			case RSON_VALUE: return RSON;
			case SAE_VALUE: return SAE;
			case SAS_VALUE: return SAS;
			case SCH_VALUE: return SCH;
			case SEQL_VALUE: return SEQL;
			case SPRT_VALUE: return SPRT;
			case SPRTBND_VALUE: return SPRTBND;
			case SUBJ_VALUE: return SUBJ;
			case SUCC_VALUE: return SUCC;
			case SUMM_VALUE: return SUMM;
			case SYMP_VALUE: return SYMP;
			case TRIG_VALUE: return TRIG;
			case UPDT_VALUE: return UPDT;
			case VRXCRPT_VALUE: return VRXCRPT;
			case XCRPT_VALUE: return XCRPT;
			case XFRM_VALUE: return XFRM;
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
	private ActRelationshipType(int value, String name, String literal) {
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
	
} //ActRelationshipType
