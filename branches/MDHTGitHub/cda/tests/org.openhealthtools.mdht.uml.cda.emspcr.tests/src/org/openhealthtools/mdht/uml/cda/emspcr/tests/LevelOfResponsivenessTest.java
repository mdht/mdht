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
import org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.LevelOfResponsivenessOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Level Of Responsiveness</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsiveness#validateLevelOfResponsivenessValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Responsiveness Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LevelOfResponsivenessTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfResponsivenessTemplateId() {
		OperationsTestCase<LevelOfResponsiveness> validateLevelOfResponsivenessTemplateIdTestCase = new OperationsTestCase<LevelOfResponsiveness>(
			"validateLevelOfResponsivenessTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_RESPONSIVENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfResponsiveness target) {

			}

			@Override
			protected void updateToPass(LevelOfResponsiveness target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfResponsivenessOperations.validateLevelOfResponsivenessTemplateId(
					(LevelOfResponsiveness) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfResponsivenessTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfResponsivenessMoodCode() {
		OperationsTestCase<LevelOfResponsiveness> validateLevelOfResponsivenessMoodCodeTestCase = new OperationsTestCase<LevelOfResponsiveness>(
			"validateLevelOfResponsivenessMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_RESPONSIVENESS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfResponsiveness target) {

			}

			@Override
			protected void updateToPass(LevelOfResponsiveness target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfResponsivenessOperations.validateLevelOfResponsivenessMoodCode(
					(LevelOfResponsiveness) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfResponsivenessMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfResponsivenessCodeP() {
		OperationsTestCase<LevelOfResponsiveness> validateLevelOfResponsivenessCodePTestCase = new OperationsTestCase<LevelOfResponsiveness>(
			"validateLevelOfResponsivenessCodeP",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfResponsiveness target) {

			}

			@Override
			protected void updateToPass(LevelOfResponsiveness target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfResponsivenessOperations.validateLevelOfResponsivenessCodeP(
					(LevelOfResponsiveness) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfResponsivenessCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfResponsivenessCode() {
		OperationsTestCase<LevelOfResponsiveness> validateLevelOfResponsivenessCodeTestCase = new OperationsTestCase<LevelOfResponsiveness>(
			"validateLevelOfResponsivenessCode",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_RESPONSIVENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfResponsiveness target) {

			}

			@Override
			protected void updateToPass(LevelOfResponsiveness target) {
				target.init();

			}

			@Override
			protected void setDependency(LevelOfResponsiveness target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.LevelOfResponsivenessCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfResponsivenessOperations.validateLevelOfResponsivenessCode(
					(LevelOfResponsiveness) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfResponsivenessCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfResponsivenessEffectiveTime() {
		OperationsTestCase<LevelOfResponsiveness> validateLevelOfResponsivenessEffectiveTimeTestCase = new OperationsTestCase<LevelOfResponsiveness>(
			"validateLevelOfResponsivenessEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_RESPONSIVENESS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfResponsiveness target) {

			}

			@Override
			protected void updateToPass(LevelOfResponsiveness target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfResponsivenessOperations.validateLevelOfResponsivenessEffectiveTime(
					(LevelOfResponsiveness) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfResponsivenessEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfResponsivenessValue() {
		OperationsTestCase<LevelOfResponsiveness> validateLevelOfResponsivenessValueTestCase = new OperationsTestCase<LevelOfResponsiveness>(
			"validateLevelOfResponsivenessValue",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfResponsiveness target) {

			}

			@Override
			protected void updateToPass(LevelOfResponsiveness target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfResponsivenessOperations.validateLevelOfResponsivenessValue(
					(LevelOfResponsiveness) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfResponsivenessValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfResponsivenessValueP() {
		OperationsTestCase<LevelOfResponsiveness> validateLevelOfResponsivenessValuePTestCase = new OperationsTestCase<LevelOfResponsiveness>(
			"validateLevelOfResponsivenessValueP",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_RESPONSIVENESS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfResponsiveness target) {

			}

			@Override
			protected void updateToPass(LevelOfResponsiveness target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfResponsivenessOperations.validateLevelOfResponsivenessValueP(
					(LevelOfResponsiveness) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfResponsivenessValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LevelOfResponsivenessOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LevelOfResponsiveness> {
		public LevelOfResponsiveness create() {
			return EmspcrFactory.eINSTANCE.createLevelOfResponsiveness();
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
	private static class ConstructorTestClass extends LevelOfResponsivenessOperations {
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

} // LevelOfResponsivenessOperations
