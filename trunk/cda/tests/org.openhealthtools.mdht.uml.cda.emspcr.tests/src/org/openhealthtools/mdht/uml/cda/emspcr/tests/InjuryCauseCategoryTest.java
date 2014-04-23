/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.InjuryCauseCategoryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Injury Cause Category</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory#validateInjuryCauseCategoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory#validateInjuryCauseCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory#validateInjuryCauseCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryCauseCategory#validateInjuryCauseCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Cause Category Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InjuryCauseCategoryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryCauseCategoryTemplateId() {
		OperationsTestCase<InjuryCauseCategory> validateInjuryCauseCategoryTemplateIdTestCase = new OperationsTestCase<InjuryCauseCategory>(
			"validateInjuryCauseCategoryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_CAUSE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryCauseCategory target) {

			}

			@Override
			protected void updateToPass(InjuryCauseCategory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryCauseCategoryOperations.validateInjuryCauseCategoryTemplateId(
					(InjuryCauseCategory) objectToTest, diagnostician, map);
			}

		};

		validateInjuryCauseCategoryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryCauseCategoryMoodCode() {
		OperationsTestCase<InjuryCauseCategory> validateInjuryCauseCategoryMoodCodeTestCase = new OperationsTestCase<InjuryCauseCategory>(
			"validateInjuryCauseCategoryMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_CAUSE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryCauseCategory target) {

			}

			@Override
			protected void updateToPass(InjuryCauseCategory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryCauseCategoryOperations.validateInjuryCauseCategoryMoodCode(
					(InjuryCauseCategory) objectToTest, diagnostician, map);
			}

		};

		validateInjuryCauseCategoryMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryCauseCategoryCode() {
		OperationsTestCase<InjuryCauseCategory> validateInjuryCauseCategoryCodeTestCase = new OperationsTestCase<InjuryCauseCategory>(
			"validateInjuryCauseCategoryCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_CAUSE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryCauseCategory target) {

			}

			@Override
			protected void updateToPass(InjuryCauseCategory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryCauseCategoryOperations.validateInjuryCauseCategoryCode(
					(InjuryCauseCategory) objectToTest, diagnostician, map);
			}

		};

		validateInjuryCauseCategoryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryCauseCategoryValue() {
		OperationsTestCase<InjuryCauseCategory> validateInjuryCauseCategoryValueTestCase = new OperationsTestCase<InjuryCauseCategory>(
			"validateInjuryCauseCategoryValue",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_CAUSE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryCauseCategory target) {

			}

			@Override
			protected void updateToPass(InjuryCauseCategory target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryCauseCategoryOperations.validateInjuryCauseCategoryValue(
					(InjuryCauseCategory) objectToTest, diagnostician, map);
			}

		};

		validateInjuryCauseCategoryValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InjuryCauseCategoryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InjuryCauseCategory> {
		public InjuryCauseCategory create() {
			return EmspcrFactory.eINSTANCE.createInjuryCauseCategory();
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
	private static class ConstructorTestClass extends InjuryCauseCategoryOperations {
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

} // InjuryCauseCategoryOperations
