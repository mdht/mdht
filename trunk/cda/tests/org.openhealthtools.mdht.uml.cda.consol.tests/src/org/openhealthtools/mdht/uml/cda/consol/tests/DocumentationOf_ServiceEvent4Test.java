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
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4;

import org.openhealthtools.mdht.uml.cda.consol.operations.DocumentationOf_ServiceEvent4Operations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Documentation Of Service Event4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4#validateServiceEvent4ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4#validateServiceEvent4Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4#validateServiceEvent4Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4#validateServiceEvent4PhysicianReadingStudyPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event4 Physician Reading Study Performer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DocumentationOf_ServiceEvent4Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent4ClassCode() {
		OperationsTestCase<DocumentationOf_ServiceEvent4> validateServiceEvent4ClassCodeTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent4>(
			"validateServiceEvent4ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent4 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent4Operations.validateServiceEvent4ClassCode(
					(DocumentationOf_ServiceEvent4) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent4ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent4Code() {
		OperationsTestCase<DocumentationOf_ServiceEvent4> validateServiceEvent4CodeTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent4>(
			"validateServiceEvent4Code",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent4 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent4Operations.validateServiceEvent4Code(
					(DocumentationOf_ServiceEvent4) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent4CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent4Id() {
		OperationsTestCase<DocumentationOf_ServiceEvent4> validateServiceEvent4IdTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent4>(
			"validateServiceEvent4Id",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent4 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent4Operations.validateServiceEvent4Id(
					(DocumentationOf_ServiceEvent4) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent4IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent4PhysicianReadingStudyPerformer() {
		OperationsTestCase<DocumentationOf_ServiceEvent4> validateServiceEvent4PhysicianReadingStudyPerformerTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent4>(
			"validateServiceEvent4PhysicianReadingStudyPerformer",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT4_PHYSICIAN_READING_STUDY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent4 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent4Operations.validateServiceEvent4PhysicianReadingStudyPerformer(
					(DocumentationOf_ServiceEvent4) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent4PhysicianReadingStudyPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DocumentationOf_ServiceEvent4Operations {
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
	private static class ObjectFactory implements TestObjectFactory<DocumentationOf_ServiceEvent4> {
		public DocumentationOf_ServiceEvent4 create() {
			return ConsolFactory.eINSTANCE.createDocumentationOf_ServiceEvent4();
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
	private static class ConstructorTestClass extends DocumentationOf_ServiceEvent4Operations {
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

} // DocumentationOf_ServiceEvent4Operations
