/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrEncountersSectionOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection#validatePhcrEncountersSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Encounters Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection#validatePhcrEncountersSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Encounters Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection#validatePhcrEncountersSectionEncountersActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Encounters Section Encounters Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection#getPHCREncountersActivities() <em>Get PHCR Encounters Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection#validateEncountersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhcrEncountersSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrEncountersSectionTitle() {
		OperationsTestCase<PhcrEncountersSection> validatePhcrEncountersSectionTitleTestCase = new OperationsTestCase<PhcrEncountersSection>(
			"validatePhcrEncountersSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrEncountersSection target) {

			}

			@Override
			protected void updateToPass(PhcrEncountersSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrEncountersSectionOperations.validatePhcrEncountersSectionTitle(
					(PhcrEncountersSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrEncountersSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrEncountersSectionText() {
		OperationsTestCase<PhcrEncountersSection> validatePhcrEncountersSectionTextTestCase = new OperationsTestCase<PhcrEncountersSection>(
			"validatePhcrEncountersSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrEncountersSection target) {

			}

			@Override
			protected void updateToPass(PhcrEncountersSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrEncountersSectionOperations.validatePhcrEncountersSectionText(
					(PhcrEncountersSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrEncountersSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrEncountersSectionEncountersActivity() {
		OperationsTestCase<PhcrEncountersSection> validatePhcrEncountersSectionEncountersActivityTestCase = new OperationsTestCase<PhcrEncountersSection>(
			"validatePhcrEncountersSectionEncountersActivity",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrEncountersSection target) {

			}

			@Override
			protected void updateToPass(PhcrEncountersSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrEncountersSectionOperations.validatePhcrEncountersSectionEncountersActivity(
					(PhcrEncountersSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrEncountersSectionEncountersActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPHCREncountersActivities() {

		PhcrEncountersSection target = objectFactory.create();
		target.getPHCREncountersActivities();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncountersSectionTemplateId() {
		OperationsTestCase<PhcrEncountersSection> validateEncountersSectionTemplateIdTestCase = new OperationsTestCase<PhcrEncountersSection>(
			"validateEncountersSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrEncountersSection target) {

			}

			@Override
			protected void updateToPass(PhcrEncountersSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrEncountersSectionOperations.validateEncountersSectionTemplateId(
					(PhcrEncountersSection) objectToTest, diagnostician, map);
			}

		};

		validateEncountersSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhcrEncountersSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhcrEncountersSection> {
		public PhcrEncountersSection create() {
			return PhcrFactory.eINSTANCE.createPhcrEncountersSection();
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
	private static class ConstructorTestClass extends PhcrEncountersSectionOperations {
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

} // PhcrEncountersSectionOperations
