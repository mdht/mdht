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
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivities;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterActivitiesOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Activities</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesCodeOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesCodeOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesServiceDeliveryTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Service Delivery Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesEncounterPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Encounter Performer Encounter Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#getServiceDeliveryLocations() <em>Get Service Delivery Locations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterActivities#getIndications() <em>Get Indications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterActivitiesTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesCodeOriginalText() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesCodeOriginalTextTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesCodeOriginalText(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesCodeOriginalTextReference() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesCodeOriginalTextReferenceTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesCodeOriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_CODE_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.setCode(code);
			}

			@Override
			protected void updateToPass(EncounterActivities target) {

				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				ot.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				code.setOriginalText(ot);

				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesCodeOriginalTextReference(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesCodeOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesCodeOriginalTextReferenceValue() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesCodeOriginalTextReferenceValueTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesCodeOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_CODE_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesCodeOriginalTextReferenceValue(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesCodeOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesServiceDeliveryTypeCode() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesServiceDeliveryTypeCodeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesServiceDeliveryTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation());
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.LOC);
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation());
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesServiceDeliveryTypeCode(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesServiceDeliveryTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesTemplateId() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesTemplateIdTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesTemplateId(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesClassCode() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesClassCodeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesClassCode(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesMoodCode() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesMoodCodeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesMoodCode(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesId() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesIdTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesId(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesCode() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesCodeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCode("test");
				code.setCodeSystem("2.16.840.1.113883.6.12");
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesCode(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesEffectiveTime() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesEffectiveTimeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesEffectiveTime(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterActivitiesServiceDeliveryLocation() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesServiceDeliveryLocationTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesServiceDeliveryLocation",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.LOC);
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation());
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesServiceDeliveryLocation(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesServiceDeliveryLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesIndication() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesIndicationTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesIndication",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesIndication(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterPerformer() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesEncounterPerformerTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesEncounterPerformer",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesEncounterPerformer(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCode(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity() {
		OperationsTestCase<EncounterActivities> validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityTestCase = new OperationsTestCase<EncounterActivities>(
			"validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations.validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntity(
					(EncounterActivities) objectToTest, diagnostician, map);
			}

		};

		validateEncounterActivitiesEncounterPerformerEncounterPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetServiceDeliveryLocations() {

		EncounterActivities target = objectFactory.create();
		target.getServiceDeliveryLocations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndications() {

		EncounterActivities target = objectFactory.create();
		target.getIndications();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterActivitiesOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterActivities> {
		public EncounterActivities create() {
			return ConsolFactory.eINSTANCE.createEncounterActivities();
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
	private static class ConstructorTestClass extends EncounterActivitiesOperations {
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

} // EncounterActivitiesOperations
