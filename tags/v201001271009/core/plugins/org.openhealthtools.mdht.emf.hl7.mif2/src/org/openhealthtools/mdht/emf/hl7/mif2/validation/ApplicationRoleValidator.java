/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRoleAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.RelatedAppRole;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRole}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ApplicationRoleValidator {
	boolean validate();

	boolean validateAnnotations(ApplicationRoleAnnotations value);
	boolean validateRelatedApplicationRoles(EList<RelatedAppRole> value);
	boolean validateSendsInteractions(EList<PackageRef> value);
	boolean validateReceivesInteractions(EList<PackageRef> value);
	boolean validateCreatesDocuments(EList<PackageRef> value);
	boolean validateConsumesDocuments(EList<PackageRef> value);
}
