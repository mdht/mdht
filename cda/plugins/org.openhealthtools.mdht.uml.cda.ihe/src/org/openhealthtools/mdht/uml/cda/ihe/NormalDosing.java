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
 * A representation of the model object '<em><b>Normal Dosing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This&nbsp;template&nbsp;identifier&nbsp;is&nbsp;used&nbsp;to&nbsp;identify&nbsp;medication&nbsp;administration&nbsp;events&nbsp;that&nbsp;do&nbsp;not&nbsp;require&nbsp;any&nbsp;special&nbsp;processing.
 * The parent template is <span><a title="1.3.6.1.4.1.19376.1.5.3.1.4.7"
 * href="http://wiki.ihe.net/index.php?title=1.3.6.1.4.1.19376.1.5.3.1.4.7#1.3.6.1.4.1.19376.1.5.3.1.4.7"><u><font
 * color="#0066CC">1.3.6.1.4.1.19376.1.5.3.1.4.7</font></u></a></span>. Medications that use this template identifier shall
 * not use subordinate &lt;substanceAdministation&gt; acts.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getNormalDosing()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='1.3.6.1.4.1.19376.1.5.3.1.4.7.1' constraints.validation.error='NormalDosing_templateId'"
 * @generated
 */
public interface NormalDosing extends Medication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('1.3.6.1.4.1.19376.1.5.3.1.4.7.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'1.3.6.1.4.1.19376.1.5.3.1.4.7.1\')'"
	 * @generated
	 */
	boolean NormalDosing_templateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDosing init();
} // NormalDosing
