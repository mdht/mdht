/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Encounter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Of Care Encounter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getPlanOfCareEncounter()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation contextDependent='true' constraints.validation.error='PlanOfCareEncounterTemplateId PlanOfCareEncounterMoodCodeValue PlanOfCareEncounterId PlanOfCareEncounterMoodCode' templateId.root='2.16.840.1.113883.10.20.1.25'"
 * @generated
 */
public interface PlanOfCareEncounter extends Encounter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentEncounterMood::INT or self.moodCode = vocab::x_DocumentEncounterMood::ARQ
	 *   or self.moodCode = vocab::x_DocumentEncounterMood::PRMS or self.moodCode = vocab::x_DocumentEncounterMood::PRP
	 *   or self.moodCode = vocab::x_DocumentEncounterMood::RQO
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode = vocab::x_DocumentEncounterMood::INT or self.moodCode = vocab::x_DocumentEncounterMood::ARQ\r\n  or self.moodCode = vocab::x_DocumentEncounterMood::PRMS or self.moodCode = vocab::x_DocumentEncounterMood::PRP\r\n  or self.moodCode = vocab::x_DocumentEncounterMood::RQO'"
	 * @generated
	 */
	boolean validatePlanOfCareEncounterMoodCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.25')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.25\')'"
	 * @generated
	 */
	boolean validatePlanOfCareEncounterTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.id->isEmpty()'"
	 * @generated
	 */
	boolean validatePlanOfCareEncounterId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.moodCode.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.moodCode.oclIsUndefined()'"
	 * @generated
	 */
	boolean validatePlanOfCareEncounterMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareEncounter init();
} // PlanOfCareEncounter
