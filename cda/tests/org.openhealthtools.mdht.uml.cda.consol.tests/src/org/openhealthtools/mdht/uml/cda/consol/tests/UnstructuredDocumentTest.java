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
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.consol.operations.UnstructuredDocumentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentRecordTargetPatientRole2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Record Target Patient Role2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentRecordTargetPatientRole2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Record Target Patient Role2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentAuthorAssignedAuthor2Addr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author Assigned Author2 Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentAuthorAssignedAuthor2Telecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author Assigned Author2 Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentAuthorAssignedAuthor2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Author Assigned Author2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian3 Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument#validateUnstructuredDocumentCustodianAssignedCustodian2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian Assigned Custodian2</em>}</li>
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
	public void testValidateUnstructuredDocumentTemplateId() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentTemplateIdTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return UnstructuredDocumentOperations.validateUnstructuredDocumentTemplateId(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentRecordTarget() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentRecordTargetTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentRecordTarget(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentRecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentAuthor() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentAuthorTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentAuthor",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				Author author = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(author);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentAuthor(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentComponent() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentComponentTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentComponent",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {

				Component2 value = CDAFactory.eINSTANCE.createComponent2();

				target.setComponent(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentComponent(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentCustodian() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentCustodianTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentCustodian",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				target.setCustodian(custodian);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodian(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentRecordTargetPatientRole2Id() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentRecordTargetPatientRole2IdTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentRecordTargetPatientRole2Id",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentRecordTargetPatientRole2Id(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentRecordTargetPatientRole2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentRecordTargetPatientRole2() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentRecordTargetPatientRole2TestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentRecordTargetPatientRole2",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_RECORD_TARGET_PATIENT_ROLE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentRecordTargetPatientRole2(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentRecordTargetPatientRole2TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentAuthorAssignedAuthor2Addr() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentAuthorAssignedAuthor2AddrTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentAuthorAssignedAuthor2Addr",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {

				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentAuthorAssignedAuthor2Addr(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentAuthorAssignedAuthor2AddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentAuthorAssignedAuthor2Telecom() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentAuthorAssignedAuthor2TelecomTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentAuthorAssignedAuthor2Telecom",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentAuthorAssignedAuthor2Telecom(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentAuthorAssignedAuthor2TelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentAuthorAssignedAuthor2() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentAuthorAssignedAuthor2TestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentAuthorAssignedAuthor2",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_AUTHOR_ASSIGNED_AUTHOR2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentAuthorAssignedAuthor2(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentAuthorAssignedAuthor2TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddrTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization co = CDAFactory.eINSTANCE.createCustodianOrganization();
				ac.setRepresentedCustodianOrganization(co);
				custodian.setAssignedCustodian(ac);
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.getCustodian().getAssignedCustodian().getRepresentedCustodianOrganization().setAddr(
					DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddr(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationIdTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization co = CDAFactory.eINSTANCE.createCustodianOrganization();
				ac.setRepresentedCustodianOrganization(co);
				custodian.setAssignedCustodian(ac);
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.getCustodian().getAssignedCustodian().getRepresentedCustodianOrganization().getIds().add(
					DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationId(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationNameTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization co = CDAFactory.eINSTANCE.createCustodianOrganization();
				ac.setRepresentedCustodianOrganization(co);
				custodian.setAssignedCustodian(ac);
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.getCustodian().getAssignedCustodian().getRepresentedCustodianOrganization().setName(
					DatatypesFactory.eINSTANCE.createON());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationName(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecomTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization co = CDAFactory.eINSTANCE.createCustodianOrganization();
				ac.setRepresentedCustodianOrganization(co);
				custodian.setAssignedCustodian(ac);
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.getCustodian().getAssignedCustodian().getRepresentedCustodianOrganization().setTelecom(
					DatatypesFactory.eINSTANCE.createTEL());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecom(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN3_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();

				custodian.setAssignedCustodian(ac);
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization co = CDAFactory.eINSTANCE.createCustodianOrganization();
				ac.setRepresentedCustodianOrganization(co);
				custodian.setAssignedCustodian(ac);
				target.setCustodian(custodian);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganization(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentCustodianAssignedCustodian3CustodianOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateUnstructuredDocumentCustodianAssignedCustodian2() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentCustodianAssignedCustodian2TestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentCustodianAssignedCustodian2",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_CUSTODIAN_ASSIGNED_CUSTODIAN2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization co = CDAFactory.eINSTANCE.createCustodianOrganization();
				ac.setRepresentedCustodianOrganization(co);
				target.getCustodian().setAssignedCustodian(ac);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentCustodianAssignedCustodian2(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentCustodianAssignedCustodian2TestCase.doValidationTest();
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
