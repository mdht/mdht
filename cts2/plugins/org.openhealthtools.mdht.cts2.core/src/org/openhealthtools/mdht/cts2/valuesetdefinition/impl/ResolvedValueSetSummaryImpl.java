/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valuesetdefinition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetSummary;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolved Value Set Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetSummaryImpl#getResolvedHeader <em>Resolved Header</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetSummaryImpl#getResolvedValueSetURI <em>Resolved Value Set URI
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ResolvedValueSetSummaryImpl extends EObjectImpl implements ResolvedValueSetSummary {
	/**
	 * The cached value of the '{@link #getResolvedHeader() <em>Resolved Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResolvedHeader()
	 * @generated
	 * @ordered
	 */
	protected ResolvedValueSetHeader resolvedHeader;

	/**
	 * The default value of the '{@link #getResolvedValueSetURI() <em>Resolved Value Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResolvedValueSetURI()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLVED_VALUE_SET_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolvedValueSetURI() <em>Resolved Value Set URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResolvedValueSetURI()
	 * @generated
	 * @ordered
	 */
	protected String resolvedValueSetURI = RESOLVED_VALUE_SET_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResolvedValueSetSummaryImpl() {
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
		return ValueSetDefinitionPackage.Literals.RESOLVED_VALUE_SET_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSetHeader getResolvedHeader() {
		return resolvedHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResolvedHeader(ResolvedValueSetHeader newResolvedHeader, NotificationChain msgs) {
		ResolvedValueSetHeader oldResolvedHeader = resolvedHeader;
		resolvedHeader = newResolvedHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER,
				oldResolvedHeader, newResolvedHeader);
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
	public void setResolvedHeader(ResolvedValueSetHeader newResolvedHeader) {
		if (newResolvedHeader != resolvedHeader) {
			NotificationChain msgs = null;
			if (resolvedHeader != null) {
				msgs = ((InternalEObject) resolvedHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER, null, msgs);
			}
			if (newResolvedHeader != null) {
				msgs = ((InternalEObject) newResolvedHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER, null, msgs);
			}
			msgs = basicSetResolvedHeader(newResolvedHeader, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER,
				newResolvedHeader, newResolvedHeader));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getResolvedValueSetURI() {
		return resolvedValueSetURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolvedValueSetURI(String newResolvedValueSetURI) {
		String oldResolvedValueSetURI = resolvedValueSetURI;
		resolvedValueSetURI = newResolvedValueSetURI;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_VALUE_SET_URI,
				oldResolvedValueSetURI, resolvedValueSetURI));
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER:
				return basicSetResolvedHeader(null, msgs);
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER:
				return getResolvedHeader();
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_VALUE_SET_URI:
				return getResolvedValueSetURI();
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER:
				setResolvedHeader((ResolvedValueSetHeader) newValue);
				return;
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_VALUE_SET_URI:
				setResolvedValueSetURI((String) newValue);
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER:
				setResolvedHeader((ResolvedValueSetHeader) null);
				return;
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_VALUE_SET_URI:
				setResolvedValueSetURI(RESOLVED_VALUE_SET_URI_EDEFAULT);
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_HEADER:
				return resolvedHeader != null;
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET_SUMMARY__RESOLVED_VALUE_SET_URI:
				return RESOLVED_VALUE_SET_URI_EDEFAULT == null
						? resolvedValueSetURI != null
						: !RESOLVED_VALUE_SET_URI_EDEFAULT.equals(resolvedValueSetURI);
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
		result.append(" (resolvedValueSetURI: ");
		result.append(resolvedValueSetURI);
		result.append(')');
		return result.toString();
	}

} // ResolvedValueSetSummaryImpl
