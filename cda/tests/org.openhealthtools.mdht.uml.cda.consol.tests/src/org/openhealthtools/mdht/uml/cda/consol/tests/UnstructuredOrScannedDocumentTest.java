/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument;
import org.openhealthtools.mdht.uml.cda.consol.operations.UnstructuredOrScannedDocumentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Or Scanned Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTypeIdFixed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Type Id Fixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasOneRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has One Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasPatientRoleAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Role Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasPatientGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasPatientBirthYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Patient Birth Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasOriginalAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Original Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasScanningDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Scanning Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasScanDataEnterer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Scan Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Legal Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasNonXMLBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Binary Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentNoStructuredData(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document No Structured Data</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentOnePatientPerDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document One Patient Per Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentPatientRoleHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Patient Role Has Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Assigned Author Has Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Assigned Author Has Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Represented Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasNonXMLBodyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Non XML Body Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Text Reference Or Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Has Text Media Type Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateUnstructuredOrScannedDocumentTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Or Scanned Document Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredOrScannedDocument#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnstructuredOrScannedDocumentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentTypeIdFixed() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentTypeIdFixedTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentTypeIdFixed",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentTypeIdFixed(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentTypeIdFixedTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasOneRecordTarget() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasOneRecordTargetTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasOneRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasOneRecordTarget(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasOneRecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasAssignedAuthor() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasAssignedAuthorTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasAssignedAuthor(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentPatientRoleId() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentPatientRoleIdTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentPatientRoleId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentPatientRoleId(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentPatientRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasPatientRoleAddress() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasPatientRoleAddressTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasPatientRoleAddress",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasPatientRoleAddress(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasPatientRoleAddressTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasPatientName() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasPatientNameTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasPatientName",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasPatientName(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasPatientNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasPatientGenderCode() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasPatientGenderCodeTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasPatientGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasPatientGenderCode(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasPatientGenderCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasPatientBirthYear() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasPatientBirthYearTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasPatientBirthYear",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasPatientBirthYear(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasPatientBirthYearTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasOriginalAuthor() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasOriginalAuthorTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasOriginalAuthor",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasOriginalAuthor(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasOriginalAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasScanningDevice() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasScanningDeviceTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasScanningDevice",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasScanningDevice(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasScanningDeviceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasScanDataEnterer() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasScanDataEntererTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasScanDataEnterer",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasScanDataEnterer(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasScanDataEntererTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityIdTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityId(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentLegalAuthenticatorAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasNonXMLBody() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasNonXMLBodyTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasNonXMLBody",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasNonXMLBody(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasNonXMLBodyTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryTextTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryText(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasNonXMLBodyBinaryTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaTypeTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaType(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasNonXMLBodyTextMediaTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentationTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentation(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasNonXMLBodyTextRepresentationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentNoStructuredData() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentNoStructuredDataTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentNoStructuredData",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentNoStructuredData(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentNoStructuredDataTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentOnePatientPerDocument() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentOnePatientPerDocumentTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentOnePatientPerDocument",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentOnePatientPerDocument(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentOnePatientPerDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentPatientRoleHasId() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentPatientRoleHasIdTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentPatientRoleHasId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentPatientRoleHasId(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentPatientRoleHasIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentAssignedAuthorHasAddr() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentAssignedAuthorHasAddrTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentAssignedAuthorHasAddr(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentAssignedAuthorHasAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecomTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecom(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentAssignedAuthorHasTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganization(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationIdTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationId(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationNameTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationName(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecomTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecom(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddrTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddr(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasRepresentedCustodianOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasNonXMLBodyText() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasNonXMLBodyTextTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasNonXMLBodyText",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasNonXMLBodyText(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasNonXMLBodyTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentationTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentation(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasTextReferenceOrRepresentationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSetTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSet(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentHasTextMediaTypeValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentCode() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentCodeTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentCode",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentCode(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentEffectiveTime() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentEffectiveTimeTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentEffectiveTime(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentId() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentIdTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentId(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentLanguageCode() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentLanguageCodeTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentLanguageCode(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentLanguageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentTitle() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentTitleTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentTitle",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentTitle(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredOrScannedDocumentTypeId() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateUnstructuredOrScannedDocumentTypeIdTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateUnstructuredOrScannedDocumentTypeId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_OR_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateUnstructuredOrScannedDocumentTypeId(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredOrScannedDocumentTypeIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<UnstructuredOrScannedDocument> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<UnstructuredOrScannedDocument>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredOrScannedDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredOrScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredOrScannedDocumentOperations.validateGeneralHeaderConstraintsTemplateId(
					(UnstructuredOrScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends UnstructuredOrScannedDocumentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnstructuredOrScannedDocument> {
		public UnstructuredOrScannedDocument create() {
			return ConsolFactory.eINSTANCE.createUnstructuredOrScannedDocument();
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
	private static class ConstructorTestClass extends UnstructuredOrScannedDocumentOperations {
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

} // UnstructuredOrScannedDocumentOperations
