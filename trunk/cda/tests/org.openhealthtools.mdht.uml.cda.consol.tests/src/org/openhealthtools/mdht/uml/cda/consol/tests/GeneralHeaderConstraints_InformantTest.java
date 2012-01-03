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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Informant;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraints_InformantOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints Informant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Informant#validateInformantHasAssignedEntityOrRelatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Informant Has Assigned Entity Or Related Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralHeaderConstraints_InformantTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInformantHasAssignedEntityOrRelatedEntity() {
		OperationsTestCase<GeneralHeaderConstraints_Informant> validateInformantHasAssignedEntityOrRelatedEntityTestCase = new OperationsTestCase<GeneralHeaderConstraints_Informant>(
			"validateInformantHasAssignedEntityOrRelatedEntity",
			operationsForOCL.getOCLValue("VALIDATE_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints_Informant target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints_Informant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraints_InformantOperations.validateInformantHasAssignedEntityOrRelatedEntity(
					(GeneralHeaderConstraints_Informant) objectToTest, diagnostician, map);
			}

		};

		validateInformantHasAssignedEntityOrRelatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GeneralHeaderConstraints_InformantOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GeneralHeaderConstraints_Informant> {
		public GeneralHeaderConstraints_Informant create() {
			return ConsolFactory.eINSTANCE.createGeneralHeaderConstraints_Informant();
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
	private static class ConstructorTestClass extends GeneralHeaderConstraints_InformantOperations {
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

} // GeneralHeaderConstraints_InformantOperations
