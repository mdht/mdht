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
import org.hl7.fhir.Coding;
import org.hl7.fhir.ContentType;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.TestScriptOperation;
import org.hl7.fhir.TestScriptRequestHeader;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getAccept <em>Accept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getEncodeRequestUrl <em>Encode Request Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getRequestHeader <em>Request Header</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getResponseId <em>Response Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptOperationImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptOperationImpl extends BackboneElementImpl implements TestScriptOperation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Code resource;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String label;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getAccept() <em>Accept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccept()
	 * @generated
	 * @ordered
	 */
	protected ContentType accept;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected ContentType contentType;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer destination;

	/**
	 * The cached value of the '{@link #getEncodeRequestUrl() <em>Encode Request Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodeRequestUrl()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean encodeRequestUrl;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String params;

	/**
	 * The cached value of the '{@link #getRequestHeader() <em>Request Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<TestScriptRequestHeader> requestHeader;

	/**
	 * The cached value of the '{@link #getResponseId() <em>Response Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseId()
	 * @generated
	 * @ordered
	 */
	protected Id responseId;

	/**
	 * The cached value of the '{@link #getSourceId() <em>Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected Id sourceId;

	/**
	 * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected Id targetId;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String url;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestScriptOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Code newResource, NotificationChain msgs) {
		Code oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Code newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(org.hl7.fhir.String newLabel, NotificationChain msgs) {
		org.hl7.fhir.String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(org.hl7.fhir.String newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType getAccept() {
		return accept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccept(ContentType newAccept, NotificationChain msgs) {
		ContentType oldAccept = accept;
		accept = newAccept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__ACCEPT, oldAccept, newAccept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccept(ContentType newAccept) {
		if (newAccept != accept) {
			NotificationChain msgs = null;
			if (accept != null)
				msgs = ((InternalEObject)accept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__ACCEPT, null, msgs);
			if (newAccept != null)
				msgs = ((InternalEObject)newAccept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__ACCEPT, null, msgs);
			msgs = basicSetAccept(newAccept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__ACCEPT, newAccept, newAccept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentType(ContentType newContentType, NotificationChain msgs) {
		ContentType oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__CONTENT_TYPE, oldContentType, newContentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(ContentType newContentType) {
		if (newContentType != contentType) {
			NotificationChain msgs = null;
			if (contentType != null)
				msgs = ((InternalEObject)contentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__CONTENT_TYPE, null, msgs);
			if (newContentType != null)
				msgs = ((InternalEObject)newContentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__CONTENT_TYPE, null, msgs);
			msgs = basicSetContentType(newContentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__CONTENT_TYPE, newContentType, newContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(org.hl7.fhir.Integer newDestination, NotificationChain msgs) {
		org.hl7.fhir.Integer oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(org.hl7.fhir.Integer newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getEncodeRequestUrl() {
		return encodeRequestUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncodeRequestUrl(org.hl7.fhir.Boolean newEncodeRequestUrl, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldEncodeRequestUrl = encodeRequestUrl;
		encodeRequestUrl = newEncodeRequestUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__ENCODE_REQUEST_URL, oldEncodeRequestUrl, newEncodeRequestUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodeRequestUrl(org.hl7.fhir.Boolean newEncodeRequestUrl) {
		if (newEncodeRequestUrl != encodeRequestUrl) {
			NotificationChain msgs = null;
			if (encodeRequestUrl != null)
				msgs = ((InternalEObject)encodeRequestUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__ENCODE_REQUEST_URL, null, msgs);
			if (newEncodeRequestUrl != null)
				msgs = ((InternalEObject)newEncodeRequestUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__ENCODE_REQUEST_URL, null, msgs);
			msgs = basicSetEncodeRequestUrl(newEncodeRequestUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__ENCODE_REQUEST_URL, newEncodeRequestUrl, newEncodeRequestUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParams(org.hl7.fhir.String newParams, NotificationChain msgs) {
		org.hl7.fhir.String oldParams = params;
		params = newParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__PARAMS, oldParams, newParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(org.hl7.fhir.String newParams) {
		if (newParams != params) {
			NotificationChain msgs = null;
			if (params != null)
				msgs = ((InternalEObject)params).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__PARAMS, null, msgs);
			if (newParams != null)
				msgs = ((InternalEObject)newParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__PARAMS, null, msgs);
			msgs = basicSetParams(newParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__PARAMS, newParams, newParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestScriptRequestHeader> getRequestHeader() {
		if (requestHeader == null) {
			requestHeader = new EObjectContainmentEList<TestScriptRequestHeader>(TestScriptRequestHeader.class, this, FhirPackage.TEST_SCRIPT_OPERATION__REQUEST_HEADER);
		}
		return requestHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getResponseId() {
		return responseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseId(Id newResponseId, NotificationChain msgs) {
		Id oldResponseId = responseId;
		responseId = newResponseId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__RESPONSE_ID, oldResponseId, newResponseId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseId(Id newResponseId) {
		if (newResponseId != responseId) {
			NotificationChain msgs = null;
			if (responseId != null)
				msgs = ((InternalEObject)responseId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__RESPONSE_ID, null, msgs);
			if (newResponseId != null)
				msgs = ((InternalEObject)newResponseId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__RESPONSE_ID, null, msgs);
			msgs = basicSetResponseId(newResponseId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__RESPONSE_ID, newResponseId, newResponseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getSourceId() {
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceId(Id newSourceId, NotificationChain msgs) {
		Id oldSourceId = sourceId;
		sourceId = newSourceId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__SOURCE_ID, oldSourceId, newSourceId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceId(Id newSourceId) {
		if (newSourceId != sourceId) {
			NotificationChain msgs = null;
			if (sourceId != null)
				msgs = ((InternalEObject)sourceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__SOURCE_ID, null, msgs);
			if (newSourceId != null)
				msgs = ((InternalEObject)newSourceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__SOURCE_ID, null, msgs);
			msgs = basicSetSourceId(newSourceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__SOURCE_ID, newSourceId, newSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getTargetId() {
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetId(Id newTargetId, NotificationChain msgs) {
		Id oldTargetId = targetId;
		targetId = newTargetId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__TARGET_ID, oldTargetId, newTargetId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetId(Id newTargetId) {
		if (newTargetId != targetId) {
			NotificationChain msgs = null;
			if (targetId != null)
				msgs = ((InternalEObject)targetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__TARGET_ID, null, msgs);
			if (newTargetId != null)
				msgs = ((InternalEObject)newTargetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__TARGET_ID, null, msgs);
			msgs = basicSetTargetId(newTargetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__TARGET_ID, newTargetId, newTargetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(org.hl7.fhir.String newUrl, NotificationChain msgs) {
		org.hl7.fhir.String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(org.hl7.fhir.String newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_OPERATION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_OPERATION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_OPERATION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__LABEL:
				return basicSetLabel(null, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__ACCEPT:
				return basicSetAccept(null, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__CONTENT_TYPE:
				return basicSetContentType(null, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__DESTINATION:
				return basicSetDestination(null, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__ENCODE_REQUEST_URL:
				return basicSetEncodeRequestUrl(null, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__PARAMS:
				return basicSetParams(null, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__REQUEST_HEADER:
				return ((InternalEList<?>)getRequestHeader()).basicRemove(otherEnd, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__RESPONSE_ID:
				return basicSetResponseId(null, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__SOURCE_ID:
				return basicSetSourceId(null, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__TARGET_ID:
				return basicSetTargetId(null, msgs);
			case FhirPackage.TEST_SCRIPT_OPERATION__URL:
				return basicSetUrl(null, msgs);
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
			case FhirPackage.TEST_SCRIPT_OPERATION__TYPE:
				return getType();
			case FhirPackage.TEST_SCRIPT_OPERATION__RESOURCE:
				return getResource();
			case FhirPackage.TEST_SCRIPT_OPERATION__LABEL:
				return getLabel();
			case FhirPackage.TEST_SCRIPT_OPERATION__DESCRIPTION:
				return getDescription();
			case FhirPackage.TEST_SCRIPT_OPERATION__ACCEPT:
				return getAccept();
			case FhirPackage.TEST_SCRIPT_OPERATION__CONTENT_TYPE:
				return getContentType();
			case FhirPackage.TEST_SCRIPT_OPERATION__DESTINATION:
				return getDestination();
			case FhirPackage.TEST_SCRIPT_OPERATION__ENCODE_REQUEST_URL:
				return getEncodeRequestUrl();
			case FhirPackage.TEST_SCRIPT_OPERATION__PARAMS:
				return getParams();
			case FhirPackage.TEST_SCRIPT_OPERATION__REQUEST_HEADER:
				return getRequestHeader();
			case FhirPackage.TEST_SCRIPT_OPERATION__RESPONSE_ID:
				return getResponseId();
			case FhirPackage.TEST_SCRIPT_OPERATION__SOURCE_ID:
				return getSourceId();
			case FhirPackage.TEST_SCRIPT_OPERATION__TARGET_ID:
				return getTargetId();
			case FhirPackage.TEST_SCRIPT_OPERATION__URL:
				return getUrl();
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
			case FhirPackage.TEST_SCRIPT_OPERATION__TYPE:
				setType((Coding)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__RESOURCE:
				setResource((Code)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__LABEL:
				setLabel((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__ACCEPT:
				setAccept((ContentType)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__CONTENT_TYPE:
				setContentType((ContentType)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__DESTINATION:
				setDestination((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__ENCODE_REQUEST_URL:
				setEncodeRequestUrl((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__PARAMS:
				setParams((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__REQUEST_HEADER:
				getRequestHeader().clear();
				getRequestHeader().addAll((Collection<? extends TestScriptRequestHeader>)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__RESPONSE_ID:
				setResponseId((Id)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__SOURCE_ID:
				setSourceId((Id)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__TARGET_ID:
				setTargetId((Id)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__URL:
				setUrl((org.hl7.fhir.String)newValue);
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
			case FhirPackage.TEST_SCRIPT_OPERATION__TYPE:
				setType((Coding)null);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__RESOURCE:
				setResource((Code)null);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__LABEL:
				setLabel((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__ACCEPT:
				setAccept((ContentType)null);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__CONTENT_TYPE:
				setContentType((ContentType)null);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__DESTINATION:
				setDestination((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__ENCODE_REQUEST_URL:
				setEncodeRequestUrl((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__PARAMS:
				setParams((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__REQUEST_HEADER:
				getRequestHeader().clear();
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__RESPONSE_ID:
				setResponseId((Id)null);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__SOURCE_ID:
				setSourceId((Id)null);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__TARGET_ID:
				setTargetId((Id)null);
				return;
			case FhirPackage.TEST_SCRIPT_OPERATION__URL:
				setUrl((org.hl7.fhir.String)null);
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
			case FhirPackage.TEST_SCRIPT_OPERATION__TYPE:
				return type != null;
			case FhirPackage.TEST_SCRIPT_OPERATION__RESOURCE:
				return resource != null;
			case FhirPackage.TEST_SCRIPT_OPERATION__LABEL:
				return label != null;
			case FhirPackage.TEST_SCRIPT_OPERATION__DESCRIPTION:
				return description != null;
			case FhirPackage.TEST_SCRIPT_OPERATION__ACCEPT:
				return accept != null;
			case FhirPackage.TEST_SCRIPT_OPERATION__CONTENT_TYPE:
				return contentType != null;
			case FhirPackage.TEST_SCRIPT_OPERATION__DESTINATION:
				return destination != null;
			case FhirPackage.TEST_SCRIPT_OPERATION__ENCODE_REQUEST_URL:
				return encodeRequestUrl != null;
			case FhirPackage.TEST_SCRIPT_OPERATION__PARAMS:
				return params != null;
			case FhirPackage.TEST_SCRIPT_OPERATION__REQUEST_HEADER:
				return requestHeader != null && !requestHeader.isEmpty();
			case FhirPackage.TEST_SCRIPT_OPERATION__RESPONSE_ID:
				return responseId != null;
			case FhirPackage.TEST_SCRIPT_OPERATION__SOURCE_ID:
				return sourceId != null;
			case FhirPackage.TEST_SCRIPT_OPERATION__TARGET_ID:
				return targetId != null;
			case FhirPackage.TEST_SCRIPT_OPERATION__URL:
				return url != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptOperationImpl
