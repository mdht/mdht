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

import java.math.BigInteger;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.openhealthtools.mdht.cts2.core.AbstractResourceDescription;
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
import org.openhealthtools.mdht.cts2.core.Changeable;
import org.openhealthtools.mdht.cts2.core.CodeSystemCategoryReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;
import org.openhealthtools.mdht.cts2.core.Comment;
import org.openhealthtools.mdht.cts2.core.CompleteDirectory;
import org.openhealthtools.mdht.cts2.core.ConceptDomainReference;
import org.openhealthtools.mdht.cts2.core.ContextReference;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.Definition;
import org.openhealthtools.mdht.cts2.core.DefinitionRole;
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
import org.openhealthtools.mdht.cts2.core.EntryState;
import org.openhealthtools.mdht.cts2.core.Example;
import org.openhealthtools.mdht.cts2.core.Filter;
import org.openhealthtools.mdht.cts2.core.FilterComponent;
import org.openhealthtools.mdht.cts2.core.Finalizable;
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
import org.openhealthtools.mdht.cts2.core.Note;
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
import org.openhealthtools.mdht.cts2.core.ResourceDescription;
import org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescription;
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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage
 * @generated
 */
public class CoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final CoreValidator INSTANCE = new CoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic
	 * {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.cts2.core";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CoreValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return CorePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION:
				return validateAbstractResourceDescription((AbstractResourceDescription) value, diagnostics, context);
			case CorePackage.ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY:
				return validateAbstractResourceDescriptionDirectoryEntry(
					(AbstractResourceDescriptionDirectoryEntry) value, diagnostics, context);
			case CorePackage.ANONYMOUS_ENTITY_REFERENCE:
				return validateAnonymousEntityReference((AnonymousEntityReference) value, diagnostics, context);
			case CorePackage.ANONYMOUS_STATEMENT:
				return validateAnonymousStatement((AnonymousStatement) value, diagnostics, context);
			case CorePackage.ASSOCIATION_REFERENCE:
				return validateAssociationReference((AssociationReference) value, diagnostics, context);
			case CorePackage.BINDING_QUALIFIER_REFERENCE:
				return validateBindingQualifierReference((BindingQualifierReference) value, diagnostics, context);
			case CorePackage.CASE_SIGNIFICANCE_REFERENCE:
				return validateCaseSignificanceReference((CaseSignificanceReference) value, diagnostics, context);
			case CorePackage.CHANGEABLE:
				return validateChangeable((Changeable) value, diagnostics, context);
			case CorePackage.CHANGE_DESCRIPTION:
				return validateChangeDescription((ChangeDescription) value, diagnostics, context);
			case CorePackage.CHANGE_SET_BASE:
				return validateChangeSetBase((ChangeSetBase) value, diagnostics, context);
			case CorePackage.CODE_SYSTEM_CATEGORY_REFERENCE:
				return validateCodeSystemCategoryReference((CodeSystemCategoryReference) value, diagnostics, context);
			case CorePackage.CODE_SYSTEM_REFERENCE:
				return validateCodeSystemReference((CodeSystemReference) value, diagnostics, context);
			case CorePackage.CODE_SYSTEM_VERSION_REFERENCE:
				return validateCodeSystemVersionReference((CodeSystemVersionReference) value, diagnostics, context);
			case CorePackage.COMMENT:
				return validateComment((Comment) value, diagnostics, context);
			case CorePackage.CONCEPT_DOMAIN_REFERENCE:
				return validateConceptDomainReference((ConceptDomainReference) value, diagnostics, context);
			case CorePackage.CONTEXT_REFERENCE:
				return validateContextReference((ContextReference) value, diagnostics, context);
			case CorePackage.DEFINITION:
				return validateDefinition((Definition) value, diagnostics, context);
			case CorePackage.DESCRIPTION_IN_CODE_SYSTEM:
				return validateDescriptionInCodeSystem((DescriptionInCodeSystem) value, diagnostics, context);
			case CorePackage.DESIGNATION_FIDELITY_REFERENCE:
				return validateDesignationFidelityReference((DesignationFidelityReference) value, diagnostics, context);
			case CorePackage.DESIGNATION_TYPE_REFERENCE:
				return validateDesignationTypeReference((DesignationTypeReference) value, diagnostics, context);
			case CorePackage.DIRECTORY:
				return validateDirectory((Directory) value, diagnostics, context);
			case CorePackage.DIRECTORY_ENTRY:
				return validateDirectoryEntry((DirectoryEntry) value, diagnostics, context);
			case CorePackage.ENTITY_EXPRESSION:
				return validateEntityExpression((EntityExpression) value, diagnostics, context);
			case CorePackage.ENTITY_REFERENCE:
				return validateEntityReference((EntityReference) value, diagnostics, context);
			case CorePackage.ENTITY_REFERENCE_LIST:
				return validateEntityReferenceList((EntityReferenceList) value, diagnostics, context);
			case CorePackage.ENTITY_SYNOPSIS:
				return validateEntitySynopsis((EntitySynopsis) value, diagnostics, context);
			case CorePackage.ENTRY_DESCRIPTION:
				return validateEntryDescription((EntryDescription) value, diagnostics, context);
			case CorePackage.EXAMPLE:
				return validateExample((Example) value, diagnostics, context);
			case CorePackage.FILTER:
				return validateFilter((Filter) value, diagnostics, context);
			case CorePackage.FILTER_COMPONENT:
				return validateFilterComponent((FilterComponent) value, diagnostics, context);
			case CorePackage.FINALIZABLE:
				return validateFinalizable((Finalizable) value, diagnostics, context);
			case CorePackage.FORMALITY_LEVEL_REFERENCE:
				return validateFormalityLevelReference((FormalityLevelReference) value, diagnostics, context);
			case CorePackage.FORMAT_REFERENCE:
				return validateFormatReference((FormatReference) value, diagnostics, context);
			case CorePackage.LANGUAGE_REFERENCE:
				return validateLanguageReference((LanguageReference) value, diagnostics, context);
			case CorePackage.MAP_CORRELATION_REFERENCE:
				return validateMapCorrelationReference((MapCorrelationReference) value, diagnostics, context);
			case CorePackage.MAP_REFERENCE:
				return validateMapReference((MapReference) value, diagnostics, context);
			case CorePackage.MAP_VERSION_REFERENCE:
				return validateMapVersionReference((MapVersionReference) value, diagnostics, context);
			case CorePackage.MATCH_ALGORITHM_REFERENCE:
				return validateMatchAlgorithmReference((MatchAlgorithmReference) value, diagnostics, context);
			case CorePackage.MESSAGE:
				return validateMessage((Message) value, diagnostics, context);
			case CorePackage.MODEL_ATTRIBUTE_REFERENCE:
				return validateModelAttributeReference((ModelAttributeReference) value, diagnostics, context);
			case CorePackage.NAME_AND_MEANING_REFERENCE:
				return validateNameAndMeaningReference((NameAndMeaningReference) value, diagnostics, context);
			case CorePackage.NAMED_ENTITY_REFERENCE:
				return validateNamedEntityReference((NamedEntityReference) value, diagnostics, context);
			case CorePackage.NAMESPACE_REFERENCE:
				return validateNamespaceReference((NamespaceReference) value, diagnostics, context);
			case CorePackage.NOTE:
				return validateNote((Note) value, diagnostics, context);
			case CorePackage.ONTOLOGY_DOMAIN_REFERENCE:
				return validateOntologyDomainReference((OntologyDomainReference) value, diagnostics, context);
			case CorePackage.ONTOLOGY_ENGINEERING_METHODOLOGY_REFERENCE:
				return validateOntologyEngineeringMethodologyReference(
					(OntologyEngineeringMethodologyReference) value, diagnostics, context);
			case CorePackage.ONTOLOGY_ENGINEERING_TOOL_REFERENCE:
				return validateOntologyEngineeringToolReference(
					(OntologyEngineeringToolReference) value, diagnostics, context);
			case CorePackage.ONTOLOGY_LANGUAGE_AND_SYNTAX:
				return validateOntologyLanguageAndSyntax((OntologyLanguageAndSyntax) value, diagnostics, context);
			case CorePackage.ONTOLOGY_LANGUAGE_REFERENCE:
				return validateOntologyLanguageReference((OntologyLanguageReference) value, diagnostics, context);
			case CorePackage.ONTOLOGY_SYNTAX_REFERENCE:
				return validateOntologySyntaxReference((OntologySyntaxReference) value, diagnostics, context);
			case CorePackage.ONTOLOGY_TASK_REFERENCE:
				return validateOntologyTaskReference((OntologyTaskReference) value, diagnostics, context);
			case CorePackage.ONTOLOGY_TYPE_REFERENCE:
				return validateOntologyTypeReference((OntologyTypeReference) value, diagnostics, context);
			case CorePackage.OPAQUE_DATA:
				return validateOpaqueData((OpaqueData) value, diagnostics, context);
			case CorePackage.PARAMETER:
				return validateParameter((Parameter) value, diagnostics, context);
			case CorePackage.PREDICATE_REFERENCE:
				return validatePredicateReference((PredicateReference) value, diagnostics, context);
			case CorePackage.PROPERTY:
				return validateProperty((Property) value, diagnostics, context);
			case CorePackage.PROPERTY_REFERENCE:
				return validatePropertyReference((PropertyReference) value, diagnostics, context);
			case CorePackage.REASONING_ALGORITHM_REFERENCE:
				return validateReasoningAlgorithmReference((ReasoningAlgorithmReference) value, diagnostics, context);
			case CorePackage.RESOURCE_DESCRIPTION:
				return validateResourceDescription((ResourceDescription) value, diagnostics, context);
			case CorePackage.RESOURCE_DESCRIPTION_DIRECTORY_ENTRY:
				return validateResourceDescriptionDirectoryEntry(
					(ResourceDescriptionDirectoryEntry) value, diagnostics, context);
			case CorePackage.RESOURCE_VERSION_DESCRIPTION:
				return validateResourceVersionDescription((ResourceVersionDescription) value, diagnostics, context);
			case CorePackage.RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY:
				return validateResourceVersionDescriptionDirectoryEntry(
					(ResourceVersionDescriptionDirectoryEntry) value, diagnostics, context);
			case CorePackage.REST_RESOURCE:
				return validateRESTResource((RESTResource) value, diagnostics, context);
			case CorePackage.ROLE_REFERENCE:
				return validateRoleReference((RoleReference) value, diagnostics, context);
			case CorePackage.SCOPED_ENTITY_NAME:
				return validateScopedEntityName((ScopedEntityName) value, diagnostics, context);
			case CorePackage.SORT_CRITERIA:
				return validateSortCriteria((SortCriteria) value, diagnostics, context);
			case CorePackage.SORT_CRITERION:
				return validateSortCriterion((SortCriterion) value, diagnostics, context);
			case CorePackage.SOURCE_AND_NOTATION:
				return validateSourceAndNotation((SourceAndNotation) value, diagnostics, context);
			case CorePackage.SOURCE_AND_ROLE_REFERENCE:
				return validateSourceAndRoleReference((SourceAndRoleReference) value, diagnostics, context);
			case CorePackage.SOURCE_REFERENCE:
				return validateSourceReference((SourceReference) value, diagnostics, context);
			case CorePackage.STATEMENT_TARGET:
				return validateStatementTarget((StatementTarget) value, diagnostics, context);
			case CorePackage.STATUS_REFERENCE:
				return validateStatusReference((StatusReference) value, diagnostics, context);
			case CorePackage.TS_ANY_TYPE:
				return validateTsAnyType((TsAnyType) value, diagnostics, context);
			case CorePackage.URI_AND_ENTITY_NAME:
				return validateURIAndEntityName((URIAndEntityName) value, diagnostics, context);
			case CorePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot) value, diagnostics, context);
			case CorePackage.VALUE_SET_DEFINITION_REFERENCE:
				return validateValueSetDefinitionReference((ValueSetDefinitionReference) value, diagnostics, context);
			case CorePackage.VALUE_SET_REFERENCE:
				return validateValueSetReference((ValueSetReference) value, diagnostics, context);
			case CorePackage.VERSION_TAG_REFERENCE:
				return validateVersionTagReference((VersionTagReference) value, diagnostics, context);
			case CorePackage.ASSOCIATION_DIRECTION:
				return validateAssociationDirection((AssociationDirection) value, diagnostics, context);
			case CorePackage.CHANGE_COMMITTED:
				return validateChangeCommitted((ChangeCommitted) value, diagnostics, context);
			case CorePackage.CHANGE_TYPE:
				return validateChangeType((ChangeType) value, diagnostics, context);
			case CorePackage.COMPLETE_DIRECTORY:
				return validateCompleteDirectory((CompleteDirectory) value, diagnostics, context);
			case CorePackage.CTS2_RESOURCE_TYPE:
				return validateCTS2ResourceType((CTS2ResourceType) value, diagnostics, context);
			case CorePackage.DEFINITION_ROLE:
				return validateDefinitionRole((DefinitionRole) value, diagnostics, context);
			case CorePackage.ENTRY_STATE:
				return validateEntryState((EntryState) value, diagnostics, context);
			case CorePackage.FINALIZABLE_STATE:
				return validateFinalizableState((FinalizableState) value, diagnostics, context);
			case CorePackage.NOTE_TYPE:
				return validateNoteType((NoteType) value, diagnostics, context);
			case CorePackage.SET_OPERATOR:
				return validateSetOperator((SetOperator) value, diagnostics, context);
			case CorePackage.SORT_DIRECTION:
				return validateSortDirection((SortDirection) value, diagnostics, context);
			case CorePackage.TARGET_REFERENCE_TYPE:
				return validateTargetReferenceType((TargetReferenceType) value, diagnostics, context);
			case CorePackage.AMOUNT_OF_TIME:
				return validateAmountOfTime((BigInteger) value, diagnostics, context);
			case CorePackage.ASSOCIATION_DIRECTION_OBJECT:
				return validateAssociationDirectionObject((AssociationDirection) value, diagnostics, context);
			case CorePackage.ASSOCIATION_DIRECTORY_URI:
				return validateAssociationDirectoryURI((String) value, diagnostics, context);
			case CorePackage.BOOLEAN:
				return validateBoolean((Boolean) value, diagnostics, context);
			case CorePackage.BOOLEAN_OBJECT:
				return validateBooleanObject((Boolean) value, diagnostics, context);
			case CorePackage.CHANGE_COMMITTED_OBJECT:
				return validateChangeCommittedObject((ChangeCommitted) value, diagnostics, context);
			case CorePackage.CHANGE_SET_DIRECTORY_URI:
				return validateChangeSetDirectoryURI((String) value, diagnostics, context);
			case CorePackage.CHANGE_SET_URI:
				return validateChangeSetURI((String) value, diagnostics, context);
			case CorePackage.CHANGE_TYPE_OBJECT:
				return validateChangeTypeObject((ChangeType) value, diagnostics, context);
			case CorePackage.CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY_URI:
				return validateCodeSystemCatalogEntryDirectoryURI((String) value, diagnostics, context);
			case CorePackage.CODE_SYSTEM_NAME:
				return validateCodeSystemName((String) value, diagnostics, context);
			case CorePackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY_URI:
				return validateCodeSystemVersionCatalogEntryDirectoryURI((String) value, diagnostics, context);
			case CorePackage.CODE_SYSTEM_VERSION_NAME:
				return validateCodeSystemVersionName((String) value, diagnostics, context);
			case CorePackage.COMPLETE_DIRECTORY_OBJECT:
				return validateCompleteDirectoryObject((CompleteDirectory) value, diagnostics, context);
			case CorePackage.CONCEPT_DOMAIN_BINDING_DIRECTORY_URI:
				return validateConceptDomainBindingDirectoryURI((String) value, diagnostics, context);
			case CorePackage.CONCEPT_DOMAIN_CATALOG_ENTRY_DIRECTORY_URI:
				return validateConceptDomainCatalogEntryDirectoryURI((String) value, diagnostics, context);
			case CorePackage.CONCEPT_DOMAIN_NAME:
				return validateConceptDomainName((String) value, diagnostics, context);
			case CorePackage.CTS2_RESOURCE_TYPE_OBJECT:
				return validateCTS2ResourceTypeObject((CTS2ResourceType) value, diagnostics, context);
			case CorePackage.DATE_AND_TIME:
				return validateDateAndTime((XMLGregorianCalendar) value, diagnostics, context);
			case CorePackage.DEFINITION_ROLE_OBJECT:
				return validateDefinitionRoleObject((DefinitionRole) value, diagnostics, context);
			case CorePackage.DIRECTORY_URI:
				return validateDirectoryURI((String) value, diagnostics, context);
			case CorePackage.DOCUMENT_URI:
				return validateDocumentURI((String) value, diagnostics, context);
			case CorePackage.ENTITY_DIRECTORY_URI:
				return validateEntityDirectoryURI((String) value, diagnostics, context);
			case CorePackage.ENTRY_STATE_OBJECT:
				return validateEntryStateObject((EntryState) value, diagnostics, context);
			case CorePackage.ENUMERATION:
				return validateEnumeration((String) value, diagnostics, context);
			case CorePackage.EXTERNAL_URI:
				return validateExternalURI((String) value, diagnostics, context);
			case CorePackage.FINALIZABLE_STATE_OBJECT:
				return validateFinalizableStateObject((FinalizableState) value, diagnostics, context);
			case CorePackage.LOCAL_IDENTIFIER:
				return validateLocalIdentifier((String) value, diagnostics, context);
			case CorePackage.LOCAL_URI:
				return validateLocalURI((String) value, diagnostics, context);
			case CorePackage.MAP_CATALOG_ENTRY_DIRECTORY_URI:
				return validateMapCatalogEntryDirectoryURI((String) value, diagnostics, context);
			case CorePackage.MAP_ENTRY_DIRECTORY_URI:
				return validateMapEntryDirectoryURI((String) value, diagnostics, context);
			case CorePackage.MAP_NAME:
				return validateMapName((String) value, diagnostics, context);
			case CorePackage.MAP_VERSION_DIRECTORY_URI:
				return validateMapVersionDirectoryURI((String) value, diagnostics, context);
			case CorePackage.MAP_VERSION_NAME:
				return validateMapVersionName((String) value, diagnostics, context);
			case CorePackage.MATCH_STRENGTH:
				return validateMatchStrength((Double) value, diagnostics, context);
			case CorePackage.MATCH_STRENGTH_OBJECT:
				return validateMatchStrengthObject((Double) value, diagnostics, context);
			case CorePackage.NAMESPACE_IDENTIFIER:
				return validateNamespaceIdentifier((String) value, diagnostics, context);
			case CorePackage.NATURAL_NUMBER:
				return validateNaturalNumber((BigInteger) value, diagnostics, context);
			case CorePackage.NOTE_TYPE_OBJECT:
				return validateNoteTypeObject((NoteType) value, diagnostics, context);
			case CorePackage.PERSISTENT_URI:
				return validatePersistentURI((String) value, diagnostics, context);
			case CorePackage.RENDERING_URI:
				return validateRenderingURI((String) value, diagnostics, context);
			case CorePackage.RESOLVED_VALUE_SET_DIRECTORY_URI:
				return validateResolvedValueSetDirectoryURI((String) value, diagnostics, context);
			case CorePackage.SERVICE_URI:
				return validateServiceURI((String) value, diagnostics, context);
			case CorePackage.SET_OPERATOR_OBJECT:
				return validateSetOperatorObject((SetOperator) value, diagnostics, context);
			case CorePackage.SORT_DIRECTION_OBJECT:
				return validateSortDirectionObject((SortDirection) value, diagnostics, context);
			case CorePackage.STATEMENT_DIRECTORY_URI:
				return validateStatementDirectoryURI((String) value, diagnostics, context);
			case CorePackage.STRING:
				return validateString((String) value, diagnostics, context);
			case CorePackage.TARGET_REFERENCE_TYPE_OBJECT:
				return validateTargetReferenceTypeObject((TargetReferenceType) value, diagnostics, context);
			case CorePackage.URI:
				return validateURI((String) value, diagnostics, context);
			case CorePackage.VALUE_SET_CATALOG_ENTRY_DIRECTORY_URI:
				return validateValueSetCatalogEntryDirectoryURI((String) value, diagnostics, context);
			case CorePackage.VALUE_SET_DEFINITION_DIRECTORY_URI:
				return validateValueSetDefinitionDirectoryURI((String) value, diagnostics, context);
			case CorePackage.VALUE_SET_NAME:
				return validateValueSetName((String) value, diagnostics, context);
			case CorePackage.VERSION_TAG_NAME:
				return validateVersionTagName((String) value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAbstractResourceDescription(AbstractResourceDescription abstractResourceDescription,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractResourceDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAbstractResourceDescriptionDirectoryEntry(
			AbstractResourceDescriptionDirectoryEntry abstractResourceDescriptionDirectoryEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractResourceDescriptionDirectoryEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAnonymousEntityReference(AnonymousEntityReference anonymousEntityReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anonymousEntityReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAnonymousStatement(AnonymousStatement anonymousStatement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anonymousStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssociationReference(AssociationReference associationReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBindingQualifierReference(BindingQualifierReference bindingQualifierReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindingQualifierReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCaseSignificanceReference(CaseSignificanceReference caseSignificanceReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(caseSignificanceReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateChangeable(Changeable changeable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateChangeDescription(ChangeDescription changeDescription, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateChangeSetBase(ChangeSetBase changeSetBase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeSetBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCodeSystemCategoryReference(CodeSystemCategoryReference codeSystemCategoryReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemCategoryReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCodeSystemReference(CodeSystemReference codeSystemReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCodeSystemVersionReference(CodeSystemVersionReference codeSystemVersionReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemVersionReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateConceptDomainReference(ConceptDomainReference conceptDomainReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptDomainReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateContextReference(ContextReference contextReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDefinition(Definition definition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDescriptionInCodeSystem(DescriptionInCodeSystem descriptionInCodeSystem,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionInCodeSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDesignationFidelityReference(DesignationFidelityReference designationFidelityReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designationFidelityReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDesignationTypeReference(DesignationTypeReference designationTypeReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designationTypeReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDirectory(Directory directory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDirectoryEntry(DirectoryEntry directoryEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directoryEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEntityExpression(EntityExpression entityExpression, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEntityReference(EntityReference entityReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEntityReferenceList(EntityReferenceList entityReferenceList, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityReferenceList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEntitySynopsis(EntitySynopsis entitySynopsis, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entitySynopsis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEntryDescription(EntryDescription entryDescription, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateExample(Example example, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(example, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFilter(Filter filter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFilterComponent(FilterComponent filterComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFinalizable(Finalizable finalizable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(finalizable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFormalityLevelReference(FormalityLevelReference formalityLevelReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formalityLevelReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFormatReference(FormatReference formatReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formatReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLanguageReference(LanguageReference languageReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languageReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMapCorrelationReference(MapCorrelationReference mapCorrelationReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapCorrelationReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMapReference(MapReference mapReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMapVersionReference(MapVersionReference mapVersionReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapVersionReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMatchAlgorithmReference(MatchAlgorithmReference matchAlgorithmReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(matchAlgorithmReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(message, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateModelAttributeReference(ModelAttributeReference modelAttributeReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelAttributeReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNameAndMeaningReference(NameAndMeaningReference nameAndMeaningReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameAndMeaningReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNamedEntityReference(NamedEntityReference namedEntityReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedEntityReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNamespaceReference(NamespaceReference namespaceReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namespaceReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNote(Note note, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(note, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOntologyDomainReference(OntologyDomainReference ontologyDomainReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ontologyDomainReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOntologyEngineeringMethodologyReference(
			OntologyEngineeringMethodologyReference ontologyEngineeringMethodologyReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ontologyEngineeringMethodologyReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOntologyEngineeringToolReference(
			OntologyEngineeringToolReference ontologyEngineeringToolReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ontologyEngineeringToolReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOntologyLanguageAndSyntax(OntologyLanguageAndSyntax ontologyLanguageAndSyntax,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ontologyLanguageAndSyntax, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOntologyLanguageReference(OntologyLanguageReference ontologyLanguageReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ontologyLanguageReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOntologySyntaxReference(OntologySyntaxReference ontologySyntaxReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ontologySyntaxReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOntologyTaskReference(OntologyTaskReference ontologyTaskReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ontologyTaskReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOntologyTypeReference(OntologyTypeReference ontologyTypeReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ontologyTypeReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOpaqueData(OpaqueData opaqueData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(opaqueData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePredicateReference(PredicateReference predicateReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(predicateReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePropertyReference(PropertyReference propertyReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateReasoningAlgorithmReference(ReasoningAlgorithmReference reasoningAlgorithmReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reasoningAlgorithmReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateResourceDescription(ResourceDescription resourceDescription, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateResourceDescriptionDirectoryEntry(
			ResourceDescriptionDirectoryEntry resourceDescriptionDirectoryEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceDescriptionDirectoryEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateResourceVersionDescription(ResourceVersionDescription resourceVersionDescription,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceVersionDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateResourceVersionDescriptionDirectoryEntry(
			ResourceVersionDescriptionDirectoryEntry resourceVersionDescriptionDirectoryEntry,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceVersionDescriptionDirectoryEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRESTResource(RESTResource restResource, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRoleReference(RoleReference roleReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateScopedEntityName(ScopedEntityName scopedEntityName, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scopedEntityName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSortCriteria(SortCriteria sortCriteria, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortCriteria, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSortCriterion(SortCriterion sortCriterion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSourceAndNotation(SourceAndNotation sourceAndNotation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceAndNotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSourceAndRoleReference(SourceAndRoleReference sourceAndRoleReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceAndRoleReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSourceReference(SourceReference sourceReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStatementTarget(StatementTarget statementTarget, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statementTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStatusReference(StatusReference statusReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statusReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTsAnyType(TsAnyType tsAnyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tsAnyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateURIAndEntityName(URIAndEntityName uriAndEntityName, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uriAndEntityName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateValueSetDefinitionReference(ValueSetDefinitionReference valueSetDefinitionReference,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetDefinitionReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateValueSetReference(ValueSetReference valueSetReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVersionTagReference(VersionTagReference versionTagReference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionTagReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssociationDirection(AssociationDirection associationDirection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateChangeCommitted(ChangeCommitted changeCommitted, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateChangeType(ChangeType changeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCompleteDirectory(CompleteDirectory completeDirectory, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCTS2ResourceType(CTS2ResourceType cts2ResourceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDefinitionRole(DefinitionRole definitionRole, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEntryState(EntryState entryState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFinalizableState(FinalizableState finalizableState, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNoteType(NoteType noteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSetOperator(SetOperator setOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSortDirection(SortDirection sortDirection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTargetReferenceType(TargetReferenceType targetReferenceType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAmountOfTime(BigInteger amountOfTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(amountOfTime, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssociationDirectionObject(AssociationDirection associationDirectionObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAssociationDirectoryURI(String associationDirectoryURI, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBoolean(boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateBooleanObject(Boolean booleanObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateChangeCommittedObject(ChangeCommitted changeCommittedObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateChangeSetDirectoryURI(String changeSetDirectoryURI, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateChangeSetURI(String changeSetURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateChangeTypeObject(ChangeType changeTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCodeSystemCatalogEntryDirectoryURI(String codeSystemCatalogEntryDirectoryURI,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCodeSystemName(String codeSystemName, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateLocalIdentifier_MinLength(codeSystemName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCodeSystemVersionCatalogEntryDirectoryURI(String codeSystemVersionCatalogEntryDirectoryURI,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCodeSystemVersionName(String codeSystemVersionName, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateLocalIdentifier_MinLength(codeSystemVersionName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCompleteDirectoryObject(CompleteDirectory completeDirectoryObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateConceptDomainBindingDirectoryURI(String conceptDomainBindingDirectoryURI,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateConceptDomainCatalogEntryDirectoryURI(String conceptDomainCatalogEntryDirectoryURI,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateConceptDomainName(String conceptDomainName, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateLocalIdentifier_MinLength(conceptDomainName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateCTS2ResourceTypeObject(CTS2ResourceType cts2ResourceTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDateAndTime(XMLGregorianCalendar dateAndTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDefinitionRoleObject(DefinitionRole definitionRoleObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDirectoryURI(String directoryURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDocumentURI(String documentURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEntityDirectoryURI(String entityDirectoryURI, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEntryStateObject(EntryState entryStateObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEnumeration(String enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateExternalURI(String externalURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateFinalizableStateObject(FinalizableState finalizableStateObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLocalIdentifier(String localIdentifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateLocalIdentifier_MinLength(localIdentifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Local Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLocalIdentifier_MinLength(String localIdentifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		int length = localIdentifier.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null) {
			reportMinLengthViolation(
				CorePackage.Literals.LOCAL_IDENTIFIER, localIdentifier, length, 1, diagnostics, context);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateLocalURI(String localURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMapCatalogEntryDirectoryURI(String mapCatalogEntryDirectoryURI, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMapEntryDirectoryURI(String mapEntryDirectoryURI, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMapName(String mapName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLocalIdentifier_MinLength(mapName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMapVersionDirectoryURI(String mapVersionDirectoryURI, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMapVersionName(String mapVersionName, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateLocalIdentifier_MinLength(mapVersionName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMatchStrength(double matchStrength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMatchStrength_Min(matchStrength, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validateMatchStrength_Max(matchStrength, diagnostics, context);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @see #validateMatchStrength_Min
	 */
	public static final double MATCH_STRENGTH__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Match Strength</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMatchStrength_Min(double matchStrength, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = matchStrength > MATCH_STRENGTH__MIN__VALUE;
		if (!result && diagnostics != null) {
			reportMinViolation(
				CorePackage.Literals.MATCH_STRENGTH, matchStrength, MATCH_STRENGTH__MIN__VALUE, false, diagnostics,
				context);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @see #validateMatchStrength_Max
	 */
	public static final double MATCH_STRENGTH__MAX__VALUE = 1.0;

	/**
	 * Validates the Max constraint of '<em>Match Strength</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMatchStrength_Max(double matchStrength, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = matchStrength <= MATCH_STRENGTH__MAX__VALUE;
		if (!result && diagnostics != null) {
			reportMaxViolation(
				CorePackage.Literals.MATCH_STRENGTH, matchStrength, MATCH_STRENGTH__MAX__VALUE, true, diagnostics,
				context);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMatchStrengthObject(Double matchStrengthObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateMatchStrength_Min(matchStrengthObject, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validateMatchStrength_Max(matchStrengthObject, diagnostics, context);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNamespaceIdentifier(String namespaceIdentifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNCName_Pattern(namespaceIdentifier, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validateNamespaceIdentifier_MinLength(namespaceIdentifier, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Namespace Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNamespaceIdentifier_MinLength(String namespaceIdentifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		int length = namespaceIdentifier.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null) {
			reportMinLengthViolation(
				CorePackage.Literals.NAMESPACE_IDENTIFIER, namespaceIdentifier, length, 1, diagnostics, context);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNaturalNumber(BigInteger naturalNumber, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(naturalNumber, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNoteTypeObject(NoteType noteTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePersistentURI(String persistentURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateRenderingURI(String renderingURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateResolvedValueSetDirectoryURI(String resolvedValueSetDirectoryURI,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateServiceURI(String serviceURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSetOperatorObject(SetOperator setOperatorObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSortDirectionObject(SortDirection sortDirectionObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateStatementDirectoryURI(String statementDirectoryURI, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTargetReferenceTypeObject(TargetReferenceType targetReferenceTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateURI(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateValueSetCatalogEntryDirectoryURI(String valueSetCatalogEntryDirectoryURI,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateValueSetDefinitionDirectoryURI(String valueSetDefinitionDirectoryURI,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateValueSetName(String valueSetName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLocalIdentifier_MinLength(valueSetName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateVersionTagName(String versionTagName, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateLocalIdentifier_MinLength(versionTagName, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // CoreValidator
