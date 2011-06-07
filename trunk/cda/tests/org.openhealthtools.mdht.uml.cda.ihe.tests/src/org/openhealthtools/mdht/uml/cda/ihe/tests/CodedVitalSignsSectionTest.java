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
import org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedVitalSignsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection#validateCodedVitalSignsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Vital Signs Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection#validateCodedVitalSignsSectionVitalSignsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Vital Signs Section Vital Signs Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection#getIHEVitalSignsOrganizers() <em>Get IHE Vital Signs Organizers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CodedVitalSignsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodedVitalSignsSectionTemplateId() {
		OperationsTestCase<CodedVitalSignsSection> validateCodedVitalSignsSectionTemplateIdTestCase = new OperationsTestCase<CodedVitalSignsSection>(
			"validateCodedVitalSignsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CODED_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(CodedVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedVitalSignsSectionOperations.validateCodedVitalSignsSectionTemplateId(
					(CodedVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedVitalSignsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCodedVitalSignsSectionVitalSignsOrganizer() {
		OperationsTestCase<CodedVitalSignsSection> validateCodedVitalSignsSectionVitalSignsOrganizerTestCase = new OperationsTestCase<CodedVitalSignsSection>(
			"validateCodedVitalSignsSectionVitalSignsOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_CODED_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(CodedVitalSignsSection target) {
				target.init();
				VitalSignsOrganizer vso = IHEFactory.eINSTANCE.createVitalSignsOrganizer().init();
				target.addOrganizer(vso);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedVitalSignsSectionOperations.validateCodedVitalSignsSectionVitalSignsOrganizer(
					(CodedVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedVitalSignsSectionVitalSignsOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CodedVitalSignsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CodedVitalSignsSection> {

		public CodedVitalSignsSection create() {
			return IHEFactory.eINSTANCE.createCodedVitalSignsSection();
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
	private static class ConstructorTestClass extends CodedVitalSignsSectionOperations {
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

} // CodedVitalSignsSectionOperations
