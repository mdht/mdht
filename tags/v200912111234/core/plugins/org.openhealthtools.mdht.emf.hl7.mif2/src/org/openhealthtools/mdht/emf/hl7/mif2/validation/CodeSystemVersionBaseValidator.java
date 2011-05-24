/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.TerminologyServer;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CodeSystemVersionBaseValidator {
	boolean validate();

	boolean validateAnnotations(CodeSystemVersionAnnotations value);
	boolean validatePublicTerminologyServer(EList<TerminologyServer> value);
	boolean validateSupportedLanguage(EList<String> value);
	boolean validateHl7ApprovedIndicator(boolean value);
	boolean validateHl7MaintainedIndicator(boolean value);
	boolean validatePublisherVersionId(String value);
	boolean validateReleaseDate(XMLGregorianCalendar value);
}