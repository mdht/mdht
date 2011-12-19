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
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerFamilyHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#getFamilyHistoryObservations() <em>Get Family History Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerTemplateId() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerTemplateIdTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerTemplateId(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerClassCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerClassCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerClassCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerMoodCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerMoodCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerMoodCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerStatusCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerStatusCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerStatusCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerFamilyHistoryObservation() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerFamilyHistoryObservationTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerFamilyHistoryObservation",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createFamilyHistoryObservation());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerFamilyHistoryObservation(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerFamilyHistoryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerSubject() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerSubjectTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerSubject",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerSubject(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistoryObservations() {

		FamilyHistoryOrganizer target = objectFactory.create();
		target.getFamilyHistoryObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryOrganizer> {
		public FamilyHistoryOrganizer create() {
			return ConsolFactory.eINSTANCE.createFamilyHistoryOrganizer();
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
	private static class ConstructorTestClass extends FamilyHistoryOrganizerOperations {
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

} // FamilyHistoryOrganizerOperations
