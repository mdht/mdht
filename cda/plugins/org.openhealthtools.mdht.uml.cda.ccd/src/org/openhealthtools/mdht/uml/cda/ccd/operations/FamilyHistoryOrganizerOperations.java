/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer#FamilyHistoryOrganizer_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Family History Organizer template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer#FamilyHistoryOrganizer_statusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Family History Organizer status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryOrganizerOperations extends OrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #FamilyHistoryOrganizer_templateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Family History Organizer template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FamilyHistoryOrganizer_templateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.23')";
	/**
	 * The cached OCL invariant for the '{@link #FamilyHistoryOrganizer_templateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Family History Organizer template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FamilyHistoryOrganizer_templateId(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.23')
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean FamilyHistoryOrganizer_templateId(FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("FamilyHistoryOrganizer_templateId"),
						 new Object [] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #FamilyHistoryOrganizer_statusCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Family History Organizer status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FamilyHistoryOrganizer_statusCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsTypeOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14' and value.codeSystemName = 'ActStatus')";
	/**
	 * The cached OCL invariant for the '{@link #FamilyHistoryOrganizer_statusCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Family History Organizer status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FamilyHistoryOrganizer_statusCode(FamilyHistoryOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsTypeOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14' and value.codeSystemName = 'ActStatus')
	 * @param familyHistoryOrganizer The receiving '<em><b>Family History Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean FamilyHistoryOrganizer_statusCode(FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FAMILY_HISTORY_ORGANIZER);
			try {
				FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(familyHistoryOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("FamilyHistoryOrganizer_statusCode"),
						 new Object [] { familyHistoryOrganizer }));
			}
			return false;
		}
		return true;
	}

} // FamilyHistoryOrganizerOperations