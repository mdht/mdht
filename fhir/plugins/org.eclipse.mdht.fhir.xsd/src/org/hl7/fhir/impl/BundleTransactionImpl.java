/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.BundleTransaction;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.HTTPVerb;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.BundleTransactionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleTransactionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleTransactionImpl#getIfNoneMatch <em>If None Match</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleTransactionImpl#getIfMatch <em>If Match</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleTransactionImpl#getIfModifiedSince <em>If Modified Since</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.BundleTransactionImpl#getIfNoneExist <em>If None Exist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleTransactionImpl extends BackboneElementImpl implements BundleTransaction {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected HTTPVerb method;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getIfNoneMatch() <em>If None Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfNoneMatch()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String ifNoneMatch;

	/**
	 * The cached value of the '{@link #getIfMatch() <em>If Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfMatch()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String ifMatch;

	/**
	 * The cached value of the '{@link #getIfModifiedSince() <em>If Modified Since</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfModifiedSince()
	 * @generated
	 * @ordered
	 */
	protected Instant ifModifiedSince;

	/**
	 * The cached value of the '{@link #getIfNoneExist() <em>If None Exist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfNoneExist()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String ifNoneExist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getBundleTransaction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(HTTPVerb newMethod, NotificationChain msgs) {
		HTTPVerb oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_TRANSACTION__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(HTTPVerb newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_TRANSACTION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_TRANSACTION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_TRANSACTION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_TRANSACTION__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_TRANSACTION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_TRANSACTION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_TRANSACTION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getIfNoneMatch() {
		return ifNoneMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfNoneMatch(org.hl7.fhir.String newIfNoneMatch, NotificationChain msgs) {
		org.hl7.fhir.String oldIfNoneMatch = ifNoneMatch;
		ifNoneMatch = newIfNoneMatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_TRANSACTION__IF_NONE_MATCH, oldIfNoneMatch, newIfNoneMatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfNoneMatch(org.hl7.fhir.String newIfNoneMatch) {
		if (newIfNoneMatch != ifNoneMatch) {
			NotificationChain msgs = null;
			if (ifNoneMatch != null)
				msgs = ((InternalEObject)ifNoneMatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_TRANSACTION__IF_NONE_MATCH, null, msgs);
			if (newIfNoneMatch != null)
				msgs = ((InternalEObject)newIfNoneMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_TRANSACTION__IF_NONE_MATCH, null, msgs);
			msgs = basicSetIfNoneMatch(newIfNoneMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_TRANSACTION__IF_NONE_MATCH, newIfNoneMatch, newIfNoneMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getIfMatch() {
		return ifMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfMatch(org.hl7.fhir.String newIfMatch, NotificationChain msgs) {
		org.hl7.fhir.String oldIfMatch = ifMatch;
		ifMatch = newIfMatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_TRANSACTION__IF_MATCH, oldIfMatch, newIfMatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfMatch(org.hl7.fhir.String newIfMatch) {
		if (newIfMatch != ifMatch) {
			NotificationChain msgs = null;
			if (ifMatch != null)
				msgs = ((InternalEObject)ifMatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_TRANSACTION__IF_MATCH, null, msgs);
			if (newIfMatch != null)
				msgs = ((InternalEObject)newIfMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_TRANSACTION__IF_MATCH, null, msgs);
			msgs = basicSetIfMatch(newIfMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_TRANSACTION__IF_MATCH, newIfMatch, newIfMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getIfModifiedSince() {
		return ifModifiedSince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfModifiedSince(Instant newIfModifiedSince, NotificationChain msgs) {
		Instant oldIfModifiedSince = ifModifiedSince;
		ifModifiedSince = newIfModifiedSince;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_TRANSACTION__IF_MODIFIED_SINCE, oldIfModifiedSince, newIfModifiedSince);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfModifiedSince(Instant newIfModifiedSince) {
		if (newIfModifiedSince != ifModifiedSince) {
			NotificationChain msgs = null;
			if (ifModifiedSince != null)
				msgs = ((InternalEObject)ifModifiedSince).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_TRANSACTION__IF_MODIFIED_SINCE, null, msgs);
			if (newIfModifiedSince != null)
				msgs = ((InternalEObject)newIfModifiedSince).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_TRANSACTION__IF_MODIFIED_SINCE, null, msgs);
			msgs = basicSetIfModifiedSince(newIfModifiedSince, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_TRANSACTION__IF_MODIFIED_SINCE, newIfModifiedSince, newIfModifiedSince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getIfNoneExist() {
		return ifNoneExist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfNoneExist(org.hl7.fhir.String newIfNoneExist, NotificationChain msgs) {
		org.hl7.fhir.String oldIfNoneExist = ifNoneExist;
		ifNoneExist = newIfNoneExist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_TRANSACTION__IF_NONE_EXIST, oldIfNoneExist, newIfNoneExist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfNoneExist(org.hl7.fhir.String newIfNoneExist) {
		if (newIfNoneExist != ifNoneExist) {
			NotificationChain msgs = null;
			if (ifNoneExist != null)
				msgs = ((InternalEObject)ifNoneExist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_TRANSACTION__IF_NONE_EXIST, null, msgs);
			if (newIfNoneExist != null)
				msgs = ((InternalEObject)newIfNoneExist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.BUNDLE_TRANSACTION__IF_NONE_EXIST, null, msgs);
			msgs = basicSetIfNoneExist(newIfNoneExist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.BUNDLE_TRANSACTION__IF_NONE_EXIST, newIfNoneExist, newIfNoneExist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.BUNDLE_TRANSACTION__METHOD:
				return basicSetMethod(null, msgs);
			case FhirPackage.BUNDLE_TRANSACTION__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.BUNDLE_TRANSACTION__IF_NONE_MATCH:
				return basicSetIfNoneMatch(null, msgs);
			case FhirPackage.BUNDLE_TRANSACTION__IF_MATCH:
				return basicSetIfMatch(null, msgs);
			case FhirPackage.BUNDLE_TRANSACTION__IF_MODIFIED_SINCE:
				return basicSetIfModifiedSince(null, msgs);
			case FhirPackage.BUNDLE_TRANSACTION__IF_NONE_EXIST:
				return basicSetIfNoneExist(null, msgs);
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
			case FhirPackage.BUNDLE_TRANSACTION__METHOD:
				return getMethod();
			case FhirPackage.BUNDLE_TRANSACTION__URL:
				return getUrl();
			case FhirPackage.BUNDLE_TRANSACTION__IF_NONE_MATCH:
				return getIfNoneMatch();
			case FhirPackage.BUNDLE_TRANSACTION__IF_MATCH:
				return getIfMatch();
			case FhirPackage.BUNDLE_TRANSACTION__IF_MODIFIED_SINCE:
				return getIfModifiedSince();
			case FhirPackage.BUNDLE_TRANSACTION__IF_NONE_EXIST:
				return getIfNoneExist();
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
			case FhirPackage.BUNDLE_TRANSACTION__METHOD:
				setMethod((HTTPVerb)newValue);
				return;
			case FhirPackage.BUNDLE_TRANSACTION__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.BUNDLE_TRANSACTION__IF_NONE_MATCH:
				setIfNoneMatch((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.BUNDLE_TRANSACTION__IF_MATCH:
				setIfMatch((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.BUNDLE_TRANSACTION__IF_MODIFIED_SINCE:
				setIfModifiedSince((Instant)newValue);
				return;
			case FhirPackage.BUNDLE_TRANSACTION__IF_NONE_EXIST:
				setIfNoneExist((org.hl7.fhir.String)newValue);
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
			case FhirPackage.BUNDLE_TRANSACTION__METHOD:
				setMethod((HTTPVerb)null);
				return;
			case FhirPackage.BUNDLE_TRANSACTION__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.BUNDLE_TRANSACTION__IF_NONE_MATCH:
				setIfNoneMatch((org.hl7.fhir.String)null);
				return;
			case FhirPackage.BUNDLE_TRANSACTION__IF_MATCH:
				setIfMatch((org.hl7.fhir.String)null);
				return;
			case FhirPackage.BUNDLE_TRANSACTION__IF_MODIFIED_SINCE:
				setIfModifiedSince((Instant)null);
				return;
			case FhirPackage.BUNDLE_TRANSACTION__IF_NONE_EXIST:
				setIfNoneExist((org.hl7.fhir.String)null);
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
			case FhirPackage.BUNDLE_TRANSACTION__METHOD:
				return method != null;
			case FhirPackage.BUNDLE_TRANSACTION__URL:
				return url != null;
			case FhirPackage.BUNDLE_TRANSACTION__IF_NONE_MATCH:
				return ifNoneMatch != null;
			case FhirPackage.BUNDLE_TRANSACTION__IF_MATCH:
				return ifMatch != null;
			case FhirPackage.BUNDLE_TRANSACTION__IF_MODIFIED_SINCE:
				return ifModifiedSince != null;
			case FhirPackage.BUNDLE_TRANSACTION__IF_NONE_EXIST:
				return ifNoneExist != null;
		}
		return super.eIsSet(featureID);
	}

} //BundleTransactionImpl
