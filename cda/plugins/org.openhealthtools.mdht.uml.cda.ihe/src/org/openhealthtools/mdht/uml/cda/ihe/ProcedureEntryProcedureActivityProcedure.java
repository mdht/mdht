/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Entry Procedure Activity Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getProcedureEntryProcedureActivityProcedure()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation contextDependent='true' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.4.19' constraints.validation.error='ProcedureEntryProcedureActivityProcedureTemplateId'"
 * @generated
 */
public interface ProcedureEntryProcedureActivityProcedure extends ProcedureActivityProcedure, ProcedureEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.19')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.19\')'"
	 * @generated
	 */
	boolean validateProcedureEntryProcedureActivityProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEntryProcedureActivityProcedure init();
} // ProcedureEntryProcedureActivityProcedure
