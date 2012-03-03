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
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyObservationPlayingEntityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Observation Playing Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity#validateAllergyObservationPlayingEntityCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity#validateAllergyObservationPlayingEntityCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity#validateAllergyObservationPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservationPlayingEntity#validateAllergyObservationPlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyObservationPlayingEntityTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationPlayingEntityCodeOriginalText() {
		OperationsTestCase<AllergyObservationPlayingEntity> validateAllergyObservationPlayingEntityCodeOriginalTextTestCase = new OperationsTestCase<AllergyObservationPlayingEntity>(
			"validateAllergyObservationPlayingEntityCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservationPlayingEntity target) {

			}

			@Override
			protected void updateToPass(AllergyObservationPlayingEntity target) {
				target.init();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationPlayingEntityOperations.validateAllergyObservationPlayingEntityCodeOriginalText(
					(AllergyObservationPlayingEntity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationPlayingEntityCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationPlayingEntityCodeTranslation() {
		OperationsTestCase<AllergyObservationPlayingEntity> validateAllergyObservationPlayingEntityCodeTranslationTestCase = new OperationsTestCase<AllergyObservationPlayingEntity>(
			"validateAllergyObservationPlayingEntityCodeTranslation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservationPlayingEntity target) {

			}

			@Override
			protected void updateToPass(AllergyObservationPlayingEntity target) {
				target.init();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationPlayingEntityOperations.validateAllergyObservationPlayingEntityCodeTranslation(
					(AllergyObservationPlayingEntity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationPlayingEntityCodeTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationPlayingEntityClassCode() {
			OperationsTestCase<AllergyObservationPlayingEntity> validateAllergyObservationPlayingEntityClassCodeTestCase = new OperationsTestCase<AllergyObservationPlayingEntity>(
			"validateAllergyObservationPlayingEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AllergyObservationPlayingEntity target) {

			}

			@Override
			protected void updateToPass(AllergyObservationPlayingEntity target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AllergyObservationPlayingEntityOperations.validateAllergyObservationPlayingEntityClassCode(
					(AllergyObservationPlayingEntity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationPlayingEntityClassCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationPlayingEntityCode() {
		OperationsTestCase<AllergyObservationPlayingEntity> validateAllergyObservationPlayingEntityCodeTestCase = new OperationsTestCase<AllergyObservationPlayingEntity>(
			"validateAllergyObservationPlayingEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservationPlayingEntity target) {

			}

			@Override
			protected void updateToPass(AllergyObservationPlayingEntity target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationPlayingEntityOperations.validateAllergyObservationPlayingEntityCode(
					(AllergyObservationPlayingEntity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationPlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyObservationPlayingEntityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyObservationPlayingEntity> {
		public AllergyObservationPlayingEntity create() {
			return ConsolFactory.eINSTANCE.createAllergyObservationPlayingEntity();
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
	private static class ConstructorTestClass extends AllergyObservationPlayingEntityOperations {
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

} // AllergyObservationPlayingEntityOperations
