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
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings({ "nls", "serial" })
public class ProductInstanceOperationsTest extends StructuralAttributeValidationTest {

	protected static final String PRODUCT_INSTANCE_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.52";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(CLASS_CODE_ATTRIBUTE_NAME, RoleClassRoot.MANU);
		}
	};

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
	// -------------------------------------------------------------
	new TemplateIDValidationTest(PRODUCT_INSTANCE_TEMPLATE_ID) {

		@Override
		protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			return ProductInstanceOperations.validateProductInstanceTemplateId(
				(ProductInstance) objectToTest, diagnostician, map);
		}

	}

	}; // TEST_CASE_ARRAY

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	@Override
	protected EObject getObjectToTest() {
		return CCDFactory.eINSTANCE.createProductInstance();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createProductInstance().init();
	}

	@Override
	protected Enumerator doGetValidStructuralAttributeValue(final String structuralAttributeName) {
		return VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP.get(structuralAttributeName);
	}

	@Override
	protected boolean doValidateStructuralAttributeValues(final EObject eObjectToValidate,
			final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
		return ProductInstanceOperations.validateProductInstanceClassCode(
			(ProductInstance) eObjectToValidate, diagnostician, map);
	}

} // ProductInstanceOperationsTest
