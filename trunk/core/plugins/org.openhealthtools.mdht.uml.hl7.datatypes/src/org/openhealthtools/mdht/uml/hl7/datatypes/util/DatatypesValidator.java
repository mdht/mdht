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
package org.openhealthtools.mdht.uml.hl7.datatypes.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.BIN;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.BN;
import org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CO;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.CV;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPlugin;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ENXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.MO;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PIVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQR;
import org.openhealthtools.mdht.uml.hl7.datatypes.QTY;
import org.openhealthtools.mdht.uml.hl7.datatypes.REAL;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY;
import org.openhealthtools.mdht.uml.hl7.datatypes.SC;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.URL;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DatatypesValidator INSTANCE = new DatatypesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.hl7.datatypes";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Thumbnail Thumbnail' of 'ED'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ED__THUMBNAIL_THUMBNAIL = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Thumbnail' of 'ST'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final int ST__THUMBNAIL = 2;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reference' of 'ST'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final int ST__REFERENCE = 3;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Integrity Check' of 'ST'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final int ST__INTEGRITY_CHECK = 4;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Compression' of 'ST'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ST__COMPRESSION = 6;

				/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Representation' of 'ST'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ST__REPRESENTATION = 7;

				/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Integrity Check Algorithm' of 'ST'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ST__INTEGRITY_CHECK_ALGORITHM = 5;

				/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Translation' of 'CV'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CV__TRANSLATION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Qualifier' of 'CE'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CE__QUALIFIER = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Null Flavor' of 'BN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BN__NULL_FLAVOR = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delimiter' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIMITER = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Country' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__COUNTRY = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate State' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STATE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate County' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__COUNTY = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate City' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__CITY = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Postal Code' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__POSTAL_CODE = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Street Address Line' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STREET_ADDRESS_LINE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate House Number' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__HOUSE_NUMBER = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate House Number Numeric' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__HOUSE_NUMBER_NUMERIC = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Direction' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DIRECTION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Street Name' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STREET_NAME = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Street Name Base' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STREET_NAME_BASE = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Street Name Type' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STREET_NAME_TYPE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Additional Locator' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__ADDITIONAL_LOCATOR = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unit ID' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__UNIT_ID = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unit Type' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__UNIT_TYPE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Care Of' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__CARE_OF = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Census Tract' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__CENSUS_TRACT = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delivery Address Line' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_ADDRESS_LINE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delivery Installation Type' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_INSTALLATION_TYPE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delivery Installation Area' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_INSTALLATION_AREA = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delivery Installation Qualifier' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_INSTALLATION_QUALIFIER = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delivery Mode' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_MODE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delivery Mode Identifier' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_MODE_IDENTIFIER = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Building Number Suffix' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__BUILDING_NUMBER_SUFFIX = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Box' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__POST_BOX = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Precinct' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__PRECINCT = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delimiter' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__DELIMITER = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__FAMILY = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Given' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__GIVEN = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prefix' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__PREFIX = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Suffix' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__SUFFIX = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Options Containing Low' of 'IVL TS'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final int IVL_TS__OPTIONS_CONTAINING_LOW = 43;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Options Containing Center' of 'IVL TS'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final int IVL_TS__OPTIONS_CONTAINING_CENTER = 44;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Options Containing High' of 'IVL TS'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final int IVL_TS__OPTIONS_CONTAINING_HIGH = 45;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Options Containing Width' of 'IVL TS'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final int IVL_TS__OPTIONS_CONTAINING_WIDTH = 46;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariant' of 'ON'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ON__INVARIANT = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariant' of 'PN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PN__INVARIANT = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariant' of 'TN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TN__INVARIANT = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Original Text' of 'CS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CS__ORIGINAL_TEXT = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Code System' of 'CS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CS__CODE_SYSTEM = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Code System Name' of 'CS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CS__CODE_SYSTEM_NAME = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Code System Version' of 'CS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CS__CODE_SYSTEM_VERSION = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Display Name' of 'CS'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CS__DISPLAY_NAME = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Denominator' of 'RTO QTY QTY'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RTO_QTY_QTY__DENOMINATOR = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Options Containing Low' of 'IVL INT'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IVL_INT__OPTIONS_CONTAINING_LOW = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Options Containing Center' of 'IVL INT'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IVL_INT__OPTIONS_CONTAINING_CENTER = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Options Containing High' of 'IVL INT'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IVL_INT__OPTIONS_CONTAINING_HIGH = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Options Containing Width' of 'IVL INT'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IVL_INT__OPTIONS_CONTAINING_WIDTH = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Options Containing Low' of 'IVL PQ'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final int IVL_PQ__OPTIONS_CONTAINING_LOW = 60;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Options Containing Center' of 'IVL PQ'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final int IVL_PQ__OPTIONS_CONTAINING_CENTER = 61;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Options Containing High' of 'IVL PQ'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final int IVL_PQ__OPTIONS_CONTAINING_HIGH = 62;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Options Containing Width' of 'IVL PQ'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final int IVL_PQ__OPTIONS_CONTAINING_WIDTH = 63;

    /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Denominator' of 'RTO PQ PQ'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RTO_PQ_PQ__DENOMINATOR = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Original Text' of 'EIVL event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EIVL_EVENT__ORIGINAL_TEXT = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Translation' of 'EIVL event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EIVL_EVENT__TRANSLATION = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Code System' of 'EIVL event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EIVL_EVENT__CODE_SYSTEM = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Code System Name' of 'EIVL event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EIVL_EVENT__CODE_SYSTEM_NAME = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Code' of 'EIVL event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EIVL_EVENT__CODE = 69;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 69;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DatatypesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DatatypesPackage.ANY:
				return validateANY((ANY)value, diagnostics, context);
			case DatatypesPackage.BIN:
				return validateBIN((BIN)value, diagnostics, context);
			case DatatypesPackage.ED:
				return validateED((ED)value, diagnostics, context);
			case DatatypesPackage.TEL:
				return validateTEL((TEL)value, diagnostics, context);
			case DatatypesPackage.URL:
				return validateURL((URL)value, diagnostics, context);
			case DatatypesPackage.SXCM_TS:
				return validateSXCM_TS((SXCM_TS)value, diagnostics, context);
			case DatatypesPackage.TS:
				return validateTS((TS)value, diagnostics, context);
			case DatatypesPackage.QTY:
				return validateQTY((QTY)value, diagnostics, context);
			case DatatypesPackage.ST:
				return validateST((ST)value, diagnostics, context);
			case DatatypesPackage.CD:
				return validateCD((CD)value, diagnostics, context);
			case DatatypesPackage.CR:
				return validateCR((CR)value, diagnostics, context);
			case DatatypesPackage.CV:
				return validateCV((CV)value, diagnostics, context);
			case DatatypesPackage.CE:
				return validateCE((CE)value, diagnostics, context);
			case DatatypesPackage.II:
				return validateII((II)value, diagnostics, context);
			case DatatypesPackage.BL:
				return validateBL((BL)value, diagnostics, context);
			case DatatypesPackage.BN:
				return validateBN((BN)value, diagnostics, context);
			case DatatypesPackage.AD:
				return validateAD((AD)value, diagnostics, context);
			case DatatypesPackage.ADXP:
				return validateADXP((ADXP)value, diagnostics, context);
			case DatatypesPackage.EN:
				return validateEN((EN)value, diagnostics, context);
			case DatatypesPackage.ENXP:
				return validateENXP((ENXP)value, diagnostics, context);
			case DatatypesPackage.IVL_TS:
				return validateIVL_TS((IVL_TS)value, diagnostics, context);
			case DatatypesPackage.IVXB_TS:
				return validateIVXB_TS((IVXB_TS)value, diagnostics, context);
			case DatatypesPackage.PQ:
				return validatePQ((PQ)value, diagnostics, context);
			case DatatypesPackage.PQR:
				return validatePQR((PQR)value, diagnostics, context);
			case DatatypesPackage.ON:
				return validateON((ON)value, diagnostics, context);
			case DatatypesPackage.PN:
				return validatePN((PN)value, diagnostics, context);
			case DatatypesPackage.TN:
				return validateTN((TN)value, diagnostics, context);
			case DatatypesPackage.INT:
				return validateINT((INT)value, diagnostics, context);
			case DatatypesPackage.REAL:
				return validateREAL((REAL)value, diagnostics, context);
			case DatatypesPackage.CS:
				return validateCS((CS)value, diagnostics, context);
			case DatatypesPackage.CO:
				return validateCO((CO)value, diagnostics, context);
			case DatatypesPackage.SC:
				return validateSC((SC)value, diagnostics, context);
			case DatatypesPackage.RTO_QTY_QTY:
				return validateRTO_QTY_QTY((RTO_QTY_QTY)value, diagnostics, context);
			case DatatypesPackage.MO:
				return validateMO((MO)value, diagnostics, context);
			case DatatypesPackage.RTO:
				return validateRTO((RTO)value, diagnostics, context);
			case DatatypesPackage.SXCM_INT:
				return validateSXCM_INT((SXCM_INT)value, diagnostics, context);
			case DatatypesPackage.IVXB_INT:
				return validateIVXB_INT((IVXB_INT)value, diagnostics, context);
			case DatatypesPackage.IVL_INT:
				return validateIVL_INT((IVL_INT)value, diagnostics, context);
			case DatatypesPackage.IVXB_PQ:
				return validateIVXB_PQ((IVXB_PQ)value, diagnostics, context);
			case DatatypesPackage.SXCM_PQ:
				return validateSXCM_PQ((SXCM_PQ)value, diagnostics, context);
			case DatatypesPackage.IVL_PQ:
				return validateIVL_PQ((IVL_PQ)value, diagnostics, context);
			case DatatypesPackage.RTO_PQ_PQ:
				return validateRTO_PQ_PQ((RTO_PQ_PQ)value, diagnostics, context);
			case DatatypesPackage.PIVL_TS:
				return validatePIVL_TS((PIVL_TS)value, diagnostics, context);
			case DatatypesPackage.EIVL_EVENT:
				return validateEIVL_event((EIVL_event)value, diagnostics, context);
			case DatatypesPackage.EIVL_TS:
				return validateEIVL_TS((EIVL_TS)value, diagnostics, context);
			case DatatypesPackage.BINARY_DATA_ENCODING:
				return validateBinaryDataEncoding((BinaryDataEncoding)value, diagnostics, context);
			case DatatypesPackage.TS_TYPE:
				return validatetsType((String)value, diagnostics, context);
			case DatatypesPackage.CS_TYPE:
				return validatecsType((String)value, diagnostics, context);
			case DatatypesPackage.UID:
				return validateuid((String)value, diagnostics, context);
			case DatatypesPackage.ST_TYPE:
				return validatestType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANY(ANY any, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(any, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBIN(BIN bin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateED(ED ed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ed, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ed, diagnostics, context);
		if (result || diagnostics != null) result &= validateED_validateThumbnailThumbnail(ed, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateThumbnailThumbnail constraint of '<em>ED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateED_validateThumbnailThumbnail(ED ed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ed.validateThumbnailThumbnail(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEL(TEL tel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURL(URL url, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(url, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSXCM_TS(SXCM_TS sxcM_TS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sxcM_TS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTS(TS ts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQTY(QTY qty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateST(ST st, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(st, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(st, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(st, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(st, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(st, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(st, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(st, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(st, diagnostics, context);
		if (result || diagnostics != null) result &= validateED_validateThumbnailThumbnail(st, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateThumbnail(st, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateReference(st, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateIntegrityCheck(st, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateIntegrityCheckAlgorithm(st, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateCompression(st, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateRepresentation(st, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateThumbnail constraint of '<em>ST</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateST_validateThumbnail(ST st, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return st.validateThumbnail(diagnostics, context);
	}

    /**
	 * Validates the validateReference constraint of '<em>ST</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateST_validateReference(ST st, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return st.validateReference(diagnostics, context);
	}

    /**
	 * Validates the validateIntegrityCheck constraint of '<em>ST</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateST_validateIntegrityCheck(ST st, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return st.validateIntegrityCheck(diagnostics, context);
	}

    /**
	 * Validates the validateCompression constraint of '<em>ST</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateST_validateCompression(ST st, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return st.validateCompression(diagnostics, context);
	}

				/**
	 * Validates the validateRepresentation constraint of '<em>ST</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateST_validateRepresentation(ST st, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return st.validateRepresentation(diagnostics, context);
	}

				/**
	 * Validates the validateIntegrityCheckAlgorithm constraint of '<em>ST</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateST_validateIntegrityCheckAlgorithm(ST st, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return st.validateIntegrityCheckAlgorithm(diagnostics, context);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCD(CD cd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCR(CR cr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCV(CV cv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cv, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validateCE_validateQualifier(cv, diagnostics, context);
		if (result || diagnostics != null) result &= validateCV_validateTranslation(cv, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTranslation constraint of '<em>CV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCV_validateTranslation(CV cv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cv.validateTranslation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCE(CE ce, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ce, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ce, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ce, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ce, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ce, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ce, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ce, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ce, diagnostics, context);
		if (result || diagnostics != null) result &= validateCE_validateQualifier(ce, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateQualifier constraint of '<em>CE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCE_validateQualifier(CE ce, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ce.validateQualifier(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateII(II ii, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ii, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBL(BL bl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBN(BN bn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bn, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bn, diagnostics, context);
		if (result || diagnostics != null) result &= validateBN_validateNullFlavor(bn, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNullFlavor constraint of '<em>BN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBN_validateNullFlavor(BN bn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bn.validateNullFlavor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ad, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateDelimiter(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateCountry(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateState(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateCounty(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateCity(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validatePostalCode(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateStreetAddressLine(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateHouseNumber(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateHouseNumberNumeric(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateDirection(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateStreetName(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateStreetNameBase(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateStreetNameType(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateAdditionalLocator(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateUnitID(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateUnitType(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateCareOf(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateCensusTract(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateDeliveryAddressLine(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateDeliveryInstallationType(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateDeliveryInstallationArea(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateDeliveryInstallationQualifier(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateDeliveryMode(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateDeliveryModeIdentifier(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validateBuildingNumberSuffix(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validatePostBox(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_validatePrecinct(ad, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDelimiter constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateDelimiter(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateDelimiter(diagnostics, context);
	}

	/**
	 * Validates the validateCountry constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateCountry(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateCountry(diagnostics, context);
	}

	/**
	 * Validates the validateState constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateState(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateState(diagnostics, context);
	}

	/**
	 * Validates the validateCounty constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateCounty(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateCounty(diagnostics, context);
	}

	/**
	 * Validates the validateCity constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateCity(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateCity(diagnostics, context);
	}

	/**
	 * Validates the validatePostalCode constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validatePostalCode(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validatePostalCode(diagnostics, context);
	}

	/**
	 * Validates the validateStreetAddressLine constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateStreetAddressLine(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateStreetAddressLine(diagnostics, context);
	}

	/**
	 * Validates the validateHouseNumber constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateHouseNumber(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateHouseNumber(diagnostics, context);
	}

	/**
	 * Validates the validateHouseNumberNumeric constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateHouseNumberNumeric(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateHouseNumberNumeric(diagnostics, context);
	}

	/**
	 * Validates the validateDirection constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateDirection(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateDirection(diagnostics, context);
	}

	/**
	 * Validates the validateStreetName constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateStreetName(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateStreetName(diagnostics, context);
	}

	/**
	 * Validates the validateStreetNameBase constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateStreetNameBase(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateStreetNameBase(diagnostics, context);
	}

	/**
	 * Validates the validateStreetNameType constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateStreetNameType(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateStreetNameType(diagnostics, context);
	}

	/**
	 * Validates the validateAdditionalLocator constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateAdditionalLocator(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateAdditionalLocator(diagnostics, context);
	}

	/**
	 * Validates the validateUnitID constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateUnitID(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateUnitID(diagnostics, context);
	}

	/**
	 * Validates the validateUnitType constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateUnitType(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateUnitType(diagnostics, context);
	}

	/**
	 * Validates the validateCareOf constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateCareOf(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateCareOf(diagnostics, context);
	}

	/**
	 * Validates the validateCensusTract constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateCensusTract(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateCensusTract(diagnostics, context);
	}

	/**
	 * Validates the validateDeliveryAddressLine constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateDeliveryAddressLine(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateDeliveryAddressLine(diagnostics, context);
	}

	/**
	 * Validates the validateDeliveryInstallationType constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateDeliveryInstallationType(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateDeliveryInstallationType(diagnostics, context);
	}

	/**
	 * Validates the validateDeliveryInstallationArea constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateDeliveryInstallationArea(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateDeliveryInstallationArea(diagnostics, context);
	}

	/**
	 * Validates the validateDeliveryInstallationQualifier constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateDeliveryInstallationQualifier(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateDeliveryInstallationQualifier(diagnostics, context);
	}

	/**
	 * Validates the validateDeliveryMode constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateDeliveryMode(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateDeliveryMode(diagnostics, context);
	}

	/**
	 * Validates the validateDeliveryModeIdentifier constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateDeliveryModeIdentifier(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateDeliveryModeIdentifier(diagnostics, context);
	}

	/**
	 * Validates the validateBuildingNumberSuffix constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validateBuildingNumberSuffix(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validateBuildingNumberSuffix(diagnostics, context);
	}

	/**
	 * Validates the validatePostBox constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validatePostBox(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validatePostBox(diagnostics, context);
	}

	/**
	 * Validates the validatePrecinct constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_validatePrecinct(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.validatePrecinct(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateADXP(ADXP adxp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(adxp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateED_validateThumbnailThumbnail(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateThumbnail(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateReference(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateIntegrityCheck(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateIntegrityCheckAlgorithm(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateCompression(adxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateRepresentation(adxp, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(en, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(en, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(en, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(en, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(en, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(en, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(en, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(en, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateDelimiter(en, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateFamily(en, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateGiven(en, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validatePrefix(en, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateSuffix(en, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDelimiter constraint of '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN_validateDelimiter(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return en.validateDelimiter(diagnostics, context);
	}

	/**
	 * Validates the validateFamily constraint of '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN_validateFamily(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return en.validateFamily(diagnostics, context);
	}

	/**
	 * Validates the validateGiven constraint of '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN_validateGiven(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return en.validateGiven(diagnostics, context);
	}

	/**
	 * Validates the validatePrefix constraint of '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN_validatePrefix(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return en.validatePrefix(diagnostics, context);
	}

	/**
	 * Validates the validateSuffix constraint of '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN_validateSuffix(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return en.validateSuffix(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVL_TS(IVL_TS ivL_TS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ivL_TS, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ivL_TS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ivL_TS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ivL_TS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ivL_TS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ivL_TS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ivL_TS, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ivL_TS, diagnostics, context);
		if (result || diagnostics != null) result &= validateIVL_TS_validateOptionsContainingLow(ivL_TS, diagnostics, context);
		if (result || diagnostics != null) result &= validateIVL_TS_validateOptionsContainingCenter(ivL_TS, diagnostics, context);
		if (result || diagnostics != null) result &= validateIVL_TS_validateOptionsContainingHigh(ivL_TS, diagnostics, context);
		if (result || diagnostics != null) result &= validateIVL_TS_validateOptionsContainingWidth(ivL_TS, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateOptionsContainingLow constraint of '<em>IVL TS</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateIVL_TS_validateOptionsContainingLow(IVL_TS ivL_TS, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return ivL_TS.validateOptionsContainingLow(diagnostics, context);
	}

    /**
	 * Validates the validateOptionsContainingCenter constraint of '<em>IVL TS</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateIVL_TS_validateOptionsContainingCenter(IVL_TS ivL_TS, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return ivL_TS.validateOptionsContainingCenter(diagnostics, context);
	}

    /**
	 * Validates the validateOptionsContainingHigh constraint of '<em>IVL TS</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateIVL_TS_validateOptionsContainingHigh(IVL_TS ivL_TS, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return ivL_TS.validateOptionsContainingHigh(diagnostics, context);
	}

    /**
	 * Validates the validateOptionsContainingWidth constraint of '<em>IVL TS</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateIVL_TS_validateOptionsContainingWidth(IVL_TS ivL_TS, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return ivL_TS.validateOptionsContainingWidth(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVXB_TS(IVXB_TS ivxB_TS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ivxB_TS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePQ(PQ pq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pq, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePQR(PQR pqr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pqr, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pqr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pqr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pqr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pqr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pqr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pqr, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pqr, diagnostics, context);
		if (result || diagnostics != null) result &= validateCE_validateQualifier(pqr, diagnostics, context);
		if (result || diagnostics != null) result &= validateCV_validateTranslation(pqr, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENXP(ENXP enxp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enxp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateED_validateThumbnailThumbnail(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateThumbnail(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateReference(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateIntegrityCheck(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateIntegrityCheckAlgorithm(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateCompression(enxp, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateRepresentation(enxp, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateON(ON on, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(on, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(on, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(on, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(on, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(on, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(on, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(on, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(on, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateDelimiter(on, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateFamily(on, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateGiven(on, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validatePrefix(on, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateSuffix(on, diagnostics, context);
		if (result || diagnostics != null) result &= validateON_validateInvariant(on, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariant constraint of '<em>ON</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateON_validateInvariant(ON on, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return on.validateInvariant(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePN(PN pn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pn, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateDelimiter(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateFamily(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateGiven(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validatePrefix(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateSuffix(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validatePN_validateInvariant(pn, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariant constraint of '<em>PN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePN_validateInvariant(PN pn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pn.validateInvariant(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTN(TN tn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tn, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateDelimiter(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateFamily(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateGiven(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validatePrefix(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_validateSuffix(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTN_validateInvariant(tn, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInvariant constraint of '<em>TN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTN_validateInvariant(TN tn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tn.validateInvariant(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINT(INT int_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(int_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREAL(REAL real, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(real, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCS(CS cs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cs, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validateCE_validateQualifier(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validateCV_validateTranslation(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validateCS_validateOriginalText(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validateCS_validateCodeSystem(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validateCS_validateCodeSystemName(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validateCS_validateCodeSystemVersion(cs, diagnostics, context);
		if (result || diagnostics != null) result &= validateCS_validateDisplayName(cs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateOriginalText constraint of '<em>CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCS_validateOriginalText(CS cs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cs.validateOriginalText(diagnostics, context);
	}

	/**
	 * Validates the validateCodeSystem constraint of '<em>CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCS_validateCodeSystem(CS cs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cs.validateCodeSystem(diagnostics, context);
	}

	/**
	 * Validates the validateCodeSystemName constraint of '<em>CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCS_validateCodeSystemName(CS cs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cs.validateCodeSystemName(diagnostics, context);
	}

	/**
	 * Validates the validateCodeSystemVersion constraint of '<em>CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCS_validateCodeSystemVersion(CS cs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cs.validateCodeSystemVersion(diagnostics, context);
	}

	/**
	 * Validates the validateDisplayName constraint of '<em>CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCS_validateDisplayName(CS cs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cs.validateDisplayName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCO(CO co, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(co, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(co, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(co, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(co, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(co, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(co, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(co, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(co, diagnostics, context);
		if (result || diagnostics != null) result &= validateCE_validateQualifier(co, diagnostics, context);
		if (result || diagnostics != null) result &= validateCV_validateTranslation(co, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSC(SC sc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sc, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validateED_validateThumbnailThumbnail(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateThumbnail(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateReference(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateIntegrityCheck(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateIntegrityCheckAlgorithm(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateCompression(sc, diagnostics, context);
		if (result || diagnostics != null) result &= validateST_validateRepresentation(sc, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTO_QTY_QTY(RTO_QTY_QTY rtO_QTY_QTY, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rtO_QTY_QTY, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rtO_QTY_QTY, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rtO_QTY_QTY, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rtO_QTY_QTY, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rtO_QTY_QTY, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rtO_QTY_QTY, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rtO_QTY_QTY, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rtO_QTY_QTY, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTO_QTY_QTY_validateDenominator(rtO_QTY_QTY, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDenominator constraint of '<em>RTO QTY QTY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTO_QTY_QTY_validateDenominator(RTO_QTY_QTY rtO_QTY_QTY, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtO_QTY_QTY.validateDenominator(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMO(MO mo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTO(RTO rto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rto, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rto, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rto, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTO_QTY_QTY_validateDenominator(rto, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSXCM_INT(SXCM_INT sxcM_INT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sxcM_INT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVXB_INT(IVXB_INT ivxB_INT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ivxB_INT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVL_INT(IVL_INT ivL_INT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ivL_INT, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ivL_INT, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ivL_INT, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ivL_INT, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ivL_INT, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ivL_INT, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ivL_INT, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ivL_INT, diagnostics, context);
		if (result || diagnostics != null) result &= validateIVL_INT_validateOptionsContainingLow(ivL_INT, diagnostics, context);
		if (result || diagnostics != null) result &= validateIVL_INT_validateOptionsContainingCenter(ivL_INT, diagnostics, context);
		if (result || diagnostics != null) result &= validateIVL_INT_validateOptionsContainingHigh(ivL_INT, diagnostics, context);
		if (result || diagnostics != null) result &= validateIVL_INT_validateOptionsContainingWidth(ivL_INT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateOptionsContainingLow constraint of '<em>IVL INT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVL_INT_validateOptionsContainingLow(IVL_INT ivL_INT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ivL_INT.validateOptionsContainingLow(diagnostics, context);
	}

	/**
	 * Validates the validateOptionsContainingCenter constraint of '<em>IVL INT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVL_INT_validateOptionsContainingCenter(IVL_INT ivL_INT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ivL_INT.validateOptionsContainingCenter(diagnostics, context);
	}

	/**
	 * Validates the validateOptionsContainingHigh constraint of '<em>IVL INT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVL_INT_validateOptionsContainingHigh(IVL_INT ivL_INT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ivL_INT.validateOptionsContainingHigh(diagnostics, context);
	}

	/**
	 * Validates the validateOptionsContainingWidth constraint of '<em>IVL INT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVL_INT_validateOptionsContainingWidth(IVL_INT ivL_INT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ivL_INT.validateOptionsContainingWidth(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVXB_PQ(IVXB_PQ ivxB_PQ, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ivxB_PQ, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSXCM_PQ(SXCM_PQ sxcM_PQ, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sxcM_PQ, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIVL_PQ(IVL_PQ ivL_PQ, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ivL_PQ, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ivL_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ivL_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ivL_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ivL_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ivL_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ivL_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ivL_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validateIVL_PQ_validateOptionsContainingLow(ivL_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validateIVL_PQ_validateOptionsContainingCenter(ivL_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validateIVL_PQ_validateOptionsContainingHigh(ivL_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validateIVL_PQ_validateOptionsContainingWidth(ivL_PQ, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateOptionsContainingLow constraint of '<em>IVL PQ</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateIVL_PQ_validateOptionsContainingLow(IVL_PQ ivL_PQ, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return ivL_PQ.validateOptionsContainingLow(diagnostics, context);
	}

    /**
	 * Validates the validateOptionsContainingCenter constraint of '<em>IVL PQ</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateIVL_PQ_validateOptionsContainingCenter(IVL_PQ ivL_PQ, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return ivL_PQ.validateOptionsContainingCenter(diagnostics, context);
	}

    /**
	 * Validates the validateOptionsContainingHigh constraint of '<em>IVL PQ</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateIVL_PQ_validateOptionsContainingHigh(IVL_PQ ivL_PQ, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return ivL_PQ.validateOptionsContainingHigh(diagnostics, context);
	}

    /**
	 * Validates the validateOptionsContainingWidth constraint of '<em>IVL PQ</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateIVL_PQ_validateOptionsContainingWidth(IVL_PQ ivL_PQ, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		return ivL_PQ.validateOptionsContainingWidth(diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTO_PQ_PQ(RTO_PQ_PQ rtO_PQ_PQ, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rtO_PQ_PQ, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rtO_PQ_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rtO_PQ_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rtO_PQ_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rtO_PQ_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rtO_PQ_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rtO_PQ_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rtO_PQ_PQ, diagnostics, context);
		if (result || diagnostics != null) result &= validateRTO_PQ_PQ_validateDenominator(rtO_PQ_PQ, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDenominator constraint of '<em>RTO PQ PQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTO_PQ_PQ_validateDenominator(RTO_PQ_PQ rtO_PQ_PQ, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rtO_PQ_PQ.validateDenominator(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePIVL_TS(PIVL_TS pivL_TS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pivL_TS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEIVL_event(EIVL_event eivL_event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eivL_event, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eivL_event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eivL_event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eivL_event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eivL_event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eivL_event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eivL_event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eivL_event, diagnostics, context);
		if (result || diagnostics != null) result &= validateCE_validateQualifier(eivL_event, diagnostics, context);
		if (result || diagnostics != null) result &= validateEIVL_event_validateOriginalText(eivL_event, diagnostics, context);
		if (result || diagnostics != null) result &= validateEIVL_event_validateTranslation(eivL_event, diagnostics, context);
		if (result || diagnostics != null) result &= validateEIVL_event_validateCodeSystem(eivL_event, diagnostics, context);
		if (result || diagnostics != null) result &= validateEIVL_event_validateCodeSystemName(eivL_event, diagnostics, context);
		if (result || diagnostics != null) result &= validateEIVL_event_validateCode(eivL_event, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateOriginalText constraint of '<em>EIVL event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEIVL_event_validateOriginalText(EIVL_event eivL_event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eivL_event.validateOriginalText(diagnostics, context);
	}

	/**
	 * Validates the validateTranslation constraint of '<em>EIVL event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEIVL_event_validateTranslation(EIVL_event eivL_event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eivL_event.validateTranslation(diagnostics, context);
	}

	/**
	 * Validates the validateCodeSystem constraint of '<em>EIVL event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEIVL_event_validateCodeSystem(EIVL_event eivL_event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eivL_event.validateCodeSystem(diagnostics, context);
	}

	/**
	 * Validates the validateCodeSystemName constraint of '<em>EIVL event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEIVL_event_validateCodeSystemName(EIVL_event eivL_event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eivL_event.validateCodeSystemName(diagnostics, context);
	}

	/**
	 * Validates the validateCode constraint of '<em>EIVL event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEIVL_event_validateCode(EIVL_event eivL_event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eivL_event.validateCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEIVL_TS(EIVL_TS eivL_TS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eivL_TS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryDataEncoding(BinaryDataEncoding binaryDataEncoding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecsType(String csType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatecsType_Pattern(csType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatecsType_Pattern
	 */
	public static final  PatternMatcher [][] CS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^\\s]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>cs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecsType_Pattern(String csType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DatatypesPackage.Literals.CS_TYPE, csType, CS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateuid(String uid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateuid_Pattern(uid, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateuid_Pattern
	 */
	public static final  PatternMatcher [][] UID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-2](\\.(0|[1-9][0-9]*))*"),
				XMLTypeUtil.createPatternMatcher("[0-9a-zA-Z]{8}-[0-9a-zA-Z]{4}-[0-9a-zA-Z]{4}-[0-9a-zA-Z]{4}-[0-9a-zA-Z]{12}"),
				XMLTypeUtil.createPatternMatcher("[A-Za-z][A-Za-z0-9\\-]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>uid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateuid_Pattern(String uid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DatatypesPackage.Literals.UID, uid, UID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestType(String stType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatestType_Pattern(stType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatestType_Pattern
	 */
	public static final  PatternMatcher [][] ST_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>st Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestType_Pattern(String stType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DatatypesPackage.Literals.ST_TYPE, stType, ST_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetsType(String tsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatetsType_Pattern(tsType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatetsType_Pattern
	 */
	public static final  PatternMatcher [][] TS_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]{1,8}|([0-9]{9,14}|[0-9]{14,14}\\.[0-9]+)([+\\-][0-9]{1,4})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>ts Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetsType_Pattern(String tsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DatatypesPackage.Literals.TS_TYPE, tsType, TS_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DatatypesPlugin.INSTANCE;
	}

} //DatatypesValidator
