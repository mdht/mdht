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
import org.openhealthtools.mdht.uml.cda.ihe.AbdomenSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.AbdomenSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Abdomen Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AbdomenSection#validateAbdomenSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AbdomenSection#validateAbdomenSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AbdomenSection#validateAbdomenSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AbdomenSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AbdomenSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbdomenSectionTemplateId() {
		OperationsTestCase<AbdomenSection> validateAbdomenSectionTemplateIdTestCase = new OperationsTestCase<AbdomenSection>(
			"validateAbdomenSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ABDOMEN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbdomenSection target) {

			}

			@Override
			protected void updateToPass(AbdomenSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbdomenSectionOperations.validateAbdomenSectionTemplateId(
					(AbdomenSection) objectToTest, diagnostician, map);
			}

		};

		validateAbdomenSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbdomenSectionCode() {
		OperationsTestCase<AbdomenSection> validateAbdomenSectionCodeTestCase = new OperationsTestCase<AbdomenSection>(
			"validateAbdomenSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ABDOMEN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbdomenSection target) {

			}

			@Override
			protected void updateToPass(AbdomenSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbdomenSectionOperations.validateAbdomenSectionCode(
					(AbdomenSection) objectToTest, diagnostician, map);
			}

		};

		validateAbdomenSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbdomenSectionProblemEntry() {
		OperationsTestCase<AbdomenSection> validateAbdomenSectionProblemEntryTestCase = new OperationsTestCase<AbdomenSection>(
			"validateAbdomenSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_ABDOMEN_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbdomenSection target) {

			}

			@Override
			protected void updateToPass(AbdomenSection target) {
				target.init();

				ProblemEntry entry = IHEFactory.eINSTANCE.createProblemEntry().init();
				target.addObservation(entry);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbdomenSectionOperations.validateAbdomenSectionProblemEntry(
					(AbdomenSection) objectToTest, diagnostician, map);
			}

		};

		validateAbdomenSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		AbdomenSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AbdomenSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AbdomenSection> {
		public AbdomenSection create() {
			return IHEFactory.eINSTANCE.createAbdomenSection();
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
	private static class ConstructorTestClass extends AbdomenSectionOperations {
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

} // AbdomenSectionOperations
