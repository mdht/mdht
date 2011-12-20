/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactDependency;
import org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystem;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding;
import org.openhealthtools.mdht.emf.hl7.mif2.ValueSet;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelDefinitionKind;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VocabularyModelValidator {
	boolean validate();

	boolean validateAnnotations(VocabularyModelAnnotations value);
	boolean validateDependsOnVocabModel(EList<ArtifactDependency> value);
	boolean validateConceptDomain(EList<ConceptDomain> value);
	boolean validateCodeSystem(EList<CodeSystem> value);
	boolean validateValueSet(EList<ValueSet> value);
	boolean validateBindingRealm(EList<BindingRealm> value);
	boolean validateContextBinding(EList<ContextBinding> value);
	boolean validateCodeTranslations(EList<CodeTranslationCollection> value);
	boolean validateCodeSystemSupplement(EList<CodeSystemSupplement> value);
	boolean validateDefinitionKind(VocabularyModelDefinitionKind value);
}