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
import org.openhealthtools.mdht.uml.cda.consol.IntegumentarySystemSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.IntegumentarySystemSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Integumentary System Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.IntegumentarySystemSection#validateIntegumentarySystemSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Integumentary System Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.IntegumentarySystemSection#validateIntegumentarySystemSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Integumentary System Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.IntegumentarySystemSection#validateIntegumentarySystemSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Integumentary System Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.IntegumentarySystemSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class IntegumentarySystemSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIntegumentarySystemSectionTemplateId() {
		OperationsTestCase<IntegumentarySystemSection> validateIntegumentarySystemSectionTemplateIdTestCase = new OperationsTestCase<IntegumentarySystemSection>(
			"validateIntegumentarySystemSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INTEGUMENTARY_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IntegumentarySystemSection target) {

			}

			@Override
			protected void updateToPass(IntegumentarySystemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IntegumentarySystemSectionOperations.validateIntegumentarySystemSectionTemplateId(
					(IntegumentarySystemSection) objectToTest, diagnostician, map);
			}

		};

		validateIntegumentarySystemSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIntegumentarySystemSectionCode() {
		OperationsTestCase<IntegumentarySystemSection> validateIntegumentarySystemSectionCodeTestCase = new OperationsTestCase<IntegumentarySystemSection>(
			"validateIntegumentarySystemSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_INTEGUMENTARY_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IntegumentarySystemSection target) {

			}

			@Override
			protected void updateToPass(IntegumentarySystemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IntegumentarySystemSectionOperations.validateIntegumentarySystemSectionCode(
					(IntegumentarySystemSection) objectToTest, diagnostician, map);
			}

		};

		validateIntegumentarySystemSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIntegumentarySystemSectionProblemEntry() {
		OperationsTestCase<IntegumentarySystemSection> validateIntegumentarySystemSectionProblemEntryTestCase = new OperationsTestCase<IntegumentarySystemSection>(
			"validateIntegumentarySystemSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_INTEGUMENTARY_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IntegumentarySystemSection target) {

			}

			@Override
			protected void updateToPass(IntegumentarySystemSection target) {
				target.init();

				// ProblemEntry entry = IHEFactory.eINSTANCE.createProblemEntry().init();
				// target.addObservation(entry);
				//
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IntegumentarySystemSectionOperations.validateIntegumentarySystemSectionProblemEntry(
					(IntegumentarySystemSection) objectToTest, diagnostician, map);
			}

		};

		validateIntegumentarySystemSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		IntegumentarySystemSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends IntegumentarySystemSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<IntegumentarySystemSection> {

		public IntegumentarySystemSection create() {
			return ConsolFactory.eINSTANCE.createIntegumentarySystemSection();
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
	private static class ConstructorTestClass extends IntegumentarySystemSectionOperations {
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

} // IntegumentarySystemSectionOperations
