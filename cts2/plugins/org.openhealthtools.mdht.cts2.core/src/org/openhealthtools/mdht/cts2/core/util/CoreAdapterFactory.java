/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CoreSwitch<Adapter> modelSwitch = new CoreSwitch<Adapter>() {
		@Override
		public Adapter caseAbstractResourceDescription(AbstractResourceDescription object) {
			return createAbstractResourceDescriptionAdapter();
		}

		@Override
		public Adapter caseAbstractResourceDescriptionDirectoryEntry(AbstractResourceDescriptionDirectoryEntry object) {
			return createAbstractResourceDescriptionDirectoryEntryAdapter();
		}

		@Override
		public Adapter caseAnonymousEntityReference(AnonymousEntityReference object) {
			return createAnonymousEntityReferenceAdapter();
		}

		@Override
		public Adapter caseAnonymousStatement(AnonymousStatement object) {
			return createAnonymousStatementAdapter();
		}

		@Override
		public Adapter caseAssociationReference(AssociationReference object) {
			return createAssociationReferenceAdapter();
		}

		@Override
		public Adapter caseBindingQualifierReference(BindingQualifierReference object) {
			return createBindingQualifierReferenceAdapter();
		}

		@Override
		public Adapter caseCaseSignificanceReference(CaseSignificanceReference object) {
			return createCaseSignificanceReferenceAdapter();
		}

		@Override
		public Adapter caseChangeable(Changeable object) {
			return createChangeableAdapter();
		}

		@Override
		public Adapter caseChangeDescription(ChangeDescription object) {
			return createChangeDescriptionAdapter();
		}

		@Override
		public Adapter caseChangeSetBase(ChangeSetBase object) {
			return createChangeSetBaseAdapter();
		}

		@Override
		public Adapter caseCodeSystemCategoryReference(CodeSystemCategoryReference object) {
			return createCodeSystemCategoryReferenceAdapter();
		}

		@Override
		public Adapter caseCodeSystemReference(CodeSystemReference object) {
			return createCodeSystemReferenceAdapter();
		}

		@Override
		public Adapter caseCodeSystemVersionReference(CodeSystemVersionReference object) {
			return createCodeSystemVersionReferenceAdapter();
		}

		@Override
		public Adapter caseComment(Comment object) {
			return createCommentAdapter();
		}

		@Override
		public Adapter caseConceptDomainReference(ConceptDomainReference object) {
			return createConceptDomainReferenceAdapter();
		}

		@Override
		public Adapter caseContextReference(ContextReference object) {
			return createContextReferenceAdapter();
		}

		@Override
		public Adapter caseDefinition(Definition object) {
			return createDefinitionAdapter();
		}

		@Override
		public Adapter caseDescriptionInCodeSystem(DescriptionInCodeSystem object) {
			return createDescriptionInCodeSystemAdapter();
		}

		@Override
		public Adapter caseDesignationFidelityReference(DesignationFidelityReference object) {
			return createDesignationFidelityReferenceAdapter();
		}

		@Override
		public Adapter caseDesignationTypeReference(DesignationTypeReference object) {
			return createDesignationTypeReferenceAdapter();
		}

		@Override
		public Adapter caseDirectory(Directory object) {
			return createDirectoryAdapter();
		}

		@Override
		public Adapter caseDirectoryEntry(DirectoryEntry object) {
			return createDirectoryEntryAdapter();
		}

		@Override
		public Adapter caseEntityExpression(EntityExpression object) {
			return createEntityExpressionAdapter();
		}

		@Override
		public Adapter caseEntityReference(EntityReference object) {
			return createEntityReferenceAdapter();
		}

		@Override
		public Adapter caseEntityReferenceList(EntityReferenceList object) {
			return createEntityReferenceListAdapter();
		}

		@Override
		public Adapter caseEntitySynopsis(EntitySynopsis object) {
			return createEntitySynopsisAdapter();
		}

		@Override
		public Adapter caseEntryDescription(EntryDescription object) {
			return createEntryDescriptionAdapter();
		}

		@Override
		public Adapter caseExample(Example object) {
			return createExampleAdapter();
		}

		@Override
		public Adapter caseFilter(Filter object) {
			return createFilterAdapter();
		}

		@Override
		public Adapter caseFilterComponent(FilterComponent object) {
			return createFilterComponentAdapter();
		}

		@Override
		public Adapter caseFinalizable(Finalizable object) {
			return createFinalizableAdapter();
		}

		@Override
		public Adapter caseFormalityLevelReference(FormalityLevelReference object) {
			return createFormalityLevelReferenceAdapter();
		}

		@Override
		public Adapter caseFormatReference(FormatReference object) {
			return createFormatReferenceAdapter();
		}

		@Override
		public Adapter caseLanguageReference(LanguageReference object) {
			return createLanguageReferenceAdapter();
		}

		@Override
		public Adapter caseMapCorrelationReference(MapCorrelationReference object) {
			return createMapCorrelationReferenceAdapter();
		}

		@Override
		public Adapter caseMapReference(MapReference object) {
			return createMapReferenceAdapter();
		}

		@Override
		public Adapter caseMapVersionReference(MapVersionReference object) {
			return createMapVersionReferenceAdapter();
		}

		@Override
		public Adapter caseMatchAlgorithmReference(MatchAlgorithmReference object) {
			return createMatchAlgorithmReferenceAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter caseModelAttributeReference(ModelAttributeReference object) {
			return createModelAttributeReferenceAdapter();
		}

		@Override
		public Adapter caseNameAndMeaningReference(NameAndMeaningReference object) {
			return createNameAndMeaningReferenceAdapter();
		}

		@Override
		public Adapter caseNamedEntityReference(NamedEntityReference object) {
			return createNamedEntityReferenceAdapter();
		}

		@Override
		public Adapter caseNamespaceReference(NamespaceReference object) {
			return createNamespaceReferenceAdapter();
		}

		@Override
		public Adapter caseNote(Note object) {
			return createNoteAdapter();
		}

		@Override
		public Adapter caseOntologyDomainReference(OntologyDomainReference object) {
			return createOntologyDomainReferenceAdapter();
		}

		@Override
		public Adapter caseOntologyEngineeringMethodologyReference(OntologyEngineeringMethodologyReference object) {
			return createOntologyEngineeringMethodologyReferenceAdapter();
		}

		@Override
		public Adapter caseOntologyEngineeringToolReference(OntologyEngineeringToolReference object) {
			return createOntologyEngineeringToolReferenceAdapter();
		}

		@Override
		public Adapter caseOntologyLanguageAndSyntax(OntologyLanguageAndSyntax object) {
			return createOntologyLanguageAndSyntaxAdapter();
		}

		@Override
		public Adapter caseOntologyLanguageReference(OntologyLanguageReference object) {
			return createOntologyLanguageReferenceAdapter();
		}

		@Override
		public Adapter caseOntologySyntaxReference(OntologySyntaxReference object) {
			return createOntologySyntaxReferenceAdapter();
		}

		@Override
		public Adapter caseOntologyTaskReference(OntologyTaskReference object) {
			return createOntologyTaskReferenceAdapter();
		}

		@Override
		public Adapter caseOntologyTypeReference(OntologyTypeReference object) {
			return createOntologyTypeReferenceAdapter();
		}

		@Override
		public Adapter caseOpaqueData(OpaqueData object) {
			return createOpaqueDataAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter casePredicateReference(PredicateReference object) {
			return createPredicateReferenceAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter casePropertyReference(PropertyReference object) {
			return createPropertyReferenceAdapter();
		}

		@Override
		public Adapter caseReasoningAlgorithmReference(ReasoningAlgorithmReference object) {
			return createReasoningAlgorithmReferenceAdapter();
		}

		@Override
		public Adapter caseResourceDescription(ResourceDescription object) {
			return createResourceDescriptionAdapter();
		}

		@Override
		public Adapter caseResourceDescriptionDirectoryEntry(ResourceDescriptionDirectoryEntry object) {
			return createResourceDescriptionDirectoryEntryAdapter();
		}

		@Override
		public Adapter caseResourceVersionDescription(ResourceVersionDescription object) {
			return createResourceVersionDescriptionAdapter();
		}

		@Override
		public Adapter caseResourceVersionDescriptionDirectoryEntry(ResourceVersionDescriptionDirectoryEntry object) {
			return createResourceVersionDescriptionDirectoryEntryAdapter();
		}

		@Override
		public Adapter caseRESTResource(RESTResource object) {
			return createRESTResourceAdapter();
		}

		@Override
		public Adapter caseRoleReference(RoleReference object) {
			return createRoleReferenceAdapter();
		}

		@Override
		public Adapter caseScopedEntityName(ScopedEntityName object) {
			return createScopedEntityNameAdapter();
		}

		@Override
		public Adapter caseSortCriteria(SortCriteria object) {
			return createSortCriteriaAdapter();
		}

		@Override
		public Adapter caseSortCriterion(SortCriterion object) {
			return createSortCriterionAdapter();
		}

		@Override
		public Adapter caseSourceAndNotation(SourceAndNotation object) {
			return createSourceAndNotationAdapter();
		}

		@Override
		public Adapter caseSourceAndRoleReference(SourceAndRoleReference object) {
			return createSourceAndRoleReferenceAdapter();
		}

		@Override
		public Adapter caseSourceReference(SourceReference object) {
			return createSourceReferenceAdapter();
		}

		@Override
		public Adapter caseStatementTarget(StatementTarget object) {
			return createStatementTargetAdapter();
		}

		@Override
		public Adapter caseStatusReference(StatusReference object) {
			return createStatusReferenceAdapter();
		}

		@Override
		public Adapter caseTsAnyType(TsAnyType object) {
			return createTsAnyTypeAdapter();
		}

		@Override
		public Adapter caseURIAndEntityName(URIAndEntityName object) {
			return createURIAndEntityNameAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseValueSetDefinitionReference(ValueSetDefinitionReference object) {
			return createValueSetDefinitionReferenceAdapter();
		}

		@Override
		public Adapter caseValueSetReference(ValueSetReference object) {
			return createValueSetReferenceAdapter();
		}

		@Override
		public Adapter caseVersionTagReference(VersionTagReference object) {
			return createVersionTagReferenceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.AbstractResourceDescription
	 * <em>Abstract Resource Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.AbstractResourceDescription
	 * @generated
	 */
	public Adapter createAbstractResourceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.AbstractResourceDescriptionDirectoryEntry
	 * <em>Abstract Resource Description Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.AbstractResourceDescriptionDirectoryEntry
	 * @generated
	 */
	public Adapter createAbstractResourceDescriptionDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.AnonymousEntityReference
	 * <em>Anonymous Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.AnonymousEntityReference
	 * @generated
	 */
	public Adapter createAnonymousEntityReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.AnonymousStatement <em>Anonymous Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.AnonymousStatement
	 * @generated
	 */
	public Adapter createAnonymousStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.AssociationReference <em>Association Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.AssociationReference
	 * @generated
	 */
	public Adapter createAssociationReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.BindingQualifierReference
	 * <em>Binding Qualifier Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.BindingQualifierReference
	 * @generated
	 */
	public Adapter createBindingQualifierReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.CaseSignificanceReference
	 * <em>Case Significance Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.CaseSignificanceReference
	 * @generated
	 */
	public Adapter createCaseSignificanceReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Changeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Changeable
	 * @generated
	 */
	public Adapter createChangeableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ChangeDescription <em>Change Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeDescription
	 * @generated
	 */
	public Adapter createChangeDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ChangeSetBase <em>Change Set Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ChangeSetBase
	 * @generated
	 */
	public Adapter createChangeSetBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.CodeSystemCategoryReference
	 * <em>Code System Category Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.CodeSystemCategoryReference
	 * @generated
	 */
	public Adapter createCodeSystemCategoryReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.CodeSystemReference <em>Code System Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.CodeSystemReference
	 * @generated
	 */
	public Adapter createCodeSystemReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference
	 * <em>Code System Version Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference
	 * @generated
	 */
	public Adapter createCodeSystemVersionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ConceptDomainReference
	 * <em>Concept Domain Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ConceptDomainReference
	 * @generated
	 */
	public Adapter createConceptDomainReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ContextReference <em>Context Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ContextReference
	 * @generated
	 */
	public Adapter createContextReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem
	 * <em>Description In Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem
	 * @generated
	 */
	public Adapter createDescriptionInCodeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.DesignationFidelityReference
	 * <em>Designation Fidelity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.DesignationFidelityReference
	 * @generated
	 */
	public Adapter createDesignationFidelityReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.DesignationTypeReference
	 * <em>Designation Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.DesignationTypeReference
	 * @generated
	 */
	public Adapter createDesignationTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Directory
	 * @generated
	 */
	public Adapter createDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.DirectoryEntry <em>Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.DirectoryEntry
	 * @generated
	 */
	public Adapter createDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.EntityExpression <em>Entity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.EntityExpression
	 * @generated
	 */
	public Adapter createEntityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.EntityReference <em>Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.EntityReference
	 * @generated
	 */
	public Adapter createEntityReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.EntityReferenceList <em>Entity Reference List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.EntityReferenceList
	 * @generated
	 */
	public Adapter createEntityReferenceListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.EntitySynopsis <em>Entity Synopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.EntitySynopsis
	 * @generated
	 */
	public Adapter createEntitySynopsisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.EntryDescription <em>Entry Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.EntryDescription
	 * @generated
	 */
	public Adapter createEntryDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Example
	 * @generated
	 */
	public Adapter createExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.FilterComponent <em>Filter Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.FilterComponent
	 * @generated
	 */
	public Adapter createFilterComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Finalizable <em>Finalizable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Finalizable
	 * @generated
	 */
	public Adapter createFinalizableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.FormalityLevelReference
	 * <em>Formality Level Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.FormalityLevelReference
	 * @generated
	 */
	public Adapter createFormalityLevelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.FormatReference <em>Format Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.FormatReference
	 * @generated
	 */
	public Adapter createFormatReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.LanguageReference <em>Language Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.LanguageReference
	 * @generated
	 */
	public Adapter createLanguageReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.MapCorrelationReference
	 * <em>Map Correlation Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.MapCorrelationReference
	 * @generated
	 */
	public Adapter createMapCorrelationReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.MapReference <em>Map Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.MapReference
	 * @generated
	 */
	public Adapter createMapReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.MapVersionReference <em>Map Version Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.MapVersionReference
	 * @generated
	 */
	public Adapter createMapVersionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.MatchAlgorithmReference
	 * <em>Match Algorithm Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.MatchAlgorithmReference
	 * @generated
	 */
	public Adapter createMatchAlgorithmReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ModelAttributeReference
	 * <em>Model Attribute Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ModelAttributeReference
	 * @generated
	 */
	public Adapter createModelAttributeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.NameAndMeaningReference
	 * <em>Name And Meaning Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.NameAndMeaningReference
	 * @generated
	 */
	public Adapter createNameAndMeaningReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.NamedEntityReference <em>Named Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.NamedEntityReference
	 * @generated
	 */
	public Adapter createNamedEntityReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.NamespaceReference <em>Namespace Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.NamespaceReference
	 * @generated
	 */
	public Adapter createNamespaceReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.OntologyDomainReference
	 * <em>Ontology Domain Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyDomainReference
	 * @generated
	 */
	public Adapter createOntologyDomainReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.OntologyEngineeringMethodologyReference
	 * <em>Ontology Engineering Methodology Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyEngineeringMethodologyReference
	 * @generated
	 */
	public Adapter createOntologyEngineeringMethodologyReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.OntologyEngineeringToolReference
	 * <em>Ontology Engineering Tool Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyEngineeringToolReference
	 * @generated
	 */
	public Adapter createOntologyEngineeringToolReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax
	 * <em>Ontology Language And Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyLanguageAndSyntax
	 * @generated
	 */
	public Adapter createOntologyLanguageAndSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.OntologyLanguageReference
	 * <em>Ontology Language Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyLanguageReference
	 * @generated
	 */
	public Adapter createOntologyLanguageReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.OntologySyntaxReference
	 * <em>Ontology Syntax Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.OntologySyntaxReference
	 * @generated
	 */
	public Adapter createOntologySyntaxReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.OntologyTaskReference <em>Ontology Task Reference</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyTaskReference
	 * @generated
	 */
	public Adapter createOntologyTaskReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.OntologyTypeReference <em>Ontology Type Reference</em>}
	 * '.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.OntologyTypeReference
	 * @generated
	 */
	public Adapter createOntologyTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.OpaqueData <em>Opaque Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.OpaqueData
	 * @generated
	 */
	public Adapter createOpaqueDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.PredicateReference <em>Predicate Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.PredicateReference
	 * @generated
	 */
	public Adapter createPredicateReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.PropertyReference <em>Property Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.PropertyReference
	 * @generated
	 */
	public Adapter createPropertyReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ReasoningAlgorithmReference
	 * <em>Reasoning Algorithm Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ReasoningAlgorithmReference
	 * @generated
	 */
	public Adapter createReasoningAlgorithmReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription <em>Resource Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescription
	 * @generated
	 */
	public Adapter createResourceDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry
	 * <em>Resource Description Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry
	 * @generated
	 */
	public Adapter createResourceDescriptionDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescription
	 * <em>Resource Version Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescription
	 * @generated
	 */
	public Adapter createResourceVersionDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry
	 * <em>Resource Version Description Directory Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry
	 * @generated
	 */
	public Adapter createResourceVersionDescriptionDirectoryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.RESTResource <em>REST Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.RESTResource
	 * @generated
	 */
	public Adapter createRESTResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.RoleReference <em>Role Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.RoleReference
	 * @generated
	 */
	public Adapter createRoleReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ScopedEntityName <em>Scoped Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ScopedEntityName
	 * @generated
	 */
	public Adapter createScopedEntityNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.SortCriteria <em>Sort Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.SortCriteria
	 * @generated
	 */
	public Adapter createSortCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.SortCriterion <em>Sort Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.SortCriterion
	 * @generated
	 */
	public Adapter createSortCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.SourceAndNotation <em>Source And Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.SourceAndNotation
	 * @generated
	 */
	public Adapter createSourceAndNotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference
	 * <em>Source And Role Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.SourceAndRoleReference
	 * @generated
	 */
	public Adapter createSourceAndRoleReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.SourceReference <em>Source Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.SourceReference
	 * @generated
	 */
	public Adapter createSourceReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.StatementTarget <em>Statement Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.StatementTarget
	 * @generated
	 */
	public Adapter createStatementTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.StatusReference <em>Status Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.StatusReference
	 * @generated
	 */
	public Adapter createStatusReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.TsAnyType <em>Ts Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.TsAnyType
	 * @generated
	 */
	public Adapter createTsAnyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName <em>URI And Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.URIAndEntityName
	 * @generated
	 */
	public Adapter createURIAndEntityNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference
	 * <em>Value Set Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ValueSetDefinitionReference
	 * @generated
	 */
	public Adapter createValueSetDefinitionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.ValueSetReference <em>Value Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.ValueSetReference
	 * @generated
	 */
	public Adapter createValueSetReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.cts2.core.VersionTagReference <em>Version Tag Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.cts2.core.VersionTagReference
	 * @generated
	 */
	public Adapter createVersionTagReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // CoreAdapterFactory
