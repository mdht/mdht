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
import static org.junit.Assert.fail;

import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperationsTest;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class HealthcareProvidersPharmaciesOperationsTest extends ParticipationOperationsTest {

	/**
	 * @see org.openhealthtools.mdht.uml.hl7.rim.operations.RIMOperationTest#getObjectToTest()
	 */
	@Override
	protected EObject getObjectToTest() {
		return IHEFactory.eINSTANCE.createHealthcareProvidersPharmacies();
	}

	/**
	 * @see org.openhealthtools.mdht.uml.hl7.rim.operations.RIMOperationTest#getObjectInitToTest()
	 */
	@Override
	protected EObject getObjectInitToTest() {
		return IHEFactory.eINSTANCE.createHealthcareProvidersPharmacies().init();
	}

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		HealthcareProvidersPharmaciesOperations obj = new HealthcareProvidersPharmaciesOperations();
		assertTrue(true);
	} // testConstructor

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.HealthcareProvidersPharmaciesOperations#validateHealthcareProvidersPharmaciesTemplateId(org.openhealthtools.mdht.uml.cda.ihe.HealthcareProvidersPharmacies, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHealthcareProvidersPharmaciesTemplateId() {
		fail("Not yet implemented");
	}

} // HealthcareProvidersPharmaciesOperationsTest
