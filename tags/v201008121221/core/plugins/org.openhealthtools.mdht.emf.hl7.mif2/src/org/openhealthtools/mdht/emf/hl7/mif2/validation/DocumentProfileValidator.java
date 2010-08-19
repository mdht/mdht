/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileKind;
import org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModel;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DocumentProfileValidator {
	boolean validate();

	boolean validateAnnotations(DocumentProfileAnnotations value);
	boolean validateDocument(PackageRef value);
	boolean validateImplementationConstraints(ImplementationConstraints value);
	boolean validateEffectiveStaticModel(SerializedStaticModel value);
	boolean validateProfileType(DocumentProfileKind value);
}
