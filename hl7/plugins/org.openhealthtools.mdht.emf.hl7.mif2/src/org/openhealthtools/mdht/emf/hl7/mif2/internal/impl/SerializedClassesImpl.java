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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedClass;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedClasses;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedCommonModelElementRef;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serialized Classes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedClassesImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedClassesImpl#getCommonModelElementRef <em>Common Model Element Ref</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedClassesImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerializedClassesImpl extends EObjectImpl implements SerializedClasses {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected SerializedClass class_;

	/**
	 * The cached value of the '{@link #getCommonModelElementRef() <em>Common Model Element Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonModelElementRef()
	 * @generated
	 * @ordered
	 */
	protected SerializedCommonModelElementRef commonModelElementRef;

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected StaticModelClassTemplateParameter templateParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializedClassesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SERIALIZED_CLASSES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedClass getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(SerializedClass newClass, NotificationChain msgs) {
		SerializedClass oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_CLASSES__CLASS, oldClass, newClass);
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
	public void setClass(SerializedClass newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null) {
				msgs = ((InternalEObject) class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_CLASSES__CLASS, null, msgs);
			}
			if (newClass != null) {
				msgs = ((InternalEObject) newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_CLASSES__CLASS, null, msgs);
			}
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_CLASSES__CLASS, newClass, newClass));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedCommonModelElementRef getCommonModelElementRef() {
		return commonModelElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommonModelElementRef(SerializedCommonModelElementRef newCommonModelElementRef,
			NotificationChain msgs) {
		SerializedCommonModelElementRef oldCommonModelElementRef = commonModelElementRef;
		commonModelElementRef = newCommonModelElementRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_CLASSES__COMMON_MODEL_ELEMENT_REF,
				oldCommonModelElementRef, newCommonModelElementRef);
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
	public void setCommonModelElementRef(SerializedCommonModelElementRef newCommonModelElementRef) {
		if (newCommonModelElementRef != commonModelElementRef) {
			NotificationChain msgs = null;
			if (commonModelElementRef != null) {
				msgs = ((InternalEObject) commonModelElementRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_CLASSES__COMMON_MODEL_ELEMENT_REF, null, msgs);
			}
			if (newCommonModelElementRef != null) {
				msgs = ((InternalEObject) newCommonModelElementRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_CLASSES__COMMON_MODEL_ELEMENT_REF, null, msgs);
			}
			msgs = basicSetCommonModelElementRef(newCommonModelElementRef, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_CLASSES__COMMON_MODEL_ELEMENT_REF,
				newCommonModelElementRef, newCommonModelElementRef));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelClassTemplateParameter getTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(StaticModelClassTemplateParameter newTemplateParameter,
			NotificationChain msgs) {
		StaticModelClassTemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_CLASSES__TEMPLATE_PARAMETER, oldTemplateParameter,
				newTemplateParameter);
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
	public void setTemplateParameter(StaticModelClassTemplateParameter newTemplateParameter) {
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null) {
				msgs = ((InternalEObject) templateParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_CLASSES__TEMPLATE_PARAMETER, null, msgs);
			}
			if (newTemplateParameter != null) {
				msgs = ((InternalEObject) newTemplateParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_CLASSES__TEMPLATE_PARAMETER, null, msgs);
			}
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_CLASSES__TEMPLATE_PARAMETER, newTemplateParameter,
				newTemplateParameter));
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
			case Mif2Package.SERIALIZED_CLASSES__CLASS:
				return basicSetClass(null, msgs);
			case Mif2Package.SERIALIZED_CLASSES__COMMON_MODEL_ELEMENT_REF:
				return basicSetCommonModelElementRef(null, msgs);
			case Mif2Package.SERIALIZED_CLASSES__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
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
			case Mif2Package.SERIALIZED_CLASSES__CLASS:
				return getClass_();
			case Mif2Package.SERIALIZED_CLASSES__COMMON_MODEL_ELEMENT_REF:
				return getCommonModelElementRef();
			case Mif2Package.SERIALIZED_CLASSES__TEMPLATE_PARAMETER:
				return getTemplateParameter();
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
			case Mif2Package.SERIALIZED_CLASSES__CLASS:
				setClass((SerializedClass) newValue);
				return;
			case Mif2Package.SERIALIZED_CLASSES__COMMON_MODEL_ELEMENT_REF:
				setCommonModelElementRef((SerializedCommonModelElementRef) newValue);
				return;
			case Mif2Package.SERIALIZED_CLASSES__TEMPLATE_PARAMETER:
				setTemplateParameter((StaticModelClassTemplateParameter) newValue);
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
			case Mif2Package.SERIALIZED_CLASSES__CLASS:
				setClass((SerializedClass) null);
				return;
			case Mif2Package.SERIALIZED_CLASSES__COMMON_MODEL_ELEMENT_REF:
				setCommonModelElementRef((SerializedCommonModelElementRef) null);
				return;
			case Mif2Package.SERIALIZED_CLASSES__TEMPLATE_PARAMETER:
				setTemplateParameter((StaticModelClassTemplateParameter) null);
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
			case Mif2Package.SERIALIZED_CLASSES__CLASS:
				return class_ != null;
			case Mif2Package.SERIALIZED_CLASSES__COMMON_MODEL_ELEMENT_REF:
				return commonModelElementRef != null;
			case Mif2Package.SERIALIZED_CLASSES__TEMPLATE_PARAMETER:
				return templateParameter != null;
		}
		return super.eIsSet(featureID);
	}

} // SerializedClassesImpl
