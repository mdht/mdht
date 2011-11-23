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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MouthThroatTeethSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.MouthThroatTeethSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mouth Throat Teeth Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MouthThroatTeethSection#validateMouthThroatTeethSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mouth Throat Teeth Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MouthThroatTeethSection#validateMouthThroatTeethSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mouth Throat Teeth Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MouthThroatTeethSection#validateMouthThroatTeethSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mouth Throat Teeth Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MouthThroatTeethSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MouthThroatTeethSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMouthThroatTeethSectionTemplateId() {
		OperationsTestCase<MouthThroatTeethSection> validateMouthThroatTeethSectionTemplateIdTestCase = new OperationsTestCase<MouthThroatTeethSection>(
			"validateMouthThroatTeethSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MOUTH_THROAT_TEETH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MouthThroatTeethSection target) {

			}

			@Override
			protected void updateToPass(MouthThroatTeethSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MouthThroatTeethSectionOperations.validateMouthThroatTeethSectionTemplateId(
					(MouthThroatTeethSection) objectToTest, diagnostician, map);
			}

		};

		validateMouthThroatTeethSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMouthThroatTeethSectionCode() {
		OperationsTestCase<MouthThroatTeethSection> validateMouthThroatTeethSectionCodeTestCase = new OperationsTestCase<MouthThroatTeethSection>(
			"validateMouthThroatTeethSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MOUTH_THROAT_TEETH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MouthThroatTeethSection target) {

			}

			@Override
			protected void updateToPass(MouthThroatTeethSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MouthThroatTeethSectionOperations.validateMouthThroatTeethSectionCode(
					(MouthThroatTeethSection) objectToTest, diagnostician, map);
			}

		};

		validateMouthThroatTeethSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMouthThroatTeethSectionProblemEntry() {
		OperationsTestCase<MouthThroatTeethSection> validateMouthThroatTeethSectionProblemEntryTestCase = new OperationsTestCase<MouthThroatTeethSection>(
			"validateMouthThroatTeethSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_MOUTH_THROAT_TEETH_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MouthThroatTeethSection target) {

			}

			@Override
			protected void updateToPass(MouthThroatTeethSection target) {
				target.init();

				// ProblemEntry entry = IHEFactory.eINSTANCE.createProblemEntry().init();
				// target.addObservation(entry);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MouthThroatTeethSectionOperations.validateMouthThroatTeethSectionProblemEntry(
					(MouthThroatTeethSection) objectToTest, diagnostician, map);
			}

		};

		validateMouthThroatTeethSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		MouthThroatTeethSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MouthThroatTeethSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MouthThroatTeethSection> {

		public MouthThroatTeethSection create() {
			return ConsolFactory.eINSTANCE.createMouthThroatTeethSection();
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
	private static class ConstructorTestClass extends MouthThroatTeethSectionOperations {
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

} // MouthThroatTeethSectionOperations
