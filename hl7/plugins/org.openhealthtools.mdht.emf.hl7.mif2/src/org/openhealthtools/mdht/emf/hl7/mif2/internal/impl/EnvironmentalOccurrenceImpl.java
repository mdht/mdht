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

import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.EnvironmentalOccurrence;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.TransitionRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environmental Occurrence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.EnvironmentalOccurrenceImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.EnvironmentalOccurrenceImpl#getRelatedStateTransition <em>Related State Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentalOccurrenceImpl extends EObjectImpl implements EnvironmentalOccurrence {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected ComplexMarkupWithLanguage text;

	/**
	 * The cached value of the '{@link #getRelatedStateTransition() <em>Related State Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedStateTransition()
	 * @generated
	 * @ordered
	 */
	protected TransitionRef relatedStateTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentalOccurrenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ENVIRONMENTAL_OCCURRENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMarkupWithLanguage getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(ComplexMarkupWithLanguage newText, NotificationChain msgs) {
		ComplexMarkupWithLanguage oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.ENVIRONMENTAL_OCCURRENCE__TEXT, oldText, newText);
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
	public void setText(ComplexMarkupWithLanguage newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null) {
				msgs = ((InternalEObject) text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ENVIRONMENTAL_OCCURRENCE__TEXT, null, msgs);
			}
			if (newText != null) {
				msgs = ((InternalEObject) newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ENVIRONMENTAL_OCCURRENCE__TEXT, null, msgs);
			}
			msgs = basicSetText(newText, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ENVIRONMENTAL_OCCURRENCE__TEXT, newText, newText));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionRef getRelatedStateTransition() {
		return relatedStateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedStateTransition(TransitionRef newRelatedStateTransition,
			NotificationChain msgs) {
		TransitionRef oldRelatedStateTransition = relatedStateTransition;
		relatedStateTransition = newRelatedStateTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.ENVIRONMENTAL_OCCURRENCE__RELATED_STATE_TRANSITION,
				oldRelatedStateTransition, newRelatedStateTransition);
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
	public void setRelatedStateTransition(TransitionRef newRelatedStateTransition) {
		if (newRelatedStateTransition != relatedStateTransition) {
			NotificationChain msgs = null;
			if (relatedStateTransition != null) {
				msgs = ((InternalEObject) relatedStateTransition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ENVIRONMENTAL_OCCURRENCE__RELATED_STATE_TRANSITION, null, msgs);
			}
			if (newRelatedStateTransition != null) {
				msgs = ((InternalEObject) newRelatedStateTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.ENVIRONMENTAL_OCCURRENCE__RELATED_STATE_TRANSITION, null, msgs);
			}
			msgs = basicSetRelatedStateTransition(newRelatedStateTransition, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ENVIRONMENTAL_OCCURRENCE__RELATED_STATE_TRANSITION,
				newRelatedStateTransition, newRelatedStateTransition));
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
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE__TEXT:
				return basicSetText(null, msgs);
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE__RELATED_STATE_TRANSITION:
				return basicSetRelatedStateTransition(null, msgs);
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
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE__TEXT:
				return getText();
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE__RELATED_STATE_TRANSITION:
				return getRelatedStateTransition();
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
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE__TEXT:
				setText((ComplexMarkupWithLanguage) newValue);
				return;
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE__RELATED_STATE_TRANSITION:
				setRelatedStateTransition((TransitionRef) newValue);
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
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE__TEXT:
				setText((ComplexMarkupWithLanguage) null);
				return;
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE__RELATED_STATE_TRANSITION:
				setRelatedStateTransition((TransitionRef) null);
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
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE__TEXT:
				return text != null;
			case Mif2Package.ENVIRONMENTAL_OCCURRENCE__RELATED_STATE_TRANSITION:
				return relatedStateTransition != null;
		}
		return super.eIsSet(featureID);
	}

} // EnvironmentalOccurrenceImpl
