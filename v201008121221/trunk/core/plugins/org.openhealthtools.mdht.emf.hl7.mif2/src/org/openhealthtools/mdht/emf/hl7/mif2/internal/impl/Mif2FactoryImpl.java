/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.openhealthtools.mdht.emf.hl7.mif2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mif2FactoryImpl extends EFactoryImpl implements Mif2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mif2Factory init() {
		try {
			Mif2Factory theMif2Factory = (Mif2Factory)EPackage.Registry.INSTANCE.getEFactory("urn:hl7-org:v3/mif2"); 
			if (theMif2Factory != null) {
				return theMif2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mif2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mif2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Mif2Package.ADD_ELEMENT_CONTENT: return createAddElementContent();
			case Mif2Package.ANNOTATION_CASCADE_INFO: return createAnnotationCascadeInfo();
			case Mif2Package.ANNOTATION_DERIVATION: return createAnnotationDerivation();
			case Mif2Package.APPENDIX: return createAppendix();
			case Mif2Package.APP_INFO: return createAppInfo();
			case Mif2Package.APPLICATION_ROLE: return createApplicationRole();
			case Mif2Package.APPLICATION_ROLE_ANNOTATIONS: return createApplicationRoleAnnotations();
			case Mif2Package.APPLICATION_ROLE_APP_INFO: return createApplicationRoleAppInfo();
			case Mif2Package.APPLICATION_ROLE_DOCUMENTATION: return createApplicationRoleDocumentation();
			case Mif2Package.APPLIED_TEMPLATE_GROUP: return createAppliedTemplateGroup();
			case Mif2Package.APPROVAL_INFO: return createApprovalInfo();
			case Mif2Package.ARTIFACT_CROSS_REFERENCE: return createArtifactCrossReference();
			case Mif2Package.ARTIFACT_DEPENDENCY: return createArtifactDependency();
			case Mif2Package.ARTIFACT_SUPPLEMENT: return createArtifactSupplement();
			case Mif2Package.ARTIFACT_SUPPLEMENT_ANNOTATIONS: return createArtifactSupplementAnnotations();
			case Mif2Package.ARTIFACT_SUPPLEMENT_APP_INFO: return createArtifactSupplementAppInfo();
			case Mif2Package.ARTIFACT_SUPPLEMENT_DOCUMENTATION: return createArtifactSupplementDocumentation();
			case Mif2Package.ARTIFACT_XREF_SUMMARY: return createArtifactXRefSummary();
			case Mif2Package.ASSOCIATION: return createAssociation();
			case Mif2Package.ASSOCIATION_ANNOTATIONS: return createAssociationAnnotations();
			case Mif2Package.ASSOCIATION_APP_INFO: return createAssociationAppInfo();
			case Mif2Package.ASSOCIATION_BASE: return createAssociationBase();
			case Mif2Package.ASSOCIATION_DOCUMENTATION: return createAssociationDocumentation();
			case Mif2Package.ASSOCIATION_END: return createAssociationEnd();
			case Mif2Package.ASSOCIATION_END_ANNOTATIONS: return createAssociationEndAnnotations();
			case Mif2Package.ASSOCIATION_END_APP_INFO: return createAssociationEndAppInfo();
			case Mif2Package.ASSOCIATION_END_BASE: return createAssociationEndBase();
			case Mif2Package.ASSOCIATION_END_DERIVATION: return createAssociationEndDerivation();
			case Mif2Package.ASSOCIATION_END_DOCUMENTATION: return createAssociationEndDocumentation();
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION: return createAssociationEndSpecialization();
			case Mif2Package.ASSOCIATION_END_WITH_CLASS: return createAssociationEndWithClass();
			case Mif2Package.ASSOCIATION_END_WITH_CLASS_REF: return createAssociationEndWithClassRef();
			case Mif2Package.ATTRIBUTE: return createAttribute();
			case Mif2Package.ATTRIBUTE_ANNOTATIONS: return createAttributeAnnotations();
			case Mif2Package.ATTRIBUTE_APP_INFO: return createAttributeAppInfo();
			case Mif2Package.ATTRIBUTE_CONTENT: return createAttributeContent();
			case Mif2Package.ATTRIBUTE_DERIVATION: return createAttributeDerivation();
			case Mif2Package.ATTRIBUTE_DOCUMENTATION: return createAttributeDocumentation();
			case Mif2Package.ATTRIBUTE_PROPERTY: return createAttributeProperty();
			case Mif2Package.ATTRIBUTE_REF: return createAttributeRef();
			case Mif2Package.ATTRIBUTE_VALUE_REF: return createAttributeValueRef();
			case Mif2Package.BALLOT_COMMENT: return createBallotComment();
			case Mif2Package.BALLOT_COMMENT_RESOLUTION: return createBallotCommentResolution();
			case Mif2Package.BALLOT_SUBMISSION: return createBallotSubmission();
			case Mif2Package.BASIC_ANNOTATION: return createBasicAnnotation();
			case Mif2Package.BINDING_REALM: return createBindingRealm();
			case Mif2Package.BOUND_STATIC_MODEL: return createBoundStaticModel();
			case Mif2Package.BUSINESS_NAME: return createBusinessName();
			case Mif2Package.CASCADABLE_ANNOTATION: return createCascadableAnnotation();
			case Mif2Package.CHANGE_REQUEST: return createChangeRequest();
			case Mif2Package.CHANGE_REQUEST_ESTIMATE: return createChangeRequestEstimate();
			case Mif2Package.CLASS_ANNOTATIONS: return createClassAnnotations();
			case Mif2Package.CLASS_APP_INFO: return createClassAppInfo();
			case Mif2Package.CLASS_BINDING_ARGUMENT: return createClassBindingArgument();
			case Mif2Package.CLASS_BINDING_ARGUMENT_BASE: return createClassBindingArgumentBase();
			case Mif2Package.CLASS_DERIVATION: return createClassDerivation();
			case Mif2Package.CLASS_DOCUMENTATION: return createClassDocumentation();
			case Mif2Package.CLASS_ELEMENT: return createClassElement();
			case Mif2Package.CLASS_GENERALIZATION: return createClassGeneralization();
			case Mif2Package.CLASS_GRAPHIC_INFORMATION: return createClassGraphicInformation();
			case Mif2Package.CLASSIFIER: return createClassifier();
			case Mif2Package.CLASS_OR_REFERENCE: return createClassOrReference();
			case Mif2Package.CLASS_REF: return createClassRef();
			case Mif2Package.CLASS_STUB_INTERFACE: return createClassStubInterface();
			case Mif2Package.CLASS_STUB_INTERFACE_ANNOTATIONS: return createClassStubInterfaceAnnotations();
			case Mif2Package.CLASS_STUB_INTERFACE_APP_INFO: return createClassStubInterfaceAppInfo();
			case Mif2Package.CLASS_STUB_INTERFACE_DOCUMENTATION: return createClassStubInterfaceDocumentation();
			case Mif2Package.CODE: return createCode();
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION: return createCodeBasedContentDefinition();
			case Mif2Package.CODE_FILTER_CONTENT_DEFINITION: return createCodeFilterContentDefinition();
			case Mif2Package.CODE_ICON: return createCodeIcon();
			case Mif2Package.CODE_SUPPLEMENT: return createCodeSupplement();
			case Mif2Package.CODE_SYSTEM: return createCodeSystem();
			case Mif2Package.CODE_SYSTEM_ANNOTATIONS: return createCodeSystemAnnotations();
			case Mif2Package.CODE_SYSTEM_APP_INFO: return createCodeSystemAppInfo();
			case Mif2Package.CODE_SYSTEM_DOCUMENTATION: return createCodeSystemDocumentation();
			case Mif2Package.CODE_SYSTEM_REF: return createCodeSystemRef();
			case Mif2Package.CODE_SYSTEM_SUPPLEMENT: return createCodeSystemSupplement();
			case Mif2Package.CODE_SYSTEM_VERSION: return createCodeSystemVersion();
			case Mif2Package.CODE_SYSTEM_VERSION_ANNOTATIONS: return createCodeSystemVersionAnnotations();
			case Mif2Package.CODE_SYSTEM_VERSION_APP_INFO: return createCodeSystemVersionAppInfo();
			case Mif2Package.CODE_SYSTEM_VERSION_DOCUMENTATION: return createCodeSystemVersionDocumentation();
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT: return createCodeSystemVersionSupplement();
			case Mif2Package.CODE_TRANSLATION: return createCodeTranslation();
			case Mif2Package.CODE_TRANSLATION_ANNOTATIONS: return createCodeTranslationAnnotations();
			case Mif2Package.CODE_TRANSLATION_APP_INFO: return createCodeTranslationAppInfo();
			case Mif2Package.CODE_TRANSLATION_COLLECTION: return createCodeTranslationCollection();
			case Mif2Package.CODE_TRANSLATION_COLLECTION_ANNOTATIONS: return createCodeTranslationCollectionAnnotations();
			case Mif2Package.CODE_TRANSLATION_COLLECTION_APP_INFO: return createCodeTranslationCollectionAppInfo();
			case Mif2Package.CODE_TRANSLATION_COLLECTION_DOCUMENTATION: return createCodeTranslationCollectionDocumentation();
			case Mif2Package.CODE_TRANSLATION_DOCUMENTATION: return createCodeTranslationDocumentation();
			case Mif2Package.COMBINED_CONTENT_DEFINITION: return createCombinedContentDefinition();
			case Mif2Package.COMMITTEE_REFERENCE: return createCommitteeReference();
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION: return createCommonModelElementDefinition();
			case Mif2Package.COMMON_MODEL_ELEMENT_REF: return createCommonModelElementRef();
			case Mif2Package.COMMON_MODEL_ELEMENT_REF_ANNOTATIONS: return createCommonModelElementRefAnnotations();
			case Mif2Package.COMMON_MODEL_ELEMENT_REF_APP_INFO: return createCommonModelElementRefAppInfo();
			case Mif2Package.COMMON_MODEL_ELEMENT_REF_BASE: return createCommonModelElementRefBase();
			case Mif2Package.COMMON_MODEL_ELEMENT_REF_DOCUMENTATION: return createCommonModelElementRefDocumentation();
			case Mif2Package.COMPLEX_MARKUP_WITH_LANGUAGE: return createComplexMarkupWithLanguage();
			case Mif2Package.CONCEPT: return createConcept();
			case Mif2Package.CONCEPT_ANNOTATIONS: return createConceptAnnotations();
			case Mif2Package.CONCEPT_APP_INFO: return createConceptAppInfo();
			case Mif2Package.CONCEPT_DOCUMENTATION: return createConceptDocumentation();
			case Mif2Package.CONCEPT_DOMAIN: return createConceptDomain();
			case Mif2Package.CONCEPT_DOMAIN_ANNOTATIONS: return createConceptDomainAnnotations();
			case Mif2Package.CONCEPT_DOMAIN_APP_INFO: return createConceptDomainAppInfo();
			case Mif2Package.CONCEPT_DOMAIN_DOCUMENTATION: return createConceptDomainDocumentation();
			case Mif2Package.CONCEPT_DOMAIN_PROPERTY: return createConceptDomainProperty();
			case Mif2Package.CONCEPT_DOMAIN_REF: return createConceptDomainRef();
			case Mif2Package.CONCEPT_PROPERTY: return createConceptProperty();
			case Mif2Package.CONCEPT_PROPERTY_REF: return createConceptPropertyRef();
			case Mif2Package.CONCEPT_REF: return createConceptRef();
			case Mif2Package.CONCEPT_RELATIONSHIP: return createConceptRelationship();
			case Mif2Package.CONCEPT_SUPPLEMENT: return createConceptSupplement();
			case Mif2Package.CONCEPT_SUPPLEMENT_ANNOTATIONS: return createConceptSupplementAnnotations();
			case Mif2Package.CONCEPT_SUPPLEMENT_APP_INFO: return createConceptSupplementAppInfo();
			case Mif2Package.CONCEPT_SUPPLEMENT_DOCUMENTATION: return createConceptSupplementDocumentation();
			case Mif2Package.CONCEPT_USE: return createConceptUse();
			case Mif2Package.CONFORMANCE_PROFILE: return createConformanceProfile();
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS: return createConformanceProfileAnnotations();
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO: return createConformanceProfileAppInfo();
			case Mif2Package.CONFORMANCE_PROFILE_DOCUMENTATION: return createConformanceProfileDocumentation();
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS: return createConformanceTriggerEvents();
			case Mif2Package.CONTAINED_GRAPH_NODE: return createContainedGraphNode();
			case Mif2Package.CONTENT_DEFINITION: return createContentDefinition();
			case Mif2Package.CONTENT_DEFINITION_ANNOTATIONS: return createContentDefinitionAnnotations();
			case Mif2Package.CONTENT_DEFINITION_APP_INFO: return createContentDefinitionAppInfo();
			case Mif2Package.CONTENT_DEFINITION_DOCUMENTATION: return createContentDefinitionDocumentation();
			case Mif2Package.CONTEXT_ANNOTATION: return createContextAnnotation();
			case Mif2Package.CONTEXT_BINDING: return createContextBinding();
			case Mif2Package.CONTRIBUTOR: return createContributor();
			case Mif2Package.DATATYPE: return createDatatype();
			case Mif2Package.DATATYPE_ANNOTATIONS: return createDatatypeAnnotations();
			case Mif2Package.DATATYPE_APP_INFO: return createDatatypeAppInfo();
			case Mif2Package.DATATYPE_BINDING: return createDatatypeBinding();
			case Mif2Package.DATATYPE_DERIVATION: return createDatatypeDerivation();
			case Mif2Package.DATATYPE_DOCUMENTATION: return createDatatypeDocumentation();
			case Mif2Package.DATATYPE_IMPORT: return createDatatypeImport();
			case Mif2Package.DATATYPE_LIMITATION: return createDatatypeLimitation();
			case Mif2Package.DATATYPE_MODEL_LIBRARY: return createDatatypeModelLibrary();
			case Mif2Package.DATATYPE_OPERATION: return createDatatypeOperation();
			case Mif2Package.DATATYPE_PARAMETER: return createDatatypeParameter();
			case Mif2Package.DATATYPE_REF: return createDatatypeRef();
			case Mif2Package.DATATYPE_TEMPLATE_PARAMETER: return createDatatypeTemplateParameter();
			case Mif2Package.DEPRECATION_INFO: return createDeprecationInfo();
			case Mif2Package.DERIVED_STATIC_MODEL: return createDerivedStaticModel();
			case Mif2Package.DERIVED_STATIC_MODELS_TYPE: return createDerivedStaticModelsType();
			case Mif2Package.DESIGN_COMMENT: return createDesignComment();
			case Mif2Package.DIAGRAM: return createDiagram();
			case Mif2Package.DIAGRAM_GRAPHIC_INFORMATION: return createDiagramGraphicInformation();
			case Mif2Package.DIMENSION: return createDimension();
			case Mif2Package.DOCUMENTATION: return createDocumentation();
			case Mif2Package.DOCUMENT_PROFILE: return createDocumentProfile();
			case Mif2Package.DOCUMENT_PROFILE_APP_INFO: return createDocumentProfileAppInfo();
			case Mif2Package.DOCUMENT_PROFILE_DOCUMENTATION: return createDocumentProfileDocumentation();
			case Mif2Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Mif2Package.DOCUMENT_TEST: return createDocumentTest();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL: return createDomainAnalysisModel();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_ANNOTATIONS: return createDomainAnalysisModelAnnotations();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO: return createDomainAnalysisModelAppInfo();
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_DOCUMENTATION: return createDomainAnalysisModelDocumentation();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE: return createDomainInstanceExample();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_ANNOTATIONS: return createDomainInstanceExampleAnnotations();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_APP_INFO: return createDomainInstanceExampleAppInfo();
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION: return createDomainInstanceExampleDocumentation();
			case Mif2Package.ELEMENT_CHANGE: return createElementChange();
			case Mif2Package.ELEMENT_DERIVATION: return createElementDerivation();
			case Mif2Package.ELEMENT_REF: return createElementRef();
			case Mif2Package.ELEMENT_VALUE_REF: return createElementValueRef();
			case Mif2Package.ENTRY_POINT: return createEntryPoint();
			case Mif2Package.ENTRY_POINT_ANNOTATIONS: return createEntryPointAnnotations();
			case Mif2Package.ENTRY_POINT_APP_INFO: return createEntryPointAppInfo();
			case Mif2Package.ENTRY_POINT_BASE: return createEntryPointBase();
			case Mif2Package.ENTRY_POINT_DOCUMENTATION: return createEntryPointDocumentation();
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE: return createEnvironmentalOccurrence();
			case Mif2Package.EXAMPLE_INTERACTION: return createExampleInteraction();
			case Mif2Package.EXAMPLE_SYSTEM: return createExampleSystem();
			case Mif2Package.EXAMPLE_TYPE: return createExampleType();
			case Mif2Package.FEATURE: return createFeature();
			case Mif2Package.FLAT_CLASS: return createFlatClass();
			case Mif2Package.FORMAL_CONSTRAINT: return createFormalConstraint();
			case Mif2Package.FORMAL_EXPRESSION: return createFormalExpression();
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE: return createFreeFormMarkupWithLanguage();
			case Mif2Package.FREEHAND_DOCUMENT: return createFreehandDocument();
			case Mif2Package.FREEHAND_DOCUMENT_APP_INFO: return createFreehandDocumentAppInfo();
			case Mif2Package.FREEHAND_DOCUMENT_DOCUMENTATION: return createFreehandDocumentDocumentation();
			case Mif2Package.GENERALIZATION_ANNOTATIONS: return createGeneralizationAnnotations();
			case Mif2Package.GENERALIZATION_APP_INFO: return createGeneralizationAppInfo();
			case Mif2Package.GENERALIZATION_DOCUMENTATION: return createGeneralizationDocumentation();
			case Mif2Package.GENERIC_PACKAGE: return createGenericPackage();
			case Mif2Package.GLOBAL_APPLICATION_ROLE: return createGlobalApplicationRole();
			case Mif2Package.GLOBAL_ARTIFACT_XREF_SUMMARY: return createGlobalArtifactXRefSummary();
			case Mif2Package.GLOBAL_CODE_SYSTEM: return createGlobalCodeSystem();
			case Mif2Package.GLOBAL_CODE_SYSTEM_SUPPLEMENT: return createGlobalCodeSystemSupplement();
			case Mif2Package.GLOBAL_CONFORMANCE_PROFILE: return createGlobalConformanceProfile();
			case Mif2Package.GLOBAL_DATATYPE_MODEL_LIBRARY: return createGlobalDatatypeModelLibrary();
			case Mif2Package.GLOBAL_DERIVED_STATIC_MODEL: return createGlobalDerivedStaticModel();
			case Mif2Package.GLOBAL_DOMAIN_ANALYSIS_MODEL: return createGlobalDomainAnalysisModel();
			case Mif2Package.GLOBAL_DOMAIN_INSTANCE_EXAMPLE: return createGlobalDomainInstanceExample();
			case Mif2Package.GLOBAL_FREEHAND_DOCUMENT: return createGlobalFreehandDocument();
			case Mif2Package.GLOBAL_GENERIC_PACKAGE: return createGlobalGenericPackage();
			case Mif2Package.GLOBAL_GLOSSARY: return createGlobalGlossary();
			case Mif2Package.GLOBAL_INTERACTION: return createGlobalInteraction();
			case Mif2Package.GLOBAL_INTERACTION_PROFILE: return createGlobalInteractionProfile();
			case Mif2Package.GLOBAL_MIF_CHANGES: return createGlobalMifChanges();
			case Mif2Package.GLOBAL_PUBLICATION_PACKAGE: return createGlobalPublicationPackage();
			case Mif2Package.GLOBAL_SERIALIZED_STATIC_MODEL: return createGlobalSerializedStaticModel();
			case Mif2Package.GLOBAL_STATIC_MODEL: return createGlobalStaticModel();
			case Mif2Package.GLOBAL_STATIC_MODEL_INTERFACE_PACKAGE: return createGlobalStaticModelInterfacePackage();
			case Mif2Package.GLOBAL_STORYBOARD: return createGlobalStoryboard();
			case Mif2Package.GLOBAL_STRUCTURED_DOCUMENT: return createGlobalStructuredDocument();
			case Mif2Package.GLOBAL_TEST_SCENARIO: return createGlobalTestScenario();
			case Mif2Package.GLOBAL_TRIGGER_EVENT: return createGlobalTriggerEvent();
			case Mif2Package.GLOBAL_VALUE_SET: return createGlobalValueSet();
			case Mif2Package.GLOBAL_VOCABULARY_MODEL: return createGlobalVocabularyModel();
			case Mif2Package.GLOSSARY: return createGlossary();
			case Mif2Package.GRAPH_CONNECTOR: return createGraphConnector();
			case Mif2Package.GRAPH_CONNECTOR_WITH_EDGE: return createGraphConnectorWithEdge();
			case Mif2Package.GRAPH_EDGE_GRAPHIC_INFORMATION: return createGraphEdgeGraphicInformation();
			case Mif2Package.GRAPH_EDGE_WITH_ANCHOR: return createGraphEdgeWithAnchor();
			case Mif2Package.GRAPH_NODE: return createGraphNode();
			case Mif2Package.GRAPH_NODE_WITH_OPTIONAL_CONNECTION: return createGraphNodeWithOptionalConnection();
			case Mif2Package.GROUP_CHANGE: return createGroupChange();
			case Mif2Package.GROUP_VOTE: return createGroupVote();
			case Mif2Package.HEADER: return createHeader();
			case Mif2Package.HISTORY_ITEM: return createHistoryItem();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS: return createImplementationConstraints();
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS: return createImplementationMessageConstraints();
			case Mif2Package.IMPORT_DATATYPE_MODEL_LIBRARY: return createImportDatatypeModelLibrary();
			case Mif2Package.INCLUDE_RELATED_CODES: return createIncludeRelatedCodes();
			case Mif2Package.INTERACTION: return createInteraction();
			case Mif2Package.INTERACTION_ANNOTATIONS: return createInteractionAnnotations();
			case Mif2Package.INTERACTION_APP_INFO: return createInteractionAppInfo();
			case Mif2Package.INTERACTION_DOCUMENTATION: return createInteractionDocumentation();
			case Mif2Package.INTERACTION_PROFILE: return createInteractionProfile();
			case Mif2Package.INTERACTION_PROFILE_APP_INFO: return createInteractionProfileAppInfo();
			case Mif2Package.INTERACTION_PROFILE_DOCUMENTATION: return createInteractionProfileDocumentation();
			case Mif2Package.INTERACTION_TEST: return createInteractionTest();
			case Mif2Package.INTERFACE: return createInterface();
			case Mif2Package.ITEM_FILTER: return createItemFilter();
			case Mif2Package.KEYED_NAME: return createKeyedName();
			case Mif2Package.LEGALESE: return createLegalese();
			case Mif2Package.LOCAL_CLASS_REF: return createLocalClassRef();
			case Mif2Package.LOCAL_CLASS_REFERENCE: return createLocalClassReference();
			case Mif2Package.MAPPING: return createMapping();
			case Mif2Package.MIF_CHANGES: return createMifChanges();
			case Mif2Package.MIF_CONTENT: return createMifContent();
			case Mif2Package.NODE_GRAPHIC_INFORMATION: return createNodeGraphicInformation();
			case Mif2Package.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION: return createNodeWithConnectionGraphicInformation();
			case Mif2Package.NON_COMPUTABLE_CONTENT_DEFINITION: return createNonComputableContentDefinition();
			case Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END: return createNonTraversableAssociationEnd();
			case Mif2Package.OPEN_ISSUE: return createOpenIssue();
			case Mif2Package.OPERATION_ANNOTATIONS: return createOperationAnnotations();
			case Mif2Package.OPERATION_APP_INFO: return createOperationAppInfo();
			case Mif2Package.OPERATION_DERIVATION: return createOperationDerivation();
			case Mif2Package.OPERATION_DOCUMENTATION: return createOperationDocumentation();
			case Mif2Package.OPERATION_PARAMETER: return createOperationParameter();
			case Mif2Package.OTHER_ANNOTATION: return createOtherAnnotation();
			case Mif2Package.PACKAGE_APP_INFO: return createPackageAppInfo();
			case Mif2Package.PACKAGE_CONTENT: return createPackageContent();
			case Mif2Package.PACKAGE_DEF_ID: return createPackageDefId();
			case Mif2Package.PACKAGE_DERIVATION: return createPackageDerivation();
			case Mif2Package.PACKAGE_DOCUMENTATION: return createPackageDocumentation();
			case Mif2Package.PACKAGE_OR_ARTIFACT_REF: return createPackageOrArtifactRef();
			case Mif2Package.PACKAGE_REF: return createPackageRef();
			case Mif2Package.PARAMETER_MODEL: return createParameterModel();
			case Mif2Package.POINT: return createPoint();
			case Mif2Package.PRINT_NAME: return createPrintName();
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION: return createPropertyBasedContentDefinition();
			case Mif2Package.PROPERTY_GROUP: return createPropertyGroup();
			case Mif2Package.PUBLICATION_ANNOTATIONS: return createPublicationAnnotations();
			case Mif2Package.PUBLICATION_APP_INFO: return createPublicationAppInfo();
			case Mif2Package.PUBLICATION_DOCUMENTATION: return createPublicationDocumentation();
			case Mif2Package.PUBLICATION_GROUP: return createPublicationGroup();
			case Mif2Package.PUBLICATION_ITEM: return createPublicationItem();
			case Mif2Package.PUBLICATION_PACKAGE: return createPublicationPackage();
			case Mif2Package.RANGE_DEFINITION: return createRangeDefinition();
			case Mif2Package.REALM_ELEMENT: return createRealmElement();
			case Mif2Package.RECEIVER_RESPONSIBILITY: return createReceiverResponsibility();
			case Mif2Package.RELATED_APP_ROLE: return createRelatedAppRole();
			case Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION: return createRelationshipBasedContentDefinition();
			case Mif2Package.RELEASE: return createRelease();
			case Mif2Package.RELEASE_LIST: return createReleaseList();
			case Mif2Package.RENDERING_INFORMATION: return createRenderingInformation();
			case Mif2Package.REPLACE_ELEMENT_CONTENT: return createReplaceElementContent();
			case Mif2Package.RESPONSIBLE_GROUP: return createResponsibleGroup();
			case Mif2Package.SERIALIZED_ASSOCIATION_END: return createSerializedAssociationEnd();
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS: return createSerializedAssociationEnds();
			case Mif2Package.SERIALIZED_CLASS: return createSerializedClass();
			case Mif2Package.SERIALIZED_CLASS_BINDING_ARGUMENT: return createSerializedClassBindingArgument();
			case Mif2Package.SERIALIZED_CLASSES: return createSerializedClasses();
			case Mif2Package.SERIALIZED_CLASS_GENERALIZATION: return createSerializedClassGeneralization();
			case Mif2Package.SERIALIZED_COMMON_MODEL_ELEMENT_REF: return createSerializedCommonModelElementRef();
			case Mif2Package.SERIALIZED_ENTRY_POINT: return createSerializedEntryPoint();
			case Mif2Package.SERIALIZED_STATIC_MODEL: return createSerializedStaticModel();
			case Mif2Package.SERIALIZED_STATIC_MODELS_TYPE: return createSerializedStaticModelsType();
			case Mif2Package.SPECIALIZATION_CLASS: return createSpecializationClass();
			case Mif2Package.STATE: return createState();
			case Mif2Package.STATE_ANNOTATIONS: return createStateAnnotations();
			case Mif2Package.STATE_APP_INFO: return createStateAppInfo();
			case Mif2Package.STATE_DERIVATION: return createStateDerivation();
			case Mif2Package.STATE_DOCUMENTATION: return createStateDocumentation();
			case Mif2Package.STATE_MACHINE: return createStateMachine();
			case Mif2Package.STATE_MACHINE_ANNOTATIONS: return createStateMachineAnnotations();
			case Mif2Package.STATE_MACHINE_APP_INFO: return createStateMachineAppInfo();
			case Mif2Package.STATE_MACHINE_DOCUMENTATION: return createStateMachineDocumentation();
			case Mif2Package.STATIC_EXAMPLE: return createStaticExample();
			case Mif2Package.STATIC_MODEL: return createStaticModel();
			case Mif2Package.STATIC_MODEL_ANNOTATIONS: return createStaticModelAnnotations();
			case Mif2Package.STATIC_MODEL_APP_INFO: return createStaticModelAppInfo();
			case Mif2Package.STATIC_MODEL_BASE: return createStaticModelBase();
			case Mif2Package.STATIC_MODEL_CLASS_TEMPLATE_PARAMETER: return createStaticModelClassTemplateParameter();
			case Mif2Package.STATIC_MODEL_DERIVATION: return createStaticModelDerivation();
			case Mif2Package.STATIC_MODEL_DERIVATION_SOURCE: return createStaticModelDerivationSource();
			case Mif2Package.STATIC_MODEL_DOCUMENTATION: return createStaticModelDocumentation();
			case Mif2Package.STATIC_MODEL_INTERFACE_ANNOTATIONS: return createStaticModelInterfaceAnnotations();
			case Mif2Package.STATIC_MODEL_INTERFACE_APP_INFO: return createStaticModelInterfaceAppInfo();
			case Mif2Package.STATIC_MODEL_INTERFACE_DOCUMENTATION: return createStaticModelInterfaceDocumentation();
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE: return createStaticModelInterfacePackage();
			case Mif2Package.STATIC_MODEL_REF_BASE: return createStaticModelRefBase();
			case Mif2Package.STATIC_MODELS_TYPE: return createStaticModelsType();
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION: return createStaticPackageDiagramGraphicInformation();
			case Mif2Package.STORYBOARD: return createStoryboard();
			case Mif2Package.STORYBOARD_ANNOTATIONS: return createStoryboardAnnotations();
			case Mif2Package.STORYBOARD_APP_INFO: return createStoryboardAppInfo();
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES: return createStoryboardArtifactReferences();
			case Mif2Package.STORYBOARD_DOCUMENTATION: return createStoryboardDocumentation();
			case Mif2Package.STORYBOARD_NARRATIVE: return createStoryboardNarrative();
			case Mif2Package.STRUCTURED_DOCUMENT: return createStructuredDocument();
			case Mif2Package.STRUCTURED_DOCUMENT_ANNOTATIONS: return createStructuredDocumentAnnotations();
			case Mif2Package.STRUCTURED_DOCUMENT_APP_INFO: return createStructuredDocumentAppInfo();
			case Mif2Package.STRUCTURED_DOCUMENT_DOCUMENTATION: return createStructuredDocumentDocumentation();
			case Mif2Package.STUB_DEFINITION: return createStubDefinition();
			case Mif2Package.SUBJECT_AREA_ANNOTATIONS: return createSubjectAreaAnnotations();
			case Mif2Package.SUBJECT_AREA_APP_INFO: return createSubjectAreaAppInfo();
			case Mif2Package.SUBJECT_AREA_DOCUMENTATION: return createSubjectAreaDocumentation();
			case Mif2Package.SUBJECT_AREA_PACKAGE: return createSubjectAreaPackage();
			case Mif2Package.SUB_SYSTEM: return createSubSystem();
			case Mif2Package.SUPPORTED_CONCEPT_PROPERTY: return createSupportedConceptProperty();
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP: return createSupportedConceptRelationship();
			case Mif2Package.SUPPORTED_PROPERTY: return createSupportedProperty();
			case Mif2Package.TERM_DEFINITION: return createTermDefinition();
			case Mif2Package.TERMINOLOGY_SERVER: return createTerminologyServer();
			case Mif2Package.TEST: return createTest();
			case Mif2Package.TEST_SCENARIO: return createTestScenario();
			case Mif2Package.TEST_SYSTEM: return createTestSystem();
			case Mif2Package.TRANSITION: return createTransition();
			case Mif2Package.TRANSITION_ANNOTATIONS: return createTransitionAnnotations();
			case Mif2Package.TRANSITION_APP_INFO: return createTransitionAppInfo();
			case Mif2Package.TRANSITION_DERIVATION: return createTransitionDerivation();
			case Mif2Package.TRANSITION_DOCUMENTATION: return createTransitionDocumentation();
			case Mif2Package.TRANSITION_REF: return createTransitionRef();
			case Mif2Package.TRIGGER_EVENT: return createTriggerEvent();
			case Mif2Package.TRIGGER_EVENT_ANNOTATIONS: return createTriggerEventAnnotations();
			case Mif2Package.TRIGGER_EVENT_APP_INFO: return createTriggerEventAppInfo();
			case Mif2Package.TRIGGER_EVENT_DOCUMENTATION: return createTriggerEventDocumentation();
			case Mif2Package.VALUE_SET: return createValueSet();
			case Mif2Package.VALUE_SET_ANNOTATIONS: return createValueSetAnnotations();
			case Mif2Package.VALUE_SET_APP_INFO: return createValueSetAppInfo();
			case Mif2Package.VALUE_SET_DOCUMENTATION: return createValueSetDocumentation();
			case Mif2Package.VALUE_SET_SUPPLEMENT: return createValueSetSupplement();
			case Mif2Package.VALUE_SET_VERSION: return createValueSetVersion();
			case Mif2Package.VARIOUS_MIXED_CONTENT: return createVariousMixedContent();
			case Mif2Package.VOCABULARY_CODE_REF: return createVocabularyCodeRef();
			case Mif2Package.VOCABULARY_CODE_REFS: return createVocabularyCodeRefs();
			case Mif2Package.VOCABULARY_LIMITATION: return createVocabularyLimitation();
			case Mif2Package.VOCABULARY_MODEL: return createVocabularyModel();
			case Mif2Package.VOCABULARY_MODEL_ANNOTATIONS: return createVocabularyModelAnnotations();
			case Mif2Package.VOCABULARY_MODEL_APP_INFO: return createVocabularyModelAppInfo();
			case Mif2Package.VOCABULARY_MODEL_DOCUMENTATION: return createVocabularyModelDocumentation();
			case Mif2Package.VOCABULARY_SPECIFICATION: return createVocabularySpecification();
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING: return createVocabularyValueSetBinding();
			case Mif2Package.VOCABULARY_VALUE_SET_REF: return createVocabularyValueSetRef();
			case Mif2Package.XMI_CONTENT: return createXMIContent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Mif2Package.AFFILIATE_KIND:
				return createAffiliateKindFromString(eDataType, initialValue);
			case Mif2Package.AFFIRMATIVE_VOTE_RESOLUTION_KIND:
				return createAffirmativeVoteResolutionKindFromString(eDataType, initialValue);
			case Mif2Package.ANNOTATION_KIND:
				return createAnnotationKindFromString(eDataType, initialValue);
			case Mif2Package.APPLICATION_ROLE_RELATIONSHIP_KIND:
				return createApplicationRoleRelationshipKindFromString(eDataType, initialValue);
			case Mif2Package.APPROVAL_STATUS_KIND:
				return createApprovalStatusKindFromString(eDataType, initialValue);
			case Mif2Package.ARTIFACT_GROUP_KIND:
				return createArtifactGroupKindFromString(eDataType, initialValue);
			case Mif2Package.ARTIFACT_KIND:
				return createArtifactKindFromString(eDataType, initialValue);
			case Mif2Package.ARTIFACT_RENDERING_STYLE_KIND:
				return createArtifactRenderingStyleKindFromString(eDataType, initialValue);
			case Mif2Package.ATTRIBUTE_PROPERTY_KIND:
				return createAttributePropertyKindFromString(eDataType, initialValue);
			case Mif2Package.CASCADING_ANNOTATION_ELEMENT_KIND:
				return createCascadingAnnotationElementKindFromString(eDataType, initialValue);
			case Mif2Package.CHANGE_REQUEST_STATUS:
				return createChangeRequestStatusFromString(eDataType, initialValue);
			case Mif2Package.CLASS_PRESENTATION_KIND:
				return createClassPresentationKindFromString(eDataType, initialValue);
			case Mif2Package.CMET_ATTRIBUTION_KIND:
				return createCMETAttributionKindFromString(eDataType, initialValue);
			case Mif2Package.CMET_ENTRY_KIND:
				return createCMETEntryKindFromString(eDataType, initialValue);
			case Mif2Package.CODE_FILTER_EXPRESSION_KIND:
				return createCodeFilterExpressionKindFromString(eDataType, initialValue);
			case Mif2Package.CODE_STATUS_KIND:
				return createCodeStatusKindFromString(eDataType, initialValue);
			case Mif2Package.CODING_STRENGTH_KIND:
				return createCodingStrengthKindFromString(eDataType, initialValue);
			case Mif2Package.CONCEPT_DOMAIN_PROPERTY_KIND:
				return createConceptDomainPropertyKindFromString(eDataType, initialValue);
			case Mif2Package.CONCEPT_PROPERTY_TYPE_KIND:
				return createConceptPropertyTypeKindFromString(eDataType, initialValue);
			case Mif2Package.CONCEPT_RELATIONSHIP_KIND:
				return createConceptRelationshipKindFromString(eDataType, initialValue);
			case Mif2Package.CONCEPT_USE_KIND:
				return createConceptUseKindFromString(eDataType, initialValue);
			case Mif2Package.CONFORMANCE_KIND:
				return createConformanceKindFromString(eDataType, initialValue);
			case Mif2Package.CONSTRUCTED_ELEMENT_KIND:
				return createConstructedElementKindFromString(eDataType, initialValue);
			case Mif2Package.CONTENTS_LEVEL_KIND:
				return createContentsLevelKindFromString(eDataType, initialValue);
			case Mif2Package.DATATYPE_KIND:
				return createDatatypeKindFromString(eDataType, initialValue);
			case Mif2Package.DATATYPE_OPERATION_KIND:
				return createDatatypeOperationKindFromString(eDataType, initialValue);
			case Mif2Package.DATATYPE_QUALIFIER_KIND:
				return createDatatypeQualifierKindFromString(eDataType, initialValue);
			case Mif2Package.DEFAULT_DETERMINER_KIND:
				return createDefaultDeterminerKindFromString(eDataType, initialValue);
			case Mif2Package.DEFINED_MAPPING_SOURCE_KIND:
				return createDefinedMappingSourceKindFromString(eDataType, initialValue);
			case Mif2Package.DEFINED_ROLE_KIND:
				return createDefinedRoleKindFromString(eDataType, initialValue);
			case Mif2Package.DERIVATION_RELATIONSHIP_KIND:
				return createDerivationRelationshipKindFromString(eDataType, initialValue);
			case Mif2Package.DESIGN_COMMENT_TAG_KIND:
				return createDesignCommentTagKindFromString(eDataType, initialValue);
			case Mif2Package.DOCUMENT_PROFILE_KIND:
				return createDocumentProfileKindFromString(eDataType, initialValue);
			case Mif2Package.DOMAIN_KIND:
				return createDomainKindFromString(eDataType, initialValue);
			case Mif2Package.DURATION_UNITS_KIND:
				return createDurationUnitsKindFromString(eDataType, initialValue);
			case Mif2Package.EFFORT_QUANTIFIER_KIND:
				return createEffortQuantifierKindFromString(eDataType, initialValue);
			case Mif2Package.EXPRESSION_LANGUAGE_KIND:
				return createExpressionLanguageKindFromString(eDataType, initialValue);
			case Mif2Package.FILTER_KIND:
				return createFilterKindFromString(eDataType, initialValue);
			case Mif2Package.FUNCTIONALISM:
				return createFunctionalismFromString(eDataType, initialValue);
			case Mif2Package.ICON_FORMAT_KIND:
				return createIconFormatKindFromString(eDataType, initialValue);
			case Mif2Package.INTERACTION_KIND:
				return createInteractionKindFromString(eDataType, initialValue);
			case Mif2Package.INTERACTION_PROFILE_KIND:
				return createInteractionProfileKindFromString(eDataType, initialValue);
			case Mif2Package.ITS_KIND:
				return createITSKindFromString(eDataType, initialValue);
			case Mif2Package.MAP_RELATIONSHIP_KIND:
				return createMapRelationshipKindFromString(eDataType, initialValue);
			case Mif2Package.MODEL_CONFORMANCE_KIND:
				return createModelConformanceKindFromString(eDataType, initialValue);
			case Mif2Package.NEGATIVE_VOTE_RESOLUTION_KIND:
				return createNegativeVoteResolutionKindFromString(eDataType, initialValue);
			case Mif2Package.NODE_ORIENTATION:
				return createNodeOrientationFromString(eDataType, initialValue);
			case Mif2Package.OWNER_SCOPE_KIND:
				return createOwnerScopeKindFromString(eDataType, initialValue);
			case Mif2Package.PACKAGE_KIND:
				return createPackageKindFromString(eDataType, initialValue);
			case Mif2Package.PACKAGE_ROOT_KIND:
				return createPackageRootKindFromString(eDataType, initialValue);
			case Mif2Package.PARENT_ARTIFACT_KIND:
				return createParentArtifactKindFromString(eDataType, initialValue);
			case Mif2Package.PROPERTY_DEFAULT_HANDLING_KIND:
				return createPropertyDefaultHandlingKindFromString(eDataType, initialValue);
			case Mif2Package.REFLEXIVITY:
				return createReflexivityFromString(eDataType, initialValue);
			case Mif2Package.RELATIONSHIP_TRAVERSAL_KIND:
				return createRelationshipTraversalKindFromString(eDataType, initialValue);
			case Mif2Package.REVISION_FREQUENCY_KIND:
				return createRevisionFrequencyKindFromString(eDataType, initialValue);
			case Mif2Package.SECTION_KIND:
				return createSectionKindFromString(eDataType, initialValue);
			case Mif2Package.STATIC_MODEL_DIAGRAM_PRESENTATION_KIND:
				return createStaticModelDiagramPresentationKindFromString(eDataType, initialValue);
			case Mif2Package.STATIC_MODEL_REPRESENTATION_KIND:
				return createStaticModelRepresentationKindFromString(eDataType, initialValue);
			case Mif2Package.STATIC_MODEL_USE_KIND:
				return createStaticModelUseKindFromString(eDataType, initialValue);
			case Mif2Package.SUB_ARTIFACT_KIND:
				return createSubArtifactKindFromString(eDataType, initialValue);
			case Mif2Package.SUB_SECTION_KIND:
				return createSubSectionKindFromString(eDataType, initialValue);
			case Mif2Package.SYMMETRY:
				return createSymmetryFromString(eDataType, initialValue);
			case Mif2Package.TERMINOLOGY_SERVER_KIND:
				return createTerminologyServerKindFromString(eDataType, initialValue);
			case Mif2Package.TRANSITIVITY:
				return createTransitivityFromString(eDataType, initialValue);
			case Mif2Package.TRANSLATABLE_DIRECTION_KIND:
				return createTranslatableDirectionKindFromString(eDataType, initialValue);
			case Mif2Package.UNLIMITED_MULTIPLICITY:
				return createUnlimitedMultiplicityFromString(eDataType, initialValue);
			case Mif2Package.UPDATE_MODE_KIND:
				return createUpdateModeKindFromString(eDataType, initialValue);
			case Mif2Package.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			case Mif2Package.VOCABULARY_MODEL_DEFINITION_KIND:
				return createVocabularyModelDefinitionKindFromString(eDataType, initialValue);
			case Mif2Package.VOTE_COMMENT_KIND:
				return createVoteCommentKindFromString(eDataType, initialValue);
			case Mif2Package.VOTE_KIND:
				return createVoteKindFromString(eDataType, initialValue);
			case Mif2Package.AFFILIATE_KIND_OBJECT:
				return createAffiliateKindObjectFromString(eDataType, initialValue);
			case Mif2Package.AFFIRMATIVE_VOTE_RESOLUTION_KIND_OBJECT:
				return createAffirmativeVoteResolutionKindObjectFromString(eDataType, initialValue);
			case Mif2Package.ALL_CLASS_NAME:
				return createAllClassNameFromString(eDataType, initialValue);
			case Mif2Package.ANNOTATION_KIND_OBJECT:
				return createAnnotationKindObjectFromString(eDataType, initialValue);
			case Mif2Package.APPLICATION_ROLE_RELATIONSHIP_KIND_OBJECT:
				return createApplicationRoleRelationshipKindObjectFromString(eDataType, initialValue);
			case Mif2Package.APPROVAL_STATUS_KIND_OBJECT:
				return createApprovalStatusKindObjectFromString(eDataType, initialValue);
			case Mif2Package.ARTIFACT_GROUP_KIND_OBJECT:
				return createArtifactGroupKindObjectFromString(eDataType, initialValue);
			case Mif2Package.ARTIFACT_KIND_OBJECT:
				return createArtifactKindObjectFromString(eDataType, initialValue);
			case Mif2Package.ARTIFACT_RENDERING_STYLE_KIND_OBJECT:
				return createArtifactRenderingStyleKindObjectFromString(eDataType, initialValue);
			case Mif2Package.ATTRIBUTE_PROPERTY_KIND_OBJECT:
				return createAttributePropertyKindObjectFromString(eDataType, initialValue);
			case Mif2Package.BASIC_FORMAL_NAME:
				return createBasicFormalNameFromString(eDataType, initialValue);
			case Mif2Package.BASIC_ID:
				return createBasicIdFromString(eDataType, initialValue);
			case Mif2Package.CASCADING_ANNOTATION_ELEMENT_KIND_OBJECT:
				return createCascadingAnnotationElementKindObjectFromString(eDataType, initialValue);
			case Mif2Package.CHANGE_REQUEST_STATUS_OBJECT:
				return createChangeRequestStatusObjectFromString(eDataType, initialValue);
			case Mif2Package.CLASS_PRESENTATION_KIND_OBJECT:
				return createClassPresentationKindObjectFromString(eDataType, initialValue);
			case Mif2Package.CMET_ATTRIBUTION_KIND_OBJECT:
				return createCMETAttributionKindObjectFromString(eDataType, initialValue);
			case Mif2Package.CMET_ATTRIBUTION_STRING:
				return createCMETAttributionStringFromString(eDataType, initialValue);
			case Mif2Package.CMET_ATTRIBUTION_TYPE:
				return createCMETAttributionTypeFromString(eDataType, initialValue);
			case Mif2Package.CMET_ENTRY_KIND_OBJECT:
				return createCMETEntryKindObjectFromString(eDataType, initialValue);
			case Mif2Package.CODE_FILTER_EXPRESSION_KIND_OBJECT:
				return createCodeFilterExpressionKindObjectFromString(eDataType, initialValue);
			case Mif2Package.CODE_STATUS_KIND_OBJECT:
				return createCodeStatusKindObjectFromString(eDataType, initialValue);
			case Mif2Package.CODING_STRENGTH_KIND_OBJECT:
				return createCodingStrengthKindObjectFromString(eDataType, initialValue);
			case Mif2Package.COLLAPSED_PACKAGE_ID:
				return createCollapsedPackageIdFromString(eDataType, initialValue);
			case Mif2Package.CONCEPT_DOMAIN_PROPERTY_KIND_OBJECT:
				return createConceptDomainPropertyKindObjectFromString(eDataType, initialValue);
			case Mif2Package.CONCEPT_PROPERTY_TYPE_KIND_OBJECT:
				return createConceptPropertyTypeKindObjectFromString(eDataType, initialValue);
			case Mif2Package.CONCEPT_RELATIONSHIP_KIND_OBJECT:
				return createConceptRelationshipKindObjectFromString(eDataType, initialValue);
			case Mif2Package.CONCEPT_USE_KIND_OBJECT:
				return createConceptUseKindObjectFromString(eDataType, initialValue);
			case Mif2Package.CONFORMANCE_KIND_OBJECT:
				return createConformanceKindObjectFromString(eDataType, initialValue);
			case Mif2Package.CONSTRUCTED_ELEMENT_KIND_OBJECT:
				return createConstructedElementKindObjectFromString(eDataType, initialValue);
			case Mif2Package.CONTENTS_LEVEL_KIND_OBJECT:
				return createContentsLevelKindObjectFromString(eDataType, initialValue);
			case Mif2Package.DATATYPE_KIND_OBJECT:
				return createDatatypeKindObjectFromString(eDataType, initialValue);
			case Mif2Package.DATATYPE_NAME:
				return createDatatypeNameFromString(eDataType, initialValue);
			case Mif2Package.DATATYPE_OPERATION_KIND_OBJECT:
				return createDatatypeOperationKindObjectFromString(eDataType, initialValue);
			case Mif2Package.DATATYPE_QUALIFIER_KIND_OBJECT:
				return createDatatypeQualifierKindObjectFromString(eDataType, initialValue);
			case Mif2Package.DATE_OR_TIMESTAMP:
				return createDateOrTimestampFromString(eDataType, initialValue);
			case Mif2Package.DECIMAL:
				return createDecimalFromString(eDataType, initialValue);
			case Mif2Package.DEFAULT_DETERMINER_KIND_OBJECT:
				return createDefaultDeterminerKindObjectFromString(eDataType, initialValue);
			case Mif2Package.DEFINED_CONTEXT_KIND:
				return createDefinedContextKindFromString(eDataType, initialValue);
			case Mif2Package.DEFINED_MAPPING_SOURCE_KIND_OBJECT:
				return createDefinedMappingSourceKindObjectFromString(eDataType, initialValue);
			case Mif2Package.DEFINED_ROLE_KIND_OBJECT:
				return createDefinedRoleKindObjectFromString(eDataType, initialValue);
			case Mif2Package.DERIVATION_RELATIONSHIP_KIND_OBJECT:
				return createDerivationRelationshipKindObjectFromString(eDataType, initialValue);
			case Mif2Package.DESIGN_COMMENT_TAG_KIND_OBJECT:
				return createDesignCommentTagKindObjectFromString(eDataType, initialValue);
			case Mif2Package.DOCUMENT_PROFILE_KIND_OBJECT:
				return createDocumentProfileKindObjectFromString(eDataType, initialValue);
			case Mif2Package.DOMAIN_KIND_OBJECT:
				return createDomainKindObjectFromString(eDataType, initialValue);
			case Mif2Package.DURATION_UNITS_KIND_OBJECT:
				return createDurationUnitsKindObjectFromString(eDataType, initialValue);
			case Mif2Package.EFFORT_QUANTIFIER_KIND_OBJECT:
				return createEffortQuantifierKindObjectFromString(eDataType, initialValue);
			case Mif2Package.EMAIL:
				return createEMailFromString(eDataType, initialValue);
			case Mif2Package.ENUMERATION_STRING:
				return createEnumerationStringFromString(eDataType, initialValue);
			case Mif2Package.ENUMERATION_TOKEN:
				return createEnumerationTokenFromString(eDataType, initialValue);
			case Mif2Package.EXPRESSION_LANGUAGE_KIND_OBJECT:
				return createExpressionLanguageKindObjectFromString(eDataType, initialValue);
			case Mif2Package.FILTER_KIND_OBJECT:
				return createFilterKindObjectFromString(eDataType, initialValue);
			case Mif2Package.FORMAL_PROPER_NAME:
				return createFormalProperNameFromString(eDataType, initialValue);
			case Mif2Package.FORMAL_PROPERTY_NAME:
				return createFormalPropertyNameFromString(eDataType, initialValue);
			case Mif2Package.FUNCTIONALISM_OBJECT:
				return createFunctionalismObjectFromString(eDataType, initialValue);
			case Mif2Package.GRAPHIC_MEASUREMENT:
				return createGraphicMeasurementFromString(eDataType, initialValue);
			case Mif2Package.HASH_CODE:
				return createHashCodeFromString(eDataType, initialValue);
			case Mif2Package.ICON_FORMAT_KIND_OBJECT:
				return createIconFormatKindObjectFromString(eDataType, initialValue);
			case Mif2Package.INTERACTION_KIND_OBJECT:
				return createInteractionKindObjectFromString(eDataType, initialValue);
			case Mif2Package.INTERACTION_PROFILE_KIND_OBJECT:
				return createInteractionProfileKindObjectFromString(eDataType, initialValue);
			case Mif2Package.ITS_KIND_OBJECT:
				return createITSKindObjectFromString(eDataType, initialValue);
			case Mif2Package.LOCAL_FILE_REFERENCE:
				return createLocalFileReferenceFromString(eDataType, initialValue);
			case Mif2Package.LONG_DESCRIPTIVE_NAME:
				return createLongDescriptiveNameFromString(eDataType, initialValue);
			case Mif2Package.LOWER_CAMEL_CASE:
				return createLowerCamelCaseFromString(eDataType, initialValue);
			case Mif2Package.MAPPING_SOURCE_KIND:
				return createMappingSourceKindFromString(eDataType, initialValue);
			case Mif2Package.MAP_RELATIONSHIP_KIND_OBJECT:
				return createMapRelationshipKindObjectFromString(eDataType, initialValue);
			case Mif2Package.MIME_TYPE:
				return createMimeTypeFromString(eDataType, initialValue);
			case Mif2Package.MODEL_CONFORMANCE_KIND_OBJECT:
				return createModelConformanceKindObjectFromString(eDataType, initialValue);
			case Mif2Package.NEGATIVE_VOTE_RESOLUTION_KIND_OBJECT:
				return createNegativeVoteResolutionKindObjectFromString(eDataType, initialValue);
			case Mif2Package.NODE_ORIENTATION_OBJECT:
				return createNodeOrientationObjectFromString(eDataType, initialValue);
			case Mif2Package.NON_EMPTY_STRING:
				return createNonEmptyStringFromString(eDataType, initialValue);
			case Mif2Package.NON_NEGATIVE_DECIMAL:
				return createNonNegativeDecimalFromString(eDataType, initialValue);
			case Mif2Package.OID:
				return createOidFromString(eDataType, initialValue);
			case Mif2Package.OWNER_SCOPE_KIND_OBJECT:
				return createOwnerScopeKindObjectFromString(eDataType, initialValue);
			case Mif2Package.PACKAGE_KIND_OBJECT:
				return createPackageKindObjectFromString(eDataType, initialValue);
			case Mif2Package.PACKAGE_ROOT_KIND_OBJECT:
				return createPackageRootKindObjectFromString(eDataType, initialValue);
			case Mif2Package.PARENT_ARTIFACT_KIND_OBJECT:
				return createParentArtifactKindObjectFromString(eDataType, initialValue);
			case Mif2Package.POSITIVE_DECIMAL:
				return createPositiveDecimalFromString(eDataType, initialValue);
			case Mif2Package.PREFIXED_UPPER_CAMEL_CASE:
				return createPrefixedUpperCamelCaseFromString(eDataType, initialValue);
			case Mif2Package.PROPERTY_DEFAULT_HANDLING_KIND_OBJECT:
				return createPropertyDefaultHandlingKindObjectFromString(eDataType, initialValue);
			case Mif2Package.REALM_KIND:
				return createRealmKindFromString(eDataType, initialValue);
			case Mif2Package.REALM_NAMESPACE_KIND:
				return createRealmNamespaceKindFromString(eDataType, initialValue);
			case Mif2Package.REFLEXIVITY_OBJECT:
				return createReflexivityObjectFromString(eDataType, initialValue);
			case Mif2Package.RELATIONSHIP_TRAVERSAL_KIND_OBJECT:
				return createRelationshipTraversalKindObjectFromString(eDataType, initialValue);
			case Mif2Package.REVISION_FREQUENCY_KIND_OBJECT:
				return createRevisionFrequencyKindObjectFromString(eDataType, initialValue);
			case Mif2Package.ROLE_KIND:
				return createRoleKindFromString(eDataType, initialValue);
			case Mif2Package.SECTION_KIND_OBJECT:
				return createSectionKindObjectFromString(eDataType, initialValue);
			case Mif2Package.SHORT_DESCRIPTIVE_NAME:
				return createShortDescriptiveNameFromString(eDataType, initialValue);
			case Mif2Package.SHORT_STRING:
				return createShortStringFromString(eDataType, initialValue);
			case Mif2Package.SINGLE_NON_NEGATIVE_INTEGER:
				return createSingleNonNegativeIntegerFromString(eDataType, initialValue);
			case Mif2Package.SMALL_NON_NEGATIVE_INTEGER:
				return createSmallNonNegativeIntegerFromString(eDataType, initialValue);
			case Mif2Package.SMALL_POSITIVE_INTEGER:
				return createSmallPositiveIntegerFromString(eDataType, initialValue);
			case Mif2Package.STATIC_MODEL_DIAGRAM_PRESENTATION_KIND_OBJECT:
				return createStaticModelDiagramPresentationKindObjectFromString(eDataType, initialValue);
			case Mif2Package.STATIC_MODEL_REPRESENTATION_KIND_OBJECT:
				return createStaticModelRepresentationKindObjectFromString(eDataType, initialValue);
			case Mif2Package.STATIC_MODEL_USE_KIND_OBJECT:
				return createStaticModelUseKindObjectFromString(eDataType, initialValue);
			case Mif2Package.SUB_ARTIFACT_KIND_OBJECT:
				return createSubArtifactKindObjectFromString(eDataType, initialValue);
			case Mif2Package.SUB_SECTION_KIND_OBJECT:
				return createSubSectionKindObjectFromString(eDataType, initialValue);
			case Mif2Package.SYMMETRY_OBJECT:
				return createSymmetryObjectFromString(eDataType, initialValue);
			case Mif2Package.TEMPLATE_ID:
				return createTemplateIdFromString(eDataType, initialValue);
			case Mif2Package.TERMINOLOGY_SERVER_KIND_OBJECT:
				return createTerminologyServerKindObjectFromString(eDataType, initialValue);
			case Mif2Package.TRANSITIVITY_OBJECT:
				return createTransitivityObjectFromString(eDataType, initialValue);
			case Mif2Package.TRANSLATABLE_DIRECTION_KIND_OBJECT:
				return createTranslatableDirectionKindObjectFromString(eDataType, initialValue);
			case Mif2Package.UNLIMITED_INTEGER:
				return createUnlimitedIntegerFromString(eDataType, initialValue);
			case Mif2Package.UNLIMITED_MULTIPLICITY_OBJECT:
				return createUnlimitedMultiplicityObjectFromString(eDataType, initialValue);
			case Mif2Package.UPDATE_MODE_CODES:
				return createUpdateModeCodesFromString(eDataType, initialValue);
			case Mif2Package.UPDATE_MODE_KIND_OBJECT:
				return createUpdateModeKindObjectFromString(eDataType, initialValue);
			case Mif2Package.UPPER_CAMEL_CASE:
				return createUpperCamelCaseFromString(eDataType, initialValue);
			case Mif2Package.URI:
				return createUriFromString(eDataType, initialValue);
			case Mif2Package.URL:
				return createUrlFromString(eDataType, initialValue);
			case Mif2Package.UUID:
				return createUuidFromString(eDataType, initialValue);
			case Mif2Package.VERSION:
				return createVersionFromString(eDataType, initialValue);
			case Mif2Package.VISIBILITY_KIND_OBJECT:
				return createVisibilityKindObjectFromString(eDataType, initialValue);
			case Mif2Package.VOCABULARY_MODEL_DEFINITION_KIND_OBJECT:
				return createVocabularyModelDefinitionKindObjectFromString(eDataType, initialValue);
			case Mif2Package.VOTE_COMMENT_KIND_OBJECT:
				return createVoteCommentKindObjectFromString(eDataType, initialValue);
			case Mif2Package.VOTE_KIND_OBJECT:
				return createVoteKindObjectFromString(eDataType, initialValue);
			case Mif2Package.VOTE_RESOLUTION_KIND:
				return createVoteResolutionKindFromString(eDataType, initialValue);
			case Mif2Package.XDOMAIN_NAME:
				return createXDomainNameFromString(eDataType, initialValue);
			case Mif2Package.YEAR:
				return createYearFromString(eDataType, initialValue);
			case Mif2Package.YEARS:
				return createYearsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Mif2Package.AFFILIATE_KIND:
				return convertAffiliateKindToString(eDataType, instanceValue);
			case Mif2Package.AFFIRMATIVE_VOTE_RESOLUTION_KIND:
				return convertAffirmativeVoteResolutionKindToString(eDataType, instanceValue);
			case Mif2Package.ANNOTATION_KIND:
				return convertAnnotationKindToString(eDataType, instanceValue);
			case Mif2Package.APPLICATION_ROLE_RELATIONSHIP_KIND:
				return convertApplicationRoleRelationshipKindToString(eDataType, instanceValue);
			case Mif2Package.APPROVAL_STATUS_KIND:
				return convertApprovalStatusKindToString(eDataType, instanceValue);
			case Mif2Package.ARTIFACT_GROUP_KIND:
				return convertArtifactGroupKindToString(eDataType, instanceValue);
			case Mif2Package.ARTIFACT_KIND:
				return convertArtifactKindToString(eDataType, instanceValue);
			case Mif2Package.ARTIFACT_RENDERING_STYLE_KIND:
				return convertArtifactRenderingStyleKindToString(eDataType, instanceValue);
			case Mif2Package.ATTRIBUTE_PROPERTY_KIND:
				return convertAttributePropertyKindToString(eDataType, instanceValue);
			case Mif2Package.CASCADING_ANNOTATION_ELEMENT_KIND:
				return convertCascadingAnnotationElementKindToString(eDataType, instanceValue);
			case Mif2Package.CHANGE_REQUEST_STATUS:
				return convertChangeRequestStatusToString(eDataType, instanceValue);
			case Mif2Package.CLASS_PRESENTATION_KIND:
				return convertClassPresentationKindToString(eDataType, instanceValue);
			case Mif2Package.CMET_ATTRIBUTION_KIND:
				return convertCMETAttributionKindToString(eDataType, instanceValue);
			case Mif2Package.CMET_ENTRY_KIND:
				return convertCMETEntryKindToString(eDataType, instanceValue);
			case Mif2Package.CODE_FILTER_EXPRESSION_KIND:
				return convertCodeFilterExpressionKindToString(eDataType, instanceValue);
			case Mif2Package.CODE_STATUS_KIND:
				return convertCodeStatusKindToString(eDataType, instanceValue);
			case Mif2Package.CODING_STRENGTH_KIND:
				return convertCodingStrengthKindToString(eDataType, instanceValue);
			case Mif2Package.CONCEPT_DOMAIN_PROPERTY_KIND:
				return convertConceptDomainPropertyKindToString(eDataType, instanceValue);
			case Mif2Package.CONCEPT_PROPERTY_TYPE_KIND:
				return convertConceptPropertyTypeKindToString(eDataType, instanceValue);
			case Mif2Package.CONCEPT_RELATIONSHIP_KIND:
				return convertConceptRelationshipKindToString(eDataType, instanceValue);
			case Mif2Package.CONCEPT_USE_KIND:
				return convertConceptUseKindToString(eDataType, instanceValue);
			case Mif2Package.CONFORMANCE_KIND:
				return convertConformanceKindToString(eDataType, instanceValue);
			case Mif2Package.CONSTRUCTED_ELEMENT_KIND:
				return convertConstructedElementKindToString(eDataType, instanceValue);
			case Mif2Package.CONTENTS_LEVEL_KIND:
				return convertContentsLevelKindToString(eDataType, instanceValue);
			case Mif2Package.DATATYPE_KIND:
				return convertDatatypeKindToString(eDataType, instanceValue);
			case Mif2Package.DATATYPE_OPERATION_KIND:
				return convertDatatypeOperationKindToString(eDataType, instanceValue);
			case Mif2Package.DATATYPE_QUALIFIER_KIND:
				return convertDatatypeQualifierKindToString(eDataType, instanceValue);
			case Mif2Package.DEFAULT_DETERMINER_KIND:
				return convertDefaultDeterminerKindToString(eDataType, instanceValue);
			case Mif2Package.DEFINED_MAPPING_SOURCE_KIND:
				return convertDefinedMappingSourceKindToString(eDataType, instanceValue);
			case Mif2Package.DEFINED_ROLE_KIND:
				return convertDefinedRoleKindToString(eDataType, instanceValue);
			case Mif2Package.DERIVATION_RELATIONSHIP_KIND:
				return convertDerivationRelationshipKindToString(eDataType, instanceValue);
			case Mif2Package.DESIGN_COMMENT_TAG_KIND:
				return convertDesignCommentTagKindToString(eDataType, instanceValue);
			case Mif2Package.DOCUMENT_PROFILE_KIND:
				return convertDocumentProfileKindToString(eDataType, instanceValue);
			case Mif2Package.DOMAIN_KIND:
				return convertDomainKindToString(eDataType, instanceValue);
			case Mif2Package.DURATION_UNITS_KIND:
				return convertDurationUnitsKindToString(eDataType, instanceValue);
			case Mif2Package.EFFORT_QUANTIFIER_KIND:
				return convertEffortQuantifierKindToString(eDataType, instanceValue);
			case Mif2Package.EXPRESSION_LANGUAGE_KIND:
				return convertExpressionLanguageKindToString(eDataType, instanceValue);
			case Mif2Package.FILTER_KIND:
				return convertFilterKindToString(eDataType, instanceValue);
			case Mif2Package.FUNCTIONALISM:
				return convertFunctionalismToString(eDataType, instanceValue);
			case Mif2Package.ICON_FORMAT_KIND:
				return convertIconFormatKindToString(eDataType, instanceValue);
			case Mif2Package.INTERACTION_KIND:
				return convertInteractionKindToString(eDataType, instanceValue);
			case Mif2Package.INTERACTION_PROFILE_KIND:
				return convertInteractionProfileKindToString(eDataType, instanceValue);
			case Mif2Package.ITS_KIND:
				return convertITSKindToString(eDataType, instanceValue);
			case Mif2Package.MAP_RELATIONSHIP_KIND:
				return convertMapRelationshipKindToString(eDataType, instanceValue);
			case Mif2Package.MODEL_CONFORMANCE_KIND:
				return convertModelConformanceKindToString(eDataType, instanceValue);
			case Mif2Package.NEGATIVE_VOTE_RESOLUTION_KIND:
				return convertNegativeVoteResolutionKindToString(eDataType, instanceValue);
			case Mif2Package.NODE_ORIENTATION:
				return convertNodeOrientationToString(eDataType, instanceValue);
			case Mif2Package.OWNER_SCOPE_KIND:
				return convertOwnerScopeKindToString(eDataType, instanceValue);
			case Mif2Package.PACKAGE_KIND:
				return convertPackageKindToString(eDataType, instanceValue);
			case Mif2Package.PACKAGE_ROOT_KIND:
				return convertPackageRootKindToString(eDataType, instanceValue);
			case Mif2Package.PARENT_ARTIFACT_KIND:
				return convertParentArtifactKindToString(eDataType, instanceValue);
			case Mif2Package.PROPERTY_DEFAULT_HANDLING_KIND:
				return convertPropertyDefaultHandlingKindToString(eDataType, instanceValue);
			case Mif2Package.REFLEXIVITY:
				return convertReflexivityToString(eDataType, instanceValue);
			case Mif2Package.RELATIONSHIP_TRAVERSAL_KIND:
				return convertRelationshipTraversalKindToString(eDataType, instanceValue);
			case Mif2Package.REVISION_FREQUENCY_KIND:
				return convertRevisionFrequencyKindToString(eDataType, instanceValue);
			case Mif2Package.SECTION_KIND:
				return convertSectionKindToString(eDataType, instanceValue);
			case Mif2Package.STATIC_MODEL_DIAGRAM_PRESENTATION_KIND:
				return convertStaticModelDiagramPresentationKindToString(eDataType, instanceValue);
			case Mif2Package.STATIC_MODEL_REPRESENTATION_KIND:
				return convertStaticModelRepresentationKindToString(eDataType, instanceValue);
			case Mif2Package.STATIC_MODEL_USE_KIND:
				return convertStaticModelUseKindToString(eDataType, instanceValue);
			case Mif2Package.SUB_ARTIFACT_KIND:
				return convertSubArtifactKindToString(eDataType, instanceValue);
			case Mif2Package.SUB_SECTION_KIND:
				return convertSubSectionKindToString(eDataType, instanceValue);
			case Mif2Package.SYMMETRY:
				return convertSymmetryToString(eDataType, instanceValue);
			case Mif2Package.TERMINOLOGY_SERVER_KIND:
				return convertTerminologyServerKindToString(eDataType, instanceValue);
			case Mif2Package.TRANSITIVITY:
				return convertTransitivityToString(eDataType, instanceValue);
			case Mif2Package.TRANSLATABLE_DIRECTION_KIND:
				return convertTranslatableDirectionKindToString(eDataType, instanceValue);
			case Mif2Package.UNLIMITED_MULTIPLICITY:
				return convertUnlimitedMultiplicityToString(eDataType, instanceValue);
			case Mif2Package.UPDATE_MODE_KIND:
				return convertUpdateModeKindToString(eDataType, instanceValue);
			case Mif2Package.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			case Mif2Package.VOCABULARY_MODEL_DEFINITION_KIND:
				return convertVocabularyModelDefinitionKindToString(eDataType, instanceValue);
			case Mif2Package.VOTE_COMMENT_KIND:
				return convertVoteCommentKindToString(eDataType, instanceValue);
			case Mif2Package.VOTE_KIND:
				return convertVoteKindToString(eDataType, instanceValue);
			case Mif2Package.AFFILIATE_KIND_OBJECT:
				return convertAffiliateKindObjectToString(eDataType, instanceValue);
			case Mif2Package.AFFIRMATIVE_VOTE_RESOLUTION_KIND_OBJECT:
				return convertAffirmativeVoteResolutionKindObjectToString(eDataType, instanceValue);
			case Mif2Package.ALL_CLASS_NAME:
				return convertAllClassNameToString(eDataType, instanceValue);
			case Mif2Package.ANNOTATION_KIND_OBJECT:
				return convertAnnotationKindObjectToString(eDataType, instanceValue);
			case Mif2Package.APPLICATION_ROLE_RELATIONSHIP_KIND_OBJECT:
				return convertApplicationRoleRelationshipKindObjectToString(eDataType, instanceValue);
			case Mif2Package.APPROVAL_STATUS_KIND_OBJECT:
				return convertApprovalStatusKindObjectToString(eDataType, instanceValue);
			case Mif2Package.ARTIFACT_GROUP_KIND_OBJECT:
				return convertArtifactGroupKindObjectToString(eDataType, instanceValue);
			case Mif2Package.ARTIFACT_KIND_OBJECT:
				return convertArtifactKindObjectToString(eDataType, instanceValue);
			case Mif2Package.ARTIFACT_RENDERING_STYLE_KIND_OBJECT:
				return convertArtifactRenderingStyleKindObjectToString(eDataType, instanceValue);
			case Mif2Package.ATTRIBUTE_PROPERTY_KIND_OBJECT:
				return convertAttributePropertyKindObjectToString(eDataType, instanceValue);
			case Mif2Package.BASIC_FORMAL_NAME:
				return convertBasicFormalNameToString(eDataType, instanceValue);
			case Mif2Package.BASIC_ID:
				return convertBasicIdToString(eDataType, instanceValue);
			case Mif2Package.CASCADING_ANNOTATION_ELEMENT_KIND_OBJECT:
				return convertCascadingAnnotationElementKindObjectToString(eDataType, instanceValue);
			case Mif2Package.CHANGE_REQUEST_STATUS_OBJECT:
				return convertChangeRequestStatusObjectToString(eDataType, instanceValue);
			case Mif2Package.CLASS_PRESENTATION_KIND_OBJECT:
				return convertClassPresentationKindObjectToString(eDataType, instanceValue);
			case Mif2Package.CMET_ATTRIBUTION_KIND_OBJECT:
				return convertCMETAttributionKindObjectToString(eDataType, instanceValue);
			case Mif2Package.CMET_ATTRIBUTION_STRING:
				return convertCMETAttributionStringToString(eDataType, instanceValue);
			case Mif2Package.CMET_ATTRIBUTION_TYPE:
				return convertCMETAttributionTypeToString(eDataType, instanceValue);
			case Mif2Package.CMET_ENTRY_KIND_OBJECT:
				return convertCMETEntryKindObjectToString(eDataType, instanceValue);
			case Mif2Package.CODE_FILTER_EXPRESSION_KIND_OBJECT:
				return convertCodeFilterExpressionKindObjectToString(eDataType, instanceValue);
			case Mif2Package.CODE_STATUS_KIND_OBJECT:
				return convertCodeStatusKindObjectToString(eDataType, instanceValue);
			case Mif2Package.CODING_STRENGTH_KIND_OBJECT:
				return convertCodingStrengthKindObjectToString(eDataType, instanceValue);
			case Mif2Package.COLLAPSED_PACKAGE_ID:
				return convertCollapsedPackageIdToString(eDataType, instanceValue);
			case Mif2Package.CONCEPT_DOMAIN_PROPERTY_KIND_OBJECT:
				return convertConceptDomainPropertyKindObjectToString(eDataType, instanceValue);
			case Mif2Package.CONCEPT_PROPERTY_TYPE_KIND_OBJECT:
				return convertConceptPropertyTypeKindObjectToString(eDataType, instanceValue);
			case Mif2Package.CONCEPT_RELATIONSHIP_KIND_OBJECT:
				return convertConceptRelationshipKindObjectToString(eDataType, instanceValue);
			case Mif2Package.CONCEPT_USE_KIND_OBJECT:
				return convertConceptUseKindObjectToString(eDataType, instanceValue);
			case Mif2Package.CONFORMANCE_KIND_OBJECT:
				return convertConformanceKindObjectToString(eDataType, instanceValue);
			case Mif2Package.CONSTRUCTED_ELEMENT_KIND_OBJECT:
				return convertConstructedElementKindObjectToString(eDataType, instanceValue);
			case Mif2Package.CONTENTS_LEVEL_KIND_OBJECT:
				return convertContentsLevelKindObjectToString(eDataType, instanceValue);
			case Mif2Package.DATATYPE_KIND_OBJECT:
				return convertDatatypeKindObjectToString(eDataType, instanceValue);
			case Mif2Package.DATATYPE_NAME:
				return convertDatatypeNameToString(eDataType, instanceValue);
			case Mif2Package.DATATYPE_OPERATION_KIND_OBJECT:
				return convertDatatypeOperationKindObjectToString(eDataType, instanceValue);
			case Mif2Package.DATATYPE_QUALIFIER_KIND_OBJECT:
				return convertDatatypeQualifierKindObjectToString(eDataType, instanceValue);
			case Mif2Package.DATE_OR_TIMESTAMP:
				return convertDateOrTimestampToString(eDataType, instanceValue);
			case Mif2Package.DECIMAL:
				return convertDecimalToString(eDataType, instanceValue);
			case Mif2Package.DEFAULT_DETERMINER_KIND_OBJECT:
				return convertDefaultDeterminerKindObjectToString(eDataType, instanceValue);
			case Mif2Package.DEFINED_CONTEXT_KIND:
				return convertDefinedContextKindToString(eDataType, instanceValue);
			case Mif2Package.DEFINED_MAPPING_SOURCE_KIND_OBJECT:
				return convertDefinedMappingSourceKindObjectToString(eDataType, instanceValue);
			case Mif2Package.DEFINED_ROLE_KIND_OBJECT:
				return convertDefinedRoleKindObjectToString(eDataType, instanceValue);
			case Mif2Package.DERIVATION_RELATIONSHIP_KIND_OBJECT:
				return convertDerivationRelationshipKindObjectToString(eDataType, instanceValue);
			case Mif2Package.DESIGN_COMMENT_TAG_KIND_OBJECT:
				return convertDesignCommentTagKindObjectToString(eDataType, instanceValue);
			case Mif2Package.DOCUMENT_PROFILE_KIND_OBJECT:
				return convertDocumentProfileKindObjectToString(eDataType, instanceValue);
			case Mif2Package.DOMAIN_KIND_OBJECT:
				return convertDomainKindObjectToString(eDataType, instanceValue);
			case Mif2Package.DURATION_UNITS_KIND_OBJECT:
				return convertDurationUnitsKindObjectToString(eDataType, instanceValue);
			case Mif2Package.EFFORT_QUANTIFIER_KIND_OBJECT:
				return convertEffortQuantifierKindObjectToString(eDataType, instanceValue);
			case Mif2Package.EMAIL:
				return convertEMailToString(eDataType, instanceValue);
			case Mif2Package.ENUMERATION_STRING:
				return convertEnumerationStringToString(eDataType, instanceValue);
			case Mif2Package.ENUMERATION_TOKEN:
				return convertEnumerationTokenToString(eDataType, instanceValue);
			case Mif2Package.EXPRESSION_LANGUAGE_KIND_OBJECT:
				return convertExpressionLanguageKindObjectToString(eDataType, instanceValue);
			case Mif2Package.FILTER_KIND_OBJECT:
				return convertFilterKindObjectToString(eDataType, instanceValue);
			case Mif2Package.FORMAL_PROPER_NAME:
				return convertFormalProperNameToString(eDataType, instanceValue);
			case Mif2Package.FORMAL_PROPERTY_NAME:
				return convertFormalPropertyNameToString(eDataType, instanceValue);
			case Mif2Package.FUNCTIONALISM_OBJECT:
				return convertFunctionalismObjectToString(eDataType, instanceValue);
			case Mif2Package.GRAPHIC_MEASUREMENT:
				return convertGraphicMeasurementToString(eDataType, instanceValue);
			case Mif2Package.HASH_CODE:
				return convertHashCodeToString(eDataType, instanceValue);
			case Mif2Package.ICON_FORMAT_KIND_OBJECT:
				return convertIconFormatKindObjectToString(eDataType, instanceValue);
			case Mif2Package.INTERACTION_KIND_OBJECT:
				return convertInteractionKindObjectToString(eDataType, instanceValue);
			case Mif2Package.INTERACTION_PROFILE_KIND_OBJECT:
				return convertInteractionProfileKindObjectToString(eDataType, instanceValue);
			case Mif2Package.ITS_KIND_OBJECT:
				return convertITSKindObjectToString(eDataType, instanceValue);
			case Mif2Package.LOCAL_FILE_REFERENCE:
				return convertLocalFileReferenceToString(eDataType, instanceValue);
			case Mif2Package.LONG_DESCRIPTIVE_NAME:
				return convertLongDescriptiveNameToString(eDataType, instanceValue);
			case Mif2Package.LOWER_CAMEL_CASE:
				return convertLowerCamelCaseToString(eDataType, instanceValue);
			case Mif2Package.MAPPING_SOURCE_KIND:
				return convertMappingSourceKindToString(eDataType, instanceValue);
			case Mif2Package.MAP_RELATIONSHIP_KIND_OBJECT:
				return convertMapRelationshipKindObjectToString(eDataType, instanceValue);
			case Mif2Package.MIME_TYPE:
				return convertMimeTypeToString(eDataType, instanceValue);
			case Mif2Package.MODEL_CONFORMANCE_KIND_OBJECT:
				return convertModelConformanceKindObjectToString(eDataType, instanceValue);
			case Mif2Package.NEGATIVE_VOTE_RESOLUTION_KIND_OBJECT:
				return convertNegativeVoteResolutionKindObjectToString(eDataType, instanceValue);
			case Mif2Package.NODE_ORIENTATION_OBJECT:
				return convertNodeOrientationObjectToString(eDataType, instanceValue);
			case Mif2Package.NON_EMPTY_STRING:
				return convertNonEmptyStringToString(eDataType, instanceValue);
			case Mif2Package.NON_NEGATIVE_DECIMAL:
				return convertNonNegativeDecimalToString(eDataType, instanceValue);
			case Mif2Package.OID:
				return convertOidToString(eDataType, instanceValue);
			case Mif2Package.OWNER_SCOPE_KIND_OBJECT:
				return convertOwnerScopeKindObjectToString(eDataType, instanceValue);
			case Mif2Package.PACKAGE_KIND_OBJECT:
				return convertPackageKindObjectToString(eDataType, instanceValue);
			case Mif2Package.PACKAGE_ROOT_KIND_OBJECT:
				return convertPackageRootKindObjectToString(eDataType, instanceValue);
			case Mif2Package.PARENT_ARTIFACT_KIND_OBJECT:
				return convertParentArtifactKindObjectToString(eDataType, instanceValue);
			case Mif2Package.POSITIVE_DECIMAL:
				return convertPositiveDecimalToString(eDataType, instanceValue);
			case Mif2Package.PREFIXED_UPPER_CAMEL_CASE:
				return convertPrefixedUpperCamelCaseToString(eDataType, instanceValue);
			case Mif2Package.PROPERTY_DEFAULT_HANDLING_KIND_OBJECT:
				return convertPropertyDefaultHandlingKindObjectToString(eDataType, instanceValue);
			case Mif2Package.REALM_KIND:
				return convertRealmKindToString(eDataType, instanceValue);
			case Mif2Package.REALM_NAMESPACE_KIND:
				return convertRealmNamespaceKindToString(eDataType, instanceValue);
			case Mif2Package.REFLEXIVITY_OBJECT:
				return convertReflexivityObjectToString(eDataType, instanceValue);
			case Mif2Package.RELATIONSHIP_TRAVERSAL_KIND_OBJECT:
				return convertRelationshipTraversalKindObjectToString(eDataType, instanceValue);
			case Mif2Package.REVISION_FREQUENCY_KIND_OBJECT:
				return convertRevisionFrequencyKindObjectToString(eDataType, instanceValue);
			case Mif2Package.ROLE_KIND:
				return convertRoleKindToString(eDataType, instanceValue);
			case Mif2Package.SECTION_KIND_OBJECT:
				return convertSectionKindObjectToString(eDataType, instanceValue);
			case Mif2Package.SHORT_DESCRIPTIVE_NAME:
				return convertShortDescriptiveNameToString(eDataType, instanceValue);
			case Mif2Package.SHORT_STRING:
				return convertShortStringToString(eDataType, instanceValue);
			case Mif2Package.SINGLE_NON_NEGATIVE_INTEGER:
				return convertSingleNonNegativeIntegerToString(eDataType, instanceValue);
			case Mif2Package.SMALL_NON_NEGATIVE_INTEGER:
				return convertSmallNonNegativeIntegerToString(eDataType, instanceValue);
			case Mif2Package.SMALL_POSITIVE_INTEGER:
				return convertSmallPositiveIntegerToString(eDataType, instanceValue);
			case Mif2Package.STATIC_MODEL_DIAGRAM_PRESENTATION_KIND_OBJECT:
				return convertStaticModelDiagramPresentationKindObjectToString(eDataType, instanceValue);
			case Mif2Package.STATIC_MODEL_REPRESENTATION_KIND_OBJECT:
				return convertStaticModelRepresentationKindObjectToString(eDataType, instanceValue);
			case Mif2Package.STATIC_MODEL_USE_KIND_OBJECT:
				return convertStaticModelUseKindObjectToString(eDataType, instanceValue);
			case Mif2Package.SUB_ARTIFACT_KIND_OBJECT:
				return convertSubArtifactKindObjectToString(eDataType, instanceValue);
			case Mif2Package.SUB_SECTION_KIND_OBJECT:
				return convertSubSectionKindObjectToString(eDataType, instanceValue);
			case Mif2Package.SYMMETRY_OBJECT:
				return convertSymmetryObjectToString(eDataType, instanceValue);
			case Mif2Package.TEMPLATE_ID:
				return convertTemplateIdToString(eDataType, instanceValue);
			case Mif2Package.TERMINOLOGY_SERVER_KIND_OBJECT:
				return convertTerminologyServerKindObjectToString(eDataType, instanceValue);
			case Mif2Package.TRANSITIVITY_OBJECT:
				return convertTransitivityObjectToString(eDataType, instanceValue);
			case Mif2Package.TRANSLATABLE_DIRECTION_KIND_OBJECT:
				return convertTranslatableDirectionKindObjectToString(eDataType, instanceValue);
			case Mif2Package.UNLIMITED_INTEGER:
				return convertUnlimitedIntegerToString(eDataType, instanceValue);
			case Mif2Package.UNLIMITED_MULTIPLICITY_OBJECT:
				return convertUnlimitedMultiplicityObjectToString(eDataType, instanceValue);
			case Mif2Package.UPDATE_MODE_CODES:
				return convertUpdateModeCodesToString(eDataType, instanceValue);
			case Mif2Package.UPDATE_MODE_KIND_OBJECT:
				return convertUpdateModeKindObjectToString(eDataType, instanceValue);
			case Mif2Package.UPPER_CAMEL_CASE:
				return convertUpperCamelCaseToString(eDataType, instanceValue);
			case Mif2Package.URI:
				return convertUriToString(eDataType, instanceValue);
			case Mif2Package.URL:
				return convertUrlToString(eDataType, instanceValue);
			case Mif2Package.UUID:
				return convertUuidToString(eDataType, instanceValue);
			case Mif2Package.VERSION:
				return convertVersionToString(eDataType, instanceValue);
			case Mif2Package.VISIBILITY_KIND_OBJECT:
				return convertVisibilityKindObjectToString(eDataType, instanceValue);
			case Mif2Package.VOCABULARY_MODEL_DEFINITION_KIND_OBJECT:
				return convertVocabularyModelDefinitionKindObjectToString(eDataType, instanceValue);
			case Mif2Package.VOTE_COMMENT_KIND_OBJECT:
				return convertVoteCommentKindObjectToString(eDataType, instanceValue);
			case Mif2Package.VOTE_KIND_OBJECT:
				return convertVoteKindObjectToString(eDataType, instanceValue);
			case Mif2Package.VOTE_RESOLUTION_KIND:
				return convertVoteResolutionKindToString(eDataType, instanceValue);
			case Mif2Package.XDOMAIN_NAME:
				return convertXDomainNameToString(eDataType, instanceValue);
			case Mif2Package.YEAR:
				return convertYearToString(eDataType, instanceValue);
			case Mif2Package.YEARS:
				return convertYearsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddElementContent createAddElementContent() {
		AddElementContentImpl addElementContent = new AddElementContentImpl();
		return addElementContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationCascadeInfo createAnnotationCascadeInfo() {
		AnnotationCascadeInfoImpl annotationCascadeInfo = new AnnotationCascadeInfoImpl();
		return annotationCascadeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationDerivation createAnnotationDerivation() {
		AnnotationDerivationImpl annotationDerivation = new AnnotationDerivationImpl();
		return annotationDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appendix createAppendix() {
		AppendixImpl appendix = new AppendixImpl();
		return appendix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppInfo createAppInfo() {
		AppInfoImpl appInfo = new AppInfoImpl();
		return appInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRole createApplicationRole() {
		ApplicationRoleImpl applicationRole = new ApplicationRoleImpl();
		return applicationRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRoleAnnotations createApplicationRoleAnnotations() {
		ApplicationRoleAnnotationsImpl applicationRoleAnnotations = new ApplicationRoleAnnotationsImpl();
		return applicationRoleAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRoleAppInfo createApplicationRoleAppInfo() {
		ApplicationRoleAppInfoImpl applicationRoleAppInfo = new ApplicationRoleAppInfoImpl();
		return applicationRoleAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRoleDocumentation createApplicationRoleDocumentation() {
		ApplicationRoleDocumentationImpl applicationRoleDocumentation = new ApplicationRoleDocumentationImpl();
		return applicationRoleDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliedTemplateGroup createAppliedTemplateGroup() {
		AppliedTemplateGroupImpl appliedTemplateGroup = new AppliedTemplateGroupImpl();
		return appliedTemplateGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalInfo createApprovalInfo() {
		ApprovalInfoImpl approvalInfo = new ApprovalInfoImpl();
		return approvalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactCrossReference createArtifactCrossReference() {
		ArtifactCrossReferenceImpl artifactCrossReference = new ArtifactCrossReferenceImpl();
		return artifactCrossReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactDependency createArtifactDependency() {
		ArtifactDependencyImpl artifactDependency = new ArtifactDependencyImpl();
		return artifactDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactSupplement createArtifactSupplement() {
		ArtifactSupplementImpl artifactSupplement = new ArtifactSupplementImpl();
		return artifactSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactSupplementAnnotations createArtifactSupplementAnnotations() {
		ArtifactSupplementAnnotationsImpl artifactSupplementAnnotations = new ArtifactSupplementAnnotationsImpl();
		return artifactSupplementAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactSupplementAppInfo createArtifactSupplementAppInfo() {
		ArtifactSupplementAppInfoImpl artifactSupplementAppInfo = new ArtifactSupplementAppInfoImpl();
		return artifactSupplementAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactSupplementDocumentation createArtifactSupplementDocumentation() {
		ArtifactSupplementDocumentationImpl artifactSupplementDocumentation = new ArtifactSupplementDocumentationImpl();
		return artifactSupplementDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactXRefSummary createArtifactXRefSummary() {
		ArtifactXRefSummaryImpl artifactXRefSummary = new ArtifactXRefSummaryImpl();
		return artifactXRefSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationAnnotations createAssociationAnnotations() {
		AssociationAnnotationsImpl associationAnnotations = new AssociationAnnotationsImpl();
		return associationAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationAppInfo createAssociationAppInfo() {
		AssociationAppInfoImpl associationAppInfo = new AssociationAppInfoImpl();
		return associationAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationBase createAssociationBase() {
		AssociationBaseImpl associationBase = new AssociationBaseImpl();
		return associationBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationDocumentation createAssociationDocumentation() {
		AssociationDocumentationImpl associationDocumentation = new AssociationDocumentationImpl();
		return associationDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEnd createAssociationEnd() {
		AssociationEndImpl associationEnd = new AssociationEndImpl();
		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEndAnnotations createAssociationEndAnnotations() {
		AssociationEndAnnotationsImpl associationEndAnnotations = new AssociationEndAnnotationsImpl();
		return associationEndAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEndAppInfo createAssociationEndAppInfo() {
		AssociationEndAppInfoImpl associationEndAppInfo = new AssociationEndAppInfoImpl();
		return associationEndAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEndBase createAssociationEndBase() {
		AssociationEndBaseImpl associationEndBase = new AssociationEndBaseImpl();
		return associationEndBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEndDerivation createAssociationEndDerivation() {
		AssociationEndDerivationImpl associationEndDerivation = new AssociationEndDerivationImpl();
		return associationEndDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEndDocumentation createAssociationEndDocumentation() {
		AssociationEndDocumentationImpl associationEndDocumentation = new AssociationEndDocumentationImpl();
		return associationEndDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEndSpecialization createAssociationEndSpecialization() {
		AssociationEndSpecializationImpl associationEndSpecialization = new AssociationEndSpecializationImpl();
		return associationEndSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEndWithClass createAssociationEndWithClass() {
		AssociationEndWithClassImpl associationEndWithClass = new AssociationEndWithClassImpl();
		return associationEndWithClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEndWithClassRef createAssociationEndWithClassRef() {
		AssociationEndWithClassRefImpl associationEndWithClassRef = new AssociationEndWithClassRefImpl();
		return associationEndWithClassRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAnnotations createAttributeAnnotations() {
		AttributeAnnotationsImpl attributeAnnotations = new AttributeAnnotationsImpl();
		return attributeAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAppInfo createAttributeAppInfo() {
		AttributeAppInfoImpl attributeAppInfo = new AttributeAppInfoImpl();
		return attributeAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeContent createAttributeContent() {
		AttributeContentImpl attributeContent = new AttributeContentImpl();
		return attributeContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDerivation createAttributeDerivation() {
		AttributeDerivationImpl attributeDerivation = new AttributeDerivationImpl();
		return attributeDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDocumentation createAttributeDocumentation() {
		AttributeDocumentationImpl attributeDocumentation = new AttributeDocumentationImpl();
		return attributeDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeProperty createAttributeProperty() {
		AttributePropertyImpl attributeProperty = new AttributePropertyImpl();
		return attributeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRef createAttributeRef() {
		AttributeRefImpl attributeRef = new AttributeRefImpl();
		return attributeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueRef createAttributeValueRef() {
		AttributeValueRefImpl attributeValueRef = new AttributeValueRefImpl();
		return attributeValueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BallotComment createBallotComment() {
		BallotCommentImpl ballotComment = new BallotCommentImpl();
		return ballotComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BallotCommentResolution createBallotCommentResolution() {
		BallotCommentResolutionImpl ballotCommentResolution = new BallotCommentResolutionImpl();
		return ballotCommentResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BallotSubmission createBallotSubmission() {
		BallotSubmissionImpl ballotSubmission = new BallotSubmissionImpl();
		return ballotSubmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicAnnotation createBasicAnnotation() {
		BasicAnnotationImpl basicAnnotation = new BasicAnnotationImpl();
		return basicAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingRealm createBindingRealm() {
		BindingRealmImpl bindingRealm = new BindingRealmImpl();
		return bindingRealm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundStaticModel createBoundStaticModel() {
		BoundStaticModelImpl boundStaticModel = new BoundStaticModelImpl();
		return boundStaticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessName createBusinessName() {
		BusinessNameImpl businessName = new BusinessNameImpl();
		return businessName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CascadableAnnotation createCascadableAnnotation() {
		CascadableAnnotationImpl cascadableAnnotation = new CascadableAnnotationImpl();
		return cascadableAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRequest createChangeRequest() {
		ChangeRequestImpl changeRequest = new ChangeRequestImpl();
		return changeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRequestEstimate createChangeRequestEstimate() {
		ChangeRequestEstimateImpl changeRequestEstimate = new ChangeRequestEstimateImpl();
		return changeRequestEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAnnotations createClassAnnotations() {
		ClassAnnotationsImpl classAnnotations = new ClassAnnotationsImpl();
		return classAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassAppInfo createClassAppInfo() {
		ClassAppInfoImpl classAppInfo = new ClassAppInfoImpl();
		return classAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassBindingArgument createClassBindingArgument() {
		ClassBindingArgumentImpl classBindingArgument = new ClassBindingArgumentImpl();
		return classBindingArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassBindingArgumentBase createClassBindingArgumentBase() {
		ClassBindingArgumentBaseImpl classBindingArgumentBase = new ClassBindingArgumentBaseImpl();
		return classBindingArgumentBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDerivation createClassDerivation() {
		ClassDerivationImpl classDerivation = new ClassDerivationImpl();
		return classDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDocumentation createClassDocumentation() {
		ClassDocumentationImpl classDocumentation = new ClassDocumentationImpl();
		return classDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassElement createClassElement() {
		ClassElementImpl classElement = new ClassElementImpl();
		return classElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassGeneralization createClassGeneralization() {
		ClassGeneralizationImpl classGeneralization = new ClassGeneralizationImpl();
		return classGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassGraphicInformation createClassGraphicInformation() {
		ClassGraphicInformationImpl classGraphicInformation = new ClassGraphicInformationImpl();
		return classGraphicInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier createClassifier() {
		ClassifierImpl classifier = new ClassifierImpl();
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOrReference createClassOrReference() {
		ClassOrReferenceImpl classOrReference = new ClassOrReferenceImpl();
		return classOrReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassRef createClassRef() {
		ClassRefImpl classRef = new ClassRefImpl();
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassStubInterface createClassStubInterface() {
		ClassStubInterfaceImpl classStubInterface = new ClassStubInterfaceImpl();
		return classStubInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassStubInterfaceAnnotations createClassStubInterfaceAnnotations() {
		ClassStubInterfaceAnnotationsImpl classStubInterfaceAnnotations = new ClassStubInterfaceAnnotationsImpl();
		return classStubInterfaceAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassStubInterfaceAppInfo createClassStubInterfaceAppInfo() {
		ClassStubInterfaceAppInfoImpl classStubInterfaceAppInfo = new ClassStubInterfaceAppInfoImpl();
		return classStubInterfaceAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassStubInterfaceDocumentation createClassStubInterfaceDocumentation() {
		ClassStubInterfaceDocumentationImpl classStubInterfaceDocumentation = new ClassStubInterfaceDocumentationImpl();
		return classStubInterfaceDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBasedContentDefinition createCodeBasedContentDefinition() {
		CodeBasedContentDefinitionImpl codeBasedContentDefinition = new CodeBasedContentDefinitionImpl();
		return codeBasedContentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFilterContentDefinition createCodeFilterContentDefinition() {
		CodeFilterContentDefinitionImpl codeFilterContentDefinition = new CodeFilterContentDefinitionImpl();
		return codeFilterContentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeIcon createCodeIcon() {
		CodeIconImpl codeIcon = new CodeIconImpl();
		return codeIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSupplement createCodeSupplement() {
		CodeSupplementImpl codeSupplement = new CodeSupplementImpl();
		return codeSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystem createCodeSystem() {
		CodeSystemImpl codeSystem = new CodeSystemImpl();
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemAnnotations createCodeSystemAnnotations() {
		CodeSystemAnnotationsImpl codeSystemAnnotations = new CodeSystemAnnotationsImpl();
		return codeSystemAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemAppInfo createCodeSystemAppInfo() {
		CodeSystemAppInfoImpl codeSystemAppInfo = new CodeSystemAppInfoImpl();
		return codeSystemAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemDocumentation createCodeSystemDocumentation() {
		CodeSystemDocumentationImpl codeSystemDocumentation = new CodeSystemDocumentationImpl();
		return codeSystemDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemRef createCodeSystemRef() {
		CodeSystemRefImpl codeSystemRef = new CodeSystemRefImpl();
		return codeSystemRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemSupplement createCodeSystemSupplement() {
		CodeSystemSupplementImpl codeSystemSupplement = new CodeSystemSupplementImpl();
		return codeSystemSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemVersion createCodeSystemVersion() {
		CodeSystemVersionImpl codeSystemVersion = new CodeSystemVersionImpl();
		return codeSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemVersionAnnotations createCodeSystemVersionAnnotations() {
		CodeSystemVersionAnnotationsImpl codeSystemVersionAnnotations = new CodeSystemVersionAnnotationsImpl();
		return codeSystemVersionAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemVersionAppInfo createCodeSystemVersionAppInfo() {
		CodeSystemVersionAppInfoImpl codeSystemVersionAppInfo = new CodeSystemVersionAppInfoImpl();
		return codeSystemVersionAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemVersionDocumentation createCodeSystemVersionDocumentation() {
		CodeSystemVersionDocumentationImpl codeSystemVersionDocumentation = new CodeSystemVersionDocumentationImpl();
		return codeSystemVersionDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemVersionSupplement createCodeSystemVersionSupplement() {
		CodeSystemVersionSupplementImpl codeSystemVersionSupplement = new CodeSystemVersionSupplementImpl();
		return codeSystemVersionSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeTranslation createCodeTranslation() {
		CodeTranslationImpl codeTranslation = new CodeTranslationImpl();
		return codeTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeTranslationAnnotations createCodeTranslationAnnotations() {
		CodeTranslationAnnotationsImpl codeTranslationAnnotations = new CodeTranslationAnnotationsImpl();
		return codeTranslationAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeTranslationAppInfo createCodeTranslationAppInfo() {
		CodeTranslationAppInfoImpl codeTranslationAppInfo = new CodeTranslationAppInfoImpl();
		return codeTranslationAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeTranslationCollection createCodeTranslationCollection() {
		CodeTranslationCollectionImpl codeTranslationCollection = new CodeTranslationCollectionImpl();
		return codeTranslationCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeTranslationCollectionAnnotations createCodeTranslationCollectionAnnotations() {
		CodeTranslationCollectionAnnotationsImpl codeTranslationCollectionAnnotations = new CodeTranslationCollectionAnnotationsImpl();
		return codeTranslationCollectionAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeTranslationCollectionAppInfo createCodeTranslationCollectionAppInfo() {
		CodeTranslationCollectionAppInfoImpl codeTranslationCollectionAppInfo = new CodeTranslationCollectionAppInfoImpl();
		return codeTranslationCollectionAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeTranslationCollectionDocumentation createCodeTranslationCollectionDocumentation() {
		CodeTranslationCollectionDocumentationImpl codeTranslationCollectionDocumentation = new CodeTranslationCollectionDocumentationImpl();
		return codeTranslationCollectionDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeTranslationDocumentation createCodeTranslationDocumentation() {
		CodeTranslationDocumentationImpl codeTranslationDocumentation = new CodeTranslationDocumentationImpl();
		return codeTranslationDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedContentDefinition createCombinedContentDefinition() {
		CombinedContentDefinitionImpl combinedContentDefinition = new CombinedContentDefinitionImpl();
		return combinedContentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitteeReference createCommitteeReference() {
		CommitteeReferenceImpl committeeReference = new CommitteeReferenceImpl();
		return committeeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonModelElementDefinition createCommonModelElementDefinition() {
		CommonModelElementDefinitionImpl commonModelElementDefinition = new CommonModelElementDefinitionImpl();
		return commonModelElementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonModelElementRef createCommonModelElementRef() {
		CommonModelElementRefImpl commonModelElementRef = new CommonModelElementRefImpl();
		return commonModelElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonModelElementRefAnnotations createCommonModelElementRefAnnotations() {
		CommonModelElementRefAnnotationsImpl commonModelElementRefAnnotations = new CommonModelElementRefAnnotationsImpl();
		return commonModelElementRefAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonModelElementRefAppInfo createCommonModelElementRefAppInfo() {
		CommonModelElementRefAppInfoImpl commonModelElementRefAppInfo = new CommonModelElementRefAppInfoImpl();
		return commonModelElementRefAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonModelElementRefBase createCommonModelElementRefBase() {
		CommonModelElementRefBaseImpl commonModelElementRefBase = new CommonModelElementRefBaseImpl();
		return commonModelElementRefBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonModelElementRefDocumentation createCommonModelElementRefDocumentation() {
		CommonModelElementRefDocumentationImpl commonModelElementRefDocumentation = new CommonModelElementRefDocumentationImpl();
		return commonModelElementRefDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMarkupWithLanguage createComplexMarkupWithLanguage() {
		ComplexMarkupWithLanguageImpl complexMarkupWithLanguage = new ComplexMarkupWithLanguageImpl();
		return complexMarkupWithLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept createConcept() {
		ConceptImpl concept = new ConceptImpl();
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptAnnotations createConceptAnnotations() {
		ConceptAnnotationsImpl conceptAnnotations = new ConceptAnnotationsImpl();
		return conceptAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptAppInfo createConceptAppInfo() {
		ConceptAppInfoImpl conceptAppInfo = new ConceptAppInfoImpl();
		return conceptAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDocumentation createConceptDocumentation() {
		ConceptDocumentationImpl conceptDocumentation = new ConceptDocumentationImpl();
		return conceptDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomain createConceptDomain() {
		ConceptDomainImpl conceptDomain = new ConceptDomainImpl();
		return conceptDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomainAnnotations createConceptDomainAnnotations() {
		ConceptDomainAnnotationsImpl conceptDomainAnnotations = new ConceptDomainAnnotationsImpl();
		return conceptDomainAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomainAppInfo createConceptDomainAppInfo() {
		ConceptDomainAppInfoImpl conceptDomainAppInfo = new ConceptDomainAppInfoImpl();
		return conceptDomainAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomainDocumentation createConceptDomainDocumentation() {
		ConceptDomainDocumentationImpl conceptDomainDocumentation = new ConceptDomainDocumentationImpl();
		return conceptDomainDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomainProperty createConceptDomainProperty() {
		ConceptDomainPropertyImpl conceptDomainProperty = new ConceptDomainPropertyImpl();
		return conceptDomainProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomainRef createConceptDomainRef() {
		ConceptDomainRefImpl conceptDomainRef = new ConceptDomainRefImpl();
		return conceptDomainRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptProperty createConceptProperty() {
		ConceptPropertyImpl conceptProperty = new ConceptPropertyImpl();
		return conceptProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptPropertyRef createConceptPropertyRef() {
		ConceptPropertyRefImpl conceptPropertyRef = new ConceptPropertyRefImpl();
		return conceptPropertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptRef createConceptRef() {
		ConceptRefImpl conceptRef = new ConceptRefImpl();
		return conceptRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptRelationship createConceptRelationship() {
		ConceptRelationshipImpl conceptRelationship = new ConceptRelationshipImpl();
		return conceptRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptSupplement createConceptSupplement() {
		ConceptSupplementImpl conceptSupplement = new ConceptSupplementImpl();
		return conceptSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptSupplementAnnotations createConceptSupplementAnnotations() {
		ConceptSupplementAnnotationsImpl conceptSupplementAnnotations = new ConceptSupplementAnnotationsImpl();
		return conceptSupplementAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptSupplementAppInfo createConceptSupplementAppInfo() {
		ConceptSupplementAppInfoImpl conceptSupplementAppInfo = new ConceptSupplementAppInfoImpl();
		return conceptSupplementAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptSupplementDocumentation createConceptSupplementDocumentation() {
		ConceptSupplementDocumentationImpl conceptSupplementDocumentation = new ConceptSupplementDocumentationImpl();
		return conceptSupplementDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptUse createConceptUse() {
		ConceptUseImpl conceptUse = new ConceptUseImpl();
		return conceptUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceProfile createConformanceProfile() {
		ConformanceProfileImpl conformanceProfile = new ConformanceProfileImpl();
		return conformanceProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceProfileAnnotations createConformanceProfileAnnotations() {
		ConformanceProfileAnnotationsImpl conformanceProfileAnnotations = new ConformanceProfileAnnotationsImpl();
		return conformanceProfileAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceProfileAppInfo createConformanceProfileAppInfo() {
		ConformanceProfileAppInfoImpl conformanceProfileAppInfo = new ConformanceProfileAppInfoImpl();
		return conformanceProfileAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceProfileDocumentation createConformanceProfileDocumentation() {
		ConformanceProfileDocumentationImpl conformanceProfileDocumentation = new ConformanceProfileDocumentationImpl();
		return conformanceProfileDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceTriggerEvents createConformanceTriggerEvents() {
		ConformanceTriggerEventsImpl conformanceTriggerEvents = new ConformanceTriggerEventsImpl();
		return conformanceTriggerEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedGraphNode createContainedGraphNode() {
		ContainedGraphNodeImpl containedGraphNode = new ContainedGraphNodeImpl();
		return containedGraphNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinition createContentDefinition() {
		ContentDefinitionImpl contentDefinition = new ContentDefinitionImpl();
		return contentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinitionAnnotations createContentDefinitionAnnotations() {
		ContentDefinitionAnnotationsImpl contentDefinitionAnnotations = new ContentDefinitionAnnotationsImpl();
		return contentDefinitionAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinitionAppInfo createContentDefinitionAppInfo() {
		ContentDefinitionAppInfoImpl contentDefinitionAppInfo = new ContentDefinitionAppInfoImpl();
		return contentDefinitionAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentDefinitionDocumentation createContentDefinitionDocumentation() {
		ContentDefinitionDocumentationImpl contentDefinitionDocumentation = new ContentDefinitionDocumentationImpl();
		return contentDefinitionDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextAnnotation createContextAnnotation() {
		ContextAnnotationImpl contextAnnotation = new ContextAnnotationImpl();
		return contextAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextBinding createContextBinding() {
		ContextBindingImpl contextBinding = new ContextBindingImpl();
		return contextBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contributor createContributor() {
		ContributorImpl contributor = new ContributorImpl();
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatype() {
		DatatypeImpl datatype = new DatatypeImpl();
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeAnnotations createDatatypeAnnotations() {
		DatatypeAnnotationsImpl datatypeAnnotations = new DatatypeAnnotationsImpl();
		return datatypeAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeAppInfo createDatatypeAppInfo() {
		DatatypeAppInfoImpl datatypeAppInfo = new DatatypeAppInfoImpl();
		return datatypeAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeBinding createDatatypeBinding() {
		DatatypeBindingImpl datatypeBinding = new DatatypeBindingImpl();
		return datatypeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDerivation createDatatypeDerivation() {
		DatatypeDerivationImpl datatypeDerivation = new DatatypeDerivationImpl();
		return datatypeDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDocumentation createDatatypeDocumentation() {
		DatatypeDocumentationImpl datatypeDocumentation = new DatatypeDocumentationImpl();
		return datatypeDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeImport createDatatypeImport() {
		DatatypeImportImpl datatypeImport = new DatatypeImportImpl();
		return datatypeImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeLimitation createDatatypeLimitation() {
		DatatypeLimitationImpl datatypeLimitation = new DatatypeLimitationImpl();
		return datatypeLimitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeModelLibrary createDatatypeModelLibrary() {
		DatatypeModelLibraryImpl datatypeModelLibrary = new DatatypeModelLibraryImpl();
		return datatypeModelLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeOperation createDatatypeOperation() {
		DatatypeOperationImpl datatypeOperation = new DatatypeOperationImpl();
		return datatypeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeParameter createDatatypeParameter() {
		DatatypeParameterImpl datatypeParameter = new DatatypeParameterImpl();
		return datatypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeRef createDatatypeRef() {
		DatatypeRefImpl datatypeRef = new DatatypeRefImpl();
		return datatypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeTemplateParameter createDatatypeTemplateParameter() {
		DatatypeTemplateParameterImpl datatypeTemplateParameter = new DatatypeTemplateParameterImpl();
		return datatypeTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeprecationInfo createDeprecationInfo() {
		DeprecationInfoImpl deprecationInfo = new DeprecationInfoImpl();
		return deprecationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedStaticModel createDerivedStaticModel() {
		DerivedStaticModelImpl derivedStaticModel = new DerivedStaticModelImpl();
		return derivedStaticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedStaticModelsType createDerivedStaticModelsType() {
		DerivedStaticModelsTypeImpl derivedStaticModelsType = new DerivedStaticModelsTypeImpl();
		return derivedStaticModelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignComment createDesignComment() {
		DesignCommentImpl designComment = new DesignCommentImpl();
		return designComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramGraphicInformation createDiagramGraphicInformation() {
		DiagramGraphicInformationImpl diagramGraphicInformation = new DiagramGraphicInformationImpl();
		return diagramGraphicInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentProfile createDocumentProfile() {
		DocumentProfileImpl documentProfile = new DocumentProfileImpl();
		return documentProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentProfileAppInfo createDocumentProfileAppInfo() {
		DocumentProfileAppInfoImpl documentProfileAppInfo = new DocumentProfileAppInfoImpl();
		return documentProfileAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentProfileDocumentation createDocumentProfileDocumentation() {
		DocumentProfileDocumentationImpl documentProfileDocumentation = new DocumentProfileDocumentationImpl();
		return documentProfileDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentTest createDocumentTest() {
		DocumentTestImpl documentTest = new DocumentTestImpl();
		return documentTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAnalysisModel createDomainAnalysisModel() {
		DomainAnalysisModelImpl domainAnalysisModel = new DomainAnalysisModelImpl();
		return domainAnalysisModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAnalysisModelAnnotations createDomainAnalysisModelAnnotations() {
		DomainAnalysisModelAnnotationsImpl domainAnalysisModelAnnotations = new DomainAnalysisModelAnnotationsImpl();
		return domainAnalysisModelAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAnalysisModelAppInfo createDomainAnalysisModelAppInfo() {
		DomainAnalysisModelAppInfoImpl domainAnalysisModelAppInfo = new DomainAnalysisModelAppInfoImpl();
		return domainAnalysisModelAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAnalysisModelDocumentation createDomainAnalysisModelDocumentation() {
		DomainAnalysisModelDocumentationImpl domainAnalysisModelDocumentation = new DomainAnalysisModelDocumentationImpl();
		return domainAnalysisModelDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainInstanceExample createDomainInstanceExample() {
		DomainInstanceExampleImpl domainInstanceExample = new DomainInstanceExampleImpl();
		return domainInstanceExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainInstanceExampleAnnotations createDomainInstanceExampleAnnotations() {
		DomainInstanceExampleAnnotationsImpl domainInstanceExampleAnnotations = new DomainInstanceExampleAnnotationsImpl();
		return domainInstanceExampleAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainInstanceExampleAppInfo createDomainInstanceExampleAppInfo() {
		DomainInstanceExampleAppInfoImpl domainInstanceExampleAppInfo = new DomainInstanceExampleAppInfoImpl();
		return domainInstanceExampleAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainInstanceExampleDocumentation createDomainInstanceExampleDocumentation() {
		DomainInstanceExampleDocumentationImpl domainInstanceExampleDocumentation = new DomainInstanceExampleDocumentationImpl();
		return domainInstanceExampleDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementChange createElementChange() {
		ElementChangeImpl elementChange = new ElementChangeImpl();
		return elementChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDerivation createElementDerivation() {
		ElementDerivationImpl elementDerivation = new ElementDerivationImpl();
		return elementDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementRef createElementRef() {
		ElementRefImpl elementRef = new ElementRefImpl();
		return elementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementValueRef createElementValueRef() {
		ElementValueRefImpl elementValueRef = new ElementValueRefImpl();
		return elementValueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint createEntryPoint() {
		EntryPointImpl entryPoint = new EntryPointImpl();
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointAnnotations createEntryPointAnnotations() {
		EntryPointAnnotationsImpl entryPointAnnotations = new EntryPointAnnotationsImpl();
		return entryPointAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointAppInfo createEntryPointAppInfo() {
		EntryPointAppInfoImpl entryPointAppInfo = new EntryPointAppInfoImpl();
		return entryPointAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointBase createEntryPointBase() {
		EntryPointBaseImpl entryPointBase = new EntryPointBaseImpl();
		return entryPointBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointDocumentation createEntryPointDocumentation() {
		EntryPointDocumentationImpl entryPointDocumentation = new EntryPointDocumentationImpl();
		return entryPointDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentalOccurrence createEnvironmentalOccurrence() {
		EnvironmentalOccurrenceImpl environmentalOccurrence = new EnvironmentalOccurrenceImpl();
		return environmentalOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleInteraction createExampleInteraction() {
		ExampleInteractionImpl exampleInteraction = new ExampleInteractionImpl();
		return exampleInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleSystem createExampleSystem() {
		ExampleSystemImpl exampleSystem = new ExampleSystemImpl();
		return exampleSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleType createExampleType() {
		ExampleTypeImpl exampleType = new ExampleTypeImpl();
		return exampleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatClass createFlatClass() {
		FlatClassImpl flatClass = new FlatClassImpl();
		return flatClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalConstraint createFormalConstraint() {
		FormalConstraintImpl formalConstraint = new FormalConstraintImpl();
		return formalConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression createFormalExpression() {
		FormalExpressionImpl formalExpression = new FormalExpressionImpl();
		return formalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeFormMarkupWithLanguage createFreeFormMarkupWithLanguage() {
		FreeFormMarkupWithLanguageImpl freeFormMarkupWithLanguage = new FreeFormMarkupWithLanguageImpl();
		return freeFormMarkupWithLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreehandDocument createFreehandDocument() {
		FreehandDocumentImpl freehandDocument = new FreehandDocumentImpl();
		return freehandDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreehandDocumentAppInfo createFreehandDocumentAppInfo() {
		FreehandDocumentAppInfoImpl freehandDocumentAppInfo = new FreehandDocumentAppInfoImpl();
		return freehandDocumentAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreehandDocumentDocumentation createFreehandDocumentDocumentation() {
		FreehandDocumentDocumentationImpl freehandDocumentDocumentation = new FreehandDocumentDocumentationImpl();
		return freehandDocumentDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationAnnotations createGeneralizationAnnotations() {
		GeneralizationAnnotationsImpl generalizationAnnotations = new GeneralizationAnnotationsImpl();
		return generalizationAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationAppInfo createGeneralizationAppInfo() {
		GeneralizationAppInfoImpl generalizationAppInfo = new GeneralizationAppInfoImpl();
		return generalizationAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationDocumentation createGeneralizationDocumentation() {
		GeneralizationDocumentationImpl generalizationDocumentation = new GeneralizationDocumentationImpl();
		return generalizationDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericPackage createGenericPackage() {
		GenericPackageImpl genericPackage = new GenericPackageImpl();
		return genericPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalApplicationRole createGlobalApplicationRole() {
		GlobalApplicationRoleImpl globalApplicationRole = new GlobalApplicationRoleImpl();
		return globalApplicationRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalArtifactXRefSummary createGlobalArtifactXRefSummary() {
		GlobalArtifactXRefSummaryImpl globalArtifactXRefSummary = new GlobalArtifactXRefSummaryImpl();
		return globalArtifactXRefSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalCodeSystem createGlobalCodeSystem() {
		GlobalCodeSystemImpl globalCodeSystem = new GlobalCodeSystemImpl();
		return globalCodeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalCodeSystemSupplement createGlobalCodeSystemSupplement() {
		GlobalCodeSystemSupplementImpl globalCodeSystemSupplement = new GlobalCodeSystemSupplementImpl();
		return globalCodeSystemSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalConformanceProfile createGlobalConformanceProfile() {
		GlobalConformanceProfileImpl globalConformanceProfile = new GlobalConformanceProfileImpl();
		return globalConformanceProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDatatypeModelLibrary createGlobalDatatypeModelLibrary() {
		GlobalDatatypeModelLibraryImpl globalDatatypeModelLibrary = new GlobalDatatypeModelLibraryImpl();
		return globalDatatypeModelLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDerivedStaticModel createGlobalDerivedStaticModel() {
		GlobalDerivedStaticModelImpl globalDerivedStaticModel = new GlobalDerivedStaticModelImpl();
		return globalDerivedStaticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDomainAnalysisModel createGlobalDomainAnalysisModel() {
		GlobalDomainAnalysisModelImpl globalDomainAnalysisModel = new GlobalDomainAnalysisModelImpl();
		return globalDomainAnalysisModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDomainInstanceExample createGlobalDomainInstanceExample() {
		GlobalDomainInstanceExampleImpl globalDomainInstanceExample = new GlobalDomainInstanceExampleImpl();
		return globalDomainInstanceExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalFreehandDocument createGlobalFreehandDocument() {
		GlobalFreehandDocumentImpl globalFreehandDocument = new GlobalFreehandDocumentImpl();
		return globalFreehandDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalGenericPackage createGlobalGenericPackage() {
		GlobalGenericPackageImpl globalGenericPackage = new GlobalGenericPackageImpl();
		return globalGenericPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalGlossary createGlobalGlossary() {
		GlobalGlossaryImpl globalGlossary = new GlobalGlossaryImpl();
		return globalGlossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalInteraction createGlobalInteraction() {
		GlobalInteractionImpl globalInteraction = new GlobalInteractionImpl();
		return globalInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalInteractionProfile createGlobalInteractionProfile() {
		GlobalInteractionProfileImpl globalInteractionProfile = new GlobalInteractionProfileImpl();
		return globalInteractionProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMifChanges createGlobalMifChanges() {
		GlobalMifChangesImpl globalMifChanges = new GlobalMifChangesImpl();
		return globalMifChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalPublicationPackage createGlobalPublicationPackage() {
		GlobalPublicationPackageImpl globalPublicationPackage = new GlobalPublicationPackageImpl();
		return globalPublicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalSerializedStaticModel createGlobalSerializedStaticModel() {
		GlobalSerializedStaticModelImpl globalSerializedStaticModel = new GlobalSerializedStaticModelImpl();
		return globalSerializedStaticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalStaticModel createGlobalStaticModel() {
		GlobalStaticModelImpl globalStaticModel = new GlobalStaticModelImpl();
		return globalStaticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalStaticModelInterfacePackage createGlobalStaticModelInterfacePackage() {
		GlobalStaticModelInterfacePackageImpl globalStaticModelInterfacePackage = new GlobalStaticModelInterfacePackageImpl();
		return globalStaticModelInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalStoryboard createGlobalStoryboard() {
		GlobalStoryboardImpl globalStoryboard = new GlobalStoryboardImpl();
		return globalStoryboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalStructuredDocument createGlobalStructuredDocument() {
		GlobalStructuredDocumentImpl globalStructuredDocument = new GlobalStructuredDocumentImpl();
		return globalStructuredDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalTestScenario createGlobalTestScenario() {
		GlobalTestScenarioImpl globalTestScenario = new GlobalTestScenarioImpl();
		return globalTestScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalTriggerEvent createGlobalTriggerEvent() {
		GlobalTriggerEventImpl globalTriggerEvent = new GlobalTriggerEventImpl();
		return globalTriggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalValueSet createGlobalValueSet() {
		GlobalValueSetImpl globalValueSet = new GlobalValueSetImpl();
		return globalValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVocabularyModel createGlobalVocabularyModel() {
		GlobalVocabularyModelImpl globalVocabularyModel = new GlobalVocabularyModelImpl();
		return globalVocabularyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glossary createGlossary() {
		GlossaryImpl glossary = new GlossaryImpl();
		return glossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphConnector createGraphConnector() {
		GraphConnectorImpl graphConnector = new GraphConnectorImpl();
		return graphConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphConnectorWithEdge createGraphConnectorWithEdge() {
		GraphConnectorWithEdgeImpl graphConnectorWithEdge = new GraphConnectorWithEdgeImpl();
		return graphConnectorWithEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphEdgeGraphicInformation createGraphEdgeGraphicInformation() {
		GraphEdgeGraphicInformationImpl graphEdgeGraphicInformation = new GraphEdgeGraphicInformationImpl();
		return graphEdgeGraphicInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphEdgeWithAnchor createGraphEdgeWithAnchor() {
		GraphEdgeWithAnchorImpl graphEdgeWithAnchor = new GraphEdgeWithAnchorImpl();
		return graphEdgeWithAnchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphNode createGraphNode() {
		GraphNodeImpl graphNode = new GraphNodeImpl();
		return graphNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphNodeWithOptionalConnection createGraphNodeWithOptionalConnection() {
		GraphNodeWithOptionalConnectionImpl graphNodeWithOptionalConnection = new GraphNodeWithOptionalConnectionImpl();
		return graphNodeWithOptionalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupChange createGroupChange() {
		GroupChangeImpl groupChange = new GroupChangeImpl();
		return groupChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupVote createGroupVote() {
		GroupVoteImpl groupVote = new GroupVoteImpl();
		return groupVote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryItem createHistoryItem() {
		HistoryItemImpl historyItem = new HistoryItemImpl();
		return historyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationConstraints createImplementationConstraints() {
		ImplementationConstraintsImpl implementationConstraints = new ImplementationConstraintsImpl();
		return implementationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationMessageConstraints createImplementationMessageConstraints() {
		ImplementationMessageConstraintsImpl implementationMessageConstraints = new ImplementationMessageConstraintsImpl();
		return implementationMessageConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportDatatypeModelLibrary createImportDatatypeModelLibrary() {
		ImportDatatypeModelLibraryImpl importDatatypeModelLibrary = new ImportDatatypeModelLibraryImpl();
		return importDatatypeModelLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeRelatedCodes createIncludeRelatedCodes() {
		IncludeRelatedCodesImpl includeRelatedCodes = new IncludeRelatedCodesImpl();
		return includeRelatedCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionAnnotations createInteractionAnnotations() {
		InteractionAnnotationsImpl interactionAnnotations = new InteractionAnnotationsImpl();
		return interactionAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionAppInfo createInteractionAppInfo() {
		InteractionAppInfoImpl interactionAppInfo = new InteractionAppInfoImpl();
		return interactionAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionDocumentation createInteractionDocumentation() {
		InteractionDocumentationImpl interactionDocumentation = new InteractionDocumentationImpl();
		return interactionDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionProfile createInteractionProfile() {
		InteractionProfileImpl interactionProfile = new InteractionProfileImpl();
		return interactionProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionProfileAppInfo createInteractionProfileAppInfo() {
		InteractionProfileAppInfoImpl interactionProfileAppInfo = new InteractionProfileAppInfoImpl();
		return interactionProfileAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionProfileDocumentation createInteractionProfileDocumentation() {
		InteractionProfileDocumentationImpl interactionProfileDocumentation = new InteractionProfileDocumentationImpl();
		return interactionProfileDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionTest createInteractionTest() {
		InteractionTestImpl interactionTest = new InteractionTestImpl();
		return interactionTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemFilter createItemFilter() {
		ItemFilterImpl itemFilter = new ItemFilterImpl();
		return itemFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyedName createKeyedName() {
		KeyedNameImpl keyedName = new KeyedNameImpl();
		return keyedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legalese createLegalese() {
		LegaleseImpl legalese = new LegaleseImpl();
		return legalese;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalClassRef createLocalClassRef() {
		LocalClassRefImpl localClassRef = new LocalClassRefImpl();
		return localClassRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalClassReference createLocalClassReference() {
		LocalClassReferenceImpl localClassReference = new LocalClassReferenceImpl();
		return localClassReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MifChanges createMifChanges() {
		MifChangesImpl mifChanges = new MifChangesImpl();
		return mifChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MifContent createMifContent() {
		MifContentImpl mifContent = new MifContentImpl();
		return mifContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeGraphicInformation createNodeGraphicInformation() {
		NodeGraphicInformationImpl nodeGraphicInformation = new NodeGraphicInformationImpl();
		return nodeGraphicInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeWithConnectionGraphicInformation createNodeWithConnectionGraphicInformation() {
		NodeWithConnectionGraphicInformationImpl nodeWithConnectionGraphicInformation = new NodeWithConnectionGraphicInformationImpl();
		return nodeWithConnectionGraphicInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonComputableContentDefinition createNonComputableContentDefinition() {
		NonComputableContentDefinitionImpl nonComputableContentDefinition = new NonComputableContentDefinitionImpl();
		return nonComputableContentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTraversableAssociationEnd createNonTraversableAssociationEnd() {
		NonTraversableAssociationEndImpl nonTraversableAssociationEnd = new NonTraversableAssociationEndImpl();
		return nonTraversableAssociationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenIssue createOpenIssue() {
		OpenIssueImpl openIssue = new OpenIssueImpl();
		return openIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationAnnotations createOperationAnnotations() {
		OperationAnnotationsImpl operationAnnotations = new OperationAnnotationsImpl();
		return operationAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationAppInfo createOperationAppInfo() {
		OperationAppInfoImpl operationAppInfo = new OperationAppInfoImpl();
		return operationAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDerivation createOperationDerivation() {
		OperationDerivationImpl operationDerivation = new OperationDerivationImpl();
		return operationDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDocumentation createOperationDocumentation() {
		OperationDocumentationImpl operationDocumentation = new OperationDocumentationImpl();
		return operationDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameter createOperationParameter() {
		OperationParameterImpl operationParameter = new OperationParameterImpl();
		return operationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherAnnotation createOtherAnnotation() {
		OtherAnnotationImpl otherAnnotation = new OtherAnnotationImpl();
		return otherAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageAppInfo createPackageAppInfo() {
		PackageAppInfoImpl packageAppInfo = new PackageAppInfoImpl();
		return packageAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageContent createPackageContent() {
		PackageContentImpl packageContent = new PackageContentImpl();
		return packageContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDefId createPackageDefId() {
		PackageDefIdImpl packageDefId = new PackageDefIdImpl();
		return packageDefId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDerivation createPackageDerivation() {
		PackageDerivationImpl packageDerivation = new PackageDerivationImpl();
		return packageDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDocumentation createPackageDocumentation() {
		PackageDocumentationImpl packageDocumentation = new PackageDocumentationImpl();
		return packageDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageOrArtifactRef createPackageOrArtifactRef() {
		PackageOrArtifactRefImpl packageOrArtifactRef = new PackageOrArtifactRefImpl();
		return packageOrArtifactRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef createPackageRef() {
		PackageRefImpl packageRef = new PackageRefImpl();
		return packageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterModel createParameterModel() {
		ParameterModelImpl parameterModel = new ParameterModelImpl();
		return parameterModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintName createPrintName() {
		PrintNameImpl printName = new PrintNameImpl();
		return printName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyBasedContentDefinition createPropertyBasedContentDefinition() {
		PropertyBasedContentDefinitionImpl propertyBasedContentDefinition = new PropertyBasedContentDefinitionImpl();
		return propertyBasedContentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyGroup createPropertyGroup() {
		PropertyGroupImpl propertyGroup = new PropertyGroupImpl();
		return propertyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationAnnotations createPublicationAnnotations() {
		PublicationAnnotationsImpl publicationAnnotations = new PublicationAnnotationsImpl();
		return publicationAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationAppInfo createPublicationAppInfo() {
		PublicationAppInfoImpl publicationAppInfo = new PublicationAppInfoImpl();
		return publicationAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationDocumentation createPublicationDocumentation() {
		PublicationDocumentationImpl publicationDocumentation = new PublicationDocumentationImpl();
		return publicationDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationGroup createPublicationGroup() {
		PublicationGroupImpl publicationGroup = new PublicationGroupImpl();
		return publicationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationItem createPublicationItem() {
		PublicationItemImpl publicationItem = new PublicationItemImpl();
		return publicationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationPackage createPublicationPackage() {
		PublicationPackageImpl publicationPackage = new PublicationPackageImpl();
		return publicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeDefinition createRangeDefinition() {
		RangeDefinitionImpl rangeDefinition = new RangeDefinitionImpl();
		return rangeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealmElement createRealmElement() {
		RealmElementImpl realmElement = new RealmElementImpl();
		return realmElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiverResponsibility createReceiverResponsibility() {
		ReceiverResponsibilityImpl receiverResponsibility = new ReceiverResponsibilityImpl();
		return receiverResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedAppRole createRelatedAppRole() {
		RelatedAppRoleImpl relatedAppRole = new RelatedAppRoleImpl();
		return relatedAppRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipBasedContentDefinition createRelationshipBasedContentDefinition() {
		RelationshipBasedContentDefinitionImpl relationshipBasedContentDefinition = new RelationshipBasedContentDefinitionImpl();
		return relationshipBasedContentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release createRelease() {
		ReleaseImpl release = new ReleaseImpl();
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseList createReleaseList() {
		ReleaseListImpl releaseList = new ReleaseListImpl();
		return releaseList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingInformation createRenderingInformation() {
		RenderingInformationImpl renderingInformation = new RenderingInformationImpl();
		return renderingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceElementContent createReplaceElementContent() {
		ReplaceElementContentImpl replaceElementContent = new ReplaceElementContentImpl();
		return replaceElementContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsibleGroup createResponsibleGroup() {
		ResponsibleGroupImpl responsibleGroup = new ResponsibleGroupImpl();
		return responsibleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedAssociationEnd createSerializedAssociationEnd() {
		SerializedAssociationEndImpl serializedAssociationEnd = new SerializedAssociationEndImpl();
		return serializedAssociationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedAssociationEnds createSerializedAssociationEnds() {
		SerializedAssociationEndsImpl serializedAssociationEnds = new SerializedAssociationEndsImpl();
		return serializedAssociationEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedClass createSerializedClass() {
		SerializedClassImpl serializedClass = new SerializedClassImpl();
		return serializedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedClassBindingArgument createSerializedClassBindingArgument() {
		SerializedClassBindingArgumentImpl serializedClassBindingArgument = new SerializedClassBindingArgumentImpl();
		return serializedClassBindingArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedClasses createSerializedClasses() {
		SerializedClassesImpl serializedClasses = new SerializedClassesImpl();
		return serializedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedClassGeneralization createSerializedClassGeneralization() {
		SerializedClassGeneralizationImpl serializedClassGeneralization = new SerializedClassGeneralizationImpl();
		return serializedClassGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedCommonModelElementRef createSerializedCommonModelElementRef() {
		SerializedCommonModelElementRefImpl serializedCommonModelElementRef = new SerializedCommonModelElementRefImpl();
		return serializedCommonModelElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedEntryPoint createSerializedEntryPoint() {
		SerializedEntryPointImpl serializedEntryPoint = new SerializedEntryPointImpl();
		return serializedEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedStaticModel createSerializedStaticModel() {
		SerializedStaticModelImpl serializedStaticModel = new SerializedStaticModelImpl();
		return serializedStaticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedStaticModelsType createSerializedStaticModelsType() {
		SerializedStaticModelsTypeImpl serializedStaticModelsType = new SerializedStaticModelsTypeImpl();
		return serializedStaticModelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializationClass createSpecializationClass() {
		SpecializationClassImpl specializationClass = new SpecializationClassImpl();
		return specializationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateAnnotations createStateAnnotations() {
		StateAnnotationsImpl stateAnnotations = new StateAnnotationsImpl();
		return stateAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateAppInfo createStateAppInfo() {
		StateAppInfoImpl stateAppInfo = new StateAppInfoImpl();
		return stateAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateDerivation createStateDerivation() {
		StateDerivationImpl stateDerivation = new StateDerivationImpl();
		return stateDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateDocumentation createStateDocumentation() {
		StateDocumentationImpl stateDocumentation = new StateDocumentationImpl();
		return stateDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineAnnotations createStateMachineAnnotations() {
		StateMachineAnnotationsImpl stateMachineAnnotations = new StateMachineAnnotationsImpl();
		return stateMachineAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineAppInfo createStateMachineAppInfo() {
		StateMachineAppInfoImpl stateMachineAppInfo = new StateMachineAppInfoImpl();
		return stateMachineAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineDocumentation createStateMachineDocumentation() {
		StateMachineDocumentationImpl stateMachineDocumentation = new StateMachineDocumentationImpl();
		return stateMachineDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticExample createStaticExample() {
		StaticExampleImpl staticExample = new StaticExampleImpl();
		return staticExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModel createStaticModel() {
		StaticModelImpl staticModel = new StaticModelImpl();
		return staticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelAnnotations createStaticModelAnnotations() {
		StaticModelAnnotationsImpl staticModelAnnotations = new StaticModelAnnotationsImpl();
		return staticModelAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelAppInfo createStaticModelAppInfo() {
		StaticModelAppInfoImpl staticModelAppInfo = new StaticModelAppInfoImpl();
		return staticModelAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelBase createStaticModelBase() {
		StaticModelBaseImpl staticModelBase = new StaticModelBaseImpl();
		return staticModelBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelClassTemplateParameter createStaticModelClassTemplateParameter() {
		StaticModelClassTemplateParameterImpl staticModelClassTemplateParameter = new StaticModelClassTemplateParameterImpl();
		return staticModelClassTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelDerivation createStaticModelDerivation() {
		StaticModelDerivationImpl staticModelDerivation = new StaticModelDerivationImpl();
		return staticModelDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelDerivationSource createStaticModelDerivationSource() {
		StaticModelDerivationSourceImpl staticModelDerivationSource = new StaticModelDerivationSourceImpl();
		return staticModelDerivationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelDocumentation createStaticModelDocumentation() {
		StaticModelDocumentationImpl staticModelDocumentation = new StaticModelDocumentationImpl();
		return staticModelDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelInterfaceAnnotations createStaticModelInterfaceAnnotations() {
		StaticModelInterfaceAnnotationsImpl staticModelInterfaceAnnotations = new StaticModelInterfaceAnnotationsImpl();
		return staticModelInterfaceAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelInterfaceAppInfo createStaticModelInterfaceAppInfo() {
		StaticModelInterfaceAppInfoImpl staticModelInterfaceAppInfo = new StaticModelInterfaceAppInfoImpl();
		return staticModelInterfaceAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelInterfaceDocumentation createStaticModelInterfaceDocumentation() {
		StaticModelInterfaceDocumentationImpl staticModelInterfaceDocumentation = new StaticModelInterfaceDocumentationImpl();
		return staticModelInterfaceDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelInterfacePackage createStaticModelInterfacePackage() {
		StaticModelInterfacePackageImpl staticModelInterfacePackage = new StaticModelInterfacePackageImpl();
		return staticModelInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelRefBase createStaticModelRefBase() {
		StaticModelRefBaseImpl staticModelRefBase = new StaticModelRefBaseImpl();
		return staticModelRefBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelsType createStaticModelsType() {
		StaticModelsTypeImpl staticModelsType = new StaticModelsTypeImpl();
		return staticModelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticPackageDiagramGraphicInformation createStaticPackageDiagramGraphicInformation() {
		StaticPackageDiagramGraphicInformationImpl staticPackageDiagramGraphicInformation = new StaticPackageDiagramGraphicInformationImpl();
		return staticPackageDiagramGraphicInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storyboard createStoryboard() {
		StoryboardImpl storyboard = new StoryboardImpl();
		return storyboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryboardAnnotations createStoryboardAnnotations() {
		StoryboardAnnotationsImpl storyboardAnnotations = new StoryboardAnnotationsImpl();
		return storyboardAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryboardAppInfo createStoryboardAppInfo() {
		StoryboardAppInfoImpl storyboardAppInfo = new StoryboardAppInfoImpl();
		return storyboardAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryboardArtifactReferences createStoryboardArtifactReferences() {
		StoryboardArtifactReferencesImpl storyboardArtifactReferences = new StoryboardArtifactReferencesImpl();
		return storyboardArtifactReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryboardDocumentation createStoryboardDocumentation() {
		StoryboardDocumentationImpl storyboardDocumentation = new StoryboardDocumentationImpl();
		return storyboardDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryboardNarrative createStoryboardNarrative() {
		StoryboardNarrativeImpl storyboardNarrative = new StoryboardNarrativeImpl();
		return storyboardNarrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDocument createStructuredDocument() {
		StructuredDocumentImpl structuredDocument = new StructuredDocumentImpl();
		return structuredDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDocumentAnnotations createStructuredDocumentAnnotations() {
		StructuredDocumentAnnotationsImpl structuredDocumentAnnotations = new StructuredDocumentAnnotationsImpl();
		return structuredDocumentAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDocumentAppInfo createStructuredDocumentAppInfo() {
		StructuredDocumentAppInfoImpl structuredDocumentAppInfo = new StructuredDocumentAppInfoImpl();
		return structuredDocumentAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDocumentDocumentation createStructuredDocumentDocumentation() {
		StructuredDocumentDocumentationImpl structuredDocumentDocumentation = new StructuredDocumentDocumentationImpl();
		return structuredDocumentDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StubDefinition createStubDefinition() {
		StubDefinitionImpl stubDefinition = new StubDefinitionImpl();
		return stubDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectAreaAnnotations createSubjectAreaAnnotations() {
		SubjectAreaAnnotationsImpl subjectAreaAnnotations = new SubjectAreaAnnotationsImpl();
		return subjectAreaAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectAreaAppInfo createSubjectAreaAppInfo() {
		SubjectAreaAppInfoImpl subjectAreaAppInfo = new SubjectAreaAppInfoImpl();
		return subjectAreaAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectAreaDocumentation createSubjectAreaDocumentation() {
		SubjectAreaDocumentationImpl subjectAreaDocumentation = new SubjectAreaDocumentationImpl();
		return subjectAreaDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectAreaPackage createSubjectAreaPackage() {
		SubjectAreaPackageImpl subjectAreaPackage = new SubjectAreaPackageImpl();
		return subjectAreaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem createSubSystem() {
		SubSystemImpl subSystem = new SubSystemImpl();
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedConceptProperty createSupportedConceptProperty() {
		SupportedConceptPropertyImpl supportedConceptProperty = new SupportedConceptPropertyImpl();
		return supportedConceptProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedConceptRelationship createSupportedConceptRelationship() {
		SupportedConceptRelationshipImpl supportedConceptRelationship = new SupportedConceptRelationshipImpl();
		return supportedConceptRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedProperty createSupportedProperty() {
		SupportedPropertyImpl supportedProperty = new SupportedPropertyImpl();
		return supportedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermDefinition createTermDefinition() {
		TermDefinitionImpl termDefinition = new TermDefinitionImpl();
		return termDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyServer createTerminologyServer() {
		TerminologyServerImpl terminologyServer = new TerminologyServerImpl();
		return terminologyServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScenario createTestScenario() {
		TestScenarioImpl testScenario = new TestScenarioImpl();
		return testScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSystem createTestSystem() {
		TestSystemImpl testSystem = new TestSystemImpl();
		return testSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionAnnotations createTransitionAnnotations() {
		TransitionAnnotationsImpl transitionAnnotations = new TransitionAnnotationsImpl();
		return transitionAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionAppInfo createTransitionAppInfo() {
		TransitionAppInfoImpl transitionAppInfo = new TransitionAppInfoImpl();
		return transitionAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionDerivation createTransitionDerivation() {
		TransitionDerivationImpl transitionDerivation = new TransitionDerivationImpl();
		return transitionDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionDocumentation createTransitionDocumentation() {
		TransitionDocumentationImpl transitionDocumentation = new TransitionDocumentationImpl();
		return transitionDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionRef createTransitionRef() {
		TransitionRefImpl transitionRef = new TransitionRefImpl();
		return transitionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEvent createTriggerEvent() {
		TriggerEventImpl triggerEvent = new TriggerEventImpl();
		return triggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEventAnnotations createTriggerEventAnnotations() {
		TriggerEventAnnotationsImpl triggerEventAnnotations = new TriggerEventAnnotationsImpl();
		return triggerEventAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEventAppInfo createTriggerEventAppInfo() {
		TriggerEventAppInfoImpl triggerEventAppInfo = new TriggerEventAppInfoImpl();
		return triggerEventAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerEventDocumentation createTriggerEventDocumentation() {
		TriggerEventDocumentationImpl triggerEventDocumentation = new TriggerEventDocumentationImpl();
		return triggerEventDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet createValueSet() {
		ValueSetImpl valueSet = new ValueSetImpl();
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetAnnotations createValueSetAnnotations() {
		ValueSetAnnotationsImpl valueSetAnnotations = new ValueSetAnnotationsImpl();
		return valueSetAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetAppInfo createValueSetAppInfo() {
		ValueSetAppInfoImpl valueSetAppInfo = new ValueSetAppInfoImpl();
		return valueSetAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetDocumentation createValueSetDocumentation() {
		ValueSetDocumentationImpl valueSetDocumentation = new ValueSetDocumentationImpl();
		return valueSetDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetSupplement createValueSetSupplement() {
		ValueSetSupplementImpl valueSetSupplement = new ValueSetSupplementImpl();
		return valueSetSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSetVersion createValueSetVersion() {
		ValueSetVersionImpl valueSetVersion = new ValueSetVersionImpl();
		return valueSetVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariousMixedContent createVariousMixedContent() {
		VariousMixedContentImpl variousMixedContent = new VariousMixedContentImpl();
		return variousMixedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyCodeRef createVocabularyCodeRef() {
		VocabularyCodeRefImpl vocabularyCodeRef = new VocabularyCodeRefImpl();
		return vocabularyCodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyCodeRefs createVocabularyCodeRefs() {
		VocabularyCodeRefsImpl vocabularyCodeRefs = new VocabularyCodeRefsImpl();
		return vocabularyCodeRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyLimitation createVocabularyLimitation() {
		VocabularyLimitationImpl vocabularyLimitation = new VocabularyLimitationImpl();
		return vocabularyLimitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyModel createVocabularyModel() {
		VocabularyModelImpl vocabularyModel = new VocabularyModelImpl();
		return vocabularyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyModelAnnotations createVocabularyModelAnnotations() {
		VocabularyModelAnnotationsImpl vocabularyModelAnnotations = new VocabularyModelAnnotationsImpl();
		return vocabularyModelAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyModelAppInfo createVocabularyModelAppInfo() {
		VocabularyModelAppInfoImpl vocabularyModelAppInfo = new VocabularyModelAppInfoImpl();
		return vocabularyModelAppInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyModelDocumentation createVocabularyModelDocumentation() {
		VocabularyModelDocumentationImpl vocabularyModelDocumentation = new VocabularyModelDocumentationImpl();
		return vocabularyModelDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularySpecification createVocabularySpecification() {
		VocabularySpecificationImpl vocabularySpecification = new VocabularySpecificationImpl();
		return vocabularySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyValueSetBinding createVocabularyValueSetBinding() {
		VocabularyValueSetBindingImpl vocabularyValueSetBinding = new VocabularyValueSetBindingImpl();
		return vocabularyValueSetBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyValueSetRef createVocabularyValueSetRef() {
		VocabularyValueSetRefImpl vocabularyValueSetRef = new VocabularyValueSetRefImpl();
		return vocabularyValueSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMIContent createXMIContent() {
		XMIContentImpl xmiContent = new XMIContentImpl();
		return xmiContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffiliateKind createAffiliateKindFromString(EDataType eDataType, String initialValue) {
		AffiliateKind result = AffiliateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAffiliateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffirmativeVoteResolutionKind createAffirmativeVoteResolutionKindFromString(EDataType eDataType, String initialValue) {
		AffirmativeVoteResolutionKind result = AffirmativeVoteResolutionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAffirmativeVoteResolutionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationKind createAnnotationKindFromString(EDataType eDataType, String initialValue) {
		AnnotationKind result = AnnotationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnnotationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRoleRelationshipKind createApplicationRoleRelationshipKindFromString(EDataType eDataType, String initialValue) {
		ApplicationRoleRelationshipKind result = ApplicationRoleRelationshipKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationRoleRelationshipKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalStatusKind createApprovalStatusKindFromString(EDataType eDataType, String initialValue) {
		ApprovalStatusKind result = ApprovalStatusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApprovalStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactGroupKind createArtifactGroupKindFromString(EDataType eDataType, String initialValue) {
		ArtifactGroupKind result = ArtifactGroupKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactGroupKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactKind createArtifactKindFromString(EDataType eDataType, String initialValue) {
		ArtifactKind result = ArtifactKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactRenderingStyleKind createArtifactRenderingStyleKindFromString(EDataType eDataType, String initialValue) {
		ArtifactRenderingStyleKind result = ArtifactRenderingStyleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactRenderingStyleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePropertyKind createAttributePropertyKindFromString(EDataType eDataType, String initialValue) {
		AttributePropertyKind result = AttributePropertyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributePropertyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CascadingAnnotationElementKind createCascadingAnnotationElementKindFromString(EDataType eDataType, String initialValue) {
		CascadingAnnotationElementKind result = CascadingAnnotationElementKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCascadingAnnotationElementKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRequestStatus createChangeRequestStatusFromString(EDataType eDataType, String initialValue) {
		ChangeRequestStatus result = ChangeRequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeRequestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassPresentationKind createClassPresentationKindFromString(EDataType eDataType, String initialValue) {
		ClassPresentationKind result = ClassPresentationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassPresentationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMETAttributionKind createCMETAttributionKindFromString(EDataType eDataType, String initialValue) {
		CMETAttributionKind result = CMETAttributionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCMETAttributionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMETEntryKind createCMETEntryKindFromString(EDataType eDataType, String initialValue) {
		CMETEntryKind result = CMETEntryKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCMETEntryKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFilterExpressionKind createCodeFilterExpressionKindFromString(EDataType eDataType, String initialValue) {
		CodeFilterExpressionKind result = CodeFilterExpressionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeFilterExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeStatusKind createCodeStatusKindFromString(EDataType eDataType, String initialValue) {
		CodeStatusKind result = CodeStatusKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeStatusKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingStrengthKind createCodingStrengthKindFromString(EDataType eDataType, String initialValue) {
		CodingStrengthKind result = CodingStrengthKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodingStrengthKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomainPropertyKind createConceptDomainPropertyKindFromString(EDataType eDataType, String initialValue) {
		ConceptDomainPropertyKind result = ConceptDomainPropertyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptDomainPropertyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptPropertyTypeKind createConceptPropertyTypeKindFromString(EDataType eDataType, String initialValue) {
		ConceptPropertyTypeKind result = ConceptPropertyTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptPropertyTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptRelationshipKind createConceptRelationshipKindFromString(EDataType eDataType, String initialValue) {
		ConceptRelationshipKind result = ConceptRelationshipKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptRelationshipKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptUseKind createConceptUseKindFromString(EDataType eDataType, String initialValue) {
		ConceptUseKind result = ConceptUseKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptUseKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceKind createConformanceKindFromString(EDataType eDataType, String initialValue) {
		ConformanceKind result = ConformanceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructedElementKind createConstructedElementKindFromString(EDataType eDataType, String initialValue) {
		ConstructedElementKind result = ConstructedElementKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstructedElementKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentsLevelKind createContentsLevelKindFromString(EDataType eDataType, String initialValue) {
		ContentsLevelKind result = ContentsLevelKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentsLevelKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeKind createDatatypeKindFromString(EDataType eDataType, String initialValue) {
		DatatypeKind result = DatatypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeOperationKind createDatatypeOperationKindFromString(EDataType eDataType, String initialValue) {
		DatatypeOperationKind result = DatatypeOperationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeOperationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeQualifierKind createDatatypeQualifierKindFromString(EDataType eDataType, String initialValue) {
		DatatypeQualifierKind result = DatatypeQualifierKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeQualifierKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultDeterminerKind createDefaultDeterminerKindFromString(EDataType eDataType, String initialValue) {
		DefaultDeterminerKind result = DefaultDeterminerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultDeterminerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedMappingSourceKind createDefinedMappingSourceKindFromString(EDataType eDataType, String initialValue) {
		DefinedMappingSourceKind result = DefinedMappingSourceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinedMappingSourceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedRoleKind createDefinedRoleKindFromString(EDataType eDataType, String initialValue) {
		DefinedRoleKind result = DefinedRoleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinedRoleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationRelationshipKind createDerivationRelationshipKindFromString(EDataType eDataType, String initialValue) {
		DerivationRelationshipKind result = DerivationRelationshipKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDerivationRelationshipKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignCommentTagKind createDesignCommentTagKindFromString(EDataType eDataType, String initialValue) {
		DesignCommentTagKind result = DesignCommentTagKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDesignCommentTagKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentProfileKind createDocumentProfileKindFromString(EDataType eDataType, String initialValue) {
		DocumentProfileKind result = DocumentProfileKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentProfileKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainKind createDomainKindFromString(EDataType eDataType, String initialValue) {
		DomainKind result = DomainKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDomainKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationUnitsKind createDurationUnitsKindFromString(EDataType eDataType, String initialValue) {
		DurationUnitsKind result = DurationUnitsKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationUnitsKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffortQuantifierKind createEffortQuantifierKindFromString(EDataType eDataType, String initialValue) {
		EffortQuantifierKind result = EffortQuantifierKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEffortQuantifierKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionLanguageKind createExpressionLanguageKindFromString(EDataType eDataType, String initialValue) {
		ExpressionLanguageKind result = ExpressionLanguageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionLanguageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterKind createFilterKindFromString(EDataType eDataType, String initialValue) {
		FilterKind result = FilterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functionalism createFunctionalismFromString(EDataType eDataType, String initialValue) {
		Functionalism result = Functionalism.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionalismToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconFormatKind createIconFormatKindFromString(EDataType eDataType, String initialValue) {
		IconFormatKind result = IconFormatKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIconFormatKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionKind createInteractionKindFromString(EDataType eDataType, String initialValue) {
		InteractionKind result = InteractionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionProfileKind createInteractionProfileKindFromString(EDataType eDataType, String initialValue) {
		InteractionProfileKind result = InteractionProfileKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionProfileKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITSKind createITSKindFromString(EDataType eDataType, String initialValue) {
		ITSKind result = ITSKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertITSKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapRelationshipKind createMapRelationshipKindFromString(EDataType eDataType, String initialValue) {
		MapRelationshipKind result = MapRelationshipKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapRelationshipKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelConformanceKind createModelConformanceKindFromString(EDataType eDataType, String initialValue) {
		ModelConformanceKind result = ModelConformanceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelConformanceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeVoteResolutionKind createNegativeVoteResolutionKindFromString(EDataType eDataType, String initialValue) {
		NegativeVoteResolutionKind result = NegativeVoteResolutionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNegativeVoteResolutionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeOrientation createNodeOrientationFromString(EDataType eDataType, String initialValue) {
		NodeOrientation result = NodeOrientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnerScopeKind createOwnerScopeKindFromString(EDataType eDataType, String initialValue) {
		OwnerScopeKind result = OwnerScopeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOwnerScopeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageKind createPackageKindFromString(EDataType eDataType, String initialValue) {
		PackageKind result = PackageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPackageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRootKind createPackageRootKindFromString(EDataType eDataType, String initialValue) {
		PackageRootKind result = PackageRootKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPackageRootKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentArtifactKind createParentArtifactKindFromString(EDataType eDataType, String initialValue) {
		ParentArtifactKind result = ParentArtifactKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParentArtifactKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefaultHandlingKind createPropertyDefaultHandlingKindFromString(EDataType eDataType, String initialValue) {
		PropertyDefaultHandlingKind result = PropertyDefaultHandlingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyDefaultHandlingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reflexivity createReflexivityFromString(EDataType eDataType, String initialValue) {
		Reflexivity result = Reflexivity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReflexivityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTraversalKind createRelationshipTraversalKindFromString(EDataType eDataType, String initialValue) {
		RelationshipTraversalKind result = RelationshipTraversalKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTraversalKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionFrequencyKind createRevisionFrequencyKindFromString(EDataType eDataType, String initialValue) {
		RevisionFrequencyKind result = RevisionFrequencyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRevisionFrequencyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionKind createSectionKindFromString(EDataType eDataType, String initialValue) {
		SectionKind result = SectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelDiagramPresentationKind createStaticModelDiagramPresentationKindFromString(EDataType eDataType, String initialValue) {
		StaticModelDiagramPresentationKind result = StaticModelDiagramPresentationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStaticModelDiagramPresentationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelRepresentationKind createStaticModelRepresentationKindFromString(EDataType eDataType, String initialValue) {
		StaticModelRepresentationKind result = StaticModelRepresentationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStaticModelRepresentationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelUseKind createStaticModelUseKindFromString(EDataType eDataType, String initialValue) {
		StaticModelUseKind result = StaticModelUseKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStaticModelUseKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubArtifactKind createSubArtifactKindFromString(EDataType eDataType, String initialValue) {
		SubArtifactKind result = SubArtifactKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubArtifactKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSectionKind createSubSectionKindFromString(EDataType eDataType, String initialValue) {
		SubSectionKind result = SubSectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubSectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symmetry createSymmetryFromString(EDataType eDataType, String initialValue) {
		Symmetry result = Symmetry.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyServerKind createTerminologyServerKindFromString(EDataType eDataType, String initialValue) {
		TerminologyServerKind result = TerminologyServerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTerminologyServerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transitivity createTransitivityFromString(EDataType eDataType, String initialValue) {
		Transitivity result = Transitivity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitivityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslatableDirectionKind createTranslatableDirectionKindFromString(EDataType eDataType, String initialValue) {
		TranslatableDirectionKind result = TranslatableDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTranslatableDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnlimitedMultiplicity createUnlimitedMultiplicityFromString(EDataType eDataType, String initialValue) {
		UnlimitedMultiplicity result = UnlimitedMultiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnlimitedMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateModeKind createUpdateModeKindFromString(EDataType eDataType, String initialValue) {
		UpdateModeKind result = UpdateModeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateModeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyModelDefinitionKind createVocabularyModelDefinitionKindFromString(EDataType eDataType, String initialValue) {
		VocabularyModelDefinitionKind result = VocabularyModelDefinitionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVocabularyModelDefinitionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoteCommentKind createVoteCommentKindFromString(EDataType eDataType, String initialValue) {
		VoteCommentKind result = VoteCommentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoteCommentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoteKind createVoteKindFromString(EDataType eDataType, String initialValue) {
		VoteKind result = VoteKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoteKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffiliateKind createAffiliateKindObjectFromString(EDataType eDataType, String initialValue) {
		return createAffiliateKindFromString(Mif2Package.Literals.AFFILIATE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAffiliateKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAffiliateKindToString(Mif2Package.Literals.AFFILIATE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffirmativeVoteResolutionKind createAffirmativeVoteResolutionKindObjectFromString(EDataType eDataType, String initialValue) {
		return createAffirmativeVoteResolutionKindFromString(Mif2Package.Literals.AFFIRMATIVE_VOTE_RESOLUTION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAffirmativeVoteResolutionKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAffirmativeVoteResolutionKindToString(Mif2Package.Literals.AFFIRMATIVE_VOTE_RESOLUTION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAllClassNameFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createFormalProperNameFromString(Mif2Package.Literals.FORMAL_PROPER_NAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPrefixedUpperCamelCaseFromString(Mif2Package.Literals.PREFIXED_UPPER_CAMEL_CASE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllClassNameToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Mif2Package.Literals.FORMAL_PROPER_NAME.isInstance(instanceValue)) {
			try {
				String value = convertFormalProperNameToString(Mif2Package.Literals.FORMAL_PROPER_NAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Mif2Package.Literals.PREFIXED_UPPER_CAMEL_CASE.isInstance(instanceValue)) {
			try {
				String value = convertPrefixedUpperCamelCaseToString(Mif2Package.Literals.PREFIXED_UPPER_CAMEL_CASE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationKind createAnnotationKindObjectFromString(EDataType eDataType, String initialValue) {
		return createAnnotationKindFromString(Mif2Package.Literals.ANNOTATION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnnotationKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAnnotationKindToString(Mif2Package.Literals.ANNOTATION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRoleRelationshipKind createApplicationRoleRelationshipKindObjectFromString(EDataType eDataType, String initialValue) {
		return createApplicationRoleRelationshipKindFromString(Mif2Package.Literals.APPLICATION_ROLE_RELATIONSHIP_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationRoleRelationshipKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertApplicationRoleRelationshipKindToString(Mif2Package.Literals.APPLICATION_ROLE_RELATIONSHIP_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalStatusKind createApprovalStatusKindObjectFromString(EDataType eDataType, String initialValue) {
		return createApprovalStatusKindFromString(Mif2Package.Literals.APPROVAL_STATUS_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApprovalStatusKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertApprovalStatusKindToString(Mif2Package.Literals.APPROVAL_STATUS_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactGroupKind createArtifactGroupKindObjectFromString(EDataType eDataType, String initialValue) {
		return createArtifactGroupKindFromString(Mif2Package.Literals.ARTIFACT_GROUP_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactGroupKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtifactGroupKindToString(Mif2Package.Literals.ARTIFACT_GROUP_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactKind createArtifactKindObjectFromString(EDataType eDataType, String initialValue) {
		return createArtifactKindFromString(Mif2Package.Literals.ARTIFACT_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtifactKindToString(Mif2Package.Literals.ARTIFACT_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactRenderingStyleKind createArtifactRenderingStyleKindObjectFromString(EDataType eDataType, String initialValue) {
		return createArtifactRenderingStyleKindFromString(Mif2Package.Literals.ARTIFACT_RENDERING_STYLE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactRenderingStyleKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArtifactRenderingStyleKindToString(Mif2Package.Literals.ARTIFACT_RENDERING_STYLE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePropertyKind createAttributePropertyKindObjectFromString(EDataType eDataType, String initialValue) {
		return createAttributePropertyKindFromString(Mif2Package.Literals.ATTRIBUTE_PROPERTY_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributePropertyKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAttributePropertyKindToString(Mif2Package.Literals.ATTRIBUTE_PROPERTY_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBasicFormalNameFromString(EDataType eDataType, String initialValue) {
		return createNonEmptyStringFromString(Mif2Package.Literals.NON_EMPTY_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasicFormalNameToString(EDataType eDataType, Object instanceValue) {
		return convertNonEmptyStringToString(Mif2Package.Literals.NON_EMPTY_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBasicIdFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasicIdToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CascadingAnnotationElementKind createCascadingAnnotationElementKindObjectFromString(EDataType eDataType, String initialValue) {
		return createCascadingAnnotationElementKindFromString(Mif2Package.Literals.CASCADING_ANNOTATION_ELEMENT_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCascadingAnnotationElementKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCascadingAnnotationElementKindToString(Mif2Package.Literals.CASCADING_ANNOTATION_ELEMENT_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRequestStatus createChangeRequestStatusObjectFromString(EDataType eDataType, String initialValue) {
		return createChangeRequestStatusFromString(Mif2Package.Literals.CHANGE_REQUEST_STATUS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeRequestStatusObjectToString(EDataType eDataType, Object instanceValue) {
		return convertChangeRequestStatusToString(Mif2Package.Literals.CHANGE_REQUEST_STATUS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassPresentationKind createClassPresentationKindObjectFromString(EDataType eDataType, String initialValue) {
		return createClassPresentationKindFromString(Mif2Package.Literals.CLASS_PRESENTATION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassPresentationKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClassPresentationKindToString(Mif2Package.Literals.CLASS_PRESENTATION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMETAttributionKind createCMETAttributionKindObjectFromString(EDataType eDataType, String initialValue) {
		return createCMETAttributionKindFromString(Mif2Package.Literals.CMET_ATTRIBUTION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCMETAttributionKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCMETAttributionKindToString(Mif2Package.Literals.CMET_ATTRIBUTION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCMETAttributionStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCMETAttributionStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createCMETAttributionTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createCMETAttributionStringFromString(Mif2Package.Literals.CMET_ATTRIBUTION_STRING, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createCMETAttributionKindFromString(Mif2Package.Literals.CMET_ATTRIBUTION_KIND, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCMETAttributionTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Mif2Package.Literals.CMET_ATTRIBUTION_STRING.isInstance(instanceValue)) {
			try {
				String value = convertCMETAttributionStringToString(Mif2Package.Literals.CMET_ATTRIBUTION_STRING, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Mif2Package.Literals.CMET_ATTRIBUTION_KIND.isInstance(instanceValue)) {
			try {
				String value = convertCMETAttributionKindToString(Mif2Package.Literals.CMET_ATTRIBUTION_KIND, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMETEntryKind createCMETEntryKindObjectFromString(EDataType eDataType, String initialValue) {
		return createCMETEntryKindFromString(Mif2Package.Literals.CMET_ENTRY_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCMETEntryKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCMETEntryKindToString(Mif2Package.Literals.CMET_ENTRY_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFilterExpressionKind createCodeFilterExpressionKindObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeFilterExpressionKindFromString(Mif2Package.Literals.CODE_FILTER_EXPRESSION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeFilterExpressionKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeFilterExpressionKindToString(Mif2Package.Literals.CODE_FILTER_EXPRESSION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeStatusKind createCodeStatusKindObjectFromString(EDataType eDataType, String initialValue) {
		return createCodeStatusKindFromString(Mif2Package.Literals.CODE_STATUS_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeStatusKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodeStatusKindToString(Mif2Package.Literals.CODE_STATUS_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingStrengthKind createCodingStrengthKindObjectFromString(EDataType eDataType, String initialValue) {
		return createCodingStrengthKindFromString(Mif2Package.Literals.CODING_STRENGTH_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodingStrengthKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCodingStrengthKindToString(Mif2Package.Literals.CODING_STRENGTH_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCollapsedPackageIdFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollapsedPackageIdToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptDomainPropertyKind createConceptDomainPropertyKindObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptDomainPropertyKindFromString(Mif2Package.Literals.CONCEPT_DOMAIN_PROPERTY_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptDomainPropertyKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptDomainPropertyKindToString(Mif2Package.Literals.CONCEPT_DOMAIN_PROPERTY_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptPropertyTypeKind createConceptPropertyTypeKindObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptPropertyTypeKindFromString(Mif2Package.Literals.CONCEPT_PROPERTY_TYPE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptPropertyTypeKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptPropertyTypeKindToString(Mif2Package.Literals.CONCEPT_PROPERTY_TYPE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptRelationshipKind createConceptRelationshipKindObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptRelationshipKindFromString(Mif2Package.Literals.CONCEPT_RELATIONSHIP_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptRelationshipKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptRelationshipKindToString(Mif2Package.Literals.CONCEPT_RELATIONSHIP_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptUseKind createConceptUseKindObjectFromString(EDataType eDataType, String initialValue) {
		return createConceptUseKindFromString(Mif2Package.Literals.CONCEPT_USE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConceptUseKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConceptUseKindToString(Mif2Package.Literals.CONCEPT_USE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceKind createConformanceKindObjectFromString(EDataType eDataType, String initialValue) {
		return createConformanceKindFromString(Mif2Package.Literals.CONFORMANCE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConformanceKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConformanceKindToString(Mif2Package.Literals.CONFORMANCE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructedElementKind createConstructedElementKindObjectFromString(EDataType eDataType, String initialValue) {
		return createConstructedElementKindFromString(Mif2Package.Literals.CONSTRUCTED_ELEMENT_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstructedElementKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConstructedElementKindToString(Mif2Package.Literals.CONSTRUCTED_ELEMENT_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentsLevelKind createContentsLevelKindObjectFromString(EDataType eDataType, String initialValue) {
		return createContentsLevelKindFromString(Mif2Package.Literals.CONTENTS_LEVEL_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentsLevelKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContentsLevelKindToString(Mif2Package.Literals.CONTENTS_LEVEL_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeKind createDatatypeKindObjectFromString(EDataType eDataType, String initialValue) {
		return createDatatypeKindFromString(Mif2Package.Literals.DATATYPE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDatatypeKindToString(Mif2Package.Literals.DATATYPE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDatatypeNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeOperationKind createDatatypeOperationKindObjectFromString(EDataType eDataType, String initialValue) {
		return createDatatypeOperationKindFromString(Mif2Package.Literals.DATATYPE_OPERATION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeOperationKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDatatypeOperationKindToString(Mif2Package.Literals.DATATYPE_OPERATION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeQualifierKind createDatatypeQualifierKindObjectFromString(EDataType eDataType, String initialValue) {
		return createDatatypeQualifierKindFromString(Mif2Package.Literals.DATATYPE_QUALIFIER_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeQualifierKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDatatypeQualifierKindToString(Mif2Package.Literals.DATATYPE_QUALIFIER_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateOrTimestampFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateOrTimestampToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDecimalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultDeterminerKind createDefaultDeterminerKindObjectFromString(EDataType eDataType, String initialValue) {
		return createDefaultDeterminerKindFromString(Mif2Package.Literals.DEFAULT_DETERMINER_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultDeterminerKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefaultDeterminerKindToString(Mif2Package.Literals.DEFAULT_DETERMINER_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createDefinedContextKindFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Enumerator result = null;
		RuntimeException exception = null;
		try {
			result = (Enumerator)createAffiliateKindFromString(Mif2Package.Literals.AFFILIATE_KIND, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinedContextKindToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Mif2Package.Literals.AFFILIATE_KIND.isInstance(instanceValue)) {
			try {
				String value = convertAffiliateKindToString(Mif2Package.Literals.AFFILIATE_KIND, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedMappingSourceKind createDefinedMappingSourceKindObjectFromString(EDataType eDataType, String initialValue) {
		return createDefinedMappingSourceKindFromString(Mif2Package.Literals.DEFINED_MAPPING_SOURCE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinedMappingSourceKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefinedMappingSourceKindToString(Mif2Package.Literals.DEFINED_MAPPING_SOURCE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedRoleKind createDefinedRoleKindObjectFromString(EDataType eDataType, String initialValue) {
		return createDefinedRoleKindFromString(Mif2Package.Literals.DEFINED_ROLE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinedRoleKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefinedRoleKindToString(Mif2Package.Literals.DEFINED_ROLE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationRelationshipKind createDerivationRelationshipKindObjectFromString(EDataType eDataType, String initialValue) {
		return createDerivationRelationshipKindFromString(Mif2Package.Literals.DERIVATION_RELATIONSHIP_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDerivationRelationshipKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDerivationRelationshipKindToString(Mif2Package.Literals.DERIVATION_RELATIONSHIP_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignCommentTagKind createDesignCommentTagKindObjectFromString(EDataType eDataType, String initialValue) {
		return createDesignCommentTagKindFromString(Mif2Package.Literals.DESIGN_COMMENT_TAG_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDesignCommentTagKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDesignCommentTagKindToString(Mif2Package.Literals.DESIGN_COMMENT_TAG_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentProfileKind createDocumentProfileKindObjectFromString(EDataType eDataType, String initialValue) {
		return createDocumentProfileKindFromString(Mif2Package.Literals.DOCUMENT_PROFILE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentProfileKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentProfileKindToString(Mif2Package.Literals.DOCUMENT_PROFILE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainKind createDomainKindObjectFromString(EDataType eDataType, String initialValue) {
		return createDomainKindFromString(Mif2Package.Literals.DOMAIN_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDomainKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDomainKindToString(Mif2Package.Literals.DOMAIN_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationUnitsKind createDurationUnitsKindObjectFromString(EDataType eDataType, String initialValue) {
		return createDurationUnitsKindFromString(Mif2Package.Literals.DURATION_UNITS_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationUnitsKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDurationUnitsKindToString(Mif2Package.Literals.DURATION_UNITS_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffortQuantifierKind createEffortQuantifierKindObjectFromString(EDataType eDataType, String initialValue) {
		return createEffortQuantifierKindFromString(Mif2Package.Literals.EFFORT_QUANTIFIER_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEffortQuantifierKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEffortQuantifierKindToString(Mif2Package.Literals.EFFORT_QUANTIFIER_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEMailFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEMailToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEnumerationStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumerationStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEnumerationTokenFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumerationTokenToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionLanguageKind createExpressionLanguageKindObjectFromString(EDataType eDataType, String initialValue) {
		return createExpressionLanguageKindFromString(Mif2Package.Literals.EXPRESSION_LANGUAGE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionLanguageKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExpressionLanguageKindToString(Mif2Package.Literals.EXPRESSION_LANGUAGE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterKind createFilterKindObjectFromString(EDataType eDataType, String initialValue) {
		return createFilterKindFromString(Mif2Package.Literals.FILTER_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFilterKindToString(Mif2Package.Literals.FILTER_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFormalProperNameFromString(EDataType eDataType, String initialValue) {
		return createUpperCamelCaseFromString(Mif2Package.Literals.UPPER_CAMEL_CASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormalProperNameToString(EDataType eDataType, Object instanceValue) {
		return convertUpperCamelCaseToString(Mif2Package.Literals.UPPER_CAMEL_CASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFormalPropertyNameFromString(EDataType eDataType, String initialValue) {
		return createLowerCamelCaseFromString(Mif2Package.Literals.LOWER_CAMEL_CASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormalPropertyNameToString(EDataType eDataType, Object instanceValue) {
		return convertLowerCamelCaseToString(Mif2Package.Literals.LOWER_CAMEL_CASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functionalism createFunctionalismObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionalismFromString(Mif2Package.Literals.FUNCTIONALISM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionalismObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionalismToString(Mif2Package.Literals.FUNCTIONALISM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createGraphicMeasurementFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphicMeasurementToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHashCodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHashCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconFormatKind createIconFormatKindObjectFromString(EDataType eDataType, String initialValue) {
		return createIconFormatKindFromString(Mif2Package.Literals.ICON_FORMAT_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIconFormatKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIconFormatKindToString(Mif2Package.Literals.ICON_FORMAT_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionKind createInteractionKindObjectFromString(EDataType eDataType, String initialValue) {
		return createInteractionKindFromString(Mif2Package.Literals.INTERACTION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInteractionKindToString(Mif2Package.Literals.INTERACTION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionProfileKind createInteractionProfileKindObjectFromString(EDataType eDataType, String initialValue) {
		return createInteractionProfileKindFromString(Mif2Package.Literals.INTERACTION_PROFILE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionProfileKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInteractionProfileKindToString(Mif2Package.Literals.INTERACTION_PROFILE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITSKind createITSKindObjectFromString(EDataType eDataType, String initialValue) {
		return createITSKindFromString(Mif2Package.Literals.ITS_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertITSKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertITSKindToString(Mif2Package.Literals.ITS_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLocalFileReferenceFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalFileReferenceToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLongDescriptiveNameFromString(EDataType eDataType, String initialValue) {
		return createNonEmptyStringFromString(Mif2Package.Literals.NON_EMPTY_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongDescriptiveNameToString(EDataType eDataType, Object instanceValue) {
		return convertNonEmptyStringToString(Mif2Package.Literals.NON_EMPTY_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLowerCamelCaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLowerCamelCaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMappingSourceKindFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createDefinedMappingSourceKindFromString(Mif2Package.Literals.DEFINED_MAPPING_SOURCE_KIND, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createShortDescriptiveNameFromString(Mif2Package.Literals.SHORT_DESCRIPTIVE_NAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMappingSourceKindToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Mif2Package.Literals.DEFINED_MAPPING_SOURCE_KIND.isInstance(instanceValue)) {
			try {
				String value = convertDefinedMappingSourceKindToString(Mif2Package.Literals.DEFINED_MAPPING_SOURCE_KIND, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Mif2Package.Literals.SHORT_DESCRIPTIVE_NAME.isInstance(instanceValue)) {
			try {
				String value = convertShortDescriptiveNameToString(Mif2Package.Literals.SHORT_DESCRIPTIVE_NAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapRelationshipKind createMapRelationshipKindObjectFromString(EDataType eDataType, String initialValue) {
		return createMapRelationshipKindFromString(Mif2Package.Literals.MAP_RELATIONSHIP_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapRelationshipKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMapRelationshipKindToString(Mif2Package.Literals.MAP_RELATIONSHIP_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMimeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelConformanceKind createModelConformanceKindObjectFromString(EDataType eDataType, String initialValue) {
		return createModelConformanceKindFromString(Mif2Package.Literals.MODEL_CONFORMANCE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelConformanceKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModelConformanceKindToString(Mif2Package.Literals.MODEL_CONFORMANCE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeVoteResolutionKind createNegativeVoteResolutionKindObjectFromString(EDataType eDataType, String initialValue) {
		return createNegativeVoteResolutionKindFromString(Mif2Package.Literals.NEGATIVE_VOTE_RESOLUTION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNegativeVoteResolutionKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNegativeVoteResolutionKindToString(Mif2Package.Literals.NEGATIVE_VOTE_RESOLUTION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeOrientation createNodeOrientationObjectFromString(EDataType eDataType, String initialValue) {
		return createNodeOrientationFromString(Mif2Package.Literals.NODE_ORIENTATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeOrientationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNodeOrientationToString(Mif2Package.Literals.NODE_ORIENTATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonEmptyStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonEmptyStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createNonNegativeDecimalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeDecimalToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOidFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOidToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnerScopeKind createOwnerScopeKindObjectFromString(EDataType eDataType, String initialValue) {
		return createOwnerScopeKindFromString(Mif2Package.Literals.OWNER_SCOPE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOwnerScopeKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOwnerScopeKindToString(Mif2Package.Literals.OWNER_SCOPE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageKind createPackageKindObjectFromString(EDataType eDataType, String initialValue) {
		return createPackageKindFromString(Mif2Package.Literals.PACKAGE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPackageKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPackageKindToString(Mif2Package.Literals.PACKAGE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRootKind createPackageRootKindObjectFromString(EDataType eDataType, String initialValue) {
		return createPackageRootKindFromString(Mif2Package.Literals.PACKAGE_ROOT_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPackageRootKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPackageRootKindToString(Mif2Package.Literals.PACKAGE_ROOT_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentArtifactKind createParentArtifactKindObjectFromString(EDataType eDataType, String initialValue) {
		return createParentArtifactKindFromString(Mif2Package.Literals.PARENT_ARTIFACT_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParentArtifactKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParentArtifactKindToString(Mif2Package.Literals.PARENT_ARTIFACT_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createPositiveDecimalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveDecimalToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPrefixedUpperCamelCaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrefixedUpperCamelCaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefaultHandlingKind createPropertyDefaultHandlingKindObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyDefaultHandlingKindFromString(Mif2Package.Literals.PROPERTY_DEFAULT_HANDLING_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyDefaultHandlingKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyDefaultHandlingKindToString(Mif2Package.Literals.PROPERTY_DEFAULT_HANDLING_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRealmKindFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createEnumerationTokenFromString(Mif2Package.Literals.ENUMERATION_TOKEN, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createDefinedContextKindFromString(Mif2Package.Literals.DEFINED_CONTEXT_KIND, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRealmKindToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Mif2Package.Literals.ENUMERATION_TOKEN.isInstance(instanceValue)) {
			try {
				String value = convertEnumerationTokenToString(Mif2Package.Literals.ENUMERATION_TOKEN, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Mif2Package.Literals.DEFINED_CONTEXT_KIND.isInstance(instanceValue)) {
			try {
				String value = convertDefinedContextKindToString(Mif2Package.Literals.DEFINED_CONTEXT_KIND, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRealmNamespaceKindFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createRealmKindFromString(Mif2Package.Literals.REALM_KIND, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createOidFromString(Mif2Package.Literals.OID, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRealmNamespaceKindToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Mif2Package.Literals.REALM_KIND.isInstance(instanceValue)) {
			try {
				String value = convertRealmKindToString(Mif2Package.Literals.REALM_KIND, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Mif2Package.Literals.OID.isInstance(instanceValue)) {
			try {
				String value = convertOidToString(Mif2Package.Literals.OID, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reflexivity createReflexivityObjectFromString(EDataType eDataType, String initialValue) {
		return createReflexivityFromString(Mif2Package.Literals.REFLEXIVITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReflexivityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReflexivityToString(Mif2Package.Literals.REFLEXIVITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTraversalKind createRelationshipTraversalKindObjectFromString(EDataType eDataType, String initialValue) {
		return createRelationshipTraversalKindFromString(Mif2Package.Literals.RELATIONSHIP_TRAVERSAL_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTraversalKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelationshipTraversalKindToString(Mif2Package.Literals.RELATIONSHIP_TRAVERSAL_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionFrequencyKind createRevisionFrequencyKindObjectFromString(EDataType eDataType, String initialValue) {
		return createRevisionFrequencyKindFromString(Mif2Package.Literals.REVISION_FREQUENCY_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRevisionFrequencyKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRevisionFrequencyKindToString(Mif2Package.Literals.REVISION_FREQUENCY_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRoleKindFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createDefinedRoleKindFromString(Mif2Package.Literals.DEFINED_ROLE_KIND, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createShortDescriptiveNameFromString(Mif2Package.Literals.SHORT_DESCRIPTIVE_NAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleKindToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Mif2Package.Literals.DEFINED_ROLE_KIND.isInstance(instanceValue)) {
			try {
				String value = convertDefinedRoleKindToString(Mif2Package.Literals.DEFINED_ROLE_KIND, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Mif2Package.Literals.SHORT_DESCRIPTIVE_NAME.isInstance(instanceValue)) {
			try {
				String value = convertShortDescriptiveNameToString(Mif2Package.Literals.SHORT_DESCRIPTIVE_NAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionKind createSectionKindObjectFromString(EDataType eDataType, String initialValue) {
		return createSectionKindFromString(Mif2Package.Literals.SECTION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSectionKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSectionKindToString(Mif2Package.Literals.SECTION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createShortDescriptiveNameFromString(EDataType eDataType, String initialValue) {
		return createNonEmptyStringFromString(Mif2Package.Literals.NON_EMPTY_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShortDescriptiveNameToString(EDataType eDataType, Object instanceValue) {
		return convertNonEmptyStringToString(Mif2Package.Literals.NON_EMPTY_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createShortStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShortStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createSingleNonNegativeIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSingleNonNegativeIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createSmallNonNegativeIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSmallNonNegativeIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createSmallPositiveIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSmallPositiveIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelDiagramPresentationKind createStaticModelDiagramPresentationKindObjectFromString(EDataType eDataType, String initialValue) {
		return createStaticModelDiagramPresentationKindFromString(Mif2Package.Literals.STATIC_MODEL_DIAGRAM_PRESENTATION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStaticModelDiagramPresentationKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStaticModelDiagramPresentationKindToString(Mif2Package.Literals.STATIC_MODEL_DIAGRAM_PRESENTATION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelRepresentationKind createStaticModelRepresentationKindObjectFromString(EDataType eDataType, String initialValue) {
		return createStaticModelRepresentationKindFromString(Mif2Package.Literals.STATIC_MODEL_REPRESENTATION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStaticModelRepresentationKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStaticModelRepresentationKindToString(Mif2Package.Literals.STATIC_MODEL_REPRESENTATION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelUseKind createStaticModelUseKindObjectFromString(EDataType eDataType, String initialValue) {
		return createStaticModelUseKindFromString(Mif2Package.Literals.STATIC_MODEL_USE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStaticModelUseKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStaticModelUseKindToString(Mif2Package.Literals.STATIC_MODEL_USE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubArtifactKind createSubArtifactKindObjectFromString(EDataType eDataType, String initialValue) {
		return createSubArtifactKindFromString(Mif2Package.Literals.SUB_ARTIFACT_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubArtifactKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubArtifactKindToString(Mif2Package.Literals.SUB_ARTIFACT_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSectionKind createSubSectionKindObjectFromString(EDataType eDataType, String initialValue) {
		return createSubSectionKindFromString(Mif2Package.Literals.SUB_SECTION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubSectionKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubSectionKindToString(Mif2Package.Literals.SUB_SECTION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symmetry createSymmetryObjectFromString(EDataType eDataType, String initialValue) {
		return createSymmetryFromString(Mif2Package.Literals.SYMMETRY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryToString(Mif2Package.Literals.SYMMETRY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTemplateIdFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemplateIdToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyServerKind createTerminologyServerKindObjectFromString(EDataType eDataType, String initialValue) {
		return createTerminologyServerKindFromString(Mif2Package.Literals.TERMINOLOGY_SERVER_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTerminologyServerKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTerminologyServerKindToString(Mif2Package.Literals.TERMINOLOGY_SERVER_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transitivity createTransitivityObjectFromString(EDataType eDataType, String initialValue) {
		return createTransitivityFromString(Mif2Package.Literals.TRANSITIVITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitivityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransitivityToString(Mif2Package.Literals.TRANSITIVITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslatableDirectionKind createTranslatableDirectionKindObjectFromString(EDataType eDataType, String initialValue) {
		return createTranslatableDirectionKindFromString(Mif2Package.Literals.TRANSLATABLE_DIRECTION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTranslatableDirectionKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTranslatableDirectionKindToString(Mif2Package.Literals.TRANSLATABLE_DIRECTION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createUnlimitedIntegerFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createSmallPositiveIntegerFromString(Mif2Package.Literals.SMALL_POSITIVE_INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createUnlimitedMultiplicityFromString(Mif2Package.Literals.UNLIMITED_MULTIPLICITY, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnlimitedIntegerToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Mif2Package.Literals.SMALL_POSITIVE_INTEGER.isInstance(instanceValue)) {
			try {
				String value = convertSmallPositiveIntegerToString(Mif2Package.Literals.SMALL_POSITIVE_INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Mif2Package.Literals.UNLIMITED_MULTIPLICITY.isInstance(instanceValue)) {
			try {
				String value = convertUnlimitedMultiplicityToString(Mif2Package.Literals.UNLIMITED_MULTIPLICITY, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnlimitedMultiplicity createUnlimitedMultiplicityObjectFromString(EDataType eDataType, String initialValue) {
		return createUnlimitedMultiplicityFromString(Mif2Package.Literals.UNLIMITED_MULTIPLICITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnlimitedMultiplicityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnlimitedMultiplicityToString(Mif2Package.Literals.UNLIMITED_MULTIPLICITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UpdateModeKind> createUpdateModeCodesFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<UpdateModeKind> result = new ArrayList<UpdateModeKind>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createUpdateModeKindFromString(Mif2Package.Literals.UPDATE_MODE_KIND, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateModeCodesToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertUpdateModeKindToString(Mif2Package.Literals.UPDATE_MODE_KIND, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateModeKind createUpdateModeKindObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateModeKindFromString(Mif2Package.Literals.UPDATE_MODE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateModeKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateModeKindToString(Mif2Package.Literals.UPDATE_MODE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUpperCamelCaseFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperCamelCaseToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUriFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUrlFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUrlToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUuidFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUuidToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindObjectFromString(EDataType eDataType, String initialValue) {
		return createVisibilityKindFromString(Mif2Package.Literals.VISIBILITY_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisibilityKindToString(Mif2Package.Literals.VISIBILITY_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyModelDefinitionKind createVocabularyModelDefinitionKindObjectFromString(EDataType eDataType, String initialValue) {
		return createVocabularyModelDefinitionKindFromString(Mif2Package.Literals.VOCABULARY_MODEL_DEFINITION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVocabularyModelDefinitionKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVocabularyModelDefinitionKindToString(Mif2Package.Literals.VOCABULARY_MODEL_DEFINITION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoteCommentKind createVoteCommentKindObjectFromString(EDataType eDataType, String initialValue) {
		return createVoteCommentKindFromString(Mif2Package.Literals.VOTE_COMMENT_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoteCommentKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVoteCommentKindToString(Mif2Package.Literals.VOTE_COMMENT_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoteKind createVoteKindObjectFromString(EDataType eDataType, String initialValue) {
		return createVoteKindFromString(Mif2Package.Literals.VOTE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoteKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVoteKindToString(Mif2Package.Literals.VOTE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createVoteResolutionKindFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Enumerator result = null;
		RuntimeException exception = null;
		try {
			result = (Enumerator)createAffirmativeVoteResolutionKindFromString(Mif2Package.Literals.AFFIRMATIVE_VOTE_RESOLUTION_KIND, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createNegativeVoteResolutionKindFromString(Mif2Package.Literals.NEGATIVE_VOTE_RESOLUTION_KIND, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoteResolutionKindToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (Mif2Package.Literals.AFFIRMATIVE_VOTE_RESOLUTION_KIND.isInstance(instanceValue)) {
			try {
				String value = convertAffirmativeVoteResolutionKindToString(Mif2Package.Literals.AFFIRMATIVE_VOTE_RESOLUTION_KIND, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (Mif2Package.Literals.NEGATIVE_VOTE_RESOLUTION_KIND.isInstance(instanceValue)) {
			try {
				String value = convertNegativeVoteResolutionKindToString(Mif2Package.Literals.NEGATIVE_VOTE_RESOLUTION_KIND, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createXDomainNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXDomainNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createYearFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYearToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createYearsFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigInteger> result = new ArrayList<BigInteger>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createYearFromString(Mif2Package.Literals.YEAR, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYearsToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertYearToString(Mif2Package.Literals.YEAR, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mif2Package getMif2Package() {
		return (Mif2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mif2Package getPackage() {
		return Mif2Package.eINSTANCE;
	}

} //Mif2FactoryImpl
