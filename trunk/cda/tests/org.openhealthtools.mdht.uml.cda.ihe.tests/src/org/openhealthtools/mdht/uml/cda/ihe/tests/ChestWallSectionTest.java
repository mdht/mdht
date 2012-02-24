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
import org.openhealthtools.mdht.uml.cda.ihe.ChestWallSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ChestWallSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chest Wall Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ChestWallSection#validateChestWallSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest Wall Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ChestWallSection#validateChestWallSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest Wall Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ChestWallSection#validateChestWallSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest Wall Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ChestWallSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ChestWallSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChestWallSectionTemplateId() {
		OperationsTestCase<ChestWallSection> validateChestWallSectionTemplateIdTestCase = new OperationsTestCase<ChestWallSection>(
			"validateChestWallSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_WALL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChestWallSection target) {

			}

			@Override
			protected void updateToPass(ChestWallSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChestWallSectionOperations.validateChestWallSectionTemplateId(
					(ChestWallSection) objectToTest, diagnostician, map);
			}

		};

		validateChestWallSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChestWallSectionCode() {
		OperationsTestCase<ChestWallSection> validateChestWallSectionCodeTestCase = new OperationsTestCase<ChestWallSection>(
			"validateChestWallSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_WALL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChestWallSection target) {

			}

			@Override
			protected void updateToPass(ChestWallSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChestWallSectionOperations.validateChestWallSectionCode(
					(ChestWallSection) objectToTest, diagnostician, map);
			}

		};

		validateChestWallSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateChestWallSectionProblemEntry() {
		OperationsTestCase<ChestWallSection> validateChestWallSectionProblemEntryTestCase = new OperationsTestCase<ChestWallSection>(
			"validateChestWallSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_WALL_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChestWallSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(ChestWallSection target) {

				target.addObservation(IHEFactory.eINSTANCE.createProblemEntry().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChestWallSectionOperations.validateChestWallSectionProblemEntry(
					(ChestWallSection) objectToTest, diagnostician, map);
			}

		};

		validateChestWallSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		ChestWallSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ChestWallSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ChestWallSection> {
		public ChestWallSection create() {
			return IHEFactory.eINSTANCE.createChestWallSection();
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
	private static class ConstructorTestClass extends ChestWallSectionOperations {
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

} // ChestWallSectionOperations
