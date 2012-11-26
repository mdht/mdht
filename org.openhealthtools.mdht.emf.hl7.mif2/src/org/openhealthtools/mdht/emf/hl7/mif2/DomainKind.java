/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Domain Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Identifies the HL7 'domain' (specific content area) to which the package content pertains
 * UML: The name for a package in the package hierarchy
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getDomainKind()
 * @model extendedMetaData="name='DomainKind'"
 * @generated
 */
public enum DomainKind implements Enumerator {
	/**
	 * The '<em><b>DD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD_VALUE
	 * @generated
	 * @ordered
	 */
	DD(0, "DD", "DD"),

	/**
	 * The '<em><b>AB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AB_VALUE
	 * @generated
	 * @ordered
	 */
	AB(1, "AB", "AB"),

	/**
	 * The '<em><b>AI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AI_VALUE
	 * @generated
	 * @ordered
	 */
	AI(2, "AI", "AI"),

	/**
	 * The '<em><b>BB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BB_VALUE
	 * @generated
	 * @ordered
	 */
	BB(3, "BB", "BB"),

	/**
	 * The '<em><b>CD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CD_VALUE
	 * @generated
	 * @ordered
	 */
	CD(4, "CD", "CD"),

	/**
	 * The '<em><b>CI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CI_VALUE
	 * @generated
	 * @ordered
	 */
	CI(5, "CI", "CI"),

	/**
	 * The '<em><b>CG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CG_VALUE
	 * @generated
	 * @ordered
	 */
	CG(6, "CG", "CG"),

	/**
	 * The '<em><b>CR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CR_VALUE
	 * @generated
	 * @ordered
	 */
	CR(7, "CR", "CR"),

	/**
	 * The '<em><b>CS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_VALUE
	 * @generated
	 * @ordered
	 */
	CS(8, "CS", "CS"),

	/**
	 * The '<em><b>CT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CT_VALUE
	 * @generated
	 * @ordered
	 */
	CT(9, "CT", "CT"),

	/**
	 * The '<em><b>DI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DI_VALUE
	 * @generated
	 * @ordered
	 */
	DI(10, "DI", "DI"),

	/**
	 * The '<em><b>DS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DS_VALUE
	 * @generated
	 * @ordered
	 */
	DS(11, "DS", "DS"),

	/**
	 * The '<em><b>II</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #II_VALUE
	 * @generated
	 * @ordered
	 */
	II(12, "II", "II"),

	/**
	 * The '<em><b>IZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IZ_VALUE
	 * @generated
	 * @ordered
	 */
	IZ(13, "IZ", "IZ"),

	/**
	 * The '<em><b>LB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LB_VALUE
	 * @generated
	 * @ordered
	 */
	LB(14, "LB", "LB"),

	/**
	 * The '<em><b>ME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ME_VALUE
	 * @generated
	 * @ordered
	 */
	ME(15, "ME", "ME"),

	/**
	 * The '<em><b>MI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MI_VALUE
	 * @generated
	 * @ordered
	 */
	MI(16, "MI", "MI"),

	/**
	 * The '<em><b>MM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MM_VALUE
	 * @generated
	 * @ordered
	 */
	MM(17, "MM", "MM"),

	/**
	 * The '<em><b>MR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MR_VALUE
	 * @generated
	 * @ordered
	 */
	MR(18, "MR", "MR"),

	/**
	 * The '<em><b>MT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MT_VALUE
	 * @generated
	 * @ordered
	 */
	MT(19, "MT", "MT"),

	/**
	 * The '<em><b>OO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OO_VALUE
	 * @generated
	 * @ordered
	 */
	OO(20, "OO", "OO"),

	/**
	 * The '<em><b>PA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PA_VALUE
	 * @generated
	 * @ordered
	 */
	PA(21, "PA", "PA"),

	/**
	 * The '<em><b>PC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PC_VALUE
	 * @generated
	 * @ordered
	 */
	PC(22, "PC", "PC"),

	/**
	 * The '<em><b>PM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PM_VALUE
	 * @generated
	 * @ordered
	 */
	PM(23, "PM", "PM"),

	/**
	 * The '<em><b>QI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QI_VALUE
	 * @generated
	 * @ordered
	 */
	QI(24, "QI", "QI"),

	/**
	 * The '<em><b>RI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RI_VALUE
	 * @generated
	 * @ordered
	 */
	RI(25, "RI", "RI"),

	/**
	 * The '<em><b>RP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RP_VALUE
	 * @generated
	 * @ordered
	 */
	RP(26, "RP", "RP"),

	/**
	 * The '<em><b>RR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RR_VALUE
	 * @generated
	 * @ordered
	 */
	RR(27, "RR", "RR"),

	/**
	 * The '<em><b>RT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RT_VALUE
	 * @generated
	 * @ordered
	 */
	RT(28, "RT", "RT"),

	/**
	 * The '<em><b>RX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RX_VALUE
	 * @generated
	 * @ordered
	 */
	RX(29, "RX", "RX"),

	/**
	 * The '<em><b>SC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SC_VALUE
	 * @generated
	 * @ordered
	 */
	SC(30, "SC", "SC"),

	/**
	 * The '<em><b>SP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SP_VALUE
	 * @generated
	 * @ordered
	 */
	SP(31, "SP", "SP"),

	/**
	 * The '<em><b>TD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TD_VALUE
	 * @generated
	 * @ordered
	 */
	TD(32, "TD", "TD");

	/**
	 * The '<em><b>DD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unknown
	 * <!-- end-model-doc -->
	 * @see #DD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DD_VALUE = 0;

	/**
	 * The '<em><b>AB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accounting &amp; Billing
	 * <!-- end-model-doc -->
	 * @see #AB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AB_VALUE = 1;

	/**
	 * The '<em><b>AI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trigger Event Control Act Infrastructure
	 * <!-- end-model-doc -->
	 * @see #AI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AI_VALUE = 2;

	/**
	 * The '<em><b>BB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Blood Bank
	 * <!-- end-model-doc -->
	 * @see #BB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BB_VALUE = 3;

	/**
	 * The '<em><b>CD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical Document Architecture
	 * <!-- end-model-doc -->
	 * @see #CD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CD_VALUE = 4;

	/**
	 * The '<em><b>CI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transmission Infrastructure
	 * <!-- end-model-doc -->
	 * @see #CI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CI_VALUE = 5;

	/**
	 * The '<em><b>CG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical Genomics
	 * <!-- end-model-doc -->
	 * @see #CG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CG_VALUE = 6;

	/**
	 * The '<em><b>CR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Claims and Reimbursement
	 * <!-- end-model-doc -->
	 * @see #CR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CR_VALUE = 7;

	/**
	 * The '<em><b>CS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clinical Statement
	 * <!-- end-model-doc -->
	 * @see #CS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CS_VALUE = 8;

	/**
	 * The '<em><b>CT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Common Types
	 * Deprecated ?/?/?: CMETs are being moved to their own domains
	 * <!-- end-model-doc -->
	 * @see #CT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CT_VALUE = 9;

	/**
	 * The '<em><b>DI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diagnostic Imaging
	 * Deprecated 2006/12/08: committee is using II instead of DI
	 * <!-- end-model-doc -->
	 * @see #DI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DI_VALUE = 10;

	/**
	 * The '<em><b>DS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decision Support
	 * <!-- end-model-doc -->
	 * @see #DS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DS_VALUE = 11;

	/**
	 * The '<em><b>II</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imaging Integration
	 * <!-- end-model-doc -->
	 * @see #II
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int II_VALUE = 12;

	/**
	 * The '<em><b>IZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immunization
	 * <!-- end-model-doc -->
	 * @see #IZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IZ_VALUE = 13;

	/**
	 * The '<em><b>LB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Laboratory
	 * <!-- end-model-doc -->
	 * @see #LB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LB_VALUE = 14;

	/**
	 * The '<em><b>ME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medication
	 * <!-- end-model-doc -->
	 * @see #ME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ME_VALUE = 15;

	/**
	 * The '<em><b>MI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Masterfile Infrastructure
	 * <!-- end-model-doc -->
	 * @see #MI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MI_VALUE = 16;

	/**
	 * The '<em><b>MM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Materials Management
	 * <!-- end-model-doc -->
	 * @see #MM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MM_VALUE = 17;

	/**
	 * The '<em><b>MR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medical Records
	 * <!-- end-model-doc -->
	 * @see #MR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MR_VALUE = 18;

	/**
	 * The '<em><b>MT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shared Messages
	 * <!-- end-model-doc -->
	 * @see #MT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MT_VALUE = 19;

	/**
	 * The '<em><b>OO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Orders &amp; Observations
	 * <!-- end-model-doc -->
	 * @see #OO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OO_VALUE = 20;

	/**
	 * The '<em><b>PA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient Administration
	 * <!-- end-model-doc -->
	 * @see #PA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PA_VALUE = 21;

	/**
	 * The '<em><b>PC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Care Provision
	 * <!-- end-model-doc -->
	 * @see #PC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PC_VALUE = 22;

	/**
	 * The '<em><b>PM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personnel Management
	 * <!-- end-model-doc -->
	 * @see #PM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PM_VALUE = 23;

	/**
	 * The '<em><b>QI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Query Infrastructure
	 * <!-- end-model-doc -->
	 * @see #QI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QI_VALUE = 24;

	/**
	 * The '<em><b>RI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Informative Public Health
	 * <!-- end-model-doc -->
	 * @see #RI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RI_VALUE = 25;

	/**
	 * The '<em><b>RP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regulated Products
	 * <!-- end-model-doc -->
	 * @see #RP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RP_VALUE = 26;

	/**
	 * The '<em><b>RR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Public Health Reporting
	 * <!-- end-model-doc -->
	 * @see #RR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RR_VALUE = 27;

	/**
	 * The '<em><b>RT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regulated Studies
	 * <!-- end-model-doc -->
	 * @see #RT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RT_VALUE = 28;

	/**
	 * The '<em><b>RX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pharmacy
	 * <!-- end-model-doc -->
	 * @see #RX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RX_VALUE = 29;

	/**
	 * The '<em><b>SC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scheduling
	 * <!-- end-model-doc -->
	 * @see #SC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SC_VALUE = 30;

	/**
	 * The '<em><b>SP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specimen
	 * <!-- end-model-doc -->
	 * @see #SP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SP_VALUE = 31;

	/**
	 * The '<em><b>TD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Therapeutic Devices
	 * <!-- end-model-doc -->
	 * @see #TD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TD_VALUE = 32;

	/**
	 * An array of all the '<em><b>Domain Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DomainKind[] VALUES_ARRAY = new DomainKind[] {
			DD, AB, AI, BB, CD, CI, CG, CR, CS, CT, DI, DS, II, IZ, LB, ME, MI, MM, MR, MT, OO, PA, PC, PM, QI, RI, RP,
			RR, RT, RX, SC, SP, TD, };

	/**
	 * A public read-only list of all the '<em><b>Domain Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DomainKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Domain Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DomainKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Domain Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DomainKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Domain Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainKind get(int value) {
		switch (value) {
			case DD_VALUE:
				return DD;
			case AB_VALUE:
				return AB;
			case AI_VALUE:
				return AI;
			case BB_VALUE:
				return BB;
			case CD_VALUE:
				return CD;
			case CI_VALUE:
				return CI;
			case CG_VALUE:
				return CG;
			case CR_VALUE:
				return CR;
			case CS_VALUE:
				return CS;
			case CT_VALUE:
				return CT;
			case DI_VALUE:
				return DI;
			case DS_VALUE:
				return DS;
			case II_VALUE:
				return II;
			case IZ_VALUE:
				return IZ;
			case LB_VALUE:
				return LB;
			case ME_VALUE:
				return ME;
			case MI_VALUE:
				return MI;
			case MM_VALUE:
				return MM;
			case MR_VALUE:
				return MR;
			case MT_VALUE:
				return MT;
			case OO_VALUE:
				return OO;
			case PA_VALUE:
				return PA;
			case PC_VALUE:
				return PC;
			case PM_VALUE:
				return PM;
			case QI_VALUE:
				return QI;
			case RI_VALUE:
				return RI;
			case RP_VALUE:
				return RP;
			case RR_VALUE:
				return RR;
			case RT_VALUE:
				return RT;
			case RX_VALUE:
				return RX;
			case SC_VALUE:
				return SC;
			case SP_VALUE:
				return SP;
			case TD_VALUE:
				return TD;
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
	private DomainKind(int value, String name, String literal) {
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

} // DomainKind
