/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.FamilyHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Family History Section</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection#validateFamilyHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Family History Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection#validateFamilyHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Family History Section Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection#validateFamilyHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Family History Section Title</em>}</li>
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
	public void testValidateFamilyHistorySectionTemplateId() {
		OperationsTestCase<FamilyHistorySection> validateFamilyHistorySectionTemplateIdTestCase = new OperationsTestCase<FamilyHistorySection>(
				"validateFamilyHistorySectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations
						.validateFamilyHistorySectionTemplateId(
								(FamilyHistorySection) objectToTest,
								diagnostician, map);
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
				operationsForOCL
						.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations
						.validateFamilyHistorySectionCode(
								(FamilyHistorySection) objectToTest,
								diagnostician, map);
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
				operationsForOCL
						.getOCLValue("VALIDATE_FAMILY_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations
						.validateFamilyHistorySectionTitle(
								(FamilyHistorySection) objectToTest,
								diagnostician, map);
			}

		};

		validateFamilyHistorySectionTitleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			FamilyHistorySectionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<FamilyHistorySection> {
		public FamilyHistorySection create() {
			return CCDFactory.eINSTANCE.createFamilyHistorySection();
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
	 * 
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // FamilyHistorySectionOperations