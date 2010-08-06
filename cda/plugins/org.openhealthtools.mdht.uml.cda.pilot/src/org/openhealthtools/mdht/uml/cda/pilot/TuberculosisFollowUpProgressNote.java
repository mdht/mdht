/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuberculosis Follow Up Progress Note</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage#getTuberculosisFollowUpProgressNote()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.15.2.6.1.1.1.1.1.2.3' constraints.validation.error='TuberculosisFollowUpProgressNoteTemplateId TuberculosisFollowUpProgressNotePatientNames TuberculosisFollowUpProgressNoteTBResultsSection'"
 * @generated
 */
public interface TuberculosisFollowUpProgressNote extends ClinicalDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget.patientRole.patient.name->exists(
	 *    name : datatypes::PN | not name.given->isEmpty() and not name.family->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget.patientRole.patient.name->exists(\r\n   name : datatypes::PN | not name.given->isEmpty() and not name.family->isEmpty())'"
	 * @generated
	 */
	boolean validateTuberculosisFollowUpProgressNotePatientNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.6.1.1.1.1.1.2.3')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.15.2.6.1.1.1.1.1.2.3\')'"
	 * @generated
	 */
	boolean validateTuberculosisFollowUpProgressNoteTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pilot::TBResultsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pilot::TBResultsSection))'"
	 * @generated
	 */
	boolean validateTuberculosisFollowUpProgressNoteTBResultsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pilot::TBResultsSection))->asSequence()->first().oclAsType(pilot::TBResultsSection)
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(pilot::TBResultsSection))->asSequence()->first().oclAsType(pilot::TBResultsSection)'"
	 * @generated
	 */
	TBResultsSection getTbResultsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuberculosisFollowUpProgressNote init();
} // TuberculosisFollowUpProgressNote
