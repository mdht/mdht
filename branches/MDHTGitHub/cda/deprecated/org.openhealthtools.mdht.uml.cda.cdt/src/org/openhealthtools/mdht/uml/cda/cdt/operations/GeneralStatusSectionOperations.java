/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection#validateGeneralStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection#validateGeneralStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralStatusSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralStatusSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralStatusSectionTemplateId(GeneralStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralStatusSectionTemplateId(GeneralStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralStatusSectionTemplateId(GeneralStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralStatusSectionTemplateId(GeneralStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.5')
	 * @param generalStatusSection The receiving '<em><b>General Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralStatusSectionTemplateId(GeneralStatusSection generalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_STATUS_SECTION);
			try {
				VALIDATE_GENERAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_STATUS_SECTION__GENERAL_STATUS_SECTION_TEMPLATE_ID,
						 CDTPlugin.INSTANCE.getString("GeneralStatusSectionTemplateId"),
						 new Object [] { generalStatusSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralStatusSectionCode(GeneralStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralStatusSectionCode(GeneralStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '10210-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralStatusSectionCode(GeneralStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Status Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralStatusSectionCode(GeneralStatusSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '10210-3' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param generalStatusSection The receiving '<em><b>General Status Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralStatusSectionCode(GeneralStatusSection generalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.GENERAL_STATUS_SECTION);
			try {
				VALIDATE_GENERAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalStatusSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.GENERAL_STATUS_SECTION__GENERAL_STATUS_SECTION_CODE,
						 CDTPlugin.INSTANCE.getString("GeneralStatusSectionCode"),
						 new Object [] { generalStatusSection }));
			}
			return false;
		}
		return true;
	}

} // GeneralStatusSectionOperations