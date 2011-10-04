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
import org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.DischargeDiagnosisSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection#validateDischargeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection#validateDischargeDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection#validateDischargeDiagnosisSectionProblemConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diagnosis Section Problem Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection#getProblemConcernEntry() <em>Get Problem Concern Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeDiagnosisSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeDiagnosisSectionTemplateId() {
		OperationsTestCase<DischargeDiagnosisSection> validateDischargeDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<DischargeDiagnosisSection>(
			"validateDischargeDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(DischargeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDiagnosisSectionOperations.validateDischargeDiagnosisSectionTemplateId(
					(DischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDiagnosisSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeDiagnosisSectionCode() {
		OperationsTestCase<DischargeDiagnosisSection> validateDischargeDiagnosisSectionCodeTestCase = new OperationsTestCase<DischargeDiagnosisSection>(
			"validateDischargeDiagnosisSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(DischargeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDiagnosisSectionOperations.validateDischargeDiagnosisSectionCode(
					(DischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeDiagnosisSectionProblemConcernEntry() {
		OperationsTestCase<DischargeDiagnosisSection> validateDischargeDiagnosisSectionProblemConcernEntryTestCase = new OperationsTestCase<DischargeDiagnosisSection>(
			"validateDischargeDiagnosisSectionProblemConcernEntry",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_DIAGNOSIS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(DischargeDiagnosisSection target) {
				target.init();
				target.addAct(IHEFactory.eINSTANCE.createProblemConcernEntry());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDiagnosisSectionOperations.validateDischargeDiagnosisSectionProblemConcernEntry(
					(DischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDiagnosisSectionProblemConcernEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemConcernEntry() {

		DischargeDiagnosisSection target = objectFactory.create();
		target.getProblemConcernEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeDiagnosisSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeDiagnosisSection> {

		public DischargeDiagnosisSection create() {
			return IHEFactory.eINSTANCE.createDischargeDiagnosisSection();
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
	private static class ConstructorTestClass extends DischargeDiagnosisSectionOperations {
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

} // DischargeDiagnosisSectionOperations
