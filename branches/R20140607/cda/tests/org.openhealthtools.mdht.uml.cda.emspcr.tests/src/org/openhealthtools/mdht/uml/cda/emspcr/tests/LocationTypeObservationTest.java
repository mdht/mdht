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
import org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.LocationTypeObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Location Type Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation#validateLocationTypeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Type Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation#validateLocationTypeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Type Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation#validateLocationTypeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Type Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LocationTypeObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLocationTypeObservationTemplateId() {
		OperationsTestCase<LocationTypeObservation> validateLocationTypeObservationTemplateIdTestCase = new OperationsTestCase<LocationTypeObservation>(
			"validateLocationTypeObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_LOCATION_TYPE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LocationTypeObservation target) {

			}

			@Override
			protected void updateToPass(LocationTypeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LocationTypeObservationOperations.validateLocationTypeObservationTemplateId(
					(LocationTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateLocationTypeObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLocationTypeObservationCode() {
		OperationsTestCase<LocationTypeObservation> validateLocationTypeObservationCodeTestCase = new OperationsTestCase<LocationTypeObservation>(
			"validateLocationTypeObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_LOCATION_TYPE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LocationTypeObservation target) {

			}

			@Override
			protected void updateToPass(LocationTypeObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LocationTypeObservationOperations.validateLocationTypeObservationCode(
					(LocationTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateLocationTypeObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLocationTypeObservationValue() {
		OperationsTestCase<LocationTypeObservation> validateLocationTypeObservationValueTestCase = new OperationsTestCase<LocationTypeObservation>(
			"validateLocationTypeObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_LOCATION_TYPE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LocationTypeObservation target) {

			}

			@Override
			protected void updateToPass(LocationTypeObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LocationTypeObservationOperations.validateLocationTypeObservationValue(
					(LocationTypeObservation) objectToTest, diagnostician, map);
			}

		};

		validateLocationTypeObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LocationTypeObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LocationTypeObservation> {
		public LocationTypeObservation create() {
			return EmspcrFactory.eINSTANCE.createLocationTypeObservation();
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
	private static class ConstructorTestClass extends LocationTypeObservationOperations {
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

} // LocationTypeObservationOperations
