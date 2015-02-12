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

import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.CognitiveStatusResultOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cognitive Status Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer#getMu2consolCognitiveStatusResultObservations() <em>Get Mu2consol Cognitive Status Result Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CognitiveStatusResultOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultOrganizerTemplateId() {
		OperationsTestCase<CognitiveStatusResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<CognitiveStatusResultOrganizer>(
			"validateResultOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultOrganizer target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultOrganizerOperations.validateResultOrganizerTemplateId(
					(CognitiveStatusResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMu2consolCognitiveStatusResultObservations() {

		CognitiveStatusResultOrganizer target = objectFactory.create();
		target.getMu2consolCognitiveStatusResultObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CognitiveStatusResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CognitiveStatusResultOrganizer> {
		public CognitiveStatusResultOrganizer create() {
			return Mu2consolFactory.eINSTANCE.createCognitiveStatusResultOrganizer();
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
	private static class ConstructorTestClass extends CognitiveStatusResultOrganizerOperations {
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

} // CognitiveStatusResultOrganizerOperations
