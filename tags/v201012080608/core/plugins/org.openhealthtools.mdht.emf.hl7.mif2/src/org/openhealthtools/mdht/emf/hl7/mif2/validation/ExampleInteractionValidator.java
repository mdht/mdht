/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import java.math.BigInteger;

import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExampleInteractionValidator {
	boolean validate();

	boolean validateInteraction(PackageRef value);
	boolean validateReceivingSystem(String value);
	boolean validateSendingSystem(String value);
	boolean validateSequence(BigInteger value);
}