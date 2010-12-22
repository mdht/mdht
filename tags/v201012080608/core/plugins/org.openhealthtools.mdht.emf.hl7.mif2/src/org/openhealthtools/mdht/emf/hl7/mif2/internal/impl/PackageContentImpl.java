/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.GlobalApplicationRole;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalConformanceProfile;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalDatatypeModelLibrary;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalDerivedStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalDomainAnalysisModel;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalDomainInstanceExample;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalFreehandDocument;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalGenericPackage;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalInteraction;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalInteractionProfile;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalPublicationPackage;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalSerializedStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalStaticModel;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalStaticModelInterfacePackage;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalStoryboard;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalStructuredDocument;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalTestScenario;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalTriggerEvent;
import org.openhealthtools.mdht.emf.hl7.mif2.GlobalVocabularyModel;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getFreehandDocument <em>Freehand Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getDomainAnalysisModel <em>Domain Analysis Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getDomainInstanceExample <em>Domain Instance Example</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getStoryboard <em>Storyboard</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getDatatypeModelLibrary <em>Datatype Model Library</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getStaticModelInterfacePackage <em>Static Model Interface Package</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getVocabularyModel <em>Vocabulary Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getStaticModel <em>Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getSerializedStaticModel <em>Serialized Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getDerivedStaticModel <em>Derived Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getStructuredDocument <em>Structured Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getTriggerEvent <em>Trigger Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getApplicationRole <em>Application Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getInteractionProfile <em>Interaction Profile</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getConformanceProfile <em>Conformance Profile</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getTestScenario <em>Test Scenario</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getPublication <em>Publication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageContentImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageContentImpl extends EObjectImpl implements PackageContent {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PACKAGE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Mif2Package.PACKAGE_CONTENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalFreehandDocument> getFreehandDocument() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__FREEHAND_DOCUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalDomainAnalysisModel> getDomainAnalysisModel() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__DOMAIN_ANALYSIS_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalDomainInstanceExample> getDomainInstanceExample() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__DOMAIN_INSTANCE_EXAMPLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalStoryboard> getStoryboard() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__STORYBOARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalDatatypeModelLibrary> getDatatypeModelLibrary() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__DATATYPE_MODEL_LIBRARY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalStaticModelInterfacePackage> getStaticModelInterfacePackage() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__STATIC_MODEL_INTERFACE_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVocabularyModel> getVocabularyModel() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__VOCABULARY_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalStaticModel> getStaticModel() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__STATIC_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalSerializedStaticModel> getSerializedStaticModel() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__SERIALIZED_STATIC_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalDerivedStaticModel> getDerivedStaticModel() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__DERIVED_STATIC_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalStructuredDocument> getStructuredDocument() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__STRUCTURED_DOCUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalTriggerEvent> getTriggerEvent() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__TRIGGER_EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalInteraction> getInteraction() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__INTERACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalApplicationRole> getApplicationRole() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__APPLICATION_ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalInteractionProfile> getInteractionProfile() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__INTERACTION_PROFILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalConformanceProfile> getConformanceProfile() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__CONFORMANCE_PROFILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalTestScenario> getTestScenario() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__TEST_SCENARIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalPublicationPackage> getPublication() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__PUBLICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalGenericPackage> getPackage() {
		return getGroup().list(Mif2Package.Literals.PACKAGE_CONTENT__PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.PACKAGE_CONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__FREEHAND_DOCUMENT:
				return ((InternalEList<?>)getFreehandDocument()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__DOMAIN_ANALYSIS_MODEL:
				return ((InternalEList<?>)getDomainAnalysisModel()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__DOMAIN_INSTANCE_EXAMPLE:
				return ((InternalEList<?>)getDomainInstanceExample()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__STORYBOARD:
				return ((InternalEList<?>)getStoryboard()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__DATATYPE_MODEL_LIBRARY:
				return ((InternalEList<?>)getDatatypeModelLibrary()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__STATIC_MODEL_INTERFACE_PACKAGE:
				return ((InternalEList<?>)getStaticModelInterfacePackage()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__VOCABULARY_MODEL:
				return ((InternalEList<?>)getVocabularyModel()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__STATIC_MODEL:
				return ((InternalEList<?>)getStaticModel()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__SERIALIZED_STATIC_MODEL:
				return ((InternalEList<?>)getSerializedStaticModel()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__DERIVED_STATIC_MODEL:
				return ((InternalEList<?>)getDerivedStaticModel()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__STRUCTURED_DOCUMENT:
				return ((InternalEList<?>)getStructuredDocument()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__TRIGGER_EVENT:
				return ((InternalEList<?>)getTriggerEvent()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__INTERACTION:
				return ((InternalEList<?>)getInteraction()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__APPLICATION_ROLE:
				return ((InternalEList<?>)getApplicationRole()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__INTERACTION_PROFILE:
				return ((InternalEList<?>)getInteractionProfile()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__CONFORMANCE_PROFILE:
				return ((InternalEList<?>)getConformanceProfile()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__TEST_SCENARIO:
				return ((InternalEList<?>)getTestScenario()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__PUBLICATION:
				return ((InternalEList<?>)getPublication()).basicRemove(otherEnd, msgs);
			case Mif2Package.PACKAGE_CONTENT__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.PACKAGE_CONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Mif2Package.PACKAGE_CONTENT__FREEHAND_DOCUMENT:
				return getFreehandDocument();
			case Mif2Package.PACKAGE_CONTENT__DOMAIN_ANALYSIS_MODEL:
				return getDomainAnalysisModel();
			case Mif2Package.PACKAGE_CONTENT__DOMAIN_INSTANCE_EXAMPLE:
				return getDomainInstanceExample();
			case Mif2Package.PACKAGE_CONTENT__STORYBOARD:
				return getStoryboard();
			case Mif2Package.PACKAGE_CONTENT__DATATYPE_MODEL_LIBRARY:
				return getDatatypeModelLibrary();
			case Mif2Package.PACKAGE_CONTENT__STATIC_MODEL_INTERFACE_PACKAGE:
				return getStaticModelInterfacePackage();
			case Mif2Package.PACKAGE_CONTENT__VOCABULARY_MODEL:
				return getVocabularyModel();
			case Mif2Package.PACKAGE_CONTENT__STATIC_MODEL:
				return getStaticModel();
			case Mif2Package.PACKAGE_CONTENT__SERIALIZED_STATIC_MODEL:
				return getSerializedStaticModel();
			case Mif2Package.PACKAGE_CONTENT__DERIVED_STATIC_MODEL:
				return getDerivedStaticModel();
			case Mif2Package.PACKAGE_CONTENT__STRUCTURED_DOCUMENT:
				return getStructuredDocument();
			case Mif2Package.PACKAGE_CONTENT__TRIGGER_EVENT:
				return getTriggerEvent();
			case Mif2Package.PACKAGE_CONTENT__INTERACTION:
				return getInteraction();
			case Mif2Package.PACKAGE_CONTENT__APPLICATION_ROLE:
				return getApplicationRole();
			case Mif2Package.PACKAGE_CONTENT__INTERACTION_PROFILE:
				return getInteractionProfile();
			case Mif2Package.PACKAGE_CONTENT__CONFORMANCE_PROFILE:
				return getConformanceProfile();
			case Mif2Package.PACKAGE_CONTENT__TEST_SCENARIO:
				return getTestScenario();
			case Mif2Package.PACKAGE_CONTENT__PUBLICATION:
				return getPublication();
			case Mif2Package.PACKAGE_CONTENT__PACKAGE:
				return getPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.PACKAGE_CONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__FREEHAND_DOCUMENT:
				getFreehandDocument().clear();
				getFreehandDocument().addAll((Collection<? extends GlobalFreehandDocument>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__DOMAIN_ANALYSIS_MODEL:
				getDomainAnalysisModel().clear();
				getDomainAnalysisModel().addAll((Collection<? extends GlobalDomainAnalysisModel>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__DOMAIN_INSTANCE_EXAMPLE:
				getDomainInstanceExample().clear();
				getDomainInstanceExample().addAll((Collection<? extends GlobalDomainInstanceExample>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__STORYBOARD:
				getStoryboard().clear();
				getStoryboard().addAll((Collection<? extends GlobalStoryboard>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__DATATYPE_MODEL_LIBRARY:
				getDatatypeModelLibrary().clear();
				getDatatypeModelLibrary().addAll((Collection<? extends GlobalDatatypeModelLibrary>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__STATIC_MODEL_INTERFACE_PACKAGE:
				getStaticModelInterfacePackage().clear();
				getStaticModelInterfacePackage().addAll((Collection<? extends GlobalStaticModelInterfacePackage>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__VOCABULARY_MODEL:
				getVocabularyModel().clear();
				getVocabularyModel().addAll((Collection<? extends GlobalVocabularyModel>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__STATIC_MODEL:
				getStaticModel().clear();
				getStaticModel().addAll((Collection<? extends GlobalStaticModel>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__SERIALIZED_STATIC_MODEL:
				getSerializedStaticModel().clear();
				getSerializedStaticModel().addAll((Collection<? extends GlobalSerializedStaticModel>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__DERIVED_STATIC_MODEL:
				getDerivedStaticModel().clear();
				getDerivedStaticModel().addAll((Collection<? extends GlobalDerivedStaticModel>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__STRUCTURED_DOCUMENT:
				getStructuredDocument().clear();
				getStructuredDocument().addAll((Collection<? extends GlobalStructuredDocument>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__TRIGGER_EVENT:
				getTriggerEvent().clear();
				getTriggerEvent().addAll((Collection<? extends GlobalTriggerEvent>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__INTERACTION:
				getInteraction().clear();
				getInteraction().addAll((Collection<? extends GlobalInteraction>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__APPLICATION_ROLE:
				getApplicationRole().clear();
				getApplicationRole().addAll((Collection<? extends GlobalApplicationRole>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__INTERACTION_PROFILE:
				getInteractionProfile().clear();
				getInteractionProfile().addAll((Collection<? extends GlobalInteractionProfile>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__CONFORMANCE_PROFILE:
				getConformanceProfile().clear();
				getConformanceProfile().addAll((Collection<? extends GlobalConformanceProfile>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__TEST_SCENARIO:
				getTestScenario().clear();
				getTestScenario().addAll((Collection<? extends GlobalTestScenario>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__PUBLICATION:
				getPublication().clear();
				getPublication().addAll((Collection<? extends GlobalPublicationPackage>)newValue);
				return;
			case Mif2Package.PACKAGE_CONTENT__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends GlobalGenericPackage>)newValue);
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
			case Mif2Package.PACKAGE_CONTENT__GROUP:
				getGroup().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__FREEHAND_DOCUMENT:
				getFreehandDocument().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__DOMAIN_ANALYSIS_MODEL:
				getDomainAnalysisModel().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__DOMAIN_INSTANCE_EXAMPLE:
				getDomainInstanceExample().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__STORYBOARD:
				getStoryboard().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__DATATYPE_MODEL_LIBRARY:
				getDatatypeModelLibrary().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__STATIC_MODEL_INTERFACE_PACKAGE:
				getStaticModelInterfacePackage().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__VOCABULARY_MODEL:
				getVocabularyModel().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__STATIC_MODEL:
				getStaticModel().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__SERIALIZED_STATIC_MODEL:
				getSerializedStaticModel().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__DERIVED_STATIC_MODEL:
				getDerivedStaticModel().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__STRUCTURED_DOCUMENT:
				getStructuredDocument().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__TRIGGER_EVENT:
				getTriggerEvent().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__INTERACTION:
				getInteraction().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__APPLICATION_ROLE:
				getApplicationRole().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__INTERACTION_PROFILE:
				getInteractionProfile().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__CONFORMANCE_PROFILE:
				getConformanceProfile().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__TEST_SCENARIO:
				getTestScenario().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__PUBLICATION:
				getPublication().clear();
				return;
			case Mif2Package.PACKAGE_CONTENT__PACKAGE:
				getPackage().clear();
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
			case Mif2Package.PACKAGE_CONTENT__GROUP:
				return group != null && !group.isEmpty();
			case Mif2Package.PACKAGE_CONTENT__FREEHAND_DOCUMENT:
				return !getFreehandDocument().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__DOMAIN_ANALYSIS_MODEL:
				return !getDomainAnalysisModel().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__DOMAIN_INSTANCE_EXAMPLE:
				return !getDomainInstanceExample().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__STORYBOARD:
				return !getStoryboard().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__DATATYPE_MODEL_LIBRARY:
				return !getDatatypeModelLibrary().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__STATIC_MODEL_INTERFACE_PACKAGE:
				return !getStaticModelInterfacePackage().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__VOCABULARY_MODEL:
				return !getVocabularyModel().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__STATIC_MODEL:
				return !getStaticModel().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__SERIALIZED_STATIC_MODEL:
				return !getSerializedStaticModel().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__DERIVED_STATIC_MODEL:
				return !getDerivedStaticModel().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__STRUCTURED_DOCUMENT:
				return !getStructuredDocument().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__TRIGGER_EVENT:
				return !getTriggerEvent().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__INTERACTION:
				return !getInteraction().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__APPLICATION_ROLE:
				return !getApplicationRole().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__INTERACTION_PROFILE:
				return !getInteractionProfile().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__CONFORMANCE_PROFILE:
				return !getConformanceProfile().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__TEST_SCENARIO:
				return !getTestScenario().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__PUBLICATION:
				return !getPublication().isEmpty();
			case Mif2Package.PACKAGE_CONTENT__PACKAGE:
				return !getPackage().isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //PackageContentImpl
