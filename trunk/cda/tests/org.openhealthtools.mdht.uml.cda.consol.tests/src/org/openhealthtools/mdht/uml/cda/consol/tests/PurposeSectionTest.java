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
import org.openhealthtools.mdht.uml.cda.consol.PurposeSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PurposeSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Purpose Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeSection#validatePurposeSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeSection#validatePurposeSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeSection#validatePurposeSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeSection#validatePurposeSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeSection#validatePurposeSectionPurposeActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Purpose Section Purpose Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PurposeSection#getPurposeActivities() <em>Get Purpose Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PurposeSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePurposeSectionTemplateId() {
		OperationsTestCase<PurposeSection> validatePurposeSectionTemplateIdTestCase = new OperationsTestCase<PurposeSection>(
			"validatePurposeSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeSection target) {

			}

			@Override
			protected void updateToPass(PurposeSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeSectionOperations.validatePurposeSectionTemplateId(
					(PurposeSection) objectToTest, diagnostician, map);
			}

		};

		validatePurposeSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePurposeSectionCode() {
		OperationsTestCase<PurposeSection> validatePurposeSectionCodeTestCase = new OperationsTestCase<PurposeSection>(
			"validatePurposeSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeSection target) {

			}

			@Override
			protected void updateToPass(PurposeSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeSectionOperations.validatePurposeSectionCode(
					(PurposeSection) objectToTest, diagnostician, map);
			}

		};

		validatePurposeSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePurposeSectionTitle() {
		OperationsTestCase<PurposeSection> validatePurposeSectionTitleTestCase = new OperationsTestCase<PurposeSection>(
			"validatePurposeSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeSection target) {

			}

			@Override
			protected void updateToPass(PurposeSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeSectionOperations.validatePurposeSectionTitle(
					(PurposeSection) objectToTest, diagnostician, map);
			}

		};

		validatePurposeSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePurposeSectionText() {
		OperationsTestCase<PurposeSection> validatePurposeSectionTextTestCase = new OperationsTestCase<PurposeSection>(
			"validatePurposeSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeSection target) {

			}

			@Override
			protected void updateToPass(PurposeSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeSectionOperations.validatePurposeSectionText(
					(PurposeSection) objectToTest, diagnostician, map);
			}

		};

		validatePurposeSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePurposeSectionPurposeActivity() {
		OperationsTestCase<PurposeSection> validatePurposeSectionPurposeActivityTestCase = new OperationsTestCase<PurposeSection>(
			"validatePurposeSectionPurposeActivity",
			operationsForOCL.getOCLValue("VALIDATE_PURPOSE_SECTION_PURPOSE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PurposeSection target) {

			}

			@Override
			protected void updateToPass(PurposeSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PurposeSectionOperations.validatePurposeSectionPurposeActivity(
					(PurposeSection) objectToTest, diagnostician, map);
			}

		};

		validatePurposeSectionPurposeActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPurposeActivities() {

		PurposeSection target = objectFactory.create();
		target.getPurposeActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PurposeSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PurposeSection> {

		public PurposeSection create() {
			return ConsolFactory.eINSTANCE.createPurposeSection();
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
	private static class ConstructorTestClass extends PurposeSectionOperations {
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

} // PurposeSectionOperations
