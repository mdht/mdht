/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.FormatReference;
import org.openhealthtools.mdht.cts2.core.LanguageReference;
import org.openhealthtools.mdht.cts2.core.OpaqueData;
import org.openhealthtools.mdht.cts2.core.TsAnyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.OpaqueDataImpl#getValue <em>Value</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.OpaqueDataImpl#getFormat <em>Format</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.OpaqueDataImpl#getLanguage <em>Language</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.OpaqueDataImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class OpaqueDataImpl extends EObjectImpl implements OpaqueData {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected TsAnyType value;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected FormatReference format;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected LanguageReference language;

	/**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected String schema = SCHEMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OpaqueDataImpl() {
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
		return CorePackage.Literals.OPAQUE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TsAnyType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValue(TsAnyType newValue, NotificationChain msgs) {
		TsAnyType oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.OPAQUE_DATA__VALUE, oldValue, newValue);
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
	public void setValue(TsAnyType newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null) {
				msgs = ((InternalEObject) value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.OPAQUE_DATA__VALUE, null, msgs);
			}
			if (newValue != null) {
				msgs = ((InternalEObject) newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.OPAQUE_DATA__VALUE, null, msgs);
			}
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OPAQUE_DATA__VALUE, newValue, newValue));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FormatReference getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetFormat(FormatReference newFormat, NotificationChain msgs) {
		FormatReference oldFormat = format;
		format = newFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.OPAQUE_DATA__FORMAT, oldFormat, newFormat);
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
	public void setFormat(FormatReference newFormat) {
		if (newFormat != format) {
			NotificationChain msgs = null;
			if (format != null) {
				msgs = ((InternalEObject) format).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.OPAQUE_DATA__FORMAT, null, msgs);
			}
			if (newFormat != null) {
				msgs = ((InternalEObject) newFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.OPAQUE_DATA__FORMAT, null, msgs);
			}
			msgs = basicSetFormat(newFormat, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OPAQUE_DATA__FORMAT, newFormat, newFormat));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LanguageReference getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLanguage(LanguageReference newLanguage, NotificationChain msgs) {
		LanguageReference oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.OPAQUE_DATA__LANGUAGE, oldLanguage, newLanguage);
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
	public void setLanguage(LanguageReference newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null) {
				msgs = ((InternalEObject) language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.OPAQUE_DATA__LANGUAGE, null, msgs);
			}
			if (newLanguage != null) {
				msgs = ((InternalEObject) newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.OPAQUE_DATA__LANGUAGE, null, msgs);
			}
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.OPAQUE_DATA__LANGUAGE, newLanguage, newLanguage));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSchema(String newSchema) {
		String oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OPAQUE_DATA__SCHEMA, oldSchema, schema));
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
			case CorePackage.OPAQUE_DATA__VALUE:
				return basicSetValue(null, msgs);
			case CorePackage.OPAQUE_DATA__FORMAT:
				return basicSetFormat(null, msgs);
			case CorePackage.OPAQUE_DATA__LANGUAGE:
				return basicSetLanguage(null, msgs);
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
			case CorePackage.OPAQUE_DATA__VALUE:
				return getValue();
			case CorePackage.OPAQUE_DATA__FORMAT:
				return getFormat();
			case CorePackage.OPAQUE_DATA__LANGUAGE:
				return getLanguage();
			case CorePackage.OPAQUE_DATA__SCHEMA:
				return getSchema();
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
			case CorePackage.OPAQUE_DATA__VALUE:
				setValue((TsAnyType) newValue);
				return;
			case CorePackage.OPAQUE_DATA__FORMAT:
				setFormat((FormatReference) newValue);
				return;
			case CorePackage.OPAQUE_DATA__LANGUAGE:
				setLanguage((LanguageReference) newValue);
				return;
			case CorePackage.OPAQUE_DATA__SCHEMA:
				setSchema((String) newValue);
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
			case CorePackage.OPAQUE_DATA__VALUE:
				setValue((TsAnyType) null);
				return;
			case CorePackage.OPAQUE_DATA__FORMAT:
				setFormat((FormatReference) null);
				return;
			case CorePackage.OPAQUE_DATA__LANGUAGE:
				setLanguage((LanguageReference) null);
				return;
			case CorePackage.OPAQUE_DATA__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
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
			case CorePackage.OPAQUE_DATA__VALUE:
				return value != null;
			case CorePackage.OPAQUE_DATA__FORMAT:
				return format != null;
			case CorePackage.OPAQUE_DATA__LANGUAGE:
				return language != null;
			case CorePackage.OPAQUE_DATA__SCHEMA:
				return SCHEMA_EDEFAULT == null
						? schema != null
						: !SCHEMA_EDEFAULT.equals(schema);
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
		result.append(" (schema: ");
		result.append(schema);
		result.append(')');
		return result.toString();
	}

} // OpaqueDataImpl
