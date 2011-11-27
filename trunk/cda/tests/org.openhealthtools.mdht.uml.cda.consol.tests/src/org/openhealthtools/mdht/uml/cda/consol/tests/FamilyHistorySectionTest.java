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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionFamilyHistoryObsOrgs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Family History Obs Orgs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionNoSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section No Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#validateFamilyHistorySectionFamilyHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Section Family History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection#getFamilyHistories() <em>Get Family Histories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionFamilyHistoryObsOrgs() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionFamilyHistoryObsOrgsTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionFamilyHistoryObsOrgs",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_FAMILY_HISTORY_OBS_ORGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionFamilyHistoryObsOrgs(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionFamilyHistoryObsOrgsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionNoSubject() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionNoSubjectTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionNoSubject",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_NO_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionNoSubject(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionNoSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionTemplateId() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionTemplateIdTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionTemplateId(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionCode() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionCodeTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionCode(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionTitle() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionTitleTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionTitle(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionText() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionTextTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionText",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionText(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistorySectionFamilyHistory() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionFamilyHistoryTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateFamilyHistorySectionFamilyHistory",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateFamilyHistorySectionFamilyHistory(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistorySectionFamilyHistoryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistories() {

		FamilyHistorySection target = objectFactory.create();
		target.getFamilyHistories();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistorySection> {
		public FamilyHistorySection create() {
			return ConsolFactory.eINSTANCE.createFamilyHistorySection();
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
	private static class ConstructorTestClass extends FamilyHistorySectionOperations {
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

} // FamilyHistorySectionOperations
