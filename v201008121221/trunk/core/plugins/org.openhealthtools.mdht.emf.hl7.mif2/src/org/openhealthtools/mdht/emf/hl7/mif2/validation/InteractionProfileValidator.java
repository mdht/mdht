/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.BoundStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints;
import org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileKind;
import org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModel;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InteractionProfileValidator {
	boolean validate();

	boolean validateAnnotations(InteractionProfileAnnotations value);
	boolean validateImplementationConstraints(ImplementationMessageConstraints value);
	boolean validateArgumentMessage(BoundStaticModel value);
	boolean validateEffectiveStaticModel(SerializedStaticModel value);
	boolean validateReceiverResponsibilities(EList<ReceiverResponsibility> value);
	boolean validateInternalMapping(ComplexMarkupWithLanguage value);
	boolean validateProfileType(InteractionProfileKind value);
}
