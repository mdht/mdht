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
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProblemObservationImpl extends ObservationImpl implements ProblemObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.PROBLEM_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationOperations.validateInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainsPatientAwareness(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationOperations.validateContainsPatientAwareness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationOperations.validateProblemObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationOperations.validateProblemObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationOperations.validateProblemObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationOperations.validateProblemObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationProblemStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationOperations.validateProblemObservationProblemStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationProblemHealthStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationOperations.validateProblemObservationProblemHealthStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationAgeObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProblemObservationOperations.validateProblemObservationAgeObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemObservation init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ProblemObservationImpl
