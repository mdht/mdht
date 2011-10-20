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
import org.openhealthtools.mdht.uml.cda.ihe.EndocrineSystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.EndocrineSystemSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Endocrine System Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EndocrineSystemSection#validateEndocrineSystemSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Endocrine System Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EndocrineSystemSection#validateEndocrineSystemSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Endocrine System Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EndocrineSystemSection#validateEndocrineSystemSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Endocrine System Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EndocrineSystemSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EndocrineSystemSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEndocrineSystemSectionTemplateId() {
		OperationsTestCase<EndocrineSystemSection> validateEndocrineSystemSectionTemplateIdTestCase = new OperationsTestCase<EndocrineSystemSection>(
			"validateEndocrineSystemSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENDOCRINE_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EndocrineSystemSection target) {

			}

			@Override
			protected void updateToPass(EndocrineSystemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EndocrineSystemSectionOperations.validateEndocrineSystemSectionTemplateId(
					(EndocrineSystemSection) objectToTest, diagnostician, map);
			}

		};

		validateEndocrineSystemSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEndocrineSystemSectionCode() {
		OperationsTestCase<EndocrineSystemSection> validateEndocrineSystemSectionCodeTestCase = new OperationsTestCase<EndocrineSystemSection>(
			"validateEndocrineSystemSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ENDOCRINE_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EndocrineSystemSection target) {

			}

			@Override
			protected void updateToPass(EndocrineSystemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EndocrineSystemSectionOperations.validateEndocrineSystemSectionCode(
					(EndocrineSystemSection) objectToTest, diagnostician, map);
			}

		};

		validateEndocrineSystemSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEndocrineSystemSectionProblemEntry() {
		OperationsTestCase<EndocrineSystemSection> validateEndocrineSystemSectionProblemEntryTestCase = new OperationsTestCase<EndocrineSystemSection>(
			"validateEndocrineSystemSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_ENDOCRINE_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EndocrineSystemSection target) {

			}

			@Override
			protected void updateToPass(EndocrineSystemSection target) {
				target.init();

				ProblemEntry entry = IHEFactory.eINSTANCE.createProblemEntry().init();
				target.addObservation(entry);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EndocrineSystemSectionOperations.validateEndocrineSystemSectionProblemEntry(
					(EndocrineSystemSection) objectToTest, diagnostician, map);
			}

		};

		validateEndocrineSystemSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		EndocrineSystemSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EndocrineSystemSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EndocrineSystemSection> {
		public EndocrineSystemSection create() {
			return IHEFactory.eINSTANCE.createEndocrineSystemSection();
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
	private static class ConstructorTestClass extends EndocrineSystemSectionOperations {
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

} // EndocrineSystemSectionOperations
