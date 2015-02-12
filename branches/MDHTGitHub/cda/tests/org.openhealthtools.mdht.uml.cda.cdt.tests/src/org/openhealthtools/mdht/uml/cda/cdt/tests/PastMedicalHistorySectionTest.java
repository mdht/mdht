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
package org.openhealthtools.mdht.uml.cda.cdt.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.operations.PastMedicalHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Past Medical History Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection#validatePastMedicalHistorySectionHasClinicalStatements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Has Clinical Statements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection#validatePastMedicalHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection#validatePastMedicalHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection#validatePastMedicalHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PastMedicalHistorySectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidatePastMedicalHistorySectionHasClinicalStatements() {
		OperationsTestCase<PastMedicalHistorySection> validatePastMedicalHistorySectionHasClinicalStatementsTestCase = new OperationsTestCase<PastMedicalHistorySection>(
			"validatePastMedicalHistorySectionHasClinicalStatements",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_HAS_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySection target) {
				target.init();

				Entry entry = CDAFactory.eINSTANCE.createEntry();

				target.getEntries().add(entry);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionHasClinicalStatements(
					(PastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionHasClinicalStatementsTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePastMedicalHistorySectionTemplateId() {
		OperationsTestCase<PastMedicalHistorySection> validatePastMedicalHistorySectionTemplateIdTestCase = new OperationsTestCase<PastMedicalHistorySection>(
			"validatePastMedicalHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionTemplateId(
					(PastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePastMedicalHistorySectionCode() {
		OperationsTestCase<PastMedicalHistorySection> validatePastMedicalHistorySectionCodeTestCase = new OperationsTestCase<PastMedicalHistorySection>(
			"validatePastMedicalHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionCode(
					(PastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePastMedicalHistorySectionText() {
		OperationsTestCase<PastMedicalHistorySection> validatePastMedicalHistorySectionTextTestCase = new OperationsTestCase<PastMedicalHistorySection>(
			"validatePastMedicalHistorySectionText",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionText(
					(PastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionTextTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends PastMedicalHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PastMedicalHistorySection> {

		public PastMedicalHistorySection create() {
			return CDTFactory.eINSTANCE.createPastMedicalHistorySection();
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
	private static class ConstructorTestClass extends PastMedicalHistorySectionOperations {
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

} // PastMedicalHistorySectionOperations
