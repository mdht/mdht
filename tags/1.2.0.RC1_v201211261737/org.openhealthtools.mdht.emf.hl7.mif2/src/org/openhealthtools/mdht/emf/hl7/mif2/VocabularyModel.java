/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vocabulary Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A package containing information about the vocabulary artifacts defined by or used within a namespace realm.  May include vocabulary domains, code systems, value sets and/or runtime binding definitions.
 * UML: A stereotype on Package
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getDependsOnVocabModel <em>Depends On Vocab Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getConceptDomain <em>Concept Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getBindingRealm <em>Binding Realm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getContextBinding <em>Context Binding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getCodeTranslations <em>Code Translations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getCodeSystemSupplement <em>Code System Supplement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getDefinitionKind <em>Definition Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyModel()
 * @model extendedMetaData="name='VocabularyModel' kind='elementOnly'"
 * @generated
 */
public interface VocabularyModel extends org.openhealthtools.mdht.emf.hl7.mif2.Package {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descriptive information about the vocabulary model.
	 * UML: A collector for the comments and constraints associated with a vocabulary model.  (Consider rendering the definition or description annotation into ModelElement.documentation)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(VocabularyModelAnnotations)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyModel_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='annotations' namespace='##targetNamespace'"
	 * @generated
	 */
	VocabularyModelAnnotations getAnnotations();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(VocabularyModelAnnotations value);

	/**
	 * Returns the value of the '<em><b>Depends On Vocab Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a vocabulary model on whose contents the corrent model depends
	 * UML: Identifies a package from whom elements are auto-imported
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On Vocab Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyModel_DependsOnVocabModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependsOnVocabModel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArtifactDependency> getDependsOnVocabModel();

	/**
	 * Returns the value of the '<em><b>Concept Domain</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a vocabulary domain that constrains the value of one or more coded attributes in a static model.
	 * UML: ownedElement packages within the Package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept Domain</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyModel_ConceptDomain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conceptDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptDomain> getConceptDomain();

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a code system that is referenced by one or more value sets.
	 * UML: ownedElement packages within the Package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyModel_CodeSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystem> getCodeSystem();

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a value set that implements one or more vocabulary domains in a specified context.
	 * UML: ownedElement packages within the Package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyModel_ValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSet> getValueSet();

	/**
	 * Returns the value of the '<em><b>Binding Realm</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of binding realms relevant to this vocabulary model
	 * UML: Stereotype on Enumeration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Realm</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyModel_BindingRealm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bindingRealm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BindingRealm> getBindingRealm();

	/**
	 * Returns the value of the '<em><b>Context Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a value set that implements one or more vocabulary domains in a specified context.
	 * UML: ownedElement dependencies within the Package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Binding</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyModel_ContextBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contextBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContextBinding> getContextBinding();

	/**
	 * Returns the value of the '<em><b>Code Translations</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Captures known translations between codes from different code systems
	 * UML: ownedElement dependencies within the Package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Translations</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyModel_CodeTranslations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeTranslations' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeTranslationCollection> getCodeTranslations();

	/**
	 * Returns the value of the '<em><b>Code System Supplement</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemSupplement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about an extension to a code system that is referenced by one or mode value sets.  Created to allow code system extensions to be maintained as separate files
	 * UML: Stereotype on package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code System Supplement</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyModel_CodeSystemSupplement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystemSupplement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemSupplement> getCodeSystemSupplement();

	/**
	 * Returns the value of the '<em><b>Definition Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelDefinitionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies whether this rendering of the model represents a complete definition, a partial definition or merely "used vocabulary" associated with the underlying model
	 * UML: Tag on VocabularyModel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelDefinitionKind
	 * @see #isSetDefinitionKind()
	 * @see #unsetDefinitionKind()
	 * @see #setDefinitionKind(VocabularyModelDefinitionKind)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getVocabularyModel_DefinitionKind()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='definitionKind'"
	 * @generated
	 */
	VocabularyModelDefinitionKind getDefinitionKind();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getDefinitionKind <em>Definition Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Kind</em>' attribute.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelDefinitionKind
	 * @see #isSetDefinitionKind()
	 * @see #unsetDefinitionKind()
	 * @see #getDefinitionKind()
	 * @generated
	 */
	void setDefinitionKind(VocabularyModelDefinitionKind value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getDefinitionKind <em>Definition Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefinitionKind()
	 * @see #getDefinitionKind()
	 * @see #setDefinitionKind(VocabularyModelDefinitionKind)
	 * @generated
	 */
	void unsetDefinitionKind();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel#getDefinitionKind <em>Definition Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Definition Kind</em>' attribute is set.
	 * @see #unsetDefinitionKind()
	 * @see #getDefinitionKind()
	 * @see #setDefinitionKind(VocabularyModelDefinitionKind)
	 * @generated
	 */
	boolean isSetDefinitionKind();

} // VocabularyModel
