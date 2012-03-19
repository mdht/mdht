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
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservationParticipantRole;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyObservationParticipantRoleOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Observation Participant Role</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationParticipantRole#validateAllergyObservationParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationParticipantRole#validateAllergyObservationParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant Role Playing Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyObservationParticipantRoleTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationParticipantRoleClassCode() {
		OperationsTestCase<AllergyObservationParticipantRole> validateAllergyObservationParticipantRoleClassCodeTestCase = new OperationsTestCase<AllergyObservationParticipantRole>(
			"validateAllergyObservationParticipantRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservationParticipantRole target) {

			}

			@Override
			protected void updateToPass(AllergyObservationParticipantRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationParticipantRoleOperations.validateAllergyObservationParticipantRoleClassCode(
					(AllergyObservationParticipantRole) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationParticipantRolePlayingEntity() {
		OperationsTestCase<AllergyObservationParticipantRole> validateAllergyObservationParticipantRolePlayingEntityTestCase = new OperationsTestCase<AllergyObservationParticipantRole>(
			"validateAllergyObservationParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservationParticipantRole target) {

				target.init();

			}

			@Override
			protected void updateToPass(AllergyObservationParticipantRole target) {
				target.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationParticipantRoleOperations.validateAllergyObservationParticipantRolePlayingEntity(
					(AllergyObservationParticipantRole) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyObservationParticipantRoleOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyObservationParticipantRole> {
		public AllergyObservationParticipantRole create() {
			return ConsolFactory.eINSTANCE.createAllergyObservationParticipantRole();
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
	private static class ConstructorTestClass extends AllergyObservationParticipantRoleOperations {
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

} // AllergyObservationParticipantRoleOperations
