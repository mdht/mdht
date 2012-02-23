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
import org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.SOPInstanceObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>SOP Instance Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationSOPInstanceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation SOP Instance Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationPurposeofReferenceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Purposeof Reference Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#validateSOPInstanceObservationReferencedFramesObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate SOP Instance Observation Referenced Frames Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#getSOPInstanceObservations() <em>Get SOP Instance Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#getPurposeofReferenceObservations() <em>Get Purposeof Reference Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SOPInstanceObservation#getReferencedFramesObservations() <em>Get Referenced Frames Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SOPInstanceObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationTemplateId() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTemplateIdTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationTemplateId(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationClassCode() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationClassCodeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationClassCode(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationEffectiveTime() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationEffectiveTimeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationEffectiveTime(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationId() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationIdTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationId",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationId(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationMoodCode() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationMoodCodeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationMoodCode(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationText() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationTextTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationText",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationText(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationCode() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationCodeTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationCode(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationSOPInstanceObservation() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationSOPInstanceObservationTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationSOPInstanceObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_SOP_INSTANCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationSOPInstanceObservation(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationSOPInstanceObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationPurposeofReferenceObservation() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationPurposeofReferenceObservationTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationPurposeofReferenceObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_PURPOSEOF_REFERENCE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationPurposeofReferenceObservation(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationPurposeofReferenceObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSOPInstanceObservationReferencedFramesObservation() {
		OperationsTestCase<SOPInstanceObservation> validateSOPInstanceObservationReferencedFramesObservationTestCase = new OperationsTestCase<SOPInstanceObservation>(
			"validateSOPInstanceObservationReferencedFramesObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOP_INSTANCE_OBSERVATION_REFERENCED_FRAMES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SOPInstanceObservation target) {

			}

			@Override
			protected void updateToPass(SOPInstanceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SOPInstanceObservationOperations.validateSOPInstanceObservationReferencedFramesObservation(
					(SOPInstanceObservation) objectToTest, diagnostician, map);
			}

		};

		validateSOPInstanceObservationReferencedFramesObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSOPInstanceObservations() {

		SOPInstanceObservation target = objectFactory.create();
		target.getSOPInstanceObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPurposeofReferenceObservations() {

		SOPInstanceObservation target = objectFactory.create();
		target.getPurposeofReferenceObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReferencedFramesObservations() {

		SOPInstanceObservation target = objectFactory.create();
		target.getReferencedFramesObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SOPInstanceObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SOPInstanceObservation> {
		public SOPInstanceObservation create() {
			return ConsolFactory.eINSTANCE.createSOPInstanceObservation();
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
	private static class ConstructorTestClass extends SOPInstanceObservationOperations {
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

} // SOPInstanceObservationOperations
