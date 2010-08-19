/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.Contributor;
import org.openhealthtools.mdht.emf.hl7.mif2.KeyedName;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contributor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContributorImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContributorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContributorImpl#getAffiliation <em>Affiliation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContributorImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ContributorImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributorImpl extends EObjectImpl implements Contributor {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Object ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Object role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected KeyedName name;

	/**
	 * The default value of the '{@link #getAffiliation() <em>Affiliation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliation()
	 * @generated
	 * @ordered
	 */
	protected static final String AFFILIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAffiliation() <em>Affiliation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliation()
	 * @generated
	 * @ordered
	 */
	protected String affiliation = AFFILIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONTRIBUTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Object newRole) {
		Object oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTRIBUTOR__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyedName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(KeyedName newName, NotificationChain msgs) {
		KeyedName oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CONTRIBUTOR__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(KeyedName newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTRIBUTOR__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CONTRIBUTOR__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTRIBUTOR__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAffiliation() {
		return affiliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffiliation(String newAffiliation) {
		String oldAffiliation = affiliation;
		affiliation = newAffiliation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTRIBUTOR__AFFILIATION, oldAffiliation, affiliation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTRIBUTOR__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CONTRIBUTOR__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CONTRIBUTOR__NAME:
				return basicSetName(null, msgs);
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
			case Mif2Package.CONTRIBUTOR__ROLE:
				return getRole();
			case Mif2Package.CONTRIBUTOR__NAME:
				return getName();
			case Mif2Package.CONTRIBUTOR__AFFILIATION:
				return getAffiliation();
			case Mif2Package.CONTRIBUTOR__EMAIL:
				return getEmail();
			case Mif2Package.CONTRIBUTOR__NOTES:
				return getNotes();
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
			case Mif2Package.CONTRIBUTOR__ROLE:
				setRole(newValue);
				return;
			case Mif2Package.CONTRIBUTOR__NAME:
				setName((KeyedName)newValue);
				return;
			case Mif2Package.CONTRIBUTOR__AFFILIATION:
				setAffiliation((String)newValue);
				return;
			case Mif2Package.CONTRIBUTOR__EMAIL:
				setEmail((String)newValue);
				return;
			case Mif2Package.CONTRIBUTOR__NOTES:
				setNotes((String)newValue);
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
			case Mif2Package.CONTRIBUTOR__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Mif2Package.CONTRIBUTOR__NAME:
				setName((KeyedName)null);
				return;
			case Mif2Package.CONTRIBUTOR__AFFILIATION:
				setAffiliation(AFFILIATION_EDEFAULT);
				return;
			case Mif2Package.CONTRIBUTOR__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case Mif2Package.CONTRIBUTOR__NOTES:
				setNotes(NOTES_EDEFAULT);
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
			case Mif2Package.CONTRIBUTOR__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case Mif2Package.CONTRIBUTOR__NAME:
				return name != null;
			case Mif2Package.CONTRIBUTOR__AFFILIATION:
				return AFFILIATION_EDEFAULT == null ? affiliation != null : !AFFILIATION_EDEFAULT.equals(affiliation);
			case Mif2Package.CONTRIBUTOR__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case Mif2Package.CONTRIBUTOR__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
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
		result.append(" (role: ");
		result.append(role);
		result.append(", affiliation: ");
		result.append(affiliation);
		result.append(", email: ");
		result.append(email);
		result.append(", notes: ");
		result.append(notes);
		result.append(')');
		return result.toString();
	}

} //ContributorImpl
