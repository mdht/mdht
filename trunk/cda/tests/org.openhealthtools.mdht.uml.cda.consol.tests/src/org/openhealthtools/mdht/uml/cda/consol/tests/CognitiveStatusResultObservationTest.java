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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ObservationRange;
import org.openhealthtools.mdht.uml.cda.ReferenceRange;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveStatusResultObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cognitive Status Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationValueDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Value Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range Observation Range No Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationReferenceRangeObservationRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range Observation Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#getNonMedicinalSupplyActivities() <em>Get Non Medicinal Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CognitiveStatusResultObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationTextReference() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationTextReferenceTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationTextReference(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationTextReferenceValue() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationTextReferenceValueTestCase = new NarrativeReferenceTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationTextReferenceValue(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationValueDatatype() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationValueDatatypeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationValueDatatype",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", ""));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationValueDatatype(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationValueDatatypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationClassCode() {
      OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationClassCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
      "validateCognitiveStatusResultObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CognitiveStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(CognitiveStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationClassCode(
          (CognitiveStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateCognitiveStatusResultObservationClassCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationMoodCode() {
      OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationMoodCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
      "validateCognitiveStatusResultObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CognitiveStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(CognitiveStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationMoodCode(
          (CognitiveStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateCognitiveStatusResultObservationMoodCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationId() {
      OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationIdTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
      "validateCognitiveStatusResultObservationId",
      operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CognitiveStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(CognitiveStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
      
        II ii  = DatatypesFactory.eINSTANCE.createII();
        target.getIds().add(ii);				
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationId(
          (CognitiveStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateCognitiveStatusResultObservationIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationCodeP() {
      OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationCodePTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
      "validateCognitiveStatusResultObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CognitiveStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(CognitiveStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationCodeP(
          (CognitiveStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateCognitiveStatusResultObservationCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationCode() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();

				CE cd = DatatypesFactory.eINSTANCE.createCE("373930000", "2.16.840.1.113883.6.96");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationText() {
      OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationTextTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
      "validateCognitiveStatusResultObservationText",
      operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CognitiveStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(CognitiveStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
    target.setText(text );	
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationText(
          (CognitiveStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateCognitiveStatusResultObservationTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationStatusCodeP() {
      OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationStatusCodePTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
      "validateCognitiveStatusResultObservationStatusCodeP",
      operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CognitiveStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(CognitiveStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationStatusCodeP(
          (CognitiveStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateCognitiveStatusResultObservationStatusCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationStatusCode() {
      OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationStatusCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
      "validateCognitiveStatusResultObservationStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CognitiveStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(CognitiveStatusResultObservation target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationStatusCode(
          (CognitiveStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateCognitiveStatusResultObservationStatusCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationEffectiveTime() {
      OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationEffectiveTimeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
      "validateCognitiveStatusResultObservationEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CognitiveStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(CognitiveStatusResultObservation target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationEffectiveTime(
          (CognitiveStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateCognitiveStatusResultObservationEffectiveTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationValue() {
      OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationValueTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
      "validateCognitiveStatusResultObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CognitiveStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(CognitiveStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationValue(
          (CognitiveStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateCognitiveStatusResultObservationValueTestCase.doValidationTest();
}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationInterpretationCode() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationInterpretationCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationInterpretationCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationMethodCode() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationMethodCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationMethodCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationTargetSiteCode() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationTargetSiteCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				target.getTargetSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationTargetSiteCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationAuthor() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationAuthorTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationAuthor",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationAuthor(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationNonMedicinalSupplyActivity() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationNonMedicinalSupplyActivityTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationNonMedicinalSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationNonMedicinalSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationCaregiverCharacteristics() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationCaregiverCharacteristicsTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationCaregiverCharacteristics",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createCaregiverCharacteristics());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationCaregiverCharacteristics(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationCaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationAssessmentScaleObservation() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationAssessmentScaleObservationTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationAssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationAssessmentScaleObservation(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationReferenceRange() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationReferenceRangeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationReferenceRange",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationReferenceRange(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationReferenceRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {
				target.init();

				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				or.setCode(DatatypesFactory.eINSTANCE.createCD());
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.getReferenceRanges().clear();

				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationReferenceRangeObservationRange() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationReferenceRangeObservationRangeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationReferenceRangeObservationRange",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {
				target.init();
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.getReferenceRanges().clear();

				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationReferenceRangeObservationRange(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationReferenceRangeObservationRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonMedicinalSupplyActivities() {


CognitiveStatusResultObservation target = objectFactory.create();
target.getNonMedicinalSupplyActivities();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaregiverCharacteristicss() {


CognitiveStatusResultObservation target = objectFactory.create();
target.getCaregiverCharacteristicss();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {


CognitiveStatusResultObservation target = objectFactory.create();
target.getAssessmentScaleObservations();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationTemplateId() {
      OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
      "validateResultObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CognitiveStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(CognitiveStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CognitiveStatusResultObservationOperations.validateResultObservationTemplateId(
          (CognitiveStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateResultObservationTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CognitiveStatusResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CognitiveStatusResultObservation> {
		public CognitiveStatusResultObservation create() {
			return ConsolFactory.eINSTANCE.createCognitiveStatusResultObservation();
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
	private static class ConstructorTestClass extends CognitiveStatusResultObservationOperations {
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

} // CognitiveStatusResultObservationOperations
