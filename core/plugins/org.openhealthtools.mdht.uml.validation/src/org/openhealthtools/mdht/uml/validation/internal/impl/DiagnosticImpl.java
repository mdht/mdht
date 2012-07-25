/**
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 */
package org.openhealthtools.mdht.uml.validation.internal.impl;

import org.eclipse.core.runtime.IStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.validation.IValidationContext;

import org.eclipse.uml2.uml.Constraint;

import org.openhealthtools.mdht.uml.validation.ConstraintProvider;
import org.openhealthtools.mdht.uml.validation.Diagnostic;
import org.openhealthtools.mdht.uml.validation.EvaluationModeKind;
import org.openhealthtools.mdht.uml.validation.SeverityKind;
import org.openhealthtools.mdht.uml.validation.ValidationPackage;

import org.openhealthtools.mdht.uml.validation.internal.operations.DiagnosticOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.validation.internal.impl.DiagnosticImpl#getBase_Constraint <em>Base Constraint</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.validation.internal.impl.DiagnosticImpl#getEvaluationMode <em>Evaluation Mode</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.validation.internal.impl.DiagnosticImpl#getSeverity <em>Severity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.validation.internal.impl.DiagnosticImpl#getCode <em>Code</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.validation.internal.impl.DiagnosticImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DiagnosticImpl extends EObjectImpl implements Diagnostic {
	/**
	 * The cached value of the '{@link #getBase_Constraint() <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Constraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint base_Constraint;

	/**
	 * The default value of the '{@link #getEvaluationMode() <em>Evaluation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEvaluationMode()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationModeKind EVALUATION_MODE_EDEFAULT = EvaluationModeKind.BATCH;

	/**
	 * The cached value of the '{@link #getEvaluationMode() <em>Evaluation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEvaluationMode()
	 * @generated
	 * @ordered
	 */
	protected EvaluationModeKind evaluationMode = EVALUATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final SeverityKind SEVERITY_EDEFAULT = SeverityKind.ERROR;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected SeverityKind severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected int code = CODE_EDEFAULT;

	/**
	 * The flag representing whether the Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DiagnosticImpl() {
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
		return ValidationPackage.Literals.DIAGNOSTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Constraint getBase_Constraint() {
		if (base_Constraint != null && base_Constraint.eIsProxy()) {
			InternalEObject oldBase_Constraint = (InternalEObject) base_Constraint;
			base_Constraint = (Constraint) eResolveProxy(oldBase_Constraint);
			if (base_Constraint != oldBase_Constraint) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, ValidationPackage.DIAGNOSTIC__BASE_CONSTRAINT, oldBase_Constraint,
						base_Constraint));
				}
			}
		}
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Constraint basicGetBase_Constraint() {
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBase_Constraint(Constraint newBase_Constraint) {
		Constraint oldBase_Constraint = base_Constraint;
		base_Constraint = newBase_Constraint;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.DIAGNOSTIC__BASE_CONSTRAINT, oldBase_Constraint,
				base_Constraint));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EvaluationModeKind getEvaluationMode() {
		return evaluationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEvaluationMode(EvaluationModeKind newEvaluationMode) {
		EvaluationModeKind oldEvaluationMode = evaluationMode;
		evaluationMode = newEvaluationMode == null
				? EVALUATION_MODE_EDEFAULT
				: newEvaluationMode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.DIAGNOSTIC__EVALUATION_MODE, oldEvaluationMode,
				evaluationMode));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SeverityKind getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSeverity(SeverityKind newSeverity) {
		SeverityKind oldSeverity = severity;
		severity = newSeverity == null
				? SEVERITY_EDEFAULT
				: newSeverity;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.DIAGNOSTIC__SEVERITY, oldSeverity, severity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCode(int newCode) {
		int oldCode = code;
		code = newCode;
		boolean oldCodeESet = (eFlags & CODE_ESETFLAG) != 0;
		eFlags |= CODE_ESETFLAG;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.DIAGNOSTIC__CODE, oldCode, code, !oldCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetCode() {
		int oldCode = code;
		boolean oldCodeESet = (eFlags & CODE_ESETFLAG) != 0;
		code = CODE_EDEFAULT;
		eFlags &= ~CODE_ESETFLAG;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, ValidationPackage.DIAGNOSTIC__CODE, oldCode, CODE_EDEFAULT, oldCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetCode() {
		return (eFlags & CODE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValidationPackage.DIAGNOSTIC__MESSAGE, oldMessage, message));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IStatus fail(IValidationContext context, EObject target) {
		return DiagnosticOperations.fail(this, context, target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IStatus fail(IValidationContext context, EObject target, EList<EObject> related) {
		return DiagnosticOperations.fail(this, context, target, related);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EClass> getTargets() {
		return DiagnosticOperations.getTargets(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean targets(EObject object) {
		return DiagnosticOperations.targets(this, object);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConstraintProvider getConstraintProvider() {
		return DiagnosticOperations.getConstraintProvider(this);
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
			case ValidationPackage.DIAGNOSTIC__BASE_CONSTRAINT:
				if (resolve) {
					return getBase_Constraint();
				}
				return basicGetBase_Constraint();
			case ValidationPackage.DIAGNOSTIC__EVALUATION_MODE:
				return getEvaluationMode();
			case ValidationPackage.DIAGNOSTIC__SEVERITY:
				return getSeverity();
			case ValidationPackage.DIAGNOSTIC__CODE:
				return getCode();
			case ValidationPackage.DIAGNOSTIC__MESSAGE:
				return getMessage();
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
			case ValidationPackage.DIAGNOSTIC__BASE_CONSTRAINT:
				setBase_Constraint((Constraint) newValue);
				return;
			case ValidationPackage.DIAGNOSTIC__EVALUATION_MODE:
				setEvaluationMode((EvaluationModeKind) newValue);
				return;
			case ValidationPackage.DIAGNOSTIC__SEVERITY:
				setSeverity((SeverityKind) newValue);
				return;
			case ValidationPackage.DIAGNOSTIC__CODE:
				setCode((Integer) newValue);
				return;
			case ValidationPackage.DIAGNOSTIC__MESSAGE:
				setMessage((String) newValue);
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
			case ValidationPackage.DIAGNOSTIC__BASE_CONSTRAINT:
				setBase_Constraint((Constraint) null);
				return;
			case ValidationPackage.DIAGNOSTIC__EVALUATION_MODE:
				setEvaluationMode(EVALUATION_MODE_EDEFAULT);
				return;
			case ValidationPackage.DIAGNOSTIC__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case ValidationPackage.DIAGNOSTIC__CODE:
				unsetCode();
				return;
			case ValidationPackage.DIAGNOSTIC__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
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
			case ValidationPackage.DIAGNOSTIC__BASE_CONSTRAINT:
				return base_Constraint != null;
			case ValidationPackage.DIAGNOSTIC__EVALUATION_MODE:
				return evaluationMode != EVALUATION_MODE_EDEFAULT;
			case ValidationPackage.DIAGNOSTIC__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case ValidationPackage.DIAGNOSTIC__CODE:
				return isSetCode();
			case ValidationPackage.DIAGNOSTIC__MESSAGE:
				return MESSAGE_EDEFAULT == null
						? message != null
						: !MESSAGE_EDEFAULT.equals(message);
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
		result.append(" (evaluationMode: "); //$NON-NLS-1$
		result.append(evaluationMode);
		result.append(", severity: "); //$NON-NLS-1$
		result.append(severity);
		result.append(", code: "); //$NON-NLS-1$
		if ((eFlags & CODE_ESETFLAG) != 0) {
			result.append(code);
		} else {
			result.append("<unset>"); //$NON-NLS-1$
		}
		result.append(", message: "); //$NON-NLS-1$
		result.append(message);
		result.append(')');
		return result.toString();
	}

} // DiagnosticImpl
