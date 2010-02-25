/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.cdaprofile.CDATemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDATemplateImpl#getTemplateId <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDATemplateImpl#getAssigningAuthorityName <em>Assigning Authority Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.cdaprofile.impl.CDATemplateImpl#isContextDependent <em>Context Dependent</em>}</li>
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
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateId() <em>Template Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected String templateId = TEMPLATE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssigningAuthorityName() <em>Assigning Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigningAuthorityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNING_AUTHORITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssigningAuthorityName() <em>Assigning Authority Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigningAuthorityName()
	 * @generated
	 * @ordered
	 */
	protected String assigningAuthorityName = ASSIGNING_AUTHORITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isContextDependent() <em>Context Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContextDependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTEXT_DEPENDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContextDependent() <em>Context Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContextDependent()
	 * @generated
	 * @ordered
	 */
	protected boolean contextDependent = CONTEXT_DEPENDENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDATemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.CDA_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateId() {
		return templateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateId(String newTemplateId) {
		String oldTemplateId = templateId;
		templateId = newTemplateId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CDA_TEMPLATE__TEMPLATE_ID, oldTemplateId, templateId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssigningAuthorityName() {
		return assigningAuthorityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssigningAuthorityName(String newAssigningAuthorityName) {
		String oldAssigningAuthorityName = assigningAuthorityName;
		assigningAuthorityName = newAssigningAuthorityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME, oldAssigningAuthorityName, assigningAuthorityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContextDependent() {
		return contextDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextDependent(boolean newContextDependent) {
		boolean oldContextDependent = contextDependent;
		contextDependent = newContextDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CDA_TEMPLATE__CONTEXT_DEPENDENT, oldContextDependent, contextDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
				return isContextDependent() ? Boolean.TRUE : Boolean.FALSE;
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
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_ID:
				setTemplateId((String)newValue);
				return;
			case CDAPackage.CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME:
				setAssigningAuthorityName((String)newValue);
				return;
			case CDAPackage.CDA_TEMPLATE__CONTEXT_DEPENDENT:
				setContextDependent(((Boolean)newValue).booleanValue());
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
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_ID:
				setTemplateId(TEMPLATE_ID_EDEFAULT);
				return;
			case CDAPackage.CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME:
				setAssigningAuthorityName(ASSIGNING_AUTHORITY_NAME_EDEFAULT);
				return;
			case CDAPackage.CDA_TEMPLATE__CONTEXT_DEPENDENT:
				setContextDependent(CONTEXT_DEPENDENT_EDEFAULT);
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
			case CDAPackage.CDA_TEMPLATE__TEMPLATE_ID:
				return TEMPLATE_ID_EDEFAULT == null ? templateId != null : !TEMPLATE_ID_EDEFAULT.equals(templateId);
			case CDAPackage.CDA_TEMPLATE__ASSIGNING_AUTHORITY_NAME:
				return ASSIGNING_AUTHORITY_NAME_EDEFAULT == null ? assigningAuthorityName != null : !ASSIGNING_AUTHORITY_NAME_EDEFAULT.equals(assigningAuthorityName);
			case CDAPackage.CDA_TEMPLATE__CONTEXT_DEPENDENT:
				return contextDependent != CONTEXT_DEPENDENT_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (templateId: ");
		result.append(templateId);
		result.append(", assigningAuthorityName: ");
		result.append(assigningAuthorityName);
		result.append(", contextDependent: ");
		result.append(contextDependent);
		result.append(')');
		return result.toString();
	}

} //CDATemplateImpl
