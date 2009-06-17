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

import org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference;
import org.openhealthtools.mdht.emf.hl7.mif2.LocalClassReference;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedClass;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedCommonModelElementRef;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Or Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassOrReferenceImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassOrReferenceImpl#getCommonModelElementRef <em>Common Model Element Ref</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassOrReferenceImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassOrReferenceImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassOrReferenceImpl extends EObjectImpl implements ClassOrReference {
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
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected LocalClassReference reference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassOrReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CLASS_OR_REFERENCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_OR_REFERENCE__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CLASS_OR_REFERENCE__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CLASS_OR_REFERENCE__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_OR_REFERENCE__CLASS, newClass, newClass));
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
	public NotificationChain basicSetCommonModelElementRef(SerializedCommonModelElementRef newCommonModelElementRef, NotificationChain msgs) {
		SerializedCommonModelElementRef oldCommonModelElementRef = commonModelElementRef;
		commonModelElementRef = newCommonModelElementRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_OR_REFERENCE__COMMON_MODEL_ELEMENT_REF, oldCommonModelElementRef, newCommonModelElementRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
			if (commonModelElementRef != null)
				msgs = ((InternalEObject)commonModelElementRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CLASS_OR_REFERENCE__COMMON_MODEL_ELEMENT_REF, null, msgs);
			if (newCommonModelElementRef != null)
				msgs = ((InternalEObject)newCommonModelElementRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CLASS_OR_REFERENCE__COMMON_MODEL_ELEMENT_REF, null, msgs);
			msgs = basicSetCommonModelElementRef(newCommonModelElementRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_OR_REFERENCE__COMMON_MODEL_ELEMENT_REF, newCommonModelElementRef, newCommonModelElementRef));
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
	public NotificationChain basicSetTemplateParameter(StaticModelClassTemplateParameter newTemplateParameter, NotificationChain msgs) {
		StaticModelClassTemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_OR_REFERENCE__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
			if (templateParameter != null)
				msgs = ((InternalEObject)templateParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CLASS_OR_REFERENCE__TEMPLATE_PARAMETER, null, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CLASS_OR_REFERENCE__TEMPLATE_PARAMETER, null, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_OR_REFERENCE__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalClassReference getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(LocalClassReference newReference, NotificationChain msgs) {
		LocalClassReference oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_OR_REFERENCE__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(LocalClassReference newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CLASS_OR_REFERENCE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.CLASS_OR_REFERENCE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CLASS_OR_REFERENCE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.CLASS_OR_REFERENCE__CLASS:
				return basicSetClass(null, msgs);
			case Mif2Package.CLASS_OR_REFERENCE__COMMON_MODEL_ELEMENT_REF:
				return basicSetCommonModelElementRef(null, msgs);
			case Mif2Package.CLASS_OR_REFERENCE__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case Mif2Package.CLASS_OR_REFERENCE__REFERENCE:
				return basicSetReference(null, msgs);
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
			case Mif2Package.CLASS_OR_REFERENCE__CLASS:
				return getClass_();
			case Mif2Package.CLASS_OR_REFERENCE__COMMON_MODEL_ELEMENT_REF:
				return getCommonModelElementRef();
			case Mif2Package.CLASS_OR_REFERENCE__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case Mif2Package.CLASS_OR_REFERENCE__REFERENCE:
				return getReference();
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
			case Mif2Package.CLASS_OR_REFERENCE__CLASS:
				setClass((SerializedClass)newValue);
				return;
			case Mif2Package.CLASS_OR_REFERENCE__COMMON_MODEL_ELEMENT_REF:
				setCommonModelElementRef((SerializedCommonModelElementRef)newValue);
				return;
			case Mif2Package.CLASS_OR_REFERENCE__TEMPLATE_PARAMETER:
				setTemplateParameter((StaticModelClassTemplateParameter)newValue);
				return;
			case Mif2Package.CLASS_OR_REFERENCE__REFERENCE:
				setReference((LocalClassReference)newValue);
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
			case Mif2Package.CLASS_OR_REFERENCE__CLASS:
				setClass((SerializedClass)null);
				return;
			case Mif2Package.CLASS_OR_REFERENCE__COMMON_MODEL_ELEMENT_REF:
				setCommonModelElementRef((SerializedCommonModelElementRef)null);
				return;
			case Mif2Package.CLASS_OR_REFERENCE__TEMPLATE_PARAMETER:
				setTemplateParameter((StaticModelClassTemplateParameter)null);
				return;
			case Mif2Package.CLASS_OR_REFERENCE__REFERENCE:
				setReference((LocalClassReference)null);
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
			case Mif2Package.CLASS_OR_REFERENCE__CLASS:
				return class_ != null;
			case Mif2Package.CLASS_OR_REFERENCE__COMMON_MODEL_ELEMENT_REF:
				return commonModelElementRef != null;
			case Mif2Package.CLASS_OR_REFERENCE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case Mif2Package.CLASS_OR_REFERENCE__REFERENCE:
				return reference != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassOrReferenceImpl
