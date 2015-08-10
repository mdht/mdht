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
import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireGroup;
import org.hl7.fhir.QuestionnaireStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireImpl#getTelecom <em>Telecom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireImpl#getSubjectType <em>Subject Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireImpl extends DomainResourceImpl implements Questionnaire {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifier;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected QuestionnaireStatus status;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String publisher;

	/**
	 * The cached value of the '{@link #getTelecom() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecom()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> telecom;

	/**
	 * The cached value of the '{@link #getSubjectType() <em>Subject Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectType()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> subjectType;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected QuestionnaireGroup group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getQuestionnaire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifier() {
		if (identifier == null) {
			identifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.QUESTIONNAIRE__IDENTIFIER);
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(QuestionnaireStatus newStatus, NotificationChain msgs) {
		QuestionnaireStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(QuestionnaireStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(org.hl7.fhir.String newPublisher, NotificationChain msgs) {
		org.hl7.fhir.String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(org.hl7.fhir.String newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getTelecom() {
		if (telecom == null) {
			telecom = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, FhirPackage.QUESTIONNAIRE__TELECOM);
		}
		return telecom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getSubjectType() {
		if (subjectType == null) {
			subjectType = new EObjectContainmentEList<Code>(Code.class, this, FhirPackage.QUESTIONNAIRE__SUBJECT_TYPE);
		}
		return subjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireGroup getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(QuestionnaireGroup newGroup, NotificationChain msgs) {
		QuestionnaireGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(QuestionnaireGroup newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.QUESTIONNAIRE__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.QUESTIONNAIRE__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.QUESTIONNAIRE__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.QUESTIONNAIRE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FhirPackage.QUESTIONNAIRE__TELECOM:
				return ((InternalEList<?>)getTelecom()).basicRemove(otherEnd, msgs);
			case FhirPackage.QUESTIONNAIRE__SUBJECT_TYPE:
				return ((InternalEList<?>)getSubjectType()).basicRemove(otherEnd, msgs);
			case FhirPackage.QUESTIONNAIRE__GROUP:
				return basicSetGroup(null, msgs);
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
			case FhirPackage.QUESTIONNAIRE__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.QUESTIONNAIRE__VERSION:
				return getVersion();
			case FhirPackage.QUESTIONNAIRE__STATUS:
				return getStatus();
			case FhirPackage.QUESTIONNAIRE__DATE:
				return getDate();
			case FhirPackage.QUESTIONNAIRE__PUBLISHER:
				return getPublisher();
			case FhirPackage.QUESTIONNAIRE__TELECOM:
				return getTelecom();
			case FhirPackage.QUESTIONNAIRE__SUBJECT_TYPE:
				return getSubjectType();
			case FhirPackage.QUESTIONNAIRE__GROUP:
				return getGroup();
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
			case FhirPackage.QUESTIONNAIRE__IDENTIFIER:
				getIdentifier().clear();
				getIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE__STATUS:
				setStatus((QuestionnaireStatus)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE__DATE:
				setDate((DateTime)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE__TELECOM:
				getTelecom().clear();
				getTelecom().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE__SUBJECT_TYPE:
				getSubjectType().clear();
				getSubjectType().addAll((Collection<? extends Code>)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE__GROUP:
				setGroup((QuestionnaireGroup)newValue);
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
			case FhirPackage.QUESTIONNAIRE__IDENTIFIER:
				getIdentifier().clear();
				return;
			case FhirPackage.QUESTIONNAIRE__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE__STATUS:
				setStatus((QuestionnaireStatus)null);
				return;
			case FhirPackage.QUESTIONNAIRE__DATE:
				setDate((DateTime)null);
				return;
			case FhirPackage.QUESTIONNAIRE__PUBLISHER:
				setPublisher((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE__TELECOM:
				getTelecom().clear();
				return;
			case FhirPackage.QUESTIONNAIRE__SUBJECT_TYPE:
				getSubjectType().clear();
				return;
			case FhirPackage.QUESTIONNAIRE__GROUP:
				setGroup((QuestionnaireGroup)null);
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
			case FhirPackage.QUESTIONNAIRE__IDENTIFIER:
				return identifier != null && !identifier.isEmpty();
			case FhirPackage.QUESTIONNAIRE__VERSION:
				return version != null;
			case FhirPackage.QUESTIONNAIRE__STATUS:
				return status != null;
			case FhirPackage.QUESTIONNAIRE__DATE:
				return date != null;
			case FhirPackage.QUESTIONNAIRE__PUBLISHER:
				return publisher != null;
			case FhirPackage.QUESTIONNAIRE__TELECOM:
				return telecom != null && !telecom.isEmpty();
			case FhirPackage.QUESTIONNAIRE__SUBJECT_TYPE:
				return subjectType != null && !subjectType.isEmpty();
			case FhirPackage.QUESTIONNAIRE__GROUP:
				return group != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireImpl
