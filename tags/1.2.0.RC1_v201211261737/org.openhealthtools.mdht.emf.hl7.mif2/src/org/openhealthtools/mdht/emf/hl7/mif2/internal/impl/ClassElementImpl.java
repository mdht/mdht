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

import org.openhealthtools.mdht.emf.hl7.mif2.ClassElement;
import org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementRef;
import org.openhealthtools.mdht.emf.hl7.mif2.FlatClass;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassElementImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassElementImpl#getCommonModelElementRef <em>Common Model Element Ref</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassElementImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassElementImpl extends EObjectImpl implements ClassElement {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected FlatClass class_;

	/**
	 * The cached value of the '{@link #getCommonModelElementRef() <em>Common Model Element Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonModelElementRef()
	 * @generated
	 * @ordered
	 */
	protected CommonModelElementRef commonModelElementRef;

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
	protected ClassElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CLASS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatClass getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(FlatClass newClass, NotificationChain msgs) {
		FlatClass oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_ELEMENT__CLASS, oldClass, newClass);
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
	public void setClass(FlatClass newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null) {
				msgs = ((InternalEObject) class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CLASS_ELEMENT__CLASS, null, msgs);
			}
			if (newClass != null) {
				msgs = ((InternalEObject) newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CLASS_ELEMENT__CLASS, null, msgs);
			}
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_ELEMENT__CLASS, newClass, newClass));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonModelElementRef getCommonModelElementRef() {
		return commonModelElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommonModelElementRef(CommonModelElementRef newCommonModelElementRef,
			NotificationChain msgs) {
		CommonModelElementRef oldCommonModelElementRef = commonModelElementRef;
		commonModelElementRef = newCommonModelElementRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_ELEMENT__COMMON_MODEL_ELEMENT_REF, oldCommonModelElementRef,
				newCommonModelElementRef);
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
	public void setCommonModelElementRef(CommonModelElementRef newCommonModelElementRef) {
		if (newCommonModelElementRef != commonModelElementRef) {
			NotificationChain msgs = null;
			if (commonModelElementRef != null) {
				msgs = ((InternalEObject) commonModelElementRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CLASS_ELEMENT__COMMON_MODEL_ELEMENT_REF, null, msgs);
			}
			if (newCommonModelElementRef != null) {
				msgs = ((InternalEObject) newCommonModelElementRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CLASS_ELEMENT__COMMON_MODEL_ELEMENT_REF, null, msgs);
			}
			msgs = basicSetCommonModelElementRef(newCommonModelElementRef, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_ELEMENT__COMMON_MODEL_ELEMENT_REF, newCommonModelElementRef,
				newCommonModelElementRef));
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
				this, Notification.SET, Mif2Package.CLASS_ELEMENT__TEMPLATE_PARAMETER, oldTemplateParameter,
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
						Mif2Package.CLASS_ELEMENT__TEMPLATE_PARAMETER, null, msgs);
			}
			if (newTemplateParameter != null) {
				msgs = ((InternalEObject) newTemplateParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CLASS_ELEMENT__TEMPLATE_PARAMETER, null, msgs);
			}
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_ELEMENT__TEMPLATE_PARAMETER, newTemplateParameter,
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
			case Mif2Package.CLASS_ELEMENT__CLASS:
				return basicSetClass(null, msgs);
			case Mif2Package.CLASS_ELEMENT__COMMON_MODEL_ELEMENT_REF:
				return basicSetCommonModelElementRef(null, msgs);
			case Mif2Package.CLASS_ELEMENT__TEMPLATE_PARAMETER:
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
			case Mif2Package.CLASS_ELEMENT__CLASS:
				return getClass_();
			case Mif2Package.CLASS_ELEMENT__COMMON_MODEL_ELEMENT_REF:
				return getCommonModelElementRef();
			case Mif2Package.CLASS_ELEMENT__TEMPLATE_PARAMETER:
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
			case Mif2Package.CLASS_ELEMENT__CLASS:
				setClass((FlatClass) newValue);
				return;
			case Mif2Package.CLASS_ELEMENT__COMMON_MODEL_ELEMENT_REF:
				setCommonModelElementRef((CommonModelElementRef) newValue);
				return;
			case Mif2Package.CLASS_ELEMENT__TEMPLATE_PARAMETER:
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
			case Mif2Package.CLASS_ELEMENT__CLASS:
				setClass((FlatClass) null);
				return;
			case Mif2Package.CLASS_ELEMENT__COMMON_MODEL_ELEMENT_REF:
				setCommonModelElementRef((CommonModelElementRef) null);
				return;
			case Mif2Package.CLASS_ELEMENT__TEMPLATE_PARAMETER:
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
			case Mif2Package.CLASS_ELEMENT__CLASS:
				return class_ != null;
			case Mif2Package.CLASS_ELEMENT__COMMON_MODEL_ELEMENT_REF:
				return commonModelElementRef != null;
			case Mif2Package.CLASS_ELEMENT__TEMPLATE_PARAMETER:
				return templateParameter != null;
		}
		return super.eIsSet(featureID);
	}

} // ClassElementImpl
