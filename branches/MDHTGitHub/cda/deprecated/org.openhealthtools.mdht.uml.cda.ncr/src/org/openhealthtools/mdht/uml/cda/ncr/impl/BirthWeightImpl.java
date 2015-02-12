/*******************************************************************************
 * Copyright (c) 2009, 2010 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.ncr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ResultObservationImpl;
import org.openhealthtools.mdht.uml.cda.ncr.BirthWeight;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPackage;
import org.openhealthtools.mdht.uml.cda.ncr.operations.BirthWeightOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Birth Weight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BirthWeightImpl extends ResultObservationImpl implements BirthWeight {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BirthWeightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NCRPackage.Literals.BIRTH_WEIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthWeightClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthWeightOperations.validateBirthWeightClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthWeightMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthWeightOperations.validateBirthWeightMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthWeightValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthWeightOperations.validateBirthWeightValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthWeightOperations.validateResultObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthWeightOperations.validateResultObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BirthWeightOperations.validateResultObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BirthWeight init() {
    		CDAUtil.init(this);
    		return this;
	}
} //BirthWeightImpl
