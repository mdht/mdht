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

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacArrestExistenceOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Arrest Existence</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceCardiacArrestCauseRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Cardiac Arrest Cause Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceCardiacArrestInformantParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Cardiac Arrest Informant Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistencePriorCPRRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Prior CPR Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistencePriorAEDRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Prior AED Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceSpontaneousCirculationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Spontaneous Circulation Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceDestinationRhythmRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Destination Rhythm Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceArrestRhythmRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Arrest Rhythm Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestExistence#validateCardiacArrestExistenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Existence Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CardiacArrestExistenceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistenceCardiacArrestCauseRelationship() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistenceCardiacArrestCauseRelationshipTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistenceCardiacArrestCauseRelationship",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_CAUSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistenceCardiacArrestCauseRelationship(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistenceCardiacArrestCauseRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistenceCardiacArrestInformantParticipation() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistenceCardiacArrestInformantParticipationTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistenceCardiacArrestInformantParticipation",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_CARDIAC_ARREST_INFORMANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistenceCardiacArrestInformantParticipation(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistenceCardiacArrestInformantParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistencePriorCPRRelationship() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistencePriorCPRRelationshipTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistencePriorCPRRelationship",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_CPR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistencePriorCPRRelationship(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistencePriorCPRRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistencePriorAEDRelationship() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistencePriorAEDRelationshipTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistencePriorAEDRelationship",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_PRIOR_AED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistencePriorAEDRelationship(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistencePriorAEDRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistenceSpontaneousCirculationRelationship() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistenceSpontaneousCirculationRelationshipTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistenceSpontaneousCirculationRelationship",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_SPONTANEOUS_CIRCULATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistenceSpontaneousCirculationRelationship(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistenceSpontaneousCirculationRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistenceDestinationRhythmRelationship() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistenceDestinationRhythmRelationshipTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistenceDestinationRhythmRelationship",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_DESTINATION_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistenceDestinationRhythmRelationship(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistenceDestinationRhythmRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistenceArrestRhythmRelationship() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistenceArrestRhythmRelationshipTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistenceArrestRhythmRelationship",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_ARREST_RHYTHM_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistenceArrestRhythmRelationship(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistenceArrestRhythmRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistenceTemplateId() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistenceTemplateIdTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistenceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistenceTemplateId(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistenceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistenceCode() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistenceCodeTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistenceCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistenceCode(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistenceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistenceEffectiveTime() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistenceEffectiveTimeTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistenceEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistenceEffectiveTime(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistenceEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistenceValue() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistenceValueTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistenceValue",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistenceValue(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistenceNegationInd() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistenceNegationIndTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistenceNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistenceNegationInd(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistenceNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestExistenceMoodCode() {
		OperationsTestCase<CardiacArrestExistence> validateCardiacArrestExistenceMoodCodeTestCase = new OperationsTestCase<CardiacArrestExistence>(
			"validateCardiacArrestExistenceMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_EXISTENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestExistence target) {

			}

			@Override
			protected void updateToPass(CardiacArrestExistence target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestExistenceOperations.validateCardiacArrestExistenceMoodCode(
					(CardiacArrestExistence) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestExistenceMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CardiacArrestExistenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CardiacArrestExistence> {
		public CardiacArrestExistence create() {
			return EmspcrFactory.eINSTANCE.createCardiacArrestExistence();
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
	private static class ConstructorTestClass extends CardiacArrestExistenceOperations {
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

} // CardiacArrestExistenceOperations
