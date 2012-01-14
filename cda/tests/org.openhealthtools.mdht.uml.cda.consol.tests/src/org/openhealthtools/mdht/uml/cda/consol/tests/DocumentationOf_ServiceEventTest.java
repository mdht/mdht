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
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent;

import org.openhealthtools.mdht.uml.cda.consol.operations.DocumentationOf_ServiceEventOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Documentation Of Service Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent#validateServiceEventProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent#validateServiceEventEffectiveTimeHasLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event Effective Time Has Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent#validateServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent#validateServiceEventEffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent#validateServiceEventAnyAssistantsAsSecondary(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event Any Assistants As Secondary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent#validateServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent#validateServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DocumentationOf_ServiceEventTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEventProcedureCodes() {
		OperationsTestCase<DocumentationOf_ServiceEvent> validateServiceEventProcedureCodesTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent>(
			"validateServiceEventProcedureCodes",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEventOperations.validateServiceEventProcedureCodes(
					(DocumentationOf_ServiceEvent) objectToTest, diagnostician, map);
			}

		};

		validateServiceEventProcedureCodesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEventEffectiveTimeHasLow() {
		OperationsTestCase<DocumentationOf_ServiceEvent> validateServiceEventEffectiveTimeHasLowTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent>(
			"validateServiceEventEffectiveTimeHasLow",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEventOperations.validateServiceEventEffectiveTimeHasLow(
					(DocumentationOf_ServiceEvent) objectToTest, diagnostician, map);
			}

		};

		validateServiceEventEffectiveTimeHasLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEventEffectiveTimeHasHighWhenNoWidth() {
		OperationsTestCase<DocumentationOf_ServiceEvent> validateServiceEventEffectiveTimeHasHighWhenNoWidthTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent>(
			"validateServiceEventEffectiveTimeHasHighWhenNoWidth",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEventOperations.validateServiceEventEffectiveTimeHasHighWhenNoWidth(
					(DocumentationOf_ServiceEvent) objectToTest, diagnostician, map);
			}

		};

		validateServiceEventEffectiveTimeHasHighWhenNoWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEventEffectiveTimeNoHighIfWidth() {
		OperationsTestCase<DocumentationOf_ServiceEvent> validateServiceEventEffectiveTimeNoHighIfWidthTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent>(
			"validateServiceEventEffectiveTimeNoHighIfWidth",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEventOperations.validateServiceEventEffectiveTimeNoHighIfWidth(
					(DocumentationOf_ServiceEvent) objectToTest, diagnostician, map);
			}

		};

		validateServiceEventEffectiveTimeNoHighIfWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEventAnyAssistantsAsSecondary() {
		OperationsTestCase<DocumentationOf_ServiceEvent> validateServiceEventAnyAssistantsAsSecondaryTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent>(
			"validateServiceEventAnyAssistantsAsSecondary",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT_ANY_ASSISTANTS_AS_SECONDARY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEventOperations.validateServiceEventAnyAssistantsAsSecondary(
					(DocumentationOf_ServiceEvent) objectToTest, diagnostician, map);
			}

		};

		validateServiceEventAnyAssistantsAsSecondaryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEventCode() {
		OperationsTestCase<DocumentationOf_ServiceEvent> validateServiceEventCodeTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent>(
			"validateServiceEventCode",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEventOperations.validateServiceEventCode(
					(DocumentationOf_ServiceEvent) objectToTest, diagnostician, map);
			}

		};

		validateServiceEventCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEventEffectiveTime() {
		OperationsTestCase<DocumentationOf_ServiceEvent> validateServiceEventEffectiveTimeTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent>(
			"validateServiceEventEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEventOperations.validateServiceEventEffectiveTime(
					(DocumentationOf_ServiceEvent) objectToTest, diagnostician, map);
			}

		};

		validateServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DocumentationOf_ServiceEventOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DocumentationOf_ServiceEvent> {
		public DocumentationOf_ServiceEvent create() {
			return ConsolFactory.eINSTANCE.createDocumentationOf_ServiceEvent();
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
	private static class ConstructorTestClass extends DocumentationOf_ServiceEventOperations {
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

} // DocumentationOf_ServiceEventOperations
