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
import org.openhealthtools.mdht.uml.cda.ihe.HealthcareProvidersPharmacies;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class HealthcareProvidersPharmaciesOperationsTest extends CDAValidationTest {

	public static class OperationsForOCL extends HealthcareProvidersPharmaciesOperations {
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

	public class ObjectFactory implements TestObjectFactory<HealthcareProvidersPharmacies> {
		public HealthcareProvidersPharmacies create() {
			return IHEFactory.eINSTANCE.createHealthcareProvidersPharmacies();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateHealthcareProvidersPharmaciesTemplateId() {
		OperationsTestCase<HealthcareProvidersPharmacies> testCase = new OperationsTestCase<HealthcareProvidersPharmacies>(
			"Validate  HealthcareProvidersPharmaciesTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INTAKE_OUTPUT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthcareProvidersPharmacies target) {

			}

			@Override
			protected void updateToPass(HealthcareProvidersPharmacies target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return HealthcareProvidersPharmaciesOperations.validateHealthcareProvidersPharmaciesTemplateId(
					(HealthcareProvidersPharmacies) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.hl7.rim.operations.RIMOperationTest#getObjectToTest()
	 */
	@Override
	protected EObject getObjectToTest() {
		return objectFactory.create();
	}

} // HealthcareProvidersPharmaciesOperationsTest
