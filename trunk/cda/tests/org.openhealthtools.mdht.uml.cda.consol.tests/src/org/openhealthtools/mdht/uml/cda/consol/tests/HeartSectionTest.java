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
import org.openhealthtools.mdht.uml.cda.consol.HeartSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HeartSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Heart Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HeartSection#validateHeartSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HeartSection#validateHeartSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HeartSection#validateHeartSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HeartSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HeartSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartSectionTemplateId() {
		OperationsTestCase<HeartSection> validateHeartSectionTemplateIdTestCase = new OperationsTestCase<HeartSection>(
			"validateHeartSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEART_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeartSection target) {

			}

			@Override
			protected void updateToPass(HeartSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartSectionOperations.validateHeartSectionTemplateId(
					(HeartSection) objectToTest, diagnostician, map);
			}

		};

		validateHeartSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartSectionCode() {
		OperationsTestCase<HeartSection> validateHeartSectionCodeTestCase = new OperationsTestCase<HeartSection>(
			"validateHeartSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HEART_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(HeartSection target) {

			}

			@Override
			protected void updateToPass(HeartSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartSectionOperations.validateHeartSectionCode((HeartSection) objectToTest, diagnostician, map);
			}

		};

		validateHeartSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartSectionProblemEntry() {
		OperationsTestCase<HeartSection> validateHeartSectionProblemEntryTestCase = new OperationsTestCase<HeartSection>(
			"validateHeartSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_HEART_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeartSection target) {

			}

			@Override
			protected void updateToPass(HeartSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartSectionOperations.validateHeartSectionProblemEntry(
					(HeartSection) objectToTest, diagnostician, map);
			}

		};

		validateHeartSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		HeartSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HeartSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HeartSection> {
		public HeartSection create() {
			return ConsolFactory.eINSTANCE.createHeartSection();
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
	private static class ConstructorTestClass extends HeartSectionOperations {
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

} // HeartSectionOperations
