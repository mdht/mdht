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
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.GlasgowEyeOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Glasgow Eye</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye#validateGlasgowEyeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye#validateGlasgowEyeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye#validateGlasgowEyeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye#validateGlasgowEyeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEye#validateGlasgowEyeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Eye Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GlasgowEyeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowEyeTemplateId() {
		OperationsTestCase<GlasgowEye> validateGlasgowEyeTemplateIdTestCase = new OperationsTestCase<GlasgowEye>(
			"validateGlasgowEyeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_EYE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowEye target) {

			}

			@Override
			protected void updateToPass(GlasgowEye target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowEyeOperations.validateGlasgowEyeTemplateId((GlasgowEye) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowEyeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowEyeMoodCode() {
		OperationsTestCase<GlasgowEye> validateGlasgowEyeMoodCodeTestCase = new OperationsTestCase<GlasgowEye>(
			"validateGlasgowEyeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_EYE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowEye target) {

			}

			@Override
			protected void updateToPass(GlasgowEye target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowEyeOperations.validateGlasgowEyeMoodCode((GlasgowEye) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowEyeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowEyeCodeP() {
		OperationsTestCase<GlasgowEye> validateGlasgowEyeCodePTestCase = new OperationsTestCase<GlasgowEye>(
			"validateGlasgowEyeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_EYE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(GlasgowEye target) {

			}

			@Override
			protected void updateToPass(GlasgowEye target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowEyeOperations.validateGlasgowEyeCodeP((GlasgowEye) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowEyeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowEyeCode() {
		OperationsTestCase<GlasgowEye> validateGlasgowEyeCodeTestCase = new OperationsTestCase<GlasgowEye>(
			"validateGlasgowEyeCode",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_EYE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(GlasgowEye target) {

			}

			@Override
			protected void updateToPass(GlasgowEye target) {
				target.init();

			}

			@Override
			protected void setDependency(GlasgowEye target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.GlasgowEyeCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowEyeOperations.validateGlasgowEyeCode((GlasgowEye) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowEyeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowEyeValue() {
		OperationsTestCase<GlasgowEye> validateGlasgowEyeValueTestCase = new OperationsTestCase<GlasgowEye>(
			"validateGlasgowEyeValue",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_EYE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(GlasgowEye target) {

			}

			@Override
			protected void updateToPass(GlasgowEye target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowEyeOperations.validateGlasgowEyeValue((GlasgowEye) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowEyeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GlasgowEyeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GlasgowEye> {
		public GlasgowEye create() {
			return EmspcrFactory.eINSTANCE.createGlasgowEye();
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
	private static class ConstructorTestClass extends GlasgowEyeOperations {
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

} // GlasgowEyeOperations
