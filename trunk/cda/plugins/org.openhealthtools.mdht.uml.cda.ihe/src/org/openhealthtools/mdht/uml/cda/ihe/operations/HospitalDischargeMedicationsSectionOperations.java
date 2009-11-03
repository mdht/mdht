/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;

import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Medications Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection#HospitalDischargeMedicationsSection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Hospital Discharge Medications Section template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection#HospitalDischargeMedicationsSection_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Hospital Discharge Medications Section code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalDischargeMedicationsSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalDischargeMedicationsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #HospitalDischargeMedicationsSection_templateId(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Hospital Discharge Medications Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HospitalDischargeMedicationsSection_templateId(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.22')";

	/**
	 * The cached OCL invariant for the '{@link #HospitalDischargeMedicationsSection_templateId(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Hospital Discharge Medications Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HospitalDischargeMedicationsSection_templateId(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.22')
	 * @param hospitalDischargeMedicationsSection The receiving '<em><b>Hospital Discharge Medications Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean HospitalDischargeMedicationsSection_templateId(HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION);
			try {
				HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalDischargeMedicationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("HospitalDischargeMedicationsSection_templateId"),
						 new Object [] { hospitalDischargeMedicationsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #HospitalDischargeMedicationsSection_code(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Hospital Discharge Medications Section code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HospitalDischargeMedicationsSection_code(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '10183-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #HospitalDischargeMedicationsSection_code(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Hospital Discharge Medications Section code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HospitalDischargeMedicationsSection_code(HospitalDischargeMedicationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '10183-2' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param hospitalDischargeMedicationsSection The receiving '<em><b>Hospital Discharge Medications Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean HospitalDischargeMedicationsSection_code(HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION);
			try {
				HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalDischargeMedicationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE,
						 IHEPlugin.INSTANCE.getString("HospitalDischargeMedicationsSection_code"),
						 new Object [] { hospitalDischargeMedicationsSection }));
			}
			return false;
		}
		return true;
	}

} // HospitalDischargeMedicationsSectionOperations