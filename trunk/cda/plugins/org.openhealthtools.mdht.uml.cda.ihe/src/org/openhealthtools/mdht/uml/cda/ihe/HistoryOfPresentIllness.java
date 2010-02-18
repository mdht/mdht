/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Of Present Illness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The history of present illness section shall contain a narrative description of the sequence of events preceding the
 * patient's current complaints.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getHistoryOfPresentIllness()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystemName='LOINC' constraints.validation.error='HistoryOfPresentIllnessTemplateId HistoryOfPresentIllnessCode' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.3.4' code.displayName='HISTORY OF PRESENT ILLNESS' code.codeSystem='2.16.840.1.113883.6.1' code.code='10164-2'"
 * @generated
 */
public interface HistoryOfPresentIllness extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.4')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'1.3.6.1.4.1.19376.1.5.3.1.3.4\')'"
	 * @generated
	 */
	boolean validateHistoryOfPresentIllnessTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '10164-2' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (\r\nvalue.code = \'10164-2\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateHistoryOfPresentIllnessCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllness init();
} // HistoryOfPresentIllness
