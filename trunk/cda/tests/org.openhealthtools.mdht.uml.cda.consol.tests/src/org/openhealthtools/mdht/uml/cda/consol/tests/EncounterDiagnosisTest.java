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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterDiagnosisOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Diagnosis</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#validateEncounterDiagnosisProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Diagnosis Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis#getProblemObservations() <em>Get Problem Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterDiagnosisTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterDiagnosisTemplateId() {
		OperationsTestCase<EncounterDiagnosis> validateEncounterDiagnosisTemplateIdTestCase = new OperationsTestCase<EncounterDiagnosis>(
			"validateEncounterDiagnosisTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterDiagnosis target) {

			}

			@Override
			protected void updateToPass(EncounterDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterDiagnosisOperations.validateEncounterDiagnosisTemplateId(
					(EncounterDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateEncounterDiagnosisTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterDiagnosisClassCode() {
		OperationsTestCase<EncounterDiagnosis> validateEncounterDiagnosisClassCodeTestCase = new OperationsTestCase<EncounterDiagnosis>(
			"validateEncounterDiagnosisClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterDiagnosis target) {

			}

			@Override
			protected void updateToPass(EncounterDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterDiagnosisOperations.validateEncounterDiagnosisClassCode(
					(EncounterDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateEncounterDiagnosisClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterDiagnosisMoodCode() {
		OperationsTestCase<EncounterDiagnosis> validateEncounterDiagnosisMoodCodeTestCase = new OperationsTestCase<EncounterDiagnosis>(
			"validateEncounterDiagnosisMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterDiagnosis target) {

			}

			@Override
			protected void updateToPass(EncounterDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterDiagnosisOperations.validateEncounterDiagnosisMoodCode(
					(EncounterDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateEncounterDiagnosisMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not 
	*/
	@Test
	public void testValidateEncounterDiagnosisCode() {
		OperationsTestCase<EncounterDiagnosis> validateEncounterDiagnosisCodeTestCase = new OperationsTestCase<EncounterDiagnosis>(
			"validateEncounterDiagnosisCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterDiagnosis target) {

			}

			@Override
			protected void updateToPass(EncounterDiagnosis target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("29308-4", "2.16.840.1.113883.6.1"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterDiagnosisOperations.validateEncounterDiagnosisCode(
					(EncounterDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateEncounterDiagnosisCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateEncounterDiagnosisCodeP() {
		OperationsTestCase<EncounterDiagnosis> validateEncounterDiagnosisCodePTestCase = new OperationsTestCase<EncounterDiagnosis>(
			"validateEncounterDiagnosisCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_DIAGNOSIS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterDiagnosis target) {

			}

			@Override
			protected void updateToPass(EncounterDiagnosis target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("29308-4", "2.16.840.1.113883.6.1"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterDiagnosisOperations.validateEncounterDiagnosisCodeP(
					(EncounterDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateEncounterDiagnosisCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateEncounterDiagnosisProblemObservation() {
		OperationsTestCase<EncounterDiagnosis> validateEncounterDiagnosisProblemObservationTestCase = new OperationsTestCase<EncounterDiagnosis>(
			"validateEncounterDiagnosisProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterDiagnosis target) {

			}

			@Override
			protected void updateToPass(EncounterDiagnosis target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createProblemObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterDiagnosisOperations.validateEncounterDiagnosisProblemObservation(
					(EncounterDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateEncounterDiagnosisProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservations() {

		EncounterDiagnosis target = objectFactory.create();
		target.getProblemObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterDiagnosisOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterDiagnosis> {
		public EncounterDiagnosis create() {
			return ConsolFactory.eINSTANCE.createEncounterDiagnosis();
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
	private static class ConstructorTestClass extends EncounterDiagnosisOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // EncounterDiagnosisOperations
