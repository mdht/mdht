/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.Code;
import org.hl7.fhir.ContentType;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Id;
import org.hl7.fhir.TestScriptAssert;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Script Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getCompareToSourceId <em>Compare To Source Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getCompareToSourcePath <em>Compare To Source Path</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getHeaderField <em>Header Field</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getMinimumId <em>Minimum Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getNavigationLinks <em>Navigation Links</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getSourceId <em>Source Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getValidateProfileId <em>Validate Profile Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.TestScriptAssertImpl#getWarningOnly <em>Warning Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestScriptAssertImpl extends BackboneElementImpl implements TestScriptAssert {
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
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected AssertionDirectionType direction;

	/**
	 * The cached value of the '{@link #getCompareToSourceId() <em>Compare To Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareToSourceId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String compareToSourceId;

	/**
	 * The cached value of the '{@link #getCompareToSourcePath() <em>Compare To Source Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompareToSourcePath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String compareToSourcePath;

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
	 * The cached value of the '{@link #getHeaderField() <em>Header Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderField()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String headerField;

	/**
	 * The cached value of the '{@link #getMinimumId() <em>Minimum Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String minimumId;

	/**
	 * The cached value of the '{@link #getNavigationLinks() <em>Navigation Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationLinks()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean navigationLinks;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected AssertionOperatorType operator;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String path;

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
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected AssertionResponseTypes response;

	/**
	 * The cached value of the '{@link #getResponseCode() <em>Response Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCode()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String responseCode;

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
	 * The cached value of the '{@link #getValidateProfileId() <em>Validate Profile Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateProfileId()
	 * @generated
	 * @ordered
	 */
	protected Id validateProfileId;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String value;

	/**
	 * The cached value of the '{@link #getWarningOnly() <em>Warning Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningOnly()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean warningOnly;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScriptAssertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getTestScriptAssert();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__LABEL, newLabel, newLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionDirectionType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirection(AssertionDirectionType newDirection, NotificationChain msgs) {
		AssertionDirectionType oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__DIRECTION, oldDirection, newDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(AssertionDirectionType newDirection) {
		if (newDirection != direction) {
			NotificationChain msgs = null;
			if (direction != null)
				msgs = ((InternalEObject)direction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__DIRECTION, null, msgs);
			if (newDirection != null)
				msgs = ((InternalEObject)newDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__DIRECTION, null, msgs);
			msgs = basicSetDirection(newDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__DIRECTION, newDirection, newDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCompareToSourceId() {
		return compareToSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompareToSourceId(org.hl7.fhir.String newCompareToSourceId, NotificationChain msgs) {
		org.hl7.fhir.String oldCompareToSourceId = compareToSourceId;
		compareToSourceId = newCompareToSourceId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_ID, oldCompareToSourceId, newCompareToSourceId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareToSourceId(org.hl7.fhir.String newCompareToSourceId) {
		if (newCompareToSourceId != compareToSourceId) {
			NotificationChain msgs = null;
			if (compareToSourceId != null)
				msgs = ((InternalEObject)compareToSourceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_ID, null, msgs);
			if (newCompareToSourceId != null)
				msgs = ((InternalEObject)newCompareToSourceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_ID, null, msgs);
			msgs = basicSetCompareToSourceId(newCompareToSourceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_ID, newCompareToSourceId, newCompareToSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCompareToSourcePath() {
		return compareToSourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompareToSourcePath(org.hl7.fhir.String newCompareToSourcePath, NotificationChain msgs) {
		org.hl7.fhir.String oldCompareToSourcePath = compareToSourcePath;
		compareToSourcePath = newCompareToSourcePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_PATH, oldCompareToSourcePath, newCompareToSourcePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompareToSourcePath(org.hl7.fhir.String newCompareToSourcePath) {
		if (newCompareToSourcePath != compareToSourcePath) {
			NotificationChain msgs = null;
			if (compareToSourcePath != null)
				msgs = ((InternalEObject)compareToSourcePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_PATH, null, msgs);
			if (newCompareToSourcePath != null)
				msgs = ((InternalEObject)newCompareToSourcePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_PATH, null, msgs);
			msgs = basicSetCompareToSourcePath(newCompareToSourcePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_PATH, newCompareToSourcePath, newCompareToSourcePath));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__CONTENT_TYPE, oldContentType, newContentType);
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
				msgs = ((InternalEObject)contentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__CONTENT_TYPE, null, msgs);
			if (newContentType != null)
				msgs = ((InternalEObject)newContentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__CONTENT_TYPE, null, msgs);
			msgs = basicSetContentType(newContentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__CONTENT_TYPE, newContentType, newContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getHeaderField() {
		return headerField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaderField(org.hl7.fhir.String newHeaderField, NotificationChain msgs) {
		org.hl7.fhir.String oldHeaderField = headerField;
		headerField = newHeaderField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__HEADER_FIELD, oldHeaderField, newHeaderField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderField(org.hl7.fhir.String newHeaderField) {
		if (newHeaderField != headerField) {
			NotificationChain msgs = null;
			if (headerField != null)
				msgs = ((InternalEObject)headerField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__HEADER_FIELD, null, msgs);
			if (newHeaderField != null)
				msgs = ((InternalEObject)newHeaderField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__HEADER_FIELD, null, msgs);
			msgs = basicSetHeaderField(newHeaderField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__HEADER_FIELD, newHeaderField, newHeaderField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getMinimumId() {
		return minimumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimumId(org.hl7.fhir.String newMinimumId, NotificationChain msgs) {
		org.hl7.fhir.String oldMinimumId = minimumId;
		minimumId = newMinimumId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__MINIMUM_ID, oldMinimumId, newMinimumId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumId(org.hl7.fhir.String newMinimumId) {
		if (newMinimumId != minimumId) {
			NotificationChain msgs = null;
			if (minimumId != null)
				msgs = ((InternalEObject)minimumId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__MINIMUM_ID, null, msgs);
			if (newMinimumId != null)
				msgs = ((InternalEObject)newMinimumId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__MINIMUM_ID, null, msgs);
			msgs = basicSetMinimumId(newMinimumId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__MINIMUM_ID, newMinimumId, newMinimumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getNavigationLinks() {
		return navigationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigationLinks(org.hl7.fhir.Boolean newNavigationLinks, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldNavigationLinks = navigationLinks;
		navigationLinks = newNavigationLinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__NAVIGATION_LINKS, oldNavigationLinks, newNavigationLinks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationLinks(org.hl7.fhir.Boolean newNavigationLinks) {
		if (newNavigationLinks != navigationLinks) {
			NotificationChain msgs = null;
			if (navigationLinks != null)
				msgs = ((InternalEObject)navigationLinks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__NAVIGATION_LINKS, null, msgs);
			if (newNavigationLinks != null)
				msgs = ((InternalEObject)newNavigationLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__NAVIGATION_LINKS, null, msgs);
			msgs = basicSetNavigationLinks(newNavigationLinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__NAVIGATION_LINKS, newNavigationLinks, newNavigationLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionOperatorType getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(AssertionOperatorType newOperator, NotificationChain msgs) {
		AssertionOperatorType oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(AssertionOperatorType newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(org.hl7.fhir.String newPath, NotificationChain msgs) {
		org.hl7.fhir.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(org.hl7.fhir.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__PATH, newPath, newPath));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__RESOURCE, oldResource, newResource);
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
				msgs = ((InternalEObject)resource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__RESOURCE, null, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__RESOURCE, null, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionResponseTypes getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponse(AssertionResponseTypes newResponse, NotificationChain msgs) {
		AssertionResponseTypes oldResponse = response;
		response = newResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE, oldResponse, newResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(AssertionResponseTypes newResponse) {
		if (newResponse != response) {
			NotificationChain msgs = null;
			if (response != null)
				msgs = ((InternalEObject)response).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE, null, msgs);
			if (newResponse != null)
				msgs = ((InternalEObject)newResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE, null, msgs);
			msgs = basicSetResponse(newResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE, newResponse, newResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getResponseCode() {
		return responseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseCode(org.hl7.fhir.String newResponseCode, NotificationChain msgs) {
		org.hl7.fhir.String oldResponseCode = responseCode;
		responseCode = newResponseCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE_CODE, oldResponseCode, newResponseCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseCode(org.hl7.fhir.String newResponseCode) {
		if (newResponseCode != responseCode) {
			NotificationChain msgs = null;
			if (responseCode != null)
				msgs = ((InternalEObject)responseCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE_CODE, null, msgs);
			if (newResponseCode != null)
				msgs = ((InternalEObject)newResponseCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE_CODE, null, msgs);
			msgs = basicSetResponseCode(newResponseCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE_CODE, newResponseCode, newResponseCode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__SOURCE_ID, oldSourceId, newSourceId);
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
				msgs = ((InternalEObject)sourceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__SOURCE_ID, null, msgs);
			if (newSourceId != null)
				msgs = ((InternalEObject)newSourceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__SOURCE_ID, null, msgs);
			msgs = basicSetSourceId(newSourceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__SOURCE_ID, newSourceId, newSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getValidateProfileId() {
		return validateProfileId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateProfileId(Id newValidateProfileId, NotificationChain msgs) {
		Id oldValidateProfileId = validateProfileId;
		validateProfileId = newValidateProfileId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__VALIDATE_PROFILE_ID, oldValidateProfileId, newValidateProfileId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateProfileId(Id newValidateProfileId) {
		if (newValidateProfileId != validateProfileId) {
			NotificationChain msgs = null;
			if (validateProfileId != null)
				msgs = ((InternalEObject)validateProfileId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__VALIDATE_PROFILE_ID, null, msgs);
			if (newValidateProfileId != null)
				msgs = ((InternalEObject)newValidateProfileId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__VALIDATE_PROFILE_ID, null, msgs);
			msgs = basicSetValidateProfileId(newValidateProfileId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__VALIDATE_PROFILE_ID, newValidateProfileId, newValidateProfileId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(org.hl7.fhir.String newValue, NotificationChain msgs) {
		org.hl7.fhir.String oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(org.hl7.fhir.String newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getWarningOnly() {
		return warningOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWarningOnly(org.hl7.fhir.Boolean newWarningOnly, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldWarningOnly = warningOnly;
		warningOnly = newWarningOnly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__WARNING_ONLY, oldWarningOnly, newWarningOnly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarningOnly(org.hl7.fhir.Boolean newWarningOnly) {
		if (newWarningOnly != warningOnly) {
			NotificationChain msgs = null;
			if (warningOnly != null)
				msgs = ((InternalEObject)warningOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__WARNING_ONLY, null, msgs);
			if (newWarningOnly != null)
				msgs = ((InternalEObject)newWarningOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.TEST_SCRIPT_ASSERT__WARNING_ONLY, null, msgs);
			msgs = basicSetWarningOnly(newWarningOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.TEST_SCRIPT_ASSERT__WARNING_ONLY, newWarningOnly, newWarningOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.TEST_SCRIPT_ASSERT__LABEL:
				return basicSetLabel(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__DIRECTION:
				return basicSetDirection(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_ID:
				return basicSetCompareToSourceId(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_PATH:
				return basicSetCompareToSourcePath(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__CONTENT_TYPE:
				return basicSetContentType(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__HEADER_FIELD:
				return basicSetHeaderField(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__MINIMUM_ID:
				return basicSetMinimumId(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__NAVIGATION_LINKS:
				return basicSetNavigationLinks(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__OPERATOR:
				return basicSetOperator(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__PATH:
				return basicSetPath(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__RESOURCE:
				return basicSetResource(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE:
				return basicSetResponse(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE_CODE:
				return basicSetResponseCode(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__SOURCE_ID:
				return basicSetSourceId(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__VALIDATE_PROFILE_ID:
				return basicSetValidateProfileId(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__VALUE:
				return basicSetValue(null, msgs);
			case FhirPackage.TEST_SCRIPT_ASSERT__WARNING_ONLY:
				return basicSetWarningOnly(null, msgs);
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
			case FhirPackage.TEST_SCRIPT_ASSERT__LABEL:
				return getLabel();
			case FhirPackage.TEST_SCRIPT_ASSERT__DESCRIPTION:
				return getDescription();
			case FhirPackage.TEST_SCRIPT_ASSERT__DIRECTION:
				return getDirection();
			case FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_ID:
				return getCompareToSourceId();
			case FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_PATH:
				return getCompareToSourcePath();
			case FhirPackage.TEST_SCRIPT_ASSERT__CONTENT_TYPE:
				return getContentType();
			case FhirPackage.TEST_SCRIPT_ASSERT__HEADER_FIELD:
				return getHeaderField();
			case FhirPackage.TEST_SCRIPT_ASSERT__MINIMUM_ID:
				return getMinimumId();
			case FhirPackage.TEST_SCRIPT_ASSERT__NAVIGATION_LINKS:
				return getNavigationLinks();
			case FhirPackage.TEST_SCRIPT_ASSERT__OPERATOR:
				return getOperator();
			case FhirPackage.TEST_SCRIPT_ASSERT__PATH:
				return getPath();
			case FhirPackage.TEST_SCRIPT_ASSERT__RESOURCE:
				return getResource();
			case FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE:
				return getResponse();
			case FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE_CODE:
				return getResponseCode();
			case FhirPackage.TEST_SCRIPT_ASSERT__SOURCE_ID:
				return getSourceId();
			case FhirPackage.TEST_SCRIPT_ASSERT__VALIDATE_PROFILE_ID:
				return getValidateProfileId();
			case FhirPackage.TEST_SCRIPT_ASSERT__VALUE:
				return getValue();
			case FhirPackage.TEST_SCRIPT_ASSERT__WARNING_ONLY:
				return getWarningOnly();
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
			case FhirPackage.TEST_SCRIPT_ASSERT__LABEL:
				setLabel((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__DIRECTION:
				setDirection((AssertionDirectionType)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_ID:
				setCompareToSourceId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_PATH:
				setCompareToSourcePath((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__CONTENT_TYPE:
				setContentType((ContentType)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__HEADER_FIELD:
				setHeaderField((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__MINIMUM_ID:
				setMinimumId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__NAVIGATION_LINKS:
				setNavigationLinks((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__OPERATOR:
				setOperator((AssertionOperatorType)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__PATH:
				setPath((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__RESOURCE:
				setResource((Code)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE:
				setResponse((AssertionResponseTypes)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE_CODE:
				setResponseCode((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__SOURCE_ID:
				setSourceId((Id)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__VALIDATE_PROFILE_ID:
				setValidateProfileId((Id)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__VALUE:
				setValue((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__WARNING_ONLY:
				setWarningOnly((org.hl7.fhir.Boolean)newValue);
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
			case FhirPackage.TEST_SCRIPT_ASSERT__LABEL:
				setLabel((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__DIRECTION:
				setDirection((AssertionDirectionType)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_ID:
				setCompareToSourceId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_PATH:
				setCompareToSourcePath((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__CONTENT_TYPE:
				setContentType((ContentType)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__HEADER_FIELD:
				setHeaderField((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__MINIMUM_ID:
				setMinimumId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__NAVIGATION_LINKS:
				setNavigationLinks((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__OPERATOR:
				setOperator((AssertionOperatorType)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__PATH:
				setPath((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__RESOURCE:
				setResource((Code)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE:
				setResponse((AssertionResponseTypes)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE_CODE:
				setResponseCode((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__SOURCE_ID:
				setSourceId((Id)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__VALIDATE_PROFILE_ID:
				setValidateProfileId((Id)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__VALUE:
				setValue((org.hl7.fhir.String)null);
				return;
			case FhirPackage.TEST_SCRIPT_ASSERT__WARNING_ONLY:
				setWarningOnly((org.hl7.fhir.Boolean)null);
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
			case FhirPackage.TEST_SCRIPT_ASSERT__LABEL:
				return label != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__DESCRIPTION:
				return description != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__DIRECTION:
				return direction != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_ID:
				return compareToSourceId != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__COMPARE_TO_SOURCE_PATH:
				return compareToSourcePath != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__CONTENT_TYPE:
				return contentType != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__HEADER_FIELD:
				return headerField != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__MINIMUM_ID:
				return minimumId != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__NAVIGATION_LINKS:
				return navigationLinks != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__OPERATOR:
				return operator != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__PATH:
				return path != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__RESOURCE:
				return resource != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE:
				return response != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__RESPONSE_CODE:
				return responseCode != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__SOURCE_ID:
				return sourceId != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__VALIDATE_PROFILE_ID:
				return validateProfileId != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__VALUE:
				return value != null;
			case FhirPackage.TEST_SCRIPT_ASSERT__WARNING_ONLY:
				return warningOnly != null;
		}
		return super.eIsSet(featureID);
	}

} //TestScriptAssertImpl
