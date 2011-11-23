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
import org.openhealthtools.mdht.uml.cda.consol.NeurologicSystemSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.NeurologicSystemSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Neurologic System Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NeurologicSystemSection#validateNeurologicSystemSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurologic System Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NeurologicSystemSection#validateNeurologicSystemSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurologic System Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NeurologicSystemSection#validateNeurologicSystemSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurologic System Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NeurologicSystemSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NeurologicSystemSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeurologicSystemSectionTemplateId() {
		OperationsTestCase<NeurologicSystemSection> validateNeurologicSystemSectionTemplateIdTestCase = new OperationsTestCase<NeurologicSystemSection>(
			"validateNeurologicSystemSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NEUROLOGIC_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeurologicSystemSection target) {

			}

			@Override
			protected void updateToPass(NeurologicSystemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeurologicSystemSectionOperations.validateNeurologicSystemSectionTemplateId(
					(NeurologicSystemSection) objectToTest, diagnostician, map);
			}

		};

		validateNeurologicSystemSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeurologicSystemSectionCode() {
		OperationsTestCase<NeurologicSystemSection> validateNeurologicSystemSectionCodeTestCase = new OperationsTestCase<NeurologicSystemSection>(
			"validateNeurologicSystemSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_NEUROLOGIC_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeurologicSystemSection target) {

			}

			@Override
			protected void updateToPass(NeurologicSystemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeurologicSystemSectionOperations.validateNeurologicSystemSectionCode(
					(NeurologicSystemSection) objectToTest, diagnostician, map);
			}

		};

		validateNeurologicSystemSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeurologicSystemSectionProblemEntry() {
		OperationsTestCase<NeurologicSystemSection> validateNeurologicSystemSectionProblemEntryTestCase = new OperationsTestCase<NeurologicSystemSection>(
			"validateNeurologicSystemSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_NEUROLOGIC_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeurologicSystemSection target) {

			}

			@Override
			protected void updateToPass(NeurologicSystemSection target) {
				target.init();

				// ProblemEntry entry = IHEFactory.eINSTANCE.createProblemEntry().init();
				// target.addObservation(entry);
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeurologicSystemSectionOperations.validateNeurologicSystemSectionProblemEntry(
					(NeurologicSystemSection) objectToTest, diagnostician, map);
			}

		};

		validateNeurologicSystemSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		NeurologicSystemSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NeurologicSystemSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NeurologicSystemSection> {

		public NeurologicSystemSection create() {
			return ConsolFactory.eINSTANCE.createNeurologicSystemSection();
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
	private static class ConstructorTestClass extends NeurologicSystemSectionOperations {
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

} // NeurologicSystemSectionOperations
