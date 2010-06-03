/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.hl7.mif2.*;
import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package
 * @generated
 */
public class Mif2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Mif2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mif2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Mif2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mif2Switch<Adapter> modelSwitch =
		new Mif2Switch<Adapter>() {
			@Override
			public Adapter caseAddElementContent(AddElementContent object) {
				return createAddElementContentAdapter();
			}
			@Override
			public Adapter caseAnnotationBase(AnnotationBase object) {
				return createAnnotationBaseAdapter();
			}
			@Override
			public Adapter caseAnnotationCascadeInfo(AnnotationCascadeInfo object) {
				return createAnnotationCascadeInfoAdapter();
			}
			@Override
			public Adapter caseAnnotationDerivation(AnnotationDerivation object) {
				return createAnnotationDerivationAdapter();
			}
			@Override
			public Adapter caseAnnotations(Annotations object) {
				return createAnnotationsAdapter();
			}
			@Override
			public Adapter caseAppendix(Appendix object) {
				return createAppendixAdapter();
			}
			@Override
			public Adapter caseAppInfo(AppInfo object) {
				return createAppInfoAdapter();
			}
			@Override
			public Adapter caseApplicationRole(ApplicationRole object) {
				return createApplicationRoleAdapter();
			}
			@Override
			public Adapter caseApplicationRoleAnnotations(ApplicationRoleAnnotations object) {
				return createApplicationRoleAnnotationsAdapter();
			}
			@Override
			public Adapter caseApplicationRoleAppInfo(ApplicationRoleAppInfo object) {
				return createApplicationRoleAppInfoAdapter();
			}
			@Override
			public Adapter caseApplicationRoleDocumentation(ApplicationRoleDocumentation object) {
				return createApplicationRoleDocumentationAdapter();
			}
			@Override
			public Adapter caseAppliedTemplateGroup(AppliedTemplateGroup object) {
				return createAppliedTemplateGroupAdapter();
			}
			@Override
			public Adapter caseApprovalInfo(ApprovalInfo object) {
				return createApprovalInfoAdapter();
			}
			@Override
			public Adapter caseArtifactCrossReference(ArtifactCrossReference object) {
				return createArtifactCrossReferenceAdapter();
			}
			@Override
			public Adapter caseArtifactDependency(ArtifactDependency object) {
				return createArtifactDependencyAdapter();
			}
			@Override
			public Adapter caseArtifactSupplement(ArtifactSupplement object) {
				return createArtifactSupplementAdapter();
			}
			@Override
			public Adapter caseArtifactSupplementAnnotations(ArtifactSupplementAnnotations object) {
				return createArtifactSupplementAnnotationsAdapter();
			}
			@Override
			public Adapter caseArtifactSupplementAppInfo(ArtifactSupplementAppInfo object) {
				return createArtifactSupplementAppInfoAdapter();
			}
			@Override
			public Adapter caseArtifactSupplementDocumentation(ArtifactSupplementDocumentation object) {
				return createArtifactSupplementDocumentationAdapter();
			}
			@Override
			public Adapter caseArtifactXRefSummary(ArtifactXRefSummary object) {
				return createArtifactXRefSummaryAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseAssociationAnnotations(AssociationAnnotations object) {
				return createAssociationAnnotationsAdapter();
			}
			@Override
			public Adapter caseAssociationAppInfo(AssociationAppInfo object) {
				return createAssociationAppInfoAdapter();
			}
			@Override
			public Adapter caseAssociationBase(AssociationBase object) {
				return createAssociationBaseAdapter();
			}
			@Override
			public Adapter caseAssociationDocumentation(AssociationDocumentation object) {
				return createAssociationDocumentationAdapter();
			}
			@Override
			public Adapter caseAssociationEnd(AssociationEnd object) {
				return createAssociationEndAdapter();
			}
			@Override
			public Adapter caseAssociationEndAnnotations(AssociationEndAnnotations object) {
				return createAssociationEndAnnotationsAdapter();
			}
			@Override
			public Adapter caseAssociationEndAppInfo(AssociationEndAppInfo object) {
				return createAssociationEndAppInfoAdapter();
			}
			@Override
			public Adapter caseAssociationEndBase(AssociationEndBase object) {
				return createAssociationEndBaseAdapter();
			}
			@Override
			public Adapter caseAssociationEndDerivation(AssociationEndDerivation object) {
				return createAssociationEndDerivationAdapter();
			}
			@Override
			public Adapter caseAssociationEndDocumentation(AssociationEndDocumentation object) {
				return createAssociationEndDocumentationAdapter();
			}
			@Override
			public Adapter caseAssociationEndSpecialization(AssociationEndSpecialization object) {
				return createAssociationEndSpecializationAdapter();
			}
			@Override
			public Adapter caseAssociationEndWithClass(AssociationEndWithClass object) {
				return createAssociationEndWithClassAdapter();
			}
			@Override
			public Adapter caseAssociationEndWithClassRef(AssociationEndWithClassRef object) {
				return createAssociationEndWithClassRefAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAttributeAnnotations(AttributeAnnotations object) {
				return createAttributeAnnotationsAdapter();
			}
			@Override
			public Adapter caseAttributeAppInfo(AttributeAppInfo object) {
				return createAttributeAppInfoAdapter();
			}
			@Override
			public Adapter caseAttributeContent(AttributeContent object) {
				return createAttributeContentAdapter();
			}
			@Override
			public Adapter caseAttributeDerivation(AttributeDerivation object) {
				return createAttributeDerivationAdapter();
			}
			@Override
			public Adapter caseAttributeDocumentation(AttributeDocumentation object) {
				return createAttributeDocumentationAdapter();
			}
			@Override
			public Adapter caseAttributeProperty(AttributeProperty object) {
				return createAttributePropertyAdapter();
			}
			@Override
			public Adapter caseAttributeRef(AttributeRef object) {
				return createAttributeRefAdapter();
			}
			@Override
			public Adapter caseAttributeValueRef(AttributeValueRef object) {
				return createAttributeValueRefAdapter();
			}
			@Override
			public Adapter caseBallotComment(BallotComment object) {
				return createBallotCommentAdapter();
			}
			@Override
			public Adapter caseBallotCommentResolution(BallotCommentResolution object) {
				return createBallotCommentResolutionAdapter();
			}
			@Override
			public Adapter caseBallotSubmission(BallotSubmission object) {
				return createBallotSubmissionAdapter();
			}
			@Override
			public Adapter caseBasicAnnotation(BasicAnnotation object) {
				return createBasicAnnotationAdapter();
			}
			@Override
			public Adapter caseBindingRealm(BindingRealm object) {
				return createBindingRealmAdapter();
			}
			@Override
			public Adapter caseBoundStaticModel(BoundStaticModel object) {
				return createBoundStaticModelAdapter();
			}
			@Override
			public Adapter caseBusinessName(BusinessName object) {
				return createBusinessNameAdapter();
			}
			@Override
			public Adapter caseCascadableAnnotation(CascadableAnnotation object) {
				return createCascadableAnnotationAdapter();
			}
			@Override
			public Adapter caseChange(Change object) {
				return createChangeAdapter();
			}
			@Override
			public Adapter caseChangeRequest(ChangeRequest object) {
				return createChangeRequestAdapter();
			}
			@Override
			public Adapter caseChangeRequestEstimate(ChangeRequestEstimate object) {
				return createChangeRequestEstimateAdapter();
			}
			@Override
			public Adapter caseClassAnnotations(ClassAnnotations object) {
				return createClassAnnotationsAdapter();
			}
			@Override
			public Adapter caseClassAppInfo(ClassAppInfo object) {
				return createClassAppInfoAdapter();
			}
			@Override
			public Adapter caseClassBase(ClassBase object) {
				return createClassBaseAdapter();
			}
			@Override
			public Adapter caseClassBindingArgument(ClassBindingArgument object) {
				return createClassBindingArgumentAdapter();
			}
			@Override
			public Adapter caseClassBindingArgumentBase(ClassBindingArgumentBase object) {
				return createClassBindingArgumentBaseAdapter();
			}
			@Override
			public Adapter caseClassDerivation(ClassDerivation object) {
				return createClassDerivationAdapter();
			}
			@Override
			public Adapter caseClassDocumentation(ClassDocumentation object) {
				return createClassDocumentationAdapter();
			}
			@Override
			public Adapter caseClassElement(ClassElement object) {
				return createClassElementAdapter();
			}
			@Override
			public Adapter caseClassGeneralization(ClassGeneralization object) {
				return createClassGeneralizationAdapter();
			}
			@Override
			public Adapter caseClassGeneralizationBase(ClassGeneralizationBase object) {
				return createClassGeneralizationBaseAdapter();
			}
			@Override
			public Adapter caseClassGraphicInformation(ClassGraphicInformation object) {
				return createClassGraphicInformationAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseClassifierBase(ClassifierBase object) {
				return createClassifierBaseAdapter();
			}
			@Override
			public Adapter caseClassOrReference(ClassOrReference object) {
				return createClassOrReferenceAdapter();
			}
			@Override
			public Adapter caseClassRef(ClassRef object) {
				return createClassRefAdapter();
			}
			@Override
			public Adapter caseClassStubInterface(ClassStubInterface object) {
				return createClassStubInterfaceAdapter();
			}
			@Override
			public Adapter caseClassStubInterfaceAnnotations(ClassStubInterfaceAnnotations object) {
				return createClassStubInterfaceAnnotationsAdapter();
			}
			@Override
			public Adapter caseClassStubInterfaceAppInfo(ClassStubInterfaceAppInfo object) {
				return createClassStubInterfaceAppInfoAdapter();
			}
			@Override
			public Adapter caseClassStubInterfaceDocumentation(ClassStubInterfaceDocumentation object) {
				return createClassStubInterfaceDocumentationAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseCodeBasedContentDefinition(CodeBasedContentDefinition object) {
				return createCodeBasedContentDefinitionAdapter();
			}
			@Override
			public Adapter caseCodeFilterContentDefinition(CodeFilterContentDefinition object) {
				return createCodeFilterContentDefinitionAdapter();
			}
			@Override
			public Adapter caseCodeIcon(CodeIcon object) {
				return createCodeIconAdapter();
			}
			@Override
			public Adapter caseCodeSupplement(CodeSupplement object) {
				return createCodeSupplementAdapter();
			}
			@Override
			public Adapter caseCodeSystem(CodeSystem object) {
				return createCodeSystemAdapter();
			}
			@Override
			public Adapter caseCodeSystemAnnotations(CodeSystemAnnotations object) {
				return createCodeSystemAnnotationsAdapter();
			}
			@Override
			public Adapter caseCodeSystemAppInfo(CodeSystemAppInfo object) {
				return createCodeSystemAppInfoAdapter();
			}
			@Override
			public Adapter caseCodeSystemBase(CodeSystemBase object) {
				return createCodeSystemBaseAdapter();
			}
			@Override
			public Adapter caseCodeSystemDocumentation(CodeSystemDocumentation object) {
				return createCodeSystemDocumentationAdapter();
			}
			@Override
			public Adapter caseCodeSystemRef(CodeSystemRef object) {
				return createCodeSystemRefAdapter();
			}
			@Override
			public Adapter caseCodeSystemSupplement(CodeSystemSupplement object) {
				return createCodeSystemSupplementAdapter();
			}
			@Override
			public Adapter caseCodeSystemVersion(CodeSystemVersion object) {
				return createCodeSystemVersionAdapter();
			}
			@Override
			public Adapter caseCodeSystemVersionAnnotations(CodeSystemVersionAnnotations object) {
				return createCodeSystemVersionAnnotationsAdapter();
			}
			@Override
			public Adapter caseCodeSystemVersionAppInfo(CodeSystemVersionAppInfo object) {
				return createCodeSystemVersionAppInfoAdapter();
			}
			@Override
			public Adapter caseCodeSystemVersionBase(CodeSystemVersionBase object) {
				return createCodeSystemVersionBaseAdapter();
			}
			@Override
			public Adapter caseCodeSystemVersionDocumentation(CodeSystemVersionDocumentation object) {
				return createCodeSystemVersionDocumentationAdapter();
			}
			@Override
			public Adapter caseCodeSystemVersionSupplement(CodeSystemVersionSupplement object) {
				return createCodeSystemVersionSupplementAdapter();
			}
			@Override
			public Adapter caseCodeTranslation(CodeTranslation object) {
				return createCodeTranslationAdapter();
			}
			@Override
			public Adapter caseCodeTranslationAnnotations(CodeTranslationAnnotations object) {
				return createCodeTranslationAnnotationsAdapter();
			}
			@Override
			public Adapter caseCodeTranslationAppInfo(CodeTranslationAppInfo object) {
				return createCodeTranslationAppInfoAdapter();
			}
			@Override
			public Adapter caseCodeTranslationCollection(CodeTranslationCollection object) {
				return createCodeTranslationCollectionAdapter();
			}
			@Override
			public Adapter caseCodeTranslationCollectionAnnotations(CodeTranslationCollectionAnnotations object) {
				return createCodeTranslationCollectionAnnotationsAdapter();
			}
			@Override
			public Adapter caseCodeTranslationCollectionAppInfo(CodeTranslationCollectionAppInfo object) {
				return createCodeTranslationCollectionAppInfoAdapter();
			}
			@Override
			public Adapter caseCodeTranslationCollectionDocumentation(CodeTranslationCollectionDocumentation object) {
				return createCodeTranslationCollectionDocumentationAdapter();
			}
			@Override
			public Adapter caseCodeTranslationDocumentation(CodeTranslationDocumentation object) {
				return createCodeTranslationDocumentationAdapter();
			}
			@Override
			public Adapter caseCombinedContentDefinition(CombinedContentDefinition object) {
				return createCombinedContentDefinitionAdapter();
			}
			@Override
			public Adapter caseCommitteeReference(CommitteeReference object) {
				return createCommitteeReferenceAdapter();
			}
			@Override
			public Adapter caseCommonModelElementDefinition(CommonModelElementDefinition object) {
				return createCommonModelElementDefinitionAdapter();
			}
			@Override
			public Adapter caseCommonModelElementRef(CommonModelElementRef object) {
				return createCommonModelElementRefAdapter();
			}
			@Override
			public Adapter caseCommonModelElementRefAnnotations(CommonModelElementRefAnnotations object) {
				return createCommonModelElementRefAnnotationsAdapter();
			}
			@Override
			public Adapter caseCommonModelElementRefAppInfo(CommonModelElementRefAppInfo object) {
				return createCommonModelElementRefAppInfoAdapter();
			}
			@Override
			public Adapter caseCommonModelElementRefBase(CommonModelElementRefBase object) {
				return createCommonModelElementRefBaseAdapter();
			}
			@Override
			public Adapter caseCommonModelElementRefDocumentation(CommonModelElementRefDocumentation object) {
				return createCommonModelElementRefDocumentationAdapter();
			}
			@Override
			public Adapter caseComplexMarkupWithLanguage(ComplexMarkupWithLanguage object) {
				return createComplexMarkupWithLanguageAdapter();
			}
			@Override
			public Adapter caseConcept(Concept object) {
				return createConceptAdapter();
			}
			@Override
			public Adapter caseConceptAnnotations(ConceptAnnotations object) {
				return createConceptAnnotationsAdapter();
			}
			@Override
			public Adapter caseConceptAppInfo(ConceptAppInfo object) {
				return createConceptAppInfoAdapter();
			}
			@Override
			public Adapter caseConceptBase(ConceptBase object) {
				return createConceptBaseAdapter();
			}
			@Override
			public Adapter caseConceptDocumentation(ConceptDocumentation object) {
				return createConceptDocumentationAdapter();
			}
			@Override
			public Adapter caseConceptDomain(ConceptDomain object) {
				return createConceptDomainAdapter();
			}
			@Override
			public Adapter caseConceptDomainAnnotations(ConceptDomainAnnotations object) {
				return createConceptDomainAnnotationsAdapter();
			}
			@Override
			public Adapter caseConceptDomainAppInfo(ConceptDomainAppInfo object) {
				return createConceptDomainAppInfoAdapter();
			}
			@Override
			public Adapter caseConceptDomainDocumentation(ConceptDomainDocumentation object) {
				return createConceptDomainDocumentationAdapter();
			}
			@Override
			public Adapter caseConceptDomainProperty(ConceptDomainProperty object) {
				return createConceptDomainPropertyAdapter();
			}
			@Override
			public Adapter caseConceptDomainRef(ConceptDomainRef object) {
				return createConceptDomainRefAdapter();
			}
			@Override
			public Adapter caseConceptProperty(ConceptProperty object) {
				return createConceptPropertyAdapter();
			}
			@Override
			public Adapter caseConceptPropertyRef(ConceptPropertyRef object) {
				return createConceptPropertyRefAdapter();
			}
			@Override
			public Adapter caseConceptRef(ConceptRef object) {
				return createConceptRefAdapter();
			}
			@Override
			public Adapter caseConceptRelationship(ConceptRelationship object) {
				return createConceptRelationshipAdapter();
			}
			@Override
			public Adapter caseConceptSupplement(ConceptSupplement object) {
				return createConceptSupplementAdapter();
			}
			@Override
			public Adapter caseConceptSupplementAnnotations(ConceptSupplementAnnotations object) {
				return createConceptSupplementAnnotationsAdapter();
			}
			@Override
			public Adapter caseConceptSupplementAppInfo(ConceptSupplementAppInfo object) {
				return createConceptSupplementAppInfoAdapter();
			}
			@Override
			public Adapter caseConceptSupplementDocumentation(ConceptSupplementDocumentation object) {
				return createConceptSupplementDocumentationAdapter();
			}
			@Override
			public Adapter caseConceptUse(ConceptUse object) {
				return createConceptUseAdapter();
			}
			@Override
			public Adapter caseConformanceProfile(ConformanceProfile object) {
				return createConformanceProfileAdapter();
			}
			@Override
			public Adapter caseConformanceProfileAnnotations(ConformanceProfileAnnotations object) {
				return createConformanceProfileAnnotationsAdapter();
			}
			@Override
			public Adapter caseConformanceProfileAppInfo(ConformanceProfileAppInfo object) {
				return createConformanceProfileAppInfoAdapter();
			}
			@Override
			public Adapter caseConformanceProfileDocumentation(ConformanceProfileDocumentation object) {
				return createConformanceProfileDocumentationAdapter();
			}
			@Override
			public Adapter caseConformanceTriggerEvents(ConformanceTriggerEvents object) {
				return createConformanceTriggerEventsAdapter();
			}
			@Override
			public Adapter caseContainedGraphNode(ContainedGraphNode object) {
				return createContainedGraphNodeAdapter();
			}
			@Override
			public Adapter caseContentDefinition(ContentDefinition object) {
				return createContentDefinitionAdapter();
			}
			@Override
			public Adapter caseContentDefinitionAnnotations(ContentDefinitionAnnotations object) {
				return createContentDefinitionAnnotationsAdapter();
			}
			@Override
			public Adapter caseContentDefinitionAppInfo(ContentDefinitionAppInfo object) {
				return createContentDefinitionAppInfoAdapter();
			}
			@Override
			public Adapter caseContentDefinitionDocumentation(ContentDefinitionDocumentation object) {
				return createContentDefinitionDocumentationAdapter();
			}
			@Override
			public Adapter caseContextAnnotation(ContextAnnotation object) {
				return createContextAnnotationAdapter();
			}
			@Override
			public Adapter caseContextBinding(ContextBinding object) {
				return createContextBindingAdapter();
			}
			@Override
			public Adapter caseContributor(Contributor object) {
				return createContributorAdapter();
			}
			@Override
			public Adapter caseDatatype(Datatype object) {
				return createDatatypeAdapter();
			}
			@Override
			public Adapter caseDatatypeAnnotations(DatatypeAnnotations object) {
				return createDatatypeAnnotationsAdapter();
			}
			@Override
			public Adapter caseDatatypeAppInfo(DatatypeAppInfo object) {
				return createDatatypeAppInfoAdapter();
			}
			@Override
			public Adapter caseDatatypeBinding(DatatypeBinding object) {
				return createDatatypeBindingAdapter();
			}
			@Override
			public Adapter caseDatatypeDerivation(DatatypeDerivation object) {
				return createDatatypeDerivationAdapter();
			}
			@Override
			public Adapter caseDatatypeDocumentation(DatatypeDocumentation object) {
				return createDatatypeDocumentationAdapter();
			}
			@Override
			public Adapter caseDatatypeImport(DatatypeImport object) {
				return createDatatypeImportAdapter();
			}
			@Override
			public Adapter caseDatatypeLimitation(DatatypeLimitation object) {
				return createDatatypeLimitationAdapter();
			}
			@Override
			public Adapter caseDatatypeModelLibrary(DatatypeModelLibrary object) {
				return createDatatypeModelLibraryAdapter();
			}
			@Override
			public Adapter caseDatatypeOperation(DatatypeOperation object) {
				return createDatatypeOperationAdapter();
			}
			@Override
			public Adapter caseDatatypeParameter(DatatypeParameter object) {
				return createDatatypeParameterAdapter();
			}
			@Override
			public Adapter caseDatatypeRef(DatatypeRef object) {
				return createDatatypeRefAdapter();
			}
			@Override
			public Adapter caseDatatypeTemplateParameter(DatatypeTemplateParameter object) {
				return createDatatypeTemplateParameterAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseDeprecationInfo(DeprecationInfo object) {
				return createDeprecationInfoAdapter();
			}
			@Override
			public Adapter caseDerivation(Derivation object) {
				return createDerivationAdapter();
			}
			@Override
			public Adapter caseDerivedStaticModel(DerivedStaticModel object) {
				return createDerivedStaticModelAdapter();
			}
			@Override
			public Adapter caseDerivedStaticModelsType(DerivedStaticModelsType object) {
				return createDerivedStaticModelsTypeAdapter();
			}
			@Override
			public Adapter caseDesignComment(DesignComment object) {
				return createDesignCommentAdapter();
			}
			@Override
			public Adapter caseDiagram(Diagram object) {
				return createDiagramAdapter();
			}
			@Override
			public Adapter caseDiagramElement(DiagramElement object) {
				return createDiagramElementAdapter();
			}
			@Override
			public Adapter caseDiagramGraphicInformation(DiagramGraphicInformation object) {
				return createDiagramGraphicInformationAdapter();
			}
			@Override
			public Adapter caseDimension(Dimension object) {
				return createDimensionAdapter();
			}
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
			}
			@Override
			public Adapter caseDocumentProfile(DocumentProfile object) {
				return createDocumentProfileAdapter();
			}
			@Override
			public Adapter caseDocumentProfileAnnotations(DocumentProfileAnnotations object) {
				return createDocumentProfileAnnotationsAdapter();
			}
			@Override
			public Adapter caseDocumentProfileAppInfo(DocumentProfileAppInfo object) {
				return createDocumentProfileAppInfoAdapter();
			}
			@Override
			public Adapter caseDocumentProfileDocumentation(DocumentProfileDocumentation object) {
				return createDocumentProfileDocumentationAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDocumentTest(DocumentTest object) {
				return createDocumentTestAdapter();
			}
			@Override
			public Adapter caseDomainAnalysisModel(DomainAnalysisModel object) {
				return createDomainAnalysisModelAdapter();
			}
			@Override
			public Adapter caseDomainAnalysisModelAnnotations(DomainAnalysisModelAnnotations object) {
				return createDomainAnalysisModelAnnotationsAdapter();
			}
			@Override
			public Adapter caseDomainAnalysisModelAppInfo(DomainAnalysisModelAppInfo object) {
				return createDomainAnalysisModelAppInfoAdapter();
			}
			@Override
			public Adapter caseDomainAnalysisModelDocumentation(DomainAnalysisModelDocumentation object) {
				return createDomainAnalysisModelDocumentationAdapter();
			}
			@Override
			public Adapter caseDomainInstanceExample(DomainInstanceExample object) {
				return createDomainInstanceExampleAdapter();
			}
			@Override
			public Adapter caseDomainInstanceExampleAnnotations(DomainInstanceExampleAnnotations object) {
				return createDomainInstanceExampleAnnotationsAdapter();
			}
			@Override
			public Adapter caseDomainInstanceExampleAppInfo(DomainInstanceExampleAppInfo object) {
				return createDomainInstanceExampleAppInfoAdapter();
			}
			@Override
			public Adapter caseDomainInstanceExampleDocumentation(DomainInstanceExampleDocumentation object) {
				return createDomainInstanceExampleDocumentationAdapter();
			}
			@Override
			public Adapter caseElementChange(ElementChange object) {
				return createElementChangeAdapter();
			}
			@Override
			public Adapter caseElementDerivation(ElementDerivation object) {
				return createElementDerivationAdapter();
			}
			@Override
			public Adapter caseElementRef(ElementRef object) {
				return createElementRefAdapter();
			}
			@Override
			public Adapter caseElementValueRef(ElementValueRef object) {
				return createElementValueRefAdapter();
			}
			@Override
			public Adapter caseEntryPoint(EntryPoint object) {
				return createEntryPointAdapter();
			}
			@Override
			public Adapter caseEntryPointAnnotations(EntryPointAnnotations object) {
				return createEntryPointAnnotationsAdapter();
			}
			@Override
			public Adapter caseEntryPointAppInfo(EntryPointAppInfo object) {
				return createEntryPointAppInfoAdapter();
			}
			@Override
			public Adapter caseEntryPointBase(EntryPointBase object) {
				return createEntryPointBaseAdapter();
			}
			@Override
			public Adapter caseEntryPointDocumentation(EntryPointDocumentation object) {
				return createEntryPointDocumentationAdapter();
			}
			@Override
			public Adapter caseEnvironmentalOccurrence(EnvironmentalOccurrence object) {
				return createEnvironmentalOccurrenceAdapter();
			}
			@Override
			public Adapter caseExampleInteraction(ExampleInteraction object) {
				return createExampleInteractionAdapter();
			}
			@Override
			public Adapter caseExampleSystem(ExampleSystem object) {
				return createExampleSystemAdapter();
			}
			@Override
			public Adapter caseExampleType(ExampleType object) {
				return createExampleTypeAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseFlatClass(FlatClass object) {
				return createFlatClassAdapter();
			}
			@Override
			public Adapter caseFormalConstraint(FormalConstraint object) {
				return createFormalConstraintAdapter();
			}
			@Override
			public Adapter caseFormalExpression(FormalExpression object) {
				return createFormalExpressionAdapter();
			}
			@Override
			public Adapter caseFreeFormMarkupWithLanguage(FreeFormMarkupWithLanguage object) {
				return createFreeFormMarkupWithLanguageAdapter();
			}
			@Override
			public Adapter caseFreehandDocument(FreehandDocument object) {
				return createFreehandDocumentAdapter();
			}
			@Override
			public Adapter caseFreehandDocumentAnnotations(FreehandDocumentAnnotations object) {
				return createFreehandDocumentAnnotationsAdapter();
			}
			@Override
			public Adapter caseFreehandDocumentAppInfo(FreehandDocumentAppInfo object) {
				return createFreehandDocumentAppInfoAdapter();
			}
			@Override
			public Adapter caseFreehandDocumentDocumentation(FreehandDocumentDocumentation object) {
				return createFreehandDocumentDocumentationAdapter();
			}
			@Override
			public Adapter caseGeneralizationAnnotations(GeneralizationAnnotations object) {
				return createGeneralizationAnnotationsAdapter();
			}
			@Override
			public Adapter caseGeneralizationAppInfo(GeneralizationAppInfo object) {
				return createGeneralizationAppInfoAdapter();
			}
			@Override
			public Adapter caseGeneralizationDocumentation(GeneralizationDocumentation object) {
				return createGeneralizationDocumentationAdapter();
			}
			@Override
			public Adapter caseGenericPackage(GenericPackage object) {
				return createGenericPackageAdapter();
			}
			@Override
			public Adapter caseGlobalApplicationRole(GlobalApplicationRole object) {
				return createGlobalApplicationRoleAdapter();
			}
			@Override
			public Adapter caseGlobalArtifactXRefSummary(GlobalArtifactXRefSummary object) {
				return createGlobalArtifactXRefSummaryAdapter();
			}
			@Override
			public Adapter caseGlobalCodeSystem(GlobalCodeSystem object) {
				return createGlobalCodeSystemAdapter();
			}
			@Override
			public Adapter caseGlobalCodeSystemSupplement(GlobalCodeSystemSupplement object) {
				return createGlobalCodeSystemSupplementAdapter();
			}
			@Override
			public Adapter caseGlobalConformanceProfile(GlobalConformanceProfile object) {
				return createGlobalConformanceProfileAdapter();
			}
			@Override
			public Adapter caseGlobalDatatypeModelLibrary(GlobalDatatypeModelLibrary object) {
				return createGlobalDatatypeModelLibraryAdapter();
			}
			@Override
			public Adapter caseGlobalDerivedStaticModel(GlobalDerivedStaticModel object) {
				return createGlobalDerivedStaticModelAdapter();
			}
			@Override
			public Adapter caseGlobalDomainAnalysisModel(GlobalDomainAnalysisModel object) {
				return createGlobalDomainAnalysisModelAdapter();
			}
			@Override
			public Adapter caseGlobalDomainInstanceExample(GlobalDomainInstanceExample object) {
				return createGlobalDomainInstanceExampleAdapter();
			}
			@Override
			public Adapter caseGlobalFreehandDocument(GlobalFreehandDocument object) {
				return createGlobalFreehandDocumentAdapter();
			}
			@Override
			public Adapter caseGlobalGenericPackage(GlobalGenericPackage object) {
				return createGlobalGenericPackageAdapter();
			}
			@Override
			public Adapter caseGlobalGlossary(GlobalGlossary object) {
				return createGlobalGlossaryAdapter();
			}
			@Override
			public Adapter caseGlobalInteraction(GlobalInteraction object) {
				return createGlobalInteractionAdapter();
			}
			@Override
			public Adapter caseGlobalInteractionProfile(GlobalInteractionProfile object) {
				return createGlobalInteractionProfileAdapter();
			}
			@Override
			public Adapter caseGlobalMifChanges(GlobalMifChanges object) {
				return createGlobalMifChangesAdapter();
			}
			@Override
			public Adapter caseGlobalPublicationPackage(GlobalPublicationPackage object) {
				return createGlobalPublicationPackageAdapter();
			}
			@Override
			public Adapter caseGlobalSerializedStaticModel(GlobalSerializedStaticModel object) {
				return createGlobalSerializedStaticModelAdapter();
			}
			@Override
			public Adapter caseGlobalStaticModel(GlobalStaticModel object) {
				return createGlobalStaticModelAdapter();
			}
			@Override
			public Adapter caseGlobalStaticModelInterfacePackage(GlobalStaticModelInterfacePackage object) {
				return createGlobalStaticModelInterfacePackageAdapter();
			}
			@Override
			public Adapter caseGlobalStoryboard(GlobalStoryboard object) {
				return createGlobalStoryboardAdapter();
			}
			@Override
			public Adapter caseGlobalStructuredDocument(GlobalStructuredDocument object) {
				return createGlobalStructuredDocumentAdapter();
			}
			@Override
			public Adapter caseGlobalTestScenario(GlobalTestScenario object) {
				return createGlobalTestScenarioAdapter();
			}
			@Override
			public Adapter caseGlobalTriggerEvent(GlobalTriggerEvent object) {
				return createGlobalTriggerEventAdapter();
			}
			@Override
			public Adapter caseGlobalValueSet(GlobalValueSet object) {
				return createGlobalValueSetAdapter();
			}
			@Override
			public Adapter caseGlobalVocabularyModel(GlobalVocabularyModel object) {
				return createGlobalVocabularyModelAdapter();
			}
			@Override
			public Adapter caseGlossary(Glossary object) {
				return createGlossaryAdapter();
			}
			@Override
			public Adapter caseGraphConnector(GraphConnector object) {
				return createGraphConnectorAdapter();
			}
			@Override
			public Adapter caseGraphConnectorWithEdge(GraphConnectorWithEdge object) {
				return createGraphConnectorWithEdgeAdapter();
			}
			@Override
			public Adapter caseGraphEdge(GraphEdge object) {
				return createGraphEdgeAdapter();
			}
			@Override
			public Adapter caseGraphEdgeGraphicInformation(GraphEdgeGraphicInformation object) {
				return createGraphEdgeGraphicInformationAdapter();
			}
			@Override
			public Adapter caseGraphEdgeWithAnchor(GraphEdgeWithAnchor object) {
				return createGraphEdgeWithAnchorAdapter();
			}
			@Override
			public Adapter caseGraphElement(GraphElement object) {
				return createGraphElementAdapter();
			}
			@Override
			public Adapter caseGraphicInformation(GraphicInformation object) {
				return createGraphicInformationAdapter();
			}
			@Override
			public Adapter caseGraphNode(GraphNode object) {
				return createGraphNodeAdapter();
			}
			@Override
			public Adapter caseGraphNodeWithOptionalConnection(GraphNodeWithOptionalConnection object) {
				return createGraphNodeWithOptionalConnectionAdapter();
			}
			@Override
			public Adapter caseGroupChange(GroupChange object) {
				return createGroupChangeAdapter();
			}
			@Override
			public Adapter caseGroupVote(GroupVote object) {
				return createGroupVoteAdapter();
			}
			@Override
			public Adapter caseHeader(Header object) {
				return createHeaderAdapter();
			}
			@Override
			public Adapter caseHistoryItem(HistoryItem object) {
				return createHistoryItemAdapter();
			}
			@Override
			public Adapter caseImplementationConstraints(ImplementationConstraints object) {
				return createImplementationConstraintsAdapter();
			}
			@Override
			public Adapter caseImplementationMessageConstraints(ImplementationMessageConstraints object) {
				return createImplementationMessageConstraintsAdapter();
			}
			@Override
			public Adapter caseImportDatatypeModelLibrary(ImportDatatypeModelLibrary object) {
				return createImportDatatypeModelLibraryAdapter();
			}
			@Override
			public Adapter caseIncludeRelatedCodes(IncludeRelatedCodes object) {
				return createIncludeRelatedCodesAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object) {
				return createInteractionAdapter();
			}
			@Override
			public Adapter caseInteractionAnnotations(InteractionAnnotations object) {
				return createInteractionAnnotationsAdapter();
			}
			@Override
			public Adapter caseInteractionAppInfo(InteractionAppInfo object) {
				return createInteractionAppInfoAdapter();
			}
			@Override
			public Adapter caseInteractionDocumentation(InteractionDocumentation object) {
				return createInteractionDocumentationAdapter();
			}
			@Override
			public Adapter caseInteractionProfile(InteractionProfile object) {
				return createInteractionProfileAdapter();
			}
			@Override
			public Adapter caseInteractionProfileAnnotations(InteractionProfileAnnotations object) {
				return createInteractionProfileAnnotationsAdapter();
			}
			@Override
			public Adapter caseInteractionProfileAppInfo(InteractionProfileAppInfo object) {
				return createInteractionProfileAppInfoAdapter();
			}
			@Override
			public Adapter caseInteractionProfileDocumentation(InteractionProfileDocumentation object) {
				return createInteractionProfileDocumentationAdapter();
			}
			@Override
			public Adapter caseInteractionTest(InteractionTest object) {
				return createInteractionTestAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseItemFilter(ItemFilter object) {
				return createItemFilterAdapter();
			}
			@Override
			public Adapter caseKeyedName(KeyedName object) {
				return createKeyedNameAdapter();
			}
			@Override
			public Adapter caseLegalese(Legalese object) {
				return createLegaleseAdapter();
			}
			@Override
			public Adapter caseLocalClassRef(LocalClassRef object) {
				return createLocalClassRefAdapter();
			}
			@Override
			public Adapter caseLocalClassReference(LocalClassReference object) {
				return createLocalClassReferenceAdapter();
			}
			@Override
			public Adapter caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			@Override
			public Adapter caseMifChanges(MifChanges object) {
				return createMifChangesAdapter();
			}
			@Override
			public Adapter caseMifContent(MifContent object) {
				return createMifContentAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseNodeGraphicInformation(NodeGraphicInformation object) {
				return createNodeGraphicInformationAdapter();
			}
			@Override
			public Adapter caseNodeWithConnectionGraphicInformation(NodeWithConnectionGraphicInformation object) {
				return createNodeWithConnectionGraphicInformationAdapter();
			}
			@Override
			public Adapter caseNonComputableContentDefinition(NonComputableContentDefinition object) {
				return createNonComputableContentDefinitionAdapter();
			}
			@Override
			public Adapter caseNonTraversableAssociationEnd(NonTraversableAssociationEnd object) {
				return createNonTraversableAssociationEndAdapter();
			}
			@Override
			public Adapter caseOpenIssue(OpenIssue object) {
				return createOpenIssueAdapter();
			}
			@Override
			public Adapter caseOperationAnnotations(OperationAnnotations object) {
				return createOperationAnnotationsAdapter();
			}
			@Override
			public Adapter caseOperationAppInfo(OperationAppInfo object) {
				return createOperationAppInfoAdapter();
			}
			@Override
			public Adapter caseOperationDerivation(OperationDerivation object) {
				return createOperationDerivationAdapter();
			}
			@Override
			public Adapter caseOperationDocumentation(OperationDocumentation object) {
				return createOperationDocumentationAdapter();
			}
			@Override
			public Adapter caseOperationParameter(OperationParameter object) {
				return createOperationParameterAdapter();
			}
			@Override
			public Adapter caseOtherAnnotation(OtherAnnotation object) {
				return createOtherAnnotationAdapter();
			}
			@Override
			public Adapter casePackage(org.openhealthtools.mdht.emf.hl7.mif2.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter casePackageAnnotations(PackageAnnotations object) {
				return createPackageAnnotationsAdapter();
			}
			@Override
			public Adapter casePackageAppInfo(PackageAppInfo object) {
				return createPackageAppInfoAdapter();
			}
			@Override
			public Adapter casePackageArtifact(PackageArtifact object) {
				return createPackageArtifactAdapter();
			}
			@Override
			public Adapter casePackageBase(PackageBase object) {
				return createPackageBaseAdapter();
			}
			@Override
			public Adapter casePackageContent(PackageContent object) {
				return createPackageContentAdapter();
			}
			@Override
			public Adapter casePackageDefId(PackageDefId object) {
				return createPackageDefIdAdapter();
			}
			@Override
			public Adapter casePackageDerivation(PackageDerivation object) {
				return createPackageDerivationAdapter();
			}
			@Override
			public Adapter casePackageDocumentation(PackageDocumentation object) {
				return createPackageDocumentationAdapter();
			}
			@Override
			public Adapter casePackageOrArtifactRef(PackageOrArtifactRef object) {
				return createPackageOrArtifactRefAdapter();
			}
			@Override
			public Adapter casePackageRef(PackageRef object) {
				return createPackageRefAdapter();
			}
			@Override
			public Adapter caseParameterModel(ParameterModel object) {
				return createParameterModelAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter casePrintName(PrintName object) {
				return createPrintNameAdapter();
			}
			@Override
			public Adapter casePropertyBasedContentDefinition(PropertyBasedContentDefinition object) {
				return createPropertyBasedContentDefinitionAdapter();
			}
			@Override
			public Adapter casePropertyGroup(PropertyGroup object) {
				return createPropertyGroupAdapter();
			}
			@Override
			public Adapter casePublicationAnnotations(PublicationAnnotations object) {
				return createPublicationAnnotationsAdapter();
			}
			@Override
			public Adapter casePublicationAppInfo(PublicationAppInfo object) {
				return createPublicationAppInfoAdapter();
			}
			@Override
			public Adapter casePublicationBase(PublicationBase object) {
				return createPublicationBaseAdapter();
			}
			@Override
			public Adapter casePublicationDocumentation(PublicationDocumentation object) {
				return createPublicationDocumentationAdapter();
			}
			@Override
			public Adapter casePublicationGroup(PublicationGroup object) {
				return createPublicationGroupAdapter();
			}
			@Override
			public Adapter casePublicationItem(PublicationItem object) {
				return createPublicationItemAdapter();
			}
			@Override
			public Adapter casePublicationPackage(PublicationPackage object) {
				return createPublicationPackageAdapter();
			}
			@Override
			public Adapter caseRangeDefinition(RangeDefinition object) {
				return createRangeDefinitionAdapter();
			}
			@Override
			public Adapter caseRealmElement(RealmElement object) {
				return createRealmElementAdapter();
			}
			@Override
			public Adapter caseReceiverResponsibility(ReceiverResponsibility object) {
				return createReceiverResponsibilityAdapter();
			}
			@Override
			public Adapter caseRelatedAppRole(RelatedAppRole object) {
				return createRelatedAppRoleAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseRelationshipBasedContentDefinition(RelationshipBasedContentDefinition object) {
				return createRelationshipBasedContentDefinitionAdapter();
			}
			@Override
			public Adapter caseRelease(Release object) {
				return createReleaseAdapter();
			}
			@Override
			public Adapter caseReleaseList(ReleaseList object) {
				return createReleaseListAdapter();
			}
			@Override
			public Adapter caseRenderingInformation(RenderingInformation object) {
				return createRenderingInformationAdapter();
			}
			@Override
			public Adapter caseReplaceElementContent(ReplaceElementContent object) {
				return createReplaceElementContentAdapter();
			}
			@Override
			public Adapter caseResponsibleGroup(ResponsibleGroup object) {
				return createResponsibleGroupAdapter();
			}
			@Override
			public Adapter caseSerializedAssociationEnd(SerializedAssociationEnd object) {
				return createSerializedAssociationEndAdapter();
			}
			@Override
			public Adapter caseSerializedAssociationEnds(SerializedAssociationEnds object) {
				return createSerializedAssociationEndsAdapter();
			}
			@Override
			public Adapter caseSerializedClass(SerializedClass object) {
				return createSerializedClassAdapter();
			}
			@Override
			public Adapter caseSerializedClassBindingArgument(SerializedClassBindingArgument object) {
				return createSerializedClassBindingArgumentAdapter();
			}
			@Override
			public Adapter caseSerializedClasses(SerializedClasses object) {
				return createSerializedClassesAdapter();
			}
			@Override
			public Adapter caseSerializedClassGeneralization(SerializedClassGeneralization object) {
				return createSerializedClassGeneralizationAdapter();
			}
			@Override
			public Adapter caseSerializedCommonModelElementRef(SerializedCommonModelElementRef object) {
				return createSerializedCommonModelElementRefAdapter();
			}
			@Override
			public Adapter caseSerializedEntryPoint(SerializedEntryPoint object) {
				return createSerializedEntryPointAdapter();
			}
			@Override
			public Adapter caseSerializedStaticModel(SerializedStaticModel object) {
				return createSerializedStaticModelAdapter();
			}
			@Override
			public Adapter caseSerializedStaticModelsType(SerializedStaticModelsType object) {
				return createSerializedStaticModelsTypeAdapter();
			}
			@Override
			public Adapter caseSpecializationClass(SpecializationClass object) {
				return createSpecializationClassAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseStateAnnotations(StateAnnotations object) {
				return createStateAnnotationsAdapter();
			}
			@Override
			public Adapter caseStateAppInfo(StateAppInfo object) {
				return createStateAppInfoAdapter();
			}
			@Override
			public Adapter caseStateDerivation(StateDerivation object) {
				return createStateDerivationAdapter();
			}
			@Override
			public Adapter caseStateDocumentation(StateDocumentation object) {
				return createStateDocumentationAdapter();
			}
			@Override
			public Adapter caseStateMachine(StateMachine object) {
				return createStateMachineAdapter();
			}
			@Override
			public Adapter caseStateMachineAnnotations(StateMachineAnnotations object) {
				return createStateMachineAnnotationsAdapter();
			}
			@Override
			public Adapter caseStateMachineAppInfo(StateMachineAppInfo object) {
				return createStateMachineAppInfoAdapter();
			}
			@Override
			public Adapter caseStateMachineDocumentation(StateMachineDocumentation object) {
				return createStateMachineDocumentationAdapter();
			}
			@Override
			public Adapter caseStaticExample(StaticExample object) {
				return createStaticExampleAdapter();
			}
			@Override
			public Adapter caseStaticModel(StaticModel object) {
				return createStaticModelAdapter();
			}
			@Override
			public Adapter caseStaticModelAnnotations(StaticModelAnnotations object) {
				return createStaticModelAnnotationsAdapter();
			}
			@Override
			public Adapter caseStaticModelAppInfo(StaticModelAppInfo object) {
				return createStaticModelAppInfoAdapter();
			}
			@Override
			public Adapter caseStaticModelBase(StaticModelBase object) {
				return createStaticModelBaseAdapter();
			}
			@Override
			public Adapter caseStaticModelClassTemplateParameter(StaticModelClassTemplateParameter object) {
				return createStaticModelClassTemplateParameterAdapter();
			}
			@Override
			public Adapter caseStaticModelDerivation(StaticModelDerivation object) {
				return createStaticModelDerivationAdapter();
			}
			@Override
			public Adapter caseStaticModelDerivationSource(StaticModelDerivationSource object) {
				return createStaticModelDerivationSourceAdapter();
			}
			@Override
			public Adapter caseStaticModelDocumentation(StaticModelDocumentation object) {
				return createStaticModelDocumentationAdapter();
			}
			@Override
			public Adapter caseStaticModelInterfaceAnnotations(StaticModelInterfaceAnnotations object) {
				return createStaticModelInterfaceAnnotationsAdapter();
			}
			@Override
			public Adapter caseStaticModelInterfaceAppInfo(StaticModelInterfaceAppInfo object) {
				return createStaticModelInterfaceAppInfoAdapter();
			}
			@Override
			public Adapter caseStaticModelInterfaceDocumentation(StaticModelInterfaceDocumentation object) {
				return createStaticModelInterfaceDocumentationAdapter();
			}
			@Override
			public Adapter caseStaticModelInterfacePackage(StaticModelInterfacePackage object) {
				return createStaticModelInterfacePackageAdapter();
			}
			@Override
			public Adapter caseStaticModelRefBase(StaticModelRefBase object) {
				return createStaticModelRefBaseAdapter();
			}
			@Override
			public Adapter caseStaticModelsType(StaticModelsType object) {
				return createStaticModelsTypeAdapter();
			}
			@Override
			public Adapter caseStaticPackageDiagramGraphicInformation(StaticPackageDiagramGraphicInformation object) {
				return createStaticPackageDiagramGraphicInformationAdapter();
			}
			@Override
			public Adapter caseStoryboard(Storyboard object) {
				return createStoryboardAdapter();
			}
			@Override
			public Adapter caseStoryboardAnnotations(StoryboardAnnotations object) {
				return createStoryboardAnnotationsAdapter();
			}
			@Override
			public Adapter caseStoryboardAppInfo(StoryboardAppInfo object) {
				return createStoryboardAppInfoAdapter();
			}
			@Override
			public Adapter caseStoryboardArtifactReferences(StoryboardArtifactReferences object) {
				return createStoryboardArtifactReferencesAdapter();
			}
			@Override
			public Adapter caseStoryboardDocumentation(StoryboardDocumentation object) {
				return createStoryboardDocumentationAdapter();
			}
			@Override
			public Adapter caseStoryboardNarrative(StoryboardNarrative object) {
				return createStoryboardNarrativeAdapter();
			}
			@Override
			public Adapter caseStructuralFeature(StructuralFeature object) {
				return createStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseStructuredDocument(StructuredDocument object) {
				return createStructuredDocumentAdapter();
			}
			@Override
			public Adapter caseStructuredDocumentAnnotations(StructuredDocumentAnnotations object) {
				return createStructuredDocumentAnnotationsAdapter();
			}
			@Override
			public Adapter caseStructuredDocumentAppInfo(StructuredDocumentAppInfo object) {
				return createStructuredDocumentAppInfoAdapter();
			}
			@Override
			public Adapter caseStructuredDocumentDocumentation(StructuredDocumentDocumentation object) {
				return createStructuredDocumentDocumentationAdapter();
			}
			@Override
			public Adapter caseStubDefinition(StubDefinition object) {
				return createStubDefinitionAdapter();
			}
			@Override
			public Adapter caseSubjectAreaAnnotations(SubjectAreaAnnotations object) {
				return createSubjectAreaAnnotationsAdapter();
			}
			@Override
			public Adapter caseSubjectAreaAppInfo(SubjectAreaAppInfo object) {
				return createSubjectAreaAppInfoAdapter();
			}
			@Override
			public Adapter caseSubjectAreaDocumentation(SubjectAreaDocumentation object) {
				return createSubjectAreaDocumentationAdapter();
			}
			@Override
			public Adapter caseSubjectAreaPackage(SubjectAreaPackage object) {
				return createSubjectAreaPackageAdapter();
			}
			@Override
			public Adapter caseSubSystem(SubSystem object) {
				return createSubSystemAdapter();
			}
			@Override
			public Adapter caseSupportedConceptProperty(SupportedConceptProperty object) {
				return createSupportedConceptPropertyAdapter();
			}
			@Override
			public Adapter caseSupportedConceptRelationship(SupportedConceptRelationship object) {
				return createSupportedConceptRelationshipAdapter();
			}
			@Override
			public Adapter caseSupportedProperty(SupportedProperty object) {
				return createSupportedPropertyAdapter();
			}
			@Override
			public Adapter caseTermDefinition(TermDefinition object) {
				return createTermDefinitionAdapter();
			}
			@Override
			public Adapter caseTerminologyServer(TerminologyServer object) {
				return createTerminologyServerAdapter();
			}
			@Override
			public Adapter caseTest(Test object) {
				return createTestAdapter();
			}
			@Override
			public Adapter caseTestBase(TestBase object) {
				return createTestBaseAdapter();
			}
			@Override
			public Adapter caseTestScenario(TestScenario object) {
				return createTestScenarioAdapter();
			}
			@Override
			public Adapter caseTestSystem(TestSystem object) {
				return createTestSystemAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseTransitionAnnotations(TransitionAnnotations object) {
				return createTransitionAnnotationsAdapter();
			}
			@Override
			public Adapter caseTransitionAppInfo(TransitionAppInfo object) {
				return createTransitionAppInfoAdapter();
			}
			@Override
			public Adapter caseTransitionDerivation(TransitionDerivation object) {
				return createTransitionDerivationAdapter();
			}
			@Override
			public Adapter caseTransitionDocumentation(TransitionDocumentation object) {
				return createTransitionDocumentationAdapter();
			}
			@Override
			public Adapter caseTransitionRef(TransitionRef object) {
				return createTransitionRefAdapter();
			}
			@Override
			public Adapter caseTriggerEvent(TriggerEvent object) {
				return createTriggerEventAdapter();
			}
			@Override
			public Adapter caseTriggerEventAnnotations(TriggerEventAnnotations object) {
				return createTriggerEventAnnotationsAdapter();
			}
			@Override
			public Adapter caseTriggerEventAppInfo(TriggerEventAppInfo object) {
				return createTriggerEventAppInfoAdapter();
			}
			@Override
			public Adapter caseTriggerEventDocumentation(TriggerEventDocumentation object) {
				return createTriggerEventDocumentationAdapter();
			}
			@Override
			public Adapter caseValueSet(ValueSet object) {
				return createValueSetAdapter();
			}
			@Override
			public Adapter caseValueSetAnnotations(ValueSetAnnotations object) {
				return createValueSetAnnotationsAdapter();
			}
			@Override
			public Adapter caseValueSetAppInfo(ValueSetAppInfo object) {
				return createValueSetAppInfoAdapter();
			}
			@Override
			public Adapter caseValueSetDocumentation(ValueSetDocumentation object) {
				return createValueSetDocumentationAdapter();
			}
			@Override
			public Adapter caseValueSetSupplement(ValueSetSupplement object) {
				return createValueSetSupplementAdapter();
			}
			@Override
			public Adapter caseValueSetVersion(ValueSetVersion object) {
				return createValueSetVersionAdapter();
			}
			@Override
			public Adapter caseVariousMixedContent(VariousMixedContent object) {
				return createVariousMixedContentAdapter();
			}
			@Override
			public Adapter caseVertex(Vertex object) {
				return createVertexAdapter();
			}
			@Override
			public Adapter caseVocabularyCodeRef(VocabularyCodeRef object) {
				return createVocabularyCodeRefAdapter();
			}
			@Override
			public Adapter caseVocabularyCodeRefs(VocabularyCodeRefs object) {
				return createVocabularyCodeRefsAdapter();
			}
			@Override
			public Adapter caseVocabularyLimitation(VocabularyLimitation object) {
				return createVocabularyLimitationAdapter();
			}
			@Override
			public Adapter caseVocabularyModel(VocabularyModel object) {
				return createVocabularyModelAdapter();
			}
			@Override
			public Adapter caseVocabularyModelAnnotations(VocabularyModelAnnotations object) {
				return createVocabularyModelAnnotationsAdapter();
			}
			@Override
			public Adapter caseVocabularyModelAppInfo(VocabularyModelAppInfo object) {
				return createVocabularyModelAppInfoAdapter();
			}
			@Override
			public Adapter caseVocabularyModelDocumentation(VocabularyModelDocumentation object) {
				return createVocabularyModelDocumentationAdapter();
			}
			@Override
			public Adapter caseVocabularySpecification(VocabularySpecification object) {
				return createVocabularySpecificationAdapter();
			}
			@Override
			public Adapter caseVocabularyValueSetBinding(VocabularyValueSetBinding object) {
				return createVocabularyValueSetBindingAdapter();
			}
			@Override
			public Adapter caseVocabularyValueSetRef(VocabularyValueSetRef object) {
				return createVocabularyValueSetRefAdapter();
			}
			@Override
			public Adapter caseXMIContent(XMIContent object) {
				return createXMIContentAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
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
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent <em>Add Element Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AddElementContent
	 * @generated
	 */
	public Adapter createAddElementContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationBase <em>Annotation Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AnnotationBase
	 * @generated
	 */
	public Adapter createAnnotationBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo <em>Annotation Cascade Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AnnotationCascadeInfo
	 * @generated
	 */
	public Adapter createAnnotationCascadeInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AnnotationDerivation <em>Annotation Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AnnotationDerivation
	 * @generated
	 */
	public Adapter createAnnotationDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Annotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Annotations
	 * @generated
	 */
	public Adapter createAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Appendix <em>Appendix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Appendix
	 * @generated
	 */
	public Adapter createAppendixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AppInfo <em>App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AppInfo
	 * @generated
	 */
	public Adapter createAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRole <em>Application Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRole
	 * @generated
	 */
	public Adapter createApplicationRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRoleAnnotations <em>Application Role Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRoleAnnotations
	 * @generated
	 */
	public Adapter createApplicationRoleAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRoleAppInfo <em>Application Role App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRoleAppInfo
	 * @generated
	 */
	public Adapter createApplicationRoleAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRoleDocumentation <em>Application Role Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRoleDocumentation
	 * @generated
	 */
	public Adapter createApplicationRoleDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AppliedTemplateGroup <em>Applied Template Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AppliedTemplateGroup
	 * @generated
	 */
	public Adapter createAppliedTemplateGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo <em>Approval Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ApprovalInfo
	 * @generated
	 */
	public Adapter createApprovalInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactCrossReference <em>Artifact Cross Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ArtifactCrossReference
	 * @generated
	 */
	public Adapter createArtifactCrossReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactDependency <em>Artifact Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ArtifactDependency
	 * @generated
	 */
	public Adapter createArtifactDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplement <em>Artifact Supplement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplement
	 * @generated
	 */
	public Adapter createArtifactSupplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplementAnnotations <em>Artifact Supplement Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplementAnnotations
	 * @generated
	 */
	public Adapter createArtifactSupplementAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplementAppInfo <em>Artifact Supplement App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplementAppInfo
	 * @generated
	 */
	public Adapter createArtifactSupplementAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplementDocumentation <em>Artifact Supplement Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ArtifactSupplementDocumentation
	 * @generated
	 */
	public Adapter createArtifactSupplementDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ArtifactXRefSummary <em>Artifact XRef Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ArtifactXRefSummary
	 * @generated
	 */
	public Adapter createArtifactXRefSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationAnnotations <em>Association Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationAnnotations
	 * @generated
	 */
	public Adapter createAssociationAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationAppInfo <em>Association App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationAppInfo
	 * @generated
	 */
	public Adapter createAssociationAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationBase <em>Association Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationBase
	 * @generated
	 */
	public Adapter createAssociationBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationDocumentation <em>Association Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationDocumentation
	 * @generated
	 */
	public Adapter createAssociationDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationEnd
	 * @generated
	 */
	public Adapter createAssociationEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndAnnotations <em>Association End Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndAnnotations
	 * @generated
	 */
	public Adapter createAssociationEndAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndAppInfo <em>Association End App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndAppInfo
	 * @generated
	 */
	public Adapter createAssociationEndAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase <em>Association End Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase
	 * @generated
	 */
	public Adapter createAssociationEndBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDerivation <em>Association End Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDerivation
	 * @generated
	 */
	public Adapter createAssociationEndDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDocumentation <em>Association End Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDocumentation
	 * @generated
	 */
	public Adapter createAssociationEndDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization <em>Association End Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization
	 * @generated
	 */
	public Adapter createAssociationEndSpecializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndWithClass <em>Association End With Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndWithClass
	 * @generated
	 */
	public Adapter createAssociationEndWithClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndWithClassRef <em>Association End With Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndWithClassRef
	 * @generated
	 */
	public Adapter createAssociationEndWithClassRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeAnnotations <em>Attribute Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AttributeAnnotations
	 * @generated
	 */
	public Adapter createAttributeAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeAppInfo <em>Attribute App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AttributeAppInfo
	 * @generated
	 */
	public Adapter createAttributeAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeContent <em>Attribute Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AttributeContent
	 * @generated
	 */
	public Adapter createAttributeContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeDerivation <em>Attribute Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AttributeDerivation
	 * @generated
	 */
	public Adapter createAttributeDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeDocumentation <em>Attribute Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AttributeDocumentation
	 * @generated
	 */
	public Adapter createAttributeDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeProperty <em>Attribute Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AttributeProperty
	 * @generated
	 */
	public Adapter createAttributePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeRef <em>Attribute Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AttributeRef
	 * @generated
	 */
	public Adapter createAttributeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.AttributeValueRef <em>Attribute Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.AttributeValueRef
	 * @generated
	 */
	public Adapter createAttributeValueRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotComment <em>Ballot Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.BallotComment
	 * @generated
	 */
	public Adapter createBallotCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution <em>Ballot Comment Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution
	 * @generated
	 */
	public Adapter createBallotCommentResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission <em>Ballot Submission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.BallotSubmission
	 * @generated
	 */
	public Adapter createBallotSubmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation <em>Basic Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.BasicAnnotation
	 * @generated
	 */
	public Adapter createBasicAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm <em>Binding Realm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm
	 * @generated
	 */
	public Adapter createBindingRealmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.BoundStaticModel <em>Bound Static Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.BoundStaticModel
	 * @generated
	 */
	public Adapter createBoundStaticModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.BusinessName <em>Business Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.BusinessName
	 * @generated
	 */
	public Adapter createBusinessNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CascadableAnnotation <em>Cascadable Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CascadableAnnotation
	 * @generated
	 */
	public Adapter createCascadableAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Change <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Change
	 * @generated
	 */
	public Adapter createChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest <em>Change Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest
	 * @generated
	 */
	public Adapter createChangeRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate <em>Change Request Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate
	 * @generated
	 */
	public Adapter createChangeRequestEstimateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassAnnotations <em>Class Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassAnnotations
	 * @generated
	 */
	public Adapter createClassAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassAppInfo <em>Class App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassAppInfo
	 * @generated
	 */
	public Adapter createClassAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBase <em>Class Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassBase
	 * @generated
	 */
	public Adapter createClassBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBindingArgument <em>Class Binding Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassBindingArgument
	 * @generated
	 */
	public Adapter createClassBindingArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassBindingArgumentBase <em>Class Binding Argument Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassBindingArgumentBase
	 * @generated
	 */
	public Adapter createClassBindingArgumentBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation <em>Class Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation
	 * @generated
	 */
	public Adapter createClassDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassDocumentation <em>Class Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassDocumentation
	 * @generated
	 */
	public Adapter createClassDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassElement <em>Class Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassElement
	 * @generated
	 */
	public Adapter createClassElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralization <em>Class Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralization
	 * @generated
	 */
	public Adapter createClassGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase <em>Class Generalization Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassGeneralizationBase
	 * @generated
	 */
	public Adapter createClassGeneralizationBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassGraphicInformation <em>Class Graphic Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassGraphicInformation
	 * @generated
	 */
	public Adapter createClassGraphicInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassifierBase <em>Classifier Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassifierBase
	 * @generated
	 */
	public Adapter createClassifierBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference <em>Class Or Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference
	 * @generated
	 */
	public Adapter createClassOrReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassRef
	 * @generated
	 */
	public Adapter createClassRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassStubInterface <em>Class Stub Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassStubInterface
	 * @generated
	 */
	public Adapter createClassStubInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassStubInterfaceAnnotations <em>Class Stub Interface Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassStubInterfaceAnnotations
	 * @generated
	 */
	public Adapter createClassStubInterfaceAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassStubInterfaceAppInfo <em>Class Stub Interface App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassStubInterfaceAppInfo
	 * @generated
	 */
	public Adapter createClassStubInterfaceAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ClassStubInterfaceDocumentation <em>Class Stub Interface Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ClassStubInterfaceDocumentation
	 * @generated
	 */
	public Adapter createClassStubInterfaceDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition <em>Code Based Content Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeBasedContentDefinition
	 * @generated
	 */
	public Adapter createCodeBasedContentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterContentDefinition <em>Code Filter Content Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeFilterContentDefinition
	 * @generated
	 */
	public Adapter createCodeFilterContentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeIcon <em>Code Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeIcon
	 * @generated
	 */
	public Adapter createCodeIconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSupplement <em>Code Supplement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSupplement
	 * @generated
	 */
	public Adapter createCodeSupplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystem
	 * @generated
	 */
	public Adapter createCodeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemAnnotations <em>Code System Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemAnnotations
	 * @generated
	 */
	public Adapter createCodeSystemAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemAppInfo <em>Code System App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemAppInfo
	 * @generated
	 */
	public Adapter createCodeSystemAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase <em>Code System Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemBase
	 * @generated
	 */
	public Adapter createCodeSystemBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemDocumentation <em>Code System Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemDocumentation
	 * @generated
	 */
	public Adapter createCodeSystemDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemRef <em>Code System Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemRef
	 * @generated
	 */
	public Adapter createCodeSystemRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemSupplement <em>Code System Supplement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemSupplement
	 * @generated
	 */
	public Adapter createCodeSystemSupplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion <em>Code System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersion
	 * @generated
	 */
	public Adapter createCodeSystemVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionAnnotations <em>Code System Version Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionAnnotations
	 * @generated
	 */
	public Adapter createCodeSystemVersionAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionAppInfo <em>Code System Version App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionAppInfo
	 * @generated
	 */
	public Adapter createCodeSystemVersionAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase <em>Code System Version Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase
	 * @generated
	 */
	public Adapter createCodeSystemVersionBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionDocumentation <em>Code System Version Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionDocumentation
	 * @generated
	 */
	public Adapter createCodeSystemVersionDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement <em>Code System Version Supplement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement
	 * @generated
	 */
	public Adapter createCodeSystemVersionSupplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation <em>Code Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslation
	 * @generated
	 */
	public Adapter createCodeTranslationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationAnnotations <em>Code Translation Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationAnnotations
	 * @generated
	 */
	public Adapter createCodeTranslationAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationAppInfo <em>Code Translation App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationAppInfo
	 * @generated
	 */
	public Adapter createCodeTranslationAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection <em>Code Translation Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection
	 * @generated
	 */
	public Adapter createCodeTranslationCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollectionAnnotations <em>Code Translation Collection Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollectionAnnotations
	 * @generated
	 */
	public Adapter createCodeTranslationCollectionAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollectionAppInfo <em>Code Translation Collection App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollectionAppInfo
	 * @generated
	 */
	public Adapter createCodeTranslationCollectionAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollectionDocumentation <em>Code Translation Collection Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollectionDocumentation
	 * @generated
	 */
	public Adapter createCodeTranslationCollectionDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationDocumentation <em>Code Translation Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationDocumentation
	 * @generated
	 */
	public Adapter createCodeTranslationDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CombinedContentDefinition <em>Combined Content Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CombinedContentDefinition
	 * @generated
	 */
	public Adapter createCombinedContentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommitteeReference <em>Committee Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CommitteeReference
	 * @generated
	 */
	public Adapter createCommitteeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition <em>Common Model Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition
	 * @generated
	 */
	public Adapter createCommonModelElementDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRef <em>Common Model Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRef
	 * @generated
	 */
	public Adapter createCommonModelElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefAnnotations <em>Common Model Element Ref Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefAnnotations
	 * @generated
	 */
	public Adapter createCommonModelElementRefAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefAppInfo <em>Common Model Element Ref App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefAppInfo
	 * @generated
	 */
	public Adapter createCommonModelElementRefAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefBase <em>Common Model Element Ref Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefBase
	 * @generated
	 */
	public Adapter createCommonModelElementRefBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefDocumentation <em>Common Model Element Ref Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRefDocumentation
	 * @generated
	 */
	public Adapter createCommonModelElementRefDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage <em>Complex Markup With Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage
	 * @generated
	 */
	public Adapter createComplexMarkupWithLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Concept
	 * @generated
	 */
	public Adapter createConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptAnnotations <em>Concept Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptAnnotations
	 * @generated
	 */
	public Adapter createConceptAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptAppInfo <em>Concept App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptAppInfo
	 * @generated
	 */
	public Adapter createConceptAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptBase <em>Concept Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptBase
	 * @generated
	 */
	public Adapter createConceptBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDocumentation <em>Concept Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptDocumentation
	 * @generated
	 */
	public Adapter createConceptDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain <em>Concept Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain
	 * @generated
	 */
	public Adapter createConceptDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainAnnotations <em>Concept Domain Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainAnnotations
	 * @generated
	 */
	public Adapter createConceptDomainAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainAppInfo <em>Concept Domain App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainAppInfo
	 * @generated
	 */
	public Adapter createConceptDomainAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainDocumentation <em>Concept Domain Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainDocumentation
	 * @generated
	 */
	public Adapter createConceptDomainDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainProperty <em>Concept Domain Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainProperty
	 * @generated
	 */
	public Adapter createConceptDomainPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainRef <em>Concept Domain Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomainRef
	 * @generated
	 */
	public Adapter createConceptDomainRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty <em>Concept Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty
	 * @generated
	 */
	public Adapter createConceptPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef <em>Concept Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptPropertyRef
	 * @generated
	 */
	public Adapter createConceptPropertyRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRef <em>Concept Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptRef
	 * @generated
	 */
	public Adapter createConceptRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship <em>Concept Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptRelationship
	 * @generated
	 */
	public Adapter createConceptRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement <em>Concept Supplement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement
	 * @generated
	 */
	public Adapter createConceptSupplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplementAnnotations <em>Concept Supplement Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplementAnnotations
	 * @generated
	 */
	public Adapter createConceptSupplementAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplementAppInfo <em>Concept Supplement App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplementAppInfo
	 * @generated
	 */
	public Adapter createConceptSupplementAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplementDocumentation <em>Concept Supplement Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplementDocumentation
	 * @generated
	 */
	public Adapter createConceptSupplementDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConceptUse <em>Concept Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConceptUse
	 * @generated
	 */
	public Adapter createConceptUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile <em>Conformance Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfile
	 * @generated
	 */
	public Adapter createConformanceProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileAnnotations <em>Conformance Profile Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileAnnotations
	 * @generated
	 */
	public Adapter createConformanceProfileAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileAppInfo <em>Conformance Profile App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileAppInfo
	 * @generated
	 */
	public Adapter createConformanceProfileAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation <em>Conformance Profile Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation
	 * @generated
	 */
	public Adapter createConformanceProfileDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents <em>Conformance Trigger Events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ConformanceTriggerEvents
	 * @generated
	 */
	public Adapter createConformanceTriggerEventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContainedGraphNode <em>Contained Graph Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ContainedGraphNode
	 * @generated
	 */
	public Adapter createContainedGraphNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition <em>Content Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition
	 * @generated
	 */
	public Adapter createContentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinitionAnnotations <em>Content Definition Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinitionAnnotations
	 * @generated
	 */
	public Adapter createContentDefinitionAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinitionAppInfo <em>Content Definition App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinitionAppInfo
	 * @generated
	 */
	public Adapter createContentDefinitionAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinitionDocumentation <em>Content Definition Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinitionDocumentation
	 * @generated
	 */
	public Adapter createContentDefinitionDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextAnnotation <em>Context Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ContextAnnotation
	 * @generated
	 */
	public Adapter createContextAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding <em>Context Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding
	 * @generated
	 */
	public Adapter createContextBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Contributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Contributor
	 * @generated
	 */
	public Adapter createContributorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Datatype
	 * @generated
	 */
	public Adapter createDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeAnnotations <em>Datatype Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeAnnotations
	 * @generated
	 */
	public Adapter createDatatypeAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeAppInfo <em>Datatype App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeAppInfo
	 * @generated
	 */
	public Adapter createDatatypeAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeBinding <em>Datatype Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeBinding
	 * @generated
	 */
	public Adapter createDatatypeBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeDerivation <em>Datatype Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeDerivation
	 * @generated
	 */
	public Adapter createDatatypeDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeDocumentation <em>Datatype Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeDocumentation
	 * @generated
	 */
	public Adapter createDatatypeDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeImport <em>Datatype Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeImport
	 * @generated
	 */
	public Adapter createDatatypeImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeLimitation <em>Datatype Limitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeLimitation
	 * @generated
	 */
	public Adapter createDatatypeLimitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary <em>Datatype Model Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary
	 * @generated
	 */
	public Adapter createDatatypeModelLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation <em>Datatype Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation
	 * @generated
	 */
	public Adapter createDatatypeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeParameter <em>Datatype Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeParameter
	 * @generated
	 */
	public Adapter createDatatypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef <em>Datatype Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef
	 * @generated
	 */
	public Adapter createDatatypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DatatypeTemplateParameter <em>Datatype Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DatatypeTemplateParameter
	 * @generated
	 */
	public Adapter createDatatypeTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DeprecationInfo <em>Deprecation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DeprecationInfo
	 * @generated
	 */
	public Adapter createDeprecationInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Derivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Derivation
	 * @generated
	 */
	public Adapter createDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DerivedStaticModel <em>Derived Static Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DerivedStaticModel
	 * @generated
	 */
	public Adapter createDerivedStaticModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DerivedStaticModelsType <em>Derived Static Models Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DerivedStaticModelsType
	 * @generated
	 */
	public Adapter createDerivedStaticModelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DesignComment <em>Design Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DesignComment
	 * @generated
	 */
	public Adapter createDesignCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DiagramElement
	 * @generated
	 */
	public Adapter createDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DiagramGraphicInformation <em>Diagram Graphic Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DiagramGraphicInformation
	 * @generated
	 */
	public Adapter createDiagramGraphicInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile <em>Document Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfile
	 * @generated
	 */
	public Adapter createDocumentProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileAnnotations <em>Document Profile Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileAnnotations
	 * @generated
	 */
	public Adapter createDocumentProfileAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileAppInfo <em>Document Profile App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileAppInfo
	 * @generated
	 */
	public Adapter createDocumentProfileAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileDocumentation <em>Document Profile Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileDocumentation
	 * @generated
	 */
	public Adapter createDocumentProfileDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest <em>Document Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DocumentTest
	 * @generated
	 */
	public Adapter createDocumentTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModel <em>Domain Analysis Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModel
	 * @generated
	 */
	public Adapter createDomainAnalysisModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModelAnnotations <em>Domain Analysis Model Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModelAnnotations
	 * @generated
	 */
	public Adapter createDomainAnalysisModelAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModelAppInfo <em>Domain Analysis Model App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModelAppInfo
	 * @generated
	 */
	public Adapter createDomainAnalysisModelAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModelDocumentation <em>Domain Analysis Model Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DomainAnalysisModelDocumentation
	 * @generated
	 */
	public Adapter createDomainAnalysisModelDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExample <em>Domain Instance Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExample
	 * @generated
	 */
	public Adapter createDomainInstanceExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleAnnotations <em>Domain Instance Example Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleAnnotations
	 * @generated
	 */
	public Adapter createDomainInstanceExampleAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleAppInfo <em>Domain Instance Example App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleAppInfo
	 * @generated
	 */
	public Adapter createDomainInstanceExampleAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleDocumentation <em>Domain Instance Example Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.DomainInstanceExampleDocumentation
	 * @generated
	 */
	public Adapter createDomainInstanceExampleDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementChange <em>Element Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ElementChange
	 * @generated
	 */
	public Adapter createElementChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementDerivation <em>Element Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ElementDerivation
	 * @generated
	 */
	public Adapter createElementDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementRef <em>Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ElementRef
	 * @generated
	 */
	public Adapter createElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ElementValueRef <em>Element Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ElementValueRef
	 * @generated
	 */
	public Adapter createElementValueRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.EntryPoint
	 * @generated
	 */
	public Adapter createEntryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointAnnotations <em>Entry Point Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.EntryPointAnnotations
	 * @generated
	 */
	public Adapter createEntryPointAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointAppInfo <em>Entry Point App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.EntryPointAppInfo
	 * @generated
	 */
	public Adapter createEntryPointAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase <em>Entry Point Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.EntryPointBase
	 * @generated
	 */
	public Adapter createEntryPointBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.EntryPointDocumentation <em>Entry Point Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.EntryPointDocumentation
	 * @generated
	 */
	public Adapter createEntryPointDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.EnvironmentalOccurrence <em>Environmental Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.EnvironmentalOccurrence
	 * @generated
	 */
	public Adapter createEnvironmentalOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction <em>Example Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ExampleInteraction
	 * @generated
	 */
	public Adapter createExampleInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleSystem <em>Example System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ExampleSystem
	 * @generated
	 */
	public Adapter createExampleSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ExampleType <em>Example Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ExampleType
	 * @generated
	 */
	public Adapter createExampleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.FlatClass <em>Flat Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.FlatClass
	 * @generated
	 */
	public Adapter createFlatClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint <em>Formal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.FormalConstraint
	 * @generated
	 */
	public Adapter createFormalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.FormalExpression <em>Formal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.FormalExpression
	 * @generated
	 */
	public Adapter createFormalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage <em>Free Form Markup With Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.FreeFormMarkupWithLanguage
	 * @generated
	 */
	public Adapter createFreeFormMarkupWithLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.FreehandDocument <em>Freehand Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.FreehandDocument
	 * @generated
	 */
	public Adapter createFreehandDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.FreehandDocumentAnnotations <em>Freehand Document Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.FreehandDocumentAnnotations
	 * @generated
	 */
	public Adapter createFreehandDocumentAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.FreehandDocumentAppInfo <em>Freehand Document App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.FreehandDocumentAppInfo
	 * @generated
	 */
	public Adapter createFreehandDocumentAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.FreehandDocumentDocumentation <em>Freehand Document Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.FreehandDocumentDocumentation
	 * @generated
	 */
	public Adapter createFreehandDocumentDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GeneralizationAnnotations <em>Generalization Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GeneralizationAnnotations
	 * @generated
	 */
	public Adapter createGeneralizationAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GeneralizationAppInfo <em>Generalization App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GeneralizationAppInfo
	 * @generated
	 */
	public Adapter createGeneralizationAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GeneralizationDocumentation <em>Generalization Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GeneralizationDocumentation
	 * @generated
	 */
	public Adapter createGeneralizationDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GenericPackage <em>Generic Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GenericPackage
	 * @generated
	 */
	public Adapter createGenericPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalApplicationRole <em>Global Application Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalApplicationRole
	 * @generated
	 */
	public Adapter createGlobalApplicationRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalArtifactXRefSummary <em>Global Artifact XRef Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalArtifactXRefSummary
	 * @generated
	 */
	public Adapter createGlobalArtifactXRefSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalCodeSystem <em>Global Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalCodeSystem
	 * @generated
	 */
	public Adapter createGlobalCodeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalCodeSystemSupplement <em>Global Code System Supplement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalCodeSystemSupplement
	 * @generated
	 */
	public Adapter createGlobalCodeSystemSupplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalConformanceProfile <em>Global Conformance Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalConformanceProfile
	 * @generated
	 */
	public Adapter createGlobalConformanceProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalDatatypeModelLibrary <em>Global Datatype Model Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalDatatypeModelLibrary
	 * @generated
	 */
	public Adapter createGlobalDatatypeModelLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalDerivedStaticModel <em>Global Derived Static Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalDerivedStaticModel
	 * @generated
	 */
	public Adapter createGlobalDerivedStaticModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalDomainAnalysisModel <em>Global Domain Analysis Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalDomainAnalysisModel
	 * @generated
	 */
	public Adapter createGlobalDomainAnalysisModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalDomainInstanceExample <em>Global Domain Instance Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalDomainInstanceExample
	 * @generated
	 */
	public Adapter createGlobalDomainInstanceExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalFreehandDocument <em>Global Freehand Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalFreehandDocument
	 * @generated
	 */
	public Adapter createGlobalFreehandDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalGenericPackage <em>Global Generic Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalGenericPackage
	 * @generated
	 */
	public Adapter createGlobalGenericPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalGlossary <em>Global Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalGlossary
	 * @generated
	 */
	public Adapter createGlobalGlossaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalInteraction <em>Global Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalInteraction
	 * @generated
	 */
	public Adapter createGlobalInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalInteractionProfile <em>Global Interaction Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalInteractionProfile
	 * @generated
	 */
	public Adapter createGlobalInteractionProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalMifChanges <em>Global Mif Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalMifChanges
	 * @generated
	 */
	public Adapter createGlobalMifChangesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalPublicationPackage <em>Global Publication Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalPublicationPackage
	 * @generated
	 */
	public Adapter createGlobalPublicationPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalSerializedStaticModel <em>Global Serialized Static Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalSerializedStaticModel
	 * @generated
	 */
	public Adapter createGlobalSerializedStaticModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalStaticModel <em>Global Static Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalStaticModel
	 * @generated
	 */
	public Adapter createGlobalStaticModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalStaticModelInterfacePackage <em>Global Static Model Interface Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalStaticModelInterfacePackage
	 * @generated
	 */
	public Adapter createGlobalStaticModelInterfacePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalStoryboard <em>Global Storyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalStoryboard
	 * @generated
	 */
	public Adapter createGlobalStoryboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalStructuredDocument <em>Global Structured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalStructuredDocument
	 * @generated
	 */
	public Adapter createGlobalStructuredDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalTestScenario <em>Global Test Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalTestScenario
	 * @generated
	 */
	public Adapter createGlobalTestScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalTriggerEvent <em>Global Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalTriggerEvent
	 * @generated
	 */
	public Adapter createGlobalTriggerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalValueSet <em>Global Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalValueSet
	 * @generated
	 */
	public Adapter createGlobalValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalVocabularyModel <em>Global Vocabulary Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GlobalVocabularyModel
	 * @generated
	 */
	public Adapter createGlobalVocabularyModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Glossary
	 * @generated
	 */
	public Adapter createGlossaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphConnector <em>Graph Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GraphConnector
	 * @generated
	 */
	public Adapter createGraphConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphConnectorWithEdge <em>Graph Connector With Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GraphConnectorWithEdge
	 * @generated
	 */
	public Adapter createGraphConnectorWithEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphEdge <em>Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GraphEdge
	 * @generated
	 */
	public Adapter createGraphEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphEdgeGraphicInformation <em>Graph Edge Graphic Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GraphEdgeGraphicInformation
	 * @generated
	 */
	public Adapter createGraphEdgeGraphicInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphEdgeWithAnchor <em>Graph Edge With Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GraphEdgeWithAnchor
	 * @generated
	 */
	public Adapter createGraphEdgeWithAnchorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GraphElement
	 * @generated
	 */
	public Adapter createGraphElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphicInformation <em>Graphic Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GraphicInformation
	 * @generated
	 */
	public Adapter createGraphicInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNode <em>Graph Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GraphNode
	 * @generated
	 */
	public Adapter createGraphNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GraphNodeWithOptionalConnection <em>Graph Node With Optional Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GraphNodeWithOptionalConnection
	 * @generated
	 */
	public Adapter createGraphNodeWithOptionalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupChange <em>Group Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GroupChange
	 * @generated
	 */
	public Adapter createGroupChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.GroupVote <em>Group Vote</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.GroupVote
	 * @generated
	 */
	public Adapter createGroupVoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem <em>History Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem
	 * @generated
	 */
	public Adapter createHistoryItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints <em>Implementation Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints
	 * @generated
	 */
	public Adapter createImplementationConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints <em>Implementation Message Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints
	 * @generated
	 */
	public Adapter createImplementationMessageConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ImportDatatypeModelLibrary <em>Import Datatype Model Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ImportDatatypeModelLibrary
	 * @generated
	 */
	public Adapter createImportDatatypeModelLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.IncludeRelatedCodes <em>Include Related Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.IncludeRelatedCodes
	 * @generated
	 */
	public Adapter createIncludeRelatedCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionAnnotations <em>Interaction Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.InteractionAnnotations
	 * @generated
	 */
	public Adapter createInteractionAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionAppInfo <em>Interaction App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.InteractionAppInfo
	 * @generated
	 */
	public Adapter createInteractionAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionDocumentation <em>Interaction Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.InteractionDocumentation
	 * @generated
	 */
	public Adapter createInteractionDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile <em>Interaction Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfile
	 * @generated
	 */
	public Adapter createInteractionProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAnnotations <em>Interaction Profile Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAnnotations
	 * @generated
	 */
	public Adapter createInteractionProfileAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAppInfo <em>Interaction Profile App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileAppInfo
	 * @generated
	 */
	public Adapter createInteractionProfileAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileDocumentation <em>Interaction Profile Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.InteractionProfileDocumentation
	 * @generated
	 */
	public Adapter createInteractionProfileDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest <em>Interaction Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.InteractionTest
	 * @generated
	 */
	public Adapter createInteractionTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ItemFilter <em>Item Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ItemFilter
	 * @generated
	 */
	public Adapter createItemFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.KeyedName <em>Keyed Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.KeyedName
	 * @generated
	 */
	public Adapter createKeyedNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Legalese <em>Legalese</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Legalese
	 * @generated
	 */
	public Adapter createLegaleseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.LocalClassRef <em>Local Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.LocalClassRef
	 * @generated
	 */
	public Adapter createLocalClassRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.LocalClassReference <em>Local Class Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.LocalClassReference
	 * @generated
	 */
	public Adapter createLocalClassReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.MifChanges <em>Mif Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.MifChanges
	 * @generated
	 */
	public Adapter createMifChangesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.MifContent <em>Mif Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.MifContent
	 * @generated
	 */
	public Adapter createMifContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.NodeGraphicInformation <em>Node Graphic Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.NodeGraphicInformation
	 * @generated
	 */
	public Adapter createNodeGraphicInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.NodeWithConnectionGraphicInformation <em>Node With Connection Graphic Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.NodeWithConnectionGraphicInformation
	 * @generated
	 */
	public Adapter createNodeWithConnectionGraphicInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.NonComputableContentDefinition <em>Non Computable Content Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.NonComputableContentDefinition
	 * @generated
	 */
	public Adapter createNonComputableContentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.NonTraversableAssociationEnd <em>Non Traversable Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.NonTraversableAssociationEnd
	 * @generated
	 */
	public Adapter createNonTraversableAssociationEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.OpenIssue <em>Open Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.OpenIssue
	 * @generated
	 */
	public Adapter createOpenIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.OperationAnnotations <em>Operation Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.OperationAnnotations
	 * @generated
	 */
	public Adapter createOperationAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.OperationAppInfo <em>Operation App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.OperationAppInfo
	 * @generated
	 */
	public Adapter createOperationAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.OperationDerivation <em>Operation Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.OperationDerivation
	 * @generated
	 */
	public Adapter createOperationDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.OperationDocumentation <em>Operation Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.OperationDocumentation
	 * @generated
	 */
	public Adapter createOperationDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.OperationParameter <em>Operation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.OperationParameter
	 * @generated
	 */
	public Adapter createOperationParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.OtherAnnotation <em>Other Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.OtherAnnotation
	 * @generated
	 */
	public Adapter createOtherAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageAnnotations <em>Package Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageAnnotations
	 * @generated
	 */
	public Adapter createPackageAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageAppInfo <em>Package App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageAppInfo
	 * @generated
	 */
	public Adapter createPackageAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageArtifact <em>Package Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageArtifact
	 * @generated
	 */
	public Adapter createPackageArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageBase <em>Package Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageBase
	 * @generated
	 */
	public Adapter createPackageBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageContent <em>Package Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageContent
	 * @generated
	 */
	public Adapter createPackageContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageDefId <em>Package Def Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageDefId
	 * @generated
	 */
	public Adapter createPackageDefIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageDerivation <em>Package Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageDerivation
	 * @generated
	 */
	public Adapter createPackageDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageDocumentation <em>Package Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageDocumentation
	 * @generated
	 */
	public Adapter createPackageDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageOrArtifactRef <em>Package Or Artifact Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageOrArtifactRef
	 * @generated
	 */
	public Adapter createPackageOrArtifactRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PackageRef <em>Package Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PackageRef
	 * @generated
	 */
	public Adapter createPackageRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ParameterModel <em>Parameter Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ParameterModel
	 * @generated
	 */
	public Adapter createParameterModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PrintName <em>Print Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PrintName
	 * @generated
	 */
	public Adapter createPrintNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PropertyBasedContentDefinition <em>Property Based Content Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PropertyBasedContentDefinition
	 * @generated
	 */
	public Adapter createPropertyBasedContentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PropertyGroup <em>Property Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PropertyGroup
	 * @generated
	 */
	public Adapter createPropertyGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationAnnotations <em>Publication Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PublicationAnnotations
	 * @generated
	 */
	public Adapter createPublicationAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationAppInfo <em>Publication App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PublicationAppInfo
	 * @generated
	 */
	public Adapter createPublicationAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationBase <em>Publication Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PublicationBase
	 * @generated
	 */
	public Adapter createPublicationBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationDocumentation <em>Publication Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PublicationDocumentation
	 * @generated
	 */
	public Adapter createPublicationDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationGroup <em>Publication Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PublicationGroup
	 * @generated
	 */
	public Adapter createPublicationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem <em>Publication Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PublicationItem
	 * @generated
	 */
	public Adapter createPublicationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.PublicationPackage <em>Publication Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.PublicationPackage
	 * @generated
	 */
	public Adapter createPublicationPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition <em>Range Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition
	 * @generated
	 */
	public Adapter createRangeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.RealmElement <em>Realm Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.RealmElement
	 * @generated
	 */
	public Adapter createRealmElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility <em>Receiver Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ReceiverResponsibility
	 * @generated
	 */
	public Adapter createReceiverResponsibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.RelatedAppRole <em>Related App Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.RelatedAppRole
	 * @generated
	 */
	public Adapter createRelatedAppRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.RelationshipBasedContentDefinition <em>Relationship Based Content Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.RelationshipBasedContentDefinition
	 * @generated
	 */
	public Adapter createRelationshipBasedContentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Release
	 * @generated
	 */
	public Adapter createReleaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ReleaseList <em>Release List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ReleaseList
	 * @generated
	 */
	public Adapter createReleaseListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation <em>Rendering Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation
	 * @generated
	 */
	public Adapter createRenderingInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ReplaceElementContent <em>Replace Element Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ReplaceElementContent
	 * @generated
	 */
	public Adapter createReplaceElementContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ResponsibleGroup <em>Responsible Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ResponsibleGroup
	 * @generated
	 */
	public Adapter createResponsibleGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnd <em>Serialized Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnd
	 * @generated
	 */
	public Adapter createSerializedAssociationEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnds <em>Serialized Association Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SerializedAssociationEnds
	 * @generated
	 */
	public Adapter createSerializedAssociationEndsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClass <em>Serialized Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SerializedClass
	 * @generated
	 */
	public Adapter createSerializedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassBindingArgument <em>Serialized Class Binding Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassBindingArgument
	 * @generated
	 */
	public Adapter createSerializedClassBindingArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClasses <em>Serialized Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SerializedClasses
	 * @generated
	 */
	public Adapter createSerializedClassesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassGeneralization <em>Serialized Class Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassGeneralization
	 * @generated
	 */
	public Adapter createSerializedClassGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedCommonModelElementRef <em>Serialized Common Model Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SerializedCommonModelElementRef
	 * @generated
	 */
	public Adapter createSerializedCommonModelElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedEntryPoint <em>Serialized Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SerializedEntryPoint
	 * @generated
	 */
	public Adapter createSerializedEntryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModel <em>Serialized Static Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModel
	 * @generated
	 */
	public Adapter createSerializedStaticModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModelsType <em>Serialized Static Models Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModelsType
	 * @generated
	 */
	public Adapter createSerializedStaticModelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SpecializationClass <em>Specialization Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SpecializationClass
	 * @generated
	 */
	public Adapter createSpecializationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StateAnnotations <em>State Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StateAnnotations
	 * @generated
	 */
	public Adapter createStateAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StateAppInfo <em>State App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StateAppInfo
	 * @generated
	 */
	public Adapter createStateAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StateDerivation <em>State Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StateDerivation
	 * @generated
	 */
	public Adapter createStateDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StateDocumentation <em>State Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StateDocumentation
	 * @generated
	 */
	public Adapter createStateDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachineAnnotations <em>State Machine Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StateMachineAnnotations
	 * @generated
	 */
	public Adapter createStateMachineAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachineAppInfo <em>State Machine App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StateMachineAppInfo
	 * @generated
	 */
	public Adapter createStateMachineAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StateMachineDocumentation <em>State Machine Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StateMachineDocumentation
	 * @generated
	 */
	public Adapter createStateMachineDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticExample <em>Static Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticExample
	 * @generated
	 */
	public Adapter createStaticExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModel <em>Static Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModel
	 * @generated
	 */
	public Adapter createStaticModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelAnnotations <em>Static Model Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelAnnotations
	 * @generated
	 */
	public Adapter createStaticModelAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelAppInfo <em>Static Model App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelAppInfo
	 * @generated
	 */
	public Adapter createStaticModelAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase <em>Static Model Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelBase
	 * @generated
	 */
	public Adapter createStaticModelBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter <em>Static Model Class Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter
	 * @generated
	 */
	public Adapter createStaticModelClassTemplateParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivation <em>Static Model Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivation
	 * @generated
	 */
	public Adapter createStaticModelDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivationSource <em>Static Model Derivation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivationSource
	 * @generated
	 */
	public Adapter createStaticModelDerivationSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDocumentation <em>Static Model Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDocumentation
	 * @generated
	 */
	public Adapter createStaticModelDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfaceAnnotations <em>Static Model Interface Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfaceAnnotations
	 * @generated
	 */
	public Adapter createStaticModelInterfaceAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfaceAppInfo <em>Static Model Interface App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfaceAppInfo
	 * @generated
	 */
	public Adapter createStaticModelInterfaceAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfaceDocumentation <em>Static Model Interface Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfaceDocumentation
	 * @generated
	 */
	public Adapter createStaticModelInterfaceDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfacePackage <em>Static Model Interface Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfacePackage
	 * @generated
	 */
	public Adapter createStaticModelInterfacePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelRefBase <em>Static Model Ref Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelRefBase
	 * @generated
	 */
	public Adapter createStaticModelRefBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticModelsType <em>Static Models Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticModelsType
	 * @generated
	 */
	public Adapter createStaticModelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation <em>Static Package Diagram Graphic Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StaticPackageDiagramGraphicInformation
	 * @generated
	 */
	public Adapter createStaticPackageDiagramGraphicInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Storyboard <em>Storyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Storyboard
	 * @generated
	 */
	public Adapter createStoryboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardAnnotations <em>Storyboard Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StoryboardAnnotations
	 * @generated
	 */
	public Adapter createStoryboardAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardAppInfo <em>Storyboard App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StoryboardAppInfo
	 * @generated
	 */
	public Adapter createStoryboardAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardArtifactReferences <em>Storyboard Artifact References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StoryboardArtifactReferences
	 * @generated
	 */
	public Adapter createStoryboardArtifactReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardDocumentation <em>Storyboard Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StoryboardDocumentation
	 * @generated
	 */
	public Adapter createStoryboardDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative <em>Storyboard Narrative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StoryboardNarrative
	 * @generated
	 */
	public Adapter createStoryboardNarrativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocument <em>Structured Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocument
	 * @generated
	 */
	public Adapter createStructuredDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocumentAnnotations <em>Structured Document Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocumentAnnotations
	 * @generated
	 */
	public Adapter createStructuredDocumentAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocumentAppInfo <em>Structured Document App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocumentAppInfo
	 * @generated
	 */
	public Adapter createStructuredDocumentAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocumentDocumentation <em>Structured Document Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StructuredDocumentDocumentation
	 * @generated
	 */
	public Adapter createStructuredDocumentDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition <em>Stub Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.StubDefinition
	 * @generated
	 */
	public Adapter createStubDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaAnnotations <em>Subject Area Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaAnnotations
	 * @generated
	 */
	public Adapter createSubjectAreaAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaAppInfo <em>Subject Area App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaAppInfo
	 * @generated
	 */
	public Adapter createSubjectAreaAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaDocumentation <em>Subject Area Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaDocumentation
	 * @generated
	 */
	public Adapter createSubjectAreaDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage <em>Subject Area Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SubjectAreaPackage
	 * @generated
	 */
	public Adapter createSubjectAreaPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SubSystem
	 * @generated
	 */
	public Adapter createSubSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty <em>Supported Concept Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptProperty
	 * @generated
	 */
	public Adapter createSupportedConceptPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship <em>Supported Concept Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship
	 * @generated
	 */
	public Adapter createSupportedConceptRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty <em>Supported Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty
	 * @generated
	 */
	public Adapter createSupportedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TermDefinition <em>Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TermDefinition
	 * @generated
	 */
	public Adapter createTermDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TerminologyServer <em>Terminology Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TerminologyServer
	 * @generated
	 */
	public Adapter createTerminologyServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestBase <em>Test Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TestBase
	 * @generated
	 */
	public Adapter createTestBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestScenario <em>Test Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TestScenario
	 * @generated
	 */
	public Adapter createTestScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem <em>Test System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TestSystem
	 * @generated
	 */
	public Adapter createTestSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TransitionAnnotations <em>Transition Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TransitionAnnotations
	 * @generated
	 */
	public Adapter createTransitionAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TransitionAppInfo <em>Transition App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TransitionAppInfo
	 * @generated
	 */
	public Adapter createTransitionAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TransitionDerivation <em>Transition Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TransitionDerivation
	 * @generated
	 */
	public Adapter createTransitionDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TransitionDocumentation <em>Transition Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TransitionDocumentation
	 * @generated
	 */
	public Adapter createTransitionDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TransitionRef <em>Transition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TransitionRef
	 * @generated
	 */
	public Adapter createTransitionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TriggerEvent
	 * @generated
	 */
	public Adapter createTriggerEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TriggerEventAnnotations <em>Trigger Event Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TriggerEventAnnotations
	 * @generated
	 */
	public Adapter createTriggerEventAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TriggerEventAppInfo <em>Trigger Event App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TriggerEventAppInfo
	 * @generated
	 */
	public Adapter createTriggerEventAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.TriggerEventDocumentation <em>Trigger Event Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.TriggerEventDocumentation
	 * @generated
	 */
	public Adapter createTriggerEventDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ValueSet
	 * @generated
	 */
	public Adapter createValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetAnnotations <em>Value Set Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ValueSetAnnotations
	 * @generated
	 */
	public Adapter createValueSetAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetAppInfo <em>Value Set App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ValueSetAppInfo
	 * @generated
	 */
	public Adapter createValueSetAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetDocumentation <em>Value Set Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ValueSetDocumentation
	 * @generated
	 */
	public Adapter createValueSetDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetSupplement <em>Value Set Supplement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ValueSetSupplement
	 * @generated
	 */
	public Adapter createValueSetSupplementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion <em>Value Set Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion
	 * @generated
	 */
	public Adapter createValueSetVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.VariousMixedContent <em>Various Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VariousMixedContent
	 * @generated
	 */
	public Adapter createVariousMixedContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Vertex
	 * @generated
	 */
	public Adapter createVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef <em>Vocabulary Code Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRef
	 * @generated
	 */
	public Adapter createVocabularyCodeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRefs <em>Vocabulary Code Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRefs
	 * @generated
	 */
	public Adapter createVocabularyCodeRefsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation <em>Vocabulary Limitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation
	 * @generated
	 */
	public Adapter createVocabularyLimitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel <em>Vocabulary Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel
	 * @generated
	 */
	public Adapter createVocabularyModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelAnnotations <em>Vocabulary Model Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelAnnotations
	 * @generated
	 */
	public Adapter createVocabularyModelAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelAppInfo <em>Vocabulary Model App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelAppInfo
	 * @generated
	 */
	public Adapter createVocabularyModelAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelDocumentation <em>Vocabulary Model Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelDocumentation
	 * @generated
	 */
	public Adapter createVocabularyModelDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification <em>Vocabulary Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification
	 * @generated
	 */
	public Adapter createVocabularySpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding <em>Vocabulary Value Set Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetBinding
	 * @generated
	 */
	public Adapter createVocabularyValueSetBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetRef <em>Vocabulary Value Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetRef
	 * @generated
	 */
	public Adapter createVocabularyValueSetRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.hl7.mif2.XMIContent <em>XMI Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.XMIContent
	 * @generated
	 */
	public Adapter createXMIContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.emf.w3c.xhtml.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.emf.w3c.xhtml.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Mif2AdapterFactory
