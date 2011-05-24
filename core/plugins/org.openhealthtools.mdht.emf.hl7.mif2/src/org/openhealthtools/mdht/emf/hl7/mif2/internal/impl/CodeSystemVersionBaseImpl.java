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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionBase;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.TerminologyServer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Version Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionBaseImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionBaseImpl#getPublicTerminologyServer <em>Public Terminology Server</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionBaseImpl#getSupportedLanguage <em>Supported Language</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionBaseImpl#isHl7ApprovedIndicator <em>Hl7 Approved Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionBaseImpl#isHl7MaintainedIndicator <em>Hl7 Maintained Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionBaseImpl#getPublisherVersionId <em>Publisher Version Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSystemVersionBaseImpl#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CodeSystemVersionBaseImpl extends ModelElementImpl implements CodeSystemVersionBase {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionAnnotations annotations;

	/**
	 * The cached value of the '{@link #getPublicTerminologyServer() <em>Public Terminology Server</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicTerminologyServer()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyServer> publicTerminologyServer;

	/**
	 * The cached value of the '{@link #getSupportedLanguage() <em>Supported Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedLanguage;

	/**
	 * The default value of the '{@link #isHl7ApprovedIndicator() <em>Hl7 Approved Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHl7ApprovedIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HL7_APPROVED_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHl7ApprovedIndicator() <em>Hl7 Approved Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHl7ApprovedIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean hl7ApprovedIndicator = HL7_APPROVED_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Hl7 Approved Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hl7ApprovedIndicatorESet;

	/**
	 * The default value of the '{@link #isHl7MaintainedIndicator() <em>Hl7 Maintained Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHl7MaintainedIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HL7_MAINTAINED_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHl7MaintainedIndicator() <em>Hl7 Maintained Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHl7MaintainedIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean hl7MaintainedIndicator = HL7_MAINTAINED_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Hl7 Maintained Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hl7MaintainedIndicatorESet;

	/**
	 * The default value of the '{@link #getPublisherVersionId() <em>Publisher Version Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherVersionId()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_VERSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherVersionId() <em>Publisher Version Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherVersionId()
	 * @generated
	 * @ordered
	 */
	protected String publisherVersionId = PUBLISHER_VERSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSystemVersionBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CODE_SYSTEM_VERSION_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystemVersionAnnotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(CodeSystemVersionAnnotations newAnnotations, NotificationChain msgs) {
		CodeSystemVersionAnnotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CODE_SYSTEM_VERSION_BASE__ANNOTATIONS, oldAnnotations,
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
	public void setAnnotations(CodeSystemVersionAnnotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null) {
				msgs = ((InternalEObject) annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CODE_SYSTEM_VERSION_BASE__ANNOTATIONS, null, msgs);
			}
			if (newAnnotations != null) {
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CODE_SYSTEM_VERSION_BASE__ANNOTATIONS, null, msgs);
			}
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CODE_SYSTEM_VERSION_BASE__ANNOTATIONS, newAnnotations,
				newAnnotations));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyServer> getPublicTerminologyServer() {
		if (publicTerminologyServer == null) {
			publicTerminologyServer = new EObjectContainmentEList<TerminologyServer>(
				TerminologyServer.class, this, Mif2Package.CODE_SYSTEM_VERSION_BASE__PUBLIC_TERMINOLOGY_SERVER);
		}
		return publicTerminologyServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSupportedLanguage() {
		if (supportedLanguage == null) {
			supportedLanguage = new EDataTypeEList<String>(
				String.class, this, Mif2Package.CODE_SYSTEM_VERSION_BASE__SUPPORTED_LANGUAGE);
		}
		return supportedLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHl7ApprovedIndicator() {
		return hl7ApprovedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHl7ApprovedIndicator(boolean newHl7ApprovedIndicator) {
		boolean oldHl7ApprovedIndicator = hl7ApprovedIndicator;
		hl7ApprovedIndicator = newHl7ApprovedIndicator;
		boolean oldHl7ApprovedIndicatorESet = hl7ApprovedIndicatorESet;
		hl7ApprovedIndicatorESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CODE_SYSTEM_VERSION_BASE__HL7_APPROVED_INDICATOR,
				oldHl7ApprovedIndicator, hl7ApprovedIndicator, !oldHl7ApprovedIndicatorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHl7ApprovedIndicator() {
		boolean oldHl7ApprovedIndicator = hl7ApprovedIndicator;
		boolean oldHl7ApprovedIndicatorESet = hl7ApprovedIndicatorESet;
		hl7ApprovedIndicator = HL7_APPROVED_INDICATOR_EDEFAULT;
		hl7ApprovedIndicatorESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.CODE_SYSTEM_VERSION_BASE__HL7_APPROVED_INDICATOR,
				oldHl7ApprovedIndicator, HL7_APPROVED_INDICATOR_EDEFAULT, oldHl7ApprovedIndicatorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHl7ApprovedIndicator() {
		return hl7ApprovedIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHl7MaintainedIndicator() {
		return hl7MaintainedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHl7MaintainedIndicator(boolean newHl7MaintainedIndicator) {
		boolean oldHl7MaintainedIndicator = hl7MaintainedIndicator;
		hl7MaintainedIndicator = newHl7MaintainedIndicator;
		boolean oldHl7MaintainedIndicatorESet = hl7MaintainedIndicatorESet;
		hl7MaintainedIndicatorESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CODE_SYSTEM_VERSION_BASE__HL7_MAINTAINED_INDICATOR,
				oldHl7MaintainedIndicator, hl7MaintainedIndicator, !oldHl7MaintainedIndicatorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHl7MaintainedIndicator() {
		boolean oldHl7MaintainedIndicator = hl7MaintainedIndicator;
		boolean oldHl7MaintainedIndicatorESet = hl7MaintainedIndicatorESet;
		hl7MaintainedIndicator = HL7_MAINTAINED_INDICATOR_EDEFAULT;
		hl7MaintainedIndicatorESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.CODE_SYSTEM_VERSION_BASE__HL7_MAINTAINED_INDICATOR,
				oldHl7MaintainedIndicator, HL7_MAINTAINED_INDICATOR_EDEFAULT, oldHl7MaintainedIndicatorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHl7MaintainedIndicator() {
		return hl7MaintainedIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisherVersionId() {
		return publisherVersionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherVersionId(String newPublisherVersionId) {
		String oldPublisherVersionId = publisherVersionId;
		publisherVersionId = newPublisherVersionId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CODE_SYSTEM_VERSION_BASE__PUBLISHER_VERSION_ID,
				oldPublisherVersionId, publisherVersionId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseDate(XMLGregorianCalendar newReleaseDate) {
		XMLGregorianCalendar oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CODE_SYSTEM_VERSION_BASE__RELEASE_DATE, oldReleaseDate, releaseDate));
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
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__PUBLIC_TERMINOLOGY_SERVER:
				return ((InternalEList<?>) getPublicTerminologyServer()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__ANNOTATIONS:
				return getAnnotations();
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__PUBLIC_TERMINOLOGY_SERVER:
				return getPublicTerminologyServer();
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__SUPPORTED_LANGUAGE:
				return getSupportedLanguage();
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__HL7_APPROVED_INDICATOR:
				return isHl7ApprovedIndicator()
						? Boolean.TRUE
						: Boolean.FALSE;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__HL7_MAINTAINED_INDICATOR:
				return isHl7MaintainedIndicator()
						? Boolean.TRUE
						: Boolean.FALSE;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__PUBLISHER_VERSION_ID:
				return getPublisherVersionId();
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__RELEASE_DATE:
				return getReleaseDate();
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
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__ANNOTATIONS:
				setAnnotations((CodeSystemVersionAnnotations) newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__PUBLIC_TERMINOLOGY_SERVER:
				getPublicTerminologyServer().clear();
				getPublicTerminologyServer().addAll((Collection<? extends TerminologyServer>) newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__SUPPORTED_LANGUAGE:
				getSupportedLanguage().clear();
				getSupportedLanguage().addAll((Collection<? extends String>) newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__HL7_APPROVED_INDICATOR:
				setHl7ApprovedIndicator(((Boolean) newValue).booleanValue());
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__HL7_MAINTAINED_INDICATOR:
				setHl7MaintainedIndicator(((Boolean) newValue).booleanValue());
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__PUBLISHER_VERSION_ID:
				setPublisherVersionId((String) newValue);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__RELEASE_DATE:
				setReleaseDate((XMLGregorianCalendar) newValue);
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
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__ANNOTATIONS:
				setAnnotations((CodeSystemVersionAnnotations) null);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__PUBLIC_TERMINOLOGY_SERVER:
				getPublicTerminologyServer().clear();
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__SUPPORTED_LANGUAGE:
				getSupportedLanguage().clear();
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__HL7_APPROVED_INDICATOR:
				unsetHl7ApprovedIndicator();
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__HL7_MAINTAINED_INDICATOR:
				unsetHl7MaintainedIndicator();
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__PUBLISHER_VERSION_ID:
				setPublisherVersionId(PUBLISHER_VERSION_ID_EDEFAULT);
				return;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
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
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__ANNOTATIONS:
				return annotations != null;
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__PUBLIC_TERMINOLOGY_SERVER:
				return publicTerminologyServer != null && !publicTerminologyServer.isEmpty();
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__SUPPORTED_LANGUAGE:
				return supportedLanguage != null && !supportedLanguage.isEmpty();
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__HL7_APPROVED_INDICATOR:
				return isSetHl7ApprovedIndicator();
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__HL7_MAINTAINED_INDICATOR:
				return isSetHl7MaintainedIndicator();
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__PUBLISHER_VERSION_ID:
				return PUBLISHER_VERSION_ID_EDEFAULT == null
						? publisherVersionId != null
						: !PUBLISHER_VERSION_ID_EDEFAULT.equals(publisherVersionId);
			case Mif2Package.CODE_SYSTEM_VERSION_BASE__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null
						? releaseDate != null
						: !RELEASE_DATE_EDEFAULT.equals(releaseDate);
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
		result.append(" (supportedLanguage: ");
		result.append(supportedLanguage);
		result.append(", hl7ApprovedIndicator: ");
		if (hl7ApprovedIndicatorESet) {
			result.append(hl7ApprovedIndicator);
		} else {
			result.append("<unset>");
		}
		result.append(", hl7MaintainedIndicator: ");
		if (hl7MaintainedIndicatorESet) {
			result.append(hl7MaintainedIndicator);
		} else {
			result.append("<unset>");
		}
		result.append(", publisherVersionId: ");
		result.append(publisherVersionId);
		result.append(", releaseDate: ");
		result.append(releaseDate);
		result.append(')');
		return result.toString();
	}

} // CodeSystemVersionBaseImpl
