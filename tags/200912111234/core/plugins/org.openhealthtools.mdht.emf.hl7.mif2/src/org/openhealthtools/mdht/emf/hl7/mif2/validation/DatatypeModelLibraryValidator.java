/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.Datatype;
import org.openhealthtools.mdht.emf.hl7.mif2.ImportDatatypeModelLibrary;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DatatypeModelLibraryValidator {
	boolean validate();

	boolean validateImportedVocabularyModelPackage(PackageRef value);
	boolean validateImportDatatypeModelLibrary(ImportDatatypeModelLibrary value);
	boolean validateImportAnnotationLibrary(PackageRef value);
	boolean validateDatatype(EList<Datatype> value);
}
