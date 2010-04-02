/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Of Care Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The plan of care section contains data defining pending orders, interventions, encounters, services, and
 *     procedures for the patient. It is limited to prospective, unfulfilled, or incomplete orders and requests only. All
 *     active, incomplete, or pending orders, appointments, referrals, procedures, services, or any other pending event of
 *     clinical significance to the current and ongoing care of the patient should be listed, unless constrained due to issues
 *     of privacy.
 * </p>
 * <p>
 *     The plan of care section also contains information regarding goals and clinical reminders. Clinical
 *     reminders are placed here for purposes of providing prompts that may be used for disease prevention, disease
 *     management, patient safety, and healthcare quality improvements, including widely accepted performance measures.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection#getPlanOfCareActivity <em>Plan Of Care Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getPlanOfCareSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystem='2.16.840.1.113883.6.1' templateId.root='2.16.840.1.113883.10.20.1.10' code.displayName='Treatment plan' constraints.validation.error='PlanOfCareSectionTemplateId PlanOfCareSectionCode PlanOfCareSectionTitle PlanOfCareSectionText' code.codeSystemName='LOINC' code.code='18776-5' constraints.validation.info='PlanOfCareSectionPlanOfCareActivityAct PlanOfCareSectionPlanOfCareActivityEncounter PlanOfCareSectionPlanOfCareActivityObservation PlanOfCareSectionPlanOfCareActivityProcedure PlanOfCareSectionPlanOfCareActivitySubstanceAdministration PlanOfCareSectionPlanOfCareActivitySupply'"
 * @generated
 */
public interface PlanOfCareSection extends Section {
	/**
	 * Returns the value of the '<em><b>Plan Of Care Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Of Care Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Of Care Activity</em>' reference.
	 * @see #setPlanOfCareActivity(PlanOfCareActivity)
	 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getPlanOfCareSection_PlanOfCareActivity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PlanOfCareActivity getPlanOfCareActivity();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection#getPlanOfCareActivity <em>Plan Of Care Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Of Care Activity</em>' reference.
	 * @see #getPlanOfCareActivity()
	 * @generated
	 */
	void setPlanOfCareActivity(PlanOfCareActivity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.10')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.10\')'"
	 * @generated
	 */
	boolean validatePlanOfCareSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '18776-5' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (\r\nvalue.code = \'18776-5\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validatePlanOfCareSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.title.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.title.oclIsUndefined()'"
	 * @generated
	 */
	boolean validatePlanOfCareSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validatePlanOfCareSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | entry.act.oclIsKindOf(ccd::PlanOfCareActivityAct))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | entry.act.oclIsKindOf(ccd::PlanOfCareActivityAct))'"
	 * @generated
	 */
	boolean validatePlanOfCareSectionPlanOfCareActivityAct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | entry.encounter.oclIsKindOf(ccd::PlanOfCareActivityEncounter))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | entry.encounter.oclIsKindOf(ccd::PlanOfCareActivityEncounter))'"
	 * @generated
	 */
	boolean validatePlanOfCareSectionPlanOfCareActivityEncounter(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | entry.observation.oclIsKindOf(ccd::PlanOfCareActivityObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | entry.observation.oclIsKindOf(ccd::PlanOfCareActivityObservation))'"
	 * @generated
	 */
	boolean validatePlanOfCareSectionPlanOfCareActivityObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | entry.procedure.oclIsKindOf(ccd::PlanOfCareActivityProcedure))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | entry.procedure.oclIsKindOf(ccd::PlanOfCareActivityProcedure))'"
	 * @generated
	 */
	boolean validatePlanOfCareSectionPlanOfCareActivityProcedure(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | entry.substanceAdministration.oclIsKindOf(ccd::PlanOfCareActivitySubstanceAdministration))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | entry.substanceAdministration.oclIsKindOf(ccd::PlanOfCareActivitySubstanceAdministration))'"
	 * @generated
	 */
	boolean validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | entry.supply.oclIsKindOf(ccd::PlanOfCareActivitySupply))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->one(entry : cda::Entry | entry.supply.oclIsKindOf(ccd::PlanOfCareActivitySupply))'"
	 * @generated
	 */
	boolean validatePlanOfCareSectionPlanOfCareActivitySupply(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	EList<PlanOfCareActivity> getPlanOfCareActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection init();
} // PlanOfCareSection
