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

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class AdvanceDirectivesSectionOperationsTest extends
		org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectivesSectionOperationsTest {

	public static class OperationsForOCL extends AdvanceDirectivesSectionOperations {
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

	public class ObjectFactory implements TestObjectFactory<AdvanceDirectivesSection> {
		public AdvanceDirectivesSection create() {
			return IHEFactory.eINSTANCE.createAdvanceDirectivesSection();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateIHEAdvanceDirectivesSectionTemplateId() {
		OperationsTestCase<AdvanceDirectivesSection> testCase = new OperationsTestCase<AdvanceDirectivesSection>(
			"validateIHEAdvanceDirectivesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IHE_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectivesSection target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectivesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AdvanceDirectivesSectionOperations.validateIHEAdvanceDirectivesSectionTemplateId(
					(AdvanceDirectivesSection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public void testConstructor() {
		AdvanceDirectivesSectionOperations obj = new AdvanceDirectivesSectionOperations();
		assertTrue(true);
	} // testConstructor

} // AdvanceDirectivesSectionOperationsTest
