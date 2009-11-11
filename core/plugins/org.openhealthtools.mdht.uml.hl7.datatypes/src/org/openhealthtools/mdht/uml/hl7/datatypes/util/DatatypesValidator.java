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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Null Flavor' of 'BN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BN__NULL_FLAVOR = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delimiter' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIMITER = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Country' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__COUNTRY = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate State' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STATE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate County' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__COUNTY = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate City' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__CITY = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Postal Code' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__POSTAL_CODE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Street Address Line' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STREET_ADDRESS_LINE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate House Number' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__HOUSE_NUMBER = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate House Number Numeric' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__HOUSE_NUMBER_NUMERIC = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Direction' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DIRECTION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Street Name' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STREET_NAME = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Street Name Base' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STREET_NAME_BASE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Street Name Type' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STREET_NAME_TYPE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Additional Locator' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__ADDITIONAL_LOCATOR = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unit ID' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__UNIT_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unit Type' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__UNIT_TYPE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Care Of' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__CARE_OF = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Census Tract' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__CENSUS_TRACT = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delivery Address Line' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_ADDRESS_LINE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delivery Installation Type' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_INSTALLATION_TYPE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delivery Installation Area' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_INSTALLATION_AREA = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delivery Installation Qualifier' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_INSTALLATION_QUALIFIER = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delivery Mode' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_MODE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delivery Mode Identifier' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_MODE_IDENTIFIER = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Building Number Suffix' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__BUILDING_NUMBER_SUFFIX = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Post Box' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__POST_BOX = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Precinct' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__PRECINCT = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Delimiter' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__DELIMITER = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__FAMILY = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Given' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__GIVEN = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prefix' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__PREFIX = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Suffix' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__SUFFIX = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariant' of 'ON'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ON__INVARIANT = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariant' of 'PN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PN__INVARIANT = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Invariant' of 'TN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TN__INVARIANT = 36;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 36;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesValidator() {
		super();
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
			case DatatypesPackage.IVL_TS:
				return validateIVL_TS((IVL_TS)value, diagnostics, context);
			case DatatypesPackage.IVXB_TS:
				return validateIVXB_TS((IVXB_TS)value, diagnostics, context);
			case DatatypesPackage.PQ:
				return validatePQ((PQ)value, diagnostics, context);
			case DatatypesPackage.PQR:
				return validatePQR((PQR)value, diagnostics, context);
			case DatatypesPackage.ENXP:
				return validateENXP((ENXP)value, diagnostics, context);
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
			case DatatypesPackage.BINARY_DATA_ENCODING:
				return validateBinaryDataEncoding((BinaryDataEncoding)value, diagnostics, context);
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
		return validate_EveryDefaultConstraint(ed, diagnostics, context);
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
		return validate_EveryDefaultConstraint(st, diagnostics, context);
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
		return validate_EveryDefaultConstraint(cv, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCE(CE ce, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ce, diagnostics, context);
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
		return validate_EveryDefaultConstraint(adxp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		return validate_EveryDefaultConstraint(ivL_TS, diagnostics, context);
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
		return validate_EveryDefaultConstraint(pqr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENXP(ENXP enxp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enxp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateON(ON on, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		return validate_EveryDefaultConstraint(cs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCO(CO co, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(co, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSC(SC sc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTO_QTY_QTY(RTO_QTY_QTY rtO_QTY_QTY, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rtO_QTY_QTY, diagnostics, context);
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
		return validate_EveryDefaultConstraint(rto, diagnostics, context);
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
		return validate_EveryDefaultConstraint(ivL_INT, diagnostics, context);
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
		return validate_EveryDefaultConstraint(ivL_PQ, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRTO_PQ_PQ(RTO_PQ_PQ rtO_PQ_PQ, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rtO_PQ_PQ, diagnostics, context);
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
	public boolean validateBinaryDataEncoding(BinaryDataEncoding binaryDataEncoding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
