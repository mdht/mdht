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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HistoryItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HistoryItemImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HistoryItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HistoryItemImpl#isIsBackwardCompatibleChange <em>Is Backward Compatible Change</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HistoryItemImpl#isIsSubstantiveChange <em>Is Substantive Change</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.HistoryItemImpl#getResponsiblePersonName <em>Responsible Person Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryItemImpl extends EObjectImpl implements HistoryItem {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Flow description;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateTime = DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsBackwardCompatibleChange() <em>Is Backward Compatible Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBackwardCompatibleChange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BACKWARD_COMPATIBLE_CHANGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBackwardCompatibleChange() <em>Is Backward Compatible Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBackwardCompatibleChange()
	 * @generated
	 * @ordered
	 */
	protected boolean isBackwardCompatibleChange = IS_BACKWARD_COMPATIBLE_CHANGE_EDEFAULT;

	/**
	 * This is true if the Is Backward Compatible Change attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isBackwardCompatibleChangeESet;

	/**
	 * The default value of the '{@link #isIsSubstantiveChange() <em>Is Substantive Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubstantiveChange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBSTANTIVE_CHANGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSubstantiveChange() <em>Is Substantive Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubstantiveChange()
	 * @generated
	 * @ordered
	 */
	protected boolean isSubstantiveChange = IS_SUBSTANTIVE_CHANGE_EDEFAULT;

	/**
	 * This is true if the Is Substantive Change attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSubstantiveChangeESet;

	/**
	 * The default value of the '{@link #getResponsiblePersonName() <em>Responsible Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePersonName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBLE_PERSON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsiblePersonName() <em>Responsible Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePersonName()
	 * @generated
	 * @ordered
	 */
	protected String responsiblePersonName = RESPONSIBLE_PERSON_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.HISTORY_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Flow newDescription, NotificationChain msgs) {
		Flow oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.HISTORY_ITEM__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(Flow newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null) {
				msgs = ((InternalEObject) description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.HISTORY_ITEM__DESCRIPTION, null, msgs);
			}
			if (newDescription != null) {
				msgs = ((InternalEObject) newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.HISTORY_ITEM__DESCRIPTION, null, msgs);
			}
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.HISTORY_ITEM__DESCRIPTION, newDescription, newDescription));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(XMLGregorianCalendar newDateTime) {
		XMLGregorianCalendar oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.HISTORY_ITEM__DATE_TIME, oldDateTime, dateTime));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.HISTORY_ITEM__ID, oldId, id));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBackwardCompatibleChange() {
		return isBackwardCompatibleChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBackwardCompatibleChange(boolean newIsBackwardCompatibleChange) {
		boolean oldIsBackwardCompatibleChange = isBackwardCompatibleChange;
		isBackwardCompatibleChange = newIsBackwardCompatibleChange;
		boolean oldIsBackwardCompatibleChangeESet = isBackwardCompatibleChangeESet;
		isBackwardCompatibleChangeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.HISTORY_ITEM__IS_BACKWARD_COMPATIBLE_CHANGE,
				oldIsBackwardCompatibleChange, isBackwardCompatibleChange, !oldIsBackwardCompatibleChangeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsBackwardCompatibleChange() {
		boolean oldIsBackwardCompatibleChange = isBackwardCompatibleChange;
		boolean oldIsBackwardCompatibleChangeESet = isBackwardCompatibleChangeESet;
		isBackwardCompatibleChange = IS_BACKWARD_COMPATIBLE_CHANGE_EDEFAULT;
		isBackwardCompatibleChangeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.HISTORY_ITEM__IS_BACKWARD_COMPATIBLE_CHANGE,
				oldIsBackwardCompatibleChange, IS_BACKWARD_COMPATIBLE_CHANGE_EDEFAULT,
				oldIsBackwardCompatibleChangeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsBackwardCompatibleChange() {
		return isBackwardCompatibleChangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSubstantiveChange() {
		return isSubstantiveChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubstantiveChange(boolean newIsSubstantiveChange) {
		boolean oldIsSubstantiveChange = isSubstantiveChange;
		isSubstantiveChange = newIsSubstantiveChange;
		boolean oldIsSubstantiveChangeESet = isSubstantiveChangeESet;
		isSubstantiveChangeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.HISTORY_ITEM__IS_SUBSTANTIVE_CHANGE, oldIsSubstantiveChange,
				isSubstantiveChange, !oldIsSubstantiveChangeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSubstantiveChange() {
		boolean oldIsSubstantiveChange = isSubstantiveChange;
		boolean oldIsSubstantiveChangeESet = isSubstantiveChangeESet;
		isSubstantiveChange = IS_SUBSTANTIVE_CHANGE_EDEFAULT;
		isSubstantiveChangeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.HISTORY_ITEM__IS_SUBSTANTIVE_CHANGE, oldIsSubstantiveChange,
				IS_SUBSTANTIVE_CHANGE_EDEFAULT, oldIsSubstantiveChangeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSubstantiveChange() {
		return isSubstantiveChangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsiblePersonName() {
		return responsiblePersonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsiblePersonName(String newResponsiblePersonName) {
		String oldResponsiblePersonName = responsiblePersonName;
		responsiblePersonName = newResponsiblePersonName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.HISTORY_ITEM__RESPONSIBLE_PERSON_NAME, oldResponsiblePersonName,
				responsiblePersonName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.HISTORY_ITEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case Mif2Package.HISTORY_ITEM__DESCRIPTION:
				return getDescription();
			case Mif2Package.HISTORY_ITEM__DATE_TIME:
				return getDateTime();
			case Mif2Package.HISTORY_ITEM__ID:
				return getId();
			case Mif2Package.HISTORY_ITEM__IS_BACKWARD_COMPATIBLE_CHANGE:
				return isIsBackwardCompatibleChange()
						? Boolean.TRUE
						: Boolean.FALSE;
			case Mif2Package.HISTORY_ITEM__IS_SUBSTANTIVE_CHANGE:
				return isIsSubstantiveChange()
						? Boolean.TRUE
						: Boolean.FALSE;
			case Mif2Package.HISTORY_ITEM__RESPONSIBLE_PERSON_NAME:
				return getResponsiblePersonName();
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
			case Mif2Package.HISTORY_ITEM__DESCRIPTION:
				setDescription((Flow) newValue);
				return;
			case Mif2Package.HISTORY_ITEM__DATE_TIME:
				setDateTime((XMLGregorianCalendar) newValue);
				return;
			case Mif2Package.HISTORY_ITEM__ID:
				setId((String) newValue);
				return;
			case Mif2Package.HISTORY_ITEM__IS_BACKWARD_COMPATIBLE_CHANGE:
				setIsBackwardCompatibleChange(((Boolean) newValue).booleanValue());
				return;
			case Mif2Package.HISTORY_ITEM__IS_SUBSTANTIVE_CHANGE:
				setIsSubstantiveChange(((Boolean) newValue).booleanValue());
				return;
			case Mif2Package.HISTORY_ITEM__RESPONSIBLE_PERSON_NAME:
				setResponsiblePersonName((String) newValue);
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
			case Mif2Package.HISTORY_ITEM__DESCRIPTION:
				setDescription((Flow) null);
				return;
			case Mif2Package.HISTORY_ITEM__DATE_TIME:
				setDateTime(DATE_TIME_EDEFAULT);
				return;
			case Mif2Package.HISTORY_ITEM__ID:
				setId(ID_EDEFAULT);
				return;
			case Mif2Package.HISTORY_ITEM__IS_BACKWARD_COMPATIBLE_CHANGE:
				unsetIsBackwardCompatibleChange();
				return;
			case Mif2Package.HISTORY_ITEM__IS_SUBSTANTIVE_CHANGE:
				unsetIsSubstantiveChange();
				return;
			case Mif2Package.HISTORY_ITEM__RESPONSIBLE_PERSON_NAME:
				setResponsiblePersonName(RESPONSIBLE_PERSON_NAME_EDEFAULT);
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
			case Mif2Package.HISTORY_ITEM__DESCRIPTION:
				return description != null;
			case Mif2Package.HISTORY_ITEM__DATE_TIME:
				return DATE_TIME_EDEFAULT == null
						? dateTime != null
						: !DATE_TIME_EDEFAULT.equals(dateTime);
			case Mif2Package.HISTORY_ITEM__ID:
				return ID_EDEFAULT == null
						? id != null
						: !ID_EDEFAULT.equals(id);
			case Mif2Package.HISTORY_ITEM__IS_BACKWARD_COMPATIBLE_CHANGE:
				return isSetIsBackwardCompatibleChange();
			case Mif2Package.HISTORY_ITEM__IS_SUBSTANTIVE_CHANGE:
				return isSetIsSubstantiveChange();
			case Mif2Package.HISTORY_ITEM__RESPONSIBLE_PERSON_NAME:
				return RESPONSIBLE_PERSON_NAME_EDEFAULT == null
						? responsiblePersonName != null
						: !RESPONSIBLE_PERSON_NAME_EDEFAULT.equals(responsiblePersonName);
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
		result.append(" (dateTime: ");
		result.append(dateTime);
		result.append(", id: ");
		result.append(id);
		result.append(", isBackwardCompatibleChange: ");
		if (isBackwardCompatibleChangeESet) {
			result.append(isBackwardCompatibleChange);
		} else {
			result.append("<unset>");
		}
		result.append(", isSubstantiveChange: ");
		if (isSubstantiveChangeESet) {
			result.append(isSubstantiveChange);
		} else {
			result.append("<unset>");
		}
		result.append(", responsiblePersonName: ");
		result.append(responsiblePersonName);
		result.append(')');
		return result.toString();
	}

} // HistoryItemImpl
