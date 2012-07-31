/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PublicHealthCaseReportOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Public Health Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Record Target Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRAuthorTiime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Author Tiime</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Author Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Author Assigned Author Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Author Assigned Author Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Legal Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Legal Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Legal Authenticator Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Legal Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Legal Authenticator Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report PHCR Legal Authenticator Assigned Entity Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPhcrSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Phcr Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPhcrClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPhcrTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Phcr Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPhcrEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Phcr Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportPhcrRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#validatePublicHealthCaseReportImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#getPhcrSocialHistorySection() <em>Get Phcr Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#getPhcrClinicalInformationSection() <em>Get Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#getPhcrTreatmentInformationSection() <em>Get Phcr Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#getPhcrEncountersSection() <em>Get Phcr Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#getPhcrRelevantDxTestsSection() <em>Get Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PublicHealthCaseReportTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRRecordTarget() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRRecordTargetTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRRecordTarget(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRRecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRRecordTargetPatientRole() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRRecordTargetPatientRoleTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRRecordTargetPatientRole",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRRecordTargetPatientRole(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRRecordTargetPatientRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRRecordTargetPatientRoleId() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRRecordTargetPatientRoleIdTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRRecordTargetPatientRoleId(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRRecordTargetPatientRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRAuthor() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRAuthorTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRAuthor",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthor(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRAuthorTiime() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRAuthorTiimeTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRAuthorTiime",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR_TIIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthorTiime(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRAuthorTiimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRAuthorAssignedAuthor() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRAuthorAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthorAssignedAuthor(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRAuthorAssignedAuthorId() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRAuthorAssignedAuthorIdTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthorAssignedAuthorId(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRAuthorAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddrTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddr(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecomTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecom(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRAuthorAssignedAuthorTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonNameTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonName(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRAuthorAssignedAuthorAssignedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRLegalAuthenticator() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRLegalAuthenticatorTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRLegalAuthenticator",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRLegalAuthenticator(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRLegalAuthenticatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRLegalAuthenticatorTime() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRLegalAuthenticatorTimeTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRLegalAuthenticatorTime",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRLegalAuthenticatorTime(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRLegalAuthenticatorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntity(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityIdTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityId(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddrTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddr(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonNameTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonName(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPHCRLegalAuthenticatorAssignedEntityAssignedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportTemplateId() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportTemplateId(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportCodeP() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportCodePTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportCodeP(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportCode() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportCodeTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportCode",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportCode(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPhcrSocialHistorySection() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPhcrSocialHistorySectionTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPhcrSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

				/* PhcrSocialHistorySection */
				PhcrSocialHistorySection section =

				PhcrFactory.eINSTANCE.createPhcrSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPhcrSocialHistorySection(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPhcrSocialHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPhcrClinicalInformationSection() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPhcrClinicalInformationSectionTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPhcrClinicalInformationSection",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

				/* PhcrClinicalInformationSection */
				PhcrClinicalInformationSection section =

				PhcrFactory.eINSTANCE.createPhcrClinicalInformationSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPhcrClinicalInformationSection(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPhcrClinicalInformationSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPhcrTreatmentInformationSection() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPhcrTreatmentInformationSectionTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPhcrTreatmentInformationSection",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

				/* PhcrTreatmentInformationSection */
				PhcrTreatmentInformationSection section =

				PhcrFactory.eINSTANCE.createPhcrTreatmentInformationSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPhcrTreatmentInformationSection(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPhcrTreatmentInformationSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPhcrEncountersSection() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPhcrEncountersSectionTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPhcrEncountersSection",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

				/* PhcrEncountersSection */
				PhcrEncountersSection section =

				PhcrFactory.eINSTANCE.createPhcrEncountersSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPhcrEncountersSection(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPhcrEncountersSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePublicHealthCaseReportPhcrRelevantDxTestsSection() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportPhcrRelevantDxTestsSectionTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportPhcrRelevantDxTestsSection",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

				/* PhcrRelevantDxTestsSection */
				PhcrRelevantDxTestsSection section =

				PhcrFactory.eINSTANCE.createPhcrRelevantDxTestsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportPhcrRelevantDxTestsSection(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportPhcrRelevantDxTestsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePublicHealthCaseReportImmunizationsSection() {
		OperationsTestCase<PublicHealthCaseReport> validatePublicHealthCaseReportImmunizationsSectionTestCase = new OperationsTestCase<PublicHealthCaseReport>(
			"validatePublicHealthCaseReportImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PublicHealthCaseReport target) {

			}

			@Override
			protected void updateToPass(PublicHealthCaseReport target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				CCDFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PublicHealthCaseReportOperations.validatePublicHealthCaseReportImmunizationsSection(
					(PublicHealthCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportImmunizationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhcrSocialHistorySection() {

		PublicHealthCaseReport target = objectFactory.create();
		target.getPhcrSocialHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhcrClinicalInformationSection() {

		PublicHealthCaseReport target = objectFactory.create();
		target.getPhcrClinicalInformationSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhcrTreatmentInformationSection() {

		PublicHealthCaseReport target = objectFactory.create();
		target.getPhcrTreatmentInformationSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhcrEncountersSection() {

		PublicHealthCaseReport target = objectFactory.create();
		target.getPhcrEncountersSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhcrRelevantDxTestsSection() {

		PublicHealthCaseReport target = objectFactory.create();
		target.getPhcrRelevantDxTestsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSection() {

		PublicHealthCaseReport target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PublicHealthCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PublicHealthCaseReport> {
		public PublicHealthCaseReport create() {
			return PhcrFactory.eINSTANCE.createPublicHealthCaseReport();
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
	* @generated
	*/
	private static class ConstructorTestClass extends PublicHealthCaseReportOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
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

} // PublicHealthCaseReportOperations
