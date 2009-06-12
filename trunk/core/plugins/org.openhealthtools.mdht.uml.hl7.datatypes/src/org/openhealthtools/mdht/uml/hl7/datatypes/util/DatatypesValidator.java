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

import org.openhealthtools.mdht.uml.hl7.datatypes.*;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Null Flavor' of 'BN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BN__NULL_FLAVOR = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Delimiter' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIMITER = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Country' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__COUNTRY = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'State' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STATE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'County' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__COUNTY = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'City' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__CITY = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Postal Code' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__POSTAL_CODE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Street Address Line' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STREET_ADDRESS_LINE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'House Number' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__HOUSE_NUMBER = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'House Number Numeric' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__HOUSE_NUMBER_NUMERIC = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Direction' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DIRECTION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Street Name' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STREET_NAME = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Street Name Base' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STREET_NAME_BASE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Street Name Type' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__STREET_NAME_TYPE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Additional Locator' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__ADDITIONAL_LOCATOR = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unit ID' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__UNIT_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unit Type' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__UNIT_TYPE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Care Of' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__CARE_OF = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Census Tract' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__CENSUS_TRACT = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Delivery Address Line' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_ADDRESS_LINE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Delivery Installation Type' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_INSTALLATION_TYPE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Delivery Installation Area' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_INSTALLATION_AREA = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Delivery Installation Qualifier' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_INSTALLATION_QUALIFIER = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Delivery Mode' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_MODE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Delivery Mode Identifier' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__DELIVERY_MODE_IDENTIFIER = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Building Number Suffix' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__BUILDING_NUMBER_SUFFIX = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Post Box' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__POST_BOX = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Precinct' of 'AD'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD__PRECINCT = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Delimiter' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__DELIMITER = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__FAMILY = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Given' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__GIVEN = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Prefix' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__PREFIX = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Suffix' of 'EN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EN__SUFFIX = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Invariant' of 'ON'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ON__INVARIANT = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Invariant' of 'PN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PN__INVARIANT = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Invariant' of 'TN'.
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
		if (result || diagnostics != null) result &= validateBN_nullFlavor(bn, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nullFlavor constraint of '<em>BN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBN_nullFlavor(BN bn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bn.nullFlavor(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateAD_delimiter(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_country(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_state(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_county(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_city(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_postalCode(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_streetAddressLine(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_houseNumber(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_houseNumberNumeric(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_direction(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_streetName(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_streetNameBase(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_streetNameType(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_additionalLocator(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_unitID(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_unitType(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_careOf(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_censusTract(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_deliveryAddressLine(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_deliveryInstallationType(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_deliveryInstallationArea(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_deliveryInstallationQualifier(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_deliveryMode(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_deliveryModeIdentifier(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_buildingNumberSuffix(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_postBox(ad, diagnostics, context);
		if (result || diagnostics != null) result &= validateAD_precinct(ad, diagnostics, context);
		return result;
	}

	/**
	 * Validates the delimiter constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_delimiter(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.delimiter(diagnostics, context);
	}

	/**
	 * Validates the country constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_country(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.country(diagnostics, context);
	}

	/**
	 * Validates the state constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_state(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.state(diagnostics, context);
	}

	/**
	 * Validates the county constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_county(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.county(diagnostics, context);
	}

	/**
	 * Validates the city constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_city(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.city(diagnostics, context);
	}

	/**
	 * Validates the postalCode constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_postalCode(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.postalCode(diagnostics, context);
	}

	/**
	 * Validates the streetAddressLine constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_streetAddressLine(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.streetAddressLine(diagnostics, context);
	}

	/**
	 * Validates the houseNumber constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_houseNumber(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.houseNumber(diagnostics, context);
	}

	/**
	 * Validates the houseNumberNumeric constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_houseNumberNumeric(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.houseNumberNumeric(diagnostics, context);
	}

	/**
	 * Validates the direction constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_direction(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.direction(diagnostics, context);
	}

	/**
	 * Validates the streetName constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_streetName(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.streetName(diagnostics, context);
	}

	/**
	 * Validates the streetNameBase constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_streetNameBase(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.streetNameBase(diagnostics, context);
	}

	/**
	 * Validates the streetNameType constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_streetNameType(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.streetNameType(diagnostics, context);
	}

	/**
	 * Validates the additionalLocator constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_additionalLocator(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.additionalLocator(diagnostics, context);
	}

	/**
	 * Validates the unitID constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_unitID(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.unitID(diagnostics, context);
	}

	/**
	 * Validates the unitType constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_unitType(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.unitType(diagnostics, context);
	}

	/**
	 * Validates the careOf constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_careOf(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.careOf(diagnostics, context);
	}

	/**
	 * Validates the censusTract constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_censusTract(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.censusTract(diagnostics, context);
	}

	/**
	 * Validates the deliveryAddressLine constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_deliveryAddressLine(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.deliveryAddressLine(diagnostics, context);
	}

	/**
	 * Validates the deliveryInstallationType constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_deliveryInstallationType(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.deliveryInstallationType(diagnostics, context);
	}

	/**
	 * Validates the deliveryInstallationArea constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_deliveryInstallationArea(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.deliveryInstallationArea(diagnostics, context);
	}

	/**
	 * Validates the deliveryInstallationQualifier constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_deliveryInstallationQualifier(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.deliveryInstallationQualifier(diagnostics, context);
	}

	/**
	 * Validates the deliveryMode constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_deliveryMode(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.deliveryMode(diagnostics, context);
	}

	/**
	 * Validates the deliveryModeIdentifier constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_deliveryModeIdentifier(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.deliveryModeIdentifier(diagnostics, context);
	}

	/**
	 * Validates the buildingNumberSuffix constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_buildingNumberSuffix(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.buildingNumberSuffix(diagnostics, context);
	}

	/**
	 * Validates the postBox constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_postBox(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.postBox(diagnostics, context);
	}

	/**
	 * Validates the precinct constraint of '<em>AD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAD_precinct(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ad.precinct(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEN_delimiter(en, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_family(en, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_given(en, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_prefix(en, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_suffix(en, diagnostics, context);
		return result;
	}

	/**
	 * Validates the delimiter constraint of '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN_delimiter(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return en.delimiter(diagnostics, context);
	}

	/**
	 * Validates the family constraint of '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN_family(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return en.family(diagnostics, context);
	}

	/**
	 * Validates the given constraint of '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN_given(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return en.given(diagnostics, context);
	}

	/**
	 * Validates the prefix constraint of '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN_prefix(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return en.prefix(diagnostics, context);
	}

	/**
	 * Validates the suffix constraint of '<em>EN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEN_suffix(EN en, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return en.suffix(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEN_delimiter(on, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_family(on, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_given(on, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_prefix(on, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_suffix(on, diagnostics, context);
		if (result || diagnostics != null) result &= validateON_invariant(on, diagnostics, context);
		return result;
	}

	/**
	 * Validates the invariant constraint of '<em>ON</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateON_invariant(ON on, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return on.invariant(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEN_delimiter(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_family(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_given(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_prefix(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_suffix(pn, diagnostics, context);
		if (result || diagnostics != null) result &= validatePN_invariant(pn, diagnostics, context);
		return result;
	}

	/**
	 * Validates the invariant constraint of '<em>PN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePN_invariant(PN pn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pn.invariant(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEN_delimiter(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_family(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_given(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_prefix(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validateEN_suffix(tn, diagnostics, context);
		if (result || diagnostics != null) result &= validateTN_invariant(tn, diagnostics, context);
		return result;
	}

	/**
	 * Validates the invariant constraint of '<em>TN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTN_invariant(TN tn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tn.invariant(diagnostics, context);
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
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DatatypesValidator
