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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ArtifactDependency;
import org.openhealthtools.mdht.emf.hl7.mif2.BindingRealm;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystem;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeTranslationCollection;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptDomain;
import org.openhealthtools.mdht.emf.hl7.mif2.ContextBinding;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.ValueSet;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModelDefinitionKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyModelImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyModelImpl#getDependsOnVocabModel <em>Depends On Vocab Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyModelImpl#getConceptDomain <em>Concept Domain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyModelImpl#getCodeSystem <em>Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyModelImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyModelImpl#getBindingRealm <em>Binding Realm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyModelImpl#getContextBinding <em>Context Binding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyModelImpl#getCodeTranslations <em>Code Translations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyModelImpl#getCodeSystemSupplement <em>Code System Supplement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyModelImpl#getDefinitionKind <em>Definition Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocabularyModelImpl extends PackageImpl implements VocabularyModel {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected VocabularyModelAnnotations annotations;

	/**
	 * The cached value of the '{@link #getDependsOnVocabModel() <em>Depends On Vocab Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOnVocabModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactDependency> dependsOnVocabModel;

	/**
	 * The cached value of the '{@link #getConceptDomain() <em>Concept Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptDomain> conceptDomain;

	/**
	 * The cached value of the '{@link #getCodeSystem() <em>Code System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystem> codeSystem;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSet> valueSet;

	/**
	 * The cached value of the '{@link #getBindingRealm() <em>Binding Realm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingRealm()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingRealm> bindingRealm;

	/**
	 * The cached value of the '{@link #getContextBinding() <em>Context Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextBinding> contextBinding;

	/**
	 * The cached value of the '{@link #getCodeTranslations() <em>Code Translations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeTranslations()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeTranslationCollection> codeTranslations;

	/**
	 * The cached value of the '{@link #getCodeSystemSupplement() <em>Code System Supplement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSystemSupplement()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemSupplement> codeSystemSupplement;

	/**
	 * The default value of the '{@link #getDefinitionKind() <em>Definition Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionKind()
	 * @generated
	 * @ordered
	 */
	protected static final VocabularyModelDefinitionKind DEFINITION_KIND_EDEFAULT = VocabularyModelDefinitionKind.COMPLETE;

	/**
	 * The cached value of the '{@link #getDefinitionKind() <em>Definition Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionKind()
	 * @generated
	 * @ordered
	 */
	protected VocabularyModelDefinitionKind definitionKind = DEFINITION_KIND_EDEFAULT;

	/**
	 * This is true if the Definition Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean definitionKindESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.VOCABULARY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyModelAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(VocabularyModelAnnotations newAnnotations, NotificationChain msgs) {
		VocabularyModelAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_MODEL__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(VocabularyModelAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VOCABULARY_MODEL__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.VOCABULARY_MODEL__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_MODEL__ANNOTATIONS, newAnnotations, newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactDependency> getDependsOnVocabModel() {
		if (dependsOnVocabModel == null) {
			dependsOnVocabModel = new EObjectContainmentEList<ArtifactDependency>(
				ArtifactDependency.class, this, Mif2Package.VOCABULARY_MODEL__DEPENDS_ON_VOCAB_MODEL);
		}
		return dependsOnVocabModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptDomain> getConceptDomain() {
		if (conceptDomain == null) {
			conceptDomain = new EObjectContainmentEList<ConceptDomain>(
				ConceptDomain.class, this, Mif2Package.VOCABULARY_MODEL__CONCEPT_DOMAIN);
		}
		return conceptDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystem> getCodeSystem() {
		if (codeSystem == null) {
			codeSystem = new EObjectContainmentEList<CodeSystem>(
				CodeSystem.class, this, Mif2Package.VOCABULARY_MODEL__CODE_SYSTEM);
		}
		return codeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSet> getValueSet() {
		if (valueSet == null) {
			valueSet = new EObjectContainmentEList<ValueSet>(
				ValueSet.class, this, Mif2Package.VOCABULARY_MODEL__VALUE_SET);
		}
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingRealm> getBindingRealm() {
		if (bindingRealm == null) {
			bindingRealm = new EObjectContainmentEList<BindingRealm>(
				BindingRealm.class, this, Mif2Package.VOCABULARY_MODEL__BINDING_REALM);
		}
		return bindingRealm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextBinding> getContextBinding() {
		if (contextBinding == null) {
			contextBinding = new EObjectContainmentEList<ContextBinding>(
				ContextBinding.class, this, Mif2Package.VOCABULARY_MODEL__CONTEXT_BINDING);
		}
		return contextBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeTranslationCollection> getCodeTranslations() {
		if (codeTranslations == null) {
			codeTranslations = new EObjectContainmentEList<CodeTranslationCollection>(
				CodeTranslationCollection.class, this, Mif2Package.VOCABULARY_MODEL__CODE_TRANSLATIONS);
		}
		return codeTranslations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSystemSupplement> getCodeSystemSupplement() {
		if (codeSystemSupplement == null) {
			codeSystemSupplement = new EObjectContainmentEList<CodeSystemSupplement>(
				CodeSystemSupplement.class, this, Mif2Package.VOCABULARY_MODEL__CODE_SYSTEM_SUPPLEMENT);
		}
		return codeSystemSupplement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyModelDefinitionKind getDefinitionKind() {
		return definitionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionKind(VocabularyModelDefinitionKind newDefinitionKind) {
		VocabularyModelDefinitionKind oldDefinitionKind = definitionKind;
		definitionKind = newDefinitionKind == null
				? DEFINITION_KIND_EDEFAULT
				: newDefinitionKind;
		boolean oldDefinitionKindESet = definitionKindESet;
		definitionKindESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.VOCABULARY_MODEL__DEFINITION_KIND, oldDefinitionKind,
				definitionKind, !oldDefinitionKindESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefinitionKind() {
		VocabularyModelDefinitionKind oldDefinitionKind = definitionKind;
		boolean oldDefinitionKindESet = definitionKindESet;
		definitionKind = DEFINITION_KIND_EDEFAULT;
		definitionKindESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.VOCABULARY_MODEL__DEFINITION_KIND, oldDefinitionKind,
				DEFINITION_KIND_EDEFAULT, oldDefinitionKindESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefinitionKind() {
		return definitionKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.VOCABULARY_MODEL__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.VOCABULARY_MODEL__DEPENDS_ON_VOCAB_MODEL:
				return ((InternalEList<?>) getDependsOnVocabModel()).basicRemove(otherEnd, msgs);
			case Mif2Package.VOCABULARY_MODEL__CONCEPT_DOMAIN:
				return ((InternalEList<?>) getConceptDomain()).basicRemove(otherEnd, msgs);
			case Mif2Package.VOCABULARY_MODEL__CODE_SYSTEM:
				return ((InternalEList<?>) getCodeSystem()).basicRemove(otherEnd, msgs);
			case Mif2Package.VOCABULARY_MODEL__VALUE_SET:
				return ((InternalEList<?>) getValueSet()).basicRemove(otherEnd, msgs);
			case Mif2Package.VOCABULARY_MODEL__BINDING_REALM:
				return ((InternalEList<?>) getBindingRealm()).basicRemove(otherEnd, msgs);
			case Mif2Package.VOCABULARY_MODEL__CONTEXT_BINDING:
				return ((InternalEList<?>) getContextBinding()).basicRemove(otherEnd, msgs);
			case Mif2Package.VOCABULARY_MODEL__CODE_TRANSLATIONS:
				return ((InternalEList<?>) getCodeTranslations()).basicRemove(otherEnd, msgs);
			case Mif2Package.VOCABULARY_MODEL__CODE_SYSTEM_SUPPLEMENT:
				return ((InternalEList<?>) getCodeSystemSupplement()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.VOCABULARY_MODEL__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.VOCABULARY_MODEL__DEPENDS_ON_VOCAB_MODEL:
				return getDependsOnVocabModel();
			case Mif2Package.VOCABULARY_MODEL__CONCEPT_DOMAIN:
				return getConceptDomain();
			case Mif2Package.VOCABULARY_MODEL__CODE_SYSTEM:
				return getCodeSystem();
			case Mif2Package.VOCABULARY_MODEL__VALUE_SET:
				return getValueSet();
			case Mif2Package.VOCABULARY_MODEL__BINDING_REALM:
				return getBindingRealm();
			case Mif2Package.VOCABULARY_MODEL__CONTEXT_BINDING:
				return getContextBinding();
			case Mif2Package.VOCABULARY_MODEL__CODE_TRANSLATIONS:
				return getCodeTranslations();
			case Mif2Package.VOCABULARY_MODEL__CODE_SYSTEM_SUPPLEMENT:
				return getCodeSystemSupplement();
			case Mif2Package.VOCABULARY_MODEL__DEFINITION_KIND:
				return getDefinitionKind();
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
			case Mif2Package.VOCABULARY_MODEL__ANNOTATIONS:
				setAnnotations((VocabularyModelAnnotations) newValue);
				return;
			case Mif2Package.VOCABULARY_MODEL__DEPENDS_ON_VOCAB_MODEL:
				getDependsOnVocabModel().clear();
				getDependsOnVocabModel().addAll((Collection<? extends ArtifactDependency>) newValue);
				return;
			case Mif2Package.VOCABULARY_MODEL__CONCEPT_DOMAIN:
				getConceptDomain().clear();
				getConceptDomain().addAll((Collection<? extends ConceptDomain>) newValue);
				return;
			case Mif2Package.VOCABULARY_MODEL__CODE_SYSTEM:
				getCodeSystem().clear();
				getCodeSystem().addAll((Collection<? extends CodeSystem>) newValue);
				return;
			case Mif2Package.VOCABULARY_MODEL__VALUE_SET:
				getValueSet().clear();
				getValueSet().addAll((Collection<? extends ValueSet>) newValue);
				return;
			case Mif2Package.VOCABULARY_MODEL__BINDING_REALM:
				getBindingRealm().clear();
				getBindingRealm().addAll((Collection<? extends BindingRealm>) newValue);
				return;
			case Mif2Package.VOCABULARY_MODEL__CONTEXT_BINDING:
				getContextBinding().clear();
				getContextBinding().addAll((Collection<? extends ContextBinding>) newValue);
				return;
			case Mif2Package.VOCABULARY_MODEL__CODE_TRANSLATIONS:
				getCodeTranslations().clear();
				getCodeTranslations().addAll((Collection<? extends CodeTranslationCollection>) newValue);
				return;
			case Mif2Package.VOCABULARY_MODEL__CODE_SYSTEM_SUPPLEMENT:
				getCodeSystemSupplement().clear();
				getCodeSystemSupplement().addAll((Collection<? extends CodeSystemSupplement>) newValue);
				return;
			case Mif2Package.VOCABULARY_MODEL__DEFINITION_KIND:
				setDefinitionKind((VocabularyModelDefinitionKind) newValue);
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
			case Mif2Package.VOCABULARY_MODEL__ANNOTATIONS:
				setAnnotations((VocabularyModelAnnotations) null);
				return;
			case Mif2Package.VOCABULARY_MODEL__DEPENDS_ON_VOCAB_MODEL:
				getDependsOnVocabModel().clear();
				return;
			case Mif2Package.VOCABULARY_MODEL__CONCEPT_DOMAIN:
				getConceptDomain().clear();
				return;
			case Mif2Package.VOCABULARY_MODEL__CODE_SYSTEM:
				getCodeSystem().clear();
				return;
			case Mif2Package.VOCABULARY_MODEL__VALUE_SET:
				getValueSet().clear();
				return;
			case Mif2Package.VOCABULARY_MODEL__BINDING_REALM:
				getBindingRealm().clear();
				return;
			case Mif2Package.VOCABULARY_MODEL__CONTEXT_BINDING:
				getContextBinding().clear();
				return;
			case Mif2Package.VOCABULARY_MODEL__CODE_TRANSLATIONS:
				getCodeTranslations().clear();
				return;
			case Mif2Package.VOCABULARY_MODEL__CODE_SYSTEM_SUPPLEMENT:
				getCodeSystemSupplement().clear();
				return;
			case Mif2Package.VOCABULARY_MODEL__DEFINITION_KIND:
				unsetDefinitionKind();
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
			case Mif2Package.VOCABULARY_MODEL__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.VOCABULARY_MODEL__DEPENDS_ON_VOCAB_MODEL:
				return dependsOnVocabModel != null && !dependsOnVocabModel.isEmpty();
			case Mif2Package.VOCABULARY_MODEL__CONCEPT_DOMAIN:
				return conceptDomain != null && !conceptDomain.isEmpty();
			case Mif2Package.VOCABULARY_MODEL__CODE_SYSTEM:
				return codeSystem != null && !codeSystem.isEmpty();
			case Mif2Package.VOCABULARY_MODEL__VALUE_SET:
				return valueSet != null && !valueSet.isEmpty();
			case Mif2Package.VOCABULARY_MODEL__BINDING_REALM:
				return bindingRealm != null && !bindingRealm.isEmpty();
			case Mif2Package.VOCABULARY_MODEL__CONTEXT_BINDING:
				return contextBinding != null && !contextBinding.isEmpty();
			case Mif2Package.VOCABULARY_MODEL__CODE_TRANSLATIONS:
				return codeTranslations != null && !codeTranslations.isEmpty();
			case Mif2Package.VOCABULARY_MODEL__CODE_SYSTEM_SUPPLEMENT:
				return codeSystemSupplement != null && !codeSystemSupplement.isEmpty();
			case Mif2Package.VOCABULARY_MODEL__DEFINITION_KIND:
				return isSetDefinitionKind();
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
		result.append(" (definitionKind: ");
		if (definitionKindESet) {
			result.append(definitionKind);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // VocabularyModelImpl
