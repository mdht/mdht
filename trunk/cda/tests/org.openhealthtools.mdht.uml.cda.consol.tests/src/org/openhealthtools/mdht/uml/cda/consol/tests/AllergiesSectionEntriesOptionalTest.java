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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergiesSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional#validateAllergiesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional#validateAllergiesSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional#validateAllergiesSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional#validateAllergiesSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies Section Entries Optional Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergiesSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AllergiesSectionEntriesOptional> validateAllergiesSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AllergiesSectionEntriesOptional>(
			"validateAllergiesSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(AllergiesSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionEntriesOptionalOperations.validateAllergiesSectionEntriesOptionalTemplateId(
					(AllergiesSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionEntriesOptionalCode() {
		OperationsTestCase<AllergiesSectionEntriesOptional> validateAllergiesSectionEntriesOptionalCodeTestCase = new OperationsTestCase<AllergiesSectionEntriesOptional>(
			"validateAllergiesSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(AllergiesSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionEntriesOptionalOperations.validateAllergiesSectionEntriesOptionalCode(
					(AllergiesSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionEntriesOptionalTitle() {
		OperationsTestCase<AllergiesSectionEntriesOptional> validateAllergiesSectionEntriesOptionalTitleTestCase = new OperationsTestCase<AllergiesSectionEntriesOptional>(
			"validateAllergiesSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(AllergiesSectionEntriesOptional target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionEntriesOptionalOperations.validateAllergiesSectionEntriesOptionalTitle(
					(AllergiesSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesSectionEntriesOptionalText() {
		OperationsTestCase<AllergiesSectionEntriesOptional> validateAllergiesSectionEntriesOptionalTextTestCase = new OperationsTestCase<AllergiesSectionEntriesOptional>(
			"validateAllergiesSectionEntriesOptionalText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(AllergiesSectionEntriesOptional target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionEntriesOptionalOperations.validateAllergiesSectionEntriesOptionalText(
					(AllergiesSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergiesSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergiesSectionEntriesOptional> {
		public AllergiesSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional();
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
	private static class ConstructorTestClass extends AllergiesSectionEntriesOptionalOperations {
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

} // AllergiesSectionEntriesOptionalOperations
