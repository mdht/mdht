/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payers Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Payers section contains data on the patient's payers, whether a 'third party' insurance, self-pay, other payer or
 * guarantor, or some combination.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getPayersSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='IHEPayersSectionTemplateId' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.1.5.3.7'"
 * @generated
 */
public interface PayersSection extends org.openhealthtools.mdht.uml.cda.ccd.PayersSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.1.5.3.7')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'1.3.6.1.4.1.19376.1.5.3.1.1.5.3.7\')'"
	 * @generated
	 */
	boolean validateIHEPayersSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection init();
} // PayersSection
