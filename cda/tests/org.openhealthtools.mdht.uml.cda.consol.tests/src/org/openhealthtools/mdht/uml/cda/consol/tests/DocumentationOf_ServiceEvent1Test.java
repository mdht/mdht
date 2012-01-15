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
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1;

import org.openhealthtools.mdht.uml.cda.consol.operations.DocumentationOf_ServiceEvent1Operations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Documentation Of Service Event1</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1ProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1EffectiveTimeHasLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time Has Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1EffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1EffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1AnyAssistantsAsSecondary(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Any Assistants As Secondary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1#validateServiceEvent1EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event1 Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DocumentationOf_ServiceEvent1Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent1ProcedureCodes() {
		OperationsTestCase<DocumentationOf_ServiceEvent1> validateServiceEvent1ProcedureCodesTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent1>(
			"validateServiceEvent1ProcedureCodes",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT1_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent1 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent1 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1ProcedureCodes(
					(DocumentationOf_ServiceEvent1) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent1ProcedureCodesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent1EffectiveTimeHasLow() {
		OperationsTestCase<DocumentationOf_ServiceEvent1> validateServiceEvent1EffectiveTimeHasLowTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent1>(
			"validateServiceEvent1EffectiveTimeHasLow",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent1 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent1 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1EffectiveTimeHasLow(
					(DocumentationOf_ServiceEvent1) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent1EffectiveTimeHasLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent1EffectiveTimeHasHighWhenNoWidth() {
		OperationsTestCase<DocumentationOf_ServiceEvent1> validateServiceEvent1EffectiveTimeHasHighWhenNoWidthTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent1>(
			"validateServiceEvent1EffectiveTimeHasHighWhenNoWidth",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent1 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent1 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1EffectiveTimeHasHighWhenNoWidth(
					(DocumentationOf_ServiceEvent1) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent1EffectiveTimeHasHighWhenNoWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent1EffectiveTimeNoHighIfWidth() {
		OperationsTestCase<DocumentationOf_ServiceEvent1> validateServiceEvent1EffectiveTimeNoHighIfWidthTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent1>(
			"validateServiceEvent1EffectiveTimeNoHighIfWidth",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent1 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent1 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1EffectiveTimeNoHighIfWidth(
					(DocumentationOf_ServiceEvent1) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent1EffectiveTimeNoHighIfWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent1AnyAssistantsAsSecondary() {
		OperationsTestCase<DocumentationOf_ServiceEvent1> validateServiceEvent1AnyAssistantsAsSecondaryTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent1>(
			"validateServiceEvent1AnyAssistantsAsSecondary",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT1_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent1 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent1 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1AnyAssistantsAsSecondary(
					(DocumentationOf_ServiceEvent1) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent1AnyAssistantsAsSecondaryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent1Code() {
		OperationsTestCase<DocumentationOf_ServiceEvent1> validateServiceEvent1CodeTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent1>(
			"validateServiceEvent1Code",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent1 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent1 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1Code(
					(DocumentationOf_ServiceEvent1) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent1CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent1EffectiveTime() {
		OperationsTestCase<DocumentationOf_ServiceEvent1> validateServiceEvent1EffectiveTimeTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent1>(
			"validateServiceEvent1EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT1_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent1 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent1 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1EffectiveTime(
					(DocumentationOf_ServiceEvent1) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent1EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DocumentationOf_ServiceEvent1Operations {
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
	private static class ObjectFactory implements TestObjectFactory<DocumentationOf_ServiceEvent1> {
		public DocumentationOf_ServiceEvent1 create() {
			return ConsolFactory.eINSTANCE.createDocumentationOf_ServiceEvent1();
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
	private static class ConstructorTestClass extends DocumentationOf_ServiceEvent1Operations {
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

} // DocumentationOf_ServiceEvent1Operations
