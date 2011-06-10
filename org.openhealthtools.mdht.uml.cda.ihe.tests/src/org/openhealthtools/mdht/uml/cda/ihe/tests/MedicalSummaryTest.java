/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.MedicalSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary#validateMedicalSummaryProblemConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Problem Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary#validateMedicalSummaryAllergyConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Allergy Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary#validateMedicalSummaryMedications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary#validateMedicalSummaryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Summary Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicalSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicalSummaryProblemConcernEntry() {
		OperationsTestCase<MedicalSummary> validateMedicalSummaryProblemConcernEntryTestCase = new OperationsTestCase<MedicalSummary>(
			"validateMedicalSummaryProblemConcernEntry",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalSummary target) {
				target.init();

			}

			@Override
			protected void updateToPass(MedicalSummary target) {
				ProblemConcernEntry pce = IHEFactory.eINSTANCE.createProblemConcernEntry().init();
				Section section = CDAFactory.eINSTANCE.createSection();
				section.addAct(pce);
				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalSummaryOperations.validateMedicalSummaryProblemConcernEntry(
					(MedicalSummary) objectToTest, diagnostician, map);
			}

		};

		validateMedicalSummaryProblemConcernEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicalSummaryAllergyConcernEntry() {
		OperationsTestCase<MedicalSummary> validateMedicalSummaryAllergyConcernEntryTestCase = new OperationsTestCase<MedicalSummary>(
			"validateMedicalSummaryAllergyConcernEntry",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicalSummary target) {

				Section section = CDAFactory.eINSTANCE.createSection();
				Act ac = IHEFactory.eINSTANCE.createAllergyIntoleranceConcern();
				section.addAct(ac);
				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalSummaryOperations.validateMedicalSummaryAllergyConcernEntry(
					(MedicalSummary) objectToTest, diagnostician, map);
			}

		};

		validateMedicalSummaryAllergyConcernEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicalSummaryMedications() {
		OperationsTestCase<MedicalSummary> validateMedicalSummaryMedicationsTestCase = new OperationsTestCase<MedicalSummary>(
			"validateMedicalSummaryMedications",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicalSummary target) {
				Section section = CDAFactory.eINSTANCE.createSection();
				SubstanceAdministration substanceAdministration = IHEFactory.eINSTANCE.createNormalDose().init();
				section.addSubstanceAdministration(substanceAdministration);
				target.addSection(section);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalSummaryOperations.validateMedicalSummaryMedications(
					(MedicalSummary) objectToTest, diagnostician, map);
			}

		};

		validateMedicalSummaryMedicationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalSummaryTemplateId() {
		OperationsTestCase<MedicalSummary> validateMedicalSummaryTemplateIdTestCase = new OperationsTestCase<MedicalSummary>(
			"validateMedicalSummaryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalSummary target) {

			}

			@Override
			protected void updateToPass(MedicalSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalSummaryOperations.validateMedicalSummaryTemplateId(
					(MedicalSummary) objectToTest, diagnostician, map);
			}

		};

		validateMedicalSummaryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicalSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicalSummary> {

		public MedicalSummary create() {
			return IHEFactory.eINSTANCE.createMedicalSummary();
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
	private static class ConstructorTestClass extends MedicalSummaryOperations {
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

} // MedicalSummaryOperations
