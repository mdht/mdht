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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.ChangeCommitted;
import org.openhealthtools.mdht.cts2.core.ChangeDescription;
import org.openhealthtools.mdht.cts2.core.ChangeType;
import org.openhealthtools.mdht.cts2.core.Changeable;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.NameAndMeaningReference;
import org.openhealthtools.mdht.cts2.core.OpaqueData;
import org.openhealthtools.mdht.cts2.core.SourceReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl#getPrevImage <em>Prev Image</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl#getChangeNotes <em>Change Notes</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl#getChangeSource <em>Change Source</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl#getClonedResource <em>Cloned Resource</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl#getChangeDate <em>Change Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl#getChangeType <em>Change Type</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl#getCommitted <em>Committed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl#getContainingChangeSet <em>Containing Change Set</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl#getEffectiveDate <em>Effective Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.ChangeDescriptionImpl#getPrevChangeSet <em>Prev Change Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ChangeDescriptionImpl extends EObjectImpl implements ChangeDescription {
	/**
	 * The cached value of the '{@link #getPrevImage() <em>Prev Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrevImage()
	 * @generated
	 * @ordered
	 */
	protected Changeable prevImage;

	/**
	 * The cached value of the '{@link #getChangeNotes() <em>Change Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChangeNotes()
	 * @generated
	 * @ordered
	 */
	protected OpaqueData changeNotes;

	/**
	 * The cached value of the '{@link #getChangeSource() <em>Change Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChangeSource()
	 * @generated
	 * @ordered
	 */
	protected SourceReference changeSource;

	/**
	 * The cached value of the '{@link #getClonedResource() <em>Cloned Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getClonedResource()
	 * @generated
	 * @ordered
	 */
	protected NameAndMeaningReference clonedResource;

	/**
	 * The default value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CHANGE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar changeDate = CHANGE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeType() <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChangeType()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeType CHANGE_TYPE_EDEFAULT = ChangeType.CREATE;

	/**
	 * The cached value of the '{@link #getChangeType() <em>Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getChangeType()
	 * @generated
	 * @ordered
	 */
	protected ChangeType changeType = CHANGE_TYPE_EDEFAULT;

	/**
	 * This is true if the Change Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean changeTypeESet;

	/**
	 * The default value of the '{@link #getCommitted() <em>Committed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCommitted()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeCommitted COMMITTED_EDEFAULT = ChangeCommitted.COMMITTED;

	/**
	 * The cached value of the '{@link #getCommitted() <em>Committed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCommitted()
	 * @generated
	 * @ordered
	 */
	protected ChangeCommitted committed = COMMITTED_EDEFAULT;

	/**
	 * This is true if the Committed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean committedESet;

	/**
	 * The default value of the '{@link #getContainingChangeSet() <em>Containing Change Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContainingChangeSet()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINING_CHANGE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainingChangeSet() <em>Containing Change Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getContainingChangeSet()
	 * @generated
	 * @ordered
	 */
	protected String containingChangeSet = CONTAINING_CHANGE_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar effectiveDate = EFFECTIVE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrevChangeSet() <em>Prev Change Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrevChangeSet()
	 * @generated
	 * @ordered
	 */
	protected static final String PREV_CHANGE_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrevChangeSet() <em>Prev Change Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrevChangeSet()
	 * @generated
	 * @ordered
	 */
	protected String prevChangeSet = PREV_CHANGE_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ChangeDescriptionImpl() {
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
		return CorePackage.Literals.CHANGE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Changeable getPrevImage() {
		return prevImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPrevImage(Changeable newPrevImage, NotificationChain msgs) {
		Changeable oldPrevImage = prevImage;
		prevImage = newPrevImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__PREV_IMAGE, oldPrevImage, newPrevImage);
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
	public void setPrevImage(Changeable newPrevImage) {
		if (newPrevImage != prevImage) {
			NotificationChain msgs = null;
			if (prevImage != null) {
				msgs = ((InternalEObject) prevImage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGE_DESCRIPTION__PREV_IMAGE, null, msgs);
			}
			if (newPrevImage != null) {
				msgs = ((InternalEObject) newPrevImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGE_DESCRIPTION__PREV_IMAGE, null, msgs);
			}
			msgs = basicSetPrevImage(newPrevImage, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__PREV_IMAGE, newPrevImage, newPrevImage));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OpaqueData getChangeNotes() {
		return changeNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetChangeNotes(OpaqueData newChangeNotes, NotificationChain msgs) {
		OpaqueData oldChangeNotes = changeNotes;
		changeNotes = newChangeNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__CHANGE_NOTES, oldChangeNotes, newChangeNotes);
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
	public void setChangeNotes(OpaqueData newChangeNotes) {
		if (newChangeNotes != changeNotes) {
			NotificationChain msgs = null;
			if (changeNotes != null) {
				msgs = ((InternalEObject) changeNotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGE_DESCRIPTION__CHANGE_NOTES, null, msgs);
			}
			if (newChangeNotes != null) {
				msgs = ((InternalEObject) newChangeNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGE_DESCRIPTION__CHANGE_NOTES, null, msgs);
			}
			msgs = basicSetChangeNotes(newChangeNotes, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__CHANGE_NOTES, newChangeNotes, newChangeNotes));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceReference getChangeSource() {
		return changeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetChangeSource(SourceReference newChangeSource, NotificationChain msgs) {
		SourceReference oldChangeSource = changeSource;
		changeSource = newChangeSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__CHANGE_SOURCE, oldChangeSource, newChangeSource);
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
	public void setChangeSource(SourceReference newChangeSource) {
		if (newChangeSource != changeSource) {
			NotificationChain msgs = null;
			if (changeSource != null) {
				msgs = ((InternalEObject) changeSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGE_DESCRIPTION__CHANGE_SOURCE, null, msgs);
			}
			if (newChangeSource != null) {
				msgs = ((InternalEObject) newChangeSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGE_DESCRIPTION__CHANGE_SOURCE, null, msgs);
			}
			msgs = basicSetChangeSource(newChangeSource, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__CHANGE_SOURCE, newChangeSource, newChangeSource));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NameAndMeaningReference getClonedResource() {
		return clonedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetClonedResource(NameAndMeaningReference newClonedResource, NotificationChain msgs) {
		NameAndMeaningReference oldClonedResource = clonedResource;
		clonedResource = newClonedResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__CLONED_RESOURCE, oldClonedResource,
				newClonedResource);
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
	public void setClonedResource(NameAndMeaningReference newClonedResource) {
		if (newClonedResource != clonedResource) {
			NotificationChain msgs = null;
			if (clonedResource != null) {
				msgs = ((InternalEObject) clonedResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGE_DESCRIPTION__CLONED_RESOURCE, null, msgs);
			}
			if (newClonedResource != null) {
				msgs = ((InternalEObject) newClonedResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.CHANGE_DESCRIPTION__CLONED_RESOURCE, null, msgs);
			}
			msgs = basicSetClonedResource(newClonedResource, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__CLONED_RESOURCE, newClonedResource,
				newClonedResource));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XMLGregorianCalendar getChangeDate() {
		return changeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setChangeDate(XMLGregorianCalendar newChangeDate) {
		XMLGregorianCalendar oldChangeDate = changeDate;
		changeDate = newChangeDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__CHANGE_DATE, oldChangeDate, changeDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeType getChangeType() {
		return changeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setChangeType(ChangeType newChangeType) {
		ChangeType oldChangeType = changeType;
		changeType = newChangeType == null
				? CHANGE_TYPE_EDEFAULT
				: newChangeType;
		boolean oldChangeTypeESet = changeTypeESet;
		changeTypeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__CHANGE_TYPE, oldChangeType, changeType,
				!oldChangeTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetChangeType() {
		ChangeType oldChangeType = changeType;
		boolean oldChangeTypeESet = changeTypeESet;
		changeType = CHANGE_TYPE_EDEFAULT;
		changeTypeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CorePackage.CHANGE_DESCRIPTION__CHANGE_TYPE, oldChangeType,
				CHANGE_TYPE_EDEFAULT, oldChangeTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetChangeType() {
		return changeTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ChangeCommitted getCommitted() {
		return committed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCommitted(ChangeCommitted newCommitted) {
		ChangeCommitted oldCommitted = committed;
		committed = newCommitted == null
				? COMMITTED_EDEFAULT
				: newCommitted;
		boolean oldCommittedESet = committedESet;
		committedESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__COMMITTED, oldCommitted, committed,
				!oldCommittedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetCommitted() {
		ChangeCommitted oldCommitted = committed;
		boolean oldCommittedESet = committedESet;
		committed = COMMITTED_EDEFAULT;
		committedESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CorePackage.CHANGE_DESCRIPTION__COMMITTED, oldCommitted, COMMITTED_EDEFAULT,
				oldCommittedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetCommitted() {
		return committedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getContainingChangeSet() {
		return containingChangeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContainingChangeSet(String newContainingChangeSet) {
		String oldContainingChangeSet = containingChangeSet;
		containingChangeSet = newContainingChangeSet;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__CONTAINING_CHANGE_SET, oldContainingChangeSet,
				containingChangeSet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XMLGregorianCalendar getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEffectiveDate(XMLGregorianCalendar newEffectiveDate) {
		XMLGregorianCalendar oldEffectiveDate = effectiveDate;
		effectiveDate = newEffectiveDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__EFFECTIVE_DATE, oldEffectiveDate, effectiveDate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPrevChangeSet() {
		return prevChangeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPrevChangeSet(String newPrevChangeSet) {
		String oldPrevChangeSet = prevChangeSet;
		prevChangeSet = newPrevChangeSet;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.CHANGE_DESCRIPTION__PREV_CHANGE_SET, oldPrevChangeSet,
				prevChangeSet));
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
			case CorePackage.CHANGE_DESCRIPTION__PREV_IMAGE:
				return basicSetPrevImage(null, msgs);
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_NOTES:
				return basicSetChangeNotes(null, msgs);
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_SOURCE:
				return basicSetChangeSource(null, msgs);
			case CorePackage.CHANGE_DESCRIPTION__CLONED_RESOURCE:
				return basicSetClonedResource(null, msgs);
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
			case CorePackage.CHANGE_DESCRIPTION__PREV_IMAGE:
				return getPrevImage();
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_NOTES:
				return getChangeNotes();
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_SOURCE:
				return getChangeSource();
			case CorePackage.CHANGE_DESCRIPTION__CLONED_RESOURCE:
				return getClonedResource();
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_DATE:
				return getChangeDate();
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_TYPE:
				return getChangeType();
			case CorePackage.CHANGE_DESCRIPTION__COMMITTED:
				return getCommitted();
			case CorePackage.CHANGE_DESCRIPTION__CONTAINING_CHANGE_SET:
				return getContainingChangeSet();
			case CorePackage.CHANGE_DESCRIPTION__EFFECTIVE_DATE:
				return getEffectiveDate();
			case CorePackage.CHANGE_DESCRIPTION__PREV_CHANGE_SET:
				return getPrevChangeSet();
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
			case CorePackage.CHANGE_DESCRIPTION__PREV_IMAGE:
				setPrevImage((Changeable) newValue);
				return;
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_NOTES:
				setChangeNotes((OpaqueData) newValue);
				return;
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_SOURCE:
				setChangeSource((SourceReference) newValue);
				return;
			case CorePackage.CHANGE_DESCRIPTION__CLONED_RESOURCE:
				setClonedResource((NameAndMeaningReference) newValue);
				return;
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_DATE:
				setChangeDate((XMLGregorianCalendar) newValue);
				return;
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_TYPE:
				setChangeType((ChangeType) newValue);
				return;
			case CorePackage.CHANGE_DESCRIPTION__COMMITTED:
				setCommitted((ChangeCommitted) newValue);
				return;
			case CorePackage.CHANGE_DESCRIPTION__CONTAINING_CHANGE_SET:
				setContainingChangeSet((String) newValue);
				return;
			case CorePackage.CHANGE_DESCRIPTION__EFFECTIVE_DATE:
				setEffectiveDate((XMLGregorianCalendar) newValue);
				return;
			case CorePackage.CHANGE_DESCRIPTION__PREV_CHANGE_SET:
				setPrevChangeSet((String) newValue);
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
			case CorePackage.CHANGE_DESCRIPTION__PREV_IMAGE:
				setPrevImage((Changeable) null);
				return;
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_NOTES:
				setChangeNotes((OpaqueData) null);
				return;
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_SOURCE:
				setChangeSource((SourceReference) null);
				return;
			case CorePackage.CHANGE_DESCRIPTION__CLONED_RESOURCE:
				setClonedResource((NameAndMeaningReference) null);
				return;
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_DATE:
				setChangeDate(CHANGE_DATE_EDEFAULT);
				return;
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_TYPE:
				unsetChangeType();
				return;
			case CorePackage.CHANGE_DESCRIPTION__COMMITTED:
				unsetCommitted();
				return;
			case CorePackage.CHANGE_DESCRIPTION__CONTAINING_CHANGE_SET:
				setContainingChangeSet(CONTAINING_CHANGE_SET_EDEFAULT);
				return;
			case CorePackage.CHANGE_DESCRIPTION__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
				return;
			case CorePackage.CHANGE_DESCRIPTION__PREV_CHANGE_SET:
				setPrevChangeSet(PREV_CHANGE_SET_EDEFAULT);
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
			case CorePackage.CHANGE_DESCRIPTION__PREV_IMAGE:
				return prevImage != null;
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_NOTES:
				return changeNotes != null;
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_SOURCE:
				return changeSource != null;
			case CorePackage.CHANGE_DESCRIPTION__CLONED_RESOURCE:
				return clonedResource != null;
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_DATE:
				return CHANGE_DATE_EDEFAULT == null
						? changeDate != null
						: !CHANGE_DATE_EDEFAULT.equals(changeDate);
			case CorePackage.CHANGE_DESCRIPTION__CHANGE_TYPE:
				return isSetChangeType();
			case CorePackage.CHANGE_DESCRIPTION__COMMITTED:
				return isSetCommitted();
			case CorePackage.CHANGE_DESCRIPTION__CONTAINING_CHANGE_SET:
				return CONTAINING_CHANGE_SET_EDEFAULT == null
						? containingChangeSet != null
						: !CONTAINING_CHANGE_SET_EDEFAULT.equals(containingChangeSet);
			case CorePackage.CHANGE_DESCRIPTION__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null
						? effectiveDate != null
						: !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
			case CorePackage.CHANGE_DESCRIPTION__PREV_CHANGE_SET:
				return PREV_CHANGE_SET_EDEFAULT == null
						? prevChangeSet != null
						: !PREV_CHANGE_SET_EDEFAULT.equals(prevChangeSet);
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
		result.append(" (changeDate: ");
		result.append(changeDate);
		result.append(", changeType: ");
		if (changeTypeESet) {
			result.append(changeType);
		} else {
			result.append("<unset>");
		}
		result.append(", committed: ");
		if (committedESet) {
			result.append(committed);
		} else {
			result.append("<unset>");
		}
		result.append(", containingChangeSet: ");
		result.append(containingChangeSet);
		result.append(", effectiveDate: ");
		result.append(effectiveDate);
		result.append(", prevChangeSet: ");
		result.append(prevChangeSet);
		result.append(')');
		return result.toString();
	}

} // ChangeDescriptionImpl
