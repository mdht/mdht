/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TB Result Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     <font size="2">CCD represents the ASTM CCR &lt;Purpose&gt; object as a relationship between two classes – the source
 *     represents the act of creating a summary document, the target is the reason for creating the document, and the
 *     relationship type is "RSON" (has reason). The target act may be an Observation, Procedure, or some other kind of act,
 *     and it may represent an order, an event, etc.</font>
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage#getTBResultOrganizer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystem='2.16.840.1.114222.4.11.3205' templateId.root='2.16.840.1.113883.10.20.15.3.21' constraints.validation.error='TBResultOrganizerTemplateId TBResultOrganizerCode TBResultOrganizerTBResultObservation' code.codeSystemName='Lab Test Result Name (TB)'"
 * @generated
 */
public interface TBResultOrganizer extends ResultOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.15.3.21')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'2.16.840.1.113883.10.20.15.3.21\')'"
	 * @generated
	 */
	boolean validateTBResultOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.114222.4.11.3205')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (\r\nvalue.codeSystem = \'2.16.840.1.114222.4.11.3205\')'"
	 * @generated
	 */
	boolean validateTBResultOrganizerCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component->one(component : cda::Component4 | component.observation.oclIsKindOf(pilot::TBResultObservation))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.component->one(component : cda::Component4 | component.observation.oclIsKindOf(pilot::TBResultObservation))'"
	 * @generated
	 */
	boolean validateTBResultOrganizerTBResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBResultOrganizer init();
} // TBResultOrganizer
