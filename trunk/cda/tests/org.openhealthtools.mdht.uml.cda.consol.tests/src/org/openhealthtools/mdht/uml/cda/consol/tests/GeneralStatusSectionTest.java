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
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralStatusSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection#validateGeneralStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection#validateGeneralStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection#validateGeneralStatusSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralStatusSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralStatusSectionTemplateId() {
		OperationsTestCase<GeneralStatusSection> validateGeneralStatusSectionTemplateIdTestCase = new OperationsTestCase<GeneralStatusSection>(
			"validateGeneralStatusSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralStatusSection target) {

			}

			@Override
			protected void updateToPass(GeneralStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralStatusSectionOperations.validateGeneralStatusSectionTemplateId(
					(GeneralStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateGeneralStatusSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralStatusSectionCode() {
		OperationsTestCase<GeneralStatusSection> validateGeneralStatusSectionCodeTestCase = new OperationsTestCase<GeneralStatusSection>(
			"validateGeneralStatusSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralStatusSection target) {

			}

			@Override
			protected void updateToPass(GeneralStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralStatusSectionOperations.validateGeneralStatusSectionCode(
					(GeneralStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateGeneralStatusSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralStatusSectionProblemEntry() {
		OperationsTestCase<GeneralStatusSection> validateGeneralStatusSectionProblemEntryTestCase = new OperationsTestCase<GeneralStatusSection>(
			"validateGeneralStatusSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_STATUS_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralStatusSection target) {

			}

			@Override
			protected void updateToPass(GeneralStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralStatusSectionOperations.validateGeneralStatusSectionProblemEntry(
					(GeneralStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateGeneralStatusSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		GeneralStatusSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GeneralStatusSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GeneralStatusSection> {
		public GeneralStatusSection create() {
			return ConsolFactory.eINSTANCE.createGeneralStatusSection();
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
	private static class ConstructorTestClass extends GeneralStatusSectionOperations {
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

} // GeneralStatusSectionOperations
