/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Signs Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     <font size="2">The Vital Signs Section contains information documenting the patient vital signs.</font>
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getVitalSignsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.3.88.11.83.119' constraints.validation.error='VitalSignsSection_templateId HITSPVitalSignsSection_vitalSigns'"
 * @generated
 */
public interface VitalSignsSection extends CodedVitalSignsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(ihe::IHEVitalSignsOrganizer) and
	 * entry.organizer.component.observation->exists(obs : cda::Observation | obs.oclIsKindOf(hitsp::VitalSign)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(ihe::IHEVitalSignsOrganizer) and\r\nentry.organizer.component.observation->exists(obs : cda::Observation | obs.oclIsKindOf(hitsp::VitalSign)))'"
	 * @generated
	 */
	boolean HITSPVitalSignsSection_vitalSigns(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection init();
} // VitalSignsSection
