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
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrTreatmentInformationSectionOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection#validatePhcrTreatmentInformationSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection#validatePhcrTreatmentInformationSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection#validatePhcrTreatmentInformationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection#validatePhcrTreatmentInformationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection#validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection#getTherapeuticRegimenAct() <em>Get Therapeutic Regimen Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhcrTreatmentInformationSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrTreatmentInformationSectionTemplateId() {
		OperationsTestCase<PhcrTreatmentInformationSection> validatePhcrTreatmentInformationSectionTemplateIdTestCase = new OperationsTestCase<PhcrTreatmentInformationSection>(
			"validatePhcrTreatmentInformationSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrTreatmentInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrTreatmentInformationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(
					(PhcrTreatmentInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrTreatmentInformationSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrTreatmentInformationSectionCode() {
		OperationsTestCase<PhcrTreatmentInformationSection> validatePhcrTreatmentInformationSectionCodeTestCase = new OperationsTestCase<PhcrTreatmentInformationSection>(
			"validatePhcrTreatmentInformationSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrTreatmentInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrTreatmentInformationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionCode(
					(PhcrTreatmentInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrTreatmentInformationSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrTreatmentInformationSectionCodeP() {
		OperationsTestCase<PhcrTreatmentInformationSection> validatePhcrTreatmentInformationSectionCodePTestCase = new OperationsTestCase<PhcrTreatmentInformationSection>(
			"validatePhcrTreatmentInformationSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrTreatmentInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrTreatmentInformationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionCodeP(
					(PhcrTreatmentInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrTreatmentInformationSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrTreatmentInformationSectionTitle() {
		OperationsTestCase<PhcrTreatmentInformationSection> validatePhcrTreatmentInformationSectionTitleTestCase = new OperationsTestCase<PhcrTreatmentInformationSection>(
			"validatePhcrTreatmentInformationSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrTreatmentInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrTreatmentInformationSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTitle(
					(PhcrTreatmentInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrTreatmentInformationSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrTreatmentInformationSectionText() {
		OperationsTestCase<PhcrTreatmentInformationSection> validatePhcrTreatmentInformationSectionTextTestCase = new OperationsTestCase<PhcrTreatmentInformationSection>(
			"validatePhcrTreatmentInformationSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrTreatmentInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrTreatmentInformationSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionText(
					(PhcrTreatmentInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrTreatmentInformationSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrTreatmentInformationSectionTherapeuticRegimenAct() {
		OperationsTestCase<PhcrTreatmentInformationSection> validatePhcrTreatmentInformationSectionTherapeuticRegimenActTestCase = new OperationsTestCase<PhcrTreatmentInformationSection>(
			"validatePhcrTreatmentInformationSectionTherapeuticRegimenAct",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrTreatmentInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrTreatmentInformationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTherapeuticRegimenAct(
					(PhcrTreatmentInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrTreatmentInformationSectionTherapeuticRegimenActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetTherapeuticRegimenAct() {

		PhcrTreatmentInformationSection target = objectFactory.create();
		target.getTherapeuticRegimenAct();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhcrTreatmentInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhcrTreatmentInformationSection> {
		public PhcrTreatmentInformationSection create() {
			return PhcrFactory.eINSTANCE.createPhcrTreatmentInformationSection();
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
	private static class ConstructorTestClass extends PhcrTreatmentInformationSectionOperations {
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

} // PhcrTreatmentInformationSectionOperations
