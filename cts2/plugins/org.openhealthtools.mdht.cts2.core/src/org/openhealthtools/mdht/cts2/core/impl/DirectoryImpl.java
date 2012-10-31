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

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.CompleteDirectory;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.Directory;
import org.openhealthtools.mdht.cts2.core.Filter;
import org.openhealthtools.mdht.cts2.core.SortCriteria;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl#getDirectoryFilter <em>Directory Filter</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl#getSortCriteria <em>Sort Criteria</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl#getComplete <em>Complete</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl#getNext <em>Next</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl#getNumEntries <em>Num Entries</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl#getPrev <em>Prev</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class DirectoryImpl extends MessageImpl implements Directory {
	/**
	 * The cached value of the '{@link #getDirectoryFilter() <em>Directory Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDirectoryFilter()
	 * @generated
	 * @ordered
	 */
	protected Filter directoryFilter;

	/**
	 * The cached value of the '{@link #getSortCriteria() <em>Sort Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSortCriteria()
	 * @generated
	 * @ordered
	 */
	protected SortCriteria sortCriteria;

	/**
	 * The default value of the '{@link #getComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getComplete()
	 * @generated
	 * @ordered
	 */
	protected static final CompleteDirectory COMPLETE_EDEFAULT = CompleteDirectory.COMPLETE;

	/**
	 * The cached value of the '{@link #getComplete() <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getComplete()
	 * @generated
	 * @ordered
	 */
	protected CompleteDirectory complete = COMPLETE_EDEFAULT;

	/**
	 * This is true if the Complete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean completeESet;

	/**
	 * The default value of the '{@link #getNext() <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected String next = NEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumEntries() <em>Num Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNumEntries()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUM_ENTRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumEntries() <em>Num Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNumEntries()
	 * @generated
	 * @ordered
	 */
	protected BigInteger numEntries = NUM_ENTRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrev() <em>Prev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrev()
	 * @generated
	 * @ordered
	 */
	protected static final String PREV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrev() <em>Prev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPrev()
	 * @generated
	 * @ordered
	 */
	protected String prev = PREV_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DirectoryImpl() {
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
		return CorePackage.Literals.DIRECTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Filter getDirectoryFilter() {
		return directoryFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDirectoryFilter(Filter newDirectoryFilter, NotificationChain msgs) {
		Filter oldDirectoryFilter = directoryFilter;
		directoryFilter = newDirectoryFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.DIRECTORY__DIRECTORY_FILTER, oldDirectoryFilter, newDirectoryFilter);
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
	public void setDirectoryFilter(Filter newDirectoryFilter) {
		if (newDirectoryFilter != directoryFilter) {
			NotificationChain msgs = null;
			if (directoryFilter != null) {
				msgs = ((InternalEObject) directoryFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.DIRECTORY__DIRECTORY_FILTER, null, msgs);
			}
			if (newDirectoryFilter != null) {
				msgs = ((InternalEObject) newDirectoryFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.DIRECTORY__DIRECTORY_FILTER, null, msgs);
			}
			msgs = basicSetDirectoryFilter(newDirectoryFilter, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.DIRECTORY__DIRECTORY_FILTER, newDirectoryFilter, newDirectoryFilter));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SortCriteria getSortCriteria() {
		return sortCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSortCriteria(SortCriteria newSortCriteria, NotificationChain msgs) {
		SortCriteria oldSortCriteria = sortCriteria;
		sortCriteria = newSortCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.DIRECTORY__SORT_CRITERIA, oldSortCriteria, newSortCriteria);
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
	public void setSortCriteria(SortCriteria newSortCriteria) {
		if (newSortCriteria != sortCriteria) {
			NotificationChain msgs = null;
			if (sortCriteria != null) {
				msgs = ((InternalEObject) sortCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.DIRECTORY__SORT_CRITERIA, null, msgs);
			}
			if (newSortCriteria != null) {
				msgs = ((InternalEObject) newSortCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.DIRECTORY__SORT_CRITERIA, null, msgs);
			}
			msgs = basicSetSortCriteria(newSortCriteria, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.DIRECTORY__SORT_CRITERIA, newSortCriteria, newSortCriteria));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompleteDirectory getComplete() {
		return complete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setComplete(CompleteDirectory newComplete) {
		CompleteDirectory oldComplete = complete;
		complete = newComplete == null
				? COMPLETE_EDEFAULT
				: newComplete;
		boolean oldCompleteESet = completeESet;
		completeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.DIRECTORY__COMPLETE, oldComplete, complete, !oldCompleteESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetComplete() {
		CompleteDirectory oldComplete = complete;
		boolean oldCompleteESet = completeESet;
		complete = COMPLETE_EDEFAULT;
		completeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CorePackage.DIRECTORY__COMPLETE, oldComplete, COMPLETE_EDEFAULT,
				oldCompleteESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetComplete() {
		return completeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNext(String newNext) {
		String oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DIRECTORY__NEXT, oldNext, next));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger getNumEntries() {
		return numEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNumEntries(BigInteger newNumEntries) {
		BigInteger oldNumEntries = numEntries;
		numEntries = newNumEntries;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.DIRECTORY__NUM_ENTRIES, oldNumEntries, numEntries));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPrev() {
		return prev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPrev(String newPrev) {
		String oldPrev = prev;
		prev = newPrev;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DIRECTORY__PREV, oldPrev, prev));
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
			case CorePackage.DIRECTORY__DIRECTORY_FILTER:
				return basicSetDirectoryFilter(null, msgs);
			case CorePackage.DIRECTORY__SORT_CRITERIA:
				return basicSetSortCriteria(null, msgs);
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
			case CorePackage.DIRECTORY__DIRECTORY_FILTER:
				return getDirectoryFilter();
			case CorePackage.DIRECTORY__SORT_CRITERIA:
				return getSortCriteria();
			case CorePackage.DIRECTORY__COMPLETE:
				return getComplete();
			case CorePackage.DIRECTORY__NEXT:
				return getNext();
			case CorePackage.DIRECTORY__NUM_ENTRIES:
				return getNumEntries();
			case CorePackage.DIRECTORY__PREV:
				return getPrev();
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
			case CorePackage.DIRECTORY__DIRECTORY_FILTER:
				setDirectoryFilter((Filter) newValue);
				return;
			case CorePackage.DIRECTORY__SORT_CRITERIA:
				setSortCriteria((SortCriteria) newValue);
				return;
			case CorePackage.DIRECTORY__COMPLETE:
				setComplete((CompleteDirectory) newValue);
				return;
			case CorePackage.DIRECTORY__NEXT:
				setNext((String) newValue);
				return;
			case CorePackage.DIRECTORY__NUM_ENTRIES:
				setNumEntries((BigInteger) newValue);
				return;
			case CorePackage.DIRECTORY__PREV:
				setPrev((String) newValue);
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
			case CorePackage.DIRECTORY__DIRECTORY_FILTER:
				setDirectoryFilter((Filter) null);
				return;
			case CorePackage.DIRECTORY__SORT_CRITERIA:
				setSortCriteria((SortCriteria) null);
				return;
			case CorePackage.DIRECTORY__COMPLETE:
				unsetComplete();
				return;
			case CorePackage.DIRECTORY__NEXT:
				setNext(NEXT_EDEFAULT);
				return;
			case CorePackage.DIRECTORY__NUM_ENTRIES:
				setNumEntries(NUM_ENTRIES_EDEFAULT);
				return;
			case CorePackage.DIRECTORY__PREV:
				setPrev(PREV_EDEFAULT);
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
			case CorePackage.DIRECTORY__DIRECTORY_FILTER:
				return directoryFilter != null;
			case CorePackage.DIRECTORY__SORT_CRITERIA:
				return sortCriteria != null;
			case CorePackage.DIRECTORY__COMPLETE:
				return isSetComplete();
			case CorePackage.DIRECTORY__NEXT:
				return NEXT_EDEFAULT == null
						? next != null
						: !NEXT_EDEFAULT.equals(next);
			case CorePackage.DIRECTORY__NUM_ENTRIES:
				return NUM_ENTRIES_EDEFAULT == null
						? numEntries != null
						: !NUM_ENTRIES_EDEFAULT.equals(numEntries);
			case CorePackage.DIRECTORY__PREV:
				return PREV_EDEFAULT == null
						? prev != null
						: !PREV_EDEFAULT.equals(prev);
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
		result.append(" (complete: ");
		if (completeESet) {
			result.append(complete);
		} else {
			result.append("<unset>");
		}
		result.append(", next: ");
		result.append(next);
		result.append(", numEntries: ");
		result.append(numEntries);
		result.append(", prev: ");
		result.append(prev);
		result.append(')');
		return result.toString();
	}

} // DirectoryImpl
