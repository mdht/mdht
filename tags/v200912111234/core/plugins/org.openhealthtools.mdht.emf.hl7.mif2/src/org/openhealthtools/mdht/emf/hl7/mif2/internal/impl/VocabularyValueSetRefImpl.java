/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyValueSetRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary Value Set Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyValueSetRefImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyValueSetRefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyValueSetRefImpl#getVersionDate <em>Version Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.VocabularyValueSetRefImpl#getVersionTime <em>Version Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocabularyValueSetRefImpl extends EObjectImpl implements VocabularyValueSetRef {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionDate() <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VERSION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionDate() <em>Version Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar versionDate = VERSION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionTime() <em>Version Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VERSION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionTime() <em>Version Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar versionTime = VERSION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyValueSetRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.VOCABULARY_VALUE_SET_REF;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.VOCABULARY_VALUE_SET_REF__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.VOCABULARY_VALUE_SET_REF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getVersionDate() {
		return versionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionDate(XMLGregorianCalendar newVersionDate) {
		XMLGregorianCalendar oldVersionDate = versionDate;
		versionDate = newVersionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.VOCABULARY_VALUE_SET_REF__VERSION_DATE, oldVersionDate, versionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getVersionTime() {
		return versionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionTime(XMLGregorianCalendar newVersionTime) {
		XMLGregorianCalendar oldVersionTime = versionTime;
		versionTime = newVersionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.VOCABULARY_VALUE_SET_REF__VERSION_TIME, oldVersionTime, versionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.VOCABULARY_VALUE_SET_REF__ID:
				return getId();
			case Mif2Package.VOCABULARY_VALUE_SET_REF__NAME:
				return getName();
			case Mif2Package.VOCABULARY_VALUE_SET_REF__VERSION_DATE:
				return getVersionDate();
			case Mif2Package.VOCABULARY_VALUE_SET_REF__VERSION_TIME:
				return getVersionTime();
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
			case Mif2Package.VOCABULARY_VALUE_SET_REF__ID:
				setId((String)newValue);
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_REF__NAME:
				setName((String)newValue);
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_REF__VERSION_DATE:
				setVersionDate((XMLGregorianCalendar)newValue);
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_REF__VERSION_TIME:
				setVersionTime((XMLGregorianCalendar)newValue);
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
			case Mif2Package.VOCABULARY_VALUE_SET_REF__ID:
				setId(ID_EDEFAULT);
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_REF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_REF__VERSION_DATE:
				setVersionDate(VERSION_DATE_EDEFAULT);
				return;
			case Mif2Package.VOCABULARY_VALUE_SET_REF__VERSION_TIME:
				setVersionTime(VERSION_TIME_EDEFAULT);
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
			case Mif2Package.VOCABULARY_VALUE_SET_REF__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Mif2Package.VOCABULARY_VALUE_SET_REF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Mif2Package.VOCABULARY_VALUE_SET_REF__VERSION_DATE:
				return VERSION_DATE_EDEFAULT == null ? versionDate != null : !VERSION_DATE_EDEFAULT.equals(versionDate);
			case Mif2Package.VOCABULARY_VALUE_SET_REF__VERSION_TIME:
				return VERSION_TIME_EDEFAULT == null ? versionTime != null : !VERSION_TIME_EDEFAULT.equals(versionTime);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", versionDate: ");
		result.append(versionDate);
		result.append(", versionTime: ");
		result.append(versionTime);
		result.append(')');
		return result.toString();
	}

} //VocabularyValueSetRefImpl
