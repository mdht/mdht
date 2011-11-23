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
import org.openhealthtools.mdht.uml.cda.consol.GenitaliaSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.GenitaliaSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Genitalia Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenitaliaSection#validateGenitaliaSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Genitalia Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenitaliaSection#validateGenitaliaSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Genitalia Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenitaliaSection#validateGenitaliaSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Genitalia Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenitaliaSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GenitaliaSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGenitaliaSectionTemplateId() {
		OperationsTestCase<GenitaliaSection> validateGenitaliaSectionTemplateIdTestCase = new OperationsTestCase<GenitaliaSection>(
			"validateGenitaliaSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENITALIA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenitaliaSection target) {

			}

			@Override
			protected void updateToPass(GenitaliaSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenitaliaSectionOperations.validateGenitaliaSectionTemplateId(
					(GenitaliaSection) objectToTest, diagnostician, map);
			}

		};

		validateGenitaliaSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGenitaliaSectionCode() {
		OperationsTestCase<GenitaliaSection> validateGenitaliaSectionCodeTestCase = new OperationsTestCase<GenitaliaSection>(
			"validateGenitaliaSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_GENITALIA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenitaliaSection target) {

			}

			@Override
			protected void updateToPass(GenitaliaSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenitaliaSectionOperations.validateGenitaliaSectionCode(
					(GenitaliaSection) objectToTest, diagnostician, map);
			}

		};

		validateGenitaliaSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGenitaliaSectionProblemEntry() {
		OperationsTestCase<GenitaliaSection> validateGenitaliaSectionProblemEntryTestCase = new OperationsTestCase<GenitaliaSection>(
			"validateGenitaliaSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_GENITALIA_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenitaliaSection target) {

			}

			@Override
			protected void updateToPass(GenitaliaSection target) {
				target.init();

				// ProblemEntry entry = IHEFactory.eINSTANCE.createProblemEntry().init();
				// target.addObservation(entry);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenitaliaSectionOperations.validateGenitaliaSectionProblemEntry(
					(GenitaliaSection) objectToTest, diagnostician, map);
			}

		};

		validateGenitaliaSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		GenitaliaSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GenitaliaSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GenitaliaSection> {

		public GenitaliaSection create() {
			return ConsolFactory.eINSTANCE.createGenitaliaSection();
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
	private static class ConstructorTestClass extends GenitaliaSectionOperations {
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

} // GenitaliaSectionOperations
