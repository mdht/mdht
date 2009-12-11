/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.BallotCommentResolution;
import org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest;
import org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate;
import org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestStatus;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestImpl#getEstimate <em>Estimate</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestImpl#getChangeRequestId <em>Change Request Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestImpl#getImplementedDate <em>Implemented Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestImpl#getImplementingPersonName <em>Implementing Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestImpl#getTargetDate <em>Target Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeRequestImpl extends BasicAnnotationImpl implements ChangeRequest {
	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected EList<BallotCommentResolution> resolution;

	/**
	 * The cached value of the '{@link #getEstimate() <em>Estimate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimate()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeRequestEstimate> estimate;

	/**
	 * The default value of the '{@link #getChangeRequestId() <em>Change Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeRequestId() <em>Change Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeRequestId()
	 * @generated
	 * @ordered
	 */
	protected String changeRequestId = CHANGE_REQUEST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementedDate() <em>Implemented Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar IMPLEMENTED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementedDate() <em>Implemented Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar implementedDate = IMPLEMENTED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementingPersonName() <em>Implementing Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementingPersonName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTING_PERSON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementingPersonName() <em>Implementing Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementingPersonName()
	 * @generated
	 * @ordered
	 */
	protected String implementingPersonName = IMPLEMENTING_PERSON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeRequestStatus STATUS_EDEFAULT = ChangeRequestStatus.PROPOSED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ChangeRequestStatus status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet;

	/**
	 * The default value of the '{@link #getTargetDate() <em>Target Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TARGET_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDate() <em>Target Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar targetDate = TARGET_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CHANGE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BallotCommentResolution> getResolution() {
		if (resolution == null) {
			resolution = new EObjectContainmentEList<BallotCommentResolution>(BallotCommentResolution.class, this, Mif2Package.CHANGE_REQUEST__RESOLUTION);
		}
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeRequestEstimate> getEstimate() {
		if (estimate == null) {
			estimate = new EObjectContainmentEList<ChangeRequestEstimate>(ChangeRequestEstimate.class, this, Mif2Package.CHANGE_REQUEST__ESTIMATE);
		}
		return estimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChangeRequestId() {
		return changeRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeRequestId(String newChangeRequestId) {
		String oldChangeRequestId = changeRequestId;
		changeRequestId = newChangeRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CHANGE_REQUEST__CHANGE_REQUEST_ID, oldChangeRequestId, changeRequestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getImplementedDate() {
		return implementedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementedDate(XMLGregorianCalendar newImplementedDate) {
		XMLGregorianCalendar oldImplementedDate = implementedDate;
		implementedDate = newImplementedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CHANGE_REQUEST__IMPLEMENTED_DATE, oldImplementedDate, implementedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementingPersonName() {
		return implementingPersonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementingPersonName(String newImplementingPersonName) {
		String oldImplementingPersonName = implementingPersonName;
		implementingPersonName = newImplementingPersonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CHANGE_REQUEST__IMPLEMENTING_PERSON_NAME, oldImplementingPersonName, implementingPersonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CHANGE_REQUEST__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRequestStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ChangeRequestStatus newStatus) {
		ChangeRequestStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CHANGE_REQUEST__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		ChangeRequestStatus oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Mif2Package.CHANGE_REQUEST__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTargetDate() {
		return targetDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDate(XMLGregorianCalendar newTargetDate) {
		XMLGregorianCalendar oldTargetDate = targetDate;
		targetDate = newTargetDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CHANGE_REQUEST__TARGET_DATE, oldTargetDate, targetDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CHANGE_REQUEST__RESOLUTION:
				return ((InternalEList<?>)getResolution()).basicRemove(otherEnd, msgs);
			case Mif2Package.CHANGE_REQUEST__ESTIMATE:
				return ((InternalEList<?>)getEstimate()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CHANGE_REQUEST__RESOLUTION:
				return getResolution();
			case Mif2Package.CHANGE_REQUEST__ESTIMATE:
				return getEstimate();
			case Mif2Package.CHANGE_REQUEST__CHANGE_REQUEST_ID:
				return getChangeRequestId();
			case Mif2Package.CHANGE_REQUEST__IMPLEMENTED_DATE:
				return getImplementedDate();
			case Mif2Package.CHANGE_REQUEST__IMPLEMENTING_PERSON_NAME:
				return getImplementingPersonName();
			case Mif2Package.CHANGE_REQUEST__LOCATION:
				return getLocation();
			case Mif2Package.CHANGE_REQUEST__STATUS:
				return getStatus();
			case Mif2Package.CHANGE_REQUEST__TARGET_DATE:
				return getTargetDate();
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
			case Mif2Package.CHANGE_REQUEST__RESOLUTION:
				getResolution().clear();
				getResolution().addAll((Collection<? extends BallotCommentResolution>)newValue);
				return;
			case Mif2Package.CHANGE_REQUEST__ESTIMATE:
				getEstimate().clear();
				getEstimate().addAll((Collection<? extends ChangeRequestEstimate>)newValue);
				return;
			case Mif2Package.CHANGE_REQUEST__CHANGE_REQUEST_ID:
				setChangeRequestId((String)newValue);
				return;
			case Mif2Package.CHANGE_REQUEST__IMPLEMENTED_DATE:
				setImplementedDate((XMLGregorianCalendar)newValue);
				return;
			case Mif2Package.CHANGE_REQUEST__IMPLEMENTING_PERSON_NAME:
				setImplementingPersonName((String)newValue);
				return;
			case Mif2Package.CHANGE_REQUEST__LOCATION:
				setLocation((String)newValue);
				return;
			case Mif2Package.CHANGE_REQUEST__STATUS:
				setStatus((ChangeRequestStatus)newValue);
				return;
			case Mif2Package.CHANGE_REQUEST__TARGET_DATE:
				setTargetDate((XMLGregorianCalendar)newValue);
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
			case Mif2Package.CHANGE_REQUEST__RESOLUTION:
				getResolution().clear();
				return;
			case Mif2Package.CHANGE_REQUEST__ESTIMATE:
				getEstimate().clear();
				return;
			case Mif2Package.CHANGE_REQUEST__CHANGE_REQUEST_ID:
				setChangeRequestId(CHANGE_REQUEST_ID_EDEFAULT);
				return;
			case Mif2Package.CHANGE_REQUEST__IMPLEMENTED_DATE:
				setImplementedDate(IMPLEMENTED_DATE_EDEFAULT);
				return;
			case Mif2Package.CHANGE_REQUEST__IMPLEMENTING_PERSON_NAME:
				setImplementingPersonName(IMPLEMENTING_PERSON_NAME_EDEFAULT);
				return;
			case Mif2Package.CHANGE_REQUEST__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case Mif2Package.CHANGE_REQUEST__STATUS:
				unsetStatus();
				return;
			case Mif2Package.CHANGE_REQUEST__TARGET_DATE:
				setTargetDate(TARGET_DATE_EDEFAULT);
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
			case Mif2Package.CHANGE_REQUEST__RESOLUTION:
				return resolution != null && !resolution.isEmpty();
			case Mif2Package.CHANGE_REQUEST__ESTIMATE:
				return estimate != null && !estimate.isEmpty();
			case Mif2Package.CHANGE_REQUEST__CHANGE_REQUEST_ID:
				return CHANGE_REQUEST_ID_EDEFAULT == null ? changeRequestId != null : !CHANGE_REQUEST_ID_EDEFAULT.equals(changeRequestId);
			case Mif2Package.CHANGE_REQUEST__IMPLEMENTED_DATE:
				return IMPLEMENTED_DATE_EDEFAULT == null ? implementedDate != null : !IMPLEMENTED_DATE_EDEFAULT.equals(implementedDate);
			case Mif2Package.CHANGE_REQUEST__IMPLEMENTING_PERSON_NAME:
				return IMPLEMENTING_PERSON_NAME_EDEFAULT == null ? implementingPersonName != null : !IMPLEMENTING_PERSON_NAME_EDEFAULT.equals(implementingPersonName);
			case Mif2Package.CHANGE_REQUEST__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case Mif2Package.CHANGE_REQUEST__STATUS:
				return isSetStatus();
			case Mif2Package.CHANGE_REQUEST__TARGET_DATE:
				return TARGET_DATE_EDEFAULT == null ? targetDate != null : !TARGET_DATE_EDEFAULT.equals(targetDate);
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
		result.append(" (changeRequestId: ");
		result.append(changeRequestId);
		result.append(", implementedDate: ");
		result.append(implementedDate);
		result.append(", implementingPersonName: ");
		result.append(implementingPersonName);
		result.append(", location: ");
		result.append(location);
		result.append(", status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(", targetDate: ");
		result.append(targetDate);
		result.append(')');
		return result.toString();
	}

} //ChangeRequestImpl
