/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.hl7.mif2.*;
import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package
 * @generated
 */
public class Mif2Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Mif2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mif2Switch() {
		if (modelPackage == null) {
			modelPackage = Mif2Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Mif2Package.ADD_ELEMENT_CONTENT: {
				AddElementContent addElementContent = (AddElementContent)theEObject;
				T result = caseAddElementContent(addElementContent);
				if (result == null) result = caseChange(addElementContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ANNOTATION_BASE: {
				AnnotationBase annotationBase = (AnnotationBase)theEObject;
				T result = caseAnnotationBase(annotationBase);
				if (result == null) result = caseModelElement(annotationBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ANNOTATION_CASCADE_INFO: {
				AnnotationCascadeInfo annotationCascadeInfo = (AnnotationCascadeInfo)theEObject;
				T result = caseAnnotationCascadeInfo(annotationCascadeInfo);
				if (result == null) result = casePackageRef(annotationCascadeInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ANNOTATION_DERIVATION: {
				AnnotationDerivation annotationDerivation = (AnnotationDerivation)theEObject;
				T result = caseAnnotationDerivation(annotationDerivation);
				if (result == null) result = caseDerivation(annotationDerivation);
				if (result == null) result = caseDependency(annotationDerivation);
				if (result == null) result = caseRelationship(annotationDerivation);
				if (result == null) result = caseModelElement(annotationDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ANNOTATIONS: {
				Annotations annotations = (Annotations)theEObject;
				T result = caseAnnotations(annotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.APPENDIX: {
				Appendix appendix = (Appendix)theEObject;
				T result = caseAppendix(appendix);
				if (result == null) result = caseBasicAnnotation(appendix);
				if (result == null) result = caseAnnotationBase(appendix);
				if (result == null) result = caseModelElement(appendix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.APP_INFO: {
				AppInfo appInfo = (AppInfo)theEObject;
				T result = caseAppInfo(appInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.APPLICATION_ROLE: {
				ApplicationRole applicationRole = (ApplicationRole)theEObject;
				T result = caseApplicationRole(applicationRole);
				if (result == null) result = casePackageArtifact(applicationRole);
				if (result == null) result = casePackageBase(applicationRole);
				if (result == null) result = caseModelElement(applicationRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.APPLICATION_ROLE_ANNOTATIONS: {
				ApplicationRoleAnnotations applicationRoleAnnotations = (ApplicationRoleAnnotations)theEObject;
				T result = caseApplicationRoleAnnotations(applicationRoleAnnotations);
				if (result == null) result = caseAnnotations(applicationRoleAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.APPLICATION_ROLE_APP_INFO: {
				ApplicationRoleAppInfo applicationRoleAppInfo = (ApplicationRoleAppInfo)theEObject;
				T result = caseApplicationRoleAppInfo(applicationRoleAppInfo);
				if (result == null) result = caseAppInfo(applicationRoleAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.APPLICATION_ROLE_DOCUMENTATION: {
				ApplicationRoleDocumentation applicationRoleDocumentation = (ApplicationRoleDocumentation)theEObject;
				T result = caseApplicationRoleDocumentation(applicationRoleDocumentation);
				if (result == null) result = caseDocumentation(applicationRoleDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.APPLIED_TEMPLATE_GROUP: {
				AppliedTemplateGroup appliedTemplateGroup = (AppliedTemplateGroup)theEObject;
				T result = caseAppliedTemplateGroup(appliedTemplateGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.APPROVAL_INFO: {
				ApprovalInfo approvalInfo = (ApprovalInfo)theEObject;
				T result = caseApprovalInfo(approvalInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ARTIFACT_CROSS_REFERENCE: {
				ArtifactCrossReference artifactCrossReference = (ArtifactCrossReference)theEObject;
				T result = caseArtifactCrossReference(artifactCrossReference);
				if (result == null) result = casePackageArtifact(artifactCrossReference);
				if (result == null) result = casePackageBase(artifactCrossReference);
				if (result == null) result = caseModelElement(artifactCrossReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ARTIFACT_DEPENDENCY: {
				ArtifactDependency artifactDependency = (ArtifactDependency)theEObject;
				T result = caseArtifactDependency(artifactDependency);
				if (result == null) result = casePackageRef(artifactDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ARTIFACT_SUPPLEMENT: {
				ArtifactSupplement artifactSupplement = (ArtifactSupplement)theEObject;
				T result = caseArtifactSupplement(artifactSupplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ARTIFACT_SUPPLEMENT_ANNOTATIONS: {
				ArtifactSupplementAnnotations artifactSupplementAnnotations = (ArtifactSupplementAnnotations)theEObject;
				T result = caseArtifactSupplementAnnotations(artifactSupplementAnnotations);
				if (result == null) result = caseAnnotations(artifactSupplementAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ARTIFACT_SUPPLEMENT_APP_INFO: {
				ArtifactSupplementAppInfo artifactSupplementAppInfo = (ArtifactSupplementAppInfo)theEObject;
				T result = caseArtifactSupplementAppInfo(artifactSupplementAppInfo);
				if (result == null) result = caseAppInfo(artifactSupplementAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ARTIFACT_SUPPLEMENT_DOCUMENTATION: {
				ArtifactSupplementDocumentation artifactSupplementDocumentation = (ArtifactSupplementDocumentation)theEObject;
				T result = caseArtifactSupplementDocumentation(artifactSupplementDocumentation);
				if (result == null) result = caseDocumentation(artifactSupplementDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ARTIFACT_XREF_SUMMARY: {
				ArtifactXRefSummary artifactXRefSummary = (ArtifactXRefSummary)theEObject;
				T result = caseArtifactXRefSummary(artifactXRefSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseAssociationBase(association);
				if (result == null) result = caseRelationship(association);
				if (result == null) result = caseModelElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_ANNOTATIONS: {
				AssociationAnnotations associationAnnotations = (AssociationAnnotations)theEObject;
				T result = caseAssociationAnnotations(associationAnnotations);
				if (result == null) result = caseAnnotations(associationAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_APP_INFO: {
				AssociationAppInfo associationAppInfo = (AssociationAppInfo)theEObject;
				T result = caseAssociationAppInfo(associationAppInfo);
				if (result == null) result = caseAppInfo(associationAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_BASE: {
				AssociationBase associationBase = (AssociationBase)theEObject;
				T result = caseAssociationBase(associationBase);
				if (result == null) result = caseRelationship(associationBase);
				if (result == null) result = caseModelElement(associationBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_DOCUMENTATION: {
				AssociationDocumentation associationDocumentation = (AssociationDocumentation)theEObject;
				T result = caseAssociationDocumentation(associationDocumentation);
				if (result == null) result = caseDocumentation(associationDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_END: {
				AssociationEnd associationEnd = (AssociationEnd)theEObject;
				T result = caseAssociationEnd(associationEnd);
				if (result == null) result = caseAssociationEndBase(associationEnd);
				if (result == null) result = caseRelationship(associationEnd);
				if (result == null) result = caseModelElement(associationEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_END_ANNOTATIONS: {
				AssociationEndAnnotations associationEndAnnotations = (AssociationEndAnnotations)theEObject;
				T result = caseAssociationEndAnnotations(associationEndAnnotations);
				if (result == null) result = caseAnnotations(associationEndAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_END_APP_INFO: {
				AssociationEndAppInfo associationEndAppInfo = (AssociationEndAppInfo)theEObject;
				T result = caseAssociationEndAppInfo(associationEndAppInfo);
				if (result == null) result = caseAppInfo(associationEndAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_END_BASE: {
				AssociationEndBase associationEndBase = (AssociationEndBase)theEObject;
				T result = caseAssociationEndBase(associationEndBase);
				if (result == null) result = caseRelationship(associationEndBase);
				if (result == null) result = caseModelElement(associationEndBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_END_DERIVATION: {
				AssociationEndDerivation associationEndDerivation = (AssociationEndDerivation)theEObject;
				T result = caseAssociationEndDerivation(associationEndDerivation);
				if (result == null) result = caseClassDerivation(associationEndDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_END_DOCUMENTATION: {
				AssociationEndDocumentation associationEndDocumentation = (AssociationEndDocumentation)theEObject;
				T result = caseAssociationEndDocumentation(associationEndDocumentation);
				if (result == null) result = caseDocumentation(associationEndDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_END_SPECIALIZATION: {
				AssociationEndSpecialization associationEndSpecialization = (AssociationEndSpecialization)theEObject;
				T result = caseAssociationEndSpecialization(associationEndSpecialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_END_WITH_CLASS: {
				AssociationEndWithClass associationEndWithClass = (AssociationEndWithClass)theEObject;
				T result = caseAssociationEndWithClass(associationEndWithClass);
				if (result == null) result = caseAssociationEndBase(associationEndWithClass);
				if (result == null) result = caseRelationship(associationEndWithClass);
				if (result == null) result = caseModelElement(associationEndWithClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ASSOCIATION_END_WITH_CLASS_REF: {
				AssociationEndWithClassRef associationEndWithClassRef = (AssociationEndWithClassRef)theEObject;
				T result = caseAssociationEndWithClassRef(associationEndWithClassRef);
				if (result == null) result = caseAssociationEndBase(associationEndWithClassRef);
				if (result == null) result = caseRelationship(associationEndWithClassRef);
				if (result == null) result = caseModelElement(associationEndWithClassRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseStructuralFeature(attribute);
				if (result == null) result = caseFeature(attribute);
				if (result == null) result = caseModelElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ATTRIBUTE_ANNOTATIONS: {
				AttributeAnnotations attributeAnnotations = (AttributeAnnotations)theEObject;
				T result = caseAttributeAnnotations(attributeAnnotations);
				if (result == null) result = caseAnnotations(attributeAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ATTRIBUTE_APP_INFO: {
				AttributeAppInfo attributeAppInfo = (AttributeAppInfo)theEObject;
				T result = caseAttributeAppInfo(attributeAppInfo);
				if (result == null) result = caseAppInfo(attributeAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ATTRIBUTE_CONTENT: {
				AttributeContent attributeContent = (AttributeContent)theEObject;
				T result = caseAttributeContent(attributeContent);
				if (result == null) result = caseAttributeRef(attributeContent);
				if (result == null) result = caseChange(attributeContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ATTRIBUTE_DERIVATION: {
				AttributeDerivation attributeDerivation = (AttributeDerivation)theEObject;
				T result = caseAttributeDerivation(attributeDerivation);
				if (result == null) result = caseClassDerivation(attributeDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ATTRIBUTE_DOCUMENTATION: {
				AttributeDocumentation attributeDocumentation = (AttributeDocumentation)theEObject;
				T result = caseAttributeDocumentation(attributeDocumentation);
				if (result == null) result = caseDocumentation(attributeDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ATTRIBUTE_PROPERTY: {
				AttributeProperty attributeProperty = (AttributeProperty)theEObject;
				T result = caseAttributeProperty(attributeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ATTRIBUTE_REF: {
				AttributeRef attributeRef = (AttributeRef)theEObject;
				T result = caseAttributeRef(attributeRef);
				if (result == null) result = caseChange(attributeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ATTRIBUTE_VALUE_REF: {
				AttributeValueRef attributeValueRef = (AttributeValueRef)theEObject;
				T result = caseAttributeValueRef(attributeValueRef);
				if (result == null) result = caseAttributeRef(attributeValueRef);
				if (result == null) result = caseChange(attributeValueRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.BALLOT_COMMENT: {
				BallotComment ballotComment = (BallotComment)theEObject;
				T result = caseBallotComment(ballotComment);
				if (result == null) result = caseBasicAnnotation(ballotComment);
				if (result == null) result = caseAnnotationBase(ballotComment);
				if (result == null) result = caseModelElement(ballotComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.BALLOT_COMMENT_RESOLUTION: {
				BallotCommentResolution ballotCommentResolution = (BallotCommentResolution)theEObject;
				T result = caseBallotCommentResolution(ballotCommentResolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.BALLOT_SUBMISSION: {
				BallotSubmission ballotSubmission = (BallotSubmission)theEObject;
				T result = caseBallotSubmission(ballotSubmission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.BASIC_ANNOTATION: {
				BasicAnnotation basicAnnotation = (BasicAnnotation)theEObject;
				T result = caseBasicAnnotation(basicAnnotation);
				if (result == null) result = caseAnnotationBase(basicAnnotation);
				if (result == null) result = caseModelElement(basicAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.BINDING_REALM: {
				BindingRealm bindingRealm = (BindingRealm)theEObject;
				T result = caseBindingRealm(bindingRealm);
				if (result == null) result = caseModelElement(bindingRealm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.BOUND_STATIC_MODEL: {
				BoundStaticModel boundStaticModel = (BoundStaticModel)theEObject;
				T result = caseBoundStaticModel(boundStaticModel);
				if (result == null) result = casePackageRef(boundStaticModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.BUSINESS_NAME: {
				BusinessName businessName = (BusinessName)theEObject;
				T result = caseBusinessName(businessName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CASCADABLE_ANNOTATION: {
				CascadableAnnotation cascadableAnnotation = (CascadableAnnotation)theEObject;
				T result = caseCascadableAnnotation(cascadableAnnotation);
				if (result == null) result = caseBasicAnnotation(cascadableAnnotation);
				if (result == null) result = caseAnnotationBase(cascadableAnnotation);
				if (result == null) result = caseModelElement(cascadableAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CHANGE: {
				Change change = (Change)theEObject;
				T result = caseChange(change);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CHANGE_REQUEST: {
				ChangeRequest changeRequest = (ChangeRequest)theEObject;
				T result = caseChangeRequest(changeRequest);
				if (result == null) result = caseBasicAnnotation(changeRequest);
				if (result == null) result = caseAnnotationBase(changeRequest);
				if (result == null) result = caseModelElement(changeRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CHANGE_REQUEST_ESTIMATE: {
				ChangeRequestEstimate changeRequestEstimate = (ChangeRequestEstimate)theEObject;
				T result = caseChangeRequestEstimate(changeRequestEstimate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_ANNOTATIONS: {
				ClassAnnotations classAnnotations = (ClassAnnotations)theEObject;
				T result = caseClassAnnotations(classAnnotations);
				if (result == null) result = caseAnnotations(classAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_APP_INFO: {
				ClassAppInfo classAppInfo = (ClassAppInfo)theEObject;
				T result = caseClassAppInfo(classAppInfo);
				if (result == null) result = caseAppInfo(classAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_BASE: {
				ClassBase classBase = (ClassBase)theEObject;
				T result = caseClassBase(classBase);
				if (result == null) result = caseClassifierBase(classBase);
				if (result == null) result = caseClassifier(classBase);
				if (result == null) result = caseModelElement(classBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_BINDING_ARGUMENT: {
				ClassBindingArgument classBindingArgument = (ClassBindingArgument)theEObject;
				T result = caseClassBindingArgument(classBindingArgument);
				if (result == null) result = caseClassBindingArgumentBase(classBindingArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_BINDING_ARGUMENT_BASE: {
				ClassBindingArgumentBase classBindingArgumentBase = (ClassBindingArgumentBase)theEObject;
				T result = caseClassBindingArgumentBase(classBindingArgumentBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_DERIVATION: {
				ClassDerivation classDerivation = (ClassDerivation)theEObject;
				T result = caseClassDerivation(classDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_DOCUMENTATION: {
				ClassDocumentation classDocumentation = (ClassDocumentation)theEObject;
				T result = caseClassDocumentation(classDocumentation);
				if (result == null) result = caseDocumentation(classDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_ELEMENT: {
				ClassElement classElement = (ClassElement)theEObject;
				T result = caseClassElement(classElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_GENERALIZATION: {
				ClassGeneralization classGeneralization = (ClassGeneralization)theEObject;
				T result = caseClassGeneralization(classGeneralization);
				if (result == null) result = caseClassGeneralizationBase(classGeneralization);
				if (result == null) result = caseRelationship(classGeneralization);
				if (result == null) result = caseModelElement(classGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_GENERALIZATION_BASE: {
				ClassGeneralizationBase classGeneralizationBase = (ClassGeneralizationBase)theEObject;
				T result = caseClassGeneralizationBase(classGeneralizationBase);
				if (result == null) result = caseRelationship(classGeneralizationBase);
				if (result == null) result = caseModelElement(classGeneralizationBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_GRAPHIC_INFORMATION: {
				ClassGraphicInformation classGraphicInformation = (ClassGraphicInformation)theEObject;
				T result = caseClassGraphicInformation(classGraphicInformation);
				if (result == null) result = caseNodeGraphicInformation(classGraphicInformation);
				if (result == null) result = caseGraphicInformation(classGraphicInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseModelElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASSIFIER_BASE: {
				ClassifierBase classifierBase = (ClassifierBase)theEObject;
				T result = caseClassifierBase(classifierBase);
				if (result == null) result = caseClassifier(classifierBase);
				if (result == null) result = caseModelElement(classifierBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_OR_REFERENCE: {
				ClassOrReference classOrReference = (ClassOrReference)theEObject;
				T result = caseClassOrReference(classOrReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_REF: {
				ClassRef classRef = (ClassRef)theEObject;
				T result = caseClassRef(classRef);
				if (result == null) result = casePackageRef(classRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_STUB_INTERFACE: {
				ClassStubInterface classStubInterface = (ClassStubInterface)theEObject;
				T result = caseClassStubInterface(classStubInterface);
				if (result == null) result = caseClassifierBase(classStubInterface);
				if (result == null) result = caseClassifier(classStubInterface);
				if (result == null) result = caseModelElement(classStubInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_STUB_INTERFACE_ANNOTATIONS: {
				ClassStubInterfaceAnnotations classStubInterfaceAnnotations = (ClassStubInterfaceAnnotations)theEObject;
				T result = caseClassStubInterfaceAnnotations(classStubInterfaceAnnotations);
				if (result == null) result = caseAnnotations(classStubInterfaceAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_STUB_INTERFACE_APP_INFO: {
				ClassStubInterfaceAppInfo classStubInterfaceAppInfo = (ClassStubInterfaceAppInfo)theEObject;
				T result = caseClassStubInterfaceAppInfo(classStubInterfaceAppInfo);
				if (result == null) result = caseAppInfo(classStubInterfaceAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CLASS_STUB_INTERFACE_DOCUMENTATION: {
				ClassStubInterfaceDocumentation classStubInterfaceDocumentation = (ClassStubInterfaceDocumentation)theEObject;
				T result = caseClassStubInterfaceDocumentation(classStubInterfaceDocumentation);
				if (result == null) result = caseDocumentation(classStubInterfaceDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_BASED_CONTENT_DEFINITION: {
				CodeBasedContentDefinition codeBasedContentDefinition = (CodeBasedContentDefinition)theEObject;
				T result = caseCodeBasedContentDefinition(codeBasedContentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_FILTER_CONTENT_DEFINITION: {
				CodeFilterContentDefinition codeFilterContentDefinition = (CodeFilterContentDefinition)theEObject;
				T result = caseCodeFilterContentDefinition(codeFilterContentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_ICON: {
				CodeIcon codeIcon = (CodeIcon)theEObject;
				T result = caseCodeIcon(codeIcon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SUPPLEMENT: {
				CodeSupplement codeSupplement = (CodeSupplement)theEObject;
				T result = caseCodeSupplement(codeSupplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM: {
				CodeSystem codeSystem = (CodeSystem)theEObject;
				T result = caseCodeSystem(codeSystem);
				if (result == null) result = caseCodeSystemBase(codeSystem);
				if (result == null) result = casePackageBase(codeSystem);
				if (result == null) result = caseModelElement(codeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM_ANNOTATIONS: {
				CodeSystemAnnotations codeSystemAnnotations = (CodeSystemAnnotations)theEObject;
				T result = caseCodeSystemAnnotations(codeSystemAnnotations);
				if (result == null) result = caseAnnotations(codeSystemAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM_APP_INFO: {
				CodeSystemAppInfo codeSystemAppInfo = (CodeSystemAppInfo)theEObject;
				T result = caseCodeSystemAppInfo(codeSystemAppInfo);
				if (result == null) result = caseAppInfo(codeSystemAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM_BASE: {
				CodeSystemBase codeSystemBase = (CodeSystemBase)theEObject;
				T result = caseCodeSystemBase(codeSystemBase);
				if (result == null) result = casePackageBase(codeSystemBase);
				if (result == null) result = caseModelElement(codeSystemBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM_DOCUMENTATION: {
				CodeSystemDocumentation codeSystemDocumentation = (CodeSystemDocumentation)theEObject;
				T result = caseCodeSystemDocumentation(codeSystemDocumentation);
				if (result == null) result = caseDocumentation(codeSystemDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM_REF: {
				CodeSystemRef codeSystemRef = (CodeSystemRef)theEObject;
				T result = caseCodeSystemRef(codeSystemRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM_SUPPLEMENT: {
				CodeSystemSupplement codeSystemSupplement = (CodeSystemSupplement)theEObject;
				T result = caseCodeSystemSupplement(codeSystemSupplement);
				if (result == null) result = caseCodeSystemBase(codeSystemSupplement);
				if (result == null) result = casePackageBase(codeSystemSupplement);
				if (result == null) result = caseModelElement(codeSystemSupplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM_VERSION: {
				CodeSystemVersion codeSystemVersion = (CodeSystemVersion)theEObject;
				T result = caseCodeSystemVersion(codeSystemVersion);
				if (result == null) result = caseCodeSystemVersionBase(codeSystemVersion);
				if (result == null) result = caseModelElement(codeSystemVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM_VERSION_ANNOTATIONS: {
				CodeSystemVersionAnnotations codeSystemVersionAnnotations = (CodeSystemVersionAnnotations)theEObject;
				T result = caseCodeSystemVersionAnnotations(codeSystemVersionAnnotations);
				if (result == null) result = caseAnnotations(codeSystemVersionAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM_VERSION_APP_INFO: {
				CodeSystemVersionAppInfo codeSystemVersionAppInfo = (CodeSystemVersionAppInfo)theEObject;
				T result = caseCodeSystemVersionAppInfo(codeSystemVersionAppInfo);
				if (result == null) result = caseAppInfo(codeSystemVersionAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM_VERSION_BASE: {
				CodeSystemVersionBase codeSystemVersionBase = (CodeSystemVersionBase)theEObject;
				T result = caseCodeSystemVersionBase(codeSystemVersionBase);
				if (result == null) result = caseModelElement(codeSystemVersionBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM_VERSION_DOCUMENTATION: {
				CodeSystemVersionDocumentation codeSystemVersionDocumentation = (CodeSystemVersionDocumentation)theEObject;
				T result = caseCodeSystemVersionDocumentation(codeSystemVersionDocumentation);
				if (result == null) result = caseDocumentation(codeSystemVersionDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_SYSTEM_VERSION_SUPPLEMENT: {
				CodeSystemVersionSupplement codeSystemVersionSupplement = (CodeSystemVersionSupplement)theEObject;
				T result = caseCodeSystemVersionSupplement(codeSystemVersionSupplement);
				if (result == null) result = caseCodeSystemVersionBase(codeSystemVersionSupplement);
				if (result == null) result = caseModelElement(codeSystemVersionSupplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_TRANSLATION: {
				CodeTranslation codeTranslation = (CodeTranslation)theEObject;
				T result = caseCodeTranslation(codeTranslation);
				if (result == null) result = caseModelElement(codeTranslation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_TRANSLATION_ANNOTATIONS: {
				CodeTranslationAnnotations codeTranslationAnnotations = (CodeTranslationAnnotations)theEObject;
				T result = caseCodeTranslationAnnotations(codeTranslationAnnotations);
				if (result == null) result = caseAnnotations(codeTranslationAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_TRANSLATION_APP_INFO: {
				CodeTranslationAppInfo codeTranslationAppInfo = (CodeTranslationAppInfo)theEObject;
				T result = caseCodeTranslationAppInfo(codeTranslationAppInfo);
				if (result == null) result = caseAppInfo(codeTranslationAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_TRANSLATION_COLLECTION: {
				CodeTranslationCollection codeTranslationCollection = (CodeTranslationCollection)theEObject;
				T result = caseCodeTranslationCollection(codeTranslationCollection);
				if (result == null) result = casePackageBase(codeTranslationCollection);
				if (result == null) result = caseModelElement(codeTranslationCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_TRANSLATION_COLLECTION_ANNOTATIONS: {
				CodeTranslationCollectionAnnotations codeTranslationCollectionAnnotations = (CodeTranslationCollectionAnnotations)theEObject;
				T result = caseCodeTranslationCollectionAnnotations(codeTranslationCollectionAnnotations);
				if (result == null) result = caseAnnotations(codeTranslationCollectionAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_TRANSLATION_COLLECTION_APP_INFO: {
				CodeTranslationCollectionAppInfo codeTranslationCollectionAppInfo = (CodeTranslationCollectionAppInfo)theEObject;
				T result = caseCodeTranslationCollectionAppInfo(codeTranslationCollectionAppInfo);
				if (result == null) result = caseAppInfo(codeTranslationCollectionAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_TRANSLATION_COLLECTION_DOCUMENTATION: {
				CodeTranslationCollectionDocumentation codeTranslationCollectionDocumentation = (CodeTranslationCollectionDocumentation)theEObject;
				T result = caseCodeTranslationCollectionDocumentation(codeTranslationCollectionDocumentation);
				if (result == null) result = caseDocumentation(codeTranslationCollectionDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CODE_TRANSLATION_DOCUMENTATION: {
				CodeTranslationDocumentation codeTranslationDocumentation = (CodeTranslationDocumentation)theEObject;
				T result = caseCodeTranslationDocumentation(codeTranslationDocumentation);
				if (result == null) result = caseDocumentation(codeTranslationDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.COMBINED_CONTENT_DEFINITION: {
				CombinedContentDefinition combinedContentDefinition = (CombinedContentDefinition)theEObject;
				T result = caseCombinedContentDefinition(combinedContentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.COMMITTEE_REFERENCE: {
				CommitteeReference committeeReference = (CommitteeReference)theEObject;
				T result = caseCommitteeReference(committeeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION: {
				CommonModelElementDefinition commonModelElementDefinition = (CommonModelElementDefinition)theEObject;
				T result = caseCommonModelElementDefinition(commonModelElementDefinition);
				if (result == null) result = caseClassifierBase(commonModelElementDefinition);
				if (result == null) result = caseClassifier(commonModelElementDefinition);
				if (result == null) result = caseModelElement(commonModelElementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.COMMON_MODEL_ELEMENT_REF: {
				CommonModelElementRef commonModelElementRef = (CommonModelElementRef)theEObject;
				T result = caseCommonModelElementRef(commonModelElementRef);
				if (result == null) result = caseCommonModelElementRefBase(commonModelElementRef);
				if (result == null) result = caseClassifierBase(commonModelElementRef);
				if (result == null) result = caseClassifier(commonModelElementRef);
				if (result == null) result = caseModelElement(commonModelElementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.COMMON_MODEL_ELEMENT_REF_ANNOTATIONS: {
				CommonModelElementRefAnnotations commonModelElementRefAnnotations = (CommonModelElementRefAnnotations)theEObject;
				T result = caseCommonModelElementRefAnnotations(commonModelElementRefAnnotations);
				if (result == null) result = caseAnnotations(commonModelElementRefAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.COMMON_MODEL_ELEMENT_REF_APP_INFO: {
				CommonModelElementRefAppInfo commonModelElementRefAppInfo = (CommonModelElementRefAppInfo)theEObject;
				T result = caseCommonModelElementRefAppInfo(commonModelElementRefAppInfo);
				if (result == null) result = caseAppInfo(commonModelElementRefAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.COMMON_MODEL_ELEMENT_REF_BASE: {
				CommonModelElementRefBase commonModelElementRefBase = (CommonModelElementRefBase)theEObject;
				T result = caseCommonModelElementRefBase(commonModelElementRefBase);
				if (result == null) result = caseClassifierBase(commonModelElementRefBase);
				if (result == null) result = caseClassifier(commonModelElementRefBase);
				if (result == null) result = caseModelElement(commonModelElementRefBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.COMMON_MODEL_ELEMENT_REF_DOCUMENTATION: {
				CommonModelElementRefDocumentation commonModelElementRefDocumentation = (CommonModelElementRefDocumentation)theEObject;
				T result = caseCommonModelElementRefDocumentation(commonModelElementRefDocumentation);
				if (result == null) result = caseDocumentation(commonModelElementRefDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.COMPLEX_MARKUP_WITH_LANGUAGE: {
				ComplexMarkupWithLanguage complexMarkupWithLanguage = (ComplexMarkupWithLanguage)theEObject;
				T result = caseComplexMarkupWithLanguage(complexMarkupWithLanguage);
				if (result == null) result = caseFlow(complexMarkupWithLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT: {
				Concept concept = (Concept)theEObject;
				T result = caseConcept(concept);
				if (result == null) result = caseConceptBase(concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_ANNOTATIONS: {
				ConceptAnnotations conceptAnnotations = (ConceptAnnotations)theEObject;
				T result = caseConceptAnnotations(conceptAnnotations);
				if (result == null) result = caseAnnotations(conceptAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_APP_INFO: {
				ConceptAppInfo conceptAppInfo = (ConceptAppInfo)theEObject;
				T result = caseConceptAppInfo(conceptAppInfo);
				if (result == null) result = caseAppInfo(conceptAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_BASE: {
				ConceptBase conceptBase = (ConceptBase)theEObject;
				T result = caseConceptBase(conceptBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_DOCUMENTATION: {
				ConceptDocumentation conceptDocumentation = (ConceptDocumentation)theEObject;
				T result = caseConceptDocumentation(conceptDocumentation);
				if (result == null) result = caseDocumentation(conceptDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_DOMAIN: {
				ConceptDomain conceptDomain = (ConceptDomain)theEObject;
				T result = caseConceptDomain(conceptDomain);
				if (result == null) result = caseModelElement(conceptDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_DOMAIN_ANNOTATIONS: {
				ConceptDomainAnnotations conceptDomainAnnotations = (ConceptDomainAnnotations)theEObject;
				T result = caseConceptDomainAnnotations(conceptDomainAnnotations);
				if (result == null) result = caseAnnotations(conceptDomainAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_DOMAIN_APP_INFO: {
				ConceptDomainAppInfo conceptDomainAppInfo = (ConceptDomainAppInfo)theEObject;
				T result = caseConceptDomainAppInfo(conceptDomainAppInfo);
				if (result == null) result = caseAppInfo(conceptDomainAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_DOMAIN_DOCUMENTATION: {
				ConceptDomainDocumentation conceptDomainDocumentation = (ConceptDomainDocumentation)theEObject;
				T result = caseConceptDomainDocumentation(conceptDomainDocumentation);
				if (result == null) result = caseDocumentation(conceptDomainDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_DOMAIN_PROPERTY: {
				ConceptDomainProperty conceptDomainProperty = (ConceptDomainProperty)theEObject;
				T result = caseConceptDomainProperty(conceptDomainProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_DOMAIN_REF: {
				ConceptDomainRef conceptDomainRef = (ConceptDomainRef)theEObject;
				T result = caseConceptDomainRef(conceptDomainRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_PROPERTY: {
				ConceptProperty conceptProperty = (ConceptProperty)theEObject;
				T result = caseConceptProperty(conceptProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_PROPERTY_REF: {
				ConceptPropertyRef conceptPropertyRef = (ConceptPropertyRef)theEObject;
				T result = caseConceptPropertyRef(conceptPropertyRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_REF: {
				ConceptRef conceptRef = (ConceptRef)theEObject;
				T result = caseConceptRef(conceptRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_RELATIONSHIP: {
				ConceptRelationship conceptRelationship = (ConceptRelationship)theEObject;
				T result = caseConceptRelationship(conceptRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_SUPPLEMENT: {
				ConceptSupplement conceptSupplement = (ConceptSupplement)theEObject;
				T result = caseConceptSupplement(conceptSupplement);
				if (result == null) result = caseConceptBase(conceptSupplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_SUPPLEMENT_ANNOTATIONS: {
				ConceptSupplementAnnotations conceptSupplementAnnotations = (ConceptSupplementAnnotations)theEObject;
				T result = caseConceptSupplementAnnotations(conceptSupplementAnnotations);
				if (result == null) result = caseAnnotations(conceptSupplementAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_SUPPLEMENT_APP_INFO: {
				ConceptSupplementAppInfo conceptSupplementAppInfo = (ConceptSupplementAppInfo)theEObject;
				T result = caseConceptSupplementAppInfo(conceptSupplementAppInfo);
				if (result == null) result = caseAppInfo(conceptSupplementAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_SUPPLEMENT_DOCUMENTATION: {
				ConceptSupplementDocumentation conceptSupplementDocumentation = (ConceptSupplementDocumentation)theEObject;
				T result = caseConceptSupplementDocumentation(conceptSupplementDocumentation);
				if (result == null) result = caseDocumentation(conceptSupplementDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONCEPT_USE: {
				ConceptUse conceptUse = (ConceptUse)theEObject;
				T result = caseConceptUse(conceptUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONFORMANCE_PROFILE: {
				ConformanceProfile conformanceProfile = (ConformanceProfile)theEObject;
				T result = caseConformanceProfile(conformanceProfile);
				if (result == null) result = casePackage(conformanceProfile);
				if (result == null) result = casePackageBase(conformanceProfile);
				if (result == null) result = caseModelElement(conformanceProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS: {
				ConformanceProfileAnnotations conformanceProfileAnnotations = (ConformanceProfileAnnotations)theEObject;
				T result = caseConformanceProfileAnnotations(conformanceProfileAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO: {
				ConformanceProfileAppInfo conformanceProfileAppInfo = (ConformanceProfileAppInfo)theEObject;
				T result = caseConformanceProfileAppInfo(conformanceProfileAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONFORMANCE_PROFILE_DOCUMENTATION: {
				ConformanceProfileDocumentation conformanceProfileDocumentation = (ConformanceProfileDocumentation)theEObject;
				T result = caseConformanceProfileDocumentation(conformanceProfileDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONFORMANCE_TRIGGER_EVENTS: {
				ConformanceTriggerEvents conformanceTriggerEvents = (ConformanceTriggerEvents)theEObject;
				T result = caseConformanceTriggerEvents(conformanceTriggerEvents);
				if (result == null) result = casePackageRef(conformanceTriggerEvents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONTAINED_GRAPH_NODE: {
				ContainedGraphNode containedGraphNode = (ContainedGraphNode)theEObject;
				T result = caseContainedGraphNode(containedGraphNode);
				if (result == null) result = caseGraphNode(containedGraphNode);
				if (result == null) result = caseGraphElement(containedGraphNode);
				if (result == null) result = caseDiagramElement(containedGraphNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONTENT_DEFINITION: {
				ContentDefinition contentDefinition = (ContentDefinition)theEObject;
				T result = caseContentDefinition(contentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONTENT_DEFINITION_ANNOTATIONS: {
				ContentDefinitionAnnotations contentDefinitionAnnotations = (ContentDefinitionAnnotations)theEObject;
				T result = caseContentDefinitionAnnotations(contentDefinitionAnnotations);
				if (result == null) result = caseAnnotations(contentDefinitionAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONTENT_DEFINITION_APP_INFO: {
				ContentDefinitionAppInfo contentDefinitionAppInfo = (ContentDefinitionAppInfo)theEObject;
				T result = caseContentDefinitionAppInfo(contentDefinitionAppInfo);
				if (result == null) result = caseAppInfo(contentDefinitionAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONTENT_DEFINITION_DOCUMENTATION: {
				ContentDefinitionDocumentation contentDefinitionDocumentation = (ContentDefinitionDocumentation)theEObject;
				T result = caseContentDefinitionDocumentation(contentDefinitionDocumentation);
				if (result == null) result = caseDocumentation(contentDefinitionDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONTEXT_ANNOTATION: {
				ContextAnnotation contextAnnotation = (ContextAnnotation)theEObject;
				T result = caseContextAnnotation(contextAnnotation);
				if (result == null) result = caseCascadableAnnotation(contextAnnotation);
				if (result == null) result = caseBasicAnnotation(contextAnnotation);
				if (result == null) result = caseAnnotationBase(contextAnnotation);
				if (result == null) result = caseModelElement(contextAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONTEXT_BINDING: {
				ContextBinding contextBinding = (ContextBinding)theEObject;
				T result = caseContextBinding(contextBinding);
				if (result == null) result = caseModelElement(contextBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.CONTRIBUTOR: {
				Contributor contributor = (Contributor)theEObject;
				T result = caseContributor(contributor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE: {
				Datatype datatype = (Datatype)theEObject;
				T result = caseDatatype(datatype);
				if (result == null) result = caseClassifier(datatype);
				if (result == null) result = caseModelElement(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE_ANNOTATIONS: {
				DatatypeAnnotations datatypeAnnotations = (DatatypeAnnotations)theEObject;
				T result = caseDatatypeAnnotations(datatypeAnnotations);
				if (result == null) result = caseAnnotations(datatypeAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE_APP_INFO: {
				DatatypeAppInfo datatypeAppInfo = (DatatypeAppInfo)theEObject;
				T result = caseDatatypeAppInfo(datatypeAppInfo);
				if (result == null) result = caseAppInfo(datatypeAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE_BINDING: {
				DatatypeBinding datatypeBinding = (DatatypeBinding)theEObject;
				T result = caseDatatypeBinding(datatypeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE_DERIVATION: {
				DatatypeDerivation datatypeDerivation = (DatatypeDerivation)theEObject;
				T result = caseDatatypeDerivation(datatypeDerivation);
				if (result == null) result = caseDerivation(datatypeDerivation);
				if (result == null) result = caseDependency(datatypeDerivation);
				if (result == null) result = caseRelationship(datatypeDerivation);
				if (result == null) result = caseModelElement(datatypeDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE_DOCUMENTATION: {
				DatatypeDocumentation datatypeDocumentation = (DatatypeDocumentation)theEObject;
				T result = caseDatatypeDocumentation(datatypeDocumentation);
				if (result == null) result = caseDocumentation(datatypeDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE_IMPORT: {
				DatatypeImport datatypeImport = (DatatypeImport)theEObject;
				T result = caseDatatypeImport(datatypeImport);
				if (result == null) result = caseDatatypeRef(datatypeImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE_LIMITATION: {
				DatatypeLimitation datatypeLimitation = (DatatypeLimitation)theEObject;
				T result = caseDatatypeLimitation(datatypeLimitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE_MODEL_LIBRARY: {
				DatatypeModelLibrary datatypeModelLibrary = (DatatypeModelLibrary)theEObject;
				T result = caseDatatypeModelLibrary(datatypeModelLibrary);
				if (result == null) result = casePackage(datatypeModelLibrary);
				if (result == null) result = casePackageBase(datatypeModelLibrary);
				if (result == null) result = caseModelElement(datatypeModelLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE_OPERATION: {
				DatatypeOperation datatypeOperation = (DatatypeOperation)theEObject;
				T result = caseDatatypeOperation(datatypeOperation);
				if (result == null) result = caseFeature(datatypeOperation);
				if (result == null) result = caseModelElement(datatypeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE_PARAMETER: {
				DatatypeParameter datatypeParameter = (DatatypeParameter)theEObject;
				T result = caseDatatypeParameter(datatypeParameter);
				if (result == null) result = caseModelElement(datatypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE_REF: {
				DatatypeRef datatypeRef = (DatatypeRef)theEObject;
				T result = caseDatatypeRef(datatypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DATATYPE_TEMPLATE_PARAMETER: {
				DatatypeTemplateParameter datatypeTemplateParameter = (DatatypeTemplateParameter)theEObject;
				T result = caseDatatypeTemplateParameter(datatypeTemplateParameter);
				if (result == null) result = caseDatatypeRef(datatypeTemplateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = caseRelationship(dependency);
				if (result == null) result = caseModelElement(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DEPRECATION_INFO: {
				DeprecationInfo deprecationInfo = (DeprecationInfo)theEObject;
				T result = caseDeprecationInfo(deprecationInfo);
				if (result == null) result = caseContextAnnotation(deprecationInfo);
				if (result == null) result = caseCascadableAnnotation(deprecationInfo);
				if (result == null) result = caseBasicAnnotation(deprecationInfo);
				if (result == null) result = caseAnnotationBase(deprecationInfo);
				if (result == null) result = caseModelElement(deprecationInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DERIVATION: {
				Derivation derivation = (Derivation)theEObject;
				T result = caseDerivation(derivation);
				if (result == null) result = caseDependency(derivation);
				if (result == null) result = caseRelationship(derivation);
				if (result == null) result = caseModelElement(derivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DERIVED_STATIC_MODEL: {
				DerivedStaticModel derivedStaticModel = (DerivedStaticModel)theEObject;
				T result = caseDerivedStaticModel(derivedStaticModel);
				if (result == null) result = caseStaticModelBase(derivedStaticModel);
				if (result == null) result = caseSubSystem(derivedStaticModel);
				if (result == null) result = casePackage(derivedStaticModel);
				if (result == null) result = casePackageBase(derivedStaticModel);
				if (result == null) result = caseModelElement(derivedStaticModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DERIVED_STATIC_MODELS_TYPE: {
				DerivedStaticModelsType derivedStaticModelsType = (DerivedStaticModelsType)theEObject;
				T result = caseDerivedStaticModelsType(derivedStaticModelsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DESIGN_COMMENT: {
				DesignComment designComment = (DesignComment)theEObject;
				T result = caseDesignComment(designComment);
				if (result == null) result = caseCascadableAnnotation(designComment);
				if (result == null) result = caseBasicAnnotation(designComment);
				if (result == null) result = caseAnnotationBase(designComment);
				if (result == null) result = caseModelElement(designComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DIAGRAM: {
				Diagram diagram = (Diagram)theEObject;
				T result = caseDiagram(diagram);
				if (result == null) result = caseGraphNode(diagram);
				if (result == null) result = caseGraphElement(diagram);
				if (result == null) result = caseDiagramElement(diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DIAGRAM_ELEMENT: {
				DiagramElement diagramElement = (DiagramElement)theEObject;
				T result = caseDiagramElement(diagramElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DIAGRAM_GRAPHIC_INFORMATION: {
				DiagramGraphicInformation diagramGraphicInformation = (DiagramGraphicInformation)theEObject;
				T result = caseDiagramGraphicInformation(diagramGraphicInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				T result = caseDimension(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOCUMENT_PROFILE: {
				DocumentProfile documentProfile = (DocumentProfile)theEObject;
				T result = caseDocumentProfile(documentProfile);
				if (result == null) result = casePackage(documentProfile);
				if (result == null) result = casePackageBase(documentProfile);
				if (result == null) result = caseModelElement(documentProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS: {
				DocumentProfileAnnotations documentProfileAnnotations = (DocumentProfileAnnotations)theEObject;
				T result = caseDocumentProfileAnnotations(documentProfileAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOCUMENT_PROFILE_APP_INFO: {
				DocumentProfileAppInfo documentProfileAppInfo = (DocumentProfileAppInfo)theEObject;
				T result = caseDocumentProfileAppInfo(documentProfileAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOCUMENT_PROFILE_DOCUMENTATION: {
				DocumentProfileDocumentation documentProfileDocumentation = (DocumentProfileDocumentation)theEObject;
				T result = caseDocumentProfileDocumentation(documentProfileDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOCUMENT_TEST: {
				DocumentTest documentTest = (DocumentTest)theEObject;
				T result = caseDocumentTest(documentTest);
				if (result == null) result = caseTestBase(documentTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOMAIN_ANALYSIS_MODEL: {
				DomainAnalysisModel domainAnalysisModel = (DomainAnalysisModel)theEObject;
				T result = caseDomainAnalysisModel(domainAnalysisModel);
				if (result == null) result = casePackageArtifact(domainAnalysisModel);
				if (result == null) result = casePackageBase(domainAnalysisModel);
				if (result == null) result = caseModelElement(domainAnalysisModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_ANNOTATIONS: {
				DomainAnalysisModelAnnotations domainAnalysisModelAnnotations = (DomainAnalysisModelAnnotations)theEObject;
				T result = caseDomainAnalysisModelAnnotations(domainAnalysisModelAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_APP_INFO: {
				DomainAnalysisModelAppInfo domainAnalysisModelAppInfo = (DomainAnalysisModelAppInfo)theEObject;
				T result = caseDomainAnalysisModelAppInfo(domainAnalysisModelAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOMAIN_ANALYSIS_MODEL_DOCUMENTATION: {
				DomainAnalysisModelDocumentation domainAnalysisModelDocumentation = (DomainAnalysisModelDocumentation)theEObject;
				T result = caseDomainAnalysisModelDocumentation(domainAnalysisModelDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE: {
				DomainInstanceExample domainInstanceExample = (DomainInstanceExample)theEObject;
				T result = caseDomainInstanceExample(domainInstanceExample);
				if (result == null) result = casePackageArtifact(domainInstanceExample);
				if (result == null) result = casePackageBase(domainInstanceExample);
				if (result == null) result = caseModelElement(domainInstanceExample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_ANNOTATIONS: {
				DomainInstanceExampleAnnotations domainInstanceExampleAnnotations = (DomainInstanceExampleAnnotations)theEObject;
				T result = caseDomainInstanceExampleAnnotations(domainInstanceExampleAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_APP_INFO: {
				DomainInstanceExampleAppInfo domainInstanceExampleAppInfo = (DomainInstanceExampleAppInfo)theEObject;
				T result = caseDomainInstanceExampleAppInfo(domainInstanceExampleAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.DOMAIN_INSTANCE_EXAMPLE_DOCUMENTATION: {
				DomainInstanceExampleDocumentation domainInstanceExampleDocumentation = (DomainInstanceExampleDocumentation)theEObject;
				T result = caseDomainInstanceExampleDocumentation(domainInstanceExampleDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ELEMENT_CHANGE: {
				ElementChange elementChange = (ElementChange)theEObject;
				T result = caseElementChange(elementChange);
				if (result == null) result = caseElementRef(elementChange);
				if (result == null) result = caseChange(elementChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ELEMENT_DERIVATION: {
				ElementDerivation elementDerivation = (ElementDerivation)theEObject;
				T result = caseElementDerivation(elementDerivation);
				if (result == null) result = caseDerivation(elementDerivation);
				if (result == null) result = caseDependency(elementDerivation);
				if (result == null) result = caseRelationship(elementDerivation);
				if (result == null) result = caseModelElement(elementDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ELEMENT_REF: {
				ElementRef elementRef = (ElementRef)theEObject;
				T result = caseElementRef(elementRef);
				if (result == null) result = caseChange(elementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ELEMENT_VALUE_REF: {
				ElementValueRef elementValueRef = (ElementValueRef)theEObject;
				T result = caseElementValueRef(elementValueRef);
				if (result == null) result = caseElementRef(elementValueRef);
				if (result == null) result = caseChange(elementValueRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ENTRY_POINT: {
				EntryPoint entryPoint = (EntryPoint)theEObject;
				T result = caseEntryPoint(entryPoint);
				if (result == null) result = caseEntryPointBase(entryPoint);
				if (result == null) result = caseInterface(entryPoint);
				if (result == null) result = caseClassifier(entryPoint);
				if (result == null) result = caseModelElement(entryPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ENTRY_POINT_ANNOTATIONS: {
				EntryPointAnnotations entryPointAnnotations = (EntryPointAnnotations)theEObject;
				T result = caseEntryPointAnnotations(entryPointAnnotations);
				if (result == null) result = caseAnnotations(entryPointAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ENTRY_POINT_APP_INFO: {
				EntryPointAppInfo entryPointAppInfo = (EntryPointAppInfo)theEObject;
				T result = caseEntryPointAppInfo(entryPointAppInfo);
				if (result == null) result = caseAppInfo(entryPointAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ENTRY_POINT_BASE: {
				EntryPointBase entryPointBase = (EntryPointBase)theEObject;
				T result = caseEntryPointBase(entryPointBase);
				if (result == null) result = caseInterface(entryPointBase);
				if (result == null) result = caseClassifier(entryPointBase);
				if (result == null) result = caseModelElement(entryPointBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ENTRY_POINT_DOCUMENTATION: {
				EntryPointDocumentation entryPointDocumentation = (EntryPointDocumentation)theEObject;
				T result = caseEntryPointDocumentation(entryPointDocumentation);
				if (result == null) result = caseDocumentation(entryPointDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE: {
				EnvironmentalOccurrence environmentalOccurrence = (EnvironmentalOccurrence)theEObject;
				T result = caseEnvironmentalOccurrence(environmentalOccurrence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.EXAMPLE_INTERACTION: {
				ExampleInteraction exampleInteraction = (ExampleInteraction)theEObject;
				T result = caseExampleInteraction(exampleInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.EXAMPLE_SYSTEM: {
				ExampleSystem exampleSystem = (ExampleSystem)theEObject;
				T result = caseExampleSystem(exampleSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.EXAMPLE_TYPE: {
				ExampleType exampleType = (ExampleType)theEObject;
				T result = caseExampleType(exampleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseModelElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.FLAT_CLASS: {
				FlatClass flatClass = (FlatClass)theEObject;
				T result = caseFlatClass(flatClass);
				if (result == null) result = caseClassBase(flatClass);
				if (result == null) result = caseClassifierBase(flatClass);
				if (result == null) result = caseClassifier(flatClass);
				if (result == null) result = caseModelElement(flatClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.FORMAL_CONSTRAINT: {
				FormalConstraint formalConstraint = (FormalConstraint)theEObject;
				T result = caseFormalConstraint(formalConstraint);
				if (result == null) result = caseCascadableAnnotation(formalConstraint);
				if (result == null) result = caseBasicAnnotation(formalConstraint);
				if (result == null) result = caseAnnotationBase(formalConstraint);
				if (result == null) result = caseModelElement(formalConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.FORMAL_EXPRESSION: {
				FormalExpression formalExpression = (FormalExpression)theEObject;
				T result = caseFormalExpression(formalExpression);
				if (result == null) result = caseVariousMixedContent(formalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.FREE_FORM_MARKUP_WITH_LANGUAGE: {
				FreeFormMarkupWithLanguage freeFormMarkupWithLanguage = (FreeFormMarkupWithLanguage)theEObject;
				T result = caseFreeFormMarkupWithLanguage(freeFormMarkupWithLanguage);
				if (result == null) result = caseVariousMixedContent(freeFormMarkupWithLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.FREEHAND_DOCUMENT: {
				FreehandDocument freehandDocument = (FreehandDocument)theEObject;
				T result = caseFreehandDocument(freehandDocument);
				if (result == null) result = casePackage(freehandDocument);
				if (result == null) result = casePackageBase(freehandDocument);
				if (result == null) result = caseModelElement(freehandDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.FREEHAND_DOCUMENT_ANNOTATIONS: {
				FreehandDocumentAnnotations freehandDocumentAnnotations = (FreehandDocumentAnnotations)theEObject;
				T result = caseFreehandDocumentAnnotations(freehandDocumentAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.FREEHAND_DOCUMENT_APP_INFO: {
				FreehandDocumentAppInfo freehandDocumentAppInfo = (FreehandDocumentAppInfo)theEObject;
				T result = caseFreehandDocumentAppInfo(freehandDocumentAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.FREEHAND_DOCUMENT_DOCUMENTATION: {
				FreehandDocumentDocumentation freehandDocumentDocumentation = (FreehandDocumentDocumentation)theEObject;
				T result = caseFreehandDocumentDocumentation(freehandDocumentDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GENERALIZATION_ANNOTATIONS: {
				GeneralizationAnnotations generalizationAnnotations = (GeneralizationAnnotations)theEObject;
				T result = caseGeneralizationAnnotations(generalizationAnnotations);
				if (result == null) result = caseAnnotations(generalizationAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GENERALIZATION_APP_INFO: {
				GeneralizationAppInfo generalizationAppInfo = (GeneralizationAppInfo)theEObject;
				T result = caseGeneralizationAppInfo(generalizationAppInfo);
				if (result == null) result = caseAppInfo(generalizationAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GENERALIZATION_DOCUMENTATION: {
				GeneralizationDocumentation generalizationDocumentation = (GeneralizationDocumentation)theEObject;
				T result = caseGeneralizationDocumentation(generalizationDocumentation);
				if (result == null) result = caseDocumentation(generalizationDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GENERIC_PACKAGE: {
				GenericPackage genericPackage = (GenericPackage)theEObject;
				T result = caseGenericPackage(genericPackage);
				if (result == null) result = casePackage(genericPackage);
				if (result == null) result = casePackageBase(genericPackage);
				if (result == null) result = caseModelElement(genericPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_APPLICATION_ROLE: {
				GlobalApplicationRole globalApplicationRole = (GlobalApplicationRole)theEObject;
				T result = caseGlobalApplicationRole(globalApplicationRole);
				if (result == null) result = caseApplicationRole(globalApplicationRole);
				if (result == null) result = casePackageArtifact(globalApplicationRole);
				if (result == null) result = casePackageBase(globalApplicationRole);
				if (result == null) result = caseModelElement(globalApplicationRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_ARTIFACT_XREF_SUMMARY: {
				GlobalArtifactXRefSummary globalArtifactXRefSummary = (GlobalArtifactXRefSummary)theEObject;
				T result = caseGlobalArtifactXRefSummary(globalArtifactXRefSummary);
				if (result == null) result = caseArtifactXRefSummary(globalArtifactXRefSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_CODE_SYSTEM: {
				GlobalCodeSystem globalCodeSystem = (GlobalCodeSystem)theEObject;
				T result = caseGlobalCodeSystem(globalCodeSystem);
				if (result == null) result = caseCodeSystem(globalCodeSystem);
				if (result == null) result = caseCodeSystemBase(globalCodeSystem);
				if (result == null) result = casePackageBase(globalCodeSystem);
				if (result == null) result = caseModelElement(globalCodeSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_CODE_SYSTEM_SUPPLEMENT: {
				GlobalCodeSystemSupplement globalCodeSystemSupplement = (GlobalCodeSystemSupplement)theEObject;
				T result = caseGlobalCodeSystemSupplement(globalCodeSystemSupplement);
				if (result == null) result = caseCodeSystemSupplement(globalCodeSystemSupplement);
				if (result == null) result = caseCodeSystemBase(globalCodeSystemSupplement);
				if (result == null) result = casePackageBase(globalCodeSystemSupplement);
				if (result == null) result = caseModelElement(globalCodeSystemSupplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_CONFORMANCE_PROFILE: {
				GlobalConformanceProfile globalConformanceProfile = (GlobalConformanceProfile)theEObject;
				T result = caseGlobalConformanceProfile(globalConformanceProfile);
				if (result == null) result = caseConformanceProfile(globalConformanceProfile);
				if (result == null) result = casePackage(globalConformanceProfile);
				if (result == null) result = casePackageBase(globalConformanceProfile);
				if (result == null) result = caseModelElement(globalConformanceProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_DATATYPE_MODEL_LIBRARY: {
				GlobalDatatypeModelLibrary globalDatatypeModelLibrary = (GlobalDatatypeModelLibrary)theEObject;
				T result = caseGlobalDatatypeModelLibrary(globalDatatypeModelLibrary);
				if (result == null) result = caseDatatypeModelLibrary(globalDatatypeModelLibrary);
				if (result == null) result = casePackage(globalDatatypeModelLibrary);
				if (result == null) result = casePackageBase(globalDatatypeModelLibrary);
				if (result == null) result = caseModelElement(globalDatatypeModelLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_DERIVED_STATIC_MODEL: {
				GlobalDerivedStaticModel globalDerivedStaticModel = (GlobalDerivedStaticModel)theEObject;
				T result = caseGlobalDerivedStaticModel(globalDerivedStaticModel);
				if (result == null) result = caseDerivedStaticModel(globalDerivedStaticModel);
				if (result == null) result = caseStaticModelBase(globalDerivedStaticModel);
				if (result == null) result = caseSubSystem(globalDerivedStaticModel);
				if (result == null) result = casePackage(globalDerivedStaticModel);
				if (result == null) result = casePackageBase(globalDerivedStaticModel);
				if (result == null) result = caseModelElement(globalDerivedStaticModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_DOMAIN_ANALYSIS_MODEL: {
				GlobalDomainAnalysisModel globalDomainAnalysisModel = (GlobalDomainAnalysisModel)theEObject;
				T result = caseGlobalDomainAnalysisModel(globalDomainAnalysisModel);
				if (result == null) result = caseDomainAnalysisModel(globalDomainAnalysisModel);
				if (result == null) result = casePackageArtifact(globalDomainAnalysisModel);
				if (result == null) result = casePackageBase(globalDomainAnalysisModel);
				if (result == null) result = caseModelElement(globalDomainAnalysisModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_DOMAIN_INSTANCE_EXAMPLE: {
				GlobalDomainInstanceExample globalDomainInstanceExample = (GlobalDomainInstanceExample)theEObject;
				T result = caseGlobalDomainInstanceExample(globalDomainInstanceExample);
				if (result == null) result = caseDomainInstanceExample(globalDomainInstanceExample);
				if (result == null) result = casePackageArtifact(globalDomainInstanceExample);
				if (result == null) result = casePackageBase(globalDomainInstanceExample);
				if (result == null) result = caseModelElement(globalDomainInstanceExample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_FREEHAND_DOCUMENT: {
				GlobalFreehandDocument globalFreehandDocument = (GlobalFreehandDocument)theEObject;
				T result = caseGlobalFreehandDocument(globalFreehandDocument);
				if (result == null) result = caseFreehandDocument(globalFreehandDocument);
				if (result == null) result = casePackage(globalFreehandDocument);
				if (result == null) result = casePackageBase(globalFreehandDocument);
				if (result == null) result = caseModelElement(globalFreehandDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_GENERIC_PACKAGE: {
				GlobalGenericPackage globalGenericPackage = (GlobalGenericPackage)theEObject;
				T result = caseGlobalGenericPackage(globalGenericPackage);
				if (result == null) result = caseGenericPackage(globalGenericPackage);
				if (result == null) result = casePackage(globalGenericPackage);
				if (result == null) result = casePackageBase(globalGenericPackage);
				if (result == null) result = caseModelElement(globalGenericPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_GLOSSARY: {
				GlobalGlossary globalGlossary = (GlobalGlossary)theEObject;
				T result = caseGlobalGlossary(globalGlossary);
				if (result == null) result = caseGlossary(globalGlossary);
				if (result == null) result = casePackage(globalGlossary);
				if (result == null) result = casePackageBase(globalGlossary);
				if (result == null) result = caseModelElement(globalGlossary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_INTERACTION: {
				GlobalInteraction globalInteraction = (GlobalInteraction)theEObject;
				T result = caseGlobalInteraction(globalInteraction);
				if (result == null) result = caseInteraction(globalInteraction);
				if (result == null) result = casePackageArtifact(globalInteraction);
				if (result == null) result = casePackageBase(globalInteraction);
				if (result == null) result = caseModelElement(globalInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_INTERACTION_PROFILE: {
				GlobalInteractionProfile globalInteractionProfile = (GlobalInteractionProfile)theEObject;
				T result = caseGlobalInteractionProfile(globalInteractionProfile);
				if (result == null) result = caseInteractionProfile(globalInteractionProfile);
				if (result == null) result = casePackage(globalInteractionProfile);
				if (result == null) result = casePackageBase(globalInteractionProfile);
				if (result == null) result = caseModelElement(globalInteractionProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_MIF_CHANGES: {
				GlobalMifChanges globalMifChanges = (GlobalMifChanges)theEObject;
				T result = caseGlobalMifChanges(globalMifChanges);
				if (result == null) result = caseMifChanges(globalMifChanges);
				if (result == null) result = casePackageBase(globalMifChanges);
				if (result == null) result = caseModelElement(globalMifChanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_PUBLICATION_PACKAGE: {
				GlobalPublicationPackage globalPublicationPackage = (GlobalPublicationPackage)theEObject;
				T result = caseGlobalPublicationPackage(globalPublicationPackage);
				if (result == null) result = casePublicationPackage(globalPublicationPackage);
				if (result == null) result = casePackage(globalPublicationPackage);
				if (result == null) result = casePackageBase(globalPublicationPackage);
				if (result == null) result = caseModelElement(globalPublicationPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_SERIALIZED_STATIC_MODEL: {
				GlobalSerializedStaticModel globalSerializedStaticModel = (GlobalSerializedStaticModel)theEObject;
				T result = caseGlobalSerializedStaticModel(globalSerializedStaticModel);
				if (result == null) result = caseSerializedStaticModel(globalSerializedStaticModel);
				if (result == null) result = caseStaticModelBase(globalSerializedStaticModel);
				if (result == null) result = caseSubSystem(globalSerializedStaticModel);
				if (result == null) result = casePackage(globalSerializedStaticModel);
				if (result == null) result = casePackageBase(globalSerializedStaticModel);
				if (result == null) result = caseModelElement(globalSerializedStaticModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_STATIC_MODEL: {
				GlobalStaticModel globalStaticModel = (GlobalStaticModel)theEObject;
				T result = caseGlobalStaticModel(globalStaticModel);
				if (result == null) result = caseStaticModel(globalStaticModel);
				if (result == null) result = caseStaticModelBase(globalStaticModel);
				if (result == null) result = caseSubSystem(globalStaticModel);
				if (result == null) result = casePackage(globalStaticModel);
				if (result == null) result = casePackageBase(globalStaticModel);
				if (result == null) result = caseModelElement(globalStaticModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_STATIC_MODEL_INTERFACE_PACKAGE: {
				GlobalStaticModelInterfacePackage globalStaticModelInterfacePackage = (GlobalStaticModelInterfacePackage)theEObject;
				T result = caseGlobalStaticModelInterfacePackage(globalStaticModelInterfacePackage);
				if (result == null) result = caseStaticModelInterfacePackage(globalStaticModelInterfacePackage);
				if (result == null) result = casePackage(globalStaticModelInterfacePackage);
				if (result == null) result = casePackageBase(globalStaticModelInterfacePackage);
				if (result == null) result = caseModelElement(globalStaticModelInterfacePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_STORYBOARD: {
				GlobalStoryboard globalStoryboard = (GlobalStoryboard)theEObject;
				T result = caseGlobalStoryboard(globalStoryboard);
				if (result == null) result = caseStoryboard(globalStoryboard);
				if (result == null) result = casePackageArtifact(globalStoryboard);
				if (result == null) result = casePackageBase(globalStoryboard);
				if (result == null) result = caseModelElement(globalStoryboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_STRUCTURED_DOCUMENT: {
				GlobalStructuredDocument globalStructuredDocument = (GlobalStructuredDocument)theEObject;
				T result = caseGlobalStructuredDocument(globalStructuredDocument);
				if (result == null) result = caseStructuredDocument(globalStructuredDocument);
				if (result == null) result = casePackageArtifact(globalStructuredDocument);
				if (result == null) result = casePackageBase(globalStructuredDocument);
				if (result == null) result = caseModelElement(globalStructuredDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_TEST_SCENARIO: {
				GlobalTestScenario globalTestScenario = (GlobalTestScenario)theEObject;
				T result = caseGlobalTestScenario(globalTestScenario);
				if (result == null) result = caseTestScenario(globalTestScenario);
				if (result == null) result = casePackageArtifact(globalTestScenario);
				if (result == null) result = casePackageBase(globalTestScenario);
				if (result == null) result = caseModelElement(globalTestScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_TRIGGER_EVENT: {
				GlobalTriggerEvent globalTriggerEvent = (GlobalTriggerEvent)theEObject;
				T result = caseGlobalTriggerEvent(globalTriggerEvent);
				if (result == null) result = caseTriggerEvent(globalTriggerEvent);
				if (result == null) result = casePackageArtifact(globalTriggerEvent);
				if (result == null) result = casePackageBase(globalTriggerEvent);
				if (result == null) result = caseModelElement(globalTriggerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_VALUE_SET: {
				GlobalValueSet globalValueSet = (GlobalValueSet)theEObject;
				T result = caseGlobalValueSet(globalValueSet);
				if (result == null) result = caseValueSet(globalValueSet);
				if (result == null) result = caseModelElement(globalValueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOBAL_VOCABULARY_MODEL: {
				GlobalVocabularyModel globalVocabularyModel = (GlobalVocabularyModel)theEObject;
				T result = caseGlobalVocabularyModel(globalVocabularyModel);
				if (result == null) result = caseVocabularyModel(globalVocabularyModel);
				if (result == null) result = casePackage(globalVocabularyModel);
				if (result == null) result = casePackageBase(globalVocabularyModel);
				if (result == null) result = caseModelElement(globalVocabularyModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GLOSSARY: {
				Glossary glossary = (Glossary)theEObject;
				T result = caseGlossary(glossary);
				if (result == null) result = casePackage(glossary);
				if (result == null) result = casePackageBase(glossary);
				if (result == null) result = caseModelElement(glossary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GRAPH_CONNECTOR: {
				GraphConnector graphConnector = (GraphConnector)theEObject;
				T result = caseGraphConnector(graphConnector);
				if (result == null) result = caseDiagramElement(graphConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GRAPH_CONNECTOR_WITH_EDGE: {
				GraphConnectorWithEdge graphConnectorWithEdge = (GraphConnectorWithEdge)theEObject;
				T result = caseGraphConnectorWithEdge(graphConnectorWithEdge);
				if (result == null) result = caseGraphConnector(graphConnectorWithEdge);
				if (result == null) result = caseDiagramElement(graphConnectorWithEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GRAPH_EDGE: {
				GraphEdge graphEdge = (GraphEdge)theEObject;
				T result = caseGraphEdge(graphEdge);
				if (result == null) result = caseDiagramElement(graphEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GRAPH_EDGE_GRAPHIC_INFORMATION: {
				GraphEdgeGraphicInformation graphEdgeGraphicInformation = (GraphEdgeGraphicInformation)theEObject;
				T result = caseGraphEdgeGraphicInformation(graphEdgeGraphicInformation);
				if (result == null) result = caseGraphicInformation(graphEdgeGraphicInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GRAPH_EDGE_WITH_ANCHOR: {
				GraphEdgeWithAnchor graphEdgeWithAnchor = (GraphEdgeWithAnchor)theEObject;
				T result = caseGraphEdgeWithAnchor(graphEdgeWithAnchor);
				if (result == null) result = caseGraphEdge(graphEdgeWithAnchor);
				if (result == null) result = caseDiagramElement(graphEdgeWithAnchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GRAPH_ELEMENT: {
				GraphElement graphElement = (GraphElement)theEObject;
				T result = caseGraphElement(graphElement);
				if (result == null) result = caseDiagramElement(graphElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GRAPHIC_INFORMATION: {
				GraphicInformation graphicInformation = (GraphicInformation)theEObject;
				T result = caseGraphicInformation(graphicInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GRAPH_NODE: {
				GraphNode graphNode = (GraphNode)theEObject;
				T result = caseGraphNode(graphNode);
				if (result == null) result = caseGraphElement(graphNode);
				if (result == null) result = caseDiagramElement(graphNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GRAPH_NODE_WITH_OPTIONAL_CONNECTION: {
				GraphNodeWithOptionalConnection graphNodeWithOptionalConnection = (GraphNodeWithOptionalConnection)theEObject;
				T result = caseGraphNodeWithOptionalConnection(graphNodeWithOptionalConnection);
				if (result == null) result = caseContainedGraphNode(graphNodeWithOptionalConnection);
				if (result == null) result = caseGraphNode(graphNodeWithOptionalConnection);
				if (result == null) result = caseGraphElement(graphNodeWithOptionalConnection);
				if (result == null) result = caseDiagramElement(graphNodeWithOptionalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GROUP_CHANGE: {
				GroupChange groupChange = (GroupChange)theEObject;
				T result = caseGroupChange(groupChange);
				if (result == null) result = caseChange(groupChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.GROUP_VOTE: {
				GroupVote groupVote = (GroupVote)theEObject;
				T result = caseGroupVote(groupVote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.HISTORY_ITEM: {
				HistoryItem historyItem = (HistoryItem)theEObject;
				T result = caseHistoryItem(historyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS: {
				ImplementationConstraints implementationConstraints = (ImplementationConstraints)theEObject;
				T result = caseImplementationConstraints(implementationConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS: {
				ImplementationMessageConstraints implementationMessageConstraints = (ImplementationMessageConstraints)theEObject;
				T result = caseImplementationMessageConstraints(implementationMessageConstraints);
				if (result == null) result = caseImplementationConstraints(implementationMessageConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.IMPORT_DATATYPE_MODEL_LIBRARY: {
				ImportDatatypeModelLibrary importDatatypeModelLibrary = (ImportDatatypeModelLibrary)theEObject;
				T result = caseImportDatatypeModelLibrary(importDatatypeModelLibrary);
				if (result == null) result = caseArtifactDependency(importDatatypeModelLibrary);
				if (result == null) result = casePackageRef(importDatatypeModelLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.INCLUDE_RELATED_CODES: {
				IncludeRelatedCodes includeRelatedCodes = (IncludeRelatedCodes)theEObject;
				T result = caseIncludeRelatedCodes(includeRelatedCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = casePackageArtifact(interaction);
				if (result == null) result = casePackageBase(interaction);
				if (result == null) result = caseModelElement(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.INTERACTION_ANNOTATIONS: {
				InteractionAnnotations interactionAnnotations = (InteractionAnnotations)theEObject;
				T result = caseInteractionAnnotations(interactionAnnotations);
				if (result == null) result = caseAnnotations(interactionAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.INTERACTION_APP_INFO: {
				InteractionAppInfo interactionAppInfo = (InteractionAppInfo)theEObject;
				T result = caseInteractionAppInfo(interactionAppInfo);
				if (result == null) result = caseAppInfo(interactionAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.INTERACTION_DOCUMENTATION: {
				InteractionDocumentation interactionDocumentation = (InteractionDocumentation)theEObject;
				T result = caseInteractionDocumentation(interactionDocumentation);
				if (result == null) result = caseDocumentation(interactionDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.INTERACTION_PROFILE: {
				InteractionProfile interactionProfile = (InteractionProfile)theEObject;
				T result = caseInteractionProfile(interactionProfile);
				if (result == null) result = casePackage(interactionProfile);
				if (result == null) result = casePackageBase(interactionProfile);
				if (result == null) result = caseModelElement(interactionProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.INTERACTION_PROFILE_ANNOTATIONS: {
				InteractionProfileAnnotations interactionProfileAnnotations = (InteractionProfileAnnotations)theEObject;
				T result = caseInteractionProfileAnnotations(interactionProfileAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.INTERACTION_PROFILE_APP_INFO: {
				InteractionProfileAppInfo interactionProfileAppInfo = (InteractionProfileAppInfo)theEObject;
				T result = caseInteractionProfileAppInfo(interactionProfileAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.INTERACTION_PROFILE_DOCUMENTATION: {
				InteractionProfileDocumentation interactionProfileDocumentation = (InteractionProfileDocumentation)theEObject;
				T result = caseInteractionProfileDocumentation(interactionProfileDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.INTERACTION_TEST: {
				InteractionTest interactionTest = (InteractionTest)theEObject;
				T result = caseInteractionTest(interactionTest);
				if (result == null) result = caseTestBase(interactionTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseClassifier(interface_);
				if (result == null) result = caseModelElement(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.ITEM_FILTER: {
				ItemFilter itemFilter = (ItemFilter)theEObject;
				T result = caseItemFilter(itemFilter);
				if (result == null) result = casePackageOrArtifactRef(itemFilter);
				if (result == null) result = casePackageRef(itemFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.KEYED_NAME: {
				KeyedName keyedName = (KeyedName)theEObject;
				T result = caseKeyedName(keyedName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.LEGALESE: {
				Legalese legalese = (Legalese)theEObject;
				T result = caseLegalese(legalese);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.LOCAL_CLASS_REF: {
				LocalClassRef localClassRef = (LocalClassRef)theEObject;
				T result = caseLocalClassRef(localClassRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.LOCAL_CLASS_REFERENCE: {
				LocalClassReference localClassReference = (LocalClassReference)theEObject;
				T result = caseLocalClassReference(localClassReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = caseCascadableAnnotation(mapping);
				if (result == null) result = caseBasicAnnotation(mapping);
				if (result == null) result = caseAnnotationBase(mapping);
				if (result == null) result = caseModelElement(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.MIF_CHANGES: {
				MifChanges mifChanges = (MifChanges)theEObject;
				T result = caseMifChanges(mifChanges);
				if (result == null) result = casePackageBase(mifChanges);
				if (result == null) result = caseModelElement(mifChanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.MIF_CONTENT: {
				MifContent mifContent = (MifContent)theEObject;
				T result = caseMifContent(mifContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.NODE_GRAPHIC_INFORMATION: {
				NodeGraphicInformation nodeGraphicInformation = (NodeGraphicInformation)theEObject;
				T result = caseNodeGraphicInformation(nodeGraphicInformation);
				if (result == null) result = caseGraphicInformation(nodeGraphicInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.NODE_WITH_CONNECTION_GRAPHIC_INFORMATION: {
				NodeWithConnectionGraphicInformation nodeWithConnectionGraphicInformation = (NodeWithConnectionGraphicInformation)theEObject;
				T result = caseNodeWithConnectionGraphicInformation(nodeWithConnectionGraphicInformation);
				if (result == null) result = caseGraphicInformation(nodeWithConnectionGraphicInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.NON_COMPUTABLE_CONTENT_DEFINITION: {
				NonComputableContentDefinition nonComputableContentDefinition = (NonComputableContentDefinition)theEObject;
				T result = caseNonComputableContentDefinition(nonComputableContentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.NON_TRAVERSABLE_ASSOCIATION_END: {
				NonTraversableAssociationEnd nonTraversableAssociationEnd = (NonTraversableAssociationEnd)theEObject;
				T result = caseNonTraversableAssociationEnd(nonTraversableAssociationEnd);
				if (result == null) result = caseRelationship(nonTraversableAssociationEnd);
				if (result == null) result = caseModelElement(nonTraversableAssociationEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.OPEN_ISSUE: {
				OpenIssue openIssue = (OpenIssue)theEObject;
				T result = caseOpenIssue(openIssue);
				if (result == null) result = caseCascadableAnnotation(openIssue);
				if (result == null) result = caseBasicAnnotation(openIssue);
				if (result == null) result = caseAnnotationBase(openIssue);
				if (result == null) result = caseModelElement(openIssue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.OPERATION_ANNOTATIONS: {
				OperationAnnotations operationAnnotations = (OperationAnnotations)theEObject;
				T result = caseOperationAnnotations(operationAnnotations);
				if (result == null) result = caseAnnotations(operationAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.OPERATION_APP_INFO: {
				OperationAppInfo operationAppInfo = (OperationAppInfo)theEObject;
				T result = caseOperationAppInfo(operationAppInfo);
				if (result == null) result = caseAppInfo(operationAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.OPERATION_DERIVATION: {
				OperationDerivation operationDerivation = (OperationDerivation)theEObject;
				T result = caseOperationDerivation(operationDerivation);
				if (result == null) result = caseDerivation(operationDerivation);
				if (result == null) result = caseDependency(operationDerivation);
				if (result == null) result = caseRelationship(operationDerivation);
				if (result == null) result = caseModelElement(operationDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.OPERATION_DOCUMENTATION: {
				OperationDocumentation operationDocumentation = (OperationDocumentation)theEObject;
				T result = caseOperationDocumentation(operationDocumentation);
				if (result == null) result = caseDocumentation(operationDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.OPERATION_PARAMETER: {
				OperationParameter operationParameter = (OperationParameter)theEObject;
				T result = caseOperationParameter(operationParameter);
				if (result == null) result = caseModelElement(operationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.OTHER_ANNOTATION: {
				OtherAnnotation otherAnnotation = (OtherAnnotation)theEObject;
				T result = caseOtherAnnotation(otherAnnotation);
				if (result == null) result = caseAnnotationBase(otherAnnotation);
				if (result == null) result = caseModelElement(otherAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PACKAGE: {
				org.openhealthtools.mdht.emf.hl7.mif2.Package package_ = (org.openhealthtools.mdht.emf.hl7.mif2.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = casePackageBase(package_);
				if (result == null) result = caseModelElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PACKAGE_ANNOTATIONS: {
				PackageAnnotations packageAnnotations = (PackageAnnotations)theEObject;
				T result = casePackageAnnotations(packageAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PACKAGE_APP_INFO: {
				PackageAppInfo packageAppInfo = (PackageAppInfo)theEObject;
				T result = casePackageAppInfo(packageAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PACKAGE_ARTIFACT: {
				PackageArtifact packageArtifact = (PackageArtifact)theEObject;
				T result = casePackageArtifact(packageArtifact);
				if (result == null) result = casePackageBase(packageArtifact);
				if (result == null) result = caseModelElement(packageArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PACKAGE_BASE: {
				PackageBase packageBase = (PackageBase)theEObject;
				T result = casePackageBase(packageBase);
				if (result == null) result = caseModelElement(packageBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PACKAGE_CONTENT: {
				PackageContent packageContent = (PackageContent)theEObject;
				T result = casePackageContent(packageContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PACKAGE_DEF_ID: {
				PackageDefId packageDefId = (PackageDefId)theEObject;
				T result = casePackageDefId(packageDefId);
				if (result == null) result = casePackageRef(packageDefId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PACKAGE_DERIVATION: {
				PackageDerivation packageDerivation = (PackageDerivation)theEObject;
				T result = casePackageDerivation(packageDerivation);
				if (result == null) result = caseDerivation(packageDerivation);
				if (result == null) result = caseDependency(packageDerivation);
				if (result == null) result = caseRelationship(packageDerivation);
				if (result == null) result = caseModelElement(packageDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PACKAGE_DOCUMENTATION: {
				PackageDocumentation packageDocumentation = (PackageDocumentation)theEObject;
				T result = casePackageDocumentation(packageDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PACKAGE_OR_ARTIFACT_REF: {
				PackageOrArtifactRef packageOrArtifactRef = (PackageOrArtifactRef)theEObject;
				T result = casePackageOrArtifactRef(packageOrArtifactRef);
				if (result == null) result = casePackageRef(packageOrArtifactRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PACKAGE_REF: {
				PackageRef packageRef = (PackageRef)theEObject;
				T result = casePackageRef(packageRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PARAMETER_MODEL: {
				ParameterModel parameterModel = (ParameterModel)theEObject;
				T result = caseParameterModel(parameterModel);
				if (result == null) result = caseBoundStaticModel(parameterModel);
				if (result == null) result = casePackageRef(parameterModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PRINT_NAME: {
				PrintName printName = (PrintName)theEObject;
				T result = casePrintName(printName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PROPERTY_BASED_CONTENT_DEFINITION: {
				PropertyBasedContentDefinition propertyBasedContentDefinition = (PropertyBasedContentDefinition)theEObject;
				T result = casePropertyBasedContentDefinition(propertyBasedContentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PROPERTY_GROUP: {
				PropertyGroup propertyGroup = (PropertyGroup)theEObject;
				T result = casePropertyGroup(propertyGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PUBLICATION_ANNOTATIONS: {
				PublicationAnnotations publicationAnnotations = (PublicationAnnotations)theEObject;
				T result = casePublicationAnnotations(publicationAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PUBLICATION_APP_INFO: {
				PublicationAppInfo publicationAppInfo = (PublicationAppInfo)theEObject;
				T result = casePublicationAppInfo(publicationAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PUBLICATION_BASE: {
				PublicationBase publicationBase = (PublicationBase)theEObject;
				T result = casePublicationBase(publicationBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PUBLICATION_DOCUMENTATION: {
				PublicationDocumentation publicationDocumentation = (PublicationDocumentation)theEObject;
				T result = casePublicationDocumentation(publicationDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PUBLICATION_GROUP: {
				PublicationGroup publicationGroup = (PublicationGroup)theEObject;
				T result = casePublicationGroup(publicationGroup);
				if (result == null) result = casePublicationBase(publicationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PUBLICATION_ITEM: {
				PublicationItem publicationItem = (PublicationItem)theEObject;
				T result = casePublicationItem(publicationItem);
				if (result == null) result = casePublicationBase(publicationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.PUBLICATION_PACKAGE: {
				PublicationPackage publicationPackage = (PublicationPackage)theEObject;
				T result = casePublicationPackage(publicationPackage);
				if (result == null) result = casePackage(publicationPackage);
				if (result == null) result = casePackageBase(publicationPackage);
				if (result == null) result = caseModelElement(publicationPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.RANGE_DEFINITION: {
				RangeDefinition rangeDefinition = (RangeDefinition)theEObject;
				T result = caseRangeDefinition(rangeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.REALM_ELEMENT: {
				RealmElement realmElement = (RealmElement)theEObject;
				T result = caseRealmElement(realmElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.RECEIVER_RESPONSIBILITY: {
				ReceiverResponsibility receiverResponsibility = (ReceiverResponsibility)theEObject;
				T result = caseReceiverResponsibility(receiverResponsibility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.RELATED_APP_ROLE: {
				RelatedAppRole relatedAppRole = (RelatedAppRole)theEObject;
				T result = caseRelatedAppRole(relatedAppRole);
				if (result == null) result = casePackageRef(relatedAppRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseModelElement(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.RELATIONSHIP_BASED_CONTENT_DEFINITION: {
				RelationshipBasedContentDefinition relationshipBasedContentDefinition = (RelationshipBasedContentDefinition)theEObject;
				T result = caseRelationshipBasedContentDefinition(relationshipBasedContentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.RELEASE: {
				Release release = (Release)theEObject;
				T result = caseRelease(release);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.RELEASE_LIST: {
				ReleaseList releaseList = (ReleaseList)theEObject;
				T result = caseReleaseList(releaseList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.RENDERING_INFORMATION: {
				RenderingInformation renderingInformation = (RenderingInformation)theEObject;
				T result = caseRenderingInformation(renderingInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.REPLACE_ELEMENT_CONTENT: {
				ReplaceElementContent replaceElementContent = (ReplaceElementContent)theEObject;
				T result = caseReplaceElementContent(replaceElementContent);
				if (result == null) result = caseElementRef(replaceElementContent);
				if (result == null) result = caseChange(replaceElementContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.RESPONSIBLE_GROUP: {
				ResponsibleGroup responsibleGroup = (ResponsibleGroup)theEObject;
				T result = caseResponsibleGroup(responsibleGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SERIALIZED_ASSOCIATION_END: {
				SerializedAssociationEnd serializedAssociationEnd = (SerializedAssociationEnd)theEObject;
				T result = caseSerializedAssociationEnd(serializedAssociationEnd);
				if (result == null) result = caseAssociationBase(serializedAssociationEnd);
				if (result == null) result = caseRelationship(serializedAssociationEnd);
				if (result == null) result = caseModelElement(serializedAssociationEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SERIALIZED_ASSOCIATION_ENDS: {
				SerializedAssociationEnds serializedAssociationEnds = (SerializedAssociationEnds)theEObject;
				T result = caseSerializedAssociationEnds(serializedAssociationEnds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SERIALIZED_CLASS: {
				SerializedClass serializedClass = (SerializedClass)theEObject;
				T result = caseSerializedClass(serializedClass);
				if (result == null) result = caseClassBase(serializedClass);
				if (result == null) result = caseClassifierBase(serializedClass);
				if (result == null) result = caseClassifier(serializedClass);
				if (result == null) result = caseModelElement(serializedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SERIALIZED_CLASS_BINDING_ARGUMENT: {
				SerializedClassBindingArgument serializedClassBindingArgument = (SerializedClassBindingArgument)theEObject;
				T result = caseSerializedClassBindingArgument(serializedClassBindingArgument);
				if (result == null) result = caseClassBindingArgumentBase(serializedClassBindingArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SERIALIZED_CLASSES: {
				SerializedClasses serializedClasses = (SerializedClasses)theEObject;
				T result = caseSerializedClasses(serializedClasses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SERIALIZED_CLASS_GENERALIZATION: {
				SerializedClassGeneralization serializedClassGeneralization = (SerializedClassGeneralization)theEObject;
				T result = caseSerializedClassGeneralization(serializedClassGeneralization);
				if (result == null) result = caseClassGeneralizationBase(serializedClassGeneralization);
				if (result == null) result = caseRelationship(serializedClassGeneralization);
				if (result == null) result = caseModelElement(serializedClassGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SERIALIZED_COMMON_MODEL_ELEMENT_REF: {
				SerializedCommonModelElementRef serializedCommonModelElementRef = (SerializedCommonModelElementRef)theEObject;
				T result = caseSerializedCommonModelElementRef(serializedCommonModelElementRef);
				if (result == null) result = caseCommonModelElementRefBase(serializedCommonModelElementRef);
				if (result == null) result = caseClassifierBase(serializedCommonModelElementRef);
				if (result == null) result = caseClassifier(serializedCommonModelElementRef);
				if (result == null) result = caseModelElement(serializedCommonModelElementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SERIALIZED_ENTRY_POINT: {
				SerializedEntryPoint serializedEntryPoint = (SerializedEntryPoint)theEObject;
				T result = caseSerializedEntryPoint(serializedEntryPoint);
				if (result == null) result = caseEntryPointBase(serializedEntryPoint);
				if (result == null) result = caseInterface(serializedEntryPoint);
				if (result == null) result = caseClassifier(serializedEntryPoint);
				if (result == null) result = caseModelElement(serializedEntryPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SERIALIZED_STATIC_MODEL: {
				SerializedStaticModel serializedStaticModel = (SerializedStaticModel)theEObject;
				T result = caseSerializedStaticModel(serializedStaticModel);
				if (result == null) result = caseStaticModelBase(serializedStaticModel);
				if (result == null) result = caseSubSystem(serializedStaticModel);
				if (result == null) result = casePackage(serializedStaticModel);
				if (result == null) result = casePackageBase(serializedStaticModel);
				if (result == null) result = caseModelElement(serializedStaticModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SERIALIZED_STATIC_MODELS_TYPE: {
				SerializedStaticModelsType serializedStaticModelsType = (SerializedStaticModelsType)theEObject;
				T result = caseSerializedStaticModelsType(serializedStaticModelsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SPECIALIZATION_CLASS: {
				SpecializationClass specializationClass = (SpecializationClass)theEObject;
				T result = caseSpecializationClass(specializationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseVertex(state);
				if (result == null) result = caseModelElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATE_ANNOTATIONS: {
				StateAnnotations stateAnnotations = (StateAnnotations)theEObject;
				T result = caseStateAnnotations(stateAnnotations);
				if (result == null) result = caseAnnotations(stateAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATE_APP_INFO: {
				StateAppInfo stateAppInfo = (StateAppInfo)theEObject;
				T result = caseStateAppInfo(stateAppInfo);
				if (result == null) result = caseAppInfo(stateAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATE_DERIVATION: {
				StateDerivation stateDerivation = (StateDerivation)theEObject;
				T result = caseStateDerivation(stateDerivation);
				if (result == null) result = caseClassDerivation(stateDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATE_DOCUMENTATION: {
				StateDocumentation stateDocumentation = (StateDocumentation)theEObject;
				T result = caseStateDocumentation(stateDocumentation);
				if (result == null) result = caseDocumentation(stateDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATE_MACHINE: {
				StateMachine stateMachine = (StateMachine)theEObject;
				T result = caseStateMachine(stateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATE_MACHINE_ANNOTATIONS: {
				StateMachineAnnotations stateMachineAnnotations = (StateMachineAnnotations)theEObject;
				T result = caseStateMachineAnnotations(stateMachineAnnotations);
				if (result == null) result = caseAnnotations(stateMachineAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATE_MACHINE_APP_INFO: {
				StateMachineAppInfo stateMachineAppInfo = (StateMachineAppInfo)theEObject;
				T result = caseStateMachineAppInfo(stateMachineAppInfo);
				if (result == null) result = caseAppInfo(stateMachineAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATE_MACHINE_DOCUMENTATION: {
				StateMachineDocumentation stateMachineDocumentation = (StateMachineDocumentation)theEObject;
				T result = caseStateMachineDocumentation(stateMachineDocumentation);
				if (result == null) result = caseDocumentation(stateMachineDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_EXAMPLE: {
				StaticExample staticExample = (StaticExample)theEObject;
				T result = caseStaticExample(staticExample);
				if (result == null) result = caseAnnotationBase(staticExample);
				if (result == null) result = caseModelElement(staticExample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL: {
				StaticModel staticModel = (StaticModel)theEObject;
				T result = caseStaticModel(staticModel);
				if (result == null) result = caseStaticModelBase(staticModel);
				if (result == null) result = caseSubSystem(staticModel);
				if (result == null) result = casePackage(staticModel);
				if (result == null) result = casePackageBase(staticModel);
				if (result == null) result = caseModelElement(staticModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL_ANNOTATIONS: {
				StaticModelAnnotations staticModelAnnotations = (StaticModelAnnotations)theEObject;
				T result = caseStaticModelAnnotations(staticModelAnnotations);
				if (result == null) result = caseAnnotations(staticModelAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL_APP_INFO: {
				StaticModelAppInfo staticModelAppInfo = (StaticModelAppInfo)theEObject;
				T result = caseStaticModelAppInfo(staticModelAppInfo);
				if (result == null) result = caseAppInfo(staticModelAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL_BASE: {
				StaticModelBase staticModelBase = (StaticModelBase)theEObject;
				T result = caseStaticModelBase(staticModelBase);
				if (result == null) result = caseSubSystem(staticModelBase);
				if (result == null) result = casePackage(staticModelBase);
				if (result == null) result = casePackageBase(staticModelBase);
				if (result == null) result = caseModelElement(staticModelBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL_CLASS_TEMPLATE_PARAMETER: {
				StaticModelClassTemplateParameter staticModelClassTemplateParameter = (StaticModelClassTemplateParameter)theEObject;
				T result = caseStaticModelClassTemplateParameter(staticModelClassTemplateParameter);
				if (result == null) result = caseClassifierBase(staticModelClassTemplateParameter);
				if (result == null) result = caseClassifier(staticModelClassTemplateParameter);
				if (result == null) result = caseModelElement(staticModelClassTemplateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL_DERIVATION: {
				StaticModelDerivation staticModelDerivation = (StaticModelDerivation)theEObject;
				T result = caseStaticModelDerivation(staticModelDerivation);
				if (result == null) result = caseDerivation(staticModelDerivation);
				if (result == null) result = caseDependency(staticModelDerivation);
				if (result == null) result = caseRelationship(staticModelDerivation);
				if (result == null) result = caseModelElement(staticModelDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL_DERIVATION_SOURCE: {
				StaticModelDerivationSource staticModelDerivationSource = (StaticModelDerivationSource)theEObject;
				T result = caseStaticModelDerivationSource(staticModelDerivationSource);
				if (result == null) result = caseDerivation(staticModelDerivationSource);
				if (result == null) result = caseDependency(staticModelDerivationSource);
				if (result == null) result = caseRelationship(staticModelDerivationSource);
				if (result == null) result = caseModelElement(staticModelDerivationSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL_DOCUMENTATION: {
				StaticModelDocumentation staticModelDocumentation = (StaticModelDocumentation)theEObject;
				T result = caseStaticModelDocumentation(staticModelDocumentation);
				if (result == null) result = caseDocumentation(staticModelDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL_INTERFACE_ANNOTATIONS: {
				StaticModelInterfaceAnnotations staticModelInterfaceAnnotations = (StaticModelInterfaceAnnotations)theEObject;
				T result = caseStaticModelInterfaceAnnotations(staticModelInterfaceAnnotations);
				if (result == null) result = caseAnnotations(staticModelInterfaceAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL_INTERFACE_APP_INFO: {
				StaticModelInterfaceAppInfo staticModelInterfaceAppInfo = (StaticModelInterfaceAppInfo)theEObject;
				T result = caseStaticModelInterfaceAppInfo(staticModelInterfaceAppInfo);
				if (result == null) result = caseAppInfo(staticModelInterfaceAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL_INTERFACE_DOCUMENTATION: {
				StaticModelInterfaceDocumentation staticModelInterfaceDocumentation = (StaticModelInterfaceDocumentation)theEObject;
				T result = caseStaticModelInterfaceDocumentation(staticModelInterfaceDocumentation);
				if (result == null) result = caseDocumentation(staticModelInterfaceDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL_INTERFACE_PACKAGE: {
				StaticModelInterfacePackage staticModelInterfacePackage = (StaticModelInterfacePackage)theEObject;
				T result = caseStaticModelInterfacePackage(staticModelInterfacePackage);
				if (result == null) result = casePackage(staticModelInterfacePackage);
				if (result == null) result = casePackageBase(staticModelInterfacePackage);
				if (result == null) result = caseModelElement(staticModelInterfacePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODEL_REF_BASE: {
				StaticModelRefBase staticModelRefBase = (StaticModelRefBase)theEObject;
				T result = caseStaticModelRefBase(staticModelRefBase);
				if (result == null) result = caseClassifierBase(staticModelRefBase);
				if (result == null) result = caseClassifier(staticModelRefBase);
				if (result == null) result = caseModelElement(staticModelRefBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_MODELS_TYPE: {
				StaticModelsType staticModelsType = (StaticModelsType)theEObject;
				T result = caseStaticModelsType(staticModelsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STATIC_PACKAGE_DIAGRAM_GRAPHIC_INFORMATION: {
				StaticPackageDiagramGraphicInformation staticPackageDiagramGraphicInformation = (StaticPackageDiagramGraphicInformation)theEObject;
				T result = caseStaticPackageDiagramGraphicInformation(staticPackageDiagramGraphicInformation);
				if (result == null) result = caseDiagramGraphicInformation(staticPackageDiagramGraphicInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STORYBOARD: {
				Storyboard storyboard = (Storyboard)theEObject;
				T result = caseStoryboard(storyboard);
				if (result == null) result = casePackageArtifact(storyboard);
				if (result == null) result = casePackageBase(storyboard);
				if (result == null) result = caseModelElement(storyboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STORYBOARD_ANNOTATIONS: {
				StoryboardAnnotations storyboardAnnotations = (StoryboardAnnotations)theEObject;
				T result = caseStoryboardAnnotations(storyboardAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STORYBOARD_APP_INFO: {
				StoryboardAppInfo storyboardAppInfo = (StoryboardAppInfo)theEObject;
				T result = caseStoryboardAppInfo(storyboardAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STORYBOARD_ARTIFACT_REFERENCES: {
				StoryboardArtifactReferences storyboardArtifactReferences = (StoryboardArtifactReferences)theEObject;
				T result = caseStoryboardArtifactReferences(storyboardArtifactReferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STORYBOARD_DOCUMENTATION: {
				StoryboardDocumentation storyboardDocumentation = (StoryboardDocumentation)theEObject;
				T result = caseStoryboardDocumentation(storyboardDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STORYBOARD_NARRATIVE: {
				StoryboardNarrative storyboardNarrative = (StoryboardNarrative)theEObject;
				T result = caseStoryboardNarrative(storyboardNarrative);
				if (result == null) result = casePackageBase(storyboardNarrative);
				if (result == null) result = caseModelElement(storyboardNarrative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STRUCTURAL_FEATURE: {
				StructuralFeature structuralFeature = (StructuralFeature)theEObject;
				T result = caseStructuralFeature(structuralFeature);
				if (result == null) result = caseFeature(structuralFeature);
				if (result == null) result = caseModelElement(structuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STRUCTURED_DOCUMENT: {
				StructuredDocument structuredDocument = (StructuredDocument)theEObject;
				T result = caseStructuredDocument(structuredDocument);
				if (result == null) result = casePackageArtifact(structuredDocument);
				if (result == null) result = casePackageBase(structuredDocument);
				if (result == null) result = caseModelElement(structuredDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STRUCTURED_DOCUMENT_ANNOTATIONS: {
				StructuredDocumentAnnotations structuredDocumentAnnotations = (StructuredDocumentAnnotations)theEObject;
				T result = caseStructuredDocumentAnnotations(structuredDocumentAnnotations);
				if (result == null) result = caseAnnotations(structuredDocumentAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STRUCTURED_DOCUMENT_APP_INFO: {
				StructuredDocumentAppInfo structuredDocumentAppInfo = (StructuredDocumentAppInfo)theEObject;
				T result = caseStructuredDocumentAppInfo(structuredDocumentAppInfo);
				if (result == null) result = caseAppInfo(structuredDocumentAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STRUCTURED_DOCUMENT_DOCUMENTATION: {
				StructuredDocumentDocumentation structuredDocumentDocumentation = (StructuredDocumentDocumentation)theEObject;
				T result = caseStructuredDocumentDocumentation(structuredDocumentDocumentation);
				if (result == null) result = caseDocumentation(structuredDocumentDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.STUB_DEFINITION: {
				StubDefinition stubDefinition = (StubDefinition)theEObject;
				T result = caseStubDefinition(stubDefinition);
				if (result == null) result = caseClassifierBase(stubDefinition);
				if (result == null) result = caseClassifier(stubDefinition);
				if (result == null) result = caseModelElement(stubDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SUBJECT_AREA_ANNOTATIONS: {
				SubjectAreaAnnotations subjectAreaAnnotations = (SubjectAreaAnnotations)theEObject;
				T result = caseSubjectAreaAnnotations(subjectAreaAnnotations);
				if (result == null) result = caseAnnotations(subjectAreaAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SUBJECT_AREA_APP_INFO: {
				SubjectAreaAppInfo subjectAreaAppInfo = (SubjectAreaAppInfo)theEObject;
				T result = caseSubjectAreaAppInfo(subjectAreaAppInfo);
				if (result == null) result = caseAppInfo(subjectAreaAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SUBJECT_AREA_DOCUMENTATION: {
				SubjectAreaDocumentation subjectAreaDocumentation = (SubjectAreaDocumentation)theEObject;
				T result = caseSubjectAreaDocumentation(subjectAreaDocumentation);
				if (result == null) result = caseDocumentation(subjectAreaDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SUBJECT_AREA_PACKAGE: {
				SubjectAreaPackage subjectAreaPackage = (SubjectAreaPackage)theEObject;
				T result = caseSubjectAreaPackage(subjectAreaPackage);
				if (result == null) result = casePackageBase(subjectAreaPackage);
				if (result == null) result = caseModelElement(subjectAreaPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SUB_SYSTEM: {
				SubSystem subSystem = (SubSystem)theEObject;
				T result = caseSubSystem(subSystem);
				if (result == null) result = casePackage(subSystem);
				if (result == null) result = casePackageBase(subSystem);
				if (result == null) result = caseModelElement(subSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SUPPORTED_CONCEPT_PROPERTY: {
				SupportedConceptProperty supportedConceptProperty = (SupportedConceptProperty)theEObject;
				T result = caseSupportedConceptProperty(supportedConceptProperty);
				if (result == null) result = caseSupportedProperty(supportedConceptProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SUPPORTED_CONCEPT_RELATIONSHIP: {
				SupportedConceptRelationship supportedConceptRelationship = (SupportedConceptRelationship)theEObject;
				T result = caseSupportedConceptRelationship(supportedConceptRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.SUPPORTED_PROPERTY: {
				SupportedProperty supportedProperty = (SupportedProperty)theEObject;
				T result = caseSupportedProperty(supportedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TERM_DEFINITION: {
				TermDefinition termDefinition = (TermDefinition)theEObject;
				T result = caseTermDefinition(termDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TERMINOLOGY_SERVER: {
				TerminologyServer terminologyServer = (TerminologyServer)theEObject;
				T result = caseTerminologyServer(terminologyServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TEST: {
				Test test = (Test)theEObject;
				T result = caseTest(test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TEST_BASE: {
				TestBase testBase = (TestBase)theEObject;
				T result = caseTestBase(testBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TEST_SCENARIO: {
				TestScenario testScenario = (TestScenario)theEObject;
				T result = caseTestScenario(testScenario);
				if (result == null) result = casePackageArtifact(testScenario);
				if (result == null) result = casePackageBase(testScenario);
				if (result == null) result = caseModelElement(testScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TEST_SYSTEM: {
				TestSystem testSystem = (TestSystem)theEObject;
				T result = caseTestSystem(testSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseModelElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TRANSITION_ANNOTATIONS: {
				TransitionAnnotations transitionAnnotations = (TransitionAnnotations)theEObject;
				T result = caseTransitionAnnotations(transitionAnnotations);
				if (result == null) result = caseAnnotations(transitionAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TRANSITION_APP_INFO: {
				TransitionAppInfo transitionAppInfo = (TransitionAppInfo)theEObject;
				T result = caseTransitionAppInfo(transitionAppInfo);
				if (result == null) result = caseAppInfo(transitionAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TRANSITION_DERIVATION: {
				TransitionDerivation transitionDerivation = (TransitionDerivation)theEObject;
				T result = caseTransitionDerivation(transitionDerivation);
				if (result == null) result = caseClassDerivation(transitionDerivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TRANSITION_DOCUMENTATION: {
				TransitionDocumentation transitionDocumentation = (TransitionDocumentation)theEObject;
				T result = caseTransitionDocumentation(transitionDocumentation);
				if (result == null) result = caseDocumentation(transitionDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TRANSITION_REF: {
				TransitionRef transitionRef = (TransitionRef)theEObject;
				T result = caseTransitionRef(transitionRef);
				if (result == null) result = caseClassRef(transitionRef);
				if (result == null) result = casePackageRef(transitionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TRIGGER_EVENT: {
				TriggerEvent triggerEvent = (TriggerEvent)theEObject;
				T result = caseTriggerEvent(triggerEvent);
				if (result == null) result = casePackageArtifact(triggerEvent);
				if (result == null) result = casePackageBase(triggerEvent);
				if (result == null) result = caseModelElement(triggerEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TRIGGER_EVENT_ANNOTATIONS: {
				TriggerEventAnnotations triggerEventAnnotations = (TriggerEventAnnotations)theEObject;
				T result = caseTriggerEventAnnotations(triggerEventAnnotations);
				if (result == null) result = caseAnnotations(triggerEventAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TRIGGER_EVENT_APP_INFO: {
				TriggerEventAppInfo triggerEventAppInfo = (TriggerEventAppInfo)theEObject;
				T result = caseTriggerEventAppInfo(triggerEventAppInfo);
				if (result == null) result = caseAppInfo(triggerEventAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.TRIGGER_EVENT_DOCUMENTATION: {
				TriggerEventDocumentation triggerEventDocumentation = (TriggerEventDocumentation)theEObject;
				T result = caseTriggerEventDocumentation(triggerEventDocumentation);
				if (result == null) result = caseDocumentation(triggerEventDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VALUE_SET: {
				ValueSet valueSet = (ValueSet)theEObject;
				T result = caseValueSet(valueSet);
				if (result == null) result = caseModelElement(valueSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VALUE_SET_ANNOTATIONS: {
				ValueSetAnnotations valueSetAnnotations = (ValueSetAnnotations)theEObject;
				T result = caseValueSetAnnotations(valueSetAnnotations);
				if (result == null) result = caseAnnotations(valueSetAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VALUE_SET_APP_INFO: {
				ValueSetAppInfo valueSetAppInfo = (ValueSetAppInfo)theEObject;
				T result = caseValueSetAppInfo(valueSetAppInfo);
				if (result == null) result = caseAppInfo(valueSetAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VALUE_SET_DOCUMENTATION: {
				ValueSetDocumentation valueSetDocumentation = (ValueSetDocumentation)theEObject;
				T result = caseValueSetDocumentation(valueSetDocumentation);
				if (result == null) result = caseDocumentation(valueSetDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VALUE_SET_SUPPLEMENT: {
				ValueSetSupplement valueSetSupplement = (ValueSetSupplement)theEObject;
				T result = caseValueSetSupplement(valueSetSupplement);
				if (result == null) result = caseVocabularyValueSetRef(valueSetSupplement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VALUE_SET_VERSION: {
				ValueSetVersion valueSetVersion = (ValueSetVersion)theEObject;
				T result = caseValueSetVersion(valueSetVersion);
				if (result == null) result = caseModelElement(valueSetVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VARIOUS_MIXED_CONTENT: {
				VariousMixedContent variousMixedContent = (VariousMixedContent)theEObject;
				T result = caseVariousMixedContent(variousMixedContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VERTEX: {
				Vertex vertex = (Vertex)theEObject;
				T result = caseVertex(vertex);
				if (result == null) result = caseModelElement(vertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VOCABULARY_CODE_REF: {
				VocabularyCodeRef vocabularyCodeRef = (VocabularyCodeRef)theEObject;
				T result = caseVocabularyCodeRef(vocabularyCodeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VOCABULARY_CODE_REFS: {
				VocabularyCodeRefs vocabularyCodeRefs = (VocabularyCodeRefs)theEObject;
				T result = caseVocabularyCodeRefs(vocabularyCodeRefs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VOCABULARY_LIMITATION: {
				VocabularyLimitation vocabularyLimitation = (VocabularyLimitation)theEObject;
				T result = caseVocabularyLimitation(vocabularyLimitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VOCABULARY_MODEL: {
				VocabularyModel vocabularyModel = (VocabularyModel)theEObject;
				T result = caseVocabularyModel(vocabularyModel);
				if (result == null) result = casePackage(vocabularyModel);
				if (result == null) result = casePackageBase(vocabularyModel);
				if (result == null) result = caseModelElement(vocabularyModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VOCABULARY_MODEL_ANNOTATIONS: {
				VocabularyModelAnnotations vocabularyModelAnnotations = (VocabularyModelAnnotations)theEObject;
				T result = caseVocabularyModelAnnotations(vocabularyModelAnnotations);
				if (result == null) result = caseAnnotations(vocabularyModelAnnotations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VOCABULARY_MODEL_APP_INFO: {
				VocabularyModelAppInfo vocabularyModelAppInfo = (VocabularyModelAppInfo)theEObject;
				T result = caseVocabularyModelAppInfo(vocabularyModelAppInfo);
				if (result == null) result = caseAppInfo(vocabularyModelAppInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VOCABULARY_MODEL_DOCUMENTATION: {
				VocabularyModelDocumentation vocabularyModelDocumentation = (VocabularyModelDocumentation)theEObject;
				T result = caseVocabularyModelDocumentation(vocabularyModelDocumentation);
				if (result == null) result = caseDocumentation(vocabularyModelDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VOCABULARY_SPECIFICATION: {
				VocabularySpecification vocabularySpecification = (VocabularySpecification)theEObject;
				T result = caseVocabularySpecification(vocabularySpecification);
				if (result == null) result = caseDependency(vocabularySpecification);
				if (result == null) result = caseRelationship(vocabularySpecification);
				if (result == null) result = caseModelElement(vocabularySpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VOCABULARY_VALUE_SET_BINDING: {
				VocabularyValueSetBinding vocabularyValueSetBinding = (VocabularyValueSetBinding)theEObject;
				T result = caseVocabularyValueSetBinding(vocabularyValueSetBinding);
				if (result == null) result = caseVocabularyValueSetRef(vocabularyValueSetBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.VOCABULARY_VALUE_SET_REF: {
				VocabularyValueSetRef vocabularyValueSetRef = (VocabularyValueSetRef)theEObject;
				T result = caseVocabularyValueSetRef(vocabularyValueSetRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Mif2Package.XMI_CONTENT: {
				XMIContent xmiContent = (XMIContent)theEObject;
				T result = caseXMIContent(xmiContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Element Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Element Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddElementContent(AddElementContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationBase(AnnotationBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Cascade Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Cascade Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationCascadeInfo(AnnotationCascadeInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationDerivation(AnnotationDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotations(Annotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appendix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appendix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppendix(Appendix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppInfo(AppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationRole(ApplicationRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Role Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Role Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationRoleAnnotations(ApplicationRoleAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Role App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Role App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationRoleAppInfo(ApplicationRoleAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Role Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Role Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationRoleDocumentation(ApplicationRoleDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Applied Template Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Applied Template Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppliedTemplateGroup(AppliedTemplateGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Approval Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Approval Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApprovalInfo(ApprovalInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Cross Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Cross Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactCrossReference(ArtifactCrossReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactDependency(ArtifactDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Supplement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactSupplement(ArtifactSupplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Supplement Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Supplement Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactSupplementAnnotations(ArtifactSupplementAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Supplement App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Supplement App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactSupplementAppInfo(ArtifactSupplementAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Supplement Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Supplement Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactSupplementDocumentation(ArtifactSupplementDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact XRef Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact XRef Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactXRefSummary(ArtifactXRefSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationAnnotations(AssociationAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationAppInfo(AssociationAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationBase(AssociationBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationDocumentation(AssociationDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationEnd(AssociationEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association End Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationEndAnnotations(AssociationEndAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association End App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationEndAppInfo(AssociationEndAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association End Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationEndBase(AssociationEndBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association End Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationEndDerivation(AssociationEndDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association End Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationEndDocumentation(AssociationEndDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association End Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End Specialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationEndSpecialization(AssociationEndSpecialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association End With Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End With Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationEndWithClass(AssociationEndWithClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association End With Class Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End With Class Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationEndWithClassRef(AssociationEndWithClassRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeAnnotations(AttributeAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeAppInfo(AttributeAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeContent(AttributeContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDerivation(AttributeDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDocumentation(AttributeDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeProperty(AttributeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRef(AttributeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueRef(AttributeValueRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ballot Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ballot Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBallotComment(BallotComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ballot Comment Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ballot Comment Resolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBallotCommentResolution(BallotCommentResolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ballot Submission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ballot Submission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBallotSubmission(BallotSubmission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicAnnotation(BasicAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Realm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Realm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingRealm(BindingRealm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound Static Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound Static Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundStaticModel(BoundStaticModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessName(BusinessName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cascadable Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cascadable Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCascadableAnnotation(CascadableAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChange(Change object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeRequest(ChangeRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Request Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Request Estimate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeRequestEstimate(ChangeRequestEstimate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAnnotations(ClassAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassAppInfo(ClassAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassBase(ClassBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Binding Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Binding Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassBindingArgument(ClassBindingArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Binding Argument Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Binding Argument Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassBindingArgumentBase(ClassBindingArgumentBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDerivation(ClassDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDocumentation(ClassDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassElement(ClassElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassGeneralization(ClassGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Generalization Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Generalization Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassGeneralizationBase(ClassGeneralizationBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Graphic Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Graphic Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassGraphicInformation(ClassGraphicInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierBase(ClassifierBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Or Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Or Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassOrReference(ClassOrReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassRef(ClassRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Stub Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Stub Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassStubInterface(ClassStubInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Stub Interface Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Stub Interface Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassStubInterfaceAnnotations(ClassStubInterfaceAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Stub Interface App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Stub Interface App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassStubInterfaceAppInfo(ClassStubInterfaceAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Stub Interface Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Stub Interface Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassStubInterfaceDocumentation(ClassStubInterfaceDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Based Content Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Based Content Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBasedContentDefinition(CodeBasedContentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Filter Content Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Filter Content Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeFilterContentDefinition(CodeFilterContentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Icon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Icon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeIcon(CodeIcon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Supplement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSupplement(CodeSupplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystem(CodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemAnnotations(CodeSystemAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemAppInfo(CodeSystemAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemBase(CodeSystemBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemDocumentation(CodeSystemDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemRef(CodeSystemRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Supplement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemSupplement(CodeSystemSupplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersion(CodeSystemVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Version Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Version Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionAnnotations(CodeSystemVersionAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Version App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Version App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionAppInfo(CodeSystemVersionAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Version Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Version Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionBase(CodeSystemVersionBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Version Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Version Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionDocumentation(CodeSystemVersionDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code System Version Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code System Version Supplement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSystemVersionSupplement(CodeSystemVersionSupplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeTranslation(CodeTranslation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Translation Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Translation Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeTranslationAnnotations(CodeTranslationAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Translation App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Translation App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeTranslationAppInfo(CodeTranslationAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Translation Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Translation Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeTranslationCollection(CodeTranslationCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Translation Collection Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Translation Collection Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeTranslationCollectionAnnotations(CodeTranslationCollectionAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Translation Collection App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Translation Collection App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeTranslationCollectionAppInfo(CodeTranslationCollectionAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Translation Collection Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Translation Collection Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeTranslationCollectionDocumentation(CodeTranslationCollectionDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Translation Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Translation Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeTranslationDocumentation(CodeTranslationDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Content Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Content Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedContentDefinition(CombinedContentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Committee Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Committee Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommitteeReference(CommitteeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Model Element Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Model Element Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonModelElementDefinition(CommonModelElementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Model Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Model Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonModelElementRef(CommonModelElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Model Element Ref Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Model Element Ref Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonModelElementRefAnnotations(CommonModelElementRefAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Model Element Ref App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Model Element Ref App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonModelElementRefAppInfo(CommonModelElementRefAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Model Element Ref Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Model Element Ref Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonModelElementRefBase(CommonModelElementRefBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Model Element Ref Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Model Element Ref Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonModelElementRefDocumentation(CommonModelElementRefDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Markup With Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Markup With Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexMarkupWithLanguage(ComplexMarkupWithLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcept(Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptAnnotations(ConceptAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptAppInfo(ConceptAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptBase(ConceptBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDocumentation(ConceptDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDomain(ConceptDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Domain Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Domain Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDomainAnnotations(ConceptDomainAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Domain App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Domain App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDomainAppInfo(ConceptDomainAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Domain Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Domain Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDomainDocumentation(ConceptDomainDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Domain Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Domain Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDomainProperty(ConceptDomainProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Domain Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Domain Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptDomainRef(ConceptDomainRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptProperty(ConceptProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Property Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Property Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptPropertyRef(ConceptPropertyRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptRef(ConceptRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptRelationship(ConceptRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Supplement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptSupplement(ConceptSupplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Supplement Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Supplement Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptSupplementAnnotations(ConceptSupplementAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Supplement App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Supplement App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptSupplementAppInfo(ConceptSupplementAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Supplement Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Supplement Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptSupplementDocumentation(ConceptSupplementDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptUse(ConceptUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceProfile(ConformanceProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Profile Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Profile Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceProfileAnnotations(ConformanceProfileAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Profile App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Profile App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceProfileAppInfo(ConformanceProfileAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Profile Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Profile Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceProfileDocumentation(ConformanceProfileDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Trigger Events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Trigger Events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceTriggerEvents(ConformanceTriggerEvents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contained Graph Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contained Graph Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainedGraphNode(ContainedGraphNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentDefinition(ContentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Definition Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Definition Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentDefinitionAnnotations(ContentDefinitionAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Definition App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Definition App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentDefinitionAppInfo(ContentDefinitionAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Definition Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Definition Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentDefinitionDocumentation(ContentDefinitionDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextAnnotation(ContextAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextBinding(ContextBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contributor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contributor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributor(Contributor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeAnnotations(DatatypeAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeAppInfo(DatatypeAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeBinding(DatatypeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDerivation(DatatypeDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDocumentation(DatatypeDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeImport(DatatypeImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Limitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Limitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeLimitation(DatatypeLimitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Model Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Model Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeModelLibrary(DatatypeModelLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeOperation(DatatypeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeParameter(DatatypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeRef(DatatypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeTemplateParameter(DatatypeTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deprecation Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deprecation Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeprecationInfo(DeprecationInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivation(Derivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Static Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Static Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedStaticModel(DerivedStaticModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Static Models Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Static Models Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedStaticModelsType(DerivedStaticModelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignComment(DesignComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Graphic Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Graphic Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramGraphicInformation(DiagramGraphicInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentation(Documentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentProfile(DocumentProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Profile Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Profile Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentProfileAnnotations(DocumentProfileAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Profile App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Profile App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentProfileAppInfo(DocumentProfileAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Profile Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Profile Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentProfileDocumentation(DocumentProfileDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentTest(DocumentTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Analysis Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Analysis Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAnalysisModel(DomainAnalysisModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Analysis Model Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Analysis Model Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAnalysisModelAnnotations(DomainAnalysisModelAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Analysis Model App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Analysis Model App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAnalysisModelAppInfo(DomainAnalysisModelAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Analysis Model Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Analysis Model Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAnalysisModelDocumentation(DomainAnalysisModelDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Instance Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Instance Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainInstanceExample(DomainInstanceExample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Instance Example Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Instance Example Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainInstanceExampleAnnotations(DomainInstanceExampleAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Instance Example App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Instance Example App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainInstanceExampleAppInfo(DomainInstanceExampleAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Instance Example Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Instance Example Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainInstanceExampleDocumentation(DomainInstanceExampleDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementChange(ElementChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementDerivation(ElementDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementRef(ElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Value Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementValueRef(ElementValueRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPoint(EntryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPointAnnotations(EntryPointAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPointAppInfo(EntryPointAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPointBase(EntryPointBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Point Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Point Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryPointDocumentation(EntryPointDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environmental Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environmental Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentalOccurrence(EnvironmentalOccurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleInteraction(ExampleInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleSystem(ExampleSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleType(ExampleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flat Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flat Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlatClass(FlatClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalConstraint(FormalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalExpression(FormalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Form Markup With Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Form Markup With Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeFormMarkupWithLanguage(FreeFormMarkupWithLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Freehand Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Freehand Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreehandDocument(FreehandDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Freehand Document Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Freehand Document Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreehandDocumentAnnotations(FreehandDocumentAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Freehand Document App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Freehand Document App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreehandDocumentAppInfo(FreehandDocumentAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Freehand Document Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Freehand Document Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreehandDocumentDocumentation(FreehandDocumentDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationAnnotations(GeneralizationAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationAppInfo(GeneralizationAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationDocumentation(GeneralizationDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericPackage(GenericPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Application Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Application Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalApplicationRole(GlobalApplicationRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Artifact XRef Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Artifact XRef Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalArtifactXRefSummary(GlobalArtifactXRefSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Code System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Code System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalCodeSystem(GlobalCodeSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Code System Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Code System Supplement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalCodeSystemSupplement(GlobalCodeSystemSupplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Conformance Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Conformance Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalConformanceProfile(GlobalConformanceProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Datatype Model Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Datatype Model Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalDatatypeModelLibrary(GlobalDatatypeModelLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Derived Static Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Derived Static Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalDerivedStaticModel(GlobalDerivedStaticModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Domain Analysis Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Domain Analysis Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalDomainAnalysisModel(GlobalDomainAnalysisModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Domain Instance Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Domain Instance Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalDomainInstanceExample(GlobalDomainInstanceExample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Freehand Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Freehand Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalFreehandDocument(GlobalFreehandDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Generic Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Generic Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalGenericPackage(GlobalGenericPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Glossary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Glossary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalGlossary(GlobalGlossary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalInteraction(GlobalInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Interaction Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Interaction Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalInteractionProfile(GlobalInteractionProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Mif Changes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Mif Changes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalMifChanges(GlobalMifChanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Publication Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Publication Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalPublicationPackage(GlobalPublicationPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Serialized Static Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Serialized Static Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalSerializedStaticModel(GlobalSerializedStaticModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Static Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Static Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalStaticModel(GlobalStaticModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Static Model Interface Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Static Model Interface Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalStaticModelInterfacePackage(GlobalStaticModelInterfacePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Storyboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Storyboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalStoryboard(GlobalStoryboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Structured Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Structured Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalStructuredDocument(GlobalStructuredDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Test Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Test Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalTestScenario(GlobalTestScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Trigger Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Trigger Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalTriggerEvent(GlobalTriggerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalValueSet(GlobalValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Vocabulary Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Vocabulary Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVocabularyModel(GlobalVocabularyModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossary(Glossary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphConnector(GraphConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Connector With Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Connector With Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphConnectorWithEdge(GraphConnectorWithEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphEdge(GraphEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Edge Graphic Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Edge Graphic Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphEdgeGraphicInformation(GraphEdgeGraphicInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Edge With Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Edge With Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphEdgeWithAnchor(GraphEdgeWithAnchor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphElement(GraphElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicInformation(GraphicInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphNode(GraphNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Node With Optional Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Node With Optional Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphNodeWithOptionalConnection(GraphNodeWithOptionalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupChange(GroupChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Vote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Vote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupVote(GroupVote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryItem(HistoryItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationConstraints(ImplementationConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Message Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Message Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationMessageConstraints(ImplementationMessageConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Datatype Model Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Datatype Model Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportDatatypeModelLibrary(ImportDatatypeModelLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Related Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Related Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeRelatedCodes(IncludeRelatedCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionAnnotations(InteractionAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionAppInfo(InteractionAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionDocumentation(InteractionDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionProfile(InteractionProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Profile Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Profile Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionProfileAnnotations(InteractionProfileAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Profile App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Profile App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionProfileAppInfo(InteractionProfileAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Profile Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Profile Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionProfileDocumentation(InteractionProfileDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionTest(InteractionTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemFilter(ItemFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyed Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyed Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyedName(KeyedName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legalese</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legalese</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalese(Legalese object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Class Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Class Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalClassRef(LocalClassRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Class Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Class Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalClassReference(LocalClassReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mif Changes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mif Changes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMifChanges(MifChanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mif Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mif Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMifContent(MifContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Graphic Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Graphic Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeGraphicInformation(NodeGraphicInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node With Connection Graphic Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node With Connection Graphic Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeWithConnectionGraphicInformation(NodeWithConnectionGraphicInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Computable Content Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Computable Content Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonComputableContentDefinition(NonComputableContentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Traversable Association End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Traversable Association End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonTraversableAssociationEnd(NonTraversableAssociationEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Issue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Issue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenIssue(OpenIssue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationAnnotations(OperationAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationAppInfo(OperationAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDerivation(OperationDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDocumentation(OperationDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationParameter(OperationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherAnnotation(OtherAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.openhealthtools.mdht.emf.hl7.mif2.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageAnnotations(PackageAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageAppInfo(PackageAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageArtifact(PackageArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageBase(PackageBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageContent(PackageContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Def Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Def Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageDefId(PackageDefId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageDerivation(PackageDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageDocumentation(PackageDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Or Artifact Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Or Artifact Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageOrArtifactRef(PackageOrArtifactRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageRef(PackageRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterModel(ParameterModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintName(PrintName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Based Content Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Based Content Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyBasedContentDefinition(PropertyBasedContentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyGroup(PropertyGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicationAnnotations(PublicationAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicationAppInfo(PublicationAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicationBase(PublicationBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicationDocumentation(PublicationDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicationGroup(PublicationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicationItem(PublicationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publication Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publication Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicationPackage(PublicationPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeDefinition(RangeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realm Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realm Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealmElement(RealmElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receiver Responsibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receiver Responsibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiverResponsibility(ReceiverResponsibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related App Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related App Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedAppRole(RelatedAppRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Based Content Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Based Content Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipBasedContentDefinition(RelationshipBasedContentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelease(Release object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseList(ReleaseList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rendering Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rendering Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenderingInformation(RenderingInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Element Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Element Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceElementContent(ReplaceElementContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibleGroup(ResponsibleGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialized Association End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialized Association End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializedAssociationEnd(SerializedAssociationEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialized Association Ends</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialized Association Ends</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializedAssociationEnds(SerializedAssociationEnds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialized Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialized Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializedClass(SerializedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialized Class Binding Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialized Class Binding Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializedClassBindingArgument(SerializedClassBindingArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialized Classes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialized Classes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializedClasses(SerializedClasses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialized Class Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialized Class Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializedClassGeneralization(SerializedClassGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialized Common Model Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialized Common Model Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializedCommonModelElementRef(SerializedCommonModelElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialized Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialized Entry Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializedEntryPoint(SerializedEntryPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialized Static Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialized Static Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializedStaticModel(SerializedStaticModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serialized Static Models Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serialized Static Models Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerializedStaticModelsType(SerializedStaticModelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialization Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialization Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecializationClass(SpecializationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateAnnotations(StateAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateAppInfo(StateAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateDerivation(StateDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateDocumentation(StateDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachineAnnotations(StateMachineAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachineAppInfo(StateMachineAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachineDocumentation(StateMachineDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticExample(StaticExample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModel(StaticModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelAnnotations(StaticModelAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelAppInfo(StaticModelAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelBase(StaticModelBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model Class Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model Class Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelClassTemplateParameter(StaticModelClassTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelDerivation(StaticModelDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model Derivation Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model Derivation Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelDerivationSource(StaticModelDerivationSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelDocumentation(StaticModelDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model Interface Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model Interface Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelInterfaceAnnotations(StaticModelInterfaceAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model Interface App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model Interface App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelInterfaceAppInfo(StaticModelInterfaceAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model Interface Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model Interface Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelInterfaceDocumentation(StaticModelInterfaceDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model Interface Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model Interface Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelInterfacePackage(StaticModelInterfacePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Model Ref Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Model Ref Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelRefBase(StaticModelRefBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Models Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Models Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticModelsType(StaticModelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Package Diagram Graphic Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Package Diagram Graphic Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticPackageDiagramGraphicInformation(StaticPackageDiagramGraphicInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storyboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storyboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoryboard(Storyboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storyboard Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storyboard Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoryboardAnnotations(StoryboardAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storyboard App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storyboard App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoryboardAppInfo(StoryboardAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storyboard Artifact References</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storyboard Artifact References</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoryboardArtifactReferences(StoryboardArtifactReferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storyboard Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storyboard Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoryboardDocumentation(StoryboardDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storyboard Narrative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storyboard Narrative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoryboardNarrative(StoryboardNarrative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredDocument(StructuredDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Document Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Document Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredDocumentAnnotations(StructuredDocumentAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Document App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Document App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredDocumentAppInfo(StructuredDocumentAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Document Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Document Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredDocumentDocumentation(StructuredDocumentDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stub Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stub Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStubDefinition(StubDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Area Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Area Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectAreaAnnotations(SubjectAreaAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Area App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Area App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectAreaAppInfo(SubjectAreaAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Area Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Area Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectAreaDocumentation(SubjectAreaDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Area Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Area Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectAreaPackage(SubjectAreaPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSystem(SubSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Concept Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Concept Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedConceptProperty(SupportedConceptProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Concept Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Concept Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedConceptRelationship(SupportedConceptRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedProperty(SupportedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermDefinition(TermDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyServer(TerminologyServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest(Test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestBase(TestBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScenario(TestScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestSystem(TestSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionAnnotations(TransitionAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionAppInfo(TransitionAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionDerivation(TransitionDerivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionDocumentation(TransitionDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionRef(TransitionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerEvent(TriggerEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Event Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Event Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerEventAnnotations(TriggerEventAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Event App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Event App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerEventAppInfo(TriggerEventAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Event Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Event Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerEventDocumentation(TriggerEventDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSet(ValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetAnnotations(ValueSetAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetAppInfo(ValueSetAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetDocumentation(ValueSetDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Supplement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Supplement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetSupplement(ValueSetSupplement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Set Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Set Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSetVersion(ValueSetVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Various Mixed Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Various Mixed Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariousMixedContent(VariousMixedContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary Code Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary Code Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabularyCodeRef(VocabularyCodeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary Code Refs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary Code Refs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabularyCodeRefs(VocabularyCodeRefs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary Limitation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary Limitation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabularyLimitation(VocabularyLimitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabularyModel(VocabularyModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary Model Annotations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary Model Annotations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabularyModelAnnotations(VocabularyModelAnnotations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary Model App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary Model App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabularyModelAppInfo(VocabularyModelAppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary Model Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary Model Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabularyModelDocumentation(VocabularyModelDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabularySpecification(VocabularySpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary Value Set Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary Value Set Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabularyValueSetBinding(VocabularyValueSetBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vocabulary Value Set Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vocabulary Value Set Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVocabularyValueSetRef(VocabularyValueSetRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XMI Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XMI Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMIContent(XMIContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //Mif2Switch
