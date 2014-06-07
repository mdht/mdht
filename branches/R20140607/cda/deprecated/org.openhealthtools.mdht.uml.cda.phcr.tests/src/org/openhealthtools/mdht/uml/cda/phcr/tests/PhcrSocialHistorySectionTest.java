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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrSocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionGeotemporalHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Geotemporal History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Most Recent Time Arrived In USA Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionRaceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Race Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionOccupationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Occupation Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionPregnancyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Pregnancy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#getGeotemporalHistoryObservations() <em>Get Geotemporal History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#getMostRecentTimeArrivedInUSAObservation() <em>Get Most Recent Time Arrived In USA Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#getRaceObservations() <em>Get Race Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#getOccupationObservations() <em>Get Occupation Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#getPregnancyObservations() <em>Get Pregnancy Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validateSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhcrSocialHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrSocialHistorySectionCode() {
		OperationsTestCase<PhcrSocialHistorySection> validatePhcrSocialHistorySectionCodeTestCase = new OperationsTestCase<PhcrSocialHistorySection>(
			"validatePhcrSocialHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(PhcrSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionCode(
					(PhcrSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrSocialHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrSocialHistorySectionTitle() {
		OperationsTestCase<PhcrSocialHistorySection> validatePhcrSocialHistorySectionTitleTestCase = new OperationsTestCase<PhcrSocialHistorySection>(
			"validatePhcrSocialHistorySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(PhcrSocialHistorySection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionTitle(
					(PhcrSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrSocialHistorySectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrSocialHistorySectionText() {
		OperationsTestCase<PhcrSocialHistorySection> validatePhcrSocialHistorySectionTextTestCase = new OperationsTestCase<PhcrSocialHistorySection>(
			"validatePhcrSocialHistorySectionText",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(PhcrSocialHistorySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionText(
					(PhcrSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrSocialHistorySectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrSocialHistorySectionGeotemporalHistoryObservation() {
		OperationsTestCase<PhcrSocialHistorySection> validatePhcrSocialHistorySectionGeotemporalHistoryObservationTestCase = new OperationsTestCase<PhcrSocialHistorySection>(
			"validatePhcrSocialHistorySectionGeotemporalHistoryObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_GEOTEMPORAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(PhcrSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionGeotemporalHistoryObservation(
					(PhcrSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrSocialHistorySectionGeotemporalHistoryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation() {
		OperationsTestCase<PhcrSocialHistorySection> validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservationTestCase = new OperationsTestCase<PhcrSocialHistorySection>(
			"validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(PhcrSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(
					(PhcrSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrSocialHistorySectionRaceObservation() {
		OperationsTestCase<PhcrSocialHistorySection> validatePhcrSocialHistorySectionRaceObservationTestCase = new OperationsTestCase<PhcrSocialHistorySection>(
			"validatePhcrSocialHistorySectionRaceObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_RACE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(PhcrSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionRaceObservation(
					(PhcrSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrSocialHistorySectionRaceObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrSocialHistorySectionOccupationObservation() {
		OperationsTestCase<PhcrSocialHistorySection> validatePhcrSocialHistorySectionOccupationObservationTestCase = new OperationsTestCase<PhcrSocialHistorySection>(
			"validatePhcrSocialHistorySectionOccupationObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_OCCUPATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(PhcrSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionOccupationObservation(
					(PhcrSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrSocialHistorySectionOccupationObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrSocialHistorySectionPregnancyObservation() {
		OperationsTestCase<PhcrSocialHistorySection> validatePhcrSocialHistorySectionPregnancyObservationTestCase = new OperationsTestCase<PhcrSocialHistorySection>(
			"validatePhcrSocialHistorySectionPregnancyObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(PhcrSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrSocialHistorySectionOperations.validatePhcrSocialHistorySectionPregnancyObservation(
					(PhcrSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrSocialHistorySectionPregnancyObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGeotemporalHistoryObservations() {

		PhcrSocialHistorySection target = objectFactory.create();
		target.getGeotemporalHistoryObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMostRecentTimeArrivedInUSAObservation() {

		PhcrSocialHistorySection target = objectFactory.create();
		target.getMostRecentTimeArrivedInUSAObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetRaceObservations() {

		PhcrSocialHistorySection target = objectFactory.create();
		target.getRaceObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetOccupationObservations() {

		PhcrSocialHistorySection target = objectFactory.create();
		target.getOccupationObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPregnancyObservations() {

		PhcrSocialHistorySection target = objectFactory.create();
		target.getPregnancyObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionTemplateId() {
		OperationsTestCase<PhcrSocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<PhcrSocialHistorySection>(
			"validateSocialHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(PhcrSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
					(PhcrSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistorySectionCode() {
		OperationsTestCase<PhcrSocialHistorySection> validateSocialHistorySectionCodeTestCase = new OperationsTestCase<PhcrSocialHistorySection>(
			"validateSocialHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(PhcrSocialHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrSocialHistorySectionOperations.validateSocialHistorySectionCode(
					(PhcrSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhcrSocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhcrSocialHistorySection> {
		public PhcrSocialHistorySection create() {
			return PhcrFactory.eINSTANCE.createPhcrSocialHistorySection();
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
	private static class ConstructorTestClass extends PhcrSocialHistorySectionOperations {
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

} // PhcrSocialHistorySectionOperations
