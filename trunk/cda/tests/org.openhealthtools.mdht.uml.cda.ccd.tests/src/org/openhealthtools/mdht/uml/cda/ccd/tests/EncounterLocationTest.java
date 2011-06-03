/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncounterLocationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Encounter Location</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation#validateEncounterLocationHasParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation#validateEncounterLocationHasParticipantRoleLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation#validateEncounterLocationHasParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation#validateEncounterLocationHasParticipantRoleCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Participant Role Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation#validateEncounterLocationHasPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation#validateEncounterLocationHasPlayingEntityPlace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Has Playing Entity Place</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation#validateEncounterLocationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation#validateEncounterLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Location Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterLocationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncounterLocationHasParticipantRole() {
		OperationsTestCase<EncounterLocation> validateEncounterLocationHasParticipantRoleTestCase = new OperationsTestCase<EncounterLocation>(
			"validateEncounterLocationHasParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterLocation target) {

			}

			@Override
			protected void updateToPass(EncounterLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterLocationOperations.validateEncounterLocationHasParticipantRole(
					(EncounterLocation) objectToTest, diagnostician, map);
			}

		};

		validateEncounterLocationHasParticipantRoleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncounterLocationHasParticipantRoleLocation() {
		OperationsTestCase<EncounterLocation> validateEncounterLocationHasParticipantRoleLocationTestCase = new OperationsTestCase<EncounterLocation>(
			"validateEncounterLocationHasParticipantRoleLocation",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterLocation target) {

			}

			@Override
			protected void updateToPass(EncounterLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterLocationOperations.validateEncounterLocationHasParticipantRoleLocation(
					(EncounterLocation) objectToTest, diagnostician, map);
			}

		};

		validateEncounterLocationHasParticipantRoleLocationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncounterLocationHasParticipantRoleCode() {
		OperationsTestCase<EncounterLocation> validateEncounterLocationHasParticipantRoleCodeTestCase = new OperationsTestCase<EncounterLocation>(
			"validateEncounterLocationHasParticipantRoleCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterLocation target) {

			}

			@Override
			protected void updateToPass(EncounterLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterLocationOperations.validateEncounterLocationHasParticipantRoleCode(
					(EncounterLocation) objectToTest, diagnostician, map);
			}

		};

		validateEncounterLocationHasParticipantRoleCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncounterLocationHasParticipantRoleCodeVocab() {
		OperationsTestCase<EncounterLocation> validateEncounterLocationHasParticipantRoleCodeVocabTestCase = new OperationsTestCase<EncounterLocation>(
			"validateEncounterLocationHasParticipantRoleCodeVocab",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_LOCATION_HAS_PARTICIPANT_ROLE_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterLocation target) {

			}

			@Override
			protected void updateToPass(EncounterLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterLocationOperations.validateEncounterLocationHasParticipantRoleCodeVocab(
					(EncounterLocation) objectToTest, diagnostician, map);
			}

		};

		validateEncounterLocationHasParticipantRoleCodeVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncounterLocationHasPlayingEntity() {
		OperationsTestCase<EncounterLocation> validateEncounterLocationHasPlayingEntityTestCase = new OperationsTestCase<EncounterLocation>(
			"validateEncounterLocationHasPlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterLocation target) {

			}

			@Override
			protected void updateToPass(EncounterLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterLocationOperations.validateEncounterLocationHasPlayingEntity(
					(EncounterLocation) objectToTest, diagnostician, map);
			}

		};

		validateEncounterLocationHasPlayingEntityTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncounterLocationHasPlayingEntityPlace() {
		OperationsTestCase<EncounterLocation> validateEncounterLocationHasPlayingEntityPlaceTestCase = new OperationsTestCase<EncounterLocation>(
			"validateEncounterLocationHasPlayingEntityPlace",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_LOCATION_HAS_PLAYING_ENTITY_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterLocation target) {

			}

			@Override
			protected void updateToPass(EncounterLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterLocationOperations.validateEncounterLocationHasPlayingEntityPlace(
					(EncounterLocation) objectToTest, diagnostician, map);
			}

		};

		validateEncounterLocationHasPlayingEntityPlaceTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncounterLocationTemplateId() {
		OperationsTestCase<EncounterLocation> validateEncounterLocationTemplateIdTestCase = new OperationsTestCase<EncounterLocation>(
			"validateEncounterLocationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterLocation target) {

			}

			@Override
			protected void updateToPass(EncounterLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterLocationOperations.validateEncounterLocationTemplateId(
					(EncounterLocation) objectToTest, diagnostician, map);
			}

		};

		validateEncounterLocationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncounterLocationTypeCode() {
		OperationsTestCase<EncounterLocation> validateEncounterLocationTypeCodeTestCase = new OperationsTestCase<EncounterLocation>(
			"validateEncounterLocationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterLocation target) {

			}

			@Override
			protected void updateToPass(EncounterLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterLocationOperations.validateEncounterLocationTypeCode(
					(EncounterLocation) objectToTest, diagnostician, map);
			}

		};

		validateEncounterLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends EncounterLocationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterLocation> {
		public EncounterLocation create() {
			return CCDFactory.eINSTANCE.createEncounterLocation();
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
	private static class ConstructorTestClass extends EncounterLocationOperations {
	}

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

} // EncounterLocationOperations
