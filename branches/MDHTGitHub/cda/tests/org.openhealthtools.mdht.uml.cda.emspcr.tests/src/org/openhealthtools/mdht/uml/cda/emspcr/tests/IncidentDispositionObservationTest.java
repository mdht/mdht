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
import org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.IncidentDispositionObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Incident Disposition Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation#validateIncidentDispositionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation#validateIncidentDispositionObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation#validateIncidentDispositionObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation#validateIncidentDispositionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation#validateIncidentDispositionObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservation#validateIncidentDispositionObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Incident Disposition Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class IncidentDispositionObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIncidentDispositionObservationTemplateId() {
		OperationsTestCase<IncidentDispositionObservation> validateIncidentDispositionObservationTemplateIdTestCase = new OperationsTestCase<IncidentDispositionObservation>(
			"validateIncidentDispositionObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IncidentDispositionObservation target) {

			}

			@Override
			protected void updateToPass(IncidentDispositionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IncidentDispositionObservationOperations.validateIncidentDispositionObservationTemplateId(
					(IncidentDispositionObservation) objectToTest, diagnostician, map);
			}

		};

		validateIncidentDispositionObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIncidentDispositionObservationMoodCode() {
		OperationsTestCase<IncidentDispositionObservation> validateIncidentDispositionObservationMoodCodeTestCase = new OperationsTestCase<IncidentDispositionObservation>(
			"validateIncidentDispositionObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IncidentDispositionObservation target) {

			}

			@Override
			protected void updateToPass(IncidentDispositionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IncidentDispositionObservationOperations.validateIncidentDispositionObservationMoodCode(
					(IncidentDispositionObservation) objectToTest, diagnostician, map);
			}

		};

		validateIncidentDispositionObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIncidentDispositionObservationCodeP() {
		OperationsTestCase<IncidentDispositionObservation> validateIncidentDispositionObservationCodePTestCase = new OperationsTestCase<IncidentDispositionObservation>(
			"validateIncidentDispositionObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IncidentDispositionObservation target) {

			}

			@Override
			protected void updateToPass(IncidentDispositionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IncidentDispositionObservationOperations.validateIncidentDispositionObservationCodeP(
					(IncidentDispositionObservation) objectToTest, diagnostician, map);
			}

		};

		validateIncidentDispositionObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIncidentDispositionObservationCode() {
		OperationsTestCase<IncidentDispositionObservation> validateIncidentDispositionObservationCodeTestCase = new OperationsTestCase<IncidentDispositionObservation>(
			"validateIncidentDispositionObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IncidentDispositionObservation target) {

			}

			@Override
			protected void updateToPass(IncidentDispositionObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(IncidentDispositionObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.IncidentDispositionObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IncidentDispositionObservationOperations.validateIncidentDispositionObservationCode(
					(IncidentDispositionObservation) objectToTest, diagnostician, map);
			}

		};

		validateIncidentDispositionObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIncidentDispositionObservationValue() {
		OperationsTestCase<IncidentDispositionObservation> validateIncidentDispositionObservationValueTestCase = new OperationsTestCase<IncidentDispositionObservation>(
			"validateIncidentDispositionObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IncidentDispositionObservation target) {

			}

			@Override
			protected void updateToPass(IncidentDispositionObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IncidentDispositionObservationOperations.validateIncidentDispositionObservationValue(
					(IncidentDispositionObservation) objectToTest, diagnostician, map);
			}

		};

		validateIncidentDispositionObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIncidentDispositionObservationValueP() {
		OperationsTestCase<IncidentDispositionObservation> validateIncidentDispositionObservationValuePTestCase = new OperationsTestCase<IncidentDispositionObservation>(
			"validateIncidentDispositionObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_INCIDENT_DISPOSITION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IncidentDispositionObservation target) {

			}

			@Override
			protected void updateToPass(IncidentDispositionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IncidentDispositionObservationOperations.validateIncidentDispositionObservationValueP(
					(IncidentDispositionObservation) objectToTest, diagnostician, map);
			}

		};

		validateIncidentDispositionObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends IncidentDispositionObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<IncidentDispositionObservation> {
		public IncidentDispositionObservation create() {
			return EmspcrFactory.eINSTANCE.createIncidentDispositionObservation();
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
	private static class ConstructorTestClass extends IncidentDispositionObservationOperations {
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

} // IncidentDispositionObservationOperations
