/**
 * Copyright (c) 2010 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.CCDValidationTest;
import org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;

/**
 * This class is a JUnit4 test case.
 * 
 * Should extend SectionOpertionsTest if it existed.
 */
@SuppressWarnings("nls")
public class AdmissionMedicationHistorySectionOperationsTest extends
		CCDValidationTest {
	
	public static class OperationsForOCL extends AdmissionMedicationHistorySectionOperations {
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

	
	public class ObjectFactory implements TestObjectFactory<AdmissionMedicationHistorySection> {
		public AdmissionMedicationHistorySection create() {
			return IHEFactory.eINSTANCE.createAdmissionMedicationHistorySection();
		}
	}
	
	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		AdmissionMedicationHistorySectionOperations obj = new AdmissionMedicationHistorySectionOperations();
		assertTrue(true);
	} // testConstructor

	@Override
	protected EObject getObjectToTest() {		
		return null;
	}
	
	@Test
	public void testValidateAdmissionMedicationHistorySectionTemplateId() {
		OperationsTestCase<AdmissionMedicationHistorySection> testCase = new OperationsTestCase<AdmissionMedicationHistorySection>(
				"validateAdmissionMedicationHistorySectionTemplateId", operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationHistorySection target) {

			}

			@Override
			protected void updateToPass(AdmissionMedicationHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AdmissionMedicationHistorySectionOperations.validateAdmissionMedicationHistorySectionTemplateId((AdmissionMedicationHistorySection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateAdmissionMedicationHistorySectionCode() {
		
		
		/*
		 * Method method = ... // obtain method object
Annotation annotation = method.getAnnotation(MyAnnotation.class);

if(annotation instanceof MyAnnotation){
    MyAnnotation myAnnotation = (MyAnnotation) annotation;
    System.out.println("name: " + myAnnotation.name());
    System.out.println("value: " + myAnnotation.value());
}

		 */
		
		
		OperationsTestCase<AdmissionMedicationHistorySection> testCase = new OperationsTestCase<AdmissionMedicationHistorySection>(
				"validateAdmissionMedicationHistorySectionCode", operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationHistorySection target) {

			}

			@Override
			protected void updateToPass(AdmissionMedicationHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AdmissionMedicationHistorySectionOperations.validateAdmissionMedicationHistorySectionCode((AdmissionMedicationHistorySection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

} // AdmissionMedicationHistorySectionOperationsTest