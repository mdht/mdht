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
package org.openhealthtools.mdht.uml.cda.ncr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPackage;
import org.openhealthtools.mdht.uml.cda.ncr.NCRPlugin;
import org.openhealthtools.mdht.uml.cda.ncr.PatientDataSectionNCR;
import org.openhealthtools.mdht.uml.cda.ncr.util.NCRValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Data Section NCR</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.PatientDataSectionNCR#validatePatientDataSectionNCRTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section NCR Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.PatientDataSectionNCR#validatePatientDataSectionNCREncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section NCR Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.PatientDataSectionNCR#validatePatientDataSectionNCRAcuityDataSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section NCR Acuity Data Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.PatientDataSectionNCR#validatePatientDataSectionNCRBirthWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section NCR Birth Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientDataSectionNCROperations extends PatientDataSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientDataSectionNCROperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientDataSectionNCRTemplateId(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section NCR Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionNCRTemplateId(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_DATA_SECTION_NCR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.17.2.5')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientDataSectionNCRTemplateId(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section NCR Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionNCRTemplateId(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_DATA_SECTION_NCR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.17.2.5')
	 * @param patientDataSectionNCR The receiving '<em><b>Patient Data Section NCR</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientDataSectionNCRTemplateId(PatientDataSectionNCR patientDataSectionNCR, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_DATA_SECTION_NCR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.PATIENT_DATA_SECTION_NCR);
			try {
				VALIDATE_PATIENT_DATA_SECTION_NCR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_DATA_SECTION_NCR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_DATA_SECTION_NCR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientDataSectionNCR)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.PATIENT_DATA_SECTION_NCR__PATIENT_DATA_SECTION_NCR_TEMPLATE_ID,
						 NCRPlugin.INSTANCE.getString("PatientDataSectionNCRTemplateId"),
						 new Object [] { patientDataSectionNCR }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientDataSectionNCREncountersSection(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section NCR Encounters Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionNCREncountersSection(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_DATA_SECTION_NCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ncr::EncountersSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientDataSectionNCREncountersSection(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section NCR Encounters Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionNCREncountersSection(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_DATA_SECTION_NCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ncr::EncountersSection))
	 * @param patientDataSectionNCR The receiving '<em><b>Patient Data Section NCR</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientDataSectionNCREncountersSection(PatientDataSectionNCR patientDataSectionNCR, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_DATA_SECTION_NCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.PATIENT_DATA_SECTION_NCR);
			try {
				VALIDATE_PATIENT_DATA_SECTION_NCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_DATA_SECTION_NCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_DATA_SECTION_NCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientDataSectionNCR)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.PATIENT_DATA_SECTION_NCR__PATIENT_DATA_SECTION_NCR_ENCOUNTERS_SECTION,
						 NCRPlugin.INSTANCE.getString("PatientDataSectionNCREncountersSection"),
						 new Object [] { patientDataSectionNCR }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientDataSectionNCRAcuityDataSection(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section NCR Acuity Data Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionNCRAcuityDataSection(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_DATA_SECTION_NCR_ACUITY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->one(section : cda::Section | section.oclIsKindOf(ncr::AcuityDataSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientDataSectionNCRAcuityDataSection(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section NCR Acuity Data Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionNCRAcuityDataSection(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_DATA_SECTION_NCR_ACUITY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->one(section : cda::Section | section.oclIsKindOf(ncr::AcuityDataSection))
	 * @param patientDataSectionNCR The receiving '<em><b>Patient Data Section NCR</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientDataSectionNCRAcuityDataSection(PatientDataSectionNCR patientDataSectionNCR, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_DATA_SECTION_NCR_ACUITY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.PATIENT_DATA_SECTION_NCR);
			try {
				VALIDATE_PATIENT_DATA_SECTION_NCR_ACUITY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_DATA_SECTION_NCR_ACUITY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_DATA_SECTION_NCR_ACUITY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientDataSectionNCR)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.PATIENT_DATA_SECTION_NCR__PATIENT_DATA_SECTION_NCR_ACUITY_DATA_SECTION,
						 NCRPlugin.INSTANCE.getString("PatientDataSectionNCRAcuityDataSection"),
						 new Object [] { patientDataSectionNCR }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientDataSectionNCRBirthWeight(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section NCR Birth Weight</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionNCRBirthWeight(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_DATA_SECTION_NCR_BIRTH_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | entry.observation.oclIsKindOf(ncr::BirthWeight) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientDataSectionNCRBirthWeight(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section NCR Birth Weight</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionNCRBirthWeight(PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_DATA_SECTION_NCR_BIRTH_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | entry.observation.oclIsKindOf(ncr::BirthWeight) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param patientDataSectionNCR The receiving '<em><b>Patient Data Section NCR</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientDataSectionNCRBirthWeight(PatientDataSectionNCR patientDataSectionNCR, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_DATA_SECTION_NCR_BIRTH_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.PATIENT_DATA_SECTION_NCR);
			try {
				VALIDATE_PATIENT_DATA_SECTION_NCR_BIRTH_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_DATA_SECTION_NCR_BIRTH_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_DATA_SECTION_NCR_BIRTH_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientDataSectionNCR)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.PATIENT_DATA_SECTION_NCR__PATIENT_DATA_SECTION_NCR_BIRTH_WEIGHT,
						 NCRPlugin.INSTANCE.getString("PatientDataSectionNCRBirthWeight"),
						 new Object [] { patientDataSectionNCR }));
			}
			return false;
		}
		return true;
	}

} // PatientDataSectionNCROperations