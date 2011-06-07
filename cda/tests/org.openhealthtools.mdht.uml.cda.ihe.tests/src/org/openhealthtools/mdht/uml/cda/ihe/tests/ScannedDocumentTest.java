/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.NonXMLBody;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ScanDataEnterer;
import org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor;
import org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument;
import org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ScannedDocumentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.BinaryDataEncoding;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scanned Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentTypeIdFixed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Type Id Fixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasOneRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has One Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasPatientRoleAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Patient Role Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasPatientGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Patient Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasPatientBirthYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Patient Birth Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasOriginalAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Original Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasScanningDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Scanning Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasScanDataEnterer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Scan Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasRepresentedCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Represented Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasRepresentedCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Represented Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentLegalAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Legal Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasNonXMLBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Non XML Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasNonXMLBodyBinaryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Non XML Body Binary Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasNonXMLBodyTextMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Non XML Body Text Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasNonXMLBodyTextRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Non XML Body Text Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Type Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ScannedDocumentTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentTypeIdFixed() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentTypeIdFixedTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentTypeIdFixed",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				InfrastructureRootTypeId id = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
				id.setRoot("2.16.840.1.113883.1.3");
				id.setExtension("POCD_HD000040");
				target.setTypeId(id);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentTypeIdFixed(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentTypeIdFixedTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasOneRecordTarget() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasOneRecordTargetTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasOneRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasOneRecordTarget(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasOneRecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasAssignedAuthor() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasAssignedAuthorTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();

			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor assigned = CDAFactory.eINSTANCE.createAssignedAuthor();
				Person person = CDAFactory.eINSTANCE.createPerson();
				assigned.setAssignedPerson(person);
				author.setAssignedAuthor(assigned);
				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasAssignedAuthor(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentPatientRoleId() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentPatientRoleIdTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentPatientRoleId",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				for (RecordTarget rt : target.getRecordTargets()) {
					PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
					rt.setPatientRole(pr);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentPatientRoleId(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentPatientRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasPatientRoleAddress() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasPatientRoleAddressTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasPatientRoleAddress",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {

				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				for (RecordTarget rt : target.getRecordTargets()) {
					AD adr = DatatypesFactory.eINSTANCE.createAD();
					adr.addCountry("country");
					rt.getPatientRole().getAddrs().add(adr);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasPatientRoleAddress(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasPatientRoleAddressTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasPatientName() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasPatientNameTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasPatientName",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				for (RecordTarget rt : target.getRecordTargets()) {
					PN name = DatatypesFactory.eINSTANCE.createPN();
					name.addFamily("family");
					name.addGiven("given");
					rt.getPatientRole().getPatient().getNames().add(name);

				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasPatientName(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasPatientNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasPatientGenderCode() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasPatientGenderCodeTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasPatientGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_PATIENT_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				for (RecordTarget rt : target.getRecordTargets()) {
					CE gender = DatatypesFactory.eINSTANCE.createCE();
					rt.getPatientRole().getPatient().setAdministrativeGenderCode(gender);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasPatientGenderCode(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasPatientGenderCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasPatientBirthYear() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasPatientBirthYearTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasPatientBirthYear",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_PATIENT_BIRTH_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				for (RecordTarget rt : target.getRecordTargets()) {
					TS birth = DatatypesFactory.eINSTANCE.createTS("birth");

					rt.getPatientRole().getPatient().setBirthTime(birth);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasPatientBirthYear(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasPatientBirthYearTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasOriginalAuthor() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasOriginalAuthorTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasOriginalAuthor",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_ORIGINAL_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				ScanOriginalAuthor soa = IHEFactory.eINSTANCE.createScanOriginalAuthor().init();
				target.getAuthors().add(soa);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasOriginalAuthor(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasOriginalAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasScanningDevice() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasScanningDeviceTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasScanningDevice",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_SCANNING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				ScanningDevice device = IHEFactory.eINSTANCE.createScanningDevice().init();
				target.getAuthors().add(device);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasScanningDevice(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasScanningDeviceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasScanDataEnterer() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasScanDataEntererTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasScanDataEnterer",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_SCAN_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				ScanDataEnterer sde = IHEFactory.eINSTANCE.createScanDataEnterer().init();
				target.setDataEnterer(sde);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasScanDataEnterer(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasScanDataEntererTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasRepresentedCustodianOrganizationName() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasRepresentedCustodianOrganizationNameTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasRepresentedCustodianOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian assignedCustodian = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization organization = CDAFactory.eINSTANCE.createCustodianOrganization();
				assignedCustodian.setRepresentedCustodianOrganization(organization);
				custodian.setAssignedCustodian(assignedCustodian);
				target.setCustodian(custodian);

			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				ON name = DatatypesFactory.eINSTANCE.createON();
				target.getCustodian().getAssignedCustodian().getRepresentedCustodianOrganization().setName(name);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasRepresentedCustodianOrganizationName(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasRepresentedCustodianOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasRepresentedCustodianOrganizationAddr() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasRepresentedCustodianOrganizationAddrTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasRepresentedCustodianOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian assignedCustodian = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization organization = CDAFactory.eINSTANCE.createCustodianOrganization();
				assignedCustodian.setRepresentedCustodianOrganization(organization);
				custodian.setAssignedCustodian(assignedCustodian);
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				AD address = DatatypesFactory.eINSTANCE.createAD();
				address.addCountry("country");
				target.getCustodian().getAssignedCustodian().getRepresentedCustodianOrganization().setAddr(address);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasRepresentedCustodianOrganizationAddr(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasRepresentedCustodianOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentLegalAuthenticatorAssignedEntityId() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentLegalAuthenticatorAssignedEntityIdTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentLegalAuthenticatorAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
				LegalAuthenticator auth = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				II ii = DatatypesFactory.eINSTANCE.createII();
				ae.getIds().add(ii);
				auth.setAssignedEntity(ae);
				target.setLegalAuthenticator(auth);

			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				target.getLegalAuthenticator().getAssignedEntity().getIds().clear();
				II ii = DatatypesFactory.eINSTANCE.createII("root", "extension");
				target.getLegalAuthenticator().getAssignedEntity().getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentLegalAuthenticatorAssignedEntityId(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentLegalAuthenticatorAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasNonXMLBody() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasNonXMLBodyTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasNonXMLBody",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_NON_XML_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
				Component2 comp = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(comp);
			}

			@Override
			protected void updateToPass(ScannedDocument target) {

				NonXMLBody nxb = CDAFactory.eINSTANCE.createNonXMLBody();
				target.getComponent().setNonXMLBody(nxb);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasNonXMLBody(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasNonXMLBodyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasNonXMLBodyBinaryText() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasNonXMLBodyBinaryTextTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasNonXMLBodyBinaryText",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_NON_XML_BODY_BINARY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
				Component2 comp = CDAFactory.eINSTANCE.createComponent2();
				NonXMLBody nxb = CDAFactory.eINSTANCE.createNonXMLBody();
				comp.setNonXMLBody(nxb);
				target.setComponent(comp);

			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				ED text = DatatypesFactory.eINSTANCE.createED("text");
				target.getComponent().getNonXMLBody().setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasNonXMLBodyBinaryText(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasNonXMLBodyBinaryTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasNonXMLBodyTextMediaType() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasNonXMLBodyTextMediaTypeTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasNonXMLBodyTextMediaType",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
				Component2 comp = CDAFactory.eINSTANCE.createComponent2();
				NonXMLBody nxb = CDAFactory.eINSTANCE.createNonXMLBody();
				ED text = DatatypesFactory.eINSTANCE.createED("text");
				nxb.setText(text);
				comp.setNonXMLBody(nxb);
				target.setComponent(comp);

			}

			@Override
			protected void updateToPass(ScannedDocument target) {

				target.getComponent().getNonXMLBody().getText().setMediaType("application/pdf");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasNonXMLBodyTextMediaType(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasNonXMLBodyTextMediaTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentHasNonXMLBodyTextRepresentation() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentHasNonXMLBodyTextRepresentationTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentHasNonXMLBodyTextRepresentation",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_HAS_NON_XML_BODY_TEXT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
				Component2 comp = CDAFactory.eINSTANCE.createComponent2();
				NonXMLBody nxb = CDAFactory.eINSTANCE.createNonXMLBody();
				ED text = DatatypesFactory.eINSTANCE.createED("text");
				nxb.setText(text);
				comp.setNonXMLBody(nxb);
				target.setComponent(comp);
			}

			@Override
			protected void updateToPass(ScannedDocument target) {

				target.getComponent().getNonXMLBody().getText().setRepresentation(BinaryDataEncoding.B64);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentHasNonXMLBodyTextRepresentation(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentHasNonXMLBodyTextRepresentationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScannedDocumentTemplateId() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentTemplateIdTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {

			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentTemplateId(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentCode() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentCodeTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentCode",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();

			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				target.setCode(ce);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentCode(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentConfidentialityCode() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentConfidentialityCodeTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentConfidentialityCode",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				target.setConfidentialityCode(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentConfidentialityCode(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentConfidentialityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated 
	*/
	@Test
	public void testValidateScannedDocumentEffectiveTime() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentEffectiveTimeTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {

			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentEffectiveTime(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentId() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentIdTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentId",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ScannedDocument target) {
				target.init();
			}

			@Override
			protected void updateToPass(ScannedDocument target) {
				II ii = DatatypesFactory.eINSTANCE.createII();
				target.setId(ii);

			}

			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentId(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentLanguageCode() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentLanguageCodeTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			protected void updateToFail(ScannedDocument target) {
				target.init();
			}

			protected void updateToPass(ScannedDocument target) {
				CS cs = DatatypesFactory.eINSTANCE.createCS();
				target.setLanguageCode(cs);

			}

			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentLanguageCode(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentLanguageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentTitle() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentTitleTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentTitle",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			protected void updateToFail(ScannedDocument target) {
				target.init();
			}

			protected void updateToPass(ScannedDocument target) {
				ST title = DatatypesFactory.eINSTANCE.createST();
				target.setTitle(title);

			}

			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentTitle(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScannedDocumentTypeId() {
		OperationsTestCase<ScannedDocument> validateScannedDocumentTypeIdTestCase = new OperationsTestCase<ScannedDocument>(
			"validateScannedDocumentTypeId",
			operationsForOCL.getOCLValue("VALIDATE_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			protected void updateToFail(ScannedDocument target) {
				target.init();

			}

			protected void updateToPass(ScannedDocument target) {
				InfrastructureRootTypeId id = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
				target.setTypeId(id);

			}

			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScannedDocumentOperations.validateScannedDocumentTypeId(
					(ScannedDocument) objectToTest, diagnostician, map);
			}

		};

		validateScannedDocumentTypeIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ScannedDocumentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ScannedDocument> {

		public ScannedDocument create() {
			return IHEFactory.eINSTANCE.createScannedDocument();
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
	private static class ConstructorTestClass extends ScannedDocumentOperations {
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

	protected EObject getObjectToTest() {
		return null;
	}

} // ScannedDocumentOperations
