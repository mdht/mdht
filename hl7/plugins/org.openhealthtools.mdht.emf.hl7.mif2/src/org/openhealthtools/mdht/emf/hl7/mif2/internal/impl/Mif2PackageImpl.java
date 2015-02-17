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
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.io.IOException;

import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Factory;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.util.Mif2Validator;
import org.openhealthtools.mdht.emf.w3c.xhtml.XhtmlPackage;
import org.openhealthtools.mdht.emf.w3c.xhtml.internal.impl.XhtmlPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mif2PackageImpl extends EPackageImpl implements Mif2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "mif2.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addElementContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationCascadeInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appendixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationRoleAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationRoleAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationRoleDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appliedTemplateGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass approvalInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactCrossReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactSupplementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactSupplementAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactSupplementAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactSupplementDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactXRefSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndSpecializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndWithClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndWithClassRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ballotCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ballotCommentResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ballotSubmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingRealmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundStaticModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cascadableAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeRequestEstimateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classBindingArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classBindingArgumentBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classGeneralizationBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classGraphicInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classOrReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classStubInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classStubInterfaceAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classStubInterfaceAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classStubInterfaceDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeBasedContentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeFilterContentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeIconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSupplementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemSupplementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemVersionAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemVersionAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemVersionBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemVersionDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSystemVersionSupplementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTranslationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTranslationAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTranslationAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTranslationCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTranslationCollectionAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTranslationCollectionAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTranslationCollectionDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTranslationDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedContentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass committeeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonModelElementDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonModelElementRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonModelElementRefAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonModelElementRefAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonModelElementRefBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonModelElementRefDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexMarkupWithLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDomainAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDomainAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDomainDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDomainPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptDomainRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptPropertyRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptSupplementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptSupplementAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptSupplementAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptSupplementDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceProfileAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceProfileAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceProfileDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceTriggerEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedGraphNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentDefinitionAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentDefinitionAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentDefinitionDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeLimitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeModelLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deprecationInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedStaticModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedStaticModelsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramGraphicInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentProfileAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentProfileAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentProfileDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAnalysisModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAnalysisModelAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAnalysisModelAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAnalysisModelDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainInstanceExampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainInstanceExampleAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainInstanceExampleAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainInstanceExampleDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementValueRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentalOccurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeFormMarkupWithLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freehandDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freehandDocumentAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freehandDocumentAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freehandDocumentDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalApplicationRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalArtifactXRefSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalCodeSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalCodeSystemSupplementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalConformanceProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalDatatypeModelLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalDerivedStaticModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalDomainAnalysisModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalDomainInstanceExampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalFreehandDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalGenericPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalGlossaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalInteractionProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalMifChangesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalPublicationPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalSerializedStaticModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalStaticModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalStaticModelInterfacePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalStoryboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalStructuredDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalTestScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalTriggerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalValueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalVocabularyModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphConnectorWithEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEdgeGraphicInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEdgeWithAnchorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphNodeWithOptionalConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupVoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationMessageConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importDatatypeModelLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeRelatedCodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionProfileAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionProfileAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionProfileDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyedNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legaleseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localClassRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localClassReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mifChangesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mifContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeGraphicInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeWithConnectionGraphicInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonComputableContentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonTraversableAssociationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openIssueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageDefIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageOrArtifactRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyBasedContentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realmElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiverResponsibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedAppRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipBasedContentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renderingInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceElementContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsibleGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedAssociationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedAssociationEndsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedClassBindingArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedClassesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedClassGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedCommonModelElementRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedEntryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedStaticModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializedStaticModelsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticExampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelClassTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelDerivationSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelInterfaceAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelInterfaceAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelInterfaceDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelInterfacePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelRefBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticModelsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticPackageDiagramGraphicInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyboardAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyboardAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyboardArtifactReferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyboardDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyboardNarrativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredDocumentAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredDocumentAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredDocumentDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stubDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectAreaAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectAreaAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectAreaDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectAreaPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedConceptPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedConceptRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionDerivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEventAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEventAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEventDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetSupplementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variousMixedContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyCodeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyCodeRefsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyLimitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyModelAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyModelAppInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyModelDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularySpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyValueSetBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vocabularyValueSetRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmiContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum affiliateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum affirmativeVoteResolutionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum annotationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicationRoleRelationshipKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum approvalStatusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artifactGroupKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artifactKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artifactRenderingStyleKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributePropertyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cascadingAnnotationElementKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeRequestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classPresentationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmetAttributionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmetEntryKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codeFilterExpressionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codeStatusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codingStrengthKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conceptDomainPropertyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conceptPropertyTypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conceptRelationshipKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conceptUseKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conformanceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constructedElementKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentsLevelKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datatypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datatypeOperationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datatypeQualifierKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultDeterminerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum definedMappingSourceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum definedRoleKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum derivationRelationshipKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum designCommentTagKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentProfileKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum domainKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durationUnitsKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum effortQuantifierKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expressionLanguageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionalismEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum iconFormatKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interactionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interactionProfileKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum itsKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mapRelationshipKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelConformanceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum negativeVoteResolutionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeOrientationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ownerScopeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum packageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum packageRootKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parentArtifactKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyDefaultHandlingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reflexivityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipTraversalKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum revisionFrequencyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum staticModelDiagramPresentationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum staticModelRepresentationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum staticModelUseKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subArtifactKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subSectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum symmetryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum terminologyServerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitivityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum translatableDirectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unlimitedMultiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateModeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vocabularyModelDefinitionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum voteCommentKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum voteKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType affiliateKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType affirmativeVoteResolutionKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allClassNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType annotationKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType applicationRoleRelationshipKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType approvalStatusKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType artifactGroupKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType artifactKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType artifactRenderingStyleKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType attributePropertyKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType basicFormalNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType basicIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cascadingAnnotationElementKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType changeRequestStatusObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classPresentationKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmetAttributionKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmetAttributionStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmetAttributionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cmetEntryKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType codeFilterExpressionKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType codeStatusKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType codingStrengthKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collapsedPackageIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conceptDomainPropertyKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conceptPropertyTypeKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conceptRelationshipKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conceptUseKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conformanceKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType constructedElementKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contentsLevelKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeOperationKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeQualifierKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateOrTimestampEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decimalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType defaultDeterminerKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType definedContextKindEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType definedMappingSourceKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType definedRoleKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType derivationRelationshipKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType designCommentTagKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType documentProfileKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType domainKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationUnitsKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType effortQuantifierKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eMailEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumerationStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumerationTokenEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType expressionLanguageKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType filterKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType formalProperNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType formalPropertyNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType functionalismObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType graphicMeasurementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hashCodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iconFormatKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interactionKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interactionProfileKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType itsKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localFileReferenceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longDescriptiveNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lowerCamelCaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mappingSourceKindEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapRelationshipKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modelConformanceKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType negativeVoteResolutionKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nodeOrientationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonEmptyStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeDecimalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ownerScopeKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType packageKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType packageRootKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parentArtifactKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveDecimalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prefixedUpperCamelCaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyDefaultHandlingKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType realmKindEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType realmNamespaceKindEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reflexivityObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationshipTraversalKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType revisionFrequencyKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType roleKindEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sectionKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shortDescriptiveNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shortStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType singleNonNegativeIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType smallNonNegativeIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType smallPositiveIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType staticModelDiagramPresentationKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType staticModelRepresentationKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType staticModelUseKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subArtifactKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subSectionKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType symmetryObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType templateIdEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType terminologyServerKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transitivityObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType translatableDirectionKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlimitedIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlimitedMultiplicityObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType updateModeCodesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType updateModeKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType upperCamelCaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType visibilityKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vocabularyModelDefinitionKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voteCommentKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voteKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voteResolutionKindEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xDomainNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yearEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yearsEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Mif2PackageImpl() {
		super(eNS_URI, Mif2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Mif2Package init() {
		if (isInited) {
			return (Mif2Package) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI);
		}

		// Obtain or create and register package
		Mif2PackageImpl theMif2Package = (Mif2PackageImpl) (EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof Mif2PackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(eNS_URI)
				: new Mif2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XhtmlPackageImpl theXhtmlPackage = (XhtmlPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(XhtmlPackage.eNS_URI) instanceof XhtmlPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(XhtmlPackage.eNS_URI)
				: XhtmlPackage.eINSTANCE);

		// Load packages
		theMif2Package.loadPackage();
		theXhtmlPackage.loadPackage();

		// Fix loaded packages
		theMif2Package.fixPackageContents();
		theXhtmlPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theMif2Package, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return Mif2Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theMif2Package.freeze();

		return theMif2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddElementContent() {
		if (addElementContentEClass == null) {
			addElementContentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				0);
		}
		return addElementContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddElementContent_ReplacementContent() {
		return (EReference) getAddElementContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddElementContent_AddElements() {
		return (EAttribute) getAddElementContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddElementContent_AddAttribute() {
		return (EReference) getAddElementContent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddElementContent_AddElement() {
		return (EReference) getAddElementContent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddElementContent_AfterElementName() {
		return (EAttribute) getAddElementContent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddElementContent_AfterRepetition() {
		return (EAttribute) getAddElementContent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddElementContent_Name() {
		return (EAttribute) getAddElementContent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationBase() {
		if (annotationBaseEClass == null) {
			annotationBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				6);
		}
		return annotationBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationCascadeInfo() {
		if (annotationCascadeInfoEClass == null) {
			annotationCascadeInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				7);
		}
		return annotationCascadeInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationCascadeInfo_Datatype() {
		return (EReference) getAnnotationCascadeInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationCascadeInfo_ClassifierName() {
		return (EAttribute) getAnnotationCascadeInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationCascadeInfo_ClassifierNameExact() {
		return (EAttribute) getAnnotationCascadeInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationCascadeInfo_ContextClassName() {
		return (EAttribute) getAnnotationCascadeInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationCascadeInfo_ElementType() {
		return (EAttribute) getAnnotationCascadeInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationCascadeInfo_RimFeatureName() {
		return (EAttribute) getAnnotationCascadeInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationCascadeInfo_TargetClassName() {
		return (EAttribute) getAnnotationCascadeInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationCascadeInfo_TargetClassNameExact() {
		return (EAttribute) getAnnotationCascadeInfo().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationDerivation() {
		if (annotationDerivationEClass == null) {
			annotationDerivationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				8);
		}
		return annotationDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationDerivation_TargetAnnotationName() {
		return (EAttribute) getAnnotationDerivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotations() {
		if (annotationsEClass == null) {
			annotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				11);
		}
		return annotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotations_Documentation() {
		return (EReference) getAnnotations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotations_AppInfo() {
		return (EReference) getAnnotations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppendix() {
		if (appendixEClass == null) {
			appendixEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				12);
		}
		return appendixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppendix_Context() {
		return (EAttribute) getAppendix().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppendix_RealmNamespace() {
		return (EReference) getAppendix().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppendix_BusinessName() {
		return (EReference) getAppendix().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppendix_DerivationSupplier() {
		return (EReference) getAppendix().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppendix_Name() {
		return (EAttribute) getAppendix().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppendix_Title() {
		return (EAttribute) getAppendix().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppInfo() {
		if (appInfoEClass == null) {
			appInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				13);
		}
		return appInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppInfo_Mapping() {
		return (EReference) getAppInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppInfo_FormalConstraint() {
		return (EReference) getAppInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppInfo_OpenIssue() {
		return (EReference) getAppInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppInfo_StaticExample() {
		return (EReference) getAppInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppInfo_BallotComment() {
		return (EReference) getAppInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppInfo_ChangeRequest() {
		return (EReference) getAppInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppInfo_DeprecationInfo() {
		return (EReference) getAppInfo().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationRole() {
		if (applicationRoleEClass == null) {
			applicationRoleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				14);
		}
		return applicationRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationRole_Annotations() {
		return (EReference) getApplicationRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationRole_RelatedApplicationRoles() {
		return (EReference) getApplicationRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationRole_SendsInteractions() {
		return (EReference) getApplicationRole().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationRole_ReceivesInteractions() {
		return (EReference) getApplicationRole().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationRole_CreatesDocuments() {
		return (EReference) getApplicationRole().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationRole_ConsumesDocuments() {
		return (EReference) getApplicationRole().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationRoleAnnotations() {
		if (applicationRoleAnnotationsEClass == null) {
			applicationRoleAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				15);
		}
		return applicationRoleAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationRoleAppInfo() {
		if (applicationRoleAppInfoEClass == null) {
			applicationRoleAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				16);
		}
		return applicationRoleAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationRoleDocumentation() {
		if (applicationRoleDocumentationEClass == null) {
			applicationRoleDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				17);
		}
		return applicationRoleDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppliedTemplateGroup() {
		if (appliedTemplateGroupEClass == null) {
			appliedTemplateGroupEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				20);
		}
		return appliedTemplateGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppliedTemplateGroup_TemplateId() {
		return (EAttribute) getAppliedTemplateGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApprovalInfo() {
		if (approvalInfoEClass == null) {
			approvalInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				21);
		}
		return approvalInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApprovalInfo_BallotSubmission() {
		return (EReference) getApprovalInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApprovalInfo_ApprovalDate() {
		return (EAttribute) getApprovalInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApprovalInfo_ApprovalStatus() {
		return (EAttribute) getApprovalInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApprovalInfo_ApprovingOrganization() {
		return (EAttribute) getApprovalInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApprovalInfo_BallotOccurrence() {
		return (EAttribute) getApprovalInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApprovalInfo_WithdrawalDate() {
		return (EAttribute) getApprovalInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactCrossReference() {
		if (artifactCrossReferenceEClass == null) {
			artifactCrossReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				24);
		}
		return artifactCrossReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactCrossReference_DerivedFrom() {
		return (EReference) getArtifactCrossReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactCrossReference_ImportedPackage() {
		return (EReference) getArtifactCrossReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactCrossReference_DependentOnElement() {
		return (EReference) getArtifactCrossReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactCrossReference_ContainedElements() {
		return (EReference) getArtifactCrossReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactDependency() {
		if (artifactDependencyEClass == null) {
			artifactDependencyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				25);
		}
		return artifactDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactDependency_SupplementArtifact() {
		return (EReference) getArtifactDependency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactSupplement() {
		if (artifactSupplementEClass == null) {
			artifactSupplementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				32);
		}
		return artifactSupplementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactSupplement_SupplementedObject() {
		return (EReference) getArtifactSupplement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactSupplement_BusinessName() {
		return (EReference) getArtifactSupplement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactSupplement_Annotations() {
		return (EReference) getArtifactSupplement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactSupplementAnnotations() {
		if (artifactSupplementAnnotationsEClass == null) {
			artifactSupplementAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				33);
		}
		return artifactSupplementAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactSupplementAppInfo() {
		if (artifactSupplementAppInfoEClass == null) {
			artifactSupplementAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				34);
		}
		return artifactSupplementAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactSupplementDocumentation() {
		if (artifactSupplementDocumentationEClass == null) {
			artifactSupplementDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				35);
		}
		return artifactSupplementDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactXRefSummary() {
		if (artifactXRefSummaryEClass == null) {
			artifactXRefSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				36);
		}
		return artifactXRefSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactXRefSummary_RenderingInformation() {
		return (EReference) getArtifactXRefSummary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactXRefSummary_Artifact() {
		return (EReference) getArtifactXRefSummary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		if (associationEClass == null) {
			associationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				37);
		}
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Group() {
		return (EAttribute) getAssociation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_TraversableConnection() {
		return (EReference) getAssociation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_NonTraversableConnection() {
		return (EReference) getAssociation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationAnnotations() {
		if (associationAnnotationsEClass == null) {
			associationAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				38);
		}
		return associationAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationAppInfo() {
		if (associationAppInfoEClass == null) {
			associationAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				39);
		}
		return associationAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationBase() {
		if (associationBaseEClass == null) {
			associationBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				40);
		}
		return associationBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationBase_Annotations() {
		return (EReference) getAssociationBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationBase_GraphicLinkId() {
		return (EAttribute) getAssociationBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationBase_SortKey() {
		return (EAttribute) getAssociationBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationDocumentation() {
		if (associationDocumentationEClass == null) {
			associationDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				41);
		}
		return associationDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEnd() {
		if (associationEndEClass == null) {
			associationEndEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				42);
		}
		return associationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEnd_ParticipantClassName() {
		return (EAttribute) getAssociationEnd().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEndAnnotations() {
		if (associationEndAnnotationsEClass == null) {
			associationEndAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				43);
		}
		return associationEndAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEndAppInfo() {
		if (associationEndAppInfoEClass == null) {
			associationEndAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				44);
		}
		return associationEndAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEndBase() {
		if (associationEndBaseEClass == null) {
			associationEndBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				45);
		}
		return associationEndBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationEndBase_BusinessName() {
		return (EReference) getAssociationEndBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationEndBase_Annotations() {
		return (EReference) getAssociationEndBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationEndBase_DerivedFrom() {
		return (EReference) getAssociationEndBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationEndBase_ChoiceItem() {
		return (EReference) getAssociationEndBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndBase_Conformance() {
		return (EAttribute) getAssociationEndBase().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndBase_ExtensionOID() {
		return (EAttribute) getAssociationEndBase().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndBase_IsMandatory() {
		return (EAttribute) getAssociationEndBase().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndBase_MaximumMultiplicity() {
		return (EAttribute) getAssociationEndBase().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndBase_MaximumRecursionDepth() {
		return (EAttribute) getAssociationEndBase().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndBase_MinimumMultiplicity() {
		return (EAttribute) getAssociationEndBase().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndBase_Name() {
		return (EAttribute) getAssociationEndBase().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndBase_NameLocked() {
		return (EAttribute) getAssociationEndBase().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndBase_ReferenceHistory() {
		return (EAttribute) getAssociationEndBase().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndBase_SortKey() {
		return (EAttribute) getAssociationEndBase().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndBase_UpdateModeDefault() {
		return (EAttribute) getAssociationEndBase().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndBase_UpdateModesAllowed() {
		return (EAttribute) getAssociationEndBase().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEndDerivation() {
		if (associationEndDerivationEClass == null) {
			associationEndDerivationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				46);
		}
		return associationEndDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndDerivation_AssociationEndName() {
		return (EAttribute) getAssociationEndDerivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEndDocumentation() {
		if (associationEndDocumentationEClass == null) {
			associationEndDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				47);
		}
		return associationEndDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEndSpecialization() {
		if (associationEndSpecializationEClass == null) {
			associationEndSpecializationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				48);
		}
		return associationEndSpecializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationEndSpecialization_ChoiceItem() {
		return (EReference) getAssociationEndSpecialization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndSpecialization_ClassName() {
		return (EAttribute) getAssociationEndSpecialization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndSpecialization_TraversalName() {
		return (EAttribute) getAssociationEndSpecialization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEndWithClass() {
		if (associationEndWithClassEClass == null) {
			associationEndWithClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				49);
		}
		return associationEndWithClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationEndWithClass_ParticipantClass() {
		return (EReference) getAssociationEndWithClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEndWithClassRef() {
		if (associationEndWithClassRefEClass == null) {
			associationEndWithClassRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				50);
		}
		return associationEndWithClassRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEndWithClassRef_ParticipantClassName() {
		return (EAttribute) getAssociationEndWithClassRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		if (attributeEClass == null) {
			attributeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				51);
		}
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_BusinessName() {
		return (EReference) getAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Annotations() {
		return (EReference) getAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_DerivedFrom() {
		return (EReference) getAttribute().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Type() {
		return (EReference) getAttribute().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Vocabulary() {
		return (EReference) getAttribute().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Property() {
		return (EReference) getAttribute().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_ExtensionOID() {
		return (EAttribute) getAttribute().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsImmutable() {
		return (EAttribute) getAttribute().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_MaximumMultiplicity() {
		return (EAttribute) getAttribute().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_MinimumMultiplicity() {
		return (EAttribute) getAttribute().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute) getAttribute().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_SortKey() {
		return (EAttribute) getAttribute().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_UpdateModeDefault() {
		return (EAttribute) getAttribute().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_UpdateModesAllowed() {
		return (EAttribute) getAttribute().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAnnotations() {
		if (attributeAnnotationsEClass == null) {
			attributeAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				52);
		}
		return attributeAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAppInfo() {
		if (attributeAppInfoEClass == null) {
			attributeAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				53);
		}
		return attributeAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeContent() {
		if (attributeContentEClass == null) {
			attributeContentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				54);
		}
		return attributeContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeContent_Value() {
		return (EAttribute) getAttributeContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDerivation() {
		if (attributeDerivationEClass == null) {
			attributeDerivationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				55);
		}
		return attributeDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDerivation_AttributeName() {
		return (EAttribute) getAttributeDerivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDocumentation() {
		if (attributeDocumentationEClass == null) {
			attributeDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				56);
		}
		return attributeDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeProperty() {
		if (attributePropertyEClass == null) {
			attributePropertyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				57);
		}
		return attributePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeProperty_Name() {
		return (EAttribute) getAttributeProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeProperty_Value() {
		return (EAttribute) getAttributeProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeRef() {
		if (attributeRefEClass == null) {
			attributeRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				60);
		}
		return attributeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeRef_Name() {
		return (EAttribute) getAttributeRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueRef() {
		if (attributeValueRefEClass == null) {
			attributeValueRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				61);
		}
		return attributeValueRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueRef_Value() {
		return (EAttribute) getAttributeValueRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBallotComment() {
		if (ballotCommentEClass == null) {
			ballotCommentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				62);
		}
		return ballotCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotComment_Context() {
		return (EAttribute) getBallotComment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBallotComment_RealmNamespace() {
		return (EReference) getBallotComment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBallotComment_ExistingContent() {
		return (EReference) getBallotComment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBallotComment_SuggestedReplacement() {
		return (EReference) getBallotComment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBallotComment_Resolution() {
		return (EReference) getBallotComment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotComment_CommentType() {
		return (EAttribute) getBallotComment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotComment_ImplementedDate() {
		return (EAttribute) getBallotComment().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotComment_ImplementingPersonName() {
		return (EAttribute) getBallotComment().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotComment_Location() {
		return (EAttribute) getBallotComment().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotComment_Name() {
		return (EAttribute) getBallotComment().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotComment_SubmissionId() {
		return (EAttribute) getBallotComment().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBallotCommentResolution() {
		if (ballotCommentResolutionEClass == null) {
			ballotCommentResolutionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				63);
		}
		return ballotCommentResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBallotCommentResolution_ResolutionComments() {
		return (EReference) getBallotCommentResolution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBallotCommentResolution_Vote() {
		return (EReference) getBallotCommentResolution().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotCommentResolution_Resolution() {
		return (EAttribute) getBallotCommentResolution().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotCommentResolution_ResolutionDate() {
		return (EAttribute) getBallotCommentResolution().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBallotSubmission() {
		if (ballotSubmissionEClass == null) {
			ballotSubmissionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				64);
		}
		return ballotSubmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBallotSubmission_VoterComments() {
		return (EReference) getBallotSubmission().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotSubmission_Resolution() {
		return (EAttribute) getBallotSubmission().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotSubmission_Status() {
		return (EAttribute) getBallotSubmission().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotSubmission_StatusDate() {
		return (EAttribute) getBallotSubmission().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotSubmission_SubmissionId() {
		return (EAttribute) getBallotSubmission().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotSubmission_SubmitterName() {
		return (EAttribute) getBallotSubmission().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotSubmission_SubmitterOrganization() {
		return (EAttribute) getBallotSubmission().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBallotSubmission_Vote() {
		return (EAttribute) getBallotSubmission().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicAnnotation() {
		if (basicAnnotationEClass == null) {
			basicAnnotationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				65);
		}
		return basicAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicAnnotation_Text() {
		return (EReference) getBasicAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicAnnotation_CombinedText() {
		return (EReference) getBasicAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicAnnotation_AppendAnnotationId() {
		return (EAttribute) getBasicAnnotation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicAnnotation_GraphicLinkId() {
		return (EAttribute) getBasicAnnotation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicAnnotation_Id() {
		return (EAttribute) getBasicAnnotation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicAnnotation_PrependAnnotationId() {
		return (EAttribute) getBasicAnnotation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicAnnotation_SortKey() {
		return (EAttribute) getBasicAnnotation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingRealm() {
		if (bindingRealmEClass == null) {
			bindingRealmEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				68);
		}
		return bindingRealmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingRealm_Description() {
		return (EReference) getBindingRealm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingRealm_Name() {
		return (EAttribute) getBindingRealm().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingRealm_OwningAffiliate() {
		return (EAttribute) getBindingRealm().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingRealm_SortKey() {
		return (EAttribute) getBindingRealm().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundStaticModel() {
		if (boundStaticModelEClass == null) {
			boundStaticModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				69);
		}
		return boundStaticModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundStaticModel_ParameterModel() {
		return (EReference) getBoundStaticModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundStaticModel_EntryPointUseKind() {
		return (EAttribute) getBoundStaticModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessName() {
		if (businessNameEClass == null) {
			businessNameEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				70);
		}
		return businessNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessName_Context() {
		return (EAttribute) getBusinessName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessName_RealmNamespace() {
		return (EReference) getBusinessName().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessName_CascadeInfo() {
		return (EReference) getBusinessName().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessName_Lang() {
		return (EAttribute) getBusinessName().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessName_Name() {
		return (EAttribute) getBusinessName().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCascadableAnnotation() {
		if (cascadableAnnotationEClass == null) {
			cascadableAnnotationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				71);
		}
		return cascadableAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCascadableAnnotation_CascadeInfo() {
		return (EReference) getCascadableAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChange() {
		if (changeEClass == null) {
			changeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				74);
		}
		return changeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChange_Description() {
		return (EReference) getChange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChange_Rationale() {
		return (EReference) getChange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeRequest() {
		if (changeRequestEClass == null) {
			changeRequestEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				75);
		}
		return changeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeRequest_Resolution() {
		return (EReference) getChangeRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeRequest_Estimate() {
		return (EReference) getChangeRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRequest_ChangeRequestId() {
		return (EAttribute) getChangeRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRequest_ImplementedDate() {
		return (EAttribute) getChangeRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRequest_ImplementingPersonName() {
		return (EAttribute) getChangeRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRequest_Location() {
		return (EAttribute) getChangeRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRequest_Status() {
		return (EAttribute) getChangeRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRequest_TargetDate() {
		return (EAttribute) getChangeRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeRequestEstimate() {
		if (changeRequestEstimateEClass == null) {
			changeRequestEstimateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				76);
		}
		return changeRequestEstimateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeRequestEstimate_Description() {
		return (EReference) getChangeRequestEstimate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRequestEstimate_Cost() {
		return (EAttribute) getChangeRequestEstimate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRequestEstimate_CostCurrency() {
		return (EAttribute) getChangeRequestEstimate().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRequestEstimate_Effort() {
		return (EAttribute) getChangeRequestEstimate().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRequestEstimate_EffortQuantifier() {
		return (EAttribute) getChangeRequestEstimate().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRequestEstimate_Type() {
		return (EAttribute) getChangeRequestEstimate().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAnnotations() {
		if (classAnnotationsEClass == null) {
			classAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				79);
		}
		return classAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassAppInfo() {
		if (classAppInfoEClass == null) {
			classAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				80);
		}
		return classAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassBase() {
		if (classBaseEClass == null) {
			classBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				81);
		}
		return classBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassBase_Annotations() {
		return (EReference) getClassBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassBase_Behavior() {
		return (EReference) getClassBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassBase_StewardCommittee() {
		return (EReference) getClassBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassBase_InterestedCommittee() {
		return (EReference) getClassBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassBase_RequiredTemplateGroup() {
		return (EReference) getClassBase().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassBase_SupportedTemplate() {
		return (EAttribute) getClassBase().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassBase_Attribute() {
		return (EReference) getClassBase().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassBase_IsAbstract() {
		return (EAttribute) getClassBase().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassBase_IsComplete() {
		return (EAttribute) getClassBase().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassBase_Name() {
		return (EAttribute) getClassBase().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassBase_NameLocked() {
		return (EAttribute) getClassBase().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassBindingArgument() {
		if (classBindingArgumentEClass == null) {
			classBindingArgumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				82);
		}
		return classBindingArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassBindingArgument_ClassName() {
		return (EAttribute) getClassBindingArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassBindingArgumentBase() {
		if (classBindingArgumentBaseEClass == null) {
			classBindingArgumentBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				83);
		}
		return classBindingArgumentBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassBindingArgumentBase_TemplateParameterName() {
		return (EAttribute) getClassBindingArgumentBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDerivation() {
		if (classDerivationEClass == null) {
			classDerivationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				84);
		}
		return classDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDerivation_ClassName() {
		return (EAttribute) getClassDerivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDerivation_StaticModelDerivationId() {
		return (EAttribute) getClassDerivation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDerivation_WithinCMET() {
		return (EAttribute) getClassDerivation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDocumentation() {
		if (classDocumentationEClass == null) {
			classDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				85);
		}
		return classDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassElement() {
		if (classElementEClass == null) {
			classElementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				86);
		}
		return classElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassElement_Class() {
		return (EReference) getClassElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassElement_CommonModelElementRef() {
		return (EReference) getClassElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassElement_TemplateParameter() {
		return (EReference) getClassElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassGeneralization() {
		if (classGeneralizationEClass == null) {
			classGeneralizationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				87);
		}
		return classGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassGeneralization_Name() {
		return (EAttribute) getClassGeneralization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassGeneralizationBase() {
		if (classGeneralizationBaseEClass == null) {
			classGeneralizationBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				88);
		}
		return classGeneralizationBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassGeneralizationBase_Annotations() {
		return (EReference) getClassGeneralizationBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassGeneralizationBase_Conformance() {
		return (EAttribute) getClassGeneralizationBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassGeneralizationBase_GraphicLinkId() {
		return (EAttribute) getClassGeneralizationBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassGeneralizationBase_SortKey() {
		return (EAttribute) getClassGeneralizationBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassGraphicInformation() {
		if (classGraphicInformationEClass == null) {
			classGraphicInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				89);
		}
		return classGraphicInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassGraphicInformation_Presentation() {
		return (EAttribute) getClassGraphicInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		if (classifierEClass == null) {
			classifierEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				90);
		}
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_BusinessName() {
		return (EReference) getClassifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_SortKey() {
		return (EAttribute) getClassifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierBase() {
		if (classifierBaseEClass == null) {
			classifierBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				91);
		}
		return classifierBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierBase_DerivedFrom() {
		return (EReference) getClassifierBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierBase_DefiningVocabulary() {
		return (EReference) getClassifierBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierBase_GraphicLinkId() {
		return (EAttribute) getClassifierBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassOrReference() {
		if (classOrReferenceEClass == null) {
			classOrReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				92);
		}
		return classOrReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOrReference_Class() {
		return (EReference) getClassOrReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOrReference_CommonModelElementRef() {
		return (EReference) getClassOrReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOrReference_TemplateParameter() {
		return (EReference) getClassOrReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOrReference_Reference() {
		return (EReference) getClassOrReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassRef() {
		if (classRefEClass == null) {
			classRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				95);
		}
		return classRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassRef_ClassName() {
		return (EAttribute) getClassRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassStubInterface() {
		if (classStubInterfaceEClass == null) {
			classStubInterfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				96);
		}
		return classStubInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassStubInterface_Annotations() {
		return (EReference) getClassStubInterface().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassStubInterface_Name() {
		return (EAttribute) getClassStubInterface().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassStubInterfaceAnnotations() {
		if (classStubInterfaceAnnotationsEClass == null) {
			classStubInterfaceAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				97);
		}
		return classStubInterfaceAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassStubInterfaceAppInfo() {
		if (classStubInterfaceAppInfoEClass == null) {
			classStubInterfaceAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				98);
		}
		return classStubInterfaceAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassStubInterfaceDocumentation() {
		if (classStubInterfaceDocumentationEClass == null) {
			classStubInterfaceDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				99);
		}
		return classStubInterfaceDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCode() {
		if (codeEClass == null) {
			codeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(106);
		}
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCode_PrintName() {
		return (EReference) getCode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCode_CodeProperty() {
		return (EReference) getCode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_Code() {
		return (EAttribute) getCode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_EffectiveDate() {
		return (EAttribute) getCode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_PropertyGroup() {
		return (EAttribute) getCode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_RetirementDate() {
		return (EAttribute) getCode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_Status() {
		return (EAttribute) getCode().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeBasedContentDefinition() {
		if (codeBasedContentDefinitionEClass == null) {
			codeBasedContentDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				107);
		}
		return codeBasedContentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeBasedContentDefinition_HeadCodes() {
		return (EReference) getCodeBasedContentDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeBasedContentDefinition_IncludeRelatedCodes() {
		return (EReference) getCodeBasedContentDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeBasedContentDefinition_Code() {
		return (EAttribute) getCodeBasedContentDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeBasedContentDefinition_IncludeHeadCode() {
		return (EAttribute) getCodeBasedContentDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeFilterContentDefinition() {
		if (codeFilterContentDefinitionEClass == null) {
			codeFilterContentDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				108);
		}
		return codeFilterContentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeFilterContentDefinition_Expression() {
		return (EReference) getCodeFilterContentDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeFilterContentDefinition_ExpressionType() {
		return (EAttribute) getCodeFilterContentDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeIcon() {
		if (codeIconEClass == null) {
			codeIconEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				111);
		}
		return codeIconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeIcon_Content() {
		return (EReference) getCodeIcon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeIcon_Type() {
		return (EAttribute) getCodeIcon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSupplement() {
		if (codeSupplementEClass == null) {
			codeSupplementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				114);
		}
		return codeSupplementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSupplement_PrintName() {
		return (EReference) getCodeSupplement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSupplement_SupplementalCodeProperty() {
		return (EReference) getCodeSupplement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSupplement_Code() {
		return (EAttribute) getCodeSupplement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystem() {
		if (codeSystemEClass == null) {
			codeSystemEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				115);
		}
		return codeSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystem_ReleasedVersion() {
		return (EReference) getCodeSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemAnnotations() {
		if (codeSystemAnnotationsEClass == null) {
			codeSystemAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				116);
		}
		return codeSystemAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemAppInfo() {
		if (codeSystemAppInfoEClass == null) {
			codeSystemAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				117);
		}
		return codeSystemAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemBase() {
		if (codeSystemBaseEClass == null) {
			codeSystemBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				118);
		}
		return codeSystemBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemBase_Header() {
		return (EReference) getCodeSystemBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemBase_Annotations() {
		return (EReference) getCodeSystemBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemBase_PropertyGroup() {
		return (EReference) getCodeSystemBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemBase_ApproxCodeCount() {
		return (EAttribute) getCodeSystemBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemBase_CodeSystemId() {
		return (EAttribute) getCodeSystemBase().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemBase_HasHomonymy() {
		return (EAttribute) getCodeSystemBase().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemBase_HasSynonymy() {
		return (EAttribute) getCodeSystemBase().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemBase_IsCaseSensitive() {
		return (EAttribute) getCodeSystemBase().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemBase_IsWhitespaceSensitive() {
		return (EAttribute) getCodeSystemBase().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemBase_PrimaryLanguage() {
		return (EAttribute) getCodeSystemBase().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemBase_PrimaryRealm() {
		return (EAttribute) getCodeSystemBase().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemBase_Title() {
		return (EAttribute) getCodeSystemBase().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemDocumentation() {
		if (codeSystemDocumentationEClass == null) {
			codeSystemDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				119);
		}
		return codeSystemDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemRef() {
		if (codeSystemRefEClass == null) {
			codeSystemRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				120);
		}
		return codeSystemRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemRef_Oid() {
		return (EAttribute) getCodeSystemRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemSupplement() {
		if (codeSystemSupplementEClass == null) {
			codeSystemSupplementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				121);
		}
		return codeSystemSupplementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemSupplement_CodeSystemVersionSupplement() {
		return (EReference) getCodeSystemSupplement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemSupplement_SupplementId() {
		return (EAttribute) getCodeSystemSupplement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemVersion() {
		if (codeSystemVersionEClass == null) {
			codeSystemVersionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				122);
		}
		return codeSystemVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemVersion_SupportedConceptRelationship() {
		return (EReference) getCodeSystemVersion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemVersion_SupportedConceptProperty() {
		return (EReference) getCodeSystemVersion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemVersion_SupportedCodeProperty() {
		return (EReference) getCodeSystemVersion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemVersion_Concept() {
		return (EReference) getCodeSystemVersion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_CompleteCodesIndicator() {
		return (EAttribute) getCodeSystemVersion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemVersionAnnotations() {
		if (codeSystemVersionAnnotationsEClass == null) {
			codeSystemVersionAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				123);
		}
		return codeSystemVersionAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemVersionAppInfo() {
		if (codeSystemVersionAppInfoEClass == null) {
			codeSystemVersionAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				124);
		}
		return codeSystemVersionAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemVersionBase() {
		if (codeSystemVersionBaseEClass == null) {
			codeSystemVersionBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				125);
		}
		return codeSystemVersionBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemVersionBase_Annotations() {
		return (EReference) getCodeSystemVersionBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemVersionBase_PublicTerminologyServer() {
		return (EReference) getCodeSystemVersionBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersionBase_SupportedLanguage() {
		return (EAttribute) getCodeSystemVersionBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersionBase_Hl7ApprovedIndicator() {
		return (EAttribute) getCodeSystemVersionBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersionBase_Hl7MaintainedIndicator() {
		return (EAttribute) getCodeSystemVersionBase().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersionBase_PublisherVersionId() {
		return (EAttribute) getCodeSystemVersionBase().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersionBase_ReleaseDate() {
		return (EAttribute) getCodeSystemVersionBase().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemVersionDocumentation() {
		if (codeSystemVersionDocumentationEClass == null) {
			codeSystemVersionDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				126);
		}
		return codeSystemVersionDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSystemVersionSupplement() {
		if (codeSystemVersionSupplementEClass == null) {
			codeSystemVersionSupplementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				127);
		}
		return codeSystemVersionSupplementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemVersionSupplement_SupplementalSupportedConceptRelationship() {
		return (EReference) getCodeSystemVersionSupplement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemVersionSupplement_SupplementalSupportedConceptProperty() {
		return (EReference) getCodeSystemVersionSupplement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemVersionSupplement_SupplementalSupportedCodeProperty() {
		return (EReference) getCodeSystemVersionSupplement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeSystemVersionSupplement_ConceptSupplement() {
		return (EReference) getCodeSystemVersionSupplement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersionSupplement_AppliesToReleaseDate() {
		return (EAttribute) getCodeSystemVersionSupplement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSystemVersionSupplement_SortKey() {
		return (EAttribute) getCodeSystemVersionSupplement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeTranslation() {
		if (codeTranslationEClass == null) {
			codeTranslationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				128);
		}
		return codeTranslationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeTranslation_Annotations() {
		return (EReference) getCodeTranslation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeTranslation_SourceConcept() {
		return (EReference) getCodeTranslation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeTranslation_TargetConcept() {
		return (EReference) getCodeTranslation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeTranslation_Quality() {
		return (EAttribute) getCodeTranslation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeTranslation_SortKey() {
		return (EAttribute) getCodeTranslation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeTranslation_TranslatableDirection() {
		return (EAttribute) getCodeTranslation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeTranslationAnnotations() {
		if (codeTranslationAnnotationsEClass == null) {
			codeTranslationAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				129);
		}
		return codeTranslationAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeTranslationAppInfo() {
		if (codeTranslationAppInfoEClass == null) {
			codeTranslationAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				130);
		}
		return codeTranslationAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeTranslationCollection() {
		if (codeTranslationCollectionEClass == null) {
			codeTranslationCollectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				131);
		}
		return codeTranslationCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeTranslationCollection_Header() {
		return (EReference) getCodeTranslationCollection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeTranslationCollection_Annotations() {
		return (EReference) getCodeTranslationCollection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeTranslationCollection_Translation() {
		return (EReference) getCodeTranslationCollection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeTranslationCollection_Title() {
		return (EAttribute) getCodeTranslationCollection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeTranslationCollectionAnnotations() {
		if (codeTranslationCollectionAnnotationsEClass == null) {
			codeTranslationCollectionAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(132);
		}
		return codeTranslationCollectionAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeTranslationCollectionAppInfo() {
		if (codeTranslationCollectionAppInfoEClass == null) {
			codeTranslationCollectionAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(133);
		}
		return codeTranslationCollectionAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeTranslationCollectionDocumentation() {
		if (codeTranslationCollectionDocumentationEClass == null) {
			codeTranslationCollectionDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(134);
		}
		return codeTranslationCollectionDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeTranslationDocumentation() {
		if (codeTranslationDocumentationEClass == null) {
			codeTranslationDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				135);
		}
		return codeTranslationDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedContentDefinition() {
		if (combinedContentDefinitionEClass == null) {
			combinedContentDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				139);
		}
		return combinedContentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedContentDefinition_UnionWithContent() {
		return (EReference) getCombinedContentDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedContentDefinition_IntersectionWithContent() {
		return (EReference) getCombinedContentDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedContentDefinition_ExcludeContent() {
		return (EReference) getCombinedContentDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommitteeReference() {
		if (committeeReferenceEClass == null) {
			committeeReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				140);
		}
		return committeeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommitteeReference_Id() {
		return (EAttribute) getCommitteeReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommitteeReference_Name() {
		return (EAttribute) getCommitteeReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonModelElementDefinition() {
		if (commonModelElementDefinitionEClass == null) {
			commonModelElementDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				141);
		}
		return commonModelElementDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonModelElementDefinition_Annotations() {
		return (EReference) getCommonModelElementDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonModelElementDefinition_BoundStaticModel() {
		return (EReference) getCommonModelElementDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonModelElementDefinition_TemplateParameter() {
		return (EReference) getCommonModelElementDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonModelElementDefinition_EntryClass() {
		return (EReference) getCommonModelElementDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonModelElementDefinition_AttributionLevel() {
		return (EAttribute) getCommonModelElementDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonModelElementDefinition_EntryKind() {
		return (EAttribute) getCommonModelElementDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonModelElementDefinition_Name() {
		return (EAttribute) getCommonModelElementDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonModelElementDefinition_OtherClassName() {
		return (EAttribute) getCommonModelElementDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonModelElementRef() {
		if (commonModelElementRefEClass == null) {
			commonModelElementRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				142);
		}
		return commonModelElementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonModelElementRef_Group() {
		return (EAttribute) getCommonModelElementRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonModelElementRef_Argument() {
		return (EReference) getCommonModelElementRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonModelElementRefAnnotations() {
		if (commonModelElementRefAnnotationsEClass == null) {
			commonModelElementRefAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(143);
		}
		return commonModelElementRefAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonModelElementRefAppInfo() {
		if (commonModelElementRefAppInfoEClass == null) {
			commonModelElementRefAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				144);
		}
		return commonModelElementRefAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonModelElementRefBase() {
		if (commonModelElementRefBaseEClass == null) {
			commonModelElementRefBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				145);
		}
		return commonModelElementRefBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonModelElementRefBase_Annotations() {
		return (EReference) getCommonModelElementRefBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonModelElementRefBase_CmetName() {
		return (EAttribute) getCommonModelElementRefBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonModelElementRefBase_Name() {
		return (EAttribute) getCommonModelElementRefBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonModelElementRefDocumentation() {
		if (commonModelElementRefDocumentationEClass == null) {
			commonModelElementRefDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(146);
		}
		return commonModelElementRefDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexMarkupWithLanguage() {
		if (complexMarkupWithLanguageEClass == null) {
			complexMarkupWithLanguageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				147);
		}
		return complexMarkupWithLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexMarkupWithLanguage_Lang() {
		return (EAttribute) getComplexMarkupWithLanguage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexMarkupWithLanguage_LastTranslated() {
		return (EAttribute) getComplexMarkupWithLanguage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		if (conceptEClass == null) {
			conceptEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				148);
		}
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Annotations() {
		return (EReference) getConcept().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_IntendedUse() {
		return (EReference) getConcept().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_ConceptRelationship() {
		return (EReference) getConcept().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_ConceptProperty() {
		return (EReference) getConcept().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_PrintName() {
		return (EReference) getConcept().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Code() {
		return (EReference) getConcept().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcept_IsSelectable() {
		return (EAttribute) getConcept().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcept_PropertyGroup() {
		return (EAttribute) getConcept().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptAnnotations() {
		if (conceptAnnotationsEClass == null) {
			conceptAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				149);
		}
		return conceptAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptAppInfo() {
		if (conceptAppInfoEClass == null) {
			conceptAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				150);
		}
		return conceptAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptBase() {
		if (conceptBaseEClass == null) {
			conceptBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				151);
		}
		return conceptBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptBase_HistoryItem() {
		return (EReference) getConceptBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptBase_EffectiveDate() {
		return (EAttribute) getConceptBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptDocumentation() {
		if (conceptDocumentationEClass == null) {
			conceptDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				152);
		}
		return conceptDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptDomain() {
		if (conceptDomainEClass == null) {
			conceptDomainEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				153);
		}
		return conceptDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptDomain_BusinessName() {
		return (EReference) getConceptDomain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptDomain_Annotations() {
		return (EReference) getConceptDomain().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptDomain_SpecializesDomain() {
		return (EReference) getConceptDomain().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomain_ExampleConcept() {
		return (EAttribute) getConceptDomain().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptDomain_Property() {
		return (EReference) getConceptDomain().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptDomain_SpecializedByDomain() {
		return (EReference) getConceptDomain().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomain_IsBindable() {
		return (EAttribute) getConceptDomain().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomain_Name() {
		return (EAttribute) getConceptDomain().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomain_SortKey() {
		return (EAttribute) getConceptDomain().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptDomainAnnotations() {
		if (conceptDomainAnnotationsEClass == null) {
			conceptDomainAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				154);
		}
		return conceptDomainAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptDomainAppInfo() {
		if (conceptDomainAppInfoEClass == null) {
			conceptDomainAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				155);
		}
		return conceptDomainAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptDomainDocumentation() {
		if (conceptDomainDocumentationEClass == null) {
			conceptDomainDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				156);
		}
		return conceptDomainDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptDomainProperty() {
		if (conceptDomainPropertyEClass == null) {
			conceptDomainPropertyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				157);
		}
		return conceptDomainPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomainProperty_Name() {
		return (EAttribute) getConceptDomainProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomainProperty_Value() {
		return (EAttribute) getConceptDomainProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptDomainRef() {
		if (conceptDomainRefEClass == null) {
			conceptDomainRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				160);
		}
		return conceptDomainRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptDomainRef_Name() {
		return (EAttribute) getConceptDomainRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptProperty() {
		if (conceptPropertyEClass == null) {
			conceptPropertyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				161);
		}
		return conceptPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptProperty_Name() {
		return (EAttribute) getConceptProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptProperty_Value() {
		return (EAttribute) getConceptProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptPropertyRef() {
		if (conceptPropertyRefEClass == null) {
			conceptPropertyRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				162);
		}
		return conceptPropertyRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptPropertyRef_Expression() {
		return (EAttribute) getConceptPropertyRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptPropertyRef_Name() {
		return (EAttribute) getConceptPropertyRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptPropertyRef_Value() {
		return (EAttribute) getConceptPropertyRef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptRef() {
		if (conceptRefEClass == null) {
			conceptRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				165);
		}
		return conceptRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptRef_CodeProperty() {
		return (EReference) getConceptRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptRef_Code() {
		return (EAttribute) getConceptRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptRef_CodeSystem() {
		return (EAttribute) getConceptRef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptRelationship() {
		if (conceptRelationshipEClass == null) {
			conceptRelationshipEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				166);
		}
		return conceptRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptRelationship_Property() {
		return (EReference) getConceptRelationship().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptRelationship_TargetConcept() {
		return (EReference) getConceptRelationship().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptRelationship_IsDerived() {
		return (EAttribute) getConceptRelationship().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptRelationship_RelationshipName() {
		return (EAttribute) getConceptRelationship().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptSupplement() {
		if (conceptSupplementEClass == null) {
			conceptSupplementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				169);
		}
		return conceptSupplementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptSupplement_Annotations() {
		return (EReference) getConceptSupplement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptSupplement_SupplementalConceptRelationship() {
		return (EReference) getConceptSupplement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptSupplement_SupplementalConceptProperty() {
		return (EReference) getConceptSupplement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptSupplement_PrintName() {
		return (EReference) getConceptSupplement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptSupplement_CodeSupplement() {
		return (EReference) getConceptSupplement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptSupplement_Code() {
		return (EAttribute) getConceptSupplement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptSupplementAnnotations() {
		if (conceptSupplementAnnotationsEClass == null) {
			conceptSupplementAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				170);
		}
		return conceptSupplementAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptSupplementAppInfo() {
		if (conceptSupplementAppInfoEClass == null) {
			conceptSupplementAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				171);
		}
		return conceptSupplementAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptSupplementDocumentation() {
		if (conceptSupplementDocumentationEClass == null) {
			conceptSupplementDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				172);
		}
		return conceptSupplementDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptUse() {
		if (conceptUseEClass == null) {
			conceptUseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				173);
		}
		return conceptUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptUse_Value() {
		return (EAttribute) getConceptUse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceProfile() {
		if (conformanceProfileEClass == null) {
			conformanceProfileEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				178);
		}
		return conformanceProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfile_Annotations() {
		return (EReference) getConformanceProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfile_Storyboards() {
		return (EReference) getConformanceProfile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfile_ImplementationConstraints() {
		return (EReference) getConformanceProfile().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfile_SupportedApplicationRoles() {
		return (EReference) getConformanceProfile().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfile_SupportedTriggerEvents() {
		return (EReference) getConformanceProfile().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfile_SupportedAppRoleInteractions() {
		return (EReference) getConformanceProfile().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfile_UnsupportedAppRoleInteractions() {
		return (EReference) getConformanceProfile().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfile_ExtraInteractions() {
		return (EReference) getConformanceProfile().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfile_SupportedAppRoleDocuments() {
		return (EReference) getConformanceProfile().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfile_UnsupportedAppRoleDocuments() {
		return (EReference) getConformanceProfile().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfile_ExtraDocuments() {
		return (EReference) getConformanceProfile().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceProfileAnnotations() {
		if (conformanceProfileAnnotationsEClass == null) {
			conformanceProfileAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				179);
		}
		return conformanceProfileAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileAnnotations_Documentation() {
		return (EReference) getConformanceProfileAnnotations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileAnnotations_AppInfo() {
		return (EReference) getConformanceProfileAnnotations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceProfileAppInfo() {
		if (conformanceProfileAppInfoEClass == null) {
			conformanceProfileAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				180);
		}
		return conformanceProfileAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileAppInfo_ChangeRequest() {
		return (EReference) getConformanceProfileAppInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileAppInfo_DeprecationInfo() {
		return (EReference) getConformanceProfileAppInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceProfileDocumentation() {
		if (conformanceProfileDocumentationEClass == null) {
			conformanceProfileDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				181);
		}
		return conformanceProfileDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileDocumentation_Description() {
		return (EReference) getConformanceProfileDocumentation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileDocumentation_UsageConstraint() {
		return (EReference) getConformanceProfileDocumentation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileDocumentation_UsageNotes() {
		return (EReference) getConformanceProfileDocumentation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileDocumentation_Rationale() {
		return (EReference) getConformanceProfileDocumentation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileDocumentation_Requirements() {
		return (EReference) getConformanceProfileDocumentation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileDocumentation_DesignComments() {
		return (EReference) getConformanceProfileDocumentation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileDocumentation_StabilityRemarks() {
		return (EReference) getConformanceProfileDocumentation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileDocumentation_Walkthrough() {
		return (EReference) getConformanceProfileDocumentation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileDocumentation_OpenIssue() {
		return (EReference) getConformanceProfileDocumentation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileDocumentation_OtherAnnotation() {
		return (EReference) getConformanceProfileDocumentation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceProfileDocumentation_Appendix() {
		return (EReference) getConformanceProfileDocumentation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceTriggerEvents() {
		if (conformanceTriggerEventsEClass == null) {
			conformanceTriggerEventsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				182);
		}
		return conformanceTriggerEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceTriggerEvents_InternalMapping() {
		return (EReference) getConformanceTriggerEvents().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceTriggerEvents_Interaction() {
		return (EReference) getConformanceTriggerEvents().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceTriggerEvents_StateTransition() {
		return (EReference) getConformanceTriggerEvents().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceTriggerEvents_EnvironmentalOccurrence() {
		return (EReference) getConformanceTriggerEvents().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainedGraphNode() {
		if (containedGraphNodeEClass == null) {
			containedGraphNodeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				185);
		}
		return containedGraphNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedGraphNode_ShapeTemplate() {
		return (EAttribute) getContainedGraphNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentDefinition() {
		if (contentDefinitionEClass == null) {
			contentDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				186);
		}
		return contentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentDefinition_Annotations() {
		return (EReference) getContentDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentDefinition_CombinedContent() {
		return (EReference) getContentDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentDefinition_CodeBasedContent() {
		return (EReference) getContentDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentDefinition_PropertyBasedContent() {
		return (EReference) getContentDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentDefinition_CodeFilterContent() {
		return (EReference) getContentDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentDefinition_NonComputableContent() {
		return (EReference) getContentDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentDefinition_ValueSetRef() {
		return (EReference) getContentDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentDefinition_AllowedQualifiers() {
		return (EReference) getContentDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentDefinition_ProhibitedQualifiers() {
		return (EReference) getContentDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentDefinition_AreBaseQualifiersUnlimited() {
		return (EAttribute) getContentDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentDefinition_CodeSystem() {
		return (EAttribute) getContentDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentDefinition_VersionDate() {
		return (EAttribute) getContentDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentDefinitionAnnotations() {
		if (contentDefinitionAnnotationsEClass == null) {
			contentDefinitionAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				187);
		}
		return contentDefinitionAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentDefinitionAppInfo() {
		if (contentDefinitionAppInfoEClass == null) {
			contentDefinitionAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				188);
		}
		return contentDefinitionAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentDefinitionDocumentation() {
		if (contentDefinitionDocumentationEClass == null) {
			contentDefinitionDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				189);
		}
		return contentDefinitionDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextAnnotation() {
		if (contextAnnotationEClass == null) {
			contextAnnotationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				192);
		}
		return contextAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextAnnotation_Context() {
		return (EAttribute) getContextAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextAnnotation_RealmNamespace() {
		return (EReference) getContextAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextBinding() {
		if (contextBindingEClass == null) {
			contextBindingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				193);
		}
		return contextBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextBinding_BindingPriority() {
		return (EAttribute) getContextBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextBinding_BindingRealmName() {
		return (EAttribute) getContextBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextBinding_CodingStrength() {
		return (EAttribute) getContextBinding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextBinding_ConceptDomain() {
		return (EAttribute) getContextBinding().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextBinding_EffectiveDate() {
		return (EAttribute) getContextBinding().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextBinding_ExpiryDate() {
		return (EAttribute) getContextBinding().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextBinding_IgnoredValueSet() {
		return (EAttribute) getContextBinding().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextBinding_MinimumValueSet() {
		return (EAttribute) getContextBinding().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextBinding_SortKey() {
		return (EAttribute) getContextBinding().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextBinding_ValueSet() {
		return (EAttribute) getContextBinding().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextBinding_VersionDate() {
		return (EAttribute) getContextBinding().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextBinding_VersionTime() {
		return (EAttribute) getContextBinding().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContributor() {
		if (contributorEClass == null) {
			contributorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				194);
		}
		return contributorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContributor_Role() {
		return (EAttribute) getContributor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContributor_Name() {
		return (EReference) getContributor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContributor_Affiliation() {
		return (EAttribute) getContributor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContributor_Email() {
		return (EAttribute) getContributor().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContributor_Notes() {
		return (EAttribute) getContributor().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatype() {
		if (datatypeEClass == null) {
			datatypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				195);
		}
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatype_DerivedFrom() {
		return (EReference) getDatatype().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatype_HasDerivations() {
		return (EReference) getDatatype().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatype_Annotations() {
		return (EReference) getDatatype().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatype_EnumerationValue() {
		return (EAttribute) getDatatype().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatype_Parameter() {
		return (EReference) getDatatype().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatype_Binding() {
		return (EReference) getDatatype().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatype_ChildDatatype() {
		return (EReference) getDatatype().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatype_ParentDatatype() {
		return (EReference) getDatatype().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatype_Property() {
		return (EReference) getDatatype().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatype_DatatypeKind() {
		return (EAttribute) getDatatype().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatype_IsAbstract() {
		return (EAttribute) getDatatype().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatype_Name() {
		return (EAttribute) getDatatype().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatype_Title() {
		return (EAttribute) getDatatype().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatype_Visibility() {
		return (EAttribute) getDatatype().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeAnnotations() {
		if (datatypeAnnotationsEClass == null) {
			datatypeAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				196);
		}
		return datatypeAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeAppInfo() {
		if (datatypeAppInfoEClass == null) {
			datatypeAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				197);
		}
		return datatypeAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeBinding() {
		if (datatypeBindingEClass == null) {
			datatypeBindingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				198);
		}
		return datatypeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeBinding_TargetDatatype() {
		return (EReference) getDatatypeBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeBinding_ArgumentDatatype() {
		return (EReference) getDatatypeBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDerivation() {
		if (datatypeDerivationEClass == null) {
			datatypeDerivationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				199);
		}
		return datatypeDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDerivation_TargetDatatype() {
		return (EReference) getDatatypeDerivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDocumentation() {
		if (datatypeDocumentationEClass == null) {
			datatypeDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				200);
		}
		return datatypeDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeImport() {
		if (datatypeImportEClass == null) {
			datatypeImportEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				201);
		}
		return datatypeImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeImport_Alias() {
		return (EAttribute) getDatatypeImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeImport_Visibility() {
		return (EAttribute) getDatatypeImport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeLimitation() {
		if (datatypeLimitationEClass == null) {
			datatypeLimitationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				204);
		}
		return datatypeLimitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeLimitation_DefinedDatatype() {
		return (EReference) getDatatypeLimitation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeLimitation_SubstituteDatatype() {
		return (EReference) getDatatypeLimitation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeModelLibrary() {
		if (datatypeModelLibraryEClass == null) {
			datatypeModelLibraryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				205);
		}
		return datatypeModelLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeModelLibrary_ImportedVocabularyModelPackage() {
		return (EReference) getDatatypeModelLibrary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeModelLibrary_ImportDatatypeModelLibrary() {
		return (EReference) getDatatypeModelLibrary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeModelLibrary_ImportAnnotationLibrary() {
		return (EReference) getDatatypeModelLibrary().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeModelLibrary_Datatype() {
		return (EReference) getDatatypeModelLibrary().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeOperation() {
		if (datatypeOperationEClass == null) {
			datatypeOperationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				207);
		}
		return datatypeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeOperation_BusinessName() {
		return (EReference) getDatatypeOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeOperation_Annotations() {
		return (EReference) getDatatypeOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeOperation_DerivedFrom() {
		return (EReference) getDatatypeOperation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeOperation_Parameter() {
		return (EReference) getDatatypeOperation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeOperation_Type() {
		return (EReference) getDatatypeOperation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeOperation_VocabularySpecification() {
		return (EReference) getDatatypeOperation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeOperation_MaximumMultiplicity() {
		return (EAttribute) getDatatypeOperation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeOperation_MinimumMultiplicity() {
		return (EAttribute) getDatatypeOperation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeOperation_Name() {
		return (EAttribute) getDatatypeOperation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeOperation_OwnerScope() {
		return (EAttribute) getDatatypeOperation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeOperation_PropertyKind() {
		return (EAttribute) getDatatypeOperation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeOperation_SortKey() {
		return (EAttribute) getDatatypeOperation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeOperation_Visibility() {
		return (EAttribute) getDatatypeOperation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeParameter() {
		if (datatypeParameterEClass == null) {
			datatypeParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				210);
		}
		return datatypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeParameter_Type() {
		return (EReference) getDatatypeParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeParameter_DefaultValue() {
		return (EReference) getDatatypeParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeParameter_Name() {
		return (EAttribute) getDatatypeParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeParameter_SortKey() {
		return (EAttribute) getDatatypeParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeRef() {
		if (datatypeRefEClass == null) {
			datatypeRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				213);
		}
		return datatypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeRef_ArgumentDatatype() {
		return (EReference) getDatatypeRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeRef_Name() {
		return (EAttribute) getDatatypeRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeRef_Qualifier() {
		return (EAttribute) getDatatypeRef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeTemplateParameter() {
		if (datatypeTemplateParameterEClass == null) {
			datatypeTemplateParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				214);
		}
		return datatypeTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeTemplateParameter_ParameterName() {
		return (EAttribute) getDatatypeTemplateParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		if (dependencyEClass == null) {
			dependencyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				224);
		}
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeprecationInfo() {
		if (deprecationInfoEClass == null) {
			deprecationInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				225);
		}
		return deprecationInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeprecationInfo_DerivationSupplier() {
		return (EReference) getDeprecationInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeprecationInfo_DeprecationEffectiveVersion() {
		return (EAttribute) getDeprecationInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivation() {
		if (derivationEClass == null) {
			derivationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				226);
		}
		return derivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivation_Reason() {
		return (EReference) getDerivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivation_AnnotationsReviewedBy() {
		return (EAttribute) getDerivation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivation_AreAnnotationsReviewed() {
		return (EAttribute) getDerivation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivation_Relationship() {
		return (EAttribute) getDerivation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedStaticModel() {
		if (derivedStaticModelEClass == null) {
			derivedStaticModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				229);
		}
		return derivedStaticModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedStaticModel_OriginalArtifact() {
		return (EReference) getDerivedStaticModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedStaticModel_Change() {
		return (EReference) getDerivedStaticModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedStaticModelsType() {
		if (derivedStaticModelsTypeEClass == null) {
			derivedStaticModelsTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				230);
		}
		return derivedStaticModelsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedStaticModelsType_DerivedStaticModel() {
		return (EReference) getDerivedStaticModelsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedStaticModelsType_SchemaVersion() {
		return (EAttribute) getDerivedStaticModelsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignComment() {
		if (designCommentEClass == null) {
			designCommentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				231);
		}
		return designCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignComment_Tag() {
		return (EAttribute) getDesignComment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		if (diagramEClass == null) {
			diagramEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				234);
		}
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Name() {
		return (EAttribute) getDiagram().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramElement() {
		if (diagramElementEClass == null) {
			diagramElementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				235);
		}
		return diagramElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramElement_LastAdjustedDateTime() {
		return (EAttribute) getDiagramElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramElement_ShapeId() {
		return (EAttribute) getDiagramElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramGraphicInformation() {
		if (diagramGraphicInformationEClass == null) {
			diagramGraphicInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				236);
		}
		return diagramGraphicInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramGraphicInformation_GraphElement() {
		return (EReference) getDiagramGraphicInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		if (dimensionEClass == null) {
			dimensionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				237);
		}
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Height() {
		return (EAttribute) getDimension().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Width() {
		return (EAttribute) getDimension().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentation() {
		if (documentationEClass == null) {
			documentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				238);
		}
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_Definition() {
		return (EReference) getDocumentation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_Description() {
		return (EReference) getDocumentation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_UsageConstraint() {
		return (EReference) getDocumentation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_UsageNotes() {
		return (EReference) getDocumentation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_Rationale() {
		return (EReference) getDocumentation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_Requirements() {
		return (EReference) getDocumentation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_DesignComments() {
		return (EReference) getDocumentation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_StabilityRemarks() {
		return (EReference) getDocumentation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_Walkthrough() {
		return (EReference) getDocumentation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_Appendix() {
		return (EReference) getDocumentation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_OtherAnnotation() {
		return (EReference) getDocumentation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentProfile() {
		if (documentProfileEClass == null) {
			documentProfileEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				239);
		}
		return documentProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfile_Annotations() {
		return (EReference) getDocumentProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfile_Document() {
		return (EReference) getDocumentProfile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfile_ImplementationConstraints() {
		return (EReference) getDocumentProfile().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfile_EffectiveStaticModel() {
		return (EReference) getDocumentProfile().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentProfile_ProfileType() {
		return (EAttribute) getDocumentProfile().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentProfileAnnotations() {
		if (documentProfileAnnotationsEClass == null) {
			documentProfileAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				240);
		}
		return documentProfileAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileAnnotations_Documentation() {
		return (EReference) getDocumentProfileAnnotations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileAnnotations_AppInfo() {
		return (EReference) getDocumentProfileAnnotations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentProfileAppInfo() {
		if (documentProfileAppInfoEClass == null) {
			documentProfileAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				241);
		}
		return documentProfileAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileAppInfo_ChangeRequest() {
		return (EReference) getDocumentProfileAppInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileAppInfo_DeprecationInfo() {
		return (EReference) getDocumentProfileAppInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentProfileDocumentation() {
		if (documentProfileDocumentationEClass == null) {
			documentProfileDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				242);
		}
		return documentProfileDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileDocumentation_Description() {
		return (EReference) getDocumentProfileDocumentation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileDocumentation_UsageConstraint() {
		return (EReference) getDocumentProfileDocumentation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileDocumentation_UsageNotes() {
		return (EReference) getDocumentProfileDocumentation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileDocumentation_Rationale() {
		return (EReference) getDocumentProfileDocumentation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileDocumentation_Requirements() {
		return (EReference) getDocumentProfileDocumentation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileDocumentation_DesignComments() {
		return (EReference) getDocumentProfileDocumentation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileDocumentation_StabilityRemarks() {
		return (EReference) getDocumentProfileDocumentation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileDocumentation_Walkthrough() {
		return (EReference) getDocumentProfileDocumentation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileDocumentation_OpenIssue() {
		return (EReference) getDocumentProfileDocumentation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileDocumentation_OtherAnnotation() {
		return (EReference) getDocumentProfileDocumentation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentProfileDocumentation_Appendix() {
		return (EReference) getDocumentProfileDocumentation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				245);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute) getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ApplicationRole() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ArtifactXrefSummary() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CodeSystem() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CodeSystemSupplement() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConformanceProfile() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DatatypeModelLibrary() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DerivedStaticModel() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DerivedStaticModels() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DomainAnalysisModel() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DomainInstanceExample() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FreehandDocument() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Glossary() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Interaction() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InteractionProfile() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MifChanges() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Package() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Publication() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SerializedStaticModel() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SerializedStaticModels() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StaticModel() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StaticModelInterfacePackage() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StaticModels() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Storyboard() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StructuredDocument() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TestScenario() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TriggerEvent() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TxtComplex() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TxtComplexWithLanguage() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TxtInlineOnly() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueSet() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VocabularyModel() {
		return (EReference) getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentTest() {
		if (documentTestEClass == null) {
			documentTestEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				246);
		}
		return documentTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentTest_Document() {
		return (EReference) getDocumentTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentTest_ExampleContent() {
		return (EReference) getDocumentTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTest_ConsumingSystem() {
		return (EAttribute) getDocumentTest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTest_CreatingSystem() {
		return (EAttribute) getDocumentTest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentTest_ExampleFile() {
		return (EAttribute) getDocumentTest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainAnalysisModel() {
		if (domainAnalysisModelEClass == null) {
			domainAnalysisModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				247);
		}
		return domainAnalysisModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModel_Annotations() {
		return (EReference) getDomainAnalysisModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModel_Model() {
		return (EReference) getDomainAnalysisModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainAnalysisModelAnnotations() {
		if (domainAnalysisModelAnnotationsEClass == null) {
			domainAnalysisModelAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				248);
		}
		return domainAnalysisModelAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelAnnotations_Documentation() {
		return (EReference) getDomainAnalysisModelAnnotations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelAnnotations_AppInfo() {
		return (EReference) getDomainAnalysisModelAnnotations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainAnalysisModelAppInfo() {
		if (domainAnalysisModelAppInfoEClass == null) {
			domainAnalysisModelAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				249);
		}
		return domainAnalysisModelAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelAppInfo_Mapping() {
		return (EReference) getDomainAnalysisModelAppInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelAppInfo_FormalConstraint() {
		return (EReference) getDomainAnalysisModelAppInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelAppInfo_StaticExample() {
		return (EReference) getDomainAnalysisModelAppInfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelAppInfo_BallotComment() {
		return (EReference) getDomainAnalysisModelAppInfo().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelAppInfo_ChangeRequest() {
		return (EReference) getDomainAnalysisModelAppInfo().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelAppInfo_DeprecationInfo() {
		return (EReference) getDomainAnalysisModelAppInfo().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainAnalysisModelDocumentation() {
		if (domainAnalysisModelDocumentationEClass == null) {
			domainAnalysisModelDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(250);
		}
		return domainAnalysisModelDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelDocumentation_Description() {
		return (EReference) getDomainAnalysisModelDocumentation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelDocumentation_Requirements() {
		return (EReference) getDomainAnalysisModelDocumentation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelDocumentation_DesignComments() {
		return (EReference) getDomainAnalysisModelDocumentation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelDocumentation_StabilityRemarks() {
		return (EReference) getDomainAnalysisModelDocumentation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelDocumentation_Walkthrough() {
		return (EReference) getDomainAnalysisModelDocumentation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelDocumentation_OpenIssue() {
		return (EReference) getDomainAnalysisModelDocumentation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelDocumentation_OtherAnnotation() {
		return (EReference) getDomainAnalysisModelDocumentation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAnalysisModelDocumentation_Appendix() {
		return (EReference) getDomainAnalysisModelDocumentation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainInstanceExample() {
		if (domainInstanceExampleEClass == null) {
			domainInstanceExampleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				251);
		}
		return domainInstanceExampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExample_Annotations() {
		return (EReference) getDomainInstanceExample().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExample_Model() {
		return (EReference) getDomainInstanceExample().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainInstanceExampleAnnotations() {
		if (domainInstanceExampleAnnotationsEClass == null) {
			domainInstanceExampleAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(252);
		}
		return domainInstanceExampleAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExampleAnnotations_Documentation() {
		return (EReference) getDomainInstanceExampleAnnotations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExampleAnnotations_AppInfo() {
		return (EReference) getDomainInstanceExampleAnnotations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainInstanceExampleAppInfo() {
		if (domainInstanceExampleAppInfoEClass == null) {
			domainInstanceExampleAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				253);
		}
		return domainInstanceExampleAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExampleAppInfo_BallotComment() {
		return (EReference) getDomainInstanceExampleAppInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExampleAppInfo_ChangeRequest() {
		return (EReference) getDomainInstanceExampleAppInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainInstanceExampleDocumentation() {
		if (domainInstanceExampleDocumentationEClass == null) {
			domainInstanceExampleDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(254);
		}
		return domainInstanceExampleDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExampleDocumentation_Definition() {
		return (EReference) getDomainInstanceExampleDocumentation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExampleDocumentation_Rationale() {
		return (EReference) getDomainInstanceExampleDocumentation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExampleDocumentation_Requirements() {
		return (EReference) getDomainInstanceExampleDocumentation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExampleDocumentation_DesignComments() {
		return (EReference) getDomainInstanceExampleDocumentation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExampleDocumentation_StabilityRemarks() {
		return (EReference) getDomainInstanceExampleDocumentation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExampleDocumentation_Walkthrough() {
		return (EReference) getDomainInstanceExampleDocumentation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExampleDocumentation_OpenIssue() {
		return (EReference) getDomainInstanceExampleDocumentation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainInstanceExampleDocumentation_OtherAnnotation() {
		return (EReference) getDomainInstanceExampleDocumentation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementChange() {
		if (elementChangeEClass == null) {
			elementChangeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				261);
		}
		return elementChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementChange_ChangeItems() {
		return (EAttribute) getElementChange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementChange_AddAttribute() {
		return (EReference) getElementChange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementChange_AddElement() {
		return (EReference) getElementChange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementChange_RemoveAttribute() {
		return (EReference) getElementChange().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementChange_ReplaceAttribute() {
		return (EReference) getElementChange().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementChange_RemoveElement() {
		return (EReference) getElementChange().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementChange_ReplaceElement() {
		return (EReference) getElementChange().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementChange_ChangeElement() {
		return (EReference) getElementChange().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementChange_ChangeGroup() {
		return (EReference) getElementChange().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDerivation() {
		if (elementDerivationEClass == null) {
			elementDerivationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				262);
		}
		return elementDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDerivation_SourceArtifact() {
		return (EReference) getElementDerivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementRef() {
		if (elementRefEClass == null) {
			elementRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				263);
		}
		return elementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementRef_ContextRef() {
		return (EAttribute) getElementRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementRef_ContextElement() {
		return (EReference) getElementRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementRef_ContextAttribute() {
		return (EReference) getElementRef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementRef_Name() {
		return (EAttribute) getElementRef().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementRef_Repetition() {
		return (EAttribute) getElementRef().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementValueRef() {
		if (elementValueRefEClass == null) {
			elementValueRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				264);
		}
		return elementValueRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementValueRef_Value() {
		return (EAttribute) getElementValueRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPoint() {
		if (entryPointEClass == null) {
			entryPointEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				266);
		}
		return entryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPoint_ClassName() {
		return (EAttribute) getEntryPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPointAnnotations() {
		if (entryPointAnnotationsEClass == null) {
			entryPointAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				267);
		}
		return entryPointAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPointAppInfo() {
		if (entryPointAppInfoEClass == null) {
			entryPointAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				268);
		}
		return entryPointAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPointBase() {
		if (entryPointBaseEClass == null) {
			entryPointBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				269);
		}
		return entryPointBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPointBase_Annotations() {
		return (EReference) getEntryPointBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPointBase_GraphicLinkId() {
		return (EAttribute) getEntryPointBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPointBase_Id() {
		return (EAttribute) getEntryPointBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPointBase_Name() {
		return (EAttribute) getEntryPointBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPointBase_UseKind() {
		return (EAttribute) getEntryPointBase().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPointDocumentation() {
		if (entryPointDocumentationEClass == null) {
			entryPointDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				270);
		}
		return entryPointDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentalOccurrence() {
		if (environmentalOccurrenceEClass == null) {
			environmentalOccurrenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				273);
		}
		return environmentalOccurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentalOccurrence_Text() {
		return (EReference) getEnvironmentalOccurrence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentalOccurrence_RelatedStateTransition() {
		return (EReference) getEnvironmentalOccurrence().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExampleInteraction() {
		if (exampleInteractionEClass == null) {
			exampleInteractionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				274);
		}
		return exampleInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleInteraction_Interaction() {
		return (EReference) getExampleInteraction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExampleInteraction_ReceivingSystem() {
		return (EAttribute) getExampleInteraction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExampleInteraction_SendingSystem() {
		return (EAttribute) getExampleInteraction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExampleInteraction_Sequence() {
		return (EAttribute) getExampleInteraction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExampleSystem() {
		if (exampleSystemEClass == null) {
			exampleSystemEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				275);
		}
		return exampleSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleSystem_ApplicationRole() {
		return (EReference) getExampleSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExampleSystem_Name() {
		return (EAttribute) getExampleSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExampleType() {
		if (exampleTypeEClass == null) {
			exampleTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				276);
		}
		return exampleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExampleType_Any() {
		return (EAttribute) getExampleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		if (featureEClass == null) {
			featureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				279);
		}
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_EnumerationValue() {
		return (EAttribute) getFeature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_AllowedRange() {
		return (EReference) getFeature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Conformance() {
		return (EAttribute) getFeature().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_DefaultFrom() {
		return (EAttribute) getFeature().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_DefaultValue() {
		return (EAttribute) getFeature().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_FixedValue() {
		return (EAttribute) getFeature().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsMandatory() {
		return (EAttribute) getFeature().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_MaximumLength() {
		return (EAttribute) getFeature().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_MinimumLength() {
		return (EAttribute) getFeature().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlatClass() {
		if (flatClassEClass == null) {
			flatClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				282);
		}
		return flatClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlatClass_ChildClass() {
		return (EReference) getFlatClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlatClass_ParentClass() {
		return (EReference) getFlatClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalConstraint() {
		if (formalConstraintEClass == null) {
			formalConstraintEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				283);
		}
		return formalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalConstraint_BusinessName() {
		return (EReference) getFormalConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalConstraint_DerivationSupplier() {
		return (EReference) getFormalConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalConstraint_Body() {
		return (EReference) getFormalConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalConstraint_AlternateFormalExpression() {
		return (EReference) getFormalConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalConstraint_Name() {
		return (EAttribute) getFormalConstraint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalExpression() {
		if (formalExpressionEClass == null) {
			formalExpressionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				284);
		}
		return formalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalExpression_Encoding() {
		return (EAttribute) getFormalExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeFormMarkupWithLanguage() {
		if (freeFormMarkupWithLanguageEClass == null) {
			freeFormMarkupWithLanguageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				287);
		}
		return freeFormMarkupWithLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeFormMarkupWithLanguage_Lang() {
		return (EAttribute) getFreeFormMarkupWithLanguage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeFormMarkupWithLanguage_LastTranslated() {
		return (EAttribute) getFreeFormMarkupWithLanguage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeFormMarkupWithLanguage_MimeType() {
		return (EAttribute) getFreeFormMarkupWithLanguage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreehandDocument() {
		if (freehandDocumentEClass == null) {
			freehandDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				288);
		}
		return freehandDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandDocument_Annotations() {
		return (EReference) getFreehandDocument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandDocument_DocumentContent() {
		return (EReference) getFreehandDocument().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreehandDocumentAnnotations() {
		if (freehandDocumentAnnotationsEClass == null) {
			freehandDocumentAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				289);
		}
		return freehandDocumentAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandDocumentAnnotations_Documentation() {
		return (EReference) getFreehandDocumentAnnotations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandDocumentAnnotations_AppInfo() {
		return (EReference) getFreehandDocumentAnnotations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreehandDocumentAppInfo() {
		if (freehandDocumentAppInfoEClass == null) {
			freehandDocumentAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				290);
		}
		return freehandDocumentAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandDocumentAppInfo_BallotComment() {
		return (EReference) getFreehandDocumentAppInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandDocumentAppInfo_ChangeRequest() {
		return (EReference) getFreehandDocumentAppInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreehandDocumentDocumentation() {
		if (freehandDocumentDocumentationEClass == null) {
			freehandDocumentDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				291);
		}
		return freehandDocumentDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandDocumentDocumentation_Description() {
		return (EReference) getFreehandDocumentDocumentation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandDocumentDocumentation_Rationale() {
		return (EReference) getFreehandDocumentDocumentation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandDocumentDocumentation_Requirements() {
		return (EReference) getFreehandDocumentDocumentation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandDocumentDocumentation_Walkthrough() {
		return (EReference) getFreehandDocumentDocumentation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandDocumentDocumentation_OpenIssue() {
		return (EReference) getFreehandDocumentDocumentation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreehandDocumentDocumentation_OtherAnnotation() {
		return (EReference) getFreehandDocumentDocumentation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationAnnotations() {
		if (generalizationAnnotationsEClass == null) {
			generalizationAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				294);
		}
		return generalizationAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationAppInfo() {
		if (generalizationAppInfoEClass == null) {
			generalizationAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				295);
		}
		return generalizationAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationDocumentation() {
		if (generalizationDocumentationEClass == null) {
			generalizationDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				296);
		}
		return generalizationDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericPackage() {
		if (genericPackageEClass == null) {
			genericPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				297);
		}
		return genericPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericPackage_Annotations() {
		return (EReference) getGenericPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericPackage_Content() {
		return (EReference) getGenericPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericPackage_IsComplete() {
		return (EAttribute) getGenericPackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalApplicationRole() {
		if (globalApplicationRoleEClass == null) {
			globalApplicationRoleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				298);
		}
		return globalApplicationRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalApplicationRole_SchemaVersion() {
		return (EAttribute) getGlobalApplicationRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalArtifactXRefSummary() {
		if (globalArtifactXRefSummaryEClass == null) {
			globalArtifactXRefSummaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				299);
		}
		return globalArtifactXRefSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalArtifactXRefSummary_SchemaVersion() {
		return (EAttribute) getGlobalArtifactXRefSummary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalCodeSystem() {
		if (globalCodeSystemEClass == null) {
			globalCodeSystemEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				300);
		}
		return globalCodeSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalCodeSystem_SchemaVersion() {
		return (EAttribute) getGlobalCodeSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalCodeSystemSupplement() {
		if (globalCodeSystemSupplementEClass == null) {
			globalCodeSystemSupplementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				301);
		}
		return globalCodeSystemSupplementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalCodeSystemSupplement_SchemaVersion() {
		return (EAttribute) getGlobalCodeSystemSupplement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalConformanceProfile() {
		if (globalConformanceProfileEClass == null) {
			globalConformanceProfileEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				302);
		}
		return globalConformanceProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalConformanceProfile_SchemaVersion() {
		return (EAttribute) getGlobalConformanceProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalDatatypeModelLibrary() {
		if (globalDatatypeModelLibraryEClass == null) {
			globalDatatypeModelLibraryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				303);
		}
		return globalDatatypeModelLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalDatatypeModelLibrary_SchemaVersion() {
		return (EAttribute) getGlobalDatatypeModelLibrary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalDerivedStaticModel() {
		if (globalDerivedStaticModelEClass == null) {
			globalDerivedStaticModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				304);
		}
		return globalDerivedStaticModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalDerivedStaticModel_SchemaVersion() {
		return (EAttribute) getGlobalDerivedStaticModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalDomainAnalysisModel() {
		if (globalDomainAnalysisModelEClass == null) {
			globalDomainAnalysisModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				305);
		}
		return globalDomainAnalysisModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalDomainAnalysisModel_SchemaVersion() {
		return (EAttribute) getGlobalDomainAnalysisModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalDomainInstanceExample() {
		if (globalDomainInstanceExampleEClass == null) {
			globalDomainInstanceExampleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				306);
		}
		return globalDomainInstanceExampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalDomainInstanceExample_SchemaVersion() {
		return (EAttribute) getGlobalDomainInstanceExample().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalFreehandDocument() {
		if (globalFreehandDocumentEClass == null) {
			globalFreehandDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				307);
		}
		return globalFreehandDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalFreehandDocument_SchemaVersion() {
		return (EAttribute) getGlobalFreehandDocument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalGenericPackage() {
		if (globalGenericPackageEClass == null) {
			globalGenericPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				308);
		}
		return globalGenericPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalGenericPackage_SchemaVersion() {
		return (EAttribute) getGlobalGenericPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalGlossary() {
		if (globalGlossaryEClass == null) {
			globalGlossaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				309);
		}
		return globalGlossaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalGlossary_SchemaVersion() {
		return (EAttribute) getGlobalGlossary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalInteraction() {
		if (globalInteractionEClass == null) {
			globalInteractionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				310);
		}
		return globalInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalInteraction_SchemaVersion() {
		return (EAttribute) getGlobalInteraction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalInteractionProfile() {
		if (globalInteractionProfileEClass == null) {
			globalInteractionProfileEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				311);
		}
		return globalInteractionProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalInteractionProfile_SchemaVersion() {
		return (EAttribute) getGlobalInteractionProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalMifChanges() {
		if (globalMifChangesEClass == null) {
			globalMifChangesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				312);
		}
		return globalMifChangesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalMifChanges_SchemaVersion() {
		return (EAttribute) getGlobalMifChanges().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalPublicationPackage() {
		if (globalPublicationPackageEClass == null) {
			globalPublicationPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				313);
		}
		return globalPublicationPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalPublicationPackage_SchemaVersion() {
		return (EAttribute) getGlobalPublicationPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalSerializedStaticModel() {
		if (globalSerializedStaticModelEClass == null) {
			globalSerializedStaticModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				314);
		}
		return globalSerializedStaticModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalSerializedStaticModel_SchemaVersion() {
		return (EAttribute) getGlobalSerializedStaticModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalStaticModel() {
		if (globalStaticModelEClass == null) {
			globalStaticModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				315);
		}
		return globalStaticModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalStaticModel_SchemaVersion() {
		return (EAttribute) getGlobalStaticModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalStaticModelInterfacePackage() {
		if (globalStaticModelInterfacePackageEClass == null) {
			globalStaticModelInterfacePackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(316);
		}
		return globalStaticModelInterfacePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalStaticModelInterfacePackage_SchemaVersion() {
		return (EAttribute) getGlobalStaticModelInterfacePackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalStoryboard() {
		if (globalStoryboardEClass == null) {
			globalStoryboardEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				317);
		}
		return globalStoryboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalStoryboard_SchemaVersion() {
		return (EAttribute) getGlobalStoryboard().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalStructuredDocument() {
		if (globalStructuredDocumentEClass == null) {
			globalStructuredDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				318);
		}
		return globalStructuredDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalStructuredDocument_SchemaVersion() {
		return (EAttribute) getGlobalStructuredDocument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalTestScenario() {
		if (globalTestScenarioEClass == null) {
			globalTestScenarioEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				319);
		}
		return globalTestScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalTestScenario_SchemaVersion() {
		return (EAttribute) getGlobalTestScenario().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalTriggerEvent() {
		if (globalTriggerEventEClass == null) {
			globalTriggerEventEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				320);
		}
		return globalTriggerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalTriggerEvent_SchemaVersion() {
		return (EAttribute) getGlobalTriggerEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalValueSet() {
		if (globalValueSetEClass == null) {
			globalValueSetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				321);
		}
		return globalValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalValueSet_SchemaVersion() {
		return (EAttribute) getGlobalValueSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalVocabularyModel() {
		if (globalVocabularyModelEClass == null) {
			globalVocabularyModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				322);
		}
		return globalVocabularyModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalVocabularyModel_SchemaVersion() {
		return (EAttribute) getGlobalVocabularyModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlossary() {
		if (glossaryEClass == null) {
			glossaryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				323);
		}
		return glossaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlossary_ImportedGlossary() {
		return (EReference) getGlossary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlossary_TermDefinition() {
		return (EReference) getGlossary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphConnector() {
		if (graphConnectorEClass == null) {
			graphConnectorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				324);
		}
		return graphConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphConnector_Position() {
		return (EReference) getGraphConnector().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphConnector_ConnectToShapeId() {
		return (EAttribute) getGraphConnector().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphConnectorWithEdge() {
		if (graphConnectorWithEdgeEClass == null) {
			graphConnectorWithEdgeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				325);
		}
		return graphConnectorWithEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphConnectorWithEdge_GraphEdge() {
		return (EReference) getGraphConnectorWithEdge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphEdge() {
		if (graphEdgeEClass == null) {
			graphEdgeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				326);
		}
		return graphEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphEdge_Waypoint() {
		return (EReference) getGraphEdge().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphEdgeGraphicInformation() {
		if (graphEdgeGraphicInformationEClass == null) {
			graphEdgeGraphicInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				327);
		}
		return graphEdgeGraphicInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphEdgeGraphicInformation_GraphElement() {
		return (EReference) getGraphEdgeGraphicInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphEdgeWithAnchor() {
		if (graphEdgeWithAnchorEClass == null) {
			graphEdgeWithAnchorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				328);
		}
		return graphEdgeWithAnchorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphEdgeWithAnchor_Anchor() {
		return (EReference) getGraphEdgeWithAnchor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphElement() {
		if (graphElementEClass == null) {
			graphElementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				329);
		}
		return graphElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphElement_Position() {
		return (EReference) getGraphElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicInformation() {
		if (graphicInformationEClass == null) {
			graphicInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				330);
		}
		return graphicInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicInformation_SemanticLinkId() {
		return (EAttribute) getGraphicInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphNode() {
		if (graphNodeEClass == null) {
			graphNodeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				332);
		}
		return graphNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphNode_Size() {
		return (EReference) getGraphNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphNode_IsHeightAutoSize() {
		return (EAttribute) getGraphNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphNode_IsWidthAutoSize() {
		return (EAttribute) getGraphNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphNode_NodeOrientation() {
		return (EAttribute) getGraphNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphNode_TextWrappingWidth() {
		return (EAttribute) getGraphNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphNodeWithOptionalConnection() {
		if (graphNodeWithOptionalConnectionEClass == null) {
			graphNodeWithOptionalConnectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				333);
		}
		return graphNodeWithOptionalConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphNodeWithOptionalConnection_Anchorage() {
		return (EReference) getGraphNodeWithOptionalConnection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupChange() {
		if (groupChangeEClass == null) {
			groupChangeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				334);
		}
		return groupChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupChange_ChangeItems() {
		return (EAttribute) getGroupChange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupChange_AddAttribute() {
		return (EReference) getGroupChange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupChange_AddElement() {
		return (EReference) getGroupChange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupChange_RemoveAttribute() {
		return (EReference) getGroupChange().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupChange_ReplaceAttribute() {
		return (EReference) getGroupChange().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupChange_RemoveElement() {
		return (EReference) getGroupChange().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupChange_ReplaceElement() {
		return (EReference) getGroupChange().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupChange_ChangeElement() {
		return (EReference) getGroupChange().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupChange_ChangeGroup() {
		return (EReference) getGroupChange().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupVote() {
		if (groupVoteEClass == null) {
			groupVoteEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				335);
		}
		return groupVoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupVote_Abstain() {
		return (EAttribute) getGroupVote().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupVote_InFavour() {
		return (EAttribute) getGroupVote().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupVote_MotionBy() {
		return (EAttribute) getGroupVote().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupVote_Opposed() {
		return (EAttribute) getGroupVote().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupVote_SecondedBy() {
		return (EAttribute) getGroupVote().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeader() {
		if (headerEClass == null) {
			headerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				337);
		}
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeader_RenderingInformation() {
		return (EReference) getHeader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeader_Legalese() {
		return (EReference) getHeader().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeader_ResponsibleGroup() {
		return (EReference) getHeader().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeader_Contributor() {
		return (EReference) getHeader().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Subject() {
		return (EAttribute) getHeader().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeader_ApprovalInfo() {
		return (EReference) getHeader().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Context() {
		return (EAttribute) getHeader().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeader_RealmNamespace() {
		return (EReference) getHeader().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_PrimaryRepository() {
		return (EAttribute) getHeader().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryItem() {
		if (historyItemEClass == null) {
			historyItemEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				338);
		}
		return historyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistoryItem_Description() {
		return (EReference) getHistoryItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryItem_DateTime() {
		return (EAttribute) getHistoryItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryItem_Id() {
		return (EAttribute) getHistoryItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryItem_IsBackwardCompatibleChange() {
		return (EAttribute) getHistoryItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryItem_IsSubstantiveChange() {
		return (EAttribute) getHistoryItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoryItem_ResponsiblePersonName() {
		return (EAttribute) getHistoryItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationConstraints() {
		if (implementationConstraintsEClass == null) {
			implementationConstraintsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				341);
		}
		return implementationConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationConstraints_SupportedReleases() {
		return (EReference) getImplementationConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationConstraints_Context() {
		return (EAttribute) getImplementationConstraints().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationConstraints_RealmNamespace() {
		return (EReference) getImplementationConstraints().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationConstraints_SupportedITS() {
		return (EReference) getImplementationConstraints().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationConstraints_AdditionalDatatypeModel() {
		return (EReference) getImplementationConstraints().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationConstraints_DatatypeLimitation() {
		return (EReference) getImplementationConstraints().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationConstraints_AdditionalVocabularyModel() {
		return (EReference) getImplementationConstraints().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationConstraints_VocabularyLimitation() {
		return (EReference) getImplementationConstraints().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationMessageConstraints() {
		if (implementationMessageConstraintsEClass == null) {
			implementationMessageConstraintsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(342);
		}
		return implementationMessageConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationMessageConstraints_SupportedTransport() {
		return (EReference) getImplementationMessageConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationMessageConstraints_TimingBackground() {
		return (EReference) getImplementationMessageConstraints().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationMessageConstraints_ExpectedResponseTime() {
		return (EAttribute) getImplementationMessageConstraints().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationMessageConstraints_RetryTime() {
		return (EAttribute) getImplementationMessageConstraints().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationMessageConstraints_MaximumRetryCount() {
		return (EAttribute) getImplementationMessageConstraints().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportDatatypeModelLibrary() {
		if (importDatatypeModelLibraryEClass == null) {
			importDatatypeModelLibraryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				343);
		}
		return importDatatypeModelLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportDatatypeModelLibrary_ImportedDatatype() {
		return (EReference) getImportDatatypeModelLibrary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeRelatedCodes() {
		if (includeRelatedCodesEClass == null) {
			includeRelatedCodesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				344);
		}
		return includeRelatedCodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeRelatedCodes_RelationshipName() {
		return (EAttribute) getIncludeRelatedCodes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeRelatedCodes_RelationshipTraversal() {
		return (EAttribute) getIncludeRelatedCodes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		if (interactionEClass == null) {
			interactionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				345);
		}
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Annotations() {
		return (EReference) getInteraction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_InvokingTriggerEvent() {
		return (EReference) getInteraction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_ArgumentMessage() {
		return (EReference) getInteraction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_ReceiverResponsibilities() {
		return (EReference) getInteraction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_SendingApplication() {
		return (EReference) getInteraction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_ReceivingApplication() {
		return (EReference) getInteraction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteraction_InteractionType() {
		return (EAttribute) getInteraction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionAnnotations() {
		if (interactionAnnotationsEClass == null) {
			interactionAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				346);
		}
		return interactionAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionAppInfo() {
		if (interactionAppInfoEClass == null) {
			interactionAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				347);
		}
		return interactionAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionDocumentation() {
		if (interactionDocumentationEClass == null) {
			interactionDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				348);
		}
		return interactionDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionProfile() {
		if (interactionProfileEClass == null) {
			interactionProfileEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				351);
		}
		return interactionProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfile_Annotations() {
		return (EReference) getInteractionProfile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfile_ImplementationConstraints() {
		return (EReference) getInteractionProfile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfile_ArgumentMessage() {
		return (EReference) getInteractionProfile().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfile_EffectiveStaticModel() {
		return (EReference) getInteractionProfile().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfile_ReceiverResponsibilities() {
		return (EReference) getInteractionProfile().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfile_InternalMapping() {
		return (EReference) getInteractionProfile().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionProfile_ProfileType() {
		return (EAttribute) getInteractionProfile().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionProfileAnnotations() {
		if (interactionProfileAnnotationsEClass == null) {
			interactionProfileAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				352);
		}
		return interactionProfileAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileAnnotations_Documentation() {
		return (EReference) getInteractionProfileAnnotations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileAnnotations_AppInfo() {
		return (EReference) getInteractionProfileAnnotations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionProfileAppInfo() {
		if (interactionProfileAppInfoEClass == null) {
			interactionProfileAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				353);
		}
		return interactionProfileAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileAppInfo_ChangeRequest() {
		return (EReference) getInteractionProfileAppInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileAppInfo_DeprecationInfo() {
		return (EReference) getInteractionProfileAppInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionProfileDocumentation() {
		if (interactionProfileDocumentationEClass == null) {
			interactionProfileDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				354);
		}
		return interactionProfileDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileDocumentation_Description() {
		return (EReference) getInteractionProfileDocumentation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileDocumentation_UsageConstraint() {
		return (EReference) getInteractionProfileDocumentation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileDocumentation_UsageNotes() {
		return (EReference) getInteractionProfileDocumentation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileDocumentation_Rationale() {
		return (EReference) getInteractionProfileDocumentation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileDocumentation_Requirements() {
		return (EReference) getInteractionProfileDocumentation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileDocumentation_DesignComments() {
		return (EReference) getInteractionProfileDocumentation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileDocumentation_StabilityRemarks() {
		return (EReference) getInteractionProfileDocumentation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileDocumentation_Walkthrough() {
		return (EReference) getInteractionProfileDocumentation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileDocumentation_OpenIssue() {
		return (EReference) getInteractionProfileDocumentation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileDocumentation_OtherAnnotation() {
		return (EReference) getInteractionProfileDocumentation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionProfileDocumentation_Appendix() {
		return (EReference) getInteractionProfileDocumentation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionTest() {
		if (interactionTestEClass == null) {
			interactionTestEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				357);
		}
		return interactionTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionTest_Interaction() {
		return (EReference) getInteractionTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionTest_ExampleContent() {
		return (EReference) getInteractionTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionTest_ExampleFile() {
		return (EAttribute) getInteractionTest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionTest_ReceivingSystem() {
		return (EAttribute) getInteractionTest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionTest_SendingSystem() {
		return (EAttribute) getInteractionTest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		if (interfaceEClass == null) {
			interfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				358);
		}
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemFilter() {
		if (itemFilterEClass == null) {
			itemFilterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				359);
		}
		return itemFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemFilter_Expression() {
		return (EAttribute) getItemFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemFilter_FilterType() {
		return (EAttribute) getItemFilter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyedName() {
		if (keyedNameEClass == null) {
			keyedNameEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				362);
		}
		return keyedNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyedName_Key() {
		return (EAttribute) getKeyedName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyedName_Name() {
		return (EAttribute) getKeyedName().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegalese() {
		if (legaleseEClass == null) {
			legaleseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				363);
		}
		return legaleseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalese_Notation() {
		return (EReference) getLegalese().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalese_Disclaimer() {
		return (EReference) getLegalese().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalese_LicenseTerms() {
		return (EReference) getLegalese().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalese_VersioningPolicy() {
		return (EReference) getLegalese().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegalese_CopyrightOwner() {
		return (EAttribute) getLegalese().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegalese_CopyrightYears() {
		return (EAttribute) getLegalese().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalClassRef() {
		if (localClassRefEClass == null) {
			localClassRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				364);
		}
		return localClassRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalClassRef_Name() {
		return (EAttribute) getLocalClassRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalClassReference() {
		if (localClassReferenceEClass == null) {
			localClassReferenceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				365);
		}
		return localClassReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalClassReference_Name() {
		return (EAttribute) getLocalClassReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		if (mappingEClass == null) {
			mappingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				369);
		}
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_BusinessName() {
		return (EReference) getMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_DerivationSupplier() {
		return (EReference) getMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_SourceArtifact() {
		return (EReference) getMapping().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_Name() {
		return (EAttribute) getMapping().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_SourceName() {
		return (EAttribute) getMapping().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_SourceVersion() {
		return (EAttribute) getMapping().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapping_Strength() {
		return (EAttribute) getMapping().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMifChanges() {
		if (mifChangesEClass == null) {
			mifChangesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				373);
		}
		return mifChangesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMifChanges_RenderingInformation() {
		return (EReference) getMifChanges().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMifChanges_OriginalArtifact() {
		return (EReference) getMifChanges().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMifChanges_RevisedArtifact() {
		return (EReference) getMifChanges().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMifChanges_Change() {
		return (EReference) getMifChanges().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMifContent() {
		if (mifContentEClass == null) {
			mifContentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				374);
		}
		return mifContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMifContent_Group() {
		return (EAttribute) getMifContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMifContent_Any() {
		return (EAttribute) getMifContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		if (modelElementEClass == null) {
			modelElementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				378);
		}
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_HistoryItem() {
		return (EReference) getModelElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeGraphicInformation() {
		if (nodeGraphicInformationEClass == null) {
			nodeGraphicInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				381);
		}
		return nodeGraphicInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeGraphicInformation_GraphElement() {
		return (EReference) getNodeGraphicInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeWithConnectionGraphicInformation() {
		if (nodeWithConnectionGraphicInformationEClass == null) {
			nodeWithConnectionGraphicInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(384);
		}
		return nodeWithConnectionGraphicInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeWithConnectionGraphicInformation_GraphElement() {
		return (EReference) getNodeWithConnectionGraphicInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonComputableContentDefinition() {
		if (nonComputableContentDefinitionEClass == null) {
			nonComputableContentDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				385);
		}
		return nonComputableContentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonComputableContentDefinition_Text() {
		return (EReference) getNonComputableContentDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonTraversableAssociationEnd() {
		if (nonTraversableAssociationEndEClass == null) {
			nonTraversableAssociationEndEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				388);
		}
		return nonTraversableAssociationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonTraversableAssociationEnd_DerivedFrom() {
		return (EReference) getNonTraversableAssociationEnd().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonTraversableAssociationEnd_ParticipantClassName() {
		return (EAttribute) getNonTraversableAssociationEnd().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenIssue() {
		if (openIssueEClass == null) {
			openIssueEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				390);
		}
		return openIssueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpenIssue_Resolution() {
		return (EReference) getOpenIssue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationAnnotations() {
		if (operationAnnotationsEClass == null) {
			operationAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				391);
		}
		return operationAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationAppInfo() {
		if (operationAppInfoEClass == null) {
			operationAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				392);
		}
		return operationAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDerivation() {
		if (operationDerivationEClass == null) {
			operationDerivationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				393);
		}
		return operationDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDerivation_Type() {
		return (EReference) getOperationDerivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDerivation_TargetDatatype() {
		return (EReference) getOperationDerivation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDocumentation() {
		if (operationDocumentationEClass == null) {
			operationDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				394);
		}
		return operationDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationParameter() {
		if (operationParameterEClass == null) {
			operationParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				395);
		}
		return operationParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationParameter_Type() {
		return (EReference) getOperationParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameter_Name() {
		return (EAttribute) getOperationParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameter_SortKey() {
		return (EAttribute) getOperationParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherAnnotation() {
		if (otherAnnotationEClass == null) {
			otherAnnotationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				396);
		}
		return otherAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherAnnotation_OtherAnnotationContent() {
		return (EAttribute) getOtherAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherAnnotation_Text() {
		return (EReference) getOtherAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherAnnotation_Data() {
		return (EReference) getOtherAnnotation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherAnnotation_BusinessName() {
		return (EReference) getOtherAnnotation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherAnnotation_DerivationSupplier() {
		return (EReference) getOtherAnnotation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherAnnotation_Context() {
		return (EAttribute) getOtherAnnotation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherAnnotation_RealmNamespace() {
		return (EReference) getOtherAnnotation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherAnnotation_Id() {
		return (EAttribute) getOtherAnnotation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherAnnotation_Name() {
		return (EAttribute) getOtherAnnotation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherAnnotation_SortKey() {
		return (EAttribute) getOtherAnnotation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherAnnotation_Type() {
		return (EAttribute) getOtherAnnotation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		if (packageEClass == null) {
			packageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				399);
		}
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackageLocation() {
		return (EReference) getPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Header() {
		return (EReference) getPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Replaces() {
		return (EReference) getPackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_ReplacedBy() {
		return (EReference) getPackage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_HashCode() {
		return (EAttribute) getPackage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_PackageKind() {
		return (EAttribute) getPackage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_SecondaryId() {
		return (EAttribute) getPackage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Title() {
		return (EAttribute) getPackage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageAnnotations() {
		if (packageAnnotationsEClass == null) {
			packageAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				400);
		}
		return packageAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageAnnotations_Documentation() {
		return (EReference) getPackageAnnotations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageAnnotations_AppInfo() {
		return (EReference) getPackageAnnotations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageAppInfo() {
		if (packageAppInfoEClass == null) {
			packageAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				401);
		}
		return packageAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageAppInfo_BallotComment() {
		return (EReference) getPackageAppInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageAppInfo_ChangeRequest() {
		return (EReference) getPackageAppInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageArtifact() {
		if (packageArtifactEClass == null) {
			packageArtifactEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				402);
		}
		return packageArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageArtifact_PackageLocation() {
		return (EReference) getPackageArtifact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageArtifact_Title() {
		return (EAttribute) getPackageArtifact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageBase() {
		if (packageBaseEClass == null) {
			packageBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				403);
		}
		return packageBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageBase_BusinessName() {
		return (EReference) getPackageBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageBase_Name() {
		return (EAttribute) getPackageBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageBase_SortKey() {
		return (EAttribute) getPackageBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageContent() {
		if (packageContentEClass == null) {
			packageContentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				404);
		}
		return packageContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageContent_Group() {
		return (EAttribute) getPackageContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_FreehandDocument() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_DomainAnalysisModel() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_DomainInstanceExample() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_Storyboard() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_DatatypeModelLibrary() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_StaticModelInterfacePackage() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_VocabularyModel() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_StaticModel() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_SerializedStaticModel() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_DerivedStaticModel() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_StructuredDocument() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_TriggerEvent() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_Interaction() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_ApplicationRole() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_InteractionProfile() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_ConformanceProfile() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_TestScenario() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_Publication() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageContent_Package() {
		return (EReference) getPackageContent().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageDefId() {
		if (packageDefIdEClass == null) {
			packageDefIdEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				405);
		}
		return packageDefIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageDefId_SecondaryId() {
		return (EAttribute) getPackageDefId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageDerivation() {
		if (packageDerivationEClass == null) {
			packageDerivationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				406);
		}
		return packageDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDerivation_TargetPackage() {
		return (EReference) getPackageDerivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageDocumentation() {
		if (packageDocumentationEClass == null) {
			packageDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				407);
		}
		return packageDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDocumentation_Description() {
		return (EReference) getPackageDocumentation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDocumentation_DesignComments() {
		return (EReference) getPackageDocumentation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDocumentation_StabilityRemarks() {
		return (EReference) getPackageDocumentation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDocumentation_Walkthrough() {
		return (EReference) getPackageDocumentation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDocumentation_OpenIssue() {
		return (EReference) getPackageDocumentation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDocumentation_Appendix() {
		return (EReference) getPackageDocumentation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDocumentation_OtherAnnotation() {
		return (EReference) getPackageDocumentation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageOrArtifactRef() {
		if (packageOrArtifactRefEClass == null) {
			packageOrArtifactRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				410);
		}
		return packageOrArtifactRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageOrArtifactRef_ArtifactName() {
		return (EAttribute) getPackageOrArtifactRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageRef() {
		if (packageRefEClass == null) {
			packageRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				411);
		}
		return packageRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRef_Artifact() {
		return (EAttribute) getPackageRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRef_CombinedId() {
		return (EAttribute) getPackageRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRef_Domain() {
		return (EAttribute) getPackageRef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRef_Id() {
		return (EAttribute) getPackageRef().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRef_Name() {
		return (EAttribute) getPackageRef().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRef_RealmNamespace() {
		return (EAttribute) getPackageRef().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRef_ReleaseDate() {
		return (EAttribute) getPackageRef().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRef_Root() {
		return (EAttribute) getPackageRef().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRef_Section() {
		return (EAttribute) getPackageRef().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRef_SubArtifact() {
		return (EAttribute) getPackageRef().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRef_SubSection() {
		return (EAttribute) getPackageRef().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRef_Version() {
		return (EAttribute) getPackageRef().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterModel() {
		if (parameterModelEClass == null) {
			parameterModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				414);
		}
		return parameterModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterModel_Specialization() {
		return (EReference) getParameterModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterModel_ParameterName() {
		return (EAttribute) getParameterModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterModel_TraversalName() {
		return (EAttribute) getParameterModel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		if (pointEClass == null) {
			pointEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				417);
		}
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_X() {
		return (EAttribute) getPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Y() {
		return (EAttribute) getPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrintName() {
		if (printNameEClass == null) {
			printNameEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				420);
		}
		return printNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrintName_Icon() {
		return (EReference) getPrintName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintName_Language() {
		return (EAttribute) getPrintName().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintName_PreferredForLanguage() {
		return (EAttribute) getPrintName().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintName_Text() {
		return (EAttribute) getPrintName().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyBasedContentDefinition() {
		if (propertyBasedContentDefinitionEClass == null) {
			propertyBasedContentDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				421);
		}
		return propertyBasedContentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyBasedContentDefinition_IncludeWithConceptProperty() {
		return (EReference) getPropertyBasedContentDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyBasedContentDefinition_ExcludeWithConceptProperty() {
		return (EReference) getPropertyBasedContentDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyBasedContentDefinition_IncludeWithCodeProperty() {
		return (EReference) getPropertyBasedContentDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyBasedContentDefinition_ExcludeWithCodeProperty() {
		return (EReference) getPropertyBasedContentDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyGroup() {
		if (propertyGroupEClass == null) {
			propertyGroupEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				424);
		}
		return propertyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyGroup_Property() {
		return (EReference) getPropertyGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_Name() {
		return (EAttribute) getPropertyGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicationAnnotations() {
		if (publicationAnnotationsEClass == null) {
			publicationAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				425);
		}
		return publicationAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationAnnotations_Documentation() {
		return (EReference) getPublicationAnnotations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationAnnotations_AppInfo() {
		return (EReference) getPublicationAnnotations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicationAppInfo() {
		if (publicationAppInfoEClass == null) {
			publicationAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				426);
		}
		return publicationAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationAppInfo_BallotComment() {
		return (EReference) getPublicationAppInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationAppInfo_ChangeRequest() {
		return (EReference) getPublicationAppInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicationBase() {
		if (publicationBaseEClass == null) {
			publicationBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				427);
		}
		return publicationBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationBase_BusinessName() {
		return (EReference) getPublicationBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationBase_RenderedText() {
		return (EReference) getPublicationBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationBase_PrecedingText() {
		return (EReference) getPublicationBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicationBase_ContentsLevel() {
		return (EAttribute) getPublicationBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicationBase_Name() {
		return (EAttribute) getPublicationBase().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicationBase_RenderToLocation() {
		return (EAttribute) getPublicationBase().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicationBase_SortKey() {
		return (EAttribute) getPublicationBase().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicationBase_Title() {
		return (EAttribute) getPublicationBase().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicationDocumentation() {
		if (publicationDocumentationEClass == null) {
			publicationDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				428);
		}
		return publicationDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationDocumentation_Description() {
		return (EReference) getPublicationDocumentation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationDocumentation_DesignComments() {
		return (EReference) getPublicationDocumentation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationDocumentation_StabilityRemarks() {
		return (EReference) getPublicationDocumentation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationDocumentation_Walkthrough() {
		return (EReference) getPublicationDocumentation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationDocumentation_OpenIssue() {
		return (EReference) getPublicationDocumentation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationDocumentation_Appendix() {
		return (EReference) getPublicationDocumentation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationDocumentation_OtherAnnotation() {
		return (EReference) getPublicationDocumentation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicationGroup() {
		if (publicationGroupEClass == null) {
			publicationGroupEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				429);
		}
		return publicationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicationGroup_PublicationContent() {
		return (EAttribute) getPublicationGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationGroup_PublishedItem() {
		return (EReference) getPublicationGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationGroup_PublishedGroup() {
		return (EReference) getPublicationGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationGroup_FollowingText() {
		return (EReference) getPublicationGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicationItem() {
		if (publicationItemEClass == null) {
			publicationItemEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				430);
		}
		return publicationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationItem_ItemReference() {
		return (EReference) getPublicationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationItem_Filter() {
		return (EReference) getPublicationItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationItem_FollowingText() {
		return (EReference) getPublicationItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicationItem_RenderingStyle() {
		return (EAttribute) getPublicationItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicationPackage() {
		if (publicationPackageEClass == null) {
			publicationPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				431);
		}
		return publicationPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationPackage_Annotations() {
		return (EReference) getPublicationPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicationPackage_PublicationContent() {
		return (EAttribute) getPublicationPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationPackage_PublishedItem() {
		return (EReference) getPublicationPackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationPackage_PublishedGroup() {
		return (EReference) getPublicationPackage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeDefinition() {
		if (rangeDefinitionEClass == null) {
			rangeDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				432);
		}
		return rangeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeDefinition_HighClosed() {
		return (EAttribute) getRangeDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeDefinition_HighValue() {
		return (EAttribute) getRangeDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeDefinition_LowClosed() {
		return (EAttribute) getRangeDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeDefinition_LowValue() {
		return (EAttribute) getRangeDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealmElement() {
		if (realmElementEClass == null) {
			realmElementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				433);
		}
		return realmElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealmElement_Value() {
		return (EAttribute) getRealmElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiverResponsibility() {
		if (receiverResponsibilityEClass == null) {
			receiverResponsibilityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				436);
		}
		return receiverResponsibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiverResponsibility_Reason() {
		return (EReference) getReceiverResponsibility().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiverResponsibility_InvokeInteraction() {
		return (EReference) getReceiverResponsibility().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiverResponsibility_InvokeTriggerEvent() {
		return (EReference) getReceiverResponsibility().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedAppRole() {
		if (relatedAppRoleEClass == null) {
			relatedAppRoleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				439);
		}
		return relatedAppRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelatedAppRole_RelationshipType() {
		return (EAttribute) getRelatedAppRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		if (relationshipEClass == null) {
			relationshipEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				440);
		}
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipBasedContentDefinition() {
		if (relationshipBasedContentDefinitionEClass == null) {
			relationshipBasedContentDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(441);
		}
		return relationshipBasedContentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipBasedContentDefinition_TargetConcepts() {
		return (EReference) getRelationshipBasedContentDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipBasedContentDefinition_RelationshipName() {
		return (EAttribute) getRelationshipBasedContentDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelease() {
		if (releaseEClass == null) {
			releaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				444);
		}
		return releaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelease_Name() {
		return (EAttribute) getRelease().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseList() {
		if (releaseListEClass == null) {
			releaseListEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				445);
		}
		return releaseListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseList_Release() {
		return (EReference) getReleaseList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenderingInformation() {
		if (renderingInformationEClass == null) {
			renderingInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				446);
		}
		return renderingInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenderingInformation_RenderingNotes() {
		return (EReference) getRenderingInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenderingInformation_Application() {
		return (EAttribute) getRenderingInformation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenderingInformation_RenderingTime() {
		return (EAttribute) getRenderingInformation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplaceElementContent() {
		if (replaceElementContentEClass == null) {
			replaceElementContentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				447);
		}
		return replaceElementContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplaceElementContent_ReplacementContent() {
		return (EReference) getReplaceElementContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsibleGroup() {
		if (responsibleGroupEClass == null) {
			responsibleGroupEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				448);
		}
		return responsibleGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsibleGroup_GroupId() {
		return (EAttribute) getResponsibleGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsibleGroup_GroupName() {
		return (EAttribute) getResponsibleGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsibleGroup_OrganizationName() {
		return (EAttribute) getResponsibleGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializedAssociationEnd() {
		if (serializedAssociationEndEClass == null) {
			serializedAssociationEndEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				454);
		}
		return serializedAssociationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedAssociationEnd_TargetConnection() {
		return (EReference) getSerializedAssociationEnd().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedAssociationEnd_SourceConnection() {
		return (EReference) getSerializedAssociationEnd().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializedAssociationEnds() {
		if (serializedAssociationEndsEClass == null) {
			serializedAssociationEndsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				455);
		}
		return serializedAssociationEndsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedAssociationEnds_TraversableConnection() {
		return (EReference) getSerializedAssociationEnds().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedAssociationEnds_NonTraversableConnection() {
		return (EReference) getSerializedAssociationEnds().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializedClass() {
		if (serializedClassEClass == null) {
			serializedClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				456);
		}
		return serializedClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedClass_ChildClass() {
		return (EReference) getSerializedClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedClass_ParentClass() {
		return (EReference) getSerializedClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedClass_Association() {
		return (EReference) getSerializedClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializedClassBindingArgument() {
		if (serializedClassBindingArgumentEClass == null) {
			serializedClassBindingArgumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				457);
		}
		return serializedClassBindingArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedClassBindingArgument_ArgumentClass() {
		return (EReference) getSerializedClassBindingArgument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializedClasses() {
		if (serializedClassesEClass == null) {
			serializedClassesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				458);
		}
		return serializedClassesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedClasses_Class() {
		return (EReference) getSerializedClasses().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedClasses_CommonModelElementRef() {
		return (EReference) getSerializedClasses().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedClasses_TemplateParameter() {
		return (EReference) getSerializedClasses().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializedClassGeneralization() {
		if (serializedClassGeneralizationEClass == null) {
			serializedClassGeneralizationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				459);
		}
		return serializedClassGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedClassGeneralization_SpecializedClass() {
		return (EReference) getSerializedClassGeneralization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializedCommonModelElementRef() {
		if (serializedCommonModelElementRefEClass == null) {
			serializedCommonModelElementRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				460);
		}
		return serializedCommonModelElementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerializedCommonModelElementRef_Group() {
		return (EAttribute) getSerializedCommonModelElementRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedCommonModelElementRef_Argument() {
		return (EReference) getSerializedCommonModelElementRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializedEntryPoint() {
		if (serializedEntryPointEClass == null) {
			serializedEntryPointEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				461);
		}
		return serializedEntryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedEntryPoint_EntryClass() {
		return (EReference) getSerializedEntryPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializedStaticModel() {
		if (serializedStaticModelEClass == null) {
			serializedStaticModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				462);
		}
		return serializedStaticModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedStaticModel_EntryPoint() {
		return (EReference) getSerializedStaticModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializedStaticModelsType() {
		if (serializedStaticModelsTypeEClass == null) {
			serializedStaticModelsTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				463);
		}
		return serializedStaticModelsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializedStaticModelsType_SerializedStaticModel() {
		return (EReference) getSerializedStaticModelsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerializedStaticModelsType_SchemaVersion() {
		return (EAttribute) getSerializedStaticModelsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecializationClass() {
		if (specializationClassEClass == null) {
			specializationClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				469);
		}
		return specializationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecializationClass_Class() {
		return (EReference) getSpecializationClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecializationClass_Name() {
		return (EAttribute) getSpecializationClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		if (stateEClass == null) {
			stateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				470);
		}
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_BusinessName() {
		return (EReference) getState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Annotations() {
		return (EReference) getState().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DerivedFrom() {
		return (EReference) getState().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_ContainedStates() {
		return (EAttribute) getState().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute) getState().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_ParentStateName() {
		return (EAttribute) getState().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateAnnotations() {
		if (stateAnnotationsEClass == null) {
			stateAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				471);
		}
		return stateAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateAppInfo() {
		if (stateAppInfoEClass == null) {
			stateAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				472);
		}
		return stateAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateDerivation() {
		if (stateDerivationEClass == null) {
			stateDerivationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				473);
		}
		return stateDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateDerivation_StateName() {
		return (EAttribute) getStateDerivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateDocumentation() {
		if (stateDocumentationEClass == null) {
			stateDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				474);
		}
		return stateDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		if (stateMachineEClass == null) {
			stateMachineEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				475);
		}
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Annotations() {
		return (EReference) getStateMachine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Figure() {
		return (EReference) getStateMachine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_SubState() {
		return (EReference) getStateMachine().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Transition() {
		return (EReference) getStateMachine().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateMachine_StateAttributeName() {
		return (EAttribute) getStateMachine().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachineAnnotations() {
		if (stateMachineAnnotationsEClass == null) {
			stateMachineAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				476);
		}
		return stateMachineAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachineAppInfo() {
		if (stateMachineAppInfoEClass == null) {
			stateMachineAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				477);
		}
		return stateMachineAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachineDocumentation() {
		if (stateMachineDocumentationEClass == null) {
			stateMachineDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				478);
		}
		return stateMachineDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticExample() {
		if (staticExampleEClass == null) {
			staticExampleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				479);
		}
		return staticExampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticExample_Data() {
		return (EReference) getStaticExample().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticExample_Context() {
		return (EAttribute) getStaticExample().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticExample_RealmNamespace() {
		return (EReference) getStaticExample().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticExample_BusinessName() {
		return (EReference) getStaticExample().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticExample_DerivationSupplier() {
		return (EReference) getStaticExample().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticExample_Id() {
		return (EAttribute) getStaticExample().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticExample_ItsName() {
		return (EAttribute) getStaticExample().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticExample_Name() {
		return (EAttribute) getStaticExample().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticExample_SortKey() {
		return (EAttribute) getStaticExample().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModel() {
		if (staticModelEClass == null) {
			staticModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				480);
		}
		return staticModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModel_EntryPoint() {
		return (EReference) getStaticModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModel_ContainedClass() {
		return (EReference) getStaticModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModel_Association() {
		return (EReference) getStaticModel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelAnnotations() {
		if (staticModelAnnotationsEClass == null) {
			staticModelAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				481);
		}
		return staticModelAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelAppInfo() {
		if (staticModelAppInfoEClass == null) {
			staticModelAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				482);
		}
		return staticModelAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelBase() {
		if (staticModelBaseEClass == null) {
			staticModelBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				483);
		}
		return staticModelBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_Annotations() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_GraphicRepresentation() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_Figure() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_DerivedFrom() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_HasDerivations() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_ImportedDatatypeModelPackage() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_ImportedVocabularyModelPackage() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_ImportedCommonModelElementPackage() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_ImportedStubPackage() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_ImportAnnotationLibrary() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_AdditionalDatatypeModel() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_DatatypeLimitation() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_AdditionalVocabularyModel() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_VocabularyLimitation() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_SubjectAreaPackage() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelBase_DefinitionalCode() {
		return (EReference) getStaticModelBase().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticModelBase_ConformanceLevel() {
		return (EAttribute) getStaticModelBase().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticModelBase_IsAbstract() {
		return (EAttribute) getStaticModelBase().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticModelBase_IsSerializable() {
		return (EAttribute) getStaticModelBase().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticModelBase_RepresentationKind() {
		return (EAttribute) getStaticModelBase().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelClassTemplateParameter() {
		if (staticModelClassTemplateParameterEClass == null) {
			staticModelClassTemplateParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(484);
		}
		return staticModelClassTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelClassTemplateParameter_Annotations() {
		return (EReference) getStaticModelClassTemplateParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticModelClassTemplateParameter_Interface() {
		return (EAttribute) getStaticModelClassTemplateParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticModelClassTemplateParameter_Name() {
		return (EAttribute) getStaticModelClassTemplateParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelDerivation() {
		if (staticModelDerivationEClass == null) {
			staticModelDerivationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				485);
		}
		return staticModelDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelDerivation_TargetStaticModel() {
		return (EReference) getStaticModelDerivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticModelDerivation_StaticModelDerivationId() {
		return (EAttribute) getStaticModelDerivation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelDerivationSource() {
		if (staticModelDerivationSourceEClass == null) {
			staticModelDerivationSourceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				486);
		}
		return staticModelDerivationSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelDerivationSource_SourceStaticModel() {
		return (EReference) getStaticModelDerivationSource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelDocumentation() {
		if (staticModelDocumentationEClass == null) {
			staticModelDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				489);
		}
		return staticModelDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelInterfaceAnnotations() {
		if (staticModelInterfaceAnnotationsEClass == null) {
			staticModelInterfaceAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				490);
		}
		return staticModelInterfaceAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelInterfaceAppInfo() {
		if (staticModelInterfaceAppInfoEClass == null) {
			staticModelInterfaceAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				491);
		}
		return staticModelInterfaceAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelInterfaceDocumentation() {
		if (staticModelInterfaceDocumentationEClass == null) {
			staticModelInterfaceDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(492);
		}
		return staticModelInterfaceDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelInterfacePackage() {
		if (staticModelInterfacePackageEClass == null) {
			staticModelInterfacePackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				493);
		}
		return staticModelInterfacePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelInterfacePackage_ImportedVocabularyModelPackage() {
		return (EReference) getStaticModelInterfacePackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelInterfacePackage_ImportStaticModelInterfacePackage() {
		return (EReference) getStaticModelInterfacePackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelInterfacePackage_CommonModelElementDefinition() {
		return (EReference) getStaticModelInterfacePackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelInterfacePackage_StubDefinition() {
		return (EReference) getStaticModelInterfacePackage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelRefBase() {
		if (staticModelRefBaseEClass == null) {
			staticModelRefBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				494);
		}
		return staticModelRefBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelRefBase_Annotations() {
		return (EReference) getStaticModelRefBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelRefBase_ModelReference() {
		return (EReference) getStaticModelRefBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticModelRefBase_Name() {
		return (EAttribute) getStaticModelRefBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticModelsType() {
		if (staticModelsTypeEClass == null) {
			staticModelsTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				497);
		}
		return staticModelsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticModelsType_StaticModel() {
		return (EReference) getStaticModelsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticModelsType_SchemaVersion() {
		return (EAttribute) getStaticModelsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticPackageDiagramGraphicInformation() {
		if (staticPackageDiagramGraphicInformationEClass == null) {
			staticPackageDiagramGraphicInformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(500);
		}
		return staticPackageDiagramGraphicInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticPackageDiagramGraphicInformation_EntryPoint() {
		return (EReference) getStaticPackageDiagramGraphicInformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticPackageDiagramGraphicInformation_Class() {
		return (EReference) getStaticPackageDiagramGraphicInformation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticPackageDiagramGraphicInformation_Association() {
		return (EReference) getStaticPackageDiagramGraphicInformation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticPackageDiagramGraphicInformation_Generalization() {
		return (EReference) getStaticPackageDiagramGraphicInformation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticPackageDiagramGraphicInformation_Annotation() {
		return (EReference) getStaticPackageDiagramGraphicInformation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticPackageDiagramGraphicInformation_Presentation() {
		return (EAttribute) getStaticPackageDiagramGraphicInformation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryboard() {
		if (storyboardEClass == null) {
			storyboardEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				501);
		}
		return storyboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboard_Annotations() {
		return (EReference) getStoryboard().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboard_CorrespondingArtifacts() {
		return (EReference) getStoryboard().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboard_ActivityDiagramFigure() {
		return (EReference) getStoryboard().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboard_ParentStoryboard() {
		return (EReference) getStoryboard().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboard_Narrative() {
		return (EReference) getStoryboard().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboard_ActivityDiagram() {
		return (EReference) getStoryboard().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryboardAnnotations() {
		if (storyboardAnnotationsEClass == null) {
			storyboardAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				502);
		}
		return storyboardAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardAnnotations_Documentation() {
		return (EReference) getStoryboardAnnotations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardAnnotations_AppInfo() {
		return (EReference) getStoryboardAnnotations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryboardAppInfo() {
		if (storyboardAppInfoEClass == null) {
			storyboardAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				503);
		}
		return storyboardAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardAppInfo_BallotComment() {
		return (EReference) getStoryboardAppInfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardAppInfo_ChangeRequest() {
		return (EReference) getStoryboardAppInfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryboardArtifactReferences() {
		if (storyboardArtifactReferencesEClass == null) {
			storyboardArtifactReferencesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				504);
		}
		return storyboardArtifactReferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardArtifactReferences_System() {
		return (EReference) getStoryboardArtifactReferences().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardArtifactReferences_Interaction() {
		return (EReference) getStoryboardArtifactReferences().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardArtifactReferences_GraphicRepresentation() {
		return (EReference) getStoryboardArtifactReferences().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardArtifactReferences_Figure() {
		return (EReference) getStoryboardArtifactReferences().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryboardDocumentation() {
		if (storyboardDocumentationEClass == null) {
			storyboardDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				505);
		}
		return storyboardDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardDocumentation_Description() {
		return (EReference) getStoryboardDocumentation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardDocumentation_Rationale() {
		return (EReference) getStoryboardDocumentation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardDocumentation_DesignComments() {
		return (EReference) getStoryboardDocumentation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardDocumentation_StabilityRemarks() {
		return (EReference) getStoryboardDocumentation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardDocumentation_OpenIssue() {
		return (EReference) getStoryboardDocumentation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardDocumentation_OtherAnnotation() {
		return (EReference) getStoryboardDocumentation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryboardNarrative() {
		if (storyboardNarrativeEClass == null) {
			storyboardNarrativeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				506);
		}
		return storyboardNarrativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoryboardNarrative_Context() {
		return (EAttribute) getStoryboardNarrative().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardNarrative_RealmNamespace() {
		return (EReference) getStoryboardNarrative().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardNarrative_DeprecatedPackageLocation() {
		return (EReference) getStoryboardNarrative().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryboardNarrative_Text() {
		return (EReference) getStoryboardNarrative().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoryboardNarrative_Title() {
		return (EAttribute) getStoryboardNarrative().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		if (structuralFeatureEClass == null) {
			structuralFeatureEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				507);
		}
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredDocument() {
		if (structuredDocumentEClass == null) {
			structuredDocumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				508);
		}
		return structuredDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredDocument_Annotations() {
		return (EReference) getStructuredDocument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredDocument_DocumentDefinition() {
		return (EReference) getStructuredDocument().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredDocumentAnnotations() {
		if (structuredDocumentAnnotationsEClass == null) {
			structuredDocumentAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				509);
		}
		return structuredDocumentAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredDocumentAppInfo() {
		if (structuredDocumentAppInfoEClass == null) {
			structuredDocumentAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				510);
		}
		return structuredDocumentAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredDocumentDocumentation() {
		if (structuredDocumentDocumentationEClass == null) {
			structuredDocumentDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				511);
		}
		return structuredDocumentDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStubDefinition() {
		if (stubDefinitionEClass == null) {
			stubDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				512);
		}
		return stubDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStubDefinition_Annotations() {
		return (EReference) getStubDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStubDefinition_TypeStaticModel() {
		return (EReference) getStubDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStubDefinition_EntryClass() {
		return (EAttribute) getStubDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStubDefinition_ConstraintStaticModel() {
		return (EReference) getStubDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStubDefinition_EntryKind() {
		return (EAttribute) getStubDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStubDefinition_Name() {
		return (EAttribute) getStubDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStubDefinition_OtherClassName() {
		return (EAttribute) getStubDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectAreaAnnotations() {
		if (subjectAreaAnnotationsEClass == null) {
			subjectAreaAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				515);
		}
		return subjectAreaAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectAreaAppInfo() {
		if (subjectAreaAppInfoEClass == null) {
			subjectAreaAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				516);
		}
		return subjectAreaAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectAreaDocumentation() {
		if (subjectAreaDocumentationEClass == null) {
			subjectAreaDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				517);
		}
		return subjectAreaDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectAreaPackage() {
		if (subjectAreaPackageEClass == null) {
			subjectAreaPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				518);
		}
		return subjectAreaPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubjectAreaPackage_ApprovalInfo() {
		return (EReference) getSubjectAreaPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubjectAreaPackage_GraphicRepresentation() {
		return (EReference) getSubjectAreaPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubjectAreaPackage_Figure() {
		return (EReference) getSubjectAreaPackage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubjectAreaPackage_Annotations() {
		return (EReference) getSubjectAreaPackage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubjectAreaPackage_SubjectAreaPackage() {
		return (EReference) getSubjectAreaPackage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubjectAreaPackage_ContainedClass() {
		return (EReference) getSubjectAreaPackage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubSystem() {
		if (subSystemEClass == null) {
			subSystemEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				521);
		}
		return subSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedConceptProperty() {
		if (supportedConceptPropertyEClass == null) {
			supportedConceptPropertyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				522);
		}
		return supportedConceptPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedConceptProperty_ApplyToValueSetsIndicator() {
		return (EAttribute) getSupportedConceptProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedConceptProperty_DefaultHandlingCode() {
		return (EAttribute) getSupportedConceptProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedConceptRelationship() {
		if (supportedConceptRelationshipEClass == null) {
			supportedConceptRelationshipEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				523);
		}
		return supportedConceptRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedConceptRelationship_Description() {
		return (EReference) getSupportedConceptRelationship().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedConceptRelationship_AllowedForSources() {
		return (EReference) getSupportedConceptRelationship().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedConceptRelationship_AllowedForTargets() {
		return (EReference) getSupportedConceptRelationship().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedConceptRelationship_RequiredForSources() {
		return (EReference) getSupportedConceptRelationship().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedConceptRelationship_RequiredForTargets() {
		return (EReference) getSupportedConceptRelationship().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedConceptRelationship_SupportedProperty() {
		return (EReference) getSupportedConceptRelationship().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedConceptRelationship_DefiningConcept() {
		return (EReference) getSupportedConceptRelationship().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedConceptRelationship_Functionalism() {
		return (EAttribute) getSupportedConceptRelationship().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedConceptRelationship_Id() {
		return (EAttribute) getSupportedConceptRelationship().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedConceptRelationship_InverseName() {
		return (EAttribute) getSupportedConceptRelationship().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedConceptRelationship_IsNavigable() {
		return (EAttribute) getSupportedConceptRelationship().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedConceptRelationship_Name() {
		return (EAttribute) getSupportedConceptRelationship().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedConceptRelationship_Reflexivity() {
		return (EAttribute) getSupportedConceptRelationship().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedConceptRelationship_RelationshipKind() {
		return (EAttribute) getSupportedConceptRelationship().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedConceptRelationship_Symmetry() {
		return (EAttribute) getSupportedConceptRelationship().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedConceptRelationship_Transitivity() {
		return (EAttribute) getSupportedConceptRelationship().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedProperty() {
		if (supportedPropertyEClass == null) {
			supportedPropertyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				524);
		}
		return supportedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedProperty_Description() {
		return (EReference) getSupportedProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedProperty_EnumerationValue() {
		return (EAttribute) getSupportedProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedProperty_DefaultValue() {
		return (EAttribute) getSupportedProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedProperty_IsMandatoryIndicator() {
		return (EAttribute) getSupportedProperty().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedProperty_PropertyName() {
		return (EAttribute) getSupportedProperty().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedProperty_Type() {
		return (EAttribute) getSupportedProperty().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermDefinition() {
		if (termDefinitionEClass == null) {
			termDefinitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				528);
		}
		return termDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermDefinition_TermTranslation() {
		return (EReference) getTermDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermDefinition_Definition() {
		return (EReference) getTermDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermDefinition_SeeAlso() {
		return (EAttribute) getTermDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermDefinition_Term() {
		return (EAttribute) getTermDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyServer() {
		if (terminologyServerEClass == null) {
			terminologyServerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				529);
		}
		return terminologyServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminologyServer_Type() {
		return (EAttribute) getTerminologyServer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminologyServer_Url() {
		return (EAttribute) getTerminologyServer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		if (testEClass == null) {
			testEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(532);
		}
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_InteractionTest() {
		return (EReference) getTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_DocumentTest() {
		return (EReference) getTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestBase() {
		if (testBaseEClass == null) {
			testBaseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				533);
		}
		return testBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestBase_Objective() {
		return (EReference) getTestBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestBase_DataVariation() {
		return (EReference) getTestBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestBase_Name() {
		return (EAttribute) getTestBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestBase_Sequence() {
		return (EAttribute) getTestBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScenario() {
		if (testScenarioEClass == null) {
			testScenarioEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				534);
		}
		return testScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScenario_Objective() {
		return (EReference) getTestScenario().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScenario_TestSystem() {
		return (EReference) getTestScenario().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestScenario_Test() {
		return (EReference) getTestScenario().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSystem() {
		if (testSystemEClass == null) {
			testSystemEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				535);
		}
		return testSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSystem_PreConditions() {
		return (EReference) getTestSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSystem_ExpectedPostConditions() {
		return (EReference) getTestSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSystem_TestedApplicationRole() {
		return (EReference) getTestSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSystem_TestedProfile() {
		return (EReference) getTestSystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSystem_Name() {
		return (EAttribute) getTestSystem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSystem_UnderTest() {
		return (EAttribute) getTestSystem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		if (transitionEClass == null) {
			transitionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				536);
		}
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_BusinessName() {
		return (EReference) getTransition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Annotations() {
		return (EReference) getTransition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_DerivedFrom() {
		return (EReference) getTransition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_EndStateName() {
		return (EAttribute) getTransition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute) getTransition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_SortKey() {
		return (EAttribute) getTransition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_StartStateName() {
		return (EAttribute) getTransition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionAnnotations() {
		if (transitionAnnotationsEClass == null) {
			transitionAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				537);
		}
		return transitionAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionAppInfo() {
		if (transitionAppInfoEClass == null) {
			transitionAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				538);
		}
		return transitionAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionDerivation() {
		if (transitionDerivationEClass == null) {
			transitionDerivationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				539);
		}
		return transitionDerivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionDerivation_StartStateName() {
		return (EAttribute) getTransitionDerivation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionDerivation_StateTransitionName() {
		return (EAttribute) getTransitionDerivation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionDocumentation() {
		if (transitionDocumentationEClass == null) {
			transitionDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				540);
		}
		return transitionDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionRef() {
		if (transitionRefEClass == null) {
			transitionRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				541);
		}
		return transitionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionRef_StateTransitionName() {
		return (EAttribute) getTransitionRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerEvent() {
		if (triggerEventEClass == null) {
			triggerEventEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				546);
		}
		return triggerEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerEvent_Annotations() {
		return (EReference) getTriggerEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerEvent_Interaction() {
		return (EReference) getTriggerEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerEvent_StateTransition() {
		return (EReference) getTriggerEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriggerEvent_EnvironmentalOccurrence() {
		return (EReference) getTriggerEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerEventAnnotations() {
		if (triggerEventAnnotationsEClass == null) {
			triggerEventAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				547);
		}
		return triggerEventAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerEventAppInfo() {
		if (triggerEventAppInfoEClass == null) {
			triggerEventAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				548);
		}
		return triggerEventAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerEventDocumentation() {
		if (triggerEventDocumentationEClass == null) {
			triggerEventDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				549);
		}
		return triggerEventDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSet() {
		if (valueSetEClass == null) {
			valueSetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				560);
		}
		return valueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_BusinessName() {
		return (EReference) getValueSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Annotations() {
		return (EReference) getValueSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Version() {
		return (EReference) getValueSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSet_Id() {
		return (EAttribute) getValueSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSet_IsImmutable() {
		return (EAttribute) getValueSet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSet_Name() {
		return (EAttribute) getValueSet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSet_SortKey() {
		return (EAttribute) getValueSet().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetAnnotations() {
		if (valueSetAnnotationsEClass == null) {
			valueSetAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				561);
		}
		return valueSetAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetAppInfo() {
		if (valueSetAppInfoEClass == null) {
			valueSetAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				562);
		}
		return valueSetAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetDocumentation() {
		if (valueSetDocumentationEClass == null) {
			valueSetDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				563);
		}
		return valueSetDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetSupplement() {
		if (valueSetSupplementEClass == null) {
			valueSetSupplementEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				564);
		}
		return valueSetSupplementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetSupplement_BusinessName() {
		return (EReference) getValueSetSupplement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetSupplement_Annotations() {
		return (EReference) getValueSetSupplement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetVersion() {
		if (valueSetVersionEClass == null) {
			valueSetVersionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				565);
		}
		return valueSetVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_UsesCodeSystemSupplement() {
		return (EAttribute) getValueSetVersion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_SupportedCodeSystem() {
		return (EAttribute) getValueSetVersion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_SupportedLanguage() {
		return (EAttribute) getValueSetVersion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetVersion_AssociatedConceptProperty() {
		return (EReference) getValueSetVersion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetVersion_Content() {
		return (EReference) getValueSetVersion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetVersion_NonSelectableContent() {
		return (EReference) getValueSetVersion().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetVersion_EnumeratedContent() {
		return (EReference) getValueSetVersion().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetVersion_ExampleContent() {
		return (EReference) getValueSetVersion().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_VersionDate() {
		return (EAttribute) getValueSetVersion().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSetVersion_VersionTime() {
		return (EAttribute) getValueSetVersion().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariousMixedContent() {
		if (variousMixedContentEClass == null) {
			variousMixedContentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				566);
		}
		return variousMixedContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariousMixedContent_Mixed() {
		return (EAttribute) getVariousMixedContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariousMixedContent_Group() {
		return (EAttribute) getVariousMixedContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariousMixedContent_Any() {
		return (EAttribute) getVariousMixedContent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertex() {
		if (vertexEClass == null) {
			vertexEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				568);
		}
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertex_SortKey() {
		return (EAttribute) getVertex().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabularyCodeRef() {
		if (vocabularyCodeRefEClass == null) {
			vocabularyCodeRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				571);
		}
		return vocabularyCodeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyCodeRef_Qualifier() {
		return (EReference) getVocabularyCodeRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyCodeRef_Code() {
		return (EAttribute) getVocabularyCodeRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyCodeRef_CodePrintName() {
		return (EAttribute) getVocabularyCodeRef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyCodeRef_CodeSystem() {
		return (EAttribute) getVocabularyCodeRef().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyCodeRef_CodeSystemName() {
		return (EAttribute) getVocabularyCodeRef().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyCodeRef_CodeSystemVersion() {
		return (EAttribute) getVocabularyCodeRef().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabularyCodeRefs() {
		if (vocabularyCodeRefsEClass == null) {
			vocabularyCodeRefsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				572);
		}
		return vocabularyCodeRefsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyCodeRefs_Code() {
		return (EReference) getVocabularyCodeRefs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabularyLimitation() {
		if (vocabularyLimitationEClass == null) {
			vocabularyLimitationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				573);
		}
		return vocabularyLimitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyLimitation_DefinedVocabularyElement() {
		return (EReference) getVocabularyLimitation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyLimitation_SubstituteVocabularyElement() {
		return (EReference) getVocabularyLimitation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyLimitation_MinimumUpdateTime() {
		return (EAttribute) getVocabularyLimitation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabularyModel() {
		if (vocabularyModelEClass == null) {
			vocabularyModelEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				574);
		}
		return vocabularyModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyModel_Annotations() {
		return (EReference) getVocabularyModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyModel_DependsOnVocabModel() {
		return (EReference) getVocabularyModel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyModel_ConceptDomain() {
		return (EReference) getVocabularyModel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyModel_CodeSystem() {
		return (EReference) getVocabularyModel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyModel_ValueSet() {
		return (EReference) getVocabularyModel().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyModel_BindingRealm() {
		return (EReference) getVocabularyModel().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyModel_ContextBinding() {
		return (EReference) getVocabularyModel().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyModel_CodeTranslations() {
		return (EReference) getVocabularyModel().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularyModel_CodeSystemSupplement() {
		return (EReference) getVocabularyModel().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyModel_DefinitionKind() {
		return (EAttribute) getVocabularyModel().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabularyModelAnnotations() {
		if (vocabularyModelAnnotationsEClass == null) {
			vocabularyModelAnnotationsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				575);
		}
		return vocabularyModelAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabularyModelAppInfo() {
		if (vocabularyModelAppInfoEClass == null) {
			vocabularyModelAppInfoEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				576);
		}
		return vocabularyModelAppInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabularyModelDocumentation() {
		if (vocabularyModelDocumentationEClass == null) {
			vocabularyModelDocumentationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				579);
		}
		return vocabularyModelDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabularySpecification() {
		if (vocabularySpecificationEClass == null) {
			vocabularySpecificationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				580);
		}
		return vocabularySpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularySpecification_ConceptDomain() {
		return (EReference) getVocabularySpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularySpecification_ValueSet() {
		return (EReference) getVocabularySpecification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVocabularySpecification_Code() {
		return (EReference) getVocabularySpecification().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabularyValueSetBinding() {
		if (vocabularyValueSetBindingEClass == null) {
			vocabularyValueSetBindingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				581);
		}
		return vocabularyValueSetBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyValueSetBinding_CodingStrength() {
		return (EAttribute) getVocabularyValueSetBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyValueSetBinding_IgnoredValueSet() {
		return (EAttribute) getVocabularyValueSetBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyValueSetBinding_MinimumValueSet() {
		return (EAttribute) getVocabularyValueSetBinding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyValueSetBinding_RevisionFrequency() {
		return (EAttribute) getVocabularyValueSetBinding().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyValueSetBinding_RootCode() {
		return (EAttribute) getVocabularyValueSetBinding().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVocabularyValueSetRef() {
		if (vocabularyValueSetRefEClass == null) {
			vocabularyValueSetRefEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				582);
		}
		return vocabularyValueSetRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyValueSetRef_Id() {
		return (EAttribute) getVocabularyValueSetRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyValueSetRef_Name() {
		return (EAttribute) getVocabularyValueSetRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyValueSetRef_VersionDate() {
		return (EAttribute) getVocabularyValueSetRef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVocabularyValueSetRef_VersionTime() {
		return (EAttribute) getVocabularyValueSetRef().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMIContent() {
		if (xmiContentEClass == null) {
			xmiContentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				589);
		}
		return xmiContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMIContent_Any() {
		return (EAttribute) getXMIContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMIContent_Href() {
		return (EAttribute) getXMIContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAffiliateKind() {
		if (affiliateKindEEnum == null) {
			affiliateKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				1);
		}
		return affiliateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAffirmativeVoteResolutionKind() {
		if (affirmativeVoteResolutionKindEEnum == null) {
			affirmativeVoteResolutionKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				3);
		}
		return affirmativeVoteResolutionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnnotationKind() {
		if (annotationKindEEnum == null) {
			annotationKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				9);
		}
		return annotationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApplicationRoleRelationshipKind() {
		if (applicationRoleRelationshipKindEEnum == null) {
			applicationRoleRelationshipKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				18);
		}
		return applicationRoleRelationshipKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApprovalStatusKind() {
		if (approvalStatusKindEEnum == null) {
			approvalStatusKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				22);
		}
		return approvalStatusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArtifactGroupKind() {
		if (artifactGroupKindEEnum == null) {
			artifactGroupKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				26);
		}
		return artifactGroupKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArtifactKind() {
		if (artifactKindEEnum == null) {
			artifactKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				28);
		}
		return artifactKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArtifactRenderingStyleKind() {
		if (artifactRenderingStyleKindEEnum == null) {
			artifactRenderingStyleKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				30);
		}
		return artifactRenderingStyleKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributePropertyKind() {
		if (attributePropertyKindEEnum == null) {
			attributePropertyKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				58);
		}
		return attributePropertyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCascadingAnnotationElementKind() {
		if (cascadingAnnotationElementKindEEnum == null) {
			cascadingAnnotationElementKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				72);
		}
		return cascadingAnnotationElementKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChangeRequestStatus() {
		if (changeRequestStatusEEnum == null) {
			changeRequestStatusEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				77);
		}
		return changeRequestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassPresentationKind() {
		if (classPresentationKindEEnum == null) {
			classPresentationKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				93);
		}
		return classPresentationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCMETAttributionKind() {
		if (cmetAttributionKindEEnum == null) {
			cmetAttributionKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				100);
		}
		return cmetAttributionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCMETEntryKind() {
		if (cmetEntryKindEEnum == null) {
			cmetEntryKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				104);
		}
		return cmetEntryKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodeFilterExpressionKind() {
		if (codeFilterExpressionKindEEnum == null) {
			codeFilterExpressionKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				109);
		}
		return codeFilterExpressionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodeStatusKind() {
		if (codeStatusKindEEnum == null) {
			codeStatusKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				112);
		}
		return codeStatusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodingStrengthKind() {
		if (codingStrengthKindEEnum == null) {
			codingStrengthKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				136);
		}
		return codingStrengthKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConceptDomainPropertyKind() {
		if (conceptDomainPropertyKindEEnum == null) {
			conceptDomainPropertyKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				158);
		}
		return conceptDomainPropertyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConceptPropertyTypeKind() {
		if (conceptPropertyTypeKindEEnum == null) {
			conceptPropertyTypeKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				163);
		}
		return conceptPropertyTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConceptRelationshipKind() {
		if (conceptRelationshipKindEEnum == null) {
			conceptRelationshipKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				167);
		}
		return conceptRelationshipKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConceptUseKind() {
		if (conceptUseKindEEnum == null) {
			conceptUseKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				174);
		}
		return conceptUseKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConformanceKind() {
		if (conformanceKindEEnum == null) {
			conformanceKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				176);
		}
		return conformanceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstructedElementKind() {
		if (constructedElementKindEEnum == null) {
			constructedElementKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				183);
		}
		return constructedElementKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContentsLevelKind() {
		if (contentsLevelKindEEnum == null) {
			contentsLevelKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				190);
		}
		return contentsLevelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatatypeKind() {
		if (datatypeKindEEnum == null) {
			datatypeKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				202);
		}
		return datatypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatatypeOperationKind() {
		if (datatypeOperationKindEEnum == null) {
			datatypeOperationKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				208);
		}
		return datatypeOperationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatatypeQualifierKind() {
		if (datatypeQualifierKindEEnum == null) {
			datatypeQualifierKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				211);
		}
		return datatypeQualifierKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefaultDeterminerKind() {
		if (defaultDeterminerKindEEnum == null) {
			defaultDeterminerKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				217);
		}
		return defaultDeterminerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefinedMappingSourceKind() {
		if (definedMappingSourceKindEEnum == null) {
			definedMappingSourceKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				220);
		}
		return definedMappingSourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDefinedRoleKind() {
		if (definedRoleKindEEnum == null) {
			definedRoleKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				222);
		}
		return definedRoleKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDerivationRelationshipKind() {
		if (derivationRelationshipKindEEnum == null) {
			derivationRelationshipKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				227);
		}
		return derivationRelationshipKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDesignCommentTagKind() {
		if (designCommentTagKindEEnum == null) {
			designCommentTagKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				232);
		}
		return designCommentTagKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentProfileKind() {
		if (documentProfileKindEEnum == null) {
			documentProfileKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				243);
		}
		return documentProfileKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDomainKind() {
		if (domainKindEEnum == null) {
			domainKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				255);
		}
		return domainKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurationUnitsKind() {
		if (durationUnitsKindEEnum == null) {
			durationUnitsKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				257);
		}
		return durationUnitsKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEffortQuantifierKind() {
		if (effortQuantifierKindEEnum == null) {
			effortQuantifierKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				259);
		}
		return effortQuantifierKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpressionLanguageKind() {
		if (expressionLanguageKindEEnum == null) {
			expressionLanguageKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				277);
		}
		return expressionLanguageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterKind() {
		if (filterKindEEnum == null) {
			filterKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				280);
		}
		return filterKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFunctionalism() {
		if (functionalismEEnum == null) {
			functionalismEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				292);
		}
		return functionalismEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIconFormatKind() {
		if (iconFormatKindEEnum == null) {
			iconFormatKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				339);
		}
		return iconFormatKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInteractionKind() {
		if (interactionKindEEnum == null) {
			interactionKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				349);
		}
		return interactionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInteractionProfileKind() {
		if (interactionProfileKindEEnum == null) {
			interactionProfileKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				355);
		}
		return interactionProfileKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getITSKind() {
		if (itsKindEEnum == null) {
			itsKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				360);
		}
		return itsKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMapRelationshipKind() {
		if (mapRelationshipKindEEnum == null) {
			mapRelationshipKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				371);
		}
		return mapRelationshipKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelConformanceKind() {
		if (modelConformanceKindEEnum == null) {
			modelConformanceKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				376);
		}
		return modelConformanceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNegativeVoteResolutionKind() {
		if (negativeVoteResolutionKindEEnum == null) {
			negativeVoteResolutionKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				379);
		}
		return negativeVoteResolutionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeOrientation() {
		if (nodeOrientationEEnum == null) {
			nodeOrientationEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				382);
		}
		return nodeOrientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOwnerScopeKind() {
		if (ownerScopeKindEEnum == null) {
			ownerScopeKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				397);
		}
		return ownerScopeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPackageKind() {
		if (packageKindEEnum == null) {
			packageKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				408);
		}
		return packageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPackageRootKind() {
		if (packageRootKindEEnum == null) {
			packageRootKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				412);
		}
		return packageRootKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParentArtifactKind() {
		if (parentArtifactKindEEnum == null) {
			parentArtifactKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				415);
		}
		return parentArtifactKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyDefaultHandlingKind() {
		if (propertyDefaultHandlingKindEEnum == null) {
			propertyDefaultHandlingKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				422);
		}
		return propertyDefaultHandlingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReflexivity() {
		if (reflexivityEEnum == null) {
			reflexivityEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				437);
		}
		return reflexivityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationshipTraversalKind() {
		if (relationshipTraversalKindEEnum == null) {
			relationshipTraversalKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				442);
		}
		return relationshipTraversalKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRevisionFrequencyKind() {
		if (revisionFrequencyKindEEnum == null) {
			revisionFrequencyKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				449);
		}
		return revisionFrequencyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSectionKind() {
		if (sectionKindEEnum == null) {
			sectionKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				452);
		}
		return sectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStaticModelDiagramPresentationKind() {
		if (staticModelDiagramPresentationKindEEnum == null) {
			staticModelDiagramPresentationKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(487);
		}
		return staticModelDiagramPresentationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStaticModelRepresentationKind() {
		if (staticModelRepresentationKindEEnum == null) {
			staticModelRepresentationKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				495);
		}
		return staticModelRepresentationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStaticModelUseKind() {
		if (staticModelUseKindEEnum == null) {
			staticModelUseKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				498);
		}
		return staticModelUseKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubArtifactKind() {
		if (subArtifactKindEEnum == null) {
			subArtifactKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				513);
		}
		return subArtifactKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubSectionKind() {
		if (subSectionKindEEnum == null) {
			subSectionKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				519);
		}
		return subSectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSymmetry() {
		if (symmetryEEnum == null) {
			symmetryEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				525);
		}
		return symmetryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTerminologyServerKind() {
		if (terminologyServerKindEEnum == null) {
			terminologyServerKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				530);
		}
		return terminologyServerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitivity() {
		if (transitivityEEnum == null) {
			transitivityEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				542);
		}
		return transitivityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTranslatableDirectionKind() {
		if (translatableDirectionKindEEnum == null) {
			translatableDirectionKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				544);
		}
		return translatableDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnlimitedMultiplicity() {
		if (unlimitedMultiplicityEEnum == null) {
			unlimitedMultiplicityEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				551);
		}
		return unlimitedMultiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUpdateModeKind() {
		if (updateModeKindEEnum == null) {
			updateModeKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				554);
		}
		return updateModeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		if (visibilityKindEEnum == null) {
			visibilityKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				569);
		}
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVocabularyModelDefinitionKind() {
		if (vocabularyModelDefinitionKindEEnum == null) {
			vocabularyModelDefinitionKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				577);
		}
		return vocabularyModelDefinitionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVoteCommentKind() {
		if (voteCommentKindEEnum == null) {
			voteCommentKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				583);
		}
		return voteCommentKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVoteKind() {
		if (voteKindEEnum == null) {
			voteKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				585);
		}
		return voteKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAffiliateKindObject() {
		if (affiliateKindObjectEDataType == null) {
			affiliateKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				2);
		}
		return affiliateKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAffirmativeVoteResolutionKindObject() {
		if (affirmativeVoteResolutionKindObjectEDataType == null) {
			affirmativeVoteResolutionKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(4);
		}
		return affirmativeVoteResolutionKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAllClassName() {
		if (allClassNameEDataType == null) {
			allClassNameEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				5);
		}
		return allClassNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnnotationKindObject() {
		if (annotationKindObjectEDataType == null) {
			annotationKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				10);
		}
		return annotationKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getApplicationRoleRelationshipKindObject() {
		if (applicationRoleRelationshipKindObjectEDataType == null) {
			applicationRoleRelationshipKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(19);
		}
		return applicationRoleRelationshipKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getApprovalStatusKindObject() {
		if (approvalStatusKindObjectEDataType == null) {
			approvalStatusKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				23);
		}
		return approvalStatusKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArtifactGroupKindObject() {
		if (artifactGroupKindObjectEDataType == null) {
			artifactGroupKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				27);
		}
		return artifactGroupKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArtifactKindObject() {
		if (artifactKindObjectEDataType == null) {
			artifactKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				29);
		}
		return artifactKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArtifactRenderingStyleKindObject() {
		if (artifactRenderingStyleKindObjectEDataType == null) {
			artifactRenderingStyleKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(31);
		}
		return artifactRenderingStyleKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAttributePropertyKindObject() {
		if (attributePropertyKindObjectEDataType == null) {
			attributePropertyKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(59);
		}
		return attributePropertyKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBasicFormalName() {
		if (basicFormalNameEDataType == null) {
			basicFormalNameEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				66);
		}
		return basicFormalNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBasicId() {
		if (basicIdEDataType == null) {
			basicIdEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				67);
		}
		return basicIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCascadingAnnotationElementKindObject() {
		if (cascadingAnnotationElementKindObjectEDataType == null) {
			cascadingAnnotationElementKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(73);
		}
		return cascadingAnnotationElementKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getChangeRequestStatusObject() {
		if (changeRequestStatusObjectEDataType == null) {
			changeRequestStatusObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				78);
		}
		return changeRequestStatusObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassPresentationKindObject() {
		if (classPresentationKindObjectEDataType == null) {
			classPresentationKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(94);
		}
		return classPresentationKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCMETAttributionKindObject() {
		if (cmetAttributionKindObjectEDataType == null) {
			cmetAttributionKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				101);
		}
		return cmetAttributionKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCMETAttributionString() {
		if (cmetAttributionStringEDataType == null) {
			cmetAttributionStringEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				102);
		}
		return cmetAttributionStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCMETAttributionType() {
		if (cmetAttributionTypeEDataType == null) {
			cmetAttributionTypeEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				103);
		}
		return cmetAttributionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCMETEntryKindObject() {
		if (cmetEntryKindObjectEDataType == null) {
			cmetEntryKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				105);
		}
		return cmetEntryKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCodeFilterExpressionKindObject() {
		if (codeFilterExpressionKindObjectEDataType == null) {
			codeFilterExpressionKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(110);
		}
		return codeFilterExpressionKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCodeStatusKindObject() {
		if (codeStatusKindObjectEDataType == null) {
			codeStatusKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				113);
		}
		return codeStatusKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCodingStrengthKindObject() {
		if (codingStrengthKindObjectEDataType == null) {
			codingStrengthKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				137);
		}
		return codingStrengthKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCollapsedPackageId() {
		if (collapsedPackageIdEDataType == null) {
			collapsedPackageIdEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				138);
		}
		return collapsedPackageIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConceptDomainPropertyKindObject() {
		if (conceptDomainPropertyKindObjectEDataType == null) {
			conceptDomainPropertyKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(159);
		}
		return conceptDomainPropertyKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConceptPropertyTypeKindObject() {
		if (conceptPropertyTypeKindObjectEDataType == null) {
			conceptPropertyTypeKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(164);
		}
		return conceptPropertyTypeKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConceptRelationshipKindObject() {
		if (conceptRelationshipKindObjectEDataType == null) {
			conceptRelationshipKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(168);
		}
		return conceptRelationshipKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConceptUseKindObject() {
		if (conceptUseKindObjectEDataType == null) {
			conceptUseKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				175);
		}
		return conceptUseKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConformanceKindObject() {
		if (conformanceKindObjectEDataType == null) {
			conformanceKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				177);
		}
		return conformanceKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConstructedElementKindObject() {
		if (constructedElementKindObjectEDataType == null) {
			constructedElementKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(184);
		}
		return constructedElementKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContentsLevelKindObject() {
		if (contentsLevelKindObjectEDataType == null) {
			contentsLevelKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				191);
		}
		return contentsLevelKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatatypeKindObject() {
		if (datatypeKindObjectEDataType == null) {
			datatypeKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				203);
		}
		return datatypeKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatatypeName() {
		if (datatypeNameEDataType == null) {
			datatypeNameEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				206);
		}
		return datatypeNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatatypeOperationKindObject() {
		if (datatypeOperationKindObjectEDataType == null) {
			datatypeOperationKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(209);
		}
		return datatypeOperationKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatatypeQualifierKindObject() {
		if (datatypeQualifierKindObjectEDataType == null) {
			datatypeQualifierKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(212);
		}
		return datatypeQualifierKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateOrTimestamp() {
		if (dateOrTimestampEDataType == null) {
			dateOrTimestampEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				215);
		}
		return dateOrTimestampEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDecimal() {
		if (decimalEDataType == null) {
			decimalEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				216);
		}
		return decimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefaultDeterminerKindObject() {
		if (defaultDeterminerKindObjectEDataType == null) {
			defaultDeterminerKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(218);
		}
		return defaultDeterminerKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefinedContextKind() {
		if (definedContextKindEDataType == null) {
			definedContextKindEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				219);
		}
		return definedContextKindEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefinedMappingSourceKindObject() {
		if (definedMappingSourceKindObjectEDataType == null) {
			definedMappingSourceKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(221);
		}
		return definedMappingSourceKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDefinedRoleKindObject() {
		if (definedRoleKindObjectEDataType == null) {
			definedRoleKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				223);
		}
		return definedRoleKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDerivationRelationshipKindObject() {
		if (derivationRelationshipKindObjectEDataType == null) {
			derivationRelationshipKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(228);
		}
		return derivationRelationshipKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDesignCommentTagKindObject() {
		if (designCommentTagKindObjectEDataType == null) {
			designCommentTagKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(233);
		}
		return designCommentTagKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDocumentProfileKindObject() {
		if (documentProfileKindObjectEDataType == null) {
			documentProfileKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				244);
		}
		return documentProfileKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDomainKindObject() {
		if (domainKindObjectEDataType == null) {
			domainKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				256);
		}
		return domainKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDurationUnitsKindObject() {
		if (durationUnitsKindObjectEDataType == null) {
			durationUnitsKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				258);
		}
		return durationUnitsKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEffortQuantifierKindObject() {
		if (effortQuantifierKindObjectEDataType == null) {
			effortQuantifierKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(260);
		}
		return effortQuantifierKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEMail() {
		if (eMailEDataType == null) {
			eMailEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				265);
		}
		return eMailEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnumerationString() {
		if (enumerationStringEDataType == null) {
			enumerationStringEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				271);
		}
		return enumerationStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnumerationToken() {
		if (enumerationTokenEDataType == null) {
			enumerationTokenEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				272);
		}
		return enumerationTokenEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExpressionLanguageKindObject() {
		if (expressionLanguageKindObjectEDataType == null) {
			expressionLanguageKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(278);
		}
		return expressionLanguageKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFilterKindObject() {
		if (filterKindObjectEDataType == null) {
			filterKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				281);
		}
		return filterKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFormalProperName() {
		if (formalProperNameEDataType == null) {
			formalProperNameEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				285);
		}
		return formalProperNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFormalPropertyName() {
		if (formalPropertyNameEDataType == null) {
			formalPropertyNameEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				286);
		}
		return formalPropertyNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFunctionalismObject() {
		if (functionalismObjectEDataType == null) {
			functionalismObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				293);
		}
		return functionalismObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGraphicMeasurement() {
		if (graphicMeasurementEDataType == null) {
			graphicMeasurementEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				331);
		}
		return graphicMeasurementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHashCode() {
		if (hashCodeEDataType == null) {
			hashCodeEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				336);
		}
		return hashCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIconFormatKindObject() {
		if (iconFormatKindObjectEDataType == null) {
			iconFormatKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				340);
		}
		return iconFormatKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteractionKindObject() {
		if (interactionKindObjectEDataType == null) {
			interactionKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				350);
		}
		return interactionKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteractionProfileKindObject() {
		if (interactionProfileKindObjectEDataType == null) {
			interactionProfileKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(356);
		}
		return interactionProfileKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getITSKindObject() {
		if (itsKindObjectEDataType == null) {
			itsKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				361);
		}
		return itsKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocalFileReference() {
		if (localFileReferenceEDataType == null) {
			localFileReferenceEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				366);
		}
		return localFileReferenceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLongDescriptiveName() {
		if (longDescriptiveNameEDataType == null) {
			longDescriptiveNameEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				367);
		}
		return longDescriptiveNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLowerCamelCase() {
		if (lowerCamelCaseEDataType == null) {
			lowerCamelCaseEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				368);
		}
		return lowerCamelCaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMappingSourceKind() {
		if (mappingSourceKindEDataType == null) {
			mappingSourceKindEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				370);
		}
		return mappingSourceKindEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMapRelationshipKindObject() {
		if (mapRelationshipKindObjectEDataType == null) {
			mapRelationshipKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				372);
		}
		return mapRelationshipKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMimeType() {
		if (mimeTypeEDataType == null) {
			mimeTypeEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				375);
		}
		return mimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModelConformanceKindObject() {
		if (modelConformanceKindObjectEDataType == null) {
			modelConformanceKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(377);
		}
		return modelConformanceKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNegativeVoteResolutionKindObject() {
		if (negativeVoteResolutionKindObjectEDataType == null) {
			negativeVoteResolutionKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(380);
		}
		return negativeVoteResolutionKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNodeOrientationObject() {
		if (nodeOrientationObjectEDataType == null) {
			nodeOrientationObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				383);
		}
		return nodeOrientationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonEmptyString() {
		if (nonEmptyStringEDataType == null) {
			nonEmptyStringEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				386);
		}
		return nonEmptyStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonNegativeDecimal() {
		if (nonNegativeDecimalEDataType == null) {
			nonNegativeDecimalEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				387);
		}
		return nonNegativeDecimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOid() {
		if (oidEDataType == null) {
			oidEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				389);
		}
		return oidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOwnerScopeKindObject() {
		if (ownerScopeKindObjectEDataType == null) {
			ownerScopeKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				398);
		}
		return ownerScopeKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPackageKindObject() {
		if (packageKindObjectEDataType == null) {
			packageKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				409);
		}
		return packageKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPackageRootKindObject() {
		if (packageRootKindObjectEDataType == null) {
			packageRootKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				413);
		}
		return packageRootKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParentArtifactKindObject() {
		if (parentArtifactKindObjectEDataType == null) {
			parentArtifactKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				416);
		}
		return parentArtifactKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveDecimal() {
		if (positiveDecimalEDataType == null) {
			positiveDecimalEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				418);
		}
		return positiveDecimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrefixedUpperCamelCase() {
		if (prefixedUpperCamelCaseEDataType == null) {
			prefixedUpperCamelCaseEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				419);
		}
		return prefixedUpperCamelCaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyDefaultHandlingKindObject() {
		if (propertyDefaultHandlingKindObjectEDataType == null) {
			propertyDefaultHandlingKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(423);
		}
		return propertyDefaultHandlingKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRealmKind() {
		if (realmKindEDataType == null) {
			realmKindEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				434);
		}
		return realmKindEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRealmNamespaceKind() {
		if (realmNamespaceKindEDataType == null) {
			realmNamespaceKindEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				435);
		}
		return realmNamespaceKindEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReflexivityObject() {
		if (reflexivityObjectEDataType == null) {
			reflexivityObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				438);
		}
		return reflexivityObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelationshipTraversalKindObject() {
		if (relationshipTraversalKindObjectEDataType == null) {
			relationshipTraversalKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(443);
		}
		return relationshipTraversalKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRevisionFrequencyKindObject() {
		if (revisionFrequencyKindObjectEDataType == null) {
			revisionFrequencyKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(450);
		}
		return revisionFrequencyKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoleKind() {
		if (roleKindEDataType == null) {
			roleKindEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				451);
		}
		return roleKindEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSectionKindObject() {
		if (sectionKindObjectEDataType == null) {
			sectionKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				453);
		}
		return sectionKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShortDescriptiveName() {
		if (shortDescriptiveNameEDataType == null) {
			shortDescriptiveNameEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				464);
		}
		return shortDescriptiveNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShortString() {
		if (shortStringEDataType == null) {
			shortStringEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				465);
		}
		return shortStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSingleNonNegativeInteger() {
		if (singleNonNegativeIntegerEDataType == null) {
			singleNonNegativeIntegerEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				466);
		}
		return singleNonNegativeIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSmallNonNegativeInteger() {
		if (smallNonNegativeIntegerEDataType == null) {
			smallNonNegativeIntegerEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				467);
		}
		return smallNonNegativeIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSmallPositiveInteger() {
		if (smallPositiveIntegerEDataType == null) {
			smallPositiveIntegerEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				468);
		}
		return smallPositiveIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStaticModelDiagramPresentationKindObject() {
		if (staticModelDiagramPresentationKindObjectEDataType == null) {
			staticModelDiagramPresentationKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(488);
		}
		return staticModelDiagramPresentationKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStaticModelRepresentationKindObject() {
		if (staticModelRepresentationKindObjectEDataType == null) {
			staticModelRepresentationKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(496);
		}
		return staticModelRepresentationKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStaticModelUseKindObject() {
		if (staticModelUseKindObjectEDataType == null) {
			staticModelUseKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				499);
		}
		return staticModelUseKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubArtifactKindObject() {
		if (subArtifactKindObjectEDataType == null) {
			subArtifactKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				514);
		}
		return subArtifactKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubSectionKindObject() {
		if (subSectionKindObjectEDataType == null) {
			subSectionKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				520);
		}
		return subSectionKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSymmetryObject() {
		if (symmetryObjectEDataType == null) {
			symmetryObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				526);
		}
		return symmetryObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTemplateId() {
		if (templateIdEDataType == null) {
			templateIdEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				527);
		}
		return templateIdEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTerminologyServerKindObject() {
		if (terminologyServerKindObjectEDataType == null) {
			terminologyServerKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(531);
		}
		return terminologyServerKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransitivityObject() {
		if (transitivityObjectEDataType == null) {
			transitivityObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				543);
		}
		return transitivityObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTranslatableDirectionKindObject() {
		if (translatableDirectionKindObjectEDataType == null) {
			translatableDirectionKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(545);
		}
		return translatableDirectionKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnlimitedInteger() {
		if (unlimitedIntegerEDataType == null) {
			unlimitedIntegerEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				550);
		}
		return unlimitedIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnlimitedMultiplicityObject() {
		if (unlimitedMultiplicityObjectEDataType == null) {
			unlimitedMultiplicityObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(552);
		}
		return unlimitedMultiplicityObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUpdateModeCodes() {
		if (updateModeCodesEDataType == null) {
			updateModeCodesEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				553);
		}
		return updateModeCodesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUpdateModeKindObject() {
		if (updateModeKindObjectEDataType == null) {
			updateModeKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				555);
		}
		return updateModeKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUpperCamelCase() {
		if (upperCamelCaseEDataType == null) {
			upperCamelCaseEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				556);
		}
		return upperCamelCaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUri() {
		if (uriEDataType == null) {
			uriEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				557);
		}
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUrl() {
		if (urlEDataType == null) {
			urlEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				558);
		}
		return urlEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUuid() {
		if (uuidEDataType == null) {
			uuidEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				559);
		}
		return uuidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersion() {
		if (versionEDataType == null) {
			versionEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				567);
		}
		return versionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVisibilityKindObject() {
		if (visibilityKindObjectEDataType == null) {
			visibilityKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				570);
		}
		return visibilityKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVocabularyModelDefinitionKindObject() {
		if (vocabularyModelDefinitionKindObjectEDataType == null) {
			vocabularyModelDefinitionKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(
				Mif2Package.eNS_URI).getEClassifiers().get(578);
		}
		return vocabularyModelDefinitionKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVoteCommentKindObject() {
		if (voteCommentKindObjectEDataType == null) {
			voteCommentKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				584);
		}
		return voteCommentKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVoteKindObject() {
		if (voteKindObjectEDataType == null) {
			voteKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				586);
		}
		return voteKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVoteResolutionKind() {
		if (voteResolutionKindEDataType == null) {
			voteResolutionKindEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				587);
		}
		return voteResolutionKindEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getXDomainName() {
		if (xDomainNameEDataType == null) {
			xDomainNameEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				588);
		}
		return xDomainNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYear() {
		if (yearEDataType == null) {
			yearEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				590);
		}
		return yearEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYears() {
		if (yearsEDataType == null) {
			yearsEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(Mif2Package.eNS_URI).getEClassifiers().get(
				591);
		}
		return yearsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mif2Factory getMif2Factory() {
		return (Mif2Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) {
			return;
		}
		isLoaded = true;

		java.net.URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) {
			return;
		}
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.openhealthtools.mdht.emf.hl7.mif2." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} // Mif2PackageImpl
