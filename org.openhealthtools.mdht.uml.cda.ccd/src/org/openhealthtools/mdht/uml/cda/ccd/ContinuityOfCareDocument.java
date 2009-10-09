/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuity Of Care Document</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getContinuityOfCareDocument()
 * @model extendedMetaData="name='ClinicalDocument'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystemName='LOINC' constraints.validation.info='ContinuityOfCareDocument_purposeSection' templateId.root='2.16.840.1.113883.10.20.1' constraints.validation.error='ContinuityOfCareDocument_templateId ContinuityOfCareDocument_code' code.displayName='Summarization of episode note' code.codeSystem='2.16.840.1.113883.6.1' code.code='34133-9' constraints.validation.warning='ContinuityOfCareDocument_problemSection ContinuityOfCareDocument_familyHistorySection ContinuityOfCareDocument_socialHistorySection ContinuityOfCareDocument_alertsSection ContinuityOfCareDocument_medicationSection ContinuityOfCareDocument_resultsSection ContinuityOfCareDocument_proceduresSection ContinuityOfCareDocument_encountersSection ContinuityOfCareDocument_planOfCareSection ContinuityOfCareDocument_immunizationsSection ContinuityOfCareDocument_vitalSignsSection ContinuityOfCareDocument_medicalEquipmentSection ContinuityOfCareDocument_functionalStatusSection ContinuityOfCareDocument_advanceDirectivesSection ContinuityOfCareDocument_payersSection'"
 * @generated
 */
public interface ContinuityOfCareDocument extends ClinicalDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'2.16.840.1.113883.10.20.1\')'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_templateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '34133-9' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (\r\nvalue.code = \'34133-9\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_code(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::ProblemSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::ProblemSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_problemSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::FamilyHistorySection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::FamilyHistorySection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_familyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::SocialHistorySection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::SocialHistorySection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_socialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::AlertsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::AlertsSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_alertsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::MedicationSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::MedicationSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_medicationSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::ResultsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::ResultsSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_resultsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::ProceduresSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::ProceduresSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_proceduresSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::EncountersSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::EncountersSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_encountersSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::PlanOfCareSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::PlanOfCareSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_planOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::ImmunizationsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::ImmunizationsSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_immunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::VitalSignsSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::VitalSignsSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_vitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::MedicalEquipmentSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::MedicalEquipmentSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_medicalEquipmentSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::FunctionalStatusSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::FunctionalStatusSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_functionalStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::AdvanceDirectivesSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::AdvanceDirectivesSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_advanceDirectivesSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::PayersSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::PayersSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_payersSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::PurposeSection))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSection()->one(section : cda::Section | section.oclIsKindOf(ccd::PurposeSection))'"
	 * @generated
	 */
	boolean ContinuityOfCareDocument_purposeSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuityOfCareDocument init();
} // ContinuityOfCareDocument
