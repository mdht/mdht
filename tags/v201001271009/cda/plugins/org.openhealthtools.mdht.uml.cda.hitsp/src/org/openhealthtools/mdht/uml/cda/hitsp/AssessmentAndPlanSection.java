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
 * A representation of the model object '<em><b>Assessment And Plan Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p align="left">
 *     <font size="2">The Assessment and Plan Section contains information about the assessment of the patientís condition and
 *     expectations for care including proposals, goals, and order requests for monitoring, tracking, or improving the
 *     condition of the patient.</font>
 * </p>
 * <p>
 *     <font size="2">An assessment and plan section varies from the plan of care section defined later in that it includes a
 *     physician assessment of the patient condition.</font>
 * </p>
 * <p>
 *     <font size="2"><b><font size="2">NOTE</font></b><font size="2" face="Arial,Arial"><font size="2" face="Arial,Arial">:
 *     The assessments described in this section are physician assessments of the patient's current condition, and do not
 *     include assessments of functional status, or other assessments typically used in nursing. In Implementation Guides
 *     currently selected, when both the assessment and plan are documented, they are included together in a single section
 *     documenting both. When the physician assessment is not present, only the plan of care section appears. There are no
 *     cases where a physician assessment is provided without a plan.</font></font></font>
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getAssessmentAndPlanSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HITSPAssessmentAndPlanSectionTemplateId' templateId.root='2.16.840.1.113883.3.88.11.83.123'"
 * @generated
 */
public interface AssessmentAndPlanSection extends org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.3.88.11.83.123')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'2.16.840.1.113883.3.88.11.83.123\')'"
	 * @generated
	 */
	boolean validateHITSPAssessmentAndPlanSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection init();
} // AssessmentAndPlanSection
