/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.profile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.uml2.uml.Namespace;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.CodegenSupport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Codegen Support</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodegenSupportImpl#getBasePackage <em>Base Package</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodegenSupportImpl#getNsPrefix <em>Ns Prefix</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodegenSupportImpl#getNsURI <em>Ns URI</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodegenSupportImpl#getPackageName <em>Package Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodegenSupportImpl#getPrefix <em>Prefix</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodegenSupportImpl#getBase_Namespace <em>Base Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodegenSupportImpl extends EObjectImpl implements CodegenSupport {
	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected String nsPrefix = NS_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected String nsURI = NS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Namespace() <em>Base Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Namespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace base_Namespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodegenSupportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Namespace basicGetBase_Namespace() {
		return base_Namespace;
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
			case CDAPackage.CODEGEN_SUPPORT__BASE_PACKAGE:
				return getBasePackage();
			case CDAPackage.CODEGEN_SUPPORT__NS_PREFIX:
				return getNsPrefix();
			case CDAPackage.CODEGEN_SUPPORT__NS_URI:
				return getNsURI();
			case CDAPackage.CODEGEN_SUPPORT__PACKAGE_NAME:
				return getPackageName();
			case CDAPackage.CODEGEN_SUPPORT__PREFIX:
				return getPrefix();
			case CDAPackage.CODEGEN_SUPPORT__BASE_NAMESPACE:
				if (resolve) {
					return getBase_Namespace();
				}
				return basicGetBase_Namespace();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CDAPackage.CODEGEN_SUPPORT__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null
						? basePackage != null
						: !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case CDAPackage.CODEGEN_SUPPORT__NS_PREFIX:
				return NS_PREFIX_EDEFAULT == null
						? nsPrefix != null
						: !NS_PREFIX_EDEFAULT.equals(nsPrefix);
			case CDAPackage.CODEGEN_SUPPORT__NS_URI:
				return NS_URI_EDEFAULT == null
						? nsURI != null
						: !NS_URI_EDEFAULT.equals(nsURI);
			case CDAPackage.CODEGEN_SUPPORT__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null
						? packageName != null
						: !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case CDAPackage.CODEGEN_SUPPORT__PREFIX:
				return PREFIX_EDEFAULT == null
						? prefix != null
						: !PREFIX_EDEFAULT.equals(prefix);
			case CDAPackage.CODEGEN_SUPPORT__BASE_NAMESPACE:
				return base_Namespace != null;
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDAPackage.CODEGEN_SUPPORT__BASE_PACKAGE:
				setBasePackage((String) newValue);
				return;
			case CDAPackage.CODEGEN_SUPPORT__NS_PREFIX:
				setNsPrefix((String) newValue);
				return;
			case CDAPackage.CODEGEN_SUPPORT__NS_URI:
				setNsURI((String) newValue);
				return;
			case CDAPackage.CODEGEN_SUPPORT__PACKAGE_NAME:
				setPackageName((String) newValue);
				return;
			case CDAPackage.CODEGEN_SUPPORT__PREFIX:
				setPrefix((String) newValue);
				return;
			case CDAPackage.CODEGEN_SUPPORT__BASE_NAMESPACE:
				setBase_Namespace((Namespace) newValue);
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
	protected EClass eStaticClass() {
		return CDAPackage.Literals.CODEGEN_SUPPORT;
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
			case CDAPackage.CODEGEN_SUPPORT__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case CDAPackage.CODEGEN_SUPPORT__NS_PREFIX:
				setNsPrefix(NS_PREFIX_EDEFAULT);
				return;
			case CDAPackage.CODEGEN_SUPPORT__NS_URI:
				setNsURI(NS_URI_EDEFAULT);
				return;
			case CDAPackage.CODEGEN_SUPPORT__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case CDAPackage.CODEGEN_SUPPORT__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case CDAPackage.CODEGEN_SUPPORT__BASE_NAMESPACE:
				setBase_Namespace((Namespace) null);
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
	public Namespace getBase_Namespace() {
		if (base_Namespace != null && base_Namespace.eIsProxy()) {
			InternalEObject oldBase_Namespace = (InternalEObject) base_Namespace;
			base_Namespace = (Namespace) eResolveProxy(oldBase_Namespace);
			if (base_Namespace != oldBase_Namespace) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, CDAPackage.CODEGEN_SUPPORT__BASE_NAMESPACE, oldBase_Namespace,
						base_Namespace));
				}
			}
		}
		return base_Namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNsPrefix() {
		return nsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNsURI() {
		return nsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBase_Namespace(Namespace newBase_Namespace) {
		Namespace oldBase_Namespace = base_Namespace;
		base_Namespace = newBase_Namespace;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CODEGEN_SUPPORT__BASE_NAMESPACE, oldBase_Namespace, base_Namespace));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CODEGEN_SUPPORT__BASE_PACKAGE, oldBasePackage, basePackage));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNsPrefix(String newNsPrefix) {
		String oldNsPrefix = nsPrefix;
		nsPrefix = newNsPrefix;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CODEGEN_SUPPORT__NS_PREFIX, oldNsPrefix, nsPrefix));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNsURI(String newNsURI) {
		String oldNsURI = nsURI;
		nsURI = newNsURI;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CODEGEN_SUPPORT__NS_URI, oldNsURI, nsURI));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CODEGEN_SUPPORT__PACKAGE_NAME, oldPackageName, packageName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CODEGEN_SUPPORT__PREFIX, oldPrefix, prefix));
		}
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
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(", nsPrefix: ");
		result.append(nsPrefix);
		result.append(", nsURI: ");
		result.append(nsURI);
		result.append(", packageName: ");
		result.append(packageName);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

} // CodegenSupportImpl
