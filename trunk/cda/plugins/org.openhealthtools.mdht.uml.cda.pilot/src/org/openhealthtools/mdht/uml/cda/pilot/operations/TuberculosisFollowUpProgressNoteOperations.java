/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;
import org.openhealthtools.mdht.uml.cda.pilot.PilotPlugin;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection;
import org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote;
import org.openhealthtools.mdht.uml.cda.pilot.util.TBPNValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tuberculosis Follow Up Progress Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote#validateTuberculosisFollowUpProgressNotePatientNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Follow Up Progress Note Patient Names</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote#validateTuberculosisFollowUpProgressNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Follow Up Progress Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote#validateTuberculosisFollowUpProgressNoteTBResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Follow Up Progress Note TB Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote#getTbResultsSection() <em>Get Tb Results Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuberculosisFollowUpProgressNoteOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisFollowUpProgressNoteOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisFollowUpProgressNotePatientNames(TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Follow Up Progress Note Patient Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisFollowUpProgressNotePatientNames(TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_PATIENT_NAMES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget.patientRole.patient.name->exists("+
"   name : datatypes::PN | not name.given->isEmpty() and not name.family->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisFollowUpProgressNotePatientNames(TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Follow Up Progress Note Patient Names</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisFollowUpProgressNotePatientNames(TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_PATIENT_NAMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget.patientRole.patient.name->exists(
	 *    name : datatypes::PN | not name.given->isEmpty() and not name.family->isEmpty())
	 * @param tuberculosisFollowUpProgressNote The receiving '<em><b>Tuberculosis Follow Up Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTuberculosisFollowUpProgressNotePatientNames(TuberculosisFollowUpProgressNote tuberculosisFollowUpProgressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_PATIENT_NAMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TBPNPackage.Literals.TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE);
			try {
				VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_PATIENT_NAMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_PATIENT_NAMES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_PATIENT_NAMES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisFollowUpProgressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TBPNValidator.DIAGNOSTIC_SOURCE,
						 TBPNValidator.TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE__TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_PATIENT_NAMES,
						 PilotPlugin.INSTANCE.getString("TuberculosisFollowUpProgressNotePatientNames"),
						 new Object [] { tuberculosisFollowUpProgressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisFollowUpProgressNoteTemplateId(TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Follow Up Progress Note Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisFollowUpProgressNoteTemplateId(TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.6.1.1.1.1.1.2.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisFollowUpProgressNoteTemplateId(TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Follow Up Progress Note Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisFollowUpProgressNoteTemplateId(TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.6.1.1.1.1.1.2.3')
	 * @param tuberculosisFollowUpProgressNote The receiving '<em><b>Tuberculosis Follow Up Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTuberculosisFollowUpProgressNoteTemplateId(TuberculosisFollowUpProgressNote tuberculosisFollowUpProgressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TBPNPackage.Literals.TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE);
			try {
				VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisFollowUpProgressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TBPNValidator.DIAGNOSTIC_SOURCE,
						 TBPNValidator.TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE__TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TEMPLATE_ID,
						 PilotPlugin.INSTANCE.getString("TuberculosisFollowUpProgressNoteTemplateId"),
						 new Object [] { tuberculosisFollowUpProgressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTuberculosisFollowUpProgressNoteTBResultsSection(TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Follow Up Progress Note TB Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisFollowUpProgressNoteTBResultsSection(TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TB_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pilot::TBResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateTuberculosisFollowUpProgressNoteTBResultsSection(TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Follow Up Progress Note TB Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTuberculosisFollowUpProgressNoteTBResultsSection(TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TB_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pilot::TBResultsSection))
	 * @param tuberculosisFollowUpProgressNote The receiving '<em><b>Tuberculosis Follow Up Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTuberculosisFollowUpProgressNoteTBResultsSection(TuberculosisFollowUpProgressNote tuberculosisFollowUpProgressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TB_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TBPNPackage.Literals.TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE);
			try {
				VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TB_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TB_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TB_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisFollowUpProgressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TBPNValidator.DIAGNOSTIC_SOURCE,
						 TBPNValidator.TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE__TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE_TB_RESULTS_SECTION,
						 PilotPlugin.INSTANCE.getString("TuberculosisFollowUpProgressNoteTBResultsSection"),
						 new Object [] { tuberculosisFollowUpProgressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTbResultsSection(TuberculosisFollowUpProgressNote) <em>Get Tb Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbResultsSection(TuberculosisFollowUpProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TB_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pilot::TBResultsSection))->asSequence()->first().oclAsType(pilot::TBResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getTbResultsSection(TuberculosisFollowUpProgressNote) <em>Get Tb Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbResultsSection(TuberculosisFollowUpProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TB_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pilot::TBResultsSection))->asSequence()->first().oclAsType(pilot::TBResultsSection)
	 * @param tuberculosisFollowUpProgressNote The receiving '<em><b>Tuberculosis Follow Up Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  TBResultsSection getTbResultsSection(TuberculosisFollowUpProgressNote tuberculosisFollowUpProgressNote) {
		if (GET_TB_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(TBPNPackage.Literals.TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE, TBPNPackage.Literals.TUBERCULOSIS_FOLLOW_UP_PROGRESS_NOTE.getEAllOperations().get(24));
			try {
				GET_TB_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_TB_RESULTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TB_RESULTS_SECTION__EOCL_QRY);
		return (TBResultsSection) query.evaluate(tuberculosisFollowUpProgressNote);
	}

} // TuberculosisFollowUpProgressNoteOperations