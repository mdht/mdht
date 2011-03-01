/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.RealmElement;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.BusinessName}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BusinessNameValidator {
	boolean validate();

	boolean validateContext(FeatureMap value);
	boolean validateRealmNamespace(EList<RealmElement> value);
	boolean validateCascadeInfo(AnnotationCascadeInfo value);
	boolean validateLang(String value);
	boolean validateName(String value);
}