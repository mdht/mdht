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

import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_ParticipantSupport;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraints_ParticipantSupportOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints Participant Support</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_ParticipantSupport#validateParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Participant Support Associated Entity Has Associated Person Or Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_ParticipantSupport#validateParticipantSupportTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Participant Support Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralHeaderConstraints_ParticipantSupportTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization() {
		OperationsTestCase<GeneralHeaderConstraints_ParticipantSupport> validateParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganizationTestCase = new OperationsTestCase<GeneralHeaderConstraints_ParticipantSupport>(
			"validateParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization",
			operationsForOCL.getOCLValue("VALIDATE_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints_ParticipantSupport target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints_ParticipantSupport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraints_ParticipantSupportOperations.validateParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
					(GeneralHeaderConstraints_ParticipantSupport) objectToTest, diagnostician, map);
			}

		};

		validateParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateParticipantSupportTime() {
		OperationsTestCase<GeneralHeaderConstraints_ParticipantSupport> validateParticipantSupportTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints_ParticipantSupport>(
			"validateParticipantSupportTime",
			operationsForOCL.getOCLValue("VALIDATE_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints_ParticipantSupport target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints_ParticipantSupport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraints_ParticipantSupportOperations.validateParticipantSupportTime(
					(GeneralHeaderConstraints_ParticipantSupport) objectToTest, diagnostician, map);
			}

		};

		validateParticipantSupportTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GeneralHeaderConstraints_ParticipantSupportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GeneralHeaderConstraints_ParticipantSupport> {
		public GeneralHeaderConstraints_ParticipantSupport create() {
			return ConsolFactory.eINSTANCE.createGeneralHeaderConstraints_ParticipantSupport();
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
	private static class ConstructorTestClass extends GeneralHeaderConstraints_ParticipantSupportOperations {
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

} // GeneralHeaderConstraints_ParticipantSupportOperations
