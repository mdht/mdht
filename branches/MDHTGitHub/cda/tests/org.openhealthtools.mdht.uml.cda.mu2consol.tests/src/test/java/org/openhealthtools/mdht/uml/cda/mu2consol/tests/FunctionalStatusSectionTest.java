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

import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.FunctionalStatusSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#getMu2consolCognitiveStatusResultObservations() <em>Get Mu2consol Cognitive Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#getMu2consolCognitiveStatusResultOrganizers() <em>Get Mu2consol Cognitive Status Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#getMu2consolFunctionalStatusResultObservations() <em>Get Mu2consol Functional Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#getMu2consolFunctionalStatusResultOrganizers() <em>Get Mu2consol Functional Status Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection#validateFunctionalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMu2consolCognitiveStatusResultObservations() {

		FunctionalStatusSection target = objectFactory.create();
		target.getMu2consolCognitiveStatusResultObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMu2consolCognitiveStatusResultOrganizers() {

		FunctionalStatusSection target = objectFactory.create();
		target.getMu2consolCognitiveStatusResultOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMu2consolFunctionalStatusResultObservations() {

		FunctionalStatusSection target = objectFactory.create();
		target.getMu2consolFunctionalStatusResultObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMu2consolFunctionalStatusResultOrganizers() {

		FunctionalStatusSection target = objectFactory.create();
		target.getMu2consolFunctionalStatusResultOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionTemplateId() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionTemplateIdTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTemplateId(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusSection> {
		public FunctionalStatusSection create() {
			return Mu2consolFactory.eINSTANCE.createFunctionalStatusSection();
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
	private static class ConstructorTestClass extends FunctionalStatusSectionOperations {
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

} // FunctionalStatusSectionOperations
