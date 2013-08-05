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

import org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.AdditionalVitalSignsOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Additional Vital Signs Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerStrokeScoreComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Stroke Score Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerPainScoreComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Pain Score Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Level Of Responsiveness Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerBloodGlucoseComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Blood Glucose Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerCarbonMonoxideComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Carbon Monoxide Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerCarbonDioxideComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Carbon Dioxide Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerCardiacRhythmComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Cardiac Rhythm Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Glasgow Coma Score Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getStrokeScoreComponent() <em>Get Stroke Score Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getPainScoreComponent() <em>Get Pain Score Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getLevelOfResponsivenessComponent() <em>Get Level Of Responsiveness Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getBloodGlucoseComponent() <em>Get Blood Glucose Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getCarbonMonoxideComponent() <em>Get Carbon Monoxide Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getCarbonDioxideComponent() <em>Get Carbon Dioxide Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getCardiacRhythmComponent() <em>Get Cardiac Rhythm Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#getGlasgowComaScoreOrganizers() <em>Get Glasgow Coma Score Organizers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdditionalVitalSignsOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerStrokeScoreComponent() {
		OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerStrokeScoreComponentTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerStrokeScoreComponent",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_STROKE_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerStrokeScoreComponent(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerStrokeScoreComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerPainScoreComponent() {
		OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerPainScoreComponentTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerPainScoreComponent",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_PAIN_SCORE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerPainScoreComponent(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerPainScoreComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent() {
		OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponentTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_LEVEL_OF_RESPONSIVENESS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponent(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerLevelOfResponsivenessComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerBloodGlucoseComponent() {
		OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerBloodGlucoseComponentTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerBloodGlucoseComponent",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_BLOOD_GLUCOSE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerBloodGlucoseComponent(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerBloodGlucoseComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerCarbonMonoxideComponent() {
		OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerCarbonMonoxideComponentTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerCarbonMonoxideComponent",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_MONOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerCarbonMonoxideComponent(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerCarbonMonoxideComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerCarbonDioxideComponent() {
		OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerCarbonDioxideComponentTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerCarbonDioxideComponent",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARBON_DIOXIDE_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerCarbonDioxideComponent(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerCarbonDioxideComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerCardiacRhythmComponent() {
		OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerCardiacRhythmComponentTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerCardiacRhythmComponent",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_CARDIAC_RHYTHM_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerCardiacRhythmComponent(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerCardiacRhythmComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerTemplateId() {
		OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerTemplateIdTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerTemplateId(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerEffectiveTime() {
		OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerEffectiveTimeTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerEffectiveTime(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerMoodCode() {
		OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerMoodCodeTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerMoodCode(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer() {
		OperationsTestCase<AdditionalVitalSignsOrganizer> validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizerTestCase = new OperationsTestCase<AdditionalVitalSignsOrganizer>(
			"validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_GLASGOW_COMA_SCORE_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdditionalVitalSignsOrganizer target) {

			}

			@Override
			protected void updateToPass(AdditionalVitalSignsOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdditionalVitalSignsOrganizerOperations.validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizer(
					(AdditionalVitalSignsOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateAdditionalVitalSignsOrganizerGlasgowComaScoreOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetStrokeScoreComponent() {

		AdditionalVitalSignsOrganizer target = objectFactory.create();
		target.getStrokeScoreComponent();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPainScoreComponent() {

		AdditionalVitalSignsOrganizer target = objectFactory.create();
		target.getPainScoreComponent();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetLevelOfResponsivenessComponent() {

		AdditionalVitalSignsOrganizer target = objectFactory.create();
		target.getLevelOfResponsivenessComponent();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetBloodGlucoseComponent() {

		AdditionalVitalSignsOrganizer target = objectFactory.create();
		target.getBloodGlucoseComponent();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCarbonMonoxideComponent() {

		AdditionalVitalSignsOrganizer target = objectFactory.create();
		target.getCarbonMonoxideComponent();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCarbonDioxideComponent() {

		AdditionalVitalSignsOrganizer target = objectFactory.create();
		target.getCarbonDioxideComponent();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCardiacRhythmComponent() {

		AdditionalVitalSignsOrganizer target = objectFactory.create();
		target.getCardiacRhythmComponent();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGlasgowComaScoreOrganizers() {

		AdditionalVitalSignsOrganizer target = objectFactory.create();
		target.getGlasgowComaScoreOrganizers();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdditionalVitalSignsOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdditionalVitalSignsOrganizer> {
		public AdditionalVitalSignsOrganizer create() {
			return EmspcrFactory.eINSTANCE.createAdditionalVitalSignsOrganizer();
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
	private static class ConstructorTestClass extends AdditionalVitalSignsOrganizerOperations {
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

} // AdditionalVitalSignsOrganizerOperations
