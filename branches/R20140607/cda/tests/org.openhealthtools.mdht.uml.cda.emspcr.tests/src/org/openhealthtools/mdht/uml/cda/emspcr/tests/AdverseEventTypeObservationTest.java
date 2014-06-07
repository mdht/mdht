/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.AdverseEventTypeObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Adverse Event Type Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation#validateAdverseEventTypeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation#validateAdverseEventTypeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation#validateAdverseEventTypeObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation#validateAdverseEventTypeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation#validateAdverseEventTypeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservation#validateAdverseEventTypeObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Type Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdverseEventTypeObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdverseEventTypeObservationTemplateId() {
		OperationsTestCase<AdverseEventTypeObservation> validateAdverseEventTypeObservationTemplateIdTestCase = new OperationsTestCase<AdverseEventTypeObservation>(
			"validateAdverseEventTypeObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdverseEventTypeObservation target) {

			}

			@Override
			protected void updateToPass(AdverseEventTypeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdverseEventTypeObservationOperations.validateAdverseEventTypeObservationTemplateId(
					(AdverseEventTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdverseEventTypeObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdverseEventTypeObservationMoodCode() {
		OperationsTestCase<AdverseEventTypeObservation> validateAdverseEventTypeObservationMoodCodeTestCase = new OperationsTestCase<AdverseEventTypeObservation>(
			"validateAdverseEventTypeObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdverseEventTypeObservation target) {

			}

			@Override
			protected void updateToPass(AdverseEventTypeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdverseEventTypeObservationOperations.validateAdverseEventTypeObservationMoodCode(
					(AdverseEventTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdverseEventTypeObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdverseEventTypeObservationCodeP() {
		OperationsTestCase<AdverseEventTypeObservation> validateAdverseEventTypeObservationCodePTestCase = new OperationsTestCase<AdverseEventTypeObservation>(
			"validateAdverseEventTypeObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdverseEventTypeObservation target) {

			}

			@Override
			protected void updateToPass(AdverseEventTypeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdverseEventTypeObservationOperations.validateAdverseEventTypeObservationCodeP(
					(AdverseEventTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdverseEventTypeObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdverseEventTypeObservationCode() {
		OperationsTestCase<AdverseEventTypeObservation> validateAdverseEventTypeObservationCodeTestCase = new OperationsTestCase<AdverseEventTypeObservation>(
			"validateAdverseEventTypeObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdverseEventTypeObservation target) {

			}

			@Override
			protected void updateToPass(AdverseEventTypeObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(AdverseEventTypeObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventTypeObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdverseEventTypeObservationOperations.validateAdverseEventTypeObservationCode(
					(AdverseEventTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdverseEventTypeObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdverseEventTypeObservationValue() {
		OperationsTestCase<AdverseEventTypeObservation> validateAdverseEventTypeObservationValueTestCase = new OperationsTestCase<AdverseEventTypeObservation>(
			"validateAdverseEventTypeObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdverseEventTypeObservation target) {

			}

			@Override
			protected void updateToPass(AdverseEventTypeObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdverseEventTypeObservationOperations.validateAdverseEventTypeObservationValue(
					(AdverseEventTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdverseEventTypeObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdverseEventTypeObservationValueP() {
		OperationsTestCase<AdverseEventTypeObservation> validateAdverseEventTypeObservationValuePTestCase = new OperationsTestCase<AdverseEventTypeObservation>(
			"validateAdverseEventTypeObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_TYPE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdverseEventTypeObservation target) {

			}

			@Override
			protected void updateToPass(AdverseEventTypeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdverseEventTypeObservationOperations.validateAdverseEventTypeObservationValueP(
					(AdverseEventTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdverseEventTypeObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdverseEventTypeObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdverseEventTypeObservation> {
		public AdverseEventTypeObservation create() {
			return EmspcrFactory.eINSTANCE.createAdverseEventTypeObservation();
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
	private static class ConstructorTestClass extends AdverseEventTypeObservationOperations {
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

} // AdverseEventTypeObservationOperations
