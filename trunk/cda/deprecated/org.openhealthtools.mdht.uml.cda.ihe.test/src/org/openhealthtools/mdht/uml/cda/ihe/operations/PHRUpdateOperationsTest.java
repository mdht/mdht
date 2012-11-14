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
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.PHRUpdate;

/**
 * This class
 */
@SuppressWarnings("nls")
public class PHRUpdateOperationsTest extends MedicalSummaryOperationsTest {

	public static class OperationsForOCL extends PHRUpdateOperations {
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

	public class ObjectFactory implements TestObjectFactory<PHRUpdate> {
		public PHRUpdate create() {
			return IHEFactory.eINSTANCE.createPHRUpdate();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidatePHRUpdateTemplateId() {
		OperationsTestCase<PHRUpdate> testCase = new OperationsTestCase<PHRUpdate>(
			"Validate PHRUpdateTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IHE_LANGUAGE_COMMUNICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PHRUpdate target) {

			}

			@Override
			protected void updateToPass(PHRUpdate target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PHRUpdateOperations.validatePHRUpdateTemplateId((PHRUpdate) objectToTest, diagnostician, map);
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
} // PHRUpdateOperationsTest
