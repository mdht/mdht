/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.FunctionalStatusResultOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer#getMu2consolFunctionalStatusResultObservations() <em>Get Mu2consol Functional Status Result Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusResultOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerTemplateId() {
		OperationsTestCase<FunctionalStatusResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<FunctionalStatusResultOrganizer>(
			"validateResultOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultOrganizerOperations.validateResultOrganizerTemplateId(
					(FunctionalStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMu2consolFunctionalStatusResultObservations() {

		FunctionalStatusResultOrganizer target = objectFactory.create();
		target.getMu2consolFunctionalStatusResultObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusResultOrganizer> {
		public FunctionalStatusResultOrganizer create() {
			return Mu2consolFactory.eINSTANCE.createFunctionalStatusResultOrganizer();
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
	private static class ConstructorTestClass extends FunctionalStatusResultOrganizerOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // FunctionalStatusResultOrganizerOperations
