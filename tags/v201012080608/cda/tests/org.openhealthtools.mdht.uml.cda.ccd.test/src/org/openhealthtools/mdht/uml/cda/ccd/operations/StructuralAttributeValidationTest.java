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
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public abstract class StructuralAttributeValidationTest extends
		CCDValidationTest {

	final static String CLASS_CODE_ATTRIBUTE_NAME = "classCode";
	// final static String DETERMINER_CODE_ATTRIBUTE_NAME = "determinerCode";
	final static String MOOD_CODE_ATTRIBUTE_NAME = "moodCode";
	// final static String TYPE_CODE_ATTRIBUTE_NAME = "typeCode";

	final static List<String> STRUCTURAL_ATTRIBUTE_NAMES = Arrays.asList(
			CLASS_CODE_ATTRIBUTE_NAME, /* DETERMINER_CODE_ATTRIBUTE_NAME, */
			MOOD_CODE_ATTRIBUTE_NAME /* , TYPE_CODE_ATTRIBUTE_NAME */);

	/**
	 * This test validates all of the structural attributes
	 */
	@Test
	public final void testValidateStructuralAttributes() {

		final EObject objectToTest = getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(objectToTest);

		for (final String structuralAttributeName : STRUCTURAL_ATTRIBUTE_NAMES) {
			final EStructuralFeature structuralFeature = objectToTest.eClass()
					.getEStructuralFeature(structuralAttributeName);
			// Did we get it?
			if (structuralFeature != null) {
				// Yes
				objectToTest
						.eSet(
								structuralFeature,
								doGetValidStructuralAttributeValue(structuralAttributeName));
			}
		} // for each suffix

		final boolean isValid = doValidateStructuralAttributeValues(
				objectToTest, diagnostician, map);
		assertTrue("Validation passed when it was expected to fail", isValid);

	} // testValidateStructuralAttributes

	/**
	 * @param structuralAttributeName
	 * @return the valid value for the attribute for the eObjectToValidate
	 */
	protected abstract Enumerator doGetValidStructuralAttributeValue(
			String structuralAttributeName);

	/**
	 * @param eObjectToValidate
	 *            TODO
	 * @param diagnostician
	 *            TODO
	 * @param map
	 *            TODO
	 * @return true if all of the values of the structural attributes of the
	 *         eObjectToValidate validate
	 */
	protected abstract boolean doValidateStructuralAttributeValues(
			EObject eObjectToValidate, BasicDiagnostic diagnostician,
			Map<Object, Object> map);

} // StructuralAttributeValidationTest