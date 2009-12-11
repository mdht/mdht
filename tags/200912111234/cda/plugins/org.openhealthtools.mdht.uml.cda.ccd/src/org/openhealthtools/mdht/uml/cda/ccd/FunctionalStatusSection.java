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
 * <p align="left">
 *     <i><font size="2">Functional Status</font></i> <font size="2" face="Times New Roman,Times New Roman"><font size="2"
 *     face="Times New Roman,Times New Roman">describes the patients status of normal functioning at the time the Care Record
 *     was created. Functional statuses include information regarding the patient relative to:</font></font>
 * </p>
 * <div style="margin-left: 4em">
 *     <p align="left">
 *         <font size="2" face="Times New Roman,Times New Roman"><font size="2" face="Times New Roman,Times New Roman">
 *         Ambulatory ability</font></font>
 *     </p>
 *     <p align="left">
 *         <font size="2" face="Times New Roman,Times New Roman"><font size="2" face="Times New Roman,Times New Roman">
 *         Mental status or competency</font></font>
 *     </p>
 *     <p align="left">
 *         <font size="2" face="Times New Roman,Times New Roman"><font size="2" face="Times New Roman,Times New Roman">
 *         Activities of Daily Living (ADLs), including bathing, dressing, feeding, grooming</font></font>
 *     </p>
 *     <p align="left">
 *         <font size="2" face="Times New Roman,Times New Roman"><font size="2" face="Times New Roman,Times New Roman"> Home
 *         / living situation having an effect on the health status of the patient</font></font>
 *     </p>
 *     <p align="left">
 *         <font size="2" face="Times New Roman,Times New Roman"><font size="2" face="Times New Roman,Times New Roman">
 *         Ability to care for self</font></font>
 *     </p>
 * </div>
 * <div style="margin-left: 4em">
 *     <p align="left">
 *         <font size="2"></font> <font size="2" face="Times New Roman,Times New Roman"><font size="2"
 *         face="Times New Roman,Times New Roman">Social activity, including issues with social cognition, participation with
 *         friends and acquaintances other than family members</font></font>
 *     </p>
 *     <p align="left">
 *         <font size="2" face="Times New Roman,Times New Roman"><font size="2" face="Times New Roman,Times New Roman">
 *         Occupation activity, including activities partly or directly related to working, housework or volunteering, family
 *         and home responsibilities or activities related to home and family</font></font>
 *     </p>
 *     <p align="left">
 *         <font size="2" face="Times New Roman,Times New Roman"><font size="2" face="Times New Roman,Times New Roman">
 *         Communication ability, including issues with speech, writing or cognition required for communication</font></font>
 *     </p>
 *     <p align="left">
 *         <font size="2" face="Times New Roman,Times New Roman"><font size="2" face="Times New Roman,Times New Roman">
 *         Perception, including sight, hearing, taste, skin sensation, kinesthetic sense, proprioception, or
 *         balance</font></font>
 *     </p>
 * </div>
 * <p>
 *     <font size="2" face="Times New Roman,Times New Roman"><font size="2" face="Times New Roman,Times New Roman">Any
 *     deviation from normal function that the patient displays and is recorded in the record should be included. Of
 *     particular interest are those limitations that would in any way interfere with self care or the medical therapeutic
 *     process. In addition, an improvement, any change in or noting that the patient has normal functioning status is also
 *     valid for inclusion.</font></font>
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getFunctionalStatusSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation code.codeSystemName='LOINC' templateId.root='2.16.840.1.113883.10.20.1.5' constraints.validation.error='FunctionalStatusSectionTemplateId FunctionalStatusSectionCode FunctionalStatusSectionTitle' code.displayName='Functional status assessment' code.codeSystem='2.16.840.1.113883.6.1' code.code='47420-5' constraints.validation.warning='FunctionalStatusSectionProblemAct FunctionalStatusSectionResultOrganizer'"
 * @generated
 */
public interface FunctionalStatusSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.5')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.hasTemplateId(\'2.16.840.1.113883.10.20.1.5\')'"
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
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.act.oclIsKindOf(ccd::ProblemAct))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | entry.act.oclIsKindOf(ccd::ProblemAct))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionProblemAct(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(ccd::ResultOrganizer))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | entry.organizer.oclIsKindOf(ccd::ResultOrganizer))'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection init();
} // FunctionalStatusSection
