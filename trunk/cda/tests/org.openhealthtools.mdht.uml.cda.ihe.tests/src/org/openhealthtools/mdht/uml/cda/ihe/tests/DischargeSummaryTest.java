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
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.DischargeSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary#validateDischargeSummaryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary#validateDischargeSummaryActiveProblemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Active Problems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary#getActiveProblemsSection() <em>Get Active Problems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryTemplateId() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryTemplateIdTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryTemplateId(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryActiveProblemsSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryActiveProblemsSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryActiveProblemsSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_ACTIVE_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ActiveProblemsSection */
				ActiveProblemsSection section =

				IHEFactory.eINSTANCE.createActiveProblemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryActiveProblemsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryActiveProblemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetActiveProblemsSection() {

		DischargeSummary target = objectFactory.create();
		target.getActiveProblemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<DischargeSummary> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<DischargeSummary>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateGeneralHeaderConstraintsCode(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeSummary> {

		public DischargeSummary create() {
			return IHEFactory.eINSTANCE.createDischargeSummary();
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
	private static class ConstructorTestClass extends DischargeSummaryOperations {
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

} // DischargeSummaryOperations
