/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.Header;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageKind;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.Package}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PackageValidator {
	boolean validate();

	boolean validatePackageLocation(PackageRef value);
	boolean validateHeader(Header value);
	boolean validateReplaces(EList<PackageRef> value);
	boolean validateReplacedBy(EList<PackageRef> value);
	boolean validateHashCode(String value);
	boolean validatePackageKind(PackageKind value);
	boolean validateSecondaryId(String value);
	boolean validateTitle(String value);
}
