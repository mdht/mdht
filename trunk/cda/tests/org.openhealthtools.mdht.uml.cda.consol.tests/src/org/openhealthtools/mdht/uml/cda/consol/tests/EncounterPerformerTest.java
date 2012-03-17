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
import org.openhealthtools.mdht.uml.cda.consol.EncounterPerformer;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterPerformerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Performer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterPerformer#validateEncounterPerformerEncounterPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Performer Encounter Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterPerformer#validateEncounterPerformerEncounterPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Performer Encounter Performer Assigned Entity Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterPerformerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterPerformerEncounterPerformerAssignedEntity() {
		OperationsTestCase<EncounterPerformer> validateEncounterPerformerEncounterPerformerAssignedEntityTestCase = new OperationsTestCase<EncounterPerformer>(
			"validateEncounterPerformerEncounterPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterPerformer target) {

			}

			@Override
			protected void updateToPass(EncounterPerformer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterPerformerOperations.validateEncounterPerformerEncounterPerformerAssignedEntity(
					(EncounterPerformer) objectToTest, diagnostician, map);
			}

		};

		validateEncounterPerformerEncounterPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterPerformerEncounterPerformerAssignedEntityCode() {
		OperationsTestCase<EncounterPerformer> validateEncounterPerformerEncounterPerformerAssignedEntityCodeTestCase = new OperationsTestCase<EncounterPerformer>(
			"validateEncounterPerformerEncounterPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_PERFORMER_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterPerformer target) {

			}

			@Override
			protected void updateToPass(EncounterPerformer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterPerformerOperations.validateEncounterPerformerEncounterPerformerAssignedEntityCode(
					(EncounterPerformer) objectToTest, diagnostician, map);
			}

		};

		validateEncounterPerformerEncounterPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterPerformerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterPerformer> {
		public EncounterPerformer create() {
			return ConsolFactory.eINSTANCE.createEncounterPerformer();
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
	private static class ConstructorTestClass extends EncounterPerformerOperations {
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

} // EncounterPerformerOperations
