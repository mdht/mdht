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
package org.openhealthtools.mdht.cts2.core.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.openhealthtools.mdht.cts2.core.AbstractResourceDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.AnonymousEntityReference;
import org.openhealthtools.mdht.cts2.core.AnonymousStatement;
import org.openhealthtools.mdht.cts2.core.AssociationDirection;
import org.openhealthtools.mdht.cts2.core.AssociationReference;
import org.openhealthtools.mdht.cts2.core.BindingQualifierReference;
import org.openhealthtools.mdht.cts2.core.CTS2ResourceType;
import org.openhealthtools.mdht.cts2.core.CaseSignificanceReference;
import org.openhealthtools.mdht.cts2.core.ChangeCommitted;
import org.openhealthtools.mdht.cts2.core.ChangeDescription;
import org.openhealthtools.mdht.cts2.core.ChangeSetBase;
import org.openhealthtools.mdht.cts2.core.ChangeType;
import org.openhealthtools.mdht.cts2.core.CodeSystemCategoryReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.Comment;
import org.openhealthtools.mdht.cts2.core.CompleteDirectory;
import org.openhealthtools.mdht.cts2.core.ConceptDomainReference;
import org.openhealthtools.mdht.cts2.core.ContextReference;
import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.Definition;
import org.openhealthtools.mdht.cts2.core.DefinitionRole;
import org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem;
import org.openhealthtools.mdht.cts2.core.DesignationFidelityReference;
import org.openhealthtools.mdht.cts2.core.DesignationTypeReference;
import org.openhealthtools.mdht.cts2.core.DocumentRoot;
import org.openhealthtools.mdht.cts2.core.EntityExpression;
import org.openhealthtools.mdht.cts2.core.EntityReference;
import org.openhealthtools.mdht.cts2.core.EntityReferenceList;
import org.openhealthtools.mdht.cts2.core.EntitySynopsis;
import org.openhealthtools.mdht.cts2.core.EntryDescription;
import org.openhealthtools.mdht.cts2.core.EntryState;
import org.openhealthtools.mdht.cts2.core.Example;
import org.openhealthtools.mdht.cts2.core.Filter;
import org.openhealthtools.mdht.cts2.core.FilterComponent;
import org.openhealthtools.mdht.cts2.core.FinalizableState;
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
import org.openhealthtools.mdht.cts2.core.NoteType;
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
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.RoleReference;
import org.openhealthtools.mdht.cts2.core.ScopedEntityName;
import org.openhealthtools.mdht.cts2.core.SetOperator;
import org.openhealthtools.mdht.cts2.core.SortCriteria;
import org.openhealthtools.mdht.cts2.core.SortCriterion;
import org.openhealthtools.mdht.cts2.core.SortDirection;
import org.openhealthtools.mdht.cts2.core.SourceAndNotation;
import org.openhealthtools.mdht.cts2.core.SourceAndRoleReference;
import org.openhealthtools.mdht.cts2.core.SourceReference;
import org.openhealthtools.mdht.cts2.core.StatementTarget;
import org.openhealthtools.mdht.cts2.core.StatusReference;
import org.openhealthtools.mdht.cts2.core.TargetReferenceType;
import org.openhealthtools.mdht.cts2.core.TsAnyType;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;
import org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference;
import org.openhealthtools.mdht.cts2.core.ValueSetReference;
import org.openhealthtools.mdht.cts2.core.VersionTagReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory) EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/CTS2/1.0/Core");
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY:
				return createAbstractResourceDescriptionDirectoryEntry();
			case CorePackage.ANONYMOUS_ENTITY_REFERENCE:
				return createAnonymousEntityReference();
			case CorePackage.ANONYMOUS_STATEMENT:
				return createAnonymousStatement();
			case CorePackage.ASSOCIATION_REFERENCE:
				return createAssociationReference();
			case CorePackage.BINDING_QUALIFIER_REFERENCE:
				return createBindingQualifierReference();
			case CorePackage.CASE_SIGNIFICANCE_REFERENCE:
				return createCaseSignificanceReference();
			case CorePackage.CHANGE_DESCRIPTION:
				return createChangeDescription();
			case CorePackage.CHANGE_SET_BASE:
				return createChangeSetBase();
			case CorePackage.CODE_SYSTEM_CATEGORY_REFERENCE:
				return createCodeSystemCategoryReference();
			case CorePackage.CODE_SYSTEM_REFERENCE:
				return createCodeSystemReference();
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE:
				return createCodeSystemVersionReference();
			case CorePackage.COMMENT:
				return createComment();
			case CorePackage.CONCEPT_DOMAIN_REFERENCE:
				return createConceptDomainReference();
			case CorePackage.CONTEXT_REFERENCE:
				return createContextReference();
			case CorePackage.DEFINITION:
				return createDefinition();
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM:
				return createDescriptionInCodeSystem();
			case CorePackage.DESIGNATION_FIDELITY_REFERENCE:
				return createDesignationFidelityReference();
			case CorePackage.DESIGNATION_TYPE_REFERENCE:
				return createDesignationTypeReference();
			case CorePackage.ENTITY_EXPRESSION:
				return createEntityExpression();
			case CorePackage.ENTITY_REFERENCE:
				return createEntityReference();
			case CorePackage.ENTITY_REFERENCE_LIST:
				return createEntityReferenceList();
			case CorePackage.ENTITY_SYNOPSIS:
				return createEntitySynopsis();
			case CorePackage.ENTRY_DESCRIPTION:
				return createEntryDescription();
			case CorePackage.EXAMPLE:
				return createExample();
			case CorePackage.FILTER:
				return createFilter();
			case CorePackage.FILTER_COMPONENT:
				return createFilterComponent();
			case CorePackage.FORMALITY_LEVEL_REFERENCE:
				return createFormalityLevelReference();
			case CorePackage.FORMAT_REFERENCE:
				return createFormatReference();
			case CorePackage.LANGUAGE_REFERENCE:
				return createLanguageReference();
			case CorePackage.MAP_CORRELATION_REFERENCE:
				return createMapCorrelationReference();
			case CorePackage.MAP_REFERENCE:
				return createMapReference();
			case CorePackage.MAP_VERSION_REFERENCE:
				return createMapVersionReference();
			case CorePackage.MATCH_ALGORITHM_REFERENCE:
				return createMatchAlgorithmReference();
			case CorePackage.MESSAGE:
				return createMessage();
			case CorePackage.MODEL_ATTRIBUTE_REFERENCE:
				return createModelAttributeReference();
			case CorePackage.NAME_AND_MEANING_REFERENCE:
				return createNameAndMeaningReference();
			case CorePackage.NAMED_ENTITY_REFERENCE:
				return createNamedEntityReference();
			case CorePackage.NAMESPACE_REFERENCE:
				return createNamespaceReference();
			case CorePackage.ONTOLOGY_DOMAIN_REFERENCE:
				return createOntologyDomainReference();
			case CorePackage.ONTOLOGY_ENGINEERING_METHODOLOGY_REFERENCE:
				return createOntologyEngineeringMethodologyReference();
			case CorePackage.ONTOLOGY_ENGINEERING_TOOL_REFERENCE:
				return createOntologyEngineeringToolReference();
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX:
				return createOntologyLanguageAndSyntax();
			case CorePackage.ONTOLOGY_LANGUAGE_REFERENCE:
				return createOntologyLanguageReference();
			case CorePackage.ONTOLOGY_SYNTAX_REFERENCE:
				return createOntologySyntaxReference();
			case CorePackage.ONTOLOGY_TASK_REFERENCE:
				return createOntologyTaskReference();
			case CorePackage.ONTOLOGY_TYPE_REFERENCE:
				return createOntologyTypeReference();
			case CorePackage.OPAQUE_DATA:
				return createOpaqueData();
			case CorePackage.PARAMETER:
				return createParameter();
			case CorePackage.PREDICATE_REFERENCE:
				return createPredicateReference();
			case CorePackage.PROPERTY:
				return createProperty();
			case CorePackage.PROPERTY_REFERENCE:
				return createPropertyReference();
			case CorePackage.REASONING_ALGORITHM_REFERENCE:
				return createReasoningAlgorithmReference();
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY:
				return createResourceVersionDescriptionDirectoryEntry();
			case CorePackage.REST_RESOURCE:
				return createRESTResource();
			case CorePackage.ROLE_REFERENCE:
				return createRoleReference();
			case CorePackage.SCOPED_ENTITY_NAME:
				return createScopedEntityName();
			case CorePackage.SORT_CRITERIA:
				return createSortCriteria();
			case CorePackage.SORT_CRITERION:
				return createSortCriterion();
			case CorePackage.SOURCE_AND_NOTATION:
				return createSourceAndNotation();
			case CorePackage.SOURCE_AND_ROLE_REFERENCE:
				return createSourceAndRoleReference();
			case CorePackage.SOURCE_REFERENCE:
				return createSourceReference();
			case CorePackage.STATEMENT_TARGET:
				return createStatementTarget();
			case CorePackage.STATUS_REFERENCE:
				return createStatusReference();
			case CorePackage.TS_ANY_TYPE:
				return createTsAnyType();
			case CorePackage.URI_AND_ENTITY_NAME:
				return createURIAndEntityName();
			case CorePackage.DOCUMENT_ROOT:
				return createDocumentRoot();
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE:
				return createValueSetDefinitionReference();
			case CorePackage.VALUE_SET_REFERENCE:
				return createValueSetReference();
			case CorePackage.VERSION_TAG_REFERENCE:
				return createVersionTagReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.ASSOCIATION_DIRECTION:
				return createAssociationDirectionFromString(eDataType, initialValue);
			case CorePackage.CHANGE_COMMITTED:
				return createChangeCommittedFromString(eDataType, initialValue);
			case CorePackage.CHANGE_TYPE:
				return createChangeTypeFromString(eDataType, initialValue);
			case CorePackage.COMPLETE_DIRECTORY:
				return createCompleteDirectoryFromString(eDataType, initialValue);
			case CorePackage.CTS2_RESOURCE_TYPE:
				return createCTS2ResourceTypeFromString(eDataType, initialValue);
			case CorePackage.DEFINITION_ROLE:
				return createDefinitionRoleFromString(eDataType, initialValue);
			case CorePackage.ENTRY_STATE:
				return createEntryStateFromString(eDataType, initialValue);
			case CorePackage.FINALIZABLE_STATE:
				return createFinalizableStateFromString(eDataType, initialValue);
			case CorePackage.NOTE_TYPE:
				return createNoteTypeFromString(eDataType, initialValue);
			case CorePackage.SET_OPERATOR:
				return createSetOperatorFromString(eDataType, initialValue);
			case CorePackage.SORT_DIRECTION:
				return createSortDirectionFromString(eDataType, initialValue);
			case CorePackage.TARGET_REFERENCE_TYPE:
				return createTargetReferenceTypeFromString(eDataType, initialValue);
			case CorePackage.AMOUNT_OF_TIME:
				return createAmountOfTimeFromString(eDataType, initialValue);
			case CorePackage.ASSOCIATION_DIRECTION_OBJECT:
				return createAssociationDirectionObjectFromString(eDataType, initialValue);
			case CorePackage.ASSOCIATION_DIRECTORY_URI:
				return createAssociationDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case CorePackage.BOOLEAN_OBJECT:
				return createBooleanObjectFromString(eDataType, initialValue);
			case CorePackage.CHANGE_COMMITTED_OBJECT:
				return createChangeCommittedObjectFromString(eDataType, initialValue);
			case CorePackage.CHANGE_SET_DIRECTORY_URI:
				return createChangeSetDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.CHANGE_SET_URI:
				return createChangeSetURIFromString(eDataType, initialValue);
			case CorePackage.CHANGE_TYPE_OBJECT:
				return createChangeTypeObjectFromString(eDataType, initialValue);
			case CorePackage.CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY_URI:
				return createCodeSystemCatalogEntryDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.CODE_SYSTEM_NAME:
				return createCodeSystemNameFromString(eDataType, initialValue);
			case CorePackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY_URI:
				return createCodeSystemVersionCatalogEntryDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.CODE_SYSTEM_VERSION_NAME:
				return createCodeSystemVersionNameFromString(eDataType, initialValue);
			case CorePackage.COMPLETE_DIRECTORY_OBJECT:
				return createCompleteDirectoryObjectFromString(eDataType, initialValue);
			case CorePackage.CONCEPT_DOMAIN_BINDING_DIRECTORY_URI:
				return createConceptDomainBindingDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.CONCEPT_DOMAIN_CATALOG_ENTRY_DIRECTORY_URI:
				return createConceptDomainCatalogEntryDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.CONCEPT_DOMAIN_NAME:
				return createConceptDomainNameFromString(eDataType, initialValue);
			case CorePackage.CTS2_RESOURCE_TYPE_OBJECT:
				return createCTS2ResourceTypeObjectFromString(eDataType, initialValue);
			case CorePackage.DATE_AND_TIME:
				return createDateAndTimeFromString(eDataType, initialValue);
			case CorePackage.DEFINITION_ROLE_OBJECT:
				return createDefinitionRoleObjectFromString(eDataType, initialValue);
			case CorePackage.DIRECTORY_URI:
				return createDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.DOCUMENT_URI:
				return createDocumentURIFromString(eDataType, initialValue);
			case CorePackage.ENTITY_DIRECTORY_URI:
				return createEntityDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.ENTRY_STATE_OBJECT:
				return createEntryStateObjectFromString(eDataType, initialValue);
			case CorePackage.ENUMERATION:
				return createEnumerationFromString(eDataType, initialValue);
			case CorePackage.EXTERNAL_URI:
				return createExternalURIFromString(eDataType, initialValue);
			case CorePackage.FINALIZABLE_STATE_OBJECT:
				return createFinalizableStateObjectFromString(eDataType, initialValue);
			case CorePackage.LOCAL_IDENTIFIER:
				return createLocalIdentifierFromString(eDataType, initialValue);
			case CorePackage.LOCAL_URI:
				return createLocalURIFromString(eDataType, initialValue);
			case CorePackage.MAP_CATALOG_ENTRY_DIRECTORY_URI:
				return createMapCatalogEntryDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.MAP_ENTRY_DIRECTORY_URI:
				return createMapEntryDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.MAP_NAME:
				return createMapNameFromString(eDataType, initialValue);
			case CorePackage.MAP_VERSION_DIRECTORY_URI:
				return createMapVersionDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.MAP_VERSION_NAME:
				return createMapVersionNameFromString(eDataType, initialValue);
			case CorePackage.MATCH_STRENGTH:
				return createMatchStrengthFromString(eDataType, initialValue);
			case CorePackage.MATCH_STRENGTH_OBJECT:
				return createMatchStrengthObjectFromString(eDataType, initialValue);
			case CorePackage.NAMESPACE_IDENTIFIER:
				return createNamespaceIdentifierFromString(eDataType, initialValue);
			case CorePackage.NATURAL_NUMBER:
				return createNaturalNumberFromString(eDataType, initialValue);
			case CorePackage.NOTE_TYPE_OBJECT:
				return createNoteTypeObjectFromString(eDataType, initialValue);
			case CorePackage.PERSISTENT_URI:
				return createPersistentURIFromString(eDataType, initialValue);
			case CorePackage.RENDERING_URI:
				return createRenderingURIFromString(eDataType, initialValue);
			case CorePackage.RESOLVED_VALUE_SET_DIRECTORY_URI:
				return createResolvedValueSetDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.SERVICE_URI:
				return createServiceURIFromString(eDataType, initialValue);
			case CorePackage.SET_OPERATOR_OBJECT:
				return createSetOperatorObjectFromString(eDataType, initialValue);
			case CorePackage.SORT_DIRECTION_OBJECT:
				return createSortDirectionObjectFromString(eDataType, initialValue);
			case CorePackage.STATEMENT_DIRECTORY_URI:
				return createStatementDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case CorePackage.TARGET_REFERENCE_TYPE_OBJECT:
				return createTargetReferenceTypeObjectFromString(eDataType, initialValue);
			case CorePackage.URI:
				return createURIFromString(eDataType, initialValue);
			case CorePackage.VALUE_SET_CATALOG_ENTRY_DIRECTORY_URI:
				return createValueSetCatalogEntryDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.VALUE_SET_DEFINITION_DIRECTORY_URI:
				return createValueSetDefinitionDirectoryURIFromString(eDataType, initialValue);
			case CorePackage.VALUE_SET_NAME:
				return createValueSetNameFromString(eDataType, initialValue);
			case CorePackage.VERSION_TAG_NAME:
				return createVersionTagNameFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() +
						"' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.ASSOCIATION_DIRECTION:
				return convertAssociationDirectionToString(eDataType, instanceValue);
			case CorePackage.CHANGE_COMMITTED:
				return convertChangeCommittedToString(eDataType, instanceValue);
			case CorePackage.CHANGE_TYPE:
				return convertChangeTypeToString(eDataType, instanceValue);
			case CorePackage.COMPLETE_DIRECTORY:
				return convertCompleteDirectoryToString(eDataType, instanceValue);
			case CorePackage.CTS2_RESOURCE_TYPE:
				return convertCTS2ResourceTypeToString(eDataType, instanceValue);
			case CorePackage.DEFINITION_ROLE:
				return convertDefinitionRoleToString(eDataType, instanceValue);
			case CorePackage.ENTRY_STATE:
				return convertEntryStateToString(eDataType, instanceValue);
			case CorePackage.FINALIZABLE_STATE:
				return convertFinalizableStateToString(eDataType, instanceValue);
			case CorePackage.NOTE_TYPE:
				return convertNoteTypeToString(eDataType, instanceValue);
			case CorePackage.SET_OPERATOR:
				return convertSetOperatorToString(eDataType, instanceValue);
			case CorePackage.SORT_DIRECTION:
				return convertSortDirectionToString(eDataType, instanceValue);
			case CorePackage.TARGET_REFERENCE_TYPE:
				return convertTargetReferenceTypeToString(eDataType, instanceValue);
			case CorePackage.AMOUNT_OF_TIME:
				return convertAmountOfTimeToString(eDataType, instanceValue);
			case CorePackage.ASSOCIATION_DIRECTION_OBJECT:
				return convertAssociationDirectionObjectToString(eDataType, instanceValue);
			case CorePackage.ASSOCIATION_DIRECTORY_URI:
				return convertAssociationDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case CorePackage.BOOLEAN_OBJECT:
				return convertBooleanObjectToString(eDataType, instanceValue);
			case CorePackage.CHANGE_COMMITTED_OBJECT:
				return convertChangeCommittedObjectToString(eDataType, instanceValue);
			case CorePackage.CHANGE_SET_DIRECTORY_URI:
				return convertChangeSetDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.CHANGE_SET_URI:
				return convertChangeSetURIToString(eDataType, instanceValue);
			case CorePackage.CHANGE_TYPE_OBJECT:
				return convertChangeTypeObjectToString(eDataType, instanceValue);
			case CorePackage.CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY_URI:
				return convertCodeSystemCatalogEntryDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.CODE_SYSTEM_NAME:
				return convertCodeSystemNameToString(eDataType, instanceValue);
			case CorePackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY_URI:
				return convertCodeSystemVersionCatalogEntryDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.CODE_SYSTEM_VERSION_NAME:
				return convertCodeSystemVersionNameToString(eDataType, instanceValue);
			case CorePackage.COMPLETE_DIRECTORY_OBJECT:
				return convertCompleteDirectoryObjectToString(eDataType, instanceValue);
			case CorePackage.CONCEPT_DOMAIN_BINDING_DIRECTORY_URI:
				return convertConceptDomainBindingDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.CONCEPT_DOMAIN_CATALOG_ENTRY_DIRECTORY_URI:
				return convertConceptDomainCatalogEntryDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.CONCEPT_DOMAIN_NAME:
				return convertConceptDomainNameToString(eDataType, instanceValue);
			case CorePackage.CTS2_RESOURCE_TYPE_OBJECT:
				return convertCTS2ResourceTypeObjectToString(eDataType, instanceValue);
			case CorePackage.DATE_AND_TIME:
				return convertDateAndTimeToString(eDataType, instanceValue);
			case CorePackage.DEFINITION_ROLE_OBJECT:
				return convertDefinitionRoleObjectToString(eDataType, instanceValue);
			case CorePackage.DIRECTORY_URI:
				return convertDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.DOCUMENT_URI:
				return convertDocumentURIToString(eDataType, instanceValue);
			case CorePackage.ENTITY_DIRECTORY_URI:
				return convertEntityDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.ENTRY_STATE_OBJECT:
				return convertEntryStateObjectToString(eDataType, instanceValue);
			case CorePackage.ENUMERATION:
				return convertEnumerationToString(eDataType, instanceValue);
			case CorePackage.EXTERNAL_URI:
				return convertExternalURIToString(eDataType, instanceValue);
			case CorePackage.FINALIZABLE_STATE_OBJECT:
				return convertFinalizableStateObjectToString(eDataType, instanceValue);
			case CorePackage.LOCAL_IDENTIFIER:
				return convertLocalIdentifierToString(eDataType, instanceValue);
			case CorePackage.LOCAL_URI:
				return convertLocalURIToString(eDataType, instanceValue);
			case CorePackage.MAP_CATALOG_ENTRY_DIRECTORY_URI:
				return convertMapCatalogEntryDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.MAP_ENTRY_DIRECTORY_URI:
				return convertMapEntryDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.MAP_NAME:
				return convertMapNameToString(eDataType, instanceValue);
			case CorePackage.MAP_VERSION_DIRECTORY_URI:
				return convertMapVersionDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.MAP_VERSION_NAME:
				return convertMapVersionNameToString(eDataType, instanceValue);
			case CorePackage.MATCH_STRENGTH:
				return convertMatchStrengthToString(eDataType, instanceValue);
			case CorePackage.MATCH_STRENGTH_OBJECT:
				return convertMatchStrengthObjectToString(eDataType, instanceValue);
			case CorePackage.NAMESPACE_IDENTIFIER:
				return convertNamespaceIdentifierToString(eDataType, instanceValue);
			case CorePackage.NATURAL_NUMBER:
				return convertNaturalNumberToString(eDataType, instanceValue);
			case CorePackage.NOTE_TYPE_OBJECT:
				return convertNoteTypeObjectToString(eDataType, instanceValue);
			case CorePackage.PERSISTENT_URI:
				return convertPersistentURIToString(eDataType, instanceValue);
			case CorePackage.RENDERING_URI:
				return convertRenderingURIToString(eDataType, instanceValue);
			case CorePackage.RESOLVED_VALUE_SET_DIRECTORY_URI:
				return convertResolvedValueSetDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.SERVICE_URI:
				return convertServiceURIToString(eDataType, instanceValue);
			case CorePackage.SET_OPERATOR_OBJECT:
				return convertSetOperatorObjectToString(eDataType, instanceValue);
			case CorePackage.SORT_DIRECTION_OBJECT:
				return convertSortDirectionObjectToString(eDataType, instanceValue);
			case CorePackage.STATEMENT_DIRECTORY_URI:
				return convertStatementDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case CorePackage.TARGET_REFERENCE_TYPE_OBJECT:
				return convertTargetReferenceTypeObjectToString(eDataType, instanceValue);
			case CorePackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case CorePackage.VALUE_SET_CATALOG_ENTRY_DIRECTORY_URI:
				return convertValueSetCatalogEntryDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.VALUE_SET_DEFINITION_DIRECTORY_URI:
				return convertValueSetDefinitionDirectoryURIToString(eDataType, instanceValue);
			case CorePackage.VALUE_SET_NAME:
				return convertValueSetNameToString(eDataType, instanceValue);
			case CorePackage.VERSION_TAG_NAME:
				return convertVersionTagNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() +
						"' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AbstractResourceDescriptionDirectoryEntry createAbstractResourceDescriptionDirectoryEntry() {
		AbstractResourceDescriptionDirectoryEntryImpl abstractResourceDescriptionDirectoryEntry = new AbstractResourceDescriptionDirectoryEntryImpl();
		return abstractResourceDescriptionDirectoryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnonymousEntityReference createAnonymousEntityReference() {
		AnonymousEntityReferenceImpl anonymousEntityReference = new AnonymousEntityReferenceImpl();
		return anonymousEntityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnonymousStatement createAnonymousStatement() {
		AnonymousStatementImpl anonymousStatement = new AnonymousStatementImpl();
		return anonymousStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationReference createAssociationReference() {
		AssociationReferenceImpl associationReference = new AssociationReferenceImpl();
		return associationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BindingQualifierReference createBindingQualifierReference() {
		BindingQualifierReferenceImpl bindingQualifierReference = new BindingQualifierReferenceImpl();
		return bindingQualifierReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CaseSignificanceReference createCaseSignificanceReference() {
		CaseSignificanceReferenceImpl caseSignificanceReference = new CaseSignificanceReferenceImpl();
		return caseSignificanceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeDescription createChangeDescription() {
		ChangeDescriptionImpl changeDescription = new ChangeDescriptionImpl();
		return changeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeSetBase createChangeSetBase() {
		ChangeSetBaseImpl changeSetBase = new ChangeSetBaseImpl();
		return changeSetBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCategoryReference createCodeSystemCategoryReference() {
		CodeSystemCategoryReferenceImpl codeSystemCategoryReference = new CodeSystemCategoryReferenceImpl();
		return codeSystemCategoryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemReference createCodeSystemReference() {
		CodeSystemReferenceImpl codeSystemReference = new CodeSystemReferenceImpl();
		return codeSystemReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionReference createCodeSystemVersionReference() {
		CodeSystemVersionReferenceImpl codeSystemVersionReference = new CodeSystemVersionReferenceImpl();
		return codeSystemVersionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConceptDomainReference createConceptDomainReference() {
		ConceptDomainReferenceImpl conceptDomainReference = new ConceptDomainReferenceImpl();
		return conceptDomainReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContextReference createContextReference() {
		ContextReferenceImpl contextReference = new ContextReferenceImpl();
		return contextReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DescriptionInCodeSystem createDescriptionInCodeSystem() {
		DescriptionInCodeSystemImpl descriptionInCodeSystem = new DescriptionInCodeSystemImpl();
		return descriptionInCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DesignationFidelityReference createDesignationFidelityReference() {
		DesignationFidelityReferenceImpl designationFidelityReference = new DesignationFidelityReferenceImpl();
		return designationFidelityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DesignationTypeReference createDesignationTypeReference() {
		DesignationTypeReferenceImpl designationTypeReference = new DesignationTypeReferenceImpl();
		return designationTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityExpression createEntityExpression() {
		EntityExpressionImpl entityExpression = new EntityExpressionImpl();
		return entityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityReference createEntityReference() {
		EntityReferenceImpl entityReference = new EntityReferenceImpl();
		return entityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityReferenceList createEntityReferenceList() {
		EntityReferenceListImpl entityReferenceList = new EntityReferenceListImpl();
		return entityReferenceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntitySynopsis createEntitySynopsis() {
		EntitySynopsisImpl entitySynopsis = new EntitySynopsisImpl();
		return entitySynopsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntryDescription createEntryDescription() {
		EntryDescriptionImpl entryDescription = new EntryDescriptionImpl();
		return entryDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Example createExample() {
		ExampleImpl example = new ExampleImpl();
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FilterComponent createFilterComponent() {
		FilterComponentImpl filterComponent = new FilterComponentImpl();
		return filterComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FormalityLevelReference createFormalityLevelReference() {
		FormalityLevelReferenceImpl formalityLevelReference = new FormalityLevelReferenceImpl();
		return formalityLevelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FormatReference createFormatReference() {
		FormatReferenceImpl formatReference = new FormatReferenceImpl();
		return formatReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LanguageReference createLanguageReference() {
		LanguageReferenceImpl languageReference = new LanguageReferenceImpl();
		return languageReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MapCorrelationReference createMapCorrelationReference() {
		MapCorrelationReferenceImpl mapCorrelationReference = new MapCorrelationReferenceImpl();
		return mapCorrelationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MapReference createMapReference() {
		MapReferenceImpl mapReference = new MapReferenceImpl();
		return mapReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MapVersionReference createMapVersionReference() {
		MapVersionReferenceImpl mapVersionReference = new MapVersionReferenceImpl();
		return mapVersionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MatchAlgorithmReference createMatchAlgorithmReference() {
		MatchAlgorithmReferenceImpl matchAlgorithmReference = new MatchAlgorithmReferenceImpl();
		return matchAlgorithmReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ModelAttributeReference createModelAttributeReference() {
		ModelAttributeReferenceImpl modelAttributeReference = new ModelAttributeReferenceImpl();
		return modelAttributeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NameAndMeaningReference createNameAndMeaningReference() {
		NameAndMeaningReferenceImpl nameAndMeaningReference = new NameAndMeaningReferenceImpl();
		return nameAndMeaningReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamedEntityReference createNamedEntityReference() {
		NamedEntityReferenceImpl namedEntityReference = new NamedEntityReferenceImpl();
		return namedEntityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamespaceReference createNamespaceReference() {
		NamespaceReferenceImpl namespaceReference = new NamespaceReferenceImpl();
		return namespaceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyDomainReference createOntologyDomainReference() {
		OntologyDomainReferenceImpl ontologyDomainReference = new OntologyDomainReferenceImpl();
		return ontologyDomainReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyEngineeringMethodologyReference createOntologyEngineeringMethodologyReference() {
		OntologyEngineeringMethodologyReferenceImpl ontologyEngineeringMethodologyReference = new OntologyEngineeringMethodologyReferenceImpl();
		return ontologyEngineeringMethodologyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyEngineeringToolReference createOntologyEngineeringToolReference() {
		OntologyEngineeringToolReferenceImpl ontologyEngineeringToolReference = new OntologyEngineeringToolReferenceImpl();
		return ontologyEngineeringToolReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyLanguageAndSyntax createOntologyLanguageAndSyntax() {
		OntologyLanguageAndSyntaxImpl ontologyLanguageAndSyntax = new OntologyLanguageAndSyntaxImpl();
		return ontologyLanguageAndSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyLanguageReference createOntologyLanguageReference() {
		OntologyLanguageReferenceImpl ontologyLanguageReference = new OntologyLanguageReferenceImpl();
		return ontologyLanguageReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologySyntaxReference createOntologySyntaxReference() {
		OntologySyntaxReferenceImpl ontologySyntaxReference = new OntologySyntaxReferenceImpl();
		return ontologySyntaxReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyTaskReference createOntologyTaskReference() {
		OntologyTaskReferenceImpl ontologyTaskReference = new OntologyTaskReferenceImpl();
		return ontologyTaskReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OntologyTypeReference createOntologyTypeReference() {
		OntologyTypeReferenceImpl ontologyTypeReference = new OntologyTypeReferenceImpl();
		return ontologyTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OpaqueData createOpaqueData() {
		OpaqueDataImpl opaqueData = new OpaqueDataImpl();
		return opaqueData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PredicateReference createPredicateReference() {
		PredicateReferenceImpl predicateReference = new PredicateReferenceImpl();
		return predicateReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertyReference createPropertyReference() {
		PropertyReferenceImpl propertyReference = new PropertyReferenceImpl();
		return propertyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReasoningAlgorithmReference createReasoningAlgorithmReference() {
		ReasoningAlgorithmReferenceImpl reasoningAlgorithmReference = new ReasoningAlgorithmReferenceImpl();
		return reasoningAlgorithmReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceVersionDescriptionDirectoryEntry createResourceVersionDescriptionDirectoryEntry() {
		ResourceVersionDescriptionDirectoryEntryImpl resourceVersionDescriptionDirectoryEntry = new ResourceVersionDescriptionDirectoryEntryImpl();
		return resourceVersionDescriptionDirectoryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RESTResource createRESTResource() {
		RESTResourceImpl restResource = new RESTResourceImpl();
		return restResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoleReference createRoleReference() {
		RoleReferenceImpl roleReference = new RoleReferenceImpl();
		return roleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ScopedEntityName createScopedEntityName() {
		ScopedEntityNameImpl scopedEntityName = new ScopedEntityNameImpl();
		return scopedEntityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SortCriteria createSortCriteria() {
		SortCriteriaImpl sortCriteria = new SortCriteriaImpl();
		return sortCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SortCriterion createSortCriterion() {
		SortCriterionImpl sortCriterion = new SortCriterionImpl();
		return sortCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceAndNotation createSourceAndNotation() {
		SourceAndNotationImpl sourceAndNotation = new SourceAndNotationImpl();
		return sourceAndNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceAndRoleReference createSourceAndRoleReference() {
		SourceAndRoleReferenceImpl sourceAndRoleReference = new SourceAndRoleReferenceImpl();
		return sourceAndRoleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceReference createSourceReference() {
		SourceReferenceImpl sourceReference = new SourceReferenceImpl();
		return sourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatementTarget createStatementTarget() {
		StatementTargetImpl statementTarget = new StatementTargetImpl();
		return statementTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatusReference createStatusReference() {
		StatusReferenceImpl statusReference = new StatusReferenceImpl();
		return statusReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TsAnyType createTsAnyType() {
		TsAnyTypeImpl tsAnyType = new TsAnyTypeImpl();
		return tsAnyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URIAndEntityName createURIAndEntityName() {
		URIAndEntityNameImpl uriAndEntityName = new URIAndEntityNameImpl();
		return uriAndEntityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetDefinitionReference createValueSetDefinitionReference() {
		ValueSetDefinitionReferenceImpl valueSetDefinitionReference = new ValueSetDefinitionReferenceImpl();
		return valueSetDefinitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetReference createValueSetReference() {
		ValueSetReferenceImpl valueSetReference = new ValueSetReferenceImpl();
		return valueSetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VersionTagReference createVersionTagReference() {
		VersionTagReferenceImpl versionTagReference = new VersionTagReferenceImpl();
		return versionTagReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationDirection createAssociationDirectionFromString(EDataType eDataType, String initialValue) {
		AssociationDirection result = AssociationDirection.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAssociationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeCommitted createChangeCommittedFromString(EDataType eDataType, String initialValue) {
		ChangeCommitted result = ChangeCommitted.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertChangeCommittedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeType createChangeTypeFromString(EDataType eDataType, String initialValue) {
		ChangeType result = ChangeType.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertChangeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompleteDirectory createCompleteDirectoryFromString(EDataType eDataType, String initialValue) {
		CompleteDirectory result = CompleteDirectory.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertCompleteDirectoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CTS2ResourceType createCTS2ResourceTypeFromString(EDataType eDataType, String initialValue) {
		CTS2ResourceType result = CTS2ResourceType.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertCTS2ResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DefinitionRole createDefinitionRoleFromString(EDataType eDataType, String initialValue) {
		DefinitionRole result = DefinitionRole.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertDefinitionRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntryState createEntryStateFromString(EDataType eDataType, String initialValue) {
		EntryState result = EntryState.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertEntryStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FinalizableState createFinalizableStateFromString(EDataType eDataType, String initialValue) {
		FinalizableState result = FinalizableState.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertFinalizableStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NoteType createNoteTypeFromString(EDataType eDataType, String initialValue) {
		NoteType result = NoteType.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertNoteTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SetOperator createSetOperatorFromString(EDataType eDataType, String initialValue) {
		SetOperator result = SetOperator.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertSetOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SortDirection createSortDirectionFromString(EDataType eDataType, String initialValue) {
		SortDirection result = SortDirection.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertSortDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TargetReferenceType createTargetReferenceTypeFromString(EDataType eDataType, String initialValue) {
		TargetReferenceType result = TargetReferenceType.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" +
					eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTargetReferenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null
				? null
				: instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger createAmountOfTimeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger) XMLTypeFactory.eINSTANCE.createFromString(
			XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAmountOfTimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AssociationDirection createAssociationDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createAssociationDirectionFromString(CorePackage.Literals.ASSOCIATION_DIRECTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAssociationDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssociationDirectionToString(CorePackage.Literals.ASSOCIATION_DIRECTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createAssociationDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAssociationDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Boolean createBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createBooleanFromString(CorePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBooleanToString(CorePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeCommitted createChangeCommittedObjectFromString(EDataType eDataType, String initialValue) {
		return createChangeCommittedFromString(CorePackage.Literals.CHANGE_COMMITTED, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertChangeCommittedObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChangeCommittedToString(CorePackage.Literals.CHANGE_COMMITTED, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createChangeSetDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertChangeSetDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createChangeSetURIFromString(EDataType eDataType, String initialValue) {
		return createPersistentURIFromString(CorePackage.Literals.PERSISTENT_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertChangeSetURIToString(EDataType eDataType, Object instanceValue) {
		return convertPersistentURIToString(CorePackage.Literals.PERSISTENT_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeType createChangeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createChangeTypeFromString(CorePackage.Literals.CHANGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertChangeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChangeTypeToString(CorePackage.Literals.CHANGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createCodeSystemCatalogEntryDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertCodeSystemCatalogEntryDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createCodeSystemNameFromString(EDataType eDataType, String initialValue) {
		return createLocalIdentifierFromString(CorePackage.Literals.LOCAL_IDENTIFIER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertCodeSystemNameToString(EDataType eDataType, Object instanceValue) {
		return convertLocalIdentifierToString(CorePackage.Literals.LOCAL_IDENTIFIER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createCodeSystemVersionCatalogEntryDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertCodeSystemVersionCatalogEntryDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createCodeSystemVersionNameFromString(EDataType eDataType, String initialValue) {
		return createLocalIdentifierFromString(CorePackage.Literals.LOCAL_IDENTIFIER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertCodeSystemVersionNameToString(EDataType eDataType, Object instanceValue) {
		return convertLocalIdentifierToString(CorePackage.Literals.LOCAL_IDENTIFIER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompleteDirectory createCompleteDirectoryObjectFromString(EDataType eDataType, String initialValue) {
		return createCompleteDirectoryFromString(CorePackage.Literals.COMPLETE_DIRECTORY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertCompleteDirectoryObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompleteDirectoryToString(CorePackage.Literals.COMPLETE_DIRECTORY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createConceptDomainBindingDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertConceptDomainBindingDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createConceptDomainCatalogEntryDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertConceptDomainCatalogEntryDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createConceptDomainNameFromString(EDataType eDataType, String initialValue) {
		return createLocalIdentifierFromString(CorePackage.Literals.LOCAL_IDENTIFIER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertConceptDomainNameToString(EDataType eDataType, Object instanceValue) {
		return convertLocalIdentifierToString(CorePackage.Literals.LOCAL_IDENTIFIER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CTS2ResourceType createCTS2ResourceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCTS2ResourceTypeFromString(CorePackage.Literals.CTS2_RESOURCE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertCTS2ResourceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCTS2ResourceTypeToString(CorePackage.Literals.CTS2_RESOURCE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XMLGregorianCalendar createDateAndTimeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar) XMLTypeFactory.eINSTANCE.createFromString(
			XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertDateAndTimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DefinitionRole createDefinitionRoleObjectFromString(EDataType eDataType, String initialValue) {
		return createDefinitionRoleFromString(CorePackage.Literals.DEFINITION_ROLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertDefinitionRoleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefinitionRoleToString(CorePackage.Literals.DEFINITION_ROLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createLocalURIFromString(CorePackage.Literals.LOCAL_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertLocalURIToString(CorePackage.Literals.LOCAL_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createDocumentURIFromString(EDataType eDataType, String initialValue) {
		return createPersistentURIFromString(CorePackage.Literals.PERSISTENT_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertDocumentURIToString(EDataType eDataType, Object instanceValue) {
		return convertPersistentURIToString(CorePackage.Literals.PERSISTENT_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createEntityDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertEntityDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntryState createEntryStateObjectFromString(EDataType eDataType, String initialValue) {
		return createEntryStateFromString(CorePackage.Literals.ENTRY_STATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertEntryStateObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEntryStateToString(CorePackage.Literals.ENTRY_STATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createEnumerationFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertEnumerationToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createExternalURIFromString(EDataType eDataType, String initialValue) {
		return createPersistentURIFromString(CorePackage.Literals.PERSISTENT_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertExternalURIToString(EDataType eDataType, Object instanceValue) {
		return convertPersistentURIToString(CorePackage.Literals.PERSISTENT_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FinalizableState createFinalizableStateObjectFromString(EDataType eDataType, String initialValue) {
		return createFinalizableStateFromString(CorePackage.Literals.FINALIZABLE_STATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertFinalizableStateObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFinalizableStateToString(CorePackage.Literals.FINALIZABLE_STATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createLocalIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertLocalIdentifierToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createLocalURIFromString(EDataType eDataType, String initialValue) {
		return createURIFromString(CorePackage.Literals.URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertLocalURIToString(EDataType eDataType, Object instanceValue) {
		return convertURIToString(CorePackage.Literals.URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createMapCatalogEntryDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertMapCatalogEntryDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createMapEntryDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertMapEntryDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createMapNameFromString(EDataType eDataType, String initialValue) {
		return createLocalIdentifierFromString(CorePackage.Literals.LOCAL_IDENTIFIER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertMapNameToString(EDataType eDataType, Object instanceValue) {
		return convertLocalIdentifierToString(CorePackage.Literals.LOCAL_IDENTIFIER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createMapVersionDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertMapVersionDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createMapVersionNameFromString(EDataType eDataType, String initialValue) {
		return createLocalIdentifierFromString(CorePackage.Literals.LOCAL_IDENTIFIER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertMapVersionNameToString(EDataType eDataType, Object instanceValue) {
		return convertLocalIdentifierToString(CorePackage.Literals.LOCAL_IDENTIFIER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Double createMatchStrengthFromString(EDataType eDataType, String initialValue) {
		return (Double) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertMatchStrengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Double createMatchStrengthObjectFromString(EDataType eDataType, String initialValue) {
		return createMatchStrengthFromString(CorePackage.Literals.MATCH_STRENGTH, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertMatchStrengthObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMatchStrengthToString(CorePackage.Literals.MATCH_STRENGTH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createNamespaceIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertNamespaceIdentifierToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger createNaturalNumberFromString(EDataType eDataType, String initialValue) {
		return (BigInteger) XMLTypeFactory.eINSTANCE.createFromString(
			XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertNaturalNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NoteType createNoteTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNoteTypeFromString(CorePackage.Literals.NOTE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertNoteTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNoteTypeToString(CorePackage.Literals.NOTE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createPersistentURIFromString(EDataType eDataType, String initialValue) {
		return createURIFromString(CorePackage.Literals.URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertPersistentURIToString(EDataType eDataType, Object instanceValue) {
		return convertURIToString(CorePackage.Literals.URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createRenderingURIFromString(EDataType eDataType, String initialValue) {
		return createLocalURIFromString(CorePackage.Literals.LOCAL_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertRenderingURIToString(EDataType eDataType, Object instanceValue) {
		return convertLocalURIToString(CorePackage.Literals.LOCAL_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createResolvedValueSetDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertResolvedValueSetDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createServiceURIFromString(EDataType eDataType, String initialValue) {
		return createLocalURIFromString(CorePackage.Literals.LOCAL_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertServiceURIToString(EDataType eDataType, Object instanceValue) {
		return convertLocalURIToString(CorePackage.Literals.LOCAL_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SetOperator createSetOperatorObjectFromString(EDataType eDataType, String initialValue) {
		return createSetOperatorFromString(CorePackage.Literals.SET_OPERATOR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertSetOperatorObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSetOperatorToString(CorePackage.Literals.SET_OPERATOR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SortDirection createSortDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createSortDirectionFromString(CorePackage.Literals.SORT_DIRECTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertSortDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSortDirectionToString(CorePackage.Literals.SORT_DIRECTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createStatementDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertStatementDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TargetReferenceType createTargetReferenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTargetReferenceTypeFromString(CorePackage.Literals.TARGET_REFERENCE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertTargetReferenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTargetReferenceTypeToString(CorePackage.Literals.TARGET_REFERENCE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createURIFromString(EDataType eDataType, String initialValue) {
		return (String) XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createValueSetCatalogEntryDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertValueSetCatalogEntryDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createValueSetDefinitionDirectoryURIFromString(EDataType eDataType, String initialValue) {
		return createDirectoryURIFromString(CorePackage.Literals.DIRECTORY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertValueSetDefinitionDirectoryURIToString(EDataType eDataType, Object instanceValue) {
		return convertDirectoryURIToString(CorePackage.Literals.DIRECTORY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createValueSetNameFromString(EDataType eDataType, String initialValue) {
		return createLocalIdentifierFromString(CorePackage.Literals.LOCAL_IDENTIFIER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertValueSetNameToString(EDataType eDataType, Object instanceValue) {
		return convertLocalIdentifierToString(CorePackage.Literals.LOCAL_IDENTIFIER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String createVersionTagNameFromString(EDataType eDataType, String initialValue) {
		return createLocalIdentifierFromString(CorePackage.Literals.LOCAL_IDENTIFIER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertVersionTagNameToString(EDataType eDataType, Object instanceValue) {
		return convertLocalIdentifierToString(CorePackage.Literals.LOCAL_IDENTIFIER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} // CoreFactoryImpl
