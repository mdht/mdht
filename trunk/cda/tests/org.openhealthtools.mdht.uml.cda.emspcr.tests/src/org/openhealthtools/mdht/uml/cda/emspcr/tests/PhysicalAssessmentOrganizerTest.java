/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PhysicalAssessmentOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Assessment Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component7</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component8</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent9(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component9</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent10(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component10</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent11(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component11</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent12(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component12</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent13(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component13</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerComponent14(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Component14</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#validatePhysicalAssessmentOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer#getComponent3() <em>Get Component3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicalAssessmentOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent1() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent1TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent1",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent1(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent2() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent2TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent2",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent2(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent3() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent3TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent3",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent3(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent3TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent4() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent4TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent4",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent4(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent4TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent5() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent5TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent5",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent5(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent5TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent6() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent6TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent6",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent6(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent6TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent7() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent7TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent7",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent7(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent7TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent8() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent8TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent8",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent8(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent8TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent9() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent9TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent9",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT9__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent9(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent9TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent10() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent10TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent10",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT10__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent10(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent10TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent11() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent11TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent11",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT11__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent11(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent11TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent12() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent12TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent12",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT12__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent12(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent12TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent13() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent13TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent13",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT13__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent13(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent13TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerComponent14() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerComponent14TestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerComponent14",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_COMPONENT14__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerComponent14(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerComponent14TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentOrganizerTemplateId() {
		OperationsTestCase<PhysicalAssessmentOrganizer> validatePhysicalAssessmentOrganizerTemplateIdTestCase = new OperationsTestCase<PhysicalAssessmentOrganizer>(
			"validatePhysicalAssessmentOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentOrganizer target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentOrganizerOperations.validatePhysicalAssessmentOrganizerTemplateId(
					(PhysicalAssessmentOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetComponent3() {

		PhysicalAssessmentOrganizer target = objectFactory.create();
		target.getComponent3();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicalAssessmentOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicalAssessmentOrganizer> {
		public PhysicalAssessmentOrganizer create() {
			return EmspcrFactory.eINSTANCE.createPhysicalAssessmentOrganizer();
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
	private static class ConstructorTestClass extends PhysicalAssessmentOrganizerOperations {
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

} // PhysicalAssessmentOrganizerOperations
