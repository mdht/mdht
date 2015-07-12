/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Modality List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getModalityList()
 * @model extendedMetaData="name='Modality-list'"
 * @generated
 */
public enum ModalityList implements Enumerator {
	/**
	 * The '<em><b>AR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AR_VALUE
	 * @generated
	 * @ordered
	 */
	AR(0, "AR", "AR"),

	/**
	 * The '<em><b>AU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AU_VALUE
	 * @generated
	 * @ordered
	 */
	AU(1, "AU", "AU"),

	/**
	 * The '<em><b>BDUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BDUS_VALUE
	 * @generated
	 * @ordered
	 */
	BDUS(2, "BDUS", "BDUS"),

	/**
	 * The '<em><b>BI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BI_VALUE
	 * @generated
	 * @ordered
	 */
	BI(3, "BI", "BI"),

	/**
	 * The '<em><b>BMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BMD_VALUE
	 * @generated
	 * @ordered
	 */
	BMD(4, "BMD", "BMD"),

	/**
	 * The '<em><b>CR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CR_VALUE
	 * @generated
	 * @ordered
	 */
	CR(5, "CR", "CR"),

	/**
	 * The '<em><b>CT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CT_VALUE
	 * @generated
	 * @ordered
	 */
	CT(6, "CT", "CT"),

	/**
	 * The '<em><b>DG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DG_VALUE
	 * @generated
	 * @ordered
	 */
	DG(7, "DG", "DG"),

	/**
	 * The '<em><b>DX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DX_VALUE
	 * @generated
	 * @ordered
	 */
	DX(8, "DX", "DX"),

	/**
	 * The '<em><b>ECG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECG_VALUE
	 * @generated
	 * @ordered
	 */
	ECG(9, "ECG", "ECG"),

	/**
	 * The '<em><b>EPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPS_VALUE
	 * @generated
	 * @ordered
	 */
	EPS(10, "EPS", "EPS"),

	/**
	 * The '<em><b>ES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ES_VALUE
	 * @generated
	 * @ordered
	 */
	ES(11, "ES", "ES"),

	/**
	 * The '<em><b>GM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GM_VALUE
	 * @generated
	 * @ordered
	 */
	GM(12, "GM", "GM"),

	/**
	 * The '<em><b>HC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HC_VALUE
	 * @generated
	 * @ordered
	 */
	HC(13, "HC", "HC"),

	/**
	 * The '<em><b>HD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HD_VALUE
	 * @generated
	 * @ordered
	 */
	HD(14, "HD", "HD"),

	/**
	 * The '<em><b>IO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO_VALUE
	 * @generated
	 * @ordered
	 */
	IO(15, "IO", "IO"),

	/**
	 * The '<em><b>IVOCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVOCT_VALUE
	 * @generated
	 * @ordered
	 */
	IVOCT(16, "IVOCT", "IVOCT"),

	/**
	 * The '<em><b>IVUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVUS_VALUE
	 * @generated
	 * @ordered
	 */
	IVUS(17, "IVUS", "IVUS"),

	/**
	 * The '<em><b>KER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KER_VALUE
	 * @generated
	 * @ordered
	 */
	KER(18, "KER", "KER"),

	/**
	 * The '<em><b>KO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KO_VALUE
	 * @generated
	 * @ordered
	 */
	KO(19, "KO", "KO"),

	/**
	 * The '<em><b>LEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEN_VALUE
	 * @generated
	 * @ordered
	 */
	LEN(20, "LEN", "LEN"),

	/**
	 * The '<em><b>LS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LS_VALUE
	 * @generated
	 * @ordered
	 */
	LS(21, "LS", "LS"),

	/**
	 * The '<em><b>MG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MG_VALUE
	 * @generated
	 * @ordered
	 */
	MG(22, "MG", "MG"),

	/**
	 * The '<em><b>MR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MR_VALUE
	 * @generated
	 * @ordered
	 */
	MR(23, "MR", "MR"),

	/**
	 * The '<em><b>NM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NM_VALUE
	 * @generated
	 * @ordered
	 */
	NM(24, "NM", "NM"),

	/**
	 * The '<em><b>OAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OAM_VALUE
	 * @generated
	 * @ordered
	 */
	OAM(25, "OAM", "OAM"),

	/**
	 * The '<em><b>OCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCT_VALUE
	 * @generated
	 * @ordered
	 */
	OCT(26, "OCT", "OCT"),

	/**
	 * The '<em><b>OP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OP_VALUE
	 * @generated
	 * @ordered
	 */
	OP(27, "OP", "OP"),

	/**
	 * The '<em><b>OPM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPM_VALUE
	 * @generated
	 * @ordered
	 */
	OPM(28, "OPM", "OPM"),

	/**
	 * The '<em><b>OPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPT_VALUE
	 * @generated
	 * @ordered
	 */
	OPT(29, "OPT", "OPT"),

	/**
	 * The '<em><b>OPV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPV_VALUE
	 * @generated
	 * @ordered
	 */
	OPV(30, "OPV", "OPV"),

	/**
	 * The '<em><b>OT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OT_VALUE
	 * @generated
	 * @ordered
	 */
	OT(31, "OT", "OT"),

	/**
	 * The '<em><b>PR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PR_VALUE
	 * @generated
	 * @ordered
	 */
	PR(32, "PR", "PR"),

	/**
	 * The '<em><b>PT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PT_VALUE
	 * @generated
	 * @ordered
	 */
	PT(33, "PT", "PT"),

	/**
	 * The '<em><b>PX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PX_VALUE
	 * @generated
	 * @ordered
	 */
	PX(34, "PX", "PX"),

	/**
	 * The '<em><b>REG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REG_VALUE
	 * @generated
	 * @ordered
	 */
	REG(35, "REG", "REG"),

	/**
	 * The '<em><b>RF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RF_VALUE
	 * @generated
	 * @ordered
	 */
	RF(36, "RF", "RF"),

	/**
	 * The '<em><b>RG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RG_VALUE
	 * @generated
	 * @ordered
	 */
	RG(37, "RG", "RG"),

	/**
	 * The '<em><b>RTDOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTDOSE_VALUE
	 * @generated
	 * @ordered
	 */
	RTDOSE(38, "RTDOSE", "RTDOSE"),

	/**
	 * The '<em><b>RTIMAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTIMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	RTIMAGE(39, "RTIMAGE", "RTIMAGE"),

	/**
	 * The '<em><b>RTPLAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	RTPLAN(40, "RTPLAN", "RTPLAN"),

	/**
	 * The '<em><b>RTRECORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTRECORD_VALUE
	 * @generated
	 * @ordered
	 */
	RTRECORD(41, "RTRECORD", "RTRECORD"),

	/**
	 * The '<em><b>RTSTRUCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTSTRUCT_VALUE
	 * @generated
	 * @ordered
	 */
	RTSTRUCT(42, "RTSTRUCT", "RTSTRUCT"),

	/**
	 * The '<em><b>SEG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEG_VALUE
	 * @generated
	 * @ordered
	 */
	SEG(43, "SEG", "SEG"),

	/**
	 * The '<em><b>SM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SM_VALUE
	 * @generated
	 * @ordered
	 */
	SM(44, "SM", "SM"),

	/**
	 * The '<em><b>SMR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMR_VALUE
	 * @generated
	 * @ordered
	 */
	SMR(45, "SMR", "SMR"),

	/**
	 * The '<em><b>SR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SR_VALUE
	 * @generated
	 * @ordered
	 */
	SR(46, "SR", "SR"),

	/**
	 * The '<em><b>SRF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRF_VALUE
	 * @generated
	 * @ordered
	 */
	SRF(47, "SRF", "SRF"),

	/**
	 * The '<em><b>TG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TG_VALUE
	 * @generated
	 * @ordered
	 */
	TG(48, "TG", "TG"),

	/**
	 * The '<em><b>US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #US_VALUE
	 * @generated
	 * @ordered
	 */
	US(49, "US", "US"),

	/**
	 * The '<em><b>VA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VA_VALUE
	 * @generated
	 * @ordered
	 */
	VA(50, "VA", "VA"),

	/**
	 * The '<em><b>XA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XA_VALUE
	 * @generated
	 * @ordered
	 */
	XA(51, "XA", "XA"),

	/**
	 * The '<em><b>XC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XC_VALUE
	 * @generated
	 * @ordered
	 */
	XC(52, "XC", "XC");

	/**
	 * The '<em><b>AR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #AR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AR_VALUE = 0;

	/**
	 * The '<em><b>AU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #AU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AU_VALUE = 1;

	/**
	 * The '<em><b>BDUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #BDUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BDUS_VALUE = 2;

	/**
	 * The '<em><b>BI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #BI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BI_VALUE = 3;

	/**
	 * The '<em><b>BMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #BMD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BMD_VALUE = 4;

	/**
	 * The '<em><b>CR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #CR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CR_VALUE = 5;

	/**
	 * The '<em><b>CT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #CT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CT_VALUE = 6;

	/**
	 * The '<em><b>DG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #DG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DG_VALUE = 7;

	/**
	 * The '<em><b>DX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #DX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DX_VALUE = 8;

	/**
	 * The '<em><b>ECG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #ECG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ECG_VALUE = 9;

	/**
	 * The '<em><b>EPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #EPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EPS_VALUE = 10;

	/**
	 * The '<em><b>ES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #ES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ES_VALUE = 11;

	/**
	 * The '<em><b>GM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #GM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GM_VALUE = 12;

	/**
	 * The '<em><b>HC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #HC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HC_VALUE = 13;

	/**
	 * The '<em><b>HD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #HD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HD_VALUE = 14;

	/**
	 * The '<em><b>IO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #IO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IO_VALUE = 15;

	/**
	 * The '<em><b>IVOCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #IVOCT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IVOCT_VALUE = 16;

	/**
	 * The '<em><b>IVUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #IVUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IVUS_VALUE = 17;

	/**
	 * The '<em><b>KER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #KER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KER_VALUE = 18;

	/**
	 * The '<em><b>KO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #KO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KO_VALUE = 19;

	/**
	 * The '<em><b>LEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #LEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEN_VALUE = 20;

	/**
	 * The '<em><b>LS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #LS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LS_VALUE = 21;

	/**
	 * The '<em><b>MG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #MG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MG_VALUE = 22;

	/**
	 * The '<em><b>MR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #MR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MR_VALUE = 23;

	/**
	 * The '<em><b>NM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #NM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NM_VALUE = 24;

	/**
	 * The '<em><b>OAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #OAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OAM_VALUE = 25;

	/**
	 * The '<em><b>OCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #OCT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCT_VALUE = 26;

	/**
	 * The '<em><b>OP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #OP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OP_VALUE = 27;

	/**
	 * The '<em><b>OPM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #OPM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPM_VALUE = 28;

	/**
	 * The '<em><b>OPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #OPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPT_VALUE = 29;

	/**
	 * The '<em><b>OPV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #OPV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPV_VALUE = 30;

	/**
	 * The '<em><b>OT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #OT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OT_VALUE = 31;

	/**
	 * The '<em><b>PR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #PR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PR_VALUE = 32;

	/**
	 * The '<em><b>PT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #PT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PT_VALUE = 33;

	/**
	 * The '<em><b>PX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #PX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PX_VALUE = 34;

	/**
	 * The '<em><b>REG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #REG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REG_VALUE = 35;

	/**
	 * The '<em><b>RF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #RF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RF_VALUE = 36;

	/**
	 * The '<em><b>RG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #RG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RG_VALUE = 37;

	/**
	 * The '<em><b>RTDOSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #RTDOSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTDOSE_VALUE = 38;

	/**
	 * The '<em><b>RTIMAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #RTIMAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTIMAGE_VALUE = 39;

	/**
	 * The '<em><b>RTPLAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #RTPLAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTPLAN_VALUE = 40;

	/**
	 * The '<em><b>RTRECORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #RTRECORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTRECORD_VALUE = 41;

	/**
	 * The '<em><b>RTSTRUCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #RTSTRUCT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTSTRUCT_VALUE = 42;

	/**
	 * The '<em><b>SEG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #SEG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEG_VALUE = 43;

	/**
	 * The '<em><b>SM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #SM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SM_VALUE = 44;

	/**
	 * The '<em><b>SMR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #SMR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMR_VALUE = 45;

	/**
	 * The '<em><b>SR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #SR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SR_VALUE = 46;

	/**
	 * The '<em><b>SRF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #SRF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SRF_VALUE = 47;

	/**
	 * The '<em><b>TG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #TG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TG_VALUE = 48;

	/**
	 * The '<em><b>US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #US
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int US_VALUE = 49;

	/**
	 * The '<em><b>VA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #VA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VA_VALUE = 50;

	/**
	 * The '<em><b>XA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #XA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XA_VALUE = 51;

	/**
	 * The '<em><b>XC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #XC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XC_VALUE = 52;

	/**
	 * An array of all the '<em><b>Modality List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModalityList[] VALUES_ARRAY =
		new ModalityList[] {
			AR,
			AU,
			BDUS,
			BI,
			BMD,
			CR,
			CT,
			DG,
			DX,
			ECG,
			EPS,
			ES,
			GM,
			HC,
			HD,
			IO,
			IVOCT,
			IVUS,
			KER,
			KO,
			LEN,
			LS,
			MG,
			MR,
			NM,
			OAM,
			OCT,
			OP,
			OPM,
			OPT,
			OPV,
			OT,
			PR,
			PT,
			PX,
			REG,
			RF,
			RG,
			RTDOSE,
			RTIMAGE,
			RTPLAN,
			RTRECORD,
			RTSTRUCT,
			SEG,
			SM,
			SMR,
			SR,
			SRF,
			TG,
			US,
			VA,
			XA,
			XC,
		};

	/**
	 * A public read-only list of all the '<em><b>Modality List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModalityList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Modality List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModalityList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModalityList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modality List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModalityList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModalityList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modality List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModalityList get(int value) {
		switch (value) {
			case AR_VALUE: return AR;
			case AU_VALUE: return AU;
			case BDUS_VALUE: return BDUS;
			case BI_VALUE: return BI;
			case BMD_VALUE: return BMD;
			case CR_VALUE: return CR;
			case CT_VALUE: return CT;
			case DG_VALUE: return DG;
			case DX_VALUE: return DX;
			case ECG_VALUE: return ECG;
			case EPS_VALUE: return EPS;
			case ES_VALUE: return ES;
			case GM_VALUE: return GM;
			case HC_VALUE: return HC;
			case HD_VALUE: return HD;
			case IO_VALUE: return IO;
			case IVOCT_VALUE: return IVOCT;
			case IVUS_VALUE: return IVUS;
			case KER_VALUE: return KER;
			case KO_VALUE: return KO;
			case LEN_VALUE: return LEN;
			case LS_VALUE: return LS;
			case MG_VALUE: return MG;
			case MR_VALUE: return MR;
			case NM_VALUE: return NM;
			case OAM_VALUE: return OAM;
			case OCT_VALUE: return OCT;
			case OP_VALUE: return OP;
			case OPM_VALUE: return OPM;
			case OPT_VALUE: return OPT;
			case OPV_VALUE: return OPV;
			case OT_VALUE: return OT;
			case PR_VALUE: return PR;
			case PT_VALUE: return PT;
			case PX_VALUE: return PX;
			case REG_VALUE: return REG;
			case RF_VALUE: return RF;
			case RG_VALUE: return RG;
			case RTDOSE_VALUE: return RTDOSE;
			case RTIMAGE_VALUE: return RTIMAGE;
			case RTPLAN_VALUE: return RTPLAN;
			case RTRECORD_VALUE: return RTRECORD;
			case RTSTRUCT_VALUE: return RTSTRUCT;
			case SEG_VALUE: return SEG;
			case SM_VALUE: return SM;
			case SMR_VALUE: return SMR;
			case SR_VALUE: return SR;
			case SRF_VALUE: return SRF;
			case TG_VALUE: return TG;
			case US_VALUE: return US;
			case VA_VALUE: return VA;
			case XA_VALUE: return XA;
			case XC_VALUE: return XC;
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
	private ModalityList(int value, String name, String literal) {
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
	
} //ModalityList
