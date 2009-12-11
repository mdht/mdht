/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Affiliate Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The list of HL7 affiliates.
 * <!-- end-model-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getAffiliateKind()
 * @model extendedMetaData="name='AffiliateKind'"
 * @generated
 */
public enum AffiliateKind implements Enumerator {
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
	 * The '<em><b>AT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AT_VALUE
	 * @generated
	 * @ordered
	 */
	AT(2, "AT", "AT"),

	/**
	 * The '<em><b>BR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BR_VALUE
	 * @generated
	 * @ordered
	 */
	BR(3, "BR", "BR"),

	/**
	 * The '<em><b>CA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CA_VALUE
	 * @generated
	 * @ordered
	 */
	CA(4, "CA", "CA"),

	/**
	 * The '<em><b>CL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CL_VALUE
	 * @generated
	 * @ordered
	 */
	CL(5, "CL", "CL"),

	/**
	 * The '<em><b>CN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CN_VALUE
	 * @generated
	 * @ordered
	 */
	CN(6, "CN", "CN"),

	/**
	 * The '<em><b>HR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HR_VALUE
	 * @generated
	 * @ordered
	 */
	HR(7, "HR", "HR"),

	/**
	 * The '<em><b>CZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CZ_VALUE
	 * @generated
	 * @ordered
	 */
	CZ(8, "CZ", "CZ"),

	/**
	 * The '<em><b>DK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DK_VALUE
	 * @generated
	 * @ordered
	 */
	DK(9, "DK", "DK"),

	/**
	 * The '<em><b>FI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FI_VALUE
	 * @generated
	 * @ordered
	 */
	FI(10, "FI", "FI"),

	/**
	 * The '<em><b>FR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FR_VALUE
	 * @generated
	 * @ordered
	 */
	FR(11, "FR", "FR"),

	/**
	 * The '<em><b>DE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DE_VALUE
	 * @generated
	 * @ordered
	 */
	DE(12, "DE", "DE"),

	/**
	 * The '<em><b>GR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GR_VALUE
	 * @generated
	 * @ordered
	 */
	GR(13, "GR", "GR"),

	/**
	 * The '<em><b>IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(14, "IN", "IN"),

	/**
	 * The '<em><b>IE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IE_VALUE
	 * @generated
	 * @ordered
	 */
	IE(15, "IE", "IE"),

	/**
	 * The '<em><b>IT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IT_VALUE
	 * @generated
	 * @ordered
	 */
	IT(16, "IT", "IT"),

	/**
	 * The '<em><b>JP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JP_VALUE
	 * @generated
	 * @ordered
	 */
	JP(17, "JP", "JP"),

	/**
	 * The '<em><b>KR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KR_VALUE
	 * @generated
	 * @ordered
	 */
	KR(18, "KR", "KR"),

	/**
	 * The '<em><b>LT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(19, "LT", "LT"),

	/**
	 * The '<em><b>MX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MX_VALUE
	 * @generated
	 * @ordered
	 */
	MX(20, "MX", "MX"),

	/**
	 * The '<em><b>NL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NL_VALUE
	 * @generated
	 * @ordered
	 */
	NL(21, "NL", "NL"),

	/**
	 * The '<em><b>NZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NZ_VALUE
	 * @generated
	 * @ordered
	 */
	NZ(22, "NZ", "NZ"),

	/**
	 * The '<em><b>RO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RO_VALUE
	 * @generated
	 * @ordered
	 */
	RO(23, "RO", "RO"),

	/**
	 * The '<em><b>SOA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOA_VALUE
	 * @generated
	 * @ordered
	 */
	SOA(24, "SOA", "SOA"),

	/**
	 * The '<em><b>ES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ES_VALUE
	 * @generated
	 * @ordered
	 */
	ES(25, "ES", "ES"),

	/**
	 * The '<em><b>SE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SE_VALUE
	 * @generated
	 * @ordered
	 */
	SE(26, "SE", "SE"),

	/**
	 * The '<em><b>CH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CH_VALUE
	 * @generated
	 * @ordered
	 */
	CH(27, "CH", "CH"),

	/**
	 * The '<em><b>TW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TW_VALUE
	 * @generated
	 * @ordered
	 */
	TW(28, "TW", "TW"),

	/**
	 * The '<em><b>TR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TR_VALUE
	 * @generated
	 * @ordered
	 */
	TR(29, "TR", "TR"),

	/**
	 * The '<em><b>UK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UK_VALUE
	 * @generated
	 * @ordered
	 */
	UK(30, "UK", "UK"),

	/**
	 * The '<em><b>US</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #US_VALUE
	 * @generated
	 * @ordered
	 */
	US(31, "US", "US"),

	/**
	 * The '<em><b>UY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UY_VALUE
	 * @generated
	 * @ordered
	 */
	UY(32, "UY", "UY"),

	/**
	 * The '<em><b>UV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UV_VALUE
	 * @generated
	 * @ordered
	 */
	UV(33, "UV", "UV");

	/**
	 * The '<em><b>AR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Argentina
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
	 * Australia
	 * <!-- end-model-doc -->
	 * @see #AU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AU_VALUE = 1;

	/**
	 * The '<em><b>AT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Austria
	 * <!-- end-model-doc -->
	 * @see #AT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AT_VALUE = 2;

	/**
	 * The '<em><b>BR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Brazil
	 * <!-- end-model-doc -->
	 * @see #BR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BR_VALUE = 3;

	/**
	 * The '<em><b>CA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Canada
	 * <!-- end-model-doc -->
	 * @see #CA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CA_VALUE = 4;

	/**
	 * The '<em><b>CL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Chile
	 * <!-- end-model-doc -->
	 * @see #CL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CL_VALUE = 5;

	/**
	 * The '<em><b>CN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * China
	 * <!-- end-model-doc -->
	 * @see #CN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CN_VALUE = 6;

	/**
	 * The '<em><b>HR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Croatia
	 * <!-- end-model-doc -->
	 * @see #HR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HR_VALUE = 7;

	/**
	 * The '<em><b>CZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Czech Republic
	 * <!-- end-model-doc -->
	 * @see #CZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CZ_VALUE = 8;

	/**
	 * The '<em><b>DK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denmark
	 * <!-- end-model-doc -->
	 * @see #DK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DK_VALUE = 9;

	/**
	 * The '<em><b>FI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Finland
	 * <!-- end-model-doc -->
	 * @see #FI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FI_VALUE = 10;

	/**
	 * The '<em><b>FR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * France
	 * <!-- end-model-doc -->
	 * @see #FR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FR_VALUE = 11;

	/**
	 * The '<em><b>DE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Germany
	 * <!-- end-model-doc -->
	 * @see #DE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DE_VALUE = 12;

	/**
	 * The '<em><b>GR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Greece
	 * <!-- end-model-doc -->
	 * @see #GR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GR_VALUE = 13;

	/**
	 * The '<em><b>IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * India
	 * <!-- end-model-doc -->
	 * @see #IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 14;

	/**
	 * The '<em><b>IE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ireland
	 * <!-- end-model-doc -->
	 * @see #IE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IE_VALUE = 15;

	/**
	 * The '<em><b>IT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Italy
	 * <!-- end-model-doc -->
	 * @see #IT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IT_VALUE = 16;

	/**
	 * The '<em><b>JP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Japan
	 * <!-- end-model-doc -->
	 * @see #JP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JP_VALUE = 17;

	/**
	 * The '<em><b>KR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Korea
	 * <!-- end-model-doc -->
	 * @see #KR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KR_VALUE = 18;

	/**
	 * The '<em><b>LT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lithuania
	 * <!-- end-model-doc -->
	 * @see #LT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 19;

	/**
	 * The '<em><b>MX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mexico
	 * <!-- end-model-doc -->
	 * @see #MX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MX_VALUE = 20;

	/**
	 * The '<em><b>NL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Netherlands
	 * <!-- end-model-doc -->
	 * @see #NL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NL_VALUE = 21;

	/**
	 * The '<em><b>NZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * New Zealand
	 * <!-- end-model-doc -->
	 * @see #NZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NZ_VALUE = 22;

	/**
	 * The '<em><b>RO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Romania
	 * <!-- end-model-doc -->
	 * @see #RO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RO_VALUE = 23;

	/**
	 * The '<em><b>SOA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Southern Africa
	 * <!-- end-model-doc -->
	 * @see #SOA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOA_VALUE = 24;

	/**
	 * The '<em><b>ES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spain
	 * <!-- end-model-doc -->
	 * @see #ES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ES_VALUE = 25;

	/**
	 * The '<em><b>SE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sweden
	 * <!-- end-model-doc -->
	 * @see #SE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SE_VALUE = 26;

	/**
	 * The '<em><b>CH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Switzerland
	 * <!-- end-model-doc -->
	 * @see #CH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CH_VALUE = 27;

	/**
	 * The '<em><b>TW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Taiwan
	 * <!-- end-model-doc -->
	 * @see #TW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TW_VALUE = 28;

	/**
	 * The '<em><b>TR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Turkey
	 * <!-- end-model-doc -->
	 * @see #TR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TR_VALUE = 29;

	/**
	 * The '<em><b>UK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * United Kingdom
	 * <!-- end-model-doc -->
	 * @see #UK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UK_VALUE = 30;

	/**
	 * The '<em><b>US</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * United States
	 * <!-- end-model-doc -->
	 * @see #US
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int US_VALUE = 31;

	/**
	 * The '<em><b>UY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uruguay
	 * <!-- end-model-doc -->
	 * @see #UY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UY_VALUE = 32;

	/**
	 * The '<em><b>UV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies to all realms (unless there is a realm-specific override)
	 * <!-- end-model-doc -->
	 * @see #UV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UV_VALUE = 33;

	/**
	 * An array of all the '<em><b>Affiliate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AffiliateKind[] VALUES_ARRAY =
		new AffiliateKind[] {
			AR,
			AU,
			AT,
			BR,
			CA,
			CL,
			CN,
			HR,
			CZ,
			DK,
			FI,
			FR,
			DE,
			GR,
			IN,
			IE,
			IT,
			JP,
			KR,
			LT,
			MX,
			NL,
			NZ,
			RO,
			SOA,
			ES,
			SE,
			CH,
			TW,
			TR,
			UK,
			US,
			UY,
			UV,
		};

	/**
	 * A public read-only list of all the '<em><b>Affiliate Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AffiliateKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Affiliate Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AffiliateKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AffiliateKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Affiliate Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AffiliateKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AffiliateKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Affiliate Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AffiliateKind get(int value) {
		switch (value) {
			case AR_VALUE: return AR;
			case AU_VALUE: return AU;
			case AT_VALUE: return AT;
			case BR_VALUE: return BR;
			case CA_VALUE: return CA;
			case CL_VALUE: return CL;
			case CN_VALUE: return CN;
			case HR_VALUE: return HR;
			case CZ_VALUE: return CZ;
			case DK_VALUE: return DK;
			case FI_VALUE: return FI;
			case FR_VALUE: return FR;
			case DE_VALUE: return DE;
			case GR_VALUE: return GR;
			case IN_VALUE: return IN;
			case IE_VALUE: return IE;
			case IT_VALUE: return IT;
			case JP_VALUE: return JP;
			case KR_VALUE: return KR;
			case LT_VALUE: return LT;
			case MX_VALUE: return MX;
			case NL_VALUE: return NL;
			case NZ_VALUE: return NZ;
			case RO_VALUE: return RO;
			case SOA_VALUE: return SOA;
			case ES_VALUE: return ES;
			case SE_VALUE: return SE;
			case CH_VALUE: return CH;
			case TW_VALUE: return TW;
			case TR_VALUE: return TR;
			case UK_VALUE: return UK;
			case US_VALUE: return US;
			case UY_VALUE: return UY;
			case UV_VALUE: return UV;
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
	private AffiliateKind(int value, String name, String literal) {
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
	
} //AffiliateKind
