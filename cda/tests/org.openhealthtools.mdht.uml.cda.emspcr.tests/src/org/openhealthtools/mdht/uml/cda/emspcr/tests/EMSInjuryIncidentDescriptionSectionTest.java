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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSInjuryIncidentDescriptionSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Injury Incident Description Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Injury Cause Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionInjuryMechanism(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Injury Mechanism</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Trauma Center Criteria</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Injury Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionVehicleImpactArea(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Vehicle Impact Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Patient Location In Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Vehicle Occupant Safety Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Airbag Deployment Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionHeightOfFall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Height Of Fall</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionDisasterType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Disaster Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getInjuryCauseCategory() <em>Get Injury Cause Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getInjuryMechanism() <em>Get Injury Mechanism</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getTraumaCenterCriteria() <em>Get Trauma Center Criteria</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getInjuryRiskFactor() <em>Get Injury Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getVehicleImpactArea() <em>Get Vehicle Impact Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getPatientLocationInVehicle() <em>Get Patient Location In Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getVehicleOccupantSafetyEquipment() <em>Get Vehicle Occupant Safety Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getAirbagDeploymentStatus() <em>Get Airbag Deployment Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getHeightOfFall() <em>Get Height Of Fall</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#getDisasterType() <em>Get Disaster Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSInjuryIncidentDescriptionSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionTemplateId() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionTemplateIdTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionTemplateId(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionCode() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionCodeTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionCode(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionTitle() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionTitleTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionTitle(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionText() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionTextTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionText(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategoryTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategory(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionInjuryCauseCategoryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionInjuryMechanism() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionInjuryMechanismTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionInjuryMechanism",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionInjuryMechanism(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionInjuryMechanismTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteria(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionTraumaCenterCriteriaTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactorTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactor(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionInjuryRiskFactorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionVehicleImpactArea() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionVehicleImpactAreaTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionVehicleImpactArea",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionVehicleImpactArea(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionVehicleImpactAreaTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicle(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionPatientLocationInVehicleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatusTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatus(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionAirbagDeploymentStatusTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionHeightOfFall() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionHeightOfFallTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionHeightOfFall",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionHeightOfFall(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionHeightOfFallTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionDisasterType() {
		OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionDisasterTypeTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionDisasterType",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionDisasterType(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionDisasterTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInjuryCauseCategory() {

		EMSInjuryIncidentDescriptionSection target = objectFactory.create();
		target.getInjuryCauseCategory();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInjuryMechanism() {

		EMSInjuryIncidentDescriptionSection target = objectFactory.create();
		target.getInjuryMechanism();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetTraumaCenterCriteria() {

		EMSInjuryIncidentDescriptionSection target = objectFactory.create();
		target.getTraumaCenterCriteria();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInjuryRiskFactor() {

		EMSInjuryIncidentDescriptionSection target = objectFactory.create();
		target.getInjuryRiskFactor();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVehicleImpactArea() {

		EMSInjuryIncidentDescriptionSection target = objectFactory.create();
		target.getVehicleImpactArea();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientLocationInVehicle() {

		EMSInjuryIncidentDescriptionSection target = objectFactory.create();
		target.getPatientLocationInVehicle();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVehicleOccupantSafetyEquipment() {

		EMSInjuryIncidentDescriptionSection target = objectFactory.create();
		target.getVehicleOccupantSafetyEquipment();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAirbagDeploymentStatus() {

		EMSInjuryIncidentDescriptionSection target = objectFactory.create();
		target.getAirbagDeploymentStatus();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHeightOfFall() {

		EMSInjuryIncidentDescriptionSection target = objectFactory.create();
		target.getHeightOfFall();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDisasterType() {

		EMSInjuryIncidentDescriptionSection target = objectFactory.create();
		target.getDisasterType();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSInjuryIncidentDescriptionSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSInjuryIncidentDescriptionSection> {
		public EMSInjuryIncidentDescriptionSection create() {
			return EmspcrFactory.eINSTANCE.createEMSInjuryIncidentDescriptionSection();
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
	private static class ConstructorTestClass extends EMSInjuryIncidentDescriptionSectionOperations {
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

} // EMSInjuryIncidentDescriptionSectionOperations
