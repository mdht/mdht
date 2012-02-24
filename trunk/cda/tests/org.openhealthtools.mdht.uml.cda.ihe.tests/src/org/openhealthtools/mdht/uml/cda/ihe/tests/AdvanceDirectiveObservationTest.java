/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.AdvanceDirectiveObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation#validateIHEAdvanceDirectiveObservationHasExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Has External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation#validateIHEAdvanceDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation#validateIHEAdvanceDirectiveObservationRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation#validateIHEAdvanceDirectiveObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation#validateIHEAdvanceDirectiveObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Advance Directive Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIHEAdvanceDirectiveObservationHasExternalReference() {
		OperationsTestCase<AdvanceDirectiveObservation> validateIHEAdvanceDirectiveObservationHasExternalReferenceTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateIHEAdvanceDirectiveObservationHasExternalReference",
			operationsForOCL.getOCLValue("VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {

				target.getReferences().add(CCDFactory.eINSTANCE.createAdvanceDirectiveReference().init());
				;

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateIHEAdvanceDirectiveObservationHasExternalReference(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHEAdvanceDirectiveObservationHasExternalReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHEAdvanceDirectiveObservationTemplateId() {
		OperationsTestCase<AdvanceDirectiveObservation> validateIHEAdvanceDirectiveObservationTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateIHEAdvanceDirectiveObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateIHEAdvanceDirectiveObservationTemplateId(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHEAdvanceDirectiveObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIHEAdvanceDirectiveObservationRepeatNumber() {
		OperationsTestCase<AdvanceDirectiveObservation> validateIHEAdvanceDirectiveObservationRepeatNumberTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateIHEAdvanceDirectiveObservationRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {

				target.setRepeatNumber(DatatypesFactory.eINSTANCE.createIVL_INT());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateIHEAdvanceDirectiveObservationRepeatNumber(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHEAdvanceDirectiveObservationRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIHEAdvanceDirectiveObservationInterpretationCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateIHEAdvanceDirectiveObservationInterpretationCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateIHEAdvanceDirectiveObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {

				target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateIHEAdvanceDirectiveObservationInterpretationCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHEAdvanceDirectiveObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIHEAdvanceDirectiveObservationTargetSiteCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateIHEAdvanceDirectiveObservationTargetSiteCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateIHEAdvanceDirectiveObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_IHE_ADVANCE_DIRECTIVE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getTargetSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateIHEAdvanceDirectiveObservationTargetSiteCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHEAdvanceDirectiveObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCodeSystem("2.16.840.1.113883.6.96");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveObservation> {
		public AdvanceDirectiveObservation create() {
			return IHEFactory.eINSTANCE.createAdvanceDirectiveObservation();
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
	private static class ConstructorTestClass extends AdvanceDirectiveObservationOperations {
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

} // AdvanceDirectiveObservationOperations
