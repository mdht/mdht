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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusResultObservationOperations;
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
 * A static utility class that provides operations related to '<em><b>Functional Status Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationValueDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Value Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Reference Range Observation Range No Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationReferenceRangeObservationRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Reference Range Observation Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#getNonMedicinalSupplyActivity() <em>Get Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#getCaregiverCharacteristics() <em>Get Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#getAssessmentScaleObservation() <em>Get Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusResultObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationTextReference() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationTextReferenceTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationTextReference(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationTextReferenceValue() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationTextReferenceValueTestCase = new NarrativeReferenceTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationTextReferenceValue(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationValueDatatype() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationValueDatatypeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationValueDatatype",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", ""));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationValueDatatype(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationValueDatatypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationClassCode() {
      OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationClassCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
      "validateFunctionalStatusResultObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FunctionalStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(FunctionalStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationClassCode(
          (FunctionalStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateFunctionalStatusResultObservationClassCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationMoodCode() {
      OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationMoodCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
      "validateFunctionalStatusResultObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FunctionalStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(FunctionalStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationMoodCode(
          (FunctionalStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateFunctionalStatusResultObservationMoodCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationId() {
      OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationIdTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
      "validateFunctionalStatusResultObservationId",
      operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FunctionalStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(FunctionalStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
      
        II ii  = DatatypesFactory.eINSTANCE.createII();
        target.getIds().add(ii);				
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationId(
          (FunctionalStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateFunctionalStatusResultObservationIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationCodeP() {
      OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationCodePTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
      "validateFunctionalStatusResultObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FunctionalStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(FunctionalStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationCodeP(
          (FunctionalStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateFunctionalStatusResultObservationCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				CE cd = DatatypesFactory.eINSTANCE.createCE("", "2.16.840.1.113883.6.1", "", "");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationText() {
      OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationTextTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
      "validateFunctionalStatusResultObservationText",
      operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FunctionalStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(FunctionalStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
    target.setText(text );	
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationText(
          (FunctionalStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateFunctionalStatusResultObservationTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationStatusCodeP() {
      OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationStatusCodePTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
      "validateFunctionalStatusResultObservationStatusCodeP",
      operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FunctionalStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(FunctionalStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationStatusCodeP(
          (FunctionalStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateFunctionalStatusResultObservationStatusCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationStatusCode() {
      OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationStatusCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
      "validateFunctionalStatusResultObservationStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FunctionalStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(FunctionalStatusResultObservation target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationStatusCode(
          (FunctionalStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateFunctionalStatusResultObservationStatusCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationEffectiveTime() {
      OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationEffectiveTimeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
      "validateFunctionalStatusResultObservationEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FunctionalStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(FunctionalStatusResultObservation target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationEffectiveTime(
          (FunctionalStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateFunctionalStatusResultObservationEffectiveTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationValue() {
      OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationValueTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
      "validateFunctionalStatusResultObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FunctionalStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(FunctionalStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationValue(
          (FunctionalStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateFunctionalStatusResultObservationValueTestCase.doValidationTest();
}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationInterpretationCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationInterpretationCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationInterpretationCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationMethodCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationMethodCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationMethodCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationTargetSiteCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationTargetSiteCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				target.getTargetSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationTargetSiteCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationAuthor() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationAuthorTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationAuthor",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationAuthor(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationNonMedicinalSupplyActivity() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationNonMedicinalSupplyActivityTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationNonMedicinalSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationNonMedicinalSupplyActivity(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationNonMedicinalSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationCaregiverCharacteristics() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationCaregiverCharacteristicsTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationCaregiverCharacteristics",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createCaregiverCharacteristics());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationCaregiverCharacteristics(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationCaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationAssessmentScaleObservation() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationAssessmentScaleObservationTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationAssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationAssessmentScaleObservation(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationReferenceRange() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationReferenceRangeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationReferenceRange",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationReferenceRange(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationReferenceRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {
				target.init();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				or.setCode(DatatypesFactory.eINSTANCE.createCD());
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);
			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.getReferenceRanges().clear();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				rr.setObservationRange(CDAFactory.eINSTANCE.createObservationRange());
				target.getReferenceRanges().add(rr);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationReferenceRangeObservationRange() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationReferenceRangeObservationRangeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationReferenceRangeObservationRange",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {
				target.init();
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());
			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.getReferenceRanges().clear();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				rr.setObservationRange(CDAFactory.eINSTANCE.createObservationRange());
				target.getReferenceRanges().add(rr);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationReferenceRangeObservationRange(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationReferenceRangeObservationRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonMedicinalSupplyActivity() {


FunctionalStatusResultObservation target = objectFactory.create();
target.getNonMedicinalSupplyActivity();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaregiverCharacteristics() {


FunctionalStatusResultObservation target = objectFactory.create();
target.getCaregiverCharacteristics();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservation() {


FunctionalStatusResultObservation target = objectFactory.create();
target.getAssessmentScaleObservation();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationTemplateId() {
      OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
      "validateResultObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FunctionalStatusResultObservation target) {

      }

      @Override
      protected void updateToPass(FunctionalStatusResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FunctionalStatusResultObservationOperations.validateResultObservationTemplateId(
          (FunctionalStatusResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateResultObservationTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusResultObservation> {
		public FunctionalStatusResultObservation create() {
			return ConsolFactory.eINSTANCE.createFunctionalStatusResultObservation();
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
	private static class ConstructorTestClass extends FunctionalStatusResultObservationOperations {
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

} // FunctionalStatusResultObservationOperations
