/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.w3c.xhtml.validation;

import org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType;
import org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.w3c.xhtml.Caption}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CaptionValidator {
	boolean validate();

	boolean validateClass(MifClassType value);
	boolean validateLang(String value);
	boolean validateStyle(StyleSheet value);
}
