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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemStatus;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemStatusOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Status</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus#validateProblemStatusTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus#validateProblemStatusReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus#validateProblemStatusTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus#validateProblemStatusTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus#validateProblemStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus#validateProblemStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus#validateProblemStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus#validateProblemStatusText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus#validateProblemStatusStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemStatus#validateProblemStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Status Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemStatusTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemStatusTextReference() {
		OperationsTestCase<ProblemStatus> validateProblemStatusTextReferenceTestCase = new OperationsTestCase<ProblemStatus>(
			"validateProblemStatusTextReference",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatus target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();

				target.setText(txt);
			}

			@Override
			protected void updateToPass(ProblemStatus target) {

				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusOperations.validateProblemStatusTextReference(
					(ProblemStatus) objectToTest, diagnostician, map);
			}

		};

		validateProblemStatusTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProblemStatusReferenceValue() {
		OperationsTestCase<ProblemStatus> validateProblemStatusReferenceValueTestCase = new OperationsTestCase<ProblemStatus>(
			"validateProblemStatusReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_STATUS_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatus target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(ProblemStatus target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusOperations.validateProblemStatusReferenceValue(
					(ProblemStatus) objectToTest, diagnostician, map);
			}

		};

		validateProblemStatusReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProblemStatusTextReferenceValue() {
		OperationsTestCase<ProblemStatus> validateProblemStatusTextReferenceValueTestCase = new NarrativeReferenceTestCase<ProblemStatus>(
			"validateProblemStatusTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_STATUS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatus target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular problem status.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected void updateToPass(ProblemStatus target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular problem status.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusOperations.validateProblemStatusTextReferenceValue(
					(ProblemStatus) objectToTest, diagnostician, map);
			}

		};

		validateProblemStatusTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemStatusTemplateId() {
		OperationsTestCase<ProblemStatus> validateProblemStatusTemplateIdTestCase = new OperationsTestCase<ProblemStatus>(
			"validateProblemStatusTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatus target) {

			}

			@Override
			protected void updateToPass(ProblemStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusOperations.validateProblemStatusTemplateId(
					(ProblemStatus) objectToTest, diagnostician, map);
			}

		};

		validateProblemStatusTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemStatusClassCode() {
		OperationsTestCase<ProblemStatus> validateProblemStatusClassCodeTestCase = new OperationsTestCase<ProblemStatus>(
			"validateProblemStatusClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatus target) {

			}

			@Override
			protected void updateToPass(ProblemStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusOperations.validateProblemStatusClassCode(
					(ProblemStatus) objectToTest, diagnostician, map);
			}

		};

		validateProblemStatusClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemStatusMoodCode() {
		OperationsTestCase<ProblemStatus> validateProblemStatusMoodCodeTestCase = new OperationsTestCase<ProblemStatus>(
			"validateProblemStatusMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatus target) {

			}

			@Override
			protected void updateToPass(ProblemStatus target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusOperations.validateProblemStatusMoodCode(
					(ProblemStatus) objectToTest, diagnostician, map);
			}

		};

		validateProblemStatusMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProblemStatusCode() {
		OperationsTestCase<ProblemStatus> validateProblemStatusCodeTestCase = new OperationsTestCase<ProblemStatus>(
			"validateProblemStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemStatus target) {

			}

			@Override
			protected void updateToPass(ProblemStatus target) {
				target.init();

				target.setCode(DatatypesFactory.eINSTANCE.createCE("33999-4", "2.16.840.1.113883.6.1"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusOperations.validateProblemStatusCode(
					(ProblemStatus) objectToTest, diagnostician, map);
			}

		};

		validateProblemStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemStatusStatusCode() {
		OperationsTestCase<ProblemStatus> validateProblemStatusStatusCodeTestCase = new OperationsTestCase<ProblemStatus>(
			"validateProblemStatusStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_STATUS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatus target) {

			}

			@Override
			protected void updateToPass(ProblemStatus target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusOperations.validateProblemStatusStatusCode(
					(ProblemStatus) objectToTest, diagnostician, map);
			}

		};

		validateProblemStatusStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemStatusText() {
		OperationsTestCase<ProblemStatus> validateProblemStatusTextTestCase = new OperationsTestCase<ProblemStatus>(
			"validateProblemStatusText",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_STATUS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemStatus target) {

			}

			@Override
			protected void updateToPass(ProblemStatus target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusOperations.validateProblemStatusText(
					(ProblemStatus) objectToTest, diagnostician, map);
			}

		};

		validateProblemStatusTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemStatusValue() {
		OperationsTestCase<ProblemStatus> validateProblemStatusValueTestCase = new OperationsTestCase<ProblemStatus>(
			"validateProblemStatusValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemStatus target) {

			}

			@Override
			protected void updateToPass(ProblemStatus target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("55561003");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemStatusOperations.validateProblemStatusValue(
					(ProblemStatus) objectToTest, diagnostician, map);
			}

		};

		validateProblemStatusValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemStatusOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemStatus> {
		public ProblemStatus create() {
			return ConsolFactory.eINSTANCE.createProblemStatus();
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
	private static class ConstructorTestClass extends ProblemStatusOperations {
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

} // ProblemStatusOperations
