/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ContinuityOfCareDocumentImpl;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.PatientSummaryOperations;
import org.openhealthtools.mdht.uml.cda.ihe.operations.MedicalSummaryOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientSummaryImpl extends ContinuityOfCareDocumentImpl implements PatientSummary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.PATIENT_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalDocumentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validateMedicalDocumentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummaryProblemConcernEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalSummaryOperations.validateMedicalSummaryProblemConcernEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummaryAllergyConcernEntry(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalSummaryOperations.validateMedicalSummaryAllergyConcernEntry(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummaryMedications(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalSummaryOperations.validateMedicalSummaryMedications(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummaryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicalSummaryOperations.validateMedicalSummaryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryAdvanceDirectivesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryAdvanceDirectivesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryAllergiesReactionsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryAllergiesReactionsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryProblemListSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryProblemListSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryEncountersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryEncountersSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryImmunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryImmunizationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryPayersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryPayersSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummaryMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientSummaryOperations.validatePatientSummaryMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemListSection createProblemListSection() {
		return PatientSummaryOperations.createProblemListSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection createMedicationsSection() {
		return PatientSummaryOperations.createMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientSummary init() {
    		CDAUtil.init(this);
    		return this;
	}
} //PatientSummaryImpl
