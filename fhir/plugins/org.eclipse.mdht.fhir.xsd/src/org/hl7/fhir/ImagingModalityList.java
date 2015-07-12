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
 * A representation of the literals of the enumeration '<em><b>Imaging Modality List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getImagingModalityList()
 * @model extendedMetaData="name='ImagingModality-list'"
 * @generated
 */
public enum ImagingModalityList implements Enumerator {
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
	 * The '<em><b>BMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BMD_VALUE
	 * @generated
	 * @ordered
	 */
	BMD(1, "BMD", "BMD"),

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
	 * The '<em><b>EPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPS_VALUE
	 * @generated
	 * @ordered
	 */
	EPS(3, "EPS", "EPS"),

	/**
	 * The '<em><b>CR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CR_VALUE
	 * @generated
	 * @ordered
	 */
	CR(4, "CR", "CR"),

	/**
	 * The '<em><b>CT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CT_VALUE
	 * @generated
	 * @ordered
	 */
	CT(5, "CT", "CT"),

	/**
	 * The '<em><b>DX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DX_VALUE
	 * @generated
	 * @ordered
	 */
	DX(6, "DX", "DX"),

	/**
	 * The '<em><b>ECG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECG_VALUE
	 * @generated
	 * @ordered
	 */
	ECG(7, "ECG", "ECG"),

	/**
	 * The '<em><b>ES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ES_VALUE
	 * @generated
	 * @ordered
	 */
	ES(8, "ES", "ES"),

	/**
	 * The '<em><b>XC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XC_VALUE
	 * @generated
	 * @ordered
	 */
	XC(9, "XC", "XC"),

	/**
	 * The '<em><b>GM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GM_VALUE
	 * @generated
	 * @ordered
	 */
	GM(10, "GM", "GM"),

	/**
	 * The '<em><b>HD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HD_VALUE
	 * @generated
	 * @ordered
	 */
	HD(11, "HD", "HD"),

	/**
	 * The '<em><b>IO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO_VALUE
	 * @generated
	 * @ordered
	 */
	IO(12, "IO", "IO"),

	/**
	 * The '<em><b>IVOCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVOCT_VALUE
	 * @generated
	 * @ordered
	 */
	IVOCT(13, "IVOCT", "IVOCT"),

	/**
	 * The '<em><b>IVUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVUS_VALUE
	 * @generated
	 * @ordered
	 */
	IVUS(14, "IVUS", "IVUS"),

	/**
	 * The '<em><b>KER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KER_VALUE
	 * @generated
	 * @ordered
	 */
	KER(15, "KER", "KER"),

	/**
	 * The '<em><b>LEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEN_VALUE
	 * @generated
	 * @ordered
	 */
	LEN(16, "LEN", "LEN"),

	/**
	 * The '<em><b>MR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MR_VALUE
	 * @generated
	 * @ordered
	 */
	MR(17, "MR", "MR"),

	/**
	 * The '<em><b>MG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MG_VALUE
	 * @generated
	 * @ordered
	 */
	MG(18, "MG", "MG"),

	/**
	 * The '<em><b>NM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NM_VALUE
	 * @generated
	 * @ordered
	 */
	NM(19, "NM", "NM"),

	/**
	 * The '<em><b>OAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OAM_VALUE
	 * @generated
	 * @ordered
	 */
	OAM(20, "OAM", "OAM"),

	/**
	 * The '<em><b>OCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCT_VALUE
	 * @generated
	 * @ordered
	 */
	OCT(21, "OCT", "OCT"),

	/**
	 * The '<em><b>OPM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPM_VALUE
	 * @generated
	 * @ordered
	 */
	OPM(22, "OPM", "OPM"),

	/**
	 * The '<em><b>OP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OP_VALUE
	 * @generated
	 * @ordered
	 */
	OP(23, "OP", "OP"),

	/**
	 * The '<em><b>OPR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPR_VALUE
	 * @generated
	 * @ordered
	 */
	OPR(24, "OPR", "OPR"),

	/**
	 * The '<em><b>OPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPT_VALUE
	 * @generated
	 * @ordered
	 */
	OPT(25, "OPT", "OPT"),

	/**
	 * The '<em><b>OPV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPV_VALUE
	 * @generated
	 * @ordered
	 */
	OPV(26, "OPV", "OPV"),

	/**
	 * The '<em><b>PX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PX_VALUE
	 * @generated
	 * @ordered
	 */
	PX(27, "PX", "PX"),

	/**
	 * The '<em><b>PT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PT_VALUE
	 * @generated
	 * @ordered
	 */
	PT(28, "PT", "PT"),

	/**
	 * The '<em><b>RF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RF_VALUE
	 * @generated
	 * @ordered
	 */
	RF(29, "RF", "RF"),

	/**
	 * The '<em><b>RG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RG_VALUE
	 * @generated
	 * @ordered
	 */
	RG(30, "RG", "RG"),

	/**
	 * The '<em><b>SM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SM_VALUE
	 * @generated
	 * @ordered
	 */
	SM(31, "SM", "SM"),

	/**
	 * The '<em><b>SRF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRF_VALUE
	 * @generated
	 * @ordered
	 */
	SRF(32, "SRF", "SRF"),

	/**
	 * The '<em><b>US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #US_VALUE
	 * @generated
	 * @ordered
	 */
	US(33, "US", "US"),

	/**
	 * The '<em><b>VA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VA_VALUE
	 * @generated
	 * @ordered
	 */
	VA(34, "VA", "VA"),

	/**
	 * The '<em><b>XA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XA_VALUE
	 * @generated
	 * @ordered
	 */
	XA(35, "XA", "XA");

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
	public static final int BMD_VALUE = 1;

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
	public static final int EPS_VALUE = 3;

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
	public static final int CR_VALUE = 4;

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
	public static final int CT_VALUE = 5;

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
	public static final int DX_VALUE = 6;

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
	public static final int ECG_VALUE = 7;

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
	public static final int ES_VALUE = 8;

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
	public static final int XC_VALUE = 9;

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
	public static final int GM_VALUE = 10;

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
	public static final int HD_VALUE = 11;

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
	public static final int IO_VALUE = 12;

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
	public static final int IVOCT_VALUE = 13;

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
	public static final int IVUS_VALUE = 14;

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
	public static final int KER_VALUE = 15;

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
	public static final int LEN_VALUE = 16;

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
	public static final int MR_VALUE = 17;

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
	public static final int MG_VALUE = 18;

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
	public static final int NM_VALUE = 19;

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
	public static final int OAM_VALUE = 20;

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
	public static final int OCT_VALUE = 21;

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
	public static final int OPM_VALUE = 22;

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
	public static final int OP_VALUE = 23;

	/**
	 * The '<em><b>OPR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @see #OPR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPR_VALUE = 24;

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
	public static final int OPT_VALUE = 25;

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
	public static final int OPV_VALUE = 26;

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
	public static final int PX_VALUE = 27;

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
	public static final int PT_VALUE = 28;

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
	public static final int RF_VALUE = 29;

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
	public static final int RG_VALUE = 30;

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
	public static final int SM_VALUE = 31;

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
	public static final int SRF_VALUE = 32;

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
	public static final int US_VALUE = 33;

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
	public static final int VA_VALUE = 34;

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
	public static final int XA_VALUE = 35;

	/**
	 * An array of all the '<em><b>Imaging Modality List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImagingModalityList[] VALUES_ARRAY =
		new ImagingModalityList[] {
			AR,
			BMD,
			BDUS,
			EPS,
			CR,
			CT,
			DX,
			ECG,
			ES,
			XC,
			GM,
			HD,
			IO,
			IVOCT,
			IVUS,
			KER,
			LEN,
			MR,
			MG,
			NM,
			OAM,
			OCT,
			OPM,
			OP,
			OPR,
			OPT,
			OPV,
			PX,
			PT,
			RF,
			RG,
			SM,
			SRF,
			US,
			VA,
			XA,
		};

	/**
	 * A public read-only list of all the '<em><b>Imaging Modality List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImagingModalityList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Imaging Modality List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImagingModalityList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImagingModalityList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Imaging Modality List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImagingModalityList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImagingModalityList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Imaging Modality List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImagingModalityList get(int value) {
		switch (value) {
			case AR_VALUE: return AR;
			case BMD_VALUE: return BMD;
			case BDUS_VALUE: return BDUS;
			case EPS_VALUE: return EPS;
			case CR_VALUE: return CR;
			case CT_VALUE: return CT;
			case DX_VALUE: return DX;
			case ECG_VALUE: return ECG;
			case ES_VALUE: return ES;
			case XC_VALUE: return XC;
			case GM_VALUE: return GM;
			case HD_VALUE: return HD;
			case IO_VALUE: return IO;
			case IVOCT_VALUE: return IVOCT;
			case IVUS_VALUE: return IVUS;
			case KER_VALUE: return KER;
			case LEN_VALUE: return LEN;
			case MR_VALUE: return MR;
			case MG_VALUE: return MG;
			case NM_VALUE: return NM;
			case OAM_VALUE: return OAM;
			case OCT_VALUE: return OCT;
			case OPM_VALUE: return OPM;
			case OP_VALUE: return OP;
			case OPR_VALUE: return OPR;
			case OPT_VALUE: return OPT;
			case OPV_VALUE: return OPV;
			case PX_VALUE: return PX;
			case PT_VALUE: return PT;
			case RF_VALUE: return RF;
			case RG_VALUE: return RG;
			case SM_VALUE: return SM;
			case SRF_VALUE: return SRF;
			case US_VALUE: return US;
			case VA_VALUE: return VA;
			case XA_VALUE: return XA;
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
	private ImagingModalityList(int value, String name, String literal) {
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
	
} //ImagingModalityList
