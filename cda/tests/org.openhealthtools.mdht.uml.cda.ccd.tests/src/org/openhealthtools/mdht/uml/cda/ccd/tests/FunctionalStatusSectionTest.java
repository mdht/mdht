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
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.FunctionalStatusSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Functional Status Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionClinicalStatements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Clinical Statements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionTitleValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Title Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionObservationCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Observation Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionResultStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Result Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection#validateFunctionalStatusSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateFunctionalStatusSectionClinicalStatements() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionClinicalStatementsTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionClinicalStatements",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addAct(CCDFactory.eINSTANCE.createProblemAct());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionClinicalStatements(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionClinicalStatementsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionTitleValue() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionTitleValueTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionTitleValue",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_TITLE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("functional status");

				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTitleValue(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionTitleValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFunctionalStatusSectionObservationCode() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionObservationCodeTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {
				target.init();
				target.addObservation(CCDFactory.eINSTANCE.createProblemObservation());
			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.getEntries().clear();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ProblemObservation po = CCDFactory.eINSTANCE.createProblemObservation();
				po.setCode(ce);
				target.addObservation(po);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionObservationCode(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFunctionalStatusSectionObservationCodeValueSet() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionObservationCodeValueSetTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionObservationCodeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {
				target.init();
				target.addObservation(CCDFactory.eINSTANCE.createProblemObservation());
			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.getEntries().clear();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.6.96");
				ProblemObservation po = CCDFactory.eINSTANCE.createProblemObservation();
				po.setCode(ce);
				target.addObservation(po);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionObservationCodeValueSet(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionObservationCodeValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFunctionalStatusSectionProblemStatusObservation() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionProblemStatusObservationTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionProblemStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {
				target.init();
				target.addObservation(CCDFactory.eINSTANCE.createProblemObservation());
			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.getEntries().clear();
				ProblemObservation po = CCDFactory.eINSTANCE.createProblemObservation();
				FunctionalStatusObservation fso = CCDFactory.eINSTANCE.createFunctionalStatusObservation();
				po.addObservation(fso);
				target.addObservation(po);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionProblemStatusObservation(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionProblemStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateFunctionalStatusSectionResultStatusObservation() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionResultStatusObservationTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionResultStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_RESULT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {
				target.init();
				target.addObservation(CCDFactory.eINSTANCE.createResultObservation());
			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.getEntries().clear();
				ResultObservation ro = CCDFactory.eINSTANCE.createResultObservation();
				FunctionalStatusObservation fso = CCDFactory.eINSTANCE.createFunctionalStatusObservation();
				ro.addObservation(fso);
				target.addObservation(ro);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionResultStatusObservation(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionResultStatusObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateFunctionalStatusSectionTemplateId() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionTemplateIdTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTemplateId(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateFunctionalStatusSectionCode() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionCodeTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCode(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateFunctionalStatusSectionTitle() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionTitleTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTitle(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionText() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionTextTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionText",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionText(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionTextTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends FunctionalStatusSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusSection> {
		public FunctionalStatusSection create() {
			return CCDFactory.eINSTANCE.createFunctionalStatusSection();
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
	private static class ConstructorTestClass extends FunctionalStatusSectionOperations {
	}

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

} // FunctionalStatusSectionOperations
