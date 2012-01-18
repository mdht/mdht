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
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3;

import org.openhealthtools.mdht.uml.cda.consol.operations.DocumentationOf_ServiceEvent3Operations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Documentation Of Service Event3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3#validateServiceEvent3EffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3#validateServiceEvent3EffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3#validateServiceEvent3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3#validateServiceEvent3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3#validateServiceEvent3Performer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Event3 Performer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DocumentationOf_ServiceEvent3Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent3EffectiveTimeLow() {
		OperationsTestCase<DocumentationOf_ServiceEvent3> validateServiceEvent3EffectiveTimeLowTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent3>(
			"validateServiceEvent3EffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent3 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent3Operations.validateServiceEvent3EffectiveTimeLow(
					(DocumentationOf_ServiceEvent3) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent3EffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent3EffectiveTimeHigh() {
		OperationsTestCase<DocumentationOf_ServiceEvent3> validateServiceEvent3EffectiveTimeHighTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent3>(
			"validateServiceEvent3EffectiveTimeHigh",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent3 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent3Operations.validateServiceEvent3EffectiveTimeHigh(
					(DocumentationOf_ServiceEvent3) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent3EffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent3ClassCode() {
		OperationsTestCase<DocumentationOf_ServiceEvent3> validateServiceEvent3ClassCodeTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent3>(
			"validateServiceEvent3ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent3 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent3Operations.validateServiceEvent3ClassCode(
					(DocumentationOf_ServiceEvent3) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent3ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent3EffectiveTime() {
		OperationsTestCase<DocumentationOf_ServiceEvent3> validateServiceEvent3EffectiveTimeTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent3>(
			"validateServiceEvent3EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent3 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent3 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent3Operations.validateServiceEvent3EffectiveTime(
					(DocumentationOf_ServiceEvent3) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent3EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceEvent3Performer() {
		OperationsTestCase<DocumentationOf_ServiceEvent3> validateServiceEvent3PerformerTestCase = new OperationsTestCase<DocumentationOf_ServiceEvent3>(
			"validateServiceEvent3Performer",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_EVENT3_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DocumentationOf_ServiceEvent3 target) {

			}

			@Override
			protected void updateToPass(DocumentationOf_ServiceEvent3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DocumentationOf_ServiceEvent3Operations.validateServiceEvent3Performer(
					(DocumentationOf_ServiceEvent3) objectToTest, diagnostician, map);
			}

		};

		validateServiceEvent3PerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DocumentationOf_ServiceEvent3Operations {
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
	private static class ObjectFactory implements TestObjectFactory<DocumentationOf_ServiceEvent3> {
		public DocumentationOf_ServiceEvent3 create() {
			return ConsolFactory.eINSTANCE.createDocumentationOf_ServiceEvent3();
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
	private static class ConstructorTestClass extends DocumentationOf_ServiceEvent3Operations {
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

} // DocumentationOf_ServiceEvent3Operations
