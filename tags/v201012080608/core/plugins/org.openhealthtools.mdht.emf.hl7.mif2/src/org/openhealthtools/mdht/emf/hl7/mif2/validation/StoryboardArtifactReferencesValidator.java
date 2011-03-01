/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.DiagramGraphicInformation;
import org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction;
import org.openhealthtools.mdht.emf.hl7.mif2.ExampleSystem;
import org.openhealthtools.mdht.emf.w3c.xhtml.Img;


/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardArtifactReferences}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StoryboardArtifactReferencesValidator {
	boolean validate();

	boolean validateSystem(EList<ExampleSystem> value);
	boolean validateInteraction(EList<ExampleInteraction> value);
	boolean validateGraphicRepresentation(DiagramGraphicInformation value);
	boolean validateFigure(Img value);
}