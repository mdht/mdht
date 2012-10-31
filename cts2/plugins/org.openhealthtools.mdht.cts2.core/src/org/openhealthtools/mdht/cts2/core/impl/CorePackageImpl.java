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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;
import org.openhealthtools.mdht.cts2.association.impl.AssociationPackageImpl;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage;
import org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemPackageImpl;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;
import org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionPackageImpl;
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
import org.openhealthtools.mdht.cts2.core.CoreFactory;
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
import org.openhealthtools.mdht.cts2.core.util.CoreValidator;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;
import org.openhealthtools.mdht.cts2.entity.impl.EntityPackageImpl;
import org.openhealthtools.mdht.cts2.statement.StatementPackage;
import org.openhealthtools.mdht.cts2.statement.impl.StatementPackageImpl;
import org.openhealthtools.mdht.cts2.valueset.ValueSetPackage;
import org.openhealthtools.mdht.cts2.valueset.impl.ValueSetPackageImpl;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;
import org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ValueSetDefinitionPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass abstractResourceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass abstractResourceDescriptionDirectoryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass anonymousEntityReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass anonymousStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass bindingQualifierReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass caseSignificanceReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass changeableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass changeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass changeSetBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemCategoryReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeSystemVersionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass conceptDomainReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass contextReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass descriptionInCodeSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass designationFidelityReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass designationTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass directoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass directoryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityReferenceListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entitySynopsisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entryDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass exampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass filterComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass finalizableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass formalityLevelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass formatReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass languageReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass mapCorrelationReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass mapReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass mapVersionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass matchAlgorithmReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass modelAttributeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nameAndMeaningReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass namedEntityReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass namespaceReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ontologyDomainReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ontologyEngineeringMethodologyReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ontologyEngineeringToolReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ontologyLanguageAndSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ontologyLanguageReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ontologySyntaxReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ontologyTaskReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ontologyTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass opaqueDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass predicateReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass propertyReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass reasoningAlgorithmReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resourceDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resourceDescriptionDirectoryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resourceVersionDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass resourceVersionDescriptionDirectoryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass restResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass roleReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass scopedEntityNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass sortCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass sortCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass sourceAndNotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass sourceAndRoleReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass sourceReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass statementTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass statusReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass tsAnyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass uriAndEntityNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetDefinitionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass valueSetReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass versionTagReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum associationDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum changeCommittedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum changeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum completeDirectoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum cts2ResourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum definitionRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum entryStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum finalizableStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum noteTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum setOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum sortDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum targetReferenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType amountOfTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType associationDirectionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType associationDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType booleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType changeCommittedObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType changeSetDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType changeSetURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType changeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType codeSystemCatalogEntryDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType codeSystemNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType codeSystemVersionCatalogEntryDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType codeSystemVersionNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType completeDirectoryObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType conceptDomainBindingDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType conceptDomainCatalogEntryDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType conceptDomainNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType cts2ResourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType dateAndTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType definitionRoleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType directoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType documentURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType entityDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType entryStateObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType enumerationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType externalURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType finalizableStateObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType localIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType localURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType mapCatalogEntryDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType mapEntryDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType mapNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType mapVersionDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType mapVersionNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType matchStrengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType matchStrengthObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType namespaceIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType naturalNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType noteTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType persistentURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType renderingURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType resolvedValueSetDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType serviceURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType setOperatorObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType sortDirectionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType statementDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType targetReferenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType valueSetCatalogEntryDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType valueSetDefinitionDirectoryURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType valueSetNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType versionTagNameEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) {
			return (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		}

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new CorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AssociationPackageImpl theAssociationPackage = (AssociationPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(AssociationPackage.eNS_URI) instanceof AssociationPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(AssociationPackage.eNS_URI)
				: AssociationPackage.eINSTANCE);
		CodeSystemPackageImpl theCodeSystemPackage = (CodeSystemPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(CodeSystemPackage.eNS_URI) instanceof CodeSystemPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(CodeSystemPackage.eNS_URI)
				: CodeSystemPackage.eINSTANCE);
		CodeSystemVersionPackageImpl theCodeSystemVersionPackage = (CodeSystemVersionPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(CodeSystemVersionPackage.eNS_URI) instanceof CodeSystemVersionPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(CodeSystemVersionPackage.eNS_URI)
				: CodeSystemVersionPackage.eINSTANCE);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI) instanceof EntityPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI)
				: EntityPackage.eINSTANCE);
		StatementPackageImpl theStatementPackage = (StatementPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) instanceof StatementPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI)
				: StatementPackage.eINSTANCE);
		ValueSetPackageImpl theValueSetPackage = (ValueSetPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ValueSetPackage.eNS_URI) instanceof ValueSetPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(ValueSetPackage.eNS_URI)
				: ValueSetPackage.eINSTANCE);
		ValueSetDefinitionPackageImpl theValueSetDefinitionPackage = (ValueSetDefinitionPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(ValueSetDefinitionPackage.eNS_URI) instanceof ValueSetDefinitionPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(ValueSetDefinitionPackage.eNS_URI)
				: ValueSetDefinitionPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theAssociationPackage.createPackageContents();
		theCodeSystemPackage.createPackageContents();
		theCodeSystemVersionPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theValueSetPackage.createPackageContents();
		theValueSetDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theAssociationPackage.initializePackageContents();
		theCodeSystemPackage.initializePackageContents();
		theCodeSystemVersionPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theValueSetPackage.initializePackageContents();
		theValueSetDefinitionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCorePackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return CoreValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAbstractResourceDescription() {
		return abstractResourceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAbstractResourceDescription_ReleaseDocumentation() {
		return (EReference) abstractResourceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAbstractResourceDescription_ReleaseFormat() {
		return (EReference) abstractResourceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAbstractResourceDescriptionDirectoryEntry() {
		return abstractResourceDescriptionDirectoryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAnonymousEntityReference() {
		return anonymousEntityReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAnonymousStatement() {
		return anonymousStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAnonymousStatement_Predicate() {
		return (EReference) anonymousStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAnonymousStatement_Target() {
		return (EReference) anonymousStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAnonymousStatement_StatmentQualifier() {
		return (EReference) anonymousStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociationReference() {
		return associationReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBindingQualifierReference() {
		return bindingQualifierReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCaseSignificanceReference() {
		return caseSignificanceReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getChangeable() {
		return changeableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChangeable_Status() {
		return (EReference) changeableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChangeable_ChangeDescription() {
		return (EReference) changeableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChangeable_EntryState() {
		return (EAttribute) changeableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getChangeDescription() {
		return changeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChangeDescription_PrevImage() {
		return (EReference) changeDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChangeDescription_ChangeNotes() {
		return (EReference) changeDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChangeDescription_ChangeSource() {
		return (EReference) changeDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChangeDescription_ClonedResource() {
		return (EReference) changeDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChangeDescription_ChangeDate() {
		return (EAttribute) changeDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChangeDescription_ChangeType() {
		return (EAttribute) changeDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChangeDescription_Committed() {
		return (EAttribute) changeDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChangeDescription_ContainingChangeSet() {
		return (EAttribute) changeDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChangeDescription_EffectiveDate() {
		return (EAttribute) changeDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChangeDescription_PrevChangeSet() {
		return (EAttribute) changeDescriptionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getChangeSetBase() {
		return changeSetBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChangeSetBase_Creator() {
		return (EReference) changeSetBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChangeSetBase_ChangeInstructions() {
		return (EReference) changeSetBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChangeSetBase_Member() {
		return (EReference) changeSetBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChangeSetBase_ChangeSetURI() {
		return (EAttribute) changeSetBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChangeSetBase_CloseDate() {
		return (EAttribute) changeSetBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChangeSetBase_CreationDate() {
		return (EAttribute) changeSetBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChangeSetBase_EntryCount() {
		return (EAttribute) changeSetBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChangeSetBase_OfficialEffectiveDate() {
		return (EAttribute) changeSetBaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemCategoryReference() {
		return codeSystemCategoryReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemReference() {
		return codeSystemReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeSystemVersionReference() {
		return codeSystemVersionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemVersionReference_Version() {
		return (EReference) codeSystemVersionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeSystemVersionReference_CodeSystem() {
		return (EReference) codeSystemVersionReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getComment_Type() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getConceptDomainReference() {
		return conceptDomainReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getContextReference() {
		return contextReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDefinition_UsageContext() {
		return (EReference) definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDefinition_DefinitionRole() {
		return (EAttribute) definitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDescriptionInCodeSystem() {
		return descriptionInCodeSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDescriptionInCodeSystem_DescribingCodeSystemVersion() {
		return (EReference) descriptionInCodeSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDescriptionInCodeSystem_Designation() {
		return (EAttribute) descriptionInCodeSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDescriptionInCodeSystem_Href() {
		return (EAttribute) descriptionInCodeSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDesignationFidelityReference() {
		return designationFidelityReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDesignationTypeReference() {
		return designationTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDirectory() {
		return directoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDirectory_DirectoryFilter() {
		return (EReference) directoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDirectory_SortCriteria() {
		return (EReference) directoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDirectory_Complete() {
		return (EAttribute) directoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDirectory_Next() {
		return (EAttribute) directoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDirectory_NumEntries() {
		return (EAttribute) directoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDirectory_Prev() {
		return (EAttribute) directoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDirectoryEntry() {
		return directoryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDirectoryEntry_Href() {
		return (EAttribute) directoryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDirectoryEntry_MatchStrength() {
		return (EAttribute) directoryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDirectoryEntry_ResourceName() {
		return (EAttribute) directoryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityExpression() {
		return entityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityExpression_OntologyLanguageAndSyntax() {
		return (EReference) entityExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityExpression_Expression() {
		return (EReference) entityExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityReference() {
		return entityReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityReference_Name() {
		return (EReference) entityReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityReference_KnownEntityDescription() {
		return (EReference) entityReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityReference_About() {
		return (EAttribute) entityReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityReferenceList() {
		return entityReferenceListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityReferenceList_Entry() {
		return (EReference) entityReferenceListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntitySynopsis() {
		return entitySynopsisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntitySynopsis_Designation() {
		return (EAttribute) entitySynopsisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntryDescription() {
		return entryDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getExample() {
		return exampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFilter_Component() {
		return (EReference) filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFilterComponent() {
		return filterComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFilterComponent_MatchAlgorithm() {
		return (EReference) filterComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getFilterComponent_MatchValue() {
		return (EAttribute) filterComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFinalizable() {
		return finalizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getFinalizable_State() {
		return (EAttribute) finalizableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFormalityLevelReference() {
		return formalityLevelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFormatReference() {
		return formatReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLanguageReference() {
		return languageReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMapCorrelationReference() {
		return mapCorrelationReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMapReference() {
		return mapReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMapVersionReference() {
		return mapVersionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMapVersionReference_MapVersion() {
		return (EReference) mapVersionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMapVersionReference_Map() {
		return (EReference) mapVersionReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMatchAlgorithmReference() {
		return matchAlgorithmReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMessage_Heading() {
		return (EReference) messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getModelAttributeReference() {
		return modelAttributeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNameAndMeaningReference() {
		return nameAndMeaningReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNameAndMeaningReference_Value() {
		return (EAttribute) nameAndMeaningReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNameAndMeaningReference_Href() {
		return (EAttribute) nameAndMeaningReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNameAndMeaningReference_Uri() {
		return (EAttribute) nameAndMeaningReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNamedEntityReference() {
		return namedEntityReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNamespaceReference() {
		return namespaceReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNote_AssertedInCodeSystemVersion() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNote_CorrespondingStatement() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNote_ExternalIdentifier() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOntologyDomainReference() {
		return ontologyDomainReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOntologyEngineeringMethodologyReference() {
		return ontologyEngineeringMethodologyReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOntologyEngineeringToolReference() {
		return ontologyEngineeringToolReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOntologyLanguageAndSyntax() {
		return ontologyLanguageAndSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOntologyLanguageAndSyntax_OntologyLanguage() {
		return (EReference) ontologyLanguageAndSyntaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOntologyLanguageAndSyntax_OntologySyntax() {
		return (EReference) ontologyLanguageAndSyntaxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOntologyLanguageReference() {
		return ontologyLanguageReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOntologySyntaxReference() {
		return ontologySyntaxReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOntologyTaskReference() {
		return ontologyTaskReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOntologyTypeReference() {
		return ontologyTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOpaqueData() {
		return opaqueDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOpaqueData_Value() {
		return (EReference) opaqueDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOpaqueData_Format() {
		return (EReference) opaqueDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOpaqueData_Language() {
		return (EReference) opaqueDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getOpaqueData_Schema() {
		return (EAttribute) opaqueDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getParameter_Val() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getParameter_Arg() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPredicateReference() {
		return predicateReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getProperty_Predicate() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getProperty_Value() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getProperty_PropertyQualifier() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getProperty_CorrespondingStatement() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPropertyReference() {
		return propertyReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPropertyReference_ReferenceTarget() {
		return (EReference) propertyReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPropertyReference_ReferenceType() {
		return (EAttribute) propertyReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getReasoningAlgorithmReference() {
		return reasoningAlgorithmReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResourceDescription() {
		return resourceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceDescription_Keyword() {
		return (EAttribute) resourceDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResourceDescription_ResourceType() {
		return (EReference) resourceDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResourceDescription_ResourceSynopsis() {
		return (EReference) resourceDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceDescription_AdditionalDocumentation() {
		return (EAttribute) resourceDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResourceDescription_SourceAndRole() {
		return (EReference) resourceDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResourceDescription_Rights() {
		return (EReference) resourceDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResourceDescription_Note() {
		return (EReference) resourceDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResourceDescription_Property() {
		return (EReference) resourceDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceDescription_AlternateID() {
		return (EAttribute) resourceDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceDescription_SourceStatements() {
		return (EAttribute) resourceDescriptionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceDescription_About() {
		return (EAttribute) resourceDescriptionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceDescription_FormalName() {
		return (EAttribute) resourceDescriptionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResourceDescriptionDirectoryEntry() {
		return resourceDescriptionDirectoryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResourceDescriptionDirectoryEntry_ResourceSynopsis() {
		return (EReference) resourceDescriptionDirectoryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceDescriptionDirectoryEntry_About() {
		return (EAttribute) resourceDescriptionDirectoryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceDescriptionDirectoryEntry_FormalName() {
		return (EAttribute) resourceDescriptionDirectoryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResourceVersionDescription() {
		return resourceVersionDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResourceVersionDescription_SourceAndNotation() {
		return (EReference) resourceVersionDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getResourceVersionDescription_Predecessor() {
		return (EReference) resourceVersionDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceVersionDescription_OfficialResourceVersionId() {
		return (EAttribute) resourceVersionDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceVersionDescription_OfficialReleaseDate() {
		return (EAttribute) resourceVersionDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceVersionDescription_OfficialActivationDate() {
		return (EAttribute) resourceVersionDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceVersionDescription_DocumentURI() {
		return (EAttribute) resourceVersionDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceVersionDescription_State() {
		return (EAttribute) resourceVersionDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getResourceVersionDescriptionDirectoryEntry() {
		return resourceVersionDescriptionDirectoryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceVersionDescriptionDirectoryEntry_OfficialResourceVersionId() {
		return (EAttribute) resourceVersionDescriptionDirectoryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceVersionDescriptionDirectoryEntry_OfficialReleaseDate() {
		return (EAttribute) resourceVersionDescriptionDirectoryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getResourceVersionDescriptionDirectoryEntry_DocumentURI() {
		return (EAttribute) resourceVersionDescriptionDirectoryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRESTResource() {
		return restResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRESTResource_ResourceRoot() {
		return (EAttribute) restResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRESTResource_ResourceURI() {
		return (EAttribute) restResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRESTResource_Parameter() {
		return (EReference) restResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRESTResource_AccessDate() {
		return (EAttribute) restResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRoleReference() {
		return roleReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getScopedEntityName() {
		return scopedEntityNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getScopedEntityName_Namespace() {
		return (EAttribute) scopedEntityNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getScopedEntityName_Name() {
		return (EAttribute) scopedEntityNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSortCriteria() {
		return sortCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSortCriteria_Entry() {
		return (EReference) sortCriteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSortCriterion() {
		return sortCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSortCriterion_SortElement() {
		return (EReference) sortCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSortCriterion_EntryOrder() {
		return (EAttribute) sortCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSortCriterion_SortDirection() {
		return (EAttribute) sortCriterionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSourceAndNotation() {
		return sourceAndNotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSourceAndNotation_SourceAndNotationDescription() {
		return (EAttribute) sourceAndNotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSourceAndNotation_SourceDocument() {
		return (EAttribute) sourceAndNotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSourceAndNotation_SourceLanguage() {
		return (EReference) sourceAndNotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSourceAndNotation_SourceDocumentSyntax() {
		return (EReference) sourceAndNotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSourceAndRoleReference() {
		return sourceAndRoleReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSourceAndRoleReference_Mixed() {
		return (EAttribute) sourceAndRoleReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSourceAndRoleReference_Source() {
		return (EReference) sourceAndRoleReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSourceAndRoleReference_Role() {
		return (EReference) sourceAndRoleReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSourceAndRoleReference_BibliographicLink() {
		return (EReference) sourceAndRoleReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSourceReference() {
		return sourceReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStatementTarget() {
		return statementTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatementTarget_Entity() {
		return (EReference) statementTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatementTarget_Literal() {
		return (EReference) statementTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStatementTarget_Resource() {
		return (EAttribute) statementTargetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStatementTarget_Bnode() {
		return (EReference) statementTargetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getStatementTarget_ExternalIdentifier() {
		return (EAttribute) statementTargetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStatusReference() {
		return statusReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTsAnyType() {
		return tsAnyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTsAnyType_Mixed() {
		return (EAttribute) tsAnyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTsAnyType_Any() {
		return (EAttribute) tsAnyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getURIAndEntityName() {
		return uriAndEntityNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getURIAndEntityName_Namespace() {
		return (EAttribute) uriAndEntityNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getURIAndEntityName_Name() {
		return (EAttribute) uriAndEntityNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getURIAndEntityName_Href() {
		return (EAttribute) uriAndEntityNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getURIAndEntityName_Uri() {
		return (EAttribute) uriAndEntityNameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_EntityExpression() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetDefinitionReference() {
		return valueSetDefinitionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionReference_ValueSetDefinition() {
		return (EReference) valueSetDefinitionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getValueSetDefinitionReference_ValueSet() {
		return (EReference) valueSetDefinitionReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getValueSetReference() {
		return valueSetReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVersionTagReference() {
		return versionTagReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getAssociationDirection() {
		return associationDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getChangeCommitted() {
		return changeCommittedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getChangeType() {
		return changeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getCompleteDirectory() {
		return completeDirectoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getCTS2ResourceType() {
		return cts2ResourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getDefinitionRole() {
		return definitionRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getEntryState() {
		return entryStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getFinalizableState() {
		return finalizableStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getNoteType() {
		return noteTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getSetOperator() {
		return setOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getSortDirection() {
		return sortDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getTargetReferenceType() {
		return targetReferenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getAmountOfTime() {
		return amountOfTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getAssociationDirectionObject() {
		return associationDirectionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getAssociationDirectoryURI() {
		return associationDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getBooleanObject() {
		return booleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getChangeCommittedObject() {
		return changeCommittedObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getChangeSetDirectoryURI() {
		return changeSetDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getChangeSetURI() {
		return changeSetURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getChangeTypeObject() {
		return changeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCodeSystemCatalogEntryDirectoryURI() {
		return codeSystemCatalogEntryDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCodeSystemName() {
		return codeSystemNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCodeSystemVersionCatalogEntryDirectoryURI() {
		return codeSystemVersionCatalogEntryDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCodeSystemVersionName() {
		return codeSystemVersionNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCompleteDirectoryObject() {
		return completeDirectoryObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getConceptDomainBindingDirectoryURI() {
		return conceptDomainBindingDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getConceptDomainCatalogEntryDirectoryURI() {
		return conceptDomainCatalogEntryDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getConceptDomainName() {
		return conceptDomainNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCTS2ResourceTypeObject() {
		return cts2ResourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getDateAndTime() {
		return dateAndTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getDefinitionRoleObject() {
		return definitionRoleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getDirectoryURI() {
		return directoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getDocumentURI() {
		return documentURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getEntityDirectoryURI() {
		return entityDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getEntryStateObject() {
		return entryStateObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getEnumeration() {
		return enumerationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getExternalURI() {
		return externalURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getFinalizableStateObject() {
		return finalizableStateObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getLocalIdentifier() {
		return localIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getLocalURI() {
		return localURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getMapCatalogEntryDirectoryURI() {
		return mapCatalogEntryDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getMapEntryDirectoryURI() {
		return mapEntryDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getMapName() {
		return mapNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getMapVersionDirectoryURI() {
		return mapVersionDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getMapVersionName() {
		return mapVersionNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getMatchStrength() {
		return matchStrengthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getMatchStrengthObject() {
		return matchStrengthObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getNamespaceIdentifier() {
		return namespaceIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getNaturalNumber() {
		return naturalNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getNoteTypeObject() {
		return noteTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getPersistentURI() {
		return persistentURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getRenderingURI() {
		return renderingURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getResolvedValueSetDirectoryURI() {
		return resolvedValueSetDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getServiceURI() {
		return serviceURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getSetOperatorObject() {
		return setOperatorObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getSortDirectionObject() {
		return sortDirectionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getStatementDirectoryURI() {
		return statementDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getTargetReferenceTypeObject() {
		return targetReferenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getValueSetCatalogEntryDirectoryURI() {
		return valueSetCatalogEntryDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getValueSetDefinitionDirectoryURI() {
		return valueSetDefinitionDirectoryURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getValueSetName() {
		return valueSetNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getVersionTagName() {
		return versionTagNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		abstractResourceDescriptionEClass = createEClass(ABSTRACT_RESOURCE_DESCRIPTION);
		createEReference(abstractResourceDescriptionEClass, ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION);
		createEReference(abstractResourceDescriptionEClass, ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_FORMAT);

		abstractResourceDescriptionDirectoryEntryEClass = createEClass(ABSTRACT_RESOURCE_DESCRIPTION_DIRECTORY_ENTRY);

		anonymousEntityReferenceEClass = createEClass(ANONYMOUS_ENTITY_REFERENCE);

		anonymousStatementEClass = createEClass(ANONYMOUS_STATEMENT);
		createEReference(anonymousStatementEClass, ANONYMOUS_STATEMENT__PREDICATE);
		createEReference(anonymousStatementEClass, ANONYMOUS_STATEMENT__TARGET);
		createEReference(anonymousStatementEClass, ANONYMOUS_STATEMENT__STATMENT_QUALIFIER);

		associationReferenceEClass = createEClass(ASSOCIATION_REFERENCE);

		bindingQualifierReferenceEClass = createEClass(BINDING_QUALIFIER_REFERENCE);

		caseSignificanceReferenceEClass = createEClass(CASE_SIGNIFICANCE_REFERENCE);

		changeableEClass = createEClass(CHANGEABLE);
		createEReference(changeableEClass, CHANGEABLE__STATUS);
		createEReference(changeableEClass, CHANGEABLE__CHANGE_DESCRIPTION);
		createEAttribute(changeableEClass, CHANGEABLE__ENTRY_STATE);

		changeDescriptionEClass = createEClass(CHANGE_DESCRIPTION);
		createEReference(changeDescriptionEClass, CHANGE_DESCRIPTION__PREV_IMAGE);
		createEReference(changeDescriptionEClass, CHANGE_DESCRIPTION__CHANGE_NOTES);
		createEReference(changeDescriptionEClass, CHANGE_DESCRIPTION__CHANGE_SOURCE);
		createEReference(changeDescriptionEClass, CHANGE_DESCRIPTION__CLONED_RESOURCE);
		createEAttribute(changeDescriptionEClass, CHANGE_DESCRIPTION__CHANGE_DATE);
		createEAttribute(changeDescriptionEClass, CHANGE_DESCRIPTION__CHANGE_TYPE);
		createEAttribute(changeDescriptionEClass, CHANGE_DESCRIPTION__COMMITTED);
		createEAttribute(changeDescriptionEClass, CHANGE_DESCRIPTION__CONTAINING_CHANGE_SET);
		createEAttribute(changeDescriptionEClass, CHANGE_DESCRIPTION__EFFECTIVE_DATE);
		createEAttribute(changeDescriptionEClass, CHANGE_DESCRIPTION__PREV_CHANGE_SET);

		changeSetBaseEClass = createEClass(CHANGE_SET_BASE);
		createEReference(changeSetBaseEClass, CHANGE_SET_BASE__CREATOR);
		createEReference(changeSetBaseEClass, CHANGE_SET_BASE__CHANGE_INSTRUCTIONS);
		createEReference(changeSetBaseEClass, CHANGE_SET_BASE__MEMBER);
		createEAttribute(changeSetBaseEClass, CHANGE_SET_BASE__CHANGE_SET_URI);
		createEAttribute(changeSetBaseEClass, CHANGE_SET_BASE__CLOSE_DATE);
		createEAttribute(changeSetBaseEClass, CHANGE_SET_BASE__CREATION_DATE);
		createEAttribute(changeSetBaseEClass, CHANGE_SET_BASE__ENTRY_COUNT);
		createEAttribute(changeSetBaseEClass, CHANGE_SET_BASE__OFFICIAL_EFFECTIVE_DATE);

		codeSystemCategoryReferenceEClass = createEClass(CODE_SYSTEM_CATEGORY_REFERENCE);

		codeSystemReferenceEClass = createEClass(CODE_SYSTEM_REFERENCE);

		codeSystemVersionReferenceEClass = createEClass(CODE_SYSTEM_VERSION_REFERENCE);
		createEReference(codeSystemVersionReferenceEClass, CODE_SYSTEM_VERSION_REFERENCE__VERSION);
		createEReference(codeSystemVersionReferenceEClass, CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__TYPE);

		conceptDomainReferenceEClass = createEClass(CONCEPT_DOMAIN_REFERENCE);

		contextReferenceEClass = createEClass(CONTEXT_REFERENCE);

		definitionEClass = createEClass(DEFINITION);
		createEReference(definitionEClass, DEFINITION__USAGE_CONTEXT);
		createEAttribute(definitionEClass, DEFINITION__DEFINITION_ROLE);

		descriptionInCodeSystemEClass = createEClass(DESCRIPTION_IN_CODE_SYSTEM);
		createEReference(descriptionInCodeSystemEClass, DESCRIPTION_IN_CODE_SYSTEM__DESCRIBING_CODE_SYSTEM_VERSION);
		createEAttribute(descriptionInCodeSystemEClass, DESCRIPTION_IN_CODE_SYSTEM__DESIGNATION);
		createEAttribute(descriptionInCodeSystemEClass, DESCRIPTION_IN_CODE_SYSTEM__HREF);

		designationFidelityReferenceEClass = createEClass(DESIGNATION_FIDELITY_REFERENCE);

		designationTypeReferenceEClass = createEClass(DESIGNATION_TYPE_REFERENCE);

		directoryEClass = createEClass(DIRECTORY);
		createEReference(directoryEClass, DIRECTORY__DIRECTORY_FILTER);
		createEReference(directoryEClass, DIRECTORY__SORT_CRITERIA);
		createEAttribute(directoryEClass, DIRECTORY__COMPLETE);
		createEAttribute(directoryEClass, DIRECTORY__NEXT);
		createEAttribute(directoryEClass, DIRECTORY__NUM_ENTRIES);
		createEAttribute(directoryEClass, DIRECTORY__PREV);

		directoryEntryEClass = createEClass(DIRECTORY_ENTRY);
		createEAttribute(directoryEntryEClass, DIRECTORY_ENTRY__HREF);
		createEAttribute(directoryEntryEClass, DIRECTORY_ENTRY__MATCH_STRENGTH);
		createEAttribute(directoryEntryEClass, DIRECTORY_ENTRY__RESOURCE_NAME);

		entityExpressionEClass = createEClass(ENTITY_EXPRESSION);
		createEReference(entityExpressionEClass, ENTITY_EXPRESSION__ONTOLOGY_LANGUAGE_AND_SYNTAX);
		createEReference(entityExpressionEClass, ENTITY_EXPRESSION__EXPRESSION);

		entityReferenceEClass = createEClass(ENTITY_REFERENCE);
		createEReference(entityReferenceEClass, ENTITY_REFERENCE__NAME);
		createEReference(entityReferenceEClass, ENTITY_REFERENCE__KNOWN_ENTITY_DESCRIPTION);
		createEAttribute(entityReferenceEClass, ENTITY_REFERENCE__ABOUT);

		entityReferenceListEClass = createEClass(ENTITY_REFERENCE_LIST);
		createEReference(entityReferenceListEClass, ENTITY_REFERENCE_LIST__ENTRY);

		entitySynopsisEClass = createEClass(ENTITY_SYNOPSIS);
		createEAttribute(entitySynopsisEClass, ENTITY_SYNOPSIS__DESIGNATION);

		entryDescriptionEClass = createEClass(ENTRY_DESCRIPTION);

		exampleEClass = createEClass(EXAMPLE);

		filterEClass = createEClass(FILTER);
		createEReference(filterEClass, FILTER__COMPONENT);

		filterComponentEClass = createEClass(FILTER_COMPONENT);
		createEReference(filterComponentEClass, FILTER_COMPONENT__MATCH_ALGORITHM);
		createEAttribute(filterComponentEClass, FILTER_COMPONENT__MATCH_VALUE);

		finalizableEClass = createEClass(FINALIZABLE);
		createEAttribute(finalizableEClass, FINALIZABLE__STATE);

		formalityLevelReferenceEClass = createEClass(FORMALITY_LEVEL_REFERENCE);

		formatReferenceEClass = createEClass(FORMAT_REFERENCE);

		languageReferenceEClass = createEClass(LANGUAGE_REFERENCE);

		mapCorrelationReferenceEClass = createEClass(MAP_CORRELATION_REFERENCE);

		mapReferenceEClass = createEClass(MAP_REFERENCE);

		mapVersionReferenceEClass = createEClass(MAP_VERSION_REFERENCE);
		createEReference(mapVersionReferenceEClass, MAP_VERSION_REFERENCE__MAP_VERSION);
		createEReference(mapVersionReferenceEClass, MAP_VERSION_REFERENCE__MAP);

		matchAlgorithmReferenceEClass = createEClass(MATCH_ALGORITHM_REFERENCE);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__HEADING);

		modelAttributeReferenceEClass = createEClass(MODEL_ATTRIBUTE_REFERENCE);

		nameAndMeaningReferenceEClass = createEClass(NAME_AND_MEANING_REFERENCE);
		createEAttribute(nameAndMeaningReferenceEClass, NAME_AND_MEANING_REFERENCE__VALUE);
		createEAttribute(nameAndMeaningReferenceEClass, NAME_AND_MEANING_REFERENCE__HREF);
		createEAttribute(nameAndMeaningReferenceEClass, NAME_AND_MEANING_REFERENCE__URI);

		namedEntityReferenceEClass = createEClass(NAMED_ENTITY_REFERENCE);

		namespaceReferenceEClass = createEClass(NAMESPACE_REFERENCE);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__ASSERTED_IN_CODE_SYSTEM_VERSION);
		createEAttribute(noteEClass, NOTE__CORRESPONDING_STATEMENT);
		createEAttribute(noteEClass, NOTE__EXTERNAL_IDENTIFIER);

		ontologyDomainReferenceEClass = createEClass(ONTOLOGY_DOMAIN_REFERENCE);

		ontologyEngineeringMethodologyReferenceEClass = createEClass(ONTOLOGY_ENGINEERING_METHODOLOGY_REFERENCE);

		ontologyEngineeringToolReferenceEClass = createEClass(ONTOLOGY_ENGINEERING_TOOL_REFERENCE);

		ontologyLanguageAndSyntaxEClass = createEClass(ONTOLOGY_LANGUAGE_AND_SYNTAX);
		createEReference(ontologyLanguageAndSyntaxEClass, ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_LANGUAGE);
		createEReference(ontologyLanguageAndSyntaxEClass, ONTOLOGY_LANGUAGE_AND_SYNTAX__ONTOLOGY_SYNTAX);

		ontologyLanguageReferenceEClass = createEClass(ONTOLOGY_LANGUAGE_REFERENCE);

		ontologySyntaxReferenceEClass = createEClass(ONTOLOGY_SYNTAX_REFERENCE);

		ontologyTaskReferenceEClass = createEClass(ONTOLOGY_TASK_REFERENCE);

		ontologyTypeReferenceEClass = createEClass(ONTOLOGY_TYPE_REFERENCE);

		opaqueDataEClass = createEClass(OPAQUE_DATA);
		createEReference(opaqueDataEClass, OPAQUE_DATA__VALUE);
		createEReference(opaqueDataEClass, OPAQUE_DATA__FORMAT);
		createEReference(opaqueDataEClass, OPAQUE_DATA__LANGUAGE);
		createEAttribute(opaqueDataEClass, OPAQUE_DATA__SCHEMA);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__VAL);
		createEAttribute(parameterEClass, PARAMETER__ARG);

		predicateReferenceEClass = createEClass(PREDICATE_REFERENCE);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__PREDICATE);
		createEReference(propertyEClass, PROPERTY__VALUE);
		createEReference(propertyEClass, PROPERTY__PROPERTY_QUALIFIER);
		createEAttribute(propertyEClass, PROPERTY__CORRESPONDING_STATEMENT);

		propertyReferenceEClass = createEClass(PROPERTY_REFERENCE);
		createEReference(propertyReferenceEClass, PROPERTY_REFERENCE__REFERENCE_TARGET);
		createEAttribute(propertyReferenceEClass, PROPERTY_REFERENCE__REFERENCE_TYPE);

		reasoningAlgorithmReferenceEClass = createEClass(REASONING_ALGORITHM_REFERENCE);

		resourceDescriptionEClass = createEClass(RESOURCE_DESCRIPTION);
		createEAttribute(resourceDescriptionEClass, RESOURCE_DESCRIPTION__KEYWORD);
		createEReference(resourceDescriptionEClass, RESOURCE_DESCRIPTION__RESOURCE_TYPE);
		createEReference(resourceDescriptionEClass, RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS);
		createEAttribute(resourceDescriptionEClass, RESOURCE_DESCRIPTION__ADDITIONAL_DOCUMENTATION);
		createEReference(resourceDescriptionEClass, RESOURCE_DESCRIPTION__SOURCE_AND_ROLE);
		createEReference(resourceDescriptionEClass, RESOURCE_DESCRIPTION__RIGHTS);
		createEReference(resourceDescriptionEClass, RESOURCE_DESCRIPTION__NOTE);
		createEReference(resourceDescriptionEClass, RESOURCE_DESCRIPTION__PROPERTY);
		createEAttribute(resourceDescriptionEClass, RESOURCE_DESCRIPTION__ALTERNATE_ID);
		createEAttribute(resourceDescriptionEClass, RESOURCE_DESCRIPTION__SOURCE_STATEMENTS);
		createEAttribute(resourceDescriptionEClass, RESOURCE_DESCRIPTION__ABOUT);
		createEAttribute(resourceDescriptionEClass, RESOURCE_DESCRIPTION__FORMAL_NAME);

		resourceDescriptionDirectoryEntryEClass = createEClass(RESOURCE_DESCRIPTION_DIRECTORY_ENTRY);
		createEReference(
			resourceDescriptionDirectoryEntryEClass, RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__RESOURCE_SYNOPSIS);
		createEAttribute(resourceDescriptionDirectoryEntryEClass, RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__ABOUT);
		createEAttribute(resourceDescriptionDirectoryEntryEClass, RESOURCE_DESCRIPTION_DIRECTORY_ENTRY__FORMAL_NAME);

		resourceVersionDescriptionEClass = createEClass(RESOURCE_VERSION_DESCRIPTION);
		createEReference(resourceVersionDescriptionEClass, RESOURCE_VERSION_DESCRIPTION__SOURCE_AND_NOTATION);
		createEReference(resourceVersionDescriptionEClass, RESOURCE_VERSION_DESCRIPTION__PREDECESSOR);
		createEAttribute(resourceVersionDescriptionEClass, RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RESOURCE_VERSION_ID);
		createEAttribute(resourceVersionDescriptionEClass, RESOURCE_VERSION_DESCRIPTION__OFFICIAL_RELEASE_DATE);
		createEAttribute(resourceVersionDescriptionEClass, RESOURCE_VERSION_DESCRIPTION__OFFICIAL_ACTIVATION_DATE);
		createEAttribute(resourceVersionDescriptionEClass, RESOURCE_VERSION_DESCRIPTION__DOCUMENT_URI);
		createEAttribute(resourceVersionDescriptionEClass, RESOURCE_VERSION_DESCRIPTION__STATE);

		resourceVersionDescriptionDirectoryEntryEClass = createEClass(RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY);
		createEAttribute(
			resourceVersionDescriptionDirectoryEntryEClass,
			RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RESOURCE_VERSION_ID);
		createEAttribute(
			resourceVersionDescriptionDirectoryEntryEClass,
			RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__OFFICIAL_RELEASE_DATE);
		createEAttribute(
			resourceVersionDescriptionDirectoryEntryEClass, RESOURCE_VERSION_DESCRIPTION_DIRECTORY_ENTRY__DOCUMENT_URI);

		restResourceEClass = createEClass(REST_RESOURCE);
		createEAttribute(restResourceEClass, REST_RESOURCE__RESOURCE_ROOT);
		createEAttribute(restResourceEClass, REST_RESOURCE__RESOURCE_URI);
		createEReference(restResourceEClass, REST_RESOURCE__PARAMETER);
		createEAttribute(restResourceEClass, REST_RESOURCE__ACCESS_DATE);

		roleReferenceEClass = createEClass(ROLE_REFERENCE);

		scopedEntityNameEClass = createEClass(SCOPED_ENTITY_NAME);
		createEAttribute(scopedEntityNameEClass, SCOPED_ENTITY_NAME__NAMESPACE);
		createEAttribute(scopedEntityNameEClass, SCOPED_ENTITY_NAME__NAME);

		sortCriteriaEClass = createEClass(SORT_CRITERIA);
		createEReference(sortCriteriaEClass, SORT_CRITERIA__ENTRY);

		sortCriterionEClass = createEClass(SORT_CRITERION);
		createEReference(sortCriterionEClass, SORT_CRITERION__SORT_ELEMENT);
		createEAttribute(sortCriterionEClass, SORT_CRITERION__ENTRY_ORDER);
		createEAttribute(sortCriterionEClass, SORT_CRITERION__SORT_DIRECTION);

		sourceAndNotationEClass = createEClass(SOURCE_AND_NOTATION);
		createEAttribute(sourceAndNotationEClass, SOURCE_AND_NOTATION__SOURCE_AND_NOTATION_DESCRIPTION);
		createEAttribute(sourceAndNotationEClass, SOURCE_AND_NOTATION__SOURCE_DOCUMENT);
		createEReference(sourceAndNotationEClass, SOURCE_AND_NOTATION__SOURCE_LANGUAGE);
		createEReference(sourceAndNotationEClass, SOURCE_AND_NOTATION__SOURCE_DOCUMENT_SYNTAX);

		sourceAndRoleReferenceEClass = createEClass(SOURCE_AND_ROLE_REFERENCE);
		createEAttribute(sourceAndRoleReferenceEClass, SOURCE_AND_ROLE_REFERENCE__MIXED);
		createEReference(sourceAndRoleReferenceEClass, SOURCE_AND_ROLE_REFERENCE__SOURCE);
		createEReference(sourceAndRoleReferenceEClass, SOURCE_AND_ROLE_REFERENCE__ROLE);
		createEReference(sourceAndRoleReferenceEClass, SOURCE_AND_ROLE_REFERENCE__BIBLIOGRAPHIC_LINK);

		sourceReferenceEClass = createEClass(SOURCE_REFERENCE);

		statementTargetEClass = createEClass(STATEMENT_TARGET);
		createEReference(statementTargetEClass, STATEMENT_TARGET__ENTITY);
		createEReference(statementTargetEClass, STATEMENT_TARGET__LITERAL);
		createEAttribute(statementTargetEClass, STATEMENT_TARGET__RESOURCE);
		createEReference(statementTargetEClass, STATEMENT_TARGET__BNODE);
		createEAttribute(statementTargetEClass, STATEMENT_TARGET__EXTERNAL_IDENTIFIER);

		statusReferenceEClass = createEClass(STATUS_REFERENCE);

		tsAnyTypeEClass = createEClass(TS_ANY_TYPE);
		createEAttribute(tsAnyTypeEClass, TS_ANY_TYPE__MIXED);
		createEAttribute(tsAnyTypeEClass, TS_ANY_TYPE__ANY);

		uriAndEntityNameEClass = createEClass(URI_AND_ENTITY_NAME);
		createEAttribute(uriAndEntityNameEClass, URI_AND_ENTITY_NAME__NAMESPACE);
		createEAttribute(uriAndEntityNameEClass, URI_AND_ENTITY_NAME__NAME);
		createEAttribute(uriAndEntityNameEClass, URI_AND_ENTITY_NAME__HREF);
		createEAttribute(uriAndEntityNameEClass, URI_AND_ENTITY_NAME__URI);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTITY_EXPRESSION);

		valueSetDefinitionReferenceEClass = createEClass(VALUE_SET_DEFINITION_REFERENCE);
		createEReference(valueSetDefinitionReferenceEClass, VALUE_SET_DEFINITION_REFERENCE__VALUE_SET_DEFINITION);
		createEReference(valueSetDefinitionReferenceEClass, VALUE_SET_DEFINITION_REFERENCE__VALUE_SET);

		valueSetReferenceEClass = createEClass(VALUE_SET_REFERENCE);

		versionTagReferenceEClass = createEClass(VERSION_TAG_REFERENCE);

		// Create enums
		associationDirectionEEnum = createEEnum(ASSOCIATION_DIRECTION);
		changeCommittedEEnum = createEEnum(CHANGE_COMMITTED);
		changeTypeEEnum = createEEnum(CHANGE_TYPE);
		completeDirectoryEEnum = createEEnum(COMPLETE_DIRECTORY);
		cts2ResourceTypeEEnum = createEEnum(CTS2_RESOURCE_TYPE);
		definitionRoleEEnum = createEEnum(DEFINITION_ROLE);
		entryStateEEnum = createEEnum(ENTRY_STATE);
		finalizableStateEEnum = createEEnum(FINALIZABLE_STATE);
		noteTypeEEnum = createEEnum(NOTE_TYPE);
		setOperatorEEnum = createEEnum(SET_OPERATOR);
		sortDirectionEEnum = createEEnum(SORT_DIRECTION);
		targetReferenceTypeEEnum = createEEnum(TARGET_REFERENCE_TYPE);

		// Create data types
		amountOfTimeEDataType = createEDataType(AMOUNT_OF_TIME);
		associationDirectionObjectEDataType = createEDataType(ASSOCIATION_DIRECTION_OBJECT);
		associationDirectoryURIEDataType = createEDataType(ASSOCIATION_DIRECTORY_URI);
		booleanEDataType = createEDataType(BOOLEAN);
		booleanObjectEDataType = createEDataType(BOOLEAN_OBJECT);
		changeCommittedObjectEDataType = createEDataType(CHANGE_COMMITTED_OBJECT);
		changeSetDirectoryURIEDataType = createEDataType(CHANGE_SET_DIRECTORY_URI);
		changeSetURIEDataType = createEDataType(CHANGE_SET_URI);
		changeTypeObjectEDataType = createEDataType(CHANGE_TYPE_OBJECT);
		codeSystemCatalogEntryDirectoryURIEDataType = createEDataType(CODE_SYSTEM_CATALOG_ENTRY_DIRECTORY_URI);
		codeSystemNameEDataType = createEDataType(CODE_SYSTEM_NAME);
		codeSystemVersionCatalogEntryDirectoryURIEDataType = createEDataType(CODE_SYSTEM_VERSION_CATALOG_ENTRY_DIRECTORY_URI);
		codeSystemVersionNameEDataType = createEDataType(CODE_SYSTEM_VERSION_NAME);
		completeDirectoryObjectEDataType = createEDataType(COMPLETE_DIRECTORY_OBJECT);
		conceptDomainBindingDirectoryURIEDataType = createEDataType(CONCEPT_DOMAIN_BINDING_DIRECTORY_URI);
		conceptDomainCatalogEntryDirectoryURIEDataType = createEDataType(CONCEPT_DOMAIN_CATALOG_ENTRY_DIRECTORY_URI);
		conceptDomainNameEDataType = createEDataType(CONCEPT_DOMAIN_NAME);
		cts2ResourceTypeObjectEDataType = createEDataType(CTS2_RESOURCE_TYPE_OBJECT);
		dateAndTimeEDataType = createEDataType(DATE_AND_TIME);
		definitionRoleObjectEDataType = createEDataType(DEFINITION_ROLE_OBJECT);
		directoryURIEDataType = createEDataType(DIRECTORY_URI);
		documentURIEDataType = createEDataType(DOCUMENT_URI);
		entityDirectoryURIEDataType = createEDataType(ENTITY_DIRECTORY_URI);
		entryStateObjectEDataType = createEDataType(ENTRY_STATE_OBJECT);
		enumerationEDataType = createEDataType(ENUMERATION);
		externalURIEDataType = createEDataType(EXTERNAL_URI);
		finalizableStateObjectEDataType = createEDataType(FINALIZABLE_STATE_OBJECT);
		localIdentifierEDataType = createEDataType(LOCAL_IDENTIFIER);
		localURIEDataType = createEDataType(LOCAL_URI);
		mapCatalogEntryDirectoryURIEDataType = createEDataType(MAP_CATALOG_ENTRY_DIRECTORY_URI);
		mapEntryDirectoryURIEDataType = createEDataType(MAP_ENTRY_DIRECTORY_URI);
		mapNameEDataType = createEDataType(MAP_NAME);
		mapVersionDirectoryURIEDataType = createEDataType(MAP_VERSION_DIRECTORY_URI);
		mapVersionNameEDataType = createEDataType(MAP_VERSION_NAME);
		matchStrengthEDataType = createEDataType(MATCH_STRENGTH);
		matchStrengthObjectEDataType = createEDataType(MATCH_STRENGTH_OBJECT);
		namespaceIdentifierEDataType = createEDataType(NAMESPACE_IDENTIFIER);
		naturalNumberEDataType = createEDataType(NATURAL_NUMBER);
		noteTypeObjectEDataType = createEDataType(NOTE_TYPE_OBJECT);
		persistentURIEDataType = createEDataType(PERSISTENT_URI);
		renderingURIEDataType = createEDataType(RENDERING_URI);
		resolvedValueSetDirectoryURIEDataType = createEDataType(RESOLVED_VALUE_SET_DIRECTORY_URI);
		serviceURIEDataType = createEDataType(SERVICE_URI);
		setOperatorObjectEDataType = createEDataType(SET_OPERATOR_OBJECT);
		sortDirectionObjectEDataType = createEDataType(SORT_DIRECTION_OBJECT);
		statementDirectoryURIEDataType = createEDataType(STATEMENT_DIRECTORY_URI);
		stringEDataType = createEDataType(STRING);
		targetReferenceTypeObjectEDataType = createEDataType(TARGET_REFERENCE_TYPE_OBJECT);
		uriEDataType = createEDataType(URI);
		valueSetCatalogEntryDirectoryURIEDataType = createEDataType(VALUE_SET_CATALOG_ENTRY_DIRECTORY_URI);
		valueSetDefinitionDirectoryURIEDataType = createEDataType(VALUE_SET_DEFINITION_DIRECTORY_URI);
		valueSetNameEDataType = createEDataType(VALUE_SET_NAME);
		versionTagNameEDataType = createEDataType(VERSION_TAG_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractResourceDescriptionEClass.getESuperTypes().add(this.getResourceDescription());
		abstractResourceDescriptionDirectoryEntryEClass.getESuperTypes().add(
			this.getResourceDescriptionDirectoryEntry());
		anonymousEntityReferenceEClass.getESuperTypes().add(this.getEntityReference());
		associationReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		bindingQualifierReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		caseSignificanceReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		changeSetBaseEClass.getESuperTypes().add(this.getFinalizable());
		codeSystemCategoryReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		codeSystemReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		commentEClass.getESuperTypes().add(this.getNote());
		conceptDomainReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		contextReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		definitionEClass.getESuperTypes().add(this.getNote());
		designationFidelityReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		designationTypeReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		directoryEClass.getESuperTypes().add(this.getMessage());
		entitySynopsisEClass.getESuperTypes().add(this.getURIAndEntityName());
		entryDescriptionEClass.getESuperTypes().add(this.getOpaqueData());
		exampleEClass.getESuperTypes().add(this.getNote());
		filterComponentEClass.getESuperTypes().add(this.getPropertyReference());
		formalityLevelReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		formatReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		languageReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		mapCorrelationReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		mapReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		matchAlgorithmReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		modelAttributeReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		namedEntityReferenceEClass.getESuperTypes().add(this.getEntityReference());
		namespaceReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		noteEClass.getESuperTypes().add(this.getEntryDescription());
		ontologyDomainReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		ontologyEngineeringMethodologyReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		ontologyEngineeringToolReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		ontologyLanguageReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		ontologySyntaxReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		ontologyTaskReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		ontologyTypeReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		predicateReferenceEClass.getESuperTypes().add(this.getURIAndEntityName());
		reasoningAlgorithmReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		resourceDescriptionEClass.getESuperTypes().add(this.getChangeable());
		resourceDescriptionDirectoryEntryEClass.getESuperTypes().add(this.getDirectoryEntry());
		resourceVersionDescriptionEClass.getESuperTypes().add(this.getResourceDescription());
		resourceVersionDescriptionDirectoryEntryEClass.getESuperTypes().add(this.getResourceDescriptionDirectoryEntry());
		roleReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		sourceReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		statusReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		valueSetReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());
		versionTagReferenceEClass.getESuperTypes().add(this.getNameAndMeaningReference());

		// Initialize classes and features; add operations and parameters
		initEClass(
			abstractResourceDescriptionEClass, AbstractResourceDescription.class, "AbstractResourceDescription",
			IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getAbstractResourceDescription_ReleaseDocumentation(), this.getOpaqueData(), null, "releaseDocumentation",
			null, 0, 1, AbstractResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAbstractResourceDescription_ReleaseFormat(), this.getSourceAndNotation(), null, "releaseFormat", null,
			0, -1, AbstractResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			abstractResourceDescriptionDirectoryEntryEClass, AbstractResourceDescriptionDirectoryEntry.class,
			"AbstractResourceDescriptionDirectoryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			anonymousEntityReferenceEClass, AnonymousEntityReference.class, "AnonymousEntityReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			anonymousStatementEClass, AnonymousStatement.class, "AnonymousStatement", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getAnonymousStatement_Predicate(), this.getPredicateReference(), null, "predicate", null, 1, 1,
			AnonymousStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAnonymousStatement_Target(), this.getStatementTarget(), null, "target", null, 1, -1,
			AnonymousStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getAnonymousStatement_StatmentQualifier(), this.getProperty(), null, "statmentQualifier", null, 0, -1,
			AnonymousStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			associationReferenceEClass, AssociationReference.class, "AssociationReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			bindingQualifierReferenceEClass, BindingQualifierReference.class, "BindingQualifierReference",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			caseSignificanceReferenceEClass, CaseSignificanceReference.class, "CaseSignificanceReference",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			changeableEClass, Changeable.class, "Changeable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getChangeable_Status(), this.getStatusReference(), null, "status", null, 0, 1, Changeable.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getChangeable_ChangeDescription(), this.getChangeDescription(), null, "changeDescription", null, 0, 1,
			Changeable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getChangeable_EntryState(), this.getEntryState(), "entryState", "ACTIVE", 0, 1, Changeable.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			changeDescriptionEClass, ChangeDescription.class, "ChangeDescription", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getChangeDescription_PrevImage(), this.getChangeable(), null, "prevImage", null, 0, 1,
			ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getChangeDescription_ChangeNotes(), this.getOpaqueData(), null, "changeNotes", null, 0, 1,
			ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getChangeDescription_ChangeSource(), this.getSourceReference(), null, "changeSource", null, 0, 1,
			ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getChangeDescription_ClonedResource(), this.getNameAndMeaningReference(), null, "clonedResource", null, 0,
			1, ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getChangeDescription_ChangeDate(), this.getDateAndTime(), "changeDate", null, 1, 1,
			ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getChangeDescription_ChangeType(), this.getChangeType(), "changeType", null, 1, 1, ChangeDescription.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getChangeDescription_Committed(), this.getChangeCommitted(), "committed", "COMMITTED", 0, 1,
			ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getChangeDescription_ContainingChangeSet(), this.getChangeSetURI(), "containingChangeSet", null, 1, 1,
			ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getChangeDescription_EffectiveDate(), this.getDateAndTime(), "effectiveDate", null, 0, 1,
			ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getChangeDescription_PrevChangeSet(), this.getChangeSetURI(), "prevChangeSet", null, 0, 1,
			ChangeDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			changeSetBaseEClass, ChangeSetBase.class, "ChangeSetBase", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getChangeSetBase_Creator(), this.getSourceReference(), null, "creator", null, 0, 1, ChangeSetBase.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getChangeSetBase_ChangeInstructions(), this.getOpaqueData(), null, "changeInstructions", null, 0, 1,
			ChangeSetBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getChangeSetBase_Member(), ecorePackage.getEObject(), null, "member", null, 0, -1, ChangeSetBase.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getChangeSetBase_ChangeSetURI(), this.getChangeSetURI(), "changeSetURI", null, 1, 1, ChangeSetBase.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getChangeSetBase_CloseDate(), this.getDateAndTime(), "closeDate", null, 0, 1, ChangeSetBase.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getChangeSetBase_CreationDate(), this.getDateAndTime(), "creationDate", null, 1, 1, ChangeSetBase.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getChangeSetBase_EntryCount(), this.getNaturalNumber(), "entryCount", null, 0, 1, ChangeSetBase.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getChangeSetBase_OfficialEffectiveDate(), this.getDateAndTime(), "officialEffectiveDate", null, 0, 1,
			ChangeSetBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			codeSystemCategoryReferenceEClass, CodeSystemCategoryReference.class, "CodeSystemCategoryReference",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			codeSystemReferenceEClass, CodeSystemReference.class, "CodeSystemReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			codeSystemVersionReferenceEClass, CodeSystemVersionReference.class, "CodeSystemVersionReference",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemVersionReference_Version(), this.getNameAndMeaningReference(), null, "version", null, 1, 1,
			CodeSystemVersionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getCodeSystemVersionReference_CodeSystem(), this.getCodeSystemReference(), null, "codeSystem", null, 0, 1,
			CodeSystemVersionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getComment_Type(), this.getNoteType(), "type", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			conceptDomainReferenceEClass, ConceptDomainReference.class, "ConceptDomainReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			contextReferenceEClass, ContextReference.class, "ContextReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getDefinition_UsageContext(), this.getContextReference(), null, "usageContext", null, 0, 1,
			Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDefinition_DefinitionRole(), this.getDefinitionRole(), "definitionRole", "NORMATIVE", 0, 1,
			Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			descriptionInCodeSystemEClass, DescriptionInCodeSystem.class, "DescriptionInCodeSystem", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getDescriptionInCodeSystem_DescribingCodeSystemVersion(), this.getCodeSystemVersionReference(), null,
			"describingCodeSystemVersion", null, 1, 1, DescriptionInCodeSystem.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDescriptionInCodeSystem_Designation(), this.getString(), "designation", null, 0, 1,
			DescriptionInCodeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDescriptionInCodeSystem_Href(), this.getRenderingURI(), "href", null, 0, 1,
			DescriptionInCodeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			designationFidelityReferenceEClass, DesignationFidelityReference.class, "DesignationFidelityReference",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			designationTypeReferenceEClass, DesignationTypeReference.class, "DesignationTypeReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			directoryEClass, Directory.class, "Directory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getDirectory_DirectoryFilter(), this.getFilter(), null, "directoryFilter", null, 0, 1, Directory.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getDirectory_SortCriteria(), this.getSortCriteria(), null, "sortCriteria", null, 0, 1, Directory.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDirectory_Complete(), this.getCompleteDirectory(), "complete", null, 1, 1, Directory.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDirectory_Next(), this.getDirectoryURI(), "next", null, 0, 1, Directory.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDirectory_NumEntries(), this.getNaturalNumber(), "numEntries", null, 1, 1, Directory.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDirectory_Prev(), this.getDirectoryURI(), "prev", null, 0, 1, Directory.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			directoryEntryEClass, DirectoryEntry.class, "DirectoryEntry", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getDirectoryEntry_Href(), this.getRenderingURI(), "href", null, 0, 1, DirectoryEntry.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDirectoryEntry_MatchStrength(), this.getMatchStrength(), "matchStrength", null, 0, 1,
			DirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getDirectoryEntry_ResourceName(), this.getLocalIdentifier(), "resourceName", null, 0, 1,
			DirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			entityExpressionEClass, EntityExpression.class, "EntityExpression", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEntityExpression_OntologyLanguageAndSyntax(), this.getOntologyLanguageAndSyntax(), null,
			"ontologyLanguageAndSyntax", null, 1, 1, EntityExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityExpression_Expression(), this.getOpaqueData(), null, "expression", null, 1, 1,
			EntityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			entityReferenceEClass, EntityReference.class, "EntityReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEntityReference_Name(), this.getScopedEntityName(), null, "name", null, 0, 1, EntityReference.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getEntityReference_KnownEntityDescription(), this.getDescriptionInCodeSystem(), null,
			"knownEntityDescription", null, 0, -1, EntityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getEntityReference_About(), this.getURI(), "about", null, 1, 1, EntityReference.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			entityReferenceListEClass, EntityReferenceList.class, "EntityReferenceList", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getEntityReferenceList_Entry(), this.getEntityReference(), null, "entry", null, 0, -1,
			EntityReferenceList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			entitySynopsisEClass, EntitySynopsis.class, "EntitySynopsis", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getEntitySynopsis_Designation(), this.getString(), "designation", null, 0, 1, EntitySynopsis.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			entryDescriptionEClass, EntryDescription.class, "EntryDescription", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(exampleEClass, Example.class, "Example", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getFilter_Component(), this.getFilterComponent(), null, "component", null, 1, -1, Filter.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			filterComponentEClass, FilterComponent.class, "FilterComponent", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getFilterComponent_MatchAlgorithm(), this.getMatchAlgorithmReference(), null, "matchAlgorithm", null, 1, 1,
			FilterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getFilterComponent_MatchValue(), this.getString(), "matchValue", null, 0, 1, FilterComponent.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			finalizableEClass, Finalizable.class, "Finalizable", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getFinalizable_State(), this.getFinalizableState(), "state", "FINAL", 0, 1, Finalizable.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			formalityLevelReferenceEClass, FormalityLevelReference.class, "FormalityLevelReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			formatReferenceEClass, FormatReference.class, "FormatReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			languageReferenceEClass, LanguageReference.class, "LanguageReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			mapCorrelationReferenceEClass, MapCorrelationReference.class, "MapCorrelationReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			mapReferenceEClass, MapReference.class, "MapReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			mapVersionReferenceEClass, MapVersionReference.class, "MapVersionReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getMapVersionReference_MapVersion(), this.getNameAndMeaningReference(), null, "mapVersion", null, 1, 1,
			MapVersionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getMapVersionReference_Map(), this.getMapReference(), null, "map", null, 0, 1, MapVersionReference.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			matchAlgorithmReferenceEClass, MatchAlgorithmReference.class, "MatchAlgorithmReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getMessage_Heading(), this.getRESTResource(), null, "heading", null, 1, 1, Message.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);

		initEClass(
			modelAttributeReferenceEClass, ModelAttributeReference.class, "ModelAttributeReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			nameAndMeaningReferenceEClass, NameAndMeaningReference.class, "NameAndMeaningReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getNameAndMeaningReference_Value(), this.getString(), "value", null, 0, 1, NameAndMeaningReference.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getNameAndMeaningReference_Href(), this.getRenderingURI(), "href", null, 0, 1,
			NameAndMeaningReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getNameAndMeaningReference_Uri(), this.getExternalURI(), "uri", null, 0, 1, NameAndMeaningReference.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			namedEntityReferenceEClass, NamedEntityReference.class, "NamedEntityReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			namespaceReferenceEClass, NamespaceReference.class, "NamespaceReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(noteEClass, Note.class, "Note", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getNote_AssertedInCodeSystemVersion(), this.getCodeSystemVersionName(), "assertedInCodeSystemVersion",
			null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getNote_CorrespondingStatement(), this.getRenderingURI(), "correspondingStatement", null, 0, 1, Note.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getNote_ExternalIdentifier(), this.getString(), "externalIdentifier", null, 0, 1, Note.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			ontologyDomainReferenceEClass, OntologyDomainReference.class, "OntologyDomainReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			ontologyEngineeringMethodologyReferenceEClass, OntologyEngineeringMethodologyReference.class,
			"OntologyEngineeringMethodologyReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			ontologyEngineeringToolReferenceEClass, OntologyEngineeringToolReference.class,
			"OntologyEngineeringToolReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			ontologyLanguageAndSyntaxEClass, OntologyLanguageAndSyntax.class, "OntologyLanguageAndSyntax",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getOntologyLanguageAndSyntax_OntologyLanguage(), this.getOntologyLanguageReference(), null,
			"ontologyLanguage", null, 1, 1, OntologyLanguageAndSyntax.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getOntologyLanguageAndSyntax_OntologySyntax(), this.getOntologySyntaxReference(), null, "ontologySyntax",
			null, 1, 1, OntologyLanguageAndSyntax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			ontologyLanguageReferenceEClass, OntologyLanguageReference.class, "OntologyLanguageReference",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			ontologySyntaxReferenceEClass, OntologySyntaxReference.class, "OntologySyntaxReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			ontologyTaskReferenceEClass, OntologyTaskReference.class, "OntologyTaskReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			ontologyTypeReferenceEClass, OntologyTypeReference.class, "OntologyTypeReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			opaqueDataEClass, OpaqueData.class, "OpaqueData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getOpaqueData_Value(), this.getTsAnyType(), null, "value", null, 1, 1, OpaqueData.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEReference(
			getOpaqueData_Format(), this.getFormatReference(), null, "format", null, 0, 1, OpaqueData.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getOpaqueData_Language(), this.getLanguageReference(), null, "language", null, 0, 1, OpaqueData.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getOpaqueData_Schema(), this.getDocumentURI(), "schema", null, 0, 1, OpaqueData.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getParameter_Val(), this.getString(), "val", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getParameter_Arg(), theXMLTypePackage.getNCName(), "arg", null, 0, 1, Parameter.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			predicateReferenceEClass, PredicateReference.class, "PredicateReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getProperty_Predicate(), this.getPredicateReference(), null, "predicate", null, 1, 1, Property.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getProperty_Value(), this.getStatementTarget(), null, "value", null, 1, -1, Property.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEReference(
			getProperty_PropertyQualifier(), this.getProperty(), null, "propertyQualifier", null, 0, -1,
			Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getProperty_CorrespondingStatement(), this.getRenderingURI(), "correspondingStatement", null, 0, 1,
			Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);

		initEClass(
			propertyReferenceEClass, PropertyReference.class, "PropertyReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getPropertyReference_ReferenceTarget(), this.getURIAndEntityName(), null, "referenceTarget", null, 1, 1,
			PropertyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getPropertyReference_ReferenceType(), this.getTargetReferenceType(), "referenceType", null, 1, 1,
			PropertyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			reasoningAlgorithmReferenceEClass, ReasoningAlgorithmReference.class, "ReasoningAlgorithmReference",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			resourceDescriptionEClass, ResourceDescription.class, "ResourceDescription", IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getResourceDescription_Keyword(), this.getString(), "keyword", null, 0, -1, ResourceDescription.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getResourceDescription_ResourceType(), this.getURIAndEntityName(), null, "resourceType", null, 0, -1,
			ResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getResourceDescription_ResourceSynopsis(), this.getEntryDescription(), null, "resourceSynopsis", null, 0,
			1, ResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceDescription_AdditionalDocumentation(), this.getPersistentURI(), "additionalDocumentation", null,
			0, -1, ResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getResourceDescription_SourceAndRole(), this.getSourceAndRoleReference(), null, "sourceAndRole", null, 0,
			-1, ResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getResourceDescription_Rights(), this.getOpaqueData(), null, "rights", null, 0, 1,
			ResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getResourceDescription_Note(), this.getComment(), null, "note", null, 0, -1, ResourceDescription.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getResourceDescription_Property(), this.getProperty(), null, "property", null, 0, -1,
			ResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceDescription_AlternateID(), this.getExternalURI(), "alternateID", null, 0, -1,
			ResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceDescription_SourceStatements(), this.getStatementDirectoryURI(), "sourceStatements", null, 0, 1,
			ResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceDescription_About(), this.getExternalURI(), "about", null, 1, 1, ResourceDescription.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceDescription_FormalName(), this.getString(), "formalName", null, 0, 1, ResourceDescription.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			resourceDescriptionDirectoryEntryEClass, ResourceDescriptionDirectoryEntry.class,
			"ResourceDescriptionDirectoryEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getResourceDescriptionDirectoryEntry_ResourceSynopsis(), this.getEntryDescription(), null,
			"resourceSynopsis", null, 0, 1, ResourceDescriptionDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceDescriptionDirectoryEntry_About(), this.getExternalURI(), "about", null, 1, 1,
			ResourceDescriptionDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceDescriptionDirectoryEntry_FormalName(), this.getString(), "formalName", null, 0, 1,
			ResourceDescriptionDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			resourceVersionDescriptionEClass, ResourceVersionDescription.class, "ResourceVersionDescription",
			IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getResourceVersionDescription_SourceAndNotation(), this.getSourceAndNotation(), null, "sourceAndNotation",
			null, 1, 1, ResourceVersionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getResourceVersionDescription_Predecessor(), this.getNameAndMeaningReference(), null, "predecessor", null,
			0, 1, ResourceVersionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceVersionDescription_OfficialResourceVersionId(), this.getString(), "officialResourceVersionId",
			null, 0, 1, ResourceVersionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceVersionDescription_OfficialReleaseDate(), this.getDateAndTime(), "officialReleaseDate", null, 0,
			1, ResourceVersionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceVersionDescription_OfficialActivationDate(), this.getDateAndTime(), "officialActivationDate",
			null, 0, 1, ResourceVersionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceVersionDescription_DocumentURI(), this.getDocumentURI(), "documentURI", null, 1, 1,
			ResourceVersionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceVersionDescription_State(), this.getFinalizableState(), "state", "FINAL", 0, 1,
			ResourceVersionDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			resourceVersionDescriptionDirectoryEntryEClass, ResourceVersionDescriptionDirectoryEntry.class,
			"ResourceVersionDescriptionDirectoryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getResourceVersionDescriptionDirectoryEntry_OfficialResourceVersionId(), this.getString(),
			"officialResourceVersionId", null, 0, 1, ResourceVersionDescriptionDirectoryEntry.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceVersionDescriptionDirectoryEntry_OfficialReleaseDate(), this.getDateAndTime(),
			"officialReleaseDate", null, 0, 1, ResourceVersionDescriptionDirectoryEntry.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getResourceVersionDescriptionDirectoryEntry_DocumentURI(), this.getDocumentURI(), "documentURI", null, 1,
			1, ResourceVersionDescriptionDirectoryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			restResourceEClass, RESTResource.class, "RESTResource", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getRESTResource_ResourceRoot(), this.getServiceURI(), "resourceRoot", null, 1, 1, RESTResource.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getRESTResource_ResourceURI(), this.getRenderingURI(), "resourceURI", null, 1, 1, RESTResource.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getRESTResource_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, RESTResource.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getRESTResource_AccessDate(), this.getDateAndTime(), "accessDate", null, 1, 1, RESTResource.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			roleReferenceEClass, RoleReference.class, "RoleReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			scopedEntityNameEClass, ScopedEntityName.class, "ScopedEntityName", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getScopedEntityName_Namespace(), this.getNamespaceIdentifier(), "namespace", null, 1, 1,
			ScopedEntityName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getScopedEntityName_Name(), this.getString(), "name", null, 1, 1, ScopedEntityName.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			sortCriteriaEClass, SortCriteria.class, "SortCriteria", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getSortCriteria_Entry(), this.getSortCriterion(), null, "entry", null, 0, -1, SortCriteria.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			sortCriterionEClass, SortCriterion.class, "SortCriterion", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getSortCriterion_SortElement(), this.getPropertyReference(), null, "sortElement", null, 1, 1,
			SortCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getSortCriterion_EntryOrder(), theXMLTypePackage.getPositiveInteger(), "entryOrder", null, 1, 1,
			SortCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getSortCriterion_SortDirection(), this.getSortDirection(), "sortDirection", "ASCENDING", 0, 1,
			SortCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			sourceAndNotationEClass, SourceAndNotation.class, "SourceAndNotation", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getSourceAndNotation_SourceAndNotationDescription(), this.getString(), "sourceAndNotationDescription",
			null, 0, 1, SourceAndNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getSourceAndNotation_SourceDocument(), this.getPersistentURI(), "sourceDocument", null, 0, 1,
			SourceAndNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getSourceAndNotation_SourceLanguage(), this.getOntologyLanguageReference(), null, "sourceLanguage", null,
			0, 1, SourceAndNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getSourceAndNotation_SourceDocumentSyntax(), this.getOntologySyntaxReference(), null,
			"sourceDocumentSyntax", null, 0, 1, SourceAndNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			sourceAndRoleReferenceEClass, SourceAndRoleReference.class, "SourceAndRoleReference", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getSourceAndRoleReference_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1,
			SourceAndRoleReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getSourceAndRoleReference_Source(), this.getSourceReference(), null, "source", null, 1, 1,
			SourceAndRoleReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getSourceAndRoleReference_Role(), this.getRoleReference(), null, "role", null, 0, 1,
			SourceAndRoleReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(
			getSourceAndRoleReference_BibliographicLink(), this.getOpaqueData(), null, "bibliographicLink", null, 0, 1,
			SourceAndRoleReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(
			sourceReferenceEClass, SourceReference.class, "SourceReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			statementTargetEClass, StatementTarget.class, "StatementTarget", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getStatementTarget_Entity(), this.getURIAndEntityName(), null, "entity", null, 0, 1, StatementTarget.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatementTarget_Literal(), this.getOpaqueData(), null, "literal", null, 0, 1, StatementTarget.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getStatementTarget_Resource(), this.getExternalURI(), "resource", null, 0, 1, StatementTarget.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getStatementTarget_Bnode(), this.getAnonymousStatement(), null, "bnode", null, 0, -1,
			StatementTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getStatementTarget_ExternalIdentifier(), this.getString(), "externalIdentifier", null, 0, 1,
			StatementTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(
			statusReferenceEClass, StatusReference.class, "StatusReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			tsAnyTypeEClass, TsAnyType.class, "TsAnyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getTsAnyType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TsAnyType.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getTsAnyType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TsAnyType.class, IS_TRANSIENT,
			IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(
			uriAndEntityNameEClass, URIAndEntityName.class, "URIAndEntityName", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getURIAndEntityName_Namespace(), this.getNamespaceIdentifier(), "namespace", null, 0, 1,
			URIAndEntityName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getURIAndEntityName_Name(), this.getString(), "name", null, 0, 1, URIAndEntityName.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getURIAndEntityName_Href(), this.getRenderingURI(), "href", null, 0, 1, URIAndEntityName.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(
			getURIAndEntityName_Uri(), this.getExternalURI(), "uri", null, 1, 1, URIAndEntityName.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null,
			0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation",
			null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getDocumentRoot_EntityExpression(), this.getEntityExpression(), null, "entityExpression", null, 0, -2,
			null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
			IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetDefinitionReferenceEClass, ValueSetDefinitionReference.class, "ValueSetDefinitionReference",
			!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetDefinitionReference_ValueSetDefinition(), this.getNameAndMeaningReference(), null,
			"valueSetDefinition", null, 1, 1, ValueSetDefinitionReference.class, !IS_TRANSIENT, !IS_VOLATILE,
			IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
			getValueSetDefinitionReference_ValueSet(), this.getValueSetReference(), null, "valueSet", null, 0, 1,
			ValueSetDefinitionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(
			valueSetReferenceEClass, ValueSetReference.class, "ValueSetReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(
			versionTagReferenceEClass, VersionTagReference.class, "VersionTagReference", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(associationDirectionEEnum, AssociationDirection.class, "AssociationDirection");
		addEEnumLiteral(associationDirectionEEnum, AssociationDirection.SOURCETOTARGET);
		addEEnumLiteral(associationDirectionEEnum, AssociationDirection.TARGETTOSOURCE);

		initEEnum(changeCommittedEEnum, ChangeCommitted.class, "ChangeCommitted");
		addEEnumLiteral(changeCommittedEEnum, ChangeCommitted.PENDING);
		addEEnumLiteral(changeCommittedEEnum, ChangeCommitted.COMMITTED);

		initEEnum(changeTypeEEnum, ChangeType.class, "ChangeType");
		addEEnumLiteral(changeTypeEEnum, ChangeType.CREATE);
		addEEnumLiteral(changeTypeEEnum, ChangeType.UPDATE);
		addEEnumLiteral(changeTypeEEnum, ChangeType.METADATA);
		addEEnumLiteral(changeTypeEEnum, ChangeType.DELETE);
		addEEnumLiteral(changeTypeEEnum, ChangeType.CLONE);
		addEEnumLiteral(changeTypeEEnum, ChangeType.IMPORT);

		initEEnum(completeDirectoryEEnum, CompleteDirectory.class, "CompleteDirectory");
		addEEnumLiteral(completeDirectoryEEnum, CompleteDirectory.COMPLETE);
		addEEnumLiteral(completeDirectoryEEnum, CompleteDirectory.PARTIAL);

		initEEnum(cts2ResourceTypeEEnum, CTS2ResourceType.class, "CTS2ResourceType");
		addEEnumLiteral(cts2ResourceTypeEEnum, CTS2ResourceType.CODESYSTEM);
		addEEnumLiteral(cts2ResourceTypeEEnum, CTS2ResourceType.CODESYSTEMVERSION);
		addEEnumLiteral(cts2ResourceTypeEEnum, CTS2ResourceType.CONCEPTDOMAIN);
		addEEnumLiteral(cts2ResourceTypeEEnum, CTS2ResourceType.MAP);
		addEEnumLiteral(cts2ResourceTypeEEnum, CTS2ResourceType.MAPVERSION);
		addEEnumLiteral(cts2ResourceTypeEEnum, CTS2ResourceType.VALUESET);
		addEEnumLiteral(cts2ResourceTypeEEnum, CTS2ResourceType.VALUESETDEFINITION);

		initEEnum(definitionRoleEEnum, DefinitionRole.class, "DefinitionRole");
		addEEnumLiteral(definitionRoleEEnum, DefinitionRole.NORMATIVE);
		addEEnumLiteral(definitionRoleEEnum, DefinitionRole.INFORMATIVE);

		initEEnum(entryStateEEnum, EntryState.class, "EntryState");
		addEEnumLiteral(entryStateEEnum, EntryState.INACTIVE);
		addEEnumLiteral(entryStateEEnum, EntryState.ACTIVE);

		initEEnum(finalizableStateEEnum, FinalizableState.class, "FinalizableState");
		addEEnumLiteral(finalizableStateEEnum, FinalizableState.OPEN);
		addEEnumLiteral(finalizableStateEEnum, FinalizableState.FINAL);

		initEEnum(noteTypeEEnum, NoteType.class, "NoteType");
		addEEnumLiteral(noteTypeEEnum, NoteType.CHANGE_NOTE);
		addEEnumLiteral(noteTypeEEnum, NoteType.EDITORIAL_NOTE);
		addEEnumLiteral(noteTypeEEnum, NoteType.HISTORY_NOTE);
		addEEnumLiteral(noteTypeEEnum, NoteType.SCOPE_NOTE);
		addEEnumLiteral(noteTypeEEnum, NoteType.NOTE);

		initEEnum(setOperatorEEnum, SetOperator.class, "SetOperator");
		addEEnumLiteral(setOperatorEEnum, SetOperator.UNION);
		addEEnumLiteral(setOperatorEEnum, SetOperator.INTERSECT);
		addEEnumLiteral(setOperatorEEnum, SetOperator.SUBTRACT);

		initEEnum(sortDirectionEEnum, SortDirection.class, "SortDirection");
		addEEnumLiteral(sortDirectionEEnum, SortDirection.ASCENDING);
		addEEnumLiteral(sortDirectionEEnum, SortDirection.DESCENDING);

		initEEnum(targetReferenceTypeEEnum, TargetReferenceType.class, "TargetReferenceType");
		addEEnumLiteral(targetReferenceTypeEEnum, TargetReferenceType.ATTRIBUTE);
		addEEnumLiteral(targetReferenceTypeEEnum, TargetReferenceType.PROPERTY);
		addEEnumLiteral(targetReferenceTypeEEnum, TargetReferenceType.SPECIAL);

		// Initialize data types
		initEDataType(
			amountOfTimeEDataType, BigInteger.class, "AmountOfTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			associationDirectionObjectEDataType, AssociationDirection.class, "AssociationDirectionObject",
			IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			associationDirectoryURIEDataType, String.class, "AssociationDirectoryURI", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			booleanObjectEDataType, Boolean.class, "BooleanObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			changeCommittedObjectEDataType, ChangeCommitted.class, "ChangeCommittedObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			changeSetDirectoryURIEDataType, String.class, "ChangeSetDirectoryURI", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			changeSetURIEDataType, String.class, "ChangeSetURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			changeTypeObjectEDataType, ChangeType.class, "ChangeTypeObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			codeSystemCatalogEntryDirectoryURIEDataType, String.class, "CodeSystemCatalogEntryDirectoryURI",
			IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			codeSystemNameEDataType, String.class, "CodeSystemName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			codeSystemVersionCatalogEntryDirectoryURIEDataType, String.class,
			"CodeSystemVersionCatalogEntryDirectoryURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			codeSystemVersionNameEDataType, String.class, "CodeSystemVersionName", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			completeDirectoryObjectEDataType, CompleteDirectory.class, "CompleteDirectoryObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			conceptDomainBindingDirectoryURIEDataType, String.class, "ConceptDomainBindingDirectoryURI",
			IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			conceptDomainCatalogEntryDirectoryURIEDataType, String.class, "ConceptDomainCatalogEntryDirectoryURI",
			IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			conceptDomainNameEDataType, String.class, "ConceptDomainName", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			cts2ResourceTypeObjectEDataType, CTS2ResourceType.class, "CTS2ResourceTypeObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			dateAndTimeEDataType, XMLGregorianCalendar.class, "DateAndTime", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			definitionRoleObjectEDataType, DefinitionRole.class, "DefinitionRoleObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			directoryURIEDataType, String.class, "DirectoryURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(documentURIEDataType, String.class, "DocumentURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			entityDirectoryURIEDataType, String.class, "EntityDirectoryURI", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			entryStateObjectEDataType, EntryState.class, "EntryStateObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumerationEDataType, String.class, "Enumeration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(externalURIEDataType, String.class, "ExternalURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			finalizableStateObjectEDataType, FinalizableState.class, "FinalizableStateObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			localIdentifierEDataType, String.class, "LocalIdentifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(localURIEDataType, String.class, "LocalURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			mapCatalogEntryDirectoryURIEDataType, String.class, "MapCatalogEntryDirectoryURI", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			mapEntryDirectoryURIEDataType, String.class, "MapEntryDirectoryURI", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapNameEDataType, String.class, "MapName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			mapVersionDirectoryURIEDataType, String.class, "MapVersionDirectoryURI", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			mapVersionNameEDataType, String.class, "MapVersionName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			matchStrengthEDataType, double.class, "MatchStrength", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			matchStrengthObjectEDataType, Double.class, "MatchStrengthObject", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			namespaceIdentifierEDataType, String.class, "NamespaceIdentifier", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			naturalNumberEDataType, BigInteger.class, "NaturalNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			noteTypeObjectEDataType, NoteType.class, "NoteTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			persistentURIEDataType, String.class, "PersistentURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			renderingURIEDataType, String.class, "RenderingURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			resolvedValueSetDirectoryURIEDataType, String.class, "ResolvedValueSetDirectoryURI", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serviceURIEDataType, String.class, "ServiceURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			setOperatorObjectEDataType, SetOperator.class, "SetOperatorObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			sortDirectionObjectEDataType, SortDirection.class, "SortDirectionObject", IS_SERIALIZABLE,
			IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			statementDirectoryURIEDataType, String.class, "StatementDirectoryURI", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			targetReferenceTypeObjectEDataType, TargetReferenceType.class, "TargetReferenceTypeObject",
			IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, String.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			valueSetCatalogEntryDirectoryURIEDataType, String.class, "ValueSetCatalogEntryDirectoryURI",
			IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			valueSetDefinitionDirectoryURIEDataType, String.class, "ValueSetDefinitionDirectoryURI", IS_SERIALIZABLE,
			!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			valueSetNameEDataType, String.class, "ValueSetName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(
			versionTagNameEDataType, String.class, "VersionTagName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(abstractResourceDescriptionEClass, source, new String[] {
				"name", "AbstractResourceDescription", "kind", "elementOnly" });
		addAnnotation(getAbstractResourceDescription_ReleaseDocumentation(), source, new String[] {
				"kind", "element", "name", "releaseDocumentation", "namespace", "##targetNamespace" });
		addAnnotation(getAbstractResourceDescription_ReleaseFormat(), source, new String[] {
				"kind", "element", "name", "releaseFormat", "namespace", "##targetNamespace" });
		addAnnotation(abstractResourceDescriptionDirectoryEntryEClass, source, new String[] {
				"name", "AbstractResourceDescriptionDirectoryEntry", "kind", "elementOnly" });
		addAnnotation(amountOfTimeEDataType, source, new String[] {
				"name", "AmountOfTime", "baseType", "http://www.eclipse.org/emf/2003/XMLType#positiveInteger" });
		addAnnotation(anonymousEntityReferenceEClass, source, new String[] {
				"name", "AnonymousEntityReference", "kind", "elementOnly" });
		addAnnotation(anonymousStatementEClass, source, new String[] {
				"name", "AnonymousStatement", "kind", "elementOnly" });
		addAnnotation(getAnonymousStatement_Predicate(), source, new String[] {
				"kind", "element", "name", "predicate", "namespace", "##targetNamespace" });
		addAnnotation(getAnonymousStatement_Target(), source, new String[] {
				"kind", "element", "name", "target", "namespace", "##targetNamespace" });
		addAnnotation(getAnonymousStatement_StatmentQualifier(), source, new String[] {
				"kind", "element", "name", "statmentQualifier", "namespace", "##targetNamespace" });
		addAnnotation(associationDirectionEEnum, source, new String[] { "name", "AssociationDirection" });
		addAnnotation(associationDirectionObjectEDataType, source, new String[] {
				"name", "AssociationDirection:Object", "baseType", "AssociationDirection" });
		addAnnotation(associationDirectoryURIEDataType, source, new String[] {
				"name", "AssociationDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(associationReferenceEClass, source, new String[] {
				"name", "AssociationReference", "kind", "simple" });
		addAnnotation(bindingQualifierReferenceEClass, source, new String[] {
				"name", "BindingQualifierReference", "kind", "simple" });
		addAnnotation(booleanEDataType, source, new String[] {
				"name", "Boolean", "baseType", "http://www.eclipse.org/emf/2003/XMLType#boolean" });
		addAnnotation(booleanObjectEDataType, source, new String[] { "name", "Boolean:Object", "baseType", "Boolean" });
		addAnnotation(caseSignificanceReferenceEClass, source, new String[] {
				"name", "CaseSignificanceReference", "kind", "simple" });
		addAnnotation(changeableEClass, source, new String[] { "name", "Changeable", "kind", "elementOnly" });
		addAnnotation(getChangeable_Status(), source, new String[] {
				"kind", "element", "name", "status", "namespace", "##targetNamespace" });
		addAnnotation(getChangeable_ChangeDescription(), source, new String[] {
				"kind", "element", "name", "changeDescription", "namespace", "##targetNamespace" });
		addAnnotation(getChangeable_EntryState(), source, new String[] { "kind", "attribute", "name", "entryState" });
		addAnnotation(changeCommittedEEnum, source, new String[] { "name", "ChangeCommitted" });
		addAnnotation(changeCommittedObjectEDataType, source, new String[] {
				"name", "ChangeCommitted:Object", "baseType", "ChangeCommitted" });
		addAnnotation(changeDescriptionEClass, source, new String[] {
				"name", "ChangeDescription", "kind", "elementOnly" });
		addAnnotation(getChangeDescription_PrevImage(), source, new String[] {
				"kind", "element", "name", "prevImage", "namespace", "##targetNamespace" });
		addAnnotation(getChangeDescription_ChangeNotes(), source, new String[] {
				"kind", "element", "name", "changeNotes", "namespace", "##targetNamespace" });
		addAnnotation(getChangeDescription_ChangeSource(), source, new String[] {
				"kind", "element", "name", "changeSource", "namespace", "##targetNamespace" });
		addAnnotation(getChangeDescription_ClonedResource(), source, new String[] {
				"kind", "element", "name", "clonedResource", "namespace", "##targetNamespace" });
		addAnnotation(getChangeDescription_ChangeDate(), source, new String[] {
				"kind", "attribute", "name", "changeDate" });
		addAnnotation(getChangeDescription_ChangeType(), source, new String[] {
				"kind", "attribute", "name", "changeType" });
		addAnnotation(
			getChangeDescription_Committed(), source, new String[] { "kind", "attribute", "name", "committed" });
		addAnnotation(getChangeDescription_ContainingChangeSet(), source, new String[] {
				"kind", "attribute", "name", "containingChangeSet" });
		addAnnotation(getChangeDescription_EffectiveDate(), source, new String[] {
				"kind", "attribute", "name", "effectiveDate" });
		addAnnotation(getChangeDescription_PrevChangeSet(), source, new String[] {
				"kind", "attribute", "name", "prevChangeSet" });
		addAnnotation(changeSetBaseEClass, source, new String[] { "name", "ChangeSetBase", "kind", "elementOnly" });
		addAnnotation(getChangeSetBase_Creator(), source, new String[] {
				"kind", "element", "name", "creator", "namespace", "##targetNamespace" });
		addAnnotation(getChangeSetBase_ChangeInstructions(), source, new String[] {
				"kind", "element", "name", "changeInstructions", "namespace", "##targetNamespace" });
		addAnnotation(getChangeSetBase_Member(), source, new String[] {
				"kind", "element", "name", "member", "namespace", "##targetNamespace" });
		addAnnotation(getChangeSetBase_ChangeSetURI(), source, new String[] {
				"kind", "attribute", "name", "changeSetURI" });
		addAnnotation(getChangeSetBase_CloseDate(), source, new String[] { "kind", "attribute", "name", "closeDate" });
		addAnnotation(getChangeSetBase_CreationDate(), source, new String[] {
				"kind", "attribute", "name", "creationDate" });
		addAnnotation(getChangeSetBase_EntryCount(), source, new String[] { "kind", "attribute", "name", "entryCount" });
		addAnnotation(getChangeSetBase_OfficialEffectiveDate(), source, new String[] {
				"kind", "attribute", "name", "officialEffectiveDate" });
		addAnnotation(changeSetDirectoryURIEDataType, source, new String[] {
				"name", "ChangeSetDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(
			changeSetURIEDataType, source, new String[] { "name", "ChangeSetURI", "baseType", "PersistentURI" });
		addAnnotation(changeTypeEEnum, source, new String[] { "name", "ChangeType" });
		addAnnotation(changeTypeObjectEDataType, source, new String[] {
				"name", "ChangeType:Object", "baseType", "ChangeType" });
		addAnnotation(codeSystemCatalogEntryDirectoryURIEDataType, source, new String[] {
				"name", "CodeSystemCatalogEntryDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(codeSystemCategoryReferenceEClass, source, new String[] {
				"name", "CodeSystemCategoryReference", "kind", "simple" });
		addAnnotation(codeSystemNameEDataType, source, new String[] {
				"name", "CodeSystemName", "baseType", "LocalIdentifier" });
		addAnnotation(
			codeSystemReferenceEClass, source, new String[] { "name", "CodeSystemReference", "kind", "simple" });
		addAnnotation(codeSystemVersionCatalogEntryDirectoryURIEDataType, source, new String[] {
				"name", "CodeSystemVersionCatalogEntryDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(codeSystemVersionNameEDataType, source, new String[] {
				"name", "CodeSystemVersionName", "baseType", "LocalIdentifier" });
		addAnnotation(codeSystemVersionReferenceEClass, source, new String[] {
				"name", "CodeSystemVersionReference", "kind", "elementOnly" });
		addAnnotation(getCodeSystemVersionReference_Version(), source, new String[] {
				"kind", "element", "name", "version", "namespace", "##targetNamespace" });
		addAnnotation(getCodeSystemVersionReference_CodeSystem(), source, new String[] {
				"kind", "element", "name", "codeSystem", "namespace", "##targetNamespace" });
		addAnnotation(commentEClass, source, new String[] { "name", "Comment", "kind", "elementOnly" });
		addAnnotation(getComment_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(completeDirectoryEEnum, source, new String[] { "name", "CompleteDirectory" });
		addAnnotation(completeDirectoryObjectEDataType, source, new String[] {
				"name", "CompleteDirectory:Object", "baseType", "CompleteDirectory" });
		addAnnotation(conceptDomainBindingDirectoryURIEDataType, source, new String[] {
				"name", "ConceptDomainBindingDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(conceptDomainCatalogEntryDirectoryURIEDataType, source, new String[] {
				"name", "ConceptDomainCatalogEntryDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(conceptDomainNameEDataType, source, new String[] {
				"name", "ConceptDomainName", "baseType", "LocalIdentifier" });
		addAnnotation(conceptDomainReferenceEClass, source, new String[] {
				"name", "ConceptDomainReference", "kind", "simple" });
		addAnnotation(contextReferenceEClass, source, new String[] { "name", "ContextReference", "kind", "simple" });
		addAnnotation(cts2ResourceTypeEEnum, source, new String[] { "name", "CTS2ResourceType" });
		addAnnotation(cts2ResourceTypeObjectEDataType, source, new String[] {
				"name", "CTS2ResourceType:Object", "baseType", "CTS2ResourceType" });
		addAnnotation(dateAndTimeEDataType, source, new String[] {
				"name", "DateAndTime", "baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime" });
		addAnnotation(definitionEClass, source, new String[] { "name", "Definition", "kind", "elementOnly" });
		addAnnotation(getDefinition_UsageContext(), source, new String[] {
				"kind", "element", "name", "usageContext", "namespace", "##targetNamespace" });
		addAnnotation(getDefinition_DefinitionRole(), source, new String[] {
				"kind", "attribute", "name", "definitionRole" });
		addAnnotation(definitionRoleEEnum, source, new String[] { "name", "DefinitionRole" });
		addAnnotation(definitionRoleObjectEDataType, source, new String[] {
				"name", "DefinitionRole:Object", "baseType", "DefinitionRole" });
		addAnnotation(descriptionInCodeSystemEClass, source, new String[] {
				"name", "DescriptionInCodeSystem", "kind", "elementOnly" });
		addAnnotation(getDescriptionInCodeSystem_DescribingCodeSystemVersion(), source, new String[] {
				"kind", "element", "name", "describingCodeSystemVersion", "namespace", "##targetNamespace" });
		addAnnotation(getDescriptionInCodeSystem_Designation(), source, new String[] {
				"kind", "element", "name", "designation", "namespace", "##targetNamespace" });
		addAnnotation(getDescriptionInCodeSystem_Href(), source, new String[] { "kind", "attribute", "name", "href" });
		addAnnotation(designationFidelityReferenceEClass, source, new String[] {
				"name", "DesignationFidelityReference", "kind", "simple" });
		addAnnotation(designationTypeReferenceEClass, source, new String[] {
				"name", "DesignationTypeReference", "kind", "simple" });
		addAnnotation(directoryEClass, source, new String[] { "name", "Directory", "kind", "elementOnly" });
		addAnnotation(getDirectory_DirectoryFilter(), source, new String[] {
				"kind", "element", "name", "directoryFilter", "namespace", "##targetNamespace" });
		addAnnotation(getDirectory_SortCriteria(), source, new String[] {
				"kind", "element", "name", "sortCriteria", "namespace", "##targetNamespace" });
		addAnnotation(getDirectory_Complete(), source, new String[] { "kind", "attribute", "name", "complete" });
		addAnnotation(getDirectory_Next(), source, new String[] { "kind", "attribute", "name", "next" });
		addAnnotation(getDirectory_NumEntries(), source, new String[] { "kind", "attribute", "name", "numEntries" });
		addAnnotation(getDirectory_Prev(), source, new String[] { "kind", "attribute", "name", "prev" });
		addAnnotation(directoryEntryEClass, source, new String[] { "name", "DirectoryEntry", "kind", "elementOnly" });
		addAnnotation(getDirectoryEntry_Href(), source, new String[] { "kind", "attribute", "name", "href" });
		addAnnotation(getDirectoryEntry_MatchStrength(), source, new String[] {
				"kind", "attribute", "name", "matchStrength" });
		addAnnotation(getDirectoryEntry_ResourceName(), source, new String[] {
				"kind", "attribute", "name", "resourceName" });
		addAnnotation(directoryURIEDataType, source, new String[] { "name", "DirectoryURI", "baseType", "LocalURI" });
		addAnnotation(documentURIEDataType, source, new String[] { "name", "DocumentURI", "baseType", "PersistentURI" });
		addAnnotation(entityDirectoryURIEDataType, source, new String[] {
				"name", "EntityDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(
			entityExpressionEClass, source, new String[] { "name", "EntityExpression", "kind", "elementOnly" });
		addAnnotation(getEntityExpression_OntologyLanguageAndSyntax(), source, new String[] {
				"kind", "element", "name", "ontologyLanguageAndSyntax", "namespace", "##targetNamespace" });
		addAnnotation(getEntityExpression_Expression(), source, new String[] {
				"kind", "element", "name", "expression", "namespace", "##targetNamespace" });
		addAnnotation(entityReferenceEClass, source, new String[] { "name", "EntityReference", "kind", "elementOnly" });
		addAnnotation(getEntityReference_Name(), source, new String[] {
				"kind", "element", "name", "name", "namespace", "##targetNamespace" });
		addAnnotation(getEntityReference_KnownEntityDescription(), source, new String[] {
				"kind", "element", "name", "knownEntityDescription", "namespace", "##targetNamespace" });
		addAnnotation(getEntityReference_About(), source, new String[] { "kind", "attribute", "name", "about" });
		addAnnotation(entityReferenceListEClass, source, new String[] {
				"name", "EntityReferenceList", "kind", "elementOnly" });
		addAnnotation(getEntityReferenceList_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(entitySynopsisEClass, source, new String[] { "name", "EntitySynopsis", "kind", "elementOnly" });
		addAnnotation(getEntitySynopsis_Designation(), source, new String[] {
				"kind", "element", "name", "designation", "namespace", "##targetNamespace" });
		addAnnotation(
			entryDescriptionEClass, source, new String[] { "name", "EntryDescription", "kind", "elementOnly" });
		addAnnotation(entryStateEEnum, source, new String[] { "name", "EntryState" });
		addAnnotation(entryStateObjectEDataType, source, new String[] {
				"name", "EntryState:Object", "baseType", "EntryState" });
		addAnnotation(enumerationEDataType, source, new String[] {
				"name", "Enumeration", "baseType", "http://www.eclipse.org/emf/2003/XMLType#string" });
		addAnnotation(exampleEClass, source, new String[] { "name", "Example", "kind", "elementOnly" });
		addAnnotation(externalURIEDataType, source, new String[] { "name", "ExternalURI", "baseType", "PersistentURI" });
		addAnnotation(filterEClass, source, new String[] { "name", "Filter", "kind", "elementOnly" });
		addAnnotation(getFilter_Component(), source, new String[] {
				"kind", "element", "name", "component", "namespace", "##targetNamespace" });
		addAnnotation(filterComponentEClass, source, new String[] { "name", "FilterComponent", "kind", "elementOnly" });
		addAnnotation(getFilterComponent_MatchAlgorithm(), source, new String[] {
				"kind", "element", "name", "matchAlgorithm", "namespace", "##targetNamespace" });
		addAnnotation(getFilterComponent_MatchValue(), source, new String[] {
				"kind", "element", "name", "matchValue", "namespace", "##targetNamespace" });
		addAnnotation(finalizableEClass, source, new String[] { "name", "Finalizable", "kind", "empty" });
		addAnnotation(getFinalizable_State(), source, new String[] { "kind", "attribute", "name", "state" });
		addAnnotation(finalizableStateEEnum, source, new String[] { "name", "FinalizableState" });
		addAnnotation(finalizableStateObjectEDataType, source, new String[] {
				"name", "FinalizableState:Object", "baseType", "FinalizableState" });
		addAnnotation(formalityLevelReferenceEClass, source, new String[] {
				"name", "FormalityLevelReference", "kind", "simple" });
		addAnnotation(formatReferenceEClass, source, new String[] { "name", "FormatReference", "kind", "simple" });
		addAnnotation(languageReferenceEClass, source, new String[] { "name", "LanguageReference", "kind", "simple" });
		addAnnotation(localIdentifierEDataType, source, new String[] {
				"name", "LocalIdentifier", "baseType", "http://www.eclipse.org/emf/2003/XMLType#string", "minLength",
				"1" });
		addAnnotation(localURIEDataType, source, new String[] { "name", "LocalURI", "baseType", "URI" });
		addAnnotation(mapCatalogEntryDirectoryURIEDataType, source, new String[] {
				"name", "MapCatalogEntryDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(mapCorrelationReferenceEClass, source, new String[] {
				"name", "MapCorrelationReference", "kind", "simple" });
		addAnnotation(mapEntryDirectoryURIEDataType, source, new String[] {
				"name", "MapEntryDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(mapNameEDataType, source, new String[] { "name", "MapName", "baseType", "LocalIdentifier" });
		addAnnotation(mapReferenceEClass, source, new String[] { "name", "MapReference", "kind", "simple" });
		addAnnotation(mapVersionDirectoryURIEDataType, source, new String[] {
				"name", "MapVersionDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(mapVersionNameEDataType, source, new String[] {
				"name", "MapVersionName", "baseType", "LocalIdentifier" });
		addAnnotation(mapVersionReferenceEClass, source, new String[] {
				"name", "MapVersionReference", "kind", "elementOnly" });
		addAnnotation(getMapVersionReference_MapVersion(), source, new String[] {
				"kind", "element", "name", "mapVersion", "namespace", "##targetNamespace" });
		addAnnotation(getMapVersionReference_Map(), source, new String[] {
				"kind", "element", "name", "map", "namespace", "##targetNamespace" });
		addAnnotation(matchAlgorithmReferenceEClass, source, new String[] {
				"name", "MatchAlgorithmReference", "kind", "simple" });
		addAnnotation(matchStrengthEDataType, source, new String[] {
				"name", "MatchStrength", "baseType", "http://www.eclipse.org/emf/2003/XMLType#double", "minExclusive",
				"0.0", "maxInclusive", "1.0" });
		addAnnotation(matchStrengthObjectEDataType, source, new String[] {
				"name", "MatchStrength:Object", "baseType", "MatchStrength" });
		addAnnotation(messageEClass, source, new String[] { "name", "Message", "kind", "elementOnly" });
		addAnnotation(getMessage_Heading(), source, new String[] {
				"kind", "element", "name", "heading", "namespace", "##targetNamespace" });
		addAnnotation(modelAttributeReferenceEClass, source, new String[] {
				"name", "ModelAttributeReference", "kind", "simple" });
		addAnnotation(nameAndMeaningReferenceEClass, source, new String[] {
				"name", "NameAndMeaningReference", "kind", "simple" });
		addAnnotation(getNameAndMeaningReference_Value(), source, new String[] { "name", ":0", "kind", "simple" });
		addAnnotation(getNameAndMeaningReference_Href(), source, new String[] { "kind", "attribute", "name", "href" });
		addAnnotation(getNameAndMeaningReference_Uri(), source, new String[] { "kind", "attribute", "name", "uri" });
		addAnnotation(namedEntityReferenceEClass, source, new String[] {
				"name", "NamedEntityReference", "kind", "elementOnly" });
		addAnnotation(namespaceIdentifierEDataType, source, new String[] {
				"name", "NamespaceIdentifier", "baseType", "http://www.eclipse.org/emf/2003/XMLType#NCName",
				"minLength", "1" });
		addAnnotation(namespaceReferenceEClass, source, new String[] { "name", "NamespaceReference", "kind", "simple" });
		addAnnotation(naturalNumberEDataType, source, new String[] {
				"name", "NaturalNumber", "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger" });
		addAnnotation(noteEClass, source, new String[] { "name", "Note", "kind", "elementOnly" });
		addAnnotation(getNote_AssertedInCodeSystemVersion(), source, new String[] {
				"kind", "attribute", "name", "assertedInCodeSystemVersion" });
		addAnnotation(getNote_CorrespondingStatement(), source, new String[] {
				"kind", "attribute", "name", "correspondingStatement" });
		addAnnotation(getNote_ExternalIdentifier(), source, new String[] {
				"kind", "attribute", "name", "externalIdentifier" });
		addAnnotation(noteTypeEEnum, source, new String[] { "name", "NoteType" });
		addAnnotation(
			noteTypeObjectEDataType, source, new String[] { "name", "NoteType:Object", "baseType", "NoteType" });
		addAnnotation(ontologyDomainReferenceEClass, source, new String[] {
				"name", "OntologyDomainReference", "kind", "simple" });
		addAnnotation(ontologyEngineeringMethodologyReferenceEClass, source, new String[] {
				"name", "OntologyEngineeringMethodologyReference", "kind", "simple" });
		addAnnotation(ontologyEngineeringToolReferenceEClass, source, new String[] {
				"name", "OntologyEngineeringToolReference", "kind", "simple" });
		addAnnotation(ontologyLanguageAndSyntaxEClass, source, new String[] {
				"name", "OntologyLanguageAndSyntax", "kind", "elementOnly" });
		addAnnotation(getOntologyLanguageAndSyntax_OntologyLanguage(), source, new String[] {
				"kind", "element", "name", "ontologyLanguage", "namespace", "##targetNamespace" });
		addAnnotation(getOntologyLanguageAndSyntax_OntologySyntax(), source, new String[] {
				"kind", "element", "name", "ontologySyntax", "namespace", "##targetNamespace" });
		addAnnotation(ontologyLanguageReferenceEClass, source, new String[] {
				"name", "OntologyLanguageReference", "kind", "simple" });
		addAnnotation(ontologySyntaxReferenceEClass, source, new String[] {
				"name", "OntologySyntaxReference", "kind", "simple" });
		addAnnotation(ontologyTaskReferenceEClass, source, new String[] {
				"name", "OntologyTaskReference", "kind", "simple" });
		addAnnotation(ontologyTypeReferenceEClass, source, new String[] {
				"name", "OntologyTypeReference", "kind", "simple" });
		addAnnotation(opaqueDataEClass, source, new String[] { "name", "OpaqueData", "kind", "elementOnly" });
		addAnnotation(getOpaqueData_Value(), source, new String[] {
				"kind", "element", "name", "value", "namespace", "##targetNamespace" });
		addAnnotation(getOpaqueData_Format(), source, new String[] {
				"kind", "element", "name", "format", "namespace", "##targetNamespace" });
		addAnnotation(getOpaqueData_Language(), source, new String[] {
				"kind", "element", "name", "language", "namespace", "##targetNamespace" });
		addAnnotation(getOpaqueData_Schema(), source, new String[] {
				"kind", "element", "name", "schema", "namespace", "##targetNamespace" });
		addAnnotation(parameterEClass, source, new String[] { "name", "Parameter", "kind", "elementOnly" });
		addAnnotation(getParameter_Val(), source, new String[] {
				"kind", "element", "name", "val", "namespace", "##targetNamespace" });
		addAnnotation(getParameter_Arg(), source, new String[] { "kind", "attribute", "name", "arg" });
		addAnnotation(persistentURIEDataType, source, new String[] { "name", "PersistentURI", "baseType", "URI" });
		addAnnotation(predicateReferenceEClass, source, new String[] {
				"name", "PredicateReference", "kind", "elementOnly" });
		addAnnotation(propertyEClass, source, new String[] { "name", "Property", "kind", "elementOnly" });
		addAnnotation(getProperty_Predicate(), source, new String[] {
				"kind", "element", "name", "predicate", "namespace", "##targetNamespace" });
		addAnnotation(getProperty_Value(), source, new String[] {
				"kind", "element", "name", "value", "namespace", "##targetNamespace" });
		addAnnotation(getProperty_PropertyQualifier(), source, new String[] {
				"kind", "element", "name", "propertyQualifier", "namespace", "##targetNamespace" });
		addAnnotation(getProperty_CorrespondingStatement(), source, new String[] {
				"kind", "attribute", "name", "correspondingStatement" });
		addAnnotation(propertyReferenceEClass, source, new String[] {
				"name", "PropertyReference", "kind", "elementOnly" });
		addAnnotation(getPropertyReference_ReferenceTarget(), source, new String[] {
				"kind", "element", "name", "referenceTarget", "namespace", "##targetNamespace" });
		addAnnotation(getPropertyReference_ReferenceType(), source, new String[] {
				"kind", "attribute", "name", "referenceType" });
		addAnnotation(reasoningAlgorithmReferenceEClass, source, new String[] {
				"name", "ReasoningAlgorithmReference", "kind", "simple" });
		addAnnotation(renderingURIEDataType, source, new String[] { "name", "RenderingURI", "baseType", "LocalURI" });
		addAnnotation(resolvedValueSetDirectoryURIEDataType, source, new String[] {
				"name", "ResolvedValueSetDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(resourceDescriptionEClass, source, new String[] {
				"name", "ResourceDescription", "kind", "elementOnly" });
		addAnnotation(getResourceDescription_Keyword(), source, new String[] {
				"kind", "element", "name", "keyword", "namespace", "##targetNamespace" });
		addAnnotation(getResourceDescription_ResourceType(), source, new String[] {
				"kind", "element", "name", "resourceType", "namespace", "##targetNamespace" });
		addAnnotation(getResourceDescription_ResourceSynopsis(), source, new String[] {
				"kind", "element", "name", "resourceSynopsis", "namespace", "##targetNamespace" });
		addAnnotation(getResourceDescription_AdditionalDocumentation(), source, new String[] {
				"kind", "element", "name", "additionalDocumentation", "namespace", "##targetNamespace" });
		addAnnotation(getResourceDescription_SourceAndRole(), source, new String[] {
				"kind", "element", "name", "sourceAndRole", "namespace", "##targetNamespace" });
		addAnnotation(getResourceDescription_Rights(), source, new String[] {
				"kind", "element", "name", "rights", "namespace", "##targetNamespace" });
		addAnnotation(getResourceDescription_Note(), source, new String[] {
				"kind", "element", "name", "note", "namespace", "##targetNamespace" });
		addAnnotation(getResourceDescription_Property(), source, new String[] {
				"kind", "element", "name", "property", "namespace", "##targetNamespace" });
		addAnnotation(getResourceDescription_AlternateID(), source, new String[] {
				"kind", "element", "name", "alternateID", "namespace", "##targetNamespace" });
		addAnnotation(getResourceDescription_SourceStatements(), source, new String[] {
				"kind", "element", "name", "sourceStatements", "namespace", "##targetNamespace" });
		addAnnotation(getResourceDescription_About(), source, new String[] { "kind", "attribute", "name", "about" });
		addAnnotation(getResourceDescription_FormalName(), source, new String[] {
				"kind", "attribute", "name", "formalName" });
		addAnnotation(resourceDescriptionDirectoryEntryEClass, source, new String[] {
				"name", "ResourceDescriptionDirectoryEntry", "kind", "elementOnly" });
		addAnnotation(getResourceDescriptionDirectoryEntry_ResourceSynopsis(), source, new String[] {
				"kind", "element", "name", "resourceSynopsis", "namespace", "##targetNamespace" });
		addAnnotation(getResourceDescriptionDirectoryEntry_About(), source, new String[] {
				"kind", "attribute", "name", "about" });
		addAnnotation(getResourceDescriptionDirectoryEntry_FormalName(), source, new String[] {
				"kind", "attribute", "name", "formalName" });
		addAnnotation(resourceVersionDescriptionEClass, source, new String[] {
				"name", "ResourceVersionDescription", "kind", "elementOnly" });
		addAnnotation(getResourceVersionDescription_SourceAndNotation(), source, new String[] {
				"kind", "element", "name", "sourceAndNotation", "namespace", "##targetNamespace" });
		addAnnotation(getResourceVersionDescription_Predecessor(), source, new String[] {
				"kind", "element", "name", "predecessor", "namespace", "##targetNamespace" });
		addAnnotation(getResourceVersionDescription_OfficialResourceVersionId(), source, new String[] {
				"kind", "element", "name", "officialResourceVersionId", "namespace", "##targetNamespace" });
		addAnnotation(getResourceVersionDescription_OfficialReleaseDate(), source, new String[] {
				"kind", "element", "name", "officialReleaseDate", "namespace", "##targetNamespace" });
		addAnnotation(getResourceVersionDescription_OfficialActivationDate(), source, new String[] {
				"kind", "element", "name", "officialActivationDate", "namespace", "##targetNamespace" });
		addAnnotation(getResourceVersionDescription_DocumentURI(), source, new String[] {
				"kind", "attribute", "name", "documentURI" });
		addAnnotation(getResourceVersionDescription_State(), source, new String[] {
				"kind", "attribute", "name", "state" });
		addAnnotation(resourceVersionDescriptionDirectoryEntryEClass, source, new String[] {
				"name", "ResourceVersionDescriptionDirectoryEntry", "kind", "elementOnly" });
		addAnnotation(getResourceVersionDescriptionDirectoryEntry_OfficialResourceVersionId(), source, new String[] {
				"kind", "element", "name", "officialResourceVersionId", "namespace", "##targetNamespace" });
		addAnnotation(getResourceVersionDescriptionDirectoryEntry_OfficialReleaseDate(), source, new String[] {
				"kind", "element", "name", "officialReleaseDate", "namespace", "##targetNamespace" });
		addAnnotation(getResourceVersionDescriptionDirectoryEntry_DocumentURI(), source, new String[] {
				"kind", "attribute", "name", "documentURI" });
		addAnnotation(restResourceEClass, source, new String[] { "name", "RESTResource", "kind", "elementOnly" });
		addAnnotation(getRESTResource_ResourceRoot(), source, new String[] {
				"kind", "element", "name", "resourceRoot", "namespace", "##targetNamespace" });
		addAnnotation(getRESTResource_ResourceURI(), source, new String[] {
				"kind", "element", "name", "resourceURI", "namespace", "##targetNamespace" });
		addAnnotation(getRESTResource_Parameter(), source, new String[] {
				"kind", "element", "name", "parameter", "namespace", "##targetNamespace" });
		addAnnotation(getRESTResource_AccessDate(), source, new String[] {
				"kind", "element", "name", "accessDate", "namespace", "##targetNamespace" });
		addAnnotation(roleReferenceEClass, source, new String[] { "name", "RoleReference", "kind", "simple" });
		addAnnotation(
			scopedEntityNameEClass, source, new String[] { "name", "ScopedEntityName", "kind", "elementOnly" });
		addAnnotation(getScopedEntityName_Namespace(), source, new String[] {
				"kind", "element", "name", "namespace", "namespace", "##targetNamespace" });
		addAnnotation(getScopedEntityName_Name(), source, new String[] {
				"kind", "element", "name", "name", "namespace", "##targetNamespace" });
		addAnnotation(serviceURIEDataType, source, new String[] { "name", "ServiceURI", "baseType", "LocalURI" });
		addAnnotation(setOperatorEEnum, source, new String[] { "name", "SetOperator" });
		addAnnotation(setOperatorObjectEDataType, source, new String[] {
				"name", "SetOperator:Object", "baseType", "SetOperator" });
		addAnnotation(sortCriteriaEClass, source, new String[] { "name", "SortCriteria", "kind", "elementOnly" });
		addAnnotation(getSortCriteria_Entry(), source, new String[] {
				"kind", "element", "name", "entry", "namespace", "##targetNamespace" });
		addAnnotation(sortCriterionEClass, source, new String[] { "name", "SortCriterion", "kind", "elementOnly" });
		addAnnotation(getSortCriterion_SortElement(), source, new String[] {
				"kind", "element", "name", "sortElement", "namespace", "##targetNamespace" });
		addAnnotation(getSortCriterion_EntryOrder(), source, new String[] { "kind", "attribute", "name", "entryOrder" });
		addAnnotation(getSortCriterion_SortDirection(), source, new String[] {
				"kind", "attribute", "name", "sortDirection" });
		addAnnotation(sortDirectionEEnum, source, new String[] { "name", "SortDirection" });
		addAnnotation(sortDirectionObjectEDataType, source, new String[] {
				"name", "SortDirection:Object", "baseType", "SortDirection" });
		addAnnotation(sourceAndNotationEClass, source, new String[] {
				"name", "SourceAndNotation", "kind", "elementOnly" });
		addAnnotation(getSourceAndNotation_SourceAndNotationDescription(), source, new String[] {
				"kind", "element", "name", "sourceAndNotationDescription", "namespace", "##targetNamespace" });
		addAnnotation(getSourceAndNotation_SourceDocument(), source, new String[] {
				"kind", "element", "name", "sourceDocument", "namespace", "##targetNamespace" });
		addAnnotation(getSourceAndNotation_SourceLanguage(), source, new String[] {
				"kind", "element", "name", "sourceLanguage", "namespace", "##targetNamespace" });
		addAnnotation(getSourceAndNotation_SourceDocumentSyntax(), source, new String[] {
				"kind", "element", "name", "sourceDocumentSyntax", "namespace", "##targetNamespace" });
		addAnnotation(sourceAndRoleReferenceEClass, source, new String[] {
				"name", "SourceAndRoleReference", "kind", "mixed" });
		addAnnotation(getSourceAndRoleReference_Mixed(), source, new String[] {
				"kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getSourceAndRoleReference_Source(), source, new String[] {
				"kind", "element", "name", "source", "namespace", "##targetNamespace" });
		addAnnotation(getSourceAndRoleReference_Role(), source, new String[] {
				"kind", "element", "name", "role", "namespace", "##targetNamespace" });
		addAnnotation(getSourceAndRoleReference_BibliographicLink(), source, new String[] {
				"kind", "element", "name", "bibliographicLink", "namespace", "##targetNamespace" });
		addAnnotation(sourceReferenceEClass, source, new String[] { "name", "SourceReference", "kind", "simple" });
		addAnnotation(statementDirectoryURIEDataType, source, new String[] {
				"name", "StatementDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(statementTargetEClass, source, new String[] { "name", "StatementTarget", "kind", "elementOnly" });
		addAnnotation(getStatementTarget_Entity(), source, new String[] {
				"kind", "element", "name", "entity", "namespace", "##targetNamespace" });
		addAnnotation(getStatementTarget_Literal(), source, new String[] {
				"kind", "element", "name", "literal", "namespace", "##targetNamespace" });
		addAnnotation(getStatementTarget_Resource(), source, new String[] {
				"kind", "element", "name", "resource", "namespace", "##targetNamespace" });
		addAnnotation(getStatementTarget_Bnode(), source, new String[] {
				"kind", "element", "name", "bnode", "namespace", "##targetNamespace" });
		addAnnotation(getStatementTarget_ExternalIdentifier(), source, new String[] {
				"kind", "attribute", "name", "externalIdentifier" });
		addAnnotation(statusReferenceEClass, source, new String[] { "name", "StatusReference", "kind", "simple" });
		addAnnotation(stringEDataType, source, new String[] {
				"name", "String", "baseType", "http://www.eclipse.org/emf/2003/XMLType#string" });
		addAnnotation(targetReferenceTypeEEnum, source, new String[] { "name", "TargetReferenceType" });
		addAnnotation(targetReferenceTypeObjectEDataType, source, new String[] {
				"name", "TargetReferenceType:Object", "baseType", "TargetReferenceType" });
		addAnnotation(tsAnyTypeEClass, source, new String[] { "name", "tsAnyType", "kind", "mixed" });
		addAnnotation(getTsAnyType_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getTsAnyType_Any(), source, new String[] {
				"kind", "elementWildcard", "wildcards", "##any", "name", ":1", "processing", "lax" });
		addAnnotation(uriEDataType, source, new String[] {
				"name", "URI", "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI" });
		addAnnotation(
			uriAndEntityNameEClass, source, new String[] { "name", "URIAndEntityName", "kind", "elementOnly" });
		addAnnotation(getURIAndEntityName_Namespace(), source, new String[] {
				"kind", "element", "name", "namespace", "namespace", "##targetNamespace" });
		addAnnotation(getURIAndEntityName_Name(), source, new String[] {
				"kind", "element", "name", "name", "namespace", "##targetNamespace" });
		addAnnotation(getURIAndEntityName_Href(), source, new String[] { "kind", "attribute", "name", "href" });
		addAnnotation(getURIAndEntityName_Uri(), source, new String[] { "kind", "attribute", "name", "uri" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] {
				"kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source, new String[] {
				"kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_EntityExpression(), source, new String[] {
				"kind", "element", "name", "EntityExpression", "namespace", "##targetNamespace" });
		addAnnotation(valueSetCatalogEntryDirectoryURIEDataType, source, new String[] {
				"name", "ValueSetCatalogEntryDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(valueSetDefinitionDirectoryURIEDataType, source, new String[] {
				"name", "ValueSetDefinitionDirectoryURI", "baseType", "DirectoryURI" });
		addAnnotation(valueSetDefinitionReferenceEClass, source, new String[] {
				"name", "ValueSetDefinitionReference", "kind", "elementOnly" });
		addAnnotation(getValueSetDefinitionReference_ValueSetDefinition(), source, new String[] {
				"kind", "element", "name", "valueSetDefinition", "namespace", "##targetNamespace" });
		addAnnotation(getValueSetDefinitionReference_ValueSet(), source, new String[] {
				"kind", "element", "name", "valueSet", "namespace", "##targetNamespace" });
		addAnnotation(valueSetNameEDataType, source, new String[] {
				"name", "ValueSetName", "baseType", "LocalIdentifier" });
		addAnnotation(valueSetReferenceEClass, source, new String[] { "name", "ValueSetReference", "kind", "simple" });
		addAnnotation(versionTagNameEDataType, source, new String[] {
				"name", "VersionTagName", "baseType", "LocalIdentifier" });
		addAnnotation(
			versionTagReferenceEClass, source, new String[] { "name", "VersionTagReference", "kind", "simple" });
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation(changeSetBaseEClass, source, new String[] { "appinfo", "PSM" });
		addAnnotation(exampleEClass, source, new String[] { "appinfo", "PSM" });
		addAnnotation(messageEClass, source, new String[] { "appinfo", "PSM" });
		addAnnotation(noteTypeEEnum.getELiterals().get(0), source, new String[] { "appinfo", "PSM" });
		addAnnotation(noteTypeEEnum.getELiterals().get(1), source, new String[] { "appinfo", "PSM" });
		addAnnotation(noteTypeEEnum.getELiterals().get(2), source, new String[] { "appinfo", "PSM" });
		addAnnotation(noteTypeEEnum.getELiterals().get(3), source, new String[] { "appinfo", "PSM" });
		addAnnotation(noteTypeEEnum.getELiterals().get(4), source, new String[] { "appinfo", "PSM" });
		addAnnotation(parameterEClass, source, new String[] { "appinfo", "PSM" });
		addAnnotation(restResourceEClass, source, new String[] { "appinfo", "PSM" });
		addAnnotation(getRESTResource_ResourceRoot(), source, new String[] { "appinfo", "PSM" });
		addAnnotation(getRESTResource_ResourceURI(), source, new String[] { "appinfo", "PSM" });
		addAnnotation(getRESTResource_Parameter(), source, new String[] { "appinfo", "PSM" });
		addAnnotation(getRESTResource_AccessDate(), source, new String[] { "appinfo", "PSM" });
		addAnnotation(tsAnyTypeEClass, source, new String[] { "appinfo", "PSM" });
	}

} // CorePackageImpl
