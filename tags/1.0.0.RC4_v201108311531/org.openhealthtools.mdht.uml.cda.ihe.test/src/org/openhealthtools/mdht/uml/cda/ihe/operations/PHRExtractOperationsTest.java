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
import org.openhealthtools.mdht.uml.cda.ihe.PHRExtract;

/**
 * This class
 */
@SuppressWarnings("nls")
public class PHRExtractOperationsTest extends MedicalSummaryOperationsTest {

	public static class OperationsForOCL extends PHRExtractOperations {
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

	public class ObjectFactory implements TestObjectFactory<PHRExtract> {
		public PHRExtract create() {
			return IHEFactory.eINSTANCE.createPHRExtract();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidatePHRExtractTemplateId() {
		OperationsTestCase<PHRExtract> testCase = new OperationsTestCase<PHRExtract>(
			"Validate PHRExtractTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHR_EXTRACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PHRExtract target) {

			}

			@Override
			protected void updateToPass(PHRExtract target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PHRExtractOperations.validatePHRExtractTemplateId((PHRExtract) objectToTest, diagnostician, map);
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

} // PHRExtractOperationsTest
