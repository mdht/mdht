/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vital Sign</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getVitalSign()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystemName='LOINC' templateId.root='2.16.840.1.113883.3.88.11.83.14' constraints.validation.error='VitalSignTemplateId VitalSignCode' code.codeSystem='2.16.840.1.113883.6.1'"
 * @generated
 */
public interface VitalSign extends VitalSignObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.14')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.14\')'"
	 * @generated
	 */
	boolean validateVitalSignTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '9279-1' or value.code = '8867-4' or value.code = '2710-2' or value.code = '8480-6' or value.code = '8462-4' or value.code = '8310-5' or value.code = '8302-2' or value.code = '8306-3' or value.code = '8287-5' or value.code = '3141-9'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (\r\nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'9279-1\' or value.code = \'8867-4\' or value.code = \'2710-2\' or value.code = \'8480-6\' or value.code = \'8462-4\' or value.code = \'8310-5\' or value.code = \'8302-2\' or value.code = \'8306-3\' or value.code = \'8287-5\' or value.code = \'3141-9\'))'"
	 * @generated
	 */
	boolean validateVitalSignCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSign init();
} // VitalSign
