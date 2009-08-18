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
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.CDAPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.HitspPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HitspValidator;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.MedicalDocumentOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#PatientSummary_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Patient Summary template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#createProblemListSection() <em>Create Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#createMedicationsSection() <em>Create Medications Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientSummaryOperations extends MedicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #PatientSummary_templateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Patient Summary template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PatientSummary_templateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.3.88.11.32.1')";
	/**
	 * The cached OCL invariant for the '{@link #PatientSummary_templateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Patient Summary template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PatientSummary_templateId(PatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.3.88.11.32.1')
	 * @param patientSummary The receiving '<em><b>Patient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PatientSummary_templateId(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HitspPackage.Literals.PATIENT_SUMMARY);
			try {
				PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HitspValidator.DIAGNOSTIC_SOURCE,
						 HitspValidator.PATIENT_SUMMARY__PATIENT_SUMMARY_TEMPLATE_ID,
						 CDAPlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PatientSummary_templateId", PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP, org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(patientSummary, context) }),
						 new Object [] { patientSummary }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  ActiveProblemsSection createProblemListSection(PatientSummary patientSummary) {
		ActiveProblemsSection section = IHEFactory.eINSTANCE.createActiveProblemsSection().init();
		patientSummary.addSection(section);

		section.setTitle(DatatypesFactory.eINSTANCE.createST("Problems"));
		
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static  MedicationsSection createMedicationsSection(PatientSummary patientSummary) {
		MedicationsSection section = IHEFactory.eINSTANCE.createMedicationsSection().init();
		patientSummary.addSection(section);
		
		return section;
	}

} // PatientSummaryOperations