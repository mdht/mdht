/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.w3c.xhtml.validation;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.w3c.xhtml.AlignType;
import org.openhealthtools.mdht.emf.w3c.xhtml.MifClassType;
import org.openhealthtools.mdht.emf.w3c.xhtml.StyleSheet;
import org.openhealthtools.mdht.emf.w3c.xhtml.Tr;
import org.openhealthtools.mdht.emf.w3c.xhtml.ValignType;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.w3c.xhtml.Tbody}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TbodyValidator {
	boolean validate();

	boolean validateTr(EList<Tr> value);
	boolean validateAlign(AlignType value);
	boolean validateChar(String value);
	boolean validateCharoff(String value);
	boolean validateClass(MifClassType value);
	boolean validateLang(String value);
	boolean validateStyle(StyleSheet value);
	boolean validateValign(ValignType value);
}