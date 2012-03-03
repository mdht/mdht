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
import org.openhealthtools.mdht.uml.cda.consol.EncounterPerformerAssignedEntity;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncounterPerformerAssignedEntityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Performer Assigned Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncounterPerformerAssignedEntity#validateEncounterPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Performer Assigned Entity Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterPerformerAssignedEntityTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterPerformerAssignedEntityCode() {
		OperationsTestCase<EncounterPerformerAssignedEntity> validateEncounterPerformerAssignedEntityCodeTestCase = new OperationsTestCase<EncounterPerformerAssignedEntity>(
			"validateEncounterPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterPerformerAssignedEntity target) {

			}

			@Override
			protected void updateToPass(EncounterPerformerAssignedEntity target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterPerformerAssignedEntityOperations.validateEncounterPerformerAssignedEntityCode(
					(EncounterPerformerAssignedEntity) objectToTest, diagnostician, map);
			}

		};

		validateEncounterPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterPerformerAssignedEntityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterPerformerAssignedEntity> {
		public EncounterPerformerAssignedEntity create() {
			return ConsolFactory.eINSTANCE.createEncounterPerformerAssignedEntity();
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
	private static class ConstructorTestClass extends EncounterPerformerAssignedEntityOperations {
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

} // EncounterPerformerAssignedEntityOperations
