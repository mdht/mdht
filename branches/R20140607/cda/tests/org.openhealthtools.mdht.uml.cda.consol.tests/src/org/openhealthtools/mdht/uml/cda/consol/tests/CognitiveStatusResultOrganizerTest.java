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
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveStatusResultOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cognitive Status Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateCognitiveStatusResultOrganizerCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Organizer Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateCognitiveStatusResultOrganizerCognitiveStatusResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Organizer Cognitive Status Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#getCognitiveStatusResultObservations() <em>Get Cognitive Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer#validateResultOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CognitiveStatusResultOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultOrganizerCodeCodeSystem() {
		OperationsTestCase<CognitiveStatusResultOrganizer> validateCognitiveStatusResultOrganizerCodeCodeSystemTestCase = new OperationsTestCase<CognitiveStatusResultOrganizer>(
			"validateCognitiveStatusResultOrganizerCodeCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultOrganizer target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("", "2.16.840.1.113883.6.96"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultOrganizerOperations.validateCognitiveStatusResultOrganizerCodeCodeSystem(
					(CognitiveStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultOrganizerCodeCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultOrganizerCognitiveStatusResultObservation() {
		OperationsTestCase<CognitiveStatusResultOrganizer> validateCognitiveStatusResultOrganizerCognitiveStatusResultObservationTestCase = new OperationsTestCase<CognitiveStatusResultOrganizer>(
			"validateCognitiveStatusResultOrganizerCognitiveStatusResultObservation",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createCognitiveStatusResultObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultOrganizerOperations.validateCognitiveStatusResultOrganizerCognitiveStatusResultObservation(
					(CognitiveStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultOrganizerCognitiveStatusResultObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCognitiveStatusResultObservations() {

		CognitiveStatusResultOrganizer target = objectFactory.create();
		target.getCognitiveStatusResultObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerTemplateId() {
		OperationsTestCase<CognitiveStatusResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<CognitiveStatusResultOrganizer>(
			"validateResultOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultOrganizerOperations.validateResultOrganizerTemplateId(
					(CognitiveStatusResultOrganizer) objectToTest, diagnostician, map);
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
		OperationsTestCase<CognitiveStatusResultOrganizer> validateResultOrganizerClassCodeTestCase = new OperationsTestCase<CognitiveStatusResultOrganizer>(
			"validateResultOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultOrganizerOperations.validateResultOrganizerClassCode(
					(CognitiveStatusResultOrganizer) objectToTest, diagnostician, map);
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
		OperationsTestCase<CognitiveStatusResultOrganizer> validateResultOrganizerMoodCodeTestCase = new OperationsTestCase<CognitiveStatusResultOrganizer>(
			"validateResultOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultOrganizerOperations.validateResultOrganizerMoodCode(
					(CognitiveStatusResultOrganizer) objectToTest, diagnostician, map);
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
		OperationsTestCase<CognitiveStatusResultOrganizer> validateResultOrganizerIdTestCase = new OperationsTestCase<CognitiveStatusResultOrganizer>(
			"validateResultOrganizerId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultOrganizer target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultOrganizerOperations.validateResultOrganizerId(
					(CognitiveStatusResultOrganizer) objectToTest, diagnostician, map);
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
		OperationsTestCase<CognitiveStatusResultOrganizer> validateResultOrganizerCodeTestCase = new OperationsTestCase<CognitiveStatusResultOrganizer>(
			"validateResultOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultOrganizer target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultOrganizerOperations.validateResultOrganizerCode(
					(CognitiveStatusResultOrganizer) objectToTest, diagnostician, map);
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
		OperationsTestCase<CognitiveStatusResultOrganizer> validateResultOrganizerStatusCodePTestCase = new OperationsTestCase<CognitiveStatusResultOrganizer>(
			"validateResultOrganizerStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultOrganizerOperations.validateResultOrganizerStatusCodeP(
					(CognitiveStatusResultOrganizer) objectToTest, diagnostician, map);
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
		OperationsTestCase<CognitiveStatusResultOrganizer> validateResultOrganizerStatusCodeTestCase = new OperationsTestCase<CognitiveStatusResultOrganizer>(
			"validateResultOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultOrganizer target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(CognitiveStatusResultOrganizer target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultOrganizerStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultOrganizerOperations.validateResultOrganizerStatusCode(
					(CognitiveStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CognitiveStatusResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CognitiveStatusResultOrganizer> {
		public CognitiveStatusResultOrganizer create() {
			return ConsolFactory.eINSTANCE.createCognitiveStatusResultOrganizer();
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
	private static class ConstructorTestClass extends CognitiveStatusResultOrganizerOperations {
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

} // CognitiveStatusResultOrganizerOperations
