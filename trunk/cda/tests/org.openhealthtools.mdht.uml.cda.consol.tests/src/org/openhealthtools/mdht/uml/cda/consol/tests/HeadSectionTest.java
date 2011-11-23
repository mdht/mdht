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
import org.openhealthtools.mdht.uml.cda.consol.HeadSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HeadSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Head Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HeadSection#validateHeadSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Head Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HeadSection#validateHeadSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Head Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HeadSection#validateHeadSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Head Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HeadSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HeadSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeadSectionTemplateId() {
		OperationsTestCase<HeadSection> validateHeadSectionTemplateIdTestCase = new OperationsTestCase<HeadSection>(
			"validateHeadSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEAD_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeadSection target) {

			}

			@Override
			protected void updateToPass(HeadSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeadSectionOperations.validateHeadSectionTemplateId(
					(HeadSection) objectToTest, diagnostician, map);
			}

		};

		validateHeadSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeadSectionCode() {
		OperationsTestCase<HeadSection> validateHeadSectionCodeTestCase = new OperationsTestCase<HeadSection>(
			"validateHeadSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HEAD_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(HeadSection target) {

			}

			@Override
			protected void updateToPass(HeadSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeadSectionOperations.validateHeadSectionCode((HeadSection) objectToTest, diagnostician, map);
			}

		};

		validateHeadSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeadSectionProblemEntry() {
		OperationsTestCase<HeadSection> validateHeadSectionProblemEntryTestCase = new OperationsTestCase<HeadSection>(
			"validateHeadSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_HEAD_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeadSection target) {

			}

			@Override
			protected void updateToPass(HeadSection target) {
				target.init();

				// ProblemEntry entry = IHEFactory.eINSTANCE.createProblemEntry().init();
				// target.addObservation(entry);
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeadSectionOperations.validateHeadSectionProblemEntry(
					(HeadSection) objectToTest, diagnostician, map);
			}

		};

		validateHeadSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		HeadSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HeadSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HeadSection> {

		public HeadSection create() {
			return ConsolFactory.eINSTANCE.createHeadSection();
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
	private static class ConstructorTestClass extends HeadSectionOperations {
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

} // HeadSectionOperations
