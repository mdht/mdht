/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getStatusObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation statusCode.codeSystemName='ActStatus' code.codeSystemName='LOINC' templateId.root='2.16.840.1.113883.10.20.1.57' constraints.validation.error='StatusObservation_templateId; StatusObservation_code; StatusObservation_statusCode' statusCode.codeSystem='2.16.840.1.113883.5.14' code.displayName='Status' statusCode.code='completed' code.codeSystem='2.16.840.1.113883.6.1' code.code='33999-4'"
 * @generated
 */
public interface StatusObservation extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.57')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'2.16.840.1.113883.10.20.1.57\')'"
	 * @generated
	 */
	boolean StatusObservation_templateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.code = '33999-4' and self.code.codeSystem = '2.16.840.1.113883.6.1' and self.code.codeSystemName = 'LOINC'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.code = \'33999-4\' and self.code.codeSystem = \'2.16.840.1.113883.6.1\' and self.code.codeSystemName = \'LOINC\''"
	 * @generated
	 */
	boolean StatusObservation_code(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.code = 'completed' and self.statusCode.codeSystem = '2.16.840.1.113883.5.14' and self.statusCode.codeSystemName = 'ActStatus'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.statusCode.oclIsUndefined() and self.statusCode.code = \'completed\' and self.statusCode.codeSystem = \'2.16.840.1.113883.5.14\' and self.statusCode.codeSystemName = \'ActStatus\''"
	 * @generated
	 */
	boolean StatusObservation_statusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusObservation init();
} // StatusObservation
