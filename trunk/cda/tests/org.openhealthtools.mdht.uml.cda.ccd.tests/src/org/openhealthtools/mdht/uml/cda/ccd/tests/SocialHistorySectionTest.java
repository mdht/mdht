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
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.SocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Social History Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistorySectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSocialHistorySectionTemplateId() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSocialHistorySectionCode() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionCodeTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionCode(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSocialHistorySectionTitle() {
		OperationsTestCase<SocialHistorySection> validateSocialHistorySectionTitleTestCase = new OperationsTestCase<SocialHistorySection>(
			"validateSocialHistorySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SocialHistorySection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistorySectionOperations.validateSocialHistorySectionTitle(
					(SocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTitleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends SocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SocialHistorySection> {
		public SocialHistorySection create() {
			return CCDFactory.eINSTANCE.createSocialHistorySection();
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
	private static class ConstructorTestClass extends SocialHistorySectionOperations {
	}

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

} // SocialHistorySectionOperations
