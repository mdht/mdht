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

import org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;

import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Admission Medication History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection#AdmissionMedicationHistorySection_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Admission Medication History Section template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdmissionMedicationHistorySectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdmissionMedicationHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #AdmissionMedicationHistorySection_templateId(AdmissionMedicationHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Admission Medication History Section template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AdmissionMedicationHistorySection_templateId(AdmissionMedicationHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.20')";

	/**
	 * The cached OCL invariant for the '{@link #AdmissionMedicationHistorySection_templateId(AdmissionMedicationHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Admission Medication History Section template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AdmissionMedicationHistorySection_templateId(AdmissionMedicationHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.20')
	 * @param admissionMedicationHistorySection The receiving '<em><b>Admission Medication History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean AdmissionMedicationHistorySection_templateId(AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.ADMISSION_MEDICATION_HISTORY_SECTION);
			try {
				ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(admissionMedicationHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.ADMISSION_MEDICATION_HISTORY_SECTION__ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("AdmissionMedicationHistorySection_templateId"),
						 new Object [] { admissionMedicationHistorySection }));
			}
			return false;
		}
		return true;
	}

} // AdmissionMedicationHistorySectionOperations