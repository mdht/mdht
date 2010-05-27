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
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesValidator;
import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>AD</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDelimiter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateCounty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate County</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validatePostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateHouseNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate House Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateHouseNumberNumeric(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate House Number Numeric</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDirection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Direction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateStreetName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateStreetNameBase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Name Base</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateStreetNameType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Name Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateAdditionalLocator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Locator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateUnitID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateUnitType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateCareOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateCensusTract(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Census Tract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDeliveryAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDeliveryInstallationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Installation Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDeliveryInstallationArea(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Installation Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDeliveryInstallationQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Installation Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDeliveryMode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Mode</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateDeliveryModeIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Mode Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validateBuildingNumberSuffix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Building Number Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validatePostBox(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Box</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#validatePrecinct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precinct</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDelimiter(java.lang.String) <em>Add Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addCountry(java.lang.String) <em>Add Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addState(java.lang.String) <em>Add State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addCounty(java.lang.String) <em>Add County</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addCity(java.lang.String) <em>Add City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addPostalCode(java.lang.String) <em>Add Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addStreetAddressLine(java.lang.String) <em>Add Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addHouseNumber(java.lang.String) <em>Add House Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addHouseNumberNumeric(java.lang.String) <em>Add House Number Numeric</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDirection(java.lang.String) <em>Add Direction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addStreetName(java.lang.String) <em>Add Street Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addStreetNameBase(java.lang.String) <em>Add Street Name Base</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addStreetNameType(java.lang.String) <em>Add Street Name Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addAdditionalLocator(java.lang.String) <em>Add Additional Locator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addUnitID(java.lang.String) <em>Add Unit ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addUnitType(java.lang.String) <em>Add Unit Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addCareOf(java.lang.String) <em>Add Care Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addCensusTract(java.lang.String) <em>Add Census Tract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDeliveryAddressLine(java.lang.String) <em>Add Delivery Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDeliveryInstallationType(java.lang.String) <em>Add Delivery Installation Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDeliveryInstallationArea(java.lang.String) <em>Add Delivery Installation Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDeliveryInstallationQualifier(java.lang.String) <em>Add Delivery Installation Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDeliveryMode(java.lang.String) <em>Add Delivery Mode</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addDeliveryModeIdentifier(java.lang.String) <em>Add Delivery Mode Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addBuildingNumberSuffix(java.lang.String) <em>Add Building Number Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addPostBox(java.lang.String) <em>Add Post Box</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addPrecinct(java.lang.String) <em>Add Precinct</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#addText(java.lang.String) <em>Add Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#getText() <em>Get Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ADOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDelimiter(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delimiter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelimiter(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.delimiter->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DEL)";

	/**
	 * The cached OCL invariant for the '{@link #validateDelimiter(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delimiter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDelimiter(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.delimiter->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DEL)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDelimiter(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIMITER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateDelimiter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCountry(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCountry(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.country->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CNT)";

	/**
	 * The cached OCL invariant for the '{@link #validateCountry(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCountry(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.country->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CNT)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCountry(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__COUNTRY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCountry", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateState(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateState(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.state->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STA)";

	/**
	 * The cached OCL invariant for the '{@link #validateState(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate State</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateState(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.state->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STA)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateState(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__STATE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateState", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCounty(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate County</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCounty(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.county->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CPA)";

	/**
	 * The cached OCL invariant for the '{@link #validateCounty(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate County</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCounty(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.county->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CPA)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCounty(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__COUNTY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCounty", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCity(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate City</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCity(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.city->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CTY)";

	/**
	 * The cached OCL invariant for the '{@link #validateCity(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate City</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCity(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.city->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CTY)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCity(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__CITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCity", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostalCode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostalCode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.postalCode->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::ZIP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePostalCode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostalCode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.postalCode->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::ZIP)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePostalCode(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__POSTAL_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePostalCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStreetAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStreetAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.streetAddressLine->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::SAL)";

	/**
	 * The cached OCL invariant for the '{@link #validateStreetAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStreetAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.streetAddressLine->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::SAL)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateStreetAddressLine(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__STREET_ADDRESS_LINE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateStreetAddressLine", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHouseNumber(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate House Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHouseNumber(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.houseNumber->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNR)";

	/**
	 * The cached OCL invariant for the '{@link #validateHouseNumber(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate House Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHouseNumber(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.houseNumber->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNR)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHouseNumber(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__HOUSE_NUMBER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateHouseNumber", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHouseNumberNumeric(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate House Number Numeric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHouseNumberNumeric(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.houseNumberNumeric->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNN)";

	/**
	 * The cached OCL invariant for the '{@link #validateHouseNumberNumeric(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate House Number Numeric</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHouseNumberNumeric(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.houseNumberNumeric->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNN)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHouseNumberNumeric(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__HOUSE_NUMBER_NUMERIC,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateHouseNumberNumeric", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDirection(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Direction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDirection(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.direction->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DIR)";

	/**
	 * The cached OCL invariant for the '{@link #validateDirection(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Direction</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDirection(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.direction->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DIR)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDirection(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DIRECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateDirection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStreetName(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStreetName(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.streetName->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STR)";

	/**
	 * The cached OCL invariant for the '{@link #validateStreetName(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStreetName(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.streetName->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STR)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateStreetName(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__STREET_NAME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateStreetName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStreetNameBase(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Name Base</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStreetNameBase(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.streetNameBase->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STB)";

	/**
	 * The cached OCL invariant for the '{@link #validateStreetNameBase(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Name Base</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStreetNameBase(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.streetNameBase->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STB)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateStreetNameBase(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__STREET_NAME_BASE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateStreetNameBase", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStreetNameType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Name Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStreetNameType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.streetNameType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STTYP)";

	/**
	 * The cached OCL invariant for the '{@link #validateStreetNameType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Street Name Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStreetNameType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.streetNameType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STTYP)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateStreetNameType(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__STREET_NAME_TYPE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateStreetNameType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalLocator(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Locator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalLocator(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.additionalLocator->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::ADL)";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalLocator(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Locator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalLocator(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.additionalLocator->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::ADL)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdditionalLocator(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__ADDITIONAL_LOCATOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAdditionalLocator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitID(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitID(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.unitID->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::UNID)";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitID(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitID(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.unitID->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::UNID)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateUnitID(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__UNIT_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateUnitID", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUnitType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.unitType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::UNIT)";

	/**
	 * The cached OCL invariant for the '{@link #validateUnitType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUnitType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.unitType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::UNIT)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateUnitType(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__UNIT_TYPE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateUnitType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCareOf(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareOf(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.careOf->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CAR)";

	/**
	 * The cached OCL invariant for the '{@link #validateCareOf(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Care Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCareOf(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.careOf->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CAR)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCareOf(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__CARE_OF,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCareOf", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCensusTract(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Census Tract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCensusTract(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.censusTract->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CEN)";

	/**
	 * The cached OCL invariant for the '{@link #validateCensusTract(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Census Tract</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCensusTract(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.censusTract->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CEN)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCensusTract(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__CENSUS_TRACT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCensusTract", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeliveryAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeliveryAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.deliveryAddressLine->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DAL)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeliveryAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeliveryAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.deliveryAddressLine->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DAL)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDeliveryAddressLine(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIVERY_ADDRESS_LINE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateDeliveryAddressLine", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeliveryInstallationType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Installation Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeliveryInstallationType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.deliveryInstallationType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINST)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeliveryInstallationType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Installation Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeliveryInstallationType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.deliveryInstallationType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINST)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDeliveryInstallationType(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIVERY_INSTALLATION_TYPE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateDeliveryInstallationType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeliveryInstallationArea(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Installation Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeliveryInstallationArea(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.deliveryInstallationArea->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINSTA)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeliveryInstallationArea(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Installation Area</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeliveryInstallationArea(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.deliveryInstallationArea->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINSTA)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDeliveryInstallationArea(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIVERY_INSTALLATION_AREA,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateDeliveryInstallationArea", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeliveryInstallationQualifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Installation Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeliveryInstallationQualifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.deliveryInstallationQualifier->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINSTQ)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeliveryInstallationQualifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Installation Qualifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeliveryInstallationQualifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.deliveryInstallationQualifier->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINSTQ)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDeliveryInstallationQualifier(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIVERY_INSTALLATION_QUALIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateDeliveryInstallationQualifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeliveryMode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeliveryMode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.deliveryMode->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DMOD)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeliveryMode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Mode</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeliveryMode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.deliveryMode->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DMOD)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDeliveryMode(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIVERY_MODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateDeliveryMode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeliveryModeIdentifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Mode Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeliveryModeIdentifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.deliveryModeIdentifier->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DMODID)";

	/**
	 * The cached OCL invariant for the '{@link #validateDeliveryModeIdentifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delivery Mode Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeliveryModeIdentifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.deliveryModeIdentifier->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DMODID)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDeliveryModeIdentifier(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIVERY_MODE_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateDeliveryModeIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBuildingNumberSuffix(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Building Number Suffix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBuildingNumberSuffix(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.buildingNumberSuffix->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNS)";

	/**
	 * The cached OCL invariant for the '{@link #validateBuildingNumberSuffix(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Building Number Suffix</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBuildingNumberSuffix(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.buildingNumberSuffix->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNS)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateBuildingNumberSuffix(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__BUILDING_NUMBER_SUFFIX,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateBuildingNumberSuffix", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePostBox(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Box</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostBox(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.postBox->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::POB)";

	/**
	 * The cached OCL invariant for the '{@link #validatePostBox(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Post Box</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePostBox(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.postBox->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::POB)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePostBox(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__POST_BOX,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePostBox", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrecinct(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precinct</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrecinct(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precinct->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::PRE)";

	/**
	 * The cached OCL invariant for the '{@link #validatePrecinct(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precinct</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrecinct(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.precinct->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::PRE)
	 * @param ad The receiving '<em><b>AD</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePrecinct(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				VALIDATE_PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__PRECINCT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePrecinct", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDelimiter(AD ad, String delimiter) {
		if (delimiter == null) {
			throw new IllegalArgumentException("delimiter is null");
		}
		ad.getDelimiters().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DEL, delimiter));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addCountry(AD ad, String country) {
		if (country == null) {
			throw new IllegalArgumentException("country is null");
		}
		ad.getCountries().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CNT, country));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addState(AD ad, String state) {
		if (state == null) {
			throw new IllegalArgumentException("state is null");
		}
		ad.getStates().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STA, state));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addCounty(AD ad, String county) {
		if (county == null) {
			throw new IllegalArgumentException("county is null");
		}
		ad.getCounties().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CPA, county));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addCity(AD ad, String city) {
		if (city == null) {
			throw new IllegalArgumentException("city is null");
		}
		ad.getCities().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CTY, city));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addPostalCode(AD ad, String postalCode) {
		if (postalCode == null) {
			throw new IllegalArgumentException("postalCode is null");
		}
		ad.getPostalCodes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ZIP, postalCode));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addStreetAddressLine(AD ad, String streetAddressLine) {
		if (streetAddressLine == null) {
			throw new IllegalArgumentException("streetAddressLine is null");
		}
		ad.getStreetAddressLines().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.SAL, streetAddressLine));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addHouseNumber(AD ad, String houseNumber) {
		if (houseNumber == null) {
			throw new IllegalArgumentException("houseNumber is null");
		}
		ad.getHouseNumbers().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.BNR, houseNumber));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addHouseNumberNumeric(AD ad, String houseNumberNumeric) {
		if (houseNumberNumeric == null) {
			throw new IllegalArgumentException("houseNumberNumeric is null");
		}
		ad.getHouseNumberNumerics().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.BNN, houseNumberNumeric));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDirection(AD ad, String direction) {
		if (direction == null) {
			throw new IllegalArgumentException("direction is null");
		}
		ad.getDirections().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DIR, direction));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addStreetName(AD ad, String streetName) {
		if (streetName == null) {
			throw new IllegalArgumentException("streetName is null");
		}
		ad.getStreetNames().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STR, streetName));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addStreetNameBase(AD ad, String streetNameBase) {
		if (streetNameBase == null) {
			throw new IllegalArgumentException("streetNameBase is null");
		}
		ad.getStreetNameBases().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STB, streetNameBase));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addStreetNameType(AD ad, String streetNameType) {
		if (streetNameType == null) {
			throw new IllegalArgumentException("streetNameType is null");
		}
		ad.getStreetNameTypes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STTYP, streetNameType));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addAdditionalLocator(AD ad, String additionalLocator) {
		if (additionalLocator == null) {
			throw new IllegalArgumentException("additionalLocator is null");
		}
		ad.getAdditionalLocators().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, additionalLocator));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addUnitID(AD ad, String unitID) {
		if (unitID == null) {
			throw new IllegalArgumentException("unitID is null");
		}
		ad.getUnitIDs().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.UNID, unitID));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addUnitType(AD ad, String unitType) {
		if (unitType == null) {
			throw new IllegalArgumentException("unitType is null");
		}
		ad.getUnitTypes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.UNIT, unitType));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addCareOf(AD ad, String careOf) {
		if (careOf == null) {
			throw new IllegalArgumentException("careOf is null");
		}
		ad.getCareOfs().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CAR, careOf));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addCensusTract(AD ad, String censusTract) {
		if (censusTract == null) {
			throw new IllegalArgumentException("censusTract is null");
		}
		ad.getCensusTracts().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CEN, censusTract));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDeliveryAddressLine(AD ad, String deliveryAddressLine) {
		if (deliveryAddressLine == null) {
			throw new IllegalArgumentException("deliveryAddressLine is null");
		}
		ad.getDeliveryAddressLines().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DAL, deliveryAddressLine));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDeliveryInstallationType(AD ad, String deliveryInstallationType) {
		if (deliveryInstallationType == null) {
			throw new IllegalArgumentException("deliveryInstallationType is null");
		}
		ad.getDeliveryInstallationTypes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DINST, deliveryInstallationType));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDeliveryInstallationArea(AD ad, String deliveryInstallationArea) {
		if (deliveryInstallationArea == null) {
			throw new IllegalArgumentException("deliveryInstallationArea is null");
		}
		ad.getDeliveryInstallationAreas().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DINSTA, deliveryInstallationArea));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDeliveryInstallationQualifier(AD ad, String deliveryInstallationQualifier) {
		if (deliveryInstallationQualifier == null) {
			throw new IllegalArgumentException("deliveryInstallationQualifier is null");
		}
		ad.getDeliveryInstallationQualifiers().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DINSTQ, deliveryInstallationQualifier));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDeliveryMode(AD ad, String deliveryMode) {
		if (deliveryMode == null) {
			throw new IllegalArgumentException("deliveryMode is null");
		}
		ad.getDeliveryModes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DMOD, deliveryMode));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDeliveryModeIdentifier(AD ad, String deliveryModeIdentifier) {
		if (deliveryModeIdentifier == null) {
			throw new IllegalArgumentException("deliveryModeIdentifier is null");
		}
		ad.getDeliveryModeIdentifiers().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DMODID, deliveryModeIdentifier));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addBuildingNumberSuffix(AD ad, String buildingNumberSuffix) {
		if (buildingNumberSuffix == null) {
			throw new IllegalArgumentException("buildingNumberSuffix is null");
		}
		ad.getBuildingNumberSuffixes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.BNS, buildingNumberSuffix));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addPostBox(AD ad, String postBox) {
		if (postBox == null) {
			throw new IllegalArgumentException("postBox is null");
		}
		ad.getPostBoxes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.POB, postBox));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addPrecinct(AD ad, String precinct) {
		if (precinct == null) {
			throw new IllegalArgumentException("precinct is null");
		}
		ad.getPrecincts().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.PRE, precinct));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addText(AD ad, String text) {
		if (text == null) {
			throw new IllegalArgumentException("text is null");
		}
		FeatureMapUtil.addText(ad.getMixed(), text);
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  String getText(AD ad) {
		StringBuffer text = new StringBuffer("");
		for (FeatureMap.Entry entry : ad.getMixed()) {
			if (FeatureMapUtil.isText(entry)) {
				text.append(entry.getValue().toString());
			}
		}
		return text.toString();
	}

} // ADOperations