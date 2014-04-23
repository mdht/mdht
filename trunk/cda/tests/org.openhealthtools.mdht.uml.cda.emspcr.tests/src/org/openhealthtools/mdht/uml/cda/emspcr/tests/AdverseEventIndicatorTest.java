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
import org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.AdverseEventIndicatorOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Adverse Event Indicator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator#validateAdverseEventIndicatorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator#validateAdverseEventIndicatorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator#validateAdverseEventIndicatorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator#validateAdverseEventIndicatorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicator#validateAdverseEventIndicatorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Adverse Event Indicator Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdverseEventIndicatorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdverseEventIndicatorTemplateId() {
		OperationsTestCase<AdverseEventIndicator> validateAdverseEventIndicatorTemplateIdTestCase = new OperationsTestCase<AdverseEventIndicator>(
			"validateAdverseEventIndicatorTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdverseEventIndicator target) {

			}

			@Override
			protected void updateToPass(AdverseEventIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdverseEventIndicatorOperations.validateAdverseEventIndicatorTemplateId(
					(AdverseEventIndicator) objectToTest, diagnostician, map);
			}

		};

		validateAdverseEventIndicatorTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdverseEventIndicatorMoodCode() {
		OperationsTestCase<AdverseEventIndicator> validateAdverseEventIndicatorMoodCodeTestCase = new OperationsTestCase<AdverseEventIndicator>(
			"validateAdverseEventIndicatorMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdverseEventIndicator target) {

			}

			@Override
			protected void updateToPass(AdverseEventIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdverseEventIndicatorOperations.validateAdverseEventIndicatorMoodCode(
					(AdverseEventIndicator) objectToTest, diagnostician, map);
			}

		};

		validateAdverseEventIndicatorMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdverseEventIndicatorCodeP() {
		OperationsTestCase<AdverseEventIndicator> validateAdverseEventIndicatorCodePTestCase = new OperationsTestCase<AdverseEventIndicator>(
			"validateAdverseEventIndicatorCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdverseEventIndicator target) {

			}

			@Override
			protected void updateToPass(AdverseEventIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdverseEventIndicatorOperations.validateAdverseEventIndicatorCodeP(
					(AdverseEventIndicator) objectToTest, diagnostician, map);
			}

		};

		validateAdverseEventIndicatorCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdverseEventIndicatorCode() {
		OperationsTestCase<AdverseEventIndicator> validateAdverseEventIndicatorCodeTestCase = new OperationsTestCase<AdverseEventIndicator>(
			"validateAdverseEventIndicatorCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdverseEventIndicator target) {

			}

			@Override
			protected void updateToPass(AdverseEventIndicator target) {
				target.init();

			}

			@Override
			protected void setDependency(AdverseEventIndicator target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.AdverseEventIndicatorCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdverseEventIndicatorOperations.validateAdverseEventIndicatorCode(
					(AdverseEventIndicator) objectToTest, diagnostician, map);
			}

		};

		validateAdverseEventIndicatorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdverseEventIndicatorValue() {
		OperationsTestCase<AdverseEventIndicator> validateAdverseEventIndicatorValueTestCase = new OperationsTestCase<AdverseEventIndicator>(
			"validateAdverseEventIndicatorValue",
			operationsForOCL.getOCLValue("VALIDATE_ADVERSE_EVENT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdverseEventIndicator target) {

			}

			@Override
			protected void updateToPass(AdverseEventIndicator target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdverseEventIndicatorOperations.validateAdverseEventIndicatorValue(
					(AdverseEventIndicator) objectToTest, diagnostician, map);
			}

		};

		validateAdverseEventIndicatorValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdverseEventIndicatorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdverseEventIndicator> {
		public AdverseEventIndicator create() {
			return EmspcrFactory.eINSTANCE.createAdverseEventIndicator();
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
	private static class ConstructorTestClass extends AdverseEventIndicatorOperations {
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

} // AdverseEventIndicatorOperations
