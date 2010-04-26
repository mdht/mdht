/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payers Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The Payers Section contains data on the patient's payers, whether a 'third party' insurance, self-pay,
 *     other payer or guarantor, or some combination. At a minimum, the patient's pertinent current payment sources should be
 *     listed. If no payment sources are supplied, the reason shall be supplied as free text in the narrative block (e.g., Not
 *     Insured, Payer Unknown, Medicare Pending, et cetera). 
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getPayersSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.3.88.11.83.101' constraints.validation.error='PayersSectionTemplateId'"
 * @generated
 */
public interface PayersSection extends org.openhealthtools.mdht.uml.cda.ihe.PayersSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection init();
} // PayersSection
