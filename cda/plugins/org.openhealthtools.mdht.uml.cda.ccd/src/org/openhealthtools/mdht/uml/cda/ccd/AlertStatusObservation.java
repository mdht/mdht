/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert Status Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getAlertStatusObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation value.codeSystemName='AlertStatusCode' value.codeSystem='2.16.840.1.113883.1.11.20.3' templateId.root='2.16.840.1.113883.10.20.1.39' constraints.validation.error='AlertStatusObservation_templateId AlertStatusObservation_value' value.codeSystemVersion='20061017'"
 * @generated
 */
public interface AlertStatusObservation extends StatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.39')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'2.16.840.1.113883.10.20.1.39\')'"
	 * @generated
	 */
	boolean AlertStatusObservation_templateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE) and 
	 * let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.1.11.20.3' and value.codeSystemName = 'AlertStatusCode' and value.codeSystemVersion = '20061017')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE) and \r\nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.1.11.20.3\' and value.codeSystemName = \'AlertStatusCode\' and value.codeSystemVersion = \'20061017\')'"
	 * @generated
	 */
	boolean AlertStatusObservation_value(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertStatusObservation init();
} // AlertStatusObservation
