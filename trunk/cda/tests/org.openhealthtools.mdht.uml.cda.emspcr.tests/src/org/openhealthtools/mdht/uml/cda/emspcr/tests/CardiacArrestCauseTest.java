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

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacArrestCauseOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Arrest Cause</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause#validateCardiacArrestCauseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause#validateCardiacArrestCauseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause#validateCardiacArrestCauseValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause#validateCardiacArrestCauseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Arrest Cause Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CardiacArrestCauseTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestCauseTemplateId() {
		OperationsTestCase<CardiacArrestCause> validateCardiacArrestCauseTemplateIdTestCase = new OperationsTestCase<CardiacArrestCause>(
			"validateCardiacArrestCauseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_CAUSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestCause target) {

			}

			@Override
			protected void updateToPass(CardiacArrestCause target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestCauseOperations.validateCardiacArrestCauseTemplateId(
					(CardiacArrestCause) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestCauseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestCauseCode() {
		OperationsTestCase<CardiacArrestCause> validateCardiacArrestCauseCodeTestCase = new OperationsTestCase<CardiacArrestCause>(
			"validateCardiacArrestCauseCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestCause target) {

			}

			@Override
			protected void updateToPass(CardiacArrestCause target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestCauseOperations.validateCardiacArrestCauseCode(
					(CardiacArrestCause) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestCauseCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestCauseValue() {
		OperationsTestCase<CardiacArrestCause> validateCardiacArrestCauseValueTestCase = new OperationsTestCase<CardiacArrestCause>(
			"validateCardiacArrestCauseValue",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestCause target) {

			}

			@Override
			protected void updateToPass(CardiacArrestCause target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestCauseOperations.validateCardiacArrestCauseValue(
					(CardiacArrestCause) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestCauseValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCardiacArrestCauseMoodCode() {
		OperationsTestCase<CardiacArrestCause> validateCardiacArrestCauseMoodCodeTestCase = new OperationsTestCase<CardiacArrestCause>(
			"validateCardiacArrestCauseMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARDIAC_ARREST_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CardiacArrestCause target) {

			}

			@Override
			protected void updateToPass(CardiacArrestCause target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CardiacArrestCauseOperations.validateCardiacArrestCauseMoodCode(
					(CardiacArrestCause) objectToTest, diagnostician, map);
			}

		};

		validateCardiacArrestCauseMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CardiacArrestCauseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CardiacArrestCause> {
		public CardiacArrestCause create() {
			return EmspcrFactory.eINSTANCE.createCardiacArrestCause();
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
	private static class ConstructorTestClass extends CardiacArrestCauseOperations {
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

} // CardiacArrestCauseOperations
