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

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.MifContent;
import org.openhealthtools.mdht.emf.hl7.mif2.ReplaceElementContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replace Element Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ReplaceElementContentImpl#getReplacementContent <em>Replacement Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplaceElementContentImpl extends ElementRefImpl implements ReplaceElementContent {
	/**
	 * The cached value of the '{@link #getReplacementContent() <em>Replacement Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementContent()
	 * @generated
	 * @ordered
	 */
	protected MifContent replacementContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplaceElementContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.REPLACE_ELEMENT_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MifContent getReplacementContent() {
		return replacementContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplacementContent(MifContent newReplacementContent, NotificationChain msgs) {
		MifContent oldReplacementContent = replacementContent;
		replacementContent = newReplacementContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.REPLACE_ELEMENT_CONTENT__REPLACEMENT_CONTENT,
				oldReplacementContent, newReplacementContent);
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
	public void setReplacementContent(MifContent newReplacementContent) {
		if (newReplacementContent != replacementContent) {
			NotificationChain msgs = null;
			if (replacementContent != null) {
				msgs = ((InternalEObject) replacementContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.REPLACE_ELEMENT_CONTENT__REPLACEMENT_CONTENT, null, msgs);
			}
			if (newReplacementContent != null) {
				msgs = ((InternalEObject) newReplacementContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.REPLACE_ELEMENT_CONTENT__REPLACEMENT_CONTENT, null, msgs);
			}
			msgs = basicSetReplacementContent(newReplacementContent, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.REPLACE_ELEMENT_CONTENT__REPLACEMENT_CONTENT,
				newReplacementContent, newReplacementContent));
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
			case Mif2Package.REPLACE_ELEMENT_CONTENT__REPLACEMENT_CONTENT:
				return basicSetReplacementContent(null, msgs);
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
			case Mif2Package.REPLACE_ELEMENT_CONTENT__REPLACEMENT_CONTENT:
				return getReplacementContent();
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
			case Mif2Package.REPLACE_ELEMENT_CONTENT__REPLACEMENT_CONTENT:
				setReplacementContent((MifContent) newValue);
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
			case Mif2Package.REPLACE_ELEMENT_CONTENT__REPLACEMENT_CONTENT:
				setReplacementContent((MifContent) null);
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
			case Mif2Package.REPLACE_ELEMENT_CONTENT__REPLACEMENT_CONTENT:
				return replacementContent != null;
		}
		return super.eIsSet(featureID);
	}

} // ReplaceElementContentImpl
