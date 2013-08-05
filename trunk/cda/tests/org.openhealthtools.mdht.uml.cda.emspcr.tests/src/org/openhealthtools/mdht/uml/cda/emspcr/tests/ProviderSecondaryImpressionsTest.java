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
import org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProviderSecondaryImpressionsOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provider Secondary Impressions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions#validateProviderSecondaryImpressionsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions#validateProviderSecondaryImpressionsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions#validateProviderSecondaryImpressionsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions#validateProviderSecondaryImpressionsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions#validateProviderSecondaryImpressionsValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProviderSecondaryImpressions#validateProviderSecondaryImpressionsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Secondary Impressions Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProviderSecondaryImpressionsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderSecondaryImpressionsTemplateId() {
		OperationsTestCase<ProviderSecondaryImpressions> validateProviderSecondaryImpressionsTemplateIdTestCase = new OperationsTestCase<ProviderSecondaryImpressions>(
			"validateProviderSecondaryImpressionsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderSecondaryImpressions target) {

			}

			@Override
			protected void updateToPass(ProviderSecondaryImpressions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderSecondaryImpressionsOperations.validateProviderSecondaryImpressionsTemplateId(
					(ProviderSecondaryImpressions) objectToTest, diagnostician, map);
			}

		};

		validateProviderSecondaryImpressionsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderSecondaryImpressionsCodeP() {
		OperationsTestCase<ProviderSecondaryImpressions> validateProviderSecondaryImpressionsCodePTestCase = new OperationsTestCase<ProviderSecondaryImpressions>(
			"validateProviderSecondaryImpressionsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderSecondaryImpressions target) {

			}

			@Override
			protected void updateToPass(ProviderSecondaryImpressions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderSecondaryImpressionsOperations.validateProviderSecondaryImpressionsCodeP(
					(ProviderSecondaryImpressions) objectToTest, diagnostician, map);
			}

		};

		validateProviderSecondaryImpressionsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderSecondaryImpressionsCode() {
		OperationsTestCase<ProviderSecondaryImpressions> validateProviderSecondaryImpressionsCodeTestCase = new OperationsTestCase<ProviderSecondaryImpressions>(
			"validateProviderSecondaryImpressionsCode",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderSecondaryImpressions target) {

			}

			@Override
			protected void updateToPass(ProviderSecondaryImpressions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderSecondaryImpressionsOperations.validateProviderSecondaryImpressionsCode(
					(ProviderSecondaryImpressions) objectToTest, diagnostician, map);
			}

		};

		validateProviderSecondaryImpressionsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderSecondaryImpressionsValue() {
		OperationsTestCase<ProviderSecondaryImpressions> validateProviderSecondaryImpressionsValueTestCase = new OperationsTestCase<ProviderSecondaryImpressions>(
			"validateProviderSecondaryImpressionsValue",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderSecondaryImpressions target) {

			}

			@Override
			protected void updateToPass(ProviderSecondaryImpressions target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderSecondaryImpressionsOperations.validateProviderSecondaryImpressionsValue(
					(ProviderSecondaryImpressions) objectToTest, diagnostician, map);
			}

		};

		validateProviderSecondaryImpressionsValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderSecondaryImpressionsValueP() {
		OperationsTestCase<ProviderSecondaryImpressions> validateProviderSecondaryImpressionsValuePTestCase = new OperationsTestCase<ProviderSecondaryImpressions>(
			"validateProviderSecondaryImpressionsValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderSecondaryImpressions target) {

			}

			@Override
			protected void updateToPass(ProviderSecondaryImpressions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderSecondaryImpressionsOperations.validateProviderSecondaryImpressionsValueP(
					(ProviderSecondaryImpressions) objectToTest, diagnostician, map);
			}

		};

		validateProviderSecondaryImpressionsValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderSecondaryImpressionsMoodCode() {
		OperationsTestCase<ProviderSecondaryImpressions> validateProviderSecondaryImpressionsMoodCodeTestCase = new OperationsTestCase<ProviderSecondaryImpressions>(
			"validateProviderSecondaryImpressionsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_SECONDARY_IMPRESSIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderSecondaryImpressions target) {

			}

			@Override
			protected void updateToPass(ProviderSecondaryImpressions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderSecondaryImpressionsOperations.validateProviderSecondaryImpressionsMoodCode(
					(ProviderSecondaryImpressions) objectToTest, diagnostician, map);
			}

		};

		validateProviderSecondaryImpressionsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProviderSecondaryImpressionsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProviderSecondaryImpressions> {
		public ProviderSecondaryImpressions create() {
			return EmspcrFactory.eINSTANCE.createProviderSecondaryImpressions();
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
	private static class ConstructorTestClass extends ProviderSecondaryImpressionsOperations {
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

} // ProviderSecondaryImpressionsOperations
