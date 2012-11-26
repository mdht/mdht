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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.DerivedStaticModelsType;
import org.openhealthtools.mdht.emf.hl7.mif2.DocumentRoot;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalApplicationRole;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalArtifactXRefSummary;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalCodeSystem;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalCodeSystemSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalConformanceProfile;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalDatatypeModelLibrary;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalDerivedStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalDomainAnalysisModel;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalDomainInstanceExample;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalFreehandDocument;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalGenericPackage;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalGlossary;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalInteraction;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalInteractionProfile;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalMifChanges;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalPublicationPackage;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalSerializedStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalStaticModelInterfacePackage;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalStoryboard;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalStructuredDocument;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalTestScenario;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalTriggerEvent;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalValueSet;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalVocabularyModel;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModelsType;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelsType;
import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;
import org.openhealthtools.mdht.emf.w3c.xhtml.Inline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getApplicationRole <em>Application Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getArtifactXrefSummary <em>Artifact Xref Summary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getCodeSystemSupplement <em>Code System Supplement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getConformanceProfile <em>Conformance Profile</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getDatatypeModelLibrary <em>Datatype Model Library</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getDerivedStaticModel <em>Derived Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getDerivedStaticModels <em>Derived Static Models</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getDomainAnalysisModel <em>Domain Analysis Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getDomainInstanceExample <em>Domain Instance Example</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getFreehandDocument <em>Freehand Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getInteractionProfile <em>Interaction Profile</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getMifChanges <em>Mif Changes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getPublication <em>Publication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getSerializedStaticModel <em>Serialized Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getSerializedStaticModels <em>Serialized Static Models</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getStaticModel <em>Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getStaticModelInterfacePackage <em>Static Model Interface Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getStaticModels <em>Static Models</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getStoryboard <em>Storyboard</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getStructuredDocument <em>Structured Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getTestScenario <em>Test Scenario</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getTriggerEvent <em>Trigger Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getTxtComplex <em>Txt Complex</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getTxtComplexWithLanguage <em>Txt Complex With Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getTxtInlineOnly <em>Txt Inline Only</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentRootImpl#getVocabularyModel <em>Vocabulary Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Mif2Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String, String>(
				EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this,
				Mif2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String, String>(
				EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this,
				Mif2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalApplicationRole getApplicationRole() {
		return (GlobalApplicationRole) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__APPLICATION_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationRole(GlobalApplicationRole newApplicationRole, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__APPLICATION_ROLE, newApplicationRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationRole(GlobalApplicationRole newApplicationRole) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__APPLICATION_ROLE, newApplicationRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalArtifactXRefSummary getArtifactXrefSummary() {
		return (GlobalArtifactXRefSummary) getMixed().get(
			Mif2Package.Literals.DOCUMENT_ROOT__ARTIFACT_XREF_SUMMARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactXrefSummary(GlobalArtifactXRefSummary newArtifactXrefSummary,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__ARTIFACT_XREF_SUMMARY, newArtifactXrefSummary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactXrefSummary(GlobalArtifactXRefSummary newArtifactXrefSummary) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__ARTIFACT_XREF_SUMMARY, newArtifactXrefSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalCodeSystem getCodeSystem() {
		return (GlobalCodeSystem) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__CODE_SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSystem(GlobalCodeSystem newCodeSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__CODE_SYSTEM, newCodeSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystem(GlobalCodeSystem newCodeSystem) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__CODE_SYSTEM, newCodeSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalCodeSystemSupplement getCodeSystemSupplement() {
		return (GlobalCodeSystemSupplement) getMixed().get(
			Mif2Package.Literals.DOCUMENT_ROOT__CODE_SYSTEM_SUPPLEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemSupplement(GlobalCodeSystemSupplement newCodeSystemSupplement,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__CODE_SYSTEM_SUPPLEMENT, newCodeSystemSupplement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSystemSupplement(GlobalCodeSystemSupplement newCodeSystemSupplement) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__CODE_SYSTEM_SUPPLEMENT, newCodeSystemSupplement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalConformanceProfile getConformanceProfile() {
		return (GlobalConformanceProfile) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__CONFORMANCE_PROFILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformanceProfile(GlobalConformanceProfile newConformanceProfile,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__CONFORMANCE_PROFILE, newConformanceProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformanceProfile(GlobalConformanceProfile newConformanceProfile) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__CONFORMANCE_PROFILE, newConformanceProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDatatypeModelLibrary getDatatypeModelLibrary() {
		return (GlobalDatatypeModelLibrary) getMixed().get(
			Mif2Package.Literals.DOCUMENT_ROOT__DATATYPE_MODEL_LIBRARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatypeModelLibrary(GlobalDatatypeModelLibrary newDatatypeModelLibrary,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__DATATYPE_MODEL_LIBRARY, newDatatypeModelLibrary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatypeModelLibrary(GlobalDatatypeModelLibrary newDatatypeModelLibrary) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__DATATYPE_MODEL_LIBRARY, newDatatypeModelLibrary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDerivedStaticModel getDerivedStaticModel() {
		return (GlobalDerivedStaticModel) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__DERIVED_STATIC_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedStaticModel(GlobalDerivedStaticModel newDerivedStaticModel,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__DERIVED_STATIC_MODEL, newDerivedStaticModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedStaticModel(GlobalDerivedStaticModel newDerivedStaticModel) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__DERIVED_STATIC_MODEL, newDerivedStaticModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedStaticModelsType getDerivedStaticModels() {
		return (DerivedStaticModelsType) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__DERIVED_STATIC_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedStaticModels(DerivedStaticModelsType newDerivedStaticModels,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__DERIVED_STATIC_MODELS, newDerivedStaticModels, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedStaticModels(DerivedStaticModelsType newDerivedStaticModels) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__DERIVED_STATIC_MODELS, newDerivedStaticModels);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDomainAnalysisModel getDomainAnalysisModel() {
		return (GlobalDomainAnalysisModel) getMixed().get(
			Mif2Package.Literals.DOCUMENT_ROOT__DOMAIN_ANALYSIS_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainAnalysisModel(GlobalDomainAnalysisModel newDomainAnalysisModel,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__DOMAIN_ANALYSIS_MODEL, newDomainAnalysisModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainAnalysisModel(GlobalDomainAnalysisModel newDomainAnalysisModel) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__DOMAIN_ANALYSIS_MODEL, newDomainAnalysisModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDomainInstanceExample getDomainInstanceExample() {
		return (GlobalDomainInstanceExample) getMixed().get(
			Mif2Package.Literals.DOCUMENT_ROOT__DOMAIN_INSTANCE_EXAMPLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainInstanceExample(GlobalDomainInstanceExample newDomainInstanceExample,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__DOMAIN_INSTANCE_EXAMPLE, newDomainInstanceExample, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainInstanceExample(GlobalDomainInstanceExample newDomainInstanceExample) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__DOMAIN_INSTANCE_EXAMPLE, newDomainInstanceExample);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalFreehandDocument getFreehandDocument() {
		return (GlobalFreehandDocument) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__FREEHAND_DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFreehandDocument(GlobalFreehandDocument newFreehandDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__FREEHAND_DOCUMENT, newFreehandDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreehandDocument(GlobalFreehandDocument newFreehandDocument) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__FREEHAND_DOCUMENT, newFreehandDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalGlossary getGlossary() {
		return (GlobalGlossary) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__GLOSSARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossary(GlobalGlossary newGlossary, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__GLOSSARY, newGlossary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlossary(GlobalGlossary newGlossary) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__GLOSSARY, newGlossary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalInteraction getInteraction() {
		return (GlobalInteraction) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__INTERACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteraction(GlobalInteraction newInteraction, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__INTERACTION, newInteraction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteraction(GlobalInteraction newInteraction) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__INTERACTION, newInteraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalInteractionProfile getInteractionProfile() {
		return (GlobalInteractionProfile) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__INTERACTION_PROFILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionProfile(GlobalInteractionProfile newInteractionProfile,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__INTERACTION_PROFILE, newInteractionProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionProfile(GlobalInteractionProfile newInteractionProfile) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__INTERACTION_PROFILE, newInteractionProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMifChanges getMifChanges() {
		return (GlobalMifChanges) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__MIF_CHANGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMifChanges(GlobalMifChanges newMifChanges, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__MIF_CHANGES, newMifChanges, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMifChanges(GlobalMifChanges newMifChanges) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__MIF_CHANGES, newMifChanges);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalGenericPackage getPackage() {
		return (GlobalGenericPackage) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(GlobalGenericPackage newPackage, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__PACKAGE, newPackage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(GlobalGenericPackage newPackage) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalPublicationPackage getPublication() {
		return (GlobalPublicationPackage) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__PUBLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublication(GlobalPublicationPackage newPublication, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__PUBLICATION, newPublication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublication(GlobalPublicationPackage newPublication) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__PUBLICATION, newPublication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalSerializedStaticModel getSerializedStaticModel() {
		return (GlobalSerializedStaticModel) getMixed().get(
			Mif2Package.Literals.DOCUMENT_ROOT__SERIALIZED_STATIC_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSerializedStaticModel(GlobalSerializedStaticModel newSerializedStaticModel,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__SERIALIZED_STATIC_MODEL, newSerializedStaticModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerializedStaticModel(GlobalSerializedStaticModel newSerializedStaticModel) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__SERIALIZED_STATIC_MODEL, newSerializedStaticModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedStaticModelsType getSerializedStaticModels() {
		return (SerializedStaticModelsType) getMixed().get(
			Mif2Package.Literals.DOCUMENT_ROOT__SERIALIZED_STATIC_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSerializedStaticModels(SerializedStaticModelsType newSerializedStaticModels,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__SERIALIZED_STATIC_MODELS, newSerializedStaticModels, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerializedStaticModels(SerializedStaticModelsType newSerializedStaticModels) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__SERIALIZED_STATIC_MODELS, newSerializedStaticModels);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalStaticModel getStaticModel() {
		return (GlobalStaticModel) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__STATIC_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticModel(GlobalStaticModel newStaticModel, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__STATIC_MODEL, newStaticModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticModel(GlobalStaticModel newStaticModel) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__STATIC_MODEL, newStaticModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalStaticModelInterfacePackage getStaticModelInterfacePackage() {
		return (GlobalStaticModelInterfacePackage) getMixed().get(
			Mif2Package.Literals.DOCUMENT_ROOT__STATIC_MODEL_INTERFACE_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticModelInterfacePackage(
			GlobalStaticModelInterfacePackage newStaticModelInterfacePackage, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__STATIC_MODEL_INTERFACE_PACKAGE, newStaticModelInterfacePackage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticModelInterfacePackage(GlobalStaticModelInterfacePackage newStaticModelInterfacePackage) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__STATIC_MODEL_INTERFACE_PACKAGE, newStaticModelInterfacePackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelsType getStaticModels() {
		return (StaticModelsType) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__STATIC_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticModels(StaticModelsType newStaticModels, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__STATIC_MODELS, newStaticModels, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticModels(StaticModelsType newStaticModels) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__STATIC_MODELS, newStaticModels);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalStoryboard getStoryboard() {
		return (GlobalStoryboard) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__STORYBOARD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoryboard(GlobalStoryboard newStoryboard, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__STORYBOARD, newStoryboard, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoryboard(GlobalStoryboard newStoryboard) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__STORYBOARD, newStoryboard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalStructuredDocument getStructuredDocument() {
		return (GlobalStructuredDocument) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__STRUCTURED_DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredDocument(GlobalStructuredDocument newStructuredDocument,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__STRUCTURED_DOCUMENT, newStructuredDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredDocument(GlobalStructuredDocument newStructuredDocument) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__STRUCTURED_DOCUMENT, newStructuredDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalTestScenario getTestScenario() {
		return (GlobalTestScenario) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__TEST_SCENARIO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestScenario(GlobalTestScenario newTestScenario, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__TEST_SCENARIO, newTestScenario, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestScenario(GlobalTestScenario newTestScenario) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__TEST_SCENARIO, newTestScenario);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalTriggerEvent getTriggerEvent() {
		return (GlobalTriggerEvent) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__TRIGGER_EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggerEvent(GlobalTriggerEvent newTriggerEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__TRIGGER_EVENT, newTriggerEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerEvent(GlobalTriggerEvent newTriggerEvent) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__TRIGGER_EVENT, newTriggerEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getTxtComplex() {
		return (Flow) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__TXT_COMPLEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTxtComplex(Flow newTxtComplex, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__TXT_COMPLEX, newTxtComplex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtComplex(Flow newTxtComplex) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__TXT_COMPLEX, newTxtComplex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMarkupWithLanguage getTxtComplexWithLanguage() {
		return (ComplexMarkupWithLanguage) getMixed().get(
			Mif2Package.Literals.DOCUMENT_ROOT__TXT_COMPLEX_WITH_LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTxtComplexWithLanguage(ComplexMarkupWithLanguage newTxtComplexWithLanguage,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__TXT_COMPLEX_WITH_LANGUAGE, newTxtComplexWithLanguage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtComplexWithLanguage(ComplexMarkupWithLanguage newTxtComplexWithLanguage) {
		((FeatureMap.Internal) getMixed()).set(
			Mif2Package.Literals.DOCUMENT_ROOT__TXT_COMPLEX_WITH_LANGUAGE, newTxtComplexWithLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inline getTxtInlineOnly() {
		return (Inline) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__TXT_INLINE_ONLY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTxtInlineOnly(Inline newTxtInlineOnly, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__TXT_INLINE_ONLY, newTxtInlineOnly, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtInlineOnly(Inline newTxtInlineOnly) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__TXT_INLINE_ONLY, newTxtInlineOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalValueSet getValueSet() {
		return (GlobalValueSet) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__VALUE_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(GlobalValueSet newValueSet, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__VALUE_SET, newValueSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSet(GlobalValueSet newValueSet) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__VALUE_SET, newValueSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVocabularyModel getVocabularyModel() {
		return (GlobalVocabularyModel) getMixed().get(Mif2Package.Literals.DOCUMENT_ROOT__VOCABULARY_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVocabularyModel(GlobalVocabularyModel newVocabularyModel, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
			Mif2Package.Literals.DOCUMENT_ROOT__VOCABULARY_MODEL, newVocabularyModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVocabularyModel(GlobalVocabularyModel newVocabularyModel) {
		((FeatureMap.Internal) getMixed()).set(Mif2Package.Literals.DOCUMENT_ROOT__VOCABULARY_MODEL, newVocabularyModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
			case Mif2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>) getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case Mif2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>) getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case Mif2Package.DOCUMENT_ROOT__APPLICATION_ROLE:
				return basicSetApplicationRole(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__ARTIFACT_XREF_SUMMARY:
				return basicSetArtifactXrefSummary(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__CODE_SYSTEM:
				return basicSetCodeSystem(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__CODE_SYSTEM_SUPPLEMENT:
				return basicSetCodeSystemSupplement(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__CONFORMANCE_PROFILE:
				return basicSetConformanceProfile(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__DATATYPE_MODEL_LIBRARY:
				return basicSetDatatypeModelLibrary(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__DERIVED_STATIC_MODEL:
				return basicSetDerivedStaticModel(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__DERIVED_STATIC_MODELS:
				return basicSetDerivedStaticModels(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__DOMAIN_ANALYSIS_MODEL:
				return basicSetDomainAnalysisModel(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__DOMAIN_INSTANCE_EXAMPLE:
				return basicSetDomainInstanceExample(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__FREEHAND_DOCUMENT:
				return basicSetFreehandDocument(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__GLOSSARY:
				return basicSetGlossary(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__INTERACTION:
				return basicSetInteraction(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__INTERACTION_PROFILE:
				return basicSetInteractionProfile(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__MIF_CHANGES:
				return basicSetMifChanges(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__PACKAGE:
				return basicSetPackage(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__PUBLICATION:
				return basicSetPublication(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__SERIALIZED_STATIC_MODEL:
				return basicSetSerializedStaticModel(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__SERIALIZED_STATIC_MODELS:
				return basicSetSerializedStaticModels(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODEL:
				return basicSetStaticModel(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODEL_INTERFACE_PACKAGE:
				return basicSetStaticModelInterfacePackage(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODELS:
				return basicSetStaticModels(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__STORYBOARD:
				return basicSetStoryboard(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__STRUCTURED_DOCUMENT:
				return basicSetStructuredDocument(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__TEST_SCENARIO:
				return basicSetTestScenario(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__TRIGGER_EVENT:
				return basicSetTriggerEvent(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__TXT_COMPLEX:
				return basicSetTxtComplex(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__TXT_COMPLEX_WITH_LANGUAGE:
				return basicSetTxtComplexWithLanguage(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__TXT_INLINE_ONLY:
				return basicSetTxtInlineOnly(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case Mif2Package.DOCUMENT_ROOT__VOCABULARY_MODEL:
				return basicSetVocabularyModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.DOCUMENT_ROOT__MIXED:
				if (coreType) {
					return getMixed();
				}
				return ((FeatureMap.Internal) getMixed()).getWrapper();
			case Mif2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) {
					return getXMLNSPrefixMap();
				} else {
					return getXMLNSPrefixMap().map();
				}
			case Mif2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) {
					return getXSISchemaLocation();
				} else {
					return getXSISchemaLocation().map();
				}
			case Mif2Package.DOCUMENT_ROOT__APPLICATION_ROLE:
				return getApplicationRole();
			case Mif2Package.DOCUMENT_ROOT__ARTIFACT_XREF_SUMMARY:
				return getArtifactXrefSummary();
			case Mif2Package.DOCUMENT_ROOT__CODE_SYSTEM:
				return getCodeSystem();
			case Mif2Package.DOCUMENT_ROOT__CODE_SYSTEM_SUPPLEMENT:
				return getCodeSystemSupplement();
			case Mif2Package.DOCUMENT_ROOT__CONFORMANCE_PROFILE:
				return getConformanceProfile();
			case Mif2Package.DOCUMENT_ROOT__DATATYPE_MODEL_LIBRARY:
				return getDatatypeModelLibrary();
			case Mif2Package.DOCUMENT_ROOT__DERIVED_STATIC_MODEL:
				return getDerivedStaticModel();
			case Mif2Package.DOCUMENT_ROOT__DERIVED_STATIC_MODELS:
				return getDerivedStaticModels();
			case Mif2Package.DOCUMENT_ROOT__DOMAIN_ANALYSIS_MODEL:
				return getDomainAnalysisModel();
			case Mif2Package.DOCUMENT_ROOT__DOMAIN_INSTANCE_EXAMPLE:
				return getDomainInstanceExample();
			case Mif2Package.DOCUMENT_ROOT__FREEHAND_DOCUMENT:
				return getFreehandDocument();
			case Mif2Package.DOCUMENT_ROOT__GLOSSARY:
				return getGlossary();
			case Mif2Package.DOCUMENT_ROOT__INTERACTION:
				return getInteraction();
			case Mif2Package.DOCUMENT_ROOT__INTERACTION_PROFILE:
				return getInteractionProfile();
			case Mif2Package.DOCUMENT_ROOT__MIF_CHANGES:
				return getMifChanges();
			case Mif2Package.DOCUMENT_ROOT__PACKAGE:
				return getPackage();
			case Mif2Package.DOCUMENT_ROOT__PUBLICATION:
				return getPublication();
			case Mif2Package.DOCUMENT_ROOT__SERIALIZED_STATIC_MODEL:
				return getSerializedStaticModel();
			case Mif2Package.DOCUMENT_ROOT__SERIALIZED_STATIC_MODELS:
				return getSerializedStaticModels();
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODEL:
				return getStaticModel();
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODEL_INTERFACE_PACKAGE:
				return getStaticModelInterfacePackage();
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODELS:
				return getStaticModels();
			case Mif2Package.DOCUMENT_ROOT__STORYBOARD:
				return getStoryboard();
			case Mif2Package.DOCUMENT_ROOT__STRUCTURED_DOCUMENT:
				return getStructuredDocument();
			case Mif2Package.DOCUMENT_ROOT__TEST_SCENARIO:
				return getTestScenario();
			case Mif2Package.DOCUMENT_ROOT__TRIGGER_EVENT:
				return getTriggerEvent();
			case Mif2Package.DOCUMENT_ROOT__TXT_COMPLEX:
				return getTxtComplex();
			case Mif2Package.DOCUMENT_ROOT__TXT_COMPLEX_WITH_LANGUAGE:
				return getTxtComplexWithLanguage();
			case Mif2Package.DOCUMENT_ROOT__TXT_INLINE_ONLY:
				return getTxtInlineOnly();
			case Mif2Package.DOCUMENT_ROOT__VALUE_SET:
				return getValueSet();
			case Mif2Package.DOCUMENT_ROOT__VOCABULARY_MODEL:
				return getVocabularyModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal) getMixed()).set(newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__APPLICATION_ROLE:
				setApplicationRole((GlobalApplicationRole) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__ARTIFACT_XREF_SUMMARY:
				setArtifactXrefSummary((GlobalArtifactXRefSummary) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__CODE_SYSTEM:
				setCodeSystem((GlobalCodeSystem) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__CODE_SYSTEM_SUPPLEMENT:
				setCodeSystemSupplement((GlobalCodeSystemSupplement) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__CONFORMANCE_PROFILE:
				setConformanceProfile((GlobalConformanceProfile) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__DATATYPE_MODEL_LIBRARY:
				setDatatypeModelLibrary((GlobalDatatypeModelLibrary) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__DERIVED_STATIC_MODEL:
				setDerivedStaticModel((GlobalDerivedStaticModel) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__DERIVED_STATIC_MODELS:
				setDerivedStaticModels((DerivedStaticModelsType) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__DOMAIN_ANALYSIS_MODEL:
				setDomainAnalysisModel((GlobalDomainAnalysisModel) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__DOMAIN_INSTANCE_EXAMPLE:
				setDomainInstanceExample((GlobalDomainInstanceExample) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__FREEHAND_DOCUMENT:
				setFreehandDocument((GlobalFreehandDocument) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__GLOSSARY:
				setGlossary((GlobalGlossary) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__INTERACTION:
				setInteraction((GlobalInteraction) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__INTERACTION_PROFILE:
				setInteractionProfile((GlobalInteractionProfile) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__MIF_CHANGES:
				setMifChanges((GlobalMifChanges) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__PACKAGE:
				setPackage((GlobalGenericPackage) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__PUBLICATION:
				setPublication((GlobalPublicationPackage) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__SERIALIZED_STATIC_MODEL:
				setSerializedStaticModel((GlobalSerializedStaticModel) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__SERIALIZED_STATIC_MODELS:
				setSerializedStaticModels((SerializedStaticModelsType) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODEL:
				setStaticModel((GlobalStaticModel) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODEL_INTERFACE_PACKAGE:
				setStaticModelInterfacePackage((GlobalStaticModelInterfacePackage) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODELS:
				setStaticModels((StaticModelsType) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__STORYBOARD:
				setStoryboard((GlobalStoryboard) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__STRUCTURED_DOCUMENT:
				setStructuredDocument((GlobalStructuredDocument) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__TEST_SCENARIO:
				setTestScenario((GlobalTestScenario) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__TRIGGER_EVENT:
				setTriggerEvent((GlobalTriggerEvent) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__TXT_COMPLEX:
				setTxtComplex((Flow) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__TXT_COMPLEX_WITH_LANGUAGE:
				setTxtComplexWithLanguage((ComplexMarkupWithLanguage) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__TXT_INLINE_ONLY:
				setTxtInlineOnly((Inline) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__VALUE_SET:
				setValueSet((GlobalValueSet) newValue);
				return;
			case Mif2Package.DOCUMENT_ROOT__VOCABULARY_MODEL:
				setVocabularyModel((GlobalVocabularyModel) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Mif2Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case Mif2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case Mif2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case Mif2Package.DOCUMENT_ROOT__APPLICATION_ROLE:
				setApplicationRole((GlobalApplicationRole) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__ARTIFACT_XREF_SUMMARY:
				setArtifactXrefSummary((GlobalArtifactXRefSummary) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__CODE_SYSTEM:
				setCodeSystem((GlobalCodeSystem) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__CODE_SYSTEM_SUPPLEMENT:
				setCodeSystemSupplement((GlobalCodeSystemSupplement) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__CONFORMANCE_PROFILE:
				setConformanceProfile((GlobalConformanceProfile) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__DATATYPE_MODEL_LIBRARY:
				setDatatypeModelLibrary((GlobalDatatypeModelLibrary) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__DERIVED_STATIC_MODEL:
				setDerivedStaticModel((GlobalDerivedStaticModel) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__DERIVED_STATIC_MODELS:
				setDerivedStaticModels((DerivedStaticModelsType) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__DOMAIN_ANALYSIS_MODEL:
				setDomainAnalysisModel((GlobalDomainAnalysisModel) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__DOMAIN_INSTANCE_EXAMPLE:
				setDomainInstanceExample((GlobalDomainInstanceExample) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__FREEHAND_DOCUMENT:
				setFreehandDocument((GlobalFreehandDocument) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__GLOSSARY:
				setGlossary((GlobalGlossary) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__INTERACTION:
				setInteraction((GlobalInteraction) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__INTERACTION_PROFILE:
				setInteractionProfile((GlobalInteractionProfile) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__MIF_CHANGES:
				setMifChanges((GlobalMifChanges) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__PACKAGE:
				setPackage((GlobalGenericPackage) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__PUBLICATION:
				setPublication((GlobalPublicationPackage) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__SERIALIZED_STATIC_MODEL:
				setSerializedStaticModel((GlobalSerializedStaticModel) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__SERIALIZED_STATIC_MODELS:
				setSerializedStaticModels((SerializedStaticModelsType) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODEL:
				setStaticModel((GlobalStaticModel) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODEL_INTERFACE_PACKAGE:
				setStaticModelInterfacePackage((GlobalStaticModelInterfacePackage) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODELS:
				setStaticModels((StaticModelsType) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__STORYBOARD:
				setStoryboard((GlobalStoryboard) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__STRUCTURED_DOCUMENT:
				setStructuredDocument((GlobalStructuredDocument) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__TEST_SCENARIO:
				setTestScenario((GlobalTestScenario) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__TRIGGER_EVENT:
				setTriggerEvent((GlobalTriggerEvent) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__TXT_COMPLEX:
				setTxtComplex((Flow) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__TXT_COMPLEX_WITH_LANGUAGE:
				setTxtComplexWithLanguage((ComplexMarkupWithLanguage) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__TXT_INLINE_ONLY:
				setTxtInlineOnly((Inline) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__VALUE_SET:
				setValueSet((GlobalValueSet) null);
				return;
			case Mif2Package.DOCUMENT_ROOT__VOCABULARY_MODEL:
				setVocabularyModel((GlobalVocabularyModel) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Mif2Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Mif2Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case Mif2Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case Mif2Package.DOCUMENT_ROOT__APPLICATION_ROLE:
				return getApplicationRole() != null;
			case Mif2Package.DOCUMENT_ROOT__ARTIFACT_XREF_SUMMARY:
				return getArtifactXrefSummary() != null;
			case Mif2Package.DOCUMENT_ROOT__CODE_SYSTEM:
				return getCodeSystem() != null;
			case Mif2Package.DOCUMENT_ROOT__CODE_SYSTEM_SUPPLEMENT:
				return getCodeSystemSupplement() != null;
			case Mif2Package.DOCUMENT_ROOT__CONFORMANCE_PROFILE:
				return getConformanceProfile() != null;
			case Mif2Package.DOCUMENT_ROOT__DATATYPE_MODEL_LIBRARY:
				return getDatatypeModelLibrary() != null;
			case Mif2Package.DOCUMENT_ROOT__DERIVED_STATIC_MODEL:
				return getDerivedStaticModel() != null;
			case Mif2Package.DOCUMENT_ROOT__DERIVED_STATIC_MODELS:
				return getDerivedStaticModels() != null;
			case Mif2Package.DOCUMENT_ROOT__DOMAIN_ANALYSIS_MODEL:
				return getDomainAnalysisModel() != null;
			case Mif2Package.DOCUMENT_ROOT__DOMAIN_INSTANCE_EXAMPLE:
				return getDomainInstanceExample() != null;
			case Mif2Package.DOCUMENT_ROOT__FREEHAND_DOCUMENT:
				return getFreehandDocument() != null;
			case Mif2Package.DOCUMENT_ROOT__GLOSSARY:
				return getGlossary() != null;
			case Mif2Package.DOCUMENT_ROOT__INTERACTION:
				return getInteraction() != null;
			case Mif2Package.DOCUMENT_ROOT__INTERACTION_PROFILE:
				return getInteractionProfile() != null;
			case Mif2Package.DOCUMENT_ROOT__MIF_CHANGES:
				return getMifChanges() != null;
			case Mif2Package.DOCUMENT_ROOT__PACKAGE:
				return getPackage() != null;
			case Mif2Package.DOCUMENT_ROOT__PUBLICATION:
				return getPublication() != null;
			case Mif2Package.DOCUMENT_ROOT__SERIALIZED_STATIC_MODEL:
				return getSerializedStaticModel() != null;
			case Mif2Package.DOCUMENT_ROOT__SERIALIZED_STATIC_MODELS:
				return getSerializedStaticModels() != null;
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODEL:
				return getStaticModel() != null;
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODEL_INTERFACE_PACKAGE:
				return getStaticModelInterfacePackage() != null;
			case Mif2Package.DOCUMENT_ROOT__STATIC_MODELS:
				return getStaticModels() != null;
			case Mif2Package.DOCUMENT_ROOT__STORYBOARD:
				return getStoryboard() != null;
			case Mif2Package.DOCUMENT_ROOT__STRUCTURED_DOCUMENT:
				return getStructuredDocument() != null;
			case Mif2Package.DOCUMENT_ROOT__TEST_SCENARIO:
				return getTestScenario() != null;
			case Mif2Package.DOCUMENT_ROOT__TRIGGER_EVENT:
				return getTriggerEvent() != null;
			case Mif2Package.DOCUMENT_ROOT__TXT_COMPLEX:
				return getTxtComplex() != null;
			case Mif2Package.DOCUMENT_ROOT__TXT_COMPLEX_WITH_LANGUAGE:
				return getTxtComplexWithLanguage() != null;
			case Mif2Package.DOCUMENT_ROOT__TXT_INLINE_ONLY:
				return getTxtInlineOnly() != null;
			case Mif2Package.DOCUMENT_ROOT__VALUE_SET:
				return getValueSet() != null;
			case Mif2Package.DOCUMENT_ROOT__VOCABULARY_MODEL:
				return getVocabularyModel() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} // DocumentRootImpl
