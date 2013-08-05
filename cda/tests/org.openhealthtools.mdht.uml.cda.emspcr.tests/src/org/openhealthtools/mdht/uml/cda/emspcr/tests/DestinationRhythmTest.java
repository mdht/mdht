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

import org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DestinationRhythmOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Destination Rhythm</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm#validateDestinationRhythmTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm#validateDestinationRhythmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm#validateDestinationRhythmValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm#validateDestinationRhythmMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Rhythm Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DestinationRhythmTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDestinationRhythmTemplateId() {
		OperationsTestCase<DestinationRhythm> validateDestinationRhythmTemplateIdTestCase = new OperationsTestCase<DestinationRhythm>(
			"validateDestinationRhythmTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DESTINATION_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DestinationRhythm target) {

			}

			@Override
			protected void updateToPass(DestinationRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DestinationRhythmOperations.validateDestinationRhythmTemplateId(
					(DestinationRhythm) objectToTest, diagnostician, map);
			}

		};

		validateDestinationRhythmTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDestinationRhythmCode() {
		OperationsTestCase<DestinationRhythm> validateDestinationRhythmCodeTestCase = new OperationsTestCase<DestinationRhythm>(
			"validateDestinationRhythmCode",
			operationsForOCL.getOCLValue("VALIDATE_DESTINATION_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DestinationRhythm target) {

			}

			@Override
			protected void updateToPass(DestinationRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DestinationRhythmOperations.validateDestinationRhythmCode(
					(DestinationRhythm) objectToTest, diagnostician, map);
			}

		};

		validateDestinationRhythmCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDestinationRhythmValue() {
		OperationsTestCase<DestinationRhythm> validateDestinationRhythmValueTestCase = new OperationsTestCase<DestinationRhythm>(
			"validateDestinationRhythmValue",
			operationsForOCL.getOCLValue("VALIDATE_DESTINATION_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DestinationRhythm target) {

			}

			@Override
			protected void updateToPass(DestinationRhythm target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DestinationRhythmOperations.validateDestinationRhythmValue(
					(DestinationRhythm) objectToTest, diagnostician, map);
			}

		};

		validateDestinationRhythmValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDestinationRhythmMoodCode() {
		OperationsTestCase<DestinationRhythm> validateDestinationRhythmMoodCodeTestCase = new OperationsTestCase<DestinationRhythm>(
			"validateDestinationRhythmMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DESTINATION_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DestinationRhythm target) {

			}

			@Override
			protected void updateToPass(DestinationRhythm target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DestinationRhythmOperations.validateDestinationRhythmMoodCode(
					(DestinationRhythm) objectToTest, diagnostician, map);
			}

		};

		validateDestinationRhythmMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DestinationRhythmOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DestinationRhythm> {
		public DestinationRhythm create() {
			return EmspcrFactory.eINSTANCE.createDestinationRhythm();
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
	private static class ConstructorTestClass extends DestinationRhythmOperations {
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

} // DestinationRhythmOperations
