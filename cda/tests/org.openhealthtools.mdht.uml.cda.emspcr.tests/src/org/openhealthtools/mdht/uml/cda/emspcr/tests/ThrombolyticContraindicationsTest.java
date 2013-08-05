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
import org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ThrombolyticContraindicationsOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Thrombolytic Contraindications</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications#validateThrombolyticContraindicationsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications#validateThrombolyticContraindicationsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications#validateThrombolyticContraindicationsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications#validateThrombolyticContraindicationsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications#validateThrombolyticContraindicationsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ThrombolyticContraindicationsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateThrombolyticContraindicationsTemplateId() {
		OperationsTestCase<ThrombolyticContraindications> validateThrombolyticContraindicationsTemplateIdTestCase = new OperationsTestCase<ThrombolyticContraindications>(
			"validateThrombolyticContraindicationsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ThrombolyticContraindications target) {

			}

			@Override
			protected void updateToPass(ThrombolyticContraindications target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ThrombolyticContraindicationsOperations.validateThrombolyticContraindicationsTemplateId(
					(ThrombolyticContraindications) objectToTest, diagnostician, map);
			}

		};

		validateThrombolyticContraindicationsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateThrombolyticContraindicationsCodeP() {
		OperationsTestCase<ThrombolyticContraindications> validateThrombolyticContraindicationsCodePTestCase = new OperationsTestCase<ThrombolyticContraindications>(
			"validateThrombolyticContraindicationsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ThrombolyticContraindications target) {

			}

			@Override
			protected void updateToPass(ThrombolyticContraindications target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ThrombolyticContraindicationsOperations.validateThrombolyticContraindicationsCodeP(
					(ThrombolyticContraindications) objectToTest, diagnostician, map);
			}

		};

		validateThrombolyticContraindicationsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateThrombolyticContraindicationsCode() {
		OperationsTestCase<ThrombolyticContraindications> validateThrombolyticContraindicationsCodeTestCase = new OperationsTestCase<ThrombolyticContraindications>(
			"validateThrombolyticContraindicationsCode",
			operationsForOCL.getOCLValue("VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ThrombolyticContraindications target) {

			}

			@Override
			protected void updateToPass(ThrombolyticContraindications target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ThrombolyticContraindicationsOperations.validateThrombolyticContraindicationsCode(
					(ThrombolyticContraindications) objectToTest, diagnostician, map);
			}

		};

		validateThrombolyticContraindicationsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateThrombolyticContraindicationsValue() {
		OperationsTestCase<ThrombolyticContraindications> validateThrombolyticContraindicationsValueTestCase = new OperationsTestCase<ThrombolyticContraindications>(
			"validateThrombolyticContraindicationsValue",
			operationsForOCL.getOCLValue("VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ThrombolyticContraindications target) {

			}

			@Override
			protected void updateToPass(ThrombolyticContraindications target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ThrombolyticContraindicationsOperations.validateThrombolyticContraindicationsValue(
					(ThrombolyticContraindications) objectToTest, diagnostician, map);
			}

		};

		validateThrombolyticContraindicationsValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateThrombolyticContraindicationsMoodCode() {
		OperationsTestCase<ThrombolyticContraindications> validateThrombolyticContraindicationsMoodCodeTestCase = new OperationsTestCase<ThrombolyticContraindications>(
			"validateThrombolyticContraindicationsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ThrombolyticContraindications target) {

			}

			@Override
			protected void updateToPass(ThrombolyticContraindications target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ThrombolyticContraindicationsOperations.validateThrombolyticContraindicationsMoodCode(
					(ThrombolyticContraindications) objectToTest, diagnostician, map);
			}

		};

		validateThrombolyticContraindicationsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ThrombolyticContraindicationsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ThrombolyticContraindications> {
		public ThrombolyticContraindications create() {
			return EmspcrFactory.eINSTANCE.createThrombolyticContraindications();
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
	private static class ConstructorTestClass extends ThrombolyticContraindicationsOperations {
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

} // ThrombolyticContraindicationsOperations
