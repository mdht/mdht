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
 * A representation of the model object '<em><b>Reason For Referral Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <table>
 *     <tr>
 *         <th
 *         style="BORDER-BOTTOM: black 1px solid; TEXT-ALIGN: right; BORDER-LEFT: black 1px solid; WIDTH: 30%; BACKGROUND: lightgrey; BORDER-TOP: black 1px solid; BORDER-RIGHT: black 1px solid; -moz-background-clip: border; -moz-background-origin: padding; -moz-background-inline-policy: continuous">
 *         </th>
 *         <td
 *         style="BORDER-BOTTOM: black 1px solid; BORDER-LEFT: black 1px solid; WIDTH: 70%; BORDER-TOP: black 1px solid; BORDER-RIGHT: black 1px solid"
 *          colspan="2">
 *             The reason for referral section shall contain a narrative description of the reason that the patient is being
 *             referred.
 *         </td>
 *     </tr>
 * </table>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getReasonForReferralSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystemName='LOINC' constraints.validation.error='ReasonForReferralSectionTemplateId ReasonForReferralSectionCode' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.3.1' code.displayName='REASON FOR REFERRAL' code.codeSystem='2.16.840.1.113883.6.1' code.code='42349-1'"
 * @generated
 */
public interface ReasonForReferralSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.3.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'1.3.6.1.4.1.19376.1.5.3.1.3.1\')'"
	 * @generated
	 */
	boolean validateReasonForReferralSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '42349-1' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (\r\nvalue.code = \'42349-1\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateReasonForReferralSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForReferralSection init();
} // ReasonForReferralSection