/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationSectionOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class MedicationsSectionOperationsTest extends MedicationSectionOperationsTest {

	public static class OperationsForOCL extends MedicationsSectionOperations {
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

	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	public class ObjectFactory implements TestObjectFactory<MedicationsSection> {
		public MedicationsSection create() {
			return IHEFactory.eINSTANCE.createMedicationsSection();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationsSectionOperations#validateIHEMedicationsSectionTemplateId(org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateIHEMedicationsSectionTemplateId() {
		OperationsTestCase<MedicationsSection> testCase = new OperationsTestCase<MedicationsSection>(
			"ValidateIHEMedicationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IHE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationsSectionOperations.validateIHEMedicationsSectionTemplateId(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationsSectionOperations#validateIHEMedicationsSectionMedication(org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateIHEMedicationsSectionMedication() {
		OperationsTestCase<MedicationsSection> testCase = new OperationsTestCase<MedicationsSection>(
			"ValidateIHEMedicationsSectionMedication",
			operationsForOCL.getOCLValue("VALIDATE_IHE_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationsSectionOperations.validateIHEMedicationsSectionMedication(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationsSectionOperations#getMedications(org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection)}.
	 */
	@Test
	public void testGetMedications() {

	}

}// MedicationsSectionOperationsTest
