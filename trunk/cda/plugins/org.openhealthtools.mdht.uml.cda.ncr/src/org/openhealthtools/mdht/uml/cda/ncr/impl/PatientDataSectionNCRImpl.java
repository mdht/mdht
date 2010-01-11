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

import org.openhealthtools.mdht.uml.cda.ncr.NCRPackage;
import org.openhealthtools.mdht.uml.cda.ncr.PatientDataSectionNCR;

import org.openhealthtools.mdht.uml.cda.ncr.operations.PatientDataSectionNCROperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Data Section NCR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientDataSectionNCRImpl extends PatientDataSectionImpl implements PatientDataSectionNCR {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientDataSectionNCRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NCRPackage.Literals.PATIENT_DATA_SECTION_NCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSectionNCRTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientDataSectionNCROperations.validatePatientDataSectionNCRTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSectionNCREncountersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientDataSectionNCROperations.validatePatientDataSectionNCREncountersSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSectionNCRAcuityDataSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientDataSectionNCROperations.validatePatientDataSectionNCRAcuityDataSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientDataSectionNCRBirthWeight(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientDataSectionNCROperations.validatePatientDataSectionNCRBirthWeight(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientDataSectionNCR init() {
    		CDAUtil.init(this);
    		return this;
	}
} //PatientDataSectionNCRImpl
