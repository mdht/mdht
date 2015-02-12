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
import org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection#validateHospitalAdmissionDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection#validateHospitalAdmissionDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalAdmissionDiagnosisSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalAdmissionDiagnosisSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisSectionTemplateId(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisSectionTemplateId(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisSectionTemplateId(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisSectionTemplateId(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.3')
	 * @param hospitalAdmissionDiagnosisSection The receiving '<em><b>Hospital Admission Diagnosis Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHospitalAdmissionDiagnosisSectionTemplateId(HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalAdmissionDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("HospitalAdmissionDiagnosisSectionTemplateId"),
						 new Object [] { hospitalAdmissionDiagnosisSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalAdmissionDiagnosisSectionCode(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisSectionCode(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '46241-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalAdmissionDiagnosisSectionCode(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalAdmissionDiagnosisSectionCode(HospitalAdmissionDiagnosisSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '46241-6' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param hospitalAdmissionDiagnosisSection The receiving '<em><b>Hospital Admission Diagnosis Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHospitalAdmissionDiagnosisSectionCode(HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION);
			try {
				VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hospitalAdmissionDiagnosisSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE,
						 IHEPlugin.INSTANCE.getString("HospitalAdmissionDiagnosisSectionCode"),
						 new Object [] { hospitalAdmissionDiagnosisSection }));
			}
			return false;
		}
		return true;
	}

} // HospitalAdmissionDiagnosisSectionOperations