/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.openhealthtools.mdht.emf.hl7.mif2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package
 * @generated
 */
public class Mif2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Mif2Validator INSTANCE = new Mif2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.emf.hl7.mif2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mif2Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Mif2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Mif2Package.ADD_ELEMENT_CONTENT:
				return validateAddElementContent((AddElementContent)value, diagnostics, context);
			case Mif2Package.ANNOTATION_BASE:
				return validateAnnotationBase((AnnotationBase)value, diagnostics, context);
			case Mif2Package.ANNOTATION_CASCADE_INFO:
				return validateAnnotationCascadeInfo((AnnotationCascadeInfo)value, diagnostics, context);
			case Mif2Package.ANNOTATION_DERIVATION:
				return validateAnnotationDerivation((AnnotationDerivation)value, diagnostics, context);
			case Mif2Package.ANNOTATIONS:
				return validateAnnotations((Annotations)value, diagnostics, context);
			case Mif2Package.APPENDIX:
				return validateAppendix((Appendix)value, diagnostics, context);
			case Mif2Package.APP_INFO:
				return validateAppInfo((AppInfo)value, diagnostics, context);
			case Mif2Package.APPLICATION_ROLE:
				return validateApplicationRole((ApplicationRole)value, diagnostics, context);
			case Mif2Package.APPLICATION_ROLE_ANNOTATIONS:
				return validateApplicationRoleAnnotations((ApplicationRoleAnnotations)value, diagnostics, context);
			case Mif2Package.APPLICATION_ROLE_APP_INFO:
				return validateApplicationRoleAppInfo((ApplicationRoleAppInfo)value, diagnostics, context);
			case Mif2Package.APPLICATION_ROLE_DOCUMENTATION:
				return validateApplicationRoleDocumentation((ApplicationRoleDocumentation)value, diagnostics, context);
			case Mif2Package.APPLIED_TEMPLATE_GROUP:
				return validateAppliedTemplateGroup((AppliedTemplateGroup)value, diagnostics, context);
			case Mif2Package.APPROVAL_INFO:
				return validateApprovalInfo((ApprovalInfo)value, diagnostics, context);
			case Mif2Package.ARTIFACT_CROSS_REFERENCE:
				return validateArtifactCrossReference((ArtifactCrossReference)value, diagnostics, context);
			case Mif2Package.ARTIFACT_DEPENDENCY:
				return validateArtifactDependency((ArtifactDependency)value, diagnostics, context);
			case Mif2Package.ARTIFACT_SUPPLEMENT:
				return validateArtifactSupplement((ArtifactSupplement)value, diagnostics, context);
			case Mif2Package.ARTIFACT_SUPPLEMENT_ANNOTATIONS:
				return validateArtifactSupplementAnnotations((ArtifactSupplementAnnotations)value, diagnostics, context);
			case Mif2Package.ARTIFACT_SUPPLEMENT_APP_INFO:
				return validateArtifactSupplementAppInfo((ArtifactSupplementAppInfo)value, diagnostics, context);
			case Mif2Package.ARTIFACT_SUPPLEMENT_DOCUMENTATION:
				return validateArtifactSupplementDocumentation((ArtifactSupplementDocumentation)value, diagnostics, context);
			case Mif2Package.ARTIFACT_XREF_SUMMARY:
				return validateArtifactXRefSummary((ArtifactXRefSummary)value, diagnostics, context);
			case Mif2Package.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_ANNOTATIONS:
				return validateAssociationAnnotations((AssociationAnnotations)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_APP_INFO:
				return validateAssociationAppInfo((AssociationAppInfo)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_BASE:
				return validateAssociationBase((AssociationBase)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_DOCUMENTATION:
				return validateAssociationDocumentation((AssociationDocumentation)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_END:
				return validateAssociationEnd((AssociationEnd)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_END_ANNOTATIONS:
				return validateAssociationEndAnnotations((AssociationEndAnnotations)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_END_APP_INFO:
				return validateAssociationEndAppInfo((AssociationEndAppInfo)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_END_BASE:
				return validateAssociationEndBase((AssociationEndBase)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_END_DERIVATION:
				return validateAssociationEndDerivation((AssociationEndDerivation)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_END_DOCUMENTATION:
				return validateAssociationEndDocumentation((AssociationEndDocumentation)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION:
				return validateAssociationEndSpecialization((AssociationEndSpecialization)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_END_WITH_CLASS:
				return validateAssociationEndWithClass((AssociationEndWithClass)value, diagnostics, context);
			case Mif2Package.ASSOCIATION_END_WITH_CLASS_REF:
				return validateAssociationEndWithClassRef((AssociationEndWithClassRef)value, diagnostics, context);
			case Mif2Package.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case Mif2Package.ATTRIBUTE_ANNOTATIONS:
				return validateAttributeAnnotations((AttributeAnnotations)value, diagnostics, context);
			case Mif2Package.ATTRIBUTE_APP_INFO:
				return validateAttributeAppInfo((AttributeAppInfo)value, diagnostics, context);
			case Mif2Package.ATTRIBUTE_CONTENT:
				return validateAttributeContent((AttributeContent)value, diagnostics, context);
			case Mif2Package.ATTRIBUTE_DERIVATION:
				return validateAttributeDerivation((AttributeDerivation)value, diagnostics, context);
			case Mif2Package.ATTRIBUTE_DOCUMENTATION:
				return validateAttributeDocumentation((AttributeDocumentation)value, diagnostics, context);
			case Mif2Package.ATTRIBUTE_PROPERTY:
				return validateAttributeProperty((AttributeProperty)value, diagnostics, context);
			case Mif2Package.ATTRIBUTE_REF:
				return validateAttributeRef((AttributeRef)value, diagnostics, context);
			case Mif2Package.ATTRIBUTE_VALUE_REF:
				return validateAttributeValueRef((AttributeValueRef)value, diagnostics, context);
			case Mif2Package.BALLOT_COMMENT:
				return validateBallotComment((BallotComment)value, diagnostics, context);
			case Mif2Package.BALLOT_COMMENT_RESOLUTION:
				return validateBallotCommentResolution((BallotCommentResolution)value, diagnostics, context);
			case Mif2Package.BALLOT_SUBMISSION:
				return validateBallotSubmission((BallotSubmission)value, diagnostics, context);
			case Mif2Package.BASIC_ANNOTATION:
				return validateBasicAnnotation((BasicAnnotation)value, diagnostics, context);
			case Mif2Package.BINDING_REALM:
				return validateBindingRealm((BindingRealm)value, diagnostics, context);
			case Mif2Package.BOUND_STATIC_MODEL:
				return validateBoundStaticModel((BoundStaticModel)value, diagnostics, context);
			case Mif2Package.BUSINESS_NAME:
				return validateBusinessName((BusinessName)value, diagnostics, context);
			case Mif2Package.CASCADABLE_ANNOTATION:
				return validateCascadableAnnotation((CascadableAnnotation)value, diagnostics, context);
			case Mif2Package.CHANGE:
				return validateChange((Change)value, diagnostics, context);
			case Mif2Package.CHANGE_REQUEST:
				return validateChangeRequest((ChangeRequest)value, diagnostics, context);
			case Mif2Package.CHANGE_REQUEST_ESTIMATE:
				return validateChangeRequestEstimate((ChangeRequestEstimate)value, diagnostics, context);
			case Mif2Package.CLASS_ANNOTATIONS:
				return validateClassAnnotations((ClassAnnotations)value, diagnostics, context);
			case Mif2Package.CLASS_APP_INFO:
				return validateClassAppInfo((ClassAppInfo)value, diagnostics, context);
			case Mif2Package.CLASS_BASE:
				return validateClassBase((ClassBase)value, diagnostics, context);
			case Mif2Package.CLASS_BINDING_ARGUMENT:
				return validateClassBindingArgument((ClassBindingArgument)value, diagnostics, context);
			case Mif2Package.CLASS_BINDING_ARGUMENT_BASE:
				return validateClassBindingArgumentBase((ClassBindingArgumentBase)value, diagnostics, context);
			case Mif2Package.CLASS_DERIVATION:
				return validateClassDerivation((ClassDerivation)value, diagnostics, context);
			case Mif2Package.CLASS_DOCUMENTATION:
				return validateClassDocumentation((ClassDocumentation)value, diagnostics, context);
			case Mif2Package.CLASS_ELEMENT:
				return validateClassElement((ClassElement)value, diagnostics, context);
			case Mif2Package.CLASS_GENERALIZATION:
				return validateClassGeneralization((ClassGeneralization)value, diagnostics, context);
			case Mif2Package.CLASS_GENERALIZATION_BASE:
				return validateClassGeneralizationBase((ClassGeneralizationBase)value, diagnostics, context);
			case Mif2Package.CLASS_GRAPHIC_INFORMATION:
				return validateClassGraphicInformation((ClassGraphicInformation)value, diagnostics, context);
			case Mif2Package.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case Mif2Package.CLASSIFIER_BASE:
				return validateClassifierBase((ClassifierBase)value, diagnostics, context);
			case Mif2Package.CLASS_OR_REFERENCE:
				return validateClassOrReference((ClassOrReference)value, diagnostics, context);
			case Mif2Package.CLASS_REF:
				return validateClassRef((ClassRef)value, diagnostics, context);
			case Mif2Package.CLASS_STUB_INTERFACE:
				return validateClassStubInterface((ClassStubInterface)value, diagnostics, context);
			case Mif2Package.CLASS_STUB_INTERFACE_ANNOTATIONS:
				return validateClassStubInterfaceAnnotations((ClassStubInterfaceAnnotations)value, diagnostics, context);
			case Mif2Package.CLASS_STUB_INTERFACE_APP_INFO:
				return validateClassStubInterfaceAppInfo((ClassStubInterfaceAppInfo)value, diagnostics, context);
			case Mif2Package.CLASS_STUB_INTERFACE_DOCUMENTATION:
				return validateClassStubInterfaceDocumentation((ClassStubInterfaceDocumentation)value, diagnostics, context);
			case Mif2Package.CODE:
				return validateCode((Code)value, diagnostics, context);
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION:
				return validateCodeBasedContentDefinition((CodeBasedContentDefinition)value, diagnostics, context);
			case Mif2Package.CODE_FILTER_CONTENT_DEFINITION:
				return validateCodeFilterContentDefinition((CodeFilterContentDefinition)value, diagnostics, context);
			case Mif2Package.CODE_ICON:
				return validateCodeIcon((CodeIcon)value, diagnostics, context);
			case Mif2Package.CODE_SUPPLEMENT:
				return validateCodeSupplement((CodeSupplement)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM:
				return validateCodeSystem((CodeSystem)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM_ANNOTATIONS:
				return validateCodeSystemAnnotations((CodeSystemAnnotations)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM_APP_INFO:
				return validateCodeSystemAppInfo((CodeSystemAppInfo)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM_BASE:
				return validateCodeSystemBase((CodeSystemBase)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM_DOCUMENTATION:
				return validateCodeSystemDocumentation((CodeSystemDocumentation)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM_REF:
				return validateCodeSystemRef((CodeSystemRef)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM_SUPPLEMENT:
				return validateCodeSystemSupplement((CodeSystemSupplement)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM_VERSION:
				return validateCodeSystemVersion((CodeSystemVersion)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM_VERSION_ANNOTATIONS:
				return validateCodeSystemVersionAnnotations((CodeSystemVersionAnnotations)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM_VERSION_APP_INFO:
				return validateCodeSystemVersionAppInfo((CodeSystemVersionAppInfo)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM_VERSION_BASE:
				return validateCodeSystemVersionBase((CodeSystemVersionBase)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM_VERSION_DOCUMENTATION:
				return validateCodeSystemVersionDocumentation((CodeSystemVersionDocumentation)value, diagnostics, context);
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT:
				return validateCodeSystemVersionSupplement((CodeSystemVersionSupplement)value, diagnostics, context);
			case Mif2Package.CODE_TRANSLATION:
				return validateCodeTranslation((CodeTranslation)value, diagnostics, context);
			case Mif2Package.CODE_TRANSLATION_ANNOTATIONS:
				return validateCodeTranslationAnnotations((CodeTranslationAnnotations)value, diagnostics, context);
			case Mif2Package.CODE_TRANSLATION_APP_INFO:
				return validateCodeTranslationAppInfo((CodeTranslationAppInfo)value, diagnostics, context);
			case Mif2Package.CODE_TRANSLATION_COLLECTION:
				return validateCodeTranslationCollection((CodeTranslationCollection)value, diagnostics, context);
			case Mif2Package.CODE_TRANSLATION_COLLECTION_ANNOTATIONS:
				return validateCodeTranslationCollectionAnnotations((CodeTranslationCollectionAnnotations)value, diagnostics, context);
			case Mif2Package.CODE_TRANSLATION_COLLECTION_APP_INFO:
				return validateCodeTranslationCollectionAppInfo((CodeTranslationCollectionAppInfo)value, diagnostics, context);
			case Mif2Package.CODE_TRANSLATION_COLLECTION_DOCUMENTATION:
				return validateCodeTranslationCollectionDocumentation((CodeTranslationCollectionDocumentation)value, diagnostics, context);
			case Mif2Package.CODE_TRANSLATION_DOCUMENTATION:
				return validateCodeTranslationDocumentation((CodeTranslationDocumentation)value, diagnostics, context);
			case Mif2Package.COMBINED_CONTENT_DEFINITION:
				return validateCombinedContentDefinition((CombinedContentDefinition)value, diagnostics, context);
			case Mif2Package.COMMITTEE_REFERENCE:
				return validateCommitteeReference((CommitteeReference)value, diagnostics, context);
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION:
				return validateCommonModelElementDefinition((CommonModelElementDefinition)value, diagnostics, context);
			case Mif2Package.COMMON_MODEL_ELEMENT_REF:
				return validateCommonModelElementRef((CommonModelElementRef)value, diagnostics, context);
			case Mif2Package.COMMON_MODEL_ELEMENT_REF_ANNOTATIONS:
				return validateCommonModelElementRefAnnotations((CommonModelElementRefAnnotations)value, diagnostics, context);
			case Mif2Package.COMMON_MODEL_ELEMENT_REF_APP_INFO:
				return validateCommonModelElementRefAppInfo((CommonModelElementRefAppInfo)value, diagnostics, context);
			case Mif2Package.COMMON_MODEL_ELEMENT_REF_BASE:
				return validateCommonModelElementRefBase((CommonModelElementRefBase)value, diagnostics, context);
			case Mif2Package.COMMON_MODEL_ELEMENT_REF_DOCUMENTATION:
				return validateCommonModelElementRefDocumentation((CommonModelElementRefDocumentation)value, diagnostics, context);
			case Mif2Package.COMPLEX_MARKUP_WITH_LANGUAGE:
				return validateComplexMarkupWithLanguage((ComplexMarkupWithLanguage)value, diagnostics, context);
			case Mif2Package.CONCEPT:
				return validateConcept((Concept)value, diagnostics, context);
			case Mif2Package.CONCEPT_ANNOTATIONS:
				return validateConceptAnnotations((ConceptAnnotations)value, diagnostics, context);
			case Mif2Package.CONCEPT_APP_INFO:
				return validateConceptAppInfo((ConceptAppInfo)value, diagnostics, context);
			case Mif2Package.CONCEPT_BASE:
				return validateConceptBase((ConceptBase)value, diagnostics, context);
			case Mif2Package.CONCEPT_DOCUMENTATION:
				return validateConceptDocumentation((ConceptDocumentation)value, diagnostics, context);
			case Mif2Package.CONCEPT_DOMAIN:
				return validateConceptDomain((ConceptDomain)value, diagnostics, context);
			case Mif2Package.CONCEPT_DOMAIN_ANNOTATIONS:
				return validateConceptDomainAnnotations((ConceptDomainAnnotations)value, diagnostics, context);
			case Mif2Package.CONCEPT_DOMAIN_APP_INFO:
				return validateConceptDomainAppInfo((ConceptDomainAppInfo)value, diagnostics, context);
			case Mif2Package.CONCEPT_DOMAIN_DOCUMENTATION:
				return validateConceptDomainDocumentation((ConceptDomainDocumentation)value, diagnostics, context);
			case Mif2Package.CONCEPT_DOMAIN_PROPERTY:
				return validateConceptDomainProperty((ConceptDomainProperty)value, diagnostics, context);
			case Mif2Package.CONCEPT_DOMAIN_REF:
				return validateConceptDomainRef((ConceptDomainRef)value, diagnostics, context);
			case Mif2Package.CONCEPT_PROPERTY:
				return validateConceptProperty((ConceptProperty)value, diagnostics, context);
			case Mif2Package.CONCEPT_PROPERTY_REF:
				return validateConceptPropertyRef((ConceptPropertyRef)value, diagnostics, context);
			case Mif2Package.CONCEPT_REF:
				return validateConceptRef((ConceptRef)value, diagnostics, context);
			case Mif2Package.CONCEPT_RELATIONSHIP:
				return validateConceptRelationship((ConceptRelationship)value, diagnostics, context);
			case Mif2Package.CONCEPT_SUPPLEMENT:
				return validateConceptSupplement((ConceptSupplement)value, diagnostics, context);
			case Mif2Package.CONCEPT_SUPPLEMENT_ANNOTATIONS:
				return validateConceptSupplementAnnotations((ConceptSupplementAnnotations)value, diagnostics, context);
			case Mif2Package.CONCEPT_SUPPLEMENT_APP_INFO:
				return validateConceptSupplementAppInfo((ConceptSupplementAppInfo)value, diagnostics, context);
			case Mif2Package.CONCEPT_SUPPLEMENT_DOCUMENTATION:
				return validateConceptSupplementDocumentation((ConceptSupplementDocumentation)value, diagnostics, context);
			case Mif2Package.CONCEPT_USE:
				return validateConceptUse((ConceptUse)value, diagnostics, context);
			case Mif2Package.CONFORMANCE_PROFILE:
				return validateConformanceProfile((ConformanceProfile)value, diagnostics, context);
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS:
				return validateConformanceProfileAnnotations((ConformanceProfileAnnotations)value, diagnostics, context);
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO:
				return validateConformanceProfileAppInfo((ConformanceProfileAppInfo)value, diagnostics, context);
			case Mif2Package.CONFORMANCE_PROFILE_DOCUMENTATION:
				return validateConformanceProfileDocumentation((ConformanceProfileDocumentation)value, diagnostics, context);
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS:
				return validateConformanceTriggerEvents((ConformanceTriggerEvents)value, diagnostics, context);
			case Mif2Package.CONTAINED_GRAPH_NODE:
				return validateContainedGraphNode((ContainedGraphNode)value, diagnostics, context);
			case Mif2Package.CONTENT_DEFINITION:
				return validateContentDefinition((ContentDefinition)value, diagnostics, context);
			case Mif2Package.CONTENT_DEFINITION_ANNOTATIONS:
				return validateContentDefinitionAnnotations((ContentDefinitionAnnotations)value, diagnostics, context);
			case Mif2Package.CONTENT_DEFINITION_APP_INFO:
				return validateContentDefinitionAppInfo((ContentDefinitionAppInfo)value, diagnostics, context);
			case Mif2Package.CONTENT_DEFINITION_DOCUMENTATION:
				return validateContentDefinitionDocumentation((ContentDefinitionDocumentation)value, diagnostics, context);
			case Mif2Package.CONTEXT_ANNOTATION:
				return validateContextAnnotation((ContextAnnotation)value, diagnostics, context);
			case Mif2Package.CONTEXT_BINDING:
				return validateContextBinding((ContextBinding)value, diagnostics, context);
			case Mif2Package.CONTRIBUTOR:
				return validateContributor((Contributor)value, diagnostics, context);
			case Mif2Package.DATATYPE:
				return validateDatatype((Datatype)value, diagnostics, context);
			case Mif2Package.DATATYPE_ANNOTATIONS:
				return validateDatatypeAnnotations((DatatypeAnnotations)value, diagnostics, context);
			case Mif2Package.DATATYPE_APP_INFO:
				return validateDatatypeAppInfo((DatatypeAppInfo)value, diagnostics, context);
			case Mif2Package.DATATYPE_BINDING:
				return validateDatatypeBinding((DatatypeBinding)value, diagnostics, context);
			case Mif2Package.DATATYPE_DERIVATION:
				return validateDatatypeDerivation((DatatypeDerivation)value, diagnostics, context);
			case Mif2Package.DATATYPE_DOCUMENTATION:
				return validateDatatypeDocumentation((DatatypeDocumentation)value, diagnostics, context);
			case Mif2Package.DATATYPE_IMPORT:
				return validateDatatypeImport((DatatypeImport)value, diagnostics, context);
			case Mif2Package.DATATYPE_LIMITATION:
				return validateDatatypeLimitation((DatatypeLimitation)value, diagnostics, context);
			case Mif2Package.DATATYPE_MODEL_LIBRARY:
				return validateDatatypeModelLibrary((DatatypeModelLibrary)value, diagnostics, context);
			case Mif2Package.DATATYPE_OPERATION:
				return validateDatatypeOperation((DatatypeOperation)value, diagnostics, context);
			case Mif2Package.DATATYPE_PARAMETER:
				return validateDatatypeParameter((DatatypeParameter)value, diagnostics, context);
			case Mif2Package.DATATYPE_REF:
				return validateDatatypeRef((DatatypeRef)value, diagnostics, context);
			case Mif2Package.DATATYPE_TEMPLATE_PARAMETER:
				return validateDatatypeTemplateParameter((DatatypeTemplateParameter)value, diagnostics, context);
			case Mif2Package.DEPENDENCY:
				return validateDependency((Dependency)value, diagnostics, context);
			case Mif2Package.DEPRECATION_INFO:
				return validateDeprecationInfo((DeprecationInfo)value, diagnostics, context);
			case Mif2Package.DERIVATION:
				return validateDerivation((Derivation)value, diagnostics, context);
			case Mif2Package.DERIVED_STATIC_MODEL:
				return validateDerivedStaticModel((DerivedStaticModel)value, diagnostics, context);
			case Mif2Package.DERIVED_STATIC_MODELS_TYPE:
				return validateDerivedStaticModelsType((DerivedStaticModelsType)value, diagnostics, context);
			case Mif2Package.DESIGN_COMMENT:
				return validateDesignComment((DesignComment)value, diagnostics, context);
			case Mif2Package.DIAGRAM:
				return validateDiagram((Diagram)value, diagnostics, context);
			case Mif2Package.DIAGRAM_ELEMENT:
				return validateDiagramElement((DiagramElement)value, diagnostics, context);
			case Mif2Package.DIAGRAM_GRAPHIC_INFORMATION:
				return validateDiagramGraphicInformation((DiagramGraphicInformation)value, diagnostics, context);
			case Mif2Package.DIMENSION:
				return validateDimension((Dimension)value, diagnostics, context);
			case Mif2Package.DOCUMENTATION:
				return validateDocumentation((Documentation)value, diagnostics, context);
			case Mif2Package.DOCUMENT_PROFILE:
				return validateDocumentProfile((DocumentProfile)value, diagnostics, context);
			case Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS:
				return validateDocumentProfileAnnotations((DocumentProfileAnnotations)value, diagnostics, context);
			case Mif2Package.DOCUMENT_PROFILE_APP_INFO:
				return validateDocumentProfileAppInfo((DocumentProfileAppInfo)value, diagnostics, context);
			case Mif2Package.DOCUMENT_PROFILE_DOCUMENTATION:
				return validateDocumentProfileDocumentation((DocumentProfileDocumentation)value, diagnostics, context);
			case Mif2Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case Mif2Package.DOCUMENT_TEST:
				return validateDocumentTest((DocumentTest)value, diagnostics, context);
			case Mif2Package.DOMAIN_ANALYSIS_MODEL:
				return validateDomainAnalysisModel((DomainAnalysisModel)value, diagnostics, context);
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_ANNOTATIONS:
				return validateDomainAnalysisModelAnnotations((DomainAnalysisModelAnnotations)value, diagnostics, context);
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO:
				return validateDomainAnalysisModelAppInfo((DomainAnalysisModelAppInfo)value, diagnostics, context);
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_DOCUMENTATION:
				return validateDomainAnalysisModelDocumentation((DomainAnalysisModelDocumentation)value, diagnostics, context);
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE:
				return validateDomainInstanceExample((DomainInstanceExample)value, diagnostics, context);
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_ANNOTATIONS:
				return validateDomainInstanceExampleAnnotations((DomainInstanceExampleAnnotations)value, diagnostics, context);
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_APP_INFO:
				return validateDomainInstanceExampleAppInfo((DomainInstanceExampleAppInfo)value, diagnostics, context);
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION:
				return validateDomainInstanceExampleDocumentation((DomainInstanceExampleDocumentation)value, diagnostics, context);
			case Mif2Package.ELEMENT_CHANGE:
				return validateElementChange((ElementChange)value, diagnostics, context);
			case Mif2Package.ELEMENT_DERIVATION:
				return validateElementDerivation((ElementDerivation)value, diagnostics, context);
			case Mif2Package.ELEMENT_REF:
				return validateElementRef((ElementRef)value, diagnostics, context);
			case Mif2Package.ELEMENT_VALUE_REF:
				return validateElementValueRef((ElementValueRef)value, diagnostics, context);
			case Mif2Package.ENTRY_POINT:
				return validateEntryPoint((EntryPoint)value, diagnostics, context);
			case Mif2Package.ENTRY_POINT_ANNOTATIONS:
				return validateEntryPointAnnotations((EntryPointAnnotations)value, diagnostics, context);
			case Mif2Package.ENTRY_POINT_APP_INFO:
				return validateEntryPointAppInfo((EntryPointAppInfo)value, diagnostics, context);
			case Mif2Package.ENTRY_POINT_BASE:
				return validateEntryPointBase((EntryPointBase)value, diagnostics, context);
			case Mif2Package.ENTRY_POINT_DOCUMENTATION:
				return validateEntryPointDocumentation((EntryPointDocumentation)value, diagnostics, context);
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE:
				return validateEnvironmentalOccurrence((EnvironmentalOccurrence)value, diagnostics, context);
			case Mif2Package.EXAMPLE_INTERACTION:
				return validateExampleInteraction((ExampleInteraction)value, diagnostics, context);
			case Mif2Package.EXAMPLE_SYSTEM:
				return validateExampleSystem((ExampleSystem)value, diagnostics, context);
			case Mif2Package.EXAMPLE_TYPE:
				return validateExampleType((ExampleType)value, diagnostics, context);
			case Mif2Package.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case Mif2Package.FLAT_CLASS:
				return validateFlatClass((FlatClass)value, diagnostics, context);
			case Mif2Package.FORMAL_CONSTRAINT:
				return validateFormalConstraint((FormalConstraint)value, diagnostics, context);
			case Mif2Package.FORMAL_EXPRESSION:
				return validateFormalExpression((FormalExpression)value, diagnostics, context);
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE:
				return validateFreeFormMarkupWithLanguage((FreeFormMarkupWithLanguage)value, diagnostics, context);
			case Mif2Package.FREEHAND_DOCUMENT:
				return validateFreehandDocument((FreehandDocument)value, diagnostics, context);
			case Mif2Package.FREEHAND_DOCUMENT_ANNOTATIONS:
				return validateFreehandDocumentAnnotations((FreehandDocumentAnnotations)value, diagnostics, context);
			case Mif2Package.FREEHAND_DOCUMENT_APP_INFO:
				return validateFreehandDocumentAppInfo((FreehandDocumentAppInfo)value, diagnostics, context);
			case Mif2Package.FREEHAND_DOCUMENT_DOCUMENTATION:
				return validateFreehandDocumentDocumentation((FreehandDocumentDocumentation)value, diagnostics, context);
			case Mif2Package.GENERALIZATION_ANNOTATIONS:
				return validateGeneralizationAnnotations((GeneralizationAnnotations)value, diagnostics, context);
			case Mif2Package.GENERALIZATION_APP_INFO:
				return validateGeneralizationAppInfo((GeneralizationAppInfo)value, diagnostics, context);
			case Mif2Package.GENERALIZATION_DOCUMENTATION:
				return validateGeneralizationDocumentation((GeneralizationDocumentation)value, diagnostics, context);
			case Mif2Package.GENERIC_PACKAGE:
				return validateGenericPackage((GenericPackage)value, diagnostics, context);
			case Mif2Package.GLOBAL_APPLICATION_ROLE:
				return validateGlobalApplicationRole((GlobalApplicationRole)value, diagnostics, context);
			case Mif2Package.GLOBAL_ARTIFACT_XREF_SUMMARY:
				return validateGlobalArtifactXRefSummary((GlobalArtifactXRefSummary)value, diagnostics, context);
			case Mif2Package.GLOBAL_CODE_SYSTEM:
				return validateGlobalCodeSystem((GlobalCodeSystem)value, diagnostics, context);
			case Mif2Package.GLOBAL_CODE_SYSTEM_SUPPLEMENT:
				return validateGlobalCodeSystemSupplement((GlobalCodeSystemSupplement)value, diagnostics, context);
			case Mif2Package.GLOBAL_CONFORMANCE_PROFILE:
				return validateGlobalConformanceProfile((GlobalConformanceProfile)value, diagnostics, context);
			case Mif2Package.GLOBAL_DATATYPE_MODEL_LIBRARY:
				return validateGlobalDatatypeModelLibrary((GlobalDatatypeModelLibrary)value, diagnostics, context);
			case Mif2Package.GLOBAL_DERIVED_STATIC_MODEL:
				return validateGlobalDerivedStaticModel((GlobalDerivedStaticModel)value, diagnostics, context);
			case Mif2Package.GLOBAL_DOMAIN_ANALYSIS_MODEL:
				return validateGlobalDomainAnalysisModel((GlobalDomainAnalysisModel)value, diagnostics, context);
			case Mif2Package.GLOBAL_DOMAIN_INSTANCE_EXAMPLE:
				return validateGlobalDomainInstanceExample((GlobalDomainInstanceExample)value, diagnostics, context);
			case Mif2Package.GLOBAL_FREEHAND_DOCUMENT:
				return validateGlobalFreehandDocument((GlobalFreehandDocument)value, diagnostics, context);
			case Mif2Package.GLOBAL_GENERIC_PACKAGE:
				return validateGlobalGenericPackage((GlobalGenericPackage)value, diagnostics, context);
			case Mif2Package.GLOBAL_GLOSSARY:
				return validateGlobalGlossary((GlobalGlossary)value, diagnostics, context);
			case Mif2Package.GLOBAL_INTERACTION:
				return validateGlobalInteraction((GlobalInteraction)value, diagnostics, context);
			case Mif2Package.GLOBAL_INTERACTION_PROFILE:
				return validateGlobalInteractionProfile((GlobalInteractionProfile)value, diagnostics, context);
			case Mif2Package.GLOBAL_MIF_CHANGES:
				return validateGlobalMifChanges((GlobalMifChanges)value, diagnostics, context);
			case Mif2Package.GLOBAL_PUBLICATION_PACKAGE:
				return validateGlobalPublicationPackage((GlobalPublicationPackage)value, diagnostics, context);
			case Mif2Package.GLOBAL_SERIALIZED_STATIC_MODEL:
				return validateGlobalSerializedStaticModel((GlobalSerializedStaticModel)value, diagnostics, context);
			case Mif2Package.GLOBAL_STATIC_MODEL:
				return validateGlobalStaticModel((GlobalStaticModel)value, diagnostics, context);
			case Mif2Package.GLOBAL_STATIC_MODEL_INTERFACE_PACKAGE:
				return validateGlobalStaticModelInterfacePackage((GlobalStaticModelInterfacePackage)value, diagnostics, context);
			case Mif2Package.GLOBAL_STORYBOARD:
				return validateGlobalStoryboard((GlobalStoryboard)value, diagnostics, context);
			case Mif2Package.GLOBAL_STRUCTURED_DOCUMENT:
				return validateGlobalStructuredDocument((GlobalStructuredDocument)value, diagnostics, context);
			case Mif2Package.GLOBAL_TEST_SCENARIO:
				return validateGlobalTestScenario((GlobalTestScenario)value, diagnostics, context);
			case Mif2Package.GLOBAL_TRIGGER_EVENT:
				return validateGlobalTriggerEvent((GlobalTriggerEvent)value, diagnostics, context);
			case Mif2Package.GLOBAL_VALUE_SET:
				return validateGlobalValueSet((GlobalValueSet)value, diagnostics, context);
			case Mif2Package.GLOBAL_VOCABULARY_MODEL:
				return validateGlobalVocabularyModel((GlobalVocabularyModel)value, diagnostics, context);
			case Mif2Package.GLOSSARY:
				return validateGlossary((Glossary)value, diagnostics, context);
			case Mif2Package.GRAPH_CONNECTOR:
				return validateGraphConnector((GraphConnector)value, diagnostics, context);
			case Mif2Package.GRAPH_CONNECTOR_WITH_EDGE:
				return validateGraphConnectorWithEdge((GraphConnectorWithEdge)value, diagnostics, context);
			case Mif2Package.GRAPH_EDGE:
				return validateGraphEdge((GraphEdge)value, diagnostics, context);
			case Mif2Package.GRAPH_EDGE_GRAPHIC_INFORMATION:
				return validateGraphEdgeGraphicInformation((GraphEdgeGraphicInformation)value, diagnostics, context);
			case Mif2Package.GRAPH_EDGE_WITH_ANCHOR:
				return validateGraphEdgeWithAnchor((GraphEdgeWithAnchor)value, diagnostics, context);
			case Mif2Package.GRAPH_ELEMENT:
				return validateGraphElement((GraphElement)value, diagnostics, context);
			case Mif2Package.GRAPHIC_INFORMATION:
				return validateGraphicInformation((GraphicInformation)value, diagnostics, context);
			case Mif2Package.GRAPH_NODE:
				return validateGraphNode((GraphNode)value, diagnostics, context);
			case Mif2Package.GRAPH_NODE_WITH_OPTIONAL_CONNECTION:
				return validateGraphNodeWithOptionalConnection((GraphNodeWithOptionalConnection)value, diagnostics, context);
			case Mif2Package.GROUP_CHANGE:
				return validateGroupChange((GroupChange)value, diagnostics, context);
			case Mif2Package.GROUP_VOTE:
				return validateGroupVote((GroupVote)value, diagnostics, context);
			case Mif2Package.HEADER:
				return validateHeader((Header)value, diagnostics, context);
			case Mif2Package.HISTORY_ITEM:
				return validateHistoryItem((HistoryItem)value, diagnostics, context);
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS:
				return validateImplementationConstraints((ImplementationConstraints)value, diagnostics, context);
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS:
				return validateImplementationMessageConstraints((ImplementationMessageConstraints)value, diagnostics, context);
			case Mif2Package.IMPORT_DATATYPE_MODEL_LIBRARY:
				return validateImportDatatypeModelLibrary((ImportDatatypeModelLibrary)value, diagnostics, context);
			case Mif2Package.INCLUDE_RELATED_CODES:
				return validateIncludeRelatedCodes((IncludeRelatedCodes)value, diagnostics, context);
			case Mif2Package.INTERACTION:
				return validateInteraction((Interaction)value, diagnostics, context);
			case Mif2Package.INTERACTION_ANNOTATIONS:
				return validateInteractionAnnotations((InteractionAnnotations)value, diagnostics, context);
			case Mif2Package.INTERACTION_APP_INFO:
				return validateInteractionAppInfo((InteractionAppInfo)value, diagnostics, context);
			case Mif2Package.INTERACTION_DOCUMENTATION:
				return validateInteractionDocumentation((InteractionDocumentation)value, diagnostics, context);
			case Mif2Package.INTERACTION_PROFILE:
				return validateInteractionProfile((InteractionProfile)value, diagnostics, context);
			case Mif2Package.INTERACTION_PROFILE_ANNOTATIONS:
				return validateInteractionProfileAnnotations((InteractionProfileAnnotations)value, diagnostics, context);
			case Mif2Package.INTERACTION_PROFILE_APP_INFO:
				return validateInteractionProfileAppInfo((InteractionProfileAppInfo)value, diagnostics, context);
			case Mif2Package.INTERACTION_PROFILE_DOCUMENTATION:
				return validateInteractionProfileDocumentation((InteractionProfileDocumentation)value, diagnostics, context);
			case Mif2Package.INTERACTION_TEST:
				return validateInteractionTest((InteractionTest)value, diagnostics, context);
			case Mif2Package.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case Mif2Package.ITEM_FILTER:
				return validateItemFilter((ItemFilter)value, diagnostics, context);
			case Mif2Package.KEYED_NAME:
				return validateKeyedName((KeyedName)value, diagnostics, context);
			case Mif2Package.LEGALESE:
				return validateLegalese((Legalese)value, diagnostics, context);
			case Mif2Package.LOCAL_CLASS_REF:
				return validateLocalClassRef((LocalClassRef)value, diagnostics, context);
			case Mif2Package.LOCAL_CLASS_REFERENCE:
				return validateLocalClassReference((LocalClassReference)value, diagnostics, context);
			case Mif2Package.MAPPING:
				return validateMapping((Mapping)value, diagnostics, context);
			case Mif2Package.MIF_CHANGES:
				return validateMifChanges((MifChanges)value, diagnostics, context);
			case Mif2Package.MIF_CONTENT:
				return validateMifContent((MifContent)value, diagnostics, context);
			case Mif2Package.MODEL_ELEMENT:
				return validateModelElement((ModelElement)value, diagnostics, context);
			case Mif2Package.NODE_GRAPHIC_INFORMATION:
				return validateNodeGraphicInformation((NodeGraphicInformation)value, diagnostics, context);
			case Mif2Package.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION:
				return validateNodeWithConnectionGraphicInformation((NodeWithConnectionGraphicInformation)value, diagnostics, context);
			case Mif2Package.NON_COMPUTABLE_CONTENT_DEFINITION:
				return validateNonComputableContentDefinition((NonComputableContentDefinition)value, diagnostics, context);
			case Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END:
				return validateNonTraversableAssociationEnd((NonTraversableAssociationEnd)value, diagnostics, context);
			case Mif2Package.OPEN_ISSUE:
				return validateOpenIssue((OpenIssue)value, diagnostics, context);
			case Mif2Package.OPERATION_ANNOTATIONS:
				return validateOperationAnnotations((OperationAnnotations)value, diagnostics, context);
			case Mif2Package.OPERATION_APP_INFO:
				return validateOperationAppInfo((OperationAppInfo)value, diagnostics, context);
			case Mif2Package.OPERATION_DERIVATION:
				return validateOperationDerivation((OperationDerivation)value, diagnostics, context);
			case Mif2Package.OPERATION_DOCUMENTATION:
				return validateOperationDocumentation((OperationDocumentation)value, diagnostics, context);
			case Mif2Package.OPERATION_PARAMETER:
				return validateOperationParameter((OperationParameter)value, diagnostics, context);
			case Mif2Package.OTHER_ANNOTATION:
				return validateOtherAnnotation((OtherAnnotation)value, diagnostics, context);
			case Mif2Package.PACKAGE:
				return validatePackage((org.openhealthtools.mdht.emf.hl7.mif2.Package)value, diagnostics, context);
			case Mif2Package.PACKAGE_ANNOTATIONS:
				return validatePackageAnnotations((PackageAnnotations)value, diagnostics, context);
			case Mif2Package.PACKAGE_APP_INFO:
				return validatePackageAppInfo((PackageAppInfo)value, diagnostics, context);
			case Mif2Package.PACKAGE_ARTIFACT:
				return validatePackageArtifact((PackageArtifact)value, diagnostics, context);
			case Mif2Package.PACKAGE_BASE:
				return validatePackageBase((PackageBase)value, diagnostics, context);
			case Mif2Package.PACKAGE_CONTENT:
				return validatePackageContent((PackageContent)value, diagnostics, context);
			case Mif2Package.PACKAGE_DEF_ID:
				return validatePackageDefId((PackageDefId)value, diagnostics, context);
			case Mif2Package.PACKAGE_DERIVATION:
				return validatePackageDerivation((PackageDerivation)value, diagnostics, context);
			case Mif2Package.PACKAGE_DOCUMENTATION:
				return validatePackageDocumentation((PackageDocumentation)value, diagnostics, context);
			case Mif2Package.PACKAGE_OR_ARTIFACT_REF:
				return validatePackageOrArtifactRef((PackageOrArtifactRef)value, diagnostics, context);
			case Mif2Package.PACKAGE_REF:
				return validatePackageRef((PackageRef)value, diagnostics, context);
			case Mif2Package.PARAMETER_MODEL:
				return validateParameterModel((ParameterModel)value, diagnostics, context);
			case Mif2Package.POINT:
				return validatePoint((Point)value, diagnostics, context);
			case Mif2Package.PRINT_NAME:
				return validatePrintName((PrintName)value, diagnostics, context);
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION:
				return validatePropertyBasedContentDefinition((PropertyBasedContentDefinition)value, diagnostics, context);
			case Mif2Package.PROPERTY_GROUP:
				return validatePropertyGroup((PropertyGroup)value, diagnostics, context);
			case Mif2Package.PUBLICATION_ANNOTATIONS:
				return validatePublicationAnnotations((PublicationAnnotations)value, diagnostics, context);
			case Mif2Package.PUBLICATION_APP_INFO:
				return validatePublicationAppInfo((PublicationAppInfo)value, diagnostics, context);
			case Mif2Package.PUBLICATION_BASE:
				return validatePublicationBase((PublicationBase)value, diagnostics, context);
			case Mif2Package.PUBLICATION_DOCUMENTATION:
				return validatePublicationDocumentation((PublicationDocumentation)value, diagnostics, context);
			case Mif2Package.PUBLICATION_GROUP:
				return validatePublicationGroup((PublicationGroup)value, diagnostics, context);
			case Mif2Package.PUBLICATION_ITEM:
				return validatePublicationItem((PublicationItem)value, diagnostics, context);
			case Mif2Package.PUBLICATION_PACKAGE:
				return validatePublicationPackage((PublicationPackage)value, diagnostics, context);
			case Mif2Package.RANGE_DEFINITION:
				return validateRangeDefinition((RangeDefinition)value, diagnostics, context);
			case Mif2Package.REALM_ELEMENT:
				return validateRealmElement((RealmElement)value, diagnostics, context);
			case Mif2Package.RECEIVER_RESPONSIBILITY:
				return validateReceiverResponsibility((ReceiverResponsibility)value, diagnostics, context);
			case Mif2Package.RELATED_APP_ROLE:
				return validateRelatedAppRole((RelatedAppRole)value, diagnostics, context);
			case Mif2Package.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION:
				return validateRelationshipBasedContentDefinition((RelationshipBasedContentDefinition)value, diagnostics, context);
			case Mif2Package.RELEASE:
				return validateRelease((Release)value, diagnostics, context);
			case Mif2Package.RELEASE_LIST:
				return validateReleaseList((ReleaseList)value, diagnostics, context);
			case Mif2Package.RENDERING_INFORMATION:
				return validateRenderingInformation((RenderingInformation)value, diagnostics, context);
			case Mif2Package.REPLACE_ELEMENT_CONTENT:
				return validateReplaceElementContent((ReplaceElementContent)value, diagnostics, context);
			case Mif2Package.RESPONSIBLE_GROUP:
				return validateResponsibleGroup((ResponsibleGroup)value, diagnostics, context);
			case Mif2Package.SERIALIZED_ASSOCIATION_END:
				return validateSerializedAssociationEnd((SerializedAssociationEnd)value, diagnostics, context);
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS:
				return validateSerializedAssociationEnds((SerializedAssociationEnds)value, diagnostics, context);
			case Mif2Package.SERIALIZED_CLASS:
				return validateSerializedClass((SerializedClass)value, diagnostics, context);
			case Mif2Package.SERIALIZED_CLASS_BINDING_ARGUMENT:
				return validateSerializedClassBindingArgument((SerializedClassBindingArgument)value, diagnostics, context);
			case Mif2Package.SERIALIZED_CLASSES:
				return validateSerializedClasses((SerializedClasses)value, diagnostics, context);
			case Mif2Package.SERIALIZED_CLASS_GENERALIZATION:
				return validateSerializedClassGeneralization((SerializedClassGeneralization)value, diagnostics, context);
			case Mif2Package.SERIALIZED_COMMON_MODEL_ELEMENT_REF:
				return validateSerializedCommonModelElementRef((SerializedCommonModelElementRef)value, diagnostics, context);
			case Mif2Package.SERIALIZED_ENTRY_POINT:
				return validateSerializedEntryPoint((SerializedEntryPoint)value, diagnostics, context);
			case Mif2Package.SERIALIZED_STATIC_MODEL:
				return validateSerializedStaticModel((SerializedStaticModel)value, diagnostics, context);
			case Mif2Package.SERIALIZED_STATIC_MODELS_TYPE:
				return validateSerializedStaticModelsType((SerializedStaticModelsType)value, diagnostics, context);
			case Mif2Package.SPECIALIZATION_CLASS:
				return validateSpecializationClass((SpecializationClass)value, diagnostics, context);
			case Mif2Package.STATE:
				return validateState((State)value, diagnostics, context);
			case Mif2Package.STATE_ANNOTATIONS:
				return validateStateAnnotations((StateAnnotations)value, diagnostics, context);
			case Mif2Package.STATE_APP_INFO:
				return validateStateAppInfo((StateAppInfo)value, diagnostics, context);
			case Mif2Package.STATE_DERIVATION:
				return validateStateDerivation((StateDerivation)value, diagnostics, context);
			case Mif2Package.STATE_DOCUMENTATION:
				return validateStateDocumentation((StateDocumentation)value, diagnostics, context);
			case Mif2Package.STATE_MACHINE:
				return validateStateMachine((StateMachine)value, diagnostics, context);
			case Mif2Package.STATE_MACHINE_ANNOTATIONS:
				return validateStateMachineAnnotations((StateMachineAnnotations)value, diagnostics, context);
			case Mif2Package.STATE_MACHINE_APP_INFO:
				return validateStateMachineAppInfo((StateMachineAppInfo)value, diagnostics, context);
			case Mif2Package.STATE_MACHINE_DOCUMENTATION:
				return validateStateMachineDocumentation((StateMachineDocumentation)value, diagnostics, context);
			case Mif2Package.STATIC_EXAMPLE:
				return validateStaticExample((StaticExample)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL:
				return validateStaticModel((StaticModel)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_ANNOTATIONS:
				return validateStaticModelAnnotations((StaticModelAnnotations)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_APP_INFO:
				return validateStaticModelAppInfo((StaticModelAppInfo)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_BASE:
				return validateStaticModelBase((StaticModelBase)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_CLASS_TEMPLATE_PARAMETER:
				return validateStaticModelClassTemplateParameter((StaticModelClassTemplateParameter)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_DERIVATION:
				return validateStaticModelDerivation((StaticModelDerivation)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_DERIVATION_SOURCE:
				return validateStaticModelDerivationSource((StaticModelDerivationSource)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_DOCUMENTATION:
				return validateStaticModelDocumentation((StaticModelDocumentation)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_INTERFACE_ANNOTATIONS:
				return validateStaticModelInterfaceAnnotations((StaticModelInterfaceAnnotations)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_INTERFACE_APP_INFO:
				return validateStaticModelInterfaceAppInfo((StaticModelInterfaceAppInfo)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_INTERFACE_DOCUMENTATION:
				return validateStaticModelInterfaceDocumentation((StaticModelInterfaceDocumentation)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE:
				return validateStaticModelInterfacePackage((StaticModelInterfacePackage)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_REF_BASE:
				return validateStaticModelRefBase((StaticModelRefBase)value, diagnostics, context);
			case Mif2Package.STATIC_MODELS_TYPE:
				return validateStaticModelsType((StaticModelsType)value, diagnostics, context);
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION:
				return validateStaticPackageDiagramGraphicInformation((StaticPackageDiagramGraphicInformation)value, diagnostics, context);
			case Mif2Package.STORYBOARD:
				return validateStoryboard((Storyboard)value, diagnostics, context);
			case Mif2Package.STORYBOARD_ANNOTATIONS:
				return validateStoryboardAnnotations((StoryboardAnnotations)value, diagnostics, context);
			case Mif2Package.STORYBOARD_APP_INFO:
				return validateStoryboardAppInfo((StoryboardAppInfo)value, diagnostics, context);
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES:
				return validateStoryboardArtifactReferences((StoryboardArtifactReferences)value, diagnostics, context);
			case Mif2Package.STORYBOARD_DOCUMENTATION:
				return validateStoryboardDocumentation((StoryboardDocumentation)value, diagnostics, context);
			case Mif2Package.STORYBOARD_NARRATIVE:
				return validateStoryboardNarrative((StoryboardNarrative)value, diagnostics, context);
			case Mif2Package.STRUCTURAL_FEATURE:
				return validateStructuralFeature((StructuralFeature)value, diagnostics, context);
			case Mif2Package.STRUCTURED_DOCUMENT:
				return validateStructuredDocument((StructuredDocument)value, diagnostics, context);
			case Mif2Package.STRUCTURED_DOCUMENT_ANNOTATIONS:
				return validateStructuredDocumentAnnotations((StructuredDocumentAnnotations)value, diagnostics, context);
			case Mif2Package.STRUCTURED_DOCUMENT_APP_INFO:
				return validateStructuredDocumentAppInfo((StructuredDocumentAppInfo)value, diagnostics, context);
			case Mif2Package.STRUCTURED_DOCUMENT_DOCUMENTATION:
				return validateStructuredDocumentDocumentation((StructuredDocumentDocumentation)value, diagnostics, context);
			case Mif2Package.STUB_DEFINITION:
				return validateStubDefinition((StubDefinition)value, diagnostics, context);
			case Mif2Package.SUBJECT_AREA_ANNOTATIONS:
				return validateSubjectAreaAnnotations((SubjectAreaAnnotations)value, diagnostics, context);
			case Mif2Package.SUBJECT_AREA_APP_INFO:
				return validateSubjectAreaAppInfo((SubjectAreaAppInfo)value, diagnostics, context);
			case Mif2Package.SUBJECT_AREA_DOCUMENTATION:
				return validateSubjectAreaDocumentation((SubjectAreaDocumentation)value, diagnostics, context);
			case Mif2Package.SUBJECT_AREA_PACKAGE:
				return validateSubjectAreaPackage((SubjectAreaPackage)value, diagnostics, context);
			case Mif2Package.SUB_SYSTEM:
				return validateSubSystem((SubSystem)value, diagnostics, context);
			case Mif2Package.SUPPORTED_CONCEPT_PROPERTY:
				return validateSupportedConceptProperty((SupportedConceptProperty)value, diagnostics, context);
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP:
				return validateSupportedConceptRelationship((SupportedConceptRelationship)value, diagnostics, context);
			case Mif2Package.SUPPORTED_PROPERTY:
				return validateSupportedProperty((SupportedProperty)value, diagnostics, context);
			case Mif2Package.TERM_DEFINITION:
				return validateTermDefinition((TermDefinition)value, diagnostics, context);
			case Mif2Package.TERMINOLOGY_SERVER:
				return validateTerminologyServer((TerminologyServer)value, diagnostics, context);
			case Mif2Package.TEST:
				return validateTest((Test)value, diagnostics, context);
			case Mif2Package.TEST_BASE:
				return validateTestBase((TestBase)value, diagnostics, context);
			case Mif2Package.TEST_SCENARIO:
				return validateTestScenario((TestScenario)value, diagnostics, context);
			case Mif2Package.TEST_SYSTEM:
				return validateTestSystem((TestSystem)value, diagnostics, context);
			case Mif2Package.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case Mif2Package.TRANSITION_ANNOTATIONS:
				return validateTransitionAnnotations((TransitionAnnotations)value, diagnostics, context);
			case Mif2Package.TRANSITION_APP_INFO:
				return validateTransitionAppInfo((TransitionAppInfo)value, diagnostics, context);
			case Mif2Package.TRANSITION_DERIVATION:
				return validateTransitionDerivation((TransitionDerivation)value, diagnostics, context);
			case Mif2Package.TRANSITION_DOCUMENTATION:
				return validateTransitionDocumentation((TransitionDocumentation)value, diagnostics, context);
			case Mif2Package.TRANSITION_REF:
				return validateTransitionRef((TransitionRef)value, diagnostics, context);
			case Mif2Package.TRIGGER_EVENT:
				return validateTriggerEvent((TriggerEvent)value, diagnostics, context);
			case Mif2Package.TRIGGER_EVENT_ANNOTATIONS:
				return validateTriggerEventAnnotations((TriggerEventAnnotations)value, diagnostics, context);
			case Mif2Package.TRIGGER_EVENT_APP_INFO:
				return validateTriggerEventAppInfo((TriggerEventAppInfo)value, diagnostics, context);
			case Mif2Package.TRIGGER_EVENT_DOCUMENTATION:
				return validateTriggerEventDocumentation((TriggerEventDocumentation)value, diagnostics, context);
			case Mif2Package.VALUE_SET:
				return validateValueSet((ValueSet)value, diagnostics, context);
			case Mif2Package.VALUE_SET_ANNOTATIONS:
				return validateValueSetAnnotations((ValueSetAnnotations)value, diagnostics, context);
			case Mif2Package.VALUE_SET_APP_INFO:
				return validateValueSetAppInfo((ValueSetAppInfo)value, diagnostics, context);
			case Mif2Package.VALUE_SET_DOCUMENTATION:
				return validateValueSetDocumentation((ValueSetDocumentation)value, diagnostics, context);
			case Mif2Package.VALUE_SET_SUPPLEMENT:
				return validateValueSetSupplement((ValueSetSupplement)value, diagnostics, context);
			case Mif2Package.VALUE_SET_VERSION:
				return validateValueSetVersion((ValueSetVersion)value, diagnostics, context);
			case Mif2Package.VARIOUS_MIXED_CONTENT:
				return validateVariousMixedContent((VariousMixedContent)value, diagnostics, context);
			case Mif2Package.VERTEX:
				return validateVertex((Vertex)value, diagnostics, context);
			case Mif2Package.VOCABULARY_CODE_REF:
				return validateVocabularyCodeRef((VocabularyCodeRef)value, diagnostics, context);
			case Mif2Package.VOCABULARY_CODE_REFS:
				return validateVocabularyCodeRefs((VocabularyCodeRefs)value, diagnostics, context);
			case Mif2Package.VOCABULARY_LIMITATION:
				return validateVocabularyLimitation((VocabularyLimitation)value, diagnostics, context);
			case Mif2Package.VOCABULARY_MODEL:
				return validateVocabularyModel((VocabularyModel)value, diagnostics, context);
			case Mif2Package.VOCABULARY_MODEL_ANNOTATIONS:
				return validateVocabularyModelAnnotations((VocabularyModelAnnotations)value, diagnostics, context);
			case Mif2Package.VOCABULARY_MODEL_APP_INFO:
				return validateVocabularyModelAppInfo((VocabularyModelAppInfo)value, diagnostics, context);
			case Mif2Package.VOCABULARY_MODEL_DOCUMENTATION:
				return validateVocabularyModelDocumentation((VocabularyModelDocumentation)value, diagnostics, context);
			case Mif2Package.VOCABULARY_SPECIFICATION:
				return validateVocabularySpecification((VocabularySpecification)value, diagnostics, context);
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING:
				return validateVocabularyValueSetBinding((VocabularyValueSetBinding)value, diagnostics, context);
			case Mif2Package.VOCABULARY_VALUE_SET_REF:
				return validateVocabularyValueSetRef((VocabularyValueSetRef)value, diagnostics, context);
			case Mif2Package.XMI_CONTENT:
				return validateXMIContent((XMIContent)value, diagnostics, context);
			case Mif2Package.AFFILIATE_KIND:
				return validateAffiliateKind((AffiliateKind)value, diagnostics, context);
			case Mif2Package.AFFIRMATIVE_VOTE_RESOLUTION_KIND:
				return validateAffirmativeVoteResolutionKind((AffirmativeVoteResolutionKind)value, diagnostics, context);
			case Mif2Package.ANNOTATION_KIND:
				return validateAnnotationKind((AnnotationKind)value, diagnostics, context);
			case Mif2Package.APPLICATION_ROLE_RELATIONSHIP_KIND:
				return validateApplicationRoleRelationshipKind((ApplicationRoleRelationshipKind)value, diagnostics, context);
			case Mif2Package.APPROVAL_STATUS_KIND:
				return validateApprovalStatusKind((ApprovalStatusKind)value, diagnostics, context);
			case Mif2Package.ARTIFACT_GROUP_KIND:
				return validateArtifactGroupKind((ArtifactGroupKind)value, diagnostics, context);
			case Mif2Package.ARTIFACT_KIND:
				return validateArtifactKind((ArtifactKind)value, diagnostics, context);
			case Mif2Package.ARTIFACT_RENDERING_STYLE_KIND:
				return validateArtifactRenderingStyleKind((ArtifactRenderingStyleKind)value, diagnostics, context);
			case Mif2Package.ATTRIBUTE_PROPERTY_KIND:
				return validateAttributePropertyKind((AttributePropertyKind)value, diagnostics, context);
			case Mif2Package.CASCADING_ANNOTATION_ELEMENT_KIND:
				return validateCascadingAnnotationElementKind((CascadingAnnotationElementKind)value, diagnostics, context);
			case Mif2Package.CHANGE_REQUEST_STATUS:
				return validateChangeRequestStatus((ChangeRequestStatus)value, diagnostics, context);
			case Mif2Package.CLASS_PRESENTATION_KIND:
				return validateClassPresentationKind((ClassPresentationKind)value, diagnostics, context);
			case Mif2Package.CMET_ATTRIBUTION_KIND:
				return validateCMETAttributionKind((CMETAttributionKind)value, diagnostics, context);
			case Mif2Package.CMET_ENTRY_KIND:
				return validateCMETEntryKind((CMETEntryKind)value, diagnostics, context);
			case Mif2Package.CODE_FILTER_EXPRESSION_KIND:
				return validateCodeFilterExpressionKind((CodeFilterExpressionKind)value, diagnostics, context);
			case Mif2Package.CODE_STATUS_KIND:
				return validateCodeStatusKind((CodeStatusKind)value, diagnostics, context);
			case Mif2Package.CODING_STRENGTH_KIND:
				return validateCodingStrengthKind((CodingStrengthKind)value, diagnostics, context);
			case Mif2Package.CONCEPT_DOMAIN_PROPERTY_KIND:
				return validateConceptDomainPropertyKind((ConceptDomainPropertyKind)value, diagnostics, context);
			case Mif2Package.CONCEPT_PROPERTY_TYPE_KIND:
				return validateConceptPropertyTypeKind((ConceptPropertyTypeKind)value, diagnostics, context);
			case Mif2Package.CONCEPT_RELATIONSHIP_KIND:
				return validateConceptRelationshipKind((ConceptRelationshipKind)value, diagnostics, context);
			case Mif2Package.CONCEPT_USE_KIND:
				return validateConceptUseKind((ConceptUseKind)value, diagnostics, context);
			case Mif2Package.CONFORMANCE_KIND:
				return validateConformanceKind((ConformanceKind)value, diagnostics, context);
			case Mif2Package.CONSTRUCTED_ELEMENT_KIND:
				return validateConstructedElementKind((ConstructedElementKind)value, diagnostics, context);
			case Mif2Package.CONTENTS_LEVEL_KIND:
				return validateContentsLevelKind((ContentsLevelKind)value, diagnostics, context);
			case Mif2Package.DATATYPE_KIND:
				return validateDatatypeKind((DatatypeKind)value, diagnostics, context);
			case Mif2Package.DATATYPE_OPERATION_KIND:
				return validateDatatypeOperationKind((DatatypeOperationKind)value, diagnostics, context);
			case Mif2Package.DATATYPE_QUALIFIER_KIND:
				return validateDatatypeQualifierKind((DatatypeQualifierKind)value, diagnostics, context);
			case Mif2Package.DEFAULT_DETERMINER_KIND:
				return validateDefaultDeterminerKind((DefaultDeterminerKind)value, diagnostics, context);
			case Mif2Package.DEFINED_MAPPING_SOURCE_KIND:
				return validateDefinedMappingSourceKind((DefinedMappingSourceKind)value, diagnostics, context);
			case Mif2Package.DEFINED_ROLE_KIND:
				return validateDefinedRoleKind((DefinedRoleKind)value, diagnostics, context);
			case Mif2Package.DERIVATION_RELATIONSHIP_KIND:
				return validateDerivationRelationshipKind((DerivationRelationshipKind)value, diagnostics, context);
			case Mif2Package.DESIGN_COMMENT_TAG_KIND:
				return validateDesignCommentTagKind((DesignCommentTagKind)value, diagnostics, context);
			case Mif2Package.DOCUMENT_PROFILE_KIND:
				return validateDocumentProfileKind((DocumentProfileKind)value, diagnostics, context);
			case Mif2Package.DOMAIN_KIND:
				return validateDomainKind((DomainKind)value, diagnostics, context);
			case Mif2Package.DURATION_UNITS_KIND:
				return validateDurationUnitsKind((DurationUnitsKind)value, diagnostics, context);
			case Mif2Package.EFFORT_QUANTIFIER_KIND:
				return validateEffortQuantifierKind((EffortQuantifierKind)value, diagnostics, context);
			case Mif2Package.EXPRESSION_LANGUAGE_KIND:
				return validateExpressionLanguageKind((ExpressionLanguageKind)value, diagnostics, context);
			case Mif2Package.FILTER_KIND:
				return validateFilterKind((FilterKind)value, diagnostics, context);
			case Mif2Package.FUNCTIONALISM:
				return validateFunctionalism((Functionalism)value, diagnostics, context);
			case Mif2Package.ICON_FORMAT_KIND:
				return validateIconFormatKind((IconFormatKind)value, diagnostics, context);
			case Mif2Package.INTERACTION_KIND:
				return validateInteractionKind((InteractionKind)value, diagnostics, context);
			case Mif2Package.INTERACTION_PROFILE_KIND:
				return validateInteractionProfileKind((InteractionProfileKind)value, diagnostics, context);
			case Mif2Package.ITS_KIND:
				return validateITSKind((ITSKind)value, diagnostics, context);
			case Mif2Package.MAP_RELATIONSHIP_KIND:
				return validateMapRelationshipKind((MapRelationshipKind)value, diagnostics, context);
			case Mif2Package.MODEL_CONFORMANCE_KIND:
				return validateModelConformanceKind((ModelConformanceKind)value, diagnostics, context);
			case Mif2Package.NEGATIVE_VOTE_RESOLUTION_KIND:
				return validateNegativeVoteResolutionKind((NegativeVoteResolutionKind)value, diagnostics, context);
			case Mif2Package.NODE_ORIENTATION:
				return validateNodeOrientation((NodeOrientation)value, diagnostics, context);
			case Mif2Package.OWNER_SCOPE_KIND:
				return validateOwnerScopeKind((OwnerScopeKind)value, diagnostics, context);
			case Mif2Package.PACKAGE_KIND:
				return validatePackageKind((PackageKind)value, diagnostics, context);
			case Mif2Package.PACKAGE_ROOT_KIND:
				return validatePackageRootKind((PackageRootKind)value, diagnostics, context);
			case Mif2Package.PARENT_ARTIFACT_KIND:
				return validateParentArtifactKind((ParentArtifactKind)value, diagnostics, context);
			case Mif2Package.PROPERTY_DEFAULT_HANDLING_KIND:
				return validatePropertyDefaultHandlingKind((PropertyDefaultHandlingKind)value, diagnostics, context);
			case Mif2Package.REFLEXIVITY:
				return validateReflexivity((Reflexivity)value, diagnostics, context);
			case Mif2Package.RELATIONSHIP_TRAVERSAL_KIND:
				return validateRelationshipTraversalKind((RelationshipTraversalKind)value, diagnostics, context);
			case Mif2Package.REVISION_FREQUENCY_KIND:
				return validateRevisionFrequencyKind((RevisionFrequencyKind)value, diagnostics, context);
			case Mif2Package.SECTION_KIND:
				return validateSectionKind((SectionKind)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_DIAGRAM_PRESENTATION_KIND:
				return validateStaticModelDiagramPresentationKind((StaticModelDiagramPresentationKind)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_REPRESENTATION_KIND:
				return validateStaticModelRepresentationKind((StaticModelRepresentationKind)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_USE_KIND:
				return validateStaticModelUseKind((StaticModelUseKind)value, diagnostics, context);
			case Mif2Package.SUB_ARTIFACT_KIND:
				return validateSubArtifactKind((SubArtifactKind)value, diagnostics, context);
			case Mif2Package.SUB_SECTION_KIND:
				return validateSubSectionKind((SubSectionKind)value, diagnostics, context);
			case Mif2Package.SYMMETRY:
				return validateSymmetry((Symmetry)value, diagnostics, context);
			case Mif2Package.TERMINOLOGY_SERVER_KIND:
				return validateTerminologyServerKind((TerminologyServerKind)value, diagnostics, context);
			case Mif2Package.TRANSITIVITY:
				return validateTransitivity((Transitivity)value, diagnostics, context);
			case Mif2Package.TRANSLATABLE_DIRECTION_KIND:
				return validateTranslatableDirectionKind((TranslatableDirectionKind)value, diagnostics, context);
			case Mif2Package.UNLIMITED_MULTIPLICITY:
				return validateUnlimitedMultiplicity((UnlimitedMultiplicity)value, diagnostics, context);
			case Mif2Package.UPDATE_MODE_KIND:
				return validateUpdateModeKind((UpdateModeKind)value, diagnostics, context);
			case Mif2Package.VISIBILITY_KIND:
				return validateVisibilityKind((VisibilityKind)value, diagnostics, context);
			case Mif2Package.VOCABULARY_MODEL_DEFINITION_KIND:
				return validateVocabularyModelDefinitionKind((VocabularyModelDefinitionKind)value, diagnostics, context);
			case Mif2Package.VOTE_COMMENT_KIND:
				return validateVoteCommentKind((VoteCommentKind)value, diagnostics, context);
			case Mif2Package.VOTE_KIND:
				return validateVoteKind((VoteKind)value, diagnostics, context);
			case Mif2Package.AFFILIATE_KIND_OBJECT:
				return validateAffiliateKindObject((AffiliateKind)value, diagnostics, context);
			case Mif2Package.AFFIRMATIVE_VOTE_RESOLUTION_KIND_OBJECT:
				return validateAffirmativeVoteResolutionKindObject((AffirmativeVoteResolutionKind)value, diagnostics, context);
			case Mif2Package.ALL_CLASS_NAME:
				return validateAllClassName((String)value, diagnostics, context);
			case Mif2Package.ANNOTATION_KIND_OBJECT:
				return validateAnnotationKindObject((AnnotationKind)value, diagnostics, context);
			case Mif2Package.APPLICATION_ROLE_RELATIONSHIP_KIND_OBJECT:
				return validateApplicationRoleRelationshipKindObject((ApplicationRoleRelationshipKind)value, diagnostics, context);
			case Mif2Package.APPROVAL_STATUS_KIND_OBJECT:
				return validateApprovalStatusKindObject((ApprovalStatusKind)value, diagnostics, context);
			case Mif2Package.ARTIFACT_GROUP_KIND_OBJECT:
				return validateArtifactGroupKindObject((ArtifactGroupKind)value, diagnostics, context);
			case Mif2Package.ARTIFACT_KIND_OBJECT:
				return validateArtifactKindObject((ArtifactKind)value, diagnostics, context);
			case Mif2Package.ARTIFACT_RENDERING_STYLE_KIND_OBJECT:
				return validateArtifactRenderingStyleKindObject((ArtifactRenderingStyleKind)value, diagnostics, context);
			case Mif2Package.ATTRIBUTE_PROPERTY_KIND_OBJECT:
				return validateAttributePropertyKindObject((AttributePropertyKind)value, diagnostics, context);
			case Mif2Package.BASIC_FORMAL_NAME:
				return validateBasicFormalName((String)value, diagnostics, context);
			case Mif2Package.BASIC_ID:
				return validateBasicId((String)value, diagnostics, context);
			case Mif2Package.CASCADING_ANNOTATION_ELEMENT_KIND_OBJECT:
				return validateCascadingAnnotationElementKindObject((CascadingAnnotationElementKind)value, diagnostics, context);
			case Mif2Package.CHANGE_REQUEST_STATUS_OBJECT:
				return validateChangeRequestStatusObject((ChangeRequestStatus)value, diagnostics, context);
			case Mif2Package.CLASS_PRESENTATION_KIND_OBJECT:
				return validateClassPresentationKindObject((ClassPresentationKind)value, diagnostics, context);
			case Mif2Package.CMET_ATTRIBUTION_KIND_OBJECT:
				return validateCMETAttributionKindObject((CMETAttributionKind)value, diagnostics, context);
			case Mif2Package.CMET_ATTRIBUTION_STRING:
				return validateCMETAttributionString((String)value, diagnostics, context);
			case Mif2Package.CMET_ATTRIBUTION_TYPE:
				return validateCMETAttributionType(value, diagnostics, context);
			case Mif2Package.CMET_ENTRY_KIND_OBJECT:
				return validateCMETEntryKindObject((CMETEntryKind)value, diagnostics, context);
			case Mif2Package.CODE_FILTER_EXPRESSION_KIND_OBJECT:
				return validateCodeFilterExpressionKindObject((CodeFilterExpressionKind)value, diagnostics, context);
			case Mif2Package.CODE_STATUS_KIND_OBJECT:
				return validateCodeStatusKindObject((CodeStatusKind)value, diagnostics, context);
			case Mif2Package.CODING_STRENGTH_KIND_OBJECT:
				return validateCodingStrengthKindObject((CodingStrengthKind)value, diagnostics, context);
			case Mif2Package.COLLAPSED_PACKAGE_ID:
				return validateCollapsedPackageId((String)value, diagnostics, context);
			case Mif2Package.CONCEPT_DOMAIN_PROPERTY_KIND_OBJECT:
				return validateConceptDomainPropertyKindObject((ConceptDomainPropertyKind)value, diagnostics, context);
			case Mif2Package.CONCEPT_PROPERTY_TYPE_KIND_OBJECT:
				return validateConceptPropertyTypeKindObject((ConceptPropertyTypeKind)value, diagnostics, context);
			case Mif2Package.CONCEPT_RELATIONSHIP_KIND_OBJECT:
				return validateConceptRelationshipKindObject((ConceptRelationshipKind)value, diagnostics, context);
			case Mif2Package.CONCEPT_USE_KIND_OBJECT:
				return validateConceptUseKindObject((ConceptUseKind)value, diagnostics, context);
			case Mif2Package.CONFORMANCE_KIND_OBJECT:
				return validateConformanceKindObject((ConformanceKind)value, diagnostics, context);
			case Mif2Package.CONSTRUCTED_ELEMENT_KIND_OBJECT:
				return validateConstructedElementKindObject((ConstructedElementKind)value, diagnostics, context);
			case Mif2Package.CONTENTS_LEVEL_KIND_OBJECT:
				return validateContentsLevelKindObject((ContentsLevelKind)value, diagnostics, context);
			case Mif2Package.DATATYPE_KIND_OBJECT:
				return validateDatatypeKindObject((DatatypeKind)value, diagnostics, context);
			case Mif2Package.DATATYPE_NAME:
				return validateDatatypeName((String)value, diagnostics, context);
			case Mif2Package.DATATYPE_OPERATION_KIND_OBJECT:
				return validateDatatypeOperationKindObject((DatatypeOperationKind)value, diagnostics, context);
			case Mif2Package.DATATYPE_QUALIFIER_KIND_OBJECT:
				return validateDatatypeQualifierKindObject((DatatypeQualifierKind)value, diagnostics, context);
			case Mif2Package.DATE_OR_TIMESTAMP:
				return validateDateOrTimestamp((XMLGregorianCalendar)value, diagnostics, context);
			case Mif2Package.DECIMAL:
				return validateDecimal((BigDecimal)value, diagnostics, context);
			case Mif2Package.DEFAULT_DETERMINER_KIND_OBJECT:
				return validateDefaultDeterminerKindObject((DefaultDeterminerKind)value, diagnostics, context);
			case Mif2Package.DEFINED_CONTEXT_KIND:
				return validateDefinedContextKind((Enumerator)value, diagnostics, context);
			case Mif2Package.DEFINED_MAPPING_SOURCE_KIND_OBJECT:
				return validateDefinedMappingSourceKindObject((DefinedMappingSourceKind)value, diagnostics, context);
			case Mif2Package.DEFINED_ROLE_KIND_OBJECT:
				return validateDefinedRoleKindObject((DefinedRoleKind)value, diagnostics, context);
			case Mif2Package.DERIVATION_RELATIONSHIP_KIND_OBJECT:
				return validateDerivationRelationshipKindObject((DerivationRelationshipKind)value, diagnostics, context);
			case Mif2Package.DESIGN_COMMENT_TAG_KIND_OBJECT:
				return validateDesignCommentTagKindObject((DesignCommentTagKind)value, diagnostics, context);
			case Mif2Package.DOCUMENT_PROFILE_KIND_OBJECT:
				return validateDocumentProfileKindObject((DocumentProfileKind)value, diagnostics, context);
			case Mif2Package.DOMAIN_KIND_OBJECT:
				return validateDomainKindObject((DomainKind)value, diagnostics, context);
			case Mif2Package.DURATION_UNITS_KIND_OBJECT:
				return validateDurationUnitsKindObject((DurationUnitsKind)value, diagnostics, context);
			case Mif2Package.EFFORT_QUANTIFIER_KIND_OBJECT:
				return validateEffortQuantifierKindObject((EffortQuantifierKind)value, diagnostics, context);
			case Mif2Package.EMAIL:
				return validateEMail((String)value, diagnostics, context);
			case Mif2Package.ENUMERATION_STRING:
				return validateEnumerationString((String)value, diagnostics, context);
			case Mif2Package.ENUMERATION_TOKEN:
				return validateEnumerationToken((String)value, diagnostics, context);
			case Mif2Package.EXPRESSION_LANGUAGE_KIND_OBJECT:
				return validateExpressionLanguageKindObject((ExpressionLanguageKind)value, diagnostics, context);
			case Mif2Package.FILTER_KIND_OBJECT:
				return validateFilterKindObject((FilterKind)value, diagnostics, context);
			case Mif2Package.FORMAL_PROPER_NAME:
				return validateFormalProperName((String)value, diagnostics, context);
			case Mif2Package.FORMAL_PROPERTY_NAME:
				return validateFormalPropertyName((String)value, diagnostics, context);
			case Mif2Package.FUNCTIONALISM_OBJECT:
				return validateFunctionalismObject((Functionalism)value, diagnostics, context);
			case Mif2Package.GRAPHIC_MEASUREMENT:
				return validateGraphicMeasurement((BigDecimal)value, diagnostics, context);
			case Mif2Package.HASH_CODE:
				return validateHashCode((String)value, diagnostics, context);
			case Mif2Package.ICON_FORMAT_KIND_OBJECT:
				return validateIconFormatKindObject((IconFormatKind)value, diagnostics, context);
			case Mif2Package.INTERACTION_KIND_OBJECT:
				return validateInteractionKindObject((InteractionKind)value, diagnostics, context);
			case Mif2Package.INTERACTION_PROFILE_KIND_OBJECT:
				return validateInteractionProfileKindObject((InteractionProfileKind)value, diagnostics, context);
			case Mif2Package.ITS_KIND_OBJECT:
				return validateITSKindObject((ITSKind)value, diagnostics, context);
			case Mif2Package.LOCAL_FILE_REFERENCE:
				return validateLocalFileReference((String)value, diagnostics, context);
			case Mif2Package.LONG_DESCRIPTIVE_NAME:
				return validateLongDescriptiveName((String)value, diagnostics, context);
			case Mif2Package.LOWER_CAMEL_CASE:
				return validateLowerCamelCase((String)value, diagnostics, context);
			case Mif2Package.MAPPING_SOURCE_KIND:
				return validateMappingSourceKind(value, diagnostics, context);
			case Mif2Package.MAP_RELATIONSHIP_KIND_OBJECT:
				return validateMapRelationshipKindObject((MapRelationshipKind)value, diagnostics, context);
			case Mif2Package.MIME_TYPE:
				return validateMimeType((String)value, diagnostics, context);
			case Mif2Package.MODEL_CONFORMANCE_KIND_OBJECT:
				return validateModelConformanceKindObject((ModelConformanceKind)value, diagnostics, context);
			case Mif2Package.NEGATIVE_VOTE_RESOLUTION_KIND_OBJECT:
				return validateNegativeVoteResolutionKindObject((NegativeVoteResolutionKind)value, diagnostics, context);
			case Mif2Package.NODE_ORIENTATION_OBJECT:
				return validateNodeOrientationObject((NodeOrientation)value, diagnostics, context);
			case Mif2Package.NON_EMPTY_STRING:
				return validateNonEmptyString((String)value, diagnostics, context);
			case Mif2Package.NON_NEGATIVE_DECIMAL:
				return validateNonNegativeDecimal((BigDecimal)value, diagnostics, context);
			case Mif2Package.OID:
				return validateOid((String)value, diagnostics, context);
			case Mif2Package.OWNER_SCOPE_KIND_OBJECT:
				return validateOwnerScopeKindObject((OwnerScopeKind)value, diagnostics, context);
			case Mif2Package.PACKAGE_KIND_OBJECT:
				return validatePackageKindObject((PackageKind)value, diagnostics, context);
			case Mif2Package.PACKAGE_ROOT_KIND_OBJECT:
				return validatePackageRootKindObject((PackageRootKind)value, diagnostics, context);
			case Mif2Package.PARENT_ARTIFACT_KIND_OBJECT:
				return validateParentArtifactKindObject((ParentArtifactKind)value, diagnostics, context);
			case Mif2Package.POSITIVE_DECIMAL:
				return validatePositiveDecimal((BigDecimal)value, diagnostics, context);
			case Mif2Package.PREFIXED_UPPER_CAMEL_CASE:
				return validatePrefixedUpperCamelCase((String)value, diagnostics, context);
			case Mif2Package.PROPERTY_DEFAULT_HANDLING_KIND_OBJECT:
				return validatePropertyDefaultHandlingKindObject((PropertyDefaultHandlingKind)value, diagnostics, context);
			case Mif2Package.REALM_KIND:
				return validateRealmKind(value, diagnostics, context);
			case Mif2Package.REALM_NAMESPACE_KIND:
				return validateRealmNamespaceKind(value, diagnostics, context);
			case Mif2Package.REFLEXIVITY_OBJECT:
				return validateReflexivityObject((Reflexivity)value, diagnostics, context);
			case Mif2Package.RELATIONSHIP_TRAVERSAL_KIND_OBJECT:
				return validateRelationshipTraversalKindObject((RelationshipTraversalKind)value, diagnostics, context);
			case Mif2Package.REVISION_FREQUENCY_KIND_OBJECT:
				return validateRevisionFrequencyKindObject((RevisionFrequencyKind)value, diagnostics, context);
			case Mif2Package.ROLE_KIND:
				return validateRoleKind(value, diagnostics, context);
			case Mif2Package.SECTION_KIND_OBJECT:
				return validateSectionKindObject((SectionKind)value, diagnostics, context);
			case Mif2Package.SHORT_DESCRIPTIVE_NAME:
				return validateShortDescriptiveName((String)value, diagnostics, context);
			case Mif2Package.SHORT_STRING:
				return validateShortString((String)value, diagnostics, context);
			case Mif2Package.SINGLE_NON_NEGATIVE_INTEGER:
				return validateSingleNonNegativeInteger((BigInteger)value, diagnostics, context);
			case Mif2Package.SMALL_NON_NEGATIVE_INTEGER:
				return validateSmallNonNegativeInteger((BigInteger)value, diagnostics, context);
			case Mif2Package.SMALL_POSITIVE_INTEGER:
				return validateSmallPositiveInteger((BigInteger)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_DIAGRAM_PRESENTATION_KIND_OBJECT:
				return validateStaticModelDiagramPresentationKindObject((StaticModelDiagramPresentationKind)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_REPRESENTATION_KIND_OBJECT:
				return validateStaticModelRepresentationKindObject((StaticModelRepresentationKind)value, diagnostics, context);
			case Mif2Package.STATIC_MODEL_USE_KIND_OBJECT:
				return validateStaticModelUseKindObject((StaticModelUseKind)value, diagnostics, context);
			case Mif2Package.SUB_ARTIFACT_KIND_OBJECT:
				return validateSubArtifactKindObject((SubArtifactKind)value, diagnostics, context);
			case Mif2Package.SUB_SECTION_KIND_OBJECT:
				return validateSubSectionKindObject((SubSectionKind)value, diagnostics, context);
			case Mif2Package.SYMMETRY_OBJECT:
				return validateSymmetryObject((Symmetry)value, diagnostics, context);
			case Mif2Package.TEMPLATE_ID:
				return validateTemplateId((String)value, diagnostics, context);
			case Mif2Package.TERMINOLOGY_SERVER_KIND_OBJECT:
				return validateTerminologyServerKindObject((TerminologyServerKind)value, diagnostics, context);
			case Mif2Package.TRANSITIVITY_OBJECT:
				return validateTransitivityObject((Transitivity)value, diagnostics, context);
			case Mif2Package.TRANSLATABLE_DIRECTION_KIND_OBJECT:
				return validateTranslatableDirectionKindObject((TranslatableDirectionKind)value, diagnostics, context);
			case Mif2Package.UNLIMITED_INTEGER:
				return validateUnlimitedInteger(value, diagnostics, context);
			case Mif2Package.UNLIMITED_MULTIPLICITY_OBJECT:
				return validateUnlimitedMultiplicityObject((UnlimitedMultiplicity)value, diagnostics, context);
			case Mif2Package.UPDATE_MODE_CODES:
				return validateUpdateModeCodes((List<?>)value, diagnostics, context);
			case Mif2Package.UPDATE_MODE_KIND_OBJECT:
				return validateUpdateModeKindObject((UpdateModeKind)value, diagnostics, context);
			case Mif2Package.UPPER_CAMEL_CASE:
				return validateUpperCamelCase((String)value, diagnostics, context);
			case Mif2Package.URI:
				return validateUri((String)value, diagnostics, context);
			case Mif2Package.URL:
				return validateUrl((String)value, diagnostics, context);
			case Mif2Package.UUID:
				return validateUuid((String)value, diagnostics, context);
			case Mif2Package.VERSION:
				return validateVersion((String)value, diagnostics, context);
			case Mif2Package.VISIBILITY_KIND_OBJECT:
				return validateVisibilityKindObject((VisibilityKind)value, diagnostics, context);
			case Mif2Package.VOCABULARY_MODEL_DEFINITION_KIND_OBJECT:
				return validateVocabularyModelDefinitionKindObject((VocabularyModelDefinitionKind)value, diagnostics, context);
			case Mif2Package.VOTE_COMMENT_KIND_OBJECT:
				return validateVoteCommentKindObject((VoteCommentKind)value, diagnostics, context);
			case Mif2Package.VOTE_KIND_OBJECT:
				return validateVoteKindObject((VoteKind)value, diagnostics, context);
			case Mif2Package.VOTE_RESOLUTION_KIND:
				return validateVoteResolutionKind((Enumerator)value, diagnostics, context);
			case Mif2Package.XDOMAIN_NAME:
				return validateXDomainName((String)value, diagnostics, context);
			case Mif2Package.YEAR:
				return validateYear((BigInteger)value, diagnostics, context);
			case Mif2Package.YEARS:
				return validateYears((List<?>)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddElementContent(AddElementContent addElementContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addElementContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationBase(AnnotationBase annotationBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationCascadeInfo(AnnotationCascadeInfo annotationCascadeInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationCascadeInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationDerivation(AnnotationDerivation annotationDerivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationDerivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotations(Annotations annotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppendix(Appendix appendix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appendix, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppInfo(AppInfo appInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationRole(ApplicationRole applicationRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationRoleAnnotations(ApplicationRoleAnnotations applicationRoleAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationRoleAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationRoleAppInfo(ApplicationRoleAppInfo applicationRoleAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationRoleAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationRoleDocumentation(ApplicationRoleDocumentation applicationRoleDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationRoleDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppliedTemplateGroup(AppliedTemplateGroup appliedTemplateGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appliedTemplateGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovalInfo(ApprovalInfo approvalInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(approvalInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactCrossReference(ArtifactCrossReference artifactCrossReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(artifactCrossReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactDependency(ArtifactDependency artifactDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(artifactDependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactSupplement(ArtifactSupplement artifactSupplement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(artifactSupplement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactSupplementAnnotations(ArtifactSupplementAnnotations artifactSupplementAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(artifactSupplementAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactSupplementAppInfo(ArtifactSupplementAppInfo artifactSupplementAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(artifactSupplementAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactSupplementDocumentation(ArtifactSupplementDocumentation artifactSupplementDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(artifactSupplementDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactXRefSummary(ArtifactXRefSummary artifactXRefSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(artifactXRefSummary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(association, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationAnnotations(AssociationAnnotations associationAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationAppInfo(AssociationAppInfo associationAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationBase(AssociationBase associationBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationDocumentation(AssociationDocumentation associationDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEnd(AssociationEnd associationEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationEnd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEndAnnotations(AssociationEndAnnotations associationEndAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationEndAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEndAppInfo(AssociationEndAppInfo associationEndAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationEndAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEndBase(AssociationEndBase associationEndBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationEndBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEndDerivation(AssociationEndDerivation associationEndDerivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationEndDerivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEndDocumentation(AssociationEndDocumentation associationEndDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationEndDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEndSpecialization(AssociationEndSpecialization associationEndSpecialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationEndSpecialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEndWithClass(AssociationEndWithClass associationEndWithClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationEndWithClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEndWithClassRef(AssociationEndWithClassRef associationEndWithClassRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationEndWithClassRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeAnnotations(AttributeAnnotations attributeAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeAppInfo(AttributeAppInfo attributeAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeContent(AttributeContent attributeContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDerivation(AttributeDerivation attributeDerivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDerivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeDocumentation(AttributeDocumentation attributeDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeProperty(AttributeProperty attributeProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeRef(AttributeRef attributeRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueRef(AttributeValueRef attributeValueRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeValueRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallotComment(BallotComment ballotComment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ballotComment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallotCommentResolution(BallotCommentResolution ballotCommentResolution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ballotCommentResolution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallotSubmission(BallotSubmission ballotSubmission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ballotSubmission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicAnnotation(BasicAnnotation basicAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingRealm(BindingRealm bindingRealm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bindingRealm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundStaticModel(BoundStaticModel boundStaticModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundStaticModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusinessName(BusinessName businessName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(businessName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCascadableAnnotation(CascadableAnnotation cascadableAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cascadableAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChange(Change change, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(change, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeRequest(ChangeRequest changeRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeRequestEstimate(ChangeRequestEstimate changeRequestEstimate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeRequestEstimate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAnnotations(ClassAnnotations classAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassAppInfo(ClassAppInfo classAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassBase(ClassBase classBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassBindingArgument(ClassBindingArgument classBindingArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classBindingArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassBindingArgumentBase(ClassBindingArgumentBase classBindingArgumentBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classBindingArgumentBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassDerivation(ClassDerivation classDerivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classDerivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassDocumentation(ClassDocumentation classDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassElement(ClassElement classElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassGeneralization(ClassGeneralization classGeneralization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classGeneralization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassGeneralizationBase(ClassGeneralizationBase classGeneralizationBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classGeneralizationBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassGraphicInformation(ClassGraphicInformation classGraphicInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classGraphicInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierBase(ClassifierBase classifierBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifierBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassOrReference(ClassOrReference classOrReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classOrReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassRef(ClassRef classRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassStubInterface(ClassStubInterface classStubInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classStubInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassStubInterfaceAnnotations(ClassStubInterfaceAnnotations classStubInterfaceAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classStubInterfaceAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassStubInterfaceAppInfo(ClassStubInterfaceAppInfo classStubInterfaceAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classStubInterfaceAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassStubInterfaceDocumentation(ClassStubInterfaceDocumentation classStubInterfaceDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classStubInterfaceDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCode(Code code, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(code, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeBasedContentDefinition(CodeBasedContentDefinition codeBasedContentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeBasedContentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeFilterContentDefinition(CodeFilterContentDefinition codeFilterContentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeFilterContentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeIcon(CodeIcon codeIcon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeIcon, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSupplement(CodeSupplement codeSupplement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSupplement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystem(CodeSystem codeSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemAnnotations(CodeSystemAnnotations codeSystemAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemAppInfo(CodeSystemAppInfo codeSystemAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemBase(CodeSystemBase codeSystemBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemDocumentation(CodeSystemDocumentation codeSystemDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemRef(CodeSystemRef codeSystemRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemSupplement(CodeSystemSupplement codeSystemSupplement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemSupplement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemVersion(CodeSystemVersion codeSystemVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemVersion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemVersionAnnotations(CodeSystemVersionAnnotations codeSystemVersionAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemVersionAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemVersionAppInfo(CodeSystemVersionAppInfo codeSystemVersionAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemVersionAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemVersionBase(CodeSystemVersionBase codeSystemVersionBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemVersionBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemVersionDocumentation(CodeSystemVersionDocumentation codeSystemVersionDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemVersionDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemVersionSupplement(CodeSystemVersionSupplement codeSystemVersionSupplement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeSystemVersionSupplement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeTranslation(CodeTranslation codeTranslation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeTranslation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeTranslationAnnotations(CodeTranslationAnnotations codeTranslationAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeTranslationAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeTranslationAppInfo(CodeTranslationAppInfo codeTranslationAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeTranslationAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeTranslationCollection(CodeTranslationCollection codeTranslationCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeTranslationCollection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeTranslationCollectionAnnotations(CodeTranslationCollectionAnnotations codeTranslationCollectionAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeTranslationCollectionAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeTranslationCollectionAppInfo(CodeTranslationCollectionAppInfo codeTranslationCollectionAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeTranslationCollectionAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeTranslationCollectionDocumentation(CodeTranslationCollectionDocumentation codeTranslationCollectionDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeTranslationCollectionDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeTranslationDocumentation(CodeTranslationDocumentation codeTranslationDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeTranslationDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedContentDefinition(CombinedContentDefinition combinedContentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(combinedContentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommitteeReference(CommitteeReference committeeReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(committeeReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonModelElementDefinition(CommonModelElementDefinition commonModelElementDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonModelElementDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonModelElementRef(CommonModelElementRef commonModelElementRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonModelElementRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonModelElementRefAnnotations(CommonModelElementRefAnnotations commonModelElementRefAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonModelElementRefAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonModelElementRefAppInfo(CommonModelElementRefAppInfo commonModelElementRefAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonModelElementRefAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonModelElementRefBase(CommonModelElementRefBase commonModelElementRefBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonModelElementRefBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonModelElementRefDocumentation(CommonModelElementRefDocumentation commonModelElementRefDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonModelElementRefDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexMarkupWithLanguage(ComplexMarkupWithLanguage complexMarkupWithLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexMarkupWithLanguage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcept(Concept concept, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concept, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptAnnotations(ConceptAnnotations conceptAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptAppInfo(ConceptAppInfo conceptAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptBase(ConceptBase conceptBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptDocumentation(ConceptDocumentation conceptDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptDomain(ConceptDomain conceptDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptDomain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptDomainAnnotations(ConceptDomainAnnotations conceptDomainAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptDomainAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptDomainAppInfo(ConceptDomainAppInfo conceptDomainAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptDomainAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptDomainDocumentation(ConceptDomainDocumentation conceptDomainDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptDomainDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptDomainProperty(ConceptDomainProperty conceptDomainProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptDomainProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptDomainRef(ConceptDomainRef conceptDomainRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptDomainRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptProperty(ConceptProperty conceptProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptPropertyRef(ConceptPropertyRef conceptPropertyRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptPropertyRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptRef(ConceptRef conceptRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptRelationship(ConceptRelationship conceptRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptSupplement(ConceptSupplement conceptSupplement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptSupplement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptSupplementAnnotations(ConceptSupplementAnnotations conceptSupplementAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptSupplementAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptSupplementAppInfo(ConceptSupplementAppInfo conceptSupplementAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptSupplementAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptSupplementDocumentation(ConceptSupplementDocumentation conceptSupplementDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptSupplementDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptUse(ConceptUse conceptUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conceptUse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceProfile(ConformanceProfile conformanceProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceProfileAnnotations(ConformanceProfileAnnotations conformanceProfileAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceProfileAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceProfileAppInfo(ConformanceProfileAppInfo conformanceProfileAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceProfileAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceProfileDocumentation(ConformanceProfileDocumentation conformanceProfileDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceProfileDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceTriggerEvents(ConformanceTriggerEvents conformanceTriggerEvents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceTriggerEvents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainedGraphNode(ContainedGraphNode containedGraphNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedGraphNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentDefinition(ContentDefinition contentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentDefinitionAnnotations(ContentDefinitionAnnotations contentDefinitionAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentDefinitionAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentDefinitionAppInfo(ContentDefinitionAppInfo contentDefinitionAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentDefinitionAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentDefinitionDocumentation(ContentDefinitionDocumentation contentDefinitionDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentDefinitionDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextAnnotation(ContextAnnotation contextAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextBinding(ContextBinding contextBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContributor(Contributor contributor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contributor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatype(Datatype datatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeAnnotations(DatatypeAnnotations datatypeAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeAppInfo(DatatypeAppInfo datatypeAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeBinding(DatatypeBinding datatypeBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeDerivation(DatatypeDerivation datatypeDerivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeDerivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeDocumentation(DatatypeDocumentation datatypeDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeImport(DatatypeImport datatypeImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeLimitation(DatatypeLimitation datatypeLimitation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeLimitation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeModelLibrary(DatatypeModelLibrary datatypeModelLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeModelLibrary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeOperation(DatatypeOperation datatypeOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeParameter(DatatypeParameter datatypeParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeRef(DatatypeRef datatypeRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeTemplateParameter(DatatypeTemplateParameter datatypeTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypeTemplateParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeprecationInfo(DeprecationInfo deprecationInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deprecationInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivation(Derivation derivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedStaticModel(DerivedStaticModel derivedStaticModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedStaticModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedStaticModelsType(DerivedStaticModelsType derivedStaticModelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedStaticModelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignComment(DesignComment designComment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designComment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagram(Diagram diagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagramElement(DiagramElement diagramElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagramElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagramGraphicInformation(DiagramGraphicInformation diagramGraphicInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagramGraphicInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimension(Dimension dimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentation(Documentation documentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentProfile(DocumentProfile documentProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentProfileAnnotations(DocumentProfileAnnotations documentProfileAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentProfileAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentProfileAppInfo(DocumentProfileAppInfo documentProfileAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentProfileAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentProfileDocumentation(DocumentProfileDocumentation documentProfileDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentProfileDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentTest(DocumentTest documentTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentTest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainAnalysisModel(DomainAnalysisModel domainAnalysisModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainAnalysisModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainAnalysisModelAnnotations(DomainAnalysisModelAnnotations domainAnalysisModelAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainAnalysisModelAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainAnalysisModelAppInfo(DomainAnalysisModelAppInfo domainAnalysisModelAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainAnalysisModelAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainAnalysisModelDocumentation(DomainAnalysisModelDocumentation domainAnalysisModelDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainAnalysisModelDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainInstanceExample(DomainInstanceExample domainInstanceExample, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainInstanceExample, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainInstanceExampleAnnotations(DomainInstanceExampleAnnotations domainInstanceExampleAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainInstanceExampleAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainInstanceExampleAppInfo(DomainInstanceExampleAppInfo domainInstanceExampleAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainInstanceExampleAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainInstanceExampleDocumentation(DomainInstanceExampleDocumentation domainInstanceExampleDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainInstanceExampleDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementChange(ElementChange elementChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementChange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementDerivation(ElementDerivation elementDerivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementDerivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementRef(ElementRef elementRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementValueRef(ElementValueRef elementValueRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementValueRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPoint(EntryPoint entryPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPointAnnotations(EntryPointAnnotations entryPointAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryPointAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPointAppInfo(EntryPointAppInfo entryPointAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryPointAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPointBase(EntryPointBase entryPointBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryPointBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryPointDocumentation(EntryPointDocumentation entryPointDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryPointDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentalOccurrence(EnvironmentalOccurrence environmentalOccurrence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environmentalOccurrence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleInteraction(ExampleInteraction exampleInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleSystem(ExampleSystem exampleSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExampleType(ExampleType exampleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exampleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(feature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlatClass(FlatClass flatClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flatClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalConstraint(FormalConstraint formalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formalConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalExpression(FormalExpression formalExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formalExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreeFormMarkupWithLanguage(FreeFormMarkupWithLanguage freeFormMarkupWithLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freeFormMarkupWithLanguage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreehandDocument(FreehandDocument freehandDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freehandDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreehandDocumentAnnotations(FreehandDocumentAnnotations freehandDocumentAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freehandDocumentAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreehandDocumentAppInfo(FreehandDocumentAppInfo freehandDocumentAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freehandDocumentAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreehandDocumentDocumentation(FreehandDocumentDocumentation freehandDocumentDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freehandDocumentDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationAnnotations(GeneralizationAnnotations generalizationAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalizationAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationAppInfo(GeneralizationAppInfo generalizationAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalizationAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationDocumentation(GeneralizationDocumentation generalizationDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalizationDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericPackage(GenericPackage genericPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalApplicationRole(GlobalApplicationRole globalApplicationRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalApplicationRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalArtifactXRefSummary(GlobalArtifactXRefSummary globalArtifactXRefSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalArtifactXRefSummary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalCodeSystem(GlobalCodeSystem globalCodeSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalCodeSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalCodeSystemSupplement(GlobalCodeSystemSupplement globalCodeSystemSupplement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalCodeSystemSupplement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalConformanceProfile(GlobalConformanceProfile globalConformanceProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalConformanceProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalDatatypeModelLibrary(GlobalDatatypeModelLibrary globalDatatypeModelLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalDatatypeModelLibrary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalDerivedStaticModel(GlobalDerivedStaticModel globalDerivedStaticModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalDerivedStaticModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalDomainAnalysisModel(GlobalDomainAnalysisModel globalDomainAnalysisModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalDomainAnalysisModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalDomainInstanceExample(GlobalDomainInstanceExample globalDomainInstanceExample, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalDomainInstanceExample, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalFreehandDocument(GlobalFreehandDocument globalFreehandDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalFreehandDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalGenericPackage(GlobalGenericPackage globalGenericPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalGenericPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalGlossary(GlobalGlossary globalGlossary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalGlossary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalInteraction(GlobalInteraction globalInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalInteraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalInteractionProfile(GlobalInteractionProfile globalInteractionProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalInteractionProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalMifChanges(GlobalMifChanges globalMifChanges, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalMifChanges, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalPublicationPackage(GlobalPublicationPackage globalPublicationPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalPublicationPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalSerializedStaticModel(GlobalSerializedStaticModel globalSerializedStaticModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalSerializedStaticModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalStaticModel(GlobalStaticModel globalStaticModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalStaticModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalStaticModelInterfacePackage(GlobalStaticModelInterfacePackage globalStaticModelInterfacePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalStaticModelInterfacePackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalStoryboard(GlobalStoryboard globalStoryboard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalStoryboard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalStructuredDocument(GlobalStructuredDocument globalStructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalStructuredDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalTestScenario(GlobalTestScenario globalTestScenario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalTestScenario, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalTriggerEvent(GlobalTriggerEvent globalTriggerEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalTriggerEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalValueSet(GlobalValueSet globalValueSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalValueSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalVocabularyModel(GlobalVocabularyModel globalVocabularyModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalVocabularyModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlossary(Glossary glossary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(glossary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphConnector(GraphConnector graphConnector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphConnectorWithEdge(GraphConnectorWithEdge graphConnectorWithEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphConnectorWithEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdge(GraphEdge graphEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdgeGraphicInformation(GraphEdgeGraphicInformation graphEdgeGraphicInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphEdgeGraphicInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdgeWithAnchor(GraphEdgeWithAnchor graphEdgeWithAnchor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphEdgeWithAnchor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphElement(GraphElement graphElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicInformation(GraphicInformation graphicInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphNode(GraphNode graphNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphNodeWithOptionalConnection(GraphNodeWithOptionalConnection graphNodeWithOptionalConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphNodeWithOptionalConnection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupChange(GroupChange groupChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupChange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupVote(GroupVote groupVote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groupVote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeader(Header header, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(header, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryItem(HistoryItem historyItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(historyItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationConstraints(ImplementationConstraints implementationConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationMessageConstraints(ImplementationMessageConstraints implementationMessageConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationMessageConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportDatatypeModelLibrary(ImportDatatypeModelLibrary importDatatypeModelLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(importDatatypeModelLibrary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludeRelatedCodes(IncludeRelatedCodes includeRelatedCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(includeRelatedCodes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteraction(Interaction interaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionAnnotations(InteractionAnnotations interactionAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionAppInfo(InteractionAppInfo interactionAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionDocumentation(InteractionDocumentation interactionDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionProfile(InteractionProfile interactionProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionProfileAnnotations(InteractionProfileAnnotations interactionProfileAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionProfileAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionProfileAppInfo(InteractionProfileAppInfo interactionProfileAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionProfileAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionProfileDocumentation(InteractionProfileDocumentation interactionProfileDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionProfileDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionTest(InteractionTest interactionTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionTest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interface_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemFilter(ItemFilter itemFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyedName(KeyedName keyedName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyedName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegalese(Legalese legalese, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legalese, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalClassRef(LocalClassRef localClassRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localClassRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalClassReference(LocalClassReference localClassReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localClassReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMifChanges(MifChanges mifChanges, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mifChanges, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMifContent(MifContent mifContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mifContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElement(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeGraphicInformation(NodeGraphicInformation nodeGraphicInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeGraphicInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeWithConnectionGraphicInformation(NodeWithConnectionGraphicInformation nodeWithConnectionGraphicInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeWithConnectionGraphicInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonComputableContentDefinition(NonComputableContentDefinition nonComputableContentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonComputableContentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonTraversableAssociationEnd(NonTraversableAssociationEnd nonTraversableAssociationEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonTraversableAssociationEnd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpenIssue(OpenIssue openIssue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(openIssue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationAnnotations(OperationAnnotations operationAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationAppInfo(OperationAppInfo operationAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDerivation(OperationDerivation operationDerivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDerivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationDocumentation(OperationDocumentation operationDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameter(OperationParameter operationParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOtherAnnotation(OtherAnnotation otherAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(otherAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(org.openhealthtools.mdht.emf.hl7.mif2.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(package_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageAnnotations(PackageAnnotations packageAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageAppInfo(PackageAppInfo packageAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageArtifact(PackageArtifact packageArtifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageArtifact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageBase(PackageBase packageBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageContent(PackageContent packageContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageDefId(PackageDefId packageDefId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageDefId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageDerivation(PackageDerivation packageDerivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageDerivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageDocumentation(PackageDocumentation packageDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageOrArtifactRef(PackageOrArtifactRef packageOrArtifactRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageOrArtifactRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageRef(PackageRef packageRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(packageRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterModel(ParameterModel parameterModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoint(Point point, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(point, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrintName(PrintName printName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(printName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyBasedContentDefinition(PropertyBasedContentDefinition propertyBasedContentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyBasedContentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyGroup(PropertyGroup propertyGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationAnnotations(PublicationAnnotations publicationAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicationAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationAppInfo(PublicationAppInfo publicationAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicationAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationBase(PublicationBase publicationBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicationBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationDocumentation(PublicationDocumentation publicationDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicationDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationGroup(PublicationGroup publicationGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicationGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationItem(PublicationItem publicationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicationItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicationPackage(PublicationPackage publicationPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicationPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeDefinition(RangeDefinition rangeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealmElement(RealmElement realmElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realmElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceiverResponsibility(ReceiverResponsibility receiverResponsibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(receiverResponsibility, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedAppRole(RelatedAppRole relatedAppRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedAppRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipBasedContentDefinition(RelationshipBasedContentDefinition relationshipBasedContentDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationshipBasedContentDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelease(Release release, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(release, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReleaseList(ReleaseList releaseList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(releaseList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRenderingInformation(RenderingInformation renderingInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(renderingInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplaceElementContent(ReplaceElementContent replaceElementContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(replaceElementContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsibleGroup(ResponsibleGroup responsibleGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsibleGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerializedAssociationEnd(SerializedAssociationEnd serializedAssociationEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serializedAssociationEnd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerializedAssociationEnds(SerializedAssociationEnds serializedAssociationEnds, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serializedAssociationEnds, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerializedClass(SerializedClass serializedClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serializedClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerializedClassBindingArgument(SerializedClassBindingArgument serializedClassBindingArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serializedClassBindingArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerializedClasses(SerializedClasses serializedClasses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serializedClasses, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerializedClassGeneralization(SerializedClassGeneralization serializedClassGeneralization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serializedClassGeneralization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerializedCommonModelElementRef(SerializedCommonModelElementRef serializedCommonModelElementRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serializedCommonModelElementRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerializedEntryPoint(SerializedEntryPoint serializedEntryPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serializedEntryPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerializedStaticModel(SerializedStaticModel serializedStaticModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serializedStaticModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSerializedStaticModelsType(SerializedStaticModelsType serializedStaticModelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serializedStaticModelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializationClass(SpecializationClass specializationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specializationClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateAnnotations(StateAnnotations stateAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateAppInfo(StateAppInfo stateAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateDerivation(StateDerivation stateDerivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateDerivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateDocumentation(StateDocumentation stateDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachineAnnotations(StateMachineAnnotations stateMachineAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateMachineAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachineAppInfo(StateMachineAppInfo stateMachineAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateMachineAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachineDocumentation(StateMachineDocumentation stateMachineDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stateMachineDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticExample(StaticExample staticExample, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticExample, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModel(StaticModel staticModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelAnnotations(StaticModelAnnotations staticModelAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelAppInfo(StaticModelAppInfo staticModelAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelBase(StaticModelBase staticModelBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelClassTemplateParameter(StaticModelClassTemplateParameter staticModelClassTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelClassTemplateParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelDerivation(StaticModelDerivation staticModelDerivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelDerivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelDerivationSource(StaticModelDerivationSource staticModelDerivationSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelDerivationSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelDocumentation(StaticModelDocumentation staticModelDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelInterfaceAnnotations(StaticModelInterfaceAnnotations staticModelInterfaceAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelInterfaceAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelInterfaceAppInfo(StaticModelInterfaceAppInfo staticModelInterfaceAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelInterfaceAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelInterfaceDocumentation(StaticModelInterfaceDocumentation staticModelInterfaceDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelInterfaceDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelInterfacePackage(StaticModelInterfacePackage staticModelInterfacePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelInterfacePackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelRefBase(StaticModelRefBase staticModelRefBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelRefBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelsType(StaticModelsType staticModelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticModelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticPackageDiagramGraphicInformation(StaticPackageDiagramGraphicInformation staticPackageDiagramGraphicInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticPackageDiagramGraphicInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryboard(Storyboard storyboard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storyboard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryboardAnnotations(StoryboardAnnotations storyboardAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storyboardAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryboardAppInfo(StoryboardAppInfo storyboardAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storyboardAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryboardArtifactReferences(StoryboardArtifactReferences storyboardArtifactReferences, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storyboardArtifactReferences, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryboardDocumentation(StoryboardDocumentation storyboardDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storyboardDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoryboardNarrative(StoryboardNarrative storyboardNarrative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(storyboardNarrative, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeature(StructuralFeature structuralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuralFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredDocument(StructuredDocument structuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuredDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredDocumentAnnotations(StructuredDocumentAnnotations structuredDocumentAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuredDocumentAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredDocumentAppInfo(StructuredDocumentAppInfo structuredDocumentAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuredDocumentAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredDocumentDocumentation(StructuredDocumentDocumentation structuredDocumentDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuredDocumentDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStubDefinition(StubDefinition stubDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stubDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectAreaAnnotations(SubjectAreaAnnotations subjectAreaAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subjectAreaAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectAreaAppInfo(SubjectAreaAppInfo subjectAreaAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subjectAreaAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectAreaDocumentation(SubjectAreaDocumentation subjectAreaDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subjectAreaDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectAreaPackage(SubjectAreaPackage subjectAreaPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subjectAreaPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSystem(SubSystem subSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedConceptProperty(SupportedConceptProperty supportedConceptProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportedConceptProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedConceptRelationship(SupportedConceptRelationship supportedConceptRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportedConceptRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedProperty(SupportedProperty supportedProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportedProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTermDefinition(TermDefinition termDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(termDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyServer(TerminologyServer terminologyServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminologyServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(test, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestBase(TestBase testBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestScenario(TestScenario testScenario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testScenario, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestSystem(TestSystem testSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionAnnotations(TransitionAnnotations transitionAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionAppInfo(TransitionAppInfo transitionAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionDerivation(TransitionDerivation transitionDerivation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionDerivation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionDocumentation(TransitionDocumentation transitionDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionRef(TransitionRef transitionRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerEvent(TriggerEvent triggerEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerEventAnnotations(TriggerEventAnnotations triggerEventAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerEventAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerEventAppInfo(TriggerEventAppInfo triggerEventAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerEventAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerEventDocumentation(TriggerEventDocumentation triggerEventDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerEventDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSet(ValueSet valueSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetAnnotations(ValueSetAnnotations valueSetAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetAppInfo(ValueSetAppInfo valueSetAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetDocumentation(ValueSetDocumentation valueSetDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetSupplement(ValueSetSupplement valueSetSupplement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetSupplement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSetVersion(ValueSetVersion valueSetVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSetVersion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariousMixedContent(VariousMixedContent variousMixedContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variousMixedContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertex(Vertex vertex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vertex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVocabularyCodeRef(VocabularyCodeRef vocabularyCodeRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vocabularyCodeRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVocabularyCodeRefs(VocabularyCodeRefs vocabularyCodeRefs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vocabularyCodeRefs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVocabularyLimitation(VocabularyLimitation vocabularyLimitation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vocabularyLimitation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVocabularyModel(VocabularyModel vocabularyModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vocabularyModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVocabularyModelAnnotations(VocabularyModelAnnotations vocabularyModelAnnotations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vocabularyModelAnnotations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVocabularyModelAppInfo(VocabularyModelAppInfo vocabularyModelAppInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vocabularyModelAppInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVocabularyModelDocumentation(VocabularyModelDocumentation vocabularyModelDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vocabularyModelDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVocabularySpecification(VocabularySpecification vocabularySpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vocabularySpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVocabularyValueSetBinding(VocabularyValueSetBinding vocabularyValueSetBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vocabularyValueSetBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVocabularyValueSetRef(VocabularyValueSetRef vocabularyValueSetRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vocabularyValueSetRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXMIContent(XMIContent xmiContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmiContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffiliateKind(AffiliateKind affiliateKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffirmativeVoteResolutionKind(AffirmativeVoteResolutionKind affirmativeVoteResolutionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationKind(AnnotationKind annotationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationRoleRelationshipKind(ApplicationRoleRelationshipKind applicationRoleRelationshipKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovalStatusKind(ApprovalStatusKind approvalStatusKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactGroupKind(ArtifactGroupKind artifactGroupKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactKind(ArtifactKind artifactKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactRenderingStyleKind(ArtifactRenderingStyleKind artifactRenderingStyleKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributePropertyKind(AttributePropertyKind attributePropertyKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCascadingAnnotationElementKind(CascadingAnnotationElementKind cascadingAnnotationElementKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeRequestStatus(ChangeRequestStatus changeRequestStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassPresentationKind(ClassPresentationKind classPresentationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMETAttributionKind(CMETAttributionKind cmetAttributionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMETEntryKind(CMETEntryKind cmetEntryKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeFilterExpressionKind(CodeFilterExpressionKind codeFilterExpressionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeStatusKind(CodeStatusKind codeStatusKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodingStrengthKind(CodingStrengthKind codingStrengthKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptDomainPropertyKind(ConceptDomainPropertyKind conceptDomainPropertyKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptPropertyTypeKind(ConceptPropertyTypeKind conceptPropertyTypeKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptRelationshipKind(ConceptRelationshipKind conceptRelationshipKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptUseKind(ConceptUseKind conceptUseKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceKind(ConformanceKind conformanceKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstructedElementKind(ConstructedElementKind constructedElementKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentsLevelKind(ContentsLevelKind contentsLevelKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeKind(DatatypeKind datatypeKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeOperationKind(DatatypeOperationKind datatypeOperationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeQualifierKind(DatatypeQualifierKind datatypeQualifierKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultDeterminerKind(DefaultDeterminerKind defaultDeterminerKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedMappingSourceKind(DefinedMappingSourceKind definedMappingSourceKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedRoleKind(DefinedRoleKind definedRoleKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivationRelationshipKind(DerivationRelationshipKind derivationRelationshipKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignCommentTagKind(DesignCommentTagKind designCommentTagKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentProfileKind(DocumentProfileKind documentProfileKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainKind(DomainKind domainKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationUnitsKind(DurationUnitsKind durationUnitsKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEffortQuantifierKind(EffortQuantifierKind effortQuantifierKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionLanguageKind(ExpressionLanguageKind expressionLanguageKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterKind(FilterKind filterKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalism(Functionalism functionalism, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIconFormatKind(IconFormatKind iconFormatKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionKind(InteractionKind interactionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionProfileKind(InteractionProfileKind interactionProfileKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITSKind(ITSKind itsKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapRelationshipKind(MapRelationshipKind mapRelationshipKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelConformanceKind(ModelConformanceKind modelConformanceKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeVoteResolutionKind(NegativeVoteResolutionKind negativeVoteResolutionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeOrientation(NodeOrientation nodeOrientation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnerScopeKind(OwnerScopeKind ownerScopeKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageKind(PackageKind packageKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageRootKind(PackageRootKind packageRootKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentArtifactKind(ParentArtifactKind parentArtifactKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyDefaultHandlingKind(PropertyDefaultHandlingKind propertyDefaultHandlingKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflexivity(Reflexivity reflexivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTraversalKind(RelationshipTraversalKind relationshipTraversalKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevisionFrequencyKind(RevisionFrequencyKind revisionFrequencyKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionKind(SectionKind sectionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelDiagramPresentationKind(StaticModelDiagramPresentationKind staticModelDiagramPresentationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelRepresentationKind(StaticModelRepresentationKind staticModelRepresentationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelUseKind(StaticModelUseKind staticModelUseKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubArtifactKind(SubArtifactKind subArtifactKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSectionKind(SubSectionKind subSectionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetry(Symmetry symmetry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyServerKind(TerminologyServerKind terminologyServerKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitivity(Transitivity transitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslatableDirectionKind(TranslatableDirectionKind translatableDirectionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlimitedMultiplicity(UnlimitedMultiplicity unlimitedMultiplicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateModeKind(UpdateModeKind updateModeKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityKind(VisibilityKind visibilityKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVocabularyModelDefinitionKind(VocabularyModelDefinitionKind vocabularyModelDefinitionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoteCommentKind(VoteCommentKind voteCommentKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoteKind(VoteKind voteKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffiliateKindObject(AffiliateKind affiliateKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffirmativeVoteResolutionKindObject(AffirmativeVoteResolutionKind affirmativeVoteResolutionKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllClassName(String allClassName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAllClassName_MemberTypes(allClassName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>All Class Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllClassName_MemberTypes(String allClassName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Mif2Package.Literals.FORMAL_PROPER_NAME.isInstance(allClassName)) {
				if (validateFormalProperName(allClassName, tempDiagnostics, context)) return true;
			}
			if (Mif2Package.Literals.PREFIXED_UPPER_CAMEL_CASE.isInstance(allClassName)) {
				if (validatePrefixedUpperCamelCase(allClassName, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Mif2Package.Literals.FORMAL_PROPER_NAME.isInstance(allClassName)) {
				if (validateFormalProperName(allClassName, null, context)) return true;
			}
			if (Mif2Package.Literals.PREFIXED_UPPER_CAMEL_CASE.isInstance(allClassName)) {
				if (validatePrefixedUpperCamelCase(allClassName, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationKindObject(AnnotationKind annotationKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationRoleRelationshipKindObject(ApplicationRoleRelationshipKind applicationRoleRelationshipKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovalStatusKindObject(ApprovalStatusKind approvalStatusKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactGroupKindObject(ArtifactGroupKind artifactGroupKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactKindObject(ArtifactKind artifactKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactRenderingStyleKindObject(ArtifactRenderingStyleKind artifactRenderingStyleKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributePropertyKindObject(AttributePropertyKind attributePropertyKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicFormalName(String basicFormalName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonEmptyString_MinLength(basicFormalName, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicFormalName_MaxLength(basicFormalName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Basic Formal Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicFormalName_MaxLength(String basicFormalName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = basicFormalName.length();
		boolean result = length <= 120;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.BASIC_FORMAL_NAME, basicFormalName, length, 120, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicId(String basicId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNMTOKEN_Pattern(basicId, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicId_MinLength(basicId, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicId_MaxLength(basicId, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Basic Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicId_MinLength(String basicId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = basicId.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Mif2Package.Literals.BASIC_ID, basicId, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Basic Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicId_MaxLength(String basicId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = basicId.length();
		boolean result = length <= 40;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.BASIC_ID, basicId, length, 40, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCascadingAnnotationElementKindObject(CascadingAnnotationElementKind cascadingAnnotationElementKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeRequestStatusObject(ChangeRequestStatus changeRequestStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassPresentationKindObject(ClassPresentationKind classPresentationKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMETAttributionKindObject(CMETAttributionKind cmetAttributionKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMETAttributionString(String cmetAttributionString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCMETAttributionString_Pattern(cmetAttributionString, diagnostics, context);
		if (result || diagnostics != null) result &= validateCMETAttributionString_MaxLength(cmetAttributionString, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCMETAttributionString_Pattern
	 */
	public static final  PatternMatcher [][] CMET_ATTRIBUTION_STRING__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-z][a-z0-9A-Z\\-]*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\c+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>CMET Attribution String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMETAttributionString_Pattern(String cmetAttributionString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.CMET_ATTRIBUTION_STRING, cmetAttributionString, CMET_ATTRIBUTION_STRING__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>CMET Attribution String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMETAttributionString_MaxLength(String cmetAttributionString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = cmetAttributionString.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.CMET_ATTRIBUTION_STRING, cmetAttributionString, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMETAttributionType(Object cmetAttributionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCMETAttributionType_MemberTypes(cmetAttributionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>CMET Attribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMETAttributionType_MemberTypes(Object cmetAttributionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Mif2Package.Literals.CMET_ATTRIBUTION_STRING.isInstance(cmetAttributionType)) {
				if (validateCMETAttributionString((String)cmetAttributionType, tempDiagnostics, context)) return true;
			}
			if (Mif2Package.Literals.CMET_ATTRIBUTION_KIND.isInstance(cmetAttributionType)) {
				if (validateCMETAttributionKind((CMETAttributionKind)cmetAttributionType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Mif2Package.Literals.CMET_ATTRIBUTION_STRING.isInstance(cmetAttributionType)) {
				if (validateCMETAttributionString((String)cmetAttributionType, null, context)) return true;
			}
			if (Mif2Package.Literals.CMET_ATTRIBUTION_KIND.isInstance(cmetAttributionType)) {
				if (validateCMETAttributionKind((CMETAttributionKind)cmetAttributionType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCMETEntryKindObject(CMETEntryKind cmetEntryKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeFilterExpressionKindObject(CodeFilterExpressionKind codeFilterExpressionKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeStatusKindObject(CodeStatusKind codeStatusKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodingStrengthKindObject(CodingStrengthKind codingStrengthKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollapsedPackageId(String collapsedPackageId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCollapsedPackageId_Pattern(collapsedPackageId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCollapsedPackageId_Pattern
	 */
	public static final  PatternMatcher [][] COLLAPSED_PACKAGE_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([A-Za-z,0-9,_,\\-]{1,80}=){0,7}[A-Za-z,0-9,_,\\-,\\.]{1,80}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Collapsed Package Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollapsedPackageId_Pattern(String collapsedPackageId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.COLLAPSED_PACKAGE_ID, collapsedPackageId, COLLAPSED_PACKAGE_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptDomainPropertyKindObject(ConceptDomainPropertyKind conceptDomainPropertyKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptPropertyTypeKindObject(ConceptPropertyTypeKind conceptPropertyTypeKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptRelationshipKindObject(ConceptRelationshipKind conceptRelationshipKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConceptUseKindObject(ConceptUseKind conceptUseKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceKindObject(ConformanceKind conformanceKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstructedElementKindObject(ConstructedElementKind constructedElementKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentsLevelKindObject(ContentsLevelKind contentsLevelKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeKindObject(DatatypeKind datatypeKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeName(String datatypeName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatatypeName_Pattern(datatypeName, diagnostics, context);
		if (result || diagnostics != null) result &= validateDatatypeName_MaxLength(datatypeName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatatypeName_Pattern
	 */
	public static final  PatternMatcher [][] DATATYPE_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Z_]+(.[A-Za-z]+)*(.diffType)?")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\c+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Datatype Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeName_Pattern(String datatypeName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.DATATYPE_NAME, datatypeName, DATATYPE_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>Datatype Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeName_MaxLength(String datatypeName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = datatypeName.length();
		boolean result = length <= 60;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.DATATYPE_NAME, datatypeName, length, 60, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeOperationKindObject(DatatypeOperationKind datatypeOperationKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeQualifierKindObject(DatatypeQualifierKind datatypeQualifierKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOrTimestamp(XMLGregorianCalendar dateOrTimestamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateOrTimestamp_MemberTypes(dateOrTimestamp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Or Timestamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateOrTimestamp_MemberTypes(XMLGregorianCalendar dateOrTimestamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateOrTimestamp)) {
				if (xmlTypeValidator.validateDateTime(dateOrTimestamp, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateOrTimestamp)) {
				if (xmlTypeValidator.validateDate(dateOrTimestamp, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateOrTimestamp)) {
				if (xmlTypeValidator.validateDateTime(dateOrTimestamp, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateOrTimestamp)) {
				if (xmlTypeValidator.validateDate(dateOrTimestamp, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimal(BigDecimal decimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecimal_FractionDigits(decimal, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecimal_Min(decimal, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecimal_Max(decimal, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimal_FractionDigits(BigDecimal decimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = decimal.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Mif2Package.Literals.DECIMAL, decimal, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDecimal_Min
	 */
	public static final BigDecimal DECIMAL__MIN__VALUE = new BigDecimal("0.001");

	/**
	 * Validates the Min constraint of '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimal_Min(BigDecimal decimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = decimal.compareTo(DECIMAL__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Mif2Package.Literals.DECIMAL, decimal, DECIMAL__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDecimal_Max
	 */
	public static final BigDecimal DECIMAL__MAX__VALUE = new BigDecimal("1000000");

	/**
	 * Validates the Max constraint of '<em>Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimal_Max(BigDecimal decimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = decimal.compareTo(DECIMAL__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(Mif2Package.Literals.DECIMAL, decimal, DECIMAL__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultDeterminerKindObject(DefaultDeterminerKind defaultDeterminerKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedContextKind(Enumerator definedContextKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDefinedContextKind_MemberTypes(definedContextKind, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Defined Context Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedContextKind_MemberTypes(Enumerator definedContextKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Mif2Package.Literals.AFFILIATE_KIND.isInstance(definedContextKind)) {
				if (validateAffiliateKind((AffiliateKind)definedContextKind, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Mif2Package.Literals.AFFILIATE_KIND.isInstance(definedContextKind)) {
				if (validateAffiliateKind((AffiliateKind)definedContextKind, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedMappingSourceKindObject(DefinedMappingSourceKind definedMappingSourceKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedRoleKindObject(DefinedRoleKind definedRoleKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivationRelationshipKindObject(DerivationRelationshipKind derivationRelationshipKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignCommentTagKindObject(DesignCommentTagKind designCommentTagKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentProfileKindObject(DocumentProfileKind documentProfileKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainKindObject(DomainKind domainKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationUnitsKindObject(DurationUnitsKind durationUnitsKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEffortQuantifierKindObject(EffortQuantifierKind effortQuantifierKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMail(String eMail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEMail_Pattern(eMail, diagnostics, context);
		if (result || diagnostics != null) result &= validateEMail_MaxLength(eMail, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateEMail_Pattern
	 */
	public static final  PatternMatcher [][] EMAIL__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("mailto:.+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>EMail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMail_Pattern(String eMail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.EMAIL, eMail, EMAIL__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>EMail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMail_MaxLength(String eMail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = eMail.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.EMAIL, eMail, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationString(String enumerationString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateEnumerationString_MaxLength(enumerationString, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Enumeration String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationString_MaxLength(String enumerationString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = enumerationString.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.ENUMERATION_STRING, enumerationString, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationToken(String enumerationToken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNMTOKEN_Pattern(enumerationToken, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumerationToken_MaxLength(enumerationToken, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Enumeration Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationToken_MaxLength(String enumerationToken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = enumerationToken.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.ENUMERATION_TOKEN, enumerationToken, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionLanguageKindObject(ExpressionLanguageKind expressionLanguageKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterKindObject(FilterKind filterKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalProperName(String formalProperName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUpperCamelCase_Pattern(formalProperName, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormalProperName_MaxLength(formalProperName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Formal Proper Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalProperName_MaxLength(String formalProperName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = formalProperName.length();
		boolean result = length <= 60;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.FORMAL_PROPER_NAME, formalProperName, length, 60, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalPropertyName(String formalPropertyName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLowerCamelCase_Pattern(formalPropertyName, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormalPropertyName_MaxLength(formalPropertyName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Formal Property Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalPropertyName_MaxLength(String formalPropertyName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = formalPropertyName.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.FORMAL_PROPERTY_NAME, formalPropertyName, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalismObject(Functionalism functionalismObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicMeasurement(BigDecimal graphicMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGraphicMeasurement_FractionDigits(graphicMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphicMeasurement_Max(graphicMeasurement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Graphic Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicMeasurement_FractionDigits(BigDecimal graphicMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = graphicMeasurement.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Mif2Package.Literals.GRAPHIC_MEASUREMENT, graphicMeasurement, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGraphicMeasurement_Max
	 */
	public static final BigDecimal GRAPHIC_MEASUREMENT__MAX__VALUE = new BigDecimal("1000000");

	/**
	 * Validates the Max constraint of '<em>Graphic Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicMeasurement_Max(BigDecimal graphicMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = graphicMeasurement.compareTo(GRAPHIC_MEASUREMENT__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(Mif2Package.Literals.GRAPHIC_MEASUREMENT, graphicMeasurement, GRAPHIC_MEASUREMENT__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHashCode(String hashCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHashCode_Pattern(hashCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHashCode_Pattern
	 */
	public static final  PatternMatcher [][] HASH_CODE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([A-Za-z0-9/+]){27}=")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hash Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHashCode_Pattern(String hashCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.HASH_CODE, hashCode, HASH_CODE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIconFormatKindObject(IconFormatKind iconFormatKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionKindObject(InteractionKind interactionKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionProfileKindObject(InteractionProfileKind interactionProfileKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITSKindObject(ITSKind itsKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalFileReference(String localFileReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLocalFileReference_Pattern(localFileReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalFileReference_MaxLength(localFileReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLocalFileReference_Pattern
	 */
	public static final  PatternMatcher [][] LOCAL_FILE_REFERENCE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(file://)?([A-Za-z0-9_\\-\\.]+/)*[A-Za-z0-9_\\-\\.]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Local File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalFileReference_Pattern(String localFileReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.LOCAL_FILE_REFERENCE, localFileReference, LOCAL_FILE_REFERENCE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>Local File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalFileReference_MaxLength(String localFileReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = localFileReference.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.LOCAL_FILE_REFERENCE, localFileReference, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongDescriptiveName(String longDescriptiveName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonEmptyString_MinLength(longDescriptiveName, diagnostics, context);
		if (result || diagnostics != null) result &= validateLongDescriptiveName_MaxLength(longDescriptiveName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Long Descriptive Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongDescriptiveName_MaxLength(String longDescriptiveName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = longDescriptiveName.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.LONG_DESCRIPTIVE_NAME, longDescriptiveName, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerCamelCase(String lowerCamelCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLowerCamelCase_Pattern(lowerCamelCase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLowerCamelCase_Pattern
	 */
	public static final  PatternMatcher [][] LOWER_CAMEL_CASE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-z][a-z0-9]*([A-Z][a-z0-9]*)*")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\c+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Lower Camel Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerCamelCase_Pattern(String lowerCamelCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.LOWER_CAMEL_CASE, lowerCamelCase, LOWER_CAMEL_CASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingSourceKind(Object mappingSourceKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMappingSourceKind_MemberTypes(mappingSourceKind, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Mapping Source Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingSourceKind_MemberTypes(Object mappingSourceKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Mif2Package.Literals.DEFINED_MAPPING_SOURCE_KIND.isInstance(mappingSourceKind)) {
				if (validateDefinedMappingSourceKind((DefinedMappingSourceKind)mappingSourceKind, tempDiagnostics, context)) return true;
			}
			if (Mif2Package.Literals.SHORT_DESCRIPTIVE_NAME.isInstance(mappingSourceKind)) {
				if (validateShortDescriptiveName((String)mappingSourceKind, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Mif2Package.Literals.DEFINED_MAPPING_SOURCE_KIND.isInstance(mappingSourceKind)) {
				if (validateDefinedMappingSourceKind((DefinedMappingSourceKind)mappingSourceKind, null, context)) return true;
			}
			if (Mif2Package.Literals.SHORT_DESCRIPTIVE_NAME.isInstance(mappingSourceKind)) {
				if (validateShortDescriptiveName((String)mappingSourceKind, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapRelationshipKindObject(MapRelationshipKind mapRelationshipKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMimeType(String mimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMimeType_Pattern(mimeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateMimeType_MaxLength(mimeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMimeType_Pattern
	 */
	public static final  PatternMatcher [][] MIME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-z]+/[a-z0-9\\-]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Mime Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMimeType_Pattern(String mimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.MIME_TYPE, mimeType, MIME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>Mime Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMimeType_MaxLength(String mimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = mimeType.length();
		boolean result = length <= 40;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.MIME_TYPE, mimeType, length, 40, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelConformanceKindObject(ModelConformanceKind modelConformanceKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegativeVoteResolutionKindObject(NegativeVoteResolutionKind negativeVoteResolutionKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeOrientationObject(NodeOrientation nodeOrientationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonEmptyString_MinLength(nonEmptyString, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Non Empty String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString_MinLength(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nonEmptyString.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Mif2Package.Literals.NON_EMPTY_STRING, nonEmptyString, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeDecimal(BigDecimal nonNegativeDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeDecimal_FractionDigits(nonNegativeDecimal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNonNegativeDecimal_Min(nonNegativeDecimal, diagnostics, context);
		if (result || diagnostics != null) result &= validateNonNegativeDecimal_Max(nonNegativeDecimal, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Non Negative Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeDecimal_FractionDigits(BigDecimal nonNegativeDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nonNegativeDecimal.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Mif2Package.Literals.NON_NEGATIVE_DECIMAL, nonNegativeDecimal, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeDecimal_Min
	 */
	public static final BigDecimal NON_NEGATIVE_DECIMAL__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Non Negative Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeDecimal_Min(BigDecimal nonNegativeDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nonNegativeDecimal.compareTo(NON_NEGATIVE_DECIMAL__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Mif2Package.Literals.NON_NEGATIVE_DECIMAL, nonNegativeDecimal, NON_NEGATIVE_DECIMAL__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeDecimal_Max
	 */
	public static final BigDecimal NON_NEGATIVE_DECIMAL__MAX__VALUE = new BigDecimal("1000000");

	/**
	 * Validates the Max constraint of '<em>Non Negative Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeDecimal_Max(BigDecimal nonNegativeDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nonNegativeDecimal.compareTo(NON_NEGATIVE_DECIMAL__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(Mif2Package.Literals.NON_NEGATIVE_DECIMAL, nonNegativeDecimal, NON_NEGATIVE_DECIMAL__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOid(String oid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOid_Pattern(oid, diagnostics, context);
		if (result || diagnostics != null) result &= validateOid_MaxLength(oid, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOid_Pattern
	 */
	public static final  PatternMatcher [][] OID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[1-9][0-9]*(\\.[0-9]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOid_Pattern(String oid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.OID, oid, OID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>Oid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOid_MaxLength(String oid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = oid.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.OID, oid, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnerScopeKindObject(OwnerScopeKind ownerScopeKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageKindObject(PackageKind packageKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageRootKindObject(PackageRootKind packageRootKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentArtifactKindObject(ParentArtifactKind parentArtifactKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveDecimal(BigDecimal positiveDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveDecimal_FractionDigits(positiveDecimal, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositiveDecimal_Min(positiveDecimal, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositiveDecimal_Max(positiveDecimal, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FractionDigits constraint of '<em>Positive Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveDecimal_FractionDigits(BigDecimal positiveDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveDecimal.scale() <= 3;
		if (!result && diagnostics != null)
			reportFractionDigitsViolation(Mif2Package.Literals.POSITIVE_DECIMAL, positiveDecimal, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveDecimal_Min
	 */
	public static final BigDecimal POSITIVE_DECIMAL__MIN__VALUE = new BigDecimal("0.001");

	/**
	 * Validates the Min constraint of '<em>Positive Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveDecimal_Min(BigDecimal positiveDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveDecimal.compareTo(POSITIVE_DECIMAL__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Mif2Package.Literals.POSITIVE_DECIMAL, positiveDecimal, POSITIVE_DECIMAL__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveDecimal_Max
	 */
	public static final BigDecimal POSITIVE_DECIMAL__MAX__VALUE = new BigDecimal("1000000");

	/**
	 * Validates the Max constraint of '<em>Positive Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveDecimal_Max(BigDecimal positiveDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveDecimal.compareTo(POSITIVE_DECIMAL__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(Mif2Package.Literals.POSITIVE_DECIMAL, positiveDecimal, POSITIVE_DECIMAL__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixedUpperCamelCase(String prefixedUpperCamelCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePrefixedUpperCamelCase_Pattern(prefixedUpperCamelCase, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrefixedUpperCamelCase_MaxLength(prefixedUpperCamelCase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePrefixedUpperCamelCase_Pattern
	 */
	public static final  PatternMatcher [][] PREFIXED_UPPER_CAMEL_CASE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Z]+_([A-Z][a-z0-9_\\-]*)+")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\c+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Prefixed Upper Camel Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixedUpperCamelCase_Pattern(String prefixedUpperCamelCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.PREFIXED_UPPER_CAMEL_CASE, prefixedUpperCamelCase, PREFIXED_UPPER_CAMEL_CASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>Prefixed Upper Camel Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixedUpperCamelCase_MaxLength(String prefixedUpperCamelCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = prefixedUpperCamelCase.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.PREFIXED_UPPER_CAMEL_CASE, prefixedUpperCamelCase, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyDefaultHandlingKindObject(PropertyDefaultHandlingKind propertyDefaultHandlingKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealmKind(Object realmKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRealmKind_MemberTypes(realmKind, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Realm Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealmKind_MemberTypes(Object realmKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Mif2Package.Literals.ENUMERATION_TOKEN.isInstance(realmKind)) {
				if (validateEnumerationToken((String)realmKind, tempDiagnostics, context)) return true;
			}
			if (Mif2Package.Literals.DEFINED_CONTEXT_KIND.isInstance(realmKind)) {
				if (validateDefinedContextKind((Enumerator)realmKind, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Mif2Package.Literals.ENUMERATION_TOKEN.isInstance(realmKind)) {
				if (validateEnumerationToken((String)realmKind, null, context)) return true;
			}
			if (Mif2Package.Literals.DEFINED_CONTEXT_KIND.isInstance(realmKind)) {
				if (validateDefinedContextKind((Enumerator)realmKind, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealmNamespaceKind(Object realmNamespaceKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRealmNamespaceKind_MemberTypes(realmNamespaceKind, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Realm Namespace Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealmNamespaceKind_MemberTypes(Object realmNamespaceKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Mif2Package.Literals.REALM_KIND.isInstance(realmNamespaceKind)) {
				if (validateRealmKind(realmNamespaceKind, tempDiagnostics, context)) return true;
			}
			if (Mif2Package.Literals.OID.isInstance(realmNamespaceKind)) {
				if (validateOid((String)realmNamespaceKind, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Mif2Package.Literals.REALM_KIND.isInstance(realmNamespaceKind)) {
				if (validateRealmKind(realmNamespaceKind, null, context)) return true;
			}
			if (Mif2Package.Literals.OID.isInstance(realmNamespaceKind)) {
				if (validateOid((String)realmNamespaceKind, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflexivityObject(Reflexivity reflexivityObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipTraversalKindObject(RelationshipTraversalKind relationshipTraversalKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRevisionFrequencyKindObject(RevisionFrequencyKind revisionFrequencyKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleKind(Object roleKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRoleKind_MemberTypes(roleKind, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Role Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleKind_MemberTypes(Object roleKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Mif2Package.Literals.DEFINED_ROLE_KIND.isInstance(roleKind)) {
				if (validateDefinedRoleKind((DefinedRoleKind)roleKind, tempDiagnostics, context)) return true;
			}
			if (Mif2Package.Literals.SHORT_DESCRIPTIVE_NAME.isInstance(roleKind)) {
				if (validateShortDescriptiveName((String)roleKind, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Mif2Package.Literals.DEFINED_ROLE_KIND.isInstance(roleKind)) {
				if (validateDefinedRoleKind((DefinedRoleKind)roleKind, null, context)) return true;
			}
			if (Mif2Package.Literals.SHORT_DESCRIPTIVE_NAME.isInstance(roleKind)) {
				if (validateShortDescriptiveName((String)roleKind, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionKindObject(SectionKind sectionKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortDescriptiveName(String shortDescriptiveName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonEmptyString_MinLength(shortDescriptiveName, diagnostics, context);
		if (result || diagnostics != null) result &= validateShortDescriptiveName_MaxLength(shortDescriptiveName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Short Descriptive Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortDescriptiveName_MaxLength(String shortDescriptiveName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = shortDescriptiveName.length();
		boolean result = length <= 80;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.SHORT_DESCRIPTIVE_NAME, shortDescriptiveName, length, 80, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortString(String shortString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNMTOKEN_Pattern(shortString, diagnostics, context);
		if (result || diagnostics != null) result &= validateShortString_MinLength(shortString, diagnostics, context);
		if (result || diagnostics != null) result &= validateShortString_MaxLength(shortString, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Short String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortString_MinLength(String shortString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = shortString.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Mif2Package.Literals.SHORT_STRING, shortString, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Short String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShortString_MaxLength(String shortString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = shortString.length();
		boolean result = length <= 10;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.SHORT_STRING, shortString, length, 10, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleNonNegativeInteger(BigInteger singleNonNegativeInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(singleNonNegativeInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleNonNegativeInteger_Max(singleNonNegativeInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSingleNonNegativeInteger_Max
	 */
	public static final BigInteger SINGLE_NON_NEGATIVE_INTEGER__MAX__VALUE = new BigInteger("10");

	/**
	 * Validates the Max constraint of '<em>Single Non Negative Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleNonNegativeInteger_Max(BigInteger singleNonNegativeInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = singleNonNegativeInteger.compareTo(SINGLE_NON_NEGATIVE_INTEGER__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(Mif2Package.Literals.SINGLE_NON_NEGATIVE_INTEGER, singleNonNegativeInteger, SINGLE_NON_NEGATIVE_INTEGER__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmallNonNegativeInteger(BigInteger smallNonNegativeInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(smallNonNegativeInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateSmallNonNegativeInteger_Max(smallNonNegativeInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSmallNonNegativeInteger_Max
	 */
	public static final BigInteger SMALL_NON_NEGATIVE_INTEGER__MAX__VALUE = new BigInteger("1000000");

	/**
	 * Validates the Max constraint of '<em>Small Non Negative Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmallNonNegativeInteger_Max(BigInteger smallNonNegativeInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = smallNonNegativeInteger.compareTo(SMALL_NON_NEGATIVE_INTEGER__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(Mif2Package.Literals.SMALL_NON_NEGATIVE_INTEGER, smallNonNegativeInteger, SMALL_NON_NEGATIVE_INTEGER__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmallPositiveInteger(BigInteger smallPositiveInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validatePositiveInteger_Min(smallPositiveInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateSmallPositiveInteger_Max(smallPositiveInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSmallPositiveInteger_Max
	 */
	public static final BigInteger SMALL_POSITIVE_INTEGER__MAX__VALUE = new BigInteger("1000000");

	/**
	 * Validates the Max constraint of '<em>Small Positive Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmallPositiveInteger_Max(BigInteger smallPositiveInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = smallPositiveInteger.compareTo(SMALL_POSITIVE_INTEGER__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(Mif2Package.Literals.SMALL_POSITIVE_INTEGER, smallPositiveInteger, SMALL_POSITIVE_INTEGER__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelDiagramPresentationKindObject(StaticModelDiagramPresentationKind staticModelDiagramPresentationKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelRepresentationKindObject(StaticModelRepresentationKind staticModelRepresentationKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticModelUseKindObject(StaticModelUseKind staticModelUseKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubArtifactKindObject(SubArtifactKind subArtifactKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSectionKindObject(SubSectionKind subSectionKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymmetryObject(Symmetry symmetryObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateId(String templateId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTemplateId_Pattern(templateId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTemplateId_Pattern
	 */
	public static final  PatternMatcher [][] TEMPLATE_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([A-Z0-9_\\-]{1,80}=){0,6}[A-Z0-9_\\-]{1,80}#([A-Z][a-z0-9_\\-]*)+(\\.[a-z][a-z0-9]*([A-Z][a-z0-9]*)*)?")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\c+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Template Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateId_Pattern(String templateId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.TEMPLATE_ID, templateId, TEMPLATE_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminologyServerKindObject(TerminologyServerKind terminologyServerKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitivityObject(Transitivity transitivityObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslatableDirectionKindObject(TranslatableDirectionKind translatableDirectionKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlimitedInteger(Object unlimitedInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUnlimitedInteger_MemberTypes(unlimitedInteger, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Unlimited Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlimitedInteger_MemberTypes(Object unlimitedInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Mif2Package.Literals.SMALL_POSITIVE_INTEGER.isInstance(unlimitedInteger)) {
				if (validateSmallPositiveInteger((BigInteger)unlimitedInteger, tempDiagnostics, context)) return true;
			}
			if (Mif2Package.Literals.UNLIMITED_MULTIPLICITY.isInstance(unlimitedInteger)) {
				if (validateUnlimitedMultiplicity((UnlimitedMultiplicity)unlimitedInteger, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Mif2Package.Literals.SMALL_POSITIVE_INTEGER.isInstance(unlimitedInteger)) {
				if (validateSmallPositiveInteger((BigInteger)unlimitedInteger, null, context)) return true;
			}
			if (Mif2Package.Literals.UNLIMITED_MULTIPLICITY.isInstance(unlimitedInteger)) {
				if (validateUnlimitedMultiplicity((UnlimitedMultiplicity)unlimitedInteger, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlimitedMultiplicityObject(UnlimitedMultiplicity unlimitedMultiplicityObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateModeCodes(List<?> updateModeCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUpdateModeCodes_ItemType(updateModeCodes, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Update Mode Codes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateModeCodes_ItemType(List<?> updateModeCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = updateModeCodes.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (Mif2Package.Literals.UPDATE_MODE_KIND.isInstance(item)) {
				result &= validateUpdateModeKind((UpdateModeKind)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(Mif2Package.Literals.UPDATE_MODE_KIND, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateModeKindObject(UpdateModeKind updateModeKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperCamelCase(String upperCamelCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUpperCamelCase_Pattern(upperCamelCase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUpperCamelCase_Pattern
	 */
	public static final  PatternMatcher [][] UPPER_CAMEL_CASE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([A-Z][a-z0-9_\\-]*)+")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\c+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Upper Camel Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperCamelCase_Pattern(String upperCamelCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.UPPER_CAMEL_CASE, upperCamelCase, UPPER_CAMEL_CASE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUri(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUri_MaxLength(uri, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Uri</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUri_MaxLength(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = uri.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.URI, uri, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrl(String url, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUrl_Pattern(url, diagnostics, context);
		if (result || diagnostics != null) result &= validateUrl_MaxLength(url, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUrl_Pattern
	 */
	public static final  PatternMatcher [][] URL__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("http(s)?://.+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Url</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrl_Pattern(String url, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.URL, url, URL__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>Url</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrl_MaxLength(String url, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = url.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.URL, url, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuid(String uuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUuid_Pattern(uuid, diagnostics, context);
		if (result || diagnostics != null) result &= validateUuid_MinLength(uuid, diagnostics, context);
		if (result || diagnostics != null) result &= validateUuid_MaxLength(uuid, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUuid_Pattern
	 */
	public static final  PatternMatcher [][] UUID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9A-F]{8}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{4}-[0-9A-F]{12}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Uuid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuid_Pattern(String uuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.UUID, uuid, UUID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Uuid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuid_MinLength(String uuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = uuid.length();
		boolean result = length >= 36;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Mif2Package.Literals.UUID, uuid, length, 36, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Uuid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuid_MaxLength(String uuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = uuid.length();
		boolean result = length <= 36;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.UUID, uuid, length, 36, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion(String version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNMTOKEN_Pattern(version, diagnostics, context);
		if (result || diagnostics != null) result &= validateVersion_MinLength(version, diagnostics, context);
		if (result || diagnostics != null) result &= validateVersion_MaxLength(version, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_MinLength(String version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = version.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Mif2Package.Literals.VERSION, version, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_MaxLength(String version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = version.length();
		boolean result = length <= 16;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.VERSION, version, length, 16, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityKindObject(VisibilityKind visibilityKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVocabularyModelDefinitionKindObject(VocabularyModelDefinitionKind vocabularyModelDefinitionKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoteCommentKindObject(VoteCommentKind voteCommentKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoteKindObject(VoteKind voteKindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoteResolutionKind(Enumerator voteResolutionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVoteResolutionKind_MemberTypes(voteResolutionKind, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Vote Resolution Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoteResolutionKind_MemberTypes(Enumerator voteResolutionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (Mif2Package.Literals.AFFIRMATIVE_VOTE_RESOLUTION_KIND.isInstance(voteResolutionKind)) {
				if (validateAffirmativeVoteResolutionKind((AffirmativeVoteResolutionKind)voteResolutionKind, tempDiagnostics, context)) return true;
			}
			if (Mif2Package.Literals.NEGATIVE_VOTE_RESOLUTION_KIND.isInstance(voteResolutionKind)) {
				if (validateNegativeVoteResolutionKind((NegativeVoteResolutionKind)voteResolutionKind, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (Mif2Package.Literals.AFFIRMATIVE_VOTE_RESOLUTION_KIND.isInstance(voteResolutionKind)) {
				if (validateAffirmativeVoteResolutionKind((AffirmativeVoteResolutionKind)voteResolutionKind, null, context)) return true;
			}
			if (Mif2Package.Literals.NEGATIVE_VOTE_RESOLUTION_KIND.isInstance(voteResolutionKind)) {
				if (validateNegativeVoteResolutionKind((NegativeVoteResolutionKind)voteResolutionKind, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXDomainName(String xDomainName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateXDomainName_Pattern(xDomainName, diagnostics, context);
		if (result || diagnostics != null) result &= validateXDomainName_MaxLength(xDomainName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateXDomainName_Pattern
	 */
	public static final  PatternMatcher [][] XDOMAIN_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(x_)?([A-Z][a-z0-9_]*)+")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\c+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>XDomain Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXDomainName_Pattern(String xDomainName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.XDOMAIN_NAME, xDomainName, XDOMAIN_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MaxLength constraint of '<em>XDomain Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXDomainName_MaxLength(String xDomainName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = xDomainName.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Mif2Package.Literals.XDOMAIN_NAME, xDomainName, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear(BigInteger year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateYear_Pattern(year, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateYear_Pattern
	 */
	public static final  PatternMatcher [][] YEAR__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(19|20)\\d{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYear_Pattern(BigInteger year, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Mif2Package.Literals.YEAR, year, YEAR__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYears(List<?> years, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateYears_ItemType(years, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Years</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYears_ItemType(List<?> years, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = years.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (Mif2Package.Literals.YEAR.isInstance(item)) {
				result &= validateYear((BigInteger)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(Mif2Package.Literals.YEAR, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Mif2Validator
