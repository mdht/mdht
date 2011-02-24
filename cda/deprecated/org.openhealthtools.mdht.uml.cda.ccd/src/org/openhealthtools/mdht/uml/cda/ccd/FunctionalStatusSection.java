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
 * A representation of the model object '<em><b>Functional Status Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     <i>Functional Status</i> describes the patient's status of normal functioning at the time the Care Record
 *     was created. Functional statuses include information regarding the patient relative to:
 * </p>
 * 
 *     <ul><li>Ambulatory ability</li>
 *        <li>Mental status or competency</li>
 *         <li>Activities of Daily Living (ADLs), including bathing, dressing, feeding, grooming</li>
 *         <li>Home / living situation having an effect on the health status of the patient</li>
 *         <li>Ability to care for self</li>
 *         <li>Social activity, including issues with social cognition, participation with
 *         friends and acquaintances other than family members</li>
 *        <li>Occupation activity, including activities partly or directly related to working, housework or volunteering, family
 *         and home responsibilities or activities related to home and family</li>
 *       <li>Communication ability, including issues with speech, writing or cognition required for communication</li>
 *        <li> Perception, including sight, hearing, taste, skin sensation, kinesthetic sense, proprioception, or
 *         balance</li>
 * </ul>
 * <p>
 *     Any
 *     deviation from normal function that the patient displays and is recorded in the record should be included. Of
 *     particular interest are those limitations that would in any way interfere with self care or the medical therapeutic
 *     process. In addition, an improvement, any change in or noting that the patient has normal functioning status is also
 *     valid for inclusion.
 * </p>
 * <p>Functional Statuses can be expressed in 3 different forms. They can occur as a Problem, a Result or as text. Text can be employed if and only if the Functional Status is neither a Problem nor a Result. Functional Statuses expressed as Problems include relevant clinical conditions, diagnoses, symptoms and findings. Results are the interpretation or conclusion derived from a clinical assessment or test battery, such as the Instrumental Activities of Daily Living (IADL) scale or the Functional Status Index (FSI).
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getFunctionalStatusSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystem='2.16.840.1.113883.6.1' code.displayName='Functional status assessment' templateId.root='2.16.840.1.113883.10.20.1.5' constraints.validation.error='FunctionalStatusSectionTemplateId FunctionalStatusSectionCode FunctionalStatusSectionTitle' code.codeSystemName='LOINC' constraints.validation.warning='FunctionalStatusSectionClinicalStatements' code.code='47420-5'"
 * @generated
 */
public interface FunctionalStatusSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryTargets(ccd::ProblemAct)->size() > 0
	 *   or self.getEntryTargets(ccd::ResultOrganizer)->size() > 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntryTargets(ccd::ProblemAct)->size() > 0\r\n  or self.getEntryTargets(ccd::ResultOrganizer)->size() > 0'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionClinicalStatements(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.5')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.5\')'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '47420-5' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (\r\nvalue.code = \'47420-5\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.title.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.title.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection init();
} // FunctionalStatusSection
