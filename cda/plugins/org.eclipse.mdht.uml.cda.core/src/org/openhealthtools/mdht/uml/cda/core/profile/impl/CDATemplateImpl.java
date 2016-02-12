/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.profile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.CDATemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CDATemplateImpl#getTemplateId <em>Template Id</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CDATemplateImpl#getAssigningAuthorityName <em>Assigning Authority Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CDATemplateImpl#isContextDependent <em>Context Dependent</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CDATemplateImpl#getTemplateVersion <em>Template Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CDATemplateImpl#getTemplateMultiplicity <em>Template Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CDATemplateImpl extends ClassValidationImpl implements CDATemplate {
	/**
	 * The default value of the '{@link #getTemplateId() <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateId() <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected String templateId = TEMPLATE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssigningAuthorityName() <em>Assigning Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssigningAuthorityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNING_AUTHORITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssigningAuthorityName() <em>Assigning Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssigningAuthorityName()
	 * @generated
	 * @ordered
	 */
	protected String assigningAuthorityName = ASSIGNING_AUTHORITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isContextDependent() <em>Context Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isContextDependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTEXT_DEPENDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContextDependent() <em>Context Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isContextDependent()
	 * @generated
	 * @ordered
	 */
	protected boolean contextDependent = CONTEXT_DEPENDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateVersion() <em>Template Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTemplateVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateVersion() <em>Template Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTemplateVersion()
	 * @generated
	 * @ordered
	 */
	protected String templateVersion = TEMPLATE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateMultiplicity() <em>Template Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTemplateMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateMultiplicity() <em>Template Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTemplateMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String templateMultiplicity = TEMPLATE_MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CDATemplateImpl() {
		super();
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
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_ID:
				return getTemplateId();
			case CDAPackage.CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME:
				return getAssigningAuthorityName();
			case CDAPackage.CDA_TEMPLATE__CONTEXT_DEPENDENT:
				return isContextDependent();
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_VERSION:
				return getTemplateVersion();
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_MULTIPLICITY:
				return getTemplateMultiplicity();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_ID:
				return TEMPLATE_ID_EDEFAULT == null
						? templateId != null
						: !TEMPLATE_ID_EDEFAULT.equals(templateId);
			case CDAPackage.CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME:
				return ASSIGNING_AUTHORITY_NAME_EDEFAULT == null
						? assigningAuthorityName != null
						: !ASSIGNING_AUTHORITY_NAME_EDEFAULT.equals(assigningAuthorityName);
			case CDAPackage.CDA_TEMPLATE__CONTEXT_DEPENDENT:
				return contextDependent != CONTEXT_DEPENDENT_EDEFAULT;
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_VERSION:
				return TEMPLATE_VERSION_EDEFAULT == null
						? templateVersion != null
						: !TEMPLATE_VERSION_EDEFAULT.equals(templateVersion);
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_MULTIPLICITY:
				return TEMPLATE_MULTIPLICITY_EDEFAULT == null
						? templateMultiplicity != null
						: !TEMPLATE_MULTIPLICITY_EDEFAULT.equals(templateMultiplicity);
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_ID:
				setTemplateId((String) newValue);
				return;
			case CDAPackage.CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME:
				setAssigningAuthorityName((String) newValue);
				return;
			case CDAPackage.CDA_TEMPLATE__CONTEXT_DEPENDENT:
				setContextDependent((Boolean) newValue);
				return;
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_VERSION:
				setTemplateVersion((String) newValue);
				return;
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_MULTIPLICITY:
				setTemplateMultiplicity((String) newValue);
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
	protected EClass eStaticClass() {
		return CDAPackage.Literals.CDA_TEMPLATE;
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
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_ID:
				setTemplateId(TEMPLATE_ID_EDEFAULT);
				return;
			case CDAPackage.CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME:
				setAssigningAuthorityName(ASSIGNING_AUTHORITY_NAME_EDEFAULT);
				return;
			case CDAPackage.CDA_TEMPLATE__CONTEXT_DEPENDENT:
				setContextDependent(CONTEXT_DEPENDENT_EDEFAULT);
				return;
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_VERSION:
				setTemplateVersion(TEMPLATE_VERSION_EDEFAULT);
				return;
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_MULTIPLICITY:
				setTemplateMultiplicity(TEMPLATE_MULTIPLICITY_EDEFAULT);
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
	public String getAssigningAuthorityName() {
		return assigningAuthorityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTemplateId() {
		return templateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isContextDependent() {
		return contextDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssigningAuthorityName(String newAssigningAuthorityName) {
		String oldAssigningAuthorityName = assigningAuthorityName;
		assigningAuthorityName = newAssigningAuthorityName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME, oldAssigningAuthorityName,
				assigningAuthorityName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContextDependent(boolean newContextDependent) {
		boolean oldContextDependent = contextDependent;
		contextDependent = newContextDependent;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CDA_TEMPLATE__CONTEXT_DEPENDENT, oldContextDependent,
				contextDependent));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTemplateVersion() {
		return templateVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTemplateVersion(String newTemplateVersion) {
		String oldTemplateVersion = templateVersion;
		templateVersion = newTemplateVersion;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CDA_TEMPLATE__TEMPLATE_VERSION, oldTemplateVersion, templateVersion));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTemplateMultiplicity() {
		return templateMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTemplateMultiplicity(String newTemplateMultiplicity) {
		String oldTemplateMultiplicity = templateMultiplicity;
		templateMultiplicity = newTemplateMultiplicity;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CDA_TEMPLATE__TEMPLATE_MULTIPLICITY, oldTemplateMultiplicity,
				templateMultiplicity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTemplateId(String newTemplateId) {
		String oldTemplateId = templateId;
		templateId = newTemplateId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CDA_TEMPLATE__TEMPLATE_ID, oldTemplateId, templateId));
		}
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
		result.append(" (templateId: ");
		result.append(templateId);
		result.append(", assigningAuthorityName: ");
		result.append(assigningAuthorityName);
		result.append(", contextDependent: ");
		result.append(contextDependent);
		result.append(", templateVersion: ");
		result.append(templateVersion);
		result.append(", templateMultiplicity: ");
		result.append(templateMultiplicity);
		result.append(')');
		return result.toString();
	}

} // CDATemplateImpl
