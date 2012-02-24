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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.FamilyHistoryOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerHasParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerHasParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerHasParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Has Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#validateIHEFamilyHistoryOrganizerFamilyHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Organizer Family History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer#getIHEFamilyHistoryObservations() <em>Get IHE Family History Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIHEFamilyHistoryOrganizerHasParticipant() {
		OperationsTestCase<FamilyHistoryOrganizer> validateIHEFamilyHistoryOrganizerHasParticipantTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateIHEFamilyHistoryOrganizerHasParticipant",
			operationsForOCL.getOCLValue("VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateIHEFamilyHistoryOrganizerHasParticipant(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEFamilyHistoryOrganizerHasParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIHEFamilyHistoryOrganizerHasParticipantParticipantRole() {
		OperationsTestCase<FamilyHistoryOrganizer> validateIHEFamilyHistoryOrganizerHasParticipantParticipantRoleTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateIHEFamilyHistoryOrganizerHasParticipantParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {

				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.PRS);
				pr.setCode(DatatypesFactory.eINSTANCE.createCE());
				p2.setParticipantRole(pr);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateIHEFamilyHistoryOrganizerHasParticipantParticipantRole(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEFamilyHistoryOrganizerHasParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIHEFamilyHistoryOrganizerHasParticipantRoleCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateIHEFamilyHistoryOrganizerHasParticipantRoleCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateIHEFamilyHistoryOrganizerHasParticipantRoleCode",
			operationsForOCL.getOCLValue("VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {

				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setCode(DatatypesFactory.eINSTANCE.createCE());
				p2.setParticipantRole(pr);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateIHEFamilyHistoryOrganizerHasParticipantRoleCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEFamilyHistoryOrganizerHasParticipantRoleCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity() {
		OperationsTestCase<FamilyHistoryOrganizer> validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntityTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {

				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setCode(DatatypesFactory.eINSTANCE.createCE());
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pe.setClassCode(EntityClassRoot.PSN);
				pr.setPlayingEntity(pe);
				p2.setParticipantRole(pr);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntity(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEFamilyHistoryOrganizerHasParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHEFamilyHistoryOrganizerTemplateId() {
		OperationsTestCase<FamilyHistoryOrganizer> validateIHEFamilyHistoryOrganizerTemplateIdTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateIHEFamilyHistoryOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateIHEFamilyHistoryOrganizerTemplateId(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEFamilyHistoryOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHEFamilyHistoryOrganizerCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateIHEFamilyHistoryOrganizerCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateIHEFamilyHistoryOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateIHEFamilyHistoryOrganizerCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEFamilyHistoryOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateIHEFamilyHistoryOrganizerFamilyHistoryObservation() {
		OperationsTestCase<FamilyHistoryOrganizer> validateIHEFamilyHistoryOrganizerFamilyHistoryObservationTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateIHEFamilyHistoryOrganizerFamilyHistoryObservation",
			operationsForOCL.getOCLValue("VALIDATE_IHE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {
				target.init();
			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {

				target.addObservation(IHEFactory.eINSTANCE.createFamilyHistoryObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateIHEFamilyHistoryOrganizerFamilyHistoryObservation(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateIHEFamilyHistoryOrganizerFamilyHistoryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIHEFamilyHistoryObservations() {

		FamilyHistoryOrganizer target = objectFactory.create();
		target.getIHEFamilyHistoryObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryOrganizer> {
		public FamilyHistoryOrganizer create() {
			return IHEFactory.eINSTANCE.createFamilyHistoryOrganizer();
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
	private static class ConstructorTestClass extends FamilyHistoryOrganizerOperations {
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

} // FamilyHistoryOrganizerOperations
