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
import org.openhealthtools.mdht.uml.cda.ncr.PatientDataSection;
import org.openhealthtools.mdht.uml.cda.ncr.util.NCRValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Data Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.PatientDataSection#validatePatientDataSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.PatientDataSection#validatePatientDataSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.PatientDataSection#validatePatientDataSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ncr.PatientDataSection#validatePatientDataSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientDataSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientDataSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientDataSectionTemplateId(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionTemplateId(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_DATA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.17.2.4')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientDataSectionTemplateId(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionTemplateId(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_DATA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.17.2.4')
	 * @param patientDataSection The receiving '<em><b>Patient Data Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientDataSectionTemplateId(PatientDataSection patientDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_DATA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.PATIENT_DATA_SECTION);
			try {
				VALIDATE_PATIENT_DATA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_DATA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_DATA_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientDataSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.PATIENT_DATA_SECTION__PATIENT_DATA_SECTION_TEMPLATE_ID,
						 NCRPlugin.INSTANCE.getString("PatientDataSectionTemplateId"),
						 new Object [] { patientDataSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientDataSectionCode(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionCode(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_DATA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '55188-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientDataSectionCode(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionCode(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_DATA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '55188-7' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param patientDataSection The receiving '<em><b>Patient Data Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientDataSectionCode(PatientDataSection patientDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_DATA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.PATIENT_DATA_SECTION);
			try {
				VALIDATE_PATIENT_DATA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_DATA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_DATA_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientDataSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.PATIENT_DATA_SECTION__PATIENT_DATA_SECTION_CODE,
						 NCRPlugin.INSTANCE.getString("PatientDataSectionCode"),
						 new Object [] { patientDataSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientDataSectionText(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionText(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_DATA_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientDataSectionText(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionText(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_DATA_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param patientDataSection The receiving '<em><b>Patient Data Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientDataSectionText(PatientDataSection patientDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_DATA_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.PATIENT_DATA_SECTION);
			try {
				VALIDATE_PATIENT_DATA_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_DATA_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_DATA_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientDataSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.PATIENT_DATA_SECTION__PATIENT_DATA_SECTION_TEXT,
						 NCRPlugin.INSTANCE.getString("PatientDataSectionText"),
						 new Object [] { patientDataSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientDataSectionTitle(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionTitle(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_DATA_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.title.oclIsUndefined() and self.title.getText() = 'PATIENT DATA'";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientDataSectionTitle(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Data Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientDataSectionTitle(PatientDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_DATA_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.title.oclIsUndefined() and self.title.getText() = 'PATIENT DATA'
	 * @param patientDataSection The receiving '<em><b>Patient Data Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientDataSectionTitle(PatientDataSection patientDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_DATA_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(NCRPackage.Literals.PATIENT_DATA_SECTION);
			try {
				VALIDATE_PATIENT_DATA_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_DATA_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_DATA_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientDataSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 NCRValidator.DIAGNOSTIC_SOURCE,
						 NCRValidator.PATIENT_DATA_SECTION__PATIENT_DATA_SECTION_TITLE,
						 NCRPlugin.INSTANCE.getString("PatientDataSectionTitle"),
						 new Object [] { patientDataSection }));
			}
			return false;
		}
		return true;
	}

} // PatientDataSectionOperations