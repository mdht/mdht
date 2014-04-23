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
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicationAdministeredOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Administered</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationNotAdministeredEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Not Administered Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredResponseRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Response Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationComplicationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Complication Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationPriorAdministrationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Prior Administration Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationPerformerParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Performer Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationAuthorizationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Authorization Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredMedicationAdministrationDeviceParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Medication Administration Device Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered#validateMedicationAdministeredRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Administered Rate Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationAdministeredTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredMedicationNotAdministeredEntryRelationship() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredMedicationNotAdministeredEntryRelationshipTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredMedicationNotAdministeredEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_NOT_ADMINISTERED_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredMedicationNotAdministeredEntryRelationship(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredMedicationNotAdministeredEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredMedicationConsumable() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredMedicationConsumableTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredMedicationConsumable",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredMedicationConsumable(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredMedicationConsumableTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredResponseRelationship() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredResponseRelationshipTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredResponseRelationship",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredResponseRelationship(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredResponseRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredMedicationComplicationRelationship() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredMedicationComplicationRelationshipTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredMedicationComplicationRelationship",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_COMPLICATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredMedicationComplicationRelationship(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredMedicationComplicationRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredMedicationPriorAdministrationRelationship() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredMedicationPriorAdministrationRelationshipTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredMedicationPriorAdministrationRelationship",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PRIOR_ADMINISTRATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredMedicationPriorAdministrationRelationship(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredMedicationPriorAdministrationRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredMedicationPerformerParticipation() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredMedicationPerformerParticipationTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredMedicationPerformerParticipation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_PERFORMER_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredMedicationPerformerParticipation(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredMedicationPerformerParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredMedicationAuthorizationRelationship() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredMedicationAuthorizationRelationshipTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredMedicationAuthorizationRelationship",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_AUTHORIZATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredMedicationAuthorizationRelationship(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredMedicationAuthorizationRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredMedicationAdministrationDeviceParticipant() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredMedicationAdministrationDeviceParticipantTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredMedicationAdministrationDeviceParticipant",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_MEDICATION_ADMINISTRATION_DEVICE_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredMedicationAdministrationDeviceParticipant(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredMedicationAdministrationDeviceParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredTemplateId() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredTemplateIdTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredTemplateId(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredClassCode() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredClassCodeTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredClassCode(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredNegationInd() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredNegationIndTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredNegationInd(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationAdministeredEffectiveTime() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredEffectiveTimeTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

				// IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
				// target.setEffectiveTime(ts );

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredEffectiveTime(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredRouteCodeP() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredRouteCodePTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredRouteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredRouteCodeP(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredRouteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredRouteCode() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredRouteCodeTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected void setDependency(MedicationAdministered target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministeredRouteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredRouteCode(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredRouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredApproachSiteCodeP() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredApproachSiteCodePTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredApproachSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredApproachSiteCodeP(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredApproachSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredApproachSiteCode() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredApproachSiteCodeTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected void setDependency(MedicationAdministered target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministeredApproachSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredApproachSiteCode(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredDoseQuantity() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredDoseQuantityTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredDoseQuantity(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationAdministeredRateQuantity() {
		OperationsTestCase<MedicationAdministered> validateMedicationAdministeredRateQuantityTestCase = new OperationsTestCase<MedicationAdministered>(
			"validateMedicationAdministeredRateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ADMINISTERED_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationAdministered target) {

			}

			@Override
			protected void updateToPass(MedicationAdministered target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationAdministeredOperations.validateMedicationAdministeredRateQuantity(
					(MedicationAdministered) objectToTest, diagnostician, map);
			}

		};

		validateMedicationAdministeredRateQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationAdministeredOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationAdministered> {
		public MedicationAdministered create() {
			return EmspcrFactory.eINSTANCE.createMedicationAdministered();
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
	private static class ConstructorTestClass extends MedicationAdministeredOperations {
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

} // MedicationAdministeredOperations
