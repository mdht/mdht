/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.LocalClassRef;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnd;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassGeneralization;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClass}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SerializedClassValidator {
	boolean validate();

	boolean validateChildClass(EList<SerializedClassGeneralization> value);
	boolean validateParentClass(EList<LocalClassRef> value);
	boolean validateAssociation(EList<SerializedAssociationEnd> value);
}