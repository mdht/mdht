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
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.operations.PastMedicalHistorySectionConsultOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Past Medical History Section Consult</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult#validatePastMedicalHistorySectionConsultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Consult Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult#validatePastMedicalHistorySectionConsultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Consult Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult#validatePastMedicalHistorySectionConsultText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Past Medical History Section Consult Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PastMedicalHistorySectionConsultTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePastMedicalHistorySectionConsultTemplateId() {
		OperationsTestCase<PastMedicalHistorySectionConsult> validatePastMedicalHistorySectionConsultTemplateIdTestCase = new OperationsTestCase<PastMedicalHistorySectionConsult>(
			"validatePastMedicalHistorySectionConsultTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySectionConsult target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySectionConsult target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionConsultOperations.validatePastMedicalHistorySectionConsultTemplateId(
					(PastMedicalHistorySectionConsult) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionConsultTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePastMedicalHistorySectionConsultCode() {
		OperationsTestCase<PastMedicalHistorySectionConsult> validatePastMedicalHistorySectionConsultCodeTestCase = new OperationsTestCase<PastMedicalHistorySectionConsult>(
			"validatePastMedicalHistorySectionConsultCode",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySectionConsult target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySectionConsult target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionConsultOperations.validatePastMedicalHistorySectionConsultCode(
					(PastMedicalHistorySectionConsult) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionConsultCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidatePastMedicalHistorySectionConsultText() {
		OperationsTestCase<PastMedicalHistorySectionConsult> validatePastMedicalHistorySectionConsultTextTestCase = new OperationsTestCase<PastMedicalHistorySectionConsult>(
			"validatePastMedicalHistorySectionConsultText",
			operationsForOCL.getOCLValue("VALIDATE_PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PastMedicalHistorySectionConsult target) {

			}

			@Override
			protected void updateToPass(PastMedicalHistorySectionConsult target) {
				target.init();
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();

				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PastMedicalHistorySectionConsultOperations.validatePastMedicalHistorySectionConsultText(
					(PastMedicalHistorySectionConsult) objectToTest, diagnostician, map);
			}

		};

		validatePastMedicalHistorySectionConsultTextTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends PastMedicalHistorySectionConsultOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PastMedicalHistorySectionConsult> {

		public PastMedicalHistorySectionConsult create() {
			return CDTFactory.eINSTANCE.createPastMedicalHistorySectionConsult();
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
	private static class ConstructorTestClass extends PastMedicalHistorySectionConsultOperations {
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

} // PastMedicalHistorySectionConsultOperations
