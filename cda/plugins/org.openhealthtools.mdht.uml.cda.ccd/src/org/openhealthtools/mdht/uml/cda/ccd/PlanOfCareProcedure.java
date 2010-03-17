/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Procedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Of Care Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getPlanOfCareProcedure()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation contextDependent='true' constraints.validation.error='PlanOfCareProcedureTemplateId PlanOfCareProcedureMoodCodeValue PlanOfCareProcedureId PlanOfCareProcedureMoodCode' templateId.root='2.16.840.1.113883.10.20.1.25'"
 * @generated
 */
public interface PlanOfCareProcedure extends Procedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode = vocab::x_DocumentProcedureMood::INT or self.moodCode = vocab::x_DocumentProcedureMood::ARQ
	 *   or self.moodCode = vocab::x_DocumentProcedureMood::PRMS or self.moodCode = vocab::x_DocumentProcedureMood::PRP
	 *   or self.moodCode = vocab::x_DocumentProcedureMood::RQO
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode = vocab::x_DocumentProcedureMood::INT or self.moodCode = vocab::x_DocumentProcedureMood::ARQ\r\n  or self.moodCode = vocab::x_DocumentProcedureMood::PRMS or self.moodCode = vocab::x_DocumentProcedureMood::PRP\r\n  or self.moodCode = vocab::x_DocumentProcedureMood::RQO'"
	 * @generated
	 */
	boolean validatePlanOfCareProcedureMoodCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.25')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.25\')'"
	 * @generated
	 */
	boolean validatePlanOfCareProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.id->isEmpty()'"
	 * @generated
	 */
	boolean validatePlanOfCareProcedureId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.moodCode.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.moodCode.oclIsUndefined()'"
	 * @generated
	 */
	boolean validatePlanOfCareProcedureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareProcedure init();
} // PlanOfCareProcedure
