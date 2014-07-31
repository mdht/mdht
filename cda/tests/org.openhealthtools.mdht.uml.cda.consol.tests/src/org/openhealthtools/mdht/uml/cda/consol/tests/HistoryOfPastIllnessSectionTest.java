/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryOfPastIllnessSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Past Illness Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#getProblemObservations() <em>Get Problem Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryOfPastIllnessSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionTemplateId() {
		OperationsTestCase<HistoryOfPastIllnessSection> validateHistoryOfPastIllnessSectionTemplateIdTestCase = new OperationsTestCase<HistoryOfPastIllnessSection>(
			"validateHistoryOfPastIllnessSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionTemplateId(
					(HistoryOfPastIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionCode() {
		OperationsTestCase<HistoryOfPastIllnessSection> validateHistoryOfPastIllnessSectionCodeTestCase = new OperationsTestCase<HistoryOfPastIllnessSection>(
			"validateHistoryOfPastIllnessSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionCode(
					(HistoryOfPastIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionCodeP() {
		OperationsTestCase<HistoryOfPastIllnessSection> validateHistoryOfPastIllnessSectionCodePTestCase = new OperationsTestCase<HistoryOfPastIllnessSection>(
			"validateHistoryOfPastIllnessSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionCodeP(
					(HistoryOfPastIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionTitle() {
		OperationsTestCase<HistoryOfPastIllnessSection> validateHistoryOfPastIllnessSectionTitleTestCase = new OperationsTestCase<HistoryOfPastIllnessSection>(
			"validateHistoryOfPastIllnessSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionTitle(
					(HistoryOfPastIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionText() {
		OperationsTestCase<HistoryOfPastIllnessSection> validateHistoryOfPastIllnessSectionTextTestCase = new OperationsTestCase<HistoryOfPastIllnessSection>(
			"validateHistoryOfPastIllnessSectionText",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionText(
					(HistoryOfPastIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryOfPastIllnessSectionProblemObservation() {
		OperationsTestCase<HistoryOfPastIllnessSection> validateHistoryOfPastIllnessSectionProblemObservationTestCase = new OperationsTestCase<HistoryOfPastIllnessSection>(
			"validateHistoryOfPastIllnessSectionProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfPastIllnessSection target) {

			}

			@Override
			protected void updateToPass(HistoryOfPastIllnessSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createProblemObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfPastIllnessSectionOperations.validateHistoryOfPastIllnessSectionProblemObservation(
					(HistoryOfPastIllnessSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfPastIllnessSectionProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservations() {

		HistoryOfPastIllnessSection target = objectFactory.create();
		target.getProblemObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryOfPastIllnessSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryOfPastIllnessSection> {
		public HistoryOfPastIllnessSection create() {
			return ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection();
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
	private static class ConstructorTestClass extends HistoryOfPastIllnessSectionOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // HistoryOfPastIllnessSectionOperations
