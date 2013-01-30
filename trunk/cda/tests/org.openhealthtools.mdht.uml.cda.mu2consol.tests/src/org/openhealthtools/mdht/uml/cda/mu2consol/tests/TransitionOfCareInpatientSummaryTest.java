/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.TransitionOfCareInpatientSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Transition Of Care Inpatient Summary</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryMedications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#getHospitalDischargeInstructionsSection() <em>Get Hospital Discharge Instructions Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TransitionOfCareInpatientSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTransitionOfCareInpatientSummaryMedications() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryMedicationsTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
			"validateTransitionOfCareInpatientSummaryMedications",
			operationsForOCL.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createMedicationsSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createHospitalDischargeMedicationsSection().init());
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryMedications(
					(TransitionOfCareInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryMedicationsTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSectionTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
			"validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection",
			operationsForOCL.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {

			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				target.init();

				/* HospitalDischargeInstructionsSection */
				HospitalDischargeInstructionsSection section =

				ConsolFactory.eINSTANCE.createHospitalDischargeInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(
					(TransitionOfCareInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeInstructionsSection() {

		TransitionOfCareInpatientSummary target = objectFactory.create();
		target.getHospitalDischargeInstructionsSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends TransitionOfCareInpatientSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TransitionOfCareInpatientSummary> {

		public TransitionOfCareInpatientSummary create() {
			return Mu2consolFactory.eINSTANCE.createTransitionOfCareInpatientSummary();
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
	private static class ConstructorTestClass extends TransitionOfCareInpatientSummaryOperations {
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

} // TransitionOfCareInpatientSummaryOperations
