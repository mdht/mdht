/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TB Results Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <font size="2">Represents the specific reason for which the summarization was generated, such as in response to a
 *     request.</font>
 * </p>
 * <p>
 *     <font size="2">The general use case does not require a purpose. Purpose should be utilized when the CCD has a specific
 *     purpose such as a transfer, referral, or patient request.</font>
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage#getTBResultsSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation title.mixed='Relevant diagnostic tests and/or laboratory data' code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Relevant diagnostic tests and/or laboratory data' templateId.root='2.16.840.1.113883.10.20.15.2.6' constraints.validation.error='TBResultsSectionTemplateId TBResultsSectionCode TBResultsSectionText TBResultsSectionTitle' code.codeSystemName='LOINC' code.code='30954-2' constraints.validation.info='TBResultsSectionTBResultOrganizer TBResultsSectionTBResultObservation'"
 * @generated
 */
public interface TBResultsSection extends ResultsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.15.2.6')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'2.16.840.1.113883.10.20.15.2.6\')'"
	 * @generated
	 */
	boolean validateTBResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '30954-2' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (\r\nvalue.code = \'30954-2\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateTBResultsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateTBResultsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.title.getText() = 'Relevant diagnostic tests and/or laboratory data'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.title.getText() = \'Relevant diagnostic tests and/or laboratory data\''"
	 * @generated
	 */
	boolean validateTBResultsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(pilot::TBResultOrganizer))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(pilot::TBResultOrganizer))'"
	 * @generated
	 */
	boolean validateTBResultsSectionTBResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.observation.oclIsKindOf(pilot::TBResultObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | entry.observation.oclIsKindOf(pilot::TBResultObservation))'"
	 * @generated
	 */
	boolean validateTBResultsSectionTBResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBResultsSection init();
} // TBResultsSection
