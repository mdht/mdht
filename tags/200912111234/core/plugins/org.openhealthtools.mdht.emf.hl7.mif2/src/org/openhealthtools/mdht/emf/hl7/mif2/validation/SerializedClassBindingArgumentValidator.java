/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassBindingArgument}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SerializedClassBindingArgumentValidator {
	boolean validate();

	boolean validateArgumentClass(ClassOrReference value);
}
