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
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.consol.operations.UnstructuredDocumentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTypeIdFixed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Type Id Fixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasOneRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has One Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasPatientRoleAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Role Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasPatientGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasPatientBirthYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Patient Birth Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasOriginalAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Original Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasScanningDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Scanning Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasScanDataEnterer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Scan Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Legal Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasNonXMLBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasNonXMLBodyBinaryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Binary Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasNonXMLBodyTextMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Text Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentHasNonXMLBodyTextRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Text Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentNoStructuredData(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document No Structured Data</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentOnePatientPerDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document One Patient Per Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnstructuredDocumentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentTypeIdFixed() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentTypeIdFixedTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentTypeIdFixed",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentTypeIdFixed(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentTypeIdFixedTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasOneRecordTarget() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasOneRecordTargetTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasOneRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasOneRecordTarget(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasOneRecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasAssignedAuthor() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasAssignedAuthorTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasAssignedAuthor(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentPatientRoleId() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentPatientRoleIdTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentPatientRoleId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentPatientRoleId(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentPatientRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasPatientRoleAddress() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasPatientRoleAddressTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasPatientRoleAddress",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientRoleAddress(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasPatientRoleAddressTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasPatientName() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasPatientNameTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasPatientName",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientName(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasPatientNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasPatientGenderCode() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasPatientGenderCodeTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasPatientGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientGenderCode(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasPatientGenderCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasPatientBirthYear() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasPatientBirthYearTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasPatientBirthYear",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientBirthYear(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasPatientBirthYearTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasOriginalAuthor() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasOriginalAuthorTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasOriginalAuthor",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasOriginalAuthor(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasOriginalAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasScanningDevice() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasScanningDeviceTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasScanningDevice",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasScanningDevice(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasScanningDeviceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasScanDataEnterer() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasScanDataEntererTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasScanDataEnterer",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasScanDataEnterer(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasScanDataEntererTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasRepresentedCustodianOrganizationName() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasRepresentedCustodianOrganizationNameTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasRepresentedCustodianOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasRepresentedCustodianOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddrTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentLegalAuthenticatorAssignedEntityId() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentLegalAuthenticatorAssignedEntityIdTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentLegalAuthenticatorAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasNonXMLBody() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasNonXMLBodyTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasNonXMLBody",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBody(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasNonXMLBodyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasNonXMLBodyBinaryText() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasNonXMLBodyBinaryTextTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasNonXMLBodyBinaryText",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBodyBinaryText(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasNonXMLBodyBinaryTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasNonXMLBodyTextMediaType() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasNonXMLBodyTextMediaTypeTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasNonXMLBodyTextMediaType",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBodyTextMediaType(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasNonXMLBodyTextMediaTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasNonXMLBodyTextRepresentation() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasNonXMLBodyTextRepresentationTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasNonXMLBodyTextRepresentation",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBodyTextRepresentation(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasNonXMLBodyTextRepresentationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentNoStructuredData() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentNoStructuredDataTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentNoStructuredData",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_NO_STRUCTURED_DATA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentNoStructuredData(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentNoStructuredDataTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentOnePatientPerDocument() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentOnePatientPerDocumentTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentOnePatientPerDocument",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentOnePatientPerDocument(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentOnePatientPerDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentCode() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentCodeTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentCode",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentCode(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentConfidentialityCode() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentConfidentialityCodeTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentConfidentialityCode",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentConfidentialityCode(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentConfidentialityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentEffectiveTime() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentEffectiveTimeTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentEffectiveTime(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentId() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentIdTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentId(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentLanguageCode() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentLanguageCodeTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentLanguageCode(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentLanguageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentTitle() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentTitleTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentTitle",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentTitle(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentTypeId() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentTypeIdTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentTypeId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentTypeId(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentTypeIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<UnstructuredDocument> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateGeneralHeaderConstraintsTemplateId(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends UnstructuredDocumentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnstructuredDocument> {
		public UnstructuredDocument create() {
			return ConsolFactory.eINSTANCE.createUnstructuredDocument();
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
	private static class ConstructorTestClass extends UnstructuredDocumentOperations {
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

} // UnstructuredDocumentOperations
