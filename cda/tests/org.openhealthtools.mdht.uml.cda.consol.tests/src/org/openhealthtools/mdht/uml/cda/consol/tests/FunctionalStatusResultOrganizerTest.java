/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusResultOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateFunctionalStatusResultOrganizerCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Organizer Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateFunctionalStatusResultOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateFunctionalStatusResultOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateFunctionalStatusResultOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateFunctionalStatusResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateFunctionalStatusResultOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateFunctionalStatusResultOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateFunctionalStatusResultOrganizerFunctionalStatusResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Organizer Functional Status Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#getFunctionalStatusResultObservations() <em>Get Functional Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusResultOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultOrganizerCodeCodeSystem() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateFunctionalStatusResultOrganizerCodeCodeSystemTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateFunctionalStatusResultOrganizerCodeCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultOrganizer target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("", "2.16.840.1.113883.6.96"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerCodeCodeSystem(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultOrganizerCodeCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultOrganizerClassCode() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateFunctionalStatusResultOrganizerClassCodeTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateFunctionalStatusResultOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerClassCode(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultOrganizerClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultOrganizerMoodCode() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateFunctionalStatusResultOrganizerMoodCodeTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateFunctionalStatusResultOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerMoodCode(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultOrganizerId() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateFunctionalStatusResultOrganizerIdTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateFunctionalStatusResultOrganizerId",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultOrganizer target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerId(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultOrganizerIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultOrganizerCode() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateFunctionalStatusResultOrganizerCodeTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateFunctionalStatusResultOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultOrganizer target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("", "2.16.840.1.113883.6.96"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerCode(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultOrganizerStatusCodeP() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateFunctionalStatusResultOrganizerStatusCodePTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateFunctionalStatusResultOrganizerStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerStatusCodeP(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultOrganizerStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultOrganizerStatusCode() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateFunctionalStatusResultOrganizerStatusCodeTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateFunctionalStatusResultOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultOrganizer target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(FunctionalStatusResultOrganizer target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizerStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerStatusCode(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultOrganizerFunctionalStatusResultObservation() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateFunctionalStatusResultOrganizerFunctionalStatusResultObservationTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateFunctionalStatusResultOrganizerFunctionalStatusResultObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_ORGANIZER_FUNCTIONAL_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createFunctionalStatusResultObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultOrganizerOperations.validateFunctionalStatusResultOrganizerFunctionalStatusResultObservation(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultOrganizerFunctionalStatusResultObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusResultObservations() {

		FunctionalStatusResultOrganizer target = objectFactory.create();
		target.getFunctionalStatusResultObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerTemplateId() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateResultOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultOrganizerOperations.validateResultOrganizerTemplateId(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusResultOrganizer> {
		public FunctionalStatusResultOrganizer create() {
			return ConsolFactory.eINSTANCE.createFunctionalStatusResultOrganizer();
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
	private static class ConstructorTestClass extends FunctionalStatusResultOrganizerOperations {
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

} // FunctionalStatusResultOrganizerOperations
