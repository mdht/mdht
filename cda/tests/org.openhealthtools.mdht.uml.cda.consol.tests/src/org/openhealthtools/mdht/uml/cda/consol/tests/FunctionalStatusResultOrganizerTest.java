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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateFunctionalStatusResultOrganizerFunctionalStatusResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Organizer Functional Status Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#getFunctionalStatusResultObservations() <em>Get Functional Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateResultOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateResultOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateResultOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateResultOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer#validateResultOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}</li>
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
	@Test
	public void testValidateResultOrganizerClassCode() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateResultOrganizerClassCodeTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateResultOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return FunctionalStatusResultOrganizerOperations.validateResultOrganizerClassCode(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerMoodCode() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateResultOrganizerMoodCodeTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateResultOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return FunctionalStatusResultOrganizerOperations.validateResultOrganizerMoodCode(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultOrganizerId() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateResultOrganizerIdTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateResultOrganizerId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

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

				return FunctionalStatusResultOrganizerOperations.validateResultOrganizerId(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultOrganizerCode() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateResultOrganizerCodeTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateResultOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return FunctionalStatusResultOrganizerOperations.validateResultOrganizerCode(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerStatusCodeP() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateResultOrganizerStatusCodePTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateResultOrganizerStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return FunctionalStatusResultOrganizerOperations.validateResultOrganizerStatusCodeP(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerStatusCode() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateResultOrganizerStatusCodeTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateResultOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultOrganizerOperations.validateResultOrganizerStatusCode(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerStatusCodeTestCase.doValidationTest();
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
