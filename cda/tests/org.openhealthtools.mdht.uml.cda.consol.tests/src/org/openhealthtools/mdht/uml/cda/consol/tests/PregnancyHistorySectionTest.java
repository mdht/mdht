/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PregnancyHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pregnancy History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyHistorySection#validatePregnancyHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyHistorySection#validatePregnancyHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyHistorySection#validatePregnancyHistorySectionPregnancyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy History Section Pregnancy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PregnancyHistorySection#getPregnancyObservations() <em>Get Pregnancy Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PregnancyHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyHistorySectionTemplateId() {
		OperationsTestCase<PregnancyHistorySection> validatePregnancyHistorySectionTemplateIdTestCase = new OperationsTestCase<PregnancyHistorySection>(
			"validatePregnancyHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyHistorySectionOperations.validatePregnancyHistorySectionTemplateId(
					(PregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyHistorySectionCode() {
		OperationsTestCase<PregnancyHistorySection> validatePregnancyHistorySectionCodeTestCase = new OperationsTestCase<PregnancyHistorySection>(
			"validatePregnancyHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyHistorySectionOperations.validatePregnancyHistorySectionCode(
					(PregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePregnancyHistorySectionPregnancyObservation() {
		OperationsTestCase<PregnancyHistorySection> validatePregnancyHistorySectionPregnancyObservationTestCase = new OperationsTestCase<PregnancyHistorySection>(
			"validatePregnancyHistorySectionPregnancyObservation",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PregnancyHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PregnancyHistorySectionOperations.validatePregnancyHistorySectionPregnancyObservation(
					(PregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyHistorySectionPregnancyObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPregnancyObservations() {

		PregnancyHistorySection target = objectFactory.create();
		target.getPregnancyObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PregnancyHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PregnancyHistorySection> {

		public PregnancyHistorySection create() {
			return ConsolFactory.eINSTANCE.createPregnancyHistorySection();
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
	private static class ConstructorTestClass extends PregnancyHistorySectionOperations {
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

} // PregnancyHistorySectionOperations
