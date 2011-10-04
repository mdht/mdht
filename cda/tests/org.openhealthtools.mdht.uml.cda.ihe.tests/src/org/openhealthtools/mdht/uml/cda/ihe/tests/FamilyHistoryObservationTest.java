/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.FamilyHistoryObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryObservation#validateSimpleObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Simple Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryObservation#validateIHEFamilyHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryObservation#validateIHEFamilyHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Family History Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSimpleObservationTemplateId() {
		OperationsTestCase<FamilyHistoryObservation> validateSimpleObservationTemplateIdTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateSimpleObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SIMPLE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateSimpleObservationTemplateId(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSimpleObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHEFamilyHistoryObservationCode() {
		OperationsTestCase<FamilyHistoryObservation> validateIHEFamilyHistoryObservationCodeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateIHEFamilyHistoryObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_IHE_FAMILY_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateIHEFamilyHistoryObservationCode(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHEFamilyHistoryObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHEFamilyHistoryObservationValue() {
		OperationsTestCase<FamilyHistoryObservation> validateIHEFamilyHistoryObservationValueTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateIHEFamilyHistoryObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_IHE_FAMILY_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateIHEFamilyHistoryObservationValue(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHEFamilyHistoryObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryObservation> {
		public FamilyHistoryObservation create() {
			return IHEFactory.eINSTANCE.createFamilyHistoryObservation();
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
	private static class ConstructorTestClass extends FamilyHistoryObservationOperations {
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

} // FamilyHistoryObservationOperations
