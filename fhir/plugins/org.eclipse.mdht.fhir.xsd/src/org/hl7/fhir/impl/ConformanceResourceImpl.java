/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Code;
import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.ConformanceInteraction;
import org.hl7.fhir.ConformanceResource;
import org.hl7.fhir.ConformanceSearchParam;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ResourceVersionPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConformanceResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceResourceImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceResourceImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceResourceImpl#getVersioning <em>Versioning</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceResourceImpl#getReadHistory <em>Read History</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceResourceImpl#getUpdateCreate <em>Update Create</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceResourceImpl#getConditionalCreate <em>Conditional Create</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceResourceImpl#getConditionalUpdate <em>Conditional Update</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceResourceImpl#getConditionalDelete <em>Conditional Delete</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceResourceImpl#getSearchInclude <em>Search Include</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConformanceResourceImpl#getSearchParam <em>Search Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformanceResourceImpl extends BackboneElementImpl implements ConformanceResource {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected Reference profile;

	/**
	 * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceInteraction> interaction;

	/**
	 * The cached value of the '{@link #getVersioning() <em>Versioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioning()
	 * @generated
	 * @ordered
	 */
	protected ResourceVersionPolicy versioning;

	/**
	 * The cached value of the '{@link #getReadHistory() <em>Read History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadHistory()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean readHistory;

	/**
	 * The cached value of the '{@link #getUpdateCreate() <em>Update Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateCreate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean updateCreate;

	/**
	 * The cached value of the '{@link #getConditionalCreate() <em>Conditional Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalCreate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean conditionalCreate;

	/**
	 * The cached value of the '{@link #getConditionalUpdate() <em>Conditional Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalUpdate()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean conditionalUpdate;

	/**
	 * The cached value of the '{@link #getConditionalDelete() <em>Conditional Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalDelete()
	 * @generated
	 * @ordered
	 */
	protected ConditionalDeleteStatus conditionalDelete;

	/**
	 * The cached value of the '{@link #getSearchInclude() <em>Search Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> searchInclude;

	/**
	 * The cached value of the '{@link #getSearchParam() <em>Search Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParam()
	 * @generated
	 * @ordered
	 */
	protected EList<ConformanceSearchParam> searchParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConformanceResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Reference newProfile, NotificationChain msgs) {
		Reference oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__PROFILE, oldProfile, newProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(Reference newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__PROFILE, null, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__PROFILE, null, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceInteraction> getInteraction() {
		if (interaction == null) {
			interaction = new EObjectContainmentEList<ConformanceInteraction>(ConformanceInteraction.class, this, FhirPackage.CONFORMANCE_RESOURCE__INTERACTION);
		}
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceVersionPolicy getVersioning() {
		return versioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersioning(ResourceVersionPolicy newVersioning, NotificationChain msgs) {
		ResourceVersionPolicy oldVersioning = versioning;
		versioning = newVersioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__VERSIONING, oldVersioning, newVersioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioning(ResourceVersionPolicy newVersioning) {
		if (newVersioning != versioning) {
			NotificationChain msgs = null;
			if (versioning != null)
				msgs = ((InternalEObject)versioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__VERSIONING, null, msgs);
			if (newVersioning != null)
				msgs = ((InternalEObject)newVersioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__VERSIONING, null, msgs);
			msgs = basicSetVersioning(newVersioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__VERSIONING, newVersioning, newVersioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getReadHistory() {
		return readHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadHistory(org.hl7.fhir.Boolean newReadHistory, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldReadHistory = readHistory;
		readHistory = newReadHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__READ_HISTORY, oldReadHistory, newReadHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadHistory(org.hl7.fhir.Boolean newReadHistory) {
		if (newReadHistory != readHistory) {
			NotificationChain msgs = null;
			if (readHistory != null)
				msgs = ((InternalEObject)readHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__READ_HISTORY, null, msgs);
			if (newReadHistory != null)
				msgs = ((InternalEObject)newReadHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__READ_HISTORY, null, msgs);
			msgs = basicSetReadHistory(newReadHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__READ_HISTORY, newReadHistory, newReadHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getUpdateCreate() {
		return updateCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateCreate(org.hl7.fhir.Boolean newUpdateCreate, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldUpdateCreate = updateCreate;
		updateCreate = newUpdateCreate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__UPDATE_CREATE, oldUpdateCreate, newUpdateCreate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateCreate(org.hl7.fhir.Boolean newUpdateCreate) {
		if (newUpdateCreate != updateCreate) {
			NotificationChain msgs = null;
			if (updateCreate != null)
				msgs = ((InternalEObject)updateCreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__UPDATE_CREATE, null, msgs);
			if (newUpdateCreate != null)
				msgs = ((InternalEObject)newUpdateCreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__UPDATE_CREATE, null, msgs);
			msgs = basicSetUpdateCreate(newUpdateCreate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__UPDATE_CREATE, newUpdateCreate, newUpdateCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getConditionalCreate() {
		return conditionalCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalCreate(org.hl7.fhir.Boolean newConditionalCreate, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldConditionalCreate = conditionalCreate;
		conditionalCreate = newConditionalCreate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_CREATE, oldConditionalCreate, newConditionalCreate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalCreate(org.hl7.fhir.Boolean newConditionalCreate) {
		if (newConditionalCreate != conditionalCreate) {
			NotificationChain msgs = null;
			if (conditionalCreate != null)
				msgs = ((InternalEObject)conditionalCreate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_CREATE, null, msgs);
			if (newConditionalCreate != null)
				msgs = ((InternalEObject)newConditionalCreate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_CREATE, null, msgs);
			msgs = basicSetConditionalCreate(newConditionalCreate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_CREATE, newConditionalCreate, newConditionalCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getConditionalUpdate() {
		return conditionalUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalUpdate(org.hl7.fhir.Boolean newConditionalUpdate, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldConditionalUpdate = conditionalUpdate;
		conditionalUpdate = newConditionalUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_UPDATE, oldConditionalUpdate, newConditionalUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalUpdate(org.hl7.fhir.Boolean newConditionalUpdate) {
		if (newConditionalUpdate != conditionalUpdate) {
			NotificationChain msgs = null;
			if (conditionalUpdate != null)
				msgs = ((InternalEObject)conditionalUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_UPDATE, null, msgs);
			if (newConditionalUpdate != null)
				msgs = ((InternalEObject)newConditionalUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_UPDATE, null, msgs);
			msgs = basicSetConditionalUpdate(newConditionalUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_UPDATE, newConditionalUpdate, newConditionalUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDeleteStatus getConditionalDelete() {
		return conditionalDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalDelete(ConditionalDeleteStatus newConditionalDelete, NotificationChain msgs) {
		ConditionalDeleteStatus oldConditionalDelete = conditionalDelete;
		conditionalDelete = newConditionalDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_DELETE, oldConditionalDelete, newConditionalDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalDelete(ConditionalDeleteStatus newConditionalDelete) {
		if (newConditionalDelete != conditionalDelete) {
			NotificationChain msgs = null;
			if (conditionalDelete != null)
				msgs = ((InternalEObject)conditionalDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_DELETE, null, msgs);
			if (newConditionalDelete != null)
				msgs = ((InternalEObject)newConditionalDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_DELETE, null, msgs);
			msgs = basicSetConditionalDelete(newConditionalDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_DELETE, newConditionalDelete, newConditionalDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getSearchInclude() {
		if (searchInclude == null) {
			searchInclude = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.CONFORMANCE_RESOURCE__SEARCH_INCLUDE);
		}
		return searchInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConformanceSearchParam> getSearchParam() {
		if (searchParam == null) {
			searchParam = new EObjectContainmentEList<ConformanceSearchParam>(ConformanceSearchParam.class, this, FhirPackage.CONFORMANCE_RESOURCE__SEARCH_PARAM);
		}
		return searchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONFORMANCE_RESOURCE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.CONFORMANCE_RESOURCE__PROFILE:
				return basicSetProfile(null, msgs);
			case FhirPackage.CONFORMANCE_RESOURCE__INTERACTION:
				return ((InternalEList<?>)getInteraction()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE_RESOURCE__VERSIONING:
				return basicSetVersioning(null, msgs);
			case FhirPackage.CONFORMANCE_RESOURCE__READ_HISTORY:
				return basicSetReadHistory(null, msgs);
			case FhirPackage.CONFORMANCE_RESOURCE__UPDATE_CREATE:
				return basicSetUpdateCreate(null, msgs);
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_CREATE:
				return basicSetConditionalCreate(null, msgs);
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_UPDATE:
				return basicSetConditionalUpdate(null, msgs);
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_DELETE:
				return basicSetConditionalDelete(null, msgs);
			case FhirPackage.CONFORMANCE_RESOURCE__SEARCH_INCLUDE:
				return ((InternalEList<?>)getSearchInclude()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONFORMANCE_RESOURCE__SEARCH_PARAM:
				return ((InternalEList<?>)getSearchParam()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONFORMANCE_RESOURCE__TYPE:
				return getType();
			case FhirPackage.CONFORMANCE_RESOURCE__PROFILE:
				return getProfile();
			case FhirPackage.CONFORMANCE_RESOURCE__INTERACTION:
				return getInteraction();
			case FhirPackage.CONFORMANCE_RESOURCE__VERSIONING:
				return getVersioning();
			case FhirPackage.CONFORMANCE_RESOURCE__READ_HISTORY:
				return getReadHistory();
			case FhirPackage.CONFORMANCE_RESOURCE__UPDATE_CREATE:
				return getUpdateCreate();
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_CREATE:
				return getConditionalCreate();
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_UPDATE:
				return getConditionalUpdate();
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_DELETE:
				return getConditionalDelete();
			case FhirPackage.CONFORMANCE_RESOURCE__SEARCH_INCLUDE:
				return getSearchInclude();
			case FhirPackage.CONFORMANCE_RESOURCE__SEARCH_PARAM:
				return getSearchParam();
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
			case FhirPackage.CONFORMANCE_RESOURCE__TYPE:
				setType((Code)newValue);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__PROFILE:
				setProfile((Reference)newValue);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__INTERACTION:
				getInteraction().clear();
				getInteraction().addAll((Collection<? extends ConformanceInteraction>)newValue);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__VERSIONING:
				setVersioning((ResourceVersionPolicy)newValue);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__READ_HISTORY:
				setReadHistory((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__UPDATE_CREATE:
				setUpdateCreate((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_CREATE:
				setConditionalCreate((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_UPDATE:
				setConditionalUpdate((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_DELETE:
				setConditionalDelete((ConditionalDeleteStatus)newValue);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__SEARCH_INCLUDE:
				getSearchInclude().clear();
				getSearchInclude().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__SEARCH_PARAM:
				getSearchParam().clear();
				getSearchParam().addAll((Collection<? extends ConformanceSearchParam>)newValue);
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
			case FhirPackage.CONFORMANCE_RESOURCE__TYPE:
				setType((Code)null);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__PROFILE:
				setProfile((Reference)null);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__INTERACTION:
				getInteraction().clear();
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__VERSIONING:
				setVersioning((ResourceVersionPolicy)null);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__READ_HISTORY:
				setReadHistory((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__UPDATE_CREATE:
				setUpdateCreate((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_CREATE:
				setConditionalCreate((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_UPDATE:
				setConditionalUpdate((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_DELETE:
				setConditionalDelete((ConditionalDeleteStatus)null);
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__SEARCH_INCLUDE:
				getSearchInclude().clear();
				return;
			case FhirPackage.CONFORMANCE_RESOURCE__SEARCH_PARAM:
				getSearchParam().clear();
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
			case FhirPackage.CONFORMANCE_RESOURCE__TYPE:
				return type != null;
			case FhirPackage.CONFORMANCE_RESOURCE__PROFILE:
				return profile != null;
			case FhirPackage.CONFORMANCE_RESOURCE__INTERACTION:
				return interaction != null && !interaction.isEmpty();
			case FhirPackage.CONFORMANCE_RESOURCE__VERSIONING:
				return versioning != null;
			case FhirPackage.CONFORMANCE_RESOURCE__READ_HISTORY:
				return readHistory != null;
			case FhirPackage.CONFORMANCE_RESOURCE__UPDATE_CREATE:
				return updateCreate != null;
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_CREATE:
				return conditionalCreate != null;
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_UPDATE:
				return conditionalUpdate != null;
			case FhirPackage.CONFORMANCE_RESOURCE__CONDITIONAL_DELETE:
				return conditionalDelete != null;
			case FhirPackage.CONFORMANCE_RESOURCE__SEARCH_INCLUDE:
				return searchInclude != null && !searchInclude.isEmpty();
			case FhirPackage.CONFORMANCE_RESOURCE__SEARCH_PARAM:
				return searchParam != null && !searchParam.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConformanceResourceImpl
