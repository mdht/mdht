/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptRef;
import org.openhealthtools.mdht.emf.hl7.mif2.MapRelationshipKind;
import org.openhealthtools.mdht.emf.hl7.mif2.TranslatableDirectionKind;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CodeTranslationValidator {
	boolean validate();

	boolean validateAnnotations(CodeTranslationAnnotations value);
	boolean validateSourceConcept(ConceptRef value);
	boolean validateTargetConcept(ConceptRef value);
	boolean validateQuality(MapRelationshipKind value);
	boolean validateSortKey(String value);
	boolean validateTranslatableDirection(TranslatableDirectionKind value);
}
