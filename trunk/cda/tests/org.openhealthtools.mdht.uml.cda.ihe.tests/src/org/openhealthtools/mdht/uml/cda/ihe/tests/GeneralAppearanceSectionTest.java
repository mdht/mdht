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
import org.openhealthtools.mdht.uml.cda.ihe.GeneralAppearanceSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.GeneralAppearanceSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Appearance Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.GeneralAppearanceSection#validateGeneralAppearanceSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Appearance Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.GeneralAppearanceSection#validateGeneralAppearanceSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Appearance Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.GeneralAppearanceSection#validateGeneralAppearanceSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Appearance Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.GeneralAppearanceSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralAppearanceSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralAppearanceSectionTemplateId() {
		OperationsTestCase<GeneralAppearanceSection> validateGeneralAppearanceSectionTemplateIdTestCase = new OperationsTestCase<GeneralAppearanceSection>(
			"validateGeneralAppearanceSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_APPEARANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralAppearanceSection target) {

			}

			@Override
			protected void updateToPass(GeneralAppearanceSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralAppearanceSectionOperations.validateGeneralAppearanceSectionTemplateId(
					(GeneralAppearanceSection) objectToTest, diagnostician, map);
			}

		};

		validateGeneralAppearanceSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralAppearanceSectionCode() {
		OperationsTestCase<GeneralAppearanceSection> validateGeneralAppearanceSectionCodeTestCase = new OperationsTestCase<GeneralAppearanceSection>(
			"validateGeneralAppearanceSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_APPEARANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralAppearanceSection target) {

			}

			@Override
			protected void updateToPass(GeneralAppearanceSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralAppearanceSectionOperations.validateGeneralAppearanceSectionCode(
					(GeneralAppearanceSection) objectToTest, diagnostician, map);
			}

		};

		validateGeneralAppearanceSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralAppearanceSectionProblemEntry() {
		OperationsTestCase<GeneralAppearanceSection> validateGeneralAppearanceSectionProblemEntryTestCase = new OperationsTestCase<GeneralAppearanceSection>(
			"validateGeneralAppearanceSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_APPEARANCE_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralAppearanceSection target) {

			}

			@Override
			protected void updateToPass(GeneralAppearanceSection target) {
				target.init();
				ProblemEntry entry = IHEFactory.eINSTANCE.createProblemEntry().init();
				target.addObservation(entry);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralAppearanceSectionOperations.validateGeneralAppearanceSectionProblemEntry(
					(GeneralAppearanceSection) objectToTest, diagnostician, map);
			}

		};

		validateGeneralAppearanceSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		GeneralAppearanceSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GeneralAppearanceSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GeneralAppearanceSection> {
		public GeneralAppearanceSection create() {
			return IHEFactory.eINSTANCE.createGeneralAppearanceSection();
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
	private static class ConstructorTestClass extends GeneralAppearanceSectionOperations {
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

} // GeneralAppearanceSectionOperations
