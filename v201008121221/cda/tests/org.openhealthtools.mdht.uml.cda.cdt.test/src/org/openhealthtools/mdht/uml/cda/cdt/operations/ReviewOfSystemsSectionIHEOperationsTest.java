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
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import static org.junit.Assert.fail;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperationsTest;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class ReviewOfSystemsSectionIHEOperationsTest extends
		SectionOperationsTest {

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ReviewOfSystemsSectionIHEOperations#validateReviewOfSystemsSectionIHETemplateId(org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateReviewOfSystemsSectionIHETemplateId() {
		ReviewOfSystemsSectionIHE objectToTest = (ReviewOfSystemsSectionIHE) getObjectToTest();
		ReviewOfSystemsSectionIHEOperations
				.validateReviewOfSystemsSectionIHETemplateId(objectToTest,
						Diagnostician.INSTANCE
								.createDefaultDiagnostic(objectToTest), map);

		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ReviewOfSystemsSectionIHEOperations#validateReviewOfSystemsSectionIHECode(org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateReviewOfSystemsSectionIHECode() {
		ReviewOfSystemsSectionIHE objectToTest = (ReviewOfSystemsSectionIHE) getObjectToTest();
		ReviewOfSystemsSectionIHEOperations
				.validateReviewOfSystemsSectionIHECode(objectToTest,
						Diagnostician.INSTANCE
								.createDefaultDiagnostic(objectToTest), map);
		fail("Not yet implemented");
	}

} // ReviewOfSystemsSectionIHEOperationsTest