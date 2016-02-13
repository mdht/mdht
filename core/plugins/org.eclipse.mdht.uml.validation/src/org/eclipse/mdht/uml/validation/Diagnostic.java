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
package org.eclipse.mdht.uml.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.validation.Diagnostic#getBase_Constraint <em>Base Constraint</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.Diagnostic#getEvaluationMode <em>Evaluation Mode</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.Diagnostic#getSeverity <em>Severity</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.Diagnostic#getCode <em>Code</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.validation.Diagnostic#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getDiagnostic()
 * @model
 * @generated
 */
public interface Diagnostic extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Constraint</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Base Constraint</em>' reference.
	 * @see #setBase_Constraint(Constraint)
	 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getDiagnostic_Base_Constraint()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Constraint getBase_Constraint();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.validation.Diagnostic#getBase_Constraint <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Base Constraint</em>' reference.
	 * @see #getBase_Constraint()
	 * @generated
	 */
	void setBase_Constraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Evaluation Mode</b></em>' attribute.
	 * The default value is <code>"batch"</code>.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.validation.EvaluationModeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Mode</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Evaluation Mode</em>' attribute.
	 * @see org.eclipse.mdht.uml.validation.EvaluationModeKind
	 * @see #setEvaluationMode(EvaluationModeKind)
	 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getDiagnostic_EvaluationMode()
	 * @model default="batch" required="true" ordered="false"
	 * @generated
	 */
	EvaluationModeKind getEvaluationMode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.validation.Diagnostic#getEvaluationMode <em>Evaluation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Evaluation Mode</em>' attribute.
	 * @see org.eclipse.mdht.uml.validation.EvaluationModeKind
	 * @see #getEvaluationMode()
	 * @generated
	 */
	void setEvaluationMode(EvaluationModeKind value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The default value is <code>"error"</code>.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.validation.SeverityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.mdht.uml.validation.SeverityKind
	 * @see #setSeverity(SeverityKind)
	 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getDiagnostic_Severity()
	 * @model default="error" required="true" ordered="false"
	 * @generated
	 */
	SeverityKind getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.validation.Diagnostic#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.mdht.uml.validation.SeverityKind
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityKind value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(int)
	 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getDiagnostic_Code()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.validation.Diagnostic#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.mdht.uml.validation.Diagnostic#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(int)
	 * @generated
	 */
	void unsetCode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.mdht.uml.validation.Diagnostic#getCode <em>Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return whether the value of the '<em>Code</em>' attribute is set.
	 * @see #unsetCode()
	 * @see #getCode()
	 * @see #setCode(int)
	 * @generated
	 */
	boolean isSetCode();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.mdht.uml.validation.ValidationPackage#getDiagnostic_Message()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.validation.Diagnostic#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model dataType="org.eclipse.mdht.uml.validation.Status" required="true" ordered="false"
	 *        contextDataType="org.eclipse.mdht.uml.validation.ValidationContext" contextRequired="true" contextOrdered="false" targetRequired="true"
	 *        targetOrdered="false"
	 * @generated
	 */
	IStatus fail(IValidationContext context, EObject target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model dataType="org.eclipse.mdht.uml.validation.Status" required="true" ordered="false"
	 *        contextDataType="org.eclipse.mdht.uml.validation.ValidationContext" contextRequired="true" contextOrdered="false" targetRequired="true"
	 *        targetOrdered="false" relatedMany="true" relatedOrdered="false"
	 * @generated
	 */
	IStatus fail(IValidationContext context, EObject target, EList<EObject> related);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<EClass> getTargets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" objectRequired="true" objectOrdered="false"
	 * @generated
	 */
	boolean targets(EObject object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	ConstraintProvider getConstraintProvider();

} // Diagnostic
