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
import org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.DeceasedObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Deceased Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#validateDeceasedObservationProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Deceased Observation Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeceasedObservation#getProblemObservation() <em>Get Problem Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DeceasedObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not 
	*/
	@Test
	public void testValidateDeceasedObservationEffectiveTimeLow() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationEffectiveTimeLowTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationEffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(DeceasedObservation target) {

				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("1", "2"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationEffectiveTimeLow(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationTemplateId() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationTemplateIdTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationTemplateId(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationClassCode() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationClassCodeTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationClassCode(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationMoodCode() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationMoodCodeTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationMoodCode(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationId() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationIdTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationId",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationId(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationCodeP() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationCodePTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationCodeP(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDeceasedObservationCode() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationCodeTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

				CE cd = DatatypesFactory.eINSTANCE.createCE("ASSERTION", "2.16.840.1.113883.5.4");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationCode(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationStatusCode() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationStatusCodeTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationStatusCode(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationStatusCodeP() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationStatusCodePTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationStatusCodeP(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDeceasedObservationEffectiveTime() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationEffectiveTimeTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationEffectiveTime(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDeceasedObservationValue() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationValueTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("419099009", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationValue(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDeceasedObservationValueP() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationValuePTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("419099009", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationValueP(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDeceasedObservationProblemObservation() {
		OperationsTestCase<DeceasedObservation> validateDeceasedObservationProblemObservationTestCase = new OperationsTestCase<DeceasedObservation>(
			"validateDeceasedObservationProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_DECEASED_OBSERVATION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DeceasedObservation target) {

			}

			@Override
			protected void updateToPass(DeceasedObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.CAUS);
				er.setObservation(ConsolFactory.eINSTANCE.createProblemObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DeceasedObservationOperations.validateDeceasedObservationProblemObservation(
					(DeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeceasedObservationProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservation() {

		DeceasedObservation target = objectFactory.create();
		target.getProblemObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DeceasedObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DeceasedObservation> {
		public DeceasedObservation create() {
			return ConsolFactory.eINSTANCE.createDeceasedObservation();
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
	private static class ConstructorTestClass extends DeceasedObservationOperations {
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

} // DeceasedObservationOperations
