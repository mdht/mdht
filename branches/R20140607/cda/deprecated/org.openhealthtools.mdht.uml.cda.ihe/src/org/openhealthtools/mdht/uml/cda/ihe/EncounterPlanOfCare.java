/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Plan Of Care</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getEncounterPlanOfCare()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation contextDependent='true' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.4.14' constraints.validation.error='EncounterPlanOfCareTemplateId EncounterPlanOfCareMoodCodeValue'"
 * @generated
 */
public interface EncounterPlanOfCare extends EncounterEntry, PlanOfCareActivityEncounter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentEncounterMood::ARQ
	 *   or self.moodCode = vocab::x_DocumentEncounterMood::PRMS
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode = vocab::x_DocumentEncounterMood::ARQ\r\n  or self.moodCode = vocab::x_DocumentEncounterMood::PRMS'"
	 * @generated
	 */
	boolean validateEncounterPlanOfCareMoodCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterPlanOfCare init();
} // EncounterPlanOfCare
