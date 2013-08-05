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
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProviderPrimaryImpressionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provider Primary Impression</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression#validateProviderPrimaryImpressionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression#validateProviderPrimaryImpressionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression#validateProviderPrimaryImpressionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression#validateProviderPrimaryImpressionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression#validateProviderPrimaryImpressionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderPrimaryImpression#validateProviderPrimaryImpressionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Primary Impression Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProviderPrimaryImpressionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderPrimaryImpressionTemplateId() {
		OperationsTestCase<ProviderPrimaryImpression> validateProviderPrimaryImpressionTemplateIdTestCase = new OperationsTestCase<ProviderPrimaryImpression>(
			"validateProviderPrimaryImpressionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIMARY_IMPRESSION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPrimaryImpression target) {

			}

			@Override
			protected void updateToPass(ProviderPrimaryImpression target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPrimaryImpressionOperations.validateProviderPrimaryImpressionTemplateId(
					(ProviderPrimaryImpression) objectToTest, diagnostician, map);
			}

		};

		validateProviderPrimaryImpressionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderPrimaryImpressionCodeP() {
		OperationsTestCase<ProviderPrimaryImpression> validateProviderPrimaryImpressionCodePTestCase = new OperationsTestCase<ProviderPrimaryImpression>(
			"validateProviderPrimaryImpressionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPrimaryImpression target) {

			}

			@Override
			protected void updateToPass(ProviderPrimaryImpression target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPrimaryImpressionOperations.validateProviderPrimaryImpressionCodeP(
					(ProviderPrimaryImpression) objectToTest, diagnostician, map);
			}

		};

		validateProviderPrimaryImpressionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderPrimaryImpressionCode() {
		OperationsTestCase<ProviderPrimaryImpression> validateProviderPrimaryImpressionCodeTestCase = new OperationsTestCase<ProviderPrimaryImpression>(
			"validateProviderPrimaryImpressionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIMARY_IMPRESSION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPrimaryImpression target) {

			}

			@Override
			protected void updateToPass(ProviderPrimaryImpression target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPrimaryImpressionOperations.validateProviderPrimaryImpressionCode(
					(ProviderPrimaryImpression) objectToTest, diagnostician, map);
			}

		};

		validateProviderPrimaryImpressionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderPrimaryImpressionValue() {
		OperationsTestCase<ProviderPrimaryImpression> validateProviderPrimaryImpressionValueTestCase = new OperationsTestCase<ProviderPrimaryImpression>(
			"validateProviderPrimaryImpressionValue",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPrimaryImpression target) {

			}

			@Override
			protected void updateToPass(ProviderPrimaryImpression target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPrimaryImpressionOperations.validateProviderPrimaryImpressionValue(
					(ProviderPrimaryImpression) objectToTest, diagnostician, map);
			}

		};

		validateProviderPrimaryImpressionValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderPrimaryImpressionValueP() {
		OperationsTestCase<ProviderPrimaryImpression> validateProviderPrimaryImpressionValuePTestCase = new OperationsTestCase<ProviderPrimaryImpression>(
			"validateProviderPrimaryImpressionValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIMARY_IMPRESSION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPrimaryImpression target) {

			}

			@Override
			protected void updateToPass(ProviderPrimaryImpression target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPrimaryImpressionOperations.validateProviderPrimaryImpressionValueP(
					(ProviderPrimaryImpression) objectToTest, diagnostician, map);
			}

		};

		validateProviderPrimaryImpressionValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderPrimaryImpressionMoodCode() {
		OperationsTestCase<ProviderPrimaryImpression> validateProviderPrimaryImpressionMoodCodeTestCase = new OperationsTestCase<ProviderPrimaryImpression>(
			"validateProviderPrimaryImpressionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_PRIMARY_IMPRESSION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderPrimaryImpression target) {

			}

			@Override
			protected void updateToPass(ProviderPrimaryImpression target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderPrimaryImpressionOperations.validateProviderPrimaryImpressionMoodCode(
					(ProviderPrimaryImpression) objectToTest, diagnostician, map);
			}

		};

		validateProviderPrimaryImpressionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProviderPrimaryImpressionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProviderPrimaryImpression> {
		public ProviderPrimaryImpression create() {
			return EmspcrFactory.eINSTANCE.createProviderPrimaryImpression();
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
	private static class ConstructorTestClass extends ProviderPrimaryImpressionOperations {
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

} // ProviderPrimaryImpressionOperations
