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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.RenderingInformation;
import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rendering Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.RenderingInformationImpl#getRenderingNotes <em>Rendering Notes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.RenderingInformationImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.RenderingInformationImpl#getRenderingTime <em>Rendering Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenderingInformationImpl extends EObjectImpl implements RenderingInformation {
	/**
	 * The cached value of the '{@link #getRenderingNotes() <em>Rendering Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderingNotes()
	 * @generated
	 * @ordered
	 */
	protected Flow renderingNotes;

	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRenderingTime() <em>Rendering Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderingTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RENDERING_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRenderingTime() <em>Rendering Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderingTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar renderingTime = RENDERING_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderingInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.RENDERING_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getRenderingNotes() {
		return renderingNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenderingNotes(Flow newRenderingNotes, NotificationChain msgs) {
		Flow oldRenderingNotes = renderingNotes;
		renderingNotes = newRenderingNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.RENDERING_INFORMATION__RENDERING_NOTES, oldRenderingNotes,
				newRenderingNotes);
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
	public void setRenderingNotes(Flow newRenderingNotes) {
		if (newRenderingNotes != renderingNotes) {
			NotificationChain msgs = null;
			if (renderingNotes != null) {
				msgs = ((InternalEObject) renderingNotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.RENDERING_INFORMATION__RENDERING_NOTES, null, msgs);
			}
			if (newRenderingNotes != null) {
				msgs = ((InternalEObject) newRenderingNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.RENDERING_INFORMATION__RENDERING_NOTES, null, msgs);
			}
			msgs = basicSetRenderingNotes(newRenderingNotes, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.RENDERING_INFORMATION__RENDERING_NOTES, newRenderingNotes,
				newRenderingNotes));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.RENDERING_INFORMATION__APPLICATION, oldApplication, application));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getRenderingTime() {
		return renderingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRenderingTime(XMLGregorianCalendar newRenderingTime) {
		XMLGregorianCalendar oldRenderingTime = renderingTime;
		renderingTime = newRenderingTime;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.RENDERING_INFORMATION__RENDERING_TIME, oldRenderingTime,
				renderingTime));
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
			case Mif2Package.RENDERING_INFORMATION__RENDERING_NOTES:
				return basicSetRenderingNotes(null, msgs);
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
			case Mif2Package.RENDERING_INFORMATION__RENDERING_NOTES:
				return getRenderingNotes();
			case Mif2Package.RENDERING_INFORMATION__APPLICATION:
				return getApplication();
			case Mif2Package.RENDERING_INFORMATION__RENDERING_TIME:
				return getRenderingTime();
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
			case Mif2Package.RENDERING_INFORMATION__RENDERING_NOTES:
				setRenderingNotes((Flow) newValue);
				return;
			case Mif2Package.RENDERING_INFORMATION__APPLICATION:
				setApplication((String) newValue);
				return;
			case Mif2Package.RENDERING_INFORMATION__RENDERING_TIME:
				setRenderingTime((XMLGregorianCalendar) newValue);
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
			case Mif2Package.RENDERING_INFORMATION__RENDERING_NOTES:
				setRenderingNotes((Flow) null);
				return;
			case Mif2Package.RENDERING_INFORMATION__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case Mif2Package.RENDERING_INFORMATION__RENDERING_TIME:
				setRenderingTime(RENDERING_TIME_EDEFAULT);
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
			case Mif2Package.RENDERING_INFORMATION__RENDERING_NOTES:
				return renderingNotes != null;
			case Mif2Package.RENDERING_INFORMATION__APPLICATION:
				return APPLICATION_EDEFAULT == null
						? application != null
						: !APPLICATION_EDEFAULT.equals(application);
			case Mif2Package.RENDERING_INFORMATION__RENDERING_TIME:
				return RENDERING_TIME_EDEFAULT == null
						? renderingTime != null
						: !RENDERING_TIME_EDEFAULT.equals(renderingTime);
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
		result.append(" (application: ");
		result.append(application);
		result.append(", renderingTime: ");
		result.append(renderingTime);
		result.append(')');
		return result.toString();
	}

} // RenderingInformationImpl
