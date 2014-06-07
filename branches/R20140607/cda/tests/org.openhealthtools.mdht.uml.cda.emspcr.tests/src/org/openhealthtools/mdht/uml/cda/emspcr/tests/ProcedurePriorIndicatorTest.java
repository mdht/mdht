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
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedurePriorIndicatorOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Prior Indicator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator#validateProcedurePriorIndicatorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator#validateProcedurePriorIndicatorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator#validateProcedurePriorIndicatorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator#validateProcedurePriorIndicatorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator#validateProcedurePriorIndicatorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Indicator Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedurePriorIndicatorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedurePriorIndicatorTemplateId() {
		OperationsTestCase<ProcedurePriorIndicator> validateProcedurePriorIndicatorTemplateIdTestCase = new OperationsTestCase<ProcedurePriorIndicator>(
			"validateProcedurePriorIndicatorTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PRIOR_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePriorIndicator target) {

			}

			@Override
			protected void updateToPass(ProcedurePriorIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePriorIndicatorOperations.validateProcedurePriorIndicatorTemplateId(
					(ProcedurePriorIndicator) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePriorIndicatorTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedurePriorIndicatorMoodCode() {
		OperationsTestCase<ProcedurePriorIndicator> validateProcedurePriorIndicatorMoodCodeTestCase = new OperationsTestCase<ProcedurePriorIndicator>(
			"validateProcedurePriorIndicatorMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PRIOR_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePriorIndicator target) {

			}

			@Override
			protected void updateToPass(ProcedurePriorIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePriorIndicatorOperations.validateProcedurePriorIndicatorMoodCode(
					(ProcedurePriorIndicator) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePriorIndicatorMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedurePriorIndicatorCodeP() {
		OperationsTestCase<ProcedurePriorIndicator> validateProcedurePriorIndicatorCodePTestCase = new OperationsTestCase<ProcedurePriorIndicator>(
			"validateProcedurePriorIndicatorCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePriorIndicator target) {

			}

			@Override
			protected void updateToPass(ProcedurePriorIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePriorIndicatorOperations.validateProcedurePriorIndicatorCodeP(
					(ProcedurePriorIndicator) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePriorIndicatorCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedurePriorIndicatorCode() {
		OperationsTestCase<ProcedurePriorIndicator> validateProcedurePriorIndicatorCodeTestCase = new OperationsTestCase<ProcedurePriorIndicator>(
			"validateProcedurePriorIndicatorCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PRIOR_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePriorIndicator target) {

			}

			@Override
			protected void updateToPass(ProcedurePriorIndicator target) {
				target.init();

			}

			@Override
			protected void setDependency(ProcedurePriorIndicator target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicatorCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePriorIndicatorOperations.validateProcedurePriorIndicatorCode(
					(ProcedurePriorIndicator) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePriorIndicatorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedurePriorIndicatorValue() {
		OperationsTestCase<ProcedurePriorIndicator> validateProcedurePriorIndicatorValueTestCase = new OperationsTestCase<ProcedurePriorIndicator>(
			"validateProcedurePriorIndicatorValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PRIOR_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePriorIndicator target) {

			}

			@Override
			protected void updateToPass(ProcedurePriorIndicator target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePriorIndicatorOperations.validateProcedurePriorIndicatorValue(
					(ProcedurePriorIndicator) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePriorIndicatorValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedurePriorIndicatorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedurePriorIndicator> {
		public ProcedurePriorIndicator create() {
			return EmspcrFactory.eINSTANCE.createProcedurePriorIndicator();
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
	private static class ConstructorTestClass extends ProcedurePriorIndicatorOperations {
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

} // ProcedurePriorIndicatorOperations
