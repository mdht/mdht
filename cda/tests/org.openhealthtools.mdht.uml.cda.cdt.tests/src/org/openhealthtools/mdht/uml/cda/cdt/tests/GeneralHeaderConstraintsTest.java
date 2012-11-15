/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>General Header Constraints</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsPersonHasName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Person Has Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Shall Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Roles Should Have Addr And Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Organizations Have Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTelephoneMatchesRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Telephone Matches Regex</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasTelephoneDialingDigits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Telephone Dialing Digits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Unknown Telephone Uses Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsIdRootFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id Root Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsOidLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Oid Length</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLanguageCodeForm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code Form</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetIdAndVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetIdAndIdAreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Id Are Unique</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCopyTimeNotPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Copy Time Not Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Person Or Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant Assigned Person Or Related Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTimePreciseToSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTimePreciseToYearAndDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Time Precise To Year And Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralHeaderConstraintsTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsPersonHasName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsPersonHasNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsPersonHasName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_PERSON_HAS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();

				target.addPatient(CDAFactory.eINSTANCE.createPatient());

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				for (Patient patient : target.getPatients()) {
					patient.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsPersonHasName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsPersonHasNameTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHALL_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();

				target.addPatient(CDAFactory.eINSTANCE.createPatient());

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				for (PatientRole pr : target.getPatientRoles()) {
					pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
					pr.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecomTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_ROLES_SHOULD_HAVE_ADDR_AND_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecomTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsOrganizationsHaveContactInfo() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsOrganizationsHaveContactInfoTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsOrganizationsHaveContactInfo",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_ORGANIZATIONS_HAVE_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsOrganizationsHaveContactInfoTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTimePreciseToDay() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTimePreciseToDayTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTimePreciseToDay",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTimePreciseToDay(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTimePreciseToDayTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTimePreciseToYear() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTimePreciseToYearTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTimePreciseToYear",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTimePreciseToYear(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTimePreciseToYearTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTelephoneMatchesRegex() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTelephoneMatchesRegexTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTelephoneMatchesRegex",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TELEPHONE_MATCHES_REGEX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTelephoneMatchesRegex(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTelephoneMatchesRegexTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsHasTelephoneDialingDigits() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasTelephoneDialingDigitsTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsHasTelephoneDialingDigits",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_TELEPHONE_DIALING_DIGITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasTelephoneDialingDigits(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsHasTelephoneDialingDigitsTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavorTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_UNKNOWN_TELEPHONE_USES_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavorTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated  not
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTypeIdExtension() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTypeIdExtensionTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTypeIdExtension",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				InfrastructureRootTypeId value = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
				value.setExtension("POCD_HD000040");
				target.setTypeId(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTypeIdExtension(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTypeIdExtensionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsIdRootFormat() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsIdRootFormatTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsIdRootFormat",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID_ROOT_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsIdRootFormat(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsIdRootFormatTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsOidLength() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsOidLengthTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsOidLength",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_OID_LENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsOidLength(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsOidLengthTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLanguageCodeForm() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLanguageCodeFormTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLanguageCodeForm",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE_FORM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// Do nothing should trigger

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("aaaa"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("AAAA"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("aa-aa"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("AA-AA"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("aaa"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("a"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("AA-aa"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("AA-"));
					}
				});

			}

			@Override
			public void addPassTests() {
				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("en"));

					}
				});

				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("en-US"));

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLanguageCodeForm(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLanguageCodeFormTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsSetIdAndVersionNumber() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsSetIdAndVersionNumberTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsSetIdAndVersionNumber",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSetIdAndVersionNumber(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsSetIdAndVersionNumberTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsSetIdAndIdAreUnique() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsSetIdAndIdAreUniqueTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsSetIdAndIdAreUnique",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsSetIdAndIdAreUniqueTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsCopyTimeNotPresent() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCopyTimeNotPresentTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCopyTimeNotPresent",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCopyTimeNotPresent(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCopyTimeNotPresentTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsHasRecordTargetPatientRole() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasRecordTargetPatientRoleTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsHasRecordTargetPatientRole",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsHasRecordTargetPatientRoleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsHasPatientBirthTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasPatientBirthTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsHasPatientBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasPatientBirthTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsHasPatientBirthTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsHasAdministrativeGenderCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasAdministrativeGenderCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsHasAdministrativeGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsHasAdministrativeGenderCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsHasProviderOrganization() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasProviderOrganizationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsHasProviderOrganization",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasProviderOrganization(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsHasProviderOrganizationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsHasAuthorTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasAuthorTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsHasAuthorTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasAuthorTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsHasAuthorTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsHasAssignedAuthorId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasAssignedAuthorIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsHasAssignedAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasAssignedAuthorId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsHasAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDeviceTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDeviceTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsHasDataEntererAssignedPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasDataEntererAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsHasDataEntererAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsHasDataEntererAssignedPersonTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsHasDataEntererTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasDataEntererTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsHasDataEntererTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasDataEntererTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsHasDataEntererTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsHasInformant() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasInformantTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsHasInformant",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasInformant(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsHasInformantTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPersonTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPersonTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorHasAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();

				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();

				AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();

				authenticator.setAssignedEntity(assignedEntity);

				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				for (Authenticator authenticator : target.getAuthenticators()) {
					Person person = CDAFactory.eINSTANCE.createPerson();
					authenticator.getAssignedEntity().setAssignedPerson(person);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorHasAssignedPersonTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTimePreciseToSecond() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTimePreciseToSecondTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTimePreciseToSecond",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTimePreciseToSecond(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTimePreciseToSecondTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTimePreciseToYearAndDay() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTimePreciseToYearAndDayTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTimePreciseToYearAndDay",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TIME_PRECISE_TO_YEAR_AND_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTimePreciseToYearAndDay(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTimePreciseToYearAndDayTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTemplateId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				target.setCode(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsEffectiveTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsEffectiveTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsEffectiveTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.setId(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsLanguageCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLanguageCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS();
				target.setLanguageCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLanguageCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLanguageCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRealmCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRealmCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRealmCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRealmCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRealmCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTitle() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTitleTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTitle",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTitle(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTitleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTypeId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTypeIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTypeId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

				InfrastructureRootTypeId value = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
				target.setTypeId(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTypeId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTypeIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends GeneralHeaderConstraintsOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static class ObjectFactory implements TestObjectFactory<GeneralHeaderConstraints> {

		public GeneralHeaderConstraints create() {
			return org.openhealthtools.mdht.uml.cda.ihe.IHEFactory.eINSTANCE.createMedicalDocument();
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	 * 
	 * @generated
	 */
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends GeneralHeaderConstraintsOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	 * 
	 * @generated
	 */

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // GeneralHeaderConstraintsOperations
