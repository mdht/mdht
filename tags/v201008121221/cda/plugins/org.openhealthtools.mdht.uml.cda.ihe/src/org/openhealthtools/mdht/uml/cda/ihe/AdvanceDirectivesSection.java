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
 * A representation of the model object '<em><b>Advance Directives Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The advance directive section shall contain a narrative description of the list of documents that define the patient's
 * expectations and requests for care along with the locations of the documents.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getAdvanceDirectivesSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='1.3.6.1.4.1.19376.1.5.3.1.3.34' constraints.validation.error='IHEAdvanceDirectivesSectionTemplateId'"
 * @generated
 */
public interface AdvanceDirectivesSection extends org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.34')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.3.34\')'"
	 * @generated
	 */
	boolean validateIHEAdvanceDirectivesSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection init();
} // AdvanceDirectivesSection
