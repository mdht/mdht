/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuity Of Care Document</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getContinuityOfCareDocument()
 * @model extendedMetaData="name='ClinicalDocument'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.1'"
 * @generated
 */
public interface ContinuityOfCareDocument extends ClinicalDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'2.16.840.1.113883.10.20.1\')'"
	 * @generated
	 */
	boolean templateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuityOfCareDocument init();
} // ContinuityOfCareDocument
