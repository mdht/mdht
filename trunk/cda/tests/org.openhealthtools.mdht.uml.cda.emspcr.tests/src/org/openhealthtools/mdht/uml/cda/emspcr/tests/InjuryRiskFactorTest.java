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
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.InjuryRiskFactorOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Injury Risk Factor</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor#validateInjuryRiskFactorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor#validateInjuryRiskFactorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor#validateInjuryRiskFactorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor#validateInjuryRiskFactorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Risk Factor Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InjuryRiskFactorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryRiskFactorTemplateId() {
		OperationsTestCase<InjuryRiskFactor> validateInjuryRiskFactorTemplateIdTestCase = new OperationsTestCase<InjuryRiskFactor>(
			"validateInjuryRiskFactorTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_RISK_FACTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryRiskFactor target) {

			}

			@Override
			protected void updateToPass(InjuryRiskFactor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryRiskFactorOperations.validateInjuryRiskFactorTemplateId(
					(InjuryRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validateInjuryRiskFactorTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryRiskFactorMoodCode() {
		OperationsTestCase<InjuryRiskFactor> validateInjuryRiskFactorMoodCodeTestCase = new OperationsTestCase<InjuryRiskFactor>(
			"validateInjuryRiskFactorMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_RISK_FACTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryRiskFactor target) {

			}

			@Override
			protected void updateToPass(InjuryRiskFactor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryRiskFactorOperations.validateInjuryRiskFactorMoodCode(
					(InjuryRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validateInjuryRiskFactorMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryRiskFactorCode() {
		OperationsTestCase<InjuryRiskFactor> validateInjuryRiskFactorCodeTestCase = new OperationsTestCase<InjuryRiskFactor>(
			"validateInjuryRiskFactorCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_RISK_FACTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryRiskFactor target) {

			}

			@Override
			protected void updateToPass(InjuryRiskFactor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryRiskFactorOperations.validateInjuryRiskFactorCode(
					(InjuryRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validateInjuryRiskFactorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInjuryRiskFactorValue() {
		OperationsTestCase<InjuryRiskFactor> validateInjuryRiskFactorValueTestCase = new OperationsTestCase<InjuryRiskFactor>(
			"validateInjuryRiskFactorValue",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_RISK_FACTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InjuryRiskFactor target) {

			}

			@Override
			protected void updateToPass(InjuryRiskFactor target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InjuryRiskFactorOperations.validateInjuryRiskFactorValue(
					(InjuryRiskFactor) objectToTest, diagnostician, map);
			}

		};

		validateInjuryRiskFactorValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InjuryRiskFactorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InjuryRiskFactor> {
		public InjuryRiskFactor create() {
			return EmspcrFactory.eINSTANCE.createInjuryRiskFactor();
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
	private static class ConstructorTestClass extends InjuryRiskFactorOperations {
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

} // InjuryRiskFactorOperations
