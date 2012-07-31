/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.operations.GeotemporalHistoryObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Geotemporal History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation#validateGeotemporalHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Geotemporal History Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeotemporalHistoryObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeotemporalHistoryObservationTemplateId() {
		OperationsTestCase<GeotemporalHistoryObservation> validateGeotemporalHistoryObservationTemplateIdTestCase = new OperationsTestCase<GeotemporalHistoryObservation>(
			"validateGeotemporalHistoryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeotemporalHistoryObservation target) {

			}

			@Override
			protected void updateToPass(GeotemporalHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationTemplateId(
					(GeotemporalHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateGeotemporalHistoryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeotemporalHistoryObservationClassCode() {
		OperationsTestCase<GeotemporalHistoryObservation> validateGeotemporalHistoryObservationClassCodeTestCase = new OperationsTestCase<GeotemporalHistoryObservation>(
			"validateGeotemporalHistoryObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeotemporalHistoryObservation target) {

			}

			@Override
			protected void updateToPass(GeotemporalHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationClassCode(
					(GeotemporalHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateGeotemporalHistoryObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeotemporalHistoryObservationMoodCode() {
		OperationsTestCase<GeotemporalHistoryObservation> validateGeotemporalHistoryObservationMoodCodeTestCase = new OperationsTestCase<GeotemporalHistoryObservation>(
			"validateGeotemporalHistoryObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeotemporalHistoryObservation target) {

			}

			@Override
			protected void updateToPass(GeotemporalHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationMoodCode(
					(GeotemporalHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateGeotemporalHistoryObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeotemporalHistoryObservationCodeP() {
		OperationsTestCase<GeotemporalHistoryObservation> validateGeotemporalHistoryObservationCodePTestCase = new OperationsTestCase<GeotemporalHistoryObservation>(
			"validateGeotemporalHistoryObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeotemporalHistoryObservation target) {

			}

			@Override
			protected void updateToPass(GeotemporalHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationCodeP(
					(GeotemporalHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateGeotemporalHistoryObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeotemporalHistoryObservationCode() {
		OperationsTestCase<GeotemporalHistoryObservation> validateGeotemporalHistoryObservationCodeTestCase = new OperationsTestCase<GeotemporalHistoryObservation>(
			"validateGeotemporalHistoryObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeotemporalHistoryObservation target) {

			}

			@Override
			protected void updateToPass(GeotemporalHistoryObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationCode(
					(GeotemporalHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateGeotemporalHistoryObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeotemporalHistoryObservationText() {
		OperationsTestCase<GeotemporalHistoryObservation> validateGeotemporalHistoryObservationTextTestCase = new OperationsTestCase<GeotemporalHistoryObservation>(
			"validateGeotemporalHistoryObservationText",
			operationsForOCL.getOCLValue("VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeotemporalHistoryObservation target) {

			}

			@Override
			protected void updateToPass(GeotemporalHistoryObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationText(
					(GeotemporalHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateGeotemporalHistoryObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeotemporalHistoryObservationStatusCode() {
		OperationsTestCase<GeotemporalHistoryObservation> validateGeotemporalHistoryObservationStatusCodeTestCase = new OperationsTestCase<GeotemporalHistoryObservation>(
			"validateGeotemporalHistoryObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeotemporalHistoryObservation target) {

			}

			@Override
			protected void updateToPass(GeotemporalHistoryObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationStatusCode(
					(GeotemporalHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateGeotemporalHistoryObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeotemporalHistoryObservationStatusCodeP() {
		OperationsTestCase<GeotemporalHistoryObservation> validateGeotemporalHistoryObservationStatusCodePTestCase = new OperationsTestCase<GeotemporalHistoryObservation>(
			"validateGeotemporalHistoryObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeotemporalHistoryObservation target) {

			}

			@Override
			protected void updateToPass(GeotemporalHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationStatusCodeP(
					(GeotemporalHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateGeotemporalHistoryObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeotemporalHistoryObservationEffectiveTime() {
		OperationsTestCase<GeotemporalHistoryObservation> validateGeotemporalHistoryObservationEffectiveTimeTestCase = new OperationsTestCase<GeotemporalHistoryObservation>(
			"validateGeotemporalHistoryObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeotemporalHistoryObservation target) {

			}

			@Override
			protected void updateToPass(GeotemporalHistoryObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationEffectiveTime(
					(GeotemporalHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateGeotemporalHistoryObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeotemporalHistoryObservationValue() {
		OperationsTestCase<GeotemporalHistoryObservation> validateGeotemporalHistoryObservationValueTestCase = new OperationsTestCase<GeotemporalHistoryObservation>(
			"validateGeotemporalHistoryObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_GEOTEMPORAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeotemporalHistoryObservation target) {

			}

			@Override
			protected void updateToPass(GeotemporalHistoryObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeotemporalHistoryObservationOperations.validateGeotemporalHistoryObservationValue(
					(GeotemporalHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateGeotemporalHistoryObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GeotemporalHistoryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GeotemporalHistoryObservation> {
		public GeotemporalHistoryObservation create() {
			return PhcrFactory.eINSTANCE.createGeotemporalHistoryObservation();
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
	private static class ConstructorTestClass extends GeotemporalHistoryObservationOperations {
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

} // GeotemporalHistoryObservationOperations
