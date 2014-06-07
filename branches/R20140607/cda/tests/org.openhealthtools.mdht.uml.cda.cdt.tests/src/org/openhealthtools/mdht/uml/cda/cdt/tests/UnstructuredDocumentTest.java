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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.NonXMLBody;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.cdt.operations.UnstructuredDocumentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentPatientRoleHasId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Patient Role Has Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentAssignedAuthorHasAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Assigned Author Has Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentAssignedAuthorHasTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Assigned Author Has Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Represented Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasNonXMLBodyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Non XML Body Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasTextReferenceOrRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Text Reference Or Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentHasTextMediaTypeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Has Text Media Type Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateUnstructuredDocumentCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unstructured Document Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.UnstructuredDocument#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
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
	public void testValidateUnstructuredDocumentPatientRoleHasId() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentPatientRoleHasIdTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentPatientRoleHasId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_PATIENT_ROLE_HAS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return UnstructuredDocumentOperations.validateUnstructuredDocumentPatientRoleHasId(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentPatientRoleHasIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentAssignedAuthorHasAddr() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentAssignedAuthorHasAddrTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentAssignedAuthorHasAddr",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return UnstructuredDocumentOperations.validateUnstructuredDocumentAssignedAuthorHasAddr(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentAssignedAuthorHasAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentAssignedAuthorHasTelecom() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentAssignedAuthorHasTelecomTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentAssignedAuthorHasTelecom",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_ASSIGNED_AUTHOR_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return UnstructuredDocumentOperations.validateUnstructuredDocumentAssignedAuthorHasTelecom(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentAssignedAuthorHasTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasRepresentedCustodianOrganization() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasRepresentedCustodianOrganizationTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasRepresentedCustodianOrganization",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganization(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasRepresentedCustodianOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasRepresentedCustodianOrganizationId() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasRepresentedCustodianOrganizationIdTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasRepresentedCustodianOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganizationId(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasRepresentedCustodianOrganizationIdTestCase.doValidationTest();
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
	public void testValidateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecomTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_REPRESENTED_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecom(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasRepresentedCustodianOrganizationTelecomTestCase.doValidationTest();
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
	* @generated NOT
	*/
	@Test
	public void testValidateUnstructuredDocumentHasNonXMLBodyText() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasNonXMLBodyTextTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasNonXMLBodyText",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_NON_XML_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument target) {
				target.init();

				Component2 component = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(component);

				NonXMLBody body = CDAFactory.eINSTANCE.createNonXMLBody();
				component.setNonXMLBody(body);

				ED text = DatatypesFactory.eINSTANCE.createED();
				body.setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBodyText(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasNonXMLBodyTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasTextReferenceOrRepresentation() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasTextReferenceOrRepresentationTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasTextReferenceOrRepresentation",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_REFERENCE_OR_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasTextReferenceOrRepresentation(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasTextReferenceOrRepresentationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnstructuredDocumentHasTextMediaTypeValueSet() {
		OperationsTestCase<UnstructuredDocument> validateUnstructuredDocumentHasTextMediaTypeValueSetTestCase = new OperationsTestCase<UnstructuredDocument>(
			"validateUnstructuredDocumentHasTextMediaTypeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_UNSTRUCTURED_DOCUMENT_HAS_TEXT_MEDIA_TYPE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return UnstructuredDocumentOperations.validateUnstructuredDocumentHasTextMediaTypeValueSet(
					(UnstructuredDocument) objectToTest, diagnostician, map);
			}

		};

		validateUnstructuredDocumentHasTextMediaTypeValueSetTestCase.doValidationTest();
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
			return CDTFactory.eINSTANCE.createUnstructuredDocument();
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
