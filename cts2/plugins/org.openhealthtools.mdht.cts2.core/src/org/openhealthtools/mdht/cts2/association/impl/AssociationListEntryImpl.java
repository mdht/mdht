/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.association.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.association.AssociationListEntry;
import org.openhealthtools.mdht.cts2.association.AssociationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationListEntryImpl#getHref <em>Href</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationListEntryImpl#getMatchStrength <em>Match Strength</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.impl.AssociationListEntryImpl#getResourceName <em>Resource Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AssociationListEntryImpl extends AssociationImpl implements AssociationListEntry {
	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchStrength() <em>Match Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMatchStrength()
	 * @generated
	 * @ordered
	 */
	protected static final double MATCH_STRENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMatchStrength() <em>Match Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMatchStrength()
	 * @generated
	 * @ordered
	 */
	protected double matchStrength = MATCH_STRENGTH_EDEFAULT;

	/**
	 * This is true if the Match Strength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean matchStrengthESet;

	/**
	 * The default value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected String resourceName = RESOURCE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AssociationListEntryImpl() {
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
		return AssociationPackage.Literals.ASSOCIATION_LIST_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_LIST_ENTRY__HREF, oldHref, href));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getMatchStrength() {
		return matchStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMatchStrength(double newMatchStrength) {
		double oldMatchStrength = matchStrength;
		matchStrength = newMatchStrength;
		boolean oldMatchStrengthESet = matchStrengthESet;
		matchStrengthESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_LIST_ENTRY__MATCH_STRENGTH, oldMatchStrength,
				matchStrength, !oldMatchStrengthESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetMatchStrength() {
		double oldMatchStrength = matchStrength;
		boolean oldMatchStrengthESet = matchStrengthESet;
		matchStrength = MATCH_STRENGTH_EDEFAULT;
		matchStrengthESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, AssociationPackage.ASSOCIATION_LIST_ENTRY__MATCH_STRENGTH, oldMatchStrength,
				MATCH_STRENGTH_EDEFAULT, oldMatchStrengthESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetMatchStrength() {
		return matchStrengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResourceName(String newResourceName) {
		String oldResourceName = resourceName;
		resourceName = newResourceName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, AssociationPackage.ASSOCIATION_LIST_ENTRY__RESOURCE_NAME, oldResourceName,
				resourceName));
		}
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
			case AssociationPackage.ASSOCIATION_LIST_ENTRY__HREF:
				return getHref();
			case AssociationPackage.ASSOCIATION_LIST_ENTRY__MATCH_STRENGTH:
				return getMatchStrength();
			case AssociationPackage.ASSOCIATION_LIST_ENTRY__RESOURCE_NAME:
				return getResourceName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssociationPackage.ASSOCIATION_LIST_ENTRY__HREF:
				setHref((String) newValue);
				return;
			case AssociationPackage.ASSOCIATION_LIST_ENTRY__MATCH_STRENGTH:
				setMatchStrength((Double) newValue);
				return;
			case AssociationPackage.ASSOCIATION_LIST_ENTRY__RESOURCE_NAME:
				setResourceName((String) newValue);
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
			case AssociationPackage.ASSOCIATION_LIST_ENTRY__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case AssociationPackage.ASSOCIATION_LIST_ENTRY__MATCH_STRENGTH:
				unsetMatchStrength();
				return;
			case AssociationPackage.ASSOCIATION_LIST_ENTRY__RESOURCE_NAME:
				setResourceName(RESOURCE_NAME_EDEFAULT);
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
			case AssociationPackage.ASSOCIATION_LIST_ENTRY__HREF:
				return HREF_EDEFAULT == null
						? href != null
						: !HREF_EDEFAULT.equals(href);
			case AssociationPackage.ASSOCIATION_LIST_ENTRY__MATCH_STRENGTH:
				return isSetMatchStrength();
			case AssociationPackage.ASSOCIATION_LIST_ENTRY__RESOURCE_NAME:
				return RESOURCE_NAME_EDEFAULT == null
						? resourceName != null
						: !RESOURCE_NAME_EDEFAULT.equals(resourceName);
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
		result.append(" (href: ");
		result.append(href);
		result.append(", matchStrength: ");
		if (matchStrengthESet) {
			result.append(matchStrength);
		} else {
			result.append("<unset>");
		}
		result.append(", resourceName: ");
		result.append(resourceName);
		result.append(')');
		return result.toString();
	}

} // AssociationListEntryImpl
