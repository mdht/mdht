/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.core.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openhealthtools.mdht.cts2.core.AbstractResourceDescription;
import org.openhealthtools.mdht.cts2.core.AbstractResourceDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.AnonymousEntityReference;
import org.openhealthtools.mdht.cts2.core.AnonymousStatement;
import org.openhealthtools.mdht.cts2.core.AssociationReference;
import org.openhealthtools.mdht.cts2.core.BindingQualifierReference;
import org.openhealthtools.mdht.cts2.core.CaseSignificanceReference;
import org.openhealthtools.mdht.cts2.core.ChangeDescription;
import org.openhealthtools.mdht.cts2.core.ChangeSetBase;
import org.openhealthtools.mdht.cts2.core.Changeable;
import org.openhealthtools.mdht.cts2.core.CodeSystemCategoryReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.Comment;
import org.openhealthtools.mdht.cts2.core.ConceptDomainReference;
import org.openhealthtools.mdht.cts2.core.ContextReference;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.Definition;
import org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem;
import org.openhealthtools.mdht.cts2.core.DesignationFidelityReference;
import org.openhealthtools.mdht.cts2.core.DesignationTypeReference;
import org.openhealthtools.mdht.cts2.core.Directory;
import org.openhealthtools.mdht.cts2.core.DirectoryEntry;
import org.openhealthtools.mdht.cts2.core.DocumentRoot;
import org.openhealthtools.mdht.cts2.core.EntityExpression;
import org.openhealthtools.mdht.cts2.core.EntityReference;
import org.openhealthtools.mdht.cts2.core.EntityReferenceList;
import org.openhealthtools.mdht.cts2.core.EntitySynopsis;
import org.openhealthtools.mdht.cts2.core.EntryDescription;
import org.openhealthtools.mdht.cts2.core.Example;
import org.openhealthtools.mdht.cts2.core.Filter;
import org.openhealthtools.mdht.cts2.core.FilterComponent;
import org.openhealthtools.mdht.cts2.core.Finalizable;
import org.openhealthtools.mdht.cts2.core.FormalityLevelReference;
import org.openhealthtools.mdht.cts2.core.FormatReference;
import org.openhealthtools.mdht.cts2.core.LanguageReference;
import org.openhealthtools.mdht.cts2.core.MapCorrelationReference;
import org.openhealthtools.mdht.cts2.core.MapReference;
import org.openhealthtools.mdht.cts2.core.MapVersionReference;
import org.openhealthtools.mdht.cts2.core.MatchAlgorithmReference;
import org.openhealthtools.mdht.cts2.core.Message;
import org.openhealthtools.mdht.cts2.core.ModelAttributeReference;
import org.openhealthtools.mdht.cts2.core.NameAndMeaningReference;
import org.openhealthtools.mdht.cts2.core.NamedEntityReference;
import org.openhealthtools.mdht.cts2.core.NamespaceReference;
import org.openhealthtools.mdht.cts2.core.Note;
import org.openhealthtools.mdht.cts2.core.OntologyDomainReference;
import org.openhealthtools.mdht.cts2.core.OntologyEngineeringMethodologyReference;
import org.openhealthtools.mdht.cts2.core.OntologyEngineeringToolReference;
import org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax;
import org.openhealthtools.mdht.cts2.core.OntologyLanguageReference;
import org.openhealthtools.mdht.cts2.core.OntologySyntaxReference;
import org.openhealthtools.mdht.cts2.core.OntologyTaskReference;
import org.openhealthtools.mdht.cts2.core.OntologyTypeReference;
import org.openhealthtools.mdht.cts2.core.OpaqueData;
import org.openhealthtools.mdht.cts2.core.Parameter;
import org.openhealthtools.mdht.cts2.core.PredicateReference;
import org.openhealthtools.mdht.cts2.core.Property;
import org.openhealthtools.mdht.cts2.core.PropertyReference;
import org.openhealthtools.mdht.cts2.core.RESTResource;
import org.openhealthtools.mdht.cts2.core.ReasoningAlgorithmReference;
import org.openhealthtools.mdht.cts2.core.ResourceDescription;
import org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescription;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.RoleReference;
import org.openhealthtools.mdht.cts2.core.ScopedEntityName;
import org.openhealthtools.mdht.cts2.core.SortCriteria;
import org.openhealthtools.mdht.cts2.core.SortCriterion;
import org.openhealthtools.mdht.cts2.core.SourceAndNotation;
import org.openhealthtools.mdht.cts2.core.SourceAndRoleReference;
import org.openhealthtools.mdht.cts2.core.SourceReference;
import org.openhealthtools.mdht.cts2.core.StatementTarget;
import org.openhealthtools.mdht.cts2.core.StatusReference;
import org.openhealthtools.mdht.cts2.core.TsAnyType;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;
import org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference;
import org.openhealthtools.mdht.cts2.core.ValueSetReference;
import org.openhealthtools.mdht.cts2.core.VersionTagReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION: {
				AbstractResourceDescription abstractResourceDescription = (AbstractResourceDescription) theEObject;
				T result = caseAbstractResourceDescription(abstractResourceDescription);
				if (result == null) {
					result = caseResourceDescription(abstractResourceDescription);
				}
				if (result == null) {
					result = caseChangeable(abstractResourceDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY: {
				AbstractResourceDescriptionDirectoryEntry abstractResourceDescriptionDirectoryEntry = (AbstractResourceDescriptionDirectoryEntry) theEObject;
				T result = caseAbstractResourceDescriptionDirectoryEntry(abstractResourceDescriptionDirectoryEntry);
				if (result == null) {
					result = caseResourceDescriptionDirectoryEntry(abstractResourceDescriptionDirectoryEntry);
				}
				if (result == null) {
					result = caseDirectoryEntry(abstractResourceDescriptionDirectoryEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ANONYMOUS_ENTITY_REFERENCE: {
				AnonymousEntityReference anonymousEntityReference = (AnonymousEntityReference) theEObject;
				T result = caseAnonymousEntityReference(anonymousEntityReference);
				if (result == null) {
					result = caseEntityReference(anonymousEntityReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ANONYMOUS_STATEMENT: {
				AnonymousStatement anonymousStatement = (AnonymousStatement) theEObject;
				T result = caseAnonymousStatement(anonymousStatement);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ASSOCIATION_REFERENCE: {
				AssociationReference associationReference = (AssociationReference) theEObject;
				T result = caseAssociationReference(associationReference);
				if (result == null) {
					result = caseNameAndMeaningReference(associationReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.BINDING_QUALIFIER_REFERENCE: {
				BindingQualifierReference bindingQualifierReference = (BindingQualifierReference) theEObject;
				T result = caseBindingQualifierReference(bindingQualifierReference);
				if (result == null) {
					result = caseNameAndMeaningReference(bindingQualifierReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.CASE_SIGNIFICANCE_REFERENCE: {
				CaseSignificanceReference caseSignificanceReference = (CaseSignificanceReference) theEObject;
				T result = caseCaseSignificanceReference(caseSignificanceReference);
				if (result == null) {
					result = caseNameAndMeaningReference(caseSignificanceReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.CHANGEABLE: {
				Changeable changeable = (Changeable) theEObject;
				T result = caseChangeable(changeable);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.CHANGE_DESCRIPTION: {
				ChangeDescription changeDescription = (ChangeDescription) theEObject;
				T result = caseChangeDescription(changeDescription);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.CHANGE_SET_BASE: {
				ChangeSetBase changeSetBase = (ChangeSetBase) theEObject;
				T result = caseChangeSetBase(changeSetBase);
				if (result == null) {
					result = caseFinalizable(changeSetBase);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.CODE_SYSTEM_CATEGORY_REFERENCE: {
				CodeSystemCategoryReference codeSystemCategoryReference = (CodeSystemCategoryReference) theEObject;
				T result = caseCodeSystemCategoryReference(codeSystemCategoryReference);
				if (result == null) {
					result = caseNameAndMeaningReference(codeSystemCategoryReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.CODE_SYSTEM_REFERENCE: {
				CodeSystemReference codeSystemReference = (CodeSystemReference) theEObject;
				T result = caseCodeSystemReference(codeSystemReference);
				if (result == null) {
					result = caseNameAndMeaningReference(codeSystemReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE: {
				CodeSystemVersionReference codeSystemVersionReference = (CodeSystemVersionReference) theEObject;
				T result = caseCodeSystemVersionReference(codeSystemVersionReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.COMMENT: {
				Comment comment = (Comment) theEObject;
				T result = caseComment(comment);
				if (result == null) {
					result = caseNote(comment);
				}
				if (result == null) {
					result = caseEntryDescription(comment);
				}
				if (result == null) {
					result = caseOpaqueData(comment);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.CONCEPT_DOMAIN_REFERENCE: {
				ConceptDomainReference conceptDomainReference = (ConceptDomainReference) theEObject;
				T result = caseConceptDomainReference(conceptDomainReference);
				if (result == null) {
					result = caseNameAndMeaningReference(conceptDomainReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.CONTEXT_REFERENCE: {
				ContextReference contextReference = (ContextReference) theEObject;
				T result = caseContextReference(contextReference);
				if (result == null) {
					result = caseNameAndMeaningReference(contextReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.DEFINITION: {
				Definition definition = (Definition) theEObject;
				T result = caseDefinition(definition);
				if (result == null) {
					result = caseNote(definition);
				}
				if (result == null) {
					result = caseEntryDescription(definition);
				}
				if (result == null) {
					result = caseOpaqueData(definition);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM: {
				DescriptionInCodeSystem descriptionInCodeSystem = (DescriptionInCodeSystem) theEObject;
				T result = caseDescriptionInCodeSystem(descriptionInCodeSystem);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.DESIGNATION_FIDELITY_REFERENCE: {
				DesignationFidelityReference designationFidelityReference = (DesignationFidelityReference) theEObject;
				T result = caseDesignationFidelityReference(designationFidelityReference);
				if (result == null) {
					result = caseNameAndMeaningReference(designationFidelityReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.DESIGNATION_TYPE_REFERENCE: {
				DesignationTypeReference designationTypeReference = (DesignationTypeReference) theEObject;
				T result = caseDesignationTypeReference(designationTypeReference);
				if (result == null) {
					result = caseNameAndMeaningReference(designationTypeReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.DIRECTORY: {
				Directory directory = (Directory) theEObject;
				T result = caseDirectory(directory);
				if (result == null) {
					result = caseMessage(directory);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.DIRECTORY_ENTRY: {
				DirectoryEntry directoryEntry = (DirectoryEntry) theEObject;
				T result = caseDirectoryEntry(directoryEntry);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ENTITY_EXPRESSION: {
				EntityExpression entityExpression = (EntityExpression) theEObject;
				T result = caseEntityExpression(entityExpression);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ENTITY_REFERENCE: {
				EntityReference entityReference = (EntityReference) theEObject;
				T result = caseEntityReference(entityReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ENTITY_REFERENCE_LIST: {
				EntityReferenceList entityReferenceList = (EntityReferenceList) theEObject;
				T result = caseEntityReferenceList(entityReferenceList);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ENTITY_SYNOPSIS: {
				EntitySynopsis entitySynopsis = (EntitySynopsis) theEObject;
				T result = caseEntitySynopsis(entitySynopsis);
				if (result == null) {
					result = caseURIAndEntityName(entitySynopsis);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ENTRY_DESCRIPTION: {
				EntryDescription entryDescription = (EntryDescription) theEObject;
				T result = caseEntryDescription(entryDescription);
				if (result == null) {
					result = caseOpaqueData(entryDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.EXAMPLE: {
				Example example = (Example) theEObject;
				T result = caseExample(example);
				if (result == null) {
					result = caseNote(example);
				}
				if (result == null) {
					result = caseEntryDescription(example);
				}
				if (result == null) {
					result = caseOpaqueData(example);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.FILTER: {
				Filter filter = (Filter) theEObject;
				T result = caseFilter(filter);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.FILTER_COMPONENT: {
				FilterComponent filterComponent = (FilterComponent) theEObject;
				T result = caseFilterComponent(filterComponent);
				if (result == null) {
					result = casePropertyReference(filterComponent);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.FINALIZABLE: {
				Finalizable finalizable = (Finalizable) theEObject;
				T result = caseFinalizable(finalizable);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.FORMALITY_LEVEL_REFERENCE: {
				FormalityLevelReference formalityLevelReference = (FormalityLevelReference) theEObject;
				T result = caseFormalityLevelReference(formalityLevelReference);
				if (result == null) {
					result = caseNameAndMeaningReference(formalityLevelReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.FORMAT_REFERENCE: {
				FormatReference formatReference = (FormatReference) theEObject;
				T result = caseFormatReference(formatReference);
				if (result == null) {
					result = caseNameAndMeaningReference(formatReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.LANGUAGE_REFERENCE: {
				LanguageReference languageReference = (LanguageReference) theEObject;
				T result = caseLanguageReference(languageReference);
				if (result == null) {
					result = caseNameAndMeaningReference(languageReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.MAP_CORRELATION_REFERENCE: {
				MapCorrelationReference mapCorrelationReference = (MapCorrelationReference) theEObject;
				T result = caseMapCorrelationReference(mapCorrelationReference);
				if (result == null) {
					result = caseNameAndMeaningReference(mapCorrelationReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.MAP_REFERENCE: {
				MapReference mapReference = (MapReference) theEObject;
				T result = caseMapReference(mapReference);
				if (result == null) {
					result = caseNameAndMeaningReference(mapReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.MAP_VERSION_REFERENCE: {
				MapVersionReference mapVersionReference = (MapVersionReference) theEObject;
				T result = caseMapVersionReference(mapVersionReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.MATCH_ALGORITHM_REFERENCE: {
				MatchAlgorithmReference matchAlgorithmReference = (MatchAlgorithmReference) theEObject;
				T result = caseMatchAlgorithmReference(matchAlgorithmReference);
				if (result == null) {
					result = caseNameAndMeaningReference(matchAlgorithmReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.MESSAGE: {
				Message message = (Message) theEObject;
				T result = caseMessage(message);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.MODEL_ATTRIBUTE_REFERENCE: {
				ModelAttributeReference modelAttributeReference = (ModelAttributeReference) theEObject;
				T result = caseModelAttributeReference(modelAttributeReference);
				if (result == null) {
					result = caseNameAndMeaningReference(modelAttributeReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.NAME_AND_MEANING_REFERENCE: {
				NameAndMeaningReference nameAndMeaningReference = (NameAndMeaningReference) theEObject;
				T result = caseNameAndMeaningReference(nameAndMeaningReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.NAMED_ENTITY_REFERENCE: {
				NamedEntityReference namedEntityReference = (NamedEntityReference) theEObject;
				T result = caseNamedEntityReference(namedEntityReference);
				if (result == null) {
					result = caseEntityReference(namedEntityReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.NAMESPACE_REFERENCE: {
				NamespaceReference namespaceReference = (NamespaceReference) theEObject;
				T result = caseNamespaceReference(namespaceReference);
				if (result == null) {
					result = caseNameAndMeaningReference(namespaceReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.NOTE: {
				Note note = (Note) theEObject;
				T result = caseNote(note);
				if (result == null) {
					result = caseEntryDescription(note);
				}
				if (result == null) {
					result = caseOpaqueData(note);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ONTOLOGY_DOMAIN_REFERENCE: {
				OntologyDomainReference ontologyDomainReference = (OntologyDomainReference) theEObject;
				T result = caseOntologyDomainReference(ontologyDomainReference);
				if (result == null) {
					result = caseNameAndMeaningReference(ontologyDomainReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ONTOLOGY_ENGINEERING_METHODOLOGY_REFERENCE: {
				OntologyEngineeringMethodologyReference ontologyEngineeringMethodologyReference = (OntologyEngineeringMethodologyReference) theEObject;
				T result = caseOntologyEngineeringMethodologyReference(ontologyEngineeringMethodologyReference);
				if (result == null) {
					result = caseNameAndMeaningReference(ontologyEngineeringMethodologyReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ONTOLOGY_ENGINEERING_TOOL_REFERENCE: {
				OntologyEngineeringToolReference ontologyEngineeringToolReference = (OntologyEngineeringToolReference) theEObject;
				T result = caseOntologyEngineeringToolReference(ontologyEngineeringToolReference);
				if (result == null) {
					result = caseNameAndMeaningReference(ontologyEngineeringToolReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX: {
				OntologyLanguageAndSyntax ontologyLanguageAndSyntax = (OntologyLanguageAndSyntax) theEObject;
				T result = caseOntologyLanguageAndSyntax(ontologyLanguageAndSyntax);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ONTOLOGY_LANGUAGE_REFERENCE: {
				OntologyLanguageReference ontologyLanguageReference = (OntologyLanguageReference) theEObject;
				T result = caseOntologyLanguageReference(ontologyLanguageReference);
				if (result == null) {
					result = caseNameAndMeaningReference(ontologyLanguageReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ONTOLOGY_SYNTAX_REFERENCE: {
				OntologySyntaxReference ontologySyntaxReference = (OntologySyntaxReference) theEObject;
				T result = caseOntologySyntaxReference(ontologySyntaxReference);
				if (result == null) {
					result = caseNameAndMeaningReference(ontologySyntaxReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ONTOLOGY_TASK_REFERENCE: {
				OntologyTaskReference ontologyTaskReference = (OntologyTaskReference) theEObject;
				T result = caseOntologyTaskReference(ontologyTaskReference);
				if (result == null) {
					result = caseNameAndMeaningReference(ontologyTaskReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ONTOLOGY_TYPE_REFERENCE: {
				OntologyTypeReference ontologyTypeReference = (OntologyTypeReference) theEObject;
				T result = caseOntologyTypeReference(ontologyTypeReference);
				if (result == null) {
					result = caseNameAndMeaningReference(ontologyTypeReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.OPAQUE_DATA: {
				OpaqueData opaqueData = (OpaqueData) theEObject;
				T result = caseOpaqueData(opaqueData);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.PARAMETER: {
				Parameter parameter = (Parameter) theEObject;
				T result = caseParameter(parameter);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.PREDICATE_REFERENCE: {
				PredicateReference predicateReference = (PredicateReference) theEObject;
				T result = casePredicateReference(predicateReference);
				if (result == null) {
					result = caseURIAndEntityName(predicateReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.PROPERTY: {
				Property property = (Property) theEObject;
				T result = caseProperty(property);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.PROPERTY_REFERENCE: {
				PropertyReference propertyReference = (PropertyReference) theEObject;
				T result = casePropertyReference(propertyReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.REASONING_ALGORITHM_REFERENCE: {
				ReasoningAlgorithmReference reasoningAlgorithmReference = (ReasoningAlgorithmReference) theEObject;
				T result = caseReasoningAlgorithmReference(reasoningAlgorithmReference);
				if (result == null) {
					result = caseNameAndMeaningReference(reasoningAlgorithmReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.RESOURCE_DESCRIPTION: {
				ResourceDescription resourceDescription = (ResourceDescription) theEObject;
				T result = caseResourceDescription(resourceDescription);
				if (result == null) {
					result = caseChangeable(resourceDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY: {
				ResourceDescriptionDirectoryEntry resourceDescriptionDirectoryEntry = (ResourceDescriptionDirectoryEntry) theEObject;
				T result = caseResourceDescriptionDirectoryEntry(resourceDescriptionDirectoryEntry);
				if (result == null) {
					result = caseDirectoryEntry(resourceDescriptionDirectoryEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.RESOURCE_VERSION_DESCRIPTION: {
				ResourceVersionDescription resourceVersionDescription = (ResourceVersionDescription) theEObject;
				T result = caseResourceVersionDescription(resourceVersionDescription);
				if (result == null) {
					result = caseResourceDescription(resourceVersionDescription);
				}
				if (result == null) {
					result = caseChangeable(resourceVersionDescription);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY: {
				ResourceVersionDescriptionDirectoryEntry resourceVersionDescriptionDirectoryEntry = (ResourceVersionDescriptionDirectoryEntry) theEObject;
				T result = caseResourceVersionDescriptionDirectoryEntry(resourceVersionDescriptionDirectoryEntry);
				if (result == null) {
					result = caseResourceDescriptionDirectoryEntry(resourceVersionDescriptionDirectoryEntry);
				}
				if (result == null) {
					result = caseDirectoryEntry(resourceVersionDescriptionDirectoryEntry);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.REST_RESOURCE: {
				RESTResource restResource = (RESTResource) theEObject;
				T result = caseRESTResource(restResource);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.ROLE_REFERENCE: {
				RoleReference roleReference = (RoleReference) theEObject;
				T result = caseRoleReference(roleReference);
				if (result == null) {
					result = caseNameAndMeaningReference(roleReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.SCOPED_ENTITY_NAME: {
				ScopedEntityName scopedEntityName = (ScopedEntityName) theEObject;
				T result = caseScopedEntityName(scopedEntityName);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.SORT_CRITERIA: {
				SortCriteria sortCriteria = (SortCriteria) theEObject;
				T result = caseSortCriteria(sortCriteria);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.SORT_CRITERION: {
				SortCriterion sortCriterion = (SortCriterion) theEObject;
				T result = caseSortCriterion(sortCriterion);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.SOURCE_AND_NOTATION: {
				SourceAndNotation sourceAndNotation = (SourceAndNotation) theEObject;
				T result = caseSourceAndNotation(sourceAndNotation);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.SOURCE_AND_ROLE_REFERENCE: {
				SourceAndRoleReference sourceAndRoleReference = (SourceAndRoleReference) theEObject;
				T result = caseSourceAndRoleReference(sourceAndRoleReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.SOURCE_REFERENCE: {
				SourceReference sourceReference = (SourceReference) theEObject;
				T result = caseSourceReference(sourceReference);
				if (result == null) {
					result = caseNameAndMeaningReference(sourceReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.STATEMENT_TARGET: {
				StatementTarget statementTarget = (StatementTarget) theEObject;
				T result = caseStatementTarget(statementTarget);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.STATUS_REFERENCE: {
				StatusReference statusReference = (StatusReference) theEObject;
				T result = caseStatusReference(statusReference);
				if (result == null) {
					result = caseNameAndMeaningReference(statusReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.TS_ANY_TYPE: {
				TsAnyType tsAnyType = (TsAnyType) theEObject;
				T result = caseTsAnyType(tsAnyType);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.URI_AND_ENTITY_NAME: {
				URIAndEntityName uriAndEntityName = (URIAndEntityName) theEObject;
				T result = caseURIAndEntityName(uriAndEntityName);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot) theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE: {
				ValueSetDefinitionReference valueSetDefinitionReference = (ValueSetDefinitionReference) theEObject;
				T result = caseValueSetDefinitionReference(valueSetDefinitionReference);
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.VALUE_SET_REFERENCE: {
				ValueSetReference valueSetReference = (ValueSetReference) theEObject;
				T result = caseValueSetReference(valueSetReference);
				if (result == null) {
					result = caseNameAndMeaningReference(valueSetReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			case CorePackage.VERSION_TAG_REFERENCE: {
				VersionTagReference versionTagReference = (VersionTagReference) theEObject;
				T result = caseVersionTagReference(versionTagReference);
				if (result == null) {
					result = caseNameAndMeaningReference(versionTagReference);
				}
				if (result == null) {
					result = defaultCase(theEObject);
				}
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Resource Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Resource Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResourceDescription(AbstractResourceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Resource Description Directory Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Resource Description Directory Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResourceDescriptionDirectoryEntry(AbstractResourceDescriptionDirectoryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Entity Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousEntityReference(AnonymousEntityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousStatement(AnonymousStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationReference(AssociationReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Qualifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Qualifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingQualifierReference(BindingQualifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Significance Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Significance Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseSignificanceReference(CaseSignificanceReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Changeable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Changeable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeable(Changeable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeDescription(ChangeDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Set Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Set Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeSetBase(ChangeSetBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Category Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Category Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemCategoryReference(CodeSystemCategoryReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemReference(CodeSystemReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Version Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Version Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionReference(CodeSystemVersionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Domain Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Domain Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDomainReference(ConceptDomainReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextReference(ContextReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description In Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description In Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionInCodeSystem(DescriptionInCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Designation Fidelity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Designation Fidelity Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignationFidelityReference(DesignationFidelityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Designation Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Designation Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignationTypeReference(DesignationTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectory(Directory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectoryEntry(DirectoryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityExpression(EntityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityReference(EntityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Reference List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Reference List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityReferenceList(EntityReferenceList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Synopsis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Synopsis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntitySynopsis(EntitySynopsis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryDescription(EntryDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExample(Example object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterComponent(FilterComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finalizable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finalizable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalizable(Finalizable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formality Level Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formality Level Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalityLevelReference(FormalityLevelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Format Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Format Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormatReference(FormatReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageReference(LanguageReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Correlation Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Correlation Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapCorrelationReference(MapCorrelationReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapReference(MapReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Version Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Version Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapVersionReference(MapVersionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Algorithm Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Algorithm Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchAlgorithmReference(MatchAlgorithmReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Attribute Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Attribute Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelAttributeReference(ModelAttributeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name And Meaning Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name And Meaning Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameAndMeaningReference(NameAndMeaningReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntityReference(NamedEntityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceReference(NamespaceReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Domain Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Domain Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologyDomainReference(OntologyDomainReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Engineering Methodology Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Engineering Methodology Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologyEngineeringMethodologyReference(OntologyEngineeringMethodologyReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Engineering Tool Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Engineering Tool Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologyEngineeringToolReference(OntologyEngineeringToolReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Language And Syntax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Language And Syntax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologyLanguageAndSyntax(OntologyLanguageAndSyntax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Language Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Language Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologyLanguageReference(OntologyLanguageReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Syntax Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Syntax Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologySyntaxReference(OntologySyntaxReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Task Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Task Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologyTaskReference(OntologyTaskReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ontology Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ontology Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOntologyTypeReference(OntologyTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueData(OpaqueData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateReference(PredicateReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyReference(PropertyReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reasoning Algorithm Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reasoning Algorithm Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasoningAlgorithmReference(ReasoningAlgorithmReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceDescription(ResourceDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Description Directory Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Description Directory Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceDescriptionDirectoryEntry(ResourceDescriptionDirectoryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Version Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Version Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceVersionDescription(ResourceVersionDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Version Description Directory Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Version Description Directory Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceVersionDescriptionDirectoryEntry(ResourceVersionDescriptionDirectoryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRESTResource(RESTResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleReference(RoleReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoped Entity Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoped Entity Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopedEntityName(ScopedEntityName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortCriteria(SortCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortCriterion(SortCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source And Notation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source And Notation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceAndNotation(SourceAndNotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source And Role Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source And Role Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceAndRoleReference(SourceAndRoleReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceReference(SourceReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementTarget(StatementTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusReference(StatusReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ts Any Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ts Any Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTsAnyType(TsAnyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URI And Entity Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URI And Entity Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURIAndEntityName(URIAndEntityName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Definition Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Definition Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetDefinitionReference(ValueSetDefinitionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetReference(ValueSetReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Tag Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Tag Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionTagReference(VersionTagReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // CoreSwitch
