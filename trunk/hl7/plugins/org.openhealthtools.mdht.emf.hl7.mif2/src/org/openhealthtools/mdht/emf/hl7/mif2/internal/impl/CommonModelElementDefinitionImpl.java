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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.CMETEntryKind;
import org.openhealthtools.mdht.emf.hl7.mif2.CommonModelElementDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.SpecializationClass;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelClassTemplateParameter;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelInterfaceAnnotations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Model Element Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CommonModelElementDefinitionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CommonModelElementDefinitionImpl#getBoundStaticModel <em>Bound Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CommonModelElementDefinitionImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CommonModelElementDefinitionImpl#getEntryClass <em>Entry Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CommonModelElementDefinitionImpl#getAttributionLevel <em>Attribution Level</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CommonModelElementDefinitionImpl#getEntryKind <em>Entry Kind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CommonModelElementDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CommonModelElementDefinitionImpl#getOtherClassName <em>Other Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommonModelElementDefinitionImpl extends ClassifierBaseImpl implements CommonModelElementDefinition {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected StaticModelInterfaceAnnotations annotations;

	/**
	 * The cached value of the '{@link #getBoundStaticModel() <em>Bound Static Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundStaticModel()
	 * @generated
	 * @ordered
	 */
	protected PackageRef boundStaticModel;

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticModelClassTemplateParameter> templateParameter;

	/**
	 * The cached value of the '{@link #getEntryClass() <em>Entry Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryClass()
	 * @generated
	 * @ordered
	 */
	protected SpecializationClass entryClass;

	/**
	 * The default value of the '{@link #getAttributionLevel() <em>Attribution Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Object ATTRIBUTION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributionLevel() <em>Attribution Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributionLevel()
	 * @generated
	 * @ordered
	 */
	protected Object attributionLevel = ATTRIBUTION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryKind() <em>Entry Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryKind()
	 * @generated
	 * @ordered
	 */
	protected static final CMETEntryKind ENTRY_KIND_EDEFAULT = CMETEntryKind.ACT;

	/**
	 * The cached value of the '{@link #getEntryKind() <em>Entry Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryKind()
	 * @generated
	 * @ordered
	 */
	protected CMETEntryKind entryKind = ENTRY_KIND_EDEFAULT;

	/**
	 * This is true if the Entry Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean entryKindESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherClassName() <em>Other Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherClassName() <em>Other Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherClassName()
	 * @generated
	 * @ordered
	 */
	protected String otherClassName = OTHER_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonModelElementDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.COMMON_MODEL_ELEMENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticModelInterfaceAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(StaticModelInterfaceAnnotations newAnnotations, NotificationChain msgs) {
		StaticModelInterfaceAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ANNOTATIONS, oldAnnotations,
				newAnnotations);
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
	public void setAnnotations(StaticModelInterfaceAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ANNOTATIONS, newAnnotations,
				newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getBoundStaticModel() {
		return boundStaticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundStaticModel(PackageRef newBoundStaticModel, NotificationChain msgs) {
		PackageRef oldBoundStaticModel = boundStaticModel;
		boundStaticModel = newBoundStaticModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__BOUND_STATIC_MODEL,
				oldBoundStaticModel, newBoundStaticModel);
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
	public void setBoundStaticModel(PackageRef newBoundStaticModel) {
		if (newBoundStaticModel != boundStaticModel) {
			NotificationChain msgs = null;
			if (boundStaticModel != null) {
				msgs = ((InternalEObject) boundStaticModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__BOUND_STATIC_MODEL, null, msgs);
			}
			if (newBoundStaticModel != null) {
				msgs = ((InternalEObject) newBoundStaticModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__BOUND_STATIC_MODEL, null, msgs);
			}
			msgs = basicSetBoundStaticModel(newBoundStaticModel, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__BOUND_STATIC_MODEL,
				newBoundStaticModel, newBoundStaticModel));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaticModelClassTemplateParameter> getTemplateParameter() {
		if (templateParameter == null) {
			templateParameter = new EObjectContainmentEList<StaticModelClassTemplateParameter>(
				StaticModelClassTemplateParameter.class, this,
				Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__TEMPLATE_PARAMETER);
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializationClass getEntryClass() {
		return entryClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryClass(SpecializationClass newEntryClass, NotificationChain msgs) {
		SpecializationClass oldEntryClass = entryClass;
		entryClass = newEntryClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_CLASS, oldEntryClass,
				newEntryClass);
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
	public void setEntryClass(SpecializationClass newEntryClass) {
		if (newEntryClass != entryClass) {
			NotificationChain msgs = null;
			if (entryClass != null) {
				msgs = ((InternalEObject) entryClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_CLASS, null, msgs);
			}
			if (newEntryClass != null) {
				msgs = ((InternalEObject) newEntryClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_CLASS, null, msgs);
			}
			msgs = basicSetEntryClass(newEntryClass, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_CLASS, newEntryClass,
				newEntryClass));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAttributionLevel() {
		return attributionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributionLevel(Object newAttributionLevel) {
		Object oldAttributionLevel = attributionLevel;
		attributionLevel = newAttributionLevel;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ATTRIBUTION_LEVEL,
				oldAttributionLevel, attributionLevel));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMETEntryKind getEntryKind() {
		return entryKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryKind(CMETEntryKind newEntryKind) {
		CMETEntryKind oldEntryKind = entryKind;
		entryKind = newEntryKind == null
				? ENTRY_KIND_EDEFAULT
				: newEntryKind;
		boolean oldEntryKindESet = entryKindESet;
		entryKindESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_KIND, oldEntryKind,
				entryKind, !oldEntryKindESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEntryKind() {
		CMETEntryKind oldEntryKind = entryKind;
		boolean oldEntryKindESet = entryKindESet;
		entryKind = ENTRY_KIND_EDEFAULT;
		entryKindESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_KIND, oldEntryKind,
				ENTRY_KIND_EDEFAULT, oldEntryKindESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEntryKind() {
		return entryKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherClassName() {
		return otherClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherClassName(String newOtherClassName) {
		String oldOtherClassName = otherClassName;
		otherClassName = newOtherClassName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__OTHER_CLASS_NAME,
				oldOtherClassName, otherClassName));
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
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__BOUND_STATIC_MODEL:
				return basicSetBoundStaticModel(null, msgs);
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__TEMPLATE_PARAMETER:
				return ((InternalEList<?>) getTemplateParameter()).basicRemove(otherEnd, msgs);
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_CLASS:
				return basicSetEntryClass(null, msgs);
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
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__BOUND_STATIC_MODEL:
				return getBoundStaticModel();
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__TEMPLATE_PARAMETER:
				return getTemplateParameter();
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_CLASS:
				return getEntryClass();
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ATTRIBUTION_LEVEL:
				return getAttributionLevel();
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_KIND:
				return getEntryKind();
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__NAME:
				return getName();
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__OTHER_CLASS_NAME:
				return getOtherClassName();
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
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ANNOTATIONS:
				setAnnotations((StaticModelInterfaceAnnotations) newValue);
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__BOUND_STATIC_MODEL:
				setBoundStaticModel((PackageRef) newValue);
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				getTemplateParameter().addAll((Collection<? extends StaticModelClassTemplateParameter>) newValue);
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_CLASS:
				setEntryClass((SpecializationClass) newValue);
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ATTRIBUTION_LEVEL:
				setAttributionLevel(newValue);
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_KIND:
				setEntryKind((CMETEntryKind) newValue);
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__NAME:
				setName((String) newValue);
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__OTHER_CLASS_NAME:
				setOtherClassName((String) newValue);
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
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ANNOTATIONS:
				setAnnotations((StaticModelInterfaceAnnotations) null);
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__BOUND_STATIC_MODEL:
				setBoundStaticModel((PackageRef) null);
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__TEMPLATE_PARAMETER:
				getTemplateParameter().clear();
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_CLASS:
				setEntryClass((SpecializationClass) null);
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ATTRIBUTION_LEVEL:
				setAttributionLevel(ATTRIBUTION_LEVEL_EDEFAULT);
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_KIND:
				unsetEntryKind();
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__OTHER_CLASS_NAME:
				setOtherClassName(OTHER_CLASS_NAME_EDEFAULT);
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
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__BOUND_STATIC_MODEL:
				return boundStaticModel != null;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__TEMPLATE_PARAMETER:
				return templateParameter != null && !templateParameter.isEmpty();
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_CLASS:
				return entryClass != null;
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ATTRIBUTION_LEVEL:
				return ATTRIBUTION_LEVEL_EDEFAULT == null
						? attributionLevel != null
						: !ATTRIBUTION_LEVEL_EDEFAULT.equals(attributionLevel);
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__ENTRY_KIND:
				return isSetEntryKind();
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case Mif2Package.COMMON_MODEL_ELEMENT_DEFINITION__OTHER_CLASS_NAME:
				return OTHER_CLASS_NAME_EDEFAULT == null
						? otherClassName != null
						: !OTHER_CLASS_NAME_EDEFAULT.equals(otherClassName);
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
		result.append(" (attributionLevel: ");
		result.append(attributionLevel);
		result.append(", entryKind: ");
		if (entryKindESet) {
			result.append(entryKind);
		} else {
			result.append("<unset>");
		}
		result.append(", name: ");
		result.append(name);
		result.append(", otherClassName: ");
		result.append(otherClassName);
		result.append(')');
		return result.toString();
	}

} // CommonModelElementDefinitionImpl
