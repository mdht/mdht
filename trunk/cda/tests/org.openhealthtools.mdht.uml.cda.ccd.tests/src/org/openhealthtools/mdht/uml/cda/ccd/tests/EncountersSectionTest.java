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
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncountersSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Encounters Section</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Encounters Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Encounters Section Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection#validateEncountersSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Encounters Section Title</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class EncountersSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersSectionTemplateId() {
		OperationsTestCase<EncountersSection> validateEncountersSectionTemplateIdTestCase = new OperationsTestCase<EncountersSection>(
				"validateEncountersSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionOperations
						.validateEncountersSectionTemplateId(
								(EncountersSection) objectToTest,
								diagnostician, map);
			}

		};

		validateEncountersSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersSectionCode() {
		OperationsTestCase<EncountersSection> validateEncountersSectionCodeTestCase = new OperationsTestCase<EncountersSection>(
				"validateEncountersSectionCode",
				operationsForOCL
						.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionOperations
						.validateEncountersSectionCode(
								(EncountersSection) objectToTest,
								diagnostician, map);
			}

		};

		validateEncountersSectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersSectionTitle() {
		OperationsTestCase<EncountersSection> validateEncountersSectionTitleTestCase = new OperationsTestCase<EncountersSection>(
				"validateEncountersSectionTitle",
				operationsForOCL
						.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(EncountersSection target) {

			}

			@Override
			protected void updateToPass(EncountersSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersSectionOperations
						.validateEncountersSectionTitle(
								(EncountersSection) objectToTest,
								diagnostician, map);
			}

		};

		validateEncountersSectionTitleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends EncountersSectionOperations {
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
			TestObjectFactory<EncountersSection> {
		public EncountersSection create() {
			return CCDFactory.eINSTANCE.createEncountersSection();
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

} // EncountersSectionOperations