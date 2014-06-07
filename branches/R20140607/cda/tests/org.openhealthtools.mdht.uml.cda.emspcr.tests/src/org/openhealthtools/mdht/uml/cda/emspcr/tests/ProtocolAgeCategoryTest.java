/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProtocolAgeCategoryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protocol Age Category</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory#validateProtocolAgeCategoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory#validateProtocolAgeCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory#validateProtocolAgeCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory#validateProtocolAgeCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory#validateProtocolAgeCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory#validateProtocolAgeCategoryValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Age Category Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProtocolAgeCategoryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolAgeCategoryTemplateId() {
		OperationsTestCase<ProtocolAgeCategory> validateProtocolAgeCategoryTemplateIdTestCase = new OperationsTestCase<ProtocolAgeCategory>(
			"validateProtocolAgeCategoryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_AGE_CATEGORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolAgeCategory target) {

			}

			@Override
			protected void updateToPass(ProtocolAgeCategory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolAgeCategoryOperations.validateProtocolAgeCategoryTemplateId(
					(ProtocolAgeCategory) objectToTest, diagnostician, map);
			}

		};

		validateProtocolAgeCategoryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolAgeCategoryMoodCode() {
		OperationsTestCase<ProtocolAgeCategory> validateProtocolAgeCategoryMoodCodeTestCase = new OperationsTestCase<ProtocolAgeCategory>(
			"validateProtocolAgeCategoryMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_AGE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolAgeCategory target) {

			}

			@Override
			protected void updateToPass(ProtocolAgeCategory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolAgeCategoryOperations.validateProtocolAgeCategoryMoodCode(
					(ProtocolAgeCategory) objectToTest, diagnostician, map);
			}

		};

		validateProtocolAgeCategoryMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolAgeCategoryCodeP() {
		OperationsTestCase<ProtocolAgeCategory> validateProtocolAgeCategoryCodePTestCase = new OperationsTestCase<ProtocolAgeCategory>(
			"validateProtocolAgeCategoryCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_AGE_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolAgeCategory target) {

			}

			@Override
			protected void updateToPass(ProtocolAgeCategory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolAgeCategoryOperations.validateProtocolAgeCategoryCodeP(
					(ProtocolAgeCategory) objectToTest, diagnostician, map);
			}

		};

		validateProtocolAgeCategoryCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolAgeCategoryCode() {
		OperationsTestCase<ProtocolAgeCategory> validateProtocolAgeCategoryCodeTestCase = new OperationsTestCase<ProtocolAgeCategory>(
			"validateProtocolAgeCategoryCode",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_AGE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolAgeCategory target) {

			}

			@Override
			protected void updateToPass(ProtocolAgeCategory target) {
				target.init();

			}

			@Override
			protected void setDependency(ProtocolAgeCategory target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategoryCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolAgeCategoryOperations.validateProtocolAgeCategoryCode(
					(ProtocolAgeCategory) objectToTest, diagnostician, map);
			}

		};

		validateProtocolAgeCategoryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolAgeCategoryValue() {
		OperationsTestCase<ProtocolAgeCategory> validateProtocolAgeCategoryValueTestCase = new OperationsTestCase<ProtocolAgeCategory>(
			"validateProtocolAgeCategoryValue",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolAgeCategory target) {

			}

			@Override
			protected void updateToPass(ProtocolAgeCategory target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolAgeCategoryOperations.validateProtocolAgeCategoryValue(
					(ProtocolAgeCategory) objectToTest, diagnostician, map);
			}

		};

		validateProtocolAgeCategoryValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolAgeCategoryValueP() {
		OperationsTestCase<ProtocolAgeCategory> validateProtocolAgeCategoryValuePTestCase = new OperationsTestCase<ProtocolAgeCategory>(
			"validateProtocolAgeCategoryValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_AGE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolAgeCategory target) {

			}

			@Override
			protected void updateToPass(ProtocolAgeCategory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolAgeCategoryOperations.validateProtocolAgeCategoryValueP(
					(ProtocolAgeCategory) objectToTest, diagnostician, map);
			}

		};

		validateProtocolAgeCategoryValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProtocolAgeCategoryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProtocolAgeCategory> {
		public ProtocolAgeCategory create() {
			return EmspcrFactory.eINSTANCE.createProtocolAgeCategory();
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
	private static class ConstructorTestClass extends ProtocolAgeCategoryOperations {
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

} // ProtocolAgeCategoryOperations
