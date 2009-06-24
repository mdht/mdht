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
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#delimiter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#country(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#state(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#county(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>County</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#city(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#postalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#streetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#houseNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>House Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#houseNumberNumeric(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>House Number Numeric</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#direction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Direction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#streetName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Street Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#streetNameBase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Street Name Base</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#streetNameType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Street Name Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#additionalLocator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Additional Locator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#unitID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unit ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#unitType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unit Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#careOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Care Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#censusTract(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Census Tract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#deliveryAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#deliveryInstallationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Installation Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#deliveryInstallationArea(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Installation Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#deliveryInstallationQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Installation Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#deliveryMode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Mode</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#deliveryModeIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Mode Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#buildingNumberSuffix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Building Number Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#postBox(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Post Box</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.AD#precinct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Precinct</em>}</li>
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
	 * The cached OCL expression body for the '{@link #delimiter(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delimiter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #delimiter(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.delimiter->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DEL)";

	/**
	 * The cached OCL invariant for the '{@link #delimiter(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delimiter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #delimiter(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean delimiter(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIMITER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "delimiter", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #country(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #country(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.country->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CNT)";

	/**
	 * The cached OCL invariant for the '{@link #country(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #country(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean country(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__COUNTRY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "country", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #state(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #state(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.state->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STA)";

	/**
	 * The cached OCL invariant for the '{@link #state(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>State</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #state(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean state(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__STATE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "state", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #county(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>County</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #county(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.county->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CPA)";

	/**
	 * The cached OCL invariant for the '{@link #county(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>County</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #county(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean county(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(COUNTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__COUNTY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "county", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #city(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>City</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #city(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.city->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CTY)";

	/**
	 * The cached OCL invariant for the '{@link #city(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>City</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #city(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean city(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__CITY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "city", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #postalCode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #postalCode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.postalCode->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::ZIP)";

	/**
	 * The cached OCL invariant for the '{@link #postalCode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Postal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #postalCode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean postalCode(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__POSTAL_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "postalCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #streetAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Street Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #streetAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.streetAddressLine->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::SAL)";

	/**
	 * The cached OCL invariant for the '{@link #streetAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Street Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #streetAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean streetAddressLine(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__STREET_ADDRESS_LINE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "streetAddressLine", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #houseNumber(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>House Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #houseNumber(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.houseNumber->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNR)";

	/**
	 * The cached OCL invariant for the '{@link #houseNumber(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>House Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #houseNumber(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean houseNumber(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(HOUSE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__HOUSE_NUMBER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "houseNumber", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #houseNumberNumeric(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>House Number Numeric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #houseNumberNumeric(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.houseNumberNumeric->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNN)";

	/**
	 * The cached OCL invariant for the '{@link #houseNumberNumeric(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>House Number Numeric</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #houseNumberNumeric(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean houseNumberNumeric(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(HOUSE_NUMBER_NUMERIC__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__HOUSE_NUMBER_NUMERIC,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "houseNumberNumeric", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #direction(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Direction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #direction(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.direction->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DIR)";

	/**
	 * The cached OCL invariant for the '{@link #direction(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Direction</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #direction(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean direction(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(DIRECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DIRECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "direction", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #streetName(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Street Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #streetName(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.streetName->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STR)";

	/**
	 * The cached OCL invariant for the '{@link #streetName(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Street Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #streetName(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean streetName(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(STREET_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__STREET_NAME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "streetName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #streetNameBase(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Street Name Base</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #streetNameBase(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.streetNameBase->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STB)";

	/**
	 * The cached OCL invariant for the '{@link #streetNameBase(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Street Name Base</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #streetNameBase(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean streetNameBase(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(STREET_NAME_BASE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__STREET_NAME_BASE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "streetNameBase", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #streetNameType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Street Name Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #streetNameType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.streetNameType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::STTYP)";

	/**
	 * The cached OCL invariant for the '{@link #streetNameType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Street Name Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #streetNameType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean streetNameType(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(STREET_NAME_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__STREET_NAME_TYPE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "streetNameType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #additionalLocator(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Additional Locator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #additionalLocator(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.additionalLocator->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::ADL)";

	/**
	 * The cached OCL invariant for the '{@link #additionalLocator(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Additional Locator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #additionalLocator(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean additionalLocator(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ADDITIONAL_LOCATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__ADDITIONAL_LOCATOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "additionalLocator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #unitID(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unit ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #unitID(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.unitID->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::UNID)";

	/**
	 * The cached OCL invariant for the '{@link #unitID(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unit ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #unitID(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean unitID(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(UNIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__UNIT_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "unitID", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #unitType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unit Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #unitType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.unitType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::UNIT)";

	/**
	 * The cached OCL invariant for the '{@link #unitType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unit Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #unitType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean unitType(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(UNIT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__UNIT_TYPE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "unitType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #careOf(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Care Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #careOf(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.careOf->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CAR)";

	/**
	 * The cached OCL invariant for the '{@link #careOf(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Care Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #careOf(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean careOf(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CARE_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__CARE_OF,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "careOf", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #censusTract(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Census Tract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #censusTract(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.censusTract->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::CEN)";

	/**
	 * The cached OCL invariant for the '{@link #censusTract(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Census Tract</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #censusTract(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean censusTract(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(CENSUS_TRACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__CENSUS_TRACT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "censusTract", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #deliveryAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deliveryAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.deliveryAddressLine->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DAL)";

	/**
	 * The cached OCL invariant for the '{@link #deliveryAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deliveryAddressLine(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean deliveryAddressLine(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(DELIVERY_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIVERY_ADDRESS_LINE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deliveryAddressLine", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #deliveryInstallationType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Installation Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deliveryInstallationType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.deliveryInstallationType->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINST)";

	/**
	 * The cached OCL invariant for the '{@link #deliveryInstallationType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Installation Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deliveryInstallationType(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean deliveryInstallationType(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(DELIVERY_INSTALLATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIVERY_INSTALLATION_TYPE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deliveryInstallationType", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #deliveryInstallationArea(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Installation Area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deliveryInstallationArea(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.deliveryInstallationArea->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINSTA)";

	/**
	 * The cached OCL invariant for the '{@link #deliveryInstallationArea(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Installation Area</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deliveryInstallationArea(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean deliveryInstallationArea(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(DELIVERY_INSTALLATION_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIVERY_INSTALLATION_AREA,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deliveryInstallationArea", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #deliveryInstallationQualifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Installation Qualifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deliveryInstallationQualifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.deliveryInstallationQualifier->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DINSTQ)";

	/**
	 * The cached OCL invariant for the '{@link #deliveryInstallationQualifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Installation Qualifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deliveryInstallationQualifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean deliveryInstallationQualifier(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(DELIVERY_INSTALLATION_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIVERY_INSTALLATION_QUALIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deliveryInstallationQualifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #deliveryMode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deliveryMode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.deliveryMode->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DMOD)";

	/**
	 * The cached OCL invariant for the '{@link #deliveryMode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Mode</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deliveryMode(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean deliveryMode(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(DELIVERY_MODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIVERY_MODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deliveryMode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #deliveryModeIdentifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Mode Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deliveryModeIdentifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.deliveryModeIdentifier->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::DMODID)";

	/**
	 * The cached OCL invariant for the '{@link #deliveryModeIdentifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Delivery Mode Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deliveryModeIdentifier(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean deliveryModeIdentifier(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(DELIVERY_MODE_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__DELIVERY_MODE_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deliveryModeIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #buildingNumberSuffix(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Building Number Suffix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #buildingNumberSuffix(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.buildingNumberSuffix->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::BNS)";

	/**
	 * The cached OCL invariant for the '{@link #buildingNumberSuffix(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Building Number Suffix</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #buildingNumberSuffix(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean buildingNumberSuffix(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(BUILDING_NUMBER_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__BUILDING_NUMBER_SUFFIX,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "buildingNumberSuffix", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #postBox(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Post Box</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #postBox(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.postBox->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::POB)";

	/**
	 * The cached OCL invariant for the '{@link #postBox(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Post Box</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #postBox(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean postBox(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(POST_BOX__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__POST_BOX,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "postBox", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
						 new Object [] { ad }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #precinct(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Precinct</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #precinct(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precinct->forAll(adxp : datatypes::ADXP | adxp.partType = vocab::AddressPartType::PRE)";

	/**
	 * The cached OCL invariant for the '{@link #precinct(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Precinct</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #precinct(AD, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean precinct(AD ad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.AD);
			try {
				PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PRECINCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ad)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.AD__PRECINCT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "precinct", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ad, context) }),
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
		ad.getDelimiter().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DEL, delimiter));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addCountry(AD ad, String country) {
		ad.getCountry().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CNT, country));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addState(AD ad, String state) {
		ad.getState().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STA, state));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addCounty(AD ad, String county) {
		ad.getCounty().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CPA, county));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addCity(AD ad, String city) {
		ad.getCity().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CTY, city));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addPostalCode(AD ad, String postalCode) {
		ad.getPostalCode().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ZIP, postalCode));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addStreetAddressLine(AD ad, String streetAddressLine) {
		ad.getStreetAddressLine().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.SAL, streetAddressLine));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addHouseNumber(AD ad, String houseNumber) {
		ad.getHouseNumber().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.BNR, houseNumber));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addHouseNumberNumeric(AD ad, String houseNumberNumeric) {
		ad.getHouseNumberNumeric().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.BNN, houseNumberNumeric));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDirection(AD ad, String direction) {
		ad.getDirection().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DIR, direction));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addStreetName(AD ad, String streetName) {
		ad.getStreetName().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STR, streetName));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addStreetNameBase(AD ad, String streetNameBase) {
		ad.getStreetNameBase().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STB, streetNameBase));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addStreetNameType(AD ad, String streetNameType) {
		ad.getStreetNameType().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STTYP, streetNameType));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addAdditionalLocator(AD ad, String additionalLocator) {
		ad.getAdditionalLocator().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ADL, additionalLocator));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addUnitID(AD ad, String unitID) {
		ad.getUnitID().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.UNID, unitID));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addUnitType(AD ad, String unitType) {
		ad.getUnitType().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.UNIT, unitType));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addCareOf(AD ad, String careOf) {
		ad.getCareOf().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CAR, careOf));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addCensusTract(AD ad, String censusTract) {
		ad.getCensusTract().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CEN, censusTract));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDeliveryAddressLine(AD ad, String deliveryAddressLine) {
		ad.getDeliveryAddressLine().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DAL, deliveryAddressLine));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDeliveryInstallationType(AD ad, String deliveryInstallationType) {
		ad.getDeliveryInstallationType().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DINST, deliveryInstallationType));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDeliveryInstallationArea(AD ad, String deliveryInstallationArea) {
		ad.getDeliveryInstallationArea().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DINSTA, deliveryInstallationArea));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDeliveryInstallationQualifier(AD ad, String deliveryInstallationQualifier) {
		ad.getDeliveryInstallationQualifier().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DINSTQ, deliveryInstallationQualifier));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDeliveryMode(AD ad, String deliveryMode) {
		ad.getDeliveryMode().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DMOD, deliveryMode));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addDeliveryModeIdentifier(AD ad, String deliveryModeIdentifier) {
		ad.getDeliveryModeIdentifier().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.DMODID, deliveryModeIdentifier));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addBuildingNumberSuffix(AD ad, String buildingNumberSuffix) {
		ad.getBuildingNumberSuffix().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.BNS, buildingNumberSuffix));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addPostBox(AD ad, String postBox) {
		ad.getPostBox().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.POB, postBox));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addPrecinct(AD ad, String precinct) {
		ad.getPrecinct().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.PRE, precinct));
		return ad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  AD addText(AD ad, String text) {
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
		FeatureMap featureMap = ad.getMixed();
		for (int i = 0; i < featureMap.size(); i++) {
			FeatureMap.Entry entry = featureMap.get(i);
			if (FeatureMapUtil.isText(entry)) {
				text.append(entry.getValue().toString());
			}
		}
		return text.toString();
	}

} // ADOperations