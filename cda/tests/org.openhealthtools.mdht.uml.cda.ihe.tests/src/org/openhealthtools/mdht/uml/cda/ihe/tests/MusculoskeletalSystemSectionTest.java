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
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.MusculoskeletalSystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.MusculoskeletalSystemSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Musculoskeletal System Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MusculoskeletalSystemSection#validateMusculoskeletalSystemSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MusculoskeletalSystemSection#validateMusculoskeletalSystemSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MusculoskeletalSystemSection#validateMusculoskeletalSystemSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Musculoskeletal System Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MusculoskeletalSystemSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MusculoskeletalSystemSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMusculoskeletalSystemSectionTemplateId() {
		OperationsTestCase<MusculoskeletalSystemSection> validateMusculoskeletalSystemSectionTemplateIdTestCase = new OperationsTestCase<MusculoskeletalSystemSection>(
			"validateMusculoskeletalSystemSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MusculoskeletalSystemSection target) {

			}

			@Override
			protected void updateToPass(MusculoskeletalSystemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MusculoskeletalSystemSectionOperations.validateMusculoskeletalSystemSectionTemplateId(
					(MusculoskeletalSystemSection) objectToTest, diagnostician, map);
			}

		};

		validateMusculoskeletalSystemSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMusculoskeletalSystemSectionCode() {
		OperationsTestCase<MusculoskeletalSystemSection> validateMusculoskeletalSystemSectionCodeTestCase = new OperationsTestCase<MusculoskeletalSystemSection>(
			"validateMusculoskeletalSystemSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MusculoskeletalSystemSection target) {

			}

			@Override
			protected void updateToPass(MusculoskeletalSystemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MusculoskeletalSystemSectionOperations.validateMusculoskeletalSystemSectionCode(
					(MusculoskeletalSystemSection) objectToTest, diagnostician, map);
			}

		};

		validateMusculoskeletalSystemSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMusculoskeletalSystemSectionProblemEntry() {
		OperationsTestCase<MusculoskeletalSystemSection> validateMusculoskeletalSystemSectionProblemEntryTestCase = new OperationsTestCase<MusculoskeletalSystemSection>(
			"validateMusculoskeletalSystemSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_MUSCULOSKELETAL_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MusculoskeletalSystemSection target) {

			}

			@Override
			protected void updateToPass(MusculoskeletalSystemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MusculoskeletalSystemSectionOperations.validateMusculoskeletalSystemSectionProblemEntry(
					(MusculoskeletalSystemSection) objectToTest, diagnostician, map);
			}

		};

		validateMusculoskeletalSystemSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		MusculoskeletalSystemSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MusculoskeletalSystemSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MusculoskeletalSystemSection> {
		public MusculoskeletalSystemSection create() {
			return IHEFactory.eINSTANCE.createMusculoskeletalSystemSection();
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
	private static class ConstructorTestClass extends MusculoskeletalSystemSectionOperations {
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

} // MusculoskeletalSystemSectionOperations
