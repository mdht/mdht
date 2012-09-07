/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.TransitionOfCareAmbulatorySummaryOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Transition Of Care Ambulatory Summary</b></em>' model
 * objects. <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Ambulatory Summary Responsible Party</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Ambulatory Summary Reason For Referral
 * Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#getReasonForReferralSection()
 * <em>Get Reason For Referral Section</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class TransitionOfCareAmbulatorySummaryTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareAmbulatorySummaryResponsibleParty() {
		OperationsTestCase<TransitionOfCareAmbulatorySummary> validateTransitionOfCareAmbulatorySummaryResponsiblePartyTestCase = new OperationsTestCase<TransitionOfCareAmbulatorySummary>(
				"validateTransitionOfCareAmbulatorySummaryResponsibleParty",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareAmbulatorySummary target) {

				Component1 compOf = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter eEncounter = CDAFactory.eINSTANCE
						.createEncompassingEncounter();
				compOf.setEncompassingEncounter(eEncounter);
				target.setComponentOf(compOf);
				System.out.println(compOf);
			}

			@Override
			protected void updateToPass(TransitionOfCareAmbulatorySummary target) {

				ResponsibleParty party = CDAFactory.eINSTANCE
						.createResponsibleParty();
				target.getComponentOf().getEncompassingEncounter()
						.setResponsibleParty(party);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareAmbulatorySummaryOperations
						.validateTransitionOfCareAmbulatorySummaryResponsibleParty(
								(TransitionOfCareAmbulatorySummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareAmbulatorySummaryResponsiblePartyTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareAmbulatorySummaryReasonForReferralSection() {
		OperationsTestCase<TransitionOfCareAmbulatorySummary> validateTransitionOfCareAmbulatorySummaryReasonForReferralSectionTestCase = new OperationsTestCase<TransitionOfCareAmbulatorySummary>(
				"validateTransitionOfCareAmbulatorySummaryReasonForReferralSection",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareAmbulatorySummary target) {

			}

			@Override
			protected void updateToPass(TransitionOfCareAmbulatorySummary target) {
				target.init();

				/* ReasonForReferralSection */
				ReasonForReferralSection section = ConsolFactory.eINSTANCE
						.createReasonForReferralSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareAmbulatorySummaryOperations
						.validateTransitionOfCareAmbulatorySummaryReasonForReferralSection(
								(TransitionOfCareAmbulatorySummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareAmbulatorySummaryReasonForReferralSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetReasonForReferralSection() {

		TransitionOfCareAmbulatorySummary target = objectFactory.create();
		target.getReasonForReferralSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			TransitionOfCareAmbulatorySummaryOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<TransitionOfCareAmbulatorySummary> {
		@Override
		public TransitionOfCareAmbulatorySummary create() {
			return Mu2consolFactory.eINSTANCE
					.createTransitionOfCareAmbulatorySummary();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends
			TransitionOfCareAmbulatorySummaryOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // TransitionOfCareAmbulatorySummaryOperations