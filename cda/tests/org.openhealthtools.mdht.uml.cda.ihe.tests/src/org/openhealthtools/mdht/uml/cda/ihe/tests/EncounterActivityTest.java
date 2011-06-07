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
import org.openhealthtools.mdht.uml.cda.ihe.EncounterActivity;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterActivity#validateEncountersActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterActivityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersActivityTemplateId() {
		OperationsTestCase<EncounterActivity> validateEncountersActivityTemplateIdTestCase = new OperationsTestCase<EncounterActivity>(
			"validateEncountersActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity target) {

			}

			@Override
			protected void updateToPass(EncounterActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivityOperations.validateEncountersActivityTemplateId(
					(EncounterActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterActivity> {

		public EncounterActivity create() {
			return IHEFactory.eINSTANCE.createEncounterActivity();
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
	private static class ConstructorTestClass extends EncounterActivityOperations {
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

} // EncounterActivityOperations
