/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.ccd.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage
 * @generated
 */
public class CCDValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CCDValidator INSTANCE = new CCDValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.ccd";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Template Id' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Code' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__CODE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Template Id' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__TEMPLATE_ID = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CCDPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CCDPackage.PROBLEM_ACT:
				return validateProblemAct((ProblemAct)value, diagnostics, context);
			case CCDPackage.PROBLEM_OBSERVATION:
				return validateProblemObservation((ProblemObservation)value, diagnostics, context);
			case CCDPackage.A:
				return validateA((A)value, diagnostics, context);
			case CCDPackage.B:
				return validateB((B)value, diagnostics, context);
			case CCDPackage.C:
				return validateC((C)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_templateId(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_code(problemAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the templateId constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_templateId(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.templateId(diagnostics, context);
	}

	/**
	 * Validates the code constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_code(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.code(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_templateId(problemObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the templateId constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_templateId(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateA(A a, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(a, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(a, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(a, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(a, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(a, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(a, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(a, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_templateId(a, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_code(a, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateB(B b, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(b, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(b, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(b, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(b, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(b, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(b, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(b, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_templateId(b, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_code(b, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC(C c, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(c, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_templateId(c, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_code(c, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CCDValidator
