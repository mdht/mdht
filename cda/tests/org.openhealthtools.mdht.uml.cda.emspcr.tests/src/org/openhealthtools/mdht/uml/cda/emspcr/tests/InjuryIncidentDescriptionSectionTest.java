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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.InjuryIncidentDescriptionSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Injury Incident Description Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionInjuryCauseCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Injury Cause Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionInjuryMechanism(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Injury Mechanism</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionTraumaCenterCriteria(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Trauma Center Criteria</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionInjuryRiskFactor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Injury Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionVehicleImpactArea(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Vehicle Impact Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionPatientLocationInVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Patient Location In Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Vehicle Occupant Safety Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionAirbagDeploymentStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Airbag Deployment Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionHeightOfFall(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Height Of Fall</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#validateInjuryIncidentDescriptionSectionDisasterType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Incident Description Section Disaster Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getInjuryCauseCategory() <em>Get Injury Cause Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getInjuryMechanism() <em>Get Injury Mechanism</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getTraumaCenterCriteria() <em>Get Trauma Center Criteria</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getInjuryRiskFactor() <em>Get Injury Risk Factor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getVehicleImpactArea() <em>Get Vehicle Impact Area</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getPatientLocationInVehicle() <em>Get Patient Location In Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getVehicleOccupantSafetyEquipment() <em>Get Vehicle Occupant Safety Equipment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getAirbagDeploymentStatus() <em>Get Airbag Deployment Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getHeightOfFall() <em>Get Height Of Fall</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection#getDisasterType() <em>Get Disaster Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InjuryIncidentDescriptionSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionTemplateId() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionTemplateIdTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionTemplateId(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionCode() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionCodeTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionCode(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionTitle() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionTitleTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionTitle(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionText() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionTextTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionText",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionText(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionInjuryCauseCategory() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionInjuryCauseCategoryTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionInjuryCauseCategory",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_CAUSE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionInjuryCauseCategory(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionInjuryCauseCategoryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionInjuryMechanism() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionInjuryMechanismTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionInjuryMechanism",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_MECHANISM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionInjuryMechanism(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionInjuryMechanismTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionTraumaCenterCriteria() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionTraumaCenterCriteriaTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionTraumaCenterCriteria",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_TRAUMA_CENTER_CRITERIA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionTraumaCenterCriteria(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionTraumaCenterCriteriaTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionInjuryRiskFactor() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionInjuryRiskFactorTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionInjuryRiskFactor",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_INJURY_RISK_FACTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionInjuryRiskFactor(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionInjuryRiskFactorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionVehicleImpactArea() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionVehicleImpactAreaTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionVehicleImpactArea",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_IMPACT_AREA__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionVehicleImpactArea(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionVehicleImpactAreaTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionPatientLocationInVehicle() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionPatientLocationInVehicleTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionPatientLocationInVehicle",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_PATIENT_LOCATION_IN_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionPatientLocationInVehicle(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionPatientLocationInVehicleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipment(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionVehicleOccupantSafetyEquipmentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionAirbagDeploymentStatus() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionAirbagDeploymentStatusTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionAirbagDeploymentStatus",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_AIRBAG_DEPLOYMENT_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionAirbagDeploymentStatus(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionAirbagDeploymentStatusTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionHeightOfFall() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionHeightOfFallTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionHeightOfFall",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_HEIGHT_OF_FALL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionHeightOfFall(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionHeightOfFallTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryIncidentDescriptionSectionDisasterType() {
		OperationsTestCase<InjuryIncidentDescriptionSection> validateInjuryIncidentDescriptionSectionDisasterTypeTestCase = new OperationsTestCase<InjuryIncidentDescriptionSection>(
			"validateInjuryIncidentDescriptionSectionDisasterType",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_INCIDENT_DESCRIPTION_SECTION_DISASTER_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(InjuryIncidentDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryIncidentDescriptionSectionOperations.validateInjuryIncidentDescriptionSectionDisasterType(
					(InjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateInjuryIncidentDescriptionSectionDisasterTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInjuryCauseCategory() {

		InjuryIncidentDescriptionSection target = objectFactory.create();
		target.getInjuryCauseCategory();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInjuryMechanism() {

		InjuryIncidentDescriptionSection target = objectFactory.create();
		target.getInjuryMechanism();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetTraumaCenterCriteria() {

		InjuryIncidentDescriptionSection target = objectFactory.create();
		target.getTraumaCenterCriteria();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInjuryRiskFactor() {

		InjuryIncidentDescriptionSection target = objectFactory.create();
		target.getInjuryRiskFactor();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVehicleImpactArea() {

		InjuryIncidentDescriptionSection target = objectFactory.create();
		target.getVehicleImpactArea();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientLocationInVehicle() {

		InjuryIncidentDescriptionSection target = objectFactory.create();
		target.getPatientLocationInVehicle();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVehicleOccupantSafetyEquipment() {

		InjuryIncidentDescriptionSection target = objectFactory.create();
		target.getVehicleOccupantSafetyEquipment();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAirbagDeploymentStatus() {

		InjuryIncidentDescriptionSection target = objectFactory.create();
		target.getAirbagDeploymentStatus();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHeightOfFall() {

		InjuryIncidentDescriptionSection target = objectFactory.create();
		target.getHeightOfFall();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDisasterType() {

		InjuryIncidentDescriptionSection target = objectFactory.create();
		target.getDisasterType();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InjuryIncidentDescriptionSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InjuryIncidentDescriptionSection> {
		public InjuryIncidentDescriptionSection create() {
			return EmspcrFactory.eINSTANCE.createInjuryIncidentDescriptionSection();
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
	private static class ConstructorTestClass extends InjuryIncidentDescriptionSectionOperations {
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

} // InjuryIncidentDescriptionSectionOperations
