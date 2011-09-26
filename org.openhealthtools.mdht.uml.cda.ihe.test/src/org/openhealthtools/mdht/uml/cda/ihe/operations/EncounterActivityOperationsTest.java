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
import org.openhealthtools.mdht.uml.cda.ihe.EncounterActivity;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;

/**
 * This class
 */
@SuppressWarnings("nls")
public class EncounterActivityOperationsTest extends EncounterEntryOperationsTest {

	public static class OperationsForOCL extends EncounterActivityOperations {
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

	public class ObjectFactory implements TestObjectFactory<EncounterActivity> {
		public EncounterActivity create() {
			return IHEFactory.eINSTANCE.createEncounterActivity();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateEncounterActivityTemplateId() {
		OperationsTestCase<EncounterActivity> testCase = new OperationsTestCase<EncounterActivity>(
			"Validate  EncounterActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INTAKE_OUTPUT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterActivity target) {

			}

			@Override
			protected void updateToPass(EncounterActivity target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return EncounterActivityOperations.validateEncountersActivityTemplateId(
					(EncounterActivity) objectToTest, diagnostician, map);
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
} // EncounterActivityOperationsTest
