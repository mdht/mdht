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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.Datatype;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeBinding;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeKind;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeOperation;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeParameter;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getHasDerivations <em>Has Derivations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getEnumerationValue <em>Enumeration Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getChildDatatype <em>Child Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getParentDatatype <em>Parent Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getDatatypeKind <em>Datatype Kind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeImpl extends ClassifierImpl implements Datatype {
	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeDerivation> derivedFrom;

	/**
	 * The cached value of the '{@link #getHasDerivations() <em>Has Derivations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDerivations()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeDerivation> hasDerivations;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected DatatypeAnnotations annotations;

	/**
	 * The cached value of the '{@link #getEnumerationValue() <em>Enumeration Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> enumerationValue;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeParameter> parameter;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected DatatypeBinding binding;

	/**
	 * The cached value of the '{@link #getChildDatatype() <em>Child Datatype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildDatatype()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeRef> childDatatype;

	/**
	 * The cached value of the '{@link #getParentDatatype() <em>Parent Datatype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDatatype()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeRef> parentDatatype;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeOperation> property;

	/**
	 * The default value of the '{@link #getDatatypeKind() <em>Datatype Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeKind()
	 * @generated
	 * @ordered
	 */
	protected static final DatatypeKind DATATYPE_KIND_EDEFAULT = DatatypeKind.DEFINITION;

	/**
	 * The cached value of the '{@link #getDatatypeKind() <em>Datatype Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeKind()
	 * @generated
	 * @ordered
	 */
	protected DatatypeKind datatypeKind = DATATYPE_KIND_EDEFAULT;

	/**
	 * This is true if the Datatype Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean datatypeKindESet;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Is Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstractESet;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DATATYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDerivation> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<DatatypeDerivation>(
				DatatypeDerivation.class, this, Mif2Package.DATATYPE__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDerivation> getHasDerivations() {
		if (hasDerivations == null) {
			hasDerivations = new EObjectContainmentEList<DatatypeDerivation>(
				DatatypeDerivation.class, this, Mif2Package.DATATYPE__HAS_DERIVATIONS);
		}
		return hasDerivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(DatatypeAnnotations newAnnotations, NotificationChain msgs) {
		DatatypeAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DATATYPE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
	public void setAnnotations(DatatypeAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DATATYPE__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DATATYPE__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DATATYPE__ANNOTATIONS, newAnnotations, newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnumerationValue() {
		if (enumerationValue == null) {
			enumerationValue = new EDataTypeEList<String>(String.class, this, Mif2Package.DATATYPE__ENUMERATION_VALUE);
		}
		return enumerationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<DatatypeParameter>(
				DatatypeParameter.class, this, Mif2Package.DATATYPE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeBinding getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(DatatypeBinding newBinding, NotificationChain msgs) {
		DatatypeBinding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DATATYPE__BINDING, oldBinding, newBinding);
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
	public void setBinding(DatatypeBinding newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null) {
				msgs = ((InternalEObject) binding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DATATYPE__BINDING, null, msgs);
			}
			if (newBinding != null) {
				msgs = ((InternalEObject) newBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DATATYPE__BINDING, null, msgs);
			}
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE__BINDING, newBinding, newBinding));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeRef> getChildDatatype() {
		if (childDatatype == null) {
			childDatatype = new EObjectContainmentEList<DatatypeRef>(
				DatatypeRef.class, this, Mif2Package.DATATYPE__CHILD_DATATYPE);
		}
		return childDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeRef> getParentDatatype() {
		if (parentDatatype == null) {
			parentDatatype = new EObjectContainmentEList<DatatypeRef>(
				DatatypeRef.class, this, Mif2Package.DATATYPE__PARENT_DATATYPE);
		}
		return parentDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeOperation> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<DatatypeOperation>(
				DatatypeOperation.class, this, Mif2Package.DATATYPE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeKind getDatatypeKind() {
		return datatypeKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatypeKind(DatatypeKind newDatatypeKind) {
		DatatypeKind oldDatatypeKind = datatypeKind;
		datatypeKind = newDatatypeKind == null
				? DATATYPE_KIND_EDEFAULT
				: newDatatypeKind;
		boolean oldDatatypeKindESet = datatypeKindESet;
		datatypeKindESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DATATYPE__DATATYPE_KIND, oldDatatypeKind, datatypeKind,
				!oldDatatypeKindESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDatatypeKind() {
		DatatypeKind oldDatatypeKind = datatypeKind;
		boolean oldDatatypeKindESet = datatypeKindESet;
		datatypeKind = DATATYPE_KIND_EDEFAULT;
		datatypeKindESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.DATATYPE__DATATYPE_KIND, oldDatatypeKind, DATATYPE_KIND_EDEFAULT,
				oldDatatypeKindESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDatatypeKind() {
		return datatypeKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		boolean oldIsAbstractESet = isAbstractESet;
		isAbstractESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DATATYPE__IS_ABSTRACT, oldIsAbstract, isAbstract,
				!oldIsAbstractESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAbstract() {
		boolean oldIsAbstract = isAbstract;
		boolean oldIsAbstractESet = isAbstractESet;
		isAbstract = IS_ABSTRACT_EDEFAULT;
		isAbstractESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.DATATYPE__IS_ABSTRACT, oldIsAbstract, IS_ABSTRACT_EDEFAULT,
				oldIsAbstractESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAbstract() {
		return isAbstractESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.DATATYPE__TITLE, oldTitle, title));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null
				? VISIBILITY_EDEFAULT
				: newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DATATYPE__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility() {
		VisibilityKind oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.DATATYPE__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT,
				oldVisibilityESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return visibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.DATATYPE__DERIVED_FROM:
				return ((InternalEList<?>) getDerivedFrom()).basicRemove(otherEnd, msgs);
			case Mif2Package.DATATYPE__HAS_DERIVATIONS:
				return ((InternalEList<?>) getHasDerivations()).basicRemove(otherEnd, msgs);
			case Mif2Package.DATATYPE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.DATATYPE__PARAMETER:
				return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
			case Mif2Package.DATATYPE__BINDING:
				return basicSetBinding(null, msgs);
			case Mif2Package.DATATYPE__CHILD_DATATYPE:
				return ((InternalEList<?>) getChildDatatype()).basicRemove(otherEnd, msgs);
			case Mif2Package.DATATYPE__PARENT_DATATYPE:
				return ((InternalEList<?>) getParentDatatype()).basicRemove(otherEnd, msgs);
			case Mif2Package.DATATYPE__PROPERTY:
				return ((InternalEList<?>) getProperty()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.DATATYPE__DERIVED_FROM:
				return getDerivedFrom();
			case Mif2Package.DATATYPE__HAS_DERIVATIONS:
				return getHasDerivations();
			case Mif2Package.DATATYPE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.DATATYPE__ENUMERATION_VALUE:
				return getEnumerationValue();
			case Mif2Package.DATATYPE__PARAMETER:
				return getParameter();
			case Mif2Package.DATATYPE__BINDING:
				return getBinding();
			case Mif2Package.DATATYPE__CHILD_DATATYPE:
				return getChildDatatype();
			case Mif2Package.DATATYPE__PARENT_DATATYPE:
				return getParentDatatype();
			case Mif2Package.DATATYPE__PROPERTY:
				return getProperty();
			case Mif2Package.DATATYPE__DATATYPE_KIND:
				return getDatatypeKind();
			case Mif2Package.DATATYPE__IS_ABSTRACT:
				return isIsAbstract()
						? Boolean.TRUE
						: Boolean.FALSE;
			case Mif2Package.DATATYPE__NAME:
				return getName();
			case Mif2Package.DATATYPE__TITLE:
				return getTitle();
			case Mif2Package.DATATYPE__VISIBILITY:
				return getVisibility();
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
			case Mif2Package.DATATYPE__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends DatatypeDerivation>) newValue);
				return;
			case Mif2Package.DATATYPE__HAS_DERIVATIONS:
				getHasDerivations().clear();
				getHasDerivations().addAll((Collection<? extends DatatypeDerivation>) newValue);
				return;
			case Mif2Package.DATATYPE__ANNOTATIONS:
				setAnnotations((DatatypeAnnotations) newValue);
				return;
			case Mif2Package.DATATYPE__ENUMERATION_VALUE:
				getEnumerationValue().clear();
				getEnumerationValue().addAll((Collection<? extends String>) newValue);
				return;
			case Mif2Package.DATATYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends DatatypeParameter>) newValue);
				return;
			case Mif2Package.DATATYPE__BINDING:
				setBinding((DatatypeBinding) newValue);
				return;
			case Mif2Package.DATATYPE__CHILD_DATATYPE:
				getChildDatatype().clear();
				getChildDatatype().addAll((Collection<? extends DatatypeRef>) newValue);
				return;
			case Mif2Package.DATATYPE__PARENT_DATATYPE:
				getParentDatatype().clear();
				getParentDatatype().addAll((Collection<? extends DatatypeRef>) newValue);
				return;
			case Mif2Package.DATATYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends DatatypeOperation>) newValue);
				return;
			case Mif2Package.DATATYPE__DATATYPE_KIND:
				setDatatypeKind((DatatypeKind) newValue);
				return;
			case Mif2Package.DATATYPE__IS_ABSTRACT:
				setIsAbstract(((Boolean) newValue).booleanValue());
				return;
			case Mif2Package.DATATYPE__NAME:
				setName((String) newValue);
				return;
			case Mif2Package.DATATYPE__TITLE:
				setTitle((String) newValue);
				return;
			case Mif2Package.DATATYPE__VISIBILITY:
				setVisibility((VisibilityKind) newValue);
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
			case Mif2Package.DATATYPE__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case Mif2Package.DATATYPE__HAS_DERIVATIONS:
				getHasDerivations().clear();
				return;
			case Mif2Package.DATATYPE__ANNOTATIONS:
				setAnnotations((DatatypeAnnotations) null);
				return;
			case Mif2Package.DATATYPE__ENUMERATION_VALUE:
				getEnumerationValue().clear();
				return;
			case Mif2Package.DATATYPE__PARAMETER:
				getParameter().clear();
				return;
			case Mif2Package.DATATYPE__BINDING:
				setBinding((DatatypeBinding) null);
				return;
			case Mif2Package.DATATYPE__CHILD_DATATYPE:
				getChildDatatype().clear();
				return;
			case Mif2Package.DATATYPE__PARENT_DATATYPE:
				getParentDatatype().clear();
				return;
			case Mif2Package.DATATYPE__PROPERTY:
				getProperty().clear();
				return;
			case Mif2Package.DATATYPE__DATATYPE_KIND:
				unsetDatatypeKind();
				return;
			case Mif2Package.DATATYPE__IS_ABSTRACT:
				unsetIsAbstract();
				return;
			case Mif2Package.DATATYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.DATATYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Mif2Package.DATATYPE__VISIBILITY:
				unsetVisibility();
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
			case Mif2Package.DATATYPE__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case Mif2Package.DATATYPE__HAS_DERIVATIONS:
				return hasDerivations != null && !hasDerivations.isEmpty();
			case Mif2Package.DATATYPE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.DATATYPE__ENUMERATION_VALUE:
				return enumerationValue != null && !enumerationValue.isEmpty();
			case Mif2Package.DATATYPE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case Mif2Package.DATATYPE__BINDING:
				return binding != null;
			case Mif2Package.DATATYPE__CHILD_DATATYPE:
				return childDatatype != null && !childDatatype.isEmpty();
			case Mif2Package.DATATYPE__PARENT_DATATYPE:
				return parentDatatype != null && !parentDatatype.isEmpty();
			case Mif2Package.DATATYPE__PROPERTY:
				return property != null && !property.isEmpty();
			case Mif2Package.DATATYPE__DATATYPE_KIND:
				return isSetDatatypeKind();
			case Mif2Package.DATATYPE__IS_ABSTRACT:
				return isSetIsAbstract();
			case Mif2Package.DATATYPE__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case Mif2Package.DATATYPE__TITLE:
				return TITLE_EDEFAULT == null
						? title != null
						: !TITLE_EDEFAULT.equals(title);
			case Mif2Package.DATATYPE__VISIBILITY:
				return isSetVisibility();
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
		result.append(" (enumerationValue: ");
		result.append(enumerationValue);
		result.append(", datatypeKind: ");
		if (datatypeKindESet) {
			result.append(datatypeKind);
		} else {
			result.append("<unset>");
		}
		result.append(", isAbstract: ");
		if (isAbstractESet) {
			result.append(isAbstract);
		} else {
			result.append("<unset>");
		}
		result.append(", name: ");
		result.append(name);
		result.append(", title: ");
		result.append(title);
		result.append(", visibility: ");
		if (visibilityESet) {
			result.append(visibility);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // DatatypeImpl
