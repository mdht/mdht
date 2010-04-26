/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe;

import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surgeries Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The list of surgeries section shall contain a narrative description of the diagnostic and therapeutic operative procedures
 * and associated anesthetic techniques the patient received in the past.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getSurgeriesSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='1.3.6.1.4.1.19376.1.5.3.1.3.11' constraints.validation.error='ProceduresSectionTemplateId'"
 * @generated
 */
public interface SurgeriesSection extends ProceduresSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurgeriesSection init();
} // SurgeriesSection
