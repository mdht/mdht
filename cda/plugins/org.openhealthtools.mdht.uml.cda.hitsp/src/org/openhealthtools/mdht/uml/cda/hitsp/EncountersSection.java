/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp;

import org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounters Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The Encounter Section contains information describing the patient history of encounters. At a minimum,
 *     current and pertinent historical encounters should be included; a full encounter history may be included. 
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getEncountersSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.3.88.11.83.127' constraints.validation.error='EncountersSectionTemplateId'"
 * @generated
 */
public interface EncountersSection extends EncounterHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection init();
} // EncountersSection
