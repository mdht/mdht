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
import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.BundleTransaction;
import org.hl7.fhir.BundleTransactionResponse;
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
 *   <li>{@link org.hl7.fhir.impl.BundleEntryImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleEntryImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleEntryImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleEntryImpl#getSearch <em>Search</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleEntryImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleEntryImpl#getTransactionResponse <em>Transaction Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleEntryImpl extends BackboneElementImpl implements BundleEntry {
	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Uri base;

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
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected BundleTransaction transaction;

	/**
	 * The cached value of the '{@link #getTransactionResponse() <em>Transaction Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionResponse()
	 * @generated
	 * @ordered
	 */
	protected BundleTransactionResponse transactionResponse;

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
	public Uri getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(Uri newBase, NotificationChain msgs) {
		Uri oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(Uri newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__BASE, newBase, newBase));
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
	public BundleTransaction getTransaction() {
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransaction(BundleTransaction newTransaction, NotificationChain msgs) {
		BundleTransaction oldTransaction = transaction;
		transaction = newTransaction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__TRANSACTION, oldTransaction, newTransaction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(BundleTransaction newTransaction) {
		if (newTransaction != transaction) {
			NotificationChain msgs = null;
			if (transaction != null)
				msgs = ((InternalEObject)transaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__TRANSACTION, null, msgs);
			if (newTransaction != null)
				msgs = ((InternalEObject)newTransaction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__TRANSACTION, null, msgs);
			msgs = basicSetTransaction(newTransaction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__TRANSACTION, newTransaction, newTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTransactionResponse getTransactionResponse() {
		return transactionResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionResponse(BundleTransactionResponse newTransactionResponse, NotificationChain msgs) {
		BundleTransactionResponse oldTransactionResponse = transactionResponse;
		transactionResponse = newTransactionResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__TRANSACTION_RESPONSE, oldTransactionResponse, newTransactionResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionResponse(BundleTransactionResponse newTransactionResponse) {
		if (newTransactionResponse != transactionResponse) {
			NotificationChain msgs = null;
			if (transactionResponse != null)
				msgs = ((InternalEObject)transactionResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__TRANSACTION_RESPONSE, null, msgs);
			if (newTransactionResponse != null)
				msgs = ((InternalEObject)newTransactionResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_ENTRY__TRANSACTION_RESPONSE, null, msgs);
			msgs = basicSetTransactionResponse(newTransactionResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_ENTRY__TRANSACTION_RESPONSE, newTransactionResponse, newTransactionResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BUNDLE_ENTRY__BASE:
				return basicSetBase(null, msgs);
			case FhirPackage.BUNDLE_ENTRY__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case FhirPackage.BUNDLE_ENTRY__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.BUNDLE_ENTRY__SEARCH:
				return basicSetSearch(null, msgs);
			case FhirPackage.BUNDLE_ENTRY__TRANSACTION:
				return basicSetTransaction(null, msgs);
			case FhirPackage.BUNDLE_ENTRY__TRANSACTION_RESPONSE:
				return basicSetTransactionResponse(null, msgs);
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
			case FhirPackage.BUNDLE_ENTRY__BASE:
				return getBase();
			case FhirPackage.BUNDLE_ENTRY__LINK:
				return getLink();
			case FhirPackage.BUNDLE_ENTRY__RESOURCE:
				return getResource();
			case FhirPackage.BUNDLE_ENTRY__SEARCH:
				return getSearch();
			case FhirPackage.BUNDLE_ENTRY__TRANSACTION:
				return getTransaction();
			case FhirPackage.BUNDLE_ENTRY__TRANSACTION_RESPONSE:
				return getTransactionResponse();
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
			case FhirPackage.BUNDLE_ENTRY__BASE:
				setBase((Uri)newValue);
				return;
			case FhirPackage.BUNDLE_ENTRY__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends BundleLink>)newValue);
				return;
			case FhirPackage.BUNDLE_ENTRY__RESOURCE:
				setResource((ResourceContainer)newValue);
				return;
			case FhirPackage.BUNDLE_ENTRY__SEARCH:
				setSearch((BundleSearch)newValue);
				return;
			case FhirPackage.BUNDLE_ENTRY__TRANSACTION:
				setTransaction((BundleTransaction)newValue);
				return;
			case FhirPackage.BUNDLE_ENTRY__TRANSACTION_RESPONSE:
				setTransactionResponse((BundleTransactionResponse)newValue);
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
			case FhirPackage.BUNDLE_ENTRY__BASE:
				setBase((Uri)null);
				return;
			case FhirPackage.BUNDLE_ENTRY__LINK:
				getLink().clear();
				return;
			case FhirPackage.BUNDLE_ENTRY__RESOURCE:
				setResource((ResourceContainer)null);
				return;
			case FhirPackage.BUNDLE_ENTRY__SEARCH:
				setSearch((BundleSearch)null);
				return;
			case FhirPackage.BUNDLE_ENTRY__TRANSACTION:
				setTransaction((BundleTransaction)null);
				return;
			case FhirPackage.BUNDLE_ENTRY__TRANSACTION_RESPONSE:
				setTransactionResponse((BundleTransactionResponse)null);
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
			case FhirPackage.BUNDLE_ENTRY__BASE:
				return base != null;
			case FhirPackage.BUNDLE_ENTRY__LINK:
				return link != null && !link.isEmpty();
			case FhirPackage.BUNDLE_ENTRY__RESOURCE:
				return resource != null;
			case FhirPackage.BUNDLE_ENTRY__SEARCH:
				return search != null;
			case FhirPackage.BUNDLE_ENTRY__TRANSACTION:
				return transaction != null;
			case FhirPackage.BUNDLE_ENTRY__TRANSACTION_RESPONSE:
				return transactionResponse != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleEntryImpl
