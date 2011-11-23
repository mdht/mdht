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
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryOfPastIllnessSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Past Illness Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionHasClinicalStatements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Has Clinical Statements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#getCondition() <em>Get Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryOfPastIllnessSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionHasClinicalStatements() {
		OperationsTestCase<HistoryOfPastIllnessSection> validateHistoryOfPastIllnessSectionHasClinicalStatementsTestCase = new OperationsTestCase<HistoryOfPastIllnessSection>(
			"validateHistoryOfPastIllnessSectionHasClinicalStatements",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionHasClinicalStatements(
					(HistoryOfPastIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionHasClinicalStatementsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionTemplateId() {
		OperationsTestCase<HistoryOfPastIllnessSection> validateHistoryOfPastIllnessSectionTemplateIdTestCase = new OperationsTestCase<HistoryOfPastIllnessSection>(
			"validateHistoryOfPastIllnessSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionTemplateId(
					(HistoryOfPastIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionCode() {
		OperationsTestCase<HistoryOfPastIllnessSection> validateHistoryOfPastIllnessSectionCodeTestCase = new OperationsTestCase<HistoryOfPastIllnessSection>(
			"validateHistoryOfPastIllnessSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionCode(
					(HistoryOfPastIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionCondition() {
		OperationsTestCase<HistoryOfPastIllnessSection> validateHistoryOfPastIllnessSectionConditionTestCase = new OperationsTestCase<HistoryOfPastIllnessSection>(
			"validateHistoryOfPastIllnessSectionCondition",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionCondition(
					(HistoryOfPastIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCondition() {

		HistoryOfPastIllnessSection target = objectFactory.create();
		target.getCondition();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryOfPastIllnessSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryOfPastIllnessSection> {

		public HistoryOfPastIllnessSection create() {
			return ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection();
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
	private static class ConstructorTestClass extends HistoryOfPastIllnessSectionOperations {
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

} // HistoryOfPastIllnessSectionOperations
