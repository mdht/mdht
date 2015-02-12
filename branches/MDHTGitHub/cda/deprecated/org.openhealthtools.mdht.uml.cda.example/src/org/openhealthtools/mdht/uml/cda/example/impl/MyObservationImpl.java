/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.example.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ProblemObservationImpl;
import org.openhealthtools.mdht.uml.cda.example.ExamplePackage;
import org.openhealthtools.mdht.uml.cda.example.MyObservation;
import org.openhealthtools.mdht.uml.cda.example.operations.MyObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MyObservationImpl extends ProblemObservationImpl implements MyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamplePackage.Literals.MY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MyObservationOperations.validateMyObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MyObservationOperations.validateProblemObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MyObservationOperations.validateMyObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MyObservationOperations.validateMyObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMyObservationTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MyObservationOperations.validateMyObservationTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MyObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MyObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // MyObservationImpl
