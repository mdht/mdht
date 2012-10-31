/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.Parameter;
import org.openhealthtools.mdht.cts2.core.RESTResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REST Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.RESTResourceImpl#getResourceRoot <em>Resource Root</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.RESTResourceImpl#getResourceURI <em>Resource URI</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.RESTResourceImpl#getParameter <em>Parameter</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.RESTResourceImpl#getAccessDate <em>Access Date</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RESTResourceImpl extends EObjectImpl implements RESTResource {
	/**
	 * The default value of the '{@link #getResourceRoot() <em>Resource Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResourceRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceRoot() <em>Resource Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResourceRoot()
	 * @generated
	 * @ordered
	 */
	protected String resourceRoot = RESOURCE_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceURI() <em>Resource URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResourceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceURI() <em>Resource URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResourceURI()
	 * @generated
	 * @ordered
	 */
	protected String resourceURI = RESOURCE_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The default value of the '{@link #getAccessDate() <em>Access Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAccessDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ACCESS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessDate() <em>Access Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAccessDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar accessDate = ACCESS_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RESTResourceImpl() {
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
		return CorePackage.Literals.REST_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getResourceRoot() {
		return resourceRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResourceRoot(String newResourceRoot) {
		String oldResourceRoot = resourceRoot;
		resourceRoot = newResourceRoot;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.REST_RESOURCE__RESOURCE_ROOT, oldResourceRoot, resourceRoot));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getResourceURI() {
		return resourceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResourceURI(String newResourceURI) {
		String oldResourceURI = resourceURI;
		resourceURI = newResourceURI;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.REST_RESOURCE__RESOURCE_URI, oldResourceURI, resourceURI));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(
				Parameter.class, this, CorePackage.REST_RESOURCE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XMLGregorianCalendar getAccessDate() {
		return accessDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAccessDate(XMLGregorianCalendar newAccessDate) {
		XMLGregorianCalendar oldAccessDate = accessDate;
		accessDate = newAccessDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.REST_RESOURCE__ACCESS_DATE, oldAccessDate, accessDate));
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
			case CorePackage.REST_RESOURCE__PARAMETER:
				return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
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
			case CorePackage.REST_RESOURCE__RESOURCE_ROOT:
				return getResourceRoot();
			case CorePackage.REST_RESOURCE__RESOURCE_URI:
				return getResourceURI();
			case CorePackage.REST_RESOURCE__PARAMETER:
				return getParameter();
			case CorePackage.REST_RESOURCE__ACCESS_DATE:
				return getAccessDate();
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
			case CorePackage.REST_RESOURCE__RESOURCE_ROOT:
				setResourceRoot((String) newValue);
				return;
			case CorePackage.REST_RESOURCE__RESOURCE_URI:
				setResourceURI((String) newValue);
				return;
			case CorePackage.REST_RESOURCE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>) newValue);
				return;
			case CorePackage.REST_RESOURCE__ACCESS_DATE:
				setAccessDate((XMLGregorianCalendar) newValue);
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
			case CorePackage.REST_RESOURCE__RESOURCE_ROOT:
				setResourceRoot(RESOURCE_ROOT_EDEFAULT);
				return;
			case CorePackage.REST_RESOURCE__RESOURCE_URI:
				setResourceURI(RESOURCE_URI_EDEFAULT);
				return;
			case CorePackage.REST_RESOURCE__PARAMETER:
				getParameter().clear();
				return;
			case CorePackage.REST_RESOURCE__ACCESS_DATE:
				setAccessDate(ACCESS_DATE_EDEFAULT);
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
			case CorePackage.REST_RESOURCE__RESOURCE_ROOT:
				return RESOURCE_ROOT_EDEFAULT == null
						? resourceRoot != null
						: !RESOURCE_ROOT_EDEFAULT.equals(resourceRoot);
			case CorePackage.REST_RESOURCE__RESOURCE_URI:
				return RESOURCE_URI_EDEFAULT == null
						? resourceURI != null
						: !RESOURCE_URI_EDEFAULT.equals(resourceURI);
			case CorePackage.REST_RESOURCE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case CorePackage.REST_RESOURCE__ACCESS_DATE:
				return ACCESS_DATE_EDEFAULT == null
						? accessDate != null
						: !ACCESS_DATE_EDEFAULT.equals(accessDate);
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
		result.append(" (resourceRoot: ");
		result.append(resourceRoot);
		result.append(", resourceURI: ");
		result.append(resourceURI);
		result.append(", accessDate: ");
		result.append(accessDate);
		result.append(')');
		return result.toString();
	}

} // RESTResourceImpl
