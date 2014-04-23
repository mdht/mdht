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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.TimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.TimesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Times Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionCallTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Call Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionUnitNotifiedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit Notified Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionUnitEnRouteTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit En Route Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionUnitOnSceneTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit On Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionUnitAtPatienttTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit At Patientt Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionUnitLeftSceneTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit Left Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionPatientArrivedAtDestinationTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Patient Arrived At Destination Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionUnitBackInServiceTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Unit Back In Service Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#validateTimesSectionDispatchNotifiedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Times Section Dispatch Notified Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getCallTime() <em>Get Call Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getUnitNotifiedTime() <em>Get Unit Notified Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getUnitEnRouteTime() <em>Get Unit En Route Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getUnitOnSceneTime() <em>Get Unit On Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getUnitAtPatienttTime() <em>Get Unit At Patientt Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getUnitLeftSceneTime() <em>Get Unit Left Scene Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getPatientArrivedAtDestinationTime() <em>Get Patient Arrived At Destination Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getUnitBackInServiceTime() <em>Get Unit Back In Service Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TimesSection#getDispatchNotifiedTime() <em>Get Dispatch Notified Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TimesSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionTemplateId() {
		OperationsTestCase<TimesSection> validateTimesSectionTemplateIdTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionTemplateId(
					(TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionCode() {
		OperationsTestCase<TimesSection> validateTimesSectionCodeTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionCode((TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionTitle() {
		OperationsTestCase<TimesSection> validateTimesSectionTitleTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionTitle((TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionText() {
		OperationsTestCase<TimesSection> validateTimesSectionTextTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionText",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionText((TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionCallTime() {
		OperationsTestCase<TimesSection> validateTimesSectionCallTimeTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionCallTime",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_CALL_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionCallTime(
					(TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionCallTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionUnitNotifiedTime() {
		OperationsTestCase<TimesSection> validateTimesSectionUnitNotifiedTimeTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionUnitNotifiedTime",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_UNIT_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionUnitNotifiedTime(
					(TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionUnitNotifiedTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionUnitEnRouteTime() {
		OperationsTestCase<TimesSection> validateTimesSectionUnitEnRouteTimeTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionUnitEnRouteTime",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_UNIT_EN_ROUTE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionUnitEnRouteTime(
					(TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionUnitEnRouteTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionUnitOnSceneTime() {
		OperationsTestCase<TimesSection> validateTimesSectionUnitOnSceneTimeTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionUnitOnSceneTime",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_UNIT_ON_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionUnitOnSceneTime(
					(TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionUnitOnSceneTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionUnitAtPatienttTime() {
		OperationsTestCase<TimesSection> validateTimesSectionUnitAtPatienttTimeTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionUnitAtPatienttTime",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_UNIT_AT_PATIENTT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionUnitAtPatienttTime(
					(TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionUnitAtPatienttTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionUnitLeftSceneTime() {
		OperationsTestCase<TimesSection> validateTimesSectionUnitLeftSceneTimeTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionUnitLeftSceneTime",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_UNIT_LEFT_SCENE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionUnitLeftSceneTime(
					(TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionUnitLeftSceneTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionPatientArrivedAtDestinationTime() {
		OperationsTestCase<TimesSection> validateTimesSectionPatientArrivedAtDestinationTimeTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionPatientArrivedAtDestinationTime",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_PATIENT_ARRIVED_AT_DESTINATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionPatientArrivedAtDestinationTime(
					(TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionPatientArrivedAtDestinationTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionUnitBackInServiceTime() {
		OperationsTestCase<TimesSection> validateTimesSectionUnitBackInServiceTimeTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionUnitBackInServiceTime",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_UNIT_BACK_IN_SERVICE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionUnitBackInServiceTime(
					(TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionUnitBackInServiceTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTimesSectionDispatchNotifiedTime() {
		OperationsTestCase<TimesSection> validateTimesSectionDispatchNotifiedTimeTestCase = new OperationsTestCase<TimesSection>(
			"validateTimesSectionDispatchNotifiedTime",
			operationsForOCL.getOCLValue("VALIDATE_TIMES_SECTION_DISPATCH_NOTIFIED_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TimesSection target) {

			}

			@Override
			protected void updateToPass(TimesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TimesSectionOperations.validateTimesSectionDispatchNotifiedTime(
					(TimesSection) objectToTest, diagnostician, map);
			}

		};

		validateTimesSectionDispatchNotifiedTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCallTime() {

		TimesSection target = objectFactory.create();
		target.getCallTime();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetUnitNotifiedTime() {

		TimesSection target = objectFactory.create();
		target.getUnitNotifiedTime();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetUnitEnRouteTime() {

		TimesSection target = objectFactory.create();
		target.getUnitEnRouteTime();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetUnitOnSceneTime() {

		TimesSection target = objectFactory.create();
		target.getUnitOnSceneTime();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetUnitAtPatienttTime() {

		TimesSection target = objectFactory.create();
		target.getUnitAtPatienttTime();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetUnitLeftSceneTime() {

		TimesSection target = objectFactory.create();
		target.getUnitLeftSceneTime();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientArrivedAtDestinationTime() {

		TimesSection target = objectFactory.create();
		target.getPatientArrivedAtDestinationTime();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetUnitBackInServiceTime() {

		TimesSection target = objectFactory.create();
		target.getUnitBackInServiceTime();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDispatchNotifiedTime() {

		TimesSection target = objectFactory.create();
		target.getDispatchNotifiedTime();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TimesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TimesSection> {
		public TimesSection create() {
			return EmspcrFactory.eINSTANCE.createTimesSection();
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
	private static class ConstructorTestClass extends TimesSectionOperations {
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

} // TimesSectionOperations
