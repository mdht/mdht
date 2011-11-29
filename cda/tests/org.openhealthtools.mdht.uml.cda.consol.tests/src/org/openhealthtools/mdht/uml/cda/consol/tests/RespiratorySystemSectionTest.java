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
import org.openhealthtools.mdht.uml.cda.consol.RespiratorySystemSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.RespiratorySystemSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Respiratory System Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RespiratorySystemSection#validateRespiratorySystemSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory System Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RespiratorySystemSection#validateRespiratorySystemSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory System Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RespiratorySystemSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RespiratorySystemSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRespiratorySystemSectionCode() {
		OperationsTestCase<RespiratorySystemSection> validateRespiratorySystemSectionCodeTestCase = new OperationsTestCase<RespiratorySystemSection>(
			"validateRespiratorySystemSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPIRATORY_SYSTEM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RespiratorySystemSection target) {

			}

			@Override
			protected void updateToPass(RespiratorySystemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RespiratorySystemSectionOperations.validateRespiratorySystemSectionCode(
					(RespiratorySystemSection) objectToTest, diagnostician, map);
			}

		};

		validateRespiratorySystemSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRespiratorySystemSectionProblemEntry() {
		OperationsTestCase<RespiratorySystemSection> validateRespiratorySystemSectionProblemEntryTestCase = new OperationsTestCase<RespiratorySystemSection>(
			"validateRespiratorySystemSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_RESPIRATORY_SYSTEM_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RespiratorySystemSection target) {

			}

			@Override
			protected void updateToPass(RespiratorySystemSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RespiratorySystemSectionOperations.validateRespiratorySystemSectionProblemEntry(
					(RespiratorySystemSection) objectToTest, diagnostician, map);
			}

		};

		validateRespiratorySystemSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		RespiratorySystemSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RespiratorySystemSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RespiratorySystemSection> {
		public RespiratorySystemSection create() {
			return ConsolFactory.eINSTANCE.createRespiratorySystemSection();
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
	private static class ConstructorTestClass extends RespiratorySystemSectionOperations {
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

} // RespiratorySystemSectionOperations
