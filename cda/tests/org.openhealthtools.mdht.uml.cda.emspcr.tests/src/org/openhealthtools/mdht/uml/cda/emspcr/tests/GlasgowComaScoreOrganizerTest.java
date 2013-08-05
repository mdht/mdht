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
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.GlasgowComaScoreOrganizerOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Glasgow Coma Score Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerGlasgowEye(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Eye</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerGlasgowMotor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Motor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerGlasgowQualifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerGlasgowTotal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Total</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerGlasgowVerbal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Glasgow Verbal</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#getGlasgowEye() <em>Get Glasgow Eye</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#getGlasgowMotor() <em>Get Glasgow Motor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#getGlasgowQualifier() <em>Get Glasgow Qualifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#getGlasgowTotal() <em>Get Glasgow Total</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#getGlasgowVerbal() <em>Get Glasgow Verbal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GlasgowComaScoreOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowComaScoreOrganizerGlasgowEye() {
		OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerGlasgowEyeTestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerGlasgowEye",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_EYE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerGlasgowEye(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerGlasgowEyeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowComaScoreOrganizerGlasgowMotor() {
		OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerGlasgowMotorTestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerGlasgowMotor",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_MOTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerGlasgowMotor(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerGlasgowMotorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowComaScoreOrganizerGlasgowQualifier() {
		OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerGlasgowQualifierTestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerGlasgowQualifier",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_QUALIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerGlasgowQualifier(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerGlasgowQualifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowComaScoreOrganizerGlasgowTotal() {
		OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerGlasgowTotalTestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerGlasgowTotal",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_TOTAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerGlasgowTotal(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerGlasgowTotalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowComaScoreOrganizerGlasgowVerbal() {
		OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerGlasgowVerbalTestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerGlasgowVerbal",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_GLASGOW_VERBAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerGlasgowVerbal(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerGlasgowVerbalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowComaScoreOrganizerTemplateId() {
		OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerTemplateIdTestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerTemplateId(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowComaScoreOrganizerEffectiveTime() {
		OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerEffectiveTimeTestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerEffectiveTime(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGlasgowEye() {

		GlasgowComaScoreOrganizer target = objectFactory.create();
		target.getGlasgowEye();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGlasgowMotor() {

		GlasgowComaScoreOrganizer target = objectFactory.create();
		target.getGlasgowMotor();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGlasgowQualifier() {

		GlasgowComaScoreOrganizer target = objectFactory.create();
		target.getGlasgowQualifier();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGlasgowTotal() {

		GlasgowComaScoreOrganizer target = objectFactory.create();
		target.getGlasgowTotal();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGlasgowVerbal() {

		GlasgowComaScoreOrganizer target = objectFactory.create();
		target.getGlasgowVerbal();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GlasgowComaScoreOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GlasgowComaScoreOrganizer> {
		public GlasgowComaScoreOrganizer create() {
			return EmspcrFactory.eINSTANCE.createGlasgowComaScoreOrganizer();
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
	private static class ConstructorTestClass extends GlasgowComaScoreOrganizerOperations {
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

} // GlasgowComaScoreOrganizerOperations
