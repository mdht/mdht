/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import java.math.BigInteger;

import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.TestBase}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TestBaseValidator {
	boolean validate();

	boolean validateObjective(ComplexMarkupWithLanguage value);
	boolean validateDataVariation(ComplexMarkupWithLanguage value);
	boolean validateName(String value);
	boolean validateSequence(BigInteger value);
}