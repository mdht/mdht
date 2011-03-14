/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.core.profile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeSystemConstraintImpl extends org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemConstraintImpl implements CodeSystemConstraint {
	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final SeverityKind SEVERITY_EDEFAULT = SeverityKind.ERROR;
	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected SeverityKind severity = SEVERITY_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRuleId() <em>Rule Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleId()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ruleId;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSystemConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.CODE_SYSTEM_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityKind getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(SeverityKind newSeverity) {
		SeverityKind oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRuleId() {
		if (ruleId == null) {
			ruleId = new EDataTypeUniqueEList<String>(String.class, this, CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID);
		}
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE:
				return getMessage();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY:
				return getSeverity();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID:
				return getRuleId();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY:
				return isMandatory();
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
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE:
				setMessage((String)newValue);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY:
				setSeverity((SeverityKind)newValue);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID:
				getRuleId().clear();
				getRuleId().addAll((Collection<? extends String>)newValue);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY:
				setMandatory((Boolean)newValue);
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
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID:
				getRuleId().clear();
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
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
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID:
				return ruleId != null && !ruleId.isEmpty();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Validation.class) {
			switch (derivedFeatureID) {
				case CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE: return CDAPackage.VALIDATION__MESSAGE;
				case CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY: return CDAPackage.VALIDATION__SEVERITY;
				case CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID: return CDAPackage.VALIDATION__RULE_ID;
				case CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY: return CDAPackage.VALIDATION__MANDATORY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Validation.class) {
			switch (baseFeatureID) {
				case CDAPackage.VALIDATION__MESSAGE: return CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE;
				case CDAPackage.VALIDATION__SEVERITY: return CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY;
				case CDAPackage.VALIDATION__RULE_ID: return CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID;
				case CDAPackage.VALIDATION__MANDATORY: return CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (message: ");
		result.append(message);
		result.append(", severity: ");
		result.append(severity);
		result.append(", ruleId: ");
		result.append(ruleId);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(')');
		return result.toString();
	}

} //CodeSystemConstraintImpl
