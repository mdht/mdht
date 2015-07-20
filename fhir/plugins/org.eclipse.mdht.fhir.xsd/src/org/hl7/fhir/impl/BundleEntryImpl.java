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

import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.BundleLink;
import org.hl7.fhir.BundleRequest;
import org.hl7.fhir.BundleResponse;
import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.BundleEntryImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleEntryImpl#getFullUrl <em>Full Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleEntryImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleEntryImpl#getSearch <em>Search</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleEntryImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleEntryImpl#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleEntryImpl extends BackboneElementImpl implements BundleEntry {
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<BundleLink> link;

	/**
	 * The cached value of the '{@link #getFullUrl() <em>Full Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri fullUrl;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected ResourceContainer resource;

	/**
	 * The cached value of the '{@link #getSearch() <em>Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearch()
	 * @generated
	 * @ordered
	 */
	protected BundleSearch search;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected BundleRequest request;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected BundleResponse response;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBundleEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BundleLink> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<BundleLink>(BundleLink.class, this, FhirPackage.BUNDLE_ENTRY__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getFullUrl() {
		return fullUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFullUrl(Uri newFullUrl, NotificationChain msgs) {
		Uri oldFullUrl = fullUrl;
		fullUrl = newFullUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__FULL_URL, oldFullUrl, newFullUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullUrl(Uri newFullUrl) {
		if (newFullUrl != fullUrl) {
			NotificationChain msgs = null;
			if (fullUrl != null)
				msgs = ((InternalEObject)fullUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__FULL_URL, null, msgs);
			if (newFullUrl != null)
				msgs = ((InternalEObject)newFullUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__FULL_URL, null, msgs);
			msgs = basicSetFullUrl(newFullUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__FULL_URL, newFullUrl, newFullUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(ResourceContainer newResource, NotificationChain msgs) {
		ResourceContainer oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(ResourceContainer newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleSearch getSearch() {
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearch(BundleSearch newSearch, NotificationChain msgs) {
		BundleSearch oldSearch = search;
		search = newSearch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__SEARCH, oldSearch, newSearch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearch(BundleSearch newSearch) {
		if (newSearch != search) {
			NotificationChain msgs = null;
			if (search != null)
				msgs = ((InternalEObject)search).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__SEARCH, null, msgs);
			if (newSearch != null)
				msgs = ((InternalEObject)newSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__SEARCH, null, msgs);
			msgs = basicSetSearch(newSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__SEARCH, newSearch, newSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleRequest getRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(BundleRequest newRequest, NotificationChain msgs) {
		BundleRequest oldRequest = request;
		request = newRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__REQUEST, oldRequest, newRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(BundleRequest newRequest) {
		if (newRequest != request) {
			NotificationChain msgs = null;
			if (request != null)
				msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__REQUEST, null, msgs);
			if (newRequest != null)
				msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__REQUEST, null, msgs);
			msgs = basicSetRequest(newRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__REQUEST, newRequest, newRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleResponse getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(BundleResponse newResponse, NotificationChain msgs) {
		BundleResponse oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__RESPONSE, oldResponse, newResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(BundleResponse newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BUNDLE_ENTRY__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case FhirPackage.BUNDLE_ENTRY__FULL_URL:
				return basicSetFullUrl(null, msgs);
			case FhirPackage.BUNDLE_ENTRY__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.BUNDLE_ENTRY__SEARCH:
				return basicSetSearch(null, msgs);
			case FhirPackage.BUNDLE_ENTRY__REQUEST:
				return basicSetRequest(null, msgs);
			case FhirPackage.BUNDLE_ENTRY__RESPONSE:
				return basicSetResponse(null, msgs);
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
			case FhirPackage.BUNDLE_ENTRY__LINK:
				return getLink();
			case FhirPackage.BUNDLE_ENTRY__FULL_URL:
				return getFullUrl();
			case FhirPackage.BUNDLE_ENTRY__RESOURCE:
				return getResource();
			case FhirPackage.BUNDLE_ENTRY__SEARCH:
				return getSearch();
			case FhirPackage.BUNDLE_ENTRY__REQUEST:
				return getRequest();
			case FhirPackage.BUNDLE_ENTRY__RESPONSE:
				return getResponse();
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
			case FhirPackage.BUNDLE_ENTRY__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends BundleLink>)newValue);
				return;
			case FhirPackage.BUNDLE_ENTRY__FULL_URL:
				setFullUrl((Uri)newValue);
				return;
			case FhirPackage.BUNDLE_ENTRY__RESOURCE:
				setResource((ResourceContainer)newValue);
				return;
			case FhirPackage.BUNDLE_ENTRY__SEARCH:
				setSearch((BundleSearch)newValue);
				return;
			case FhirPackage.BUNDLE_ENTRY__REQUEST:
				setRequest((BundleRequest)newValue);
				return;
			case FhirPackage.BUNDLE_ENTRY__RESPONSE:
				setResponse((BundleResponse)newValue);
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
			case FhirPackage.BUNDLE_ENTRY__LINK:
				getLink().clear();
				return;
			case FhirPackage.BUNDLE_ENTRY__FULL_URL:
				setFullUrl((Uri)null);
				return;
			case FhirPackage.BUNDLE_ENTRY__RESOURCE:
				setResource((ResourceContainer)null);
				return;
			case FhirPackage.BUNDLE_ENTRY__SEARCH:
				setSearch((BundleSearch)null);
				return;
			case FhirPackage.BUNDLE_ENTRY__REQUEST:
				setRequest((BundleRequest)null);
				return;
			case FhirPackage.BUNDLE_ENTRY__RESPONSE:
				setResponse((BundleResponse)null);
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
			case FhirPackage.BUNDLE_ENTRY__LINK:
				return link != null && !link.isEmpty();
			case FhirPackage.BUNDLE_ENTRY__FULL_URL:
				return fullUrl != null;
			case FhirPackage.BUNDLE_ENTRY__RESOURCE:
				return resource != null;
			case FhirPackage.BUNDLE_ENTRY__SEARCH:
				return search != null;
			case FhirPackage.BUNDLE_ENTRY__REQUEST:
				return request != null;
			case FhirPackage.BUNDLE_ENTRY__RESPONSE:
				return response != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleEntryImpl
