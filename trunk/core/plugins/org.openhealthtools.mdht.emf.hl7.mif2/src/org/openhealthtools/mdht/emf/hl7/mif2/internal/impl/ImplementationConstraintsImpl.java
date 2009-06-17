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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeLimitation;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeModelLibrary;
import org.openhealthtools.mdht.emf.hl7.mif2.ImplementationConstraints;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.RealmElement;
import org.openhealthtools.mdht.emf.hl7.mif2.ReleaseList;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyLimitation;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationConstraintsImpl#getSupportedReleases <em>Supported Releases</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationConstraintsImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationConstraintsImpl#getRealmNamespace <em>Realm Namespace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationConstraintsImpl#getSupportedITS <em>Supported ITS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationConstraintsImpl#getAdditionalDatatypeModel <em>Additional Datatype Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationConstraintsImpl#getDatatypeLimitation <em>Datatype Limitation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationConstraintsImpl#getAdditionalVocabularyModel <em>Additional Vocabulary Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationConstraintsImpl#getVocabularyLimitation <em>Vocabulary Limitation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationConstraintsImpl extends EObjectImpl implements ImplementationConstraints {
	/**
	 * The cached value of the '{@link #getSupportedReleases() <em>Supported Releases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedReleases()
	 * @generated
	 * @ordered
	 */
	protected EList<ReleaseList> supportedReleases;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap context;

	/**
	 * The cached value of the '{@link #getSupportedITS() <em>Supported ITS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedITS()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> supportedITS;

	/**
	 * The cached value of the '{@link #getAdditionalDatatypeModel() <em>Additional Datatype Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalDatatypeModel()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeModelLibrary> additionalDatatypeModel;

	/**
	 * The cached value of the '{@link #getDatatypeLimitation() <em>Datatype Limitation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeLimitation()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeLimitation> datatypeLimitation;

	/**
	 * The cached value of the '{@link #getAdditionalVocabularyModel() <em>Additional Vocabulary Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalVocabularyModel()
	 * @generated
	 * @ordered
	 */
	protected EList<VocabularyModel> additionalVocabularyModel;

	/**
	 * The cached value of the '{@link #getVocabularyLimitation() <em>Vocabulary Limitation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabularyLimitation()
	 * @generated
	 * @ordered
	 */
	protected EList<VocabularyLimitation> vocabularyLimitation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.IMPLEMENTATION_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReleaseList> getSupportedReleases() {
		if (supportedReleases == null) {
			supportedReleases = new EObjectContainmentEList<ReleaseList>(ReleaseList.class, this, Mif2Package.IMPLEMENTATION_CONSTRAINTS__SUPPORTED_RELEASES);
		}
		return supportedReleases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContext() {
		if (context == null) {
			context = new BasicFeatureMap(this, Mif2Package.IMPLEMENTATION_CONSTRAINTS__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealmElement> getRealmNamespace() {
		return getContext().list(Mif2Package.Literals.IMPLEMENTATION_CONSTRAINTS__REALM_NAMESPACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getSupportedITS() {
		if (supportedITS == null) {
			supportedITS = new EObjectContainmentEList<PackageRef>(PackageRef.class, this, Mif2Package.IMPLEMENTATION_CONSTRAINTS__SUPPORTED_ITS);
		}
		return supportedITS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeModelLibrary> getAdditionalDatatypeModel() {
		if (additionalDatatypeModel == null) {
			additionalDatatypeModel = new EObjectContainmentEList<DatatypeModelLibrary>(DatatypeModelLibrary.class, this, Mif2Package.IMPLEMENTATION_CONSTRAINTS__ADDITIONAL_DATATYPE_MODEL);
		}
		return additionalDatatypeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeLimitation> getDatatypeLimitation() {
		if (datatypeLimitation == null) {
			datatypeLimitation = new EObjectContainmentEList<DatatypeLimitation>(DatatypeLimitation.class, this, Mif2Package.IMPLEMENTATION_CONSTRAINTS__DATATYPE_LIMITATION);
		}
		return datatypeLimitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VocabularyModel> getAdditionalVocabularyModel() {
		if (additionalVocabularyModel == null) {
			additionalVocabularyModel = new EObjectContainmentEList<VocabularyModel>(VocabularyModel.class, this, Mif2Package.IMPLEMENTATION_CONSTRAINTS__ADDITIONAL_VOCABULARY_MODEL);
		}
		return additionalVocabularyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VocabularyLimitation> getVocabularyLimitation() {
		if (vocabularyLimitation == null) {
			vocabularyLimitation = new EObjectContainmentEList<VocabularyLimitation>(VocabularyLimitation.class, this, Mif2Package.IMPLEMENTATION_CONSTRAINTS__VOCABULARY_LIMITATION);
		}
		return vocabularyLimitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__SUPPORTED_RELEASES:
				return ((InternalEList<?>)getSupportedReleases()).basicRemove(otherEnd, msgs);
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__REALM_NAMESPACE:
				return ((InternalEList<?>)getRealmNamespace()).basicRemove(otherEnd, msgs);
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__SUPPORTED_ITS:
				return ((InternalEList<?>)getSupportedITS()).basicRemove(otherEnd, msgs);
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__ADDITIONAL_DATATYPE_MODEL:
				return ((InternalEList<?>)getAdditionalDatatypeModel()).basicRemove(otherEnd, msgs);
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__DATATYPE_LIMITATION:
				return ((InternalEList<?>)getDatatypeLimitation()).basicRemove(otherEnd, msgs);
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__ADDITIONAL_VOCABULARY_MODEL:
				return ((InternalEList<?>)getAdditionalVocabularyModel()).basicRemove(otherEnd, msgs);
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__VOCABULARY_LIMITATION:
				return ((InternalEList<?>)getVocabularyLimitation()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__SUPPORTED_RELEASES:
				return getSupportedReleases();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__CONTEXT:
				if (coreType) return getContext();
				return ((FeatureMap.Internal)getContext()).getWrapper();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__REALM_NAMESPACE:
				return getRealmNamespace();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__SUPPORTED_ITS:
				return getSupportedITS();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__ADDITIONAL_DATATYPE_MODEL:
				return getAdditionalDatatypeModel();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__DATATYPE_LIMITATION:
				return getDatatypeLimitation();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__ADDITIONAL_VOCABULARY_MODEL:
				return getAdditionalVocabularyModel();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__VOCABULARY_LIMITATION:
				return getVocabularyLimitation();
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
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__SUPPORTED_RELEASES:
				getSupportedReleases().clear();
				getSupportedReleases().addAll((Collection<? extends ReleaseList>)newValue);
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__CONTEXT:
				((FeatureMap.Internal)getContext()).set(newValue);
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__REALM_NAMESPACE:
				getRealmNamespace().clear();
				getRealmNamespace().addAll((Collection<? extends RealmElement>)newValue);
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__SUPPORTED_ITS:
				getSupportedITS().clear();
				getSupportedITS().addAll((Collection<? extends PackageRef>)newValue);
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__ADDITIONAL_DATATYPE_MODEL:
				getAdditionalDatatypeModel().clear();
				getAdditionalDatatypeModel().addAll((Collection<? extends DatatypeModelLibrary>)newValue);
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__DATATYPE_LIMITATION:
				getDatatypeLimitation().clear();
				getDatatypeLimitation().addAll((Collection<? extends DatatypeLimitation>)newValue);
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__ADDITIONAL_VOCABULARY_MODEL:
				getAdditionalVocabularyModel().clear();
				getAdditionalVocabularyModel().addAll((Collection<? extends VocabularyModel>)newValue);
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__VOCABULARY_LIMITATION:
				getVocabularyLimitation().clear();
				getVocabularyLimitation().addAll((Collection<? extends VocabularyLimitation>)newValue);
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
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__SUPPORTED_RELEASES:
				getSupportedReleases().clear();
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__CONTEXT:
				getContext().clear();
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__REALM_NAMESPACE:
				getRealmNamespace().clear();
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__SUPPORTED_ITS:
				getSupportedITS().clear();
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__ADDITIONAL_DATATYPE_MODEL:
				getAdditionalDatatypeModel().clear();
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__DATATYPE_LIMITATION:
				getDatatypeLimitation().clear();
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__ADDITIONAL_VOCABULARY_MODEL:
				getAdditionalVocabularyModel().clear();
				return;
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__VOCABULARY_LIMITATION:
				getVocabularyLimitation().clear();
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
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__SUPPORTED_RELEASES:
				return supportedReleases != null && !supportedReleases.isEmpty();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__CONTEXT:
				return context != null && !context.isEmpty();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__REALM_NAMESPACE:
				return !getRealmNamespace().isEmpty();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__SUPPORTED_ITS:
				return supportedITS != null && !supportedITS.isEmpty();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__ADDITIONAL_DATATYPE_MODEL:
				return additionalDatatypeModel != null && !additionalDatatypeModel.isEmpty();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__DATATYPE_LIMITATION:
				return datatypeLimitation != null && !datatypeLimitation.isEmpty();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__ADDITIONAL_VOCABULARY_MODEL:
				return additionalVocabularyModel != null && !additionalVocabularyModel.isEmpty();
			case Mif2Package.IMPLEMENTATION_CONSTRAINTS__VOCABULARY_LIMITATION:
				return vocabularyLimitation != null && !vocabularyLimitation.isEmpty();
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
		result.append(" (context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //ImplementationConstraintsImpl
