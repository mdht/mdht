/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payers Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <i><font size="2">Payers</font></i> <font size="2" face="Times New Roman,Times New Roman"><font size="2"
 *     face="Times New Roman,Times New Roman">contains data on the patient�s payers, whether a �third party� insurance,
 *     self-pay, other payer or guarantor, or some combination of payers, and is used to define which entity is the
 *     responsible fiduciary for the financial aspects of a patient�s care.</font></font>
 * </p>
 * <p align="left">
 *     <font size="2" face="Times New Roman,Times New Roman"><font size="2" face="Times New Roman,Times New Roman">Each unique
 *     instance of a payer and all the pertinent data needed to contact, bill to, and collect from that payer should be
 *     included. Authorization information that can be used to define pertinent referral, authorization tracking number,
 *     procedure, therapy, intervention, device, or similar authorizations for the patient or provider, or both should be
 *     included. At a minimum, the patient�s pertinent current payment sources should be listed.</font></font>
 * </p>
 * <p>
 *     <font size="2" face="Times New Roman,Times New Roman"><font size="2" face="Times New Roman,Times New Roman">The CCD
 *     represents the sources of payment as a coverage act, which identifies all of the insurance policies or government or
 *     other programs that cover some or all of the patient's healthcare expenses. The policies or programs are sequenced by
 *     order of preference. Each policy or program identifies the covered party with respect to the payer, so that the
 *     identifiers can be recorded.</font></font>
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getPayersSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PayersSection_templateId' templateId.root='2.16.840.1.113883.10.20.1.9'"
 * @generated
 */
public interface PayersSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.9')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'2.16.840.1.113883.10.20.1.9\')'"
	 * @generated
	 */
	boolean PayersSection_templateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection init();
} // PayersSection
