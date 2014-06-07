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
import org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.HeightOfFallOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Height Of Fall</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall#validateHeightOfFallTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall#validateHeightOfFallMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall#validateHeightOfFallCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall#validateHeightOfFallValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HeightOfFallTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeightOfFallTemplateId() {
		OperationsTestCase<HeightOfFall> validateHeightOfFallTemplateIdTestCase = new OperationsTestCase<HeightOfFall>(
			"validateHeightOfFallTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEIGHT_OF_FALL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeightOfFall target) {

			}

			@Override
			protected void updateToPass(HeightOfFall target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeightOfFallOperations.validateHeightOfFallTemplateId(
					(HeightOfFall) objectToTest, diagnostician, map);
			}

		};

		validateHeightOfFallTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeightOfFallMoodCode() {
		OperationsTestCase<HeightOfFall> validateHeightOfFallMoodCodeTestCase = new OperationsTestCase<HeightOfFall>(
			"validateHeightOfFallMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HEIGHT_OF_FALL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeightOfFall target) {

			}

			@Override
			protected void updateToPass(HeightOfFall target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeightOfFallOperations.validateHeightOfFallMoodCode(
					(HeightOfFall) objectToTest, diagnostician, map);
			}

		};

		validateHeightOfFallMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeightOfFallCode() {
		OperationsTestCase<HeightOfFall> validateHeightOfFallCodeTestCase = new OperationsTestCase<HeightOfFall>(
			"validateHeightOfFallCode",
			operationsForOCL.getOCLValue("VALIDATE_HEIGHT_OF_FALL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(HeightOfFall target) {

			}

			@Override
			protected void updateToPass(HeightOfFall target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeightOfFallOperations.validateHeightOfFallCode((HeightOfFall) objectToTest, diagnostician, map);
			}

		};

		validateHeightOfFallCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeightOfFallValue() {
		OperationsTestCase<HeightOfFall> validateHeightOfFallValueTestCase = new OperationsTestCase<HeightOfFall>(
			"validateHeightOfFallValue",
			operationsForOCL.getOCLValue("VALIDATE_HEIGHT_OF_FALL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeightOfFall target) {

			}

			@Override
			protected void updateToPass(HeightOfFall target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeightOfFallOperations.validateHeightOfFallValue((HeightOfFall) objectToTest, diagnostician, map);
			}

		};

		validateHeightOfFallValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HeightOfFallOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HeightOfFall> {
		public HeightOfFall create() {
			return EmspcrFactory.eINSTANCE.createHeightOfFall();
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
	private static class ConstructorTestClass extends HeightOfFallOperations {
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

} // HeightOfFallOperations
