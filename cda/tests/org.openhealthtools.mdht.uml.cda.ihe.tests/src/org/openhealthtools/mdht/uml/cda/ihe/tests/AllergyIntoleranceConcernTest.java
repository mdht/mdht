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
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceConcernOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Intolerance Concern</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern#validateAllergyIntoleranceConcernTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Concern Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern#validateAllergyIntoleranceConcernAllergyIntolerance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Intolerance Concern Allergy Intolerance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern#getAllergyIntolerances() <em>Get Allergy Intolerances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyIntoleranceConcernTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyIntoleranceConcernTemplateId() {
		OperationsTestCase<AllergyIntoleranceConcern> validateAllergyIntoleranceConcernTemplateIdTestCase = new OperationsTestCase<AllergyIntoleranceConcern>(
			"validateAllergyIntoleranceConcernTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntoleranceConcern target) {

			}

			@Override
			protected void updateToPass(AllergyIntoleranceConcern target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyIntoleranceConcernOperations.validateAllergyIntoleranceConcernTemplateId(
					(AllergyIntoleranceConcern) objectToTest, diagnostician, map);
			}

		};

		validateAllergyIntoleranceConcernTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyIntoleranceConcernAllergyIntolerance() {
		OperationsTestCase<AllergyIntoleranceConcern> validateAllergyIntoleranceConcernAllergyIntoleranceTestCase = new OperationsTestCase<AllergyIntoleranceConcern>(
			"validateAllergyIntoleranceConcernAllergyIntolerance",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_CONCERN_ALLERGY_INTOLERANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntoleranceConcern target) {
				target.init();

			}

			@Override
			protected void updateToPass(AllergyIntoleranceConcern target) {
				AllergyIntolerance ai = IHEFactory.eINSTANCE.createAllergyIntolerance().init();
				target.addObservation(ai);

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyIntoleranceConcernOperations.validateAllergyIntoleranceConcernAllergyIntolerance(
					(AllergyIntoleranceConcern) objectToTest, diagnostician, map);
			}

		};

		validateAllergyIntoleranceConcernAllergyIntoleranceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyIntoleranceConcernOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyIntoleranceConcern> {

		public AllergyIntoleranceConcern create() {
			return IHEFactory.eINSTANCE.createAllergyIntoleranceConcern();
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
	private static class ConstructorTestClass extends AllergyIntoleranceConcernOperations {
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

} // AllergyIntoleranceConcernOperations
