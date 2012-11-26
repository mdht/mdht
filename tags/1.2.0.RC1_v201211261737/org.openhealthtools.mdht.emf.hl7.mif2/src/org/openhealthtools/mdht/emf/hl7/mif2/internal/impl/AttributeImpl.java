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

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.Attribute;
import org.openhealthtools.mdht.emf.hl7.mif2.AttributeAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.AttributeDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.AttributeProperty;
import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.UpdateModeKind;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularySpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getBusinessName <em>Business Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getVocabulary <em>Vocabulary</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getExtensionOID <em>Extension OID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#isIsImmutable <em>Is Immutable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getMaximumMultiplicity <em>Maximum Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getMinimumMultiplicity <em>Minimum Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getUpdateModeDefault <em>Update Mode Default</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AttributeImpl#getUpdateModesAllowed <em>Update Modes Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends StructuralFeatureImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getBusinessName() <em>Business Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessName()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessName> businessName;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AttributeAnnotations annotations;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDerivation> derivedFrom;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DatatypeRef type;

	/**
	 * The cached value of the '{@link #getVocabulary() <em>Vocabulary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVocabulary()
	 * @generated
	 * @ordered
	 */
	protected VocabularySpecification vocabulary;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeProperty> property;

	/**
	 * The default value of the '{@link #getExtensionOID() <em>Extension OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionOID()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_OID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionOID() <em>Extension OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionOID()
	 * @generated
	 * @ordered
	 */
	protected String extensionOID = EXTENSION_OID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsImmutable() <em>Is Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImmutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMMUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsImmutable() <em>Is Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImmutable()
	 * @generated
	 * @ordered
	 */
	protected boolean isImmutable = IS_IMMUTABLE_EDEFAULT;

	/**
	 * This is true if the Is Immutable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isImmutableESet;

	/**
	 * The default value of the '{@link #getMaximumMultiplicity() <em>Maximum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAXIMUM_MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumMultiplicity() <em>Maximum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Object maximumMultiplicity = MAXIMUM_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumMultiplicity() <em>Minimum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MINIMUM_MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumMultiplicity() <em>Minimum Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minimumMultiplicity = MINIMUM_MULTIPLICITY_EDEFAULT;

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
	 * The default value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSortKey() <em>Sort Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortKey()
	 * @generated
	 * @ordered
	 */
	protected String sortKey = SORT_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateModeDefault() <em>Update Mode Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateModeDefault()
	 * @generated
	 * @ordered
	 */
	protected static final UpdateModeKind UPDATE_MODE_DEFAULT_EDEFAULT = UpdateModeKind.A;

	/**
	 * The cached value of the '{@link #getUpdateModeDefault() <em>Update Mode Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateModeDefault()
	 * @generated
	 * @ordered
	 */
	protected UpdateModeKind updateModeDefault = UPDATE_MODE_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Update Mode Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateModeDefaultESet;

	/**
	 * The default value of the '{@link #getUpdateModesAllowed() <em>Update Modes Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateModesAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final List<UpdateModeKind> UPDATE_MODES_ALLOWED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateModesAllowed() <em>Update Modes Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateModesAllowed()
	 * @generated
	 * @ordered
	 */
	protected List<UpdateModeKind> updateModesAllowed = UPDATE_MODES_ALLOWED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessName> getBusinessName() {
		if (businessName == null) {
			businessName = new EObjectContainmentEList<BusinessName>(
				BusinessName.class, this, Mif2Package.ATTRIBUTE__BUSINESS_NAME);
		}
		return businessName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AttributeAnnotations newAnnotations, NotificationChain msgs) {
		AttributeAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.ATTRIBUTE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
	public void setAnnotations(AttributeAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ATTRIBUTE__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ATTRIBUTE__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ATTRIBUTE__ANNOTATIONS, newAnnotations, newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDerivation> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<AttributeDerivation>(
				AttributeDerivation.class, this, Mif2Package.ATTRIBUTE__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeRef getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(DatatypeRef newType, NotificationChain msgs) {
		DatatypeRef oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.ATTRIBUTE__TYPE, oldType, newType);
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
	public void setType(DatatypeRef newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null) {
				msgs = ((InternalEObject) type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ATTRIBUTE__TYPE, null, msgs);
			}
			if (newType != null) {
				msgs = ((InternalEObject) newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ATTRIBUTE__TYPE, null, msgs);
			}
			msgs = basicSetType(newType, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ATTRIBUTE__TYPE, newType, newType));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularySpecification getVocabulary() {
		return vocabulary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVocabulary(VocabularySpecification newVocabulary, NotificationChain msgs) {
		VocabularySpecification oldVocabulary = vocabulary;
		vocabulary = newVocabulary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.ATTRIBUTE__VOCABULARY, oldVocabulary, newVocabulary);
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
	public void setVocabulary(VocabularySpecification newVocabulary) {
		if (newVocabulary != vocabulary) {
			NotificationChain msgs = null;
			if (vocabulary != null) {
				msgs = ((InternalEObject) vocabulary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ATTRIBUTE__VOCABULARY, null, msgs);
			}
			if (newVocabulary != null) {
				msgs = ((InternalEObject) newVocabulary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ATTRIBUTE__VOCABULARY, null, msgs);
			}
			msgs = basicSetVocabulary(newVocabulary, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ATTRIBUTE__VOCABULARY, newVocabulary, newVocabulary));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<AttributeProperty>(
				AttributeProperty.class, this, Mif2Package.ATTRIBUTE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionOID() {
		return extensionOID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionOID(String newExtensionOID) {
		String oldExtensionOID = extensionOID;
		extensionOID = newExtensionOID;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ATTRIBUTE__EXTENSION_OID, oldExtensionOID, extensionOID));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsImmutable() {
		return isImmutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImmutable(boolean newIsImmutable) {
		boolean oldIsImmutable = isImmutable;
		isImmutable = newIsImmutable;
		boolean oldIsImmutableESet = isImmutableESet;
		isImmutableESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ATTRIBUTE__IS_IMMUTABLE, oldIsImmutable, isImmutable,
				!oldIsImmutableESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsImmutable() {
		boolean oldIsImmutable = isImmutable;
		boolean oldIsImmutableESet = isImmutableESet;
		isImmutable = IS_IMMUTABLE_EDEFAULT;
		isImmutableESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.ATTRIBUTE__IS_IMMUTABLE, oldIsImmutable, IS_IMMUTABLE_EDEFAULT,
				oldIsImmutableESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsImmutable() {
		return isImmutableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaximumMultiplicity() {
		return maximumMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumMultiplicity(Object newMaximumMultiplicity) {
		Object oldMaximumMultiplicity = maximumMultiplicity;
		maximumMultiplicity = newMaximumMultiplicity;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ATTRIBUTE__MAXIMUM_MULTIPLICITY, oldMaximumMultiplicity,
				maximumMultiplicity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinimumMultiplicity() {
		return minimumMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumMultiplicity(BigInteger newMinimumMultiplicity) {
		BigInteger oldMinimumMultiplicity = minimumMultiplicity;
		minimumMultiplicity = newMinimumMultiplicity;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ATTRIBUTE__MINIMUM_MULTIPLICITY, oldMinimumMultiplicity,
				minimumMultiplicity));
		}
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ATTRIBUTE__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSortKey() {
		return sortKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortKey(String newSortKey) {
		String oldSortKey = sortKey;
		sortKey = newSortKey;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.ATTRIBUTE__SORT_KEY, oldSortKey, sortKey));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateModeKind getUpdateModeDefault() {
		return updateModeDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateModeDefault(UpdateModeKind newUpdateModeDefault) {
		UpdateModeKind oldUpdateModeDefault = updateModeDefault;
		updateModeDefault = newUpdateModeDefault == null
				? UPDATE_MODE_DEFAULT_EDEFAULT
				: newUpdateModeDefault;
		boolean oldUpdateModeDefaultESet = updateModeDefaultESet;
		updateModeDefaultESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ATTRIBUTE__UPDATE_MODE_DEFAULT, oldUpdateModeDefault,
				updateModeDefault, !oldUpdateModeDefaultESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpdateModeDefault() {
		UpdateModeKind oldUpdateModeDefault = updateModeDefault;
		boolean oldUpdateModeDefaultESet = updateModeDefaultESet;
		updateModeDefault = UPDATE_MODE_DEFAULT_EDEFAULT;
		updateModeDefaultESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.ATTRIBUTE__UPDATE_MODE_DEFAULT, oldUpdateModeDefault,
				UPDATE_MODE_DEFAULT_EDEFAULT, oldUpdateModeDefaultESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpdateModeDefault() {
		return updateModeDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UpdateModeKind> getUpdateModesAllowed() {
		return updateModesAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateModesAllowed(List<UpdateModeKind> newUpdateModesAllowed) {
		List<UpdateModeKind> oldUpdateModesAllowed = updateModesAllowed;
		updateModesAllowed = newUpdateModesAllowed;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ATTRIBUTE__UPDATE_MODES_ALLOWED, oldUpdateModesAllowed,
				updateModesAllowed));
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
			case Mif2Package.ATTRIBUTE__BUSINESS_NAME:
				return ((InternalEList<?>) getBusinessName()).basicRemove(otherEnd, msgs);
			case Mif2Package.ATTRIBUTE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.ATTRIBUTE__DERIVED_FROM:
				return ((InternalEList<?>) getDerivedFrom()).basicRemove(otherEnd, msgs);
			case Mif2Package.ATTRIBUTE__TYPE:
				return basicSetType(null, msgs);
			case Mif2Package.ATTRIBUTE__VOCABULARY:
				return basicSetVocabulary(null, msgs);
			case Mif2Package.ATTRIBUTE__PROPERTY:
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
			case Mif2Package.ATTRIBUTE__BUSINESS_NAME:
				return getBusinessName();
			case Mif2Package.ATTRIBUTE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.ATTRIBUTE__DERIVED_FROM:
				return getDerivedFrom();
			case Mif2Package.ATTRIBUTE__TYPE:
				return getType();
			case Mif2Package.ATTRIBUTE__VOCABULARY:
				return getVocabulary();
			case Mif2Package.ATTRIBUTE__PROPERTY:
				return getProperty();
			case Mif2Package.ATTRIBUTE__EXTENSION_OID:
				return getExtensionOID();
			case Mif2Package.ATTRIBUTE__IS_IMMUTABLE:
				return isIsImmutable()
						? Boolean.TRUE
						: Boolean.FALSE;
			case Mif2Package.ATTRIBUTE__MAXIMUM_MULTIPLICITY:
				return getMaximumMultiplicity();
			case Mif2Package.ATTRIBUTE__MINIMUM_MULTIPLICITY:
				return getMinimumMultiplicity();
			case Mif2Package.ATTRIBUTE__NAME:
				return getName();
			case Mif2Package.ATTRIBUTE__SORT_KEY:
				return getSortKey();
			case Mif2Package.ATTRIBUTE__UPDATE_MODE_DEFAULT:
				return getUpdateModeDefault();
			case Mif2Package.ATTRIBUTE__UPDATE_MODES_ALLOWED:
				return getUpdateModesAllowed();
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
			case Mif2Package.ATTRIBUTE__BUSINESS_NAME:
				getBusinessName().clear();
				getBusinessName().addAll((Collection<? extends BusinessName>) newValue);
				return;
			case Mif2Package.ATTRIBUTE__ANNOTATIONS:
				setAnnotations((AttributeAnnotations) newValue);
				return;
			case Mif2Package.ATTRIBUTE__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends AttributeDerivation>) newValue);
				return;
			case Mif2Package.ATTRIBUTE__TYPE:
				setType((DatatypeRef) newValue);
				return;
			case Mif2Package.ATTRIBUTE__VOCABULARY:
				setVocabulary((VocabularySpecification) newValue);
				return;
			case Mif2Package.ATTRIBUTE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends AttributeProperty>) newValue);
				return;
			case Mif2Package.ATTRIBUTE__EXTENSION_OID:
				setExtensionOID((String) newValue);
				return;
			case Mif2Package.ATTRIBUTE__IS_IMMUTABLE:
				setIsImmutable(((Boolean) newValue).booleanValue());
				return;
			case Mif2Package.ATTRIBUTE__MAXIMUM_MULTIPLICITY:
				setMaximumMultiplicity(newValue);
				return;
			case Mif2Package.ATTRIBUTE__MINIMUM_MULTIPLICITY:
				setMinimumMultiplicity((BigInteger) newValue);
				return;
			case Mif2Package.ATTRIBUTE__NAME:
				setName((String) newValue);
				return;
			case Mif2Package.ATTRIBUTE__SORT_KEY:
				setSortKey((String) newValue);
				return;
			case Mif2Package.ATTRIBUTE__UPDATE_MODE_DEFAULT:
				setUpdateModeDefault((UpdateModeKind) newValue);
				return;
			case Mif2Package.ATTRIBUTE__UPDATE_MODES_ALLOWED:
				setUpdateModesAllowed((List<UpdateModeKind>) newValue);
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
			case Mif2Package.ATTRIBUTE__BUSINESS_NAME:
				getBusinessName().clear();
				return;
			case Mif2Package.ATTRIBUTE__ANNOTATIONS:
				setAnnotations((AttributeAnnotations) null);
				return;
			case Mif2Package.ATTRIBUTE__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case Mif2Package.ATTRIBUTE__TYPE:
				setType((DatatypeRef) null);
				return;
			case Mif2Package.ATTRIBUTE__VOCABULARY:
				setVocabulary((VocabularySpecification) null);
				return;
			case Mif2Package.ATTRIBUTE__PROPERTY:
				getProperty().clear();
				return;
			case Mif2Package.ATTRIBUTE__EXTENSION_OID:
				setExtensionOID(EXTENSION_OID_EDEFAULT);
				return;
			case Mif2Package.ATTRIBUTE__IS_IMMUTABLE:
				unsetIsImmutable();
				return;
			case Mif2Package.ATTRIBUTE__MAXIMUM_MULTIPLICITY:
				setMaximumMultiplicity(MAXIMUM_MULTIPLICITY_EDEFAULT);
				return;
			case Mif2Package.ATTRIBUTE__MINIMUM_MULTIPLICITY:
				setMinimumMultiplicity(MINIMUM_MULTIPLICITY_EDEFAULT);
				return;
			case Mif2Package.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.ATTRIBUTE__SORT_KEY:
				setSortKey(SORT_KEY_EDEFAULT);
				return;
			case Mif2Package.ATTRIBUTE__UPDATE_MODE_DEFAULT:
				unsetUpdateModeDefault();
				return;
			case Mif2Package.ATTRIBUTE__UPDATE_MODES_ALLOWED:
				setUpdateModesAllowed(UPDATE_MODES_ALLOWED_EDEFAULT);
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
			case Mif2Package.ATTRIBUTE__BUSINESS_NAME:
				return businessName != null && !businessName.isEmpty();
			case Mif2Package.ATTRIBUTE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.ATTRIBUTE__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case Mif2Package.ATTRIBUTE__TYPE:
				return type != null;
			case Mif2Package.ATTRIBUTE__VOCABULARY:
				return vocabulary != null;
			case Mif2Package.ATTRIBUTE__PROPERTY:
				return property != null && !property.isEmpty();
			case Mif2Package.ATTRIBUTE__EXTENSION_OID:
				return EXTENSION_OID_EDEFAULT == null
						? extensionOID != null
						: !EXTENSION_OID_EDEFAULT.equals(extensionOID);
			case Mif2Package.ATTRIBUTE__IS_IMMUTABLE:
				return isSetIsImmutable();
			case Mif2Package.ATTRIBUTE__MAXIMUM_MULTIPLICITY:
				return MAXIMUM_MULTIPLICITY_EDEFAULT == null
						? maximumMultiplicity != null
						: !MAXIMUM_MULTIPLICITY_EDEFAULT.equals(maximumMultiplicity);
			case Mif2Package.ATTRIBUTE__MINIMUM_MULTIPLICITY:
				return MINIMUM_MULTIPLICITY_EDEFAULT == null
						? minimumMultiplicity != null
						: !MINIMUM_MULTIPLICITY_EDEFAULT.equals(minimumMultiplicity);
			case Mif2Package.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case Mif2Package.ATTRIBUTE__SORT_KEY:
				return SORT_KEY_EDEFAULT == null
						? sortKey != null
						: !SORT_KEY_EDEFAULT.equals(sortKey);
			case Mif2Package.ATTRIBUTE__UPDATE_MODE_DEFAULT:
				return isSetUpdateModeDefault();
			case Mif2Package.ATTRIBUTE__UPDATE_MODES_ALLOWED:
				return UPDATE_MODES_ALLOWED_EDEFAULT == null
						? updateModesAllowed != null
						: !UPDATE_MODES_ALLOWED_EDEFAULT.equals(updateModesAllowed);
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
		result.append(" (extensionOID: ");
		result.append(extensionOID);
		result.append(", isImmutable: ");
		if (isImmutableESet) {
			result.append(isImmutable);
		} else {
			result.append("<unset>");
		}
		result.append(", maximumMultiplicity: ");
		result.append(maximumMultiplicity);
		result.append(", minimumMultiplicity: ");
		result.append(minimumMultiplicity);
		result.append(", name: ");
		result.append(name);
		result.append(", sortKey: ");
		result.append(sortKey);
		result.append(", updateModeDefault: ");
		if (updateModeDefaultESet) {
			result.append(updateModeDefault);
		} else {
			result.append("<unset>");
		}
		result.append(", updateModesAllowed: ");
		result.append(updateModesAllowed);
		result.append(')');
		return result.toString();
	}

} // AttributeImpl
