/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.impl;

import java.math.BigInteger;
import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.ChangeSetBase;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.OpaqueData;
import org.openhealthtools.mdht.cts2.core.SourceReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Set Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeSetBaseImpl#getCreator <em>Creator</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeSetBaseImpl#getChangeInstructions <em>Change Instructions</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeSetBaseImpl#getMember <em>Member</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeSetBaseImpl#getChangeSetURI <em>Change Set URI</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeSetBaseImpl#getCloseDate <em>Close Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeSetBaseImpl#getCreationDate <em>Creation Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeSetBaseImpl#getEntryCount <em>Entry Count</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeSetBaseImpl#getOfficialEffectiveDate <em>Official Effective Date</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ChangeSetBaseImpl extends FinalizableImpl implements ChangeSetBase {
	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected SourceReference creator;

	/**
	 * The cached value of the '{@link #getChangeInstructions() <em>Change Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChangeInstructions()
	 * @generated
	 * @ordered
	 */
	protected OpaqueData changeInstructions;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> member;

	/**
	 * The default value of the '{@link #getChangeSetURI() <em>Change Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChangeSetURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_SET_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeSetURI() <em>Change Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChangeSetURI()
	 * @generated
	 * @ordered
	 */
	protected String changeSetURI = CHANGE_SET_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloseDate() <em>Close Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCloseDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CLOSE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloseDate() <em>Close Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCloseDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar closeDate = CLOSE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryCount() <em>Entry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntryCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ENTRY_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryCount() <em>Entry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntryCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger entryCount = ENTRY_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOfficialEffectiveDate() <em>Official Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOfficialEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar OFFICIAL_EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOfficialEffectiveDate() <em>Official Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOfficialEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar officialEffectiveDate = OFFICIAL_EFFECTIVE_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ChangeSetBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CHANGE_SET_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceReference getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCreator(SourceReference newCreator, NotificationChain msgs) {
		SourceReference oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_SET_BASE__CREATOR, oldCreator, newCreator);
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
	 * 
	 * @generated
	 */
	public void setCreator(SourceReference newCreator) {
		if (newCreator != creator) {
			NotificationChain msgs = null;
			if (creator != null) {
				msgs = ((InternalEObject) creator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGE_SET_BASE__CREATOR, null, msgs);
			}
			if (newCreator != null) {
				msgs = ((InternalEObject) newCreator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGE_SET_BASE__CREATOR, null, msgs);
			}
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_SET_BASE__CREATOR, newCreator, newCreator));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OpaqueData getChangeInstructions() {
		return changeInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetChangeInstructions(OpaqueData newChangeInstructions, NotificationChain msgs) {
		OpaqueData oldChangeInstructions = changeInstructions;
		changeInstructions = newChangeInstructions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS, oldChangeInstructions,
				newChangeInstructions);
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
	 * 
	 * @generated
	 */
	public void setChangeInstructions(OpaqueData newChangeInstructions) {
		if (newChangeInstructions != changeInstructions) {
			NotificationChain msgs = null;
			if (changeInstructions != null) {
				msgs = ((InternalEObject) changeInstructions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS, null, msgs);
			}
			if (newChangeInstructions != null) {
				msgs = ((InternalEObject) newChangeInstructions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS, null, msgs);
			}
			msgs = basicSetChangeInstructions(newChangeInstructions, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS, newChangeInstructions,
				newChangeInstructions));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EObject> getMember() {
		if (member == null) {
			member = new EObjectContainmentEList<EObject>(EObject.class, this, CorePackage.CHANGE_SET_BASE__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getChangeSetURI() {
		return changeSetURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setChangeSetURI(String newChangeSetURI) {
		String oldChangeSetURI = changeSetURI;
		changeSetURI = newChangeSetURI;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_SET_BASE__CHANGE_SET_URI, oldChangeSetURI, changeSetURI));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XMLGregorianCalendar getCloseDate() {
		return closeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCloseDate(XMLGregorianCalendar newCloseDate) {
		XMLGregorianCalendar oldCloseDate = closeDate;
		closeDate = newCloseDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_SET_BASE__CLOSE_DATE, oldCloseDate, closeDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XMLGregorianCalendar getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		XMLGregorianCalendar oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_SET_BASE__CREATION_DATE, oldCreationDate, creationDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger getEntryCount() {
		return entryCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntryCount(BigInteger newEntryCount) {
		BigInteger oldEntryCount = entryCount;
		entryCount = newEntryCount;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_SET_BASE__ENTRY_COUNT, oldEntryCount, entryCount));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XMLGregorianCalendar getOfficialEffectiveDate() {
		return officialEffectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOfficialEffectiveDate(XMLGregorianCalendar newOfficialEffectiveDate) {
		XMLGregorianCalendar oldOfficialEffectiveDate = officialEffectiveDate;
		officialEffectiveDate = newOfficialEffectiveDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_SET_BASE__OFFICIAL_EFFECTIVE_DATE, oldOfficialEffectiveDate,
				officialEffectiveDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CHANGE_SET_BASE__CREATOR:
				return basicSetCreator(null, msgs);
			case CorePackage.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS:
				return basicSetChangeInstructions(null, msgs);
			case CorePackage.CHANGE_SET_BASE__MEMBER:
				return ((InternalEList<?>) getMember()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CHANGE_SET_BASE__CREATOR:
				return getCreator();
			case CorePackage.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS:
				return getChangeInstructions();
			case CorePackage.CHANGE_SET_BASE__MEMBER:
				return getMember();
			case CorePackage.CHANGE_SET_BASE__CHANGE_SET_URI:
				return getChangeSetURI();
			case CorePackage.CHANGE_SET_BASE__CLOSE_DATE:
				return getCloseDate();
			case CorePackage.CHANGE_SET_BASE__CREATION_DATE:
				return getCreationDate();
			case CorePackage.CHANGE_SET_BASE__ENTRY_COUNT:
				return getEntryCount();
			case CorePackage.CHANGE_SET_BASE__OFFICIAL_EFFECTIVE_DATE:
				return getOfficialEffectiveDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.CHANGE_SET_BASE__CREATOR:
				setCreator((SourceReference) newValue);
				return;
			case CorePackage.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS:
				setChangeInstructions((OpaqueData) newValue);
				return;
			case CorePackage.CHANGE_SET_BASE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends EObject>) newValue);
				return;
			case CorePackage.CHANGE_SET_BASE__CHANGE_SET_URI:
				setChangeSetURI((String) newValue);
				return;
			case CorePackage.CHANGE_SET_BASE__CLOSE_DATE:
				setCloseDate((XMLGregorianCalendar) newValue);
				return;
			case CorePackage.CHANGE_SET_BASE__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar) newValue);
				return;
			case CorePackage.CHANGE_SET_BASE__ENTRY_COUNT:
				setEntryCount((BigInteger) newValue);
				return;
			case CorePackage.CHANGE_SET_BASE__OFFICIAL_EFFECTIVE_DATE:
				setOfficialEffectiveDate((XMLGregorianCalendar) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.CHANGE_SET_BASE__CREATOR:
				setCreator((SourceReference) null);
				return;
			case CorePackage.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS:
				setChangeInstructions((OpaqueData) null);
				return;
			case CorePackage.CHANGE_SET_BASE__MEMBER:
				getMember().clear();
				return;
			case CorePackage.CHANGE_SET_BASE__CHANGE_SET_URI:
				setChangeSetURI(CHANGE_SET_URI_EDEFAULT);
				return;
			case CorePackage.CHANGE_SET_BASE__CLOSE_DATE:
				setCloseDate(CLOSE_DATE_EDEFAULT);
				return;
			case CorePackage.CHANGE_SET_BASE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case CorePackage.CHANGE_SET_BASE__ENTRY_COUNT:
				setEntryCount(ENTRY_COUNT_EDEFAULT);
				return;
			case CorePackage.CHANGE_SET_BASE__OFFICIAL_EFFECTIVE_DATE:
				setOfficialEffectiveDate(OFFICIAL_EFFECTIVE_DATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.CHANGE_SET_BASE__CREATOR:
				return creator != null;
			case CorePackage.CHANGE_SET_BASE__CHANGE_INSTRUCTIONS:
				return changeInstructions != null;
			case CorePackage.CHANGE_SET_BASE__MEMBER:
				return member != null && !member.isEmpty();
			case CorePackage.CHANGE_SET_BASE__CHANGE_SET_URI:
				return CHANGE_SET_URI_EDEFAULT == null
						? changeSetURI != null
						: !CHANGE_SET_URI_EDEFAULT.equals(changeSetURI);
			case CorePackage.CHANGE_SET_BASE__CLOSE_DATE:
				return CLOSE_DATE_EDEFAULT == null
						? closeDate != null
						: !CLOSE_DATE_EDEFAULT.equals(closeDate);
			case CorePackage.CHANGE_SET_BASE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null
						? creationDate != null
						: !CREATION_DATE_EDEFAULT.equals(creationDate);
			case CorePackage.CHANGE_SET_BASE__ENTRY_COUNT:
				return ENTRY_COUNT_EDEFAULT == null
						? entryCount != null
						: !ENTRY_COUNT_EDEFAULT.equals(entryCount);
			case CorePackage.CHANGE_SET_BASE__OFFICIAL_EFFECTIVE_DATE:
				return OFFICIAL_EFFECTIVE_DATE_EDEFAULT == null
						? officialEffectiveDate != null
						: !OFFICIAL_EFFECTIVE_DATE_EDEFAULT.equals(officialEffectiveDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (changeSetURI: ");
		result.append(changeSetURI);
		result.append(", closeDate: ");
		result.append(closeDate);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", entryCount: ");
		result.append(entryCount);
		result.append(", officialEffectiveDate: ");
		result.append(officialEffectiveDate);
		result.append(')');
		return result.toString();
	}

} // ChangeSetBaseImpl
