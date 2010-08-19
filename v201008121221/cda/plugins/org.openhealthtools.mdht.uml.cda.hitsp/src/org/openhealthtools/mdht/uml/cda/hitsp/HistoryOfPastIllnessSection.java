/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Of Past Illness Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     The History of Past Illness Section contains data about problems the patient suffered in the
 *     past. 
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getHistoryOfPastIllnessSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.3.88.11.83.104' constraints.validation.error='HITSPHistoryOfPastIllnessSectionTemplateId'"
 * @generated
 */
public interface HistoryOfPastIllnessSection extends org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.104')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.104\')'"
	 * @generated
	 */
	boolean validateHITSPHistoryOfPastIllnessSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection init();
} // HistoryOfPastIllnessSection
