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

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.emf.hl7.mif2.Legalese;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legalese</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.LegaleseImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.LegaleseImpl#getDisclaimer <em>Disclaimer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.LegaleseImpl#getLicenseTerms <em>License Terms</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.LegaleseImpl#getVersioningPolicy <em>Versioning Policy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.LegaleseImpl#getCopyrightOwner <em>Copyright Owner</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.LegaleseImpl#getCopyrightYears <em>Copyright Years</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LegaleseImpl extends EObjectImpl implements Legalese {
	/**
	 * The cached value of the '{@link #getNotation() <em>Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected Flow notation;

	/**
	 * The cached value of the '{@link #getDisclaimer() <em>Disclaimer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisclaimer()
	 * @generated
	 * @ordered
	 */
	protected Flow disclaimer;

	/**
	 * The cached value of the '{@link #getLicenseTerms() <em>License Terms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseTerms()
	 * @generated
	 * @ordered
	 */
	protected Flow licenseTerms;

	/**
	 * The cached value of the '{@link #getVersioningPolicy() <em>Versioning Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioningPolicy()
	 * @generated
	 * @ordered
	 */
	protected Flow versioningPolicy;

	/**
	 * The default value of the '{@link #getCopyrightOwner() <em>Copyright Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyrightOwner() <em>Copyright Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightOwner()
	 * @generated
	 * @ordered
	 */
	protected String copyrightOwner = COPYRIGHT_OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyrightYears() <em>Copyright Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightYears()
	 * @generated
	 * @ordered
	 */
	protected static final List<BigInteger> COPYRIGHT_YEARS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyrightYears() <em>Copyright Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyrightYears()
	 * @generated
	 * @ordered
	 */
	protected List<BigInteger> copyrightYears = COPYRIGHT_YEARS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegaleseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.LEGALESE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getNotation() {
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotation(Flow newNotation, NotificationChain msgs) {
		Flow oldNotation = notation;
		notation = newNotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.LEGALESE__NOTATION, oldNotation, newNotation);
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
	public void setNotation(Flow newNotation) {
		if (newNotation != notation) {
			NotificationChain msgs = null;
			if (notation != null) {
				msgs = ((InternalEObject) notation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.LEGALESE__NOTATION, null, msgs);
			}
			if (newNotation != null) {
				msgs = ((InternalEObject) newNotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.LEGALESE__NOTATION, null, msgs);
			}
			msgs = basicSetNotation(newNotation, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.LEGALESE__NOTATION, newNotation, newNotation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getDisclaimer() {
		return disclaimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisclaimer(Flow newDisclaimer, NotificationChain msgs) {
		Flow oldDisclaimer = disclaimer;
		disclaimer = newDisclaimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.LEGALESE__DISCLAIMER, oldDisclaimer, newDisclaimer);
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
	public void setDisclaimer(Flow newDisclaimer) {
		if (newDisclaimer != disclaimer) {
			NotificationChain msgs = null;
			if (disclaimer != null) {
				msgs = ((InternalEObject) disclaimer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.LEGALESE__DISCLAIMER, null, msgs);
			}
			if (newDisclaimer != null) {
				msgs = ((InternalEObject) newDisclaimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.LEGALESE__DISCLAIMER, null, msgs);
			}
			msgs = basicSetDisclaimer(newDisclaimer, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.LEGALESE__DISCLAIMER, newDisclaimer, newDisclaimer));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getLicenseTerms() {
		return licenseTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicenseTerms(Flow newLicenseTerms, NotificationChain msgs) {
		Flow oldLicenseTerms = licenseTerms;
		licenseTerms = newLicenseTerms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.LEGALESE__LICENSE_TERMS, oldLicenseTerms, newLicenseTerms);
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
	public void setLicenseTerms(Flow newLicenseTerms) {
		if (newLicenseTerms != licenseTerms) {
			NotificationChain msgs = null;
			if (licenseTerms != null) {
				msgs = ((InternalEObject) licenseTerms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.LEGALESE__LICENSE_TERMS, null, msgs);
			}
			if (newLicenseTerms != null) {
				msgs = ((InternalEObject) newLicenseTerms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.LEGALESE__LICENSE_TERMS, null, msgs);
			}
			msgs = basicSetLicenseTerms(newLicenseTerms, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.LEGALESE__LICENSE_TERMS, newLicenseTerms, newLicenseTerms));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getVersioningPolicy() {
		return versioningPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersioningPolicy(Flow newVersioningPolicy, NotificationChain msgs) {
		Flow oldVersioningPolicy = versioningPolicy;
		versioningPolicy = newVersioningPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.LEGALESE__VERSIONING_POLICY, oldVersioningPolicy,
				newVersioningPolicy);
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
	public void setVersioningPolicy(Flow newVersioningPolicy) {
		if (newVersioningPolicy != versioningPolicy) {
			NotificationChain msgs = null;
			if (versioningPolicy != null) {
				msgs = ((InternalEObject) versioningPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.LEGALESE__VERSIONING_POLICY, null, msgs);
			}
			if (newVersioningPolicy != null) {
				msgs = ((InternalEObject) newVersioningPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.LEGALESE__VERSIONING_POLICY, null, msgs);
			}
			msgs = basicSetVersioningPolicy(newVersioningPolicy, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.LEGALESE__VERSIONING_POLICY, newVersioningPolicy,
				newVersioningPolicy));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyrightOwner() {
		return copyrightOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyrightOwner(String newCopyrightOwner) {
		String oldCopyrightOwner = copyrightOwner;
		copyrightOwner = newCopyrightOwner;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.LEGALESE__COPYRIGHT_OWNER, oldCopyrightOwner, copyrightOwner));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> getCopyrightYears() {
		return copyrightYears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyrightYears(List<BigInteger> newCopyrightYears) {
		List<BigInteger> oldCopyrightYears = copyrightYears;
		copyrightYears = newCopyrightYears;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.LEGALESE__COPYRIGHT_YEARS, oldCopyrightYears, copyrightYears));
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
			case Mif2Package.LEGALESE__NOTATION:
				return basicSetNotation(null, msgs);
			case Mif2Package.LEGALESE__DISCLAIMER:
				return basicSetDisclaimer(null, msgs);
			case Mif2Package.LEGALESE__LICENSE_TERMS:
				return basicSetLicenseTerms(null, msgs);
			case Mif2Package.LEGALESE__VERSIONING_POLICY:
				return basicSetVersioningPolicy(null, msgs);
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
			case Mif2Package.LEGALESE__NOTATION:
				return getNotation();
			case Mif2Package.LEGALESE__DISCLAIMER:
				return getDisclaimer();
			case Mif2Package.LEGALESE__LICENSE_TERMS:
				return getLicenseTerms();
			case Mif2Package.LEGALESE__VERSIONING_POLICY:
				return getVersioningPolicy();
			case Mif2Package.LEGALESE__COPYRIGHT_OWNER:
				return getCopyrightOwner();
			case Mif2Package.LEGALESE__COPYRIGHT_YEARS:
				return getCopyrightYears();
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
			case Mif2Package.LEGALESE__NOTATION:
				setNotation((Flow) newValue);
				return;
			case Mif2Package.LEGALESE__DISCLAIMER:
				setDisclaimer((Flow) newValue);
				return;
			case Mif2Package.LEGALESE__LICENSE_TERMS:
				setLicenseTerms((Flow) newValue);
				return;
			case Mif2Package.LEGALESE__VERSIONING_POLICY:
				setVersioningPolicy((Flow) newValue);
				return;
			case Mif2Package.LEGALESE__COPYRIGHT_OWNER:
				setCopyrightOwner((String) newValue);
				return;
			case Mif2Package.LEGALESE__COPYRIGHT_YEARS:
				setCopyrightYears((List<BigInteger>) newValue);
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
			case Mif2Package.LEGALESE__NOTATION:
				setNotation((Flow) null);
				return;
			case Mif2Package.LEGALESE__DISCLAIMER:
				setDisclaimer((Flow) null);
				return;
			case Mif2Package.LEGALESE__LICENSE_TERMS:
				setLicenseTerms((Flow) null);
				return;
			case Mif2Package.LEGALESE__VERSIONING_POLICY:
				setVersioningPolicy((Flow) null);
				return;
			case Mif2Package.LEGALESE__COPYRIGHT_OWNER:
				setCopyrightOwner(COPYRIGHT_OWNER_EDEFAULT);
				return;
			case Mif2Package.LEGALESE__COPYRIGHT_YEARS:
				setCopyrightYears(COPYRIGHT_YEARS_EDEFAULT);
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
			case Mif2Package.LEGALESE__NOTATION:
				return notation != null;
			case Mif2Package.LEGALESE__DISCLAIMER:
				return disclaimer != null;
			case Mif2Package.LEGALESE__LICENSE_TERMS:
				return licenseTerms != null;
			case Mif2Package.LEGALESE__VERSIONING_POLICY:
				return versioningPolicy != null;
			case Mif2Package.LEGALESE__COPYRIGHT_OWNER:
				return COPYRIGHT_OWNER_EDEFAULT == null
						? copyrightOwner != null
						: !COPYRIGHT_OWNER_EDEFAULT.equals(copyrightOwner);
			case Mif2Package.LEGALESE__COPYRIGHT_YEARS:
				return COPYRIGHT_YEARS_EDEFAULT == null
						? copyrightYears != null
						: !COPYRIGHT_YEARS_EDEFAULT.equals(copyrightYears);
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
		result.append(" (copyrightOwner: ");
		result.append(copyrightOwner);
		result.append(", copyrightYears: ");
		result.append(copyrightYears);
		result.append(')');
		return result.toString();
	}

} // LegaleseImpl
