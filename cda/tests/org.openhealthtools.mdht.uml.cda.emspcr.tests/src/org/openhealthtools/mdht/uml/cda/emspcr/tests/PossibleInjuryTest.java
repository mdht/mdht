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
import org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PossibleInjuryOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Possible Injury</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury#validatePossibleInjuryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury#validatePossibleInjuryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury#validatePossibleInjuryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury#validatePossibleInjuryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury#validatePossibleInjuryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Possible Injury Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PossibleInjuryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePossibleInjuryTemplateId() {
		OperationsTestCase<PossibleInjury> validatePossibleInjuryTemplateIdTestCase = new OperationsTestCase<PossibleInjury>(
			"validatePossibleInjuryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POSSIBLE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PossibleInjury target) {

			}

			@Override
			protected void updateToPass(PossibleInjury target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PossibleInjuryOperations.validatePossibleInjuryTemplateId(
					(PossibleInjury) objectToTest, diagnostician, map);
			}

		};

		validatePossibleInjuryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePossibleInjuryCodeP() {
		OperationsTestCase<PossibleInjury> validatePossibleInjuryCodePTestCase = new OperationsTestCase<PossibleInjury>(
			"validatePossibleInjuryCodeP",
			operationsForOCL.getOCLValue("VALIDATE_POSSIBLE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PossibleInjury target) {

			}

			@Override
			protected void updateToPass(PossibleInjury target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PossibleInjuryOperations.validatePossibleInjuryCodeP(
					(PossibleInjury) objectToTest, diagnostician, map);
			}

		};

		validatePossibleInjuryCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePossibleInjuryCode() {
		OperationsTestCase<PossibleInjury> validatePossibleInjuryCodeTestCase = new OperationsTestCase<PossibleInjury>(
			"validatePossibleInjuryCode",
			operationsForOCL.getOCLValue("VALIDATE_POSSIBLE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PossibleInjury target) {

			}

			@Override
			protected void updateToPass(PossibleInjury target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PossibleInjuryOperations.validatePossibleInjuryCode(
					(PossibleInjury) objectToTest, diagnostician, map);
			}

		};

		validatePossibleInjuryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePossibleInjuryValue() {
		OperationsTestCase<PossibleInjury> validatePossibleInjuryValueTestCase = new OperationsTestCase<PossibleInjury>(
			"validatePossibleInjuryValue",
			operationsForOCL.getOCLValue("VALIDATE_POSSIBLE_INJURY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PossibleInjury target) {

			}

			@Override
			protected void updateToPass(PossibleInjury target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PossibleInjuryOperations.validatePossibleInjuryValue(
					(PossibleInjury) objectToTest, diagnostician, map);
			}

		};

		validatePossibleInjuryValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePossibleInjuryMoodCode() {
		OperationsTestCase<PossibleInjury> validatePossibleInjuryMoodCodeTestCase = new OperationsTestCase<PossibleInjury>(
			"validatePossibleInjuryMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_POSSIBLE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PossibleInjury target) {

			}

			@Override
			protected void updateToPass(PossibleInjury target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PossibleInjuryOperations.validatePossibleInjuryMoodCode(
					(PossibleInjury) objectToTest, diagnostician, map);
			}

		};

		validatePossibleInjuryMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PossibleInjuryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PossibleInjury> {
		public PossibleInjury create() {
			return EmspcrFactory.eINSTANCE.createPossibleInjury();
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
	private static class ConstructorTestClass extends PossibleInjuryOperations {
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

} // PossibleInjuryOperations
