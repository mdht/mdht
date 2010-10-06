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
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ENXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartQualifier;

/**
 * This class is a JUnit4 test case.
 */
public class PNOperationsTest extends ENOperationsTest {

	@Override
	protected EObject getObjectToTest() {
		return DatatypesFactory.eINSTANCE.createPN();
	}

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Test
	public final void testNull() {
		@SuppressWarnings("unused")
		PNOperations obj = new PNOperations();
		assertTrue(true);
	} // testNull
	
	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.datatypes.operations.PNOperations#validateInvariant(org.openhealthtools.mdht.uml.hl7.datatypes.PN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateInvariant() {
		// self.delimiter->forAll(enxp : datatypes::ENXP | not
		// enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and
		// self.family->forAll(enxp : datatypes::ENXP | not
		// enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and
		// self.given->forAll(enxp : datatypes::ENXP | not
		// enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and
		// self.prefix->forAll(enxp : datatypes::ENXP | not
		// enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and
		// self.suffix->forAll(enxp : datatypes::ENXP | not
		// enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS))

		final PN pn = (PN) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(pn);

		boolean isValid = PNOperations
				.validateInvariant(pn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), isValid);

		// delimiter
		final ENXP delimiterENXP = DatatypesFactory.eINSTANCE.createENXP();
		delimiterENXP.getQualifiers().add(EntityNamePartQualifier.LS);

		pn.getDelimiters().add(delimiterENXP);

		isValid = PNOperations.validateInvariant(pn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
		pn.getDelimiters().clear();

		// family
		final ENXP familyENXP = DatatypesFactory.eINSTANCE.createENXP();
		familyENXP.getQualifiers().add(EntityNamePartQualifier.LS);

		pn.getFamilies().add(familyENXP);

		isValid = PNOperations.validateInvariant(pn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
		pn.getFamilies().clear();

		// given
		final ENXP givenENXP = DatatypesFactory.eINSTANCE.createENXP();
		givenENXP.getQualifiers().add(EntityNamePartQualifier.LS);

		pn.getGivens().add(givenENXP);

		isValid = PNOperations.validateInvariant(pn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
		pn.getGivens().clear();

		// prefix
		final ENXP prefixENXP = DatatypesFactory.eINSTANCE.createENXP();
		prefixENXP.getQualifiers().add(EntityNamePartQualifier.LS);

		pn.getPrefixes().add(prefixENXP);

		isValid = PNOperations.validateInvariant(pn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
		pn.getPrefixes().clear();

		// suffix
		final ENXP suffixENXP = DatatypesFactory.eINSTANCE.createENXP();
		suffixENXP.getQualifiers().add(EntityNamePartQualifier.LS);

		pn.getSuffixes().add(suffixENXP);

		isValid = PNOperations.validateInvariant(pn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
		// pn.getSuffixes().clear();
	} // testValidateInvariant

} // PNOperationsTest