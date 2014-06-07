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
import org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ArrestRhythmOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Arrest Rhythm</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm#validateArrestRhythmTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm#validateArrestRhythmMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm#validateArrestRhythmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm#validateArrestRhythmValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Arrest Rhythm Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ArrestRhythmTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateArrestRhythmTemplateId() {
		OperationsTestCase<ArrestRhythm> validateArrestRhythmTemplateIdTestCase = new OperationsTestCase<ArrestRhythm>(
			"validateArrestRhythmTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ARREST_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ArrestRhythm target) {

			}

			@Override
			protected void updateToPass(ArrestRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ArrestRhythmOperations.validateArrestRhythmTemplateId(
					(ArrestRhythm) objectToTest, diagnostician, map);
			}

		};

		validateArrestRhythmTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateArrestRhythmMoodCode() {
		OperationsTestCase<ArrestRhythm> validateArrestRhythmMoodCodeTestCase = new OperationsTestCase<ArrestRhythm>(
			"validateArrestRhythmMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ARREST_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ArrestRhythm target) {

			}

			@Override
			protected void updateToPass(ArrestRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ArrestRhythmOperations.validateArrestRhythmMoodCode(
					(ArrestRhythm) objectToTest, diagnostician, map);
			}

		};

		validateArrestRhythmMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateArrestRhythmCode() {
		OperationsTestCase<ArrestRhythm> validateArrestRhythmCodeTestCase = new OperationsTestCase<ArrestRhythm>(
			"validateArrestRhythmCode",
			operationsForOCL.getOCLValue("VALIDATE_ARREST_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ArrestRhythm target) {

			}

			@Override
			protected void updateToPass(ArrestRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ArrestRhythmOperations.validateArrestRhythmCode((ArrestRhythm) objectToTest, diagnostician, map);
			}

		};

		validateArrestRhythmCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateArrestRhythmValue() {
		OperationsTestCase<ArrestRhythm> validateArrestRhythmValueTestCase = new OperationsTestCase<ArrestRhythm>(
			"validateArrestRhythmValue",
			operationsForOCL.getOCLValue("VALIDATE_ARREST_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ArrestRhythm target) {

			}

			@Override
			protected void updateToPass(ArrestRhythm target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ArrestRhythmOperations.validateArrestRhythmValue((ArrestRhythm) objectToTest, diagnostician, map);
			}

		};

		validateArrestRhythmValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ArrestRhythmOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ArrestRhythm> {
		public ArrestRhythm create() {
			return EmspcrFactory.eINSTANCE.createArrestRhythm();
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
	private static class ConstructorTestClass extends ArrestRhythmOperations {
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

} // ArrestRhythmOperations
