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
import org.openhealthtools.mdht.uml.cda.consol.PayerEntry;
import org.openhealthtools.mdht.uml.cda.consol.operations.PayerEntryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Payer Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryPayerEntityIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Payer Entity Is Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryCoveredPartyIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Covered Party Is Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryCoveredPartyTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Covered Party Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntrySubscriberIsAllowed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Subscriber Is Allowed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntrySubscriberTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Subscriber Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryEntryRelationshipREFR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Entry Relationship REFR</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryPayerEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Payer Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntryCoveredParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Covered Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#validatePayerEntrySubscriber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entry Subscriber</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#getPayerEntity() <em>Get Payer Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#getCoveredParty() <em>Get Covered Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PayerEntry#getSubscriber() <em>Get Subscriber</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PayerEntryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntryPayerEntityIsRequired() {
			OperationsTestCase<PayerEntry> validatePayerEntryPayerEntityIsRequiredTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntryPayerEntityIsRequired",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntryPayerEntityIsRequired(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntryPayerEntityIsRequiredTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntryCoveredPartyIsRequired() {
			OperationsTestCase<PayerEntry> validatePayerEntryCoveredPartyIsRequiredTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntryCoveredPartyIsRequired",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntryCoveredPartyIsRequired(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntryCoveredPartyIsRequiredTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntryCoveredPartyTime() {
			OperationsTestCase<PayerEntry> validatePayerEntryCoveredPartyTimeTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntryCoveredPartyTime",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntryCoveredPartyTime(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntryCoveredPartyTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntrySubscriberIsAllowed() {
			OperationsTestCase<PayerEntry> validatePayerEntrySubscriberIsAllowedTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntrySubscriberIsAllowed",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntrySubscriberIsAllowed(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntrySubscriberIsAllowedTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntrySubscriberTime() {
			OperationsTestCase<PayerEntry> validatePayerEntrySubscriberTimeTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntrySubscriberTime",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntrySubscriberTime(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntrySubscriberTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntryEntryRelationshipREFR() {
			OperationsTestCase<PayerEntry> validatePayerEntryEntryRelationshipREFRTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntryEntryRelationshipREFR",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntryEntryRelationshipREFR(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntryEntryRelationshipREFRTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntryClassCode() {
			OperationsTestCase<PayerEntry> validatePayerEntryClassCodeTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntryClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntryClassCode(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntryClassCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntryMoodCode() {
			OperationsTestCase<PayerEntry> validatePayerEntryMoodCodeTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntryMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntryMoodCode(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntryMoodCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntryId() {
			OperationsTestCase<PayerEntry> validatePayerEntryIdTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntryId",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntryId(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntryIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntryStatusCode() {
			OperationsTestCase<PayerEntry> validatePayerEntryStatusCodeTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntryStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
			
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntryStatusCode(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntryStatusCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntryPayerEntity() {
			OperationsTestCase<PayerEntry> validatePayerEntryPayerEntityTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntryPayerEntity",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntryPayerEntity(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntryPayerEntityTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntryCoveredParty() {
			OperationsTestCase<PayerEntry> validatePayerEntryCoveredPartyTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntryCoveredParty",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntryCoveredParty(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntryCoveredPartyTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePayerEntrySubscriber() {
			OperationsTestCase<PayerEntry> validatePayerEntrySubscriberTestCase = new OperationsTestCase<PayerEntry>(
			"validatePayerEntrySubscriber",
			operationsForOCL.getOCLValue("VALIDATE_PAYER_ENTRY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PayerEntry target) {

			}

			@Override
			protected void updateToPass(PayerEntry target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PayerEntryOperations.validatePayerEntrySubscriber(
					(PayerEntry) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntrySubscriberTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPayerEntity() {


PayerEntry target = objectFactory.create();
target.getPayerEntity();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCoveredParty() {


PayerEntry target = objectFactory.create();
target.getCoveredParty();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSubscriber() {


PayerEntry target = objectFactory.create();
target.getSubscriber();



}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PayerEntryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PayerEntry> {
		public PayerEntry create() {
			return ConsolFactory.eINSTANCE.createPayerEntry();
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
	private static class ConstructorTestClass extends PayerEntryOperations {
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

} // PayerEntryOperations
